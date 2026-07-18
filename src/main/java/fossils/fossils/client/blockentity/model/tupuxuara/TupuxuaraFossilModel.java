package fossils.fossils.client.blockentity.model.tupuxuara;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TupuxuaraFossilModel extends SkullModelBase {
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
	private final ModelPart bone3;
	private final ModelPart bone;
	private final ModelPart bone4;

	public TupuxuaraFossilModel(ModelPart root) {
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
		this.bone3 = this.body1.getChild("bone3");
		this.bone = this.chest1.getChild("bone");
		this.bone4 = this.chest1.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.054F, 0.9051F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create().texOffs(19, 87).addBox(-0.0357F, -1.1684F, 0.8969F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0357F, -11.1722F, 4.6311F, -0.5202F, 0.0435F, 0.0757F));

		PartDefinition cube_r1 = chest1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(140, 4).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0357F, 7.7546F, 0.7431F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(143, 140).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0357F, 8.0546F, 1.2628F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(74, 141).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0357F, 8.2099F, 1.8423F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = chest1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(134, 16).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0357F, 8.1785F, 4.0378F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r5 = chest1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(81, 132).addBox(-0.5F, -1.8F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0357F, 8.2622F, 2.44F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(93, 140).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0357F, 8.2622F, 2.44F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(131, 103).mirror().addBox(-5.2026F, -1.8494F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.1137F, 0.37F, -1.5042F));

		PartDefinition cube_r8 = chest1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(116, 89).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.286F, 0.2633F, -0.9637F));

		PartDefinition cube_r9 = chest1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(44, 83).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.4144F, 0.0642F, -0.4489F));

		PartDefinition cube_r10 = chest1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(121, 137).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0357F, 6.627F, 3.8225F, -0.0549F, -0.305F, 0.0165F));

		PartDefinition cube_r11 = chest1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(143, 118).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6177F, 7.22F, 2.7939F, 0.2612F, -0.0797F, -1.169F));

		PartDefinition cube_r12 = chest1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(124, 143).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6177F, 7.22F, 2.7939F, -0.7239F, -0.234F, -1.2713F));

		PartDefinition cube_r13 = chest1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 123).mirror().addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0357F, 7.5908F, 5.7698F, 0.0147F, -0.0094F, 0.5672F));

		PartDefinition cube_r14 = chest1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 123).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9643F, 7.5908F, 5.7698F, 0.0147F, 0.0094F, -0.5672F));

		PartDefinition cube_r15 = chest1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(85, 114).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0357F, 7.6257F, 3.7701F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r16 = chest1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(124, 143).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5463F, 7.22F, 2.7939F, -0.7239F, 0.234F, 1.2713F));

		PartDefinition cube_r17 = chest1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(143, 118).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5463F, 7.22F, 2.7939F, 0.2612F, 0.0797F, 1.169F));

		PartDefinition cube_r18 = chest1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(121, 137).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9643F, 6.627F, 3.8225F, -0.0549F, 0.305F, -0.0165F));

		PartDefinition cube_r19 = chest1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 83).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.4144F, -0.0642F, 0.4489F));

		PartDefinition cube_r20 = chest1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(116, 89).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.286F, -0.2633F, 0.9637F));

		PartDefinition cube_r21 = chest1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(131, 103).addBox(2.2026F, -1.8494F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.1137F, -0.37F, 1.5042F));

		PartDefinition cube_r22 = chest1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(7, 134).addBox(-0.5357F, -0.3123F, 0.6852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4212F, -0.7096F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4982F, -0.0053F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r23 = neck1.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 100).addBox(-0.0357F, -0.7317F, -1.0517F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7555F, 0.1133F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r24 = neck1.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(143, 143).addBox(-0.5357F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.5867F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck5 = neck1.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.9867F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r25 = neck5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(27, 131).addBox(-0.0357F, -2.1F, -3.8F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(120, 35).addBox(-0.5357F, -0.9F, -4.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck = neck5.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3014F, -3.7199F, 0.2271F, 0.0425F, 0.0098F));

		PartDefinition cube_r26 = neck.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(120, 41).addBox(-0.5357F, -0.8259F, -4.0016F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3956F, -0.0591F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r27 = neck.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(131, 32).addBox(-0.0357F, -0.9F, -2.3F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8475F, -1.2722F, -0.1571F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(111, 0).addBox(-0.5357F, -0.8178F, -4.9187F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2953F, -4.0192F, -0.3384F, 0.0412F, -0.0145F));

		PartDefinition cube_r28 = neck2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(34, 131).addBox(0.0F, 0.1F, -2.9F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -2.0696F, -1.6769F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(139, 122).addBox(-0.0357F, -1.1966F, -2.3168F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3474F, -4.8445F, -0.1359F, 0.0924F, 0.0314F));

		PartDefinition cube_r29 = neck3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(128, 67).addBox(-0.5357F, -0.3F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.198F, -0.4517F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.286F, -3.0062F, -0.2715F, 0.0957F, 0.0187F));

		PartDefinition cube_r30 = neck4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(15, 97).addBox(-0.0357F, -0.9F, -7.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 134).addBox(-0.5357F, -0.3F, -7.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -0.2033F, 5.5443F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4287F, -1.537F, 1.2207F, -0.015F, 0.3983F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(88, 52).addBox(-1.9663F, 0.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4306F, 0.8092F, -1.5454F, -2.042F, 0.0F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(125, 28).addBox(-1.9663F, 0.1F, -0.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4306F, 0.185F, -0.4007F, -2.5656F, 0.0F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(131, 38).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4643F, -0.2072F, 2.0736F, -3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(116, 74).addBox(-2.0F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4643F, 0.3396F, -0.8762F, -2.9583F, 0.0F, 0.0F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(114, 128).addBox(-1.5F, -1.5F, -0.15F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0357F, -5.1285F, -1.177F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(105, 128).addBox(-1.5F, -1.5F, -0.65F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0357F, -5.1285F, -1.177F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(136, 117).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0357F, -3.8991F, -2.1625F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(136, 100).addBox(-1.0F, -0.525F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0357F, -3.9845F, -1.5474F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(11, 123).addBox(-2.0F, -0.4F, -0.4F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, -1.8234F, -2.0097F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(121, 122).addBox(-2.0F, -2.2F, -0.4F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4643F, -1.8234F, -2.0097F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(115, 68).addBox(-2.0F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4643F, -4.1497F, 1.6427F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(72, 114).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4643F, -2.2009F, 2.0926F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(112, 28).addBox(-0.5F, -0.2F, -0.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.0357F, -5.5608F, -21.5526F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(137, 51).addBox(-0.5F, -1.25F, 1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(137, 51).addBox(-0.5F, -1.25F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(130, 59).addBox(-0.5F, -0.75F, 2.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
				.texOffs(130, 59).addBox(-0.5F, -0.75F, -0.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, 0.1343F, -6.6755F, 0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(37, 144).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(-0.0357F, -0.3828F, -6.0231F, 0.5192F, 0.0F, 0.0F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(137, 55).addBox(-0.5F, -1.125F, 0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.246F))
				.texOffs(81, 126).addBox(-0.5F, -1.75F, -0.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.0357F, -0.3105F, -9.1356F, -0.1789F, 0.0F, 0.0F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(110, 108).addBox(-0.5F, -1.75F, -0.25F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, -1.6824F, -13.4214F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(107, 44).addBox(-0.5F, -1.75F, -0.25F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.0357F, -3.3134F, -17.6154F, -0.3709F, 0.0F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(25, 112).addBox(-0.5F, -0.2F, -0.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, -5.5608F, -21.5526F, -0.3971F, 0.0F, 0.0F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(111, 98).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, -6.4413F, -25.9432F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(107, 36).addBox(-0.5F, -1.325F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, -7.7615F, -27.8635F, -0.4407F, 0.0F, 0.0F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(129, 77).addBox(-0.5F, -0.6298F, -0.3052F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, -11.4453F, -38.2237F, -0.3534F, 0.0F, 0.0F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(129, 72).addBox(-0.5F, -0.635F, -0.3155F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.0357F, -11.4453F, -38.2237F, -0.2662F, 0.0F, 0.0F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(131, 42).addBox(-0.5F, -2.85F, -1.85F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -13.1689F, 4.0125F, 1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(103, 140).addBox(-0.5F, -0.35F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(51, 112).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -10.2373F, -32.7079F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(49, 118).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -9.4717F, -25.9771F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(74, 126).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -11.8093F, -21.5594F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(124, 96).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -11.859F, -15.8596F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(67, 126).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -12.8488F, -11.5724F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(124, 89).addBox(-0.5F, -0.15F, -2.85F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -13.364F, -8.922F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(124, 6).addBox(-0.5F, -2.85F, -2.85F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -13.5288F, -6.227F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(105, 79).addBox(-0.5F, -5.35F, -2.15F, 1.0F, 7.0F, 4.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -10.4219F, -1.724F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(72, 104).addBox(-0.5F, -3.85F, -4.85F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0357F, -12.3446F, 1.8653F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(38, 118).addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0357F, -13.2335F, 7.712F, -3.1241F, 0.0F, 0.0F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(104, 60).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -13.0405F, 8.3849F, -1.85F, 0.0F, 0.0F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(100, 79).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0357F, -12.7337F, 9.014F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(40, 125).addBox(-0.5F, -1.85F, -2.85F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -11.8581F, 10.4712F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(97, 129).addBox(-0.5F, -3.85F, -0.15F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0357F, -10.6352F, 11.6521F, 2.3387F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(91, 95).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 4.0F, 6.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -7.324F, 13.3031F, -2.6791F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(90, 129).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0357F, -5.6242F, 13.2734F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(28, 137).addBox(-0.5F, -0.8F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -5.0671F, 12.9386F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(41, 131).addBox(-0.5F, -2.8F, -0.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -3.8218F, 11.8561F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, -0.15F, -9.85F, 1.0F, 10.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -1.794F, 8.1061F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(130, 52).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -2.2053F, 9.7556F, -2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(96, 0).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0357F, -2.2053F, 9.7556F, 2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(111, 91).addBox(-1.5F, -0.0969F, -0.1763F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4643F, -7.6891F, -0.2761F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(111, 7).addBox(-1.5F, -0.0969F, -0.1763F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.4643F, -10.3506F, -2.8464F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(88, 42).addBox(-1.5F, -0.1969F, -6.8763F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.4643F, -11.3506F, -7.4398F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(85, 106).addBox(-1.5F, -1.1969F, -2.8763F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4643F, -9.7479F, -5.0479F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(38, 112).addBox(-1.5F, -0.5969F, -3.9763F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.4643F, -7.7054F, -2.4253F, -0.5411F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0008F, 2.3416F, -2.5433F, -0.1823F, -0.0006F, -0.0013F));

		PartDefinition cube_r81 = jaw.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(141, 109).mirror().addBox(-0.3001F, -0.6807F, -0.502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0503F, 0.1432F, 0.1916F, 0.6554F, -0.0253F, 0.0164F));

		PartDefinition cube_r82 = jaw.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(123, 128).mirror().addBox(-0.3001F, -1.2986F, -5.0215F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0503F, 0.1432F, 0.1916F, -0.034F, -0.0253F, 0.0164F));

		PartDefinition cube_r83 = jaw.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 129).mirror().addBox(-0.3001F, -1.6958F, -11.6467F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(56, 123).mirror().addBox(-0.3001F, -1.6886F, -8.9041F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0503F, 0.1432F, 0.1916F, 0.0445F, -0.0253F, 0.0164F));

		PartDefinition cube_r84 = jaw.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(9, 129).mirror().addBox(-0.1443F, 0.0611F, -2.6932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5593F, -1.2396F, -24.1364F, -0.0253F, -0.0239F, 0.017F));

		PartDefinition cube_r85 = jaw.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(72, 120).mirror().addBox(-0.1443F, -0.0069F, -9.6571F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5593F, -1.2396F, -24.1364F, -0.0079F, -0.0239F, 0.017F));

		PartDefinition cube_r86 = jaw.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(134, 20).mirror().addBox(-0.1443F, 1.3046F, -9.5025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5593F, -1.2396F, -24.1364F, -0.1344F, -0.0239F, 0.017F));

		PartDefinition cube_r87 = jaw.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(134, 24).mirror().addBox(-0.1494F, 2.2507F, -7.5131F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5593F, -1.2396F, -24.1364F, -0.2566F, -0.0239F, 0.017F));

		PartDefinition cube_r88 = jaw.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(141, 112).mirror().addBox(-0.1494F, 1.3482F, -5.9537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5593F, -1.2396F, -24.1364F, -0.0995F, -0.0239F, 0.017F));

		PartDefinition cube_r89 = jaw.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(138, 42).mirror().addBox(-0.1494F, 1.9537F, 1.3482F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5593F, -1.2396F, -24.1364F, -1.6703F, -0.0239F, 0.017F));

		PartDefinition cube_r90 = jaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(83, 120).mirror().addBox(-0.2943F, 0.2659F, -13.4785F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(141, 106).mirror().addBox(-0.2943F, 0.2659F, -14.1785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5593F, -1.2396F, -24.1364F, -0.0515F, -0.0239F, 0.017F));

		PartDefinition cube_r91 = jaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(49, 129).mirror().addBox(-0.1443F, 0.0434F, -5.6918F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5593F, -1.2396F, -24.1364F, -0.0166F, -0.0239F, 0.017F));

		PartDefinition cube_r92 = jaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(74, 95).mirror().addBox(-0.1443F, 0.2951F, -6.6883F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5593F, -1.2396F, -24.1364F, 0.027F, -0.0239F, 0.017F));

		PartDefinition cube_r93 = jaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(125, 16).mirror().addBox(-0.3001F, -0.5241F, -11.7403F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0503F, 0.1432F, 0.1916F, -0.0602F, -0.0253F, 0.0164F));

		PartDefinition cube_r94 = jaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 134).mirror().addBox(-0.3001F, -1.1406F, -2.1294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0503F, 0.1432F, 0.1916F, -0.1126F, -0.0253F, 0.0164F));

		PartDefinition cube_r95 = jaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(22, 125).mirror().addBox(-0.3001F, -0.8976F, -8.8071F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0503F, 0.1432F, 0.1916F, -0.0166F, -0.0253F, 0.0164F));

		PartDefinition cube_r96 = jaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(114, 133).mirror().addBox(-0.622F, -0.4824F, 3.9187F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0153F, 1.8231F, -6.3639F, 0.1044F, -0.0526F, 0.0027F));

		PartDefinition cube_r97 = jaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(125, 22).mirror().addBox(-0.0014F, -0.9F, 0.0001F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0153F, 1.8231F, -6.3639F, 0.0018F, -0.2088F, -0.0139F));

		PartDefinition cube_r98 = jaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(123, 105).mirror().addBox(-0.1271F, 0.2755F, -13.4743F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(144, 60).mirror().addBox(-0.1271F, 0.2755F, -14.1743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5593F, -1.2396F, -24.1364F, -0.0509F, -0.011F, -0.017F));

		PartDefinition cube_r99 = jaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(110, 122).mirror().addBox(-0.1189F, 1.6344F, -13.265F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5593F, -1.2396F, -24.1364F, -0.1556F, -0.0104F, -0.0167F));

		PartDefinition cube_r100 = jaw.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(133, 6).mirror().addBox(-0.3001F, -1.4079F, -5.8811F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0503F, 0.1432F, 0.1916F, 0.0707F, -0.0253F, 0.0164F));

		PartDefinition cube_r101 = jaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(133, 87).mirror().addBox(-0.3001F, 1.9032F, -1.5777F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(108, 140).mirror().addBox(-0.3001F, -0.0968F, -0.5777F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0503F, 0.1432F, 0.1916F, -1.4565F, -0.0253F, 0.0164F));

		PartDefinition cube_r102 = jaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-1.0869F, 0.2301F, -8.2608F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0407F, -1.2396F, -11.1364F, -0.0253F, -0.0253F, 0.0164F));

		PartDefinition cube_r103 = jaw.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(88, 22).mirror().addBox(-1.0869F, 1.2098F, -8.1615F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0407F, -1.2396F, -11.1364F, -0.0777F, -0.0253F, 0.0164F));

		PartDefinition cube_r104 = jaw.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(112, 14).mirror().addBox(-1.0869F, -0.0581F, -13.2621F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0407F, -1.2396F, -11.1364F, 0.0096F, -0.0253F, 0.0164F));

		PartDefinition cube_r105 = jaw.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(23, 83).mirror().addBox(-1.0869F, 0.5711F, -13.3148F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 21).mirror().addBox(-1.0869F, 0.0711F, -13.3148F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0407F, -1.2396F, -11.1364F, 0.0532F, -0.0253F, 0.0164F));

		PartDefinition cube_r106 = jaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(133, 140).mirror().addBox(-0.1494F, 0.0543F, 1.2608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5593F, -1.2396F, -24.1364F, -1.6267F, -0.0239F, 0.017F));

		PartDefinition cube_r107 = jaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(144, 60).addBox(-0.8729F, 0.2755F, -14.1743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(123, 105).addBox(-0.8729F, 0.2755F, -13.4743F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.4862F, -1.2396F, -24.1364F, -0.0509F, 0.011F, 0.017F));

		PartDefinition cube_r108 = jaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(110, 122).addBox(-0.8812F, 1.6344F, -13.265F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4862F, -1.2396F, -24.1364F, -0.1556F, 0.0104F, 0.0167F));

		PartDefinition cube_r109 = jaw.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(125, 22).addBox(0.0014F, -0.9F, 0.0001F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0578F, 1.8231F, -6.3639F, 0.0018F, 0.2088F, 0.0139F));

		PartDefinition cube_r110 = jaw.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(114, 133).addBox(0.622F, -0.4824F, 3.9187F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0578F, 1.8231F, -6.3639F, 0.1044F, 0.0526F, -0.0027F));

		PartDefinition cube_r111 = jaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(108, 140).addBox(-0.6999F, -0.0968F, -0.5777F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(133, 87).addBox(-0.6999F, 1.9032F, -1.5777F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9772F, 0.1432F, 0.1916F, -1.4565F, 0.0253F, -0.0164F));

		PartDefinition cube_r112 = jaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(133, 6).addBox(-0.6999F, -1.4079F, -5.8811F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9772F, 0.1432F, 0.1916F, 0.0707F, 0.0253F, -0.0164F));

		PartDefinition cube_r113 = jaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(22, 125).addBox(-0.6999F, -0.8976F, -8.8071F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9772F, 0.1432F, 0.1916F, -0.0166F, 0.0253F, -0.0164F));

		PartDefinition cube_r114 = jaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 134).addBox(-0.6999F, -1.1406F, -2.1294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9772F, 0.1432F, 0.1916F, -0.1126F, 0.0253F, -0.0164F));

		PartDefinition cube_r115 = jaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(125, 16).addBox(-0.6999F, -0.5241F, -11.7403F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9772F, 0.1432F, 0.1916F, -0.0602F, 0.0253F, -0.0164F));

		PartDefinition cube_r116 = jaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(74, 95).addBox(-0.8557F, 0.2951F, -6.6883F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4862F, -1.2396F, -24.1364F, 0.027F, 0.0239F, -0.017F));

		PartDefinition cube_r117 = jaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(49, 129).addBox(-0.8557F, 0.0434F, -5.6918F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4862F, -1.2396F, -24.1364F, -0.0166F, 0.0239F, -0.017F));

		PartDefinition cube_r118 = jaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(141, 106).addBox(-0.7057F, 0.2659F, -14.1785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(83, 120).addBox(-0.7057F, 0.2659F, -13.4785F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.4862F, -1.2396F, -24.1364F, -0.0515F, 0.0239F, -0.017F));

		PartDefinition cube_r119 = jaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(133, 140).addBox(-0.8506F, 0.0543F, 1.2608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4862F, -1.2396F, -24.1364F, -1.6267F, 0.0239F, -0.017F));

		PartDefinition cube_r120 = jaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(138, 42).addBox(-0.8506F, 1.9537F, 1.3482F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4862F, -1.2396F, -24.1364F, -1.6703F, 0.0239F, -0.017F));

		PartDefinition cube_r121 = jaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(141, 112).addBox(-0.8506F, 1.3482F, -5.9537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4862F, -1.2396F, -24.1364F, -0.0995F, 0.0239F, -0.017F));

		PartDefinition cube_r122 = jaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(134, 24).addBox(-0.8506F, 2.2507F, -7.5131F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4862F, -1.2396F, -24.1364F, -0.2566F, 0.0239F, -0.017F));

		PartDefinition cube_r123 = jaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(134, 20).addBox(-0.8557F, 1.3046F, -9.5025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4862F, -1.2396F, -24.1364F, -0.1344F, 0.0239F, -0.017F));

		PartDefinition cube_r124 = jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(72, 120).addBox(-0.8557F, -0.0069F, -9.6571F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4862F, -1.2396F, -24.1364F, -0.0079F, 0.0239F, -0.017F));

		PartDefinition cube_r125 = jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(9, 129).addBox(-0.8557F, 0.0611F, -2.6932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4862F, -1.2396F, -24.1364F, -0.0253F, 0.0239F, -0.017F));

		PartDefinition cube_r126 = jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(88, 22).addBox(0.0869F, 1.2098F, -8.1615F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1138F, -1.2396F, -11.1364F, -0.0777F, 0.0253F, -0.0164F));

		PartDefinition cube_r127 = jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(112, 21).addBox(0.0869F, 0.0711F, -13.3148F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(23, 83).addBox(0.0869F, 0.5711F, -13.3148F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1138F, -1.2396F, -11.1364F, 0.0532F, 0.0253F, -0.0164F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(112, 14).addBox(0.0869F, -0.0581F, -13.2621F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1138F, -1.2396F, -11.1364F, 0.0096F, 0.0253F, -0.0164F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 87).addBox(0.0869F, 0.2301F, -8.2608F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1138F, -1.2396F, -11.1364F, -0.0253F, 0.0253F, -0.0164F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 129).addBox(-0.6999F, -1.6958F, -11.6467F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(56, 123).addBox(-0.6999F, -1.6886F, -8.9041F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9772F, 0.1432F, 0.1916F, 0.0445F, 0.0253F, -0.0164F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(123, 128).addBox(-0.6999F, -1.2986F, -5.0215F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9772F, 0.1432F, 0.1916F, -0.034F, 0.0253F, -0.0164F));

		PartDefinition cube_r132 = jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(141, 109).addBox(-0.6999F, -0.6807F, -0.502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9772F, 0.1432F, 0.1916F, 0.6554F, 0.0253F, -0.0164F));

		PartDefinition crest1 = head.addOrReplaceChild("crest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.8125F, 7.031F, -0.0911F, 0.0F, 0.0F));

		PartDefinition crest2 = crest1.addOrReplaceChild("crest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 1.3F, 0.0456F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1306F, -10.615F, -35.8989F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(37, 141).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.35F, 6.498F, 35.8728F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(141, 63).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.35F, 9.0616F, 35.0873F, -2.3649F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(128, 139).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.35F, 8.3907F, 35.523F, 2.5656F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(139, 126).addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.35F, 8.2932F, 36.3171F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(52, 141).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.35F, 7.6628F, 36.8096F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(32, 141).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.35F, 6.5398F, 36.6717F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(141, 103).addBox(-0.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(79, 142).addBox(-0.7625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.4375F, 7.4334F, 35.6172F, -2.9845F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(27, 141).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.35F, 6.5259F, 35.0733F, -3.1067F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(141, 24).addBox(-0.5F, -0.4837F, -0.3038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.55F, 9.5152F, 36.2773F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(72, 144).addBox(-0.5F, -0.356F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.55F, 9.5152F, 36.2773F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(42, 142).addBox(-0.5F, -0.1705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(142, 10).addBox(-0.5F, -0.4705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(32, 144).addBox(-0.5F, -1.2705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(142, 0).addBox(-0.5F, -0.8705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.55F, 9.5152F, 36.2773F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(55, 134).addBox(-0.4899F, -0.7539F, 1.6432F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 69).addBox(-0.4899F, -0.7039F, -9.3068F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.0961F, 0.7751F, 3.4334F, 2.8043F, -0.0211F, -0.094F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(48, 134).addBox(-0.8001F, -10.8351F, -8.1549F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.65F, 7.5248F, 23.2477F, 0.513F, -0.0086F, -0.096F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(19, 94).addBox(-0.4899F, -0.4387F, 0.4173F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.0961F, 0.7751F, 3.4334F, -0.3067F, -0.0211F, -0.094F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(38, 94).addBox(-0.4899F, -0.5387F, 0.4173F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.0961F, 0.7751F, 3.4334F, -0.1322F, -0.0211F, -0.094F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(88, 32).addBox(-0.4899F, -0.5387F, 0.4173F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.0961F, 0.7751F, 3.4334F, -0.2194F, -0.0211F, -0.094F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(50, 72).addBox(-0.4899F, -0.909F, -2.3818F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0961F, 0.7751F, 3.4334F, -0.0885F, -0.0211F, -0.094F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, -0.5F, -20.1F, 1.0F, 1.0F, 20.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1445F, 0.2708F, 21.8223F, -0.0018F, 0.0215F, -0.09F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(23, 54).addBox(-0.5F, -0.5F, -12.1F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.1445F, 0.2708F, 21.8223F, 0.068F, 0.0215F, -0.09F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(52, 58).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0951F, 1.8101F, 10.9332F, 0.1291F, 0.0346F, -0.09F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(27, 144).addBox(-0.5F, -0.35F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0259F, 3.0911F, 11.2053F, 1.7347F, -0.0086F, -0.096F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 138).addBox(-0.8001F, -4.9406F, 10.2524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.65F, 7.5248F, 23.2477F, 2.4329F, -0.0086F, -0.096F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5014F, -2.59F, 12.3348F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.2022F, 9.2968F, 33.1424F, 2.8007F, -0.0176F, -0.0964F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(57, 94).addBox(-0.5014F, -1.7165F, 5.6782F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.2022F, 9.2968F, 33.1424F, 2.8705F, -0.0176F, -0.0964F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 142).addBox(-0.5014F, -1.0209F, 0.366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2022F, 9.2968F, 33.1424F, -2.9022F, -0.0176F, -0.0964F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(100, 71).addBox(-0.5014F, -1.5393F, -0.0647F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.2022F, 9.2968F, 33.1424F, 2.901F, -0.0176F, -0.0964F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(86, 85).addBox(-0.5014F, -1.7371F, -0.0996F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2022F, 9.2968F, 33.1424F, 2.8792F, -0.0176F, -0.0964F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(12, 140).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.35F, 9.2817F, 34.2219F, 2.8449F, 0.0F, 0.0F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(119, 141).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.35F, 7.1852F, 34.6202F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(58, 129).addBox(0.0F, -0.4031F, -0.6763F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1006F, 2.9096F, 33.477F, -1.021F, -0.0175F, 0.0F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(35, 137).addBox(0.0F, -0.0031F, 0.0737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.102F, 2.2742F, 33.5568F, -0.8465F, -0.0175F, 0.0F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(76, 134).addBox(-0.5F, -0.725F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.35F, 7.0577F, 34.9202F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(76, 137).addBox(-0.7695F, -0.4518F, 1.6105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6587F, 0.6954F, 30.3744F, -0.5934F, 0.0124F, -0.004F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(137, 67).addBox(-0.7695F, -0.2661F, -0.0676F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.6587F, 0.6954F, 30.3744F, -0.4887F, 0.0124F, -0.004F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(94, 123).addBox(-0.725F, -0.3841F, -7.2137F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6587F, 1.2954F, 33.7745F, -0.1396F, 0.0131F, 0.0F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(96, 10).addBox(-0.5F, -1.0F, -3.225F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1839F, -0.1876F, 19.1934F, -0.0437F, 0.0523F, -0.0023F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(25, 104).addBox(-0.725F, -1.2737F, -12.0777F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.6587F, 1.2954F, 33.7745F, -0.0131F, 0.0131F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2021F, -10.615F, -35.8989F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(37, 141).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 6.498F, 35.8728F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(141, 63).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 9.0616F, 35.0873F, -2.3649F, 0.0F, 0.0F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(128, 139).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 8.3907F, 35.523F, 2.5656F, 0.0F, 0.0F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(139, 126).mirror().addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 8.2932F, 36.3171F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(52, 141).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 7.6628F, 36.8096F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(32, 141).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 6.5398F, 36.6717F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(141, 103).mirror().addBox(-0.4625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(79, 142).mirror().addBox(-0.2375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4375F, 7.4334F, 35.6172F, -2.9845F, 0.0F, 0.0F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(27, 141).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 6.5259F, 35.0733F, -3.1067F, 0.0F, 0.0F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(141, 24).mirror().addBox(-0.5F, -0.4837F, -0.3038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 9.5152F, 36.2773F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(72, 144).mirror().addBox(-0.5F, -0.356F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 9.5152F, 36.2773F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(42, 142).mirror().addBox(-0.5F, -0.1705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(142, 10).mirror().addBox(-0.5F, -0.4705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(32, 144).mirror().addBox(-0.5F, -1.2705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(142, 0).mirror().addBox(-0.5F, -0.8705F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 9.5152F, 36.2773F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(55, 134).mirror().addBox(-0.5101F, -0.7539F, 1.6432F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(23, 69).mirror().addBox(-0.5101F, -0.7039F, -9.3068F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0961F, 0.7751F, 3.4334F, 2.8043F, 0.0211F, 0.094F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(48, 134).mirror().addBox(-0.1999F, -10.8351F, -8.1549F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.65F, 7.5248F, 23.2477F, 0.513F, 0.0086F, 0.096F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(19, 94).mirror().addBox(-0.5101F, -0.4387F, 0.4173F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.0961F, 0.7751F, 3.4334F, -0.3067F, 0.0211F, 0.094F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(38, 94).mirror().addBox(-0.5101F, -0.5387F, 0.4173F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.0961F, 0.7751F, 3.4334F, -0.1322F, 0.0211F, 0.094F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(88, 32).mirror().addBox(-0.5101F, -0.5387F, 0.4173F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.0961F, 0.7751F, 3.4334F, -0.2194F, 0.0211F, 0.094F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(50, 72).mirror().addBox(-0.5101F, -0.909F, -2.3818F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0961F, 0.7751F, 3.4334F, -0.0885F, 0.0211F, 0.094F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-0.5F, -0.5F, -20.1F, 1.0F, 1.0F, 20.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1445F, 0.2708F, 21.8223F, -0.0018F, -0.0215F, 0.09F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(23, 54).mirror().addBox(-0.5F, -0.5F, -12.1F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.1445F, 0.2708F, 21.8223F, 0.068F, -0.0215F, 0.09F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(52, 58).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0951F, 1.8101F, 10.9332F, 0.1291F, -0.0346F, 0.09F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(27, 144).mirror().addBox(-0.5F, -0.35F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.0259F, 3.0911F, 11.2053F, 1.7347F, 0.0086F, 0.096F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 138).mirror().addBox(-0.1999F, -4.9406F, 10.2524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.65F, 7.5248F, 23.2477F, 2.4329F, 0.0086F, 0.096F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.4986F, -2.59F, 12.3348F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.2022F, 9.2968F, 33.1424F, 2.8007F, 0.0176F, 0.0964F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(57, 94).mirror().addBox(-0.4986F, -1.7165F, 5.6782F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.2022F, 9.2968F, 33.1424F, 2.8705F, 0.0176F, 0.0964F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 142).mirror().addBox(-0.4986F, -1.0209F, 0.366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2022F, 9.2968F, 33.1424F, -2.9022F, 0.0176F, 0.0964F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(100, 71).mirror().addBox(-0.4986F, -1.5393F, -0.0647F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.2022F, 9.2968F, 33.1424F, 2.901F, 0.0176F, 0.0964F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(86, 85).mirror().addBox(-0.4986F, -1.7371F, -0.0996F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2022F, 9.2968F, 33.1424F, 2.8792F, 0.0176F, 0.0964F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(12, 140).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 9.2817F, 34.2219F, 2.8449F, 0.0F, 0.0F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(119, 141).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 7.1852F, 34.6202F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(58, 129).mirror().addBox(-1.0F, -0.4031F, -0.6763F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1006F, 2.9096F, 33.477F, -1.021F, 0.0175F, 0.0F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(35, 137).mirror().addBox(-1.0F, -0.0031F, 0.0737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.102F, 2.2742F, 33.5568F, -0.8465F, 0.0175F, 0.0F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(76, 134).mirror().addBox(-0.5F, -0.725F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 7.0577F, 34.9202F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(76, 137).mirror().addBox(-0.2305F, -0.4518F, 1.6105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6587F, 0.6954F, 30.3744F, -0.5934F, -0.0124F, 0.004F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(137, 67).mirror().addBox(-0.2305F, -0.2661F, -0.0676F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.6587F, 0.6954F, 30.3744F, -0.4887F, -0.0124F, 0.004F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(94, 123).mirror().addBox(-0.275F, -0.3841F, -7.2137F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6587F, 1.2954F, 33.7745F, -0.1396F, -0.0131F, 0.0F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(96, 10).mirror().addBox(-0.5F, -1.0F, -3.225F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1839F, -0.1876F, 19.1934F, -0.0437F, -0.0523F, 0.0023F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(25, 104).mirror().addBox(-0.275F, -1.2737F, -12.0777F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.6587F, 1.2954F, 33.7745F, -0.0131F, -0.0131F, 0.0F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5232F, 3.9095F, 2.3316F, 0.4102F, -0.4068F, -0.1381F));

		PartDefinition cube_r207 = leftwing1.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(123, 117).addBox(0.0F, 0.0F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8925F, -0.548F, -0.212F, -1.1373F, 0.4249F, 0.1885F));

		PartDefinition cube_r208 = leftwing1.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(113, 142).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(8.6858F, -0.0622F, -1.3846F, -1.139F, 0.417F, 0.1845F));

		PartDefinition cube_r209 = leftwing1.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(96, 19).addBox(0.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.8925F, -0.548F, -0.212F, -1.159F, 0.2975F, 0.1274F));

		PartDefinition cube_r210 = leftwing1.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(116, 86).addBox(-0.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.391F, -0.7339F, 0.2369F, -1.1695F, 0.2013F, 0.0846F));

		PartDefinition cube_r211 = leftwing1.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(89, 144).addBox(0.0F, -1.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(84, 144).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.8929F, -0.8938F, 0.6229F, -1.1751F, 0.1209F, 0.0503F));

		PartDefinition cube_r212 = leftwing1.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(69, 138).addBox(-0.8F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.3159F, -0.6508F, 0.0364F, -1.0751F, -0.6358F, -0.3107F));

		PartDefinition cube_r213 = leftwing1.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(7, 138).addBox(-0.7F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0698F, -0.8267F, 0.4611F, -0.9984F, -0.7863F, -0.4279F));

		PartDefinition cube_r214 = leftwing1.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(138, 13).addBox(-0.8F, 0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5499F, -0.2644F, -0.8967F, 1.1772F, 0.0645F, 3.1148F));

		PartDefinition cube_r215 = leftwing1.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(131, 48).addBox(-0.75F, -0.625F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1161F, -0.2667F, -0.8911F, 0.7664F, 1.0108F, 2.4199F));

		PartDefinition cube_r216 = leftwing1.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(104, 144).addBox(-0.4F, 0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0443F, 0.3303F, -2.3322F, -0.601F, 1.0883F, 0.9121F));

		PartDefinition cube_r217 = leftwing1.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(138, 76).addBox(-1.5F, -2.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1518F, 0.4374F, -2.5909F, -1.1532F, 0.3375F, 0.1459F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create().texOffs(107, 19).addBox(-1.3789F, -0.0386F, -0.1429F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0064F, 0.213F, -3.1633F, -1.2342F, 0.5718F, -2.7543F));

		PartDefinition cube_r218 = leftwing2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(106, 91).addBox(-0.5F, -7.5F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1789F, 7.4614F, -0.4429F, 0.0F, 0.0F, 0.0175F));

		PartDefinition cube_r219 = leftwing2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(132, 132).addBox(-0.5F, -4.8F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.2724F, 11.583F, -0.6215F, 0.0F, -1.5708F, 0.1658F));

		PartDefinition cube_r220 = leftwing2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(42, 137).addBox(-0.5F, -2.8F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.4045F, 14.0339F, -0.6215F, 0.0F, -1.5708F, 0.3403F));

		PartDefinition cube_r221 = leftwing2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(141, 20).addBox(-1.5824F, -3.1517F, -0.6623F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.3636F, 16.4119F, 0.461F, 0.0F, -1.5708F, 0.48F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(0, 97).addBox(-1.1096F, -0.3762F, 0.049F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(5, 97).addBox(-0.6096F, -0.3762F, 0.049F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-1.6016F, 16.0866F, -0.3174F, 0.1312F, 0.2144F, 0.4912F));

		PartDefinition cube_r222 = leftwing3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(137, 132).addBox(-0.2F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.6096F, -0.0762F, 0.549F, 0.0F, 0.0F, -0.48F));

		PartDefinition lefthand2 = leftwing3.addOrReplaceChild("lefthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8102F, 17.5824F, 0.3304F, -0.0935F, -0.3654F, 0.0841F));

		PartDefinition cube_r223 = lefthand2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(110, 116).addBox(11.45F, -3.9F, -3.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.9995F, 6.0364F, -2.7178F, -1.3989F, 0.0302F, -0.1719F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4517F, 16.656F, 0.6782F, 1.759F, 0.3116F, -2.9784F));

		PartDefinition cube_r224 = leftwing4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 0).addBox(-0.425F, -0.55F, -9.5F, 1.0F, 1.0F, 25.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3799F, -0.0164F, 8.846F, 0.0F, 0.0F, 0.6981F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(53, 22).addBox(-0.0957F, -0.5549F, -0.1523F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6158F, -0.2375F, 24.2482F, 0.2214F, 0.1335F, 0.7286F));

		PartDefinition leftwing6 = leftwing5.addOrReplaceChild("leftwing6", CubeListBuilder.create().texOffs(75, 72).addBox(-0.1758F, -0.9172F, -0.1573F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0609F, 0.3715F, 15.7457F, 0.1929F, 0.0745F, -0.041F));

		PartDefinition leftwing7 = leftwing6.addOrReplaceChild("leftwing7", CubeListBuilder.create().texOffs(119, 52).addBox(-0.1F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0803F, -0.4157F, 10.7082F, 0.0886F, 0.2178F, 0.0078F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5947F, 3.9095F, 2.3316F, 0.4102F, 0.4068F, 0.1381F));

		PartDefinition cube_r225 = rightwing1.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(125, 13).addBox(-5.0F, 0.0F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.8925F, -0.548F, -0.212F, -1.1373F, -0.4249F, -0.1885F));

		PartDefinition cube_r226 = rightwing1.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(144, 51).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-8.6858F, -0.0622F, -1.3846F, -1.139F, -0.417F, -0.1845F));

		PartDefinition cube_r227 = rightwing1.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(104, 68).addBox(-4.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.8925F, -0.548F, -0.212F, -1.159F, -0.2975F, -0.1274F));

		PartDefinition cube_r228 = rightwing1.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(119, 64).addBox(-4.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.391F, -0.7339F, 0.2369F, -1.1695F, -0.2013F, -0.0846F));

		PartDefinition cube_r229 = rightwing1.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(99, 144).addBox(-1.0F, -1.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(94, 144).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.8929F, -0.8938F, 0.6229F, -1.1751F, -0.1209F, -0.0503F));

		PartDefinition cube_r230 = rightwing1.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(138, 71).addBox(-0.2F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.3159F, -0.6508F, 0.0364F, -1.0751F, 0.6358F, 0.3107F));

		PartDefinition cube_r231 = rightwing1.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(138, 32).addBox(-0.3F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0698F, -0.8267F, 0.4611F, -0.9984F, 0.7863F, 0.4279F));

		PartDefinition cube_r232 = rightwing1.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(52, 138).addBox(-1.2F, 0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.5499F, -0.2644F, -0.8967F, 1.1772F, -0.0645F, -3.1148F));

		PartDefinition cube_r233 = rightwing1.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(132, 64).addBox(-2.25F, -0.625F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1161F, -0.2667F, -0.8911F, 0.7664F, -1.0108F, -2.4199F));

		PartDefinition cube_r234 = rightwing1.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(118, 144).addBox(-0.6F, 0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0443F, 0.3303F, -2.3322F, -0.601F, -1.0883F, -0.9121F));

		PartDefinition cube_r235 = rightwing1.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(138, 81).addBox(0.5F, -2.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1518F, 0.4374F, -2.5909F, -1.1532F, -0.3375F, -0.1459F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create().texOffs(105, 108).addBox(0.3789F, -0.0386F, -0.1429F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0064F, 0.213F, -3.1633F, -1.2778F, -0.5718F, 2.7543F));

		PartDefinition cube_r236 = rightwing2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(100, 106).addBox(-0.5F, -7.5F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1789F, 7.4614F, -0.4429F, 0.0F, 0.0F, -0.0175F));

		PartDefinition cube_r237 = rightwing2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(104, 133).addBox(-0.5F, -4.8F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-2.2724F, 11.583F, -0.6215F, 0.0F, 1.5708F, -0.1658F));

		PartDefinition cube_r238 = rightwing2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(83, 137).addBox(-0.5F, -2.8F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-1.4045F, 14.0339F, -0.6215F, 0.0F, 1.5708F, -0.3403F));

		PartDefinition cube_r239 = rightwing2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(22, 141).addBox(0.5824F, -3.1517F, -0.6623F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.3636F, 16.4119F, 0.461F, 0.0F, 1.5708F, -0.48F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(10, 97).addBox(0.1096F, -0.3762F, 0.049F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(57, 103).addBox(-0.3904F, -0.3762F, 0.049F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(1.6016F, 16.0866F, -0.3174F, 0.1312F, -0.2144F, -0.4912F));

		PartDefinition cube_r240 = rightwing3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(137, 136).addBox(-1.8F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.6096F, -0.0762F, 0.549F, 0.0F, 0.0F, 0.48F));

		PartDefinition righthand2 = rightwing3.addOrReplaceChild("righthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8102F, 17.5824F, 0.3304F, -0.0935F, 0.3654F, -0.0841F));

		PartDefinition cube_r241 = righthand2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 117).addBox(-13.45F, -3.9F, -3.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.9995F, 6.0364F, -2.7178F, -1.3989F, -0.0302F, 0.1719F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4517F, 16.656F, 0.6782F, 1.7154F, -0.3116F, 2.9784F));

		PartDefinition cube_r242 = rightwing4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 27).addBox(-0.575F, -0.55F, -9.5F, 1.0F, 1.0F, 25.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3799F, -0.0164F, 8.846F, 0.0F, 0.0F, -0.6981F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(53, 40).addBox(-0.9043F, -0.5549F, -0.1523F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6158F, -0.2375F, 24.2482F, 0.2665F, -0.176F, -0.7383F));

		PartDefinition rightwing6 = rightwing5.addOrReplaceChild("rightwing6", CubeListBuilder.create().texOffs(79, 58).addBox(-0.8242F, -0.9172F, -0.1573F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0609F, 0.3715F, 15.7457F, 0.1949F, -0.1601F, 0.024F));

		PartDefinition rightwing7 = rightwing6.addOrReplaceChild("rightwing7", CubeListBuilder.create().texOffs(119, 58).addBox(-0.9F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0803F, -0.4157F, 10.7082F, 0.0886F, -0.2178F, -0.0078F));

		PartDefinition body = chest1.addOrReplaceChild("body", CubeListBuilder.create().texOffs(123, 111).addBox(-0.5357F, -0.5081F, -0.0684F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3212F, 1.9887F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r243 = body.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(31, 125).addBox(-0.0357F, -0.0924F, -3.9682F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3157F, 3.8999F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r244 = body.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(85, 104).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 3.465F, 0.3834F, 0.0486F, -0.2761F));

		PartDefinition cube_r245 = body.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(139, 130).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 3.465F, 0.2662F, 0.2344F, -0.794F));

		PartDefinition cube_r246 = body.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(111, 105).mirror().addBox(-6.2026F, -1.8494F, -0.5143F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 3.465F, 0.112F, 0.3353F, -1.3302F));

		PartDefinition cube_r247 = body.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(123, 120).mirror().addBox(-6.2026F, -1.8494F, -0.5143F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 1.465F, 0.1157F, 0.3343F, -1.3814F));

		PartDefinition cube_r248 = body.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(140, 8).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 1.465F, 0.2688F, 0.2317F, -0.8459F));

		PartDefinition cube_r249 = body.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(135, 4).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 1.465F, 0.3843F, 0.045F, -0.3285F));

		PartDefinition cube_r250 = body.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(135, 4).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 1.465F, 0.3843F, -0.045F, 0.3285F));

		PartDefinition cube_r251 = body.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(140, 8).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 1.465F, 0.2688F, -0.2317F, 0.8459F));

		PartDefinition cube_r252 = body.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(123, 120).addBox(2.2026F, -1.8494F, -0.5143F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 1.465F, 0.1157F, -0.3343F, 1.3814F));

		PartDefinition cube_r253 = body.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(111, 105).addBox(2.2026F, -1.8494F, -0.5143F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 3.465F, 0.112F, -0.3353F, 1.3302F));

		PartDefinition cube_r254 = body.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(139, 130).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 3.465F, 0.2662F, -0.2344F, 0.794F));

		PartDefinition cube_r255 = body.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(85, 104).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 3.465F, 0.3834F, -0.0486F, 0.2761F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1157F, 3.8999F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r256 = body2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(120, 47).addBox(-1.5188F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0169F, 6.9587F, 4.2819F, 0.0698F, 0.0012F, -0.0018F));

		PartDefinition cube_r257 = body2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(134, 120).mirror().addBox(-5.2026F, -1.8494F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.1195F, 0.3693F, -1.3975F));

		PartDefinition cube_r258 = body2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(144, 132).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.4165F, 0.0592F, -0.3442F));

		PartDefinition cube_r259 = body2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(140, 39).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.2905F, 0.2599F, -0.858F));

		PartDefinition cube_r260 = body2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(140, 39).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.2905F, -0.2599F, 0.858F));

		PartDefinition cube_r261 = body2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(144, 132).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.4165F, -0.0592F, 0.3442F));

		PartDefinition cube_r262 = body2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(134, 120).addBox(2.2026F, -1.8494F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.1195F, -0.3693F, 1.3975F));

		PartDefinition cube_r263 = body2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(132, 127).addBox(-0.0357F, 0.0076F, 0.0318F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0015F, -1.2966F, 0.0784F, -0.1396F, 0.0012F, -0.0018F));

		PartDefinition cube_r264 = body2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(129, 82).addBox(-0.5357F, 0.0076F, 0.0318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2457F, 2.9524F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r265 = body3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(90, 126).addBox(-0.0357F, -0.7924F, 2.0318F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 91).addBox(-0.0357F, -0.6924F, 0.0318F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 131).addBox(-0.5357F, 0.0076F, 0.0318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition cube_r266 = body3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(116, 80).addBox(-1.5F, -0.7F, -0.8F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0362F, 5.0874F, 2.2061F, 0.3491F, 0.0012F, -0.0018F));

		PartDefinition cube_r267 = body3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(140, 94).mirror().addBox(-4.2026F, -1.8494F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.1515F, 0.5579F, -1.4716F));

		PartDefinition cube_r268 = body3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(144, 69).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.5954F, 0.1275F, -0.416F));

		PartDefinition cube_r269 = body3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(140, 37).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.4211F, 0.4055F, -0.9037F));

		PartDefinition cube_r270 = body3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(133, 11).mirror().addBox(-3.8322F, -0.5004F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0326F, 2.4127F, 0.3871F, 0.4052F, -1.072F));

		PartDefinition cube_r271 = body3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(144, 121).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0326F, 2.4127F, 0.5675F, 0.1421F, -0.5747F));

		PartDefinition cube_r272 = body3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(144, 121).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0326F, 2.4127F, 0.5675F, -0.1421F, 0.5747F));

		PartDefinition cube_r273 = body3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(133, 11).addBox(0.8322F, -0.5004F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0326F, 2.4127F, 0.3871F, -0.4052F, 1.072F));

		PartDefinition cube_r274 = body3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(140, 37).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.4211F, -0.4055F, 0.9037F));

		PartDefinition cube_r275 = body3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(144, 69).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.5954F, -0.1275F, 0.416F));

		PartDefinition cube_r276 = body3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(140, 94).addBox(2.2026F, -1.8494F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.1515F, -0.5579F, 1.4716F));

		PartDefinition body1 = body3.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3961F, 3.9424F, -0.0407F, 0.0F, 0.0F));

		PartDefinition cube_r277 = body1.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(128, 136).addBox(0.0009F, -1.0027F, 1.5944F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0366F, -0.3083F, 1.61F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r278 = body1.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(47, 138).addBox(0.0009F, -0.874F, -2.2734F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0366F, -0.3083F, 1.61F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r279 = body1.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(128, 133).addBox(-0.0011F, -0.0559F, -2.436F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0366F, -0.3083F, 1.61F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r280 = body1.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(98, 140).addBox(-0.0017F, -0.5478F, -0.3143F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(140, 90).addBox(0.001F, -0.8478F, -0.3143F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0366F, -0.3083F, 1.61F, -0.1222F, 0.0005F, -0.0003F));

		PartDefinition cube_r281 = body1.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(144, 123).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, -0.0635F, 0.4703F, 0.2508F, 0.1423F, -0.5969F));

		PartDefinition cube_r282 = body1.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(144, 125).mirror().addBox(-1.8322F, -0.5004F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, -0.0635F, 0.4703F, 0.1001F, 0.2481F, -1.1419F));

		PartDefinition cube_r283 = body1.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(144, 127).mirror().addBox(-0.9711F, 0.103F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0365F, 2.4703F, 0.1885F, 0.0943F, -0.5834F));

		PartDefinition cube_r284 = body1.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(129, 144).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0365F, 4.4703F, 0.0922F, -0.1705F, -0.3932F));

		PartDefinition cube_r285 = body1.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(129, 144).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0365F, 4.4703F, 0.0922F, 0.1705F, 0.3932F));

		PartDefinition cube_r286 = body1.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(144, 127).addBox(-0.0289F, 0.103F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0365F, 2.4703F, 0.1885F, -0.0943F, 0.5834F));

		PartDefinition cube_r287 = body1.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(144, 125).addBox(0.8322F, -0.5004F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, -0.0635F, 0.4703F, 0.1001F, -0.2481F, 1.1419F));

		PartDefinition cube_r288 = body1.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(144, 123).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, -0.0635F, 0.4703F, 0.2508F, -0.1423F, 0.5969F));

		PartDefinition cube_r289 = body1.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(104, 52).addBox(-0.5357F, -0.1F, -2.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2908F, 1.4433F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(40, 104).addBox(-0.5357F, -0.5778F, -0.0329F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3008F, 5.043F, -0.1248F, 0.0F, 0.0F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(131, 96).addBox(-0.2279F, -0.2807F, -0.4087F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6143F, 1.4361F, 3.1118F, 1.4115F, 0.4808F, -0.3622F));

		PartDefinition cube_r290 = leftleg1.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(143, 30).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2721F, 10.594F, 1.5019F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r291 = leftleg1.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(143, 27).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(5, 143).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, 9.766F, 0.3647F, 0.32F, 0.0219F, -0.0034F));

		PartDefinition cube_r292 = leftleg1.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(140, 86).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2721F, 7.8239F, -0.0857F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftleg1.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(59, 138).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, 4.8403F, -0.3992F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r294 = leftleg1.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(140, 47).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, -0.5497F, -0.1292F, 0.8901F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2556F, 11.0069F, 1.6021F, 0.2866F, -0.0657F, 0.3633F));

		PartDefinition cube_r295 = leftleg2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(67, 103).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 103).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.5921F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5693F, 16.9914F, 1.4316F, 0.0528F, -0.1307F, 0.0455F));

		PartDefinition cube_r296 = leftfoot.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(44, 85).addBox(1.3F, -3.4F, 4.1F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 8.65F, -5.85F, 0.7959F, -0.0812F, 0.1926F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5279F, -0.2807F, 1.0913F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(109, 133).addBox(-0.7721F, -0.2807F, -0.4087F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6858F, 1.4361F, 3.1118F, 1.4115F, -0.4808F, 0.3622F));

		PartDefinition cube_r297 = rightleg1.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(144, 57).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2721F, 10.594F, 1.5019F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightleg1.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(144, 54).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(52, 144).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2721F, 9.766F, 0.3647F, 0.32F, -0.0219F, 0.0034F));

		PartDefinition cube_r299 = rightleg1.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(141, 16).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2721F, 7.8239F, -0.0857F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightleg1.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(64, 138).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2721F, 4.8403F, -0.3992F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightleg1.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(138, 140).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2721F, -0.5497F, -0.1292F, 0.8901F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2556F, 11.0069F, 1.6021F, 0.2866F, 0.0657F, -0.3633F));

		PartDefinition cube_r302 = rightleg2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(20, 104).addBox(0.15F, -2.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 104).addBox(-0.95F, -2.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0191F, 1.5921F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5693F, 16.9914F, 1.4316F, 0.0528F, 0.1307F, -0.0455F));

		PartDefinition cube_r303 = rightfoot.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(65, 85).addBox(-4.3F, -3.4F, 4.1F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 8.65F, -5.85F, 0.7959F, 0.0812F, -0.1926F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5279F, -0.2807F, 1.0913F, 0.1367F, 0.0F, 0.0F));

		PartDefinition bone2 = body1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 0.5258F, 2.6024F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r304 = bone2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(88, 140).addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -1.8379F, 1.6531F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r305 = bone2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(143, 115).addBox(-0.5F, 0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, -2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r306 = bone2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(143, 99).addBox(-0.5F, -0.9F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(143, 96).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.2199F, 2.8323F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r307 = bone2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(143, 83).addBox(-0.5F, 0.0F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r308 = bone2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(143, 80).addBox(-0.5F, -0.375F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r309 = bone2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(139, 59).addBox(-0.5F, -0.7328F, -1.2997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r310 = bone2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(135, 0).addBox(-0.8952F, -0.5051F, -0.0296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, -1.2567F, -0.3222F, 0.4341F));

		PartDefinition cube_r311 = bone2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(143, 77).addBox(-0.8952F, -1.5986F, -0.7405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(143, 74).addBox(-0.8952F, -1.9986F, -1.1405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, -2.7403F, -0.3222F, 0.4341F));

		PartDefinition cube_r312 = bone2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(121, 133).addBox(-0.8952F, -0.5233F, -2.2233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, 2.6703F, -0.3222F, 0.4341F));

		PartDefinition cube_r313 = bone2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(143, 71).addBox(-0.8952F, -0.3689F, -0.896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, 2.4608F, -0.3222F, 0.4341F));

		PartDefinition cube_r314 = bone2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(114, 138).addBox(-0.9886F, -0.7921F, -1.2523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, 2.1233F, -0.1932F, 0.2455F));

		PartDefinition cube_r315 = bone2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(67, 143).addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r316 = bone2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(62, 143).addBox(-1.7406F, -2.5459F, -4.0436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, 1.405F, 0.3054F, -0.2443F));

		PartDefinition cube_r317 = bone2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(57, 143).addBox(-1.7406F, -4.4603F, 1.2584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, 2.7576F, 0.3054F, -0.2443F));

		PartDefinition cube_r318 = bone2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(134, 113).addBox(-1.7406F, -3.2548F, 1.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, -3.1067F, 0.3054F, -0.2443F));

		PartDefinition cube_r319 = bone2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(134, 109).addBox(-1.7406F, -1.9141F, 2.0834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, -2.5831F, 0.3054F, -0.2443F));

		PartDefinition cube_r320 = bone2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(88, 136).addBox(-0.8804F, -0.7235F, 0.0139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.1686F, 1.3632F, 0.5289F, -1.3325F, -0.1932F, 0.5073F));

		PartDefinition cube_r321 = bone2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(136, 28).addBox(-0.8804F, -0.4678F, -0.0372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.1686F, 1.3632F, 0.5289F, -1.3674F, -0.1932F, 0.5073F));

		PartDefinition cube_r322 = bone2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(134, 105).addBox(-0.8804F, 0.0548F, 0.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.1686F, 1.3632F, 0.5289F, -1.507F, -0.1932F, 0.5073F));

		PartDefinition cube_r323 = bone2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(105, 125).addBox(-0.9F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.4244F, 1.024F, -0.2161F, -0.6487F, -0.0304F, -0.0149F));

		PartDefinition cube_r324 = bone2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(125, 32).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4244F, 1.024F, -0.2161F, -0.9977F, -0.0304F, -0.0149F));

		PartDefinition cube_r325 = bone2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(47, 143).addBox(-0.9886F, 0.2024F, -0.0762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, -1.027F, -0.1932F, 0.2455F));

		PartDefinition cube_r326 = bone2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(67, 122).addBox(-0.8402F, -4.3622F, -0.7186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, 1.3327F, -0.2606F, 0.0105F));

		PartDefinition cube_r327 = bone2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(143, 44).addBox(-0.7327F, -0.6106F, -2.641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.1047F, -0.2182F, 0.0F));

		PartDefinition cube_r328 = bone2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(95, 136).addBox(-0.5F, -0.3003F, -1.2895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.4014F, -0.0873F, 0.0F));

		PartDefinition cube_r329 = bone2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(69, 134).addBox(-0.5F, -0.7003F, -1.8895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.0524F, -0.0873F, 0.0F));

		PartDefinition cube_r330 = bone2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(94, 120).addBox(-0.5F, -0.9329F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 0.699F, -0.0956F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r331 = bone2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(143, 41).addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r332 = bone2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(143, 33).addBox(-0.9886F, -0.1148F, -0.5722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, 0.1162F, -0.1932F, 0.2455F));

		PartDefinition bone3 = body1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4715F, 0.5258F, 2.6024F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r333 = bone3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(88, 140).mirror().addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8379F, 1.6531F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r334 = bone3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(143, 115).mirror().addBox(-0.5F, 0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, -2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r335 = bone3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(143, 99).mirror().addBox(-0.5F, -0.9F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(143, 96).mirror().addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2199F, 2.8323F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r336 = bone3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(143, 83).mirror().addBox(-0.5F, 0.0F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r337 = bone3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(143, 80).mirror().addBox(-0.5F, -0.375F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r338 = bone3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(139, 59).mirror().addBox(-0.5F, -0.7328F, -1.2997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r339 = bone3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(135, 0).mirror().addBox(-0.1048F, -0.5051F, -0.0296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, -1.2567F, 0.3222F, -0.4341F));

		PartDefinition cube_r340 = bone3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(143, 77).mirror().addBox(-0.1048F, -1.5986F, -0.7405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(143, 74).mirror().addBox(-0.1048F, -1.9986F, -1.1405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, -2.7403F, 0.3222F, -0.4341F));

		PartDefinition cube_r341 = bone3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(121, 133).mirror().addBox(-0.1048F, -0.5233F, -2.2233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, 2.6703F, 0.3222F, -0.4341F));

		PartDefinition cube_r342 = bone3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(143, 71).mirror().addBox(-0.1048F, -0.3689F, -0.896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, 2.4608F, 0.3222F, -0.4341F));

		PartDefinition cube_r343 = bone3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(114, 138).mirror().addBox(-0.0114F, -0.7921F, -1.2523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, 2.1233F, 0.1932F, -0.2455F));

		PartDefinition cube_r344 = bone3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(67, 143).mirror().addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r345 = bone3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(62, 143).mirror().addBox(0.7406F, -2.5459F, -4.0436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, 1.405F, -0.3054F, 0.2443F));

		PartDefinition cube_r346 = bone3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(57, 143).mirror().addBox(0.7406F, -4.4603F, 1.2584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, 2.7576F, -0.3054F, 0.2443F));

		PartDefinition cube_r347 = bone3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(134, 113).mirror().addBox(0.7406F, -3.2548F, 1.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, -3.1067F, -0.3054F, 0.2443F));

		PartDefinition cube_r348 = bone3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(134, 109).mirror().addBox(0.7406F, -1.9141F, 2.0834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2253F, 0.3661F, -2.5831F, -0.3054F, 0.2443F));

		PartDefinition cube_r349 = bone3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(88, 136).mirror().addBox(-0.1196F, -0.7235F, 0.0139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, 1.3632F, 0.5289F, -1.3325F, 0.1932F, -0.5073F));

		PartDefinition cube_r350 = bone3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(136, 28).mirror().addBox(-0.1196F, -0.4678F, -0.0372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, 1.3632F, 0.5289F, -1.3674F, 0.1932F, -0.5073F));

		PartDefinition cube_r351 = bone3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(134, 105).mirror().addBox(-0.1196F, 0.0548F, 0.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, 1.3632F, 0.5289F, -1.507F, 0.1932F, -0.5073F));

		PartDefinition cube_r352 = bone3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(105, 125).mirror().addBox(-0.1F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(-0.4244F, 1.024F, -0.2161F, -0.6487F, 0.0304F, 0.0149F));

		PartDefinition cube_r353 = bone3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(125, 32).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4244F, 1.024F, -0.2161F, -0.9977F, 0.0304F, 0.0149F));

		PartDefinition cube_r354 = bone3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(47, 143).mirror().addBox(-0.0114F, 0.2024F, -0.0762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, -1.027F, 0.1932F, -0.2455F));

		PartDefinition cube_r355 = bone3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(67, 122).mirror().addBox(-0.1598F, -4.3622F, -0.7186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, 1.3327F, 0.2606F, -0.0105F));

		PartDefinition cube_r356 = bone3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(143, 44).mirror().addBox(-0.2673F, -0.6106F, -2.641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.1047F, 0.2182F, 0.0F));

		PartDefinition cube_r357 = bone3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(95, 136).mirror().addBox(-0.5F, -0.3003F, -1.2895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.4014F, 0.0873F, 0.0F));

		PartDefinition cube_r358 = bone3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(69, 134).mirror().addBox(-0.5F, -0.7003F, -1.8895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.0524F, 0.0873F, 0.0F));

		PartDefinition cube_r359 = bone3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(94, 120).mirror().addBox(-0.5F, -0.9329F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.699F, -0.0956F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r360 = bone3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(143, 41).mirror().addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r361 = bone3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(143, 33).mirror().addBox(-0.0114F, -0.1148F, -0.5722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, 0.1162F, 0.1932F, -0.2455F));

		PartDefinition bone = chest1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7781F, 1.5286F, 2.3873F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r362 = bone.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(25, 119).addBox(-0.1F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0987F, 3.7103F, -0.2631F, 2.3056F, -0.1362F, 0.4506F));

		PartDefinition cube_r363 = bone.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(124, 0).addBox(-0.5898F, -0.4749F, -1.2806F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3908F, -0.4928F, -0.3403F, 0.3259F, 0.0876F, -0.4404F));

		PartDefinition cube_r364 = bone.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(136, 96).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.1101F, -1.6666F, 1.7807F, 0.1005F, 0.0851F, -0.4847F));

		PartDefinition cube_r365 = bone.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(133, 92).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.0406F, -1.2335F, 0.1353F, 0.2751F, 0.0851F, -0.4847F));

		PartDefinition cube_r366 = bone.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(14, 136).addBox(-0.5768F, -0.8534F, 0.5224F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.3908F, -0.4928F, -0.3403F, 0.1878F, 0.0851F, -0.4847F));

		PartDefinition cube_r367 = bone.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(21, 137).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.3312F, 2.1141F, -1.3818F, 1.6966F, 0.1714F, -0.4248F));

		PartDefinition cube_r368 = bone.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(144, 66).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.258F, 2.4098F, -2.4714F, 2.5692F, 0.1714F, -0.4248F));

		PartDefinition cube_r369 = bone.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(17, 141).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.4655F, 0.9392F, -3.1417F, -2.754F, 0.1714F, -0.4248F));

		PartDefinition cube_r370 = bone.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(10, 144).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2011F, 0.3029F, -3.0185F, -1.7504F, 0.1714F, -0.4248F));

		PartDefinition cube_r371 = bone.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(132, 122).addBox(-0.5F, -1.05F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.3851F, 0.2797F, -1.9947F, -1.0087F, 0.1714F, -0.4248F));

		PartDefinition bone4 = chest1.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8496F, 1.5286F, 2.3873F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r372 = bone4.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(25, 119).mirror().addBox(-0.9F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0987F, 3.7103F, -0.2631F, 2.3056F, 0.1362F, -0.4506F));

		PartDefinition cube_r373 = bone4.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(124, 0).mirror().addBox(-0.4102F, -0.4749F, -1.2806F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.4928F, -0.3403F, 0.3259F, -0.0876F, 0.4404F));

		PartDefinition cube_r374 = bone4.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(136, 96).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.1101F, -1.6666F, 1.7807F, 0.1005F, -0.0851F, 0.4847F));

		PartDefinition cube_r375 = bone4.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(133, 92).mirror().addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.0406F, -1.2335F, 0.1353F, 0.2751F, -0.0851F, 0.4847F));

		PartDefinition cube_r376 = bone4.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(14, 136).mirror().addBox(-0.4232F, -0.8534F, 0.5224F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.4928F, -0.3403F, 0.1878F, -0.0851F, 0.4847F));

		PartDefinition cube_r377 = bone4.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(21, 137).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.3312F, 2.1141F, -1.3818F, 1.6966F, -0.1714F, 0.4248F));

		PartDefinition cube_r378 = bone4.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(144, 66).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.258F, 2.4098F, -2.4714F, 2.5692F, -0.1714F, 0.4248F));

		PartDefinition cube_r379 = bone4.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(17, 141).mirror().addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.4655F, 0.9392F, -3.1417F, -2.754F, -0.1714F, 0.4248F));

		PartDefinition cube_r380 = bone4.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(10, 144).mirror().addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2011F, 0.3029F, -3.0185F, -1.7504F, -0.1714F, 0.4248F));

		PartDefinition cube_r381 = bone4.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(132, 122).mirror().addBox(-0.5F, -1.05F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.3851F, 0.2797F, -1.9947F, -1.0087F, -0.1714F, 0.4248F));

		return LayerDefinition.create(meshdefinition, 150, 150);
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