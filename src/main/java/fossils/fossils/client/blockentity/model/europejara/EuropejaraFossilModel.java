package fossils.fossils.client.blockentity.model.europejara;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EuropejaraFossilModel extends SkullModelBase {
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
	private final ModelPart bone3;
	private final ModelPart bone;
	private final ModelPart bone4;

	public EuropejaraFossilModel(ModelPart root) {
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
		this.bone3 = this.body1.getChild("bone3");
		this.bone = this.chest1.getChild("bone");
		this.bone4 = this.chest1.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.054F, 0.9051F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0357F, -0.9945F, -4.893F, -0.1553F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(68, 91).addBox(-0.9653F, -2.9561F, -0.3946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4296F, 5.7206F, 2.5718F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(100, 64).addBox(-0.9653F, -2.3461F, -1.9402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4296F, 5.7206F, 2.5718F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(100, 61).addBox(-0.9653F, 0.4808F, -2.1438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4296F, 5.7206F, 2.5718F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r4 = chest1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(41, 95).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0357F, 7.0127F, 3.7666F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r5 = chest1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(57, 102).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0357F, 7.4133F, 5.3156F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(73, 57).addBox(-0.9653F, -1.7204F, -0.9137F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4296F, 5.7206F, 2.5718F, -1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(94, 47).addBox(-0.9653F, -0.772F, -1.7458F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4296F, 5.7206F, 2.5718F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(93, 88).mirror().addBox(-4.2026F, -1.8495F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.1137F, 0.37F, -1.5042F));

		PartDefinition cube_r9 = chest1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(93, 82).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.286F, 0.2633F, -0.9637F));

		PartDefinition cube_r10 = chest1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(73, 44).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.4144F, 0.0642F, -0.4489F));

		PartDefinition cube_r11 = chest1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(79, 84).mirror().addBox(-0.4155F, -0.711F, -1.5398F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.501F, 5.7206F, 2.5718F, -0.4188F, -0.2805F, 0.1226F));

		PartDefinition cube_r12 = chest1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(101, 29).mirror().addBox(-0.397F, -1.1983F, -0.3508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.501F, 5.7206F, 2.5718F, 0.1155F, -0.3991F, -1.134F));

		PartDefinition cube_r13 = chest1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(20, 99).mirror().addBox(-0.3842F, -0.4208F, -1.1798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.501F, 5.7206F, 2.5718F, -0.8437F, -0.5654F, -1.224F));

		PartDefinition cube_r14 = chest1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(35, 87).mirror().addBox(-1.2843F, -0.4511F, 0.293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(86, 83).mirror().addBox(-1.2843F, -0.4511F, 1.593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.501F, 5.7206F, 2.5718F, -0.2826F, 0.1758F, 0.5422F));

		PartDefinition cube_r15 = chest1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(86, 83).addBox(0.2843F, -0.4511F, 1.593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(35, 87).addBox(0.2843F, -0.4511F, 0.293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4296F, 5.7206F, 2.5718F, -0.2826F, -0.1758F, -0.5422F));

		PartDefinition cube_r16 = chest1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(68, 10).addBox(-1.4653F, -0.6898F, 0.293F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4296F, 5.7206F, 2.5718F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r17 = chest1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(20, 99).addBox(-0.6158F, -0.4208F, -1.1798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4296F, 5.7206F, 2.5718F, -0.8437F, 0.5654F, 1.224F));

		PartDefinition cube_r18 = chest1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(101, 29).addBox(-0.603F, -1.1983F, -0.3508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4296F, 5.7206F, 2.5718F, 0.1155F, 0.3991F, 1.134F));

		PartDefinition cube_r19 = chest1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(79, 84).addBox(-0.5845F, -0.711F, -1.5398F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4296F, 5.7206F, 2.5718F, -0.4188F, 0.2805F, -0.1226F));

		PartDefinition cube_r20 = chest1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(55, 72).addBox(-0.0357F, -0.9F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1684F, 1.8969F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r21 = chest1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(73, 44).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.4144F, -0.0642F, 0.4489F));

		PartDefinition cube_r22 = chest1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(93, 82).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.286F, -0.2633F, 0.9637F));

		PartDefinition cube_r23 = chest1.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(93, 88).addBox(2.2026F, -1.8495F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.1137F, -0.37F, 1.5042F));

		PartDefinition cube_r24 = chest1.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(58, 83).addBox(-0.5357F, -0.3123F, 0.6852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4212F, -0.7096F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4982F, -0.0053F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r25 = neck1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(37, 55).addBox(-0.0357F, -1.1317F, 0.0483F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4136F, -0.9511F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r26 = neck1.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(99, 26).addBox(-0.5357F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.5867F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck5 = neck1.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.9867F, -0.354F, -0.1639F, 0.0602F));

		PartDefinition cube_r27 = neck5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(41, 91).addBox(-0.0357F, -0.7F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.777F, -2.4366F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r28 = neck5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(66, 33).addBox(-0.5357F, -0.9F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck = neck5.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1858F, -2.7405F, 0.271F, -0.1307F, -0.0069F));

		PartDefinition cube_r29 = neck.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(32, 72).addBox(-0.5357F, -0.8258F, -3.0016F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1044F, -0.0591F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r30 = neck.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(63, 90).addBox(-0.0357F, -0.9F, -0.9F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3475F, -1.2722F, -0.1571F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(64, 66).addBox(-0.5357F, -0.8178F, -2.9187F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6562F, -3.0807F, -0.3464F, -0.3371F, -0.0382F));

		PartDefinition cube_r31 = neck2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(88, 22).addBox(0.0F, -0.3F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -1.3696F, -1.6769F, 0.1658F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3553F, -2.8395F, -0.1958F, -0.017F, -0.0856F));

		PartDefinition cube_r32 = neck3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(68, 57).addBox(0.0F, -1.1F, -0.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -0.2966F, -1.3168F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r33 = neck3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(28, 44).addBox(-0.5357F, -0.3F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.198F, -0.4517F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2568F, -2.9845F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r34 = neck4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(37, 96).addBox(0.0F, -0.7F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 58).addBox(0.0F, -0.5F, -1.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -1.7486F, -0.6445F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r35 = neck4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(40, 42).addBox(-0.5357F, -0.3F, -10.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -0.2033F, 5.5443F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5357F, -4.7884F, 0.5196F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.0F, -0.8551F, -3.9424F, 1.296F, -0.1557F, 0.0893F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(51, 83).addBox(-0.5F, -2.425F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5357F, 0.7102F, -3.8777F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(66, 38).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.0357F, 0.2551F, -0.697F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(14, 85).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0357F, -0.7792F, -1.6614F, 3.1067F, 0.0F, 0.0F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(40, 67).addBox(-0.5F, -0.525F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5357F, -0.2538F, -2.6102F, -3.0892F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(55, 61).addBox(-0.5F, -0.825F, 0.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5357F, 0.3831F, 0.0583F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(58, 71).addBox(-1.0F, -1.0F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0357F, -1.6944F, -1.8684F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(66, 19).addBox(-1.0F, -0.375F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -1.3056F, -3.9364F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(64, 46).addBox(-1.0F, -0.4F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0357F, -0.8148F, -3.6452F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(68, 52).addBox(-1.0F, 0.7F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(23, 68).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0357F, -4.3361F, 1.6582F, -1.885F, 0.0F, 0.0F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(53, 42).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0357F, -4.1282F, 0.68F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(46, 61).addBox(-1.0F, -1.2272F, -1.16F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -3.4815F, -0.3692F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.4856F, -11.7996F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, -0.963F, -4.1264F, -0.5978F, 0.0F, 0.0F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(91, 3).addBox(-0.5F, -2.0F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -9.4457F, -16.9991F, 1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(48, 72).addBox(-0.5F, -0.2F, -1.55F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -9.4457F, -16.9991F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(9, 70).addBox(-0.5F, -0.1441F, -1.7859F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -10.5073F, -15.0139F, 2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(23, 73).addBox(-0.5F, -2.475F, -0.875F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -1.1255F, 2.0487F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(75, 33).addBox(-0.5F, -0.975F, -0.95F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -1.1255F, 2.0487F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(76, 69).addBox(-0.5F, -0.2F, -1.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -2.1309F, 5.632F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(62, 102).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0377F, -2.3756F, 7.7306F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(72, 85).addBox(-0.5F, -2.5F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0377F, -2.4539F, 6.0222F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(101, 99).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.0377F, -2.8302F, 7.1984F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(100, 82).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.0357F, -2.1281F, 6.3376F, 3.098F, 0.0F, 0.0F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(71, 100).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -1.9469F, 7.0138F, 2.8798F, 0.0F, 0.0F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(100, 67).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -1.1907F, 6.9236F, 2.618F, 0.0F, 0.0F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(86, 99).addBox(-0.5F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.0357F, -1.5036F, 7.3088F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(90, 65).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -3.5768F, 4.5097F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(28, 55).addBox(-0.5F, -0.2F, -2.125F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.0357F, -5.2017F, 2.3534F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(7, 77).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -5.3118F, 1.9889F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(65, 76).addBox(-0.5F, -1.85F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -6.7824F, 1.3706F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(81, 99).addBox(-0.5F, -0.2352F, 1.2384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -8.6673F, -1.3981F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(94, 26).addBox(-0.5F, -1.9408F, 0.4254F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(76, 99).addBox(-0.5F, -1.5408F, -0.1746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -8.6673F, -1.3981F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(66, 99).addBox(-0.5F, -0.8556F, -0.8412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -8.6673F, -1.3981F, 2.5831F, 0.0F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(26, 90).addBox(-0.5F, -4.0267F, -0.4907F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -8.7923F, -2.2981F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(60, 76).addBox(-0.5F, -4.0267F, -0.4907F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -8.7923F, -2.2981F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(55, 76).addBox(-0.5F, -4.187F, -0.5585F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.0357F, -8.9423F, -2.2981F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(84, 4).addBox(-0.5F, -0.601F, -0.3589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.0357F, -8.9423F, -2.2981F, 2.3649F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(61, 99).addBox(-0.5F, 1.2695F, -0.2083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -8.9423F, -2.2981F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(99, 58).addBox(-0.5F, -0.026F, -2.9055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.0357F, -8.9423F, -2.2981F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(99, 55).addBox(-0.5F, -0.15F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -10.9862F, -4.7228F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(46, 55).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.0357F, -11.6709F, -3.9933F, -2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(39, 10).addBox(-0.5F, -2.85F, -0.15F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.0357F, -12.1626F, -3.9022F, 2.9583F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(77, 5).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -13.909F, -4.76F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(72, 76).addBox(-0.5F, -1.85F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -13.3974F, -2.8552F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(101, 3).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(-0.0357F, -13.9845F, -2.4739F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(94, 12).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -14.6823F, -2.5288F, -1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(100, 85).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -15.1816F, -3.0195F, -2.3649F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(10, 94).addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(-0.0357F, -15.483F, -3.6513F, 2.6965F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -15.5804F, -4.3445F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(89, 12).addBox(-0.5F, -1.8545F, -0.8256F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(-0.0357F, -13.8761F, -4.3094F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5F, 0.3745F, -1.9069F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -13.8761F, -4.3094F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(101, 6).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -12.4213F, -11.8373F, 2.0988F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(16, 68).addBox(-0.5F, -3.85F, -1.85F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0357F, -14.2299F, -8.9874F, 2.1511F, 0.0F, 0.0F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 90).addBox(-0.5F, -2.85F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -14.5693F, -8.3752F, -2.6354F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(68, 5).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -14.8762F, -7.746F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(89, 52).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -15.144F, -7.0993F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(57, 55).addBox(-0.5F, -0.85F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -15.3311F, -6.4248F, 1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(7, 86).addBox(-0.5F, -3.85F, -0.15F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -15.4706F, -5.7388F, -2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(12, 89).addBox(-0.5F, -2.7677F, -0.2206F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0357F, -8.8638F, -19.9046F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(59, 14).addBox(-0.5F, -4.4512F, -0.8665F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.159F))
				.texOffs(10, 51).addBox(-0.5F, -5.4512F, 0.7086F, 1.0F, 9.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -11.0138F, -12.3046F, -1.2217F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0009F, 0.5062F, -3.6148F, -0.0951F, -0.0006F, -0.0013F));

		PartDefinition cube_r95 = jaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(86, 75).mirror().addBox(-0.4F, -0.8529F, -1.8497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, 1.8336F, -0.0028F, -0.0046F));

		PartDefinition cube_r96 = jaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(61, 95).mirror().addBox(-0.4F, -0.1192F, -1.503F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, 0.2192F, -0.0028F, -0.0046F));

		PartDefinition cube_r97 = jaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(23, 79).mirror().addBox(-0.4412F, -0.1161F, -3.0407F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, 0.215F, -0.0377F, -0.0046F));

		PartDefinition cube_r98 = jaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.4412F, -0.0293F, -4.6989F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false)
				.texOffs(96, 3).mirror().addBox(-0.4412F, -0.0324F, -5.3356F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, 0.1888F, -0.0377F, -0.0046F));

		PartDefinition cube_r99 = jaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(80, 38).mirror().addBox(-0.5F, -1.025F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.3013F, 2.5164F, -9.0133F, 0.2107F, -0.0461F, -0.0066F));

		PartDefinition cube_r100 = jaw.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(83, 67).mirror().addBox(-0.4F, -0.1529F, -1.8501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, 1.7027F, -0.0028F, -0.0046F));

		PartDefinition cube_r101 = jaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.4938F, -1.8343F, -1.8206F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.1716F, 4.4117F, -13.4609F, 0.5072F, -0.0204F, -0.0022F));

		PartDefinition cube_r102 = jaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(31, 91).mirror().addBox(-0.4938F, -1.829F, -0.2793F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.1716F, 4.4117F, -13.4609F, 0.4723F, -0.0204F, -0.0022F));

		PartDefinition cube_r103 = jaw.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(36, 91).mirror().addBox(-0.4938F, -1.8851F, 0.132F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.1716F, 4.4117F, -13.4609F, 0.3327F, -0.0204F, -0.0022F));

		PartDefinition cube_r104 = jaw.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(80, 57).mirror().addBox(-0.5F, -0.15F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.1771F, 2.451F, -13.0994F, 1.7377F, -0.0204F, -0.0022F));

		PartDefinition cube_r105 = jaw.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(81, 19).mirror().addBox(-0.5F, -0.625F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.2194F, 3.0256F, -10.9614F, 1.8075F, -0.0204F, -0.0022F));

		PartDefinition cube_r106 = jaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(44, 78).mirror().addBox(-0.448F, -0.1797F, -1.7432F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1716F, 3.7117F, -15.5859F, 0.42F, -0.0204F, -0.0069F));

		PartDefinition cube_r107 = jaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(88, 18).mirror().addBox(-0.5F, -0.8F, -0.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.062F, 5.17F, -17.9167F, 0.228F, -0.0204F, -0.0069F));

		PartDefinition cube_r108 = jaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(5, 103).mirror().addBox(-0.4981F, -0.3682F, -0.9485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)).mirror(false), PartPose.offsetAndRotation(-0.0861F, 5.2074F, -16.4811F, -0.54F, -0.0215F, -0.0005F));

		PartDefinition cube_r109 = jaw.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(15, 103).mirror().addBox(-0.4981F, -0.4315F, -1.3731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.0861F, 5.2074F, -16.4811F, -0.4091F, -0.0215F, -0.0005F));

		PartDefinition cube_r110 = jaw.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(46, 93).mirror().addBox(-0.4981F, -1.333F, -0.3757F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.0861F, 5.2074F, -16.4811F, -0.6709F, -0.0215F, -0.0005F));

		PartDefinition cube_r111 = jaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(79, 74).mirror().addBox(-0.5015F, -1.3973F, -0.2195F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.0861F, 5.2074F, -16.4811F, -0.8018F, -0.0203F, 0.0043F));

		PartDefinition cube_r112 = jaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(73, 63).mirror().addBox(-0.5F, -1.75F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1349F, 6.5537F, -14.3734F, -0.8891F, -0.0206F, -0.0019F));

		PartDefinition cube_r113 = jaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.4002F, -0.3028F, -1.2874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, 2.3921F, -0.0029F, -0.0021F));

		PartDefinition cube_r114 = jaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(103, 20).mirror().addBox(-0.4002F, -1.7166F, 0.1551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, -1.5785F, -0.0029F, -0.0021F));

		PartDefinition cube_r115 = jaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(103, 23).mirror().addBox(-0.4002F, -1.8583F, -0.0383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, -2.1893F, -0.0029F, -0.0021F));

		PartDefinition cube_r116 = jaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(40, 103).mirror().addBox(-0.4001F, -0.4657F, -2.4038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, 2.6976F, -0.0029F, -0.0021F));

		PartDefinition cube_r117 = jaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(101, 102).mirror().addBox(-0.4001F, 1.1216F, -2.2802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, 2.0431F, -0.0029F, -0.0021F));

		PartDefinition cube_r118 = jaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(25, 103).mirror().addBox(-0.4001F, -2.0472F, -1.8048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, -2.8438F, -0.0029F, -0.0021F));

		PartDefinition cube_r119 = jaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(77, 88).mirror().addBox(-0.4002F, -1.3774F, 0.938F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, -1.369F, -0.0029F, -0.0021F));

		PartDefinition cube_r120 = jaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(86, 79).mirror().addBox(-0.4414F, 0.8898F, -3.3521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, 0.228F, -0.0378F, -0.0021F));

		PartDefinition cube_r121 = jaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(22, 63).mirror().addBox(-0.4414F, 0.9125F, -5.9001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, 0.2193F, -0.0378F, -0.0021F));

		PartDefinition cube_r122 = jaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(75, 19).mirror().addBox(-0.4717F, -1.373F, -0.0186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.2396F, 4.8001F, -10.8079F, 0.8303F, -0.0459F, -0.0082F));

		PartDefinition cube_r123 = jaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(41, 72).mirror().addBox(-0.5F, -0.15F, -1.15F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.2216F, 5.7913F, -10.9248F, -1.8314F, -0.0248F, 0.0003F));

		PartDefinition cube_r124 = jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(72, 46).mirror().addBox(-0.4847F, -0.6473F, -0.675F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.2396F, 4.8001F, -10.8079F, -2.1805F, -0.0248F, 0.0003F));

		PartDefinition cube_r125 = jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(77, 52).mirror().addBox(-0.4717F, -1.8731F, -0.1186F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.2723F, 4.7687F, -10.1023F, 0.647F, -0.0459F, -0.0082F));

		PartDefinition cube_r126 = jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(37, 78).mirror().addBox(-0.4717F, -0.1731F, -0.1185F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.282F, 2.7492F, -10.2493F, 0.4725F, -0.0459F, -0.0082F));

		PartDefinition cube_r127 = jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(80, 62).mirror().addBox(-0.4717F, -0.173F, -0.1186F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.3578F, 1.9761F, -8.7371F, 0.3416F, -0.0459F, -0.0082F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(65, 81).mirror().addBox(-0.4717F, -0.173F, -0.1186F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.4359F, 1.4072F, -7.1371F, 0.2718F, -0.0459F, -0.0082F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(5, 96).mirror().addBox(-0.4412F, -0.2134F, -6.0366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(14, 80).mirror().addBox(-0.4412F, -0.2134F, -7.7366F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.6971F, -0.1149F, -0.9967F, 0.2237F, -0.0377F, -0.0046F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-0.5F, -0.15F, -1.15F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.2185F, 6.2745F, -11.0536F, -1.526F, -0.0248F, 0.0003F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(59, 7).mirror().addBox(-0.5F, -0.15F, -1.75F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.2194F, 6.8738F, -11.0267F, -0.9675F, -0.0248F, 0.0003F));

		PartDefinition cube_r132 = jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(99, 49).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.2351F, 7.7797F, -10.4028F, 0.2542F, -0.0248F, 0.0003F));

		PartDefinition cube_r133 = jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(17, 93).mirror().addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.2397F, 8.4571F, -10.2268F, 1.1269F, -0.0248F, 0.0003F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(86, 43).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.2324F, 9.0893F, -10.5273F, 2.2614F, -0.0248F, 0.0003F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(93, 22).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.2191F, 9.5352F, -11.0667F, -2.8873F, -0.0248F, 0.0003F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(65, 86).mirror().addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.2024F, 9.7113F, -11.744F, -1.622F, -0.0248F, 0.0003F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(99, 52).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.185F, 9.6755F, -12.4429F, -0.313F, -0.0248F, 0.0003F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(86, 71).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.1684F, 9.4599F, -13.1087F, 0.9611F, -0.0248F, 0.0003F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(93, 43).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.1541F, 9.0591F, -13.6824F, 2.3574F, -0.0248F, 0.0003F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(30, 77).mirror().addBox(-0.5F, -0.15F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.1416F, 8.5647F, -14.1778F, -2.4859F, -0.0248F, 0.0003F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(72, 46).addBox(-0.5153F, -0.6473F, -0.675F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.17F, 4.8001F, -10.8079F, -2.1805F, 0.0248F, -0.0003F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(30, 77).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.072F, 8.5647F, -14.1778F, -2.4859F, 0.0248F, -0.0003F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(93, 43).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.0845F, 9.0591F, -13.6824F, 2.3574F, 0.0248F, -0.0003F));

		PartDefinition cube_r144 = jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(86, 71).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0988F, 9.4599F, -13.1087F, 0.9611F, 0.0248F, -0.0003F));

		PartDefinition cube_r145 = jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(99, 52).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.1154F, 9.6755F, -12.4429F, -0.313F, 0.0248F, -0.0003F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(65, 86).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.1328F, 9.7113F, -11.744F, -1.622F, 0.0248F, -0.0003F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(93, 22).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.1495F, 9.5352F, -11.0667F, -2.8873F, 0.0248F, -0.0003F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(86, 43).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.1628F, 9.0893F, -10.5273F, 2.2614F, 0.0248F, -0.0003F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(17, 93).addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.1701F, 8.4571F, -10.2268F, 1.1269F, 0.0248F, -0.0003F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(99, 49).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.1655F, 7.7797F, -10.4028F, 0.2542F, 0.0248F, -0.0003F));

		PartDefinition cube_r151 = jaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(59, 7).addBox(-0.5F, -0.15F, -1.75F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.1498F, 6.8738F, -11.0267F, -0.9675F, 0.0248F, -0.0003F));

		PartDefinition cube_r152 = jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(73, 38).addBox(-0.5F, -0.15F, -1.15F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.1489F, 6.2745F, -11.0536F, -1.526F, 0.0248F, -0.0003F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(41, 72).addBox(-0.5F, -0.15F, -1.15F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.152F, 5.7913F, -10.9248F, -1.8314F, 0.0248F, -0.0003F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(65, 81).addBox(-0.5283F, -0.173F, -0.1186F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.3663F, 1.4072F, -7.1371F, 0.2718F, 0.0459F, 0.0082F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(80, 62).addBox(-0.5283F, -0.173F, -0.1186F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.2882F, 1.9761F, -8.7371F, 0.3416F, 0.0459F, 0.0082F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(37, 78).addBox(-0.5283F, -0.1731F, -0.1185F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.2124F, 2.7492F, -10.2493F, 0.4725F, 0.0459F, 0.0082F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(77, 52).addBox(-0.5283F, -1.8731F, -0.1186F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.2027F, 4.7687F, -10.1023F, 0.647F, 0.0459F, 0.0082F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(75, 19).addBox(-0.5283F, -1.373F, -0.0186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.17F, 4.8001F, -10.8079F, 0.8303F, 0.0459F, 0.0082F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(22, 63).addBox(-0.5586F, 0.9125F, -5.9001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, 0.2193F, 0.0378F, 0.0021F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(86, 79).addBox(-0.5586F, 0.8898F, -3.3521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, 0.228F, 0.0378F, 0.0021F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(77, 88).addBox(-0.5998F, -1.3774F, 0.938F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, -1.369F, 0.0029F, 0.0021F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(25, 103).addBox(-0.5999F, -2.0472F, -1.8048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, -2.8438F, 0.0029F, 0.0021F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(101, 102).addBox(-0.5999F, 1.1216F, -2.2802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, 2.0431F, 0.0029F, 0.0021F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(40, 103).addBox(-0.5999F, -0.4657F, -2.4038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, 2.6976F, 0.0029F, 0.0021F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(103, 23).addBox(-0.5998F, -1.8583F, -0.0383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, -2.1893F, 0.0029F, 0.0021F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(103, 20).addBox(-0.5998F, -1.7166F, 0.1551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, -1.5785F, 0.0029F, 0.0021F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(0, 99).addBox(-0.5998F, -0.3028F, -1.2874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, 2.3921F, 0.0029F, 0.0021F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(73, 63).addBox(-0.5F, -1.75F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0653F, 6.5537F, -14.3734F, -0.8891F, 0.0206F, 0.0019F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(79, 74).addBox(-0.4985F, -1.3973F, -0.2195F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.0165F, 5.2074F, -16.4811F, -0.8018F, 0.0203F, -0.0043F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(46, 93).addBox(-0.5019F, -1.333F, -0.3757F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.0165F, 5.2074F, -16.4811F, -0.6709F, 0.0215F, 0.0005F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(15, 103).addBox(-0.5019F, -0.4315F, -1.3731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0165F, 5.2074F, -16.4811F, -0.4091F, 0.0215F, 0.0005F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(5, 103).addBox(-0.5019F, -0.3682F, -0.9485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(0.0165F, 5.2074F, -16.4811F, -0.54F, 0.0215F, 0.0005F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(88, 18).addBox(-0.5F, -0.8F, -0.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0076F, 5.17F, -17.9167F, 0.228F, 0.0204F, 0.0069F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(44, 78).addBox(-0.5521F, -0.1797F, -1.7432F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.102F, 3.7117F, -15.5859F, 0.42F, 0.0204F, 0.0069F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(81, 19).addBox(-0.5F, -0.625F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.1498F, 3.0256F, -10.9614F, 1.8075F, 0.0204F, 0.0022F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(80, 57).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.1075F, 2.451F, -13.0994F, 1.7377F, 0.0204F, 0.0022F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(36, 91).addBox(-0.5062F, -1.8851F, 0.132F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.102F, 4.4117F, -13.4609F, 0.3327F, 0.0204F, 0.0022F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(31, 91).addBox(-0.5062F, -1.829F, -0.2793F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.102F, 4.4117F, -13.4609F, 0.4723F, 0.0204F, 0.0022F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5062F, -1.8343F, -1.8206F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.102F, 4.4117F, -13.4609F, 0.5072F, 0.0204F, 0.0022F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(83, 67).addBox(-0.6F, -0.1529F, -1.8501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, 1.7027F, 0.0028F, 0.0046F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(80, 38).addBox(-0.5F, -1.025F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.2317F, 2.5164F, -9.0133F, 0.2107F, 0.0461F, 0.0066F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(14, 80).addBox(-0.5588F, -0.2134F, -7.7366F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F))
				.texOffs(5, 96).addBox(-0.5588F, -0.2134F, -6.0366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, 0.2237F, 0.0377F, 0.0046F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(96, 3).addBox(-0.5588F, -0.0324F, -5.3356F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(0, 81).addBox(-0.5588F, -0.0293F, -4.6989F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, 0.1888F, 0.0377F, 0.0046F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(23, 79).addBox(-0.5588F, -0.1161F, -3.0407F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, 0.215F, 0.0377F, 0.0046F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(61, 95).addBox(-0.6F, -0.1192F, -1.503F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, 0.2192F, 0.0028F, 0.0046F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(86, 75).addBox(-0.6F, -0.8529F, -1.8497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.6275F, -0.1149F, -0.9967F, 1.8336F, 0.0028F, 0.0046F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3693F, -10.615F, -35.8902F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(21, 84).addBox(-0.4483F, -0.1541F, -1.2322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1069F)), PartPose.offsetAndRotation(0.2983F, 8.4229F, 35.1532F, 1.5359F, -0.0261F, -0.0023F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(22, 95).addBox(-0.4483F, -0.581F, 0.2137F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.2983F, 8.4229F, 35.1532F, 0.3142F, -0.0261F, -0.0023F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(47, 100).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1069F)), PartPose.offsetAndRotation(0.3138F, 9.3331F, 36.6208F, -0.5585F, -0.0261F, -0.0023F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(81, 102).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.2935F, 8.6547F, 37.0341F, -1.7802F, -0.0261F, -0.0023F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(42, 100).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1069F)), PartPose.offsetAndRotation(0.2922F, 7.8712F, 37.207F, -2.7227F, -0.0261F, -0.0023F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(93, 95).addBox(-0.4483F, -1.6245F, -1.2488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.2983F, 8.4229F, 35.1532F, 1.6057F, -0.0261F, -0.0023F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(84, 8).addBox(-0.4483F, -0.5719F, -0.9266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.2983F, 8.4229F, 35.1532F, -3.063F, -0.0261F, -0.0023F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(25, 100).addBox(-0.3983F, -0.0106F, -1.1364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(100, 17).addBox(-0.7233F, -0.0106F, -1.1364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.2983F, 8.4229F, 35.1532F, 2.7315F, -0.0261F, -0.0023F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(76, 102).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.2999F, 7.1429F, 36.8857F, 2.8711F, -0.0261F, -0.0023F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(67, 71).addBox(-0.5F, -0.3F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.55F, 9.7801F, 36.2332F, 0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(15, 100).addBox(-0.5F, -0.356F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.55F, 10.1652F, 36.0273F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(100, 14).addBox(-0.5F, -0.1705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(5, 100).addBox(-0.5F, -0.4705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(95, 16).addBox(-0.5F, -2.2705F, -0.5535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(35, 102).addBox(-0.5F, -0.8705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.55F, 10.1652F, 36.0273F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(66, 28).addBox(-0.5F, -0.4968F, -3.6557F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.0916F, 2.5655F, 20.4126F, -0.1947F, -0.0009F, -0.0671F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(66, 14).addBox(-0.5F, -1.0057F, -2.382F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F))
				.texOffs(65, 23).addBox(-0.5F, -0.4057F, -2.482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0916F, 2.5655F, 20.4126F, -0.2995F, -0.0009F, -0.0671F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(75, 28).addBox(-0.5F, -1.4327F, 0.0988F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.0916F, 2.5655F, 20.4126F, -0.3867F, -0.0009F, -0.0671F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(28, 86).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2084F, 4.3612F, 24.7347F, -0.6136F, -0.0009F, -0.0671F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.1474F, 3.4319F, 23.1943F, -0.5438F, -0.0009F, -0.0671F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(79, 44).addBox(-0.5F, -1.5973F, 1.0713F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0916F, 2.5655F, 20.4126F, -0.474F, -0.0009F, -0.0671F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(98, 93).addBox(-0.9064F, -8.6342F, -0.4665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.8725F, 7.8891F, 30.6963F, 1.0618F, 0.0026F, -0.067F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(99, 11).addBox(-0.9064F, -1.1506F, 7.0335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8725F, 7.8891F, 30.6963F, 2.5453F, 0.0026F, -0.067F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(98, 96).addBox(-0.5F, -0.6F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1692F, 3.7447F, 23.9337F, 1.6988F, 0.0026F, -0.067F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(82, 14).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1692F, 3.7447F, 23.9337F, 1.8734F, 0.0026F, -0.067F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(7, 82).addBox(-0.9064F, -3.3413F, 5.7274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8725F, 7.8891F, 30.6963F, 2.2224F, 0.0026F, -0.067F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, -0.45F, -7.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3359F, 5.8856F, 26.1574F, 2.541F, -0.0123F, -0.0601F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(64, 41).addBox(-0.8856F, -1.5804F, 4.436F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8725F, 7.8891F, 30.6963F, 2.4843F, 0.0021F, -0.07F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(30, 102).addBox(-0.4483F, 0.5904F, 0.9548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1069F)), PartPose.offsetAndRotation(0.2909F, 8.3919F, 35.2029F, -2.1118F, -0.0261F, -0.0023F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(20, 102).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3739F, 7.9827F, 33.969F, -0.8203F, -0.0261F, -0.0023F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(102, 0).addBox(-0.4483F, -1.4337F, -1.0031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1069F)), PartPose.offsetAndRotation(0.2825F, 8.5841F, 35.4643F, 0.5934F, -0.0261F, -0.0023F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(96, 99).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3356F, 7.2142F, 35.3687F, 1.981F, -0.0261F, -0.0023F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 102).addBox(-0.4483F, 0.3867F, -1.2883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1069F)), PartPose.offsetAndRotation(0.2847F, 8.5555F, 35.4543F, -2.7838F, -0.0261F, -0.0023F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(102, 88).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1055F, 0.773F, 24.9627F, -1.1596F, 0.0134F, -0.0977F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(86, 102).addBox(-0.4731F, 7.7912F, -7.4543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4034F, 4.8219F, 35.2891F, -1.2468F, 0.0134F, -0.0977F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(74, 23).addBox(-0.4731F, 10.3732F, 3.3679F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4034F, 4.8219F, 35.2891F, -2.2068F, 0.0134F, -0.0977F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(30, 82).addBox(-0.4731F, 9.0391F, 5.3256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4034F, 4.8219F, 35.2891F, -2.4686F, 0.0134F, -0.0977F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(82, 91).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0922F, 0.4351F, 26.5755F, -1.4037F, 0.0083F, -0.0983F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(5, 92).addBox(-0.5F, 0.3503F, -0.6462F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0551F, 0.6878F, 28.0445F, -1.5084F, 0.0083F, -0.0983F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(93, 78).addBox(-0.5F, -0.3918F, -0.2893F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0737F, 0.4465F, 28.6702F, -1.6306F, 0.0083F, -0.0983F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(91, 8).addBox(-0.5F, -2.3551F, -0.6599F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0551F, 0.6878F, 28.0445F, -1.7702F, 0.0083F, -0.0983F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(93, 74).addBox(-0.4731F, -1.6563F, -0.4612F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4034F, 4.8219F, 35.2891F, -2.5906F, -0.0049F, -0.068F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5F, -1.156F, -0.4868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4721F, 5.6146F, 35.1251F, 2.8632F, 0.0215F, -0.0605F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(91, 99).addBox(-0.5F, -0.2506F, -0.8466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4721F, 5.6146F, 35.1251F, 2.9068F, 0.0215F, -0.0605F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(66, 95).addBox(-0.5F, -0.8506F, -0.5466F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4721F, 5.6146F, 35.1251F, 3.0814F, 0.0215F, -0.0605F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(89, 47).addBox(-1.1F, -1.9F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(89, 27).addBox(-0.7F, -1.925F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.558F, 4.1066F, 35.0472F, -2.3869F, 0.7225F, 0.4662F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(95, 63).addBox(-0.4731F, -0.2813F, -0.4612F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4034F, 4.8219F, 35.2891F, -2.5907F, 0.0134F, -0.0977F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(73, 93).addBox(-1.1F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(93, 70).addBox(-0.7F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4402F, 3.0222F, 34.1933F, -2.1134F, 0.6106F, 0.6493F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(88, 95).addBox(-0.4731F, 1.0404F, -0.7756F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4034F, 4.8219F, 35.2891F, -2.3638F, 0.0134F, -0.0977F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(56, 93).addBox(-0.7F, -1.05F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3363F, 2.106F, 33.149F, -2.0177F, 0.4941F, 0.665F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(94, 59).addBox(-0.4731F, 2.3441F, -1.1521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4034F, 4.8219F, 35.2891F, -2.2242F, 0.0134F, -0.0977F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(51, 93).addBox(-0.7F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2541F, 1.4328F, 31.9478F, -1.8368F, 0.2667F, 0.6369F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(94, 55).addBox(-0.4731F, 3.3457F, -2.2328F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4034F, 4.8219F, 35.2891F, -1.945F, 0.0134F, -0.0977F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(79, 79).addBox(-0.4752F, -1.0299F, -0.2858F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0272F, 1.9373F, 23.2867F, 0.912F, 0.0346F, -0.1222F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(75, 14).addBox(-0.4752F, -0.9405F, -2.012F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(0.0272F, 1.9373F, 23.2867F, 1.4356F, 0.0346F, -0.1222F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(31, 63).addBox(-1.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6726F, 7.7461F, 37.8777F, -1.2715F, 0.7885F, 0.2192F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(10, 101).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6781F, 6.2789F, 37.5659F, -0.7802F, 0.2565F, 0.9841F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(94, 35).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(94, 39).addBox(-1.2F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6947F, 5.9698F, 36.615F, -1.7674F, 0.2473F, 0.9414F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(9, 63).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.0337F, 2.0543F, 22.3458F, 1.2611F, 0.0346F, -0.1222F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(87, 91).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0578F, 1.5833F, 31.195F, -1.945F, 0.0134F, -0.0977F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2979F, -10.615F, -35.8902F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(21, 84).mirror().addBox(-0.5517F, -0.1541F, -1.2322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1069F)).mirror(false), PartPose.offsetAndRotation(-0.2983F, 8.4229F, 35.1532F, 1.5359F, 0.0261F, 0.0023F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(22, 95).mirror().addBox(-0.5517F, -0.581F, 0.2137F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.2983F, 8.4229F, 35.1532F, 0.3142F, 0.0261F, 0.0023F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(47, 100).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1069F)).mirror(false), PartPose.offsetAndRotation(-0.3138F, 9.3331F, 36.6208F, -0.5585F, 0.0261F, 0.0023F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(81, 102).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.2935F, 8.6547F, 37.0341F, -1.7802F, 0.0261F, 0.0023F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(42, 100).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1069F)).mirror(false), PartPose.offsetAndRotation(-0.2922F, 7.8712F, 37.207F, -2.7227F, 0.0261F, 0.0023F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(93, 95).mirror().addBox(-0.5517F, -1.6245F, -1.2488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.2983F, 8.4229F, 35.1532F, 1.6057F, 0.0261F, 0.0023F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(84, 8).mirror().addBox(-0.5517F, -0.5719F, -0.9266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.2983F, 8.4229F, 35.1532F, -3.063F, 0.0261F, 0.0023F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(25, 100).mirror().addBox(-0.6017F, -0.0106F, -1.1364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(100, 17).mirror().addBox(-0.2767F, -0.0106F, -1.1364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2983F, 8.4229F, 35.1532F, 2.7315F, 0.0261F, 0.0023F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(76, 102).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.2999F, 7.1429F, 36.8857F, 2.8711F, 0.0261F, 0.0023F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(-0.5F, -0.3F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 9.7801F, 36.2332F, 0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(15, 100).mirror().addBox(-0.5F, -0.356F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 10.1652F, 36.0273F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(100, 14).mirror().addBox(-0.5F, -0.1705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(5, 100).mirror().addBox(-0.5F, -0.4705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(95, 16).mirror().addBox(-0.5F, -2.2705F, -0.5535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(35, 102).mirror().addBox(-0.5F, -0.8705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 10.1652F, 36.0273F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(66, 28).mirror().addBox(-0.5F, -0.4968F, -3.6557F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.0916F, 2.5655F, 20.4126F, -0.1947F, 0.0009F, 0.0671F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(66, 14).mirror().addBox(-0.5F, -1.0057F, -2.382F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(65, 23).mirror().addBox(-0.5F, -0.4057F, -2.482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.0916F, 2.5655F, 20.4126F, -0.2995F, 0.0009F, 0.0671F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(75, 28).mirror().addBox(-0.5F, -1.4327F, 0.0988F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.0916F, 2.5655F, 20.4126F, -0.3867F, 0.0009F, 0.0671F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(28, 86).mirror().addBox(-0.5F, -0.1F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2084F, 4.3612F, 24.7347F, -0.6136F, 0.0009F, 0.0671F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5F, -0.1F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.1474F, 3.4319F, 23.1943F, -0.5438F, 0.0009F, 0.0671F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(79, 44).mirror().addBox(-0.5F, -1.5973F, 1.0713F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.0916F, 2.5655F, 20.4126F, -0.474F, 0.0009F, 0.0671F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(98, 93).mirror().addBox(-0.0936F, -8.6342F, -0.4665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.8725F, 7.8891F, 30.6963F, 1.0618F, -0.0026F, 0.067F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(99, 11).mirror().addBox(-0.0936F, -1.1506F, 7.0335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8725F, 7.8891F, 30.6963F, 2.5453F, -0.0026F, 0.067F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(98, 96).mirror().addBox(-0.5F, -0.6F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1692F, 3.7447F, 23.9337F, 1.6988F, -0.0026F, 0.067F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(82, 14).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1692F, 3.7447F, 23.9337F, 1.8734F, -0.0026F, 0.067F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(7, 82).mirror().addBox(-0.0936F, -3.3413F, 5.7274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8725F, 7.8891F, 30.6963F, 2.2224F, -0.0026F, 0.067F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-0.5F, -0.45F, -7.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3359F, 5.8856F, 26.1574F, 2.541F, 0.0123F, 0.0601F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(64, 41).mirror().addBox(-0.1144F, -1.5804F, 4.436F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8725F, 7.8891F, 30.6963F, 2.4843F, -0.0021F, 0.07F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(30, 102).mirror().addBox(-0.5517F, 0.5904F, 0.9548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1069F)).mirror(false), PartPose.offsetAndRotation(-0.2909F, 8.3919F, 35.2029F, -2.1118F, 0.0261F, 0.0023F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(20, 102).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3739F, 7.9827F, 33.969F, -0.8203F, 0.0261F, 0.0023F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(-0.5517F, -1.4337F, -1.0031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1069F)).mirror(false), PartPose.offsetAndRotation(-0.2825F, 8.5841F, 35.4643F, 0.5934F, 0.0261F, 0.0023F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(96, 99).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3356F, 7.2142F, 35.3687F, 1.981F, 0.0261F, 0.0023F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.5517F, 0.3867F, -1.2883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1069F)).mirror(false), PartPose.offsetAndRotation(-0.2847F, 8.5555F, 35.4543F, -2.7838F, 0.0261F, 0.0023F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(102, 88).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1055F, 0.773F, 24.9627F, -1.1596F, -0.0134F, 0.0977F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(86, 102).mirror().addBox(-0.5269F, 7.7912F, -7.4543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4034F, 4.8219F, 35.2891F, -1.2468F, -0.0134F, 0.0977F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(74, 23).mirror().addBox(-0.5269F, 10.3732F, 3.3679F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.4034F, 4.8219F, 35.2891F, -2.2068F, -0.0134F, 0.0977F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(30, 82).mirror().addBox(-0.5269F, 9.0391F, 5.3256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4034F, 4.8219F, 35.2891F, -2.4686F, -0.0134F, 0.0977F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(82, 91).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0922F, 0.4351F, 26.5755F, -1.4037F, -0.0083F, 0.0983F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(5, 92).mirror().addBox(-0.5F, 0.3503F, -0.6462F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0551F, 0.6878F, 28.0445F, -1.5084F, -0.0083F, 0.0983F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(93, 78).mirror().addBox(-0.5F, -0.3918F, -0.2893F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0737F, 0.4465F, 28.6702F, -1.6306F, -0.0083F, 0.0983F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(91, 8).mirror().addBox(-0.5F, -2.3551F, -0.6599F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0551F, 0.6878F, 28.0445F, -1.7702F, -0.0083F, 0.0983F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(93, 74).mirror().addBox(-0.5269F, -1.6563F, -0.4612F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4034F, 4.8219F, 35.2891F, -2.5906F, 0.0049F, 0.068F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.5F, -1.156F, -0.4868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4721F, 5.6146F, 35.1251F, 2.8632F, -0.0215F, 0.0605F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(91, 99).mirror().addBox(-0.5F, -0.2506F, -0.8466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4721F, 5.6146F, 35.1251F, 2.9068F, -0.0215F, 0.0605F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(66, 95).mirror().addBox(-0.5F, -0.8506F, -0.5466F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4721F, 5.6146F, 35.1251F, 3.0814F, -0.0215F, 0.0605F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(89, 47).mirror().addBox(0.1F, -1.9F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 27).mirror().addBox(-0.3F, -1.925F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.558F, 4.1066F, 35.0472F, -2.3869F, -0.7225F, -0.4662F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(95, 63).mirror().addBox(-0.5269F, -0.2813F, -0.4612F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4034F, 4.8219F, 35.2891F, -2.5907F, -0.0134F, 0.0977F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(73, 93).mirror().addBox(0.1F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(93, 70).mirror().addBox(-0.3F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4402F, 3.0222F, 34.1933F, -2.1134F, -0.6106F, -0.6493F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(88, 95).mirror().addBox(-0.5269F, 1.0404F, -0.7756F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4034F, 4.8219F, 35.2891F, -2.3638F, -0.0134F, 0.0977F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(56, 93).mirror().addBox(-0.3F, -1.05F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3363F, 2.106F, 33.149F, -2.0177F, -0.4941F, -0.665F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(94, 59).mirror().addBox(-0.5269F, 2.3441F, -1.1521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4034F, 4.8219F, 35.2891F, -2.2242F, -0.0134F, 0.0977F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(51, 93).mirror().addBox(-0.3F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2541F, 1.4328F, 31.9478F, -1.8368F, -0.2667F, -0.6369F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(94, 55).mirror().addBox(-0.5269F, 3.3457F, -2.2328F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4034F, 4.8219F, 35.2891F, -1.945F, -0.0134F, 0.0977F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(79, 79).mirror().addBox(-0.5248F, -1.0299F, -0.2858F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.0272F, 1.9373F, 23.2867F, 0.912F, -0.0346F, 0.1222F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(75, 14).mirror().addBox(-0.5248F, -0.9405F, -2.012F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-0.0272F, 1.9373F, 23.2867F, 1.4356F, -0.0346F, 0.1222F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(31, 63).mirror().addBox(0.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6726F, 7.7461F, 37.8777F, -1.2715F, -0.7885F, -0.2192F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(10, 101).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6781F, 6.2789F, 37.5659F, -0.7802F, -0.2565F, -0.9841F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(94, 35).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(94, 39).mirror().addBox(0.2F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6947F, 5.9698F, 36.615F, -1.7674F, -0.2473F, -0.9414F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(9, 63).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-0.0337F, 2.0543F, 22.3458F, 1.2611F, -0.0346F, 0.1222F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(87, 91).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0578F, 1.5833F, 31.195F, -1.945F, -0.0134F, 0.0977F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2854F, 1.964F, 0.8541F, -0.5446F, -0.2974F, -0.1754F));

		PartDefinition cube_r301 = leftwing1.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(89, 32).addBox(0.1F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8925F, -0.548F, -0.212F, -1.1373F, 0.4249F, 0.1885F));

		PartDefinition cube_r302 = leftwing1.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(98, 79).addBox(-2.8F, 0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(8.6858F, -0.0623F, -1.3846F, -1.139F, 0.417F, 0.1845F));

		PartDefinition cube_r303 = leftwing1.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(87, 40).addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.8925F, -0.548F, -0.212F, -1.159F, 0.2975F, 0.1274F));

		PartDefinition cube_r304 = leftwing1.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(59, 49).addBox(-2.5F, -0.7F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.3435F, -0.5682F, -0.1631F, -1.1611F, 0.2815F, 0.1201F));

		PartDefinition cube_r305 = leftwing1.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(97, 90).addBox(0.125F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.7468F, -1.0001F, 0.8796F, -1.1339F, 0.4407F, 0.1966F));

		PartDefinition cube_r306 = leftwing1.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(32, 99).addBox(-0.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3159F, -0.6509F, 0.0364F, -1.1767F, -0.0806F, -0.0335F));

		PartDefinition cube_r307 = leftwing1.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(83, 95).addBox(-0.1F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0698F, -0.8267F, 0.461F, -0.879F, -0.9275F, -0.5853F));

		PartDefinition cube_r308 = leftwing1.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(90, 0).addBox(-0.7F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.746F, -0.6893F, 0.1293F, 1.0483F, 0.6968F, 2.7876F));

		PartDefinition cube_r309 = leftwing1.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(99, 33).addBox(-1.225F, -2.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1518F, 0.4374F, -2.5909F, -1.1532F, 0.3375F, 0.1459F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create().texOffs(23, 44).addBox(-1.3789F, -0.0386F, -0.1429F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.421F, 0.1216F, -1.5663F, -1.8452F, 0.8126F, 2.8681F));

		PartDefinition cube_r310 = leftwing2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(41, 49).addBox(-0.5F, -7.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1789F, 7.4614F, -0.4429F, 0.0F, 0.0F, 0.0175F));

		PartDefinition cube_r311 = leftwing2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(96, 102).addBox(-0.5F, -1.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(96, 7).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0153F, 7.9884F, -0.6215F, 0.0F, -1.5708F, 0.384F));

		PartDefinition cube_r312 = leftwing2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(21, 88).addBox(-1.5824F, -3.2336F, -0.5694F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.1636F, 11.5119F, 0.461F, 0.0F, -1.5708F, 0.2531F));

		PartDefinition cube_r313 = leftwing2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(98, 73).addBox(-1.5824F, -0.7179F, -0.5068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.1636F, 11.5119F, 0.461F, 0.0F, -1.5708F, 0.3927F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(54, 10).addBox(-1.1096F, 0.6238F, 0.049F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(17, 51).addBox(-0.6096F, 0.6238F, 0.049F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.2319F, 11.5657F, -0.1906F, -0.1135F, 0.0825F, 0.4156F));

		PartDefinition cube_r314 = leftwing3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(81, 24).addBox(-0.2F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.6096F, 0.9238F, 0.549F, 0.0F, 0.0F, -0.48F));

		PartDefinition lefthand2 = leftwing3.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(28, 49).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0596F, 11.2678F, 0.3805F, -1.6453F, 0.091F, -0.248F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8355F, 10.7323F, 0.6226F, 1.6858F, -0.0127F, -2.8752F));

		PartDefinition cube_r315 = leftwing4.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(0, 0).addBox(-0.425F, -0.55F, -9.5F, 1.0F, 1.0F, 18.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3799F, -0.0164F, 8.846F, 0.0F, 0.0F, 0.6981F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(27, 20).addBox(-0.3057F, -0.7945F, -0.1036F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6304F, 0.1112F, 17.265F, 0.2673F, 0.2266F, 0.5677F));

		PartDefinition leftwing6 = leftwing5.addOrReplaceChild("leftwing6", CubeListBuilder.create().texOffs(21, 34).addBox(-0.1991F, -0.8283F, -0.087F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1438F, 0.0503F, 11.7254F, 0.2819F, 0.1054F, -0.0148F));

		PartDefinition leftwing7 = leftwing6.addOrReplaceChild("leftwing7", CubeListBuilder.create().texOffs(54, 23).addBox(0.0972F, -0.5773F, -0.9998F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.082F, -0.3354F, 8.8757F, 0.0886F, 0.2178F, 0.0078F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3569F, 1.964F, 0.8541F, -0.2869F, 0.2486F, 0.6182F));

		PartDefinition cube_r316 = rightwing1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(89, 32).mirror().addBox(-2.1F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8925F, -0.548F, -0.212F, -1.1373F, -0.4249F, -0.1885F));

		PartDefinition cube_r317 = rightwing1.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(98, 79).mirror().addBox(1.8F, 0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-8.6858F, -0.0623F, -1.3846F, -1.139F, -0.417F, -0.1845F));

		PartDefinition cube_r318 = rightwing1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(87, 40).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8925F, -0.548F, -0.212F, -1.159F, -0.2975F, -0.1274F));

		PartDefinition cube_r319 = rightwing1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(59, 49).mirror().addBox(-2.5F, -0.7F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.3435F, -0.5682F, -0.1631F, -1.1611F, -0.2815F, -0.1201F));

		PartDefinition cube_r320 = rightwing1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(97, 90).mirror().addBox(-1.125F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.7468F, -1.0001F, 0.8796F, -1.1339F, -0.4407F, -0.1966F));

		PartDefinition cube_r321 = rightwing1.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(32, 99).mirror().addBox(-0.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3159F, -0.6509F, 0.0364F, -1.1767F, 0.0806F, 0.0335F));

		PartDefinition cube_r322 = rightwing1.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(83, 95).mirror().addBox(-0.9F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0698F, -0.8267F, 0.461F, -0.879F, 0.9275F, 0.5853F));

		PartDefinition cube_r323 = rightwing1.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-1.3F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.746F, -0.6893F, 0.1293F, 1.0483F, -0.6968F, -2.7876F));

		PartDefinition cube_r324 = rightwing1.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(99, 33).mirror().addBox(0.225F, -2.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.1518F, 0.4374F, -2.5909F, -1.1532F, -0.3375F, -0.1459F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create().texOffs(23, 44).mirror().addBox(0.3789F, -0.0386F, -0.1429F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.421F, 0.0216F, -1.5663F, -1.5808F, -1.1923F, -2.9866F));

		PartDefinition cube_r325 = rightwing2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(41, 49).mirror().addBox(-0.5F, -7.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1789F, 7.4614F, -0.4429F, 0.0F, 0.0F, -0.0175F));

		PartDefinition cube_r326 = rightwing2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(96, 102).mirror().addBox(-0.5F, -1.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(96, 7).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0153F, 7.9884F, -0.6215F, 0.0F, 1.5708F, -0.384F));

		PartDefinition cube_r327 = rightwing2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(21, 88).mirror().addBox(0.5824F, -3.2336F, -0.5694F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.1636F, 11.5119F, 0.461F, 0.0F, 1.5708F, -0.2531F));

		PartDefinition cube_r328 = rightwing2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(98, 73).mirror().addBox(0.5824F, -0.7179F, -0.5068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.1636F, 11.5119F, 0.461F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(54, 10).mirror().addBox(0.1096F, 0.6238F, 0.049F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(17, 51).mirror().addBox(-0.3904F, 0.6238F, 0.049F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(0.2319F, 11.5657F, -0.1906F, -0.133F, -0.0447F, -0.1119F));

		PartDefinition cube_r329 = rightwing3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(81, 24).mirror().addBox(-1.8F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.6096F, 0.9238F, 0.549F, 0.0F, 0.0F, 0.48F));

		PartDefinition righthand2 = rightwing3.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(28, 49).mirror().addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0596F, 11.2678F, -0.0195F, -1.9581F, -0.4602F, 0.3172F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8355F, 10.7323F, 0.2226F, 1.7544F, -0.5297F, 2.7762F));

		PartDefinition cube_r330 = rightwing4.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.575F, -0.55F, -9.5F, 1.0F, 1.0F, 18.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3799F, -0.0164F, 8.846F, 0.0F, 0.0F, -0.6981F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(27, 20).mirror().addBox(-0.6943F, -0.7945F, -0.1036F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6304F, 0.1112F, 17.265F, 0.2654F, -0.1636F, -0.6823F));

		PartDefinition rightwing6 = rightwing5.addOrReplaceChild("rightwing6", CubeListBuilder.create().texOffs(21, 34).mirror().addBox(-0.8009F, -0.8283F, -0.087F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1438F, 0.0503F, 11.7254F, 0.1965F, -0.2029F, 0.0154F));

		PartDefinition rightwing7 = rightwing6.addOrReplaceChild("rightwing7", CubeListBuilder.create().texOffs(54, 23).mirror().addBox(-1.0972F, -0.5773F, -0.9998F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.082F, -0.3354F, 8.8757F, 0.0886F, -0.2178F, -0.0078F));

		PartDefinition body = chest1.addOrReplaceChild("body", CubeListBuilder.create().texOffs(55, 29).addBox(-0.5357F, -0.5081F, -0.0684F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3212F, 1.9887F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r331 = body.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(17, 89).addBox(-0.0357F, -1.0778F, 0.0256F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4157F, 2.8999F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r332 = body.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(76, 0).addBox(-0.0357F, -1.0656F, -1.5744F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4157F, 1.4999F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r333 = body.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(82, 36).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 3.465F, 0.4002F, 0.0533F, -0.2752F));

		PartDefinition cube_r334 = body.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(46, 91).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 3.465F, 0.2789F, 0.2468F, -0.791F));

		PartDefinition cube_r335 = body.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(59, 52).mirror().addBox(-5.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 3.465F, 0.1164F, 0.3523F, -1.3287F));

		PartDefinition cube_r336 = body.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(79, 49).mirror().addBox(-5.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 1.465F, 0.1336F, 0.42F, -1.3748F));

		PartDefinition cube_r337 = body.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(53, 91).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 1.465F, 0.3293F, 0.2966F, -0.8301F));

		PartDefinition cube_r338 = body.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(84, 12).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0377F, 1.465F, 0.4671F, 0.073F, -0.3236F));

		PartDefinition cube_r339 = body.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(84, 12).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 1.465F, 0.4671F, -0.073F, 0.3236F));

		PartDefinition cube_r340 = body.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(53, 91).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 1.465F, 0.3293F, -0.2966F, 0.8301F));

		PartDefinition cube_r341 = body.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(79, 49).addBox(2.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 1.465F, 0.1336F, -0.42F, 1.3748F));

		PartDefinition cube_r342 = body.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(59, 52).addBox(2.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 3.465F, 0.1164F, -0.3523F, 1.3287F));

		PartDefinition cube_r343 = body.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(46, 91).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 3.465F, 0.2789F, -0.2468F, 0.791F));

		PartDefinition cube_r344 = body.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(82, 36).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0377F, 3.465F, 0.4002F, -0.0533F, 0.2752F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1157F, 3.8999F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r345 = body2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(103, 72).mirror().addBox(-3.2026F, -1.8495F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.1294F, 0.4209F, -1.3937F));

		PartDefinition cube_r346 = body2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(103, 74).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.4659F, 0.0768F, -0.3409F));

		PartDefinition cube_r347 = body2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(93, 86).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.3263F, 0.2994F, -0.8481F));

		PartDefinition cube_r348 = body2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(93, 86).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.3263F, -0.2994F, 0.8481F));

		PartDefinition cube_r349 = body2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(103, 74).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.4659F, -0.0768F, 0.3409F));

		PartDefinition cube_r350 = body2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(103, 72).addBox(2.2026F, -1.8495F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.1294F, -0.4209F, 1.3937F));

		PartDefinition cube_r351 = body2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(37, 44).addBox(-0.0357F, -1.0924F, -0.7182F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0024F, -0.2539F, 1.7496F, -0.0523F, 0.0012F, -0.0018F));

		PartDefinition cube_r352 = body2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(49, 67).addBox(-0.5357F, 0.0076F, 0.0318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2457F, 2.9524F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r353 = body3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(37, 59).addBox(-0.0357F, -1.1924F, 0.0318F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 83).addBox(-0.5357F, 0.0076F, 0.0318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition cube_r354 = body3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(46, 49).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0352F, 5.3677F, -0.1205F, 0.2618F, 0.0014F, -0.0017F));

		PartDefinition cube_r355 = body3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(101, 9).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.5392F, 0.1027F, -0.4224F));

		PartDefinition cube_r356 = body3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(93, 84).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.3807F, 0.3572F, -0.9187F));

		PartDefinition cube_r357 = body3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(102, 91).mirror().addBox(-1.8322F, -0.5004F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0326F, 2.4127F, 0.2611F, 0.1727F, -1.1082F));

		PartDefinition cube_r358 = body3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(50, 103).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0326F, 2.4127F, 0.3485F, -0.0025F, -0.59F));

		PartDefinition cube_r359 = body3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(50, 103).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0326F, 2.4127F, 0.3485F, 0.0025F, 0.59F));

		PartDefinition cube_r360 = body3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(102, 91).addBox(0.8322F, -0.5004F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0326F, 2.4127F, 0.2611F, -0.1727F, 1.1082F));

		PartDefinition cube_r361 = body3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(93, 84).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.3807F, -0.3572F, 0.9187F));

		PartDefinition cube_r362 = body3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(101, 9).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.5392F, -0.1027F, 0.4224F));

		PartDefinition body1 = body3.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, 2.0442F, -0.1279F, 0.0F, 0.0F));

		PartDefinition cube_r363 = body1.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(82, 88).addBox(0.0F, 0.5F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 71).addBox(0.003F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0387F, -0.7141F, 5.0089F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r364 = body1.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(51, 78).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0387F, -1.0231F, 4.0579F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r365 = body1.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(0, 58).addBox(0.0009F, -1.124F, -3.5734F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0366F, 0.0548F, 3.5255F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r366 = body1.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(67, 103).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2996F, 2.3859F, 0.2508F, 0.1423F, -0.5969F));

		PartDefinition cube_r367 = body1.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(103, 70).mirror().addBox(-0.9711F, 0.103F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.3996F, 4.3859F, 0.1885F, 0.0943F, -0.5834F));

		PartDefinition cube_r368 = body1.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(103, 70).addBox(-0.0289F, 0.103F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.3996F, 4.3859F, 0.1885F, -0.0943F, 0.5834F));

		PartDefinition cube_r369 = body1.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(67, 103).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2996F, 2.3859F, 0.2508F, -0.1423F, 0.5969F));

		PartDefinition cube_r370 = body1.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(40, 34).addBox(-0.5357F, -0.1F, -3.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0723F, 3.3588F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(10, 44).addBox(-0.5357F, -0.5778F, -0.0329F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6441F, 5.9475F, -0.1034F, 0.3039F, -0.031F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(84, 51).addBox(-0.2279F, -0.2807F, -0.4086F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.2515F, 1.0239F, 3.8786F, 0.5545F, 0.2295F, -1.1644F));

		PartDefinition cube_r371 = leftleg1.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(99, 46).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2721F, 7.194F, 1.0519F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r372 = leftleg1.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(99, 39).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(37, 99).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, 6.366F, -0.0853F, 0.32F, 0.0219F, -0.0034F));

		PartDefinition cube_r373 = leftleg1.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(99, 36).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2721F, 5.8239F, -0.1857F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r374 = leftleg1.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(92, 91).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, 3.8403F, -0.3992F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r375 = leftleg1.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(40, 63).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, -0.5497F, -0.1292F, 0.8901F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9668F, 7.8188F, 0.9541F, 0.9178F, 0.0609F, 0.2316F));

		PartDefinition cube_r376 = leftleg2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(5, 43).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 43).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.5921F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -0.5F, -7.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6888F, 12.9944F, 1.0558F, 0.7187F, 0.1795F, -0.1046F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5279F, -0.2807F, 1.0914F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(84, 51).mirror().addBox(-0.7721F, -0.2807F, -0.4086F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.323F, 1.0239F, 3.8786F, 0.8603F, -0.3369F, 0.9984F));

		PartDefinition cube_r377 = rightleg1.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(99, 46).mirror().addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2721F, 7.194F, 1.0519F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r378 = rightleg1.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(99, 39).mirror().addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(37, 99).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2721F, 6.366F, -0.0853F, 0.32F, -0.0219F, 0.0034F));

		PartDefinition cube_r379 = rightleg1.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(99, 36).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2721F, 5.8239F, -0.1857F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r380 = rightleg1.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(92, 91).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2721F, 3.8403F, -0.3992F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r381 = rightleg1.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(40, 63).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2721F, -0.5497F, -0.1292F, 0.8901F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9668F, 7.8188F, 0.9541F, 0.6997F, -0.0609F, -0.2316F));

		PartDefinition cube_r382 = rightleg2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(5, 43).mirror().addBox(0.15F, -2.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 43).mirror().addBox(-0.95F, -2.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0191F, 1.5921F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-2.0F, -0.5F, -7.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6888F, 12.9944F, 1.0558F, 0.5029F, -0.0939F, 0.0874F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5279F, -0.2807F, 1.0914F, 0.1367F, 0.0F, 0.0F));

		PartDefinition bone2 = body1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 0.2518F, 3.2086F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r383 = bone2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(27, 96).addBox(-0.5F, -0.8194F, -1.0406F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -0.383F, 1.4186F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r384 = bone2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(15, 97).addBox(-0.5F, 0.4929F, -0.4354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.383F, 1.4186F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r385 = bone2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(98, 20).addBox(-0.5F, -0.9962F, 0.8545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(91, 102).addBox(-0.5F, -0.9962F, 0.5545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.383F, 1.4186F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r386 = bone2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(98, 70).addBox(-0.5F, -0.212F, -0.4243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, -0.383F, 1.4186F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r387 = bone2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(45, 103).addBox(-0.5F, -0.3714F, -0.1321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.383F, 1.4186F, -3.098F, 0.0F, 0.0F));

		PartDefinition cube_r388 = bone2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(58, 67).addBox(-0.5F, -2.0298F, -0.3249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -0.383F, 1.4186F, 2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r389 = bone2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(71, 97).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-1.0691F, 1.8976F, 2.0865F, -2.4348F, -0.3222F, 0.4341F));

		PartDefinition cube_r390 = bone2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(86, 87).addBox(-0.8952F, -0.5051F, -0.0296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.025F, 1.1002F, 1.3661F, -1.2567F, -0.3222F, 0.4341F));

		PartDefinition cube_r391 = bone2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(10, 98).addBox(-0.8952F, -1.5986F, -0.7405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.025F, 1.1002F, 1.3661F, -2.7403F, -0.3222F, 0.4341F));

		PartDefinition cube_r392 = bone2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(37, 83).addBox(-0.8952F, -0.5233F, -1.9233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.025F, 1.1002F, 1.3661F, 2.6703F, -0.3222F, 0.4341F));

		PartDefinition cube_r393 = bone2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(56, 97).addBox(-0.8952F, -0.3689F, -0.896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.025F, 1.1002F, 1.3661F, 2.4608F, -0.3222F, 0.4341F));

		PartDefinition cube_r394 = bone2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(16, 64).addBox(-0.9886F, -0.7922F, -1.2523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, 2.1233F, -0.1932F, 0.2455F));

		PartDefinition cube_r395 = bone2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(32, 96).addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r396 = bone2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(52, 100).addBox(-0.5F, -0.5728F, -0.7496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1672F, 4.429F, -1.1353F, 2.0501F, 0.3884F, -0.0179F));

		PartDefinition cube_r397 = bone2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(103, 42).addBox(-0.5F, -0.8173F, 0.045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.1672F, 4.429F, -1.1353F, -2.8804F, 0.3884F, -0.0179F));

		PartDefinition cube_r398 = bone2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(87, 36).addBox(-0.5F, -0.4202F, -0.7769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.1672F, 4.429F, -1.1353F, -2.4615F, 0.3884F, -0.0179F));

		PartDefinition cube_r399 = bone2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(83, 0).addBox(-0.5F, -0.7544F, -1.577F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.1672F, 4.429F, -1.1353F, -1.9379F, 0.3884F, -0.0179F));

		PartDefinition cube_r400 = bone2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(87, 57).addBox(-0.8804F, -0.7235F, 0.0139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.1686F, 1.3632F, 0.5289F, -1.3325F, -0.1932F, 0.5073F));

		PartDefinition cube_r401 = bone2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(56, 87).addBox(-0.5F, -0.95F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F))
				.texOffs(49, 87).addBox(-0.5F, -0.45F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.6463F, 1.9965F, 0.6158F, -1.9346F, -0.1932F, 0.5073F));

		PartDefinition cube_r402 = bone2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(87, 61).addBox(-0.8804F, 0.0548F, 0.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.1686F, 1.3632F, 0.5289F, -1.507F, -0.1932F, 0.5073F));

		PartDefinition cube_r403 = bone2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(51, 97).addBox(-0.9F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.4244F, 1.024F, -0.2161F, -0.6487F, -0.0304F, -0.0149F));

		PartDefinition cube_r404 = bone2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(98, 43).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4244F, 1.024F, -0.2161F, -0.9977F, -0.0304F, -0.0149F));

		PartDefinition cube_r405 = bone2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(46, 97).addBox(-0.9886F, 0.2024F, -0.0762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, -1.027F, -0.1932F, 0.2455F));

		PartDefinition cube_r406 = bone2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(78, 95).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2847F, -0.2251F, -3.2536F, 1.5508F, -0.2606F, 0.0105F));

		PartDefinition cube_r407 = bone2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(95, 67).addBox(-0.7327F, -0.6106F, -2.641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.1047F, -0.2182F, 0.0F));

		PartDefinition cube_r408 = bone2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(32, 68).addBox(-0.5F, -0.3003F, -1.2895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.4014F, -0.0873F, 0.0F));

		PartDefinition cube_r409 = bone2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(77, 10).addBox(-0.5F, -0.7003F, -1.8895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.0524F, -0.0873F, 0.0F));

		PartDefinition cube_r410 = bone2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(97, 0).addBox(-0.5F, -0.9329F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 0.699F, -0.0956F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r411 = bone2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(96, 30).addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r412 = bone2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(98, 23).addBox(-0.9886F, -0.1148F, -0.5722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, 0.1162F, -0.1932F, 0.2455F));

		PartDefinition bone3 = body1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4715F, 0.2518F, 3.2086F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r413 = bone3.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(27, 96).mirror().addBox(-0.5F, -0.8194F, -1.0406F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.383F, 1.4186F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r414 = bone3.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(15, 97).mirror().addBox(-0.5F, 0.4929F, -0.4354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.383F, 1.4186F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r415 = bone3.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(98, 20).mirror().addBox(-0.5F, -0.9962F, 0.8545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(91, 102).mirror().addBox(-0.5F, -0.9962F, 0.5545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.383F, 1.4186F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r416 = bone3.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(98, 70).mirror().addBox(-0.5F, -0.212F, -0.4243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.383F, 1.4186F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r417 = bone3.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(45, 103).mirror().addBox(-0.5F, -0.3714F, -0.1321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.383F, 1.4186F, -3.098F, 0.0F, 0.0F));

		PartDefinition cube_r418 = bone3.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(58, 67).mirror().addBox(-0.5F, -2.0298F, -0.3249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.383F, 1.4186F, 2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r419 = bone3.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(71, 97).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(1.0691F, 1.8976F, 2.0865F, -2.4348F, 0.3222F, -0.4341F));

		PartDefinition cube_r420 = bone3.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(86, 87).mirror().addBox(-0.1048F, -0.5051F, -0.0296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1002F, 1.3661F, -1.2567F, 0.3222F, -0.4341F));

		PartDefinition cube_r421 = bone3.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(10, 98).mirror().addBox(-0.1048F, -1.5986F, -0.7405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1002F, 1.3661F, -2.7403F, 0.3222F, -0.4341F));

		PartDefinition cube_r422 = bone3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(37, 83).mirror().addBox(-0.1048F, -0.5233F, -1.9233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1002F, 1.3661F, 2.6703F, 0.3222F, -0.4341F));

		PartDefinition cube_r423 = bone3.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(56, 97).mirror().addBox(-0.1048F, -0.3689F, -0.896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1002F, 1.3661F, 2.4608F, 0.3222F, -0.4341F));

		PartDefinition cube_r424 = bone3.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(16, 64).mirror().addBox(-0.0114F, -0.7922F, -1.2523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, 2.1233F, 0.1932F, -0.2455F));

		PartDefinition cube_r425 = bone3.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(32, 96).mirror().addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r426 = bone3.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(52, 100).mirror().addBox(-0.5F, -0.5728F, -0.7496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1672F, 4.429F, -1.1353F, 2.0501F, -0.3884F, 0.0179F));

		PartDefinition cube_r427 = bone3.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(103, 42).mirror().addBox(-0.5F, -0.8173F, 0.045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.1672F, 4.429F, -1.1353F, -2.8804F, -0.3884F, 0.0179F));

		PartDefinition cube_r428 = bone3.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(87, 36).mirror().addBox(-0.5F, -0.4202F, -0.7769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.1672F, 4.429F, -1.1353F, -2.4615F, -0.3884F, 0.0179F));

		PartDefinition cube_r429 = bone3.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-0.5F, -0.7544F, -1.577F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.1672F, 4.429F, -1.1353F, -1.9379F, -0.3884F, 0.0179F));

		PartDefinition cube_r430 = bone3.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(87, 57).mirror().addBox(-0.1196F, -0.7235F, 0.0139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, 1.3632F, 0.5289F, -1.3325F, 0.1932F, -0.5073F));

		PartDefinition cube_r431 = bone3.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(56, 87).mirror().addBox(-0.5F, -0.95F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)).mirror(false)
				.texOffs(49, 87).mirror().addBox(-0.5F, -0.45F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.6463F, 1.9965F, 0.6158F, -1.9346F, 0.1932F, -0.5073F));

		PartDefinition cube_r432 = bone3.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(87, 61).mirror().addBox(-0.1196F, 0.0548F, 0.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, 1.3632F, 0.5289F, -1.507F, 0.1932F, -0.5073F));

		PartDefinition cube_r433 = bone3.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(51, 97).mirror().addBox(-0.1F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(-0.4244F, 1.024F, -0.2161F, -0.6487F, 0.0304F, 0.0149F));

		PartDefinition cube_r434 = bone3.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(98, 43).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4244F, 1.024F, -0.2161F, -0.9977F, 0.0304F, 0.0149F));

		PartDefinition cube_r435 = bone3.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(46, 97).mirror().addBox(-0.0114F, 0.2024F, -0.0762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, -1.027F, 0.1932F, -0.2455F));

		PartDefinition cube_r436 = bone3.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(78, 95).mirror().addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2847F, -0.2251F, -3.2536F, 1.5508F, 0.2606F, -0.0105F));

		PartDefinition cube_r437 = bone3.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(95, 67).mirror().addBox(-0.2673F, -0.6106F, -2.641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.1047F, 0.2182F, 0.0F));

		PartDefinition cube_r438 = bone3.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(32, 68).mirror().addBox(-0.5F, -0.3003F, -1.2895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.4014F, 0.0873F, 0.0F));

		PartDefinition cube_r439 = bone3.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(77, 10).mirror().addBox(-0.5F, -0.7003F, -1.8895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.0524F, 0.0873F, 0.0F));

		PartDefinition cube_r440 = bone3.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-0.5F, -0.9329F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.699F, -0.0956F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r441 = bone3.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(96, 30).mirror().addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r442 = bone3.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(98, 23).mirror().addBox(-0.0114F, -0.1148F, -0.5722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, 0.1162F, 0.1932F, -0.2455F));

		PartDefinition bone = chest1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7781F, 0.6275F, 1.6612F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r443 = bone.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(55, 35).addBox(-0.1F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0987F, 3.7102F, -0.2631F, 2.3056F, -0.1362F, 0.4506F));

		PartDefinition cube_r444 = bone.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(64, 61).addBox(-0.5898F, -0.0749F, -0.9806F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3908F, -0.4928F, -0.3403F, 0.3259F, 0.0876F, -0.4404F));

		PartDefinition cube_r445 = bone.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.1101F, -1.6666F, 1.7807F, 0.1005F, 0.0851F, -0.4847F));

		PartDefinition cube_r446 = bone.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(72, 81).addBox(-0.5F, 0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.0406F, -1.2335F, 0.1353F, 0.2751F, 0.0851F, -0.4847F));

		PartDefinition cube_r447 = bone.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(82, 28).addBox(-0.5768F, -0.3534F, 0.5223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.3908F, -0.4928F, -0.3403F, 0.1878F, 0.0851F, -0.4847F));

		PartDefinition cube_r448 = bone.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(42, 87).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(1.3987F, 2.4689F, -1.8713F, 0.8501F, 0.1714F, -0.4248F));

		PartDefinition cube_r449 = bone.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(98, 76).addBox(-0.5F, 0.1F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.258F, 2.4098F, -2.4714F, 2.5692F, 0.1714F, -0.4248F));

		PartDefinition cube_r450 = bone.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(94, 51).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8546F, 1.4288F, -2.2592F, -3.0158F, 0.1714F, -0.4248F));

		PartDefinition cube_r451 = bone.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(82, 32).addBox(-0.5F, -0.775F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.3219F, 0.2775F, -2.3222F, -2.7104F, 0.1714F, -0.4248F));

		PartDefinition cube_r452 = bone.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(16, 75).addBox(-0.5F, -1.05F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.3851F, 0.2797F, -1.9947F, -1.0087F, 0.1714F, -0.4248F));

		PartDefinition bone4 = chest1.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8496F, 0.6275F, 1.6612F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r453 = bone4.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(55, 35).mirror().addBox(-0.9F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0987F, 3.7102F, -0.2631F, 2.3056F, 0.1362F, -0.4506F));

		PartDefinition cube_r454 = bone4.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(64, 61).mirror().addBox(-0.4102F, -0.0749F, -0.9806F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.4928F, -0.3403F, 0.3259F, -0.0876F, 0.4404F));

		PartDefinition cube_r455 = bone4.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.1101F, -1.6666F, 1.7807F, 0.1005F, -0.0851F, 0.4847F));

		PartDefinition cube_r456 = bone4.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(72, 81).mirror().addBox(-0.5F, 0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.0406F, -1.2335F, 0.1353F, 0.2751F, -0.0851F, 0.4847F));

		PartDefinition cube_r457 = bone4.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(82, 28).mirror().addBox(-0.4232F, -0.3534F, 0.5223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.4928F, -0.3403F, 0.1878F, -0.0851F, 0.4847F));

		PartDefinition cube_r458 = bone4.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(42, 87).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-1.3987F, 2.4689F, -1.8713F, 0.8501F, -0.1714F, 0.4248F));

		PartDefinition cube_r459 = bone4.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(98, 76).mirror().addBox(-0.5F, 0.1F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.258F, 2.4098F, -2.4714F, 2.5692F, -0.1714F, 0.4248F));

		PartDefinition cube_r460 = bone4.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(94, 51).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8546F, 1.4288F, -2.2592F, -3.0158F, -0.1714F, 0.4248F));

		PartDefinition cube_r461 = bone4.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(82, 32).mirror().addBox(-0.5F, -0.775F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.3219F, 0.2775F, -2.3222F, -2.7104F, -0.1714F, 0.4248F));

		PartDefinition cube_r462 = bone4.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(16, 75).mirror().addBox(-0.5F, -1.05F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.3851F, 0.2797F, -1.9947F, -1.0087F, -0.1714F, 0.4248F));

		return LayerDefinition.create(meshdefinition, 108, 108);
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