package fossils.fossils.client.blockentity.model.odobenocetops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OdobenocetopsFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart body;
	private final ModelPart body5;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftTusk;
	private final ModelPart rightTusk;
	private final ModelPart bone;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;

	public OdobenocetopsFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.body = this.body6.getChild("body");
		this.body5 = this.body.getChild("body5");
		this.body4 = this.body5.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.hips = this.body2.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftTusk = this.head.getChild("leftTusk");
		this.rightTusk = this.head.getChild("rightTusk");
		this.bone = this.rightTusk.getChild("bone");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.8752F, -20.8991F, 0.6507F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(69, 80).addBox(0.0F, -1.4068F, -0.4181F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5854F, -2.0706F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(75, 52).mirror().addBox(-1.3919F, -1.4039F, -2.9497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, 1.6942F, 0.1134F, -0.1257F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(75, 35).mirror().addBox(-1.3919F, -3.1196F, -1.6743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(75, 24).mirror().addBox(-1.3919F, -3.1196F, -1.2743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.243F)).mirror(false)
				.texOffs(75, 13).mirror().addBox(-1.3919F, -2.8196F, -1.2743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, 2.5232F, 0.1134F, -0.1257F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 75).mirror().addBox(-1.3919F, -1.9789F, -1.1479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, 2.6978F, 0.1134F, -0.1257F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-1.3919F, -2.0496F, -1.8795F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.243F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, 2.2178F, 0.1134F, -0.1257F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 69).mirror().addBox(-0.9032F, -1.0928F, 0.1033F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, 2.7636F, -0.2429F, 0.0456F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 67).mirror().addBox(-0.9032F, -2.4484F, -0.9425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.243F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, 1.76F, -0.2429F, 0.0456F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 48).mirror().addBox(-0.9032F, -2.1551F, -0.4681F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, 2.0218F, -0.2429F, 0.0456F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 74).mirror().addBox(-0.9032F, -2.9354F, -1.3598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, -1.3903F, -0.2429F, 0.0456F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(37, 74).mirror().addBox(-0.9032F, -3.1777F, -1.0779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, -0.9976F, -0.2429F, 0.0456F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(74, 32).mirror().addBox(-0.9032F, 0.3068F, 1.9817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, -3.0746F, -0.2429F, 0.0456F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(63, 69).mirror().addBox(-0.9032F, -1.3224F, 2.2433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, 2.1178F, -0.2429F, 0.0456F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(52, 34).mirror().addBox(-3.2F, -0.1F, -0.4F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9867F, 6.6314F, -1.8879F, -0.1242F, -0.0019F, 0.9034F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(70, 66).mirror().addBox(-6.9749F, -2.5163F, -0.2095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.6648F, -1.835F, -0.4645F, 0.225F, -1.3103F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(58, 32).mirror().addBox(-5.5626F, -0.3724F, -0.2095F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.6648F, -1.835F, -0.3466F, 0.3855F, -0.9238F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(57, 52).mirror().addBox(-2.5717F, 0.3036F, -0.2095F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.6648F, -1.835F, -0.2329F, 0.4608F, -0.6486F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(57, 50).mirror().addBox(-5.7118F, -0.9016F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.4474F, -0.0162F, -0.4761F, 0.3656F, -1.0055F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(57, 48).mirror().addBox(-2.8528F, -0.169F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.4474F, -0.0162F, -0.3689F, 0.4736F, -0.7441F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(57, 46).mirror().addBox(-7.9055F, -3.0617F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.4474F, -0.0162F, -0.5714F, 0.1625F, -1.3651F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(8, 74).mirror().addBox(-0.9032F, -3.3389F, -0.5046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, -0.5176F, -0.2429F, 0.0456F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(29, 48).mirror().addBox(-0.9032F, -2.8068F, -0.4405F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, -0.2908F, -0.2429F, 0.0456F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(58, 69).mirror().addBox(-0.9032F, -0.3844F, 0.5673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, -0.0028F, -0.2429F, 0.0456F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.9032F, 0.7001F, 1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, 1.7338F, -0.2429F, 0.0456F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.9032F, -1.2455F, 1.0602F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, 1.5244F, -0.2429F, 0.0456F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(73, 73).mirror().addBox(-0.9032F, 0.3476F, 2.232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, 2.9032F, -0.2429F, 0.0456F));

		PartDefinition cube_r26 = chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(47, 18).mirror().addBox(-0.9032F, -0.2038F, -0.4103F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, 2.6414F, -0.2429F, 0.0456F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(56, 16).mirror().addBox(-0.9032F, -0.2651F, -1.8363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, 4.291F, 0.3684F, 1.8473F, -0.2429F, 0.0456F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(34, 24).mirror().addBox(-5.6F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4092F, 8.9541F, 3.8787F, 0.2796F, 0.2122F, 0.2664F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(45, 32).mirror().addBox(-4.7504F, -0.1424F, 0.2175F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8479F, 8.4573F, 0.3914F, -0.3214F, 0.4665F, 0.3559F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(49, 24).mirror().addBox(-4.4398F, -0.9303F, -0.1003F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9461F, 7.9035F, -1.9243F, -0.635F, 0.4909F, 0.2073F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(70, 66).addBox(4.9749F, -2.5163F, -0.2095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.6648F, -1.835F, -0.4645F, -0.225F, 1.3103F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(58, 32).addBox(2.5626F, -0.3724F, -0.2095F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.6648F, -1.835F, -0.3466F, -0.3855F, 0.9238F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(57, 52).addBox(-0.4283F, 0.3036F, -0.2095F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.6648F, -1.835F, -0.2329F, -0.4608F, 0.6486F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(42, 74).addBox(-0.0968F, -2.9354F, -1.3598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, -1.3903F, 0.2429F, -0.0456F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(37, 74).addBox(-0.0968F, -3.1777F, -1.0779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, -0.9976F, 0.2429F, -0.0456F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(8, 74).addBox(-0.0968F, -3.3389F, -0.5046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, -0.5176F, 0.2429F, -0.0456F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(29, 48).addBox(-0.0968F, -2.8068F, -0.4405F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, -0.2908F, 0.2429F, -0.0456F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(58, 69).addBox(-0.0968F, -0.3844F, 0.5673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, -0.0028F, 0.2429F, -0.0456F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 74).addBox(-0.0968F, 0.7001F, 1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, 1.7338F, 0.2429F, -0.0456F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 54).addBox(-0.0968F, -1.2455F, 1.0602F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, 1.5244F, 0.2429F, -0.0456F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(63, 69).addBox(-0.0968F, -1.3224F, 2.2433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, 2.1178F, 0.2429F, -0.0456F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(74, 32).addBox(-0.0968F, 0.3068F, 1.9817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, -3.0746F, 0.2429F, -0.0456F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(73, 73).addBox(-0.0968F, 0.3476F, 2.232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, 2.9032F, 0.2429F, -0.0456F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(47, 18).addBox(-0.0968F, -0.2038F, -0.4103F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, 2.6414F, 0.2429F, -0.0456F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(75, 52).addBox(0.3919F, -1.4039F, -2.9497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, 1.6942F, -0.1134F, 0.1257F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(75, 35).addBox(0.3919F, -3.1196F, -1.6743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(75, 24).addBox(0.3919F, -3.1196F, -1.2743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.243F))
				.texOffs(75, 13).addBox(0.3919F, -2.8196F, -1.2743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, 2.5232F, -0.1134F, 0.1257F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 70).addBox(0.3919F, -2.0496F, -1.8795F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.243F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, 2.2178F, -0.1134F, 0.1257F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(13, 75).addBox(0.3919F, -1.9789F, -1.1479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, 2.6978F, -0.1134F, 0.1257F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(12, 67).addBox(-0.0968F, -2.4484F, -0.9425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.243F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, 1.76F, 0.2429F, -0.0456F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(68, 69).addBox(-0.0968F, -1.0928F, 0.1033F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, 2.7636F, 0.2429F, -0.0456F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(66, 48).addBox(-0.0968F, -2.1551F, -0.4681F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, 2.0218F, 0.2429F, -0.0456F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(56, 16).addBox(-0.0968F, -0.2651F, -1.8363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.2515F, 4.291F, 0.3684F, 1.8473F, 0.2429F, -0.0456F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(51, 5).addBox(-1.0F, -1.2199F, 0.9649F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 9.9065F, 1.5041F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(34, 24).addBox(-0.4F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4092F, 8.9541F, 3.8787F, 0.2796F, -0.2122F, -0.2664F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(45, 32).addBox(-0.2496F, -0.1424F, 0.2175F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8479F, 8.4573F, 0.3914F, -0.3214F, -0.4665F, -0.3559F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(51, 80).addBox(0.0F, -1.9521F, 0.0721F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2624F, -0.5632F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(52, 34).addBox(-0.8F, -0.1F, -0.4F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9867F, 6.6314F, -1.8879F, -0.1242F, 0.0019F, -0.9034F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(49, 24).addBox(0.4398F, -0.9303F, -0.1003F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9461F, 7.9035F, -1.9243F, -0.635F, -0.4909F, -0.2073F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(57, 50).addBox(2.7118F, -0.9016F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4474F, -0.0162F, -0.4761F, -0.3656F, 1.0055F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(57, 48).addBox(-0.1472F, -0.169F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4474F, -0.0162F, -0.3689F, -0.4736F, 0.7441F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(57, 46).addBox(4.9055F, -3.0617F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4474F, -0.0162F, -0.5714F, -0.1625F, 1.3651F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(48, 45).addBox(-1.0F, -1.7757F, -2.3409F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 10.0823F, 1.5202F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(11, 46).addBox(-1.0F, -0.94F, -2.986F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 8.4823F, -0.3798F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(48, 40).addBox(-0.5F, -0.157F, 0.068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7854F, -2.5206F, 0.2531F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0624F, 0.4829F, 0.166F, -0.043F, -0.0072F));

		PartDefinition cube_r65 = body6.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(54, 10).mirror().addBox(-9.3587F, -4.4854F, -1.3519F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.085F, 1.5008F, -0.6267F, -0.0485F, -1.3159F));

		PartDefinition cube_r66 = body6.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(57, 44).mirror().addBox(-6.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.085F, 1.5008F, -0.604F, 0.1853F, -0.9881F));

		PartDefinition cube_r67 = body6.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(57, 42).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.085F, 1.5008F, -0.5459F, 0.3283F, -0.7611F));

		PartDefinition cube_r68 = body6.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(9, 60).mirror().addBox(-1.9081F, -0.0014F, -0.5165F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.085F, 1.5008F, -0.2639F, 0.1523F, 0.0686F));

		PartDefinition cube_r69 = body6.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(70, 18).mirror().addBox(-1.9081F, -0.0014F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.185F, 3.5008F, -0.2551F, 0.1517F, 0.0001F));

		PartDefinition cube_r70 = body6.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(57, 40).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.185F, 3.5008F, -0.5392F, 0.3343F, -0.8288F));

		PartDefinition cube_r71 = body6.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(36, 57).mirror().addBox(-6.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.185F, 3.5008F, -0.5991F, 0.1926F, -1.057F));

		PartDefinition cube_r72 = body6.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(36, 51).mirror().addBox(-9.3587F, -4.4854F, -1.3519F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.185F, 3.5008F, -0.6245F, -0.0401F, -1.3859F));

		PartDefinition cube_r73 = body6.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(68, 56).mirror().addBox(-1.9081F, -0.0014F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.385F, 5.5008F, -0.2111F, 0.1485F, -0.0282F));

		PartDefinition cube_r74 = body6.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(55, 14).mirror().addBox(-8.3587F, -4.4854F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.385F, 5.5008F, -0.6135F, 0.0021F, -1.421F));

		PartDefinition cube_r75 = body6.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(64, 58).mirror().addBox(-6.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.385F, 5.5008F, -0.5744F, 0.2289F, -1.0868F));

		PartDefinition cube_r76 = body6.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(63, 34).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.385F, 5.5008F, -0.5054F, 0.3641F, -0.8521F));

		PartDefinition cube_r77 = body6.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(9, 60).addBox(0.9081F, -0.0014F, -0.5165F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.085F, 1.5008F, -0.2639F, -0.1523F, -0.0686F));

		PartDefinition cube_r78 = body6.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(57, 42).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.085F, 1.5008F, -0.5459F, -0.3283F, 0.7611F));

		PartDefinition cube_r79 = body6.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(57, 44).addBox(3.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.085F, 1.5008F, -0.604F, -0.1853F, 0.9881F));

		PartDefinition cube_r80 = body6.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(54, 10).addBox(5.3587F, -4.4854F, -1.3519F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.085F, 1.5008F, -0.6267F, 0.0485F, 1.3159F));

		PartDefinition cube_r81 = body6.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(36, 51).addBox(5.3587F, -4.4854F, -1.3519F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.185F, 3.5008F, -0.6245F, 0.0401F, 1.3859F));

		PartDefinition cube_r82 = body6.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(36, 57).addBox(3.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.185F, 3.5008F, -0.5991F, -0.1926F, 1.057F));

		PartDefinition cube_r83 = body6.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(57, 40).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.185F, 3.5008F, -0.5392F, -0.3343F, 0.8288F));

		PartDefinition cube_r84 = body6.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(70, 18).addBox(-0.0919F, -0.0014F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.185F, 3.5008F, -0.2551F, -0.1517F, -0.0001F));

		PartDefinition cube_r85 = body6.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(68, 56).addBox(-0.0919F, -0.0014F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.385F, 5.5008F, -0.2111F, -0.1485F, 0.0282F));

		PartDefinition cube_r86 = body6.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.1F, -0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.104F, 0.0109F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body6.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(80, 53).addBox(0.0F, -1.9786F, -0.1073F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1345F, 5.1082F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body6.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(54, 14).addBox(5.3587F, -4.4854F, -1.3519F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.385F, 5.5008F, -0.6135F, -0.0021F, 1.421F));

		PartDefinition cube_r89 = body6.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(64, 58).addBox(3.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.385F, 5.5008F, -0.5744F, -0.2289F, 1.0868F));

		PartDefinition cube_r90 = body6.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(63, 34).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.385F, 5.5008F, -0.5054F, -0.3641F, 0.8521F));

		PartDefinition cube_r91 = body6.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(18, 80).addBox(0.0F, -2.0161F, -0.0338F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.9539F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body6.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(18, 51).addBox(0.0F, -1.8246F, -0.0282F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 2.9539F, -0.1134F, 0.0F, 0.0F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5957F, 5.8766F, -0.2736F, -0.1261F, 0.0353F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(21, 76).addBox(0.0F, -1.0772F, -0.1872F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7296F, 1.1014F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(76, 0).addBox(0.0F, -2.604F, 0.038F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.996F, 4.843F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(65, 14).mirror().addBox(-1.0206F, -0.0965F, -0.4011F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.9206F, 5.4356F, 0.1654F, 0.1102F, 0.0034F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-3.4696F, -0.5904F, -0.85F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.9206F, 5.4356F, -0.1737F, 0.5994F, -0.7137F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(59, 56).mirror().addBox(-6.1986F, -1.4683F, -0.85F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.9206F, 5.4356F, -0.3358F, 0.5328F, -1.0141F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(72, 43).mirror().addBox(-6.1321F, -3.7736F, -0.85F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.9206F, 5.4356F, -0.5146F, 0.3647F, -1.4201F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(71, 41).mirror().addBox(-1.9081F, -0.0014F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.7206F, 3.4356F, 0.1567F, 0.1113F, 0.0199F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(55, 59).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.7206F, 3.4356F, -0.1825F, 0.5945F, -0.7012F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(59, 54).mirror().addBox(-6.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.7206F, 3.4356F, -0.3422F, 0.526F, -0.9999F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(47, 59).mirror().addBox(-7.3587F, -4.4854F, -1.3519F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.7206F, 3.4356F, -0.5171F, 0.3563F, -1.4035F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(71, 39).mirror().addBox(-1.9081F, -0.0014F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, 0.1044F, 0.1176F, 0.0489F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(37, 59).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, -0.2338F, 0.5645F, -0.6943F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(28, 59).mirror().addBox(-6.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, -0.3792F, 0.4849F, -0.9829F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(55, 12).mirror().addBox(-8.3587F, -4.4854F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, -0.5318F, 0.3058F, -1.3734F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(71, 43).addBox(5.1321F, -3.7736F, -0.85F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.9206F, 5.4356F, -0.5146F, -0.3647F, 1.4201F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(59, 56).addBox(3.1986F, -1.4683F, -0.85F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.9206F, 5.4356F, -0.3358F, -0.5328F, 1.0141F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 60).addBox(0.4696F, -0.5904F, -0.85F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.9206F, 5.4356F, -0.1737F, -0.5994F, 0.7137F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(65, 14).addBox(0.0206F, -0.0965F, -0.4011F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.9206F, 5.4356F, 0.1654F, -0.1102F, -0.0034F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(46, 59).addBox(5.3587F, -4.4854F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.7206F, 3.4356F, -0.5171F, -0.3563F, 1.4035F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(59, 54).addBox(3.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.7206F, 3.4356F, -0.3422F, -0.526F, 0.9999F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(55, 59).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.7206F, 3.4356F, -0.1825F, -0.5945F, 0.7012F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(71, 41).addBox(-0.0919F, -0.0014F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.7206F, 3.4356F, 0.1567F, -0.1113F, -0.0199F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(37, 59).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, -0.2338F, -0.5645F, 0.6943F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(55, 12).addBox(5.3587F, -4.4854F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, -0.5318F, -0.3058F, 1.3734F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(28, 59).addBox(3.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, -0.3792F, -0.4849F, 0.9829F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(71, 39).addBox(-0.0919F, -0.0014F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, 0.1044F, -0.1176F, -0.0489F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(18, 75).addBox(0.0F, -2.3188F, -0.3713F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.796F, 3.243F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(19, 10).addBox(-0.5F, -0.0425F, -0.0704F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3017F, 6.1651F, 0.2489F, -0.1599F, 0.0925F));

		PartDefinition cube_r121 = body5.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(5, 71).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 4.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body5.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(27, 76).addBox(0.0F, -3.0F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 2.8F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body5.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(24, 76).addBox(0.0F, -2.8097F, -0.0421F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.7F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body5.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(56, 30).mirror().addBox(-3.3F, 0.5F, 5.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 22).mirror().addBox(-3.1F, 0.5F, 3.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 32).mirror().addBox(-2.2F, 0.5F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 30).addBox(0.3F, 0.5F, 5.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 22).addBox(0.1F, 0.5F, 3.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 32).addBox(0.2F, 0.5F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 18).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -0.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0759F, 5.7934F, 0.0728F, -0.1451F, 0.1629F));

		PartDefinition cube_r125 = body4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(15, 20).addBox(0.0F, -3.3575F, -0.0873F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 2.9F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(70, 60).addBox(0.0F, -3.5F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.8F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(60, 2).mirror().addBox(-3.5F, 0.375F, -2.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 0).mirror().addBox(-3.5F, 0.375F, -4.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 2).addBox(0.5F, 0.375F, -2.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 0).addBox(0.5F, 0.375F, -4.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 10).addBox(-0.5F, -0.125F, -5.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 5.1F, 0.0611F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.125F, -0.15F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(60, 4).addBox(0.3F, 0.375F, -0.15F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 6).addBox(0.0F, 0.375F, 1.85F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 8).addBox(-0.2F, 0.375F, 3.85F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 4).mirror().addBox(-3.3F, 0.375F, -0.15F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 6).mirror().addBox(-3.0F, 0.375F, 1.85F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 8).mirror().addBox(-2.8F, 0.375F, 3.85F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 68).addBox(0.0F, -3.0F, 3.85F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 68).addBox(0.0F, 0.4F, 4.95F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.105F, 4.9524F, 0.1072F, -0.1302F, -0.014F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(33, 76).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(30, 76).addBox(0.0F, -3.1F, -0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(41, 34).mirror().addBox(-0.3F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.875F, 3.85F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r131 = body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(41, 34).addBox(-0.7F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.875F, 3.85F, 0.0F, 0.1309F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2607F, 5.9321F, 0.0441F, 0.0058F, -0.1308F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(66, 80).addBox(0.0F, -1.1F, -1.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1702F, 5.0716F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(73, 76).addBox(0.0F, -2.7048F, -1.043F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3153F, 2.9582F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(73, 68).addBox(0.0F, 1.0004F, 3.5072F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 68).addBox(0.0F, 0.8004F, 1.8072F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 68).addBox(0.0F, 0.7004F, -0.1928F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 68).addBox(0.0F, -2.6996F, -0.9928F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1743F, 0.9635F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(8, 72).mirror().addBox(-2.0F, 1.2738F, 12.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 50).mirror().addBox(-2.3F, 1.2738F, 10.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 48).mirror().addBox(-2.5F, 1.2738F, 8.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 72).addBox(0.0F, 1.2738F, 12.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 50).addBox(0.3F, 1.2738F, 10.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 48).addBox(0.5F, 1.2738F, 8.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 34).addBox(-0.5F, 0.7738F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9537F, -8.4029F, -0.2094F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9579F, 4.9196F, 0.1877F, -0.0857F, -0.0163F));

		PartDefinition cube_r136 = hips.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(60, 80).addBox(0.0F, -0.2986F, -1.0611F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4831F, 5.8155F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r137 = hips.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(57, 80).addBox(0.0F, -0.3986F, -1.0111F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6221F, 4.0103F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r138 = hips.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(54, 80).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7641F, 3.6532F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r139 = hips.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(54, 80).addBox(0.0F, -0.2F, 1.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 80).addBox(0.0F, -1.0F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5064F, 0.751F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r140 = hips.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(54, 80).addBox(0.0F, -0.8986F, 0.9389F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.4F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r141 = hips.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(72, 11).mirror().addBox(-1.6F, 0.3835F, 2.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 14).mirror().addBox(-1.4F, 0.3835F, 4.9993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 9).mirror().addBox(-1.8F, 0.3835F, 0.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 11).addBox(-0.4F, 0.3835F, 2.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 14).addBox(0.4F, 0.3835F, 4.9993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 9).addBox(-0.2F, 0.3835F, 0.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 26).addBox(-0.5F, -0.1165F, -0.0007F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.175F, -0.025F, -0.4843F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(63, 80).addBox(0.0F, -1.8122F, 0.849F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 81).addBox(0.0F, -1.6122F, 2.849F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9536F, 5.1845F, -0.7704F, 0.0F, 0.0F));

		PartDefinition cube_r142 = tail.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(63, 80).addBox(0.0F, -0.6F, 1.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 80).addBox(0.0F, -0.8F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 80).addBox(0.0F, -1.0F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2878F, 0.449F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(80, 36).mirror().addBox(-1.1F, -0.475F, 2.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 25).mirror().addBox(-1.3F, -0.475F, 0.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 36).addBox(0.1F, -0.475F, 2.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 25).addBox(0.3F, -0.475F, 0.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 17).addBox(-0.5F, -0.975F, -0.025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5128F, -0.026F, 0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(75, 81).addBox(0.0F, -1.1976F, -0.0214F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 82).addBox(0.0F, -0.9976F, 1.9786F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2646F, 4.8704F, -0.4006F, 0.0F, 0.0F));

		PartDefinition cube_r144 = tail2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(21, 81).mirror().addBox(-0.8F, -0.5F, 2.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 81).mirror().addBox(-1.0F, -0.5F, 0.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 81).addBox(-0.2F, -0.5F, 2.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 81).addBox(0.0F, -0.5F, 0.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 41).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.4973F, -0.0046F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(75, 81).addBox(0.0F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 81).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4024F, 0.4786F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1356F, 3.8954F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.55F, 0.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.025F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.021F, 6.093F, 1.8558F, 0.1459F, -0.2498F, -1.1584F));

		PartDefinition cube_r147 = leftarm.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(41, 80).addBox(-0.5F, -0.15F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0114F, 0.2411F, -0.0562F, -0.2444F, 0.0014F, -0.001F));

		PartDefinition cube_r148 = leftarm.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(36, 80).addBox(0.0F, 0.0F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5118F, -0.2961F, -0.0244F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r149 = leftarm.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(53, 69).addBox(-0.011F, -0.5746F, 0.0689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5013F, 1.0619F, -1.2637F, 0.2268F, 0.0014F, -0.001F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1618F, 2.366F, -0.1934F, -0.0568F, -0.0075F, -0.1307F));

		PartDefinition cube_r150 = leftarm2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(66, 40).addBox(-0.5853F, -0.5612F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, 0.2807F, 0.4967F, 1.5708F, -1.2915F, -1.5708F));

		PartDefinition cube_r151 = leftarm2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(75, 55).addBox(-0.7595F, -0.8639F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.1764F, 0.2807F, 0.4967F, -1.5708F, -1.0385F, 1.5708F));

		PartDefinition cube_r152 = leftarm2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(7, 66).addBox(-0.3335F, -0.5622F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3236F, 0.4954F, -0.4664F, 1.5708F, -1.4486F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 2.7198F, 0.2813F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r153 = leftArm3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(47, 10).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.021F, 6.093F, 1.8558F, 0.1132F, 0.29F, 1.2F));

		PartDefinition cube_r154 = rightarm.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(80, 50).addBox(-0.5F, -0.15F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0114F, 0.2411F, -0.0562F, -0.2444F, -0.0014F, 0.001F));

		PartDefinition cube_r155 = rightarm.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(46, 80).addBox(-1.0F, 0.0F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5118F, -0.2961F, -0.0244F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r156 = rightarm.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(70, 14).addBox(-0.989F, -0.5746F, 0.0689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5013F, 1.0619F, -1.2637F, 0.2268F, -0.0014F, 0.001F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1618F, 2.366F, -0.1934F, -0.0543F, 0.0096F, 0.1743F));

		PartDefinition cube_r157 = rightarm2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(43, 69).addBox(-0.4147F, -0.5612F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1764F, 0.2807F, 0.4967F, 1.5708F, 1.2915F, 1.5708F));

		PartDefinition cube_r158 = rightarm2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(80, 22).addBox(-0.2405F, -0.8639F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.1764F, 0.2807F, 0.4967F, -1.5708F, 1.0385F, -1.5708F));

		PartDefinition cube_r159 = rightarm2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(38, 69).addBox(-0.6665F, -0.5622F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3236F, 0.4954F, -0.4664F, 1.5708F, 1.4486F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 2.7198F, 0.2813F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r160 = rightArm3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(22, 48).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, -3.1416F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7802F, -2.5012F, 0.5044F, 0.0F, 0.0F));

		PartDefinition cube_r161 = neck2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.9581F, -3.1889F, -1.1039F, -0.3035F, -0.7363F));

		PartDefinition cube_r162 = neck2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(76, 76).mirror().addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.9581F, -3.1889F, -0.3431F, -0.2751F, -0.6502F));

		PartDefinition cube_r163 = neck2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(56, 20).mirror().addBox(-2.5443F, 0.2444F, -0.1797F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2847F, -0.5339F, -0.7042F, 0.0254F, -0.8213F));

		PartDefinition cube_r164 = neck2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(26, 81).mirror().addBox(-3.5208F, -0.4225F, -0.1797F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2847F, -0.5339F, -0.6923F, -0.1434F, -1.0219F));

		PartDefinition cube_r165 = neck2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9581F, -3.1889F, -1.1039F, 0.3035F, 0.7363F));

		PartDefinition cube_r166 = neck2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(76, 76).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9581F, -3.1889F, -0.3431F, 0.2751F, 0.6502F));

		PartDefinition cube_r167 = neck2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(31, 81).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9581F, -3.1889F, 0.0F, 0.4363F, 1.5708F));

		PartDefinition cube_r168 = neck2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(56, 20).addBox(-0.4557F, 0.2444F, -0.1797F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2847F, -0.5339F, -0.7042F, -0.0254F, 0.8213F));

		PartDefinition cube_r169 = neck2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(26, 81).addBox(2.5208F, -0.4225F, -0.1797F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2847F, -0.5339F, -0.6923F, 0.1434F, 1.0219F));

		PartDefinition cube_r170 = neck2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(76, 5).addBox(-0.5F, 0.45F, 4.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.2131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.168F, -1.0106F, 0.0841F, 0.0F, 0.0F));

		PartDefinition cube_r171 = neck.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(21, 56).addBox(-0.5F, -0.4F, 2.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5695F, -4.6993F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r172 = neck.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(81, 3).addBox(0.0F, -1.7787F, -0.0342F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0521F, -0.8101F, -0.6545F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2187F, -1.5816F, -0.7195F, 0.0F, 0.0F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(79, 67).addBox(-0.9F, -0.9685F, 0.0305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 3.8577F, -2.5881F, 0.6152F, 0.0F, 0.0F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(79, 30).addBox(-0.9F, -0.9685F, -0.3695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.4F, 3.8865F, -3.1874F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(29, 54).addBox(-0.9F, -0.0685F, -0.7695F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, 2.8886F, -4.9493F, 0.7025F, 0.0F, 0.0F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(26, 41).addBox(-0.9F, -0.0175F, 0.0029F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 2.1632F, -4.5188F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(50, 65).mirror().addBox(-0.35F, -0.3425F, -1.2971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 65).mirror().addBox(-0.35F, -0.3425F, -0.8971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 65).addBox(0.15F, -0.3425F, -1.2971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(50, 65).addBox(0.15F, -0.3425F, -0.8971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(17, 71).addBox(-0.1F, -0.0175F, -0.9971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 2.1632F, -4.5188F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(9, 51).addBox(-1.4F, -0.0971F, -0.1873F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.4F, 4.7725F, -6.1643F, 0.6327F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(68, 36).addBox(-1.0F, -0.575F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6425F, -2.4995F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(17, 68).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.6721F, -2.0638F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(14, 59).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.1057F, -1.2397F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(69, 3).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.8794F, -0.1176F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(69, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9492F, -1.1152F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(37, 47).addBox(-1.5F, -0.6F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.6361F, -0.8662F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(38, 6).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.1998F, -0.079F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(13, 41).addBox(-1.5F, -1.0F, -2.6F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.8443F, 0.1852F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(69, 6).addBox(-1.0F, -1.025F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(66, 45).addBox(-1.0F, -1.025F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.5282F, -2.8252F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(72, 20).addBox(-0.5F, -0.0575F, -1.0172F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0472F, -3.434F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(70, 24).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.8851F, -3.1544F, 1.3003F, 0.0F, 0.0F));

		PartDefinition leftTusk = head.addOrReplaceChild("leftTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9782F, 6.1829F, -1.5228F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r190 = leftTusk.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(35, 61).addBox(-0.57F, -0.3112F, -1.3813F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.9815F, 0.1839F, -0.1247F));

		PartDefinition cube_r191 = leftTusk.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(66, 77).addBox(-0.5769F, -0.7227F, -1.3736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(61, 77).addBox(-0.57F, -0.7266F, -1.6746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.9526F, 0.1839F, -0.1247F));

		PartDefinition cube_r192 = leftTusk.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(56, 26).addBox(-0.566F, -0.5761F, -0.9184F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1124F, 0.1839F, -0.1247F));

		PartDefinition rightTusk = head.addOrReplaceChild("rightTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7481F, 6.189F, -1.7006F, -0.0661F, -0.334F, 0.2379F));

		PartDefinition cube_r193 = rightTusk.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(45, 26).addBox(-0.6065F, -0.1489F, -3.2993F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 2.9815F, -0.1839F, 0.1247F));

		PartDefinition cube_r194 = rightTusk.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(13, 78).addBox(-0.6065F, -14.7865F, -14.7837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.275F, 0.2F, 1.7F, -2.4465F, -0.1839F, 0.1247F));

		PartDefinition cube_r195 = rightTusk.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(61, 36).addBox(-0.5F, -0.4F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.225F)), PartPose.offsetAndRotation(-3.5536F, 1.4805F, 17.731F, 3.0513F, -0.1839F, 0.1247F));

		PartDefinition cube_r196 = rightTusk.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 36).addBox(-0.6105F, -1.5578F, -20.3783F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.275F, 0.2F, 1.7F, 3.1036F, -0.1839F, 0.1247F));

		PartDefinition cube_r197 = rightTusk.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(42, 61).addBox(-0.5F, -0.2F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-3.3826F, 1.7835F, 16.5492F, 3.1342F, -0.1839F, 0.1247F));

		PartDefinition cube_r198 = rightTusk.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(30, 26).addBox(-0.6105F, -0.8892F, -16.8785F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 3.0513F, -0.1839F, 0.1247F));

		PartDefinition cube_r199 = rightTusk.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 10).addBox(-0.6065F, -0.7895F, -7.7591F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.993F, 0.4955F, 10.6016F, 3.0338F, -0.1839F, 0.1247F));

		PartDefinition cube_r200 = rightTusk.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(28, 34).addBox(-0.6105F, -0.6944F, -11.3364F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 3.0338F, -0.1839F, 0.1247F));

		PartDefinition cube_r201 = rightTusk.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6065F, -0.7806F, -7.8261F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.5133F, -0.2252F, 3.1889F, 3.0207F, -0.1839F, 0.1247F));

		PartDefinition cube_r202 = rightTusk.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(19, 0).addBox(-0.6105F, -0.6021F, -6.833F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 3.0207F, -0.1839F, 0.1247F));

		PartDefinition bone = rightTusk.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-3.5536F, 1.4805F, 17.731F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(2.2F, 1.8933F, -2.7002F));

		PartDefinition cube_r203 = leftOrbit.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(42, 65).addBox(-0.6481F, -1.1467F, -4.7501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, 3.0246F, 0.4499F, -0.3147F));

		PartDefinition cube_r204 = leftOrbit.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(35, 65).addBox(-0.6481F, -1.8174F, -4.7712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, 2.9897F, 0.4499F, -0.3147F));

		PartDefinition cube_r205 = leftOrbit.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(65, 28).addBox(-0.6481F, -0.6797F, -4.9899F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, 2.7628F, 0.4499F, -0.3147F));

		PartDefinition cube_r206 = leftOrbit.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(28, 65).addBox(-0.6481F, -2.0209F, -4.5479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, -3.0404F, 0.4499F, -0.3147F));

		PartDefinition cube_r207 = leftOrbit.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(79, 8).addBox(-0.6481F, 2.3611F, -4.0706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, 2.1956F, 0.4499F, -0.3147F));

		PartDefinition cube_r208 = leftOrbit.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(79, 0).addBox(-0.6481F, 0.9569F, -4.8065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, 2.501F, 0.4499F, -0.3147F));

		PartDefinition cube_r209 = leftOrbit.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(78, 73).addBox(-1.3148F, 0.9267F, -4.7379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, 2.4879F, 0.5186F, -0.3238F));

		PartDefinition cube_r210 = leftOrbit.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(65, 20).addBox(-1.3148F, -1.9969F, -4.4769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, -3.0536F, 0.5186F, -0.3238F));

		PartDefinition cube_r211 = leftOrbit.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(78, 64).addBox(-1.3148F, 2.3116F, -4.0143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, 2.1824F, 0.5186F, -0.3238F));

		PartDefinition cube_r212 = leftOrbit.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(65, 10).addBox(-1.3148F, -0.6912F, -4.9158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.192F))
				.texOffs(68, 73).addBox(-1.3148F, -1.1221F, -1.8461F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(7, 62).addBox(-1.3148F, -1.1221F, -3.4211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, 2.7497F, 0.5186F, -0.3238F));

		PartDefinition cube_r213 = leftOrbit.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(51, 0).addBox(-1.3148F, -0.2641F, -3.5761F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.194F))
				.texOffs(21, 64).addBox(-1.3148F, 0.2859F, -3.5761F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, 2.5926F, 0.5186F, -0.3238F));

		PartDefinition cube_r214 = leftOrbit.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(48, 50).addBox(-0.6481F, -0.2412F, -3.6475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.194F))
				.texOffs(0, 49).addBox(-0.6481F, 0.3088F, -3.6475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, 2.6057F, 0.4499F, -0.3147F));

		PartDefinition cube_r215 = leftOrbit.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(56, 65).addBox(-0.5F, -0.1F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-1.8233F, 2.8263F, -1.8471F, 1.2967F, 0.4499F, -0.3147F));

		PartDefinition cube_r216 = leftOrbit.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(7, 55).addBox(-1.2481F, 0.1904F, -1.0466F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, 1.8203F, 0.4499F, -0.3147F));

		PartDefinition cube_r217 = leftOrbit.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(63, 61).addBox(-1.3148F, -1.1386F, -4.6755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, 3.0115F, 0.5186F, -0.3238F));

		PartDefinition cube_r218 = leftOrbit.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(52, 55).addBox(-1.2481F, -0.6446F, -1.661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, -2.5168F, 0.4499F, -0.3147F));

		PartDefinition cube_r219 = leftOrbit.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(78, 61).addBox(-1.0659F, -1.3556F, -0.3537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.5874F, 1.7112F, -3.3216F, -2.9784F, 0.3824F, -0.3447F));

		PartDefinition cube_r220 = leftOrbit.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(63, 24).addBox(-0.8024F, 2.5261F, -0.9805F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2126F, 4.7112F, -1.1216F, -2.5168F, 0.4499F, -0.3147F));

		PartDefinition cube_r221 = leftOrbit.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(45, 55).addBox(-1.2481F, -1.225F, -1.6023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, -2.3859F, 0.4499F, -0.3147F));

		PartDefinition cube_r222 = leftOrbit.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(63, 16).addBox(-0.8024F, 2.0074F, -1.3415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.2126F, 4.7112F, -1.1216F, -2.3859F, 0.4499F, -0.3147F));

		PartDefinition cube_r223 = leftOrbit.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 66).addBox(-1.2481F, -1.6798F, -1.8631F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, -2.6477F, 0.4499F, -0.3147F));

		PartDefinition cube_r224 = leftOrbit.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(14, 63).addBox(-0.8024F, 1.3749F, -0.7746F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2126F, 4.7112F, -1.1216F, -2.6477F, 0.4499F, -0.3147F));

		PartDefinition cube_r225 = leftOrbit.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(63, 73).addBox(-0.8024F, 0.0191F, 1.1196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 62).addBox(-0.8024F, 0.0191F, -0.4554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.2126F, 4.7112F, -1.1216F, 2.7628F, 0.4499F, -0.3147F));

		PartDefinition cube_r226 = leftOrbit.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(56, 61).addBox(-1.3148F, -1.812F, -4.6964F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.5874F, 3.0112F, -3.2216F, 2.9765F, 0.5186F, -0.3238F));

		PartDefinition cube_r227 = leftOrbit.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(73, 62).addBox(-0.4959F, -1.6956F, 0.3802F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5047F, -0.798F, 1.4797F, 0.989F, 0.5044F, -1.0524F));

		PartDefinition cube_r228 = leftOrbit.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(73, 58).addBox(-0.4959F, -1.7963F, -0.2085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.5047F, -0.798F, 1.4797F, 0.8145F, 0.5044F, -1.0524F));

		PartDefinition cube_r229 = leftOrbit.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(58, 73).addBox(-0.66F, -1.2308F, 1.0681F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1047F, -0.098F, -0.3203F, 0.2909F, 0.5044F, -1.0524F));

		PartDefinition cube_r230 = leftOrbit.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(22, 72).addBox(-0.66F, -1.6824F, 0.5849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1047F, -0.098F, -0.3203F, -0.0582F, 0.5044F, -1.0524F));

		PartDefinition cube_r231 = leftOrbit.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(53, 73).addBox(-0.3118F, -1.7818F, -0.849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(32, 72).addBox(-0.3118F, -1.7818F, -1.249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.3047F, -0.098F, 0.5797F, -0.4097F, 0.4679F, -1.0962F));

		PartDefinition cube_r232 = leftOrbit.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(48, 73).addBox(-0.3725F, -1.5512F, -0.7728F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3871F, -0.0883F, -0.1836F, -0.6153F, 0.5792F, -1.2284F));

		PartDefinition cube_r233 = leftOrbit.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(63, 65).addBox(-0.7231F, 0.4772F, -0.7488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5874F, 1.7112F, -3.3216F, 0.8582F, 0.1853F, 0.1879F));

		PartDefinition cube_r234 = leftOrbit.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(49, 61).addBox(-0.8F, -0.675F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3557F, 1.0167F, -1.346F, 1.0561F, -0.2549F, 0.1386F));

		PartDefinition cube_r235 = leftOrbit.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(36, 53).addBox(-1.5452F, -0.7368F, -2.2255F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.3871F, -0.0883F, -0.1836F, 0.9158F, 0.5178F, 0.7521F));

		PartDefinition cube_r236 = leftOrbit.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(78, 58).addBox(-0.9F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.296F, 1.6207F, -1.806F, 0.9136F, -0.1832F, 0.2569F));

		PartDefinition cube_r237 = leftOrbit.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(78, 47).addBox(0.0208F, -0.5176F, -0.0982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2118F, 1.7766F, -1.9664F, 0.9057F, -0.4407F, 0.3938F));

		PartDefinition cube_r238 = leftOrbit.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(79, 70).addBox(-0.5F, -0.6798F, 0.076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 0.6902F, 0.303F, 0.2225F, 0.3491F, 0.0F));

		PartDefinition cube_r239 = leftOrbit.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(79, 76).addBox(-0.5F, -0.5872F, 1.044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 0.6902F, 0.303F, 0.3098F, 0.3491F, 0.0F));

		PartDefinition cube_r240 = leftOrbit.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(79, 79).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 80).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.8722F, 3.5858F, 0.841F, 0.117F, 0.1298F));

		PartDefinition cube_r241 = leftOrbit.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(31, 69).addBox(-1.275F, -0.525F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4592F, 2.1172F, -2.2917F, 0.9021F, 0.263F, 0.6257F));

		PartDefinition cube_r242 = leftOrbit.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(21, 60).addBox(0.0F, 0.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4067F, -2.47F, 0.2232F, 0.6837F, -1.15F, 0.8975F));

		PartDefinition cube_r243 = leftOrbit.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(28, 61).addBox(-0.6F, -0.5F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.8348F, -1.2479F, 0.7915F, 0.5017F, -1.0045F, 1.1034F));

		PartDefinition cube_r244 = leftOrbit.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(68, 53).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4067F, -2.47F, 0.2232F, 0.1751F, -0.9102F, 1.2939F));

		PartDefinition cube_r245 = leftOrbit.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(56, 77).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(78, 38).addBox(0.0F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2F, -3.5654F, 0.6364F, 0.5549F, -0.3842F, 0.5438F));

		PartDefinition cube_r246 = leftOrbit.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(52, 36).addBox(-0.8F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7611F, -1.8111F, 0.0452F, 1.248F, -0.3981F, 0.2674F));

		PartDefinition cube_r247 = leftOrbit.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(14, 55).addBox(-0.9126F, 0.4035F, -0.6034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5874F, 1.7112F, -3.3216F, 0.24F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftOrbit.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(78, 44).addBox(-0.9126F, -0.0666F, -0.9062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.5874F, 1.7112F, -3.3216F, 1.0254F, 0.0F, 0.0F));

		PartDefinition cube_r249 = leftOrbit.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(48, 69).addBox(-0.9126F, -0.0479F, -0.2817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-1.5874F, 1.7112F, -3.3216F, 0.8508F, 0.0F, 0.0F));

		PartDefinition cube_r250 = leftOrbit.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(24, 69).addBox(-1.4939F, -0.4365F, -0.0982F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2118F, 1.7766F, -1.9664F, 0.9657F, -0.194F, 0.2035F));

		PartDefinition cube_r251 = leftOrbit.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(72, 28).addBox(-0.4F, -1.0F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.9548F, -1.9507F, 0.2669F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r252 = leftOrbit.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(27, 72).addBox(-0.55F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, -1.1094F, 0.0493F, 1.3214F, -0.0435F, -0.1691F));

		PartDefinition cube_r253 = leftOrbit.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(78, 41).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3458F, 1.6123F, -1.8569F, 1.3994F, -0.5685F, -0.7068F));

		PartDefinition cube_r254 = leftOrbit.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(78, 41).addBox(-1.1F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 41).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8459F, 1.4536F, -1.4759F, 0.8173F, -0.1797F, 0.5633F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-2.2F, 1.8933F, -2.7002F));

		PartDefinition cube_r255 = rightOrbit.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(42, 65).mirror().addBox(-0.3519F, -1.1467F, -4.7501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, 3.0246F, -0.4499F, 0.3147F));

		PartDefinition cube_r256 = rightOrbit.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(35, 65).mirror().addBox(-0.3519F, -1.8174F, -4.7712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, 2.9897F, -0.4499F, 0.3147F));

		PartDefinition cube_r257 = rightOrbit.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(65, 28).mirror().addBox(-0.3519F, -0.6797F, -4.9899F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, 2.7628F, -0.4499F, 0.3147F));

		PartDefinition cube_r258 = rightOrbit.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(28, 65).mirror().addBox(-0.3519F, -2.0209F, -4.5479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, -3.0404F, -0.4499F, 0.3147F));

		PartDefinition cube_r259 = rightOrbit.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(79, 8).mirror().addBox(-0.3519F, 2.3611F, -4.0706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, 2.1956F, -0.4499F, 0.3147F));

		PartDefinition cube_r260 = rightOrbit.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-0.3519F, 0.9569F, -4.8065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, 2.501F, -0.4499F, 0.3147F));

		PartDefinition cube_r261 = rightOrbit.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(78, 73).mirror().addBox(0.3148F, 0.9267F, -4.7379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, 2.4879F, -0.5186F, 0.3238F));

		PartDefinition cube_r262 = rightOrbit.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(65, 20).mirror().addBox(0.3148F, -1.9969F, -4.4769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, -3.0536F, -0.5186F, 0.3238F));

		PartDefinition cube_r263 = rightOrbit.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(78, 64).mirror().addBox(0.3148F, 2.3116F, -4.0143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, 2.1824F, -0.5186F, 0.3238F));

		PartDefinition cube_r264 = rightOrbit.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(65, 10).mirror().addBox(0.3148F, -0.6912F, -4.9158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.192F)).mirror(false)
				.texOffs(68, 73).mirror().addBox(0.3148F, -1.1221F, -1.8461F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(7, 62).mirror().addBox(0.3148F, -1.1221F, -3.4211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, 2.7497F, -0.5186F, 0.3238F));

		PartDefinition cube_r265 = rightOrbit.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(0.3148F, -0.2641F, -3.5761F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.194F)).mirror(false)
				.texOffs(21, 64).mirror().addBox(0.3148F, 0.2859F, -3.5761F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, 2.5926F, -0.5186F, 0.3238F));

		PartDefinition cube_r266 = rightOrbit.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(48, 50).mirror().addBox(-0.3519F, -0.2412F, -3.6475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.194F)).mirror(false)
				.texOffs(0, 49).mirror().addBox(-0.3519F, 0.3088F, -3.6475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, 2.6057F, -0.4499F, 0.3147F));

		PartDefinition cube_r267 = rightOrbit.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(56, 65).mirror().addBox(-0.5F, -0.1F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(1.8233F, 2.8263F, -1.8471F, 1.2967F, -0.4499F, 0.3147F));

		PartDefinition cube_r268 = rightOrbit.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(7, 55).mirror().addBox(0.2481F, 0.1904F, -1.0466F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, 1.8203F, -0.4499F, 0.3147F));

		PartDefinition cube_r269 = rightOrbit.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(63, 61).mirror().addBox(0.3148F, -1.1386F, -4.6755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, 3.0115F, -0.5186F, 0.3238F));

		PartDefinition cube_r270 = rightOrbit.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(52, 55).mirror().addBox(0.2481F, -0.6446F, -1.661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, -2.5168F, -0.4499F, 0.3147F));

		PartDefinition cube_r271 = rightOrbit.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(78, 61).mirror().addBox(0.0659F, -1.3556F, -0.3537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 1.7112F, -3.3216F, -2.9784F, -0.3824F, 0.3447F));

		PartDefinition cube_r272 = rightOrbit.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(63, 24).mirror().addBox(-0.1976F, 2.5261F, -0.9805F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.2126F, 4.7112F, -1.1216F, -2.5168F, -0.4499F, 0.3147F));

		PartDefinition cube_r273 = rightOrbit.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(45, 55).mirror().addBox(0.2481F, -1.225F, -1.6023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, -2.3859F, -0.4499F, 0.3147F));

		PartDefinition cube_r274 = rightOrbit.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(63, 16).mirror().addBox(-0.1976F, 2.0074F, -1.3415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.2126F, 4.7112F, -1.1216F, -2.3859F, -0.4499F, 0.3147F));

		PartDefinition cube_r275 = rightOrbit.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(0.2481F, -1.6798F, -1.8631F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, -2.6477F, -0.4499F, 0.3147F));

		PartDefinition cube_r276 = rightOrbit.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(14, 63).mirror().addBox(-0.1976F, 1.3749F, -0.7746F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.2126F, 4.7112F, -1.1216F, -2.6477F, -0.4499F, 0.3147F));

		PartDefinition cube_r277 = rightOrbit.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(63, 73).mirror().addBox(-0.1976F, 0.0191F, 1.1196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 62).mirror().addBox(-0.1976F, 0.0191F, -0.4554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.2126F, 4.7112F, -1.1216F, 2.7628F, -0.4499F, 0.3147F));

		PartDefinition cube_r278 = rightOrbit.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(56, 61).mirror().addBox(0.3148F, -1.812F, -4.6964F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 3.0112F, -3.2216F, 2.9765F, -0.5186F, 0.3238F));

		PartDefinition cube_r279 = rightOrbit.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(73, 62).mirror().addBox(-0.5041F, -1.6956F, 0.3802F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5047F, -0.798F, 1.4797F, 0.989F, -0.5044F, 1.0524F));

		PartDefinition cube_r280 = rightOrbit.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(73, 58).mirror().addBox(-0.5041F, -1.7963F, -0.2085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.5047F, -0.798F, 1.4797F, 0.8145F, -0.5044F, 1.0524F));

		PartDefinition cube_r281 = rightOrbit.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(58, 73).mirror().addBox(-0.34F, -1.2308F, 1.0681F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1047F, -0.098F, -0.3203F, 0.2909F, -0.5044F, 1.0524F));

		PartDefinition cube_r282 = rightOrbit.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(22, 72).mirror().addBox(-0.34F, -1.6824F, 0.5849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1047F, -0.098F, -0.3203F, -0.0582F, -0.5044F, 1.0524F));

		PartDefinition cube_r283 = rightOrbit.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(53, 73).mirror().addBox(-0.6882F, -1.7818F, -0.849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(32, 72).mirror().addBox(-0.6882F, -1.7818F, -1.249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.3047F, -0.098F, 0.5797F, -0.4097F, -0.4679F, 1.0962F));

		PartDefinition cube_r284 = rightOrbit.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(48, 73).mirror().addBox(-0.6275F, -1.5512F, -0.7728F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3871F, -0.0883F, -0.1836F, -0.6153F, -0.5792F, 1.2284F));

		PartDefinition cube_r285 = rightOrbit.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(63, 65).mirror().addBox(-0.2769F, 0.4772F, -0.7488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 1.7112F, -3.3216F, 0.8582F, -0.1853F, -0.1879F));

		PartDefinition cube_r286 = rightOrbit.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(49, 61).mirror().addBox(-0.2F, -0.675F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3557F, 1.0167F, -1.346F, 1.0561F, 0.2549F, -0.1386F));

		PartDefinition cube_r287 = rightOrbit.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(36, 53).mirror().addBox(-0.4548F, -0.7368F, -2.2255F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.3871F, -0.0883F, -0.1836F, 0.9158F, -0.5178F, -0.7521F));

		PartDefinition cube_r288 = rightOrbit.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(78, 58).mirror().addBox(-0.1F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.296F, 1.6207F, -1.806F, 0.9136F, 0.1832F, -0.2569F));

		PartDefinition cube_r289 = rightOrbit.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-1.0208F, -0.5176F, -0.0982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2118F, 1.7766F, -1.9664F, 0.9057F, 0.4407F, -0.3938F));

		PartDefinition cube_r290 = rightOrbit.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(79, 70).mirror().addBox(-0.5F, -0.6798F, 0.076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, 0.6902F, 0.303F, 0.2225F, -0.3491F, 0.0F));

		PartDefinition cube_r291 = rightOrbit.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(79, 76).mirror().addBox(-0.5F, -0.5872F, 1.044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, 0.6902F, 0.303F, 0.3098F, -0.3491F, 0.0F));

		PartDefinition cube_r292 = rightOrbit.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(79, 79).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(3, 80).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, -0.8722F, 3.5858F, 0.841F, -0.117F, -0.1298F));

		PartDefinition cube_r293 = rightOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(31, 69).mirror().addBox(-0.725F, -0.525F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4592F, 2.1172F, -2.2917F, 0.9021F, -0.263F, -0.6257F));

		PartDefinition cube_r294 = rightOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(21, 60).mirror().addBox(-1.0F, 0.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4067F, -2.47F, 0.2232F, 0.6837F, 1.15F, -0.8975F));

		PartDefinition cube_r295 = rightOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(28, 61).mirror().addBox(-0.4F, -0.5F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.8348F, -1.2479F, 0.7915F, 0.5017F, 1.0045F, -1.1034F));

		PartDefinition cube_r296 = rightOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(68, 53).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4067F, -2.47F, 0.2232F, 0.1751F, 0.9102F, -1.2939F));

		PartDefinition cube_r297 = rightOrbit.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(56, 77).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(78, 38).mirror().addBox(-1.0F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.2F, -3.5654F, 0.6364F, 0.5549F, 0.3842F, -0.5438F));

		PartDefinition cube_r298 = rightOrbit.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(52, 36).mirror().addBox(-1.2F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.7611F, -1.8111F, 0.0452F, 1.248F, 0.3981F, -0.2674F));

		PartDefinition cube_r299 = rightOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(14, 55).mirror().addBox(-0.0874F, 0.4035F, -0.6034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 1.7112F, -3.3216F, 0.24F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(78, 44).mirror().addBox(-0.0874F, -0.0666F, -0.9062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 1.7112F, -3.3216F, 1.0254F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(48, 69).mirror().addBox(-0.0874F, -0.0479F, -0.2817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.5874F, 1.7112F, -3.3216F, 0.8508F, 0.0F, 0.0F));

		PartDefinition cube_r302 = rightOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(24, 69).mirror().addBox(-0.506F, -0.4365F, -0.0982F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2118F, 1.7766F, -1.9664F, 0.9657F, 0.194F, -0.2035F));

		PartDefinition cube_r303 = rightOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(72, 28).mirror().addBox(-0.6F, -1.0F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.9548F, -1.9507F, 0.2669F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(27, 72).mirror().addBox(-0.45F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, -1.1094F, 0.0493F, 1.3214F, 0.0435F, 0.1691F));

		PartDefinition cube_r305 = rightOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(78, 41).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3458F, 1.6123F, -1.8569F, 1.3994F, 0.5685F, 0.7068F));

		PartDefinition cube_r306 = rightOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(78, 41).mirror().addBox(0.1F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 41).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8459F, 1.4536F, -1.4759F, 0.8173F, 0.1797F, -0.5633F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.4149F, -1.0527F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(73, 45).mirror().addBox(-0.7F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(80, 11).mirror().addBox(-0.7F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.8433F, 0.1105F, -3.4356F, -0.3748F, -0.2566F, -0.1427F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(51, 77).mirror().addBox(-0.9584F, 3.0254F, -0.5067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5187F, 0.5904F, -1.5931F, -0.4985F, -0.0346F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(80, 33).mirror().addBox(-0.5F, -0.075F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.059F)).mirror(false)
				.texOffs(46, 77).mirror().addBox(-0.5F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-1.5551F, 0.1361F, -2.0555F, -1.2258F, -0.5043F, -0.0411F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(41, 77).mirror().addBox(-0.9547F, 2.1939F, 0.0593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5187F, 0.5904F, -1.7999F, -0.5087F, -0.027F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(36, 77).mirror().addBox(-0.219F, 1.6562F, -1.0153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5187F, 0.5904F, -1.5533F, -0.2269F, 0.0F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(8, 80).mirror().addBox(-0.219F, 1.3338F, 0.2783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5187F, 0.5904F, -1.9111F, -0.2269F, 0.0F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(77, 27).mirror().addBox(0.0F, 0.7156F, -0.3332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5187F, 0.5904F, -1.5184F, -0.0698F, 0.0F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(77, 19).mirror().addBox(0.0F, -0.0541F, -0.893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5187F, 0.5904F, -0.8814F, -0.0698F, 0.0F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(77, 16).mirror().addBox(-0.1F, -0.8164F, -0.6968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5187F, 0.5904F, 0.4974F, -0.0698F, 0.0F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(8, 77).mirror().addBox(-0.1F, -0.7193F, -1.2959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5187F, 0.5904F, -0.2356F, -0.0698F, 0.0F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(3, 77).mirror().addBox(-0.1F, -0.83F, -1.9808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1094F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5187F, 0.5904F, -0.1309F, -0.0698F, 0.0F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(73, 45).addBox(-0.3F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(80, 11).addBox(-0.3F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.3567F, 0.1105F, -3.4356F, -0.3748F, 0.2566F, 0.1427F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(51, 77).addBox(-0.0416F, 3.0254F, -0.5067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3F, 0.5187F, 0.5904F, -1.5931F, 0.4985F, 0.0346F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(80, 33).addBox(-0.5F, -0.075F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.059F))
				.texOffs(46, 77).addBox(-0.5F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.3551F, 0.1361F, -2.0555F, -1.2258F, 0.5043F, 0.0411F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(41, 77).addBox(-0.0453F, 2.1939F, 0.0593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(1.3F, 0.5187F, 0.5904F, -1.7999F, 0.5087F, 0.027F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(36, 77).addBox(-0.781F, 1.6562F, -1.0153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3F, 0.5187F, 0.5904F, -1.5533F, 0.2269F, 0.0F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(8, 80).addBox(-0.781F, 1.3338F, 0.2783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.5187F, 0.5904F, -1.9111F, 0.2269F, 0.0F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(77, 27).addBox(-1.0F, 0.7156F, -0.3332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.5187F, 0.5904F, -1.5184F, 0.0698F, 0.0F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(77, 19).addBox(-1.0F, -0.0541F, -0.893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3F, 0.5187F, 0.5904F, -0.8814F, 0.0698F, 0.0F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(77, 16).addBox(-0.9F, -0.8164F, -0.6968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3F, 0.5187F, 0.5904F, 0.4974F, 0.0698F, 0.0F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(8, 77).addBox(-0.9F, -0.7193F, -1.2959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3F, 0.5187F, 0.5904F, -0.2356F, 0.0698F, 0.0F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(3, 77).addBox(-0.9F, -0.83F, -1.9808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1094F)), PartPose.offsetAndRotation(1.3F, 0.5187F, 0.5904F, -0.1309F, 0.0698F, 0.0F));

		return LayerDefinition.create(meshdefinition, 85, 85);
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