package fossils.fossils.client.blockentity.model.keresdrakon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KeresdrakonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest1;
	private final ModelPart neck1;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart crest1;
	private final ModelPart crest2;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftwing1;
	private final ModelPart leftwing2;
	private final ModelPart leftwing3;
	private final ModelPart leftwing4;
	private final ModelPart leftwing5;
	private final ModelPart leftwing6;
	private final ModelPart leftwing7;
	private final ModelPart lefthand2;
	private final ModelPart rightwing1;
	private final ModelPart rightwing2;
	private final ModelPart rightwing3;
	private final ModelPart rightwing4;
	private final ModelPart rightwing5;
	private final ModelPart rightwing6;
	private final ModelPart rightwing7;
	private final ModelPart righthand2;
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

	public KeresdrakonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest1 = this.root.getChild("chest1");
		this.neck1 = this.chest1.getChild("neck1");
		this.neck = this.neck1.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.crest1 = this.head.getChild("crest1");
		this.crest2 = this.crest1.getChild("crest2");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftwing1 = this.chest1.getChild("leftwing1");
		this.leftwing2 = this.leftwing1.getChild("leftwing2");
		this.leftwing3 = this.leftwing2.getChild("leftwing3");
		this.leftwing4 = this.leftwing3.getChild("leftwing4");
		this.leftwing5 = this.leftwing4.getChild("leftwing5");
		this.leftwing6 = this.leftwing5.getChild("leftwing6");
		this.leftwing7 = this.leftwing6.getChild("leftwing7");
		this.lefthand2 = this.leftwing4.getChild("lefthand2");
		this.rightwing1 = this.chest1.getChild("rightwing1");
		this.rightwing2 = this.rightwing1.getChild("rightwing2");
		this.rightwing3 = this.rightwing2.getChild("rightwing3");
		this.rightwing4 = this.rightwing3.getChild("rightwing4");
		this.rightwing5 = this.rightwing4.getChild("rightwing5");
		this.rightwing6 = this.rightwing5.getChild("rightwing6");
		this.rightwing7 = this.rightwing6.getChild("rightwing7");
		this.righthand2 = this.rightwing4.getChild("righthand2");
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

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -30.054F, 0.9051F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create().texOffs(75, 26).addBox(-0.0357F, -1.5684F, 0.8969F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0357F, -10.8768F, 4.3614F, -0.74F, 0.0F, 0.0F));

		PartDefinition chest6_r1 = chest1.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(12, 109).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0357F, 7.7546F, 0.7431F, 1.6581F, 0.0F, 0.0F));

		PartDefinition chest5_r1 = chest1.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(111, 109).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0357F, 8.0546F, 1.2628F, 1.0472F, 0.0F, 0.0F));

		PartDefinition chest4_r1 = chest1.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(84, 111).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0357F, 8.2099F, 1.8423F, -0.2618F, 0.0F, 0.0F));

		PartDefinition chest5_r2 = chest1.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(32, 106).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0357F, 8.1785F, 4.0378F, -2.6529F, 0.0F, 0.0F));

		PartDefinition chest4_r2 = chest1.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(25, 98).addBox(-0.5F, -1.8F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0357F, 8.2622F, 2.44F, -1.5184F, 0.0F, 0.0F));

		PartDefinition chest3_r1 = chest1.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(108, 20).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0357F, 8.2622F, 2.44F, -0.0873F, 0.0F, 0.0F));

		PartDefinition chest5_r3 = chest1.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(5, 112).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6177F, 7.22F, 2.7939F, -0.7239F, -0.234F, -1.2713F));

		PartDefinition chest4_r3 = chest1.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(112, 0).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6177F, 7.22F, 2.7939F, 0.2612F, -0.0797F, -1.169F));

		PartDefinition chest5_r4 = chest1.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(86, 62).mirror().addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0357F, 7.5908F, 5.7698F, 0.0147F, -0.0094F, 0.5672F));

		PartDefinition cube_r1 = chest1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(88, 54).mirror().addBox(-5.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.11F, 0.3177F, -1.5054F));

		PartDefinition cube_r2 = chest1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(49, 95).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.2554F, 0.2202F, -0.9711F));

		PartDefinition cube_r3 = chest1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(57, 85).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.3672F, 0.0415F, -0.4514F));

		PartDefinition chest3_r2 = chest1.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(103, 41).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0357F, 6.627F, 3.8225F, -0.0549F, -0.305F, 0.0165F));

		PartDefinition chest4_r4 = chest1.addOrReplaceChild("chest4_r4", CubeListBuilder.create().texOffs(86, 62).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9643F, 7.5908F, 5.7698F, 0.0147F, 0.0094F, -0.5672F));

		PartDefinition chest3_r3 = chest1.addOrReplaceChild("chest3_r3", CubeListBuilder.create().texOffs(79, 42).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0357F, 7.6257F, 3.7701F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest4_r5 = chest1.addOrReplaceChild("chest4_r5", CubeListBuilder.create().texOffs(5, 112).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5463F, 7.22F, 2.7939F, -0.7239F, 0.234F, 1.2713F));

		PartDefinition chest3_r4 = chest1.addOrReplaceChild("chest3_r4", CubeListBuilder.create().texOffs(112, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5463F, 7.22F, 2.7939F, 0.2612F, 0.0797F, 1.169F));

		PartDefinition chest2_r1 = chest1.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(103, 41).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9643F, 6.627F, 3.8225F, -0.0549F, 0.305F, -0.0165F));

		PartDefinition cube_r4 = chest1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(57, 85).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.3672F, -0.0415F, 0.4514F));

		PartDefinition cube_r5 = chest1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 95).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.2554F, -0.2202F, 0.9711F));

		PartDefinition cube_r6 = chest1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(88, 54).addBox(2.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.11F, -0.3177F, 1.5054F));

		PartDefinition chest1_r1 = chest1.addOrReplaceChild("chest1_r1", CubeListBuilder.create().texOffs(104, 16).addBox(-0.5357F, -0.3123F, 0.6852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4212F, -0.7096F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4982F, -0.0053F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(17, 57).addBox(-0.0357F, -1.7317F, -1.0517F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7555F, 0.1133F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(32, 102).addBox(-0.5357F, -0.9F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.5867F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck = neck1.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0419F, -1.7073F, 0.1363F, 0.0924F, -0.0312F));

		PartDefinition neck2_r1 = neck.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(76, 97).addBox(-0.5357F, -0.8259F, -3.0016F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3956F, -0.0591F, -0.1658F, 0.0F, 0.0F));

		PartDefinition neck2_r2 = neck.addOrReplaceChild("neck2_r2", CubeListBuilder.create().texOffs(56, 106).addBox(-0.0357F, -1.6F, -1.3F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8475F, -1.2722F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(79, 35).addBox(-0.5357F, -0.4179F, -4.9187F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5172F, -2.9117F, -0.1548F, 0.0F, 0.0F));

		PartDefinition neck3_r2 = neck2.addOrReplaceChild("neck3_r2", CubeListBuilder.create().texOffs(106, 60).addBox(0.0F, -0.5F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -1.6696F, -2.6769F, 0.2094F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0535F, -4.8395F, -0.1005F, 0.0F, 0.0F));

		PartDefinition neck4_r1 = neck3.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(63, 55).addBox(0.0F, -1.2F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -1.5889F, -1.4342F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck3_r3 = neck3.addOrReplaceChild("neck3_r3", CubeListBuilder.create().texOffs(80, 21).addBox(-0.5357F, -0.3F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.198F, -0.4517F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2117F, -2.9583F, -0.096F, 0.0F, 0.0F));

		PartDefinition neck5_r1 = neck4.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(33, 95).addBox(-0.0357F, -2.5F, -9.4F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(67, 85).addBox(-0.5357F, -0.3F, -9.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.2967F, 5.5443F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3414F, -3.8782F, -0.0262F, 0.0F, 0.0F));

		PartDefinition neck6_r1 = neck5.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(66, 106).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -1.251F, -1.8721F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck5_r2 = neck5.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(85, 69).addBox(-0.5357F, -0.3F, -9.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.2993F, 5.5209F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.75F, -3.95F, 0.3054F, 0.0F, 0.0F));

		PartDefinition neck8_r1 = neck6.addOrReplaceChild("neck8_r1", CubeListBuilder.create().texOffs(17, 109).addBox(-0.003F, -0.1F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -0.9631F, -0.8585F, 0.9163F, 0.0F, 0.0F));

		PartDefinition neck7_r1 = neck6.addOrReplaceChild("neck7_r1", CubeListBuilder.create().texOffs(115, 30).addBox(0.0F, -0.025F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -0.9631F, -0.8585F, 0.4363F, 0.0F, 0.0F));

		PartDefinition neck6_r2 = neck6.addOrReplaceChild("neck6_r2", CubeListBuilder.create().texOffs(47, 102).addBox(-0.5357F, -0.3F, -7.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.6993F, 5.5209F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0747F, -1.6898F, 0.7821F, 0.155F, -0.1542F));

		PartDefinition head7_r1 = head.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(97, 64).addBox(-0.9663F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0694F, 0.8092F, -1.5454F, -2.042F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(57, 87).addBox(-0.9663F, 0.1F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0694F, 0.185F, -0.4007F, -2.5656F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(97, 59).addBox(-0.9663F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0694F, 0.185F, -0.4007F, -2.8274F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(106, 9).addBox(-1.5F, -0.85F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4643F, -2.4134F, -0.1165F, 0.2793F, 0.0F, 0.0F));

		PartDefinition head6_r2 = head.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(107, 4).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0357F, -2.3991F, -1.7625F, -1.3439F, 0.0F, 0.0F));

		PartDefinition head4_r2 = head.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(105, 106).addBox(-1.0F, -0.525F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0357F, -2.4845F, -1.1474F, -0.733F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(101, 26).addBox(-1.0F, 0.0F, -1.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 65).addBox(-1.0F, -0.225F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0357F, -2.181F, 0.4043F, -0.5149F, 0.0F, 0.0F));

		PartDefinition head4_r3 = head.addOrReplaceChild("head4_r3", CubeListBuilder.create().texOffs(98, 106).addBox(-1.0F, 0.7F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(91, 106).addBox(-1.0F, -0.1F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0357F, -2.181F, 0.4043F, 0.6632F, 0.0F, 0.0F));

		PartDefinition head12_r1 = head.addOrReplaceChild("head12_r1", CubeListBuilder.create().texOffs(58, 97).addBox(-0.5F, -0.75F, -0.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, -6.6336F, -29.6946F, -0.1353F, 0.0F, 0.0F));

		PartDefinition head11_r1 = head.addOrReplaceChild("head11_r1", CubeListBuilder.create().texOffs(97, 54).addBox(-0.5F, -0.75F, -2.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.0357F, -6.5137F, -27.1974F, -0.048F, 0.0F, 0.0F));

		PartDefinition head10_r1 = head.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(49, 97).addBox(-0.5F, -0.85F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -6.3254F, -24.4966F, 0.0044F, 0.0F, 0.0F));

		PartDefinition head9_r1 = head.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(67, 78).addBox(-0.5F, -0.15F, -4.85F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -7.2094F, -19.8277F, 0.0393F, 0.0F, 0.0F));

		PartDefinition head8_r1 = head.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(89, 102).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -7.1279F, -18.1297F, -0.048F, 0.0F, 0.0F));

		PartDefinition head7_r2 = head.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(11, 97).addBox(-0.5F, -0.15F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -6.9043F, -15.4389F, -0.0829F, 0.0F, 0.0F));

		PartDefinition head8_r2 = head.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(101, 21).addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -2.6699F, 4.2825F, 2.8623F, 0.0F, 0.0F));

		PartDefinition head7_r3 = head.addOrReplaceChild("head7_r3", CubeListBuilder.create().texOffs(80, 78).addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -1.0358F, 3.8139F, 2.4696F, 0.0F, 0.0F));

		PartDefinition head6_r3 = head.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(100, 84).addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -4.3358F, 3.9436F, -2.9409F, 0.0F, 0.0F));

		PartDefinition head5_r2 = head.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(40, 100).addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -5.8888F, 3.2521F, -2.7227F, 0.0F, 0.0F));

		PartDefinition head6_r4 = head.addOrReplaceChild("head6_r4", CubeListBuilder.create().texOffs(110, 30).addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -6.307F, 3.5032F, -3.1329F, 0.0F, 0.0F));

		PartDefinition head5_r3 = head.addOrReplaceChild("head5_r3", CubeListBuilder.create().texOffs(106, 109).addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -6.6779F, 2.9096F, 2.3387F, 0.0F, 0.0F));

		PartDefinition head4_r4 = head.addOrReplaceChild("head4_r4", CubeListBuilder.create().texOffs(101, 109).addBox(-0.5F, -1.05F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -5.9922F, 2.4976F, 2.6005F, 0.0F, 0.0F));

		PartDefinition head3_r2 = head.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(79, 26).addBox(-0.5357F, -0.6011F, -0.1342F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.1497F)), PartPose.offsetAndRotation(0.0F, -4.9243F, -1.0829F, 0.1571F, 0.0F, 0.0F));

		PartDefinition head3_r3 = head.addOrReplaceChild("head3_r3", CubeListBuilder.create().texOffs(89, 85).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -5.7629F, -3.7209F, -0.5411F, 0.0F, 0.0F));

		PartDefinition head2_r1 = head.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(78, 85).addBox(-0.5357F, -0.6261F, -1.1342F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -5.2277F, -2.7675F, -0.0611F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0007F, 1.7134F, -1.2891F, 0.1493F, -0.0006F, -0.0013F));

		PartDefinition jaw9_r1 = jaw.addOrReplaceChild("jaw9_r1", CubeListBuilder.create().texOffs(77, 114).mirror().addBox(-1.0674F, 0.1992F, -13.8866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(79, 91).mirror().addBox(-1.0674F, 0.1992F, -13.1866F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.4496F, -0.8756F, -16.0885F, 0.0361F, -0.0079F, 0.0164F));

		PartDefinition jaw9_r2 = jaw.addOrReplaceChild("jaw9_r2", CubeListBuilder.create().texOffs(91, 75).mirror().addBox(-1.0674F, 0.2541F, -6.3912F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 97).mirror().addBox(-1.0674F, -0.2459F, -5.3912F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4496F, -0.8756F, -16.0885F, 0.1146F, -0.0079F, 0.0164F));

		PartDefinition jaw11_r1 = jaw.addOrReplaceChild("jaw11_r1", CubeListBuilder.create().texOffs(20, 98).mirror().addBox(-1.0674F, 0.0805F, 0.5046F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4496F, -0.8756F, -16.0885F, -1.3646F, -0.0079F, 0.0164F));

		PartDefinition jaw10_r1 = jaw.addOrReplaceChild("jaw10_r1", CubeListBuilder.create().texOffs(114, 75).mirror().addBox(-1.0674F, 1.5685F, -5.6345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4496F, -0.8756F, -16.0885F, -0.0119F, -0.0079F, 0.0164F));

		PartDefinition jaw9_r3 = jaw.addOrReplaceChild("jaw9_r3", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-1.0674F, 2.5079F, -7.1028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4496F, -0.8756F, -16.0885F, -0.1865F, -0.0079F, 0.0164F));

		PartDefinition jaw8_r1 = jaw.addOrReplaceChild("jaw8_r1", CubeListBuilder.create().texOffs(103, 102).mirror().addBox(-1.0674F, 2.2655F, -8.9862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4496F, -0.8756F, -16.0885F, -0.1516F, -0.0079F, 0.0164F));

		PartDefinition jaw9_r4 = jaw.addOrReplaceChild("jaw9_r4", CubeListBuilder.create().texOffs(90, 91).mirror().addBox(-1.0674F, 2.0033F, -12.9137F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4496F, -0.8756F, -16.0885F, -0.1036F, -0.0079F, 0.0164F));

		PartDefinition jaw7_r1 = jaw.addOrReplaceChild("jaw7_r1", CubeListBuilder.create().texOffs(68, 91).mirror().addBox(-1.0674F, -0.0583F, -9.3616F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(94, 97).mirror().addBox(-1.0674F, -0.1623F, -2.3983F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4496F, -0.8756F, -16.0885F, 0.0797F, -0.0079F, 0.0164F));

		PartDefinition jaw8_r2 = jaw.addOrReplaceChild("jaw8_r2", CubeListBuilder.create().texOffs(14, 105).mirror().addBox(-0.568F, -0.318F, -16.1364F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4504F, -0.8756F, -0.2885F, 0.0532F, -0.0253F, 0.0164F));

		PartDefinition jaw8_r3 = jaw.addOrReplaceChild("jaw8_r3", CubeListBuilder.create().texOffs(105, 0).mirror().addBox(-0.568F, -1.1125F, -12.1529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4504F, -0.8756F, -0.2885F, 0.1143F, -0.0253F, 0.0164F));

		PartDefinition jaw7_r2 = jaw.addOrReplaceChild("jaw7_r2", CubeListBuilder.create().texOffs(103, 37).mirror().addBox(-0.568F, -0.6883F, -14.1494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4504F, -0.8756F, -0.2885F, 0.0794F, -0.0253F, 0.0164F));

		PartDefinition jaw6_r1 = jaw.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(104, 79).mirror().addBox(-0.568F, -0.4016F, -10.2057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(17, 61).mirror().addBox(-0.568F, -0.9016F, -15.2057F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(44, 106).mirror().addBox(-0.568F, 0.0284F, -1.5204F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4504F, -0.8756F, -0.2885F, 0.0445F, -0.0253F, 0.0164F));

		PartDefinition jaw7_r3 = jaw.addOrReplaceChild("jaw7_r3", CubeListBuilder.create().texOffs(93, 12).mirror().addBox(-0.0014F, -0.9F, 0.0001F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0122F, 1.5231F, -6.3639F, 0.0018F, -0.2088F, -0.0139F));

		PartDefinition jaw6_r2 = jaw.addOrReplaceChild("jaw6_r2", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-0.622F, -0.4824F, 3.9187F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0122F, 1.5231F, -6.3639F, 0.1044F, -0.0526F, 0.0027F));

		PartDefinition jaw5_r1 = jaw.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-0.568F, 0.1178F, -8.3032F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4504F, -0.8756F, -0.2885F, -0.0166F, -0.0253F, 0.0164F));

		PartDefinition jaw5_r2 = jaw.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(100, 5).mirror().addBox(-0.568F, -0.135F, -1.5199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4504F, -0.8756F, -0.2885F, -0.0253F, -0.0253F, 0.0164F));

		PartDefinition jaw4_r1 = jaw.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(68, 69).mirror().addBox(-0.568F, -0.111F, -8.2544F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4504F, -0.8756F, -0.2885F, -0.0515F, -0.0253F, 0.0164F));

		PartDefinition jaw6_r3 = jaw.addOrReplaceChild("jaw6_r3", CubeListBuilder.create().texOffs(93, 12).addBox(0.0014F, -0.9F, 0.0001F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0578F, 1.5231F, -6.3639F, 0.0018F, 0.2088F, 0.0139F));

		PartDefinition jaw5_r3 = jaw.addOrReplaceChild("jaw5_r3", CubeListBuilder.create().texOffs(98, 0).addBox(0.622F, -0.4824F, 3.9187F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0578F, 1.5231F, -6.3639F, 0.1044F, 0.0526F, -0.0027F));

		PartDefinition jaw4_r2 = jaw.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(70, 0).addBox(-0.432F, 0.1178F, -8.3032F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3803F, -0.8756F, -0.2885F, -0.0166F, 0.0253F, -0.0164F));

		PartDefinition jaw4_r3 = jaw.addOrReplaceChild("jaw4_r3", CubeListBuilder.create().texOffs(100, 5).addBox(-0.432F, -0.135F, -1.5199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3803F, -0.8756F, -0.2885F, -0.0253F, 0.0253F, -0.0164F));

		PartDefinition jaw7_r4 = jaw.addOrReplaceChild("jaw7_r4", CubeListBuilder.create().texOffs(105, 0).addBox(-0.432F, -1.1125F, -12.1529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3803F, -0.8756F, -0.2885F, 0.1143F, 0.0253F, -0.0164F));

		PartDefinition jaw7_r5 = jaw.addOrReplaceChild("jaw7_r5", CubeListBuilder.create().texOffs(14, 105).addBox(-0.432F, -0.318F, -16.1364F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3803F, -0.8756F, -0.2885F, 0.0532F, 0.0253F, -0.0164F));

		PartDefinition jaw6_r4 = jaw.addOrReplaceChild("jaw6_r4", CubeListBuilder.create().texOffs(103, 37).addBox(-0.432F, -0.6883F, -14.1494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3803F, -0.8756F, -0.2885F, 0.0794F, 0.0253F, -0.0164F));

		PartDefinition jaw5_r4 = jaw.addOrReplaceChild("jaw5_r4", CubeListBuilder.create().texOffs(104, 79).addBox(-0.432F, -0.4016F, -10.2057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(17, 61).addBox(-0.432F, -0.9016F, -15.2057F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.006F))
				.texOffs(44, 106).addBox(-0.432F, 0.0284F, -1.5204F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3803F, -0.8756F, -0.2885F, 0.0445F, 0.0253F, -0.0164F));

		PartDefinition jaw8_r4 = jaw.addOrReplaceChild("jaw8_r4", CubeListBuilder.create().texOffs(91, 75).addBox(0.0674F, 0.2541F, -6.3912F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(67, 97).addBox(0.0674F, -0.2459F, -5.3912F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5197F, -0.8756F, -16.0885F, 0.1146F, 0.0079F, -0.0164F));

		PartDefinition jaw8_r5 = jaw.addOrReplaceChild("jaw8_r5", CubeListBuilder.create().texOffs(90, 91).addBox(0.0674F, 2.0033F, -12.9137F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5197F, -0.8756F, -16.0885F, -0.1036F, 0.0079F, -0.0164F));

		PartDefinition jaw8_r6 = jaw.addOrReplaceChild("jaw8_r6", CubeListBuilder.create().texOffs(77, 114).addBox(0.0674F, 0.1992F, -13.8866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(79, 91).addBox(0.0674F, 0.1992F, -13.1866F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.5197F, -0.8756F, -16.0885F, 0.0361F, 0.0079F, -0.0164F));

		PartDefinition jaw10_r2 = jaw.addOrReplaceChild("jaw10_r2", CubeListBuilder.create().texOffs(20, 98).addBox(0.0674F, 0.0805F, 0.5046F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5197F, -0.8756F, -16.0885F, -1.3646F, 0.0079F, -0.0164F));

		PartDefinition jaw9_r5 = jaw.addOrReplaceChild("jaw9_r5", CubeListBuilder.create().texOffs(114, 75).addBox(0.0674F, 1.5685F, -5.6345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5197F, -0.8756F, -16.0885F, -0.0119F, 0.0079F, -0.0164F));

		PartDefinition jaw8_r7 = jaw.addOrReplaceChild("jaw8_r7", CubeListBuilder.create().texOffs(0, 104).addBox(0.0674F, 2.5079F, -7.1028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5197F, -0.8756F, -16.0885F, -0.1865F, 0.0079F, -0.0164F));

		PartDefinition jaw7_r6 = jaw.addOrReplaceChild("jaw7_r6", CubeListBuilder.create().texOffs(103, 102).addBox(0.0674F, 2.2655F, -8.9862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5197F, -0.8756F, -16.0885F, -0.1516F, 0.0079F, -0.0164F));

		PartDefinition jaw6_r5 = jaw.addOrReplaceChild("jaw6_r5", CubeListBuilder.create().texOffs(68, 91).addBox(0.0674F, -0.0583F, -9.3616F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(94, 97).addBox(0.0674F, -0.1623F, -2.3983F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5197F, -0.8756F, -16.0885F, 0.0797F, 0.0079F, -0.0164F));

		PartDefinition jaw3_r1 = jaw.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(68, 69).addBox(-0.432F, -0.111F, -8.2544F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3803F, -0.8756F, -0.2885F, -0.0515F, 0.0253F, -0.0164F));

		PartDefinition crest1 = head.addOrReplaceChild("crest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.8125F, 7.031F, -0.0911F, 0.0F, 0.0F));

		PartDefinition crest2 = crest1.addOrReplaceChild("crest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 1.3F, 0.0456F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.0694F, 0.185F, -0.4007F));

		PartDefinition head9_r2 = leftFace.addOrReplaceChild("head9_r2", CubeListBuilder.create().texOffs(47, 114).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.65F, -1.2091F, 0.0004F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head8_r3 = leftFace.addOrReplaceChild("head8_r3", CubeListBuilder.create().texOffs(42, 114).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.65F, -1.603F, 0.6966F, -1.0559F, 0.0F, 0.0F));

		PartDefinition head7_r4 = leftFace.addOrReplaceChild("head7_r4", CubeListBuilder.create().texOffs(37, 114).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.65F, -2.652F, 0.2728F, -1.9722F, 0.0F, 0.0F));

		PartDefinition head8_r4 = leftFace.addOrReplaceChild("head8_r4", CubeListBuilder.create().texOffs(114, 72).addBox(-0.325F, -0.475F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(62, 114).addBox(-0.55F, -0.475F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.675F, -1.967F, -0.0035F, 3.1241F, 0.0F, 0.0F));

		PartDefinition head6_r5 = leftFace.addOrReplaceChild("head6_r5", CubeListBuilder.create().texOffs(114, 12).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.65F, -2.6241F, -0.5267F, -3.1067F, 0.0F, 0.0F));

		PartDefinition head14_r1 = leftFace.addOrReplaceChild("head14_r1", CubeListBuilder.create().texOffs(57, 114).addBox(-0.475F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.825F, -1.0181F, 0.2315F, 1.0123F, 0.0F, 0.0F));

		PartDefinition head13_r1 = leftFace.addOrReplaceChild("head13_r1", CubeListBuilder.create().texOffs(49, 111).addBox(-0.475F, -0.65F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.825F, -0.6643F, 0.5015F, 1.3177F, 0.0F, 0.0F));

		PartDefinition head12_r2 = leftFace.addOrReplaceChild("head12_r2", CubeListBuilder.create().texOffs(111, 54).addBox(-0.475F, -0.025F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(54, 111).addBox(-0.475F, -0.325F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(111, 51).addBox(-0.475F, -0.725F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.825F, -0.4096F, 0.0935F, 1.9722F, 0.0F, 0.0F));

		PartDefinition head14_r2 = leftFace.addOrReplaceChild("head14_r2", CubeListBuilder.create().texOffs(25, 103).addBox(-0.8001F, 1.1419F, 24.3292F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(62, 30).addBox(-0.8001F, 1.1919F, 18.3792F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.95F, 0.2248F, -1.6523F, 2.9347F, -0.0086F, -0.096F));

		PartDefinition head12_r3 = leftFace.addOrReplaceChild("head12_r3", CubeListBuilder.create().texOffs(0, 53).addBox(-0.8001F, 2.1571F, 11.481F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.95F, 0.2248F, -1.6523F, 2.987F, -0.0086F, -0.096F));

		PartDefinition head14_r3 = leftFace.addOrReplaceChild("head14_r3", CubeListBuilder.create().texOffs(72, 114).addBox(-0.8001F, -10.8351F, -7.1548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.95F, 0.2248F, -1.6523F, 0.513F, -0.0086F, -0.096F));

		PartDefinition head15_r1 = leftFace.addOrReplaceChild("head15_r1", CubeListBuilder.create().texOffs(73, 48).addBox(-0.8001F, -5.3599F, -17.8724F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F))
				.texOffs(41, 41).addBox(-0.8001F, -6.1599F, -17.8724F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.95F, 0.2248F, -1.6523F, -0.0717F, -0.0086F, -0.096F));

		PartDefinition head16_r1 = leftFace.addOrReplaceChild("head16_r1", CubeListBuilder.create().texOffs(90, 27).addBox(-0.8001F, -5.0878F, -21.6636F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.95F, 0.2248F, -1.6523F, -0.0891F, -0.0086F, -0.096F));

		PartDefinition head15_r2 = leftFace.addOrReplaceChild("head15_r2", CubeListBuilder.create().texOffs(62, 39).addBox(-0.8001F, -7.3849F, -24.2063F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.95F, 0.2248F, -1.6523F, -0.0019F, -0.0086F, -0.096F));

		PartDefinition head13_r2 = leftFace.addOrReplaceChild("head13_r2", CubeListBuilder.create().texOffs(90, 21).addBox(-0.8001F, -7.696F, -11.6321F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.95F, 0.2248F, -1.6523F, 0.1203F, -0.0086F, -0.096F));

		PartDefinition head12_r4 = leftFace.addOrReplaceChild("head12_r4", CubeListBuilder.create().texOffs(103, 33).addBox(-0.8001F, -4.2406F, 10.5524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.95F, 0.2248F, -1.6523F, 2.4329F, -0.0086F, -0.096F));

		PartDefinition head5_r4 = leftFace.addOrReplaceChild("head5_r4", CubeListBuilder.create().texOffs(110, 34).addBox(-0.9F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0337F, -3.2502F, -0.5269F, 0.2607F, 0.1012F, -0.362F));

		PartDefinition head11_r2 = leftFace.addOrReplaceChild("head11_r2", CubeListBuilder.create().texOffs(51, 61).addBox(-0.8001F, 0.1272F, 5.8114F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.95F, 0.2248F, -1.6523F, 2.8256F, -0.0086F, -0.096F));

		PartDefinition head12_r5 = leftFace.addOrReplaceChild("head12_r5", CubeListBuilder.create().texOffs(67, 114).addBox(-0.8001F, 0.4298F, -0.2887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.95F, 0.2248F, -1.6523F, -2.9907F, -0.0086F, -0.096F));

		PartDefinition head11_r3 = leftFace.addOrReplaceChild("head11_r3", CubeListBuilder.create().texOffs(0, 72).addBox(-0.8001F, 0.0498F, 0.0244F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.95F, 0.2248F, -1.6523F, 2.8125F, -0.0086F, -0.096F));

		PartDefinition head10_r2 = leftFace.addOrReplaceChild("head10_r2", CubeListBuilder.create().texOffs(21, 42).addBox(-0.8001F, -0.1503F, 0.0241F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.95F, 0.2248F, -1.6523F, 2.7907F, -0.0086F, -0.096F));

		PartDefinition head9_r3 = leftFace.addOrReplaceChild("head9_r3", CubeListBuilder.create().texOffs(52, 114).addBox(-0.5F, -1.325F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(32, 114).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.65F, -1.9648F, -0.9798F, 2.6267F, 0.0F, 0.0F));

		PartDefinition head7_r5 = leftFace.addOrReplaceChild("head7_r5", CubeListBuilder.create().texOffs(27, 114).addBox(-0.5F, -0.725F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.65F, -2.0923F, -0.6798F, -2.1729F, 0.0F, 0.0F));

		PartDefinition head4_r5 = leftFace.addOrReplaceChild("head4_r5", CubeListBuilder.create().texOffs(31, 110).addBox(-0.5F, -0.175F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.308F, -4.9065F, -0.7745F, 0.3578F, 0.0131F, 0.0F));

		PartDefinition head3_r4 = leftFace.addOrReplaceChild("head3_r4", CubeListBuilder.create().texOffs(96, 102).addBox(-0.725F, -0.0914F, -1.8228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5337F, -5.0046F, -0.7256F, -0.2793F, 0.0131F, 0.0F));

		PartDefinition head4_r6 = leftFace.addOrReplaceChild("head4_r6", CubeListBuilder.create().texOffs(111, 78).addBox(-0.725F, 0.102F, -0.6462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.5337F, -5.0046F, -0.7256F, -0.5847F, 0.0131F, 0.0F));

		PartDefinition head3_r5 = leftFace.addOrReplaceChild("head3_r5", CubeListBuilder.create().texOffs(82, 102).addBox(-0.725F, -0.2666F, -3.5198F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5337F, -5.0046F, -0.7256F, -0.1745F, 0.0131F, 0.0F));

		PartDefinition head4_r7 = leftFace.addOrReplaceChild("head4_r7", CubeListBuilder.create().texOffs(87, 0).addBox(-0.725F, -0.3841F, -7.2137F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5337F, -5.0046F, -0.7256F, -0.1396F, 0.0131F, 0.0F));

		PartDefinition head5_r5 = leftFace.addOrReplaceChild("head5_r5", CubeListBuilder.create().texOffs(88, 48).addBox(-0.725F, -0.5382F, -10.9069F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5337F, -5.0046F, -0.7256F, -0.1178F, 0.0131F, 0.0F));

		PartDefinition head6_r6 = leftFace.addOrReplaceChild("head6_r6", CubeListBuilder.create().texOffs(11, 91).addBox(-0.725F, -1.2737F, -10.8277F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5337F, -5.0046F, -0.7256F, -0.0131F, 0.0131F, 0.0F));

		PartDefinition head6_r7 = leftFace.addOrReplaceChild("head6_r7", CubeListBuilder.create().texOffs(27, 89).addBox(-0.9F, -0.15F, -0.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.4337F, -7.0893F, -15.0382F, -0.1179F, 0.0303F, -0.0036F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.002F, 0.185F, -0.4007F));

		PartDefinition head10_r3 = rightFace.addOrReplaceChild("head10_r3", CubeListBuilder.create().texOffs(47, 114).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.65F, -1.2091F, 0.0004F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head9_r4 = rightFace.addOrReplaceChild("head9_r4", CubeListBuilder.create().texOffs(42, 114).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.65F, -1.603F, 0.6966F, -1.0559F, 0.0F, 0.0F));

		PartDefinition head8_r5 = rightFace.addOrReplaceChild("head8_r5", CubeListBuilder.create().texOffs(37, 114).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.65F, -2.652F, 0.2728F, -1.9722F, 0.0F, 0.0F));

		PartDefinition head9_r5 = rightFace.addOrReplaceChild("head9_r5", CubeListBuilder.create().texOffs(114, 72).mirror().addBox(-0.675F, -0.475F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(62, 114).mirror().addBox(-0.45F, -0.475F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.675F, -1.967F, -0.0035F, 3.1241F, 0.0F, 0.0F));

		PartDefinition head7_r6 = rightFace.addOrReplaceChild("head7_r6", CubeListBuilder.create().texOffs(114, 12).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.65F, -2.6241F, -0.5267F, -3.1067F, 0.0F, 0.0F));

		PartDefinition head15_r3 = rightFace.addOrReplaceChild("head15_r3", CubeListBuilder.create().texOffs(57, 114).mirror().addBox(-0.525F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.825F, -1.0181F, 0.2315F, 1.0123F, 0.0F, 0.0F));

		PartDefinition head14_r4 = rightFace.addOrReplaceChild("head14_r4", CubeListBuilder.create().texOffs(49, 111).mirror().addBox(-0.525F, -0.65F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.825F, -0.6643F, 0.5015F, 1.3177F, 0.0F, 0.0F));

		PartDefinition head13_r3 = rightFace.addOrReplaceChild("head13_r3", CubeListBuilder.create().texOffs(111, 54).mirror().addBox(-0.525F, -0.025F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(54, 111).mirror().addBox(-0.525F, -0.325F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(111, 51).mirror().addBox(-0.525F, -0.725F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.825F, -0.4096F, 0.0935F, 1.9722F, 0.0F, 0.0F));

		PartDefinition head15_r4 = rightFace.addOrReplaceChild("head15_r4", CubeListBuilder.create().texOffs(25, 103).mirror().addBox(-0.1999F, 1.1419F, 24.3292F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(62, 30).mirror().addBox(-0.1999F, 1.1919F, 18.3792F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.2248F, -1.6523F, 2.9347F, 0.0086F, 0.096F));

		PartDefinition head13_r4 = rightFace.addOrReplaceChild("head13_r4", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.1999F, 2.1571F, 11.481F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.2248F, -1.6523F, 2.987F, 0.0086F, 0.096F));

		PartDefinition head15_r5 = rightFace.addOrReplaceChild("head15_r5", CubeListBuilder.create().texOffs(72, 114).mirror().addBox(-0.1999F, -10.8351F, -7.1548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.2248F, -1.6523F, 0.513F, 0.0086F, 0.096F));

		PartDefinition head16_r2 = rightFace.addOrReplaceChild("head16_r2", CubeListBuilder.create().texOffs(73, 48).mirror().addBox(-0.1999F, -5.3599F, -17.8724F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(41, 41).mirror().addBox(-0.1999F, -6.1599F, -17.8724F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.2248F, -1.6523F, -0.0717F, 0.0086F, 0.096F));

		PartDefinition head17_r1 = rightFace.addOrReplaceChild("head17_r1", CubeListBuilder.create().texOffs(90, 27).mirror().addBox(-0.1999F, -5.0878F, -21.6636F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.2248F, -1.6523F, -0.0891F, 0.0086F, 0.096F));

		PartDefinition head16_r3 = rightFace.addOrReplaceChild("head16_r3", CubeListBuilder.create().texOffs(62, 39).mirror().addBox(-0.1999F, -7.3849F, -24.2063F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.2248F, -1.6523F, -0.0019F, 0.0086F, 0.096F));

		PartDefinition head14_r5 = rightFace.addOrReplaceChild("head14_r5", CubeListBuilder.create().texOffs(90, 21).mirror().addBox(-0.1999F, -7.696F, -11.6321F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.2248F, -1.6523F, 0.1203F, 0.0086F, 0.096F));

		PartDefinition head13_r5 = rightFace.addOrReplaceChild("head13_r5", CubeListBuilder.create().texOffs(103, 33).mirror().addBox(-0.1999F, -4.2406F, 10.5524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.2248F, -1.6523F, 2.4329F, 0.0086F, 0.096F));

		PartDefinition head6_r8 = rightFace.addOrReplaceChild("head6_r8", CubeListBuilder.create().texOffs(110, 34).mirror().addBox(-0.1F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0337F, -3.2502F, -0.5269F, 0.2607F, -0.1012F, 0.362F));

		PartDefinition head12_r6 = rightFace.addOrReplaceChild("head12_r6", CubeListBuilder.create().texOffs(51, 61).mirror().addBox(-0.1999F, 0.1272F, 5.8114F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.2248F, -1.6523F, 2.8256F, 0.0086F, 0.096F));

		PartDefinition head13_r6 = rightFace.addOrReplaceChild("head13_r6", CubeListBuilder.create().texOffs(67, 114).mirror().addBox(-0.1999F, 0.4298F, -0.2887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.2248F, -1.6523F, -2.9907F, 0.0086F, 0.096F));

		PartDefinition head12_r7 = rightFace.addOrReplaceChild("head12_r7", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.1999F, 0.0498F, 0.0244F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.2248F, -1.6523F, 2.8125F, 0.0086F, 0.096F));

		PartDefinition head11_r4 = rightFace.addOrReplaceChild("head11_r4", CubeListBuilder.create().texOffs(21, 42).mirror().addBox(-0.1999F, -0.1503F, 0.0241F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.2248F, -1.6523F, 2.7907F, 0.0086F, 0.096F));

		PartDefinition head10_r4 = rightFace.addOrReplaceChild("head10_r4", CubeListBuilder.create().texOffs(52, 114).mirror().addBox(-0.5F, -1.325F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(32, 114).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.65F, -1.9648F, -0.9798F, 2.6267F, 0.0F, 0.0F));

		PartDefinition head8_r6 = rightFace.addOrReplaceChild("head8_r6", CubeListBuilder.create().texOffs(27, 114).mirror().addBox(-0.5F, -0.725F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.65F, -2.0923F, -0.6798F, -2.1729F, 0.0F, 0.0F));

		PartDefinition head5_r6 = rightFace.addOrReplaceChild("head5_r6", CubeListBuilder.create().texOffs(31, 110).mirror().addBox(-0.5F, -0.175F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.308F, -4.9065F, -0.7745F, 0.3578F, -0.0131F, 0.0F));

		PartDefinition head4_r8 = rightFace.addOrReplaceChild("head4_r8", CubeListBuilder.create().texOffs(96, 102).mirror().addBox(-0.275F, -0.0914F, -1.8228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5337F, -5.0046F, -0.7256F, -0.2793F, -0.0131F, 0.0F));

		PartDefinition head5_r7 = rightFace.addOrReplaceChild("head5_r7", CubeListBuilder.create().texOffs(111, 78).mirror().addBox(-0.275F, 0.102F, -0.6462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.5337F, -5.0046F, -0.7256F, -0.5847F, -0.0131F, 0.0F));

		PartDefinition head4_r9 = rightFace.addOrReplaceChild("head4_r9", CubeListBuilder.create().texOffs(82, 102).mirror().addBox(-0.275F, -0.2666F, -3.5198F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.5337F, -5.0046F, -0.7256F, -0.1745F, -0.0131F, 0.0F));

		PartDefinition head5_r8 = rightFace.addOrReplaceChild("head5_r8", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-0.275F, -0.3841F, -7.2137F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5337F, -5.0046F, -0.7256F, -0.1396F, -0.0131F, 0.0F));

		PartDefinition head6_r9 = rightFace.addOrReplaceChild("head6_r9", CubeListBuilder.create().texOffs(88, 48).mirror().addBox(-0.275F, -0.5382F, -10.9069F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5337F, -5.0046F, -0.7256F, -0.1178F, -0.0131F, 0.0F));

		PartDefinition head7_r7 = rightFace.addOrReplaceChild("head7_r7", CubeListBuilder.create().texOffs(11, 91).mirror().addBox(-0.275F, -1.2737F, -10.8277F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.5337F, -5.0046F, -0.7256F, -0.0131F, -0.0131F, 0.0F));

		PartDefinition head7_r8 = rightFace.addOrReplaceChild("head7_r8", CubeListBuilder.create().texOffs(27, 89).mirror().addBox(-0.1F, -0.15F, -0.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.4337F, -7.0893F, -15.0382F, -0.1179F, -0.0303F, 0.0036F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.703F, 4.4761F, -0.9045F, 0.4052F, -0.5384F, 0.527F));

		PartDefinition upperwing10_r1 = leftwing1.addOrReplaceChild("upperwing10_r1", CubeListBuilder.create().texOffs(92, 45).addBox(0.0F, 0.0F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2925F, -0.248F, 0.788F, -1.1373F, 0.4249F, 0.1885F));

		PartDefinition upperwing10_r2 = leftwing1.addOrReplaceChild("upperwing10_r2", CubeListBuilder.create().texOffs(111, 45).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(10.0858F, 0.2377F, -0.3846F, -1.139F, 0.417F, 0.1845F));

		PartDefinition upperwing9_r1 = leftwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(93, 18).addBox(0.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.2925F, -0.248F, 0.788F, -1.159F, 0.2975F, 0.1274F));

		PartDefinition upperwing8_r1 = leftwing1.addOrReplaceChild("upperwing8_r1", CubeListBuilder.create().texOffs(87, 6).addBox(-0.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.7909F, -0.4339F, 1.2369F, -1.1695F, 0.2013F, 0.0846F));

		PartDefinition upperwing9_r2 = leftwing1.addOrReplaceChild("upperwing9_r2", CubeListBuilder.create().texOffs(76, 106).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.0841F, -0.3509F, 1.0364F, -1.0751F, -0.6358F, -0.3107F));

		PartDefinition upperwing8_r2 = leftwing1.addOrReplaceChild("upperwing8_r2", CubeListBuilder.create().texOffs(71, 106).addBox(-0.7F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4698F, -0.5267F, 1.461F, -0.9984F, -0.7863F, -0.4279F));

		PartDefinition upperwing11_r1 = leftwing1.addOrReplaceChild("upperwing11_r1", CubeListBuilder.create().texOffs(114, 84).addBox(-0.8F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.9499F, 0.0356F, 0.1033F, 1.1519F, 0.3454F, 2.992F));

		PartDefinition upperwing10_r3 = leftwing1.addOrReplaceChild("upperwing10_r3", CubeListBuilder.create().texOffs(114, 81).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.548F, 0.1495F, -0.1714F, 1.095F, 0.5818F, 2.8656F));

		PartDefinition upperwing9_r3 = leftwing1.addOrReplaceChild("upperwing9_r3", CubeListBuilder.create().texOffs(107, 83).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.3145F, 0.5216F, -1.0698F, 0.5132F, 1.116F, 2.1311F));

		PartDefinition upperwing8_r3 = leftwing1.addOrReplaceChild("upperwing8_r3", CubeListBuilder.create().texOffs(15, 115).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3557F, 0.6303F, -1.3322F, -0.601F, 1.0883F, 0.9121F));

		PartDefinition upperwing7_r1 = leftwing1.addOrReplaceChild("upperwing7_r1", CubeListBuilder.create().texOffs(26, 107).addBox(-1.0F, -3.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2482F, 0.7374F, -1.5909F, -1.1532F, 0.3375F, 0.1459F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create().texOffs(62, 70).addBox(-1.3789F, -0.0386F, -0.1429F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.8265F, 1.111F, -1.5974F, -2.0337F, 0.3981F, -2.6543F));

		PartDefinition wing10_r1 = leftwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(47, 78).addBox(-0.5F, -7.5F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1789F, 7.4614F, -0.4429F, 0.0F, 0.0F, 0.0175F));

		PartDefinition wing10_r2 = leftwing2.addOrReplaceChild("wing10_r2", CubeListBuilder.create().texOffs(39, 105).addBox(-0.5F, -3.8F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.4314F, 12.1466F, -0.6215F, 0.0F, -1.5708F, 0.2443F));

		PartDefinition wing9_r1 = leftwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(7, 107).addBox(-1.5824F, -5.2594F, -1.8011F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.9636F, 17.1119F, 0.461F, 0.0F, -1.5708F, 0.0785F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(110, 93).addBox(-1.5824F, -3.1517F, -0.6623F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.9636F, 17.1119F, 0.461F, 0.0F, -1.5708F, 0.48F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(27, 70).addBox(-1.1096F, -0.3762F, 0.049F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(32, 70).addBox(-0.6096F, -0.3762F, 0.049F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-1.6016F, 16.0866F, -0.3174F, 0.0951F, 0.1973F, 0.7402F));

		PartDefinition lowerwing10_r1 = leftwing3.addOrReplaceChild("lowerwing10_r1", CubeListBuilder.create().texOffs(103, 94).addBox(-0.2F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.6096F, -0.0762F, 0.549F, 0.0F, 0.0F, -0.48F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8168F, 16.3005F, 0.4091F, 1.4501F, 0.3706F, -0.3889F));

		PartDefinition wingfingerbase8_r1 = leftwing4.addOrReplaceChild("wingfingerbase8_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.425F, -0.55F, -9.5F, 1.0F, 1.0F, 19.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3799F, -0.0164F, 8.846F, 0.0F, 0.0F, 0.6981F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(41, 0).addBox(-0.6F, -1.0F, -0.3F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5451F, 0.3592F, 18.3313F, 0.1353F, -0.0415F, 0.7163F));

		PartDefinition leftwing6 = leftwing5.addOrReplaceChild("leftwing6", CubeListBuilder.create().texOffs(41, 30).addBox(-0.6F, -1.0F, -0.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0362F, 0.0F, 12.7175F, 0.0698F, 0.1745F, 0.0F));

		PartDefinition leftwing7 = leftwing6.addOrReplaceChild("leftwing7", CubeListBuilder.create().texOffs(34, 61).addBox(-0.6F, -1.0F, -0.05F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0326F, 0.0F, 8.5521F, 0.0873F, 0.1309F, 0.0F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(80, 9).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0528F, -0.2253F, 0.1507F, -1.3135F, 0.256F, 0.8496F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7745F, 4.4761F, -0.9045F, 0.2961F, 0.98F, -0.6199F));

		PartDefinition upperwing11_r2 = rightwing1.addOrReplaceChild("upperwing11_r2", CubeListBuilder.create().texOffs(93, 9).addBox(-5.0F, 0.0F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2925F, -0.248F, 0.788F, -1.1373F, -0.4249F, -0.1885F));

		PartDefinition upperwing11_r3 = rightwing1.addOrReplaceChild("upperwing11_r3", CubeListBuilder.create().texOffs(111, 48).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-10.0858F, 0.2377F, -0.3846F, -1.139F, -0.417F, -0.1845F));

		PartDefinition upperwing10_r4 = rightwing1.addOrReplaceChild("upperwing10_r4", CubeListBuilder.create().texOffs(22, 95).addBox(-4.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-6.2925F, -0.248F, 0.788F, -1.159F, -0.2975F, -0.1274F));

		PartDefinition upperwing9_r4 = rightwing1.addOrReplaceChild("upperwing9_r4", CubeListBuilder.create().texOffs(91, 81).addBox(-4.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.7909F, -0.4339F, 1.2369F, -1.1695F, -0.2013F, -0.0846F));

		PartDefinition upperwing10_r5 = rightwing1.addOrReplaceChild("upperwing10_r5", CubeListBuilder.create().texOffs(86, 106).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.0841F, -0.3509F, 1.0364F, -1.0751F, 0.6358F, 0.3107F));

		PartDefinition upperwing9_r5 = rightwing1.addOrReplaceChild("upperwing9_r5", CubeListBuilder.create().texOffs(81, 106).addBox(-0.3F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4698F, -0.5267F, 1.461F, -0.9984F, 0.7863F, 0.4279F));

		PartDefinition upperwing12_r1 = rightwing1.addOrReplaceChild("upperwing12_r1", CubeListBuilder.create().texOffs(5, 115).addBox(-0.2F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.9499F, 0.0356F, 0.1033F, 1.1519F, -0.3454F, -2.992F));

		PartDefinition upperwing11_r4 = rightwing1.addOrReplaceChild("upperwing11_r4", CubeListBuilder.create().texOffs(82, 114).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.548F, 0.1495F, -0.1714F, 1.095F, -0.5818F, -2.8656F));

		PartDefinition upperwing10_r6 = rightwing1.addOrReplaceChild("upperwing10_r6", CubeListBuilder.create().texOffs(107, 86).addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.3145F, 0.5216F, -1.0698F, 0.5132F, -1.116F, -2.1311F));

		PartDefinition upperwing9_r6 = rightwing1.addOrReplaceChild("upperwing9_r6", CubeListBuilder.create().texOffs(20, 115).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3557F, 0.6303F, -1.3322F, -0.601F, -1.0883F, -0.9121F));

		PartDefinition upperwing8_r4 = rightwing1.addOrReplaceChild("upperwing8_r4", CubeListBuilder.create().texOffs(0, 108).addBox(0.0F, -3.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.2482F, 0.7374F, -1.5909F, -1.1532F, -0.3375F, -0.1459F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create().texOffs(75, 9).addBox(0.3789F, -0.0386F, -0.1429F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.8265F, 1.111F, -1.5974F, -2.0337F, -0.3981F, 2.6543F));

		PartDefinition wing11_r1 = rightwing2.addOrReplaceChild("wing11_r1", CubeListBuilder.create().texOffs(52, 78).addBox(-0.5F, -7.5F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1789F, 7.4614F, -0.4429F, 0.0F, 0.0F, -0.0175F));

		PartDefinition wing11_r2 = rightwing2.addOrReplaceChild("wing11_r2", CubeListBuilder.create().texOffs(105, 68).addBox(-0.5F, -3.8F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.4314F, 12.1466F, -0.6215F, 0.0F, 1.5708F, -0.2443F));

		PartDefinition wing10_r3 = rightwing2.addOrReplaceChild("wing10_r3", CubeListBuilder.create().texOffs(21, 107).addBox(0.5824F, -5.2594F, -1.8011F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9636F, 17.1119F, 0.461F, 0.0F, 1.5708F, -0.0785F));

		PartDefinition wing9_r2 = rightwing2.addOrReplaceChild("wing9_r2", CubeListBuilder.create().texOffs(110, 97).addBox(0.5824F, -3.1517F, -0.6623F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9636F, 17.1119F, 0.461F, 0.0F, 1.5708F, -0.48F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(37, 70).addBox(0.1096F, -0.3762F, 0.049F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(42, 70).addBox(-0.3904F, -0.3762F, 0.049F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(1.6016F, 16.0866F, -0.3174F, 0.0951F, -0.1973F, -0.7402F));

		PartDefinition lowerwing11_r1 = rightwing3.addOrReplaceChild("lowerwing11_r1", CubeListBuilder.create().texOffs(103, 98).addBox(-1.8F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.6096F, -0.0762F, 0.549F, 0.0F, 0.0F, 0.48F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8168F, 16.3005F, 0.4091F, 1.4501F, -0.3706F, 0.3889F));

		PartDefinition wingfingerbase9_r1 = rightwing4.addOrReplaceChild("wingfingerbase9_r1", CubeListBuilder.create().texOffs(0, 21).addBox(-0.575F, -0.55F, -9.5F, 1.0F, 1.0F, 19.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3799F, -0.0164F, 8.846F, 0.0F, 0.0F, -0.6981F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(41, 15).addBox(-0.4F, -1.0F, -0.3F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5451F, 0.3592F, 18.3313F, 0.1353F, 0.0415F, -0.7163F));

		PartDefinition rightwing6 = rightwing5.addOrReplaceChild("rightwing6", CubeListBuilder.create().texOffs(0, 42).addBox(-0.4F, -1.0F, -0.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0362F, 0.0F, 12.7175F, 0.0698F, -0.1745F, 0.0F));

		PartDefinition rightwing7 = rightwing6.addOrReplaceChild("rightwing7", CubeListBuilder.create().texOffs(0, 63).addBox(-0.4F, -1.0F, -0.05F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0326F, 0.0F, 8.5521F, 0.0873F, -0.1309F, 0.0F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(80, 15).addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0528F, -0.2253F, 0.1507F, -1.3135F, -0.256F, -0.8496F));

		PartDefinition body = chest1.addOrReplaceChild("body", CubeListBuilder.create().texOffs(86, 56).addBox(-0.5357F, -0.5081F, -0.0684F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3212F, 1.9887F, -0.0175F, 0.0F, 0.0F));

		PartDefinition chest4_r6 = body.addOrReplaceChild("chest4_r6", CubeListBuilder.create().texOffs(0, 98).addBox(-0.0357F, -1.0924F, -0.7682F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5157F, 0.8999F, -0.0436F, 0.0F, 0.0F));

		PartDefinition chest3_r5 = body.addOrReplaceChild("chest3_r5", CubeListBuilder.create().texOffs(7, 98).addBox(-0.0357F, -1.0877F, -0.1659F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5157F, 3.2999F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(101, 31).mirror().addBox(-5.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 1.465F, 0.1157F, 0.3343F, -1.3814F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(108, 24).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 1.465F, 0.2688F, 0.2317F, -0.8459F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(113, 66).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 1.465F, 0.3843F, 0.045F, -0.3285F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(112, 107).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 3.465F, 0.3834F, 0.0486F, -0.2761F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(107, 7).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 3.465F, 0.2662F, 0.2344F, -0.794F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(96, 73).mirror().addBox(-5.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 3.465F, 0.112F, 0.3353F, -1.3302F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(113, 66).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 1.465F, 0.3843F, -0.045F, 0.3285F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(108, 24).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 1.465F, 0.2688F, -0.2317F, 0.8459F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(101, 31).addBox(2.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 1.465F, 0.1157F, -0.3343F, 1.3814F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(96, 73).addBox(2.2026F, -1.8495F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 3.465F, 0.112F, -0.3353F, 1.3302F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(107, 7).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 3.465F, 0.2662F, -0.2344F, 0.794F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(112, 107).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 3.465F, 0.3834F, -0.0486F, 0.2761F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1157F, 3.8999F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest4_r7 = body2.addOrReplaceChild("chest4_r7", CubeListBuilder.create().texOffs(13, 80).addBox(-0.0357F, -1.0924F, 1.0318F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 97).addBox(-0.5357F, 0.0076F, 0.0318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition chest4_r8 = body2.addOrReplaceChild("chest4_r8", CubeListBuilder.create().texOffs(0, 93).addBox(-1.5188F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0169F, 6.9587F, 4.2819F, 0.0698F, 0.0012F, -0.0018F));

		PartDefinition cube_r19 = body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(108, 91).mirror().addBox(-4.2026F, -1.8495F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.11F, 0.3177F, -1.4007F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(114, 87).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.3672F, 0.0415F, -0.3467F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(108, 26).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.2554F, 0.2202F, -0.8664F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(108, 26).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.2554F, -0.2202F, 0.8664F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(114, 87).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.3672F, -0.0415F, 0.3467F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(108, 91).addBox(2.2026F, -1.8495F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.11F, -0.3177F, 1.4007F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2457F, 2.9524F, -0.0873F, 0.0F, 0.0F));

		PartDefinition chest6_r2 = body3.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(115, 26).addBox(-0.0357F, -1.3924F, 2.0318F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 22).addBox(-0.0357F, -1.1924F, 0.0318F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 33).addBox(-0.5357F, 0.0076F, 0.0318F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition chest5_r5 = body3.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(73, 63).addBox(-1.5F, -0.7F, -0.8F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0362F, 5.0874F, 2.2061F, 0.3491F, 0.0012F, -0.0018F));

		PartDefinition cube_r25 = body3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(108, 89).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0326F, 2.4127F, 0.3431F, 0.3282F, -1.0878F));

		PartDefinition cube_r26 = body3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(115, 38).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0326F, 2.4127F, 0.494F, 0.0943F, -0.5834F));

		PartDefinition cube_r27 = body3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(115, 36).mirror().addBox(-3.2026F, -1.8494F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.14F, 0.4537F, -1.4772F));

		PartDefinition cube_r28 = body3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(115, 34).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.4993F, 0.0847F, -0.4262F));

		PartDefinition cube_r29 = body3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(108, 28).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.3528F, 0.3224F, -0.928F));

		PartDefinition cube_r30 = body3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(115, 38).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0326F, 2.4127F, 0.494F, -0.0943F, 0.5834F));

		PartDefinition cube_r31 = body3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(108, 89).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0326F, 2.4127F, 0.3431F, -0.3282F, 1.0878F));

		PartDefinition cube_r32 = body3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(108, 28).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.3528F, -0.3224F, 0.928F));

		PartDefinition cube_r33 = body3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(115, 34).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.4993F, -0.0847F, 0.4262F));

		PartDefinition cube_r34 = body3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(115, 36).addBox(2.2026F, -1.8494F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.14F, -0.4537F, 1.4772F));

		PartDefinition body1 = body3.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3961F, 3.9424F, -0.0408F, 0.0872F, -0.0036F));

		PartDefinition body4_r1 = body1.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(13, 84).addBox(-0.0357F, -0.1982F, -0.1968F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6174F, 4.8455F, -0.3665F, 0.0F, 0.0F));

		PartDefinition body4_r2 = body1.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(61, 106).addBox(-0.0357F, -0.0041F, -0.0349F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8767F, 0.9114F, -0.2356F, 0.0F, 0.0F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(17, 53).addBox(-0.0357F, -1.7541F, -0.0349F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4174F, -0.0545F, -0.5847F, 0.0F, 0.0F));

		PartDefinition body3_r2 = body1.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(110, 68).addBox(-0.0028F, 0.3F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 110).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.036F, -1.4085F, 2.8008F, -0.2618F, 0.0005F, -0.0004F));

		PartDefinition cube_r35 = body1.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(115, 70).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0365F, 4.4703F, 0.0922F, -0.1705F, -0.3932F));

		PartDefinition cube_r36 = body1.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(115, 68).mirror().addBox(-0.9711F, 0.103F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0365F, 2.4703F, 0.1885F, 0.0943F, -0.5834F));

		PartDefinition cube_r37 = body1.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(115, 42).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, -0.0635F, 0.4703F, 0.2508F, 0.1423F, -0.5969F));

		PartDefinition cube_r38 = body1.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(115, 40).mirror().addBox(-1.8322F, -0.5004F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, -0.0635F, 0.4703F, 0.1001F, 0.2481F, -1.1419F));

		PartDefinition cube_r39 = body1.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(115, 70).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0365F, 4.4703F, 0.0922F, 0.1705F, 0.3932F));

		PartDefinition cube_r40 = body1.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(115, 68).addBox(-0.0289F, 0.103F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0365F, 2.4703F, 0.1885F, -0.0943F, 0.5834F));

		PartDefinition cube_r41 = body1.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(115, 40).addBox(0.8322F, -0.5004F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, -0.0635F, 0.4703F, 0.1001F, -0.2481F, 1.1419F));

		PartDefinition cube_r42 = body1.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(115, 42).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, -0.0635F, 0.4703F, 0.2508F, -0.1423F, 0.5969F));

		PartDefinition body1_r1 = body1.addOrReplaceChild("body1_r1", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5357F, -0.1F, -1.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2908F, 1.4433F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(73, 56).addBox(-0.5357F, -0.5778F, -0.0329F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3008F, 5.043F, -0.2121F, 0.0F, 0.0F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(63, 48).addBox(-0.2279F, -0.2807F, -0.4087F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6141F, 1.5556F, 3.8299F, 0.1264F, -0.0284F, -0.1698F));

		PartDefinition upperleg7_r1 = leftleg1.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(85, 75).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2721F, 11.569F, 1.7519F, -0.7418F, 0.0F, 0.0F));

		PartDefinition upperleg9_r1 = leftleg1.addOrReplaceChild("upperleg9_r1", CubeListBuilder.create().texOffs(110, 42).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(14, 102).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, 10.741F, 0.6147F, 0.32F, 0.0219F, -0.0034F));

		PartDefinition upperleg7_r2 = leftleg1.addOrReplaceChild("upperleg7_r2", CubeListBuilder.create().texOffs(106, 50).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2721F, 7.8239F, -0.0857F, 0.2356F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = leftleg1.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(106, 45).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, 4.8403F, -0.3992F, 0.1047F, 0.0F, 0.0F));

		PartDefinition upperleg6_r2 = leftleg1.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(11, 87).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, -0.5497F, -0.1292F, 0.8901F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1374F, 12.5404F, 2.3264F, 0.447F, 0.169F, 0.1574F));

		PartDefinition leg6_r1 = leftleg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(17, 70).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(68, 48).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.5921F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(21, 52).addBox(-1.0F, -0.5F, -7.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.653F, 18.587F, 1.5154F, 0.0528F, -0.1307F, 0.0455F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5279F, -0.2807F, 1.0913F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(57, 78).addBox(-0.7721F, -0.2807F, -0.4087F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6856F, 1.5556F, 3.8299F, 0.2573F, 0.0284F, 0.1698F));

		PartDefinition upperleg8_r1 = rightleg1.addOrReplaceChild("upperleg8_r1", CubeListBuilder.create().texOffs(36, 111).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2721F, 11.569F, 1.7519F, -0.7418F, 0.0F, 0.0F));

		PartDefinition upperleg10_r1 = rightleg1.addOrReplaceChild("upperleg10_r1", CubeListBuilder.create().texOffs(111, 16).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(110, 101).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2721F, 10.741F, 0.6147F, 0.32F, -0.0219F, 0.0034F));

		PartDefinition upperleg8_r2 = rightleg1.addOrReplaceChild("upperleg8_r2", CubeListBuilder.create().texOffs(106, 55).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2721F, 7.8239F, -0.0857F, 0.2356F, 0.0F, 0.0F));

		PartDefinition upperleg7_r3 = rightleg1.addOrReplaceChild("upperleg7_r3", CubeListBuilder.create().texOffs(51, 106).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2721F, 4.8403F, -0.3992F, 0.1047F, 0.0F, 0.0F));

		PartDefinition upperleg7_r4 = rightleg1.addOrReplaceChild("upperleg7_r4", CubeListBuilder.create().texOffs(22, 91).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2721F, -0.5497F, -0.1292F, 0.8901F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1374F, 12.5404F, 2.3264F, 0.4402F, -0.0112F, -0.0822F));

		PartDefinition leg7_r1 = rightleg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(22, 70).addBox(0.15F, -2.0F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 9).addBox(-0.95F, -2.0F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0191F, 1.5921F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(42, 52).addBox(-2.0F, -0.5F, -7.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.653F, 18.587F, 1.5154F, -0.0781F, 0.1307F, -0.0455F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5279F, -0.2807F, 1.0913F, 0.1367F, 0.0F, 0.0F));

		PartDefinition bone2 = body1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.4F, 0.5952F, 2.9963F));

		PartDefinition body11_r1 = bone2.addOrReplaceChild("body11_r1", CubeListBuilder.create().texOffs(96, 109).addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -1.8379F, 1.6531F, -2.0944F, 0.0F, 0.0F));

		PartDefinition body10_r1 = bone2.addOrReplaceChild("body10_r1", CubeListBuilder.create().texOffs(10, 113).addBox(-0.5F, 0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, -2.5744F, 0.0F, 0.0F));

		PartDefinition body12_r1 = bone2.addOrReplaceChild("body12_r1", CubeListBuilder.create().texOffs(89, 113).addBox(-0.5F, -0.9F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(113, 63).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.2199F, 2.8323F, -0.48F, 0.0F, 0.0F));

		PartDefinition body10_r2 = bone2.addOrReplaceChild("body10_r2", CubeListBuilder.create().texOffs(113, 19).addBox(-0.5F, 0.0F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 1.6581F, 0.0F, 0.0F));

		PartDefinition body9_r1 = bone2.addOrReplaceChild("body9_r1", CubeListBuilder.create().texOffs(113, 9).addBox(-0.5F, -0.375F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 3.0107F, 0.0F, 0.0F));

		PartDefinition body8_r1 = bone2.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(109, 12).addBox(-0.5F, -0.7328F, -1.2997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 2.3562F, 0.0F, 0.0F));

		PartDefinition body13_r1 = bone2.addOrReplaceChild("body13_r1", CubeListBuilder.create().texOffs(68, 102).addBox(-0.8952F, -0.5051F, -0.0296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, -1.2567F, -0.3222F, 0.4341F));

		PartDefinition body13_r2 = bone2.addOrReplaceChild("body13_r2", CubeListBuilder.create().texOffs(74, 111).addBox(-0.8952F, -1.5986F, -0.7405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(69, 111).addBox(-0.8952F, -1.9986F, -1.1405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, -2.7403F, -0.3222F, 0.4341F));

		PartDefinition body11_r2 = bone2.addOrReplaceChild("body11_r2", CubeListBuilder.create().texOffs(61, 102).addBox(-0.8952F, -0.5233F, -2.2233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, 2.6703F, -0.3222F, 0.4341F));

		PartDefinition body9_r2 = bone2.addOrReplaceChild("body9_r2", CubeListBuilder.create().texOffs(64, 111).addBox(-0.8952F, -0.3689F, -0.896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.025F, 1.1003F, 1.3661F, 2.4608F, -0.3222F, 0.4341F));

		PartDefinition body8_r2 = bone2.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(109, 74).addBox(-0.9886F, -0.7921F, -1.2524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, 2.1233F, -0.1932F, 0.2455F));

		PartDefinition body7_r1 = bone2.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(17, 112).addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body10_r3 = bone2.addOrReplaceChild("body10_r3", CubeListBuilder.create().texOffs(94, 113).addBox(-0.9886F, -1.009F, 0.2755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, -2.2488F, -0.1932F, 0.2455F));

		PartDefinition body13_r3 = bone2.addOrReplaceChild("body13_r3", CubeListBuilder.create().texOffs(104, 113).addBox(-1.7406F, -2.5459F, -4.0437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, 1.405F, 0.3054F, -0.2443F));

		PartDefinition body12_r2 = bone2.addOrReplaceChild("body12_r2", CubeListBuilder.create().texOffs(99, 113).addBox(-1.7406F, -4.4603F, 1.2584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, 2.7576F, 0.3054F, -0.2443F));

		PartDefinition body11_r3 = bone2.addOrReplaceChild("body11_r3", CubeListBuilder.create().texOffs(102, 75).addBox(-1.7406F, -3.2548F, 1.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, -3.1067F, 0.3054F, -0.2443F));

		PartDefinition body10_r4 = bone2.addOrReplaceChild("body10_r4", CubeListBuilder.create().texOffs(75, 102).addBox(-1.7406F, -1.9141F, 2.0834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, -2.5831F, 0.3054F, -0.2443F));

		PartDefinition body9_r3 = bone2.addOrReplaceChild("body9_r3", CubeListBuilder.create().texOffs(96, 68).addBox(-0.9886F, -0.0811F, 0.1105F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, -1.507F, -0.1932F, 0.2455F));

		PartDefinition body9_r4 = bone2.addOrReplaceChild("body9_r4", CubeListBuilder.create().texOffs(114, 3).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4244F, 1.024F, -0.2161F, -0.9977F, -0.0304F, -0.0149F));

		PartDefinition body8_r3 = bone2.addOrReplaceChild("body8_r3", CubeListBuilder.create().texOffs(112, 104).addBox(-0.9886F, 0.2024F, -0.0762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, -1.027F, -0.1932F, 0.2455F));

		PartDefinition body11_r4 = bone2.addOrReplaceChild("body11_r4", CubeListBuilder.create().texOffs(0, 113).addBox(-0.3431F, -2.3343F, -0.989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(91, 109).addBox(-0.3431F, -1.9093F, -0.989F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1263F, -0.3111F, -3.2651F, 1.3327F, -0.2606F, 0.0105F));

		PartDefinition body9_r5 = bone2.addOrReplaceChild("body9_r5", CubeListBuilder.create().texOffs(111, 112).addBox(-0.3431F, -0.0982F, -0.8201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.171F, -2.6955F, -0.1047F, -0.2182F, 0.0F));

		PartDefinition body8_r4 = bone2.addOrReplaceChild("body8_r4", CubeListBuilder.create().texOffs(54, 102).addBox(-0.5F, -0.1011F, -1.8581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.071F, -0.8955F, -0.0524F, -0.0873F, 0.0F));

		PartDefinition body7_r2 = bone2.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(22, 112).addBox(-0.5F, -0.9329F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 0.699F, -0.0957F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body7_r3 = bone2.addOrReplaceChild("body7_r3", CubeListBuilder.create().texOffs(114, 6).addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body6_r1 = bone2.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(79, 111).addBox(-0.9886F, -0.1148F, -0.5722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, 0.1162F, -0.1932F, 0.2455F));

		PartDefinition bone4 = body1.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.4715F, 0.5952F, 2.9963F));

		PartDefinition body12_r3 = bone4.addOrReplaceChild("body12_r3", CubeListBuilder.create().texOffs(96, 109).mirror().addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8379F, 1.6531F, -2.0944F, 0.0F, 0.0F));

		PartDefinition body11_r5 = bone4.addOrReplaceChild("body11_r5", CubeListBuilder.create().texOffs(10, 113).mirror().addBox(-0.5F, 0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, -2.5744F, 0.0F, 0.0F));

		PartDefinition body13_r4 = bone4.addOrReplaceChild("body13_r4", CubeListBuilder.create().texOffs(89, 113).mirror().addBox(-0.5F, -0.9F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(113, 63).mirror().addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2199F, 2.8323F, -0.48F, 0.0F, 0.0F));

		PartDefinition body11_r6 = bone4.addOrReplaceChild("body11_r6", CubeListBuilder.create().texOffs(113, 19).mirror().addBox(-0.5F, 0.0F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 1.6581F, 0.0F, 0.0F));

		PartDefinition body10_r5 = bone4.addOrReplaceChild("body10_r5", CubeListBuilder.create().texOffs(113, 9).mirror().addBox(-0.5F, -0.375F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.515F, 1.903F, 3.0107F, 0.0F, 0.0F));

		PartDefinition body9_r6 = bone4.addOrReplaceChild("body9_r6", CubeListBuilder.create().texOffs(109, 12).mirror().addBox(-0.5F, -0.7328F, -1.2997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 2.3562F, 0.0F, 0.0F));

		PartDefinition body14_r1 = bone4.addOrReplaceChild("body14_r1", CubeListBuilder.create().texOffs(68, 102).mirror().addBox(-0.1048F, -0.5051F, -0.0296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, -1.2567F, 0.3222F, -0.4341F));

		PartDefinition body14_r2 = bone4.addOrReplaceChild("body14_r2", CubeListBuilder.create().texOffs(74, 111).mirror().addBox(-0.1048F, -1.5986F, -0.7405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(69, 111).mirror().addBox(-0.1048F, -1.9986F, -1.1405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, -2.7403F, 0.3222F, -0.4341F));

		PartDefinition body12_r4 = bone4.addOrReplaceChild("body12_r4", CubeListBuilder.create().texOffs(61, 102).mirror().addBox(-0.1048F, -0.5233F, -2.2233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, 2.6703F, 0.3222F, -0.4341F));

		PartDefinition body10_r6 = bone4.addOrReplaceChild("body10_r6", CubeListBuilder.create().texOffs(64, 111).mirror().addBox(-0.1048F, -0.3689F, -0.896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1003F, 1.3661F, 2.4608F, 0.3222F, -0.4341F));

		PartDefinition body9_r7 = bone4.addOrReplaceChild("body9_r7", CubeListBuilder.create().texOffs(109, 74).mirror().addBox(-0.0114F, -0.7921F, -1.2524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, 2.1233F, 0.1932F, -0.2455F));

		PartDefinition body8_r5 = bone4.addOrReplaceChild("body8_r5", CubeListBuilder.create().texOffs(17, 112).mirror().addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body11_r7 = bone4.addOrReplaceChild("body11_r7", CubeListBuilder.create().texOffs(94, 113).mirror().addBox(-0.0114F, -1.009F, 0.2755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, -2.2488F, 0.1932F, -0.2455F));

		PartDefinition body14_r3 = bone4.addOrReplaceChild("body14_r3", CubeListBuilder.create().texOffs(104, 113).mirror().addBox(0.7406F, -2.5459F, -4.0437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, 1.405F, -0.3054F, 0.2443F));

		PartDefinition body13_r5 = bone4.addOrReplaceChild("body13_r5", CubeListBuilder.create().texOffs(99, 113).mirror().addBox(0.7406F, -4.4603F, 1.2584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, 2.7576F, -0.3054F, 0.2443F));

		PartDefinition body12_r5 = bone4.addOrReplaceChild("body12_r5", CubeListBuilder.create().texOffs(102, 75).mirror().addBox(0.7406F, -3.2548F, 1.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, -3.1067F, -0.3054F, 0.2443F));

		PartDefinition body11_r8 = bone4.addOrReplaceChild("body11_r8", CubeListBuilder.create().texOffs(75, 102).mirror().addBox(0.7406F, -1.9141F, 2.0834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, -2.5831F, -0.3054F, 0.2443F));

		PartDefinition body10_r7 = bone4.addOrReplaceChild("body10_r7", CubeListBuilder.create().texOffs(96, 68).mirror().addBox(-0.0114F, -0.0811F, 0.1105F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, -1.507F, 0.1932F, -0.2455F));

		PartDefinition body10_r8 = bone4.addOrReplaceChild("body10_r8", CubeListBuilder.create().texOffs(114, 3).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4244F, 1.024F, -0.2161F, -0.9977F, 0.0304F, 0.0149F));

		PartDefinition body9_r8 = bone4.addOrReplaceChild("body9_r8", CubeListBuilder.create().texOffs(112, 104).mirror().addBox(-0.0114F, 0.2024F, -0.0762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, -1.027F, 0.1932F, -0.2455F));

		PartDefinition body12_r6 = bone4.addOrReplaceChild("body12_r6", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-0.6569F, -2.3343F, -0.989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(91, 109).mirror().addBox(-0.6569F, -1.9093F, -0.989F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1263F, -0.3111F, -3.2651F, 1.3327F, 0.2606F, -0.0105F));

		PartDefinition body10_r9 = bone4.addOrReplaceChild("body10_r9", CubeListBuilder.create().texOffs(111, 112).mirror().addBox(-0.6569F, -0.0982F, -0.8201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.171F, -2.6955F, -0.1047F, 0.2182F, 0.0F));

		PartDefinition body9_r9 = bone4.addOrReplaceChild("body9_r9", CubeListBuilder.create().texOffs(54, 102).mirror().addBox(-0.5F, -0.1011F, -1.8581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.071F, -0.8955F, -0.0524F, 0.0873F, 0.0F));

		PartDefinition body8_r6 = bone4.addOrReplaceChild("body8_r6", CubeListBuilder.create().texOffs(22, 112).mirror().addBox(-0.5F, -0.9329F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.699F, -0.0957F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body8_r7 = bone4.addOrReplaceChild("body8_r7", CubeListBuilder.create().texOffs(114, 6).mirror().addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body7_r4 = bone4.addOrReplaceChild("body7_r4", CubeListBuilder.create().texOffs(79, 111).mirror().addBox(-0.0114F, -0.1148F, -0.5722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, 0.1162F, 0.1932F, -0.2455F));

		PartDefinition bone = chest1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.7781F, 1.4287F, 2.3873F));

		PartDefinition chest5_r6 = bone.addOrReplaceChild("chest5_r6", CubeListBuilder.create().texOffs(7, 102).addBox(-0.5F, -0.1F, -0.275F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2743F, 3.9095F, -2.5724F, 2.5006F, -0.2202F, -0.06F));

		PartDefinition chest4_r9 = bone.addOrReplaceChild("chest4_r9", CubeListBuilder.create().texOffs(92, 39).addBox(-0.4711F, -0.1598F, -4.3592F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4947F, 3.5526F, -2.9F, 2.6267F, -0.6495F, 0.0218F));

		PartDefinition chest8_r1 = bone.addOrReplaceChild("chest8_r1", CubeListBuilder.create().texOffs(57, 91).addBox(-0.8656F, -0.5373F, -3.9834F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.7908F, -0.6928F, 2.3597F, 0.033F, 0.0313F, -0.4475F));

		PartDefinition chest8_r2 = bone.addOrReplaceChild("chest8_r2", CubeListBuilder.create().texOffs(38, 89).addBox(-0.7626F, -0.726F, -3.115F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.5907F, -0.6928F, -0.7403F, 0.5468F, 0.1163F, -0.442F));

		PartDefinition chest7_r1 = bone.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(0, 87).addBox(-0.8656F, -0.5221F, -3.872F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.7908F, -0.6928F, 2.3597F, 0.2424F, 0.0313F, -0.4475F));

		PartDefinition chest9_r1 = bone.addOrReplaceChild("chest9_r1", CubeListBuilder.create().texOffs(111, 60).addBox(-0.5295F, -4.9143F, -1.3372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3908F, -0.6928F, 1.6597F, -1.586F, 0.0236F, -0.491F));

		PartDefinition chest8_r3 = bone.addOrReplaceChild("chest8_r3", CubeListBuilder.create().texOffs(59, 111).addBox(-0.5295F, -3.8134F, 2.195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3908F, -0.6928F, 1.6597F, -0.8006F, 0.0236F, -0.491F));

		PartDefinition chest7_r2 = bone.addOrReplaceChild("chest7_r2", CubeListBuilder.create().texOffs(111, 57).addBox(-0.5295F, 0.145F, 3.2201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3908F, -0.6928F, 1.6597F, 0.2029F, 0.0236F, -0.491F));

		PartDefinition chest6_r3 = bone.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(40, 95).addBox(-0.5295F, -0.2973F, 0.5281F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
				.texOffs(47, 70).addBox(-0.5295F, -0.9973F, -1.4719F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.3908F, -0.6928F, 1.6597F, 0.072F, 0.0236F, -0.491F));

		PartDefinition chest7_r3 = bone.addOrReplaceChild("chest7_r3", CubeListBuilder.create().texOffs(101, 89).addBox(-0.7626F, 0.3832F, -0.5989F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5907F, -0.6928F, -0.7403F, -1.565F, 0.1163F, -0.442F));

		PartDefinition chest6_r4 = bone.addOrReplaceChild("chest6_r4", CubeListBuilder.create().texOffs(99, 48).addBox(-0.7626F, -1.1191F, 1.1815F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.5907F, -0.6928F, -0.7403F, -2.6122F, 0.1163F, -0.442F));

		PartDefinition chest5_r7 = bone.addOrReplaceChild("chest5_r7", CubeListBuilder.create().texOffs(110, 38).addBox(-0.7626F, -0.4905F, -1.1025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.5907F, -0.6928F, -0.7403F, -1.0851F, 0.1163F, -0.442F));

		PartDefinition chest4_r10 = bone.addOrReplaceChild("chest4_r10", CubeListBuilder.create().texOffs(102, 12).addBox(-0.5295F, -0.7528F, -2.7671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3908F, -0.6928F, 1.6597F, -0.12F, 0.0236F, -0.491F));

		PartDefinition bone3 = chest1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.8496F, 1.4287F, 2.3873F));

		PartDefinition chest6_r5 = bone3.addOrReplaceChild("chest6_r5", CubeListBuilder.create().texOffs(7, 102).mirror().addBox(-0.5F, -0.1F, -0.275F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2743F, 3.9095F, -2.5724F, 2.5006F, 0.2202F, 0.06F));

		PartDefinition chest5_r8 = bone3.addOrReplaceChild("chest5_r8", CubeListBuilder.create().texOffs(92, 39).mirror().addBox(-0.5289F, -0.1598F, -4.3592F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4947F, 3.5526F, -2.9F, 2.6267F, 0.6495F, -0.0218F));

		PartDefinition chest9_r2 = bone3.addOrReplaceChild("chest9_r2", CubeListBuilder.create().texOffs(57, 91).mirror().addBox(-0.1344F, -0.5373F, -3.9834F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.7908F, -0.6928F, 2.3597F, 0.033F, -0.0313F, 0.4475F));

		PartDefinition chest9_r3 = bone3.addOrReplaceChild("chest9_r3", CubeListBuilder.create().texOffs(38, 89).mirror().addBox(-0.2374F, -0.726F, -3.115F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.5907F, -0.6928F, -0.7403F, 0.5468F, -0.1163F, 0.442F));

		PartDefinition chest8_r4 = bone3.addOrReplaceChild("chest8_r4", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.1344F, -0.5221F, -3.872F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.7908F, -0.6928F, 2.3597F, 0.2424F, -0.0313F, 0.4475F));

		PartDefinition chest10_r1 = bone3.addOrReplaceChild("chest10_r1", CubeListBuilder.create().texOffs(111, 60).mirror().addBox(-0.4705F, -4.9143F, -1.3372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.6928F, 1.6597F, -1.586F, -0.0236F, 0.491F));

		PartDefinition chest9_r4 = bone3.addOrReplaceChild("chest9_r4", CubeListBuilder.create().texOffs(59, 111).mirror().addBox(-0.4705F, -3.8134F, 2.195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.6928F, 1.6597F, -0.8006F, -0.0236F, 0.491F));

		PartDefinition chest8_r5 = bone3.addOrReplaceChild("chest8_r5", CubeListBuilder.create().texOffs(111, 57).mirror().addBox(-0.4705F, 0.145F, 3.2201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.6928F, 1.6597F, 0.2029F, -0.0236F, 0.491F));

		PartDefinition chest7_r4 = bone3.addOrReplaceChild("chest7_r4", CubeListBuilder.create().texOffs(40, 95).mirror().addBox(-0.4705F, -0.2973F, 0.5281F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(47, 70).mirror().addBox(-0.4705F, -0.9973F, -1.4719F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.6928F, 1.6597F, 0.072F, -0.0236F, 0.491F));

		PartDefinition chest8_r6 = bone3.addOrReplaceChild("chest8_r6", CubeListBuilder.create().texOffs(101, 89).mirror().addBox(-0.2374F, 0.3832F, -0.5989F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5907F, -0.6928F, -0.7403F, -1.565F, -0.1163F, 0.442F));

		PartDefinition chest7_r5 = bone3.addOrReplaceChild("chest7_r5", CubeListBuilder.create().texOffs(99, 48).mirror().addBox(-0.2374F, -1.1191F, 1.1815F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.5907F, -0.6928F, -0.7403F, -2.6122F, -0.1163F, 0.442F));

		PartDefinition chest6_r6 = bone3.addOrReplaceChild("chest6_r6", CubeListBuilder.create().texOffs(110, 38).mirror().addBox(-0.2374F, -0.4905F, -1.1025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.5907F, -0.6928F, -0.7403F, -1.0851F, -0.1163F, 0.442F));

		PartDefinition chest5_r9 = bone3.addOrReplaceChild("chest5_r9", CubeListBuilder.create().texOffs(102, 12).mirror().addBox(-0.4705F, -0.7528F, -2.7671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.6928F, 1.6597F, -0.12F, -0.0236F, 0.491F));

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
