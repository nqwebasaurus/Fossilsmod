package fossils.fossils.client.blockentity.model.tupandactylusimperator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TupandactylusimperatorFossilModel extends SkullModelBase {
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

	public TupandactylusimperatorFossilModel(ModelPart root) {
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

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.054F, 0.9051F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0357F, -8.2722F, -2.7689F, -0.6353F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(119, 99).addBox(-0.9653F, -2.9561F, -0.3946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(126, 91).addBox(-0.9653F, -2.3461F, -1.9402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(64, 126).addBox(-0.9653F, 0.4808F, -2.1438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = chest1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(115, 65).addBox(-0.9653F, -1.6232F, -2.7971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -2.7838F, 0.0F, 0.0F));

		PartDefinition cube_r5 = chest1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(107, 82).addBox(-0.9653F, -1.7204F, -0.9137F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(67, 122).addBox(-0.9653F, -0.772F, -1.7458F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(111, 51).mirror().addBox(-5.2026F, -1.8494F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.1258F, 0.5267F, -1.4989F));

		PartDefinition cube_r8 = chest1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(121, 34).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.3827F, 0.391F, -0.9326F));

		PartDefinition cube_r9 = chest1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(124, 32).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.557F, 0.1315F, -0.435F));

		PartDefinition cube_r10 = chest1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 115).mirror().addBox(-0.4155F, -0.711F, -1.5398F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.501F, 6.3206F, 4.4718F, -0.1919F, -0.3002F, 0.0574F));

		PartDefinition cube_r11 = chest1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(124, 121).mirror().addBox(-0.397F, -1.1983F, -0.3508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.501F, 6.3206F, 4.4718F, 0.2091F, -0.2F, -1.1618F));

		PartDefinition cube_r12 = chest1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(124, 124).mirror().addBox(-0.3842F, -0.4208F, -1.1798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.501F, 6.3206F, 4.4718F, -0.765F, -0.3589F, -1.2593F));

		PartDefinition cube_r13 = chest1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(7, 115).mirror().addBox(-1.2843F, -0.4511F, 0.293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.501F, 6.3206F, 4.4718F, -0.0958F, 0.0609F, 0.5643F));

		PartDefinition cube_r14 = chest1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 115).addBox(0.2843F, -0.4511F, 0.293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -0.0958F, -0.0609F, -0.5643F));

		PartDefinition cube_r15 = chest1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(107, 14).addBox(-1.4653F, -0.6898F, 0.293F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r16 = chest1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(124, 124).addBox(-0.6158F, -0.4208F, -1.1798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -0.765F, 0.3589F, 1.2593F));

		PartDefinition cube_r17 = chest1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(124, 121).addBox(-0.603F, -1.1983F, -0.3508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, 0.2091F, 0.2F, 1.1618F));

		PartDefinition cube_r18 = chest1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 115).addBox(-0.5845F, -0.711F, -1.5398F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4296F, 6.3206F, 4.4718F, -0.1919F, 0.3002F, -0.0574F));

		PartDefinition cube_r19 = chest1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 48).addBox(-0.0357F, -0.9F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1684F, 1.8969F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r20 = chest1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(124, 32).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.557F, -0.1315F, 0.435F));

		PartDefinition cube_r21 = chest1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(121, 34).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.3827F, -0.391F, 0.9326F));

		PartDefinition cube_r22 = chest1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(111, 51).addBox(2.2026F, -1.8494F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.1258F, -0.5267F, 1.4989F));

		PartDefinition cube_r23 = chest1.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(82, 112).addBox(-0.5357F, -0.3123F, 0.6852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4212F, -0.7096F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4982F, -0.0053F, 0.062F, -0.1742F, -0.0108F));

		PartDefinition cube_r24 = neck1.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(20, 66).addBox(-0.0357F, -0.7317F, -1.0517F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7555F, 0.1133F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r25 = neck1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(126, 88).addBox(-0.5357F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.5867F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck5 = neck1.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.9867F, -0.2764F, -0.0162F, -0.1616F));

		PartDefinition cube_r26 = neck5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(99, 120).addBox(-0.0357F, -1.6F, -3.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(50, 92).addBox(-0.5357F, -0.9F, -4.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck = neck5.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3014F, -3.7199F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r27 = neck.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(91, 44).addBox(-0.5357F, -0.8259F, -4.0016F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3956F, -0.0591F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r28 = neck.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(107, 94).addBox(-0.0357F, -0.4F, -2.3F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8475F, -1.2722F, -0.1571F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(72, 93).addBox(-0.5357F, -0.8178F, -3.9187F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2953F, -4.0192F, -0.5605F, -0.1669F, 0.0511F));

		PartDefinition cube_r29 = neck2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(121, 25).addBox(0.0F, 0.1F, -1.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -1.3696F, -1.6769F, 0.0785F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(89, 119).addBox(-0.0357F, -0.7966F, -2.3168F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3474F, -3.8445F, -0.0428F, -0.0807F, -0.3884F));

		PartDefinition cube_r30 = neck3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(38, 102).addBox(-0.5357F, -0.3F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.198F, -0.4517F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.286F, -3.0062F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r31 = neck4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(112, 99).addBox(-0.5357F, -0.3F, -7.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -0.2033F, 5.5443F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1287F, -1.237F, 1.9076F, 0.0101F, 0.0592F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(82, 109).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0357F, 0.6989F, -1.4843F, -1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(50, 98).addBox(-1.5F, -0.75F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -0.3538F, -0.8102F, -2.7838F, 0.0F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(66, 99).addBox(-1.5F, 0.5F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0357F, -1.6019F, 1.4614F, 2.0595F, 0.0F, 0.0F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(109, 23).addBox(-1.5F, -0.3F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0357F, -1.6019F, 1.4614F, 2.8449F, 0.0F, 0.0F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(96, 18).addBox(-1.5F, -1.1F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0357F, -1.6019F, 1.4614F, -2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 99).addBox(-1.5F, -0.8F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0357F, -0.9717F, 0.7114F, 2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(83, 0).addBox(-2.0F, 0.0F, -2.8F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4643F, 0.3395F, -0.8762F, -2.9583F, 0.0F, 0.0F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(107, 10).addBox(-2.0F, -0.4F, 0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, -1.8234F, -2.0097F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 93).addBox(-1.5F, -1.5F, -0.875F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0357F, -1.9888F, -0.4532F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 80).addBox(-2.0F, -0.7F, -2.175F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4643F, -4.1497F, 1.6427F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(96, 84).addBox(-2.0F, -2.0F, -1.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4643F, -2.2009F, 2.0926F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -0.775F, -9.75F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, 0.0598F, -8.1836F, -0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(40, 65).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, 0.0371F, -2.9264F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(56, 104).addBox(-0.5F, -0.2203F, -0.2884F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, -0.7103F, -22.3227F, 0.2574F, 0.0F, 0.0F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(103, 100).addBox(-0.5F, -0.2256F, -0.3344F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.0357F, -0.7103F, -22.3227F, 0.3447F, 0.0F, 0.0F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, -0.35F, -0.75F, 1.0F, 5.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -12.8488F, -11.5724F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(52, 116).addBox(-0.5F, -2.45F, -0.825F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -17.4019F, -12.1373F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(121, 94).addBox(-0.5F, -0.5F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0357F, -20.0299F, -11.2736F, 2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(5, 122).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0357F, -36.4881F, 1.4042F, 2.3038F, 0.0F, 0.0F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(85, 44).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0357F, -35.4811F, 0.4317F, 2.3736F, 0.0F, 0.0F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(77, 64).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0357F, -25.1055F, -8.0576F, 2.426F, 0.0F, 0.0F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(76, 117).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0357F, -23.5645F, -9.9271F, 2.426F, 0.0F, 0.0F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(71, 117).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0357F, -21.5517F, -11.2342F, 2.5656F, 0.0F, 0.0F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(43, 117).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0357F, -20.3854F, -11.5805F, 2.6878F, 0.0F, 0.0F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(33, 117).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -18.1317F, -13.3669F, 2.5395F, 0.0F, 0.0F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(33, 111).addBox(-0.5F, -2.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -18.6021F, -12.3163F, 2.6791F, 0.0F, 0.0F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(121, 86).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -16.6822F, -14.2552F, 2.5918F, 0.0F, 0.0F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(11, 93).addBox(-0.5F, -3.15F, -1.6F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -15.4446F, -13.5334F, 2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(38, 117).addBox(-0.5F, -1.4F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -1.8926F, -20.9212F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(96, 33).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -4.9367F, -20.0391F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(38, 107).addBox(-0.5F, -0.875F, -1.475F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -5.361F, -18.5895F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(23, 59).addBox(-0.5F, -0.2F, -6.8F, 1.0F, 3.0F, 7.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -11.0848F, -17.3575F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(96, 26).addBox(-0.5F, -2.85F, -2.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -13.4688F, -16.09F, 2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(19, 110).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -15.4446F, -13.5334F, 1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(53, 84).addBox(-0.5F, -1.85F, -2.15F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.0357F, -14.0436F, -12.5705F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(105, 31).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -14.2322F, -10.1738F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(105, 26).addBox(-0.5F, -0.85F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -13.712F, -9.7054F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(103, 115).addBox(-0.5F, -2.85F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -13.1184F, -9.3344F, 2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(85, 78).addBox(-0.5F, -0.175F, -0.15F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -11.6606F, -8.5096F, -2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(86, 102).addBox(-0.5F, -0.175F, -1.85F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -10.0735F, -7.9004F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(65, 54).addBox(-0.5F, 3.25F, -5.475F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -13.364F, -8.922F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(72, 32).addBox(-0.5F, -1.85F, -4.85F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -2.0747F, 6.4347F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(95, 62).addBox(-0.5F, 0.125F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -4.8923F, 0.183F, 2.8667F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(72, 40).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -3.0593F, 5.2806F, 2.954F, 0.0F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(85, 30).addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -4.5798F, 9.0579F, 3.0936F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(39, 89).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -3.5759F, 12.6872F, 3.0587F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(72, 87).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -4.3938F, 14.7442F, -3.0849F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(30, 95).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -4.4745F, 18.4433F, -3.1198F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(107, 5).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -4.392F, 21.142F, 3.111F, 0.0F, 0.0F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(20, 105).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -4.2625F, 23.8389F, 3.0936F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(111, 126).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -4.1681F, 24.5325F, -1.7061F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(106, 126).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -3.3309F, 25.0608F, -0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(101, 126).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -3.2123F, 24.3709F, 0.1702F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(122, 69).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -3.0716F, 22.6767F, 1.6537F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(121, 82).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -3.6892F, 20.9451F, 1.6188F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(65, 108).addBox(-0.5F, -0.125F, -0.85F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -3.5151F, 15.2477F, 1.6013F, 0.0F, 0.0F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(9, 107).addBox(-0.5F, -0.2F, -0.15F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -2.3858F, 9.8196F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(61, 92).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -3.6395F, 16.1909F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(85, 37).addBox(-0.5F, -0.15F, -3.85F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -2.1933F, 8.1305F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(109, 38).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -2.1933F, 8.1305F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(80, 48).addBox(0.0F, -2.15F, -1.85F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.5357F, -6.5574F, -15.9442F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(40, 74).addBox(0.0F, -1.85F, -1.85F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.5357F, -7.1943F, -14.368F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(57, 109).addBox(0.0F, -1.85F, -0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5357F, -7.6199F, -12.7221F, -2.8885F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(94, 91).addBox(0.0F, -0.15F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5357F, -7.1012F, -5.6055F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(116, 115).addBox(-1.0F, -0.875F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0357F, -4.2996F, -0.1999F, 1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(116, 112).addBox(-1.0F, -0.175F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0357F, -4.9028F, -0.5552F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(45, 113).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0357F, -5.2176F, -0.7255F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(116, 109).addBox(-1.0F, -0.175F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0357F, -5.4731F, -1.0423F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(83, 18).addBox(-1.0F, -0.175F, -0.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0357F, -6.4845F, -3.5457F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(105, 77).addBox(0.0F, -0.15F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5357F, -7.2927F, -5.0489F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(105, 89).addBox(0.0F, -0.15F, -0.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5357F, -6.8958F, -3.3958F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(38, 113).addBox(0.0F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5357F, -6.681F, -4.3216F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(20, 78).addBox(0.0F, -0.775F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5357F, -5.9078F, -3.7111F, -0.2793F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0017F, 0.7786F, -1.645F, -0.4878F, -0.0006F, -0.0013F));

		PartDefinition cube_r105 = jaw.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(66, 103).mirror().addBox(-0.2666F, -0.2557F, -0.422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 0.7256F, -0.0638F, -0.0046F));

		PartDefinition cube_r106 = jaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(108, 71).mirror().addBox(-0.7923F, -0.3913F, 0.2397F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0308F, 3.3491F, -2.0105F, 0.4102F, -0.051F, -0.0132F));

		PartDefinition cube_r107 = jaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(94, 100).mirror().addBox(-0.7451F, -0.4323F, -3.5776F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0308F, 3.3491F, -2.0105F, 0.3133F, -0.1949F, -0.0769F));

		PartDefinition cube_r108 = jaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(104, 123).mirror().addBox(-0.2666F, -0.4253F, 0.0775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, -0.2343F, -0.0638F, -0.0046F));

		PartDefinition cube_r109 = jaw.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(45, 107).mirror().addBox(-0.2666F, -2.7763F, 0.58F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, -0.6707F, -0.0638F, -0.0046F));

		PartDefinition cube_r110 = jaw.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(20, 99).mirror().addBox(-0.2666F, -4.1781F, -2.1499F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, -1.9797F, -0.0638F, -0.0046F));

		PartDefinition cube_r111 = jaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(122, 61).mirror().addBox(-0.2666F, -1.7053F, -4.6311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 2.9509F, -0.0638F, -0.0046F));

		PartDefinition cube_r112 = jaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(109, 110).mirror().addBox(-0.2666F, 3.656F, -2.9808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 1.6855F, -0.0638F, -0.0046F));

		PartDefinition cube_r113 = jaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 119).mirror().addBox(-0.2666F, 1.6199F, 2.7375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 0.5511F, -0.0638F, -0.0046F));

		PartDefinition cube_r114 = jaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(29, 101).mirror().addBox(-0.2666F, -3.385F, 2.2905F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, -0.8016F, -0.0638F, -0.0046F));

		PartDefinition cube_r115 = jaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(72, 48).mirror().addBox(-0.2666F, -5.7741F, -4.1432F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, -2.1978F, -0.0638F, -0.0046F));

		PartDefinition cube_r116 = jaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(114, 92).mirror().addBox(-0.2666F, 2.2515F, -6.616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 2.7764F, -0.0638F, -0.0046F));

		PartDefinition cube_r117 = jaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(102, 110).mirror().addBox(-0.2666F, 5.0034F, 1.9617F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 1.3539F, -0.0638F, -0.0046F));

		PartDefinition cube_r118 = jaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(75, 107).mirror().addBox(-0.2666F, -0.717F, 2.2132F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(82, 64).mirror().addBox(-0.242F, -0.3124F, 9.1301F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(82, 71).mirror().addBox(-0.242F, 0.1876F, 9.1301F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 0.5336F, -0.0638F, -0.0046F));

		PartDefinition cube_r119 = jaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(41, 95).mirror().addBox(-0.2666F, -1.1386F, 3.8317F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 0.4289F, -0.0638F, -0.0046F));

		PartDefinition cube_r120 = jaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(102, 43).mirror().addBox(-0.2666F, -0.7885F, 6.5377F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(47, 102).mirror().addBox(-0.2666F, -0.0885F, 6.5377F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 0.4813F, -0.0638F, -0.0046F));

		PartDefinition cube_r121 = jaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(96, 6).mirror().addBox(-0.242F, -0.5564F, 13.8251F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(96, 12).mirror().addBox(-0.242F, -0.1564F, 13.8251F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 0.5162F, -0.0638F, -0.0046F));

		PartDefinition cube_r122 = jaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(69, 126).mirror().addBox(-0.242F, 17.3209F, 1.86F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(87, 126).mirror().addBox(-0.242F, 17.3209F, 1.4599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 1.9561F, -0.0638F, -0.0046F));

		PartDefinition cube_r123 = jaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(126, 76).mirror().addBox(-0.242F, 2.6972F, 17.7843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 0.6907F, -0.0638F, -0.0046F));

		PartDefinition cube_r124 = jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(82, 126).mirror().addBox(-0.242F, 14.5383F, 10.9651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 1.4325F, -0.0638F, -0.0046F));

		PartDefinition cube_r125 = jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(126, 82).mirror().addBox(-0.2631F, 12.8727F, -14.5647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 2.8722F, -0.064F, -0.0021F));

		PartDefinition cube_r126 = jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(49, 123).mirror().addBox(-0.2631F, -8.1147F, -18.6789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, -2.2765F, -0.064F, -0.0021F));

		PartDefinition cube_r127 = jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(12, 119).mirror().addBox(-0.2631F, -18.9274F, -6.3339F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, -1.4038F, -0.064F, -0.0021F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(123, 0).mirror().addBox(-0.2631F, -19.1254F, 1.0165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, -1.0111F, -0.064F, -0.0021F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(57, 118).mirror().addBox(-0.2631F, -17.48F, 0.4124F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(14, 107).mirror().addBox(-0.2631F, -14.78F, 0.4124F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, -1.046F, -0.064F, -0.0021F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(126, 85).mirror().addBox(-0.2866F, -8.3419F, 3.031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, -0.7406F, -0.064F, -0.0021F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(122, 65).mirror().addBox(-0.2866F, -5.275F, -6.9265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, -2.1369F, -0.064F, -0.0021F));

		PartDefinition cube_r132 = jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(109, 114).mirror().addBox(-0.2866F, 4.1247F, -6.4853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.244F, 9.3682F, -16.8691F, 2.7937F, -0.064F, -0.0021F));

		PartDefinition cube_r133 = jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(94, 100).addBox(0.7451F, -0.4323F, -3.5776F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0372F, 3.3491F, -2.0105F, 0.3133F, 0.1949F, 0.0769F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(108, 71).addBox(0.7923F, -0.3913F, 0.2397F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0372F, 3.3491F, -2.0105F, 0.4102F, 0.051F, 0.0132F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(102, 110).addBox(-0.7334F, 5.0034F, 1.9617F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 1.3539F, 0.0638F, 0.0046F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(114, 92).addBox(-0.7334F, 2.2515F, -6.616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 2.7764F, 0.0638F, 0.0046F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(72, 48).addBox(-0.7334F, -5.7741F, -4.1432F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, -2.1978F, 0.0638F, 0.0046F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(29, 101).addBox(-0.7334F, -3.385F, 2.2905F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, -0.8016F, 0.0638F, 0.0046F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 119).addBox(-0.7334F, 1.6199F, 2.7375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 0.5511F, 0.0638F, 0.0046F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(109, 110).addBox(-0.7334F, 3.656F, -2.9808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 1.6855F, 0.0638F, 0.0046F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(122, 61).addBox(-0.7334F, -1.7053F, -4.6311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 2.9509F, 0.0638F, 0.0046F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(20, 99).addBox(-0.7334F, -4.1781F, -2.1499F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, -1.9797F, 0.0638F, 0.0046F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(45, 107).addBox(-0.7334F, -2.7763F, 0.58F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, -0.6707F, 0.0638F, 0.0046F));

		PartDefinition cube_r144 = jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(104, 123).addBox(-0.7334F, -0.4253F, 0.0775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, -0.2343F, 0.0638F, 0.0046F));

		PartDefinition cube_r145 = jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(109, 114).addBox(-0.7134F, 4.1247F, -6.4853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 2.7937F, 0.064F, 0.0021F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(122, 65).addBox(-0.7134F, -5.275F, -6.9265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, -2.1369F, 0.064F, 0.0021F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(126, 85).addBox(-0.7134F, -8.3419F, 3.031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, -0.7406F, 0.064F, 0.0021F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(14, 107).addBox(-0.7369F, -14.78F, 0.4124F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 118).addBox(-0.7369F, -17.48F, 0.4124F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, -1.046F, 0.064F, 0.0021F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(123, 0).addBox(-0.7369F, -19.1254F, 1.0165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, -1.0111F, 0.064F, 0.0021F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(12, 119).addBox(-0.7369F, -18.9274F, -6.3339F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, -1.4038F, 0.064F, 0.0021F));

		PartDefinition cube_r151 = jaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(49, 123).addBox(-0.7369F, -8.1147F, -18.6789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, -2.2765F, 0.064F, 0.0021F));

		PartDefinition cube_r152 = jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(126, 82).addBox(-0.7369F, 12.8727F, -14.5647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 2.8722F, 0.064F, 0.0021F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(82, 126).addBox(-0.758F, 14.5383F, 10.9651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 1.4325F, 0.0638F, 0.0046F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(126, 76).addBox(-0.758F, 2.6972F, 17.7843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 0.6907F, 0.0638F, 0.0046F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(87, 126).addBox(-0.758F, 17.3209F, 1.4599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F))
				.texOffs(69, 126).addBox(-0.758F, 17.3209F, 1.86F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 1.9561F, 0.0638F, 0.0046F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(96, 12).addBox(-0.758F, -0.1564F, 13.8251F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.148F))
				.texOffs(96, 6).addBox(-0.758F, -0.5564F, 13.8251F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 0.5162F, 0.0638F, 0.0046F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(82, 71).addBox(-0.758F, 0.1876F, 9.1301F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.148F))
				.texOffs(82, 64).addBox(-0.758F, -0.3124F, 9.1301F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(75, 107).addBox(-0.7334F, -0.717F, 2.2132F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 0.5336F, 0.0638F, 0.0046F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(47, 102).addBox(-0.7334F, -0.0885F, 6.5377F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F))
				.texOffs(102, 43).addBox(-0.7334F, -0.7885F, 6.5377F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 0.4813F, 0.0638F, 0.0046F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(41, 95).addBox(-0.7334F, -1.1386F, 3.8317F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 0.4289F, 0.0638F, 0.0046F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(66, 103).addBox(-0.7334F, -0.2557F, -0.422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.176F, 9.3682F, -16.8691F, 0.7256F, 0.0638F, 0.0046F));

		PartDefinition crest1 = head.addOrReplaceChild("crest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.8125F, 7.031F, -0.0911F, 0.0F, 0.0F));

		PartDefinition crest2 = crest1.addOrReplaceChild("crest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 1.3F, 0.0456F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1306F, -10.615F, -35.8989F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(59, 124).addBox(-0.4393F, -1.1797F, -1.6515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.2893F, 8.6577F, 36.2623F, -1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(37, 124).addBox(-0.4393F, -0.536F, 0.9243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2893F, 8.6577F, 36.2623F, -2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(42, 126).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(0.35F, 9.6242F, 35.9798F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(113, 53).addBox(-0.5F, -0.425F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.35F, 8.5696F, 36.5611F, -2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(30, 126).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.35F, 9.3571F, 36.7339F, -2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(126, 25).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(0.35F, 8.9332F, 37.4123F, 2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(124, 29).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.35F, 8.2819F, 37.8769F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(25, 124).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.35F, 8.175F, 37.4914F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 124).addBox(-0.3893F, -0.1245F, -0.5974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(119, 123).addBox(-0.6143F, -0.1245F, -0.5974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.2893F, 8.6577F, 36.2623F, -3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(123, 118).addBox(-0.4393F, 0.6212F, -0.5139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.2893F, 8.6577F, 36.2623F, 3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(20, 126).addBox(-0.5F, -0.4837F, -0.3038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.55F, 10.1402F, 36.4773F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(126, 18).addBox(-0.5F, -0.356F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.55F, 10.1402F, 36.4773F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(15, 126).addBox(-0.5F, -0.1705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(5, 126).addBox(-0.5F, -0.4705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(125, 56).addBox(-0.5F, -1.2705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(125, 53).addBox(-0.5F, -0.8705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.55F, 10.1402F, 36.4773F, 1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(72, 80).addBox(-0.6951F, -0.3435F, 0.6558F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6228F, 10.6738F, 33.48F, 3.1253F, 0.0518F, 0.0418F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(11, 101).addBox(-0.2905F, 0.396F, 1.3498F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4772F, 9.6738F, 19.28F, -2.9038F, 0.0169F, -0.0279F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(30, 86).addBox(-0.2905F, -0.5035F, 1.1137F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4772F, 9.6738F, 19.28F, 2.69F, 0.0169F, -0.0279F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(96, 77).addBox(-0.2905F, 0.0476F, -0.0354F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4772F, 9.6738F, 19.28F, -3.1133F, 0.0169F, -0.0279F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(106, 66).addBox(-0.6927F, 0.1691F, 2.7886F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1228F, 9.6738F, 23.08F, -3.1142F, 0.0518F, -0.028F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(40, 82).addBox(-0.6927F, -0.5008F, -0.0725F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1228F, 9.6738F, 23.08F, 2.9508F, 0.0518F, -0.028F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(114, 88).addBox(-0.6927F, -0.9294F, 2.419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1228F, 9.6738F, 23.08F, 2.7064F, 0.0518F, -0.028F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(114, 84).addBox(-0.5748F, -2.8152F, 3.1875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1228F, 9.6738F, 23.08F, 2.2259F, 0.0633F, -0.0647F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(106, 61).addBox(-0.6927F, -0.5107F, -0.0992F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1228F, 9.6738F, 23.08F, 2.8635F, 0.0518F, -0.028F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(29, 106).addBox(-0.6951F, -1.5153F, 7.7381F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6228F, 10.6738F, 33.48F, 2.9508F, 0.0518F, 0.0418F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 106).addBox(-0.6951F, -0.8184F, 5.2226F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6228F, 10.6738F, 33.48F, 3.0381F, 0.0518F, 0.0418F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(52, 126).addBox(-0.707F, -0.1034F, -0.002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(47, 126).addBox(-0.707F, -0.1034F, -0.602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6228F, 10.6738F, 33.48F, -2.8997F, 0.0391F, 0.0433F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(114, 80).addBox(-0.6951F, -0.4157F, -0.5739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6228F, 10.6738F, 33.48F, 3.0337F, 0.0518F, 0.0418F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(121, 18).addBox(-0.4393F, -2.0717F, 0.3688F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.2893F, 8.6577F, 36.2623F, 2.714F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(123, 115).addBox(-0.4393F, -0.6017F, 0.2937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.2893F, 8.6577F, 36.2623F, 2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(114, 123).addBox(-0.4393F, 0.3152F, -1.0931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2893F, 8.6577F, 36.2623F, -2.3038F, 0.0F, 0.0F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(32, 122).addBox(-0.5F, -1.0F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.2466F, 6.0315F, 35.2359F, 1.2066F, 0.0094F, -0.1918F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(121, 90).addBox(-0.7805F, 2.8674F, 1.0433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1023F, 3.9957F, 31.5956F, 0.683F, 0.0094F, -0.1918F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(93, 106).addBox(-0.8555F, -0.1501F, -0.2436F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5103F, 5.4905F, 35.9286F, -0.2196F, 0.2277F, 0.5705F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(80, 57).addBox(-0.8555F, -0.1501F, -0.2436F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1584F, 3.8896F, 31.6305F, -0.2567F, 0.2615F, 0.5614F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(95, 68).addBox(-0.7805F, -0.2501F, -0.2436F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1023F, 3.9957F, 31.5956F, -0.3642F, 0.0094F, -0.1918F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(114, 18).addBox(-0.8966F, -0.7889F, 1.6427F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0023F, 3.6957F, 27.9956F, -0.2313F, 0.0436F, -0.192F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(20, 70).addBox(-0.85F, -0.15F, -0.15F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.3836F, 3.7191F, 32.5014F, -0.1813F, -0.2027F, -0.7693F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(57, 114).addBox(-0.85F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.3692F, 3.5207F, 31.675F, -0.1558F, -0.1783F, -0.7735F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(75, 113).addBox(-0.8966F, -0.5719F, 0.0045F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0023F, 3.6957F, 27.9956F, -0.1091F, 0.0436F, -0.192F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(114, 76).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.3315F, 3.1227F, 29.5136F, -0.2238F, -0.1171F, -0.7812F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(103, 105).addBox(-0.7F, -0.3F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3315F, 3.1227F, 29.5136F, -0.0929F, -0.1171F, -0.7812F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(113, 57).addBox(-0.8966F, -0.5549F, -1.6445F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0023F, 3.6957F, 27.9956F, 0.0218F, 0.0436F, -0.192F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(116, 4).addBox(-0.85F, -1.55F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(116, 0).addBox(-0.85F, -0.85F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4831F, 5.2606F, 38.2028F, 3.0205F, -0.1447F, -0.7783F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(96, 0).addBox(-0.9F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0502F, 4.9028F, 21.4374F, 0.4334F, 0.0911F, -0.1713F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(114, 26).addBox(-0.8973F, -1.4853F, -6.827F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0023F, 3.6957F, 27.9956F, 0.3272F, 0.0436F, -0.1933F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(93, 56).addBox(-0.8966F, -0.8173F, -5.2551F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0023F, 3.6957F, 27.9956F, 0.1963F, 0.0436F, -0.192F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2021F, -10.615F, -35.8989F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(59, 124).mirror().addBox(-0.5607F, -1.1797F, -1.6515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.2893F, 8.6577F, 36.2623F, -1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(37, 124).mirror().addBox(-0.5607F, -0.536F, 0.9243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2893F, 8.6577F, 36.2623F, -2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(42, 126).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 9.6242F, 35.9798F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(113, 53).mirror().addBox(-0.5F, -0.425F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 8.5696F, 36.5611F, -2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(30, 126).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 9.3571F, 36.7339F, -2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(126, 25).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 8.9332F, 37.4123F, 2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(124, 29).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 8.2819F, 37.8769F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(25, 124).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 8.175F, 37.4914F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-0.6107F, -0.1245F, -0.5974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(119, 123).mirror().addBox(-0.3857F, -0.1245F, -0.5974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2893F, 8.6577F, 36.2623F, -3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(123, 118).mirror().addBox(-0.5607F, 0.6212F, -0.5139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.2893F, 8.6577F, 36.2623F, 3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(20, 126).mirror().addBox(-0.5F, -0.4837F, -0.3038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 10.1402F, 36.4773F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(126, 18).mirror().addBox(-0.5F, -0.356F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 10.1402F, 36.4773F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(15, 126).mirror().addBox(-0.5F, -0.1705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(5, 126).mirror().addBox(-0.5F, -0.4705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(125, 56).mirror().addBox(-0.5F, -1.2705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(125, 53).mirror().addBox(-0.5F, -0.8705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 10.1402F, 36.4773F, 1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(72, 80).mirror().addBox(-0.3049F, -0.3435F, 0.6558F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6228F, 10.6738F, 33.48F, 3.1253F, -0.0518F, -0.0418F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(11, 101).mirror().addBox(-0.7095F, 0.396F, 1.3498F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4772F, 9.6738F, 19.28F, -2.9038F, -0.0169F, 0.0279F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(30, 86).mirror().addBox(-0.7095F, -0.5035F, 1.1137F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.4772F, 9.6738F, 19.28F, 2.69F, -0.0169F, 0.0279F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(96, 77).mirror().addBox(-0.7095F, 0.0476F, -0.0354F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4772F, 9.6738F, 19.28F, -3.1133F, -0.0169F, 0.0279F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(106, 66).mirror().addBox(-0.3073F, 0.1691F, 2.7886F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1228F, 9.6738F, 23.08F, -3.1142F, -0.0518F, 0.028F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(40, 82).mirror().addBox(-0.3073F, -0.5008F, -0.0725F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.1228F, 9.6738F, 23.08F, 2.9508F, -0.0518F, 0.028F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(114, 88).mirror().addBox(-0.3073F, -0.9294F, 2.419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1228F, 9.6738F, 23.08F, 2.7064F, -0.0518F, 0.028F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(114, 84).mirror().addBox(-0.4252F, -2.8152F, 3.1875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1228F, 9.6738F, 23.08F, 2.2259F, -0.0633F, 0.0647F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(106, 61).mirror().addBox(-0.3073F, -0.5107F, -0.0992F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1228F, 9.6738F, 23.08F, 2.8635F, -0.0518F, 0.028F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(29, 106).mirror().addBox(-0.3049F, -1.5153F, 7.7381F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6228F, 10.6738F, 33.48F, 2.9508F, -0.0518F, -0.0418F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-0.3049F, -0.8184F, 5.2226F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6228F, 10.6738F, 33.48F, 3.0381F, -0.0518F, -0.0418F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(52, 126).mirror().addBox(-0.293F, -0.1034F, -0.002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(47, 126).mirror().addBox(-0.293F, -0.1034F, -0.602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6228F, 10.6738F, 33.48F, -2.8997F, -0.0391F, -0.0433F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(114, 80).mirror().addBox(-0.3049F, -0.4157F, -0.5739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6228F, 10.6738F, 33.48F, 3.0337F, -0.0518F, -0.0418F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(121, 18).mirror().addBox(-0.5607F, -2.0717F, 0.3688F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.2893F, 8.6577F, 36.2623F, 2.714F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(123, 115).mirror().addBox(-0.5607F, -0.6017F, 0.2937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.2893F, 8.6577F, 36.2623F, 2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(114, 123).mirror().addBox(-0.5607F, 0.3152F, -1.0931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2893F, 8.6577F, 36.2623F, -2.3038F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(32, 122).mirror().addBox(-0.5F, -1.0F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.2466F, 6.0315F, 35.2359F, 1.2066F, -0.0094F, 0.1918F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(121, 90).mirror().addBox(-0.2195F, 2.8674F, 1.0433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.1023F, 3.9957F, 31.5956F, 0.683F, -0.0094F, 0.1918F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(93, 106).mirror().addBox(-0.1445F, -0.1501F, -0.2436F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, 5.4905F, 35.9286F, -0.2196F, -0.2277F, -0.5705F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(80, 57).mirror().addBox(-0.1445F, -0.1501F, -0.2436F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.1584F, 3.8896F, 31.6305F, -0.2567F, -0.2615F, -0.5614F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(95, 68).mirror().addBox(-0.2195F, -0.2501F, -0.2436F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1023F, 3.9957F, 31.5956F, -0.3642F, -0.0094F, 0.1918F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(114, 18).mirror().addBox(-0.1034F, -0.7889F, 1.6427F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0023F, 3.6957F, 27.9956F, -0.2313F, -0.0436F, 0.192F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(20, 70).mirror().addBox(-0.15F, -0.15F, -0.15F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.3836F, 3.7191F, 32.5014F, -0.1813F, 0.2027F, 0.7693F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(57, 114).mirror().addBox(-0.15F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.3692F, 3.5207F, 31.675F, -0.1558F, 0.1783F, 0.7735F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(75, 113).mirror().addBox(-0.1034F, -0.5719F, 0.0045F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0023F, 3.6957F, 27.9956F, -0.1091F, -0.0436F, 0.192F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(114, 76).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.3315F, 3.1227F, 29.5136F, -0.2238F, 0.1171F, 0.7812F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(103, 105).mirror().addBox(-0.3F, -0.3F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3315F, 3.1227F, 29.5136F, -0.0929F, 0.1171F, 0.7812F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(113, 57).mirror().addBox(-0.1034F, -0.5549F, -1.6445F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0023F, 3.6957F, 27.9956F, 0.0218F, -0.0436F, 0.192F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(116, 4).mirror().addBox(-0.15F, -1.55F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(116, 0).mirror().addBox(-0.15F, -0.85F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4831F, 5.2606F, 38.2028F, 3.0205F, 0.1447F, 0.7783F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(93, 56).mirror().addBox(-0.1034F, -0.8173F, -5.2551F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0023F, 3.6957F, 27.9956F, 0.1963F, -0.0436F, 0.192F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2854F, 2.6925F, 1.3731F, 0.7503F, -1.3301F, 0.1323F));

		PartDefinition cube_r249 = leftwing1.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(95, 74).addBox(0.0F, 0.0F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8925F, -0.548F, -0.212F, -1.1373F, 0.4249F, 0.1885F));

		PartDefinition cube_r250 = leftwing1.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(123, 45).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(8.6858F, -0.0622F, -1.3846F, -1.139F, 0.417F, 0.1845F));

		PartDefinition cube_r251 = leftwing1.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(102, 53).addBox(0.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.8925F, -0.548F, -0.212F, -1.159F, 0.2975F, 0.1274F));

		PartDefinition cube_r252 = leftwing1.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(96, 40).addBox(-0.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.391F, -0.7339F, 0.2369F, -1.1695F, 0.2013F, 0.0846F));

		PartDefinition cube_r253 = leftwing1.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(123, 15).addBox(0.025F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.7468F, -1.0001F, 0.8796F, -1.1339F, 0.4407F, 0.1966F));

		PartDefinition cube_r254 = leftwing1.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(27, 120).addBox(-0.3F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3159F, -0.6508F, 0.0364F, -1.1247F, -0.4802F, -0.2174F));

		PartDefinition cube_r255 = leftwing1.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(113, 118).addBox(0.0F, -1.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0698F, -0.8267F, 0.461F, -0.9984F, -0.7863F, -0.4279F));

		PartDefinition cube_r256 = leftwing1.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(114, 96).addBox(-0.8F, 0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5499F, -0.2644F, -0.8967F, 1.1772F, 0.0645F, 3.1148F));

		PartDefinition cube_r257 = leftwing1.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(118, 22).addBox(-1.85F, -0.925F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1161F, -0.2667F, -0.8911F, 1.095F, 0.5818F, 2.8656F));

		PartDefinition cube_r258 = leftwing1.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(126, 94).addBox(-0.925F, -2.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1518F, 0.4374F, -2.5909F, -1.1532F, 0.3375F, 0.1459F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create().texOffs(15, 79).addBox(-1.3789F, -0.0386F, -0.1429F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.1932F, 0.0533F, -3.0544F, -2.1715F, 0.1178F, -2.5794F));

		PartDefinition cube_r259 = leftwing2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(20, 85).addBox(-0.5F, -7.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1789F, 7.4614F, -0.4429F, 0.0F, 0.0F, 0.0175F));

		PartDefinition cube_r260 = leftwing2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(123, 4).addBox(-1.5824F, -5.6821F, -1.4119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.2364F, 13.3119F, 0.461F, 0.0F, -1.5708F, 0.4276F));

		PartDefinition cube_r261 = leftwing2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(118, 46).addBox(-1.5824F, -4.2336F, -0.7194F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.2364F, 13.3119F, 0.461F, 0.0F, -1.5708F, 0.6021F));

		PartDefinition cube_r262 = leftwing2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(119, 105).addBox(-1.5824F, -1.7179F, -0.5068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.2364F, 13.3119F, 0.461F, 0.0F, -1.5708F, 0.7418F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(35, 70).addBox(-1.1096F, -0.3762F, 0.049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(72, 64).addBox(-0.6096F, -0.3762F, 0.049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-1.3474F, 13.4936F, -0.2083F, 0.1071F, 0.1912F, 0.8021F));

		PartDefinition cube_r263 = leftwing3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(115, 69).addBox(-0.2F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.6096F, -0.0762F, 0.549F, 0.0F, 0.0F, -0.48F));

		PartDefinition lefthand2 = leftwing3.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(83, 12).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3512F, 13.2518F, 0.0852F, 0.0986F, -0.4328F, -0.1601F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9896F, 12.6841F, 0.573F, 1.6872F, 0.346F, -0.4793F));

		PartDefinition cube_r264 = leftwing4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(0, 0).addBox(-0.425F, -0.55F, -9.5F, 1.0F, 1.0F, 22.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3799F, -0.0164F, 8.846F, 0.0F, 0.0F, 0.6981F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(47, 0).addBox(-0.3057F, -0.7945F, -0.1036F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6421F, 0.1007F, 21.1733F, 0.2229F, 0.176F, 0.7383F));

		PartDefinition leftwing6 = leftwing5.addOrReplaceChild("leftwing6", CubeListBuilder.create().texOffs(23, 48).addBox(-0.1991F, -0.8283F, -0.087F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1201F, 0.0389F, 13.7384F, 0.2008F, 0.2885F, 0.0023F));

		PartDefinition leftwing7 = leftwing6.addOrReplaceChild("leftwing7", CubeListBuilder.create().texOffs(85, 85).addBox(-0.1F, -0.5F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.082F, -0.3354F, 8.8757F, 0.0886F, 0.2178F, 0.0078F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3569F, 2.6925F, 1.3731F, 0.3166F, 1.0216F, -0.5955F));

		PartDefinition cube_r265 = rightwing1.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(96, 23).addBox(-5.0F, 0.0F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.8925F, -0.548F, -0.212F, -1.1373F, -0.4249F, -0.1885F));

		PartDefinition cube_r266 = rightwing1.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(123, 48).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-8.6858F, -0.0622F, -1.3846F, -1.139F, -0.417F, -0.1845F));

		PartDefinition cube_r267 = rightwing1.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(0, 103).addBox(-4.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.8925F, -0.548F, -0.212F, -1.159F, -0.2975F, -0.1274F));

		PartDefinition cube_r268 = rightwing1.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(94, 97).addBox(-4.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.391F, -0.7339F, 0.2369F, -1.1695F, -0.2013F, -0.0846F));

		PartDefinition cube_r269 = rightwing1.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(20, 123).addBox(-1.025F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.7468F, -1.0001F, 0.8796F, -1.1339F, -0.4407F, -0.1966F));

		PartDefinition cube_r270 = rightwing1.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(120, 57).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3159F, -0.6508F, 0.0364F, -1.1247F, 0.4802F, 0.2174F));

		PartDefinition cube_r271 = rightwing1.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(118, 118).addBox(-1.0F, -1.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0698F, -0.8267F, 0.461F, -0.9984F, 0.7863F, 0.4279F));

		PartDefinition cube_r272 = rightwing1.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(115, 73).addBox(-1.2F, 0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.5499F, -0.2644F, -0.8967F, 1.1772F, -0.0645F, -3.1148F));

		PartDefinition cube_r273 = rightwing1.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(5, 119).addBox(-0.15F, -0.925F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1161F, -0.2667F, -0.8911F, 1.095F, -0.5818F, -2.8656F));

		PartDefinition cube_r274 = rightwing1.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(116, 126).addBox(-0.075F, -2.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1518F, 0.4374F, -2.5909F, -1.1532F, -0.3375F, -0.1459F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create().texOffs(67, 83).addBox(0.3789F, -0.0386F, -0.1429F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.1932F, 0.0533F, -3.0544F, -2.1828F, -0.2147F, 2.6475F));

		PartDefinition cube_r275 = rightwing2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(25, 85).addBox(-0.5F, -7.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1789F, 7.4614F, -0.4429F, 0.0F, 0.0F, -0.0175F));

		PartDefinition cube_r276 = rightwing2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(123, 8).addBox(0.5824F, -5.6821F, -1.4119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2364F, 13.3119F, 0.461F, 0.0F, 1.5708F, -0.4276F));

		PartDefinition cube_r277 = rightwing2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(108, 118).addBox(0.5824F, -4.2336F, -0.7194F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2364F, 13.3119F, 0.461F, 0.0F, 1.5708F, -0.6021F));

		PartDefinition cube_r278 = rightwing2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(120, 53).addBox(0.5824F, -1.7179F, -0.5068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2364F, 13.3119F, 0.461F, 0.0F, 1.5708F, -0.7418F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(78, 0).addBox(0.1096F, -0.3762F, 0.049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(78, 16).addBox(-0.3904F, -0.3762F, 0.049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(1.3474F, 13.4936F, -0.2083F, 0.081F, -0.2035F, -0.6692F));

		PartDefinition cube_r279 = rightwing3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(89, 115).addBox(-1.8F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.6096F, -0.0762F, 0.549F, 0.0F, 0.0F, 0.48F));

		PartDefinition righthand2 = rightwing3.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(83, 24).addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3512F, 13.2518F, 0.0852F, 0.0771F, 0.0279F, -0.1765F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9896F, 12.6841F, 0.573F, 1.5433F, -0.3346F, 0.3876F));

		PartDefinition cube_r280 = rightwing4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 24).addBox(-0.575F, -0.55F, -9.5F, 1.0F, 1.0F, 22.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3799F, -0.0164F, 8.846F, 0.0F, 0.0F, -0.6981F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(47, 16).addBox(-0.6943F, -0.7945F, -0.1036F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6421F, 0.1007F, 21.1733F, 0.2229F, -0.176F, -0.7383F));

		PartDefinition rightwing6 = rightwing5.addOrReplaceChild("rightwing6", CubeListBuilder.create().texOffs(44, 54).addBox(-0.8009F, -0.8283F, -0.087F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1201F, 0.0389F, 13.7384F, 0.2008F, -0.2885F, -0.0023F));

		PartDefinition rightwing7 = rightwing6.addOrReplaceChild("rightwing7", CubeListBuilder.create().texOffs(0, 87).addBox(-0.9F, -0.5F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.082F, -0.3354F, 8.8757F, 0.0886F, -0.2178F, -0.0078F));

		PartDefinition body = chest1.addOrReplaceChild("body", CubeListBuilder.create().texOffs(91, 50).addBox(-0.5357F, -0.5081F, -0.0684F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3212F, 1.9887F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r281 = body.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(53, 74).addBox(-0.0357F, -0.7778F, 0.0256F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4157F, 2.8999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r282 = body.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(53, 77).addBox(-0.0357F, -0.8656F, -0.5744F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4157F, 1.4999F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r283 = body.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(66, 97).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 3.465F, 0.2659F, 0.015F, -0.2798F));

		PartDefinition cube_r284 = body.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(116, 16).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 3.465F, 0.1798F, 0.1465F, -0.8104F));

		PartDefinition cube_r285 = body.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(96, 89).mirror().addBox(-5.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 3.465F, 0.0822F, 0.2166F, -1.3383F));

		PartDefinition cube_r286 = body.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(112, 35).mirror().addBox(-5.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 1.465F, 0.1157F, 0.3343F, -1.3814F));

		PartDefinition cube_r287 = body.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(120, 51).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 1.465F, 0.2688F, 0.2317F, -0.8459F));

		PartDefinition cube_r288 = body.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(56, 102).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 1.465F, 0.3843F, 0.045F, -0.3285F));

		PartDefinition cube_r289 = body.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(56, 102).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 1.465F, 0.3843F, -0.045F, 0.3285F));

		PartDefinition cube_r290 = body.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(120, 51).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 1.465F, 0.2688F, -0.2317F, 0.8459F));

		PartDefinition cube_r291 = body.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(112, 35).addBox(2.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 1.465F, 0.1157F, -0.3343F, 1.3814F));

		PartDefinition cube_r292 = body.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(96, 89).addBox(2.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 3.465F, 0.0822F, -0.2166F, 1.3383F));

		PartDefinition cube_r293 = body.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(116, 16).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 3.465F, 0.1798F, -0.1465F, 0.8104F));

		PartDefinition cube_r294 = body.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(66, 97).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 3.465F, 0.2659F, -0.015F, 0.2798F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1157F, 3.8999F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r295 = body2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(83, 97).addBox(-1.5161F, -2.2562F, -4.0456F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0169F, 6.9587F, 4.2819F, 0.1571F, 0.0014F, -0.0017F));

		PartDefinition cube_r296 = body2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(37, 122).mirror().addBox(-4.2026F, -1.8495F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.0746F, 0.1112F, -1.4083F));

		PartDefinition cube_r297 = body2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(127, 68).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.1703F, -0.0301F, -0.3478F));

		PartDefinition cube_r298 = body2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(121, 80).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.1201F, 0.0591F, -0.8853F));

		PartDefinition cube_r299 = body2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(121, 80).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.1201F, -0.0591F, 0.8853F));

		PartDefinition cube_r300 = body2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(127, 68).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.1703F, 0.0301F, 0.3478F));

		PartDefinition cube_r301 = body2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(37, 122).addBox(2.2026F, -1.8495F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.0746F, -0.1112F, 1.4083F));

		PartDefinition cube_r302 = body2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(20, 60).addBox(-0.0357F, 0.2076F, 1.0318F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0015F, -1.2966F, 0.0784F, -0.1396F, 0.0012F, -0.0018F));

		PartDefinition cube_r303 = body2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(104, 56).addBox(-0.5357F, 0.0076F, 0.0318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2457F, 2.9524F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r304 = body3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(44, 51).addBox(-0.0357F, -0.4924F, 2.0318F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 80).addBox(-0.0357F, -0.5924F, 0.0318F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 0).addBox(-0.5357F, 0.0076F, 0.0318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition cube_r305 = body3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(83, 6).addBox(-1.4976F, -1.3247F, -2.7646F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0362F, 5.0874F, 2.2061F, 0.4364F, 0.0014F, -0.0017F));

		PartDefinition cube_r306 = body3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(121, 103).mirror().addBox(-4.2026F, -1.8494F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.1208F, 0.2537F, -1.4839F));

		PartDefinition cube_r307 = body3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(124, 101).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.3167F, 0.0008F, -0.434F));

		PartDefinition cube_r308 = body3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(48, 121).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.2315F, 0.1598F, -0.9571F));

		PartDefinition cube_r309 = body3.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(112, 103).mirror().addBox(-3.8322F, -0.5004F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0326F, 2.4127F, 0.2611F, 0.1727F, -1.1082F));

		PartDefinition cube_r310 = body3.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(127, 51).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0326F, 2.4127F, 0.3485F, -0.0025F, -0.59F));

		PartDefinition cube_r311 = body3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(127, 51).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0326F, 2.4127F, 0.3485F, 0.0025F, 0.59F));

		PartDefinition cube_r312 = body3.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(112, 103).addBox(0.8322F, -0.5004F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0326F, 2.4127F, 0.2611F, -0.1727F, 1.1082F));

		PartDefinition cube_r313 = body3.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(48, 121).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.2315F, -0.1598F, 0.9571F));

		PartDefinition cube_r314 = body3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(124, 101).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.3167F, -0.0008F, 0.434F));

		PartDefinition cube_r315 = body3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(121, 103).addBox(2.2026F, -1.8494F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.1208F, -0.2537F, 1.4839F));

		PartDefinition body1 = body3.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0039F, 3.0424F, -0.1716F, 0.0F, 0.0F));

		PartDefinition cube_r316 = body1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(20, 63).addBox(0.0009F, -0.424F, 2.4266F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 62).addBox(0.0009F, -0.424F, 0.4266F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 59).addBox(0.0009F, -0.424F, -1.5734F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0366F, 0.0548F, 2.5255F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r317 = body1.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(127, 62).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2996F, 1.3858F, 0.2508F, 0.1423F, -0.5969F));

		PartDefinition cube_r318 = body1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(127, 64).mirror().addBox(-1.8322F, -0.5004F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2996F, 1.3858F, 0.1001F, 0.2481F, -1.1419F));

		PartDefinition cube_r319 = body1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(127, 66).mirror().addBox(-0.9711F, 0.103F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.3996F, 3.3858F, 0.1885F, 0.0943F, -0.5834F));

		PartDefinition cube_r320 = body1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(127, 70).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.3996F, 5.3858F, 0.0922F, -0.1705F, -0.3932F));

		PartDefinition cube_r321 = body1.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(127, 70).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.3996F, 5.3858F, 0.0922F, 0.1705F, 0.3932F));

		PartDefinition cube_r322 = body1.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(127, 66).addBox(-0.0289F, 0.103F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.3996F, 3.3858F, 0.1885F, -0.0943F, 0.5834F));

		PartDefinition cube_r323 = body1.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(127, 64).addBox(0.8322F, -0.5004F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2996F, 1.3858F, 0.1001F, -0.2481F, 1.1419F));

		PartDefinition cube_r324 = body1.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(127, 62).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2996F, 1.3858F, 0.2508F, -0.1423F, 0.5969F));

		PartDefinition cube_r325 = body1.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5357F, -0.1F, -2.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0723F, 2.3588F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(77, 102).addBox(-0.5357F, -0.5778F, -0.0329F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6638F, 5.9585F, 0.0497F, 0.0F, 0.0F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(70, 108).addBox(-0.2279F, -0.2807F, -0.4086F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.304F, 1.6809F, 4.0472F, 0.0816F, -0.0262F, -0.1262F));

		PartDefinition cube_r326 = leftleg1.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(91, 123).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2721F, 10.594F, 1.5019F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r327 = leftleg1.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(86, 123).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(54, 123).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, 9.766F, 0.3647F, 0.32F, 0.0219F, -0.0034F));

		PartDefinition cube_r328 = leftleg1.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(62, 120).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2721F, 7.8239F, -0.0856F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r329 = leftleg1.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(28, 115).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, 4.8403F, -0.3992F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r330 = leftleg1.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(17, 119).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, -0.5497F, -0.1292F, 0.8901F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2556F, 11.0069F, 1.6021F, 1.0924F, 0.0609F, 0.2316F));

		PartDefinition cube_r331 = leftleg2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(57, 65).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 60).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.5921F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(47, 32).addBox(-1.0F, -0.5F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5434F, 17.5344F, 1.1801F, -0.5461F, -0.1629F, -0.0365F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5279F, -0.2807F, 1.0914F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(52, 109).addBox(-0.7721F, -0.2807F, -0.4086F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.3754F, 1.6809F, 4.0472F, -0.1366F, 0.0262F, 0.1262F));

		PartDefinition cube_r332 = rightleg1.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(123, 112).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2721F, 10.594F, 1.5019F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r333 = rightleg1.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(123, 109).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(109, 123).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2721F, 9.766F, 0.3647F, 0.32F, -0.0219F, 0.0034F));

		PartDefinition cube_r334 = rightleg1.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(81, 120).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2721F, 7.8239F, -0.0856F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightleg1.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(118, 41).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2721F, 4.8403F, -0.3992F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r336 = rightleg1.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(22, 119).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2721F, -0.5497F, -0.1292F, 0.8901F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2556F, 11.0069F, 1.6021F, 1.1796F, -0.0609F, -0.2316F));

		PartDefinition cube_r337 = rightleg2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(67, 64).addBox(0.15F, -2.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 65).addBox(-0.95F, -2.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0191F, 1.5921F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(47, 43).addBox(-2.0F, -0.5F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5434F, 17.5344F, 1.1801F, -0.4588F, 0.1629F, 0.0365F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5279F, -0.2807F, 1.0914F, 0.1367F, 0.0F, 0.0F));

		PartDefinition bone2 = body1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 0.8888F, 3.5179F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r338 = bone2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(10, 123).addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -1.8379F, 1.6531F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r339 = bone2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(0, 127).addBox(-0.5F, 0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, -2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r340 = bone2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(15, 123).addBox(-0.5F, -0.9F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(44, 123).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.2199F, 2.8323F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r341 = bone2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(25, 127).addBox(-0.5F, 0.0F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r342 = bone2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(127, 59).addBox(-0.5F, -0.375F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r343 = bone2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(72, 122).addBox(-0.5F, -0.7328F, -1.2997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r344 = bone2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(96, 115).addBox(-0.8952F, -0.5051F, -0.0296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, -1.2567F, -0.3222F, 0.4341F));

		PartDefinition cube_r345 = bone2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(10, 127).addBox(-0.8952F, -1.5986F, -0.7405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(35, 127).addBox(-0.8952F, -1.9986F, -1.1405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, -2.7403F, -0.3222F, 0.4341F));

		PartDefinition cube_r346 = bone2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(111, 47).addBox(-0.8952F, -0.5233F, -2.2233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, 2.6703F, -0.3222F, 0.4341F));

		PartDefinition cube_r347 = bone2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(123, 12).addBox(-0.8952F, -0.3689F, -0.896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, 2.4608F, -0.3222F, 0.4341F));

		PartDefinition cube_r348 = bone2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(119, 30).addBox(-0.9886F, -0.7921F, -1.2523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, 2.1233F, -0.1932F, 0.2455F));

		PartDefinition cube_r349 = bone2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(124, 105).addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r350 = bone2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(124, 98).addBox(-1.7406F, -2.5459F, -4.0436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, 1.405F, 0.3054F, -0.2443F));

		PartDefinition cube_r351 = bone2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(57, 127).addBox(-1.7406F, -4.4603F, 1.2584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, 2.7576F, 0.3054F, -0.2443F));

		PartDefinition cube_r352 = bone2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(116, 12).addBox(-1.7406F, -3.2548F, 1.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, -3.1067F, 0.3054F, -0.2443F));

		PartDefinition cube_r353 = bone2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(115, 61).addBox(-1.7406F, -1.9141F, 2.0834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, -2.5831F, 0.3054F, -0.2443F));

		PartDefinition cube_r354 = bone2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(64, 116).addBox(-0.8804F, -0.7235F, 0.0139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.1686F, 1.3632F, 0.5289F, -1.3325F, -0.1932F, 0.5073F));

		PartDefinition cube_r355 = bone2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(116, 37).addBox(-0.8804F, -0.4679F, -0.0372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.1686F, 1.3632F, 0.5289F, -1.3674F, -0.1932F, 0.5073F));

		PartDefinition cube_r356 = bone2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(82, 116).addBox(-0.8804F, 0.0548F, 0.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.1686F, 1.3632F, 0.5289F, -1.507F, -0.1932F, 0.5073F));

		PartDefinition cube_r357 = bone2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(122, 73).addBox(-0.9F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.4244F, 1.024F, -0.2161F, -0.6487F, -0.0304F, -0.0149F));

		PartDefinition cube_r358 = bone2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(123, 42).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4244F, 1.024F, -0.2161F, -0.9977F, -0.0304F, -0.0149F));

		PartDefinition cube_r359 = bone2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(77, 99).addBox(-0.9886F, 0.2024F, -0.0762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, -1.027F, -0.1932F, 0.2455F));

		PartDefinition cube_r360 = bone2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(121, 76).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2847F, -0.2251F, -3.2537F, 1.5508F, -0.2606F, 0.0105F));

		PartDefinition cube_r361 = bone2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(123, 39).addBox(-0.7327F, -0.6106F, -2.641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.1047F, -0.2182F, 0.0F));

		PartDefinition cube_r362 = bone2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(111, 43).addBox(-0.5F, -0.3003F, -1.2895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.4014F, -0.0873F, 0.0F));

		PartDefinition cube_r363 = bone2.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(112, 105).addBox(-0.5F, -0.7003F, -1.8895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.0524F, -0.0873F, 0.0F));

		PartDefinition cube_r364 = bone2.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(96, 124).addBox(-0.5F, -0.9328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 0.699F, -0.0957F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r365 = bone2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(77, 124).addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r366 = bone2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(123, 36).addBox(-0.9886F, -0.1148F, -0.5722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, 0.1162F, -0.1932F, 0.2455F));

		PartDefinition bone4 = body1.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4715F, 0.8888F, 3.5179F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r367 = bone4.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(10, 123).mirror().addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8379F, 1.6531F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r368 = bone4.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(0, 127).mirror().addBox(-0.5F, 0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, -2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r369 = bone4.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(15, 123).mirror().addBox(-0.5F, -0.9F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(44, 123).mirror().addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2199F, 2.8323F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r370 = bone4.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(25, 127).mirror().addBox(-0.5F, 0.0F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r371 = bone4.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(127, 59).mirror().addBox(-0.5F, -0.375F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r372 = bone4.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(72, 122).mirror().addBox(-0.5F, -0.7328F, -1.2997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r373 = bone4.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(96, 115).mirror().addBox(-0.1048F, -0.5051F, -0.0296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, -1.2567F, 0.3222F, -0.4341F));

		PartDefinition cube_r374 = bone4.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(10, 127).mirror().addBox(-0.1048F, -1.5986F, -0.7405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(35, 127).mirror().addBox(-0.1048F, -1.9986F, -1.1405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, -2.7403F, 0.3222F, -0.4341F));

		PartDefinition cube_r375 = bone4.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(111, 47).mirror().addBox(-0.1048F, -0.5233F, -2.2233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, 2.6703F, 0.3222F, -0.4341F));

		PartDefinition cube_r376 = bone4.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(123, 12).mirror().addBox(-0.1048F, -0.3689F, -0.896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, 2.4608F, 0.3222F, -0.4341F));

		PartDefinition cube_r377 = bone4.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(119, 30).mirror().addBox(-0.0114F, -0.7921F, -1.2523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, 2.1233F, 0.1932F, -0.2455F));

		PartDefinition cube_r378 = bone4.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(124, 105).mirror().addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r379 = bone4.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(124, 98).mirror().addBox(0.7406F, -2.5459F, -4.0436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, 1.405F, -0.3054F, 0.2443F));

		PartDefinition cube_r380 = bone4.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(57, 127).mirror().addBox(0.7406F, -4.4603F, 1.2584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, 2.7576F, -0.3054F, 0.2443F));

		PartDefinition cube_r381 = bone4.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(116, 12).mirror().addBox(0.7406F, -3.2548F, 1.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, -3.1067F, -0.3054F, 0.2443F));

		PartDefinition cube_r382 = bone4.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(115, 61).mirror().addBox(0.7406F, -1.9141F, 2.0834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, -2.5831F, -0.3054F, 0.2443F));

		PartDefinition cube_r383 = bone4.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(64, 116).mirror().addBox(-0.1196F, -0.7235F, 0.0139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, 1.3632F, 0.5289F, -1.3325F, 0.1932F, -0.5073F));

		PartDefinition cube_r384 = bone4.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(116, 37).mirror().addBox(-0.1196F, -0.4679F, -0.0372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, 1.3632F, 0.5289F, -1.3674F, 0.1932F, -0.5073F));

		PartDefinition cube_r385 = bone4.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(82, 116).mirror().addBox(-0.1196F, 0.0548F, 0.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, 1.3632F, 0.5289F, -1.507F, 0.1932F, -0.5073F));

		PartDefinition cube_r386 = bone4.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(122, 73).mirror().addBox(-0.1F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(-0.4244F, 1.024F, -0.2161F, -0.6487F, 0.0304F, 0.0149F));

		PartDefinition cube_r387 = bone4.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(123, 42).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4244F, 1.024F, -0.2161F, -0.9977F, 0.0304F, 0.0149F));

		PartDefinition cube_r388 = bone4.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(77, 99).mirror().addBox(-0.0114F, 0.2024F, -0.0762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, -1.027F, 0.1932F, -0.2455F));

		PartDefinition cube_r389 = bone4.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(121, 76).mirror().addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2847F, -0.2251F, -3.2537F, 1.5508F, 0.2606F, -0.0105F));

		PartDefinition cube_r390 = bone4.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(123, 39).mirror().addBox(-0.2673F, -0.6106F, -2.641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.1047F, 0.2182F, 0.0F));

		PartDefinition cube_r391 = bone4.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(111, 43).mirror().addBox(-0.5F, -0.3003F, -1.2895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.4014F, 0.0873F, 0.0F));

		PartDefinition cube_r392 = bone4.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(112, 105).mirror().addBox(-0.5F, -0.7003F, -1.8895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.0524F, 0.0873F, 0.0F));

		PartDefinition cube_r393 = bone4.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(96, 124).mirror().addBox(-0.5F, -0.9328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.699F, -0.0957F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r394 = bone4.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(77, 124).mirror().addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r395 = bone4.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(123, 36).mirror().addBox(-0.0114F, -0.1148F, -0.5722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, 0.1162F, 0.1932F, -0.2455F));

		PartDefinition bone = chest1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.7781F, 1.2287F, 1.6873F));

		PartDefinition cube_r396 = bone.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(83, 91).addBox(-0.1F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0987F, 3.7102F, -0.2631F, 2.3056F, -0.1362F, 0.4506F));

		PartDefinition cube_r397 = bone.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(102, 48).addBox(-0.5898F, -0.0749F, -0.9806F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3908F, -0.4928F, -0.3403F, 0.3259F, 0.0876F, -0.4404F));

		PartDefinition cube_r398 = bone.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(0, 111).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.223F, -1.3716F, 3.6252F, -0.074F, 0.0851F, -0.4847F));

		PartDefinition cube_r399 = bone.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(112, 31).addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.1101F, -1.6666F, 1.7807F, 0.1005F, 0.0851F, -0.4847F));

		PartDefinition cube_r400 = bone.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(26, 111).addBox(-0.5F, 0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.0406F, -1.2335F, 0.1353F, 0.2751F, 0.0851F, -0.4847F));

		PartDefinition cube_r401 = bone.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(21, 115).addBox(-0.5768F, -0.3534F, 0.5223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.3908F, -0.4928F, -0.3403F, 0.1878F, 0.0851F, -0.4847F));

		PartDefinition cube_r402 = bone.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(116, 8).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(1.3987F, 2.4689F, -1.8713F, 0.8501F, 0.1714F, -0.4248F));

		PartDefinition cube_r403 = bone.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(125, 22).addBox(-0.5F, 0.1F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.258F, 2.4098F, -2.4714F, 2.5692F, 0.1714F, -0.4248F));

		PartDefinition cube_r404 = bone.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(94, 119).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8546F, 1.4289F, -2.2592F, -3.0158F, 0.1714F, -0.4248F));

		PartDefinition cube_r405 = bone.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(91, 111).addBox(-0.5F, -0.775F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.3219F, 0.2775F, -2.3222F, -2.7104F, 0.1714F, -0.4248F));

		PartDefinition cube_r406 = bone.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(107, 18).addBox(-0.5F, -1.05F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.3851F, 0.2797F, -1.9947F, -1.0087F, 0.1714F, -0.4248F));

		PartDefinition bone3 = chest1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.8496F, 1.2287F, 1.6873F));

		PartDefinition cube_r407 = bone3.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(83, 91).mirror().addBox(-0.9F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0987F, 3.7102F, -0.2631F, 2.3056F, 0.1362F, -0.4506F));

		PartDefinition cube_r408 = bone3.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(102, 48).mirror().addBox(-0.4102F, -0.0749F, -0.9806F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.4928F, -0.3403F, 0.3259F, -0.0876F, 0.4404F));

		PartDefinition cube_r409 = bone3.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(0, 111).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.223F, -1.3716F, 3.6252F, -0.074F, -0.0851F, 0.4847F));

		PartDefinition cube_r410 = bone3.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(112, 31).mirror().addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.1101F, -1.6666F, 1.7807F, 0.1005F, -0.0851F, 0.4847F));

		PartDefinition cube_r411 = bone3.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(26, 111).mirror().addBox(-0.5F, 0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.0406F, -1.2335F, 0.1353F, 0.2751F, -0.0851F, 0.4847F));

		PartDefinition cube_r412 = bone3.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(21, 115).mirror().addBox(-0.4232F, -0.3534F, 0.5223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.4928F, -0.3403F, 0.1878F, -0.0851F, 0.4847F));

		PartDefinition cube_r413 = bone3.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(116, 8).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-1.3987F, 2.4689F, -1.8713F, 0.8501F, -0.1714F, 0.4248F));

		PartDefinition cube_r414 = bone3.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(125, 22).mirror().addBox(-0.5F, 0.1F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.258F, 2.4098F, -2.4714F, 2.5692F, -0.1714F, 0.4248F));

		PartDefinition cube_r415 = bone3.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(94, 119).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8546F, 1.4289F, -2.2592F, -3.0158F, -0.1714F, 0.4248F));

		PartDefinition cube_r416 = bone3.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(91, 111).mirror().addBox(-0.5F, -0.775F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.3219F, 0.2775F, -2.3222F, -2.7104F, -0.1714F, 0.4248F));

		PartDefinition cube_r417 = bone3.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(107, 18).mirror().addBox(-0.5F, -1.05F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.3851F, 0.2797F, -1.9947F, -1.0087F, -0.1714F, 0.4248F));

		return LayerDefinition.create(meshdefinition, 132, 132);
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