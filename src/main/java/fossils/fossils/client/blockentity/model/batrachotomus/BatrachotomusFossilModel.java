package fossils.fossils.client.blockentity.model.batrachotomus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BatrachotomusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Root;
	private final ModelPart Hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart Body;
	private final ModelPart body2;
	private final ModelPart Chest;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart UpperArmL;
	private final ModelPart LowerArmL;
	private final ModelPart HandL;
	private final ModelPart HandL2;
	private final ModelPart UpperArmL2;
	private final ModelPart LowerArmL2;
	private final ModelPart HandL3;
	private final ModelPart HandL4;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart UpperLegL;
	private final ModelPart LowerLegL;
	private final ModelPart FootL;
	private final ModelPart ToesL;
	private final ModelPart UpperLegL2;
	private final ModelPart LowerLegL2;
	private final ModelPart FootL2;
	private final ModelPart ToesL2;

	public BatrachotomusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Root = this.fossil.getChild("Root");
		this.Hips = this.Root.getChild("Hips");
		this.bone = this.Hips.getChild("bone");
		this.bone3 = this.Hips.getChild("bone3");
		this.Body = this.Hips.getChild("Body");
		this.body2 = this.Body.getChild("body2");
		this.Chest = this.body2.getChild("Chest");
		this.bone2 = this.Chest.getChild("bone2");
		this.bone4 = this.Chest.getChild("bone4");
		this.Neck = this.Chest.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.UpperArmL = this.Chest.getChild("UpperArmL");
		this.LowerArmL = this.UpperArmL.getChild("LowerArmL");
		this.HandL = this.LowerArmL.getChild("HandL");
		this.HandL2 = this.HandL.getChild("HandL2");
		this.UpperArmL2 = this.Chest.getChild("UpperArmL2");
		this.LowerArmL2 = this.UpperArmL2.getChild("LowerArmL2");
		this.HandL3 = this.LowerArmL2.getChild("HandL3");
		this.HandL4 = this.HandL3.getChild("HandL4");
		this.Tail = this.Hips.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.UpperLegL = this.Hips.getChild("UpperLegL");
		this.LowerLegL = this.UpperLegL.getChild("LowerLegL");
		this.FootL = this.LowerLegL.getChild("FootL");
		this.ToesL = this.FootL.getChild("ToesL");
		this.UpperLegL2 = this.Hips.getChild("UpperLegL2");
		this.LowerLegL2 = this.UpperLegL2.getChild("LowerLegL2");
		this.FootL2 = this.LowerLegL2.getChild("FootL2");
		this.ToesL2 = this.FootL2.getChild("ToesL2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Root = fossil.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, -20.0F, 0.0F));

		PartDefinition Hips = Root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 14.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(39, 104).addBox(0.0F, -3.6F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9762F, -0.9128F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 104).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9762F, -2.9128F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 103).addBox(0.0F, -3.7F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0762F, -4.8128F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(52, 70).mirror().addBox(-2.0F, 0.0F, 2.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 70).addBox(1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 22).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0962F, -6.9128F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 97).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.1845F, -0.3237F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(87, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.8764F, -3.2027F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(78, 70).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0832F, -6.1257F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bone = Hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0043F, -0.948F, -2.0138F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 76).addBox(-1.5F, -2.1765F, -2.4735F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, 1.3935F, -0.488F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(63, 76).addBox(-1.5F, -0.9765F, -1.6486F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, 1.3935F, -0.488F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(74, 36).addBox(-1.5F, -1.7515F, -1.9735F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.0F, 1.3935F, -0.488F, 1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(18, 85).addBox(-1.7F, -2.1826F, 0.5958F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 3.0958F, -1.7242F, 2.9932F, 0.0F, 0.3316F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(85, 80).addBox(-1.7F, -3.0069F, -0.5272F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.2F, 3.0958F, -1.7242F, 2.5133F, 0.0F, 0.3316F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(41, 69).addBox(-1.7F, -1.8073F, -2.6054F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.2F, 3.0958F, -1.7242F, 1.597F, 0.0F, 0.3316F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(39, 113).addBox(-0.0748F, 1.3094F, -2.201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.2F, 6.0958F, -7.4492F, 0.2967F, 0.0F, 0.0349F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(83, 109).addBox(-0.0748F, 2.0273F, -0.8782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-1.2F, 6.0958F, -7.4492F, -0.2269F, 0.0F, 0.0349F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(109, 54).addBox(-0.0748F, 1.3954F, -1.9832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.2F, 6.0958F, -7.4492F, 0.4276F, 0.0F, 0.0349F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(94, 99).addBox(-0.0748F, -0.3437F, -2.7958F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2F, 6.0958F, -7.4492F, 1.1257F, 0.0F, 0.0349F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(58, 87).addBox(-0.0748F, -0.1444F, -2.674F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.2F, 6.0958F, -7.4492F, 0.9076F, 0.0F, 0.0349F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(108, 39).addBox(-0.783F, -0.1563F, 0.3181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(68, 28).addBox(-0.783F, -1.2563F, -1.1819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.25F, 4.3958F, 0.0758F, 1.9585F, -0.1649F, 0.2316F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(76, 102).addBox(-0.783F, -0.5986F, -1.2827F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.25F, 4.3958F, 0.0758F, 1.5222F, -0.1649F, 0.2316F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(103, 4).addBox(-0.783F, 0.247F, -0.959F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.25F, 4.3958F, 0.0758F, 1.2604F, -0.1649F, 0.2316F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(109, 67).addBox(-0.783F, 3.2395F, 0.6293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 111).addBox(-0.783F, 3.2395F, 0.0293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.25F, 4.3958F, 0.0758F, 0.859F, -0.1649F, 0.2316F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(103, 0).addBox(-0.783F, 3.0362F, -0.9882F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.25F, 4.3958F, 0.0758F, 1.3826F, -0.1649F, 0.2316F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(10, 108).addBox(-0.783F, 0.7435F, -4.3817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.25F, 4.3958F, 0.0758F, 2.2552F, -0.1649F, 0.2316F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(16, 103).addBox(-0.783F, 1.9195F, -0.9846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.25F, 4.3958F, 0.0758F, 1.2517F, -0.1649F, 0.2316F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(69, 103).addBox(-0.783F, 1.8412F, -0.4303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.25F, 4.3958F, 0.0758F, 0.9899F, -0.1649F, 0.2316F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(107, 81).addBox(-0.783F, 1.8768F, -0.6757F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.25F, 4.3958F, 0.0758F, 1.2953F, -0.1649F, 0.2316F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(45, 103).addBox(-0.783F, 0.3251F, -0.234F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.25F, 4.3958F, 0.0758F, 1.0858F, -0.1649F, 0.2316F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(14, 90).addBox(-0.783F, -1.1075F, -0.9947F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.25F, 4.3958F, 0.0758F, 0.7804F, -0.1649F, 0.2316F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(67, 82).addBox(-0.8F, -2.1752F, -6.4949F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 3.0958F, -1.7242F, 0.8378F, 0.0F, 0.3316F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(58, 82).addBox(-0.8F, -1.3266F, -4.1782F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 3.0958F, -1.7242F, 0.6196F, 0.0F, 0.3316F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(85, 34).addBox(-0.8F, -1.8414F, -4.0754F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 3.0958F, -1.7242F, 0.7505F, 0.0F, 0.3316F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(64, 63).addBox(-1.5F, -1.7515F, -3.8735F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.0F, 1.3935F, -0.488F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(74, 30).addBox(-1.0F, -0.8902F, -2.8985F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4F, 0.6016F, -0.2838F, 0.0262F, 0.0F, -0.3491F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(15, 64).addBox(-1.0F, -0.9263F, -0.5992F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.4F, 0.6016F, -0.2838F, 0.1571F, 0.0F, -0.3491F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0043F, -0.948F, -2.0138F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(52, 76).mirror().addBox(-0.5F, -2.1765F, -2.4735F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3935F, -0.488F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(63, 76).mirror().addBox(-0.5F, -0.9765F, -1.6486F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3935F, -0.488F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(74, 36).mirror().addBox(-0.5F, -1.7515F, -1.9735F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3935F, -0.488F, 1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(18, 85).mirror().addBox(-0.3F, -2.1826F, 0.5958F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 3.0958F, -1.7242F, 2.9932F, 0.0F, -0.3316F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(85, 80).mirror().addBox(-0.3F, -3.0069F, -0.5272F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 3.0958F, -1.7242F, 2.5133F, 0.0F, -0.3316F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(41, 69).mirror().addBox(-0.3F, -1.8073F, -2.6054F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 3.0958F, -1.7242F, 1.597F, 0.0F, -0.3316F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(39, 113).mirror().addBox(-0.9252F, 1.3094F, -2.201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.2F, 6.0958F, -7.4492F, 0.2967F, 0.0F, -0.0349F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(83, 109).mirror().addBox(-0.9252F, 2.0273F, -0.8782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(1.2F, 6.0958F, -7.4492F, -0.2269F, 0.0F, -0.0349F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(109, 54).mirror().addBox(-0.9252F, 1.3954F, -1.9832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.2F, 6.0958F, -7.4492F, 0.4276F, 0.0F, -0.0349F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(94, 99).mirror().addBox(-0.9252F, -0.3437F, -2.7958F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2F, 6.0958F, -7.4492F, 1.1257F, 0.0F, -0.0349F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(58, 87).mirror().addBox(-0.9252F, -0.1444F, -2.674F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.2F, 6.0958F, -7.4492F, 0.9076F, 0.0F, -0.0349F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(108, 39).mirror().addBox(-0.217F, -0.1563F, 0.3181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(68, 28).mirror().addBox(-0.217F, -1.2563F, -1.1819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 4.3958F, 0.0758F, 1.9585F, 0.1649F, -0.2316F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(76, 102).mirror().addBox(-0.217F, -0.5986F, -1.2827F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 4.3958F, 0.0758F, 1.5222F, 0.1649F, -0.2316F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(103, 4).mirror().addBox(-0.217F, 0.247F, -0.959F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 4.3958F, 0.0758F, 1.2604F, 0.1649F, -0.2316F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(109, 67).mirror().addBox(-0.217F, 3.2395F, 0.6293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(63, 111).mirror().addBox(-0.217F, 3.2395F, 0.0293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 4.3958F, 0.0758F, 0.859F, 0.1649F, -0.2316F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-0.217F, 3.0362F, -0.9882F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 4.3958F, 0.0758F, 1.3826F, 0.1649F, -0.2316F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(10, 108).mirror().addBox(-0.217F, 0.7435F, -4.3817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 4.3958F, 0.0758F, 2.2552F, 0.1649F, -0.2316F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(16, 103).mirror().addBox(-0.217F, 1.9195F, -0.9846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 4.3958F, 0.0758F, 1.2517F, 0.1649F, -0.2316F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(69, 103).mirror().addBox(-0.217F, 1.8412F, -0.4303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 4.3958F, 0.0758F, 0.9899F, 0.1649F, -0.2316F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(107, 81).mirror().addBox(-0.217F, 1.8768F, -0.6757F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 4.3958F, 0.0758F, 1.2953F, 0.1649F, -0.2316F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(45, 103).mirror().addBox(-0.217F, 0.3251F, -0.234F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 4.3958F, 0.0758F, 1.0858F, 0.1649F, -0.2316F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(14, 90).mirror().addBox(-0.217F, -1.1075F, -0.9947F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 4.3958F, 0.0758F, 0.7804F, 0.1649F, -0.2316F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(67, 82).mirror().addBox(-0.2F, -2.1752F, -6.4949F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 3.0958F, -1.7242F, 0.8378F, 0.0F, -0.3316F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(58, 82).mirror().addBox(-0.2F, -1.3266F, -4.1782F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 3.0958F, -1.7242F, 0.6196F, 0.0F, -0.3316F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(85, 34).mirror().addBox(-0.2F, -1.8414F, -4.0754F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 3.0958F, -1.7242F, 0.7505F, 0.0F, -0.3316F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(64, 63).mirror().addBox(-0.5F, -1.7515F, -3.8735F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3935F, -0.488F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(74, 30).mirror().addBox(-1.0F, -0.8902F, -2.8985F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6016F, -0.2838F, 0.0262F, 0.0F, 0.3491F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(15, 64).mirror().addBox(-1.0F, -0.9263F, -0.5992F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6016F, -0.2838F, 0.1571F, 0.0F, 0.3491F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(21, 21).addBox(-1.0F, -0.8174F, -6.9876F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.01F))
				.texOffs(106, 44).addBox(0.0F, -4.5174F, -4.9876F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2962F, -5.9128F, 0.0351F, 0.0F, 0.0F));

		PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(107, 77).mirror().addBox(-1.9922F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1162F, -0.485F, -0.0136F, -0.0372F, -0.6536F));

		PartDefinition cube_r65 = Body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(18, 83).mirror().addBox(-2.8686F, -0.6909F, -0.4985F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1162F, -2.485F, 0.0234F, -0.0028F, -1.3176F));

		PartDefinition cube_r66 = Body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(107, 62).mirror().addBox(-1.9922F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1162F, -2.485F, 0.0211F, -0.0106F, -0.9686F));

		PartDefinition cube_r67 = Body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(38, 98).mirror().addBox(-4.8686F, -0.6909F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1162F, -4.485F, 0.1275F, 0.1588F, -1.2047F));

		PartDefinition cube_r68 = Body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(107, 87).mirror().addBox(-1.9922F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1162F, -4.485F, 0.1739F, 0.1059F, -0.8566F));

		PartDefinition cube_r69 = Body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(28, 64).mirror().addBox(-5.1203F, -2.6846F, -0.4985F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1162F, -6.485F, 0.0526F, 0.2323F, -1.5756F));

		PartDefinition cube_r70 = Body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(42, 9).mirror().addBox(-4.8686F, -0.6909F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1162F, -6.485F, 0.1468F, 0.1881F, -1.1316F));

		PartDefinition cube_r71 = Body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(51, 9).mirror().addBox(-1.9922F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1162F, -6.485F, 0.202F, 0.1269F, -0.7835F));

		PartDefinition cube_r72 = Body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(107, 77).addBox(-0.0078F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1162F, -0.485F, -0.0136F, 0.0372F, 0.6536F));

		PartDefinition cube_r73 = Body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(107, 62).addBox(-0.0078F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1162F, -2.485F, 0.0211F, 0.0106F, 0.9686F));

		PartDefinition cube_r74 = Body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(18, 83).addBox(1.8686F, -0.6909F, -0.4985F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1162F, -2.485F, 0.0234F, 0.0028F, 1.3176F));

		PartDefinition cube_r75 = Body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(107, 87).addBox(-0.0078F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1162F, -4.485F, 0.1739F, -0.1059F, 0.8566F));

		PartDefinition cube_r76 = Body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(38, 98).addBox(1.8686F, -0.6909F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1162F, -4.485F, 0.1275F, -0.1588F, 1.2047F));

		PartDefinition cube_r77 = Body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(51, 9).addBox(-0.0078F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1162F, -6.485F, 0.202F, -0.1269F, 0.7835F));

		PartDefinition cube_r78 = Body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(42, 9).addBox(1.8686F, -0.6909F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1162F, -6.485F, 0.1468F, -0.1881F, 1.1316F));

		PartDefinition cube_r79 = Body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(28, 64).addBox(4.1203F, -2.6846F, -0.4985F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1162F, -6.485F, 0.0526F, -0.2323F, 1.5756F));

		PartDefinition cube_r80 = Body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(106, 64).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8174F, -0.9876F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r81 = Body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(106, 50).addBox(0.0F, -3.8F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8174F, -2.9876F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r82 = Body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(106, 31).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8174F, -6.9876F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r83 = Body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 73).addBox(-2.0F, -1.9012F, -0.0338F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 8.6827F, -7.0876F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r84 = Body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(34, 89).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -4.8919F, -1.9907F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r85 = Body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(59, 21).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -4.7173F, -6.9876F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = Body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(34, 58).addBox(-1.0F, -0.9F, -5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.01F))
				.texOffs(57, 31).addBox(-1.0F, -4.8F, -5.6F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0827F, -6.8876F, 0.0873F, 0.0435F, 0.0038F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(31, 106).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -2.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(106, 8).addBox(0.0F, -3.8F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -4.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(57, 39).addBox(-2.0F, -1.9627F, -3.9945F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 8.6F, -1.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(83, 107).mirror().addBox(-6.0495F, -2.6868F, -0.4736F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0336F, -1.4974F, 0.0526F, 0.2323F, -1.5233F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(97, 68).mirror().addBox(-4.8054F, -0.7228F, -0.4736F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0336F, -1.4974F, 0.1468F, 0.1881F, -1.0792F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(107, 85).mirror().addBox(-1.9438F, -0.0617F, -0.4736F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0336F, -1.4974F, 0.202F, 0.1269F, -0.7311F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(97, 66).mirror().addBox(-4.9644F, -0.6339F, -0.4907F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0336F, -3.4974F, 0.1762F, 0.2318F, -1.0207F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(104, 29).mirror().addBox(-6.2312F, -2.6734F, -0.4907F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0336F, -3.4974F, 0.06F, 0.2842F, -1.469F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(103, 42).mirror().addBox(-2.0628F, 0.0762F, -0.4907F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0336F, -3.4974F, 0.2444F, 0.1582F, -0.6727F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(107, 85).addBox(-0.0562F, -0.0617F, -0.4736F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0336F, -1.4974F, 0.202F, -0.1269F, 0.7311F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(97, 68).addBox(1.8054F, -0.7228F, -0.4736F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0336F, -1.4974F, 0.1468F, -0.1881F, 1.0792F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(83, 107).addBox(4.0495F, -2.6868F, -0.4736F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0336F, -1.4974F, 0.0526F, -0.2323F, 1.5233F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(103, 42).addBox(0.0628F, 0.0762F, -0.4907F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0336F, -3.4974F, 0.2444F, -0.1582F, 0.6727F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(104, 29).addBox(4.2312F, -2.6734F, -0.4907F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0336F, -3.4974F, 0.06F, -0.2842F, 1.469F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(97, 66).addBox(1.9644F, -0.6339F, -0.4907F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0336F, -3.4974F, 0.1762F, -0.2318F, 1.0207F));

		PartDefinition Chest = body2.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -0.9257F, -5.8529F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.0874F, 0.0F, 0.0F));

		PartDefinition cube_r101 = Chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.4F, 0.0F, -0.3F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6773F, 6.2705F, -4.5794F, -0.3522F, -0.5776F, 0.4892F));

		PartDefinition cube_r102 = Chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(65, 70).mirror().addBox(-0.4F, 0.0F, -0.9F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6773F, 6.2705F, -4.5794F, -0.3788F, -0.8321F, 0.6105F));

		PartDefinition cube_r103 = Chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(5, 88).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 6.143F, -5.5558F, -0.204F, -1.0571F, 0.7192F));

		PartDefinition cube_r104 = Chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(85, 85).mirror().addBox(-0.625F, -0.5F, -0.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8434F, 5.831F, -6.5451F, -0.3348F, 0.4149F, -0.1393F));

		PartDefinition cube_r105 = Chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(47, 99).mirror().addBox(-0.1F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4328F, 5.194F, -8.3758F, -1.0621F, -0.1298F, 0.228F));

		PartDefinition cube_r106 = Chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(81, 58).mirror().addBox(-1.9922F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0023F, -0.3971F, 0.2161F, 0.1374F, -0.642F));

		PartDefinition cube_r107 = Chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(92, 56).mirror().addBox(-4.8686F, -0.6909F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0023F, -0.3971F, 0.1565F, 0.2027F, -0.99F));

		PartDefinition cube_r108 = Chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(68, 60).mirror().addBox(-7.1203F, -2.6846F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0023F, -0.3971F, 0.0551F, 0.2496F, -1.4354F));

		PartDefinition cube_r109 = Chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(17, 97).mirror().addBox(-7.1203F, -2.6846F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0023F, -2.4971F, 0.0675F, 0.336F, -1.4842F));

		PartDefinition cube_r110 = Chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(96, 8).mirror().addBox(-4.8686F, -0.6909F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0023F, -2.4971F, 0.2063F, 0.2754F, -1.0306F));

		PartDefinition cube_r111 = Chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(107, 22).mirror().addBox(-1.9922F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0023F, -2.4971F, 0.2872F, 0.1892F, -0.6828F));

		PartDefinition cube_r112 = Chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(94, 43).mirror().addBox(-4.8686F, -0.6909F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0023F, -4.3971F, 0.2475F, 0.3331F, -1.0881F));

		PartDefinition cube_r113 = Chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(106, 37).mirror().addBox(-1.9922F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0023F, -4.3971F, 0.3451F, 0.2301F, -0.7405F));

		PartDefinition cube_r114 = Chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(101, 56).mirror().addBox(-6.1203F, -2.6846F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0023F, -4.3971F, 0.078F, 0.4051F, -1.5502F));

		PartDefinition cube_r115 = Chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(68, 60).addBox(4.1203F, -2.6846F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0023F, -0.3971F, 0.0551F, -0.2496F, 1.4354F));

		PartDefinition cube_r116 = Chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(92, 56).addBox(1.8686F, -0.6909F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0023F, -0.3971F, 0.1565F, -0.2027F, 0.99F));

		PartDefinition cube_r117 = Chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(81, 58).addBox(-0.0078F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0023F, -0.3971F, 0.2161F, -0.1374F, 0.642F));

		PartDefinition cube_r118 = Chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(107, 22).addBox(-0.0078F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0023F, -2.4971F, 0.2872F, -0.1892F, 0.6828F));

		PartDefinition cube_r119 = Chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(96, 8).addBox(1.8686F, -0.6909F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0023F, -2.4971F, 0.2063F, -0.2754F, 1.0306F));

		PartDefinition cube_r120 = Chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(17, 97).addBox(4.1203F, -2.6846F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0023F, -2.4971F, 0.0675F, -0.336F, 1.4842F));

		PartDefinition cube_r121 = Chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(94, 43).addBox(1.8686F, -0.6909F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0023F, -4.3971F, 0.2475F, -0.3331F, 1.0881F));

		PartDefinition cube_r122 = Chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(101, 56).addBox(4.1203F, -2.6846F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0023F, -4.3971F, 0.078F, -0.4051F, 1.5502F));

		PartDefinition cube_r123 = Chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(106, 37).addBox(-0.0078F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0023F, -4.3971F, 0.3451F, -0.2301F, 0.7405F));

		PartDefinition cube_r124 = Chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(104, 95).addBox(0.0F, -3.6945F, 0.0467F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9313F, -0.8996F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r125 = Chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(104, 89).addBox(0.0F, -3.7195F, -0.0533F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9313F, -2.7996F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r126 = Chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(104, 83).addBox(0.0F, -3.5945F, 0.0467F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9313F, -4.8996F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r127 = Chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 60).addBox(-1.5F, -0.9801F, -4.0135F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.1687F, -0.6996F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r128 = Chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(47, 99).addBox(-0.9F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4328F, 5.194F, -8.3758F, -1.0621F, 0.1298F, -0.228F));

		PartDefinition cube_r129 = Chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(88, 66).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2445F, -8.3466F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r130 = Chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(81, 54).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3191F, -6.6599F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r131 = Chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(85, 85).addBox(-0.375F, -0.5F, -0.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8434F, 5.831F, -6.5451F, -0.3348F, -0.4149F, 0.1393F));

		PartDefinition cube_r132 = Chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(59, 0).addBox(-0.6F, 0.0F, -0.3F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6773F, 6.2705F, -4.5794F, -0.3522F, 0.5776F, -0.4892F));

		PartDefinition cube_r133 = Chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(65, 70).addBox(-0.6F, 0.0F, -0.9F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6773F, 6.2705F, -4.5794F, -0.3788F, 0.8321F, -0.6105F));

		PartDefinition cube_r134 = Chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(5, 88).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 6.143F, -5.5558F, -0.204F, 1.0571F, -0.7192F));

		PartDefinition cube_r135 = Chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(99, 10).addBox(-0.5F, -0.7F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 6.5743F, -4.8529F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r136 = Chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(59, 14).addBox(-1.0F, -0.9945F, -0.0533F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7312F, -5.0996F, 0.0175F, 0.0F, 0.0F));

		PartDefinition bone2 = Chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.4234F, -4.4806F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r137 = bone2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(110, 70).addBox(-0.5F, -0.9588F, -1.0166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1895F, 4.1102F, -0.6302F, -0.6091F, 0.0F, 0.0F));

		PartDefinition cube_r138 = bone2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(53, 110).addBox(-0.5F, -1.0006F, -0.0175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1895F, 4.1102F, -1.6302F, -0.0418F, 0.0F, 0.0F));

		PartDefinition cube_r139 = bone2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(82, 90).addBox(-0.4593F, -1.3473F, -1.4184F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5756F, 4.3342F, -1.646F, 2.8529F, 0.2025F, 0.6333F));

		PartDefinition cube_r140 = bone2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(86, 103).addBox(-0.4593F, -1.8802F, -1.558F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5756F, 4.3342F, -1.646F, -2.9067F, 0.2025F, 0.6333F));

		PartDefinition cube_r141 = bone2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(85, 29).addBox(-0.4593F, 0.2297F, 0.2406F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.606F, 5.3849F, -2.6631F, 1.9715F, 0.2025F, 0.6333F));

		PartDefinition cube_r142 = bone2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(81, 102).addBox(-0.4593F, -2.2609F, -0.5348F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5756F, 4.3342F, -1.646F, 0.6276F, 0.2025F, 0.6333F));

		PartDefinition cube_r143 = bone2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(90, 23).addBox(-0.5F, -0.0128F, -1.3953F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1895F, 1.7102F, -1.3302F, 0.4818F, 0.0F, 0.0F));

		PartDefinition cube_r144 = bone2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(76, 82).addBox(-0.5F, -0.75F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 83).addBox(-0.5F, -0.25F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1895F, 1.5102F, -0.3302F, 1.0054F, 0.0F, 0.0F));

		PartDefinition cube_r145 = bone2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 107).addBox(-0.5F, 0.02F, -0.9806F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1895F, -2.0898F, 1.6698F, 0.953F, 0.0F, 0.0F));

		PartDefinition cube_r146 = bone2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(105, 70).addBox(-0.5F, 0.0039F, 0.0013F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1895F, -1.3898F, -0.4302F, 1.433F, 0.0F, 0.0F));

		PartDefinition cube_r147 = bone2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(63, 96).addBox(-0.5F, -0.7065F, -0.5036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1895F, 0.1102F, 0.2698F, 1.5639F, 0.0F, 0.0F));

		PartDefinition cube_r148 = bone2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(34, 110).addBox(-0.5F, -0.425F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1895F, -0.4763F, 1.7323F, 0.22F, 0.0F, 0.0F));

		PartDefinition cube_r149 = bone2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(28, 93).addBox(-0.5F, -0.8065F, 0.1964F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1895F, 0.1102F, 0.2698F, 1.2235F, 0.0F, 0.0F));

		PartDefinition cube_r150 = bone2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(96, 4).addBox(-0.5F, -0.0065F, -0.0036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1895F, 0.1102F, 0.2698F, 0.6999F, 0.0F, 0.0F));

		PartDefinition bone4 = Chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.4234F, -4.4806F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r151 = bone4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(110, 70).mirror().addBox(-0.5F, -0.9588F, -1.0166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1895F, 4.1102F, -0.6302F, -0.6091F, 0.0F, 0.0F));

		PartDefinition cube_r152 = bone4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(53, 110).mirror().addBox(-0.5F, -1.0006F, -0.0175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1895F, 4.1102F, -1.6302F, -0.0418F, 0.0F, 0.0F));

		PartDefinition cube_r153 = bone4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(82, 90).mirror().addBox(-0.5407F, -1.3473F, -1.4184F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5756F, 4.3342F, -1.646F, 2.8529F, -0.2025F, -0.6333F));

		PartDefinition cube_r154 = bone4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(86, 103).mirror().addBox(-0.5407F, -1.8802F, -1.558F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5756F, 4.3342F, -1.646F, -2.9067F, -0.2025F, -0.6333F));

		PartDefinition cube_r155 = bone4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(85, 29).mirror().addBox(-0.5407F, 0.2297F, 0.2406F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.606F, 5.3849F, -2.6631F, 1.9715F, -0.2025F, -0.6333F));

		PartDefinition cube_r156 = bone4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(81, 102).mirror().addBox(-0.5407F, -2.2609F, -0.5348F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5756F, 4.3342F, -1.646F, 0.6276F, -0.2025F, -0.6333F));

		PartDefinition cube_r157 = bone4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(90, 23).mirror().addBox(-0.5F, -0.0128F, -1.3953F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1895F, 1.7102F, -1.3302F, 0.4818F, 0.0F, 0.0F));

		PartDefinition cube_r158 = bone4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(76, 82).mirror().addBox(-0.5F, -0.75F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 83).mirror().addBox(-0.5F, -0.25F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1895F, 1.5102F, -0.3302F, 1.0054F, 0.0F, 0.0F));

		PartDefinition cube_r159 = bone4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-0.5F, 0.02F, -0.9806F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1895F, -2.0898F, 1.6698F, 0.953F, 0.0F, 0.0F));

		PartDefinition cube_r160 = bone4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(105, 70).mirror().addBox(-0.5F, 0.0039F, 0.0013F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1895F, -1.3898F, -0.4302F, 1.433F, 0.0F, 0.0F));

		PartDefinition cube_r161 = bone4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(63, 96).mirror().addBox(-0.5F, -0.7065F, -0.5036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1895F, 0.1102F, 0.2698F, 1.5639F, 0.0F, 0.0F));

		PartDefinition cube_r162 = bone4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(34, 110).mirror().addBox(-0.5F, -0.425F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1895F, -0.4763F, 1.7323F, 0.22F, 0.0F, 0.0F));

		PartDefinition cube_r163 = bone4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(28, 93).mirror().addBox(-0.5F, -0.8065F, 0.1964F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1895F, 0.1102F, 0.2698F, 1.2235F, 0.0F, 0.0F));

		PartDefinition cube_r164 = bone4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(96, 4).mirror().addBox(-0.5F, -0.0065F, -0.0036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1895F, 0.1102F, 0.2698F, 0.6999F, 0.0F, 0.0F));

		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0313F, -5.8996F, -0.1768F, 0.1719F, -0.0305F));

		PartDefinition cube_r165 = Neck.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(49, 82).mirror().addBox(0.2637F, -1.3437F, 0.3151F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3139F, -3.4378F, -0.6951F, -0.3568F, 0.2551F));

		PartDefinition cube_r166 = Neck.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(49, 82).addBox(-0.2637F, -1.3437F, 0.3151F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3139F, -3.4378F, -0.6951F, 0.3568F, -0.2551F));

		PartDefinition cube_r167 = Neck.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(107, 79).mirror().addBox(-1.9922F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0336F, -0.3974F, 0.3813F, 0.4494F, -0.7903F));

		PartDefinition cube_r168 = Neck.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(97, 19).mirror().addBox(-4.8686F, -0.6909F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0336F, -0.3974F, 0.1965F, 0.5502F, -1.1719F));

		PartDefinition cube_r169 = Neck.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(21, 90).mirror().addBox(-5.1203F, -2.6846F, -0.4985F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0336F, -0.3974F, -0.0837F, 0.5754F, -1.6887F));

		PartDefinition cube_r170 = Neck.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(107, 79).addBox(-0.0078F, -0.0101F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0336F, -0.3974F, 0.3813F, -0.4494F, 0.7903F));

		PartDefinition cube_r171 = Neck.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(97, 19).addBox(1.8686F, -0.6909F, -0.4985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0336F, -0.3974F, 0.1965F, -0.5502F, 1.1719F));

		PartDefinition cube_r172 = Neck.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(21, 90).addBox(4.1203F, -2.6846F, -0.4985F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0336F, -0.3974F, -0.0837F, -0.5754F, 1.6887F));

		PartDefinition cube_r173 = Neck.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(104, 101).addBox(0.0F, -3.7625F, -0.0936F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8558F, -2.7748F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Neck.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(104, 77).addBox(0.0F, -3.6538F, 0.0075F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8558F, -0.8748F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Neck.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0F, -0.1235F, -0.2594F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -4.6983F, -2.7431F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r176 = Neck.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(28, 66).addBox(-1.0F, -0.9235F, 0.0406F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.1442F, -3.8748F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0994F, -3.5716F, -0.1355F, 0.1356F, 0.0241F));

		PartDefinition cube_r177 = Neck2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(109, 24).mirror().addBox(-0.3294F, -0.2482F, -1.579F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 84).mirror().addBox(0.0F, -0.6828F, -0.0112F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7942F, -2.0303F, -0.5215F, -0.1517F, 0.0866F));

		PartDefinition cube_r178 = Neck2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(109, 24).addBox(0.3294F, -0.2482F, -1.579F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(94, 84).addBox(0.0F, -0.6828F, -0.0112F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7942F, -2.0303F, -0.5215F, 0.1517F, -0.0866F));

		PartDefinition cube_r179 = Neck2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(59, 104).addBox(0.0F, -3.6744F, 0.0117F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9042F, -1.8447F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r180 = Neck2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(26, 108).addBox(0.0F, -3.3082F, -0.0659F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2042F, -3.7447F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r181 = Neck2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(13, 71).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6316F, -3.6926F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r182 = Neck2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(68, 53).addBox(-1.0F, -1.0F, -0.2F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1042F, -3.7447F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -3.8F, 0.2495F, 0.1723F, 0.028F));

		PartDefinition cube_r183 = Neck3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(109, 8).mirror().addBox(-0.3294F, -0.4482F, -1.079F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 95).mirror().addBox(0.0F, -0.9828F, 0.5888F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7942F, -2.0303F, -0.5215F, -0.1517F, 0.0866F));

		PartDefinition cube_r184 = Neck3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(109, 8).addBox(0.3294F, -0.4482F, -1.079F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(87, 95).addBox(0.0F, -0.9828F, 0.5888F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7942F, -2.0303F, -0.5215F, 0.1517F, -0.0866F));

		PartDefinition cube_r185 = Neck3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(93, 111).addBox(0.0F, -2.7909F, -0.9893F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8042F, -0.3447F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r186 = Neck3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(101, 34).addBox(0.0F, -1.6067F, -0.0903F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0042F, -3.7447F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r187 = Neck3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(77, 65).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0679F, -4.0861F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r188 = Neck3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(89, 70).addBox(-1.0F, -1.0F, 0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8381F, -1.394F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r189 = Neck3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(68, 46).addBox(-1.0F, -1.0F, -0.2F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1042F, -3.7447F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0242F, -3.3447F, 0.2268F, 0.1566F, 0.2849F));

		PartDefinition cube_r190 = Head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(59, 28).addBox(-1.5F, -1.4F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 46).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.7811F, -1.223F, -1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r191 = Head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(107, 18).addBox(-0.5F, -1.95F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0058F, -11.0852F, -1.4268F, 0.0F, 0.0F));

		PartDefinition cube_r192 = Head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(27, 85).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.7943F, -5.7441F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r193 = Head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(94, 33).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0967F, -3.8993F, -1.4006F, 0.0F, 0.0F));

		PartDefinition cube_r194 = Head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(87, 5).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.7811F, -1.223F, -1.3308F, 0.0F, 0.0F));

		PartDefinition cube_r195 = Head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(49, 63).addBox(-1.5F, 0.0F, -2.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 0.6616F, -0.1985F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r196 = Head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(37, 77).addBox(-1.5F, 0.0F, -1.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.398F, 0.1141F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r197 = Head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(101, 74).addBox(0.5F, -0.475F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.3F, -0.7752F, 0.2287F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r198 = Head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(54, 101).addBox(0.5F, -2.1F, -2.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(101, 39).addBox(0.5F, -2.1F, -2.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(88, 15).addBox(0.5F, -0.4F, -1.075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3F, 1.9043F, 0.1746F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r199 = Head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(88, 19).addBox(0.5F, -0.2F, -1.275F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.3F, 1.9043F, 0.1746F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r200 = Head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(74, 42).addBox(-1.5F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 2.238F, -1.9582F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r201 = Head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(44, 114).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.561F, -11.9238F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r202 = Head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(114, 25).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5579F, -12.0023F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r203 = Head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(24, 80).addBox(-1.5F, -3.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.3427F, -3.9554F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r204 = Head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(59, 7).addBox(-1.5F, -3.0F, 0.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 2.3427F, -3.9554F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.925F, 2.3427F, -9.5554F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(78, 112).addBox(1.0F, -0.35F, 2.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(73, 112).addBox(0.925F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -1.2775F, 5.5358F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(21, 107).addBox(1.0F, -0.1F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8F, -3.1654F, 7.1937F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(45, 107).addBox(1.0F, -0.025F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.8F, -3.1654F, 7.1937F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(112, 81).addBox(1.0F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8F, -1.6233F, 8.4461F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(107, 58).addBox(1.0F, -1.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.8F, -1.7172F, 7.7453F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(112, 95).addBox(1.125F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(53, 113).addBox(1.3F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.875F, -2.323F, 5.9789F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(112, 34).addBox(1.0F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 42).addBox(1.0F, -0.65F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.875F, -2.323F, 5.9789F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(112, 57).addBox(1.0F, -0.625F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(112, 48).addBox(1.0F, -0.425F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(112, 51).addBox(1.0F, -0.625F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.875F, -1.8679F, 5.7425F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(112, 45).addBox(1.0F, -0.95F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.875F, -2.3572F, 6.927F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(5, 111).addBox(-0.5F, -0.7987F, -0.3256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 111).addBox(-0.5F, -0.9987F, -0.4256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(15, 111).addBox(-0.5F, -0.9987F, -0.9256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.425F, -1.1987F, -0.9156F, 0.2269F, 0.1571F, -0.0524F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(88, 111).addBox(-0.4993F, -0.4357F, -0.1508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.3084F, -1.8337F, -1.0875F, -0.1484F, 0.1571F, 0.0F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(68, 111).addBox(-0.4993F, -0.4829F, -0.2863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3084F, -1.8337F, -1.0875F, 0.2443F, 0.1571F, 0.0F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(97, 15).addBox(-0.5F, -0.55F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1603F, -1.8012F, 0.6625F, 0.0524F, 0.0698F, 0.0F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(97, 58).addBox(-0.4529F, -0.3433F, -1.3065F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1945F, -1.5666F, 3.2257F, -0.3403F, 0.1484F, 0.0F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(81, 23).addBox(-0.9876F, -2.1921F, 2.8025F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, 0.1571F, 0.0F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(83, 112).addBox(-0.6011F, -0.4455F, 0.1125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 89).addBox(-0.4493F, -0.5992F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.1945F, -1.5666F, 3.2257F, -0.2094F, 0.1484F, 0.0F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(112, 92).addBox(-0.4529F, -0.6811F, -1.0927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1945F, -1.5666F, 3.2257F, 0.0524F, 0.1484F, 0.0F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(56, 92).addBox(-0.9876F, -0.9298F, 3.7022F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2705F, 0.1571F, 0.0F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(49, 88).addBox(-1.8485F, -3.8505F, -0.4857F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4991F, -3.0252F, 5.092F, -1.4099F, -0.1014F, -0.0339F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(94, 38).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.575F, -3.4249F, 5.4867F, -1.3631F, 0.172F, 0.0299F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(87, 39).addBox(-1.8648F, -0.1906F, -0.3327F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4975F, -3.169F, 5.0335F, -1.3536F, 0.3526F, 0.0554F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(42, 81).addBox(-1.0F, 0.15F, -0.05F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.275F, -3.0138F, 3.8325F, -1.4075F, 0.1349F, 0.024F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(108, 0).addBox(-0.65F, -1.05F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(105, 107).addBox(-0.65F, -1.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(107, 101).addBox(-0.65F, -0.95F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3596F, 0.182F, 3.5753F, 0.2692F, 0.1234F, -0.0618F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(100, 107).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0437F, 0.112F, 1.6063F, 0.096F, 0.1571F, -0.0524F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(107, 97).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.0789F, 0.1196F, 0.5979F, -0.1222F, 0.1571F, -0.0524F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(114, 54).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(114, 9).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0826F, 0.8355F, 0.3382F, 0.4014F, 0.1571F, -0.0524F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(95, 107).addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0789F, 0.1196F, 0.5979F, 0.0524F, 0.1571F, -0.0524F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(107, 93).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2726F, 0.0833F, -0.3785F, -0.1222F, 0.1571F, -0.0524F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(90, 107).addBox(-0.5F, -0.8F, 0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(107, 89).addBox(-0.5F, -1.1F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5379F, -0.4979F, -1.859F, -0.2531F, 0.1571F, -0.0524F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(26, 73).addBox(-0.7311F, 0.0065F, -3.1076F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1721F, -2.5683F, 2.4606F, 0.0698F, 0.0698F, 0.0F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(15, 114).addBox(-0.5F, -0.0987F, -1.1256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 111).addBox(-0.5F, -0.0987F, -0.7256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.425F, -1.1987F, -0.9156F, -0.384F, 0.1571F, -0.0524F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(91, 103).addBox(-0.5F, -1.0782F, 0.1948F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.425F, -1.1987F, -0.9156F, -0.2967F, 0.1571F, -0.0524F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(26, 104).addBox(-0.7311F, -1.9495F, -0.1073F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1658F, 0.0698F, 0.0F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(104, 25).addBox(-0.7311F, -1.8719F, 0.8849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0785F, 0.0698F, 0.0F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(104, 14).addBox(-0.7311F, -1.7081F, 1.8666F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0087F, 0.0698F, 0.0F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(96, 103).addBox(-0.9876F, -1.0923F, 2.7454F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2269F, 0.1571F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.925F, 2.3427F, -9.5554F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(78, 112).mirror().addBox(-2.0F, -0.35F, 2.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(73, 112).mirror().addBox(-1.925F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, -1.2775F, 5.5358F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(21, 107).mirror().addBox(-2.0F, -0.1F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8F, -3.1654F, 7.1937F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(45, 107).mirror().addBox(-2.0F, -0.025F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.8F, -3.1654F, 7.1937F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(112, 81).mirror().addBox(-2.0F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8F, -1.6233F, 8.4461F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(107, 58).mirror().addBox(-2.0F, -1.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.8F, -1.7172F, 7.7453F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(112, 95).mirror().addBox(-2.125F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(53, 113).mirror().addBox(-2.3F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.875F, -2.323F, 5.9789F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(112, 34).mirror().addBox(-2.0F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 42).mirror().addBox(-2.0F, -0.65F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.875F, -2.323F, 5.9789F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(112, 57).mirror().addBox(-2.0F, -0.625F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(112, 48).mirror().addBox(-2.0F, -0.425F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(112, 51).mirror().addBox(-2.0F, -0.625F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.875F, -1.8679F, 5.7425F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(112, 45).mirror().addBox(-2.0F, -0.95F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.875F, -2.3572F, 6.927F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(5, 111).mirror().addBox(-0.5F, -0.7987F, -0.3256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 111).mirror().addBox(-0.5F, -0.9987F, -0.4256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(15, 111).mirror().addBox(-0.5F, -0.9987F, -0.9256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.425F, -1.1987F, -0.9156F, 0.2269F, -0.1571F, 0.0524F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(88, 111).mirror().addBox(-0.5007F, -0.4357F, -0.1508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.3084F, -1.8337F, -1.0875F, -0.1484F, -0.1571F, 0.0F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(68, 111).mirror().addBox(-0.5007F, -0.4829F, -0.2863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3084F, -1.8337F, -1.0875F, 0.2443F, -0.1571F, 0.0F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(97, 15).mirror().addBox(-0.5F, -0.55F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1603F, -1.8012F, 0.6625F, 0.0524F, -0.0698F, 0.0F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(97, 58).mirror().addBox(-0.5471F, -0.3433F, -1.3065F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1945F, -1.5666F, 3.2257F, -0.3403F, -0.1484F, 0.0F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(81, 23).mirror().addBox(-0.0124F, -2.1921F, 2.8025F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, -0.1571F, 0.0F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(83, 112).mirror().addBox(-0.3989F, -0.4455F, 0.1125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 89).mirror().addBox(-0.5508F, -0.5992F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.1945F, -1.5666F, 3.2257F, -0.2094F, -0.1484F, 0.0F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(112, 92).mirror().addBox(-0.5471F, -0.6811F, -1.0927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1945F, -1.5666F, 3.2257F, 0.0524F, -0.1484F, 0.0F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(56, 92).mirror().addBox(-0.0124F, -0.9298F, 3.7022F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2705F, -0.1571F, 0.0F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(49, 88).mirror().addBox(-0.1515F, -3.8505F, -0.4857F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4991F, -3.0252F, 5.092F, -1.4099F, 0.1014F, 0.0339F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(94, 38).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.575F, -3.4249F, 5.4867F, -1.3631F, -0.172F, -0.0299F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(87, 39).mirror().addBox(-0.1352F, -0.1906F, -0.3327F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4975F, -3.169F, 5.0335F, -1.3536F, -0.3526F, -0.0554F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(42, 81).mirror().addBox(0.0F, 0.15F, -0.05F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.275F, -3.0138F, 3.8325F, -1.4075F, -0.1349F, -0.024F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(108, 0).mirror().addBox(-0.35F, -1.05F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(105, 107).mirror().addBox(-0.35F, -1.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(107, 101).mirror().addBox(-0.35F, -0.95F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3596F, 0.182F, 3.5753F, 0.2692F, -0.1234F, 0.0618F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(100, 107).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0437F, 0.112F, 1.6063F, 0.096F, -0.1571F, 0.0524F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(107, 97).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.0789F, 0.1196F, 0.5979F, -0.1222F, -0.1571F, 0.0524F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(114, 54).mirror().addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(114, 9).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0826F, 0.8355F, 0.3382F, 0.4014F, -0.1571F, 0.0524F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(95, 107).mirror().addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0789F, 0.1196F, 0.5979F, 0.0524F, -0.1571F, 0.0524F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(107, 93).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2726F, 0.0833F, -0.3785F, -0.1222F, -0.1571F, 0.0524F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(90, 107).mirror().addBox(-0.5F, -0.8F, 0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(107, 89).mirror().addBox(-0.5F, -1.1F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.5379F, -0.4979F, -1.859F, -0.2531F, -0.1571F, 0.0524F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(26, 73).mirror().addBox(-0.2689F, 0.0065F, -3.1076F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1721F, -2.5683F, 2.4606F, 0.0698F, -0.0698F, 0.0F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(15, 114).mirror().addBox(-0.5F, -0.0987F, -1.1256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 111).mirror().addBox(-0.5F, -0.0987F, -0.7256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.425F, -1.1987F, -0.9156F, -0.384F, -0.1571F, 0.0524F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(91, 103).mirror().addBox(-0.5F, -1.0782F, 0.1948F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.425F, -1.1987F, -0.9156F, -0.2967F, -0.1571F, 0.0524F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(26, 104).mirror().addBox(-0.2689F, -1.9495F, -0.1073F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1658F, -0.0698F, 0.0F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(104, 25).mirror().addBox(-0.2689F, -1.8719F, 0.8849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0785F, -0.0698F, 0.0F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(104, 14).mirror().addBox(-0.2689F, -1.7081F, 1.8666F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0087F, -0.0698F, 0.0F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(96, 103).mirror().addBox(-0.0124F, -1.0923F, 2.7454F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2269F, -0.1571F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.4351F, -0.0478F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r277 = Jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(9, 83).mirror().addBox(-2.5F, -1.5F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(111, 28).mirror().addBox(-2.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 83).addBox(0.3F, -1.5F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(111, 28).addBox(0.3F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 2.4979F, -1.9432F, 0.2662F, 0.0F, 0.0F));

		PartDefinition cube_r278 = Jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(112, 98).mirror().addBox(-2.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(112, 98).addBox(0.3F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6F, 2.0131F, -1.0686F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r279 = Jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(97, 62).mirror().addBox(-2.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 62).addBox(0.3F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.7544F, 0.4857F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r280 = Jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(85, 75).mirror().addBox(-0.2881F, 0.3934F, 1.2215F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6889F, 1.6014F, -8.2597F, 0.0436F, -0.2269F, -0.048F));

		PartDefinition cube_r281 = Jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(58, 111).mirror().addBox(-2.5F, -1.025F, 3.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 111).mirror().addBox(-2.5F, -1.025F, 3.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(58, 111).addBox(0.3F, -1.025F, 3.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 111).addBox(0.3F, -1.025F, 3.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6F, 2.9673F, -7.2154F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r282 = Jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(70, 96).mirror().addBox(-0.4644F, -0.0683F, -0.3304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6889F, 1.6014F, -8.2597F, -0.2618F, -0.096F, -0.048F));

		PartDefinition cube_r283 = Jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(108, 74).mirror().addBox(-0.4644F, -0.0973F, -1.1564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6889F, 1.6014F, -8.2597F, -0.096F, -0.096F, -0.048F));

		PartDefinition cube_r284 = Jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(109, 64).mirror().addBox(-0.4644F, -0.2078F, -2.1442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6889F, 1.6014F, -8.2597F, 0.0F, -0.096F, -0.048F));

		PartDefinition cube_r285 = Jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(39, 110).mirror().addBox(-0.7123F, -0.6513F, -2.9806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6889F, 1.6014F, -8.2597F, 0.2182F, -0.2269F, -0.048F));

		PartDefinition cube_r286 = Jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(114, 22).mirror().addBox(-0.7123F, -0.7763F, -3.0549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(114, 12).mirror().addBox(-0.7123F, -1.4763F, -3.1549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(20, 114).mirror().addBox(-0.7123F, -0.7763F, -2.7549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6889F, 1.6014F, -8.2597F, 0.1309F, -0.2269F, -0.048F));

		PartDefinition cube_r287 = Jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(108, 4).mirror().addBox(-0.2881F, -0.9188F, 1.4835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6889F, 1.6014F, -8.2597F, 0.0873F, -0.2269F, -0.048F));

		PartDefinition cube_r288 = Jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-0.4644F, -1.2813F, 0.5509F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6889F, 1.6014F, -8.2597F, -0.0436F, -0.096F, -0.048F));

		PartDefinition cube_r289 = Jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(109, 12).mirror().addBox(-0.4644F, -1.227F, -0.258F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6889F, 1.6014F, -8.2597F, -0.0873F, -0.096F, -0.048F));

		PartDefinition cube_r290 = Jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(31, 102).mirror().addBox(-0.4644F, -1.2566F, -1.0897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(102, 21).mirror().addBox(-0.4644F, -1.0566F, -1.8897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6889F, 1.6014F, -8.2597F, -0.2182F, -0.096F, -0.048F));

		PartDefinition cube_r291 = Jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(43, 89).mirror().addBox(-0.7123F, -1.4957F, -2.5961F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6889F, 1.6014F, -8.2597F, -0.1309F, -0.2269F, -0.048F));

		PartDefinition cube_r292 = Jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-0.4644F, -0.2514F, -1.9751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6889F, 1.6014F, -8.2597F, -0.1484F, -0.096F, -0.048F));

		PartDefinition cube_r293 = Jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(38, 100).mirror().addBox(-0.4644F, -0.2604F, -0.1184F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6889F, 1.6014F, -8.2597F, 0.0436F, -0.096F, -0.048F));

		PartDefinition cube_r294 = Jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(94, 95).mirror().addBox(-0.2881F, -0.0363F, 1.6834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6889F, 1.6014F, -8.2597F, 0.1745F, -0.2269F, -0.048F));

		PartDefinition cube_r295 = Jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(31, 98).mirror().addBox(-2.5F, 0.0F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(31, 98).addBox(0.3F, 0.0F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.6308F, -3.1523F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r296 = Jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(74, 76).mirror().addBox(-2.5F, -1.8F, -2.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(74, 76).addBox(0.3F, -1.8F, -2.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6F, 1.7F, 0.0F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r297 = Jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(85, 75).addBox(-0.7119F, 0.3934F, 1.2215F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6889F, 1.6014F, -8.2597F, 0.0436F, 0.2269F, 0.048F));

		PartDefinition cube_r298 = Jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(70, 96).addBox(-0.5356F, -0.0683F, -0.3304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6889F, 1.6014F, -8.2597F, -0.2618F, 0.096F, 0.048F));

		PartDefinition cube_r299 = Jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(108, 74).addBox(-0.5356F, -0.0973F, -1.1564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6889F, 1.6014F, -8.2597F, -0.096F, 0.096F, 0.048F));

		PartDefinition cube_r300 = Jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(109, 64).addBox(-0.5356F, -0.2078F, -2.1442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6889F, 1.6014F, -8.2597F, 0.0F, 0.096F, 0.048F));

		PartDefinition cube_r301 = Jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(39, 110).addBox(-0.2877F, -0.6513F, -2.9806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6889F, 1.6014F, -8.2597F, 0.2182F, 0.2269F, 0.048F));

		PartDefinition cube_r302 = Jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(114, 22).addBox(-0.2877F, -0.7763F, -3.0549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(114, 12).addBox(-0.2877F, -1.4763F, -3.1549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(20, 114).addBox(-0.2877F, -0.7763F, -2.7549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6889F, 1.6014F, -8.2597F, 0.1309F, 0.2269F, 0.048F));

		PartDefinition cube_r303 = Jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(108, 4).addBox(-0.7119F, -0.9188F, 1.4835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6889F, 1.6014F, -8.2597F, 0.0873F, 0.2269F, 0.048F));

		PartDefinition cube_r304 = Jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(0, 103).addBox(-0.5356F, -1.2813F, 0.5509F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6889F, 1.6014F, -8.2597F, -0.0436F, 0.096F, 0.048F));

		PartDefinition cube_r305 = Jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(109, 12).addBox(-0.5356F, -1.227F, -0.258F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6889F, 1.6014F, -8.2597F, -0.0873F, 0.096F, 0.048F));

		PartDefinition cube_r306 = Jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(31, 102).addBox(-0.5356F, -1.2566F, -1.0897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(102, 21).addBox(-0.5356F, -1.0566F, -1.8897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6889F, 1.6014F, -8.2597F, -0.2182F, 0.096F, 0.048F));

		PartDefinition cube_r307 = Jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(43, 89).addBox(-0.2877F, -1.4957F, -2.5961F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6889F, 1.6014F, -8.2597F, -0.1309F, 0.2269F, 0.048F));

		PartDefinition cube_r308 = Jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(96, 0).addBox(-0.5356F, -0.2514F, -1.9751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6889F, 1.6014F, -8.2597F, -0.1484F, 0.096F, 0.048F));

		PartDefinition cube_r309 = Jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(38, 100).addBox(-0.5356F, -0.2604F, -0.1184F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6889F, 1.6014F, -8.2597F, 0.0436F, 0.096F, 0.048F));

		PartDefinition cube_r310 = Jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(94, 95).addBox(-0.7119F, -0.0363F, 1.6834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6889F, 1.6014F, -8.2597F, 0.1745F, 0.2269F, 0.048F));

		PartDefinition UpperArmL = Chest.addOrReplaceChild("UpperArmL", CubeListBuilder.create().texOffs(67, 87).addBox(-1.0F, -0.7359F, -0.4483F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.6F, 5.1419F, -6.4363F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r311 = UpperArmL.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(110, 111).addBox(-1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7359F, -0.4483F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r312 = UpperArmL.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(112, 19).addBox(-1.5F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.1481F, 1.074F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r313 = UpperArmL.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(112, 16).addBox(-1.5F, -2.05F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 112).addBox(-1.5F, -0.95F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7178F, -0.4447F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r314 = UpperArmL.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(105, 111).addBox(-1.5F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.2404F, -0.6647F, -0.6545F, 0.0F, 0.0F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create().texOffs(72, 87).addBox(-2.0F, 0.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(12, 95).addBox(-2.0F, 2.0F, -1.85F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 6.5962F, 1.205F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r315 = LowerArmL.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(16, 107).addBox(-1.0F, -1.8F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.0F, 2.2F, -1.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r316 = LowerArmL.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(5, 107).addBox(-1.0F, -1.8F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 2.2F, -1.0F, 0.2094F, 0.0F, 0.0F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(81, 46).addBox(-3.0F, -0.4F, -1.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 6.8148F, -0.8748F, 0.7418F, 0.0F, 0.0F));

		PartDefinition HandL2 = HandL.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(74, 0).addBox(-3.0F, -0.5F, -2.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1087F, -1.5985F, -0.6109F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = Chest.addOrReplaceChild("UpperArmL2", CubeListBuilder.create().texOffs(77, 87).addBox(0.0F, -0.7359F, -0.4483F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-4.6F, 5.1419F, -6.4363F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r317 = UpperArmL2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(113, 37).addBox(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7359F, -0.4483F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r318 = UpperArmL2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(34, 113).addBox(0.5F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 0.1481F, 1.074F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r319 = UpperArmL2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(113, 3).addBox(0.5F, -2.05F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 0).addBox(0.5F, -0.95F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.7178F, -0.4447F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r320 = UpperArmL2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(112, 101).addBox(0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 0.2404F, -0.6647F, -0.6545F, 0.0F, 0.0F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create().texOffs(0, 88).addBox(1.0F, 0.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(82, 95).addBox(1.0F, 2.0F, -1.85F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 6.5962F, 1.205F, -1.5388F, 0.2267F, -0.1632F));

		PartDefinition cube_r321 = LowerArmL2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(67, 107).addBox(0.0F, -1.8F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0F, 2.2F, -1.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r322 = LowerArmL2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(62, 107).addBox(0.0F, -1.8F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 2.2F, -1.0F, 0.2094F, 0.0F, 0.0F));

		PartDefinition HandL3 = LowerArmL2.addOrReplaceChild("HandL3", CubeListBuilder.create().texOffs(81, 50).addBox(0.0F, -0.4F, -1.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 6.8148F, -0.8748F, 1.7453F, 0.0F, 0.0F));

		PartDefinition HandL4 = HandL3.addOrReplaceChild("HandL4", CubeListBuilder.create().texOffs(74, 5).addBox(0.0F, -0.5F, -2.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1087F, -1.5985F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2212F, 0.9872F, -0.0981F, -0.1737F, 0.017F));

		PartDefinition cube_r323 = Tail.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(38, 41).mirror().addBox(-1.3F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2556F, 0.0596F, -0.0175F, 0.0524F, -0.0009F));

		PartDefinition cube_r324 = Tail.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(38, 41).addBox(-0.7F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2556F, 0.0596F, -0.0175F, -0.0524F, 0.0009F));

		PartDefinition cube_r325 = Tail.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(21, 11).addBox(-0.5F, -1.065F, 0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -3.7668F, 0.0209F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r326 = Tail.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.01F, -1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7481F, 1.0684F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r327 = Tail.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(101, 27).addBox(0.0F, -4.1F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6281F, 6.0684F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r328 = Tail.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(53, 104).addBox(0.0F, -3.8F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6281F, 4.0684F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r329 = Tail.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(101, 89).addBox(0.0F, -0.0701F, -0.6942F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1719F, 8.0684F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r330 = Tail.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(101, 83).addBox(0.0F, 0.0919F, -0.0212F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1719F, 5.0684F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r331 = Tail.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(101, 77).addBox(0.0F, -0.8001F, -0.2392F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1719F, 3.0684F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r332 = Tail.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(50, 109).addBox(0.0F, 0.0026F, -0.0994F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1719F, 0.0684F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r333 = Tail.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(74, 106).addBox(0.0F, -3.5F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7281F, 0.0684F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r334 = Tail.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(42, 104).addBox(0.0F, -3.6F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7281F, 2.0684F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(38, 31).addBox(-0.5F, -0.9095F, -0.1161F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(13, 77).addBox(-0.5F, -5.3095F, -0.2161F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3269F, 8.0684F, -0.0498F, -0.0872F, 0.0043F));

		PartDefinition cube_r335 = Tail2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(104, 58).addBox(0.0F, -3.6F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9062F, 5.9156F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r336 = Tail2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(109, 31).addBox(0.0F, -3.925F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9062F, 4.0156F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r337 = Tail2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(77, 106).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9062F, -0.0844F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r338 = Tail2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(101, 101).addBox(0.0F, 0.1263F, -0.3181F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.045F, 6.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r339 = Tail2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(66, 100).addBox(0.0F, -0.0934F, -0.0015F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.045F, 3.4F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r340 = Tail2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(63, 100).addBox(0.0F, 0.2299F, 1.3058F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.845F, 0.0F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r341 = Tail2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(56, 104).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9062F, 1.9156F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r342 = Tail2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.3095F, 3.7839F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r343 = Tail2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(19, 41).mirror().addBox(-1.4F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4095F, -0.1161F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r344 = Tail2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(19, 41).addBox(-0.6F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4095F, -0.1161F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(19, 31).addBox(-0.5F, -0.4608F, -0.2974F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.4095F, 8.0839F, -0.0633F, -0.0871F, 0.0055F));

		PartDefinition cube_r345 = Tail3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(102, 111).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4608F, 5.7026F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r346 = Tail3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(99, 111).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4608F, 3.7026F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r347 = Tail3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(96, 111).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4608F, 1.7026F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r348 = Tail3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(109, 44).addBox(0.0F, 1.1344F, 3.014F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 102).addBox(0.0F, -0.2656F, 1.014F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 102).addBox(0.0F, -0.7656F, -0.986F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4545F, 2.9161F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r349 = Tail3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(101, 95).addBox(0.0F, 0.6263F, 1.6819F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4545F, -2.0839F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r350 = Tail3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(80, 106).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4608F, -0.2974F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r351 = Tail3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(51, 49).mirror().addBox(-0.7F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0392F, -0.2974F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r352 = Tail3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(51, 49).addBox(-0.3F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0392F, -0.2974F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r353 = Tail3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(40, 21).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -4.0608F, 0.3026F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.5008F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0392F, 7.7026F, -0.0829F, -0.2609F, 0.0214F));

		PartDefinition cube_r354 = Tail4.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(64, 114).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5008F, 6.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r355 = Tail4.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(61, 114).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5008F, 4.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r356 = Tail4.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(114, 60).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5008F, 2.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r357 = Tail4.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(25, 114).addBox(0.0F, 3.4344F, 11.014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 92).addBox(0.0F, 2.9344F, 9.014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 73).addBox(0.0F, 2.5344F, 7.014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 49).addBox(0.0F, 1.4344F, 5.014F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4154F, -4.7864F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r358 = Tail4.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(58, 114).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5008F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r359 = Tail4.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(40, 11).addBox(-0.5F, -0.125F, 0.025F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.9008F, 0.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.5005F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.0008F, 7.925F, -0.0808F, -0.1305F, 0.0105F));

		PartDefinition cube_r360 = Tail5.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(105, 114).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5005F, 6.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r361 = Tail5.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(88, 114).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5005F, 4.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r362 = Tail5.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(67, 114).addBox(0.0F, -1.175F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5005F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r363 = Tail5.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(70, 114).addBox(0.0F, 5.6344F, 17.014F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 87).addBox(0.0F, 5.2344F, 15.014F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 114).addBox(0.0F, 3.8344F, 13.014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4162F, -12.7114F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r364 = Tail5.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(114, 64).addBox(0.0F, -1.375F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5005F, 0.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r365 = Tail5.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(29, 112).addBox(-0.5F, -0.2F, 6.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(17, 49).addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.1005F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, -0.5005F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F))
				.texOffs(108, 114).addBox(0.0F, -1.1005F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.875F, -0.0588F, 0.1307F, -0.0077F));

		PartDefinition cube_r366 = Tail6.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(111, 114).addBox(0.0F, -0.425F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5005F, 3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r367 = Tail6.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(114, 84).addBox(0.0F, 6.4344F, 21.014F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 76).addBox(0.0F, 6.0344F, 19.014F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4162F, -19.5864F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r368 = Tail6.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(112, 31).addBox(-0.5F, -0.3F, 6.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(34, 49).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.5005F, 0.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.5005F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.9F, -0.1043F, 0.217F, -0.0225F));

		PartDefinition cube_r369 = Tail7.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, -0.175F, 0.025F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.9005F, -0.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition UpperLegL = Hips.addOrReplaceChild("UpperLegL", CubeListBuilder.create().texOffs(81, 15).addBox(-1.0F, -0.4F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.0F, 1.3673F, -3.6104F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r370 = UpperLegL.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(88, 58).addBox(-1.0F, 1.1F, -1.625F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F))
				.texOffs(99, 45).addBox(-1.0F, 0.0F, -1.025F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3092F, 1.0875F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r371 = UpperLegL.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(98, 70).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.5743F, -0.1084F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r372 = UpperLegL.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(42, 93).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.4695F, 0.4915F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r373 = UpperLegL.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(35, 93).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6F, -0.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r374 = UpperLegL.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(41, 66).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8856F, 0.918F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r375 = UpperLegL.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(69, 100).addBox(-1.0F, 0.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.1F, 0.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition LowerLegL = UpperLegL.addOrReplaceChild("LowerLegL", CubeListBuilder.create().texOffs(74, 10).addBox(-1.5F, 0.0F, -0.7F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(96, 89).addBox(0.575F, 0.3184F, -0.7931F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(113, 73).addBox(0.575F, -0.1816F, -0.7931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 114).addBox(0.575F, -0.1816F, -0.0931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5F, 10.4037F, 1.5505F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r376 = LowerLegL.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(94, 28).addBox(-1.5F, -0.05F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0574F, -0.6955F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r377 = LowerLegL.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(89, 90).addBox(-1.5F, -2.875F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.3F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r378 = LowerLegL.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(21, 92).addBox(-1.5F, -0.05F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, -0.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r379 = LowerLegL.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(5, 103).addBox(0.0F, -0.5F, -0.3964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 7.5434F, 1.0905F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r380 = LowerLegL.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(110, 105).addBox(0.0F, -0.9268F, -0.2197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 7.5434F, 1.0905F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r381 = LowerLegL.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(92, 10).addBox(-1.5F, -0.05F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.0F, -0.7F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r382 = LowerLegL.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(77, 96).addBox(-0.5F, -3.85F, -0.175F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.075F, 4.1684F, -0.6181F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r383 = LowerLegL.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(97, 21).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.075F, 4.0F, -0.2F, 0.0436F, 0.0F, 0.0F));

		PartDefinition FootL = LowerLegL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.4705F, -0.7813F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r384 = FootL.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(77, 60).addBox(-2.5F, -0.5F, -0.8F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2527F, 0.2696F, -0.0873F, 0.0F, 0.0F));

		PartDefinition ToesL = FootL.addOrReplaceChild("ToesL", CubeListBuilder.create().texOffs(51, 57).addBox(-2.5F, -0.5167F, -3.9453F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0057F, 2.7277F, -0.233F, 1.1349F, 0.0F, 0.0F));

		PartDefinition UpperLegL2 = Hips.addOrReplaceChild("UpperLegL2", CubeListBuilder.create().texOffs(35, 81).addBox(-1.0F, -0.4F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.0F, 1.3673F, -3.6104F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r385 = UpperLegL2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(88, 62).addBox(-1.0F, 1.1F, -1.625F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F))
				.texOffs(99, 49).addBox(-1.0F, 0.0F, -1.025F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3092F, 1.0875F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r386 = UpperLegL2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(17, 99).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.5743F, -0.1084F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r387 = UpperLegL2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(94, 74).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.4695F, 0.4915F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r388 = UpperLegL2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(49, 94).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6F, -0.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r389 = UpperLegL2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(99, 53).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8856F, 0.918F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r390 = UpperLegL2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(87, 100).addBox(-1.0F, 0.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.1F, 0.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition LowerLegL2 = UpperLegL2.addOrReplaceChild("LowerLegL2", CubeListBuilder.create().texOffs(74, 20).addBox(-0.5F, 0.0F, -0.7F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(5, 97).addBox(-1.575F, 0.3184F, -0.7931F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(5, 114).addBox(-1.575F, -0.1816F, -0.7931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(114, 6).addBox(-1.575F, -0.1816F, -0.0931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5F, 10.4037F, 1.5505F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r391 = LowerLegL2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(94, 79).addBox(-0.5F, -0.05F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0574F, -0.6955F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r392 = LowerLegL2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(5, 92).addBox(-0.5F, -2.875F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.3F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r393 = LowerLegL2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(92, 51).addBox(-0.5F, -0.05F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, -0.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r394 = LowerLegL2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(21, 103).addBox(-1.0F, -0.5F, -0.3964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.5434F, 1.0905F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r395 = LowerLegL2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(110, 108).addBox(-1.0F, -0.9268F, -0.2197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.5434F, 1.0905F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r396 = LowerLegL2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(92, 46).addBox(-0.5F, -0.05F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.0F, -0.7F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r397 = LowerLegL2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(0, 97).addBox(-0.5F, -3.85F, -0.175F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.075F, 4.1684F, -0.6181F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r398 = LowerLegL2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(26, 98).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.075F, 4.0F, -0.2F, 0.0436F, 0.0F, 0.0F));

		PartDefinition FootL2 = LowerLegL2.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.4705F, -0.7813F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r399 = FootL2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(81, 10).addBox(-1.5F, -0.5F, -0.8F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2527F, 0.2696F, -0.0873F, 0.0F, 0.0F));

		PartDefinition ToesL2 = FootL2.addOrReplaceChild("ToesL2", CubeListBuilder.create().texOffs(17, 58).addBox(-1.5F, -0.5167F, -3.9453F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0057F, 2.7277F, -0.233F, 1.2658F, 0.0F, 0.0F));

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