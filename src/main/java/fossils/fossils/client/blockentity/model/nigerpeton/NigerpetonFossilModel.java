package fossils.fossils.client.blockentity.model.nigerpeton;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NigerpetonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftFoot;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightFoot;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone12;
	private final ModelPart bone14;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart bone22;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone3;
	private final ModelPart bone23;
	private final ModelPart bone13;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone4;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone11;
	private final ModelPart bone24;
	private final ModelPart bone25;

	public NigerpetonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftFoot = this.leftLeg2.getChild("leftFoot");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightFoot = this.rightLeg2.getChild("rightFoot");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck = this.chest.getChild("neck");
		this.head = this.neck.getChild("head");
		this.bone9 = this.head.getChild("bone9");
		this.bone10 = this.bone9.getChild("bone10");
		this.bone12 = this.bone10.getChild("bone12");
		this.bone14 = this.bone9.getChild("bone14");
		this.bone17 = this.bone14.getChild("bone17");
		this.bone18 = this.head.getChild("bone18");
		this.bone19 = this.bone18.getChild("bone19");
		this.bone20 = this.bone19.getChild("bone20");
		this.bone21 = this.bone18.getChild("bone21");
		this.bone22 = this.bone21.getChild("bone22");
		this.bone7 = this.head.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone3 = this.head.getChild("bone3");
		this.bone23 = this.bone3.getChild("bone23");
		this.bone13 = this.head.getChild("bone13");
		this.bone5 = this.bone13.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
		this.bone4 = this.head.getChild("bone4");
		this.bone15 = this.bone4.getChild("bone15");
		this.bone16 = this.bone15.getChild("bone16");
		this.jaw = this.head.getChild("jaw");
		this.bone2 = this.jaw.getChild("bone2");
		this.bone11 = this.bone2.getChild("bone11");
		this.bone24 = this.jaw.getChild("bone24");
		this.bone25 = this.bone24.getChild("bone25");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 3.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 62).addBox(0.0F, -0.8F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 13).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 6).addBox(0.0F, -0.8F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 7).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.55F, -4.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body5_r1 = hips.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(7, 54).mirror().addBox(-0.5F, -4.9936F, -0.7268F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.5523F, -0.7968F, -0.0567F, 0.0F, -0.1745F));

		PartDefinition body7_r1 = hips.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(25, 49).mirror().addBox(-1.0209F, 0.0271F, -0.6083F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(56, 44).mirror().addBox(-1.0209F, 0.4271F, -1.6083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.4477F, -0.7968F, 0.6414F, 0.0F, -0.1745F));

		PartDefinition body6_r1 = hips.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(45, 48).mirror().addBox(-1.0209F, -0.1994F, -0.6213F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.4477F, -0.7968F, -0.4756F, 0.0F, -0.1745F));

		PartDefinition body8_r1 = hips.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(60, 35).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.112F, -2.5933F, -0.1577F, -0.0084F, -0.1049F));

		PartDefinition body9_r1 = hips.addOrReplaceChild("body9_r1", CubeListBuilder.create().texOffs(60, 33).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.112F, -2.5933F, -0.1409F, -0.0716F, -0.5194F));

		PartDefinition body10_r1 = hips.addOrReplaceChild("body10_r1", CubeListBuilder.create().texOffs(59, 25).mirror().addBox(-2.4538F, -1.309F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.112F, -2.5933F, -0.0864F, -0.1324F, -1.0423F));

		PartDefinition body8_r2 = hips.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(32, 49).mirror().addBox(-1.0209F, -1.5005F, -2.874F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.4477F, -0.7968F, 1.4443F, 0.0F, -0.1745F));

		PartDefinition body4_r1 = hips.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(7, 54).addBox(-0.5F, -4.9936F, -0.7268F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.5523F, -0.7968F, -0.0567F, 0.0F, 0.1745F));

		PartDefinition body6_r2 = hips.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(25, 49).addBox(-0.9791F, 0.0271F, -0.6083F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(56, 44).addBox(0.0209F, 0.4271F, -1.6083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4F, -1.4477F, -0.7968F, 0.6414F, 0.0F, 0.1745F));

		PartDefinition body5_r2 = hips.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(45, 48).addBox(-0.9791F, -0.1994F, -0.6213F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, -1.4477F, -0.7968F, -0.4756F, 0.0F, 0.1745F));

		PartDefinition body7_r2 = hips.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(60, 35).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.112F, -2.5933F, -0.1577F, 0.0084F, 0.1049F));

		PartDefinition body8_r3 = hips.addOrReplaceChild("body8_r3", CubeListBuilder.create().texOffs(60, 33).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.112F, -2.5933F, -0.1409F, 0.0716F, 0.5194F));

		PartDefinition body9_r2 = hips.addOrReplaceChild("body9_r2", CubeListBuilder.create().texOffs(59, 25).addBox(1.4538F, -1.309F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.112F, -2.5933F, -0.0864F, 0.1324F, 1.0423F));

		PartDefinition body7_r3 = hips.addOrReplaceChild("body7_r3", CubeListBuilder.create().texOffs(32, 49).addBox(0.0209F, -1.5005F, -2.874F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4F, -1.4477F, -0.7968F, 1.4443F, 0.0F, 0.1745F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(38, 45).addBox(0.904F, -0.3637F, -0.3152F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(0, 51).addBox(-0.096F, -0.3637F, -0.8152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.8723F, -1.5735F, -0.633F, -0.186F, 0.1457F, 0.3345F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(20, 40).addBox(-0.6F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 39).addBox(-0.6F, -1.0F, 0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.904F, 0.6363F, 1.1848F, -2.7225F, -1.2905F, 2.4819F));

		PartDefinition leftFoot = leftLeg2.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(28, 14).addBox(-0.25F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, 0.0F, 0.0F, -0.2267F, 0.9112F, -0.5097F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(9, 46).addBox(-3.904F, -0.3637F, -0.3152F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(52, 19).addBox(-0.904F, -0.3637F, -0.8152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.8723F, -1.5735F, -0.633F, 0.0702F, -1.244F, -0.4988F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(0, 41).addBox(-3.4F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 42).addBox(-3.4F, -1.0F, 0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.904F, 0.6363F, 1.1848F, 0.0F, 1.2654F, 0.0F));

		PartDefinition rightFoot = rightLeg2.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(28, 19).addBox(-2.75F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.4363F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.3704F, -0.0668F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(23, 62).addBox(0.0F, -1.0704F, 0.9332F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 62).addBox(0.0F, -1.0704F, 2.9332F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, 1.9F, -0.2706F, -0.2527F, 0.0692F));

		PartDefinition cube_r2 = tail1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(37, 60).addBox(0.0F, 0.2F, 1.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 63).addBox(0.0F, -0.5F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1296F, 1.4332F, 0.4189F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 14).addBox(-0.5F, -0.4128F, -0.0038F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(40, 62).addBox(0.0F, -1.0128F, -0.0038F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 51).addBox(0.0F, -1.0128F, 1.9962F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 54).addBox(0.0F, -1.0128F, 3.9962F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.019F, 4.8218F, 0.1155F, -0.4338F, -0.0487F));

		PartDefinition cube_r3 = tail2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(29, 62).addBox(0.0F, 2.1F, 7.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 27).addBox(0.0F, 1.8F, 5.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 37).addBox(0.0F, 0.7F, 3.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1106F, -3.3886F, 0.4189F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(41, 11).addBox(-0.5F, -0.4062F, 0.0078F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(49, 63).addBox(0.0F, -0.9062F, 1.0078F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0126F, 4.9831F, 0.0481F, -0.4359F, -0.0203F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.356F, 0.0165F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 63).addBox(0.0F, -0.756F, 0.0165F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0123F, 2.9956F, 0.0472F, -0.3923F, -0.0181F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.2F, -4.1F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 63).addBox(0.0F, -0.8F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 63).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 63).addBox(0.0F, -0.8F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.65F, -5.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body9_r3 = body.addOrReplaceChild("body9_r3", CubeListBuilder.create().texOffs(52, 25).mirror().addBox(-3.4538F, -1.309F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.212F, -0.4933F, -0.0336F, -0.0418F, -1.0469F));

		PartDefinition body8_r4 = body.addOrReplaceChild("body8_r4", CubeListBuilder.create().texOffs(61, 4).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.212F, -0.4933F, -0.05F, -0.0194F, -0.5235F));

		PartDefinition body7_r4 = body.addOrReplaceChild("body7_r4", CubeListBuilder.create().texOffs(61, 2).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.212F, -0.4933F, -0.0536F, 0.0026F, -0.1052F));

		PartDefinition body8_r5 = body.addOrReplaceChild("body8_r5", CubeListBuilder.create().texOffs(44, 37).mirror().addBox(-4.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.312F, -2.4933F, 0.0188F, 0.0489F, -0.9944F));

		PartDefinition body7_r5 = body.addOrReplaceChild("body7_r5", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.312F, -2.4933F, 0.0407F, 0.0329F, -0.4706F));

		PartDefinition body6_r3 = body.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.312F, -2.4933F, 0.0506F, 0.0135F, -0.052F));

		PartDefinition body5_r3 = body.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(60, 41).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.312F, -4.4933F, 0.0853F, 0.0172F, -0.0515F));

		PartDefinition body6_r4 = body.addOrReplaceChild("body6_r4", CubeListBuilder.create().texOffs(40, 60).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.312F, -4.4933F, 0.071F, 0.0504F, -0.4693F));

		PartDefinition body7_r6 = body.addOrReplaceChild("body7_r6", CubeListBuilder.create().texOffs(41, 27).mirror().addBox(-4.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.312F, -4.4933F, 0.0363F, 0.0791F, -0.9933F));

		PartDefinition body8_r6 = body.addOrReplaceChild("body8_r6", CubeListBuilder.create().texOffs(52, 25).addBox(1.4538F, -1.309F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.212F, -0.4933F, -0.0336F, 0.0418F, 1.0469F));

		PartDefinition body7_r7 = body.addOrReplaceChild("body7_r7", CubeListBuilder.create().texOffs(61, 4).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.212F, -0.4933F, -0.05F, 0.0194F, 0.5235F));

		PartDefinition body6_r5 = body.addOrReplaceChild("body6_r5", CubeListBuilder.create().texOffs(61, 2).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.212F, -0.4933F, -0.0536F, -0.0026F, 0.1052F));

		PartDefinition body7_r8 = body.addOrReplaceChild("body7_r8", CubeListBuilder.create().texOffs(44, 37).addBox(1.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.312F, -2.4933F, 0.0188F, -0.0489F, 0.9944F));

		PartDefinition body6_r6 = body.addOrReplaceChild("body6_r6", CubeListBuilder.create().texOffs(61, 0).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.312F, -2.4933F, 0.0407F, -0.0329F, 0.4706F));

		PartDefinition body5_r4 = body.addOrReplaceChild("body5_r4", CubeListBuilder.create().texOffs(0, 61).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.312F, -2.4933F, 0.0506F, -0.0135F, 0.052F));

		PartDefinition body4_r2 = body.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(60, 41).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.312F, -4.4933F, 0.0853F, -0.0172F, 0.0515F));

		PartDefinition body5_r5 = body.addOrReplaceChild("body5_r5", CubeListBuilder.create().texOffs(40, 60).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.312F, -4.4933F, 0.071F, -0.0504F, 0.4693F));

		PartDefinition body6_r7 = body.addOrReplaceChild("body6_r7", CubeListBuilder.create().texOffs(41, 27).addBox(1.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.312F, -4.4933F, 0.0363F, -0.0791F, 0.9933F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -5.9F, 0.0F, -0.1745F, 0.0F));

		PartDefinition neck3_r1 = chest.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(50, 27).addBox(-0.5F, -2.975F, 5.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(41, 6).mirror().addBox(-3.5F, -2.975F, 6.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 6).addBox(2.5F, -2.975F, 6.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, -12.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5_r1 = chest.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-1.0F, -0.6341F, -0.1082F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 4.4087F, -5.7513F, -0.1264F, 0.2598F, -0.0326F));

		PartDefinition neck5_r2 = chest.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(47, 45).mirror().addBox(-3.0F, -0.5731F, 0.0955F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.3843F, -5.4498F, -0.1227F, 0.1043F, -0.0064F));

		PartDefinition body4_r3 = chest.addOrReplaceChild("body4_r3", CubeListBuilder.create().texOffs(11, 40).mirror().addBox(-0.5F, -1.575F, -0.3976F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 4.1954F, -3.85F, 1.0647F, 0.0F, -0.1745F));

		PartDefinition body3_r1 = chest.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(33, 39).mirror().addBox(-0.1743F, -1.7455F, -0.4401F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5995F, 2.0952F, -2.3904F, 0.8158F, 0.1569F, -0.01F));

		PartDefinition body9_r4 = chest.addOrReplaceChild("body9_r4", CubeListBuilder.create().texOffs(52, 23).mirror().addBox(-4.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -2.5933F, -0.003F, 0.2219F, -1.057F));

		PartDefinition body8_r7 = chest.addOrReplaceChild("body8_r7", CubeListBuilder.create().texOffs(61, 45).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -2.5933F, 0.1098F, 0.1932F, -0.5224F));

		PartDefinition body7_r9 = chest.addOrReplaceChild("body7_r9", CubeListBuilder.create().texOffs(45, 61).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -2.5933F, 0.1788F, 0.1321F, -0.1023F));

		PartDefinition body8_r8 = chest.addOrReplaceChild("body8_r8", CubeListBuilder.create().texOffs(50, 31).mirror().addBox(-4.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -0.5933F, 0.0363F, 0.0791F, -1.0456F));

		PartDefinition body7_r10 = chest.addOrReplaceChild("body7_r10", CubeListBuilder.create().texOffs(61, 43).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -0.5933F, 0.071F, 0.0504F, -0.5217F));

		PartDefinition body6_r8 = chest.addOrReplaceChild("body6_r8", CubeListBuilder.create().texOffs(61, 23).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -0.5933F, 0.0853F, 0.0172F, -0.1038F));

		PartDefinition neck4_r1 = chest.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, -0.6341F, -0.1082F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 4.4087F, -5.7513F, -0.1264F, -0.2598F, 0.0326F));

		PartDefinition neck4_r2 = chest.addOrReplaceChild("neck4_r2", CubeListBuilder.create().texOffs(47, 45).addBox(0.0F, -0.5731F, 0.0955F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 4.3843F, -5.4498F, -0.1227F, -0.1043F, 0.0064F));

		PartDefinition body3_r2 = chest.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(11, 40).addBox(-0.5F, -1.575F, -0.3976F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.0F, 4.1954F, -3.85F, 1.0647F, 0.0F, 0.1745F));

		PartDefinition body2_r1 = chest.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(33, 39).addBox(-0.8257F, -1.7455F, -0.4401F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5995F, 2.0952F, -2.3904F, 0.8158F, -0.1569F, 0.01F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(63, 37).addBox(0.0F, -0.95F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 63).addBox(0.0F, -0.85F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 7).addBox(-0.5F, -0.25F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body8_r9 = chest.addOrReplaceChild("body8_r9", CubeListBuilder.create().texOffs(52, 23).addBox(1.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -2.5933F, -0.003F, -0.2219F, 1.057F));

		PartDefinition body7_r11 = chest.addOrReplaceChild("body7_r11", CubeListBuilder.create().texOffs(61, 45).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -2.5933F, 0.1098F, -0.1932F, 0.5224F));

		PartDefinition body6_r9 = chest.addOrReplaceChild("body6_r9", CubeListBuilder.create().texOffs(45, 61).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -2.5933F, 0.1788F, -0.1321F, 0.1023F));

		PartDefinition body7_r12 = chest.addOrReplaceChild("body7_r12", CubeListBuilder.create().texOffs(50, 31).addBox(1.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -0.5933F, 0.0363F, -0.0791F, 1.0456F));

		PartDefinition body6_r10 = chest.addOrReplaceChild("body6_r10", CubeListBuilder.create().texOffs(61, 43).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -0.5933F, 0.071F, -0.0504F, 0.5217F));

		PartDefinition body5_r6 = chest.addOrReplaceChild("body5_r6", CubeListBuilder.create().texOffs(61, 23).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -0.5933F, 0.0853F, -0.0172F, 0.1038F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(53, 41).addBox(0.784F, -0.6309F, -0.658F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(16, 53).addBox(2.784F, -0.6309F, -1.158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(37, 53).addBox(-0.216F, -0.6309F, -1.158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.956F, 2.8681F, -2.4351F, 0.3143F, -0.0549F, 0.1605F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(41, 21).addBox(-0.5F, -0.5F, -1.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 0).addBox(-0.5F, -0.5F, 0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.784F, -0.1309F, -0.158F, -0.1184F, 1.0224F, -0.0135F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(28, 24).addBox(-0.25F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, 0.5F, 0.0F, 0.0757F, 0.0011F, -0.3332F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(44, 53).addBox(-2.784F, -0.6309F, -0.658F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(53, 33).addBox(-3.784F, -0.6309F, -1.158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(53, 37).addBox(-0.784F, -0.6309F, -1.158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-3.956F, 2.8681F, -2.4351F, -0.0163F, 1.1189F, -0.3741F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(41, 24).addBox(-3.5F, -0.5F, -1.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 3).addBox(-3.5F, -0.5F, 0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.784F, -0.1309F, -0.158F, -0.1533F, -0.8997F, 0.0011F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(26, 29).addBox(-2.75F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, 0.5F, 0.0F, 0.0873F, -0.3491F, 0.3054F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(41, 16).addBox(-0.5F, -0.4F, -2.95F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(43, 63).addBox(0.0F, -1.0F, -0.95F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -4.0F, -0.4822F, 0.0224F, 0.208F));

		PartDefinition body8_r10 = neck.addOrReplaceChild("body8_r10", CubeListBuilder.create().texOffs(55, 61).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.088F, -0.5933F, 0.342F, 0.2622F, -0.0984F));

		PartDefinition body9_r5 = neck.addOrReplaceChild("body9_r5", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.088F, -0.5933F, 0.2064F, 0.3775F, -0.5233F));

		PartDefinition body7_r13 = neck.addOrReplaceChild("body7_r13", CubeListBuilder.create().texOffs(55, 61).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.088F, -0.5933F, 0.342F, -0.2622F, 0.0984F));

		PartDefinition body8_r11 = neck.addOrReplaceChild("body8_r11", CubeListBuilder.create().texOffs(50, 61).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.088F, -0.5933F, 0.2064F, -0.3775F, 0.5233F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -2.3F, -0.1326F, -0.0001F, 0.1716F));

		PartDefinition bone9 = head.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(33, 57).addBox(0.7F, -1.12F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(57, 52).addBox(0.0F, -1.3F, -3.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 61).addBox(0.1F, -1.01F, -3.6F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -6.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone9.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(54, 58).addBox(-0.2181F, -0.3866F, -0.3983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(17, 57).addBox(-0.2181F, 0.0134F, -0.3983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(49, 58).addBox(-0.2181F, -0.3866F, -3.3983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(59, 48).addBox(-0.2181F, -0.7866F, -3.3983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(57, 14).addBox(-0.2181F, -0.1866F, -2.7983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 58).addBox(-0.2181F, -0.5866F, -2.7983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(57, 55).addBox(-0.9F, -0.4F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(12, 57).addBox(-0.2181F, 0.1134F, -0.9983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(38, 57).addBox(-0.2181F, -0.2866F, -0.9983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3537F, -0.2332F, 0.3342F, 0.1309F, 0.3491F, 0.0F));

		PartDefinition cube_r7 = bone9.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 54).addBox(-0.1F, -0.9F, 2.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 56).addBox(-0.1F, -0.9F, 0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -4.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r8 = bone9.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 0).addBox(-2.0F, -1.1F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -4.0F, 0.0F, 0.5411F, 0.0F));

		PartDefinition cube_r9 = bone9.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(33, 34).addBox(-1.9858F, -1.1F, -0.1025F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, -3.0F, 0.0F, 0.2443F, 0.0F));

		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.05F, -0.45F, 0.0436F, -0.0436F, 0.0F));

		PartDefinition cube_r10 = bone10.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(59, 58).addBox(-0.2995F, -0.4002F, -0.2108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6005F, -0.7F, 0.2039F, 0.0697F, 0.0F, -0.003F));

		PartDefinition bone12 = bone10.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6545F, 0.0F));

		PartDefinition cube_r11 = bone12.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(10, 60).addBox(-0.3159F, -0.4002F, -0.7408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.6005F, -0.7F, -0.2039F, 0.0572F, -0.0013F, 0.04F));

		PartDefinition bone14 = bone9.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.05F, -0.45F, 0.0436F, 0.0436F, 0.0F));

		PartDefinition bone17 = bone14.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6545F, 0.0F));

		PartDefinition bone18 = head.addOrReplaceChild("bone18", CubeListBuilder.create().texOffs(13, 28).mirror().addBox(-1.0F, -1.1F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(33, 57).mirror().addBox(-1.7F, -1.12F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(57, 52).mirror().addBox(-1.0F, -1.3F, -3.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(60, 61).mirror().addBox(-1.1F, -1.01F, -3.6F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 62).mirror().addBox(-1.0F, -0.25F, -3.7F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, -6.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone18.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(54, 58).mirror().addBox(-0.7819F, -0.3866F, -0.3983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(17, 57).mirror().addBox(-0.7819F, 0.0134F, -0.3983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(49, 58).mirror().addBox(-0.7819F, -0.3866F, -3.3983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(59, 48).mirror().addBox(-0.7819F, -0.7866F, -3.3983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(57, 14).mirror().addBox(-0.7819F, -0.1866F, -2.7983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 58).mirror().addBox(-0.7819F, -0.5866F, -2.7983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(57, 55).mirror().addBox(-0.1F, -0.4F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(12, 57).mirror().addBox(-0.7819F, 0.1134F, -0.9983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(38, 57).mirror().addBox(-0.7819F, -0.2866F, -0.9983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3537F, -0.2332F, 0.3342F, 0.1309F, -0.3491F, 0.0F));

		PartDefinition cube_r13 = bone18.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(12, 54).mirror().addBox(0.1F, -0.9F, 2.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 56).mirror().addBox(0.1F, -0.9F, 0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -4.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r14 = bone18.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(0.0F, -1.1F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -4.0F, 0.0F, -0.5411F, 0.0F));

		PartDefinition cube_r15 = bone18.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(33, 34).mirror().addBox(-0.0142F, -1.1F, -0.1025F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0F, -3.0F, 0.0F, -0.2443F, 0.0F));

		PartDefinition bone19 = bone18.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.05F, -0.45F, 0.0436F, 0.0436F, 0.0F));

		PartDefinition cube_r16 = bone19.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(59, 58).mirror().addBox(-0.7005F, -0.4002F, -0.2108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6005F, -0.7F, 0.2039F, 0.0697F, 0.0F, 0.003F));

		PartDefinition bone20 = bone19.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6545F, 0.0F));

		PartDefinition cube_r17 = bone20.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(10, 60).mirror().addBox(-0.6841F, -0.4002F, -0.7408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.6005F, -0.7F, -0.2039F, 0.0572F, 0.0013F, -0.04F));

		PartDefinition bone21 = bone18.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.05F, -0.45F, 0.0436F, -0.0436F, 0.0F));

		PartDefinition bone22 = bone21.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6545F, 0.0F));

		PartDefinition bone7 = head.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, -6.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone7.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(38, 48).addBox(-0.5431F, -0.9F, 0.4916F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.0F, 0.0F, 0.0F, 0.3229F, 0.0F));

		PartDefinition cube_r19 = bone7.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(15, 7).addBox(-1.75F, -1.0F, -0.25F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.2F, 0.0F, 0.0F, 0.288F, 0.0F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r20 = bone8.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(52, 63).addBox(-0.2884F, -0.95F, -0.1752F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.0F, 0.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r21 = bone8.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(59, 17).addBox(-0.7F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(5, 59).addBox(-0.7F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3137F, -1.4931F, 2.9487F, 0.0154F, 0.2589F, -1.0238F));

		PartDefinition cube_r22 = bone8.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(59, 10).addBox(-0.3709F, -1.165F, -0.9353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.9137F, -1.4931F, 3.4487F, 0.6088F, 0.2589F, -1.0238F));

		PartDefinition cube_r23 = bone8.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(52, 48).addBox(-0.9F, -0.7F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7455F, -1.583F, 2.1553F, -0.2203F, 0.3795F, -0.8149F));

		PartDefinition cube_r24 = bone8.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(59, 30).addBox(-0.9196F, -0.7642F, 0.4785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(27, 59).addBox(-0.9196F, -0.7642F, -0.0215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.052F, -0.9492F, 1.8698F, 0.3302F, 0.2372F, -0.8838F));

		PartDefinition cube_r25 = bone8.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(44, 33).addBox(-1.4481F, 0.0036F, -0.0651F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.9024F, -1.4586F, 0.33F, 0.2392F, 0.3706F, 0.5674F));

		PartDefinition cube_r26 = bone8.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 44).addBox(-1.9399F, -1.1413F, -0.1969F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -0.1F, 0.2F, -0.0901F, 0.3924F, -0.0082F));

		PartDefinition bone3 = head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, -6.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(38, 48).mirror().addBox(0.5431F, -0.9F, 0.4916F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.0F, 0.0F, 0.0F, -0.3229F, 0.0F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(15, 7).mirror().addBox(-0.25F, -1.0F, -0.25F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.2F, 0.0F, 0.0F, -0.288F, 0.0F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -1.0F, -0.3F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition bone23 = bone3.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone23.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(52, 63).mirror().addBox(0.2884F, -0.95F, -0.1752F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r31 = bone23.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(59, 17).mirror().addBox(-0.3F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(5, 59).mirror().addBox(-0.3F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3137F, -1.4931F, 2.9487F, 0.0154F, -0.2589F, 1.0238F));

		PartDefinition cube_r32 = bone23.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(59, 10).mirror().addBox(-0.6291F, -1.165F, -0.9353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9137F, -1.4931F, 3.4487F, 0.6088F, -0.2589F, 1.0238F));

		PartDefinition cube_r33 = bone23.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(52, 48).mirror().addBox(-0.1F, -0.7F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7455F, -1.583F, 2.1553F, -0.2203F, -0.3795F, 0.8149F));

		PartDefinition cube_r34 = bone23.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(59, 30).mirror().addBox(-0.0804F, -0.7642F, 0.4785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(27, 59).mirror().addBox(-0.0804F, -0.7642F, -0.0215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.052F, -0.9492F, 1.8698F, 0.3302F, -0.2372F, 0.8838F));

		PartDefinition cube_r35 = bone23.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(44, 33).mirror().addBox(-0.5519F, 0.0036F, -0.0651F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9024F, -1.4586F, 0.33F, 0.2392F, -0.3706F, -0.5674F));

		PartDefinition cube_r36 = bone23.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.0601F, -1.1413F, -0.1969F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.1F, 0.2F, -0.0901F, -0.3924F, 0.0082F));

		PartDefinition bone13 = head.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -7.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone13.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(22, 59).addBox(0.95F, 0.0F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.5F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r38 = bone13.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(20, 43).addBox(0.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 0.0F, 3.15F, 0.0F, 0.0F, 0.2443F));

		PartDefinition bone5 = bone13.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.35F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r39 = bone5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(32, 60).addBox(0.7F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(15, 60).addBox(0.0F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.5F, 0.2F, 1.9F, -0.0162F, 0.0065F, 0.3839F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r40 = bone6.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(57, 27).addBox(0.1F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 0.7F, 2.2F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r41 = bone6.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(59, 20).addBox(0.0F, -0.03F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 45).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.2F, 1.0F, 0.0F, 0.0F, 0.3665F));

		PartDefinition bone4 = head.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-1.0F, 0.0F, 1.65F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -7.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(22, 59).mirror().addBox(-1.95F, 0.0F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, 0.5F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(20, 43).mirror().addBox(-1.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 3.15F, 0.0F, 0.0F, -0.2443F));

		PartDefinition bone15 = bone4.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.35F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r44 = bone15.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(32, 60).mirror().addBox(-1.7F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(15, 60).mirror().addBox(-1.0F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.2F, 1.9F, -0.0162F, -0.0065F, -0.3839F));

		PartDefinition cube_r45 = bone15.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(50, 11).mirror().addBox(-1.5F, 0.0F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(39, 29).mirror().addBox(-1.5F, 0.2F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(54, 3).mirror().addBox(-1.0F, 0.2F, 1.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r46 = bone16.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(-1.1F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7F, 2.2F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r47 = bone16.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(59, 20).mirror().addBox(-1.0F, -0.03F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 45).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.2F, 1.0F, 0.0F, 0.0F, -0.3665F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(0, 55).addBox(-0.9F, 0.4627F, -12.1911F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.1F, 0.8022F, 1.3642F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r48 = jaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(18, 48).mirror().addBox(0.15F, -0.75F, 1.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.7127F, -12.1411F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r49 = jaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-0.1F, -0.25F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.7127F, -12.1411F, 0.0F, -0.2967F, 0.0F));

		PartDefinition cube_r50 = jaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(18, 48).addBox(-0.15F, -0.75F, 1.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7127F, -12.1411F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r51 = jaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(32, 0).addBox(-0.9F, -0.25F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7127F, -12.1411F, 0.0F, 0.2967F, 0.0F));

		PartDefinition cube_r52 = jaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(28, 55).mirror().addBox(-0.3932F, -1.5045F, -0.9484F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.65F, 0.4627F, -11.2411F, -0.0873F, -0.2618F, 0.0F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(28, 55).addBox(-0.6068F, -1.5045F, -0.9484F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.85F, 0.4627F, -11.2411F, -0.0873F, 0.2618F, 0.0F));

		PartDefinition bone2 = jaw.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.4627F, -8.1411F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r54 = bone2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(50, 14).addBox(-0.3F, -1.4F, 1.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.0F, -0.05F, 0.0F, 0.2356F, 0.0F));

		PartDefinition cube_r55 = bone2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(22, 34).addBox(-1.25F, -1.0F, -0.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.0F, -0.05F, -0.1396F, 0.2618F, 0.0F));

		PartDefinition cube_r56 = bone2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(11, 34).addBox(-1.25F, -1.0F, -0.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4F, 0.0F, -0.05F, 0.0F, 0.2618F, 0.0F));

		PartDefinition bone11 = bone2.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r57 = bone11.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(15, 21).addBox(0.5035F, -0.95F, -4.8686F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2F, 1.0F, 4.65F, 0.1222F, 0.3054F, 0.0F));

		PartDefinition cube_r58 = bone11.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(19, 0).addBox(-1.0F, -0.95F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 1.0F, -0.35F, 0.0F, 0.3054F, 0.0F));

		PartDefinition bone24 = jaw.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.4627F, -8.1411F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r59 = bone24.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(50, 14).mirror().addBox(0.3F, -1.4F, 1.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.0F, -0.05F, 0.0F, -0.2356F, 0.0F));

		PartDefinition cube_r60 = bone24.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(22, 34).mirror().addBox(0.25F, -1.0F, -0.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.0F, -0.05F, -0.1396F, -0.2618F, 0.0F));

		PartDefinition cube_r61 = bone24.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(11, 34).mirror().addBox(0.25F, -1.0F, -0.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.0F, -0.05F, 0.0F, -0.2618F, 0.0F));

		PartDefinition bone25 = bone24.addOrReplaceChild("bone25", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r62 = bone25.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(15, 21).mirror().addBox(-1.5035F, -0.95F, -4.8686F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 1.0F, 4.65F, 0.1222F, -0.3054F, 0.0F));

		PartDefinition cube_r63 = bone25.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(0.0F, -0.95F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 1.0F, -0.35F, 0.0F, -0.3054F, 0.0F));

		return LayerDefinition.create(meshdefinition, 70, 70);
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