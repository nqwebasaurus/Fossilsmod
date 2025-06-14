package fossils.fossils.client.blockentity.model.haliskia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HaliskiaFossilModel extends SkullModelBase {
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

	public HaliskiaFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.8F, 6.3F, 0.0F, 0.0F, 0.3054F));

		PartDefinition body5_r1 = hips.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(9, 26).mirror().addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1015F, -0.519F, -1.1428F, -0.6155F, -0.1854F, 0.0503F));

		PartDefinition body8_r1 = hips.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(51, 37).mirror().addBox(-0.1F, -0.4018F, -0.4752F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(52, 4).mirror().addBox(-0.5F, -0.4018F, -0.4752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(51, 37).addBox(0.9F, -0.4018F, -0.4752F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(52, 4).addBox(2.3F, -0.4018F, -0.4752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, -0.3437F, -0.6782F, 0.1134F, 0.0F, 0.0F));

		PartDefinition body6_r1 = hips.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(52, 41).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(52, 41).addBox(2.3F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-1.4F, -0.4051F, 0.6276F, -0.6545F, 0.0F, 0.0F));

		PartDefinition body6_r2 = hips.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(39, 56).mirror().addBox(-0.3708F, 0.2836F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(26, 56).mirror().addBox(-0.3708F, 0.6836F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.2558F, -0.0576F, 0.9592F, -1.0472F, 0.0F, -0.3752F));

		PartDefinition body8_r2 = hips.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(9, 18).mirror().addBox(-0.4498F, -0.7196F, -0.6815F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8558F, 0.7424F, 0.9592F, 3.0281F, 0.0F, -0.7243F));

		PartDefinition body9_r1 = hips.addOrReplaceChild("body9_r1", CubeListBuilder.create().texOffs(56, 19).mirror().addBox(-0.4498F, -0.4635F, -0.1149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.8558F, 0.7424F, 0.9592F, -2.5569F, 0.0F, -0.7243F));

		PartDefinition body4_r1 = hips.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(9, 26).addBox(-0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1015F, -0.519F, -1.1428F, -0.6155F, 0.1854F, -0.0503F));

		PartDefinition body8_r3 = hips.addOrReplaceChild("body8_r3", CubeListBuilder.create().texOffs(56, 19).addBox(-0.5502F, -0.4635F, -0.1149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.8558F, 0.7424F, 0.9592F, -2.5569F, 0.0F, 0.7243F));

		PartDefinition body7_r1 = hips.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(9, 18).addBox(-0.5502F, -0.7196F, -0.6815F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8558F, 0.7424F, 0.9592F, 3.0281F, 0.0F, 0.7243F));

		PartDefinition body6_r3 = hips.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(26, 56).addBox(-0.6292F, 0.6836F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F))
				.texOffs(39, 56).addBox(-0.6292F, 0.2836F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2558F, -0.0576F, 0.9592F, -1.0472F, 0.0F, 0.3752F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(53, 30).addBox(-1.0F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.5F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftleg1 = hips.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(54, 12).addBox(-0.3039F, 0.0711F, -0.3881F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7F, -0.075F, -0.1694F, 0.659F, 0.0793F, -0.341F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1435F, 4.9933F, 0.7866F, 0.9397F, 0.2917F, 0.1681F));

		PartDefinition leg6_r1 = leftleg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(46, 52).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(51, 52).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(19, 23).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0416F, 5.5665F, 0.196F, 1.2999F, 0.0804F, -0.024F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = hips.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(0, 53).addBox(-0.6961F, 0.0711F, -0.3881F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7F, -0.075F, -0.1694F, 0.5098F, -0.1455F, 0.5036F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1435F, 4.9933F, 0.7866F, 1.1142F, -0.2917F, -0.1681F));

		PartDefinition leg7_r1 = rightleg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(35, 14).addBox(0.15F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(31, 47).addBox(-0.95F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(19, 18).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0416F, 5.5665F, 0.196F, 1.2999F, -0.0804F, 0.024F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5558F, 0.8424F, 0.9592F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition chest7_r1 = body.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(19, 28).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2685F, -0.1571F, -0.0326F, -0.4133F, -1.4581F));

		PartDefinition chest6_r1 = body.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(26, 14).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2685F, -0.1571F, -0.2715F, -0.3172F, -0.8104F));

		PartDefinition chest5_r1 = body.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(24, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9685F, -2.1571F, -0.066F, -0.1614F, -0.7373F));

		PartDefinition chest6_r2 = body.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(9, 22).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9685F, -2.1571F, 0.0394F, -0.1697F, -1.3568F));

		PartDefinition chest6_r3 = body.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(19, 28).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2685F, -0.1571F, -0.0326F, 0.4133F, 1.4581F));

		PartDefinition chest5_r2 = body.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(26, 14).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2685F, -0.1571F, -0.2715F, 0.3172F, 0.8104F));

		PartDefinition chest4_r1 = body.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(24, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9685F, -2.1571F, -0.066F, 0.1614F, 0.7373F));

		PartDefinition chest5_r3 = body.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(9, 22).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9685F, -2.1571F, 0.0394F, 0.1697F, 1.3568F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(45, 17).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6F, -2.5F, -0.4014F, 0.0F, 0.0F));

		PartDefinition shoulder = body.addOrReplaceChild("shoulder", CubeListBuilder.create(), PartPose.offset(0.0F, -1.1F, -2.6F));

		PartDefinition chest7_r2 = shoulder.addOrReplaceChild("chest7_r2", CubeListBuilder.create().texOffs(19, 14).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5685F, -1.5571F, 0.101F, 0.0578F, -1.3079F));

		PartDefinition chest6_r4 = shoulder.addOrReplaceChild("chest6_r4", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5685F, -1.5571F, 0.1158F, -0.0105F, -0.7006F));

		PartDefinition chest5_r4 = shoulder.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(50, 22).mirror().addBox(0.1901F, -0.1854F, -0.8257F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.5287F, -2.6663F, 1.1341F, 0.4326F, -0.5013F));

		PartDefinition chest4_r2 = shoulder.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.3287F, -0.8663F, 0.1767F, 0.4736F, 0.0813F));

		PartDefinition chest3_r1 = shoulder.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(0, 48).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 0.3287F, -0.8663F, 0.1767F, -0.4736F, -0.0813F));

		PartDefinition chest4_r3 = shoulder.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(50, 22).addBox(-1.1901F, -0.1854F, -0.8257F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 2.5287F, -2.6663F, 1.1341F, -0.4326F, 0.5013F));

		PartDefinition chest3_r2 = shoulder.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(0, 44).addBox(-1.5F, -0.9773F, -1.995F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3901F, -3.0432F, -0.6807F, 0.0F, 0.0F));

		PartDefinition chest2_r1 = shoulder.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(18, 36).addBox(-1.5F, -0.7F, -1.3F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0901F, -1.7432F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest5_r5 = shoulder.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5685F, -1.5571F, 0.1158F, 0.0105F, 0.7006F));

		PartDefinition chest6_r5 = shoulder.addOrReplaceChild("chest6_r5", CubeListBuilder.create().texOffs(19, 14).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5685F, -1.5571F, 0.101F, -0.0578F, 1.3079F));

		PartDefinition cube_r3 = shoulder.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 9).addBox(0.0F, -0.0436F, -0.0682F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.2F, -1.7F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftwing1 = shoulder.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.775F, -2.5694F, -0.3677F, 0.2329F, 0.0918F));

		PartDefinition upperwing8_r1 = leftwing1.addOrReplaceChild("upperwing8_r1", CubeListBuilder.create().texOffs(23, 44).addBox(-0.25F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 36).addBox(-1.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7709F, -0.2894F, -0.2119F, -1.2449F, 1.2281F, -2.7303F));

		PartDefinition wing10_r1 = leftwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(36, 44).addBox(-0.9072F, -2.9026F, -0.7631F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(41, 44).addBox(-0.9072F, -2.9026F, 0.0369F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing9_r1 = leftwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(0, 26).addBox(-0.3631F, -0.209F, -0.2009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8283F, 7.164F, -0.1798F, 0.0F, -1.5708F, 1.2479F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(0, 9).addBox(-0.3631F, 0.0633F, -3.9225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, -1.5708F, 0.4974F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(26, 47).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.7415F, 7.654F, -0.649F, 0.1116F, 0.2137F, 0.6075F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create().texOffs(19, 18).addBox(-0.5799F, -0.5164F, -0.654F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2828F, 7.0557F, 0.701F, 1.9745F, -0.6044F, 3.1231F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(34, 0).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 11.346F, 0.1458F, -0.0059F, 0.1856F));

		PartDefinition wingfinger9_r1 = leftwing5.addOrReplaceChild("wingfinger9_r1", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.4F, 4.2F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.1F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(16, 51).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0413F, -0.1155F, 0.5237F, 1.2451F, 1.4993F, -2.6545F));

		PartDefinition leftwing4membrance = leftwing4.addOrReplaceChild("leftwing4membrance", CubeListBuilder.create(), PartPose.offset(-12.2799F, 3.7836F, 3.946F));

		PartDefinition leftwing3membrance = leftwing2.addOrReplaceChild("leftwing3membrance", CubeListBuilder.create(), PartPose.offset(0.5397F, 0.1609F, 0.9501F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3496F, 0.2368F, 2.9355F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = shoulder.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.475F, -2.5694F, -0.3865F, 0.2253F, 0.3957F));

		PartDefinition upperwing9_r1 = rightwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(38, 39).addBox(-4.75F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 36).addBox(0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7709F, -0.2894F, -0.2119F, -1.0543F, -1.3093F, 2.6221F));

		PartDefinition wing11_r1 = rightwing2.addOrReplaceChild("wing11_r1", CubeListBuilder.create().texOffs(34, 0).addBox(-0.0928F, -2.9026F, -0.7631F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(39, 0).addBox(-0.0928F, -2.9026F, 0.0369F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing10_r2 = rightwing2.addOrReplaceChild("wing10_r2", CubeListBuilder.create().texOffs(0, 18).addBox(-0.6369F, -0.209F, -0.2009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-1.8283F, 7.164F, -0.1798F, 0.0F, 1.5708F, -1.2479F));

		PartDefinition wing9_r2 = rightwing2.addOrReplaceChild("wing9_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6369F, 0.0633F, -3.9225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 1.5708F, -0.4974F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(47, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.7415F, 7.654F, -0.649F, -0.0355F, -0.2352F, -0.3398F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create().texOffs(19, 0).addBox(-0.4201F, -0.5164F, -0.654F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2828F, 7.0557F, 0.701F, 1.6774F, 0.6337F, 2.9489F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(25, 32).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0799F, 0.4836F, 11.346F, 0.1458F, 0.0059F, -0.1856F));

		PartDefinition wingfinger10_r1 = rightwing5.addOrReplaceChild("wingfinger10_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4F, 4.2F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.1F, 0.1396F, 0.0F, 0.0F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(7, 51).addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0413F, -0.1155F, 0.5237F, 1.2451F, -1.4993F, 2.6545F));

		PartDefinition rightwing4membrance = rightwing4.addOrReplaceChild("rightwing4membrance", CubeListBuilder.create(), PartPose.offset(12.2799F, 3.7836F, 3.946F));

		PartDefinition rightwing3membrance = rightwing2.addOrReplaceChild("rightwing3membrance", CubeListBuilder.create(), PartPose.offset(-0.5397F, 0.1609F, 0.9501F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3496F, 0.2368F, 2.9355F, 0.0021F, 0.3752F, 0.0093F));

		PartDefinition neck3 = shoulder.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -2.4F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r4 = neck3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(53, 45).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.4F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -1.0F, 0.1309F, -0.0436F, 0.0F));

		PartDefinition cube_r5 = neck2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 53).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.3F, -1.9F, -0.3665F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -1.9F, 0.1309F, 0.0873F, 0.0F));

		PartDefinition cube_r6 = neck.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 6).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -1.7F, -0.2094F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, -1.1F, 0.0426F, 0.4264F, 0.0233F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, -1.7387F, -1.0082F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.7319F, -0.7824F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 46).mirror().addBox(-0.5F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(8, 46).addBox(0.1F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3F, 3.2407F, -7.4954F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.3F, -0.4126F, -5.8186F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(0, 18).addBox(-0.7F, -0.4126F, -5.8186F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 3.8F, -9.6F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(46, 42).mirror().addBox(-1.0F, -0.9907F, -0.0415F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 42).addBox(-0.4F, -0.9907F, -0.0415F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.8F, -5.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-1.3F, -0.9473F, -6.0156F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(0, 36).addBox(-0.7F, -0.9473F, -6.0156F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.8F, -9.4F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-1.0F, -1.0129F, -1.0333F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(19, 0).addBox(-0.4F, -1.0129F, -1.0333F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 3.6F, -8.4F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, 0.048F, -4.9325F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).addBox(-0.4F, 0.048F, -4.9325F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, -0.4F, -4.9F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-1.5F, -0.6706F, -0.2091F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 9).addBox(-0.3F, -0.6706F, -0.2091F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 2.4694F, -7.5705F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(38, 32).mirror().addBox(-1.5F, -1.1F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(38, 32).addBox(-0.3F, -1.1F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, 2.4694F, -6.6705F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(19, 55).mirror().addBox(-1.51F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 55).addBox(0.51F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6631F, -2.0113F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(12, 55).mirror().addBox(-1.51F, -0.0174F, -2.1597F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(44, 24).mirror().addBox(-1.73F, -0.1174F, -1.2597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(28, 36).mirror().addBox(-1.85F, -0.1174F, -1.2597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(28, 36).addBox(0.85F, -0.1174F, -1.2597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(44, 24).addBox(0.73F, -0.1174F, -1.2597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(12, 55).addBox(0.51F, -0.0174F, -2.1597F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.9631F, -1.9113F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(55, 49).mirror().addBox(-1.41F, 0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(55, 49).addBox(0.81F, 0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, -0.2285F, -1.6933F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(18, 41).mirror().addBox(-2.0F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(18, 41).addBox(0.0F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.9319F, -0.9824F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(46, 27).addBox(0.0F, -0.0193F, 0.0001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -11.5F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(38, 32).addBox(0.0F, -0.0071F, 0.0198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.6F, -12.5F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(14, 36).addBox(0.0F, -0.0219F, -0.1318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.2F, -13.1F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(46, 32).addBox(0.0F, 0.0135F, 0.0091F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 3.9F, -15.5F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(10, 39).addBox(0.0F, 0.0096F, -4.3696F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.9F, -9.3F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5F, 0.0195F, 0.9868F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 6).addBox(-1.0F, 0.0195F, -2.0132F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.6F, -3.2F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(26, 0).mirror().addBox(-1.5F, -1.8557F, -3.961F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 0).addBox(-0.5F, -1.8557F, -3.961F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 24).addBox(-2.0F, -1.8557F, -2.961F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, 0.3F, 0.6632F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, -1.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r27 = jaw.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(57, 25).addBox(-1.0F, -0.8105F, 0.52F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 4.1F, -12.1F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r28 = jaw.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(52, 27).addBox(-1.0F, -0.9105F, -0.08F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5F, 4.1F, -12.1F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r29 = jaw.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(56, 57).addBox(-1.0F, -0.9163F, -0.5647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 3.9F, -13.4F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r30 = jaw.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(14, 46).mirror().addBox(-0.9F, -0.9214F, -6.6798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(0, 26).mirror().addBox(-0.9F, -0.9214F, -5.8798F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(14, 46).addBox(-0.1F, -0.9214F, -6.6798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 26).addBox(-0.1F, -0.9214F, -5.8798F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.6F, -7.5F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r31 = jaw.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(34, 14).mirror().addBox(-0.9F, -0.2979F, -6.5361F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.13F)).mirror(false)
				.texOffs(34, 14).addBox(-0.1F, -0.2979F, -6.5361F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(0.0F, 1.8F, -7.7F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r32 = jaw.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(46, 47).mirror().addBox(-1.0F, -0.887F, -2.8752F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(46, 47).addBox(-0.2F, -0.887F, -2.8752F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 1.9F, -4.8F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r33 = jaw.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(17, 46).mirror().addBox(-1.0F, -0.0708F, -2.9234F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(17, 46).addBox(-0.2F, -0.0708F, -2.9234F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 0.1F, -2.5F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r34 = jaw.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(34, 54).mirror().addBox(-1.5F, -0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(5, 55).mirror().addBox(-1.1F, -0.2F, -2.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(34, 54).addBox(0.5F, -0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(5, 55).addBox(0.1F, -0.2F, -2.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(45, 12).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1232F, 0.1299F, -0.016F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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