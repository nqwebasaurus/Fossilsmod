package fossils.fossils.client.blockentity.model.tupandactylusnavigans;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TupandactylusnavigansFossilModel extends SkullModelBase {
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
	private final ModelPart crest1;
	private final ModelPart crest2;
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

	public TupandactylusnavigansFossilModel(ModelPart root) {
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
		this.crest1 = this.head.getChild("crest1");
		this.crest2 = this.crest1.getChild("crest2");
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

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.054F, 0.9051F, 0.3491F, 0.0F, 0.0F));

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0357F, -8.2722F, -2.7689F, -0.5044F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(106, 61).addBox(-0.9653F, -2.9561F, -0.3946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 113).addBox(-0.9653F, -2.3461F, -1.9402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(113, 36).addBox(-0.9653F, 0.4808F, -2.1438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = chest1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 101).addBox(-0.9653F, -1.6232F, -2.7971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -2.7838F, 0.0F, 0.0F));

		PartDefinition cube_r5 = chest1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 93).addBox(-0.9653F, -1.7204F, -0.9137F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 109).addBox(-0.9653F, -0.772F, -1.7458F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(96, 74).mirror().addBox(-5.2026F, -1.8494F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.1258F, 0.5267F, -1.4989F));

		PartDefinition cube_r8 = chest1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(105, 8).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.3827F, 0.391F, -0.9326F));

		PartDefinition cube_r9 = chest1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(114, 0).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.557F, 0.1315F, -0.435F));

		PartDefinition cube_r10 = chest1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(78, 100).mirror().addBox(-0.4155F, -0.711F, -1.5398F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.501F, 6.3206F, 4.4718F, -0.1919F, -0.3002F, 0.0574F));

		PartDefinition cube_r11 = chest1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(112, 88).mirror().addBox(-0.397F, -1.1983F, -0.3508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.501F, 6.3206F, 4.4718F, 0.2091F, -0.2F, -1.1618F));

		PartDefinition cube_r12 = chest1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(91, 112).mirror().addBox(-0.3842F, -0.4208F, -1.1798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.501F, 6.3206F, 4.4718F, -0.765F, -0.3589F, -1.2593F));

		PartDefinition cube_r13 = chest1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(85, 100).mirror().addBox(-1.2843F, -0.4511F, 0.293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.501F, 6.3206F, 4.4718F, -0.0958F, 0.0609F, 0.5643F));

		PartDefinition cube_r14 = chest1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(85, 100).addBox(0.2843F, -0.4511F, 0.293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -0.0958F, -0.0609F, -0.5643F));

		PartDefinition cube_r15 = chest1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(92, 36).addBox(-1.4653F, -0.6898F, 0.293F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r16 = chest1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(91, 112).addBox(-0.6158F, -0.4208F, -1.1798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -0.765F, 0.3589F, 1.2593F));

		PartDefinition cube_r17 = chest1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(112, 88).addBox(-0.603F, -1.1983F, -0.3508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, 0.2091F, 0.2F, 1.1618F));

		PartDefinition cube_r18 = chest1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(78, 100).addBox(-0.5845F, -0.711F, -1.5398F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -0.1919F, 0.3002F, -0.0574F));

		PartDefinition cube_r19 = chest1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(34, 88).addBox(-0.0357F, -0.9F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1684F, 1.8969F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r20 = chest1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(114, 0).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.557F, -0.1315F, 0.435F));

		PartDefinition cube_r21 = chest1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(105, 8).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.3827F, -0.391F, 0.9326F));

		PartDefinition cube_r22 = chest1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(96, 74).addBox(2.2026F, -1.8494F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.1258F, -0.5267F, 1.4989F));

		PartDefinition cube_r23 = chest1.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(30, 97).addBox(-0.5357F, -0.3123F, 0.6852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4212F, -0.7096F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4982F, -0.0053F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r24 = neck1.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(106, 115).addBox(-0.0357F, -0.8317F, 0.0483F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4136F, -0.9511F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r25 = neck1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(113, 39).addBox(-0.5357F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.5867F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck5 = neck1.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.9867F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r26 = neck5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(7, 103).addBox(-0.0357F, -1.1F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.777F, -2.4366F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r27 = neck5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(5, 67).addBox(-0.5357F, -0.9F, -5.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck = neck5.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2668F, -4.8196F, 0.1848F, -0.1287F, -0.024F));

		PartDefinition cube_r28 = neck.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(78, 0).addBox(-0.5357F, -0.8258F, -4.0016F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3956F, -0.0591F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r29 = neck.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(107, 56).addBox(-0.0357F, -0.7F, -1.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8475F, -1.2722F, -0.0262F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(78, 24).addBox(-0.5357F, -0.8178F, -3.9187F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2953F, -4.0192F, -0.2508F, 0.0F, 0.0F));

		PartDefinition cube_r30 = neck2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(71, 107).addBox(0.0F, -0.2F, -1.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -1.3696F, -1.6769F, 0.1658F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3474F, -3.8445F, -0.0918F, 0.0F, 0.0F));

		PartDefinition cube_r31 = neck3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(61, 106).addBox(0.0F, -1.0F, -1.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -0.2966F, -1.3168F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r32 = neck3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(78, 6).addBox(-0.5357F, -0.3F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.198F, -0.4517F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2166F, -3.9886F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r33 = neck4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(108, 24).addBox(0.0F, 0.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -1.7486F, -0.6445F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r34 = neck4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(67, 54).addBox(-0.5357F, -0.3F, -10.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -0.2033F, 5.5443F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8551F, -3.9424F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(105, 15).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5357F, 0.5989F, -2.6843F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(25, 93).addBox(-0.5F, -0.75F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5357F, -0.4538F, -2.0102F, -2.7838F, 0.0F, 0.0F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(88, 95).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0357F, -1.6787F, 3.1205F, 2.3649F, 0.0F, 0.0F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(104, 83).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5357F, -3.0656F, 0.3189F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(103, 49).addBox(-0.5F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5357F, -2.3647F, 1.0321F, 2.3649F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(98, 6).addBox(-0.5F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5357F, -2.3647F, 1.0321F, -2.4347F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(16, 86).addBox(-0.5F, -1.1F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5357F, -1.7019F, 0.2614F, -2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(59, 92).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5357F, 0.1831F, 0.6583F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(92, 40).addBox(-0.5F, -0.8F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5357F, -1.0717F, -0.4886F, 2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(80, 53).addBox(-1.0F, 0.0F, -2.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0357F, 0.2396F, -2.0762F, -2.9583F, 0.0F, 0.0F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(97, 83).addBox(-1.0F, -0.4F, 0.675F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -1.9234F, -3.2097F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(83, 77).addBox(-0.5F, -1.5F, -1.125F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5357F, -1.9488F, -1.3599F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(108, 32).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0357F, -3.0725F, 2.8787F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(30, 113).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -3.1465F, 4.291F, 2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(108, 28).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0357F, -3.8199F, 2.4372F, 1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(67, 81).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0357F, -2.8051F, 0.746F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(5, 74).addBox(-0.5F, 0.0929F, -9.239F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, 0.0371F, -2.6264F, -0.4145F, 0.0F, 0.0F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -0.4856F, -5.7996F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, 0.0371F, -2.6264F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(17, 105).addBox(-0.5F, -0.25F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -13.2551F, -7.2783F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(113, 27).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -13.9529F, -7.2234F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(89, 27).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -14.0478F, -6.238F, 2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(61, 84).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -13.3921F, -5.9929F, -2.7838F, 0.0F, 0.0F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(13, 83).addBox(-0.5F, -0.175F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -12.6934F, -6.0423F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(102, 93).addBox(-0.5F, -1.45F, -1.275F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(71, 102).addBox(-0.5F, -1.45F, -1.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.163F)), PartPose.offsetAndRotation(-0.0357F, -11.4019F, -6.2373F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(78, 75).addBox(-0.5F, -9.7F, -0.4F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0357F, -22.8562F, -6.9442F, -3.111F, 0.0F, 0.0F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(80, 63).addBox(-0.5F, -8.7F, -0.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0357F, -31.2526F, -6.9808F, -3.1241F, 0.0F, 0.0F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(44, 100).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0357F, -35.6515F, -7.0768F, -3.1023F, 0.0F, 0.0F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(73, 95).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0357F, -31.2526F, -6.9808F, -3.1198F, 0.0F, 0.0F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(38, 81).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0357F, -22.8509F, -7.3442F, -3.1372F, 0.0F, 0.0F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(56, 73).addBox(-0.5F, -1.3F, -0.7F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0357F, -14.4516F, -7.2342F, -3.1285F, 0.0F, 0.0F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(107, 94).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -12.1317F, -7.4669F, 2.7576F, 0.0F, 0.0F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(105, 18).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -10.6822F, -8.3552F, 2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(9, 86).addBox(-0.5F, -3.875F, -0.125F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(52, 92).addBox(-0.5F, -2.875F, -0.725F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -5.6894F, -10.3713F, 2.3038F, 0.0F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(90, 83).addBox(-0.5F, -3.775F, -1.825F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -9.4817F, -9.1594F, 2.3911F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(89, 10).addBox(-0.5F, -2.875F, -0.525F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -9.4446F, -7.6334F, 2.5656F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(35, 104).addBox(-0.5F, -1.9809F, -0.6075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0357F, -3.4936F, -15.2072F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.525F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -10.4232F, -6.9353F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(45, 73).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -10.4232F, -6.9353F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(96, 10).addBox(-0.5F, -2.0F, -5.475F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.159F))
				.texOffs(83, 83).addBox(-0.5F, -2.0F, -3.8F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -4.1099F, -7.4598F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(81, 104).addBox(-0.5F, -1.325F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -5.9377F, -7.1893F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(98, 17).addBox(-0.5F, 1.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0357F, -5.2176F, -0.7255F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(25, 113).addBox(-0.5F, -0.3F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0357F, -3.7897F, -1.9575F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(113, 24).addBox(-0.5F, -0.325F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0357F, -4.169F, -2.0844F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(54, 85).addBox(-0.5F, -2.7F, -0.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.0357F, -5.8716F, -8.8645F, 1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(76, 104).addBox(-0.5F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0357F, -5.8995F, -7.2647F, 1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(94, 27).addBox(-0.5F, -1.725F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0357F, -5.4542F, -6.8875F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(99, 76).addBox(-0.5F, -0.325F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.309F)), PartPose.offsetAndRotation(-0.0357F, -5.8664F, -5.4911F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(70, 90).addBox(-0.5F, -0.325F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.0357F, -5.7489F, -4.5987F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(89, 22).addBox(-0.5F, -0.325F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0357F, -5.7489F, -4.5987F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(67, 61).addBox(-0.5F, -0.325F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.0357F, -5.0304F, -3.058F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(99, 63).addBox(-0.5F, -0.325F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0357F, -5.0304F, -3.058F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(89, 17).addBox(-0.5F, -0.325F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.0357F, -5.0304F, -3.058F, -0.48F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0009F, 0.7233F, -3.1204F, -0.0514F, -0.0006F, -0.0013F));

		PartDefinition cube_r87 = jaw.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(16, 96).mirror().addBox(-0.6699F, -0.8207F, 2.7194F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0324F, 2.2491F, -3.3105F, 0.0607F, -0.0525F, 0.005F));

		PartDefinition cube_r88 = jaw.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(85, 44).mirror().addBox(-0.2363F, -1.1134F, -1.2058F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0324F, 2.2491F, -3.3105F, -0.0428F, -0.2092F, -0.0047F));

		PartDefinition cube_r89 = jaw.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(113, 42).mirror().addBox(-0.2006F, -0.8692F, -0.8501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, 1.607F, -0.0638F, -0.0046F));

		PartDefinition cube_r90 = jaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(45, 113).mirror().addBox(-0.2006F, -0.8552F, -0.8314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, 2.8722F, -0.064F, -0.0021F));

		PartDefinition cube_r91 = jaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(111, 113).mirror().addBox(-0.2006F, -1.4698F, -0.4333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, -2.2765F, -0.064F, -0.0021F));

		PartDefinition cube_r92 = jaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-0.2006F, -0.8504F, 0.3288F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, -1.4911F, -0.064F, -0.0021F));

		PartDefinition cube_r93 = jaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(113, 45).mirror().addBox(-0.2006F, -0.2748F, -1.5583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, 0.2107F, -0.0638F, -0.0046F));

		PartDefinition cube_r94 = jaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(113, 66).mirror().addBox(-0.2006F, 1.2421F, -0.397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, -1.2728F, -0.0638F, -0.0046F));

		PartDefinition cube_r95 = jaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(99, 100).mirror().addBox(-0.2006F, -0.5119F, 1.9293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, -2.8F, -0.0638F, -0.0046F));

		PartDefinition cube_r96 = jaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(101, 67).mirror().addBox(-0.2006F, -0.7747F, 3.5949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, -2.8698F, -0.0638F, -0.0046F));

		PartDefinition cube_r97 = jaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(-0.2006F, -1.153F, 5.238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, -2.9396F, -0.0638F, -0.0046F));

		PartDefinition cube_r98 = jaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(42, 110).mirror().addBox(-0.2006F, -2.9533F, 6.4369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, 3.0818F, -0.0638F, -0.0046F));

		PartDefinition cube_r99 = jaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(60, 110).mirror().addBox(-0.2006F, -8.4194F, -1.3263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, 1.7292F, -0.0638F, -0.0046F));

		PartDefinition cube_r100 = jaw.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(29, 81).mirror().addBox(-0.879F, -0.2779F, -2.8079F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.1913F, 1.6918F, -8.2915F, 0.551F, -0.0377F, -0.0046F));

		PartDefinition cube_r101 = jaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(12, 105).mirror().addBox(-0.2006F, 1.9159F, -0.0705F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, -1.2904F, -0.064F, -0.0021F));

		PartDefinition cube_r102 = jaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(81, 109).mirror().addBox(-0.2006F, 4.6016F, 0.0125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, -1.3078F, -0.064F, -0.0021F));

		PartDefinition cube_r103 = jaw.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(60, 113).mirror().addBox(-0.2006F, 4.7698F, -4.2443F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(57, 100).mirror().addBox(-0.2006F, 8.5326F, -3.1482F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, -0.5661F, -0.064F, -0.0021F));

		PartDefinition cube_r104 = jaw.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(106, 100).mirror().addBox(-0.2006F, 3.2218F, -6.2069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, -0.1297F, -0.064F, -0.0021F));

		PartDefinition cube_r105 = jaw.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(85, 36).mirror().addBox(-0.2006F, 1.2378F, -8.1614F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, 0.0884F, -0.064F, -0.0021F));

		PartDefinition cube_r106 = jaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(70, 111).mirror().addBox(-0.2006F, 3.0964F, -9.4608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-1.0087F, -0.2082F, -0.2915F, 0.4375F, -0.064F, -0.0021F));

		PartDefinition cube_r107 = jaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(92, 77).mirror().addBox(-0.879F, -0.0741F, -3.3016F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.1913F, 1.6918F, -8.2915F, 0.4201F, -0.0377F, -0.0046F));

		PartDefinition cube_r108 = jaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(91, 53).mirror().addBox(-0.879F, -0.2379F, -5.8026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.1913F, 1.6918F, -8.2915F, 0.4724F, -0.0377F, -0.0046F));

		PartDefinition cube_r109 = jaw.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(79, 91).mirror().addBox(-0.879F, 1.0117F, -5.515F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(0.1913F, 1.6918F, -8.2915F, 0.2455F, -0.0377F, -0.0046F));

		PartDefinition cube_r110 = jaw.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(100, 57).mirror().addBox(-0.879F, 3.2746F, -2.8118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(0.1913F, 1.6918F, -8.2915F, -0.3653F, -0.0377F, -0.0046F));

		PartDefinition cube_r111 = jaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(85, 30).mirror().addBox(-0.879F, 2.6384F, -0.3671F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1913F, 1.6918F, -8.2915F, -0.758F, -0.0377F, -0.0046F));

		PartDefinition cube_r112 = jaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(45, 79).mirror().addBox(-0.879F, 2.2867F, -0.3049F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(0.1913F, 1.6918F, -8.2915F, -0.2257F, -0.0377F, -0.0046F));

		PartDefinition cube_r113 = jaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(85, 44).addBox(0.2363F, -1.1134F, -1.2058F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0372F, 2.2491F, -3.3105F, -0.0428F, 0.2092F, 0.0047F));

		PartDefinition cube_r114 = jaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(16, 96).addBox(0.6699F, -0.8207F, 2.7194F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0372F, 2.2491F, -3.3105F, 0.0607F, 0.0525F, -0.005F));

		PartDefinition cube_r115 = jaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(70, 111).addBox(-0.7994F, 3.0964F, -9.4608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, 0.4375F, 0.064F, 0.0021F));

		PartDefinition cube_r116 = jaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(57, 100).addBox(-0.7994F, 8.5326F, -3.1482F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F))
				.texOffs(60, 113).addBox(-0.7994F, 4.7698F, -4.2443F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, -0.5661F, 0.064F, 0.0021F));

		PartDefinition cube_r117 = jaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(85, 36).addBox(-0.7994F, 1.2378F, -8.1614F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, 0.0884F, 0.064F, 0.0021F));

		PartDefinition cube_r118 = jaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(106, 100).addBox(-0.7994F, 3.2218F, -6.2069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, -0.1297F, 0.064F, 0.0021F));

		PartDefinition cube_r119 = jaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(81, 109).addBox(-0.7994F, 4.6016F, 0.0125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, -1.3078F, 0.064F, 0.0021F));

		PartDefinition cube_r120 = jaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(12, 105).addBox(-0.7994F, 1.9159F, -0.0705F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, -1.2904F, 0.064F, 0.0021F));

		PartDefinition cube_r121 = jaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 105).addBox(-0.7994F, -0.8504F, 0.3288F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, -1.4911F, 0.064F, 0.0021F));

		PartDefinition cube_r122 = jaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(111, 113).addBox(-0.7994F, -1.4698F, -0.4333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, -2.2765F, 0.064F, 0.0021F));

		PartDefinition cube_r123 = jaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(45, 113).addBox(-0.7994F, -0.8552F, -0.8314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, 2.8722F, 0.064F, 0.0021F));

		PartDefinition cube_r124 = jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(45, 79).addBox(-0.121F, 2.2867F, -0.3049F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.2609F, 1.6918F, -8.2915F, -0.2257F, 0.0377F, 0.0046F));

		PartDefinition cube_r125 = jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(85, 30).addBox(-0.121F, 2.6384F, -0.3671F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2609F, 1.6918F, -8.2915F, -0.758F, 0.0377F, 0.0046F));

		PartDefinition cube_r126 = jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(100, 57).addBox(-0.121F, 3.2746F, -2.8118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.2609F, 1.6918F, -8.2915F, -0.3653F, 0.0377F, 0.0046F));

		PartDefinition cube_r127 = jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(79, 91).addBox(-0.121F, 1.0117F, -5.515F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.2609F, 1.6918F, -8.2915F, 0.2455F, 0.0377F, 0.0046F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(91, 53).addBox(-0.121F, -0.2379F, -5.8026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.2609F, 1.6918F, -8.2915F, 0.4724F, 0.0377F, 0.0046F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(92, 77).addBox(-0.121F, -0.0741F, -3.3016F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.2609F, 1.6918F, -8.2915F, 0.4201F, 0.0377F, 0.0046F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(29, 81).addBox(-0.121F, -0.2779F, -2.8079F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.2609F, 1.6918F, -8.2915F, 0.551F, 0.0377F, 0.0046F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(60, 110).addBox(-0.7994F, -8.4194F, -1.3263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, 1.7292F, 0.0638F, 0.0046F));

		PartDefinition cube_r132 = jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(42, 110).addBox(-0.7994F, -2.9533F, 6.4369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, 3.0818F, 0.0638F, 0.0046F));

		PartDefinition cube_r133 = jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 101).addBox(-0.7994F, -1.153F, 5.238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, -2.9396F, 0.0638F, 0.0046F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(101, 67).addBox(-0.7994F, -0.7747F, 3.5949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, -2.8698F, 0.0638F, 0.0046F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(99, 100).addBox(-0.7994F, -0.5119F, 1.9293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, -2.8F, 0.0638F, 0.0046F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(113, 66).addBox(-0.7994F, 1.2421F, -0.397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, -1.2728F, 0.0638F, 0.0046F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(113, 45).addBox(-0.7994F, -0.2748F, -1.5583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, 0.2107F, 0.0638F, 0.0046F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(113, 42).addBox(-0.7994F, -0.8692F, -0.8501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.9391F, -0.2082F, -0.2915F, 1.607F, 0.0638F, 0.0046F));

		PartDefinition crest1 = head.addOrReplaceChild("crest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.8125F, 7.031F, -0.0911F, 0.0F, 0.0F));

		PartDefinition crest2 = crest1.addOrReplaceChild("crest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 1.3F, 0.0456F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3693F, -10.615F, -35.8902F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(35, 113).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.35F, 7.8587F, 35.8764F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(112, 21).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.35F, 7.4832F, 35.17F, -2.0595F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(112, 14).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.35F, 9.8436F, 33.4965F, 2.522F, 0.0F, 0.0F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(113, 11).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(0.35F, 9.9241F, 34.3297F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(98, 21).addBox(-0.5F, -0.425F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.35F, 8.8696F, 34.9111F, -2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(10, 113).addBox(-0.5F, -0.05F, 0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.35F, 9.6571F, 35.0839F, -2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(113, 8).addBox(-0.5F, -1.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(0.35F, 9.2332F, 35.7623F, 2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(112, 5).addBox(-0.5F, -1.1F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.35F, 8.5819F, 36.2269F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(5, 112).addBox(-0.3893F, -0.1246F, -0.5973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(112, 2).addBox(-0.6143F, -0.1246F, -0.5973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.2893F, 8.9577F, 34.6123F, -3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(111, 110).addBox(-0.4393F, 0.6212F, -0.5139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.2893F, 8.9577F, 34.6123F, 3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 113).addBox(-0.5F, -0.4837F, -0.3038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.55F, 9.7402F, 36.0773F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(106, 112).addBox(-0.5F, -0.356F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.55F, 9.7402F, 36.0773F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(101, 112).addBox(-0.5F, -0.1705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(96, 112).addBox(-0.5F, -0.4705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(113, 33).addBox(-0.5F, -3.0705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(113, 30).addBox(-0.5F, -2.6705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(5, 108).addBox(-0.5F, -2.2705F, -0.5535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(112, 94).addBox(-0.5F, -0.8705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.55F, 9.7402F, 36.0773F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(7, 99).addBox(-0.6848F, -0.3467F, 0.8555F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6478F, 10.5738F, 32.78F, 2.9182F, 0.0506F, -0.0045F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(17, 109).addBox(-0.683F, -10.4519F, 0.4683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(106, 108).addBox(-0.683F, -10.4519F, 1.0683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6478F, 10.5738F, 32.78F, 1.2601F, 0.0511F, -0.0056F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(110, 48).addBox(-0.683F, -8.0504F, 4.3768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6478F, 10.5738F, 32.78F, 1.6964F, 0.0511F, -0.0056F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(61, 87).addBox(-0.683F, -3.3513F, 6.965F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.6478F, 10.5738F, 32.78F, 2.3946F, 0.0511F, -0.0056F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(43, 86).addBox(-0.683F, -1.2787F, 7.4005F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6478F, 10.5738F, 32.78F, 2.7F, 0.0511F, -0.0056F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(43, 96).addBox(-0.683F, -2.1917F, 6.1697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6478F, 10.5738F, 32.78F, 2.5516F, 0.0511F, -0.0056F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(85, 63).addBox(-0.683F, -1.0772F, 4.9682F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6478F, 10.5738F, 32.78F, 2.7262F, 0.0511F, -0.0056F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(91, 58).addBox(-0.683F, -0.6235F, 2.425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6478F, 10.5738F, 32.78F, 2.8134F, 0.0511F, -0.0056F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(20, 113).addBox(-0.6992F, -0.0556F, 0.1921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 113).addBox(-0.6992F, -0.0556F, -0.4079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6478F, 10.5738F, 32.78F, -3.1068F, 0.0384F, -0.0005F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(50, 98).addBox(-0.6848F, -0.4872F, -0.3753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6478F, 10.5738F, 32.78F, 2.8265F, 0.0506F, -0.0045F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(111, 107).addBox(-0.4393F, -1.0717F, 0.0438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.2893F, 8.9577F, 34.6123F, 2.714F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(111, 104).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.35F, 8.0612F, 33.9183F, 2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(111, 101).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.35F, 7.4065F, 34.3737F, -2.1817F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(37, 100).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2955F, 6.3552F, 33.77F, -1.1758F, 0.0094F, -0.1918F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 91).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1686F, 5.733F, 33.1322F, -0.7831F, 0.0094F, -0.1918F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(80, 58).addBox(-1.5F, -0.3F, -0.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.2063F, 5.9099F, 33.489F, -0.626F, 0.0094F, -0.1918F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(90, 90).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0201F, 4.8489F, 31.3482F, -0.4689F, 0.0094F, -0.1918F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(43, 91).addBox(-0.5F, -0.225F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0434F, 4.3924F, 29.8654F, -0.2617F, -0.0016F, -0.0074F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(67, 68).addBox(-0.7F, -0.325F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1605F, 5.5845F, 32.84F, -0.4363F, -0.0016F, -0.0074F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(100, 53).addBox(-0.5F, -0.325F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0909F, 6.69F, 34.9627F, -0.6549F, 0.0445F, -0.0322F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(16, 91).addBox(-0.5F, -0.325F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0395F, 5.5845F, 32.8365F, -0.4804F, 0.0445F, -0.0322F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(108, 67).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0204F, 5.3436F, 25.5305F, -0.9576F, 0.0094F, -0.1918F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(108, 44).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0629F, 4.8663F, 26.518F, -1.1147F, 0.0094F, -0.1918F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 96).addBox(-0.5F, -2.6941F, -0.9243F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0497F, 7.1786F, 21.9957F, -1.357F, 0.0F, 0.0F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(95, 95).addBox(-0.5F, -1.1008F, -0.6769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0497F, 7.1786F, 21.9957F, 0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(99, 89).addBox(-0.5F, -0.8133F, -1.9863F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.259F)), PartPose.offsetAndRotation(0.0497F, 7.1786F, 21.9957F, 0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5F, -0.0506F, -3.0885F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0497F, 7.1786F, 21.9957F, -0.0916F, 0.0F, 0.0F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(25, 88).addBox(-0.5F, -0.3007F, -3.1386F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(0.0497F, 7.1786F, 21.9957F, -0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(45, 106).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.096F, 4.6627F, 27.1869F, -1.2718F, 0.0094F, -0.1918F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(108, 40).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0062F, 5.1212F, 28.5651F, -1.6209F, 0.0094F, -0.1918F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(108, 36).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0625F, 4.6989F, 29.9569F, -1.551F, 0.0094F, -0.1918F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(108, 10).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0201F, 4.8489F, 31.3482F, -1.6819F, 0.0094F, -0.1918F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2979F, -10.615F, -35.8902F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(35, 113).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 7.8587F, 35.8764F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(112, 21).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 7.4832F, 35.17F, -2.0595F, 0.0F, 0.0F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(112, 14).mirror().addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 9.8436F, 33.4965F, 2.522F, 0.0F, 0.0F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(113, 11).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 9.9241F, 34.3297F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(98, 21).mirror().addBox(-0.5F, -0.425F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 8.8696F, 34.9111F, -2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(10, 113).mirror().addBox(-0.5F, -0.05F, 0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 9.6571F, 35.0839F, -2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(113, 8).mirror().addBox(-0.5F, -1.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 9.2332F, 35.7623F, 2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(112, 5).mirror().addBox(-0.5F, -1.1F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 8.5819F, 36.2269F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(5, 112).mirror().addBox(-0.6107F, -0.1246F, -0.5973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(112, 2).mirror().addBox(-0.3857F, -0.1246F, -0.5973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2893F, 8.9577F, 34.6123F, -3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(111, 110).mirror().addBox(-0.5607F, 0.6212F, -0.5139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.2893F, 8.9577F, 34.6123F, 3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-0.5F, -0.4837F, -0.3038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 9.7402F, 36.0773F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(106, 112).mirror().addBox(-0.5F, -0.356F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 9.7402F, 36.0773F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(101, 112).mirror().addBox(-0.5F, -0.1705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(96, 112).mirror().addBox(-0.5F, -0.4705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(113, 33).mirror().addBox(-0.5F, -3.0705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(113, 30).mirror().addBox(-0.5F, -2.6705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(5, 108).mirror().addBox(-0.5F, -2.2705F, -0.5535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(112, 94).mirror().addBox(-0.5F, -0.8705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 9.7402F, 36.0773F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(7, 99).mirror().addBox(-0.3152F, -0.3467F, 0.8555F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6478F, 10.5738F, 32.78F, 2.9182F, -0.0506F, 0.0045F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(17, 109).mirror().addBox(-0.317F, -10.4519F, 0.4683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(106, 108).mirror().addBox(-0.317F, -10.4519F, 1.0683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6478F, 10.5738F, 32.78F, 1.2601F, -0.0511F, 0.0056F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(110, 48).mirror().addBox(-0.317F, -8.0504F, 4.3768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6478F, 10.5738F, 32.78F, 1.6964F, -0.0511F, 0.0056F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(61, 87).mirror().addBox(-0.317F, -3.3513F, 6.965F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-0.6478F, 10.5738F, 32.78F, 2.3946F, -0.0511F, 0.0056F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(43, 86).mirror().addBox(-0.317F, -1.2787F, 7.4005F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6478F, 10.5738F, 32.78F, 2.7F, -0.0511F, 0.0056F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(43, 96).mirror().addBox(-0.317F, -2.1917F, 6.1697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.6478F, 10.5738F, 32.78F, 2.5516F, -0.0511F, 0.0056F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(85, 63).mirror().addBox(-0.317F, -1.0772F, 4.9682F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6478F, 10.5738F, 32.78F, 2.7262F, -0.0511F, 0.0056F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(91, 58).mirror().addBox(-0.317F, -0.6235F, 2.425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.6478F, 10.5738F, 32.78F, 2.8134F, -0.0511F, 0.0056F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(20, 113).mirror().addBox(-0.3008F, -0.0556F, 0.1921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 113).mirror().addBox(-0.3008F, -0.0556F, -0.4079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6478F, 10.5738F, 32.78F, -3.1068F, -0.0384F, 0.0005F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(50, 98).mirror().addBox(-0.3152F, -0.4872F, -0.3753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6478F, 10.5738F, 32.78F, 2.8265F, -0.0506F, 0.0045F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(111, 107).mirror().addBox(-0.5607F, -1.0717F, 0.0438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.2893F, 8.9577F, 34.6123F, 2.714F, 0.0F, 0.0F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(111, 104).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 8.0612F, 33.9183F, 2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(111, 101).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 7.4065F, 34.3737F, -2.1817F, 0.0F, 0.0F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(37, 100).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.2955F, 6.3552F, 33.77F, -1.1758F, -0.0094F, 0.1918F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, 5.733F, 33.1322F, -0.7831F, -0.0094F, 0.1918F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(80, 58).mirror().addBox(-0.5F, -0.3F, -0.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.2063F, 5.9099F, 33.489F, -0.626F, -0.0094F, 0.1918F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(90, 90).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.0201F, 4.8489F, 31.3482F, -0.4689F, -0.0094F, 0.1918F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(43, 91).mirror().addBox(-0.5F, -0.225F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0434F, 4.3924F, 29.8654F, -0.2617F, 0.0016F, 0.0074F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(67, 68).mirror().addBox(-0.3F, -0.325F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1605F, 5.5845F, 32.84F, -0.4363F, 0.0016F, 0.0074F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(100, 53).mirror().addBox(-0.5F, -0.325F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.0909F, 6.69F, 34.9627F, -0.6549F, -0.0445F, 0.0322F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(16, 91).mirror().addBox(-0.5F, -0.325F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0395F, 5.5845F, 32.8365F, -0.4804F, -0.0445F, 0.0322F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(108, 67).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0204F, 5.3436F, 25.5305F, -0.9576F, -0.0094F, 0.1918F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(108, 44).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0629F, 4.8663F, 26.518F, -1.1147F, -0.0094F, 0.1918F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-0.5F, -2.6941F, -0.9243F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.0497F, 7.1786F, 21.9957F, -1.357F, 0.0F, 0.0F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(95, 95).mirror().addBox(-0.5F, -1.1008F, -0.6769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0497F, 7.1786F, 21.9957F, 0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(99, 89).mirror().addBox(-0.5F, -0.8133F, -1.9863F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.259F)).mirror(false), PartPose.offsetAndRotation(-0.0497F, 7.1786F, 21.9957F, 0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.5F, -0.0506F, -3.0885F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.0497F, 7.1786F, 21.9957F, -0.0916F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(25, 88).mirror().addBox(-0.5F, -0.3007F, -3.1386F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(-0.0497F, 7.1786F, 21.9957F, -0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(45, 106).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.096F, 4.6627F, 27.1869F, -1.2718F, -0.0094F, 0.1918F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(108, 40).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0062F, 5.1212F, 28.5651F, -1.6209F, -0.0094F, 0.1918F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(108, 36).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0625F, 4.6989F, 29.9569F, -1.551F, -0.0094F, 0.1918F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(108, 10).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0201F, 4.8489F, 31.3482F, -1.6819F, -0.0094F, 0.1918F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2854F, 2.6925F, 1.3731F, 0.4659F, -0.2502F, -0.1848F));

		PartDefinition cube_r229 = leftwing1.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(72, 50).addBox(0.0F, 0.0F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8925F, -0.548F, -0.212F, -1.1373F, 0.4249F, 0.1885F));

		PartDefinition cube_r230 = leftwing1.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(65, 110).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(8.6858F, -0.0622F, -1.3846F, -1.139F, 0.417F, 0.1845F));

		PartDefinition cube_r231 = leftwing1.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(85, 50).addBox(0.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.8925F, -0.548F, -0.212F, -1.159F, 0.2975F, 0.1274F));

		PartDefinition cube_r232 = leftwing1.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.391F, -0.7339F, 0.2369F, -1.1695F, 0.2013F, 0.0846F));

		PartDefinition cube_r233 = leftwing1.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(101, 109).addBox(0.025F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.7468F, -1.0001F, 0.8796F, -1.1339F, 0.4407F, 0.1966F));

		PartDefinition cube_r234 = leftwing1.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(106, 74).addBox(-0.3F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3159F, -0.6508F, 0.0364F, -1.1247F, -0.4802F, -0.2174F));

		PartDefinition cube_r235 = leftwing1.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(96, 104).addBox(0.0F, -1.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0698F, -0.8267F, 0.461F, -0.9984F, -0.7863F, -0.4279F));

		PartDefinition cube_r236 = leftwing1.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(99, 80).addBox(-0.8F, 0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5499F, -0.2644F, -0.8967F, 1.1772F, 0.0645F, 3.1148F));

		PartDefinition cube_r237 = leftwing1.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(105, 2).addBox(-1.85F, -0.925F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1161F, -0.2667F, -0.8911F, 1.095F, 0.5818F, 2.8656F));

		PartDefinition cube_r238 = leftwing1.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(50, 113).addBox(-0.925F, -2.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1518F, 0.4374F, -2.5909F, -1.1532F, 0.3375F, 0.1459F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create().texOffs(18, 67).addBox(-1.3789F, -0.0386F, -0.1429F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.1932F, 0.0533F, -3.0544F, -1.7333F, 0.6239F, -2.9739F));

		PartDefinition cube_r239 = leftwing2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(40, 67).addBox(-0.5F, -7.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1789F, 7.4614F, -0.4429F, 0.0F, 0.0F, 0.0175F));

		PartDefinition cube_r240 = leftwing2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(32, 109).addBox(-1.5824F, -5.6821F, -1.4119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.2364F, 13.3119F, 0.461F, 0.0F, -1.5708F, 0.4276F));

		PartDefinition cube_r241 = leftwing2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(86, 104).addBox(-1.5824F, -4.2336F, -0.7194F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.2364F, 13.3119F, 0.461F, 0.0F, -1.5708F, 0.6021F));

		PartDefinition cube_r242 = leftwing2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(66, 106).addBox(-1.5824F, -1.7179F, -0.5068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.2364F, 13.3119F, 0.461F, 0.0F, -1.5708F, 0.7418F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(30, 59).addBox(-1.1096F, -0.3762F, 0.049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(35, 59).addBox(-0.6096F, -0.3762F, 0.049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-1.3474F, 13.4936F, -0.2083F, -0.2686F, 0.1392F, 0.4116F));

		PartDefinition cube_r243 = leftwing3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(101, 25).addBox(-0.2F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.6096F, -0.0762F, 0.549F, 0.0F, 0.0F, -0.48F));

		PartDefinition lefthand2 = leftwing3.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(72, 38).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4232F, 13.2557F, 0.2718F, -1.5033F, -0.3627F, -0.243F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9896F, 12.6841F, 0.573F, 1.6365F, 0.4965F, -2.981F));

		PartDefinition cube_r244 = leftwing4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(0, 0).addBox(-0.425F, -0.55F, -9.5F, 1.0F, 1.0F, 22.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3799F, -0.0164F, 8.846F, 0.0F, 0.0F, 0.6981F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(47, 0).addBox(-0.3057F, -0.7945F, -0.1036F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6421F, 0.1007F, 21.1733F, 0.2229F, 0.176F, 0.7383F));

		PartDefinition leftwing6 = leftwing5.addOrReplaceChild("leftwing6", CubeListBuilder.create().texOffs(0, 48).addBox(-0.1991F, -0.8283F, -0.087F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1201F, 0.0389F, 13.7384F, 0.2008F, 0.2885F, 0.0023F));

		PartDefinition leftwing7 = leftwing6.addOrReplaceChild("leftwing7", CubeListBuilder.create().texOffs(28, 75).addBox(-0.1F, -0.5F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.082F, -0.3354F, 8.8757F, 0.0886F, 0.2178F, 0.0078F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3569F, 2.6925F, 1.3731F, 0.2308F, 0.3352F, -0.1405F));

		PartDefinition cube_r245 = rightwing1.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(5, 80).addBox(-5.0F, 0.0F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.8925F, -0.548F, -0.212F, -1.1373F, -0.4249F, -0.1885F));

		PartDefinition cube_r246 = rightwing1.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(111, 60).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-8.6858F, -0.0622F, -1.3846F, -1.139F, -0.417F, -0.1845F));

		PartDefinition cube_r247 = rightwing1.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(70, 87).addBox(-4.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.8925F, -0.548F, -0.212F, -1.159F, -0.2975F, -0.1274F));

		PartDefinition cube_r248 = rightwing1.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(83, 74).addBox(-4.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.391F, -0.7339F, 0.2369F, -1.1695F, -0.2013F, -0.0846F));

		PartDefinition cube_r249 = rightwing1.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(0, 110).addBox(-1.025F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.7468F, -1.0001F, 0.8796F, -1.1339F, -0.4407F, -0.1966F));

		PartDefinition cube_r250 = rightwing1.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(106, 86).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3159F, -0.6508F, 0.0364F, -1.1247F, 0.4802F, 0.2174F));

		PartDefinition cube_r251 = rightwing1.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(101, 104).addBox(-1.0F, -1.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0698F, -0.8267F, 0.461F, -0.9984F, 0.7863F, 0.4279F));

		PartDefinition cube_r252 = rightwing1.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(101, 71).addBox(-1.2F, 0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.5499F, -0.2644F, -0.8967F, 1.1772F, -0.0645F, -3.1148F));

		PartDefinition cube_r253 = rightwing1.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(105, 5).addBox(-0.15F, -0.925F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1161F, -0.2667F, -0.8911F, 1.095F, -0.5818F, -2.8656F));

		PartDefinition cube_r254 = rightwing1.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(55, 113).addBox(-0.075F, -2.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1518F, 0.4374F, -2.5909F, -1.1532F, -0.3375F, -0.1459F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create().texOffs(23, 67).addBox(0.3789F, -0.0386F, -0.1429F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.1932F, 0.0533F, -3.0544F, -2.0075F, -0.6667F, 3.1283F));

		PartDefinition cube_r255 = rightwing2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(62, 70).addBox(-0.5F, -7.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1789F, 7.4614F, -0.4429F, 0.0F, 0.0F, -0.0175F));

		PartDefinition cube_r256 = rightwing2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(55, 109).addBox(0.5824F, -5.6821F, -1.4119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2364F, 13.3119F, 0.461F, 0.0F, 1.5708F, -0.4276F));

		PartDefinition cube_r257 = rightwing2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(91, 104).addBox(0.5824F, -4.2336F, -0.7194F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2364F, 13.3119F, 0.461F, 0.0F, 1.5708F, -0.6021F));

		PartDefinition cube_r258 = rightwing2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(106, 78).addBox(0.5824F, -1.7179F, -0.5068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2364F, 13.3119F, 0.461F, 0.0F, 1.5708F, -0.7418F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(62, 54).addBox(0.1096F, -0.3762F, 0.049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(0, 67).addBox(-0.3904F, -0.3762F, 0.049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(1.3474F, 13.4936F, -0.2083F, -0.0194F, -0.1799F, -0.5796F));

		PartDefinition cube_r259 = rightwing3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(28, 101).addBox(-1.8F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.6096F, -0.0762F, 0.549F, 0.0F, 0.0F, 0.48F));

		PartDefinition righthand2 = rightwing3.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(72, 44).addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4592F, 13.2577F, 0.3651F, -1.4869F, 0.3594F, 0.2895F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7414F, 12.7202F, 0.3288F, 1.7029F, -0.7979F, 3.0565F));

		PartDefinition cube_r260 = rightwing4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 24).addBox(-0.575F, -0.55F, -9.5F, 1.0F, 1.0F, 22.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3799F, -0.0164F, 8.846F, 0.0F, 0.0F, -0.6981F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(47, 16).addBox(-0.6943F, -0.7945F, -0.1036F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6421F, 0.1007F, 21.1733F, 0.3102F, -0.176F, -0.7383F));

		PartDefinition rightwing6 = rightwing5.addOrReplaceChild("rightwing6", CubeListBuilder.create().texOffs(21, 48).addBox(-0.8009F, -0.8283F, -0.087F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1201F, 0.0389F, 13.7384F, 0.2008F, -0.2885F, -0.0023F));

		PartDefinition rightwing7 = rightwing6.addOrReplaceChild("rightwing7", CubeListBuilder.create().texOffs(67, 75).addBox(-0.9F, -0.5F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.082F, -0.3354F, 8.8757F, 0.0886F, -0.2178F, -0.0078F));

		PartDefinition body = chest1.addOrReplaceChild("body", CubeListBuilder.create().texOffs(78, 12).addBox(-0.5357F, -0.5081F, -0.0684F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3212F, 1.9887F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r261 = body.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 116).addBox(-0.0357F, -0.7778F, 0.0256F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4157F, 2.8999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r262 = body.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(10, 116).addBox(-0.0357F, -0.8656F, -0.5744F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4157F, 1.4999F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r263 = body.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(100, 61).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 3.465F, 0.2659F, 0.015F, -0.2798F));

		PartDefinition cube_r264 = body.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(78, 30).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 3.465F, 0.1798F, 0.1465F, -0.8104F));

		PartDefinition cube_r265 = body.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(96, 15).mirror().addBox(-5.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 3.465F, 0.0822F, 0.2166F, -1.3383F));

		PartDefinition cube_r266 = body.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(97, 87).mirror().addBox(-5.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 1.465F, 0.1157F, 0.3343F, -1.3814F));

		PartDefinition cube_r267 = body.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(102, 98).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 1.465F, 0.2688F, 0.2317F, -0.8459F));

		PartDefinition cube_r268 = body.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(113, 69).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 1.465F, 0.3843F, 0.045F, -0.3285F));

		PartDefinition cube_r269 = body.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(113, 69).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 1.465F, 0.3843F, -0.045F, 0.3285F));

		PartDefinition cube_r270 = body.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(102, 98).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 1.465F, 0.2688F, -0.2317F, 0.8459F));

		PartDefinition cube_r271 = body.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(97, 87).addBox(2.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 1.465F, 0.1157F, -0.3343F, 1.3814F));

		PartDefinition cube_r272 = body.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(96, 15).addBox(2.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 3.465F, 0.0822F, -0.2166F, 1.3383F));

		PartDefinition cube_r273 = body.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(78, 30).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 3.465F, 0.1798F, -0.1465F, 0.8104F));

		PartDefinition cube_r274 = body.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(100, 61).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 3.465F, 0.2659F, -0.015F, 0.2798F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1157F, 3.8999F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r275 = body2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(18, 81).addBox(-1.5161F, -2.2562F, -4.0456F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0169F, 6.9587F, 4.2819F, 0.1571F, 0.0014F, -0.0017F));

		PartDefinition cube_r276 = body2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(108, 71).mirror().addBox(-4.2026F, -1.8495F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.0746F, 0.1112F, -1.4083F));

		PartDefinition cube_r277 = body2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(90, 115).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.1703F, -0.0301F, -0.3478F));

		PartDefinition cube_r278 = body2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(106, 65).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.1201F, 0.0591F, -0.8853F));

		PartDefinition cube_r279 = body2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(106, 65).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.1201F, -0.0591F, 0.8853F));

		PartDefinition cube_r280 = body2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(90, 115).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.1703F, 0.0301F, 0.3478F));

		PartDefinition cube_r281 = body2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(108, 71).addBox(2.2026F, -1.8495F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.0746F, -0.1112F, 1.4083F));

		PartDefinition cube_r282 = body2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(52, 110).addBox(-0.0357F, 0.2076F, 1.0318F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0015F, -1.2966F, 0.0784F, -0.1396F, 0.0012F, -0.0018F));

		PartDefinition cube_r283 = body2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(89, 5).addBox(-0.5357F, 0.0076F, 0.0318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2457F, 2.9524F, -0.0964F, 0.0869F, -0.0084F));

		PartDefinition cube_r284 = body3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(85, 96).addBox(-0.0357F, -0.4924F, 2.0318F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 116).addBox(-0.0357F, -0.5924F, 0.0318F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 92).addBox(-0.5357F, 0.0076F, 0.0318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition cube_r285 = body3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(72, 32).addBox(-1.4976F, -1.3247F, -2.7646F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0362F, 5.0874F, 2.2061F, 0.4364F, 0.0014F, -0.0017F));

		PartDefinition cube_r286 = body3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(107, 0).mirror().addBox(-4.2026F, -1.8494F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.1208F, 0.2537F, -1.4839F));

		PartDefinition cube_r287 = body3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(115, 17).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.3167F, 0.0008F, -0.434F));

		PartDefinition cube_r288 = body3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(105, 22).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.2315F, 0.1598F, -0.9571F));

		PartDefinition cube_r289 = body3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-3.8322F, -0.5004F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0326F, 2.4127F, 0.2611F, 0.1727F, -1.1082F));

		PartDefinition cube_r290 = body3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(115, 19).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0326F, 2.4127F, 0.3485F, -0.0025F, -0.59F));

		PartDefinition cube_r291 = body3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(115, 19).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0326F, 2.4127F, 0.3485F, 0.0025F, 0.59F));

		PartDefinition cube_r292 = body3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(98, 0).addBox(0.8322F, -0.5004F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0326F, 2.4127F, 0.2611F, -0.1727F, 1.1082F));

		PartDefinition cube_r293 = body3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(105, 22).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.2315F, -0.1598F, 0.9571F));

		PartDefinition cube_r294 = body3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(115, 17).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.3167F, -0.0008F, 0.434F));

		PartDefinition cube_r295 = body3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(107, 0).addBox(2.2026F, -1.8494F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.1208F, -0.2537F, 1.4839F));

		PartDefinition body1 = body3.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0039F, 3.0424F, -0.1722F, 0.086F, -0.0149F));

		PartDefinition cube_r296 = body1.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(103, 115).addBox(0.0009F, -0.424F, 2.4266F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 115).addBox(0.0009F, -0.424F, 0.4266F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 105).addBox(0.0009F, -0.424F, -1.5734F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0366F, 0.0548F, 2.5255F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r297 = body1.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(115, 48).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2996F, 1.3858F, 0.2508F, 0.1423F, -0.5969F));

		PartDefinition cube_r298 = body1.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(115, 71).mirror().addBox(-1.8322F, -0.5004F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2996F, 1.3858F, 0.1001F, 0.2481F, -1.1419F));

		PartDefinition cube_r299 = body1.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(85, 115).mirror().addBox(-0.9711F, 0.103F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.3996F, 3.3858F, 0.1885F, 0.0943F, -0.5834F));

		PartDefinition cube_r300 = body1.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(95, 115).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.3996F, 5.3858F, 0.0922F, -0.1705F, -0.3932F));

		PartDefinition cube_r301 = body1.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(95, 115).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.3996F, 5.3858F, 0.0922F, 0.1705F, 0.3932F));

		PartDefinition cube_r302 = body1.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(85, 115).addBox(-0.0289F, 0.103F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.3996F, 3.3858F, 0.1885F, -0.0943F, 0.5834F));

		PartDefinition cube_r303 = body1.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(115, 71).addBox(0.8322F, -0.5004F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2996F, 1.3858F, 0.1001F, -0.2481F, 1.1419F));

		PartDefinition cube_r304 = body1.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(115, 48).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2996F, 1.3858F, 0.2508F, -0.1423F, 0.5969F));

		PartDefinition cube_r305 = body1.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(15, 59).addBox(-0.5357F, -0.1F, -2.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0723F, 2.3588F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5357F, -0.5778F, -0.0329F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6638F, 5.9585F, 0.0509F, 0.2179F, 0.011F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(94, 63).addBox(-0.2279F, -0.2807F, -0.4086F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.304F, 1.6809F, 4.0472F, 0.6451F, 0.3741F, -1.3915F));

		PartDefinition cube_r306 = leftleg1.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(111, 79).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2721F, 10.594F, 1.5019F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r307 = leftleg1.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(111, 76).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(111, 73).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, 9.766F, 0.3647F, 0.32F, 0.0219F, -0.0034F));

		PartDefinition cube_r308 = leftleg1.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(106, 104).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2721F, 7.8239F, -0.0856F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r309 = leftleg1.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(103, 10).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, 4.8403F, -0.3992F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r310 = leftleg1.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(22, 105).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, -0.5497F, -0.1292F, 0.8901F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2556F, 11.0069F, 1.6021F, 0.9178F, 0.0609F, 0.2316F));

		PartDefinition cube_r311 = leftleg2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(47, 54).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(42, 48).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.5921F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(47, 32).addBox(-1.0F, -0.5F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5434F, 17.5344F, 1.1801F, 0.7629F, -0.1629F, -0.0365F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5279F, -0.2807F, 1.0914F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(68, 95).addBox(-0.7721F, -0.2807F, -0.4086F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.3754F, 1.6809F, 4.0472F, 0.2975F, -0.0989F, 1.3145F));

		PartDefinition cube_r312 = rightleg1.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(111, 98).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2721F, 10.594F, 1.5019F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r313 = rightleg1.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(111, 85).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(111, 82).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2721F, 9.766F, 0.3647F, 0.32F, -0.0219F, 0.0034F));

		PartDefinition cube_r314 = rightleg1.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(107, 52).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2721F, 7.8239F, -0.0856F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightleg1.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(56, 104).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2721F, 4.8403F, -0.3992F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightleg1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(27, 105).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2721F, -0.5497F, -0.1292F, 0.8901F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2556F, 11.0069F, 1.6021F, 0.9178F, -0.0609F, -0.2316F));

		PartDefinition cube_r317 = rightleg2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(57, 54).addBox(0.15F, -2.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 54).addBox(-0.95F, -2.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0191F, 1.5921F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(47, 43).addBox(-2.0F, -0.5F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5434F, 17.5344F, 1.1801F, 1.112F, 0.1629F, 0.0365F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5279F, -0.2807F, 1.0914F, 0.1367F, 0.0F, 0.0F));

		PartDefinition bone2 = body1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 0.8888F, 3.5179F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r318 = bone2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(76, 109).addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -1.8379F, 1.6531F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r319 = bone2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(113, 63).addBox(-0.5F, 0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, -2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r320 = bone2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(96, 109).addBox(-0.5F, -0.9F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(47, 110).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.2199F, 2.8323F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r321 = bone2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(75, 113).addBox(-0.5F, 0.0F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r322 = bone2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(5, 115).addBox(-0.5F, -0.375F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r323 = bone2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(27, 109).addBox(-0.5F, -0.7328F, -1.2997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r324 = bone2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(101, 29).addBox(-0.8952F, -0.5051F, -0.0296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, -1.2567F, -0.3222F, 0.4341F));

		PartDefinition cube_r325 = bone2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(65, 113).addBox(-0.8952F, -1.5986F, -0.7405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(80, 113).addBox(-0.8952F, -1.9986F, -1.1405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, -2.7403F, -0.3222F, 0.4341F));

		PartDefinition cube_r326 = bone2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(59, 96).addBox(-0.8952F, -0.5233F, -2.2233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, 2.6703F, -0.3222F, 0.4341F));

		PartDefinition cube_r327 = bone2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(91, 109).addBox(-0.8952F, -0.3689F, -0.896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, 2.4608F, -0.3222F, 0.4341F));

		PartDefinition cube_r328 = bone2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(40, 106).addBox(-0.9886F, -0.7921F, -1.2523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, 2.1233F, -0.1932F, 0.2455F));

		PartDefinition cube_r329 = bone2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(86, 112).addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r330 = bone2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(112, 57).addBox(-1.7406F, -2.5459F, -4.0436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, 1.405F, 0.3054F, -0.2443F));

		PartDefinition cube_r331 = bone2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(70, 114).addBox(-1.7406F, -4.4603F, 1.2584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, 2.7576F, 0.3054F, -0.2443F));

		PartDefinition cube_r332 = bone2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(101, 41).addBox(-1.7406F, -3.2548F, 1.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, -3.1067F, 0.3054F, -0.2443F));

		PartDefinition cube_r333 = bone2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(14, 101).addBox(-1.7406F, -1.9141F, 2.0834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, -2.5831F, 0.3054F, -0.2443F));

		PartDefinition cube_r334 = bone2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(49, 102).addBox(-0.8804F, -0.7235F, 0.0139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.1686F, 1.3632F, 0.5289F, -1.3325F, -0.1932F, 0.5073F));

		PartDefinition cube_r335 = bone2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(101, 45).addBox(-0.8804F, -0.4679F, -0.0372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.1686F, 1.3632F, 0.5289F, -1.3674F, -0.1932F, 0.5073F));

		PartDefinition cube_r336 = bone2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(64, 102).addBox(-0.8804F, 0.0548F, 0.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.1686F, 1.3632F, 0.5289F, -1.507F, -0.1932F, 0.5073F));

		PartDefinition cube_r337 = bone2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(86, 109).addBox(-0.9F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.4244F, 1.024F, -0.2161F, -0.6487F, -0.0304F, -0.0149F));

		PartDefinition cube_r338 = bone2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(37, 110).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4244F, 1.024F, -0.2161F, -0.9977F, -0.0304F, -0.0149F));

		PartDefinition cube_r339 = bone2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(37, 97).addBox(-0.9886F, 0.2024F, -0.0762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, -1.027F, -0.1932F, 0.2455F));

		PartDefinition cube_r340 = bone2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(107, 90).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2847F, -0.2251F, -3.2537F, 1.5508F, -0.2606F, 0.0105F));

		PartDefinition cube_r341 = bone2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(110, 18).addBox(-0.7327F, -0.6106F, -2.641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.1047F, -0.2182F, 0.0F));

		PartDefinition cube_r342 = bone2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(96, 49).addBox(-0.5F, -0.3003F, -1.2895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.4014F, -0.0873F, 0.0F));

		PartDefinition cube_r343 = bone2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(98, 2).addBox(-0.5F, -0.7003F, -1.8895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.0524F, -0.0873F, 0.0F));

		PartDefinition cube_r344 = bone2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(112, 54).addBox(-0.5F, -0.9328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 0.699F, -0.0957F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r345 = bone2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(112, 51).addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r346 = bone2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(10, 110).addBox(-0.9886F, -0.1148F, -0.5722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, 0.1162F, -0.1932F, 0.2455F));

		PartDefinition bone4 = body1.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4715F, 0.8888F, 3.5179F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r347 = bone4.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(76, 109).mirror().addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8379F, 1.6531F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r348 = bone4.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(113, 63).mirror().addBox(-0.5F, 0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, -2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r349 = bone4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(96, 109).mirror().addBox(-0.5F, -0.9F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(47, 110).mirror().addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2199F, 2.8323F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r350 = bone4.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(75, 113).mirror().addBox(-0.5F, 0.0F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r351 = bone4.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(5, 115).mirror().addBox(-0.5F, -0.375F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r352 = bone4.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(27, 109).mirror().addBox(-0.5F, -0.7328F, -1.2997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r353 = bone4.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(101, 29).mirror().addBox(-0.1048F, -0.5051F, -0.0296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, -1.2567F, 0.3222F, -0.4341F));

		PartDefinition cube_r354 = bone4.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(65, 113).mirror().addBox(-0.1048F, -1.5986F, -0.7405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(80, 113).mirror().addBox(-0.1048F, -1.9986F, -1.1405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, -2.7403F, 0.3222F, -0.4341F));

		PartDefinition cube_r355 = bone4.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(59, 96).mirror().addBox(-0.1048F, -0.5233F, -2.2233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, 2.6703F, 0.3222F, -0.4341F));

		PartDefinition cube_r356 = bone4.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(91, 109).mirror().addBox(-0.1048F, -0.3689F, -0.896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, 2.4608F, 0.3222F, -0.4341F));

		PartDefinition cube_r357 = bone4.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(40, 106).mirror().addBox(-0.0114F, -0.7921F, -1.2523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, 2.1233F, 0.1932F, -0.2455F));

		PartDefinition cube_r358 = bone4.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(86, 112).mirror().addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r359 = bone4.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(112, 57).mirror().addBox(0.7406F, -2.5459F, -4.0436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, 1.405F, -0.3054F, 0.2443F));

		PartDefinition cube_r360 = bone4.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(70, 114).mirror().addBox(0.7406F, -4.4603F, 1.2584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, 2.7576F, -0.3054F, 0.2443F));

		PartDefinition cube_r361 = bone4.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(101, 41).mirror().addBox(0.7406F, -3.2548F, 1.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, -3.1067F, -0.3054F, 0.2443F));

		PartDefinition cube_r362 = bone4.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(14, 101).mirror().addBox(0.7406F, -1.9141F, 2.0834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, -2.5831F, -0.3054F, 0.2443F));

		PartDefinition cube_r363 = bone4.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(49, 102).mirror().addBox(-0.1196F, -0.7235F, 0.0139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, 1.3632F, 0.5289F, -1.3325F, 0.1932F, -0.5073F));

		PartDefinition cube_r364 = bone4.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(101, 45).mirror().addBox(-0.1196F, -0.4679F, -0.0372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, 1.3632F, 0.5289F, -1.3674F, 0.1932F, -0.5073F));

		PartDefinition cube_r365 = bone4.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(64, 102).mirror().addBox(-0.1196F, 0.0548F, 0.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, 1.3632F, 0.5289F, -1.507F, 0.1932F, -0.5073F));

		PartDefinition cube_r366 = bone4.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(86, 109).mirror().addBox(-0.1F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(-0.4244F, 1.024F, -0.2161F, -0.6487F, 0.0304F, 0.0149F));

		PartDefinition cube_r367 = bone4.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(37, 110).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4244F, 1.024F, -0.2161F, -0.9977F, 0.0304F, 0.0149F));

		PartDefinition cube_r368 = bone4.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(37, 97).mirror().addBox(-0.0114F, 0.2024F, -0.0762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, -1.027F, 0.1932F, -0.2455F));

		PartDefinition cube_r369 = bone4.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(107, 90).mirror().addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2847F, -0.2251F, -3.2537F, 1.5508F, 0.2606F, -0.0105F));

		PartDefinition cube_r370 = bone4.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(110, 18).mirror().addBox(-0.2673F, -0.6106F, -2.641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.1047F, 0.2182F, 0.0F));

		PartDefinition cube_r371 = bone4.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(96, 49).mirror().addBox(-0.5F, -0.3003F, -1.2895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.4014F, 0.0873F, 0.0F));

		PartDefinition cube_r372 = bone4.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(98, 2).mirror().addBox(-0.5F, -0.7003F, -1.8895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.0524F, 0.0873F, 0.0F));

		PartDefinition cube_r373 = bone4.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(112, 54).mirror().addBox(-0.5F, -0.9328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.699F, -0.0957F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r374 = bone4.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(112, 51).mirror().addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r375 = bone4.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(10, 110).mirror().addBox(-0.0114F, -0.1148F, -0.5722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, 0.1162F, 0.1932F, -0.2455F));

		PartDefinition bone = chest1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.7781F, 1.2287F, 1.6873F));

		PartDefinition cube_r376 = bone.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(78, 18).addBox(-0.1F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0987F, 3.7102F, -0.2631F, 2.3056F, -0.1362F, 0.4506F));

		PartDefinition cube_r377 = bone.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(85, 68).addBox(-0.5898F, -0.0749F, -0.9806F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3908F, -0.4928F, -0.3403F, 0.3259F, 0.0876F, -0.4404F));

		PartDefinition cube_r378 = bone.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(94, 32).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.223F, -1.3716F, 3.6252F, -0.074F, 0.0851F, -0.4847F));

		PartDefinition cube_r379 = bone.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(23, 97).addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.1101F, -1.6666F, 1.7807F, 0.1005F, 0.0851F, -0.4847F));

		PartDefinition cube_r380 = bone.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(94, 70).addBox(-0.5F, 0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.0406F, -1.2335F, 0.1353F, 0.2751F, 0.0851F, -0.4847F));

		PartDefinition cube_r381 = bone.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(92, 100).addBox(-0.5768F, -0.3534F, 0.5223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.3908F, -0.4928F, -0.3403F, 0.1878F, 0.0851F, -0.4847F));

		PartDefinition cube_r382 = bone.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(101, 37).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(1.3987F, 2.4689F, -1.8713F, 0.8501F, 0.1714F, -0.4248F));

		PartDefinition cube_r383 = bone.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(112, 91).addBox(-0.5F, 0.1F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.258F, 2.4098F, -2.4714F, 2.5692F, 0.1714F, -0.4248F));

		PartDefinition cube_r384 = bone.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(50, 106).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8546F, 1.4289F, -2.2592F, -3.0158F, 0.1714F, -0.4248F));

		PartDefinition cube_r385 = bone.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(78, 96).addBox(-0.5F, -0.775F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.3219F, 0.2775F, -2.3222F, -2.7104F, 0.1714F, -0.4248F));

		PartDefinition cube_r386 = bone.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(94, 44).addBox(-0.5F, -1.05F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.3851F, 0.2797F, -1.9947F, -1.0087F, 0.1714F, -0.4248F));

		PartDefinition bone3 = chest1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.8496F, 1.2287F, 1.6873F));

		PartDefinition cube_r387 = bone3.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(78, 18).mirror().addBox(-0.9F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0987F, 3.7102F, -0.2631F, 2.3056F, 0.1362F, -0.4506F));

		PartDefinition cube_r388 = bone3.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(85, 68).mirror().addBox(-0.4102F, -0.0749F, -0.9806F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.4928F, -0.3403F, 0.3259F, -0.0876F, 0.4404F));

		PartDefinition cube_r389 = bone3.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(94, 32).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.223F, -1.3716F, 3.6252F, -0.074F, -0.0851F, 0.4847F));

		PartDefinition cube_r390 = bone3.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(23, 97).mirror().addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.1101F, -1.6666F, 1.7807F, 0.1005F, -0.0851F, 0.4847F));

		PartDefinition cube_r391 = bone3.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(94, 70).mirror().addBox(-0.5F, 0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.0406F, -1.2335F, 0.1353F, 0.2751F, -0.0851F, 0.4847F));

		PartDefinition cube_r392 = bone3.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(92, 100).mirror().addBox(-0.4232F, -0.3534F, 0.5223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.4928F, -0.3403F, 0.1878F, -0.0851F, 0.4847F));

		PartDefinition cube_r393 = bone3.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(101, 37).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-1.3987F, 2.4689F, -1.8713F, 0.8501F, -0.1714F, 0.4248F));

		PartDefinition cube_r394 = bone3.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(112, 91).mirror().addBox(-0.5F, 0.1F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.258F, 2.4098F, -2.4714F, 2.5692F, -0.1714F, 0.4248F));

		PartDefinition cube_r395 = bone3.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(50, 106).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8546F, 1.4289F, -2.2592F, -3.0158F, -0.1714F, 0.4248F));

		PartDefinition cube_r396 = bone3.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(78, 96).mirror().addBox(-0.5F, -0.775F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.3219F, 0.2775F, -2.3222F, -2.7104F, -0.1714F, 0.4248F));

		PartDefinition cube_r397 = bone3.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(94, 44).mirror().addBox(-0.5F, -1.05F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.3851F, 0.2797F, -1.9947F, -1.0087F, -0.1714F, 0.4248F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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