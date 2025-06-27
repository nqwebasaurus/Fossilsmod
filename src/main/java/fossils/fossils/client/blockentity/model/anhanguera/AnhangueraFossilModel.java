package fossils.fossils.client.blockentity.model.anhanguera;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnhangueraFossilModel extends SkullModelBase {
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
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;

	public AnhangueraFossilModel(ModelPart root) {
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
		this.neck4 = this.shoulder.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.0F, 3.6F, 1.0001F, 0.0603F, -0.1163F));

		PartDefinition body6_r1 = hips.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(53, 54).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(53, 54).addBox(2.3F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-1.4F, -0.4051F, 0.6276F, -0.6545F, 0.0F, 0.0F));

		PartDefinition body8_r1 = hips.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(38, 49).mirror().addBox(-0.1F, -0.4018F, -0.4752F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(55, 6).mirror().addBox(-0.5F, -0.4018F, -0.4752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(38, 49).addBox(0.9F, -0.4018F, -0.4752F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(55, 6).addBox(2.3F, -0.4018F, -0.4752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, -0.3437F, -0.6782F, 0.1134F, 0.0F, 0.0F));

		PartDefinition body5_r1 = hips.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(53, 39).mirror().addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1015F, -0.519F, -1.1428F, -0.6155F, -0.1854F, 0.0503F));

		PartDefinition body9_r1 = hips.addOrReplaceChild("body9_r1", CubeListBuilder.create().texOffs(40, 53).mirror().addBox(-0.4498F, -0.4635F, -0.1149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.8558F, 0.7424F, 0.9592F, -2.5569F, 0.0F, -0.7243F));

		PartDefinition body8_r2 = hips.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(55, 10).mirror().addBox(-0.4498F, -0.7196F, -0.6815F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8558F, 0.7424F, 0.9592F, 3.0281F, 0.0F, -0.7243F));

		PartDefinition body7_r1 = hips.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(57, 30).mirror().addBox(-0.3708F, 0.6836F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(55, 23).mirror().addBox(-0.3708F, 0.2836F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2558F, -0.0576F, 0.9592F, -1.0472F, 0.0F, -0.3752F));

		PartDefinition body4_r1 = hips.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(53, 39).addBox(-0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1015F, -0.519F, -1.1428F, -0.6155F, 0.1854F, -0.0503F));

		PartDefinition body8_r3 = hips.addOrReplaceChild("body8_r3", CubeListBuilder.create().texOffs(40, 53).addBox(-0.5502F, -0.4635F, -0.1149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.8558F, 0.7424F, 0.9592F, -2.5569F, 0.0F, 0.7243F));

		PartDefinition body7_r2 = hips.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(55, 10).addBox(-0.5502F, -0.7196F, -0.6815F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8558F, 0.7424F, 0.9592F, 3.0281F, 0.0F, 0.7243F));

		PartDefinition body6_r2 = hips.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(57, 30).addBox(-0.6292F, 0.6836F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F))
				.texOffs(55, 23).addBox(-0.6292F, 0.2836F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2558F, -0.0576F, 0.9592F, -1.0472F, 0.0F, 0.3752F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(57, 0).addBox(-1.0F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.5F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftleg1 = hips.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(28, 53).addBox(-0.3039F, 0.0711F, -0.3881F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7F, -0.075F, -0.1694F, 0.7274F, 0.0306F, -0.4169F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1435F, 4.9933F, 0.7866F, 0.7652F, 0.2917F, 0.1681F));

		PartDefinition leg6_r1 = leftleg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(14, 51).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 0).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(11, 36).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0416F, 5.5665F, 0.196F, 1.2999F, 0.0804F, -0.024F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = hips.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(52, 32).addBox(-0.6961F, 0.0711F, -0.3881F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7F, -0.075F, -0.1694F, 0.8816F, 0.0283F, 0.5357F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1435F, 4.9933F, 0.7866F, 0.7991F, -0.1376F, -0.3263F));

		PartDefinition leg7_r1 = rightleg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(4, 50).addBox(0.15F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(9, 50).addBox(-0.95F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0416F, 5.5665F, 0.196F, 1.2999F, -0.0804F, 0.024F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5558F, 0.8424F, 0.9592F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, 0.1752F, 0.0859F, 0.0152F));

		PartDefinition chest7_r1 = body.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(11, 29).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2685F, -0.1571F, -0.0326F, -0.4133F, -1.4581F));

		PartDefinition chest6_r1 = body.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(31, 14).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2685F, -0.1571F, -0.2715F, -0.3172F, -0.8104F));

		PartDefinition chest5_r1 = body.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(19, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9685F, -2.1571F, -0.066F, -0.1614F, -0.7373F));

		PartDefinition chest6_r2 = body.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(19, 14).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9685F, -2.1571F, 0.0394F, -0.1697F, -1.3568F));

		PartDefinition chest6_r3 = body.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(11, 29).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2685F, -0.1571F, -0.0326F, 0.4133F, 1.4581F));

		PartDefinition chest5_r2 = body.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(31, 14).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2685F, -0.1571F, -0.2715F, 0.3172F, 0.8104F));

		PartDefinition chest4_r1 = body.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(19, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9685F, -2.1571F, -0.066F, 0.1614F, 0.7373F));

		PartDefinition chest5_r3 = body.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(19, 14).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9685F, -2.1571F, 0.0394F, 0.1697F, 1.3568F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 25).addBox(0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 46).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6F, -2.5F, -0.4014F, 0.0F, 0.0F));

		PartDefinition shoulder = body.addOrReplaceChild("shoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.6F, 0.0F, 0.0F, -0.0873F));

		PartDefinition chest4_r2 = shoulder.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(49, 14).mirror().addBox(-1.0F, -0.7F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.1713F, -0.6663F, 0.1767F, 0.4736F, 0.0813F));

		PartDefinition chest5_r4 = shoulder.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(49, 27).mirror().addBox(0.2337F, -0.2042F, -0.7378F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.1287F, -2.4663F, 1.4308F, 0.4326F, -0.5013F));

		PartDefinition chest6_r4 = shoulder.addOrReplaceChild("chest6_r4", CubeListBuilder.create().texOffs(26, 14).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5685F, -1.5571F, 0.1158F, -0.0105F, -0.7006F));

		PartDefinition chest7_r2 = shoulder.addOrReplaceChild("chest7_r2", CubeListBuilder.create().texOffs(9, 4).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5685F, -1.5571F, 0.101F, 0.0578F, -1.3079F));

		PartDefinition chest3_r1 = shoulder.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(49, 14).addBox(0.0F, -0.7F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, -0.1713F, -0.6663F, 0.1767F, -0.4736F, -0.0813F));

		PartDefinition chest4_r3 = shoulder.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(49, 27).addBox(-1.2337F, -0.2042F, -0.7378F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 2.1287F, -2.4663F, 1.4308F, -0.4326F, 0.5013F));

		PartDefinition chest3_r2 = shoulder.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(22, 36).addBox(-1.5F, -0.9773F, -1.995F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8901F, -2.8432F, -0.6807F, 0.0F, 0.0F));

		PartDefinition chest2_r1 = shoulder.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(5, 41).addBox(-1.5F, -0.979F, -0.0949F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8901F, -2.7432F, -0.384F, 0.0F, 0.0F));

		PartDefinition chest5_r5 = shoulder.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(26, 14).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5685F, -1.5571F, 0.1158F, 0.0105F, 0.7006F));

		PartDefinition chest6_r5 = shoulder.addOrReplaceChild("chest6_r5", CubeListBuilder.create().texOffs(9, 4).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5685F, -1.5571F, 0.101F, -0.0578F, 1.3079F));

		PartDefinition cube_r3 = shoulder.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 18).addBox(0.5F, -0.7436F, -0.0682F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(33, 53).addBox(0.0F, -0.0436F, -0.0682F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.2F, -1.7F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftwing1 = shoulder.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.775F, -2.5694F, -1.4833F, -1.1544F, 1.3316F));

		PartDefinition upperwing8_r1 = leftwing1.addOrReplaceChild("upperwing8_r1", CubeListBuilder.create().texOffs(34, 26).addBox(-0.25F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 58).addBox(-1.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7709F, -0.2894F, -0.2119F, -1.3656F, -1.0146F, 3.0697F));

		PartDefinition wing10_r1 = leftwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(39, 0).addBox(-0.9072F, -2.9026F, -0.7631F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 41).addBox(-0.9072F, -2.9026F, 0.0369F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing9_r1 = leftwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(26, 6).addBox(-0.3631F, -0.209F, -0.2009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8283F, 7.164F, -0.1798F, 0.0F, -1.5708F, 1.2479F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(0, 8).addBox(-0.3631F, 0.0633F, -3.9225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, -1.5708F, 0.4974F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(48, 48).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.7415F, 7.654F, -0.649F, 0.2936F, 0.0281F, 2.4234F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create().texOffs(19, 18).addBox(-0.5799F, -0.5164F, -0.654F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2828F, 7.0557F, 0.701F, 1.9038F, -0.8588F, -2.9851F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(34, 0).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 11.346F, 0.1458F, -0.0059F, 0.1856F));

		PartDefinition wingfinger9_r1 = leftwing5.addOrReplaceChild("wingfinger9_r1", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.4F, 4.2F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.1F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(29, 49).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0413F, -0.1155F, 0.5237F, 1.2451F, 1.4993F, -2.6545F));

		PartDefinition leftwing4membrance = leftwing4.addOrReplaceChild("leftwing4membrance", CubeListBuilder.create(), PartPose.offset(-12.2799F, 3.7836F, 3.946F));

		PartDefinition leftwing3membrance = leftwing2.addOrReplaceChild("leftwing3membrance", CubeListBuilder.create(), PartPose.offset(0.5397F, 0.1609F, 0.9501F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3496F, 0.2368F, 2.9355F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = shoulder.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.775F, -2.5694F, -0.7656F, 1.2265F, -0.4312F));

		PartDefinition upperwing9_r1 = rightwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(0, 31).addBox(-4.75F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 57).addBox(0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7709F, -0.2894F, -0.2119F, -1.309F, 1.142F, -3.0057F));

		PartDefinition wing11_r1 = rightwing2.addOrReplaceChild("wing11_r1", CubeListBuilder.create().texOffs(34, 0).addBox(-0.0928F, -2.9026F, -0.7631F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(38, 32).addBox(-0.0928F, -2.9026F, 0.0369F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing10_r2 = rightwing2.addOrReplaceChild("wing10_r2", CubeListBuilder.create().texOffs(26, 0).addBox(-0.6369F, -0.209F, -0.2009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-1.8283F, 7.164F, -0.1798F, 0.0F, 1.5708F, -1.2479F));

		PartDefinition wing9_r2 = rightwing2.addOrReplaceChild("wing9_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6369F, 0.0633F, -3.9225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 1.5708F, -0.4974F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(47, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.7415F, 7.654F, -0.649F, 0.1559F, 0.1841F, -2.5533F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create().texOffs(19, 0).addBox(-0.4201F, -0.5164F, -0.654F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2828F, 7.0557F, 0.701F, 1.6211F, 0.8926F, 2.5211F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(25, 32).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0799F, 0.4836F, 11.346F, 0.1458F, 0.0059F, -0.1856F));

		PartDefinition wingfinger10_r1 = rightwing5.addOrReplaceChild("wingfinger10_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4F, 4.2F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.1F, 0.1396F, 0.0F, 0.0F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(7, 25).addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0413F, -0.1155F, 0.5237F, 1.2451F, -1.4993F, 2.6545F));

		PartDefinition rightwing4membrance = rightwing4.addOrReplaceChild("rightwing4membrance", CubeListBuilder.create(), PartPose.offset(12.2799F, 3.7836F, 3.946F));

		PartDefinition rightwing3membrance = rightwing2.addOrReplaceChild("rightwing3membrance", CubeListBuilder.create(), PartPose.offset(-0.5397F, 0.1609F, 0.9501F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3496F, 0.2368F, 2.9355F, 0.0021F, 0.3752F, 0.0093F));

		PartDefinition neck4 = shoulder.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -2.0F, -0.0436F, 0.0019F, 0.0436F));

		PartDefinition cube_r4 = neck4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 22).addBox(0.0F, -1.1964F, -2.1554F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 19).addBox(-0.5F, -0.1964F, -2.1554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.4F, -0.2356F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -1.6F, 0.1272F, 0.0089F, 0.0899F));

		PartDefinition cube_r5 = neck3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 24).addBox(0.0F, -1.8F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 46).addBox(-0.5F, -1.0F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.733F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, -1.2F, -0.2616F, 0.0113F, 0.0421F));

		PartDefinition cube_r6 = neck2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(19, 0).addBox(0.5F, -0.7461F, 1.944F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(19, 6).addBox(0.5F, -0.7461F, -0.056F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(19, 18).addBox(0.0F, 0.0539F, -0.056F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -3.3261F, -2.1737F, -0.8552F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8261F, -2.5737F, -0.3918F, -0.0267F, -0.0645F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(13, 13).addBox(0.5F, -1.9F, -3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 44).addBox(0.0F, -1.3F, -4.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1238F, 1.8425F, -0.2094F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4762F, -1.8575F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.8F, 0.3289F, -0.5763F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(0, 18).addBox(-0.2F, 0.3289F, -0.5763F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(26, 24).addBox(-0.2F, -0.2711F, -0.5763F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.6378F, 0.3057F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(8, 8).addBox(0.0F, -1.5F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 0.9319F, -0.9824F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(8, 36).addBox(0.0F, -1.0157F, 0.0288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2F, 2.0F, -3.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(8, 18).addBox(0.0F, -1.4907F, 0.9585F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2F, 2.8F, -5.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-1.0F, -1.1129F, -1.0333F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 0).addBox(-0.4F, -1.1129F, -1.0333F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 3.6F, -8.4F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(43, 34).mirror().addBox(-1.0F, -0.9211F, -2.6038F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(43, 34).addBox(-0.4F, -0.9211F, -2.6038F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.9F, -3.1F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(34, 14).addBox(0.3F, 0.394F, -1.8555F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.199F))
				.texOffs(34, 20).addBox(0.3F, -0.206F, -0.1555F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8F, 2.4F, -11.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(62, 12).addBox(0.3F, -0.1732F, -0.2466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.8F, 2.5F, -11.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(33, 57).addBox(0.3F, -0.2026F, -0.1916F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8F, 3.2F, -13.0F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(20, 49).addBox(0.3F, -0.3763F, -0.3374F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.8F, 4.0F, -14.9F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-0.5F, -0.5F, -2.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(0, 18).addBox(0.1F, -0.5F, -2.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3F, 3.0147F, -7.0384F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(37, 61).mirror().addBox(-0.2F, -0.5015F, -0.5244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.7777F, -9.6006F, 0.2844F, -0.0534F, 0.4508F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(32, 61).mirror().addBox(-0.0895F, -0.3029F, -0.5173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8777F, -10.8006F, 0.1972F, -0.0534F, 0.4508F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(57, 61).mirror().addBox(-0.0992F, -0.2492F, -0.614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.9777F, -11.6006F, 0.1851F, -0.0867F, 0.6226F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(62, 23).mirror().addBox(-0.2907F, -0.3064F, -0.6026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(62, 26).mirror().addBox(-0.2907F, -0.0064F, -0.6026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(62, 59).mirror().addBox(-0.2907F, 0.1936F, -1.7026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(62, 15).mirror().addBox(-0.2907F, -0.3064F, -1.7026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.1777F, -12.6006F, 0.0879F, -0.1055F, 0.7261F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(62, 62).mirror().addBox(-0.4421F, 0.2321F, -0.6821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 4.4777F, -14.6006F, -0.3583F, -0.4624F, 0.8356F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(62, 29).mirror().addBox(-0.4421F, -0.2818F, -0.5823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 4.4777F, -14.6006F, -0.5677F, -0.4624F, 0.8356F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(62, 62).addBox(-0.5579F, 0.2321F, -0.6821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4F, 4.4777F, -14.6006F, -0.3583F, 0.4624F, -0.8356F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(62, 29).addBox(-0.5579F, -0.2818F, -0.5823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 4.4777F, -14.6006F, -0.5677F, 0.4624F, -0.8356F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(62, 15).addBox(-0.7093F, -0.3064F, -1.7026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 59).addBox(-0.7093F, 0.1936F, -1.7026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(62, 26).addBox(-0.7093F, -0.0064F, -0.6026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(62, 23).addBox(-0.7093F, -0.3064F, -0.6026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 4.1777F, -12.6006F, 0.0879F, 0.1055F, -0.7261F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(57, 61).addBox(-0.9008F, -0.2492F, -0.614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 3.9777F, -11.6006F, 0.1851F, 0.0867F, -0.6226F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(32, 61).addBox(-0.9105F, -0.3029F, -0.5173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 3.8777F, -10.8006F, 0.1972F, 0.0534F, -0.4508F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(37, 61).addBox(-0.8F, -0.5015F, -0.5244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 3.7777F, -9.6006F, 0.2844F, 0.0534F, -0.4508F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.2F, -0.7488F, -5.833F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 0).addBox(-0.8F, -0.7488F, -5.833F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 3.7F, -9.4F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-1.0F, 0.0056F, -4.619F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(0, 8).addBox(-0.4F, 0.0056F, -4.619F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, 0.9F, -5.6F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(22, 44).mirror().addBox(-1.0F, -0.0153F, -3.0718F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(22, 44).addBox(-0.4F, -0.0153F, -3.0718F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.2F, -0.7F, -3.0F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(52, 61).mirror().addBox(-1.51F, 0.0095F, 0.5286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(61, 56).mirror().addBox(-1.51F, 0.0095F, 0.0286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.8031F, -2.7006F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(11, 45).mirror().addBox(-1.51F, -0.9918F, 0.0391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 45).addBox(-0.49F, -0.9918F, 0.0391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8519F, -2.8019F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(19, 54).mirror().addBox(-1.51F, 0.2963F, -2.7993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(19, 61).mirror().addBox(-1.63F, 0.0963F, -1.8993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(9, 61).mirror().addBox(-1.81F, 0.0963F, -1.8993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(9, 61).addBox(-0.19F, 0.0963F, -1.8993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(19, 61).addBox(-0.37F, 0.0963F, -1.8993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(19, 54).addBox(-0.49F, 0.2963F, -2.7993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.9631F, -1.9113F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(61, 9).mirror().addBox(-1.51F, -0.0726F, -0.0316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.0031F, -3.2006F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(40, 57).mirror().addBox(-1.11F, 0.3418F, -1.4756F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 57).addBox(0.51F, 0.3418F, -1.4756F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, -0.2285F, -1.6933F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(47, 61).mirror().addBox(-1.52F, -0.8963F, -0.124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false)
				.texOffs(47, 61).addBox(-0.28F, -0.8963F, -0.124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.4F, 2.0694F, -3.8705F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(28, 44).mirror().addBox(-1.52F, -0.8507F, -0.1289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(28, 44).addBox(-0.28F, -0.8507F, -0.1289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, 1.6694F, -3.1705F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(19, 6).mirror().addBox(-0.52F, -0.1733F, -3.9385F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(19, 6).addBox(0.72F, -0.1733F, -3.9385F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.6F, 0.15F, -3.4802F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(42, 61).mirror().addBox(-1.52F, -0.8012F, -0.9598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(43, 29).mirror().addBox(-1.52F, -0.8012F, -0.1598F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(42, 61).addBox(-0.28F, -0.8012F, -0.9598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(43, 29).addBox(-0.28F, -0.8012F, -0.1598F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, 2.6694F, -6.5705F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(52, 61).addBox(0.51F, 0.0095F, 0.5286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(61, 56).addBox(0.51F, 0.0095F, 0.0286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8031F, -2.7006F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(61, 9).addBox(0.51F, -0.0726F, -0.0316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, -0.0031F, -3.2006F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 57).addBox(-1.5F, -1.8557F, -3.961F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(26, 18).addBox(-0.5F, -1.8557F, -3.961F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 44).addBox(-1.5F, -1.6454F, -2.175F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.7F, 0.3F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(46, 22).addBox(-0.5F, -1.9975F, -1.9893F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6611F, -1.8584F, 2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(43, 39).addBox(0.0F, -1.0172F, -0.9771F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, -1.8611F, -0.8584F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(55, 14).addBox(0.0F, -0.0172F, -0.9771F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0F, -1.8611F, -0.8584F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(55, 27).addBox(0.0F, 0.0341F, -0.9699F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.5611F, 0.0416F, 0.3491F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, -1.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r50 = jaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(47, 41).mirror().addBox(-0.5F, -0.835F, -0.197F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6F, -10.7F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r51 = jaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(60, 45).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.323F, -10.9798F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r52 = jaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(9, 0).mirror().addBox(-0.5F, -0.6F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.3675F, -12.007F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(56, 43).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0878F, -12.9204F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r54 = jaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(58, 17).mirror().addBox(-0.5F, -0.2429F, -0.2187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(58, 17).addBox(-0.1F, -0.2429F, -0.2187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 1.6766F, -13.1141F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r55 = jaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(18, 58).mirror().addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false)
				.texOffs(18, 58).addBox(-0.1F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.2F, 1.8766F, -13.5141F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r56 = jaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(10, 58).mirror().addBox(-0.9F, -1.023F, -0.8612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(10, 58).addBox(-0.9F, -1.023F, -0.8612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.4F, 2.6F, -12.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r57 = jaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(60, 41).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(60, 41).addBox(-0.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2F, 2.1215F, -12.3198F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r58 = jaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(60, 41).mirror().addBox(-0.7F, -0.2265F, -1.0457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 61).mirror().addBox(-0.7F, -0.2265F, -0.5457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(60, 41).addBox(-0.3F, -0.2265F, -1.0457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 61).addBox(-0.3F, -0.2265F, -0.5457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, 1.6F, -11.6F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r59 = jaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(19, 24).mirror().addBox(-0.7F, -0.8172F, -3.752F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 25).mirror().addBox(-0.7F, -1.0172F, -3.752F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(19, 24).addBox(-0.3F, -0.8172F, -3.752F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F))
				.texOffs(0, 25).addBox(-0.3F, -1.0172F, -3.752F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.9F, -7.8F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r60 = jaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(58, 38).mirror().addBox(-0.2259F, -0.1433F, -0.6592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(23, 58).mirror().addBox(-0.2259F, -0.4433F, -0.6592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.643F, 1.2413F, -13.7229F, 0.6178F, 0.0496F, -0.4161F));

		PartDefinition cube_r61 = jaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(57, 58).mirror().addBox(-0.0717F, -0.6542F, -0.3275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 58).mirror().addBox(-0.0717F, -0.9542F, -0.3275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.6269F, 1.7403F, -13.4192F, 0.1259F, 0.0902F, -0.7108F));

		PartDefinition cube_r62 = jaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(59, 53).mirror().addBox(-0.1536F, -0.7059F, -0.606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(59, 49).mirror().addBox(-0.1536F, -0.9059F, -0.606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.5281F, 1.7212F, -12.0557F, 0.2462F, 0.0711F, -0.5008F));

		PartDefinition cube_r63 = jaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(60, 4).mirror().addBox(-0.0418F, -0.7159F, -0.7261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(14, 60).mirror().addBox(-0.0418F, -0.5159F, -0.7261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.5F, -11.2F, 0.108F, 0.0572F, -0.4856F));

		PartDefinition cube_r64 = jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(60, 20).mirror().addBox(-0.026F, -0.7508F, -0.4301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.4F, -10.1F, 0.109F, 0.0554F, -0.4682F));

		PartDefinition cube_r65 = jaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(27, 60).mirror().addBox(-0.0173F, -0.7697F, -0.2355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.3F, -9.2F, 0.1117F, 0.0496F, -0.4161F));

		PartDefinition cube_r66 = jaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(16, 41).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.12F)).mirror(false)
				.texOffs(16, 41).addBox(0.3F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.4F, 0.9989F, -6.4711F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r67 = jaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(42, 17).mirror().addBox(-0.9F, -0.1939F, -2.8854F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(42, 17).addBox(-0.1F, -0.1939F, -2.8854F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.8F, -5.1F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r68 = jaw.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(43, 12).mirror().addBox(-0.9F, -0.1283F, -2.7942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(43, 12).addBox(-0.1F, -0.1283F, -2.7942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.6F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r69 = jaw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(53, 50).mirror().addBox(-1.1F, -0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(57, 34).mirror().addBox(-1.1F, -0.2F, -2.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(53, 50).addBox(0.1F, -0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F))
				.texOffs(57, 34).addBox(0.1F, -0.2F, -2.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r70 = jaw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(58, 38).addBox(-0.7741F, -0.1433F, -0.6592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(23, 58).addBox(-0.7741F, -0.4433F, -0.6592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.643F, 1.2413F, -13.7229F, 0.6178F, -0.0496F, 0.4161F));

		PartDefinition cube_r71 = jaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(57, 58).addBox(-0.9283F, -0.6542F, -0.3275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 58).addBox(-0.9283F, -0.9542F, -0.3275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.6269F, 1.7403F, -13.4192F, 0.1259F, -0.0902F, 0.7108F));

		PartDefinition cube_r72 = jaw.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(59, 53).addBox(-0.8464F, -0.7059F, -0.606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(59, 49).addBox(-0.8464F, -0.9059F, -0.606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.5281F, 1.7212F, -12.0557F, 0.2462F, -0.0711F, 0.5008F));

		PartDefinition cube_r73 = jaw.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(60, 4).addBox(-0.9582F, -0.7159F, -0.7261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(14, 60).addBox(-0.9582F, -0.5159F, -0.7261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 1.5F, -11.2F, 0.108F, -0.0572F, 0.4856F));

		PartDefinition cube_r74 = jaw.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(60, 20).addBox(-0.974F, -0.7508F, -0.4301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 1.4F, -10.1F, 0.109F, -0.0554F, 0.4682F));

		PartDefinition cube_r75 = jaw.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(27, 60).addBox(-0.9827F, -0.7697F, -0.2355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 1.3F, -9.2F, 0.1117F, -0.0496F, 0.4161F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(5, 45).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1222F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 68, 65);
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