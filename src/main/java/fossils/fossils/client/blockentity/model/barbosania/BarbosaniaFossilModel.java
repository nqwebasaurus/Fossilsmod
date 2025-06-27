package fossils.fossils.client.blockentity.model.barbosania;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BarbosaniaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
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
	private final ModelPart body;
	private final ModelPart shoulder;
	private final ModelPart leftwing1;
	private final ModelPart leftwing2;
	private final ModelPart leftwing3;
	private final ModelPart leftwing4;
	private final ModelPart leftwing5;
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
	private final ModelPart rightwing6;
	private final ModelPart rightwing5membrance2;
	private final ModelPart righthand2;
	private final ModelPart rightwing4membrance;
	private final ModelPart rightwing3membrance;
	private final ModelPart rightwing1membrance;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;

	public BarbosaniaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftleg1 = this.hips.getChild("leftleg1");
		this.leftleg2 = this.leftleg1.getChild("leftleg2");
		this.leftfoot = this.leftleg2.getChild("leftfoot");
		this.leftlegwing2 = this.leftleg2.getChild("leftlegwing2");
		this.leftlegwing1 = this.leftleg1.getChild("leftlegwing1");
		this.rightleg1 = this.hips.getChild("rightleg1");
		this.rightleg2 = this.rightleg1.getChild("rightleg2");
		this.rightfoot = this.rightleg2.getChild("rightfoot");
		this.rightlegwing2 = this.rightleg2.getChild("rightlegwing2");
		this.rightlegwing1 = this.rightleg1.getChild("rightlegwing1");
		this.bone = this.hips.getChild("bone");
		this.body = this.hips.getChild("body");
		this.shoulder = this.body.getChild("shoulder");
		this.leftwing1 = this.shoulder.getChild("leftwing1");
		this.leftwing2 = this.leftwing1.getChild("leftwing2");
		this.leftwing3 = this.leftwing2.getChild("leftwing3");
		this.leftwing4 = this.leftwing3.getChild("leftwing4");
		this.leftwing5 = this.leftwing4.getChild("leftwing5");
		this.leftwing6 = this.leftwing4.getChild("leftwing6");
		this.leftwing5membrance2 = this.leftwing6.getChild("leftwing5membrance2");
		this.lefthand2 = this.leftwing4.getChild("lefthand2");
		this.leftwing4membrance = this.leftwing4.getChild("leftwing4membrance");
		this.leftwing3membrance = this.leftwing2.getChild("leftwing3membrance");
		this.leftwing1membrance = this.leftwing1.getChild("leftwing1membrance");
		this.rightwing1 = this.shoulder.getChild("rightwing1");
		this.rightwing2 = this.rightwing1.getChild("rightwing2");
		this.rightwing3 = this.rightwing2.getChild("rightwing3");
		this.rightwing4 = this.rightwing3.getChild("rightwing4");
		this.rightwing5 = this.rightwing4.getChild("rightwing5");
		this.rightwing6 = this.rightwing4.getChild("rightwing6");
		this.rightwing5membrance2 = this.rightwing6.getChild("rightwing5membrance2");
		this.righthand2 = this.rightwing4.getChild("righthand2");
		this.rightwing4membrance = this.rightwing4.getChild("rightwing4membrance");
		this.rightwing3membrance = this.rightwing2.getChild("rightwing3membrance");
		this.rightwing1membrance = this.rightwing1.getChild("rightwing1membrance");
		this.neck3 = this.shoulder.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.9F, 8.4F, -0.1396F, 0.0F, 0.0F));

		PartDefinition body6_r1 = hips.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(24, 52).mirror().addBox(-0.5414F, -0.7152F, -0.105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.8437F, -0.3782F, -1.4844F, -0.1631F, -0.4671F));

		PartDefinition body6_r2 = hips.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(52, 28).mirror().addBox(-0.5F, -0.961F, 0.2605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(52, 28).addBox(2.3F, -0.961F, 0.2605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-1.4F, -0.8437F, -0.3782F, -1.1432F, 0.0F, 0.0F));

		PartDefinition body5_r1 = hips.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(48, 8).mirror().addBox(-0.5566F, -0.3905F, -1.6669F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.8437F, -0.3782F, -0.5329F, -0.14F, 0.1318F));

		PartDefinition body7_r1 = hips.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(7, 52).mirror().addBox(-0.5F, -0.4357F, -0.7733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(7, 52).addBox(2.3F, -0.4357F, -0.7733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, -0.8437F, -0.3782F, -0.3752F, 0.0F, 0.0F));

		PartDefinition body8_r1 = hips.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-1.0F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(43, 0).addBox(0.0F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, -0.3055F, -0.1457F, -0.3229F, 0.0F, 0.0F));

		PartDefinition body4_r1 = hips.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(48, 8).addBox(-0.4434F, -0.3905F, -1.6669F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, -0.8437F, -0.3782F, -0.5329F, 0.14F, -0.1318F));

		PartDefinition body5_r2 = hips.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(24, 52).addBox(-0.4586F, -0.7152F, -0.105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, -0.8437F, -0.3782F, -1.4844F, 0.1631F, 0.4671F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.5F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftleg1 = hips.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(14, 48).addBox(-0.3039F, 0.0711F, -0.3881F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7F, -0.075F, -0.1694F, 0.1533F, -0.0858F, -0.1161F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1435F, 3.9933F, 0.3866F, 0.3376F, -0.0084F, 0.0879F));

		PartDefinition leg6_r1 = leftleg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(40, 44).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(27, 45).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0416F, 4.5665F, 0.596F, -0.1836F, 0.0804F, -0.024F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = hips.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(45, 46).addBox(-0.6961F, 0.0711F, -0.3881F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7F, -0.075F, -0.1694F, -0.283F, 0.0858F, 0.1161F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1435F, 3.9933F, 0.3866F, 0.3376F, 0.0084F, -0.0879F));

		PartDefinition leg7_r1 = rightleg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(44, 35).addBox(0.15F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(9, 45).addBox(-0.95F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(30, 21).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0416F, 4.5665F, 0.596F, 0.1218F, -0.0804F, 0.024F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5558F, 0.8424F, 0.9592F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition chest5_r1 = body.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(24, 12).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9685F, -2.1571F, -0.066F, -0.1614F, -0.7373F));

		PartDefinition chest6_r1 = body.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(17, 12).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9685F, -2.1571F, 0.0394F, -0.1697F, -1.3568F));

		PartDefinition chest6_r2 = body.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(22, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2685F, -0.1571F, -0.2715F, -0.3172F, -0.8104F));

		PartDefinition chest7_r1 = body.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(17, 28).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2685F, -0.1571F, -0.0326F, -0.4133F, -1.4581F));

		PartDefinition chest6_r3 = body.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(17, 28).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2685F, -0.1571F, -0.0326F, 0.4133F, 1.4581F));

		PartDefinition chest5_r2 = body.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(22, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2685F, -0.1571F, -0.2715F, 0.3172F, 0.8104F));

		PartDefinition chest4_r1 = body.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(24, 12).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9685F, -2.1571F, -0.066F, 0.1614F, 0.7373F));

		PartDefinition chest5_r3 = body.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(17, 12).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9685F, -2.1571F, 0.0394F, 0.1697F, 1.3568F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 23).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6F, -2.5F, -0.4014F, 0.0F, 0.0F));

		PartDefinition shoulder = body.addOrReplaceChild("shoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.6F, 0.044F, -0.1308F, -0.0057F));

		PartDefinition chest4_r2 = shoulder.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(27, 40).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3713F, -0.6663F, 0.1767F, 0.4736F, 0.0813F));

		PartDefinition chest5_r4 = shoulder.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(19, 49).mirror().addBox(0.1901F, -0.1854F, 0.1743F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.8287F, -2.4663F, 1.1341F, 0.4326F, -0.5013F));

		PartDefinition chest7_r2 = shoulder.addOrReplaceChild("chest7_r2", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5685F, -1.5571F, 0.101F, 0.0578F, -1.3079F));

		PartDefinition chest6_r4 = shoulder.addOrReplaceChild("chest6_r4", CubeListBuilder.create().texOffs(7, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5685F, -1.5571F, 0.1158F, -0.0105F, -0.7006F));

		PartDefinition chest3_r1 = shoulder.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(27, 40).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.3713F, -0.6663F, 0.1767F, -0.4736F, -0.0813F));

		PartDefinition chest4_r3 = shoulder.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(19, 49).addBox(-1.1901F, -0.1854F, 0.1743F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, 1.8287F, -2.4663F, 1.1341F, -0.4326F, 0.5013F));

		PartDefinition chest3_r2 = shoulder.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(36, 40).addBox(-1.0F, -0.9773F, -1.995F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6901F, -1.8432F, -0.6807F, 0.0F, 0.0F));

		PartDefinition chest2_r1 = shoulder.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(11, 32).addBox(-1.5F, -0.7F, -1.3F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3901F, -0.5432F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest5_r5 = shoulder.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(7, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5685F, -1.5571F, 0.1158F, 0.0105F, 0.7006F));

		PartDefinition chest6_r5 = shoulder.addOrReplaceChild("chest6_r5", CubeListBuilder.create().texOffs(0, 28).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5685F, -1.5571F, 0.101F, -0.0578F, 1.3079F));

		PartDefinition cube_r3 = shoulder.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(43, 14).addBox(0.0F, -0.0436F, -0.0682F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.2F, -1.7F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftwing1 = shoulder.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.775F, -2.1694F, 0.0079F, 0.0113F, 0.4675F));

		PartDefinition upperwing8_r1 = leftwing1.addOrReplaceChild("upperwing8_r1", CubeListBuilder.create().texOffs(30, 18).addBox(-0.25F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 53).addBox(-1.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7709F, -0.2894F, -0.2119F, -1.5392F, 0.4501F, -1.8306F));

		PartDefinition wing10_r1 = leftwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(17, 39).addBox(-0.9072F, -2.9026F, -0.7631F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(22, 40).addBox(-0.9072F, -2.9026F, 0.0369F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing9_r1 = leftwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(54, 7).addBox(-0.3631F, -1.0901F, -0.2027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0717F, 7.464F, -0.1798F, 0.0F, -1.5708F, 0.6894F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(8, 0).addBox(-0.3631F, -2.796F, -0.2388F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.4283F, 6.764F, -0.1798F, 0.0F, -1.5708F, 0.3752F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(35, 44).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.3415F, 7.054F, -0.649F, 0.1773F, 0.1014F, 0.6665F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create().texOffs(30, 2).addBox(-0.5799F, -0.5164F, -0.654F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2828F, 5.3557F, 0.701F, 1.4864F, -0.5178F, -0.4679F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(17, 16).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2799F, 0.4836F, 9.246F, 0.2838F, 0.2207F, 0.251F));

		PartDefinition wingfinger9_r1 = leftwing5.addOrReplaceChild("wingfinger9_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.7865F, 0.013F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2F, 9.3F, 0.5777F, 0.0732F, 0.0476F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1587F, -0.1155F, 0.3237F, -1.4191F, 1.0011F, -0.4255F));

		PartDefinition leftwing4membrance = leftwing4.addOrReplaceChild("leftwing4membrance", CubeListBuilder.create(), PartPose.offset(-12.2799F, 3.7836F, 3.946F));

		PartDefinition leftwing3membrance = leftwing2.addOrReplaceChild("leftwing3membrance", CubeListBuilder.create(), PartPose.offset(0.5397F, 0.1609F, 0.9501F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3496F, 0.2368F, 2.9355F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = shoulder.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.775F, -2.1694F, -0.0301F, 0.9486F, -0.4564F));

		PartDefinition upperwing9_r1 = rightwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(30, 15).addBox(-4.75F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 53).addBox(0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7709F, -0.2894F, -0.2119F, -2.1366F, -0.2745F, 2.0161F));

		PartDefinition wing11_r1 = rightwing2.addOrReplaceChild("wing11_r1", CubeListBuilder.create().texOffs(17, 16).addBox(-0.0928F, -2.9026F, -0.7631F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(22, 16).addBox(-0.0928F, -2.9026F, 0.0369F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing10_r2 = rightwing2.addOrReplaceChild("wing10_r2", CubeListBuilder.create().texOffs(53, 48).addBox(-0.6369F, -1.0901F, -0.2027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0717F, 7.464F, -0.1798F, 0.0F, 1.5708F, -0.6894F));

		PartDefinition wing9_r2 = rightwing2.addOrReplaceChild("wing9_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6369F, -2.796F, -0.2388F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.4283F, 6.764F, -0.1798F, 0.0F, 1.5708F, -0.3752F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(43, 4).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.3415F, 7.054F, -0.649F, 0.1773F, -0.1014F, -0.6665F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create().texOffs(21, 28).addBox(-0.4201F, -0.5164F, -0.654F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2828F, 5.3557F, 0.701F, 1.4864F, 0.5178F, 0.4679F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2799F, 0.4836F, 9.246F, 0.2838F, -0.2207F, -0.251F));

		PartDefinition wingfinger10_r1 = rightwing5.addOrReplaceChild("wingfinger10_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.7865F, 0.013F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2F, 9.3F, 0.5777F, -0.0732F, -0.0476F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(41, 31).addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1587F, -0.1155F, 0.3237F, -1.4191F, -1.0011F, 0.4255F));

		PartDefinition rightwing4membrance = rightwing4.addOrReplaceChild("rightwing4membrance", CubeListBuilder.create(), PartPose.offset(12.2799F, 3.7836F, 3.946F));

		PartDefinition rightwing3membrance = rightwing2.addOrReplaceChild("rightwing3membrance", CubeListBuilder.create(), PartPose.offset(-0.5397F, 0.1609F, 0.9501F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3496F, 0.2368F, 2.9355F, 0.0021F, 0.3752F, 0.0093F));

		PartDefinition neck3 = shoulder.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -1.9F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(7, 22).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -1.8F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r5 = neck2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 16).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.3F, -1.6F, -0.3665F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -1.6F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r6 = neck.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(47, 26).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -1.7F, -0.2094F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -1.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(40, 28).addBox(-1.5F, -1.029F, -0.9547F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.5961F, 0.5666F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 4).addBox(-1.5F, -2.0086F, -0.9201F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.8039F, -0.8334F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 7).addBox(1.0F, -1.0067F, -0.8753F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.7497F, -0.9071F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(45, 42).mirror().addBox(-0.8F, 0.8268F, -0.9598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(45, 42).addBox(-0.2F, 0.8268F, -0.9598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3953F, -2.4463F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(8, 36).mirror().addBox(-0.6F, -0.119F, -0.1369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.107F)).mirror(false)
				.texOffs(8, 36).addBox(-0.2F, -0.119F, -0.1369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 0.5047F, -3.7463F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(51, 12).mirror().addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(56, 10).mirror().addBox(-0.4F, -1.7F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(56, 10).addBox(1.42F, -1.7F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(51, 12).addBox(1.42F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.01F, -0.1168F, -0.2392F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(55, 4).mirror().addBox(-1.51F, -0.1777F, -0.8269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 4).addBox(-0.09F, -0.1777F, -0.8269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -1.0584F, -1.1576F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(52, 20).mirror().addBox(-1.53F, 0.3056F, -1.1146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(50, 41).mirror().addBox(-1.65F, 0.3056F, -1.1146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 41).addBox(0.05F, 0.3056F, -1.1146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(52, 20).addBox(-0.07F, 0.3056F, -1.1146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -1.7584F, -1.1576F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(13, 55).mirror().addBox(-1.51F, -0.589F, 0.2213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(13, 55).addBox(-0.09F, -0.589F, 0.2213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3F, -0.4584F, -1.2576F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(5, 56).mirror().addBox(-0.5F, -0.1F, -0.0351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(5, 56).addBox(0.92F, -0.1F, -0.0351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.71F, -0.6374F, -0.6812F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(55, 43).mirror().addBox(-0.5F, -0.8313F, -0.8125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 43).addBox(0.92F, -0.8313F, -0.8125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.71F, -0.9374F, 0.0188F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(55, 40).mirror().addBox(-0.5F, -0.8238F, -0.874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(55, 36).mirror().addBox(-0.5F, -0.8238F, -1.174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 36).addBox(0.92F, -0.8238F, -1.174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 40).addBox(0.92F, -0.8238F, -0.874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.71F, -0.4374F, -0.1812F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(55, 16).mirror().addBox(-0.2F, -0.3277F, -0.3413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(55, 16).addBox(1.42F, -0.3277F, -0.3413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-1.11F, -0.2943F, -1.7207F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(36, 55).mirror().addBox(-0.2F, -0.3424F, -0.3293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(36, 55).addBox(1.42F, -0.3424F, -0.3293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.11F, -0.1943F, -2.1207F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(49, 37).addBox(-1.0F, -0.3316F, 0.6894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.306F))
				.texOffs(50, 38).addBox(-0.8F, -0.3316F, 1.6894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(50, 38).mirror().addBox(-2.42F, -0.3316F, 1.6894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(49, 37).mirror().addBox(-2.22F, -0.3316F, 0.6894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(52, 23).mirror().addBox(-2.22F, -0.3316F, 0.1894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 18).mirror().addBox(-2.02F, -0.3316F, -0.3106F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(52, 23).addBox(-1.0F, -0.3316F, 0.1894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 18).addBox(-1.2F, -0.3316F, -0.3106F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.11F, 1.0057F, -4.2207F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(1, 52).addBox(-0.8F, -0.2921F, -0.7999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(0, 51).addBox(-1.0F, -0.3F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(1, 52).mirror().addBox(-2.22F, -0.2921F, -0.7999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(1, 52).mirror().addBox(-2.22F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 51).mirror().addBox(-2.02F, -0.3F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(49, 33).mirror().addBox(-2.12F, -0.2F, -2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(48, 50).mirror().addBox(-1.92F, -0.2F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(50, 44).mirror().addBox(-2.02F, -0.1F, -4.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(50, 44).addBox(-1.0F, -0.1F, -4.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(49, 33).addBox(-0.9F, -0.2F, -2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F))
				.texOffs(48, 50).addBox(-1.1F, -0.2F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.01F, 0.0057F, -1.7207F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.8F, -0.8466F, -0.1616F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(0, 38).addBox(0.0F, -0.8466F, -0.1616F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 1.2047F, -3.5463F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 53).mirror().addBox(-0.2139F, -0.0598F, -0.3335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.224F)).mirror(false)
				.texOffs(0, 55).mirror().addBox(-0.2139F, -0.3598F, -0.3335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.4095F, -10.995F, -0.4778F, 0.144F, 0.2703F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(34, 28).mirror().addBox(-0.8F, -0.8483F, -2.8096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(30, 0).mirror().addBox(-0.8F, -0.4483F, -2.8096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(30, 0).addBox(-0.6F, -0.4483F, -2.8096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.22F))
				.texOffs(34, 28).addBox(-0.6F, -0.8483F, -2.8096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.2F, 3.1047F, -8.4463F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(54, 53).addBox(-0.7861F, -0.0598F, -0.3335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.224F))
				.texOffs(0, 55).addBox(-0.7861F, -0.3598F, -0.3335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.3F, 3.4095F, -10.995F, -0.4778F, -0.144F, -0.2703F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(30, 5).mirror().addBox(-0.9F, -0.534F, -2.7703F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(30, 5).addBox(-0.5F, -0.534F, -2.7703F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.2F, 2.2047F, -6.0463F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(34, 33).mirror().addBox(-0.9F, -0.734F, -2.7703F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(34, 33).addBox(-0.5F, -0.734F, -2.7703F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 2.2047F, -6.0463F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(22, 32).mirror().addBox(-0.9F, -0.6183F, -3.0483F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.23F)).mirror(false)
				.texOffs(0, 7).mirror().addBox(-0.9F, -0.8183F, -3.0483F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(22, 32).addBox(-0.3F, -0.6183F, -3.0483F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.23F))
				.texOffs(0, 7).addBox(-0.3F, -0.8183F, -3.0483F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 1.2047F, -3.3463F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(30, 50).mirror().addBox(-0.1F, -0.4113F, -0.3969F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.404F)).mirror(false)
				.texOffs(30, 50).addBox(0.92F, -0.4113F, -0.3969F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.404F)), PartPose.offsetAndRotation(-0.91F, 1.5057F, -5.1207F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-0.9F, -0.1645F, -3.2526F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 22).addBox(-0.3F, -0.1645F, -3.2526F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1F, 0.3047F, -3.5463F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(37, 51).addBox(-0.5F, -0.055F, -0.0303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2535F, -1.1121F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(14, 36).addBox(-0.5F, 0.0233F, -0.0179F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3953F, -0.8463F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(7, 41).addBox(-0.5F, -1.8557F, -2.961F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4953F, 1.0537F, 0.6632F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(17, 5).addBox(-0.4F, 1.16F, -11.1846F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.214F))
				.texOffs(0, 47).addBox(-0.4F, 0.76F, -9.9846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.23F))
				.texOffs(17, 5).mirror().addBox(-0.6F, 1.16F, -11.1846F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(0, 47).mirror().addBox(-0.6F, 0.76F, -9.9846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7047F, -0.5463F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r35 = jaw.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(31, 54).mirror().addBox(-0.4132F, -0.8675F, -0.5858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.2101F, -10.6909F, 0.2092F, 0.0266F, -0.654F));

		PartDefinition cube_r36 = jaw.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(54, 32).mirror().addBox(-0.4132F, -0.5063F, -0.5709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.2101F, -10.6909F, 0.3139F, 0.0266F, -0.654F));

		PartDefinition cube_r37 = jaw.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(49, 54).mirror().addBox(-0.3906F, -0.5923F, 0.0064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.2101F, -10.6909F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r38 = jaw.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-0.8F, -0.83F, -3.7538F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.214F)).mirror(false)
				.texOffs(0, 16).addBox(-0.4F, -0.83F, -3.7538F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1F, 1.3F, -4.9F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r39 = jaw.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.4F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.23F)).mirror(false)
				.texOffs(0, 0).addBox(0.0F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(-0.3F, 0.7627F, -5.3777F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r40 = jaw.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(17, 0).mirror().addBox(-0.9F, -0.5442F, -2.78F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(17, 0).addBox(-0.3F, -0.5442F, -2.78F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1F, 0.4F, -2.5F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r41 = jaw.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(7, 7).mirror().addBox(-1.1F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(7, 16).mirror().addBox(-1.1F, -0.3F, -2.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(7, 7).addBox(0.1F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(7, 16).addBox(0.1F, -0.3F, -2.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r42 = jaw.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(31, 54).addBox(-0.5868F, -0.8675F, -0.5858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(0.3F, 1.2101F, -10.6909F, 0.2092F, -0.0266F, 0.654F));

		PartDefinition cube_r43 = jaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(54, 32).addBox(-0.5868F, -0.5063F, -0.5709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(0.3F, 1.2101F, -10.6909F, 0.3139F, -0.0266F, 0.654F));

		PartDefinition cube_r44 = jaw.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(49, 54).addBox(-0.6094F, -0.5923F, 0.0064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(0.3F, 1.2101F, -10.6909F, 0.0F, 0.0F, 0.4363F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(47, 21).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.4755F, 0.2598F, -0.0326F));

		return LayerDefinition.create(meshdefinition, 60, 60);
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