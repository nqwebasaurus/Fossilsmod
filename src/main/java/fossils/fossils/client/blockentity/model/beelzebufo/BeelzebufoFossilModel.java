package fossils.fossils.client.blockentity.model.beelzebufo;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BeelzebufoFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart froge;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart wholehead;
	private final ModelPart headbase;
	private final ModelPart headdonotmove;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public BeelzebufoFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.froge = this.fossil.getChild("froge");
		this.hips = this.froge.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.leftArm1 = this.neck.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.neck.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.bone2 = this.neck.getChild("bone2");
		this.bone3 = this.neck.getChild("bone3");
		this.wholehead = this.neck.getChild("wholehead");
		this.headbase = this.wholehead.getChild("headbase");
		this.headdonotmove = this.headbase.getChild("headdonotmove");
		this.leftFace = this.headdonotmove.getChild("leftFace");
		this.rightFace = this.headdonotmove.getChild("rightFace");
		this.jaw = this.wholehead.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition froge = fossil.addOrReplaceChild("froge", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.5F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition hips = froge.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.3495F, 0.523F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(13, 34).addBox(-0.5F, -2.4012F, 0.0471F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3166F, -3.1485F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(71, 18).mirror().addBox(-1.2F, 0.2F, -0.7F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2149F, -0.6258F, -0.0519F, -0.0068F, -0.1307F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 58).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0784F, -2.5839F, -0.0421F, -0.157F, -0.2353F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(-1.0F, -0.075F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.296F, -0.075F, -2.8652F, -0.115F, -0.1444F, 0.2413F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(71, 18).addBox(-1.8F, 0.2F, -0.7F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.2149F, -0.6258F, -0.0519F, 0.0068F, 0.1307F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, 0.55F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 9).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.653F, 4.816F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 39).addBox(-0.5F, 0.575F, 0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(26, 39).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2582F, -0.1003F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(64, 17).addBox(-1.0F, -0.4F, 2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(62, 15).addBox(-1.0F, -0.4F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(62, 15).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.5834F, -3.1485F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(76, 16).addBox(-1.0F, -0.075F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.296F, -0.075F, -2.8652F, -0.115F, 0.1444F, -0.2413F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(27, 58).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0784F, -2.5839F, -0.0421F, 0.157F, 0.2353F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 6.3794F, 10.9424F, 0.0159F, -0.3487F, -0.0464F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(77, 80).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.4F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(53, 13).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1481F, -0.1599F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.0712F, 0.5149F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(16, 67).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -4.5354F, -0.5368F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(67, 65).addBox(-0.5F, -2.5F, -2.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.0015F, -1.2222F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(41, 65).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.6622F, -2.8664F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(62, 5).addBox(2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, -3.5999F, -5.0757F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(62, 10).addBox(2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-2.5F, -3.5999F, -5.0757F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -0.6603F, -2.9317F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.936F, -4.9911F, -0.4451F, 0.0873F, 0.0F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(49, 62).addBox(-0.7092F, -1.7983F, -3.4685F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.936F, -7.3911F, -0.2705F, 0.1309F, 0.0F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(58, 62).addBox(-0.7092F, -2.5064F, -2.9971F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.391F, -4.093F, -10.3614F, -0.0544F, 0.3052F, -0.0095F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 6.3794F, 10.9424F, 0.0159F, 0.3487F, 0.0464F));

		PartDefinition cube_r22 = bone4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(77, 80).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -4.4F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r23 = bone4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(53, 13).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1481F, -0.1599F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bone4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0712F, 0.5149F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r25 = bone4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(16, 67).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.5354F, -0.5368F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r26 = bone4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(67, 65).mirror().addBox(-0.5F, -2.5F, -2.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0015F, -1.2222F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(41, 65).mirror().addBox(-0.5F, -1.0F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.6622F, -2.8664F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(62, 5).mirror().addBox(-3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5F, -3.5999F, -5.0757F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(62, 10).mirror().addBox(-3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(2.5F, -3.5999F, -5.0757F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.5F, -0.6603F, -2.9317F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.936F, -4.9911F, -0.4451F, -0.0873F, 0.0F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(49, 62).mirror().addBox(-0.2908F, -1.7983F, -3.4685F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.936F, -7.3911F, -0.2705F, -0.1309F, 0.0F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(58, 62).mirror().addBox(-0.2908F, -2.5064F, -2.9971F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.391F, -4.093F, -10.3614F, -0.0544F, -0.3052F, 0.0095F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(79, 36).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 4.3928F, 8.7364F, 0.8365F, 0.1348F, -1.2348F));

		PartDefinition cube_r33 = leftLeg1.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(71, 7).addBox(-0.9F, -0.0054F, -0.522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(22, 58).addBox(-0.9F, 1.9946F, -0.022F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 8.3858F, 0.8286F, 0.4715F, -0.1057F, 0.339F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.3946F, 0.278F, -0.5063F, -0.5623F, 0.4369F));

		PartDefinition cube_r34 = leftLeg3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(49, 71).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0691F, 3.8639F, 0.0125F, -0.0315F, -0.011F, 0.1268F));

		PartDefinition cube_r35 = leftLeg3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(44, 71).addBox(-1.4F, -1.75F, -1.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5433F, 0.6412F, 0.0486F, 0.0268F, -0.2104F));

		PartDefinition cube_r36 = leftLeg3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(71, 12).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.431F, 4.0813F, -0.2211F, 0.0299F, 0.0148F, -0.1264F));

		PartDefinition cube_r37 = leftLeg3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(39, 71).addBox(-2.6F, -1.15F, -1.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5433F, 0.6412F, -0.0315F, -0.011F, 0.1268F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(0, 25).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.166F, 8.071F, -0.4382F, 1.1979F, 0.0199F, -0.0586F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(21, 14).addBox(-2.0F, -0.5F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.5F, -0.2096F, -0.0098F, 0.0784F));

		PartDefinition cube_r38 = leftToes.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 0).addBox(-2.6F, -0.5F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.0F, 0.0F, -2.5F, 0.0144F, 0.3922F, 0.1044F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(79, 36).mirror().addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 4.3928F, 8.7364F, 0.8365F, -0.1348F, 1.2348F));

		PartDefinition cube_r39 = rightLeg1.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(71, 7).mirror().addBox(-0.1F, -0.0054F, -0.522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(22, 58).mirror().addBox(-0.1F, 1.9946F, -0.022F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.3858F, 0.8286F, 0.4715F, 0.1057F, -0.339F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.3946F, 0.278F, -0.5063F, 0.5623F, -0.4369F));

		PartDefinition cube_r40 = rightLeg3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(49, 71).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0691F, 3.8639F, 0.0125F, -0.0315F, 0.011F, -0.1268F));

		PartDefinition cube_r41 = rightLeg3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(44, 71).mirror().addBox(0.4F, -1.75F, -1.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5433F, 0.6412F, 0.0486F, -0.0268F, 0.2104F));

		PartDefinition cube_r42 = rightLeg3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(71, 12).mirror().addBox(-0.5F, -0.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.431F, 4.0813F, -0.2211F, 0.0299F, -0.0148F, 0.1264F));

		PartDefinition cube_r43 = rightLeg3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(39, 71).mirror().addBox(1.6F, -1.15F, -1.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5433F, 0.6412F, -0.0315F, 0.011F, -0.1268F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-2.5F, -0.5F, -2.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.166F, 8.071F, -0.4382F, 1.1979F, -0.0199F, 0.0586F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(21, 14).mirror().addBox(-2.0F, -0.5F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.5F, -0.2096F, 0.0098F, -0.0784F));

		PartDefinition cube_r44 = rightToes.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.4F, -0.5F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.0F, -2.5F, 0.0144F, -0.3922F, -0.1044F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1331F, -3.1537F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(13, 39).addBox(-0.5F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -1.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(40, 25).mirror().addBox(-3.1F, -0.075F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2484F, 0.1023F, -1.4048F, -0.0302F, 0.0288F, 0.1335F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(74, 36).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.1618F, -1.4355F, -0.0442F, 0.0398F, -0.2332F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(74, 36).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.1618F, -1.4355F, -0.0442F, -0.0398F, 0.2332F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(40, 25).addBox(0.1F, -0.075F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2484F, 0.1023F, -1.4048F, -0.0302F, -0.0288F, -0.1335F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(76, 61).addBox(-1.0F, 0.6044F, -3.9301F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(76, 61).addBox(-1.0F, 0.0044F, -3.9051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, 2.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.8F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(18, 59).addBox(-0.5F, -2.009F, -0.0167F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(77, 29).addBox(-1.0F, 0.1F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(76, 28).addBox(-1.0F, 0.1F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(76, 28).addBox(-1.0F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(78, 10).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8587F, 0.1633F, -1.4093F, -0.0523F, 0.0738F, -0.2337F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(63, 36).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3438F, 0.2787F, -1.3724F, -0.0325F, 0.0601F, 0.0201F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(63, 36).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3438F, 0.2787F, -1.3724F, -0.0325F, -0.0601F, -0.0201F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(78, 10).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8587F, 0.1633F, -1.4093F, -0.0523F, -0.0738F, 0.2337F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2445F, -1.8103F, 0.0456F, 0.0022F, 0.0127F));

		PartDefinition cube_r57 = neck3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(82, 18).addBox(-1.0F, -0.2643F, 0.1305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(82, 18).addBox(-1.0F, -0.8643F, 0.2306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.2F, -1.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3325F, -0.906F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r58 = neck2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(49, 80).addBox(-0.5F, -1.5262F, 2.9312F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 71).addBox(-1.0F, 0.5738F, 2.0562F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(68, 71).addBox(-1.0F, -0.0262F, 1.9312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.9F, -2.4F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r59 = neck2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(57, 52).mirror().addBox(-5.0F, 0.0F, -1.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3499F, 0.0301F, 0.1926F, -0.7659F, -0.138F, -0.1828F));

		PartDefinition cube_r60 = neck2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(53, 23).mirror().addBox(-5.0F, 0.0211F, 0.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3359F, -0.6768F, -0.5146F, -0.783F, -0.2317F, -0.0897F));

		PartDefinition cube_r61 = neck2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(82, 57).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.1235F, -0.314F, -0.775F, 0.1448F, 0.2006F));

		PartDefinition cube_r62 = neck2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(82, 57).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.1235F, -0.314F, -0.775F, -0.1448F, -0.2006F));

		PartDefinition cube_r63 = neck2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(57, 52).addBox(0.0F, 0.0F, -1.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3499F, 0.0301F, 0.1926F, -0.7659F, 0.138F, 0.1828F));

		PartDefinition cube_r64 = neck2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(53, 23).addBox(0.0F, 0.0211F, 0.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3359F, -0.6768F, -0.5146F, -0.783F, 0.2317F, 0.0897F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0902F, -1.4466F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r65 = neck.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(33, 74).addBox(0.0F, -2.8185F, -0.2007F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -3.0F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r66 = neck.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(42, 54).addBox(0.0F, -1.8762F, -0.0153F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.7F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r67 = neck.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(75, 57).addBox(-0.5F, 0.133F, -1.7698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(75, 57).addBox(-0.5F, -0.567F, -2.0948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -1.5F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r68 = neck.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.7F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.764F, -3.9274F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r69 = neck.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(54, 75).addBox(-0.5F, 0.5574F, 0.3335F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(54, 75).addBox(-0.5F, -0.0676F, 0.0085F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3F, -1.6F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r70 = neck.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(82, 59).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2332F, -0.3674F, -0.358F, 0.0051F, 0.242F));

		PartDefinition cube_r71 = neck.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(65, 30).mirror().addBox(-4.7592F, -0.4313F, -0.5213F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2332F, -0.3674F, -0.3286F, -0.1325F, -0.21F));

		PartDefinition cube_r72 = neck.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(82, 59).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2332F, -0.3674F, -0.358F, -0.0051F, -0.242F));

		PartDefinition cube_r73 = neck.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(65, 30).addBox(0.7593F, -0.4313F, -0.5213F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2332F, -0.3674F, -0.3286F, 0.1325F, 0.21F));

		PartDefinition leftArm1 = neck.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(6.8362F, 5.2064F, -2.6891F, 0.8892F, 0.5109F, -0.0962F));

		PartDefinition cube_r74 = leftArm1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(62, 79).addBox(-0.5F, -0.6F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.0059F, 2.9518F, 0.0534F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftArm1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(67, 79).addBox(-0.5F, -0.9F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.114F)), PartPose.offsetAndRotation(-0.0059F, 2.8993F, -0.164F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftArm1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(9, 64).addBox(0.0F, -2.0F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftArm1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(57, 79).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0059F, 4.3114F, 0.8779F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftArm1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(5, 70).addBox(-0.5F, -0.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.0059F, 5.1451F, 3.1637F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftArm1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(52, 79).addBox(-0.5F, -1.1F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.0059F, 4.8038F, 1.7482F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftArm1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(29, 80).addBox(0.0F, -2.2F, 0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.5059F, 5.0353F, 0.1525F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftArm1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(32, 69).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0059F, 1.7378F, -0.4917F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftArm1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(34, 80).addBox(0.0F, 0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.5059F, -0.308F, -1.3943F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftArm1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(82, 21).addBox(0.0F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5059F, -0.7438F, -0.8464F, 0.672F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0501F, 6.8693F, 2.146F, -0.2358F, 0.0805F, 0.0764F));

		PartDefinition cube_r84 = leftArm2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(71, 0).addBox(-0.526F, -0.8634F, -0.1306F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.024F, 1.8307F, -0.3322F, 0.0611F, 0.8727F, 0.0F));

		PartDefinition cube_r85 = leftArm2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 76).addBox(-0.526F, -3.669F, -0.2773F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.024F, 1.8307F, -0.3322F, -0.1134F, 0.8727F, 0.0F));

		PartDefinition cube_r86 = leftArm2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(12, 77).addBox(-0.426F, -2.2568F, -1.0404F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.024F, 1.8307F, -0.3322F, 0.2182F, 0.8727F, 0.0F));

		PartDefinition cube_r87 = leftArm2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(17, 77).addBox(-0.426F, 0.6401F, -0.892F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.024F, 1.8307F, -0.3322F, -0.0262F, 0.8727F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(33, 54).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5187F, 5.3965F, -1.2123F, -0.1731F, 1.0385F, -0.2515F));

		PartDefinition cube_r88 = leftHand.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(36, 60).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.5F, 1.7F, 2.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftHand.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(17, 32).addBox(-1.0F, 1.45F, -0.3F, 1.0F, 7.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftFinger.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(42, 58).addBox(-1.0F, 0.45F, -0.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.45F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightArm1 = neck.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.8362F, 5.2064F, -2.6891F, 0.8892F, -0.5109F, 0.0962F));

		PartDefinition cube_r91 = rightArm1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(62, 79).mirror().addBox(-0.5F, -0.6F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 2.9518F, 0.0534F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightArm1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(67, 79).mirror().addBox(-0.5F, -0.9F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.114F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 2.8993F, -0.164F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightArm1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(9, 64).mirror().addBox(-1.0F, -2.0F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightArm1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(57, 79).mirror().addBox(-0.5F, -0.3F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 4.3114F, 0.8779F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightArm1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-0.5F, -0.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 5.1451F, 3.1637F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightArm1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(52, 79).mirror().addBox(-0.5F, -1.1F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 4.8038F, 1.7482F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightArm1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(29, 80).mirror().addBox(-1.0F, -2.2F, 0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 5.0353F, 0.1525F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightArm1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(32, 69).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 1.7378F, -0.4917F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightArm1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(34, 80).mirror().addBox(-1.0F, 0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.5059F, -0.308F, -1.3943F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightArm1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(82, 21).mirror().addBox(-1.0F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5059F, -0.7438F, -0.8464F, 0.672F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0501F, 6.8693F, 2.146F, -0.2358F, -0.0805F, -0.0764F));

		PartDefinition cube_r101 = rightArm2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.474F, -0.8634F, -0.1306F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.024F, 1.8307F, -0.3322F, 0.0611F, -0.8727F, 0.0F));

		PartDefinition cube_r102 = rightArm2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.474F, -3.669F, -0.2773F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.024F, 1.8307F, -0.3322F, -0.1134F, -0.8727F, 0.0F));

		PartDefinition cube_r103 = rightArm2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(12, 77).mirror().addBox(-0.574F, -2.2568F, -1.0404F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.024F, 1.8307F, -0.3322F, 0.2182F, -0.8727F, 0.0F));

		PartDefinition cube_r104 = rightArm2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(17, 77).mirror().addBox(-0.574F, 0.6401F, -0.892F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.024F, 1.8307F, -0.3322F, -0.0262F, -0.8727F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(33, 54).mirror().addBox(0.0F, -0.25F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.5187F, 5.3965F, -1.2123F, -0.1731F, -1.0385F, 0.2515F));

		PartDefinition cube_r105 = rightHand.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(36, 60).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.7F, 2.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightHand.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(17, 32).mirror().addBox(0.0F, 1.45F, -0.3F, 1.0F, 7.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightFinger.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(42, 58).mirror().addBox(0.0F, 0.45F, -0.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.45F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone2 = neck.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(4.567F, -0.1275F, 1.5907F));

		PartDefinition cube_r108 = bone2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(39, 32).addBox(-2.5F, -0.8F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.354F, -0.1382F, -2.774F));

		PartDefinition cube_r109 = bone2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(53, 20).addBox(-0.1171F, -0.6063F, -0.7316F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.083F, 4.2455F, -3.6757F, -0.2497F, -0.9876F, -1.4163F));

		PartDefinition cube_r110 = bone2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(70, 51).addBox(-1.5F, -1.3F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8878F, 4.9356F, -5.2396F, -0.413F, -0.3633F, -1.0639F));

		PartDefinition cube_r111 = bone2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(75, 20).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3743F, 5.6001F, -5.1138F, -0.5311F, -0.2564F, -0.1165F));

		PartDefinition cube_r112 = bone2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(57, 54).addBox(-0.0256F, -0.6063F, -0.9641F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.083F, 4.2455F, -3.6757F, -0.2002F, -0.8174F, -1.4791F));

		PartDefinition cube_r113 = bone2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(70, 48).addBox(-1.3F, -1.3F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8878F, 4.9356F, -5.2396F, -0.5023F, -0.6774F, -0.8868F));

		PartDefinition cube_r114 = bone2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(76, 24).addBox(0.4F, -0.3F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5939F, 6.0531F, -4.786F, -0.6179F, 0.1797F, -0.7342F));

		PartDefinition cube_r115 = bone2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 58).addBox(1.2392F, -0.4747F, -1.0015F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.2985F, 6.1344F, -5.3876F, -0.5151F, -0.1051F, -0.2051F));

		PartDefinition cube_r116 = bone2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(61, 42).addBox(-2.437F, -0.5F, -1.8387F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.2985F, 6.1344F, -5.3876F, -1.8677F, 1.0396F, -2.2018F));

		PartDefinition cube_r117 = bone2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(76, 12).addBox(-2.8832F, -0.5F, -0.6205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.2985F, 6.1344F, -5.3876F, -0.6078F, 0.5581F, -0.643F));

		PartDefinition cube_r118 = bone2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(46, 52).addBox(0.3886F, -0.4747F, -2.1568F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.2985F, 6.1344F, -5.3876F, -1.0367F, 0.9653F, -1.2116F));

		PartDefinition cube_r119 = bone2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(76, 0).addBox(-0.2491F, -0.5F, -3.4372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.2985F, 6.1344F, -5.3876F, -0.6423F, 0.6289F, -0.7046F));

		PartDefinition bone3 = neck.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-4.567F, -0.1275F, 1.5907F));

		PartDefinition cube_r120 = bone3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(39, 32).mirror().addBox(-2.5F, -0.8F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.354F, 0.1382F, 2.774F));

		PartDefinition cube_r121 = bone3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(53, 20).mirror().addBox(-4.8829F, -0.6063F, -0.7316F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.083F, 4.2455F, -3.6757F, -0.2497F, 0.9876F, 1.4163F));

		PartDefinition cube_r122 = bone3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(70, 51).mirror().addBox(-1.5F, -1.3F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8878F, 4.9356F, -5.2396F, -0.413F, 0.3633F, 1.0639F));

		PartDefinition cube_r123 = bone3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(75, 20).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3743F, 5.6001F, -5.1138F, -0.5311F, 0.2564F, 0.1165F));

		PartDefinition cube_r124 = bone3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(57, 54).mirror().addBox(-3.9744F, -0.6063F, -0.9641F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.083F, 4.2455F, -3.6757F, -0.2002F, 0.8174F, 1.4791F));

		PartDefinition cube_r125 = bone3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(70, 48).mirror().addBox(-1.7F, -1.3F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8878F, 4.9356F, -5.2396F, -0.5023F, 0.6774F, 0.8868F));

		PartDefinition cube_r126 = bone3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(76, 24).mirror().addBox(-1.4F, -0.3F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5939F, 6.0531F, -4.786F, -0.6179F, -0.1797F, 0.7342F));

		PartDefinition cube_r127 = bone3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-2.2392F, -0.4747F, -1.0015F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.2985F, 6.1344F, -5.3876F, -0.5151F, 0.1051F, 0.2051F));

		PartDefinition cube_r128 = bone3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(61, 42).mirror().addBox(1.437F, -0.5F, -1.8387F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.2985F, 6.1344F, -5.3876F, -1.8677F, -1.0396F, 2.2018F));

		PartDefinition cube_r129 = bone3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(76, 12).mirror().addBox(1.8832F, -0.5F, -0.6205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.2985F, 6.1344F, -5.3876F, -0.6078F, -0.5581F, 0.643F));

		PartDefinition cube_r130 = bone3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(46, 52).mirror().addBox(-1.3886F, -0.4747F, -2.1568F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.2985F, 6.1344F, -5.3876F, -1.0367F, -0.9653F, 1.2116F));

		PartDefinition cube_r131 = bone3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.7509F, -0.5F, -3.4372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.2985F, 6.1344F, -5.3876F, -0.6423F, -0.6289F, 0.7046F));

		PartDefinition wholehead = neck.addOrReplaceChild("wholehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1697F, -3.2884F, -0.0436F, 0.0F, 0.0F));

		PartDefinition headbase = wholehead.addOrReplaceChild("headbase", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6F, 0.0F));

		PartDefinition headdonotmove = headbase.addOrReplaceChild("headdonotmove", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -11.25F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r132 = headdonotmove.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(38, 77).addBox(-1.0F, -0.1383F, 2.0641F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 38).addBox(-1.0F, -0.1383F, 0.0641F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.65F, -6.2F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r133 = headdonotmove.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(21, 21).addBox(-3.0F, -0.0022F, -1.9591F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.2365F, 9.4239F, -2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r134 = headdonotmove.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(17, 27).addBox(-2.5F, -0.0022F, 0.0409F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2718F, 11.4585F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r135 = headdonotmove.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(19, 9).addBox(-3.5F, -0.0022F, 0.0409F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2826F, 10.1998F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r136 = headdonotmove.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(23, 5).addBox(-3.5F, -0.0022F, 0.0409F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3F, 9.2F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r137 = headdonotmove.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 19).addBox(-2.5F, -0.0022F, -3.9591F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3F, 9.2F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r138 = headdonotmove.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(27, 65).addBox(-1.0F, -0.0365F, -2.0268F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -2.45F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r139 = headdonotmove.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(34, 27).addBox(-2.0F, -0.0143F, -3.0351F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.45F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r140 = headdonotmove.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(26, 74).addBox(-0.1F, -0.4F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3714F, 0.1156F, 2.0015F, 0.4516F, 0.9528F, 0.703F));

		PartDefinition cube_r141 = headdonotmove.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(23, 0).addBox(-3.0F, -0.07F, -2.95F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 3.35F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r142 = headdonotmove.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 30).addBox(-3.0F, -0.037F, -1.9923F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0F, 5.3F, 0.0785F, 0.0F, 0.0F));

		PartDefinition leftFace = headdonotmove.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(5.9368F, -0.975F, 0.1495F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(10, 82).addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-4.676F, 3.9569F, -5.1425F, 0.811F, 0.2539F, 0.4857F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 81).addBox(0.123F, -0.8749F, 0.0337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2943F, 5.0499F, -5.8308F, 0.7886F, -0.1469F, 0.0809F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(72, 80).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.0784F, 3.4264F, -3.8218F, 0.8129F, 0.5051F, 1.2606F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(50, 42).addBox(-0.2F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5046F, 3.4845F, -3.3774F, 0.7255F, 0.291F, 1.0371F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(49, 25).addBox(-0.8148F, 0.0934F, -0.2465F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.1306F, 4.1281F, -5.4014F, 0.7838F, 0.4503F, 1.1973F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(78, 7).addBox(1.1129F, -0.8749F, 0.2044F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(76, 4).addBox(1.1129F, -0.8749F, -0.2956F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-5.2943F, 5.0499F, -5.8308F, 0.8488F, -0.3625F, -0.1557F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(75, 69).addBox(-0.3F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.922F, 1.3884F, 4.4707F, 0.1586F, -0.047F, 0.6F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(81, 65).addBox(-0.4F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.8074F, 1.8348F, 2.0044F, 0.4605F, 1.0688F, 1.1327F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(70, 45).addBox(-2.0F, -0.5F, -0.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.869F, 1.4425F, 3.5348F, 2.5996F, 1.1434F, -2.9204F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(70, 42).addBox(-2.0F, -0.5F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.869F, 1.4425F, 3.5348F, 2.3996F, 1.2488F, -3.1348F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(68, 54).addBox(-2.9472F, 0.1431F, 0.2148F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.139F, 2.5818F, 0.46F, 0.2349F, 0.4055F, 0.8166F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(75, 73).addBox(-0.5128F, -0.0494F, -2.1965F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(5.4681F, 3.3628F, 11.2347F, 0.4595F, 1.0563F, 1.1272F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(67, 61).addBox(-1.7629F, -0.0494F, -0.3637F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(5.4681F, 3.3628F, 11.2347F, 0.1036F, 0.2236F, 0.7713F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(57, 67).addBox(-1.795F, -0.6313F, -2.4184F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(5.9527F, 4.3173F, 15.1594F, 0.0795F, 0.2141F, 0.8359F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(48, 67).addBox(-1.6761F, -0.6313F, -0.7214F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(5.9527F, 4.3173F, 15.1594F, 0.0825F, 0.3446F, 0.8469F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(68, 75).addBox(-1.9615F, -0.6313F, 0.7265F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(5.9527F, 4.3173F, 15.1594F, 0.0975F, 0.6488F, 0.878F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(15, 82).addBox(0.1108F, -0.6313F, 0.729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(61, 75).addBox(0.6108F, -0.6313F, 0.229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.9527F, 4.3173F, 15.1594F, 0.0842F, -0.3948F, 0.7865F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(66, 57).addBox(-0.5867F, -0.6313F, -1.4099F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(5.9527F, 4.3173F, 15.1594F, 0.0784F, -0.1339F, 0.8085F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(11, 55).addBox(-1.8263F, -0.6313F, -3.2437F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.9527F, 4.3173F, 15.1594F, 0.0815F, -0.3078F, 0.7942F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(66, 20).addBox(1.5362F, 0.1856F, -2.1888F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(5.5681F, 3.0628F, 11.2347F, 0.1505F, -0.4773F, 0.9754F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(16, 64).addBox(-0.25F, -0.5F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(6.2175F, 5.8897F, 10.0029F, 0.2381F, 0.9709F, 1.2426F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(46, 48).addBox(-1.3198F, 1.4098F, 2.0069F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.014F))
				.texOffs(61, 71).addBox(1.6802F, 1.4098F, 0.0069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(6.4681F, 3.0628F, 7.8347F, 0.1391F, 0.2834F, 1.0841F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(22, 81).addBox(1.0688F, 1.0615F, 0.9611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(5.8681F, 3.0628F, 6.8347F, 0.2077F, 0.6597F, 1.1708F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(54, 31).addBox(-0.1226F, -0.0447F, 0.0804F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.1625F, 0.819F, 6.1635F, 0.0401F, 0.2084F, 0.5992F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(11, 49).addBox(-0.1226F, -0.0447F, -0.5196F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0634F, 0.7726F, 5.6756F, 0.0273F, -0.0428F, 0.5583F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(52, 36).addBox(-1.0226F, -0.0447F, 3.9804F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F))
				.texOffs(22, 52).addBox(-1.0226F, -0.0447F, -0.0196F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.8383F, 1.2183F, 5.2276F, 0.033F, 0.4646F, 0.5219F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(81, 32).addBox(-3.0226F, -0.0447F, -0.0196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.6896F, 3.2072F, 3.9558F, 0.1643F, 0.4378F, 0.8212F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 52).addBox(0.6774F, 0.7553F, -0.0196F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(4.4681F, 3.0628F, 3.6347F, 0.2889F, 0.3705F, 1.1358F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(5, 82).addBox(-1.7473F, 0.1431F, 0.3148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(51, 7).addBox(-0.7472F, 0.1431F, -0.0852F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.8694F, 4.1281F, -0.1014F, 0.3464F, 0.3172F, 1.1295F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -0.4F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6708F, 0.3564F, 7.8419F, 0.0689F, -0.5012F, 0.05F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(5, 75).addBox(-2.0F, -0.4F, -2.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(27, 60).addBox(-1.0F, -0.4F, -2.45F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5513F, 2.3323F, 10.7606F, -0.3053F, 0.3988F, -0.1596F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(59, 48).addBox(-1.9F, -0.8F, 0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4809F, 2.5505F, 10.5428F, -0.7045F, -0.5571F, 0.39F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(22, 78).addBox(-0.3597F, 0.4219F, -0.7586F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0053F, 1.2852F, 11.1042F, -0.9828F, -0.182F, 0.4012F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(40, 15).addBox(-0.9F, -0.4F, -1.6F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6244F, 0.6124F, 8.1469F, 0.0601F, 0.2015F, 0.283F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(23, 69).addBox(-1.0F, -0.55F, -0.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6918F, 1.2031F, 9.1699F, -0.7298F, 0.1667F, 0.3245F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(79, 47).addBox(0.0178F, -0.189F, -0.8872F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9942F, 0.5185F, 10.4624F, -0.7942F, 0.2744F, 0.2706F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(79, 44).addBox(0.0178F, -0.189F, -0.8872F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0053F, 1.2852F, 11.1042F, -0.8465F, 0.2508F, 0.2305F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(74, 32).addBox(-0.425F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7805F, 0.3239F, 9.3132F, 0.0329F, 0.2076F, 0.1495F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(44, 80).addBox(-1.0F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 41).addBox(-1.0F, -0.525F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7535F, 2.931F, -2.0023F, 1.0997F, 1.0104F, 1.6796F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(74, 65).addBox(-1.0F, -0.0115F, -2.0268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9368F, 1.275F, -2.5995F, 0.5699F, 0.4717F, 0.2403F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(77, 54).addBox(-2.5F, -0.4F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.268F, 1.1115F, 0.3148F, 0.1251F, 0.0049F, 0.1034F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(9, 59).addBox(-0.8F, -0.5F, -1.866F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.21F, 1.3502F, -0.6108F, 0.3422F, 0.6072F, 0.2871F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(60, 25).addBox(-1.1732F, -0.5F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.21F, 1.3502F, -0.6108F, 1.0905F, 1.2548F, 1.156F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(39, 80).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.445F, 1.273F, -0.112F, 1.0905F, 1.2548F, 1.156F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(19, 73).addBox(-0.6732F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.21F, 1.3502F, -0.6108F, 0.6216F, 1.0779F, 0.6495F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(5, 79).addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2201F, 2.0419F, 11.3124F, -1.1861F, -0.5764F, 0.9318F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(65, 32).addBox(-1.4F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.9368F, 1.9803F, 11.2626F, -1.0156F, -0.4165F, 0.5779F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(45, 77).addBox(-0.45F, -0.5F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.8405F, 1.2615F, 1.2907F, 0.7869F, 1.2057F, 1.0794F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(75, 77).addBox(-0.9F, -0.5F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.227F, 1.0564F, 6.4564F, 0.071F, 0.5934F, 0.3108F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(79, 50).addBox(-0.9F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4831F, 2.147F, -0.4908F, 0.6499F, 0.828F, 1.146F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(40, 20).addBox(-3.0407F, -0.0116F, -2.9909F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2156F, 2.7508F, 0.8045F, 0.4641F, 0.4167F, 0.8355F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(39, 36).addBox(-1.6408F, 0.0884F, -0.0909F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7694F, 4.1281F, -2.9014F, 0.5436F, 0.2705F, 1.1208F));

		PartDefinition rightFace = headdonotmove.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-5.9368F, -0.975F, 0.1495F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(10, 82).mirror().addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(4.676F, 3.9569F, -5.1425F, 0.811F, -0.2539F, -0.4857F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-1.123F, -0.8749F, 0.0337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.2943F, 5.0499F, -5.8308F, 0.7886F, 0.1469F, -0.0809F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(72, 80).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.0784F, 3.4264F, -3.8218F, 0.8129F, -0.5051F, -1.2606F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(50, 42).mirror().addBox(-0.8F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5046F, 3.4845F, -3.3774F, 0.7255F, -0.291F, -1.0371F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(49, 25).mirror().addBox(-0.1852F, 0.0934F, -0.2465F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.1306F, 4.1281F, -5.4014F, 0.7838F, -0.4503F, -1.1973F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(78, 7).mirror().addBox(-3.1129F, -0.8749F, 0.2044F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(76, 4).mirror().addBox(-3.1129F, -0.8749F, -0.2956F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(5.2943F, 5.0499F, -5.8308F, 0.8488F, 0.3625F, 0.1557F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(75, 69).mirror().addBox(-0.7F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.922F, 1.3884F, 4.4707F, 0.1586F, 0.047F, -0.6F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(81, 65).mirror().addBox(-0.6F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.8074F, 1.8348F, 2.0044F, 0.4605F, -1.0688F, -1.1327F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(70, 45).mirror().addBox(-1.0F, -0.5F, -0.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.869F, 1.4425F, 3.5348F, 2.5996F, -1.1434F, 2.9204F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(70, 42).mirror().addBox(-1.0F, -0.5F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.869F, 1.4425F, 3.5348F, 2.3996F, -1.2488F, 3.1348F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(68, 54).mirror().addBox(-0.0527F, 0.1431F, 0.2148F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.139F, 2.5818F, 0.46F, 0.2349F, -0.4055F, -0.8166F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(75, 73).mirror().addBox(-0.4872F, -0.0494F, -2.1965F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-5.4681F, 3.3628F, 11.2347F, 0.4595F, -1.0563F, -1.1272F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(67, 61).mirror().addBox(-0.2371F, -0.0494F, -0.3637F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-5.4681F, 3.3628F, 11.2347F, 0.1036F, -0.2236F, -0.7713F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(57, 67).mirror().addBox(-0.205F, -0.6313F, -2.4184F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-5.9527F, 4.3173F, 15.1594F, 0.0795F, -0.2141F, -0.8359F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(48, 67).mirror().addBox(-0.3239F, -0.6313F, -0.7214F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-5.9527F, 4.3173F, 15.1594F, 0.0825F, -0.3446F, -0.8469F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(68, 75).mirror().addBox(0.9615F, -0.6313F, 0.7265F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-5.9527F, 4.3173F, 15.1594F, 0.0975F, -0.6488F, -0.878F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(15, 82).mirror().addBox(-1.1108F, -0.6313F, 0.729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(61, 75).mirror().addBox(-1.6108F, -0.6313F, 0.229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.9527F, 4.3173F, 15.1594F, 0.0842F, 0.3948F, -0.7865F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(66, 57).mirror().addBox(-1.4133F, -0.6313F, -1.4099F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-5.9527F, 4.3173F, 15.1594F, 0.0784F, 0.1339F, -0.8085F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(11, 55).mirror().addBox(-1.1737F, -0.6313F, -3.2437F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.9527F, 4.3173F, 15.1594F, 0.0815F, 0.3078F, -0.7942F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(66, 20).mirror().addBox(-3.5362F, 0.1856F, -2.1888F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-5.5681F, 3.0628F, 11.2347F, 0.1505F, 0.4773F, -0.9754F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(16, 64).mirror().addBox(-0.75F, -0.5F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-6.2175F, 5.8897F, 10.0029F, 0.2381F, -0.9709F, -1.2426F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(46, 48).mirror().addBox(-2.6802F, 1.4098F, 2.0069F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(61, 71).mirror().addBox(-2.6802F, 1.4098F, 0.0069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-6.4681F, 3.0628F, 7.8347F, 0.1391F, -0.2834F, -1.0841F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(22, 81).mirror().addBox(-2.0688F, 1.0615F, 0.9611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-5.8681F, 3.0628F, 6.8347F, 0.2077F, -0.6597F, -1.1708F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(54, 31).mirror().addBox(-1.8774F, -0.0447F, 0.0804F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1625F, 0.819F, 6.1635F, 0.0401F, -0.2084F, -0.5992F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(11, 49).mirror().addBox(-0.8774F, -0.0447F, -0.5196F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.0634F, 0.7726F, 5.6756F, 0.0273F, 0.0428F, -0.5583F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(52, 36).mirror().addBox(0.0226F, -0.0447F, 3.9804F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(22, 52).mirror().addBox(0.0226F, -0.0447F, -0.0196F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.8383F, 1.2183F, 5.2276F, 0.033F, -0.4646F, -0.5219F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(81, 32).mirror().addBox(2.0226F, -0.0447F, -0.0196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.6896F, 3.2072F, 3.9558F, 0.1643F, -0.4378F, -0.8212F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-1.6774F, 0.7553F, -0.0196F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-4.4681F, 3.0628F, 3.6347F, 0.2889F, -0.3705F, -1.1358F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(5, 82).mirror().addBox(0.7472F, 0.1431F, 0.3148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(51, 7).mirror().addBox(-0.2528F, 0.1431F, -0.0852F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.8694F, 4.1281F, -0.1014F, 0.3464F, -0.3172F, -1.1295F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-1.5F, -0.4F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6708F, 0.3564F, 7.8419F, 0.0689F, 0.5012F, -0.05F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(1.0F, -0.4F, -2.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 60).mirror().addBox(0.0F, -0.4F, -2.45F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5513F, 2.3323F, 10.7606F, -0.3053F, -0.3988F, 0.1596F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(59, 48).mirror().addBox(-2.1F, -0.8F, 0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4809F, 2.5505F, 10.5428F, -0.7045F, 0.5571F, -0.39F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(22, 78).mirror().addBox(-1.6403F, 0.4219F, -0.7586F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0053F, 1.2852F, 11.1042F, -0.9828F, 0.182F, -0.4012F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(40, 15).mirror().addBox(-2.1F, -0.4F, -1.6F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6244F, 0.6124F, 8.1469F, 0.0601F, -0.2015F, -0.283F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(23, 69).mirror().addBox(-1.0F, -0.55F, -0.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6918F, 1.2031F, 9.1699F, -0.7298F, -0.1667F, -0.3245F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(79, 47).mirror().addBox(-2.0178F, -0.189F, -0.8872F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9942F, 0.5185F, 10.4624F, -0.7942F, -0.2744F, -0.2706F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(79, 44).mirror().addBox(-2.0179F, -0.189F, -0.8872F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0053F, 1.2852F, 11.1042F, -0.8465F, -0.2508F, -0.2305F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(74, 32).mirror().addBox(-0.575F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7805F, 0.3239F, 9.3132F, 0.0329F, -0.2076F, -0.1495F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(44, 80).mirror().addBox(0.0F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 41).mirror().addBox(-1.0F, -0.525F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7535F, 2.931F, -2.0023F, 1.0997F, -1.0104F, -1.6796F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(74, 65).mirror().addBox(0.0F, -0.0115F, -2.0268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.9368F, 1.275F, -2.5995F, 0.5699F, -0.4717F, -0.2403F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(77, 54).mirror().addBox(0.5F, -0.4F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.268F, 1.1115F, 0.3148F, 0.1251F, -0.0049F, -0.1034F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(9, 59).mirror().addBox(-0.2F, -0.5F, -1.866F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.21F, 1.3502F, -0.6108F, 0.3422F, -0.6072F, -0.2871F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(60, 25).mirror().addBox(0.1732F, -0.5F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(3.21F, 1.3502F, -0.6108F, 1.0905F, -1.2548F, -1.156F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(39, 80).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.445F, 1.273F, -0.112F, 1.0905F, -1.2548F, -1.156F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(19, 73).mirror().addBox(-0.3268F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(3.21F, 1.3502F, -0.6108F, 0.6216F, -1.0779F, -0.6495F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2201F, 2.0419F, 11.3124F, -1.1861F, 0.5764F, -0.9318F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(65, 32).mirror().addBox(-0.6F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.9368F, 1.9803F, 11.2626F, -1.0156F, 0.4165F, -0.5779F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(45, 77).mirror().addBox(-1.55F, -0.5F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.8405F, 1.2615F, 1.2907F, 0.7869F, -1.2057F, -1.0794F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(75, 77).mirror().addBox(-1.1F, -0.5F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.227F, 1.0564F, 6.4564F, 0.071F, -0.5934F, -0.3108F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(79, 50).mirror().addBox(-1.1F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4831F, 2.147F, -0.4908F, 0.6499F, -0.828F, -1.146F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(40, 20).mirror().addBox(0.0407F, -0.0116F, -2.9909F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2156F, 2.7508F, 0.8045F, 0.4641F, -0.4167F, -0.8355F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(39, 36).mirror().addBox(-0.3592F, 0.0884F, -0.0909F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7694F, 4.1281F, -2.9014F, 0.5436F, -0.2705F, -1.1208F));

		PartDefinition jaw = wholehead.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 4.8925F, 0.5641F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r247 = jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(26, 32).mirror().addBox(-0.6013F, 0.218F, -4.3408F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.9951F, -0.1093F, 0.1458F, -0.2443F, -0.2618F, 0.0F));

		PartDefinition cube_r248 = jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(69, 24).mirror().addBox(-0.6246F, -0.1344F, -4.005F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.9951F, -0.1093F, 0.1458F, -0.0652F, -0.2707F, -0.0345F));

		PartDefinition cube_r249 = jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-0.6013F, 0.2008F, -2.5513F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-11.9951F, -0.1093F, 0.1458F, 0.2269F, -0.2618F, 0.0F));

		PartDefinition cube_r250 = jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(54, 71).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9975F, 1.2411F, -16.7075F, 0.6468F, -1.4663F, -0.8363F));

		PartDefinition cube_r251 = jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(49, 58).mirror().addBox(-0.5F, -0.5929F, -1.2389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3167F, 1.2454F, -16.2614F, 0.274F, -1.1395F, -0.1707F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(12, 73).mirror().addBox(-0.012F, -0.773F, -2.0549F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5167F, 1.2454F, -17.1615F, 0.8126F, -1.4663F, -0.8363F));

		PartDefinition cube_r253 = jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(72, 38).mirror().addBox(-0.5018F, -0.8739F, -1.1415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3304F, 1.0802F, -16.2661F, 0.3526F, -1.1395F, -0.1707F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(35, 48).mirror().addBox(0.0413F, -0.3074F, -3.9211F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.1451F, -0.2593F, -14.0292F, 0.1658F, -0.8552F, 0.0F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(24, 46).mirror().addBox(0.0835F, -0.2171F, -3.4111F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-8.0951F, -0.8093F, -11.2542F, 0.1658F, -0.5934F, 0.0F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(0.1455F, -0.1987F, -4.0249F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-10.295F, -1.1093F, -7.2542F, 0.0785F, -0.4712F, 0.0F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(57, 57).mirror().addBox(-0.014F, -0.7644F, -3.4079F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.5951F, -0.1093F, -3.8542F, -0.0785F, -0.4014F, 0.0F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(13, 43).mirror().addBox(0.0413F, 0.3318F, -3.9051F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1451F, -0.2593F, -14.0292F, 0.1309F, -0.8552F, 0.0F));

		PartDefinition cube_r259 = jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(39, 42).mirror().addBox(0.0835F, 0.7284F, -3.3982F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0951F, -0.8093F, -11.2542F, 0.0436F, -0.5934F, 0.0F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(40, 8).mirror().addBox(0.1455F, -0.13F, -4.0309F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.295F, -1.1093F, -7.2542F, 0.0436F, -0.4712F, 0.0F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-0.014F, -0.4041F, -3.8022F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-11.5951F, -0.1093F, -3.8542F, -0.2182F, -0.4014F, 0.0F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(26, 32).addBox(-0.3987F, 0.218F, -4.3408F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.9951F, -0.1093F, 0.1458F, -0.2443F, 0.2618F, 0.0F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(69, 24).addBox(-0.3754F, -0.1344F, -4.005F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.9951F, -0.1093F, 0.1458F, -0.0652F, 0.2707F, 0.0345F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(62, 0).addBox(-0.3987F, 0.2008F, -2.5513F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(12.9951F, -0.1093F, 0.1458F, 0.2269F, 0.2618F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(54, 71).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9975F, 1.2411F, -16.7075F, 0.6468F, 1.4663F, 0.8363F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(49, 58).addBox(-0.5F, -0.5929F, -1.2389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3167F, 1.2454F, -16.2614F, 0.274F, 1.1395F, 0.1707F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(12, 73).addBox(-0.988F, -0.773F, -2.0549F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5167F, 1.2454F, -17.1615F, 0.8126F, 1.4663F, 0.8363F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(72, 38).addBox(-0.4982F, -0.8739F, -1.1415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.3304F, 1.0802F, -16.2661F, 0.3526F, 1.1395F, 0.1707F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(35, 48).addBox(-1.0413F, -0.3074F, -3.9211F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(7.1451F, -0.2593F, -14.0292F, 0.1658F, 0.8552F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(24, 46).addBox(-1.0835F, -0.2171F, -3.4111F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(9.0951F, -0.8093F, -11.2542F, 0.1658F, 0.5934F, 0.0F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(0, 46).addBox(-1.1455F, -0.1987F, -4.0249F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(11.295F, -1.1093F, -7.2542F, 0.0785F, 0.4712F, 0.0F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(57, 57).addBox(-0.986F, -0.7644F, -3.4079F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.5951F, -0.1093F, -3.8542F, -0.0785F, 0.4014F, 0.0F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(13, 43).addBox(-1.0413F, 0.3318F, -3.9051F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1451F, -0.2593F, -14.0292F, 0.1309F, 0.8552F, 0.0F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(39, 42).addBox(-1.0835F, 0.7284F, -3.3982F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0951F, -0.8093F, -11.2542F, 0.0436F, 0.5934F, 0.0F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(40, 8).addBox(-1.1455F, -0.13F, -4.0309F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.295F, -1.1093F, -7.2542F, 0.0436F, 0.4712F, 0.0F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(42, 0).addBox(-0.986F, -0.4041F, -3.8022F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(12.5951F, -0.1093F, -3.8542F, -0.2182F, 0.4014F, 0.0F));

		return LayerDefinition.create(meshdefinition, 88, 88);
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