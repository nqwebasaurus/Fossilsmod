package fossils.fossils.client.blockentity.model.pteranodonsternbergi;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PteranodonsternbergiFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest1;
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
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart underneck3;
	private final ModelPart gums1;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart head5;
	private final ModelPart lips1;
	private final ModelPart lips2;
	private final ModelPart head4;
	private final ModelPart crest1;
	private final ModelPart crest2;
	private final ModelPart leftwing1;
	private final ModelPart leftwing2;
	private final ModelPart leftwing3;
	private final ModelPart leftwing4;
	private final ModelPart leftwing5;
	private final ModelPart leftwing7;
	private final ModelPart leftwing8;
	private final ModelPart leftwing6;
	private final ModelPart leftwing5membrance2;
	private final ModelPart lefthand2;
	private final ModelPart leftwing4membrance;
	private final ModelPart leftwing3membrance;
	private final ModelPart leftwing1membrance;
	private final ModelPart rightwing1;
	private final ModelPart rightwing2;
	private final ModelPart rightwing3;
	private final ModelPart rightwing4;
	private final ModelPart rightwing5;
	private final ModelPart rightwing7;
	private final ModelPart rightwing8;
	private final ModelPart rightwing6;
	private final ModelPart rightwing5membrance2;
	private final ModelPart righthand2;
	private final ModelPart rightwing4membrance;
	private final ModelPart rightwing3membrance;
	private final ModelPart rightwing1membrance;
	private final ModelPart bone2;
	private final ModelPart bone4;

	public PteranodonsternbergiFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest1 = this.root.getChild("chest1");
		this.body1 = this.chest1.getChild("body1");
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
		this.bone = this.body1.getChild("bone");
		this.bone3 = this.body1.getChild("bone3");
		this.neck1 = this.chest1.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.underneck3 = this.jaw.getChild("underneck3");
		this.gums1 = this.jaw.getChild("gums1");
		this.head2 = this.head.getChild("head2");
		this.head3 = this.head2.getChild("head3");
		this.head5 = this.head3.getChild("head5");
		this.lips1 = this.head3.getChild("lips1");
		this.lips2 = this.head3.getChild("lips2");
		this.head4 = this.head2.getChild("head4");
		this.crest1 = this.head.getChild("crest1");
		this.crest2 = this.crest1.getChild("crest2");
		this.leftwing1 = this.chest1.getChild("leftwing1");
		this.leftwing2 = this.leftwing1.getChild("leftwing2");
		this.leftwing3 = this.leftwing2.getChild("leftwing3");
		this.leftwing4 = this.leftwing3.getChild("leftwing4");
		this.leftwing5 = this.leftwing4.getChild("leftwing5");
		this.leftwing7 = this.leftwing5.getChild("leftwing7");
		this.leftwing8 = this.leftwing7.getChild("leftwing8");
		this.leftwing6 = this.leftwing4.getChild("leftwing6");
		this.leftwing5membrance2 = this.leftwing6.getChild("leftwing5membrance2");
		this.lefthand2 = this.leftwing4.getChild("lefthand2");
		this.leftwing4membrance = this.leftwing4.getChild("leftwing4membrance");
		this.leftwing3membrance = this.leftwing2.getChild("leftwing3membrance");
		this.leftwing1membrance = this.leftwing1.getChild("leftwing1membrance");
		this.rightwing1 = this.chest1.getChild("rightwing1");
		this.rightwing2 = this.rightwing1.getChild("rightwing2");
		this.rightwing3 = this.rightwing2.getChild("rightwing3");
		this.rightwing4 = this.rightwing3.getChild("rightwing4");
		this.rightwing5 = this.rightwing4.getChild("rightwing5");
		this.rightwing7 = this.rightwing5.getChild("rightwing7");
		this.rightwing8 = this.rightwing7.getChild("rightwing8");
		this.rightwing6 = this.rightwing4.getChild("rightwing6");
		this.rightwing5membrance2 = this.rightwing6.getChild("rightwing5membrance2");
		this.righthand2 = this.rightwing4.getChild("righthand2");
		this.rightwing4membrance = this.rightwing4.getChild("rightwing4membrance");
		this.rightwing3membrance = this.rightwing2.getChild("rightwing3membrance");
		this.rightwing1membrance = this.rightwing1.getChild("rightwing1membrance");
		this.bone2 = this.chest1.getChild("bone2");
		this.bone4 = this.chest1.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.25F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create().texOffs(53, 80).addBox(-0.5F, -1.0924F, 2.1318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(35, 62).addBox(0.0F, -1.3924F, 2.1318F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0969F, 1.1542F, -0.4932F, 0.0F, 0.0F));

		PartDefinition chest7_r1 = chest1.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(80, 64).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, 2.5123F, 0.1473F, 0.2262F, -1.3014F));

		PartDefinition chest6_r1 = chest1.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(80, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, 2.5123F, 0.2497F, 0.1018F, -0.6945F));

		PartDefinition chest5_r1 = chest1.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(63, 82).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, 0.7123F, 0.4789F, 0.282F, -0.6504F));

		PartDefinition chest6_r2 = chest1.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(58, 82).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, 0.7123F, 0.2337F, 0.5027F, -1.2703F));

		PartDefinition chest6_r3 = chest1.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(80, 64).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, 2.5123F, 0.1473F, -0.2262F, 1.3014F));

		PartDefinition chest5_r2 = chest1.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(80, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, 2.5123F, 0.2497F, -0.1018F, 0.6945F));

		PartDefinition chest4_r1 = chest1.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(63, 82).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, 0.7123F, 0.4789F, -0.282F, 0.6504F));

		PartDefinition chest5_r3 = chest1.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(58, 82).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, 0.7123F, 0.2337F, -0.5027F, 1.2703F));

		PartDefinition chest3_r1 = chest1.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(24, 54).addBox(0.0F, -0.7123F, 1.6852F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 78).addBox(-0.5F, -0.3123F, 1.6852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.5F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body1 = chest1.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4288F, 3.1146F, -0.1192F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(38, 68).addBox(0.0F, -0.3F, 1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(51, 38).addBox(0.0F, -0.4F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 49).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4937F, 1.8035F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest6_r4 = body1.addOrReplaceChild("chest6_r4", CubeListBuilder.create().texOffs(82, 66).mirror().addBox(-0.9869F, -0.0493F, -0.8967F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2372F, 3.2158F, 0.2031F, 0.0116F, -0.9814F));

		PartDefinition chest8_r1 = body1.addOrReplaceChild("chest8_r1", CubeListBuilder.create().texOffs(41, 76).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3436F, 0.8123F, 0.2137F, 0.4443F, -1.2794F));

		PartDefinition chest7_r2 = body1.addOrReplaceChild("chest7_r2", CubeListBuilder.create().texOffs(46, 31).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3436F, 0.8123F, 0.4288F, 0.2447F, -0.6634F));

		PartDefinition chest5_r4 = body1.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(82, 66).addBox(-0.0131F, -0.0493F, -0.8967F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2372F, 3.2158F, 0.2031F, -0.0116F, 0.9814F));

		PartDefinition chest7_r3 = body1.addOrReplaceChild("chest7_r3", CubeListBuilder.create().texOffs(41, 76).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3436F, 0.8123F, 0.2137F, -0.4443F, 1.2794F));

		PartDefinition chest6_r5 = body1.addOrReplaceChild("chest6_r5", CubeListBuilder.create().texOffs(46, 31).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3436F, 0.8123F, 0.4288F, -0.2447F, 0.6634F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(67, 38).addBox(-0.5F, -0.5604F, 0.0341F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0727F, 4.6959F, -0.1859F, 0.0F, 0.0F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(76, 10).addBox(-0.3039F, 0.0711F, -0.3881F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.0361F, 3.9397F, 1.7758F, 0.1033F, -0.0221F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1651F, 4.1235F, -0.1513F, 0.009F, -0.2652F, -0.1533F));

		PartDefinition leg6_r1 = leftleg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(75, 58).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 72).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0794F, 1.8405F, 0.1036F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0432F, 5.8588F, 0.7312F, 0.7938F, 0.0F, 0.0F));

		PartDefinition feet5_r1 = leftfoot.addOrReplaceChild("feet5_r1", CubeListBuilder.create().texOffs(0, 54).addBox(1.3F, -3.4F, 7.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, 2.9F, -11.1F, 0.0F, 0.0F, 0.0436F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5294F, 0.3405F, 0.7036F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(36, 76).addBox(-0.6961F, 0.0711F, -0.3881F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0361F, 3.9397F, 1.3204F, -0.3816F, 0.095F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1651F, 4.1235F, -0.1513F, 0.2939F, 0.0F, 0.0F));

		PartDefinition leg7_r1 = rightleg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(69, 75).addBox(0.15F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 26).addBox(-0.95F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0794F, 1.8405F, 0.1036F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(54, 38).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0432F, 5.8588F, 0.7312F, 0.7938F, 0.0F, 0.0F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5294F, 0.3405F, 0.7036F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition bone = body1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.2397F, 2.3856F, 2.3375F));

		PartDefinition body7_r1 = bone.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(30, 80).addBox(-0.5F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(70, 58).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.5902F, -1.2085F, 1.7806F, -1.501F, 0.0F, 0.6545F));

		PartDefinition body5_r1 = bone.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(80, 28).addBox(-0.5F, -0.4145F, -0.1902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0603F, -1.8212F, 2.6236F, -1.0472F, 0.0F, 0.6545F));

		PartDefinition body2_r2 = bone.addOrReplaceChild("body2_r2", CubeListBuilder.create().texOffs(40, 82).addBox(-0.1F, 0.4F, 1.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2397F, -2.8793F, -0.534F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body5_r2 = bone.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(25, 80).addBox(-0.3F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-0.5628F, -1.0427F, 0.5387F, 0.0F, -1.3225F, -1.5708F));

		PartDefinition body7_r2 = bone.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(79, 46).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8603F, -1.7933F, 2.419F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body6_r1 = bone.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(76, 0).addBox(-0.5F, -0.4913F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8603F, -2.4135F, 1.2668F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body3_r1 = bone.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(80, 24).addBox(-0.8018F, -1.2755F, -1.4833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.0F, -0.1F, 1.2F, -1.3225F, 0.2305F, 0.602F));

		PartDefinition body5_r3 = bone.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(78, 71).addBox(-0.5F, -0.8F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.8603F, -2.8365F, 3.3249F, 0.6807F, 0.0F, 0.0F));

		PartDefinition body4_r1 = bone.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(76, 42).addBox(-0.6396F, -0.4644F, -1.9508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0603F, -2.3539F, 1.2499F, -0.4585F, 0.1854F, -0.0503F));

		PartDefinition bone3 = body1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.2397F, 2.3856F, 2.3375F));

		PartDefinition body8_r1 = bone3.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(30, 80).mirror().addBox(-0.5F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(70, 58).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.5902F, -1.2085F, 1.7806F, -1.501F, 0.0F, -0.6545F));

		PartDefinition body6_r2 = bone3.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(80, 28).mirror().addBox(-0.5F, -0.4145F, -0.1902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0603F, -1.8212F, 2.6236F, -1.0472F, 0.0F, -0.6545F));

		PartDefinition body3_r2 = bone3.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(40, 82).mirror().addBox(-0.9F, 0.4F, 1.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2397F, -2.8793F, -0.534F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body6_r3 = bone3.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(25, 80).mirror().addBox(-0.7F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(0.5628F, -1.0427F, 0.5387F, 0.0F, 1.3225F, 1.5708F));

		PartDefinition body8_r2 = bone3.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(79, 46).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8603F, -1.7933F, 2.419F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body7_r3 = bone3.addOrReplaceChild("body7_r3", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.5F, -0.4913F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8603F, -2.4135F, 1.2668F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body4_r2 = bone3.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(80, 24).mirror().addBox(-0.1982F, -1.2755F, -1.4833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, 1.2F, -1.3225F, -0.2305F, -0.602F));

		PartDefinition body6_r4 = bone3.addOrReplaceChild("body6_r4", CubeListBuilder.create().texOffs(78, 71).mirror().addBox(-0.5F, -0.8F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.8603F, -2.8365F, 3.3249F, 0.6807F, 0.0F, 0.0F));

		PartDefinition body5_r4 = bone3.addOrReplaceChild("body5_r4", CubeListBuilder.create().texOffs(76, 42).mirror().addBox(-0.3604F, -0.4644F, -1.9508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0603F, -2.3539F, 1.2499F, -0.4585F, -0.1854F, 0.0503F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0969F, 0.2137F, -0.2007F, 0.0F, 0.0F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(62, 67).addBox(0.0F, -1.2F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 66).addBox(-0.5F, -0.9F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0555F, -1.2832F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(18, 78).addBox(-0.5F, -0.4178F, -1.9187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(35, 59).addBox(0.0F, -0.7179F, -0.9187F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4892F, -2.8807F, -0.3877F, 0.1257F, 0.3264F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2793F, -1.9313F, 0.6307F, 0.0515F, -0.0704F));

		PartDefinition neck4_r1 = neck3.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(24, 51).addBox(0.0F, -0.6F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 56).addBox(-0.5F, -0.3F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0928F, -0.2519F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(55, 61).addBox(-0.5F, -0.1794F, -11.0684F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(0, 60).addBox(-0.5F, -0.6991F, -14.9405F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 0.0081F, -2.172F, 0.5755F, 0.3054F, 0.0825F));

		PartDefinition head7_r1 = head.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(59, 27).mirror().addBox(-0.5F, -1.4F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(59, 27).addBox(1.14F, -1.4F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.82F, -0.3218F, -0.9003F, -0.7592F, 0.0F, 0.0F));

		PartDefinition head8_r1 = head.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(81, 13).mirror().addBox(-0.5F, -0.9863F, -0.0088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(81, 13).addBox(0.52F, -0.9863F, -0.0088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.51F, -2.008F, -1.5394F, -1.3439F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(81, 10).mirror().addBox(-0.34F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(35, 82).mirror().addBox(-0.45F, -0.85F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(20, 82).mirror().addBox(-0.66F, -0.85F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(81, 10).addBox(0.68F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(20, 82).addBox(1.0F, -0.85F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(35, 82).addBox(0.79F, -0.85F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.67F, -1.173F, -1.075F, -0.7941F, 0.0F, 0.0F));

		PartDefinition head7_r2 = head.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(74, 81).mirror().addBox(-0.5F, -0.65F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 81).addBox(0.52F, -0.65F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.51F, -1.208F, -1.0394F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head8_r2 = head.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(81, 75).mirror().addBox(-0.5F, -0.25F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(81, 75).addBox(0.52F, -0.25F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.51F, -1.208F, -1.0394F, -0.3491F, 0.0F, 0.0F));

		PartDefinition head11_r1 = head.addOrReplaceChild("head11_r1", CubeListBuilder.create().texOffs(79, 81).mirror().addBox(-0.642F, -0.4873F, -0.5764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 78).mirror().addBox(-0.642F, -0.4873F, 0.4236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3175F, -0.369F, -4.1857F, 0.4351F, -0.0759F, 0.0333F));

		PartDefinition head9_r1 = head.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(15, 82).mirror().addBox(-0.642F, -0.7838F, 1.2844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3175F, -0.369F, -4.1857F, 0.2169F, -0.0759F, 0.0333F));

		PartDefinition head12_r1 = head.addOrReplaceChild("head12_r1", CubeListBuilder.create().texOffs(29, 71).mirror().addBox(-0.642F, -0.3057F, -0.7363F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3175F, -0.369F, -4.1857F, 0.0424F, -0.0759F, 0.0333F));

		PartDefinition head11_r2 = head.addOrReplaceChild("head11_r2", CubeListBuilder.create().texOffs(29, 71).addBox(-0.358F, -0.3057F, -0.7363F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3175F, -0.369F, -4.1857F, 0.0424F, 0.0759F, -0.0333F));

		PartDefinition head10_r1 = head.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(79, 81).addBox(-0.358F, -0.4873F, -0.5764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 78).addBox(-0.358F, -0.4873F, 0.4236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3175F, -0.369F, -4.1857F, 0.4351F, 0.0759F, -0.0333F));

		PartDefinition head8_r3 = head.addOrReplaceChild("head8_r3", CubeListBuilder.create().texOffs(15, 82).addBox(-0.358F, -0.7838F, 1.2844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3175F, -0.369F, -4.1857F, 0.2169F, 0.0759F, -0.0333F));

		PartDefinition head5_r1 = head.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(20, 74).addBox(-1.0F, -0.075F, -0.075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.6765F, -1.0391F, -0.5236F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(44, 67).addBox(-1.0F, -1.4F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.2497F, -1.1583F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(66, 61).addBox(-1.0F, -0.3F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7201F, -1.4575F, -0.3491F, 0.0F, 0.0F));

		PartDefinition head3_r2 = head.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(79, 20).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6607F, -0.3125F, -0.829F, 0.0F, 0.0F));

		PartDefinition head2_r1 = head.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(70, 21).addBox(-0.5F, -0.049F, 0.0213F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3763F, -4.4184F, 0.4363F, 0.0F, 0.0F));

		PartDefinition head7_r3 = head.addOrReplaceChild("head7_r3", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, -0.574F, -0.4537F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -2.1682F, -23.8807F, -0.2967F, 0.0F, 0.0F));

		PartDefinition head6_r2 = head.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(59, 55).addBox(-0.5F, -0.574F, -3.6537F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(0.0F, -1.3457F, -20.5817F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head6_r3 = head.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(67, 43).addBox(-0.5F, -0.624F, -0.2537F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.1715F, -20.7218F, -0.2662F, 0.0F, 0.0F));

		PartDefinition head5_r2 = head.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(53, 67).addBox(-0.5F, -0.674F, -2.6787F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.0F, -0.6622F, -18.3765F, -0.2138F, 0.0F, 0.0F));

		PartDefinition head5_r3 = head.addOrReplaceChild("head5_r3", CubeListBuilder.create().texOffs(65, 6).addBox(-0.5F, -0.699F, -0.1787F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5382F, -18.3917F, -0.2094F, 0.0F, 0.0F));

		PartDefinition head4_r2 = head.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(11, 60).addBox(-0.5F, -0.699F, -3.7787F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, -0.0995F, -14.8186F, -0.1222F, 0.0F, 0.0F));

		PartDefinition head4_r3 = head.addOrReplaceChild("head4_r3", CubeListBuilder.create().texOffs(44, 61).addBox(-0.5F, -0.949F, -0.0787F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.3499F, -14.8618F, -0.1396F, 0.0F, 0.0F));

		PartDefinition head2_r2 = head.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(59, 49).addBox(-0.5F, -0.049F, -4.0787F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9074F, -7.0774F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head1_r1 = head.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(59, 21).addBox(-0.5F, -0.049F, -1.0787F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.9074F, -7.0774F, 0.1745F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6591F, -1.2642F, 0.2356F, 0.0F, 0.0F));

		PartDefinition head9_r2 = jaw.addOrReplaceChild("head9_r2", CubeListBuilder.create().texOffs(51, 31).addBox(-0.5F, 2.1525F, -13.9511F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -0.5223F, -9.2275F, -0.3665F, 0.0F, 0.0F));

		PartDefinition head8_r4 = jaw.addOrReplaceChild("head8_r4", CubeListBuilder.create().texOffs(52, 7).addBox(-0.5F, 1.4993F, -14.0651F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(0.0F, -0.5223F, -9.2275F, -0.3185F, 0.0F, 0.0F));

		PartDefinition head8_r5 = jaw.addOrReplaceChild("head8_r5", CubeListBuilder.create().texOffs(70, 53).addBox(-0.5F, 2.2494F, -10.3203F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.5223F, -9.2275F, -0.384F, 0.0F, 0.0F));

		PartDefinition head7_r4 = jaw.addOrReplaceChild("head7_r4", CubeListBuilder.create().texOffs(70, 48).addBox(-0.5F, 0.8301F, -10.6334F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.0F, -0.5223F, -9.2275F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head7_r5 = jaw.addOrReplaceChild("head7_r5", CubeListBuilder.create().texOffs(52, 14).addBox(-0.5F, 1.4547F, -8.2097F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5223F, -9.2275F, -0.2923F, 0.0F, 0.0F));

		PartDefinition head6_r4 = jaw.addOrReplaceChild("head6_r4", CubeListBuilder.create().texOffs(65, 12).addBox(-0.5F, 0.4741F, -8.1971F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, -0.5223F, -9.2275F, -0.1876F, 0.0F, 0.0F));

		PartDefinition head7_r6 = jaw.addOrReplaceChild("head7_r6", CubeListBuilder.create().texOffs(65, 0).addBox(-0.5F, 0.4204F, -3.8956F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, -0.5223F, -9.2275F, -0.1178F, 0.0F, 0.0F));

		PartDefinition head6_r5 = jaw.addOrReplaceChild("head6_r5", CubeListBuilder.create().texOffs(64, 27).addBox(-0.5F, 1.0419F, -3.7303F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.5223F, -9.2275F, -0.2051F, 0.0F, 0.0F));

		PartDefinition head6_r6 = jaw.addOrReplaceChild("head6_r6", CubeListBuilder.create().texOffs(80, 61).addBox(-0.5F, 0.0418F, -4.6648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -0.5223F, -9.2275F, -0.0742F, 0.0F, 0.0F));

		PartDefinition head5_r4 = jaw.addOrReplaceChild("head5_r4", CubeListBuilder.create().texOffs(24, 59).addBox(-0.5F, -0.1155F, -3.9855F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.5223F, -9.2275F, -0.0305F, 0.0F, 0.0F));

		PartDefinition jaw4_r1 = jaw.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(38, 72).addBox(-1.5F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.1029F, -1.8606F, 0.0524F, 0.0F, 0.0F));

		PartDefinition jaw3_r1 = jaw.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(69, 71).addBox(-1.5F, -0.1805F, -1.7871F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.6882F, -1.5809F, 0.0698F, 0.0F, 0.0F));

		PartDefinition jaw2_r1 = jaw.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(75, 34).addBox(-1.5F, -0.7F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1118F, -0.8809F, -0.4451F, 0.0F, 0.0F));

		PartDefinition jaw3_r2 = jaw.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(0.0087F, -0.072F, -5.0565F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6967F, -3.2442F, 0.0611F, -0.0873F, -0.0008F));

		PartDefinition jaw2_r2 = jaw.addOrReplaceChild("jaw2_r2", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0087F, -0.072F, -5.0565F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -0.6967F, -3.2442F, 0.0611F, 0.0873F, 0.0008F));

		PartDefinition jaw6_r1 = jaw.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(76, 5).addBox(-1.5F, 0.5897F, -6.0427F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(1.0F, -0.6967F, -3.2442F, -0.0785F, 0.0F, 0.0F));

		PartDefinition jaw5_r1 = jaw.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(52, 21).addBox(-1.5F, 0.478F, -4.2975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(1.0F, -0.6967F, -3.2442F, 0.0524F, 0.0F, 0.0F));

		PartDefinition jaw4_r2 = jaw.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(0, 39).addBox(-1.5F, 0.263F, -4.6561F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, -0.6967F, -3.2442F, 0.2356F, 0.0F, 0.0F));

		PartDefinition underneck3 = jaw.addOrReplaceChild("underneck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5772F, -3.4629F, -0.2246F, 0.0F, 0.0F));

		PartDefinition gums1 = jaw.addOrReplaceChild("gums1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4772F, -1.6629F, -0.055F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9568F, -4.2969F, -0.0456F, 0.0F, 0.0F));

		PartDefinition head3_r3 = head2.addOrReplaceChild("head3_r3", CubeListBuilder.create().texOffs(29, 24).mirror().addBox(-0.607F, 0.1085F, -6.2285F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.3175F, 0.5821F, 0.1378F, 0.0599F, -0.0774F, 0.0298F));

		PartDefinition head4_r4 = head2.addOrReplaceChild("head4_r4", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-0.607F, -0.7745F, -6.1312F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.3175F, 0.5821F, 0.1378F, 0.1996F, -0.0774F, 0.0298F));

		PartDefinition head3_r4 = head2.addOrReplaceChild("head3_r4", CubeListBuilder.create().texOffs(0, 30).addBox(-0.393F, -0.7745F, -6.1312F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.3175F, 0.5821F, 0.1378F, 0.1996F, 0.0774F, -0.0298F));

		PartDefinition head2_r3 = head2.addOrReplaceChild("head2_r3", CubeListBuilder.create().texOffs(29, 24).addBox(-0.393F, 0.1085F, -6.2285F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3175F, 0.5821F, 0.1378F, 0.0599F, 0.0774F, -0.0298F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -7.5F, -0.1367F, 0.0F, 0.0F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.66F, 4.0F, 0.0948F, 0.0F, 0.0F));

		PartDefinition lips1 = head3.addOrReplaceChild("lips1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.85F, 0.1F, 3.9F, 0.0025F, -0.0138F, 0.2731F));

		PartDefinition lips2 = head3.addOrReplaceChild("lips2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.85F, 0.1F, 3.9F, 0.0025F, 0.0138F, -0.2731F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, 0.1559F, 0.0F, 0.0F));

		PartDefinition head6_r7 = head4.addOrReplaceChild("head6_r7", CubeListBuilder.create().texOffs(64, 33).addBox(-1.0F, -0.5F, -0.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0078F)), PartPose.offsetAndRotation(0.0F, 3.5522F, 2.598F, 0.8901F, 0.0F, 0.0F));

		PartDefinition head7_r7 = head4.addOrReplaceChild("head7_r7", CubeListBuilder.create().texOffs(75, 66).mirror().addBox(-0.607F, -0.8475F, 0.6894F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3175F, 2.1771F, -0.2026F, -0.0102F, -0.0718F, 0.0414F));

		PartDefinition head6_r8 = head4.addOrReplaceChild("head6_r8", CubeListBuilder.create().texOffs(75, 66).addBox(-0.393F, -0.8475F, 0.6894F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3175F, 2.1771F, -0.2026F, -0.0102F, 0.0718F, -0.0414F));

		PartDefinition head7_r8 = head4.addOrReplaceChild("head7_r8", CubeListBuilder.create().texOffs(47, 72).addBox(-0.5F, -2.1F, 0.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.7794F, 3.8957F, 1.1083F, 0.0F, 0.0F));

		PartDefinition head6_r9 = head4.addOrReplaceChild("head6_r9", CubeListBuilder.create().texOffs(15, 42).addBox(-0.5F, -1.858F, -2.2717F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6604F, 5.3593F, 0.8029F, 0.0F, 0.0F));

		PartDefinition crest1 = head.addOrReplaceChild("crest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.2568F, 6.1531F, -0.0911F, 0.0F, 0.0F));

		PartDefinition crest7_r1 = crest1.addOrReplaceChild("crest7_r1", CubeListBuilder.create().texOffs(22, 65).addBox(-0.5F, -5.9548F, -1.9754F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.2091F, -2.4655F, -0.4102F, 0.0F, 0.0F));

		PartDefinition crest6_r1 = crest1.addOrReplaceChild("crest6_r1", CubeListBuilder.create().texOffs(62, 71).addBox(-0.5F, -2.0F, -1.125F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(0.0F, 3.971F, -7.0986F, -0.2094F, 0.0F, 0.0F));

		PartDefinition crest12_r1 = crest1.addOrReplaceChild("crest12_r1", CubeListBuilder.create().texOffs(10, 79).addBox(-0.5F, -0.0065F, -0.896F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(0.0F, -6.551F, 0.6671F, -0.3578F, 0.0F, 0.0F));

		PartDefinition crest11_r1 = crest1.addOrReplaceChild("crest11_r1", CubeListBuilder.create().texOffs(5, 79).addBox(-0.5F, -1.9065F, 0.004F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -5.7752F, -1.2869F, -0.7505F, 0.0F, 0.0F));

		PartDefinition crest10_r1 = crest1.addOrReplaceChild("crest10_r1", CubeListBuilder.create().texOffs(74, 75).addBox(-0.5F, -3.0065F, 0.004F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -4.5726F, -3.9258F, -1.1432F, 0.0F, 0.0F));

		PartDefinition crest9_r1 = crest1.addOrReplaceChild("crest9_r1", CubeListBuilder.create().texOffs(13, 51).addBox(-0.5F, -4.0065F, 0.004F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(0.0F, -4.1435F, -6.4901F, -1.405F, 0.0F, 0.0F));

		PartDefinition crest8_r1 = crest1.addOrReplaceChild("crest8_r1", CubeListBuilder.create().texOffs(80, 58).addBox(-0.5F, -1.0065F, 0.004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -3.7349F, -7.292F, -1.0996F, 0.0F, 0.0F));

		PartDefinition crest7_r2 = crest1.addOrReplaceChild("crest7_r2", CubeListBuilder.create().texOffs(28, 42).addBox(-0.5F, -1.9815F, 0.004F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.1414F, -8.3269F, -0.576F, 0.0F, 0.0F));

		PartDefinition crest6_r2 = crest1.addOrReplaceChild("crest6_r2", CubeListBuilder.create().texOffs(29, 65).addBox(-0.5F, -2.0315F, 0.004F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.1442F, -8.4315F, -0.0524F, 0.0F, 0.0F));

		PartDefinition crest5_r1 = crest1.addOrReplaceChild("crest5_r1", CubeListBuilder.create().texOffs(28, 50).addBox(-0.5F, -3.6565F, -2.996F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(0.0F, 2.9113F, -4.8785F, 0.1658F, 0.0F, 0.0F));

		PartDefinition crest2 = crest1.addOrReplaceChild("crest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 1.3F, 0.0456F, 0.0F, 0.0F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2474F, 1.0985F, 1.6625F, 0.8444F, -0.2447F, -0.1311F));

		PartDefinition upperwing8_r1 = leftwing1.addOrReplaceChild("upperwing8_r1", CubeListBuilder.create().texOffs(17, 30).addBox(-0.25F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 50).addBox(-1.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0747F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5789F, -0.0386F, -0.1429F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 66).addBox(-0.5789F, -0.0386F, -0.9429F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.7449F, 0.2662F, -0.0262F, -2.3175F, 0.4327F, 1.6683F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(48, 78).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0415F, 5.4479F, 1.7672F, -1.5166F, -0.7109F, 1.5074F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(54, 49).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.0119F, 6.1819F, -0.4355F, -0.3911F, -0.1701F, -0.0139F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5799F, -0.5164F, -0.654F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1051F, 9.8035F, 0.011F, 1.8706F, 0.0933F, 3.0742F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1876F, 0.4322F, 12.2357F, 0.1854F, -0.1332F, 0.0208F));

		PartDefinition leftwing7 = leftwing5.addOrReplaceChild("leftwing7", CubeListBuilder.create().texOffs(17, 33).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0153F, 9.5603F, 0.2336F, -0.0424F, -0.0101F));

		PartDefinition leftwing8 = leftwing7.addOrReplaceChild("leftwing8", CubeListBuilder.create().texOffs(41, 42).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.516F, 6.4268F, 0.2334F, 0.0F, 0.0F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2305F, 0.1107F, 0.453F, -2.0155F, 1.0391F, -1.7582F));

		PartDefinition hand7_r1 = lefthand2.addOrReplaceChild("hand7_r1", CubeListBuilder.create().texOffs(0, 75).addBox(-2.05F, -0.4F, -1.35F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0005F, 1.2864F, 1.2822F, -0.9712F, -0.1245F, 0.1796F));

		PartDefinition leftwing4membrance = leftwing4.addOrReplaceChild("leftwing4membrance", CubeListBuilder.create(), PartPose.offset(-12.2799F, 3.7836F, 3.946F));

		PartDefinition leftwing3membrance = leftwing2.addOrReplaceChild("leftwing3membrance", CubeListBuilder.create(), PartPose.offset(0.9398F, 0.1609F, 0.9501F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3497F, 0.2368F, 2.9354F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2474F, 1.0985F, 1.6625F, 0.8652F, 0.2207F, 0.2016F));

		PartDefinition upperwing9_r1 = rightwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(65, 18).addBox(-3.75F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 54).addBox(0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0747F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create().texOffs(10, 66).addBox(-0.4211F, -0.0386F, -0.1429F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 66).addBox(-0.4211F, -0.0386F, -0.9429F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.7449F, 0.2662F, -0.0262F, -2.4417F, -0.3878F, -1.5838F));

		PartDefinition wing9_r1 = rightwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0415F, 5.4479F, 1.7672F, -1.5166F, 0.7109F, -1.5074F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(39, 56).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.0119F, 6.1819F, -0.4355F, -0.3684F, 0.2439F, 0.1244F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create().texOffs(0, 15).addBox(-0.4201F, -0.5164F, -0.654F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1051F, 9.8035F, 0.011F, 1.8345F, 0.1027F, -3.0276F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(29, 12).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1876F, 0.4322F, 12.2357F, 0.1903F, 0.0863F, 0.0127F));

		PartDefinition rightwing7 = rightwing5.addOrReplaceChild("rightwing7", CubeListBuilder.create().texOffs(34, 33).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0153F, 9.5603F, 0.3707F, 0.1534F, 0.0836F));

		PartDefinition rightwing8 = rightwing7.addOrReplaceChild("rightwing8", CubeListBuilder.create().texOffs(46, 24).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.516F, 6.4268F, 0.1542F, 0.2036F, 0.0788F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2305F, 0.1107F, 0.453F, -2.0155F, -1.0391F, 1.7582F));

		PartDefinition hand8_r1 = righthand2.addOrReplaceChild("hand8_r1", CubeListBuilder.create().texOffs(9, 75).addBox(-0.45F, -0.9F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5005F, 0.5364F, 0.0322F, -1.2464F, 0.1313F, -0.3712F));

		PartDefinition rightwing4membrance = rightwing4.addOrReplaceChild("rightwing4membrance", CubeListBuilder.create(), PartPose.offset(12.2799F, 3.7836F, 3.946F));

		PartDefinition rightwing3membrance = rightwing2.addOrReplaceChild("rightwing3membrance", CubeListBuilder.create(), PartPose.offset(-0.9398F, 0.1609F, 0.9501F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3497F, 0.2368F, 2.9354F, 0.0021F, 0.3752F, 0.0093F));

		PartDefinition bone2 = chest1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3397F, 3.5459F, 0.4363F, 0.0F, 0.0F));

		PartDefinition chest3_r2 = bone2.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(76, 38).addBox(-0.5F, 0.1311F, -3.1217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(54, 44).addBox(-1.5F, 0.1311F, -2.1217F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition chest5_r5 = bone2.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(29, 76).addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6223F, -0.7779F, -1.6865F, 1.2901F, 0.0063F, 0.3002F));

		PartDefinition chest3_r3 = bone2.addOrReplaceChild("chest3_r3", CubeListBuilder.create().texOffs(76, 16).addBox(-0.1716F, -0.4914F, -0.4076F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, -1.3754F, -1.6129F, 0.5578F, -0.1999F, -0.1644F));

		PartDefinition chest4_r2 = bone2.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(59, 78).addBox(-0.1716F, -0.6467F, 1.1455F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, -1.3754F, -1.6129F, 0.4356F, -0.1999F, -0.1644F));

		PartDefinition bone4 = chest1.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3397F, 3.5459F, 0.4363F, 0.0F, 0.0F));

		PartDefinition chest6_r6 = bone4.addOrReplaceChild("chest6_r6", CubeListBuilder.create().texOffs(29, 76).mirror().addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6223F, -0.7779F, -1.6865F, 1.2901F, -0.0063F, -0.3002F));

		PartDefinition chest4_r3 = bone4.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(-0.8283F, -0.4914F, -0.4076F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -1.3754F, -1.6129F, 0.5578F, 0.1999F, 0.1644F));

		PartDefinition chest5_r6 = bone4.addOrReplaceChild("chest5_r6", CubeListBuilder.create().texOffs(59, 78).mirror().addBox(-0.8283F, -0.6467F, 1.1455F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -1.3754F, -1.6129F, 0.4356F, 0.1999F, 0.1644F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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