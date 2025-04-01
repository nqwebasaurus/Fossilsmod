package fossils.fossils.client.blockentity.model.tethyshadros;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TethyshadrosFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart tail;
	private final ModelPart tail6;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart bone;
	private final ModelPart jaw;

	public TethyshadrosFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.tail = this.hips.getChild("tail");
		this.tail6 = this.tail.getChild("tail6");
		this.tail2 = this.tail6.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.bone = this.head.getChild("bone");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 29.0F, -5.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 58).addBox(0.5F, -0.6164F, 1.0611F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 58).mirror().addBox(-1.5F, -0.6164F, 1.0611F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -23.582F, 6.6326F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 36).addBox(0.0F, 0.0056F, -0.0255F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1846F, -1.2086F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 22).addBox(-0.003F, -0.0735F, -3.3174F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0846F, -0.9086F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(45, 58).mirror().addBox(-0.6258F, -0.6551F, -1.9919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.4396F, -0.5716F, 2.9161F, -0.809F, -0.1147F, 0.1076F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 5).mirror().addBox(-1.7128F, -0.3011F, -2.1211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0632F, -1.4739F, -4.6989F, 0.4456F, 0.1744F, 0.0062F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(38, 58).mirror().addBox(-0.764F, -0.5524F, -1.6499F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6889F, 1.0724F, -3.8267F, 0.4773F, 0.2079F, -0.0259F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(76, 6).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.5524F, 1.8654F, -6.7484F, 0.453F, 0.2093F, -0.0074F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(45, 54).mirror().addBox(-0.5F, -0.5038F, -0.4022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4313F, 1.7522F, -6.1741F, 0.1825F, 0.2093F, -0.0074F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(14, 44).mirror().addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3664F, 1.947F, -5.9029F, 0.5209F, 0.2079F, -0.0259F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(71, 60).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.6149F, 2.9741F, -7.2066F, 0.5384F, 0.2079F, -0.0259F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(71, 57).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.7021F, 2.4482F, -7.5555F, 0.7129F, 0.2079F, -0.0259F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(45, 15).mirror().addBox(-0.7964F, -1.0686F, 1.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6889F, 1.6724F, -3.6267F, -0.408F, 0.2251F, 0.0349F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 45).mirror().addBox(-0.7964F, -0.543F, -0.4889F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.6889F, 1.6724F, -3.6267F, -0.1811F, 0.2251F, 0.0349F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(52, 58).mirror().addBox(-0.764F, -0.0614F, -0.6309F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6889F, 0.7724F, -3.8267F, 0.0933F, 0.2079F, -0.0259F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(62, 31).mirror().addBox(-1.4303F, 0.6408F, -1.9642F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0632F, -2.2739F, -3.0989F, -0.0169F, 0.1744F, 0.0062F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(64, 21).mirror().addBox(-1.4303F, -0.3435F, -2.2357F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0632F, -2.2739F, -3.0989F, 0.4892F, 0.1744F, 0.0062F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(57, 48).mirror().addBox(-0.5F, -0.8F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.4396F, -0.5716F, 1.8161F, -0.0739F, -0.1256F, 0.1055F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(-0.5F, -1.6F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3115F, 0.2133F, -0.0218F, -0.0149F, -0.1147F, 0.1076F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(45, 5).mirror().addBox(-1.4106F, 0.0814F, -0.0299F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0632F, -1.9739F, -0.7989F, 0.1247F, -0.1147F, 0.1076F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(13, 30).mirror().addBox(-1.4901F, -2.159F, 7.3249F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0632F, 1.8261F, -1.8989F, -0.4011F, 0.1885F, 0.0508F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(34, 18).mirror().addBox(-1.4497F, -1.0833F, 3.5944F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0632F, 1.8261F, -1.8989F, -0.2614F, 0.1854F, 0.0696F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-1.4681F, -0.8518F, -0.3597F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0632F, 1.8261F, -1.8989F, -0.1917F, 0.19F, 0.0382F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(43, 45).mirror().addBox(-1.4116F, -1.4862F, -1.687F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0632F, 1.8261F, -1.8989F, -0.7676F, 0.1813F, 0.0883F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(37, 29).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.1779F, -2.4311F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(35, 35).mirror().addBox(0.0F, 0.0F, -1.8F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 35).addBox(2.0F, 0.0F, -1.8F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.7362F, -2.1484F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-1.4368F, -0.0175F, -2.6122F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 32).addBox(2.5632F, -0.0175F, -2.6122F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0632F, -1.9739F, -0.6989F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(59, 5).addBox(0.7128F, -0.3011F, -2.1211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0632F, -1.4739F, -4.6989F, 0.4456F, -0.1744F, -0.0062F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(38, 58).addBox(-0.236F, -0.5524F, -1.6499F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.6889F, 1.0724F, -3.8267F, 0.4773F, -0.2079F, 0.0259F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(76, 6).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.5524F, 1.8654F, -6.7484F, 0.453F, -0.2093F, 0.0074F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(45, 54).addBox(-0.5F, -0.5038F, -0.4022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4313F, 1.7522F, -6.1741F, 0.1825F, -0.2093F, 0.0074F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(14, 44).addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3664F, 1.947F, -5.9029F, 0.5209F, -0.2079F, 0.0259F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(71, 60).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.6149F, 2.9741F, -7.2066F, 0.5384F, -0.2079F, 0.0259F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(71, 57).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.7021F, 2.4482F, -7.5555F, 0.7129F, -0.2079F, 0.0259F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(45, 15).addBox(-0.2036F, -1.0686F, 1.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6889F, 1.6724F, -3.6267F, -0.408F, -0.2251F, -0.0349F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(34, 45).addBox(-0.2036F, -0.543F, -0.4889F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.6889F, 1.6724F, -3.6267F, -0.1811F, -0.2251F, -0.0349F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(52, 58).addBox(-0.236F, -0.0614F, -0.6309F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6889F, 0.7724F, -3.8267F, 0.0933F, -0.2079F, 0.0259F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(62, 31).addBox(0.4303F, 0.6408F, -1.9642F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0632F, -2.2739F, -3.0989F, -0.0169F, -0.1744F, -0.0062F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(64, 21).addBox(0.4303F, -0.3435F, -2.2357F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0632F, -2.2739F, -3.0989F, 0.4892F, -0.1744F, -0.0062F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(45, 58).addBox(-0.3742F, -0.6551F, -1.9919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.4396F, -0.5716F, 2.9161F, -0.809F, 0.1147F, -0.1076F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(57, 48).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.4396F, -0.5716F, 1.8161F, -0.0739F, 0.1256F, -0.1055F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5F, -1.6F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3115F, 0.2133F, -0.0218F, -0.0149F, 0.1147F, -0.1076F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(45, 5).addBox(0.4106F, 0.0814F, -0.0299F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0632F, -1.9739F, -0.7989F, 0.1247F, 0.1147F, -0.1076F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(13, 30).addBox(0.4901F, -2.159F, 7.3249F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0632F, 1.8261F, -1.8989F, -0.4011F, -0.1885F, -0.0508F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(34, 18).addBox(0.4497F, -1.0833F, 3.5944F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0632F, 1.8261F, -1.8989F, -0.2614F, -0.1854F, -0.0696F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(34, 0).addBox(0.4681F, -0.8518F, -0.3597F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0632F, 1.8261F, -1.8989F, -0.1917F, -0.19F, -0.0382F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(43, 45).addBox(0.4116F, -1.4862F, -1.687F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0632F, 1.8261F, -1.8989F, -0.7676F, -0.1813F, -0.0883F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(37, 29).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.1779F, -2.4311F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 0.7926F, -0.2693F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -4.6F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, -0.0743F, -2.0876F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(25, 70).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.983F, -0.247F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(31, 57).addBox(-1.4F, -0.2499F, -0.369F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(66, 57).addBox(-0.5F, 1.7501F, -0.369F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.195F, 0.2496F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(15, 74).addBox(0.0F, 0.0189F, -0.287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 4.305F, -1.3504F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(52, 40).addBox(0.0F, -4.9811F, -0.287F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 4.305F, -1.3504F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(59, 52).addBox(-0.7F, -2.6F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(59, 56).addBox(-0.7F, -3.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F))
				.texOffs(61, 0).addBox(-0.3F, -2.6F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(59, 60).addBox(-0.3F, -3.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.6889F, -0.3489F, 0.192F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.8323F, -1.5128F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(66, 75).addBox(-0.9F, -0.1891F, 0.1747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(25, 74).addBox(-0.9F, -0.1891F, -0.2253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 40).addBox(-0.9F, 0.6109F, -0.1253F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2F, 0.8601F, 0.0631F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(70, 72).addBox(0.0F, -0.8397F, -0.8406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 47).addBox(0.0F, -0.8397F, -0.4406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1F, 9.7351F, -1.3384F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 74).addBox(0.0F, 0.0021F, 0.063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.7601F, 0.5631F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(57, 40).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.4601F, -0.2369F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(66, 4).addBox(0.0F, -3.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 9.7351F, -1.3384F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(36, 66).addBox(-0.9F, -4.0981F, 0.0464F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2F, 5.8601F, -0.5369F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(54, 5).addBox(-0.9F, 0.0F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2F, 1.8601F, 0.7631F, -0.2094F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(24, 52).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 9.8425F, -1.694F, -0.7243F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(39, 24).addBox(-1.5F, -0.0319F, -1.2504F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6531F, -0.2944F, 0.4102F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(26, 24).addBox(-1.5F, -0.3F, -2.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 0.2681F, -1.0504F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, -0.0743F, -2.0876F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(30, 70).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.983F, -0.247F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(57, 36).addBox(-0.6F, -0.2499F, -0.369F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(66, 61).addBox(-0.5F, 1.7501F, -0.369F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.195F, 0.2496F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(20, 74).addBox(-1.0F, 0.0189F, -0.287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 4.305F, -1.3504F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(5, 53).addBox(-1.0F, -4.9811F, -0.287F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 4.305F, -1.3504F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(17, 60).addBox(-0.3F, -2.6F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 60).addBox(-0.3F, -3.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F))
				.texOffs(62, 27).addBox(-0.7F, -2.6F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(31, 61).addBox(-0.7F, -3.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.6889F, -0.3489F, 0.192F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.8323F, -1.5128F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(75, 69).addBox(-0.1F, -0.1891F, 0.1747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(75, 0).addBox(-0.1F, -0.1891F, -0.2253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(29, 40).addBox(-0.1F, 0.6109F, -0.1253F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2F, 0.8601F, 0.0631F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(10, 74).addBox(-1.0F, -0.8397F, -0.8406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 50).addBox(-1.0F, -0.8397F, -0.4406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1F, 9.7351F, -1.3384F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(5, 74).addBox(-1.0F, 0.0021F, 0.063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.7601F, 0.5631F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(57, 44).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.4601F, -0.2369F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(66, 9).addBox(-1.0F, -3.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 9.7351F, -1.3384F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(41, 66).addBox(-0.1F, -4.0981F, 0.0464F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, 5.8601F, -0.5369F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(54, 12).addBox(-0.1F, 0.0F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 1.8601F, 0.7631F, -0.2094F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(31, 52).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 9.8425F, -1.694F, -0.8116F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(18, 40).addBox(-1.5F, -0.0319F, -1.2504F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6531F, -0.2944F, 0.8029F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(0, 27).addBox(-1.5F, -0.3F, -2.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2681F, -1.0504F, -0.6981F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.3768F, 3.9275F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(78, 54).addBox(0.5F, 0.1134F, 3.9539F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 80).addBox(0.4F, 0.1134F, 5.9539F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 0).addBox(0.3F, 0.1134F, 7.9539F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 54).mirror().addBox(-1.5F, 0.1134F, 3.9539F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 80).mirror().addBox(-1.4F, 0.1134F, 5.9539F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 0).mirror().addBox(-1.3F, 0.1134F, 7.9539F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9919F, 3.1708F, -0.1576F, -0.1307F, 0.008F));

		PartDefinition cube_r72 = tail.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(13, 80).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3768F, 7.9275F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(22, 80).addBox(0.0F, -0.3581F, -0.151F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7581F, 7.4875F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(72, 78).addBox(0.0F, -0.1254F, -0.1446F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8099F, 5.5617F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(69, 78).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2768F, 5.9275F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(75, 78).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2768F, 3.9275F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(66, 65).mirror().addBox(-1.8F, 0.5F, -2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 67).mirror().addBox(-2.0F, 0.5F, -4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 65).addBox(-0.2F, 0.5F, -2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 67).addBox(0.0F, 0.5F, -4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 12).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.3768F, 3.9275F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r78 = tail.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(66, 78).addBox(0.0F, -0.4696F, 0.0951F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2954F, 2.1026F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r79 = tail.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(10, 80).addBox(0.0F, -0.3583F, -0.0462F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4425F, 0.2527F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail6 = tail.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0157F, 8.9267F, -0.1253F, -0.2146F, 0.0358F));

		PartDefinition cube_r80 = tail6.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(28, 80).addBox(0.0F, -3.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 2.1F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r81 = tail6.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(9, 32).addBox(0.0F, -0.5657F, -0.2711F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5529F, 2.0825F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r82 = tail6.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(34, 80).addBox(0.0F, -3.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2082F, 6.2433F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail6.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(5, 40).addBox(0.0F, -0.7679F, 0.082F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5925F, 4.8008F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail6.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(81, 18).addBox(0.0F, -0.6016F, -0.0192F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5925F, 2.9008F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tail6.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(80, 71).addBox(0.0F, -0.9317F, -0.0134F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3925F, 0.9008F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r86 = tail6.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(60, 79).mirror().addBox(-0.9F, 0.1F, 4.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 80).mirror().addBox(-1.0F, 0.1F, 2.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 79).mirror().addBox(-1.2F, 0.1F, 0.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 79).addBox(-0.1F, 0.1F, 4.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 80).addBox(0.0F, 0.1F, 2.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 79).addBox(0.2F, 0.1F, 0.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 8).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0075F, 0.0008F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail6.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1576F, 5.9006F, 0.0451F, -0.2132F, -0.0451F));

		PartDefinition cube_r87 = tail2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(14, 61).addBox(0.0F, -3.3F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6206F, 2.3559F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(46, 80).addBox(0.0F, -2.9F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4065F, 3.4063F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(19, 49).addBox(0.0F, -2.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0983F, 5.4225F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(81, 5).addBox(0.0F, -2.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7901F, 7.4386F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(40, 80).addBox(0.0F, -0.3578F, 0.0026F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7113F, 4.9339F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(37, 80).addBox(0.0F, -0.6307F, -0.0974F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6212F, 3.0368F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(81, 2).addBox(0.0F, -0.82F, 0.0438F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4512F, 0.824F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2999F, -0.0157F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(26, 29).addBox(-0.5F, -0.0288F, -0.0996F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.765F, 7.8853F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.049F, 3.8892F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -4.6F, 0.0165F, -0.1742F, 0.0108F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(25, 80).addBox(0.0F, -2.1586F, 0.1534F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1876F, -1.157F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(76, 28).addBox(0.0F, -2.1677F, 0.0223F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1454F, -3.0177F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(79, 28).addBox(0.0F, -1.9215F, 0.0104F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0264F, -4.9915F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(78, 78).addBox(0.0F, -1.8577F, 1.026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -8.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(69, 31).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.691F, -6.4743F, 0.3657F, 0.1251F, -0.8262F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(69, 29).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.691F, -6.4743F, 0.293F, 0.205F, -1.2613F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(69, 27).mirror().addBox(-5.1021F, -2.3689F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.691F, -6.4743F, 0.1797F, 0.3089F, -1.6999F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(65, 67).mirror().addBox(-1.7F, 0.1F, 0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.257F, -1.4557F, 0.2375F, -0.0707F, -0.3049F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(58, 69).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.257F, -2.4557F, 0.2438F, -0.0259F, -0.6164F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(59, 17).mirror().addBox(-2.8126F, -0.836F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.457F, -4.4557F, 0.1315F, -0.0201F, -1.2739F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(66, 55).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.457F, -4.4557F, 0.1246F, -0.0111F, -0.8376F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(69, 27).addBox(3.1021F, -2.3689F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.691F, -6.4743F, 0.1797F, -0.3089F, 1.6999F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(69, 29).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.691F, -6.4743F, 0.293F, -0.205F, 1.2613F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(69, 31).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.691F, -6.4743F, 0.3657F, -0.1251F, 0.8262F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(55, 32).addBox(-0.5F, -0.0486F, 3.9985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, -11.8F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(65, 67).addBox(-0.3F, 0.1F, 0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.257F, -1.4557F, 0.2375F, 0.0707F, 0.3049F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(58, 69).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.257F, -2.4557F, 0.2438F, 0.0259F, 0.6164F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(59, 17).addBox(1.8126F, -0.836F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.457F, -4.4557F, 0.1315F, 0.0201F, 1.2739F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(66, 55).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.457F, -4.4557F, 0.1246F, 0.0111F, 0.8376F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(19, 16).addBox(-0.5F, 0.0499F, 0.006F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.0F, 0.0611F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.734F, -7.8186F, -0.0885F, -0.174F, 0.0138F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(73, 66).mirror().addBox(-0.9733F, 0.97F, 0.9472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(10, 57).mirror().addBox(-0.9733F, -0.03F, -0.0528F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1001F, 2.9914F, -1.5104F, 0.8277F, -0.0327F, 0.0809F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(64, 17).mirror().addBox(-0.0249F, 0.0638F, -0.434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(14, 64).mirror().addBox(-0.0249F, -0.4362F, -0.434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.079F, 6.4339F, -3.6129F, 1.2008F, -0.188F, -0.0644F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(46, 68).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.357F, -0.3557F, 0.5943F, 0.2536F, -0.7546F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(12, 68).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.357F, -0.3557F, 0.4506F, 0.4157F, -1.1845F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(28, 50).mirror().addBox(-7.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.357F, -0.3557F, 0.2273F, 0.5638F, -1.6514F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(13, 24).mirror().addBox(-0.5333F, 0.1256F, -0.5195F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, 8.3815F, -0.6621F, 0.3694F, -0.2875F, 0.2144F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(39, 50).mirror().addBox(-0.3713F, -0.082F, 0.424F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, 8.5815F, -1.2621F, 0.3861F, -0.2536F, -0.0421F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(24, 35).mirror().addBox(-0.3499F, 0.008F, -0.6164F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, 8.6815F, -1.8621F, 0.1963F, -0.3295F, 0.1039F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(34, 40).mirror().addBox(0.6186F, 0.1893F, 1.4751F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 40).addBox(1.6186F, 0.1893F, 1.4751F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6186F, 8.3815F, -4.7621F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(48, 50).mirror().addBox(-0.3814F, -0.9629F, -0.1361F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 50).addBox(1.6186F, -0.9629F, -0.1361F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6186F, 8.3815F, -4.7621F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(69, 33).mirror().addBox(-1.9808F, -0.0521F, -0.5702F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.657F, -4.8557F, 0.9365F, 0.5303F, -0.6697F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-3.7778F, -0.8762F, -0.4471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.657F, -4.8557F, 0.6588F, 0.7993F, -1.1113F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(45, 22).mirror().addBox(-4.0536F, -2.3907F, -0.4471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.657F, -4.8557F, 0.151F, 0.9793F, -1.7539F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(46, 66).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.357F, -3.5557F, 0.7139F, 0.3951F, -0.7128F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(64, 25).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.357F, -3.5557F, 0.4996F, 0.5918F, -1.1573F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(45, 20).mirror().addBox(-7.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.357F, -3.5557F, 0.1694F, 0.7391F, -1.6831F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(68, 2).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.157F, -2.2557F, 0.6165F, 0.3478F, -0.7403F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(46, 38).mirror().addBox(-7.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.157F, -2.2557F, 0.1519F, 0.6377F, -1.6863F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.157F, -2.2557F, 0.4274F, 0.51F, -1.1871F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-1.8354F, -1.1658F, -3.7729F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1001F, 4.9914F, -1.7104F, 1.0626F, -0.2483F, -0.2322F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(43, 40).mirror().addBox(-0.5F, -0.4F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6171F, 3.2118F, -0.041F, 0.3921F, -0.0136F, 0.0862F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(5, 43).mirror().addBox(-1.1508F, -0.0775F, -0.0309F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1001F, 4.9914F, -3.4104F, 0.794F, -0.003F, 0.0872F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(38, 54).mirror().addBox(-1.1508F, 0.4908F, -0.338F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1001F, 4.9914F, -3.4104F, 1.0209F, -0.003F, 0.0872F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(13, 24).addBox(-0.4667F, 0.1256F, -0.5195F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0186F, 8.3815F, -0.6621F, 0.3694F, 0.2875F, -0.2144F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(39, 50).addBox(-0.6287F, -0.082F, 0.424F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0186F, 8.5815F, -1.2621F, 0.3861F, 0.2536F, 0.0421F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(24, 35).addBox(-0.6501F, 0.008F, -0.6164F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0186F, 8.6815F, -1.8621F, 0.1963F, 0.3295F, -0.1039F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(19, 80).addBox(0.0F, -1.5317F, 2.0844F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 80).addBox(0.0F, -1.3317F, 0.0844F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -2.9F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(10, 53).addBox(0.0F, -1.1104F, -1.9657F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -2.8F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(43, 80).addBox(0.0F, -0.3967F, -3.7714F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -2.8F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(69, 33).addBox(-0.0192F, -0.0521F, -0.5702F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.657F, -4.8557F, 0.9365F, -0.5303F, 0.6697F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 68).addBox(1.7778F, -0.8762F, -0.4471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.657F, -4.8557F, 0.6588F, -0.7993F, 1.1113F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(45, 22).addBox(3.0536F, -2.3907F, -0.4471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.657F, -4.8557F, 0.151F, -0.9793F, 1.7539F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(46, 66).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.357F, -3.5557F, 0.7139F, -0.3951F, 0.7128F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(64, 25).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.357F, -3.5557F, 0.4996F, -0.5918F, 1.1573F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(45, 20).addBox(3.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.357F, -3.5557F, 0.1694F, -0.7391F, 1.6831F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(28, 50).addBox(3.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.357F, -0.3557F, 0.2273F, -0.5638F, 1.6514F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(12, 68).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.357F, -0.3557F, 0.4506F, -0.4157F, 1.1845F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(46, 68).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.357F, -0.3557F, 0.5943F, -0.2536F, 0.7546F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(68, 2).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.157F, -2.2557F, 0.6165F, -0.3478F, 0.7403F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(46, 38).addBox(3.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.157F, -2.2557F, 0.1519F, -0.6377F, 1.6863F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(68, 0).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.157F, -2.2557F, 0.4274F, -0.51F, 1.1871F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(73, 66).addBox(-0.0267F, 0.97F, 0.9472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(10, 57).addBox(-0.0267F, -0.03F, -0.0528F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1001F, 2.9914F, -1.5104F, 0.8277F, 0.0327F, -0.0809F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(64, 17).addBox(-0.9751F, 0.0638F, -0.434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(14, 64).addBox(-0.9751F, -0.4362F, -0.434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.079F, 6.4339F, -3.6129F, 1.2008F, 0.188F, 0.0644F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(54, 0).addBox(0.8354F, -1.1658F, -3.7729F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1001F, 4.9914F, -1.7104F, 1.0626F, 0.2483F, 0.2322F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(43, 40).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6171F, 3.2118F, -0.041F, 0.3921F, 0.0136F, -0.0862F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(5, 43).addBox(0.1508F, -0.0775F, -0.0309F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1001F, 4.9914F, -3.4104F, 0.794F, 0.003F, -0.0872F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(38, 54).addBox(0.1508F, 0.4908F, -0.338F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1001F, 4.9914F, -3.4104F, 1.0209F, 0.003F, -0.0872F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(34, 6).addBox(-0.5F, -0.0001F, -4.0167F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0F, -2.8F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(45, 10).addBox(-0.5F, -0.011F, 2.98F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.3F, -5.5F, 0.4451F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(66, 51).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6543F, 7.5499F, -2.4092F, 1.0781F, 0.2134F, 0.0499F));

		PartDefinition cube_r164 = leftArm.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(7, 65).addBox(-1.0F, -0.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.5F, 0.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftArm.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(13, 20).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2572F, 1.869F, -0.0129F, 0.4535F, -0.4634F, -0.1194F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(0, 50).addBox(-0.4663F, -0.4502F, 0.1999F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(23, 44).addBox(-0.4663F, -0.4502F, -0.6001F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0891F, 4.23F, 0.9411F, -1.3576F, -0.5775F, -1.3035F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(26, 65).addBox(-0.6826F, -0.2142F, -0.5093F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.372F, 5.3027F, 0.289F, 0.1194F, 0.0554F, 1.095F));

		PartDefinition cube_r166 = leftArm3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(75, 72).addBox(-0.4F, -0.9F, -0.04F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1153F, 2.8343F, -0.4695F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r167 = leftArm3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(76, 42).addBox(-0.5F, 1.397F, -0.5303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 70).addBox(-0.5F, -0.303F, -0.5303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1826F, 0.0641F, -0.2042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r168 = leftArm3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(65, 69).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1826F, 0.7858F, 0.3907F, 0.1309F, 0.0F, 0.0F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1532F, 0.0858F, 0.8397F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(53, 66).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6543F, 7.5499F, -2.4092F, 0.6854F, -0.2134F, -0.0499F));

		PartDefinition cube_r169 = rightArm.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(21, 65).addBox(0.0F, -0.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 1.5F, 0.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r170 = rightArm.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(18, 36).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2572F, 1.869F, -0.0129F, 0.4535F, 0.4634F, 0.1194F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(19, 52).addBox(-0.5337F, -0.4502F, 0.1999F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(14, 49).addBox(-0.5337F, -0.4502F, -0.6001F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0891F, 4.23F, 0.9411F, -1.363F, -0.5368F, 1.0784F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(31, 65).addBox(-0.3174F, -0.2142F, -0.5093F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.372F, 5.3027F, 0.289F, 0.2366F, -0.3066F, -0.3357F));

		PartDefinition cube_r171 = rightArm3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(76, 3).addBox(-0.6F, -0.9F, -0.04F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1153F, 2.8343F, -0.4695F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r172 = rightArm3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(76, 45).addBox(-0.5F, 1.397F, -0.5303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(10, 70).addBox(-0.5F, -0.303F, -0.5303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1826F, 0.0641F, -0.2042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r173 = rightArm3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(5, 70).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1826F, 0.7858F, 0.3907F, 0.1309F, 0.0F, 0.0F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1532F, 0.0858F, 0.8397F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 4.063F, -5.2153F, -0.4602F, -0.3914F, 0.0325F));

		PartDefinition cube_r174 = neck4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(31, 80).addBox(-0.5F, -1.2891F, 1.9381F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2623F, -3.6861F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r175 = neck4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(57, 19).addBox(-1.0F, 0.017F, 1.7615F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.2623F, -3.4861F, 0.4887F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.8569F, -1.4535F, -0.4717F, -0.239F, -0.1777F));

		PartDefinition cube_r176 = neck3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(52, 54).addBox(-0.5F, 0.0928F, 0.7233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2683F, -2.4789F, -0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6097F, -1.7924F, -0.0944F, -0.1759F, -0.2509F));

		PartDefinition cube_r177 = neck2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(81, 24).addBox(0.0F, 0.7F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 21).addBox(0.0F, 0.7F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 33).addBox(-0.5F, 1.0F, 1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.3626F, -3.5573F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.115F, -2.4679F, 0.1311F, -0.0907F, -0.2004F));

		PartDefinition cube_r178 = neck.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(81, 15).addBox(0.0F, -0.784F, 1.7966F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 62).addBox(-0.5F, -0.284F, 1.7966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.111F, -3.5428F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1986F, -1.3683F, 0.68F, -0.078F, -0.0063F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(78, 12).addBox(-0.5F, -0.4328F, -0.0556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5613F, -3.0159F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(38, 62).addBox(-0.5F, -0.4281F, -1.6719F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5613F, -3.0159F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(61, 73).addBox(-0.6F, -1.0182F, -0.978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1F, -0.5764F, -3.8362F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(64, 39).addBox(-1.0F, -1.1201F, -0.8215F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.212F))
				.texOffs(35, 77).addBox(-0.5F, -1.1201F, -1.2215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -0.0435F, -5.9449F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(24, 61).addBox(-0.647F, -0.5001F, -1.0347F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1677F, -0.4759F, -6.6966F, 0.2288F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(15, 70).addBox(-0.3F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7F, -0.7723F, -1.8144F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(35, 74).addBox(-0.3F, -1.2085F, 0.0228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(30, 74).addBox(0.7F, -1.2085F, 0.0228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7F, 0.076F, -2.8214F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(73, 53).addBox(-0.5F, -0.1079F, -0.8358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3764F, -6.2362F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(59, 13).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2F, -0.8012F, -2.7171F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(71, 20).addBox(-0.5F, -0.0363F, -1.0308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.7764F, -5.3362F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(51, 73).addBox(-0.5F, -0.0363F, -0.0308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.7764F, -5.3362F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(45, 77).addBox(-0.5F, 0.028F, -1.0212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2764F, -3.4362F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(73, 13).addBox(-0.5F, -0.0568F, -0.9017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.1764F, -2.5362F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(64, 45).addBox(-1.0F, -0.2902F, -1.0458F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.0764F, 1.0638F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(64, 42).addBox(-1.0F, 0.1237F, -0.7336F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.1764F, 0.9638F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(66, 14).addBox(-1.0F, -0.0269F, 0.0387F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9764F, -0.6362F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(59, 64).addBox(-1.0F, -0.0079F, -1.0173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4764F, -2.1362F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(64, 48).addBox(-1.0F, -0.0073F, -1.0022F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.0764F, -1.2362F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(46, 28).addBox(-1.0F, 0.0158F, -2.0089F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.9764F, -0.5362F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.7F, 0.376F, -1.8214F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(50, 76).addBox(-0.5F, -0.1846F, 0.2493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0913F, -1.0912F, -0.4132F, -0.4615F, -0.1044F, -0.1923F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(76, 59).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1548F, -1.7065F, -0.9408F, -1.2905F, -0.1044F, -0.1923F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(76, 56).addBox(-0.5F, -0.3042F, -0.472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0913F, -1.0912F, -0.4132F, -0.7669F, -0.1044F, -0.1923F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(5, 48).addBox(-0.5F, -1.0361F, -0.0588F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.9523F, -2.0147F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(45, 62).addBox(-0.7266F, -0.7181F, -0.3604F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2F, -1.3311F, -3.2704F, 0.3087F, -0.0901F, 0.0812F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(71, 7).addBox(-0.8F, -0.7452F, 0.3594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1F, -0.7311F, -4.1704F, 0.5411F, -0.2443F, 0.0F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(71, 17).addBox(-0.8F, -0.8294F, -0.2337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, -0.7311F, -4.1704F, 0.384F, -0.2443F, 0.0F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(40, 77).addBox(-0.1777F, -0.4634F, -0.1831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F)), PartPose.offsetAndRotation(-0.4F, -0.947F, -5.2151F, 0.1535F, -0.6488F, -0.0932F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(7, 61).addBox(-0.3492F, -0.5F, -0.9913F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.5323F, -0.8519F, -4.8751F, 0.3001F, -0.17F, -0.0396F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(76, 25).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0552F, -0.8142F, -4.979F, 0.1182F, -0.3032F, -0.0828F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(40, 74).addBox(-0.5F, -1.0374F, 0.1047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.48F, -1.0785F, -3.7086F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(71, 4).addBox(-0.5F, -0.6627F, 0.2654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.48F, -0.9785F, -4.4086F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(78, 62).addBox(0.08F, -0.1915F, -0.1774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(78, 51).addBox(0.08F, -0.1915F, 0.2226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7F, -2.3523F, 1.1853F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(76, 19).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 22).addBox(-0.34F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.02F, -2.0712F, -0.1663F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(45, 74).addBox(-0.66F, -0.0569F, -0.5862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.02F, -2.4771F, -0.5109F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(76, 16).addBox(-0.66F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.02F, -2.0712F, -0.1663F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(76, 75).addBox(-0.5F, -0.5098F, -0.7355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.22F, -0.9041F, 0.5326F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(10, 77).addBox(-0.5F, -0.9112F, -1.1871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F))
				.texOffs(15, 77).addBox(-0.5F, -0.6112F, -0.8871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.22F, -0.3041F, 0.9326F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5F, -0.835F, -0.1956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(0.22F, -1.4041F, 0.1326F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(20, 77).addBox(-0.5F, -0.1813F, -0.0916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.22F, -1.9041F, 0.5326F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(30, 77).addBox(-0.5F, -0.1195F, -0.8966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.22F, -1.8041F, 1.8326F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(25, 77).addBox(-0.5F, -0.1561F, -0.06F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.22F, -1.9041F, 1.7326F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(76, 9).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(0.22F, -1.0104F, 1.166F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(24, 57).addBox(0.4F, -1.0444F, -1.674F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F))
				.texOffs(59, 9).addBox(0.4F, -0.7444F, -1.674F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7F, -0.5523F, 2.8853F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(76, 33).addBox(0.4F, -0.6408F, -0.3874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(76, 48).addBox(0.4F, -0.3408F, -0.3874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7F, -0.6523F, 2.4853F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(78, 65).addBox(-0.3F, -0.2232F, -0.2402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 0.5791F, 0.804F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(46, 70).addBox(-0.3F, -0.4572F, -0.6062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 1.804F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(76, 39).addBox(0.2F, -0.0254F, -0.9598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7F, -2.1523F, 1.2853F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(76, 36).addBox(0.2F, 0.0182F, -1.0405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7F, -1.5523F, 2.1853F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(20, 70).addBox(0.2F, -0.0408F, -0.9874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7F, -0.6523F, 2.4853F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(55, 28).addBox(0.2F, -0.1198F, -1.9899F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7F, 0.3477F, 1.0853F, -1.7628F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.7F, 0.376F, -1.8214F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(50, 76).mirror().addBox(-0.5F, -0.1846F, 0.2493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0913F, -1.0912F, -0.4132F, -0.4615F, 0.1044F, 0.1923F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(76, 59).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1548F, -1.7065F, -0.9408F, -1.2905F, 0.1044F, 0.1923F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(76, 56).mirror().addBox(-0.5F, -0.3042F, -0.472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0913F, -1.0912F, -0.4132F, -0.7669F, 0.1044F, 0.1923F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(5, 48).mirror().addBox(-0.5F, -1.0361F, -0.0588F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.9523F, -2.0147F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(45, 62).mirror().addBox(-0.2734F, -0.7181F, -0.3604F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.3311F, -3.2704F, 0.3087F, 0.0901F, -0.0812F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(71, 7).mirror().addBox(-0.2F, -0.7452F, 0.3594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.7311F, -4.1704F, 0.5411F, 0.2443F, 0.0F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(71, 17).mirror().addBox(-0.2F, -0.8294F, -0.2337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.7311F, -4.1704F, 0.384F, 0.2443F, 0.0F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-0.8223F, -0.4634F, -0.1831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.947F, -5.2151F, 0.1535F, 0.6488F, 0.0932F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(7, 61).mirror().addBox(-0.6508F, -0.5F, -0.9913F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.5323F, -0.8519F, -4.8751F, 0.3001F, 0.17F, 0.0396F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(76, 25).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0552F, -0.8142F, -4.979F, 0.1182F, 0.3032F, 0.0828F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(40, 74).mirror().addBox(-0.5F, -1.0374F, 0.1047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.48F, -1.0785F, -3.7086F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(71, 4).mirror().addBox(-0.5F, -0.6627F, 0.2654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.48F, -0.9785F, -4.4086F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(78, 62).mirror().addBox(-1.08F, -0.1915F, -0.1774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(78, 51).mirror().addBox(-1.08F, -0.1915F, 0.2226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7F, -2.3523F, 1.1853F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(76, 19).mirror().addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 22).mirror().addBox(-0.66F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.02F, -2.0712F, -0.1663F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(45, 74).mirror().addBox(-0.34F, -0.0569F, -0.5862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.02F, -2.4771F, -0.5109F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(-0.34F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.02F, -2.0712F, -0.1663F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(76, 75).mirror().addBox(-0.5F, -0.5098F, -0.7355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.22F, -0.9041F, 0.5326F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-0.5F, -0.9112F, -1.1871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false)
				.texOffs(15, 77).mirror().addBox(-0.5F, -0.6112F, -0.8871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.22F, -0.3041F, 0.9326F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.5F, -0.835F, -0.1956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)).mirror(false), PartPose.offsetAndRotation(-0.22F, -1.4041F, 0.1326F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(20, 77).mirror().addBox(-0.5F, -0.1813F, -0.0916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.22F, -1.9041F, 0.5326F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(30, 77).mirror().addBox(-0.5F, -0.1195F, -0.8966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.22F, -1.8041F, 1.8326F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(25, 77).mirror().addBox(-0.5F, -0.1561F, -0.06F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.22F, -1.9041F, 1.7326F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(76, 9).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)).mirror(false), PartPose.offsetAndRotation(-0.22F, -1.0104F, 1.166F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(24, 57).mirror().addBox(-1.4F, -1.0444F, -1.674F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(59, 9).mirror().addBox(-1.4F, -0.7444F, -1.674F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7F, -0.5523F, 2.8853F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(76, 33).mirror().addBox(-1.4F, -0.6408F, -0.3874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(76, 48).mirror().addBox(-1.4F, -0.3408F, -0.3874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7F, -0.6523F, 2.4853F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-0.7F, -0.2232F, -0.2402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5791F, 0.804F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(46, 70).mirror().addBox(-0.7F, -0.4572F, -0.6062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4209F, 1.804F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(76, 39).mirror().addBox(-1.2F, -0.0254F, -0.9598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7F, -2.1523F, 1.2853F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(76, 36).mirror().addBox(-1.2F, 0.0182F, -1.0405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7F, -1.5523F, 2.1853F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(20, 70).mirror().addBox(-1.2F, -0.0408F, -0.9874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7F, -0.6523F, 2.4853F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(55, 28).mirror().addBox(-1.2F, -0.1198F, -1.9899F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.3477F, 1.0853F, -1.7628F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0552F, -5.9918F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0032F, 1.116F, -0.5625F, 0.5674F, -0.0021F, 0.0112F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(64, 35).mirror().addBox(-0.5F, -0.948F, -1.5455F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(64, 35).addBox(0.1064F, -0.948F, -1.5455F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3064F, 0.1124F, -2.2964F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(71, 35).mirror().addBox(-0.5023F, -0.8708F, -0.1431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false)
				.texOffs(71, 35).addBox(-0.4913F, -0.8708F, -0.1431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F))
				.texOffs(71, 23).addBox(-0.4913F, -0.8708F, 0.2569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.0064F, -0.6876F, -5.7964F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(71, 10).mirror().addBox(-0.5023F, -0.1287F, -0.1123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(71, 10).addBox(-0.4913F, -0.1287F, -0.1123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0064F, -1.3876F, -5.3964F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(71, 75).mirror().addBox(-0.5F, -0.0773F, -0.6105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(71, 75).addBox(0.1064F, -0.0773F, -0.6105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3064F, -0.7263F, -1.993F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(55, 77).mirror().addBox(-0.5F, 0.0332F, -0.9807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(55, 77).addBox(0.1064F, 0.0332F, -0.9807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3064F, -1.1876F, -2.3964F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(81, 32).mirror().addBox(0.0F, -1.1F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 32).addBox(1.6064F, -1.1F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8064F, -0.8611F, -2.0022F, -1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(71, 44).mirror().addBox(-0.5052F, -0.7064F, -0.6982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.7832F, -0.3148F, -0.2444F, 0.0072F, 0.0031F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(71, 41).mirror().addBox(-0.5024F, -0.6924F, -0.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.7832F, 0.0852F, -0.0349F, 0.0072F, 0.0031F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(40, 71).mirror().addBox(-0.4989F, -0.7192F, -0.7443F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.5832F, 0.4852F, 0.5236F, 0.0072F, 0.0031F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(71, 38).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.4832F, 0.2852F, 0.9075F, 0.0072F, 0.0031F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(56, 71).mirror().addBox(-1.2F, -0.0566F, -0.8955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0064F, -0.1878F, -0.4687F, -1.0995F, -0.0079F, 0.0027F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(57, 23).mirror().addBox(-1.2F, -0.9707F, -1.9154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(57, 23).addBox(0.2064F, -0.9707F, -1.9154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0064F, 0.7122F, -0.6687F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.3707F, -0.2323F, -1.1162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(61, 76).mirror().addBox(-0.5707F, -0.5323F, -1.0162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(5, 77).mirror().addBox(-0.3707F, -0.3323F, -0.6162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.26F, -1.1474F, -5.4749F, -0.9747F, 0.1655F, -0.1238F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(70, 69).mirror().addBox(-0.3712F, -0.4346F, -0.3006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(52, 47).mirror().addBox(-0.3712F, -1.0346F, -0.3006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.26F, -1.1474F, -5.4749F, -1.3063F, 0.1655F, -0.1238F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(51, 70).mirror().addBox(-0.3707F, -0.5632F, -0.5682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.26F, -1.1474F, -5.4749F, -1.9346F, 0.1655F, -0.1238F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(70, 69).addBox(-0.6288F, -0.4346F, -0.3006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(52, 47).addBox(-0.6288F, -1.0346F, -0.3006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.2536F, -1.1474F, -5.4749F, -1.3063F, -0.1655F, 0.1238F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(51, 70).addBox(-0.6293F, -0.5632F, -0.5682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.2536F, -1.1474F, -5.4749F, -1.9346F, -0.1655F, 0.1238F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(61, 76).addBox(-0.4293F, -0.5323F, -1.0162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 64).addBox(-0.6293F, -0.2323F, -1.1162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(5, 77).addBox(-0.6293F, -0.3323F, -0.6162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2536F, -1.1474F, -5.4749F, -0.9747F, -0.1655F, 0.1238F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1198F, -1.0828F, -5.91F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(80, 68).mirror().addBox(-0.0475F, -0.7568F, 1.598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3133F, -1.4555F, -4.0355F, -0.5498F, -0.0873F, 0.0F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(55, 80).mirror().addBox(-0.0366F, -0.1909F, -0.1808F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3133F, -1.4555F, -4.0355F, -0.0436F, -0.0873F, 0.0F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(81, 8).mirror().addBox(-0.0466F, -0.442F, 0.7261F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3133F, -1.4555F, -4.0355F, -0.3578F, -0.0873F, 0.0F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(55, 80).addBox(0.0366F, -0.1909F, -0.1808F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3069F, -1.4555F, -4.0355F, -0.0436F, 0.0873F, 0.0F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(80, 68).addBox(0.0475F, -0.7568F, 1.598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3069F, -1.4555F, -4.0355F, -0.5498F, 0.0873F, 0.0F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(81, 8).addBox(0.0466F, -0.442F, 0.7261F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3069F, -1.4555F, -4.0355F, -0.3578F, 0.0873F, 0.0F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(35, 71).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.1233F, -4.3457F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(73, 63).addBox(-0.5F, 0.0134F, 0.2643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.5876F, -4.2964F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(56, 74).addBox(-0.5F, -1.0081F, 0.1333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4759F, -4.9174F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(71, 44).addBox(-0.4948F, -0.7064F, -0.6982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, 0.7832F, -0.3148F, -0.2444F, -0.0072F, -0.0031F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(71, 41).addBox(-0.4976F, -0.6924F, -0.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.0F, 0.7832F, 0.0852F, -0.0349F, -0.0072F, -0.0031F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(40, 71).addBox(-0.5011F, -0.7192F, -0.7443F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, 0.5832F, 0.4852F, 0.5236F, -0.0072F, -0.0031F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(71, 38).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.0F, 0.4832F, 0.2852F, 0.9075F, -0.0072F, -0.0031F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(56, 71).addBox(0.2F, -0.0566F, -0.8955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -0.1878F, -0.4687F, -1.0995F, 0.0079F, -0.0027F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(61, 82).mirror().addBox(0.0F, -0.9806F, -0.0224F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0032F, 0.4464F, -2.5281F, -0.4965F, -0.3077F, 0.1637F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(61, 82).addBox(0.0F, -0.9806F, -0.0224F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0032F, 0.4464F, -2.5281F, -0.4972F, 0.3116F, -0.1638F));

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