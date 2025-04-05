package fossils.fossils.client.blockentity.model.allosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AllosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Head;
	private final ModelPart bone;
	private final ModelPart leftFace2;
	private final ModelPart rightFace2;
	private final ModelPart Upperjaw;
	private final ModelPart leftFace;
	private final ModelPart Lowerjaw;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart Leftleg1;
	private final ModelPart Leftleg2;
	private final ModelPart Leftleg3;
	private final ModelPart Leftleg4;
	private final ModelPart Leftleg5;
	private final ModelPart Rightleg1;
	private final ModelPart Rightleg2;
	private final ModelPart Rightleg3;
	private final ModelPart Rightleg4;
	private final ModelPart Rightleg5;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;

	public AllosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Root = this.fossil.getChild("Root");
		this.Hips = this.Root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neck1 = this.Bodyfront.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Head = this.Neck4.getChild("Head");
		this.bone = this.Head.getChild("bone");
		this.leftFace2 = this.Head.getChild("leftFace2");
		this.rightFace2 = this.Head.getChild("rightFace2");
		this.Upperjaw = this.Head.getChild("Upperjaw");
		this.leftFace = this.Upperjaw.getChild("leftFace");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.Leftarm1 = this.Bodyfront.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Rightarm1 = this.Bodyfront.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.Leftleg1 = this.Hips.getChild("Leftleg1");
		this.Leftleg2 = this.Leftleg1.getChild("Leftleg2");
		this.Leftleg3 = this.Leftleg2.getChild("Leftleg3");
		this.Leftleg4 = this.Leftleg3.getChild("Leftleg4");
		this.Leftleg5 = this.Leftleg4.getChild("Leftleg5");
		this.Rightleg1 = this.Hips.getChild("Rightleg1");
		this.Rightleg2 = this.Rightleg1.getChild("Rightleg2");
		this.Rightleg3 = this.Rightleg2.getChild("Rightleg3");
		this.Rightleg4 = this.Rightleg3.getChild("Rightleg4");
		this.Rightleg5 = this.Rightleg4.getChild("Rightleg5");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition Root = fossil.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, -29.0F, -1.0F));

		PartDefinition Hips = Root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(23, 46).mirror().addBox(-1.5F, -0.4F, 1.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 46).addBox(0.5F, -0.4F, 1.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0051F, -2.4001F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(94, 65).mirror().addBox(2.0151F, 10.6931F, -1.9129F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3411F, 1.6395F, -1.7422F, 0.1431F, -0.0026F, 0.0403F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(91, 93).mirror().addBox(2.0151F, 10.5554F, -2.0209F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3411F, 1.6395F, -1.7422F, 0.4049F, -0.0026F, 0.0403F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 113).mirror().addBox(1.9719F, -7.573F, -7.7865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3411F, 1.6395F, -1.7422F, 2.6529F, 0.0F, 0.0349F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 100).mirror().addBox(0.4282F, 4.1282F, 1.1499F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(27, 100).mirror().addBox(0.4282F, 4.2282F, 0.5499F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3411F, 1.6395F, -1.7422F, 0.0262F, 0.0F, -0.1396F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(100, 52).mirror().addBox(0.0927F, -1.8064F, 1.3916F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2411F, 1.6395F, -1.7422F, -0.8203F, 0.0F, -0.192F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(29, 92).mirror().addBox(-0.9001F, 2.4974F, -4.4005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 22).mirror().addBox(-0.9001F, 2.2974F, -4.5005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 4.2414F, 8.3894F, 1.9298F, -0.0266F, -0.2573F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(7, 109).mirror().addBox(-0.9001F, 2.8815F, -1.39F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 4.2414F, 8.3894F, 1.2404F, -0.0266F, -0.2573F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(107, 45).mirror().addBox(-0.9001F, 0.0068F, -0.5621F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 4.2414F, 8.3894F, 0.9786F, -0.0266F, -0.2573F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(110, 56).mirror().addBox(0.312F, -1.0119F, 0.8598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 107).mirror().addBox(0.312F, -2.012F, 1.4598F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 2.5414F, 5.1894F, -1.2754F, 0.1256F, -0.1641F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(59, 109).mirror().addBox(0.4855F, -1.1028F, -0.3231F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 2.5414F, 5.1894F, 0.8191F, -0.2954F, -0.3555F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(91, 98).mirror().addBox(-0.5F, -1.5F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9018F, -2.4198F, -1.2529F, 2.1814F, 0.2725F, 0.4634F));

		PartDefinition cube_r12 = Hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(54, 100).mirror().addBox(-0.5F, -1.1F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9018F, -2.4198F, -1.2529F, 1.0033F, 0.2725F, 0.4634F));

		PartDefinition cube_r13 = Hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(71, 109).mirror().addBox(-0.5F, -0.3F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.9265F, -2.8393F, -2.0034F, 1.7538F, 0.2725F, 0.4634F));

		PartDefinition cube_r14 = Hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(109, 59).mirror().addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.6381F, -3.4109F, -1.9942F, 0.8812F, 0.2725F, 0.4634F));

		PartDefinition cube_r15 = Hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(74, 82).mirror().addBox(-0.5F, -2.3F, -1.9F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1422F, -2.5964F, 5.4394F, -0.1396F, 0.0F, 0.4014F));

		PartDefinition cube_r16 = Hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(35, 79).mirror().addBox(-0.9001F, 2.9875F, -0.143F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 4.2414F, 8.3894F, 0.8477F, -0.0266F, -0.2573F));

		PartDefinition cube_r17 = Hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(54, 109).mirror().addBox(0.312F, 0.3305F, 0.1604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 2.5414F, 5.1894F, -0.5249F, 0.1256F, -0.1641F));

		PartDefinition cube_r18 = Hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(42, 101).mirror().addBox(0.2432F, -0.0215F, -0.3424F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 2.5414F, 5.1894F, 0.943F, 0.1084F, -0.2587F));

		PartDefinition cube_r19 = Hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(63, 47).mirror().addBox(1.9719F, 9.9209F, -1.9961F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3411F, 1.6395F, -1.7422F, 0.1396F, 0.0F, 0.0349F));

		PartDefinition cube_r20 = Hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(112, 45).mirror().addBox(1.9719F, 7.1698F, 7.5819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3411F, 1.6395F, -1.7422F, -0.829F, 0.0F, 0.0349F));

		PartDefinition cube_r21 = Hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(112, 99).mirror().addBox(1.9719F, 9.7039F, -2.985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3411F, 1.6395F, -1.7422F, 0.192F, 0.0F, 0.0349F));

		PartDefinition cube_r22 = Hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(54, 40).mirror().addBox(1.9719F, 6.3779F, -7.6882F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3411F, 1.6395F, -1.7422F, 0.8378F, 0.0F, 0.0349F));

		PartDefinition cube_r23 = Hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(100, 39).mirror().addBox(0.0927F, 2.2931F, 0.3465F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2411F, 1.6395F, -1.7422F, 0.0785F, 0.0F, -0.192F));

		PartDefinition cube_r24 = Hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(0.1F, 1.4F, -3.3F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(58, 0).addBox(3.5F, 1.4F, -3.3F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.3F, -3.3688F, 3.4532F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(57, 83).mirror().addBox(0.0927F, 0.0919F, 0.0218F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2411F, 1.6395F, -1.7422F, 0.1833F, 0.0F, -0.192F));

		PartDefinition cube_r26 = Hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(47, 96).mirror().addBox(0.2F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 96).addBox(3.4F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, 1.3819F, 0.0549F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(77, 32).mirror().addBox(-0.4919F, -0.5958F, -2.1059F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2787F, -2.9141F, 7.5735F, 0.0738F, -0.1965F, 0.4202F));

		PartDefinition cube_r28 = Hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(89, 47).mirror().addBox(-0.4919F, -1.1654F, -1.4515F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2787F, -2.9141F, 7.5735F, -0.2403F, -0.1965F, 0.4202F));

		PartDefinition cube_r29 = Hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(55, 89).mirror().addBox(-0.4919F, -1.325F, -1.6642F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2787F, -2.9141F, 7.5735F, -0.4585F, -0.1965F, 0.4202F));

		PartDefinition cube_r30 = Hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(46, 89).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2549F, -2.8466F, 0.1353F, 0.3139F, 0.2725F, 0.4634F));

		PartDefinition cube_r31 = Hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(82, 39).mirror().addBox(-0.5F, -2.6F, -1.3F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.1813F, -2.5043F, 2.2394F, 0.0F, 0.0F, 0.4014F));

		PartDefinition cube_r32 = Hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(74, 82).addBox(-0.5F, -2.3F, -1.9F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1422F, -2.5964F, 5.4394F, -0.1396F, 0.0F, -0.4014F));

		PartDefinition cube_r33 = Hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(82, 39).addBox(-0.5F, -2.6F, -1.3F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.1813F, -2.5043F, 2.2394F, 0.0F, 0.0F, -0.4014F));

		PartDefinition cube_r34 = Hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(91, 98).addBox(-0.5F, -1.5F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9018F, -2.4198F, -1.2529F, 2.1814F, -0.2725F, -0.4634F));

		PartDefinition cube_r35 = Hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(54, 100).addBox(-0.5F, -1.1F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9018F, -2.4198F, -1.2529F, 1.0033F, -0.2725F, -0.4634F));

		PartDefinition cube_r36 = Hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(71, 109).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.9265F, -2.8393F, -2.0034F, 1.7538F, -0.2725F, -0.4634F));

		PartDefinition cube_r37 = Hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(109, 59).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.6381F, -3.4109F, -1.9942F, 0.8812F, -0.2725F, -0.4634F));

		PartDefinition cube_r38 = Hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(46, 89).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2549F, -2.8466F, 0.1353F, 0.3139F, -0.2725F, -0.4634F));

		PartDefinition cube_r39 = Hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(55, 89).addBox(-0.5081F, -1.325F, -1.6642F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2787F, -2.9141F, 7.5735F, -0.4585F, 0.1965F, -0.4202F));

		PartDefinition cube_r40 = Hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(89, 47).addBox(-0.5081F, -1.1654F, -1.4515F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2787F, -2.9141F, 7.5735F, -0.2403F, 0.1965F, -0.4202F));

		PartDefinition cube_r41 = Hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(77, 32).addBox(-0.5081F, -0.5958F, -2.1059F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2787F, -2.9141F, 7.5735F, 0.0738F, 0.1965F, -0.4202F));

		PartDefinition cube_r42 = Hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(100, 52).addBox(-1.0927F, -1.8064F, 1.3916F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2411F, 1.6395F, -1.7422F, -0.8203F, 0.0F, 0.192F));

		PartDefinition cube_r43 = Hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(57, 83).addBox(-1.0927F, 0.0919F, 0.0218F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2411F, 1.6395F, -1.7422F, 0.1833F, 0.0F, 0.192F));

		PartDefinition cube_r44 = Hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(100, 39).addBox(-1.0927F, 2.2931F, 0.3465F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2411F, 1.6395F, -1.7422F, 0.0785F, 0.0F, 0.192F));

		PartDefinition cube_r45 = Hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(32, 100).addBox(-1.4282F, 4.1282F, 1.1499F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(27, 100).addBox(-1.4282F, 4.2282F, 0.5499F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3411F, 1.6395F, -1.7422F, 0.0262F, 0.0F, 0.1396F));

		PartDefinition cube_r46 = Hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 40).addBox(-2.9719F, 6.3779F, -7.6882F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3411F, 1.6395F, -1.7422F, 0.8378F, 0.0F, -0.0349F));

		PartDefinition cube_r47 = Hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(27, 113).addBox(-2.9719F, -7.573F, -7.7865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3411F, 1.6395F, -1.7422F, 2.6529F, 0.0F, -0.0349F));

		PartDefinition cube_r48 = Hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(112, 99).addBox(-2.9719F, 9.7039F, -2.985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3411F, 1.6395F, -1.7422F, 0.192F, 0.0F, -0.0349F));

		PartDefinition cube_r49 = Hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(112, 45).addBox(-2.9719F, 7.1698F, 7.5819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3411F, 1.6395F, -1.7422F, -0.829F, 0.0F, -0.0349F));

		PartDefinition cube_r50 = Hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(94, 65).addBox(-3.0151F, 10.6931F, -1.9129F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3411F, 1.6395F, -1.7422F, 0.1431F, 0.0026F, -0.0403F));

		PartDefinition cube_r51 = Hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(91, 93).addBox(-3.0151F, 10.5554F, -2.0209F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3411F, 1.6395F, -1.7422F, 0.4049F, 0.0026F, -0.0403F));

		PartDefinition cube_r52 = Hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(63, 47).addBox(-2.9719F, 9.9209F, -1.9961F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3411F, 1.6395F, -1.7422F, 0.1396F, 0.0F, -0.0349F));

		PartDefinition cube_r53 = Hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(59, 109).addBox(-1.4855F, -1.1028F, -0.3231F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 2.5414F, 5.1894F, 0.8191F, 0.2954F, 0.3555F));

		PartDefinition cube_r54 = Hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(107, 45).addBox(-0.0999F, 0.0068F, -0.5621F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 4.2414F, 8.3894F, 0.9786F, 0.0266F, 0.2573F));

		PartDefinition cube_r55 = Hips.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(42, 101).addBox(-1.2432F, -0.0215F, -0.3424F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 2.5414F, 5.1894F, 0.943F, -0.1084F, 0.2587F));

		PartDefinition cube_r56 = Hips.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(110, 56).addBox(-1.312F, -1.0119F, 0.8598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 107).addBox(-1.312F, -2.012F, 1.4598F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.3F, 2.5414F, 5.1894F, -1.2754F, -0.1256F, 0.1641F));

		PartDefinition cube_r57 = Hips.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(54, 109).addBox(-1.312F, 0.3305F, 0.1604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 2.5414F, 5.1894F, -0.5249F, -0.1256F, 0.1641F));

		PartDefinition cube_r58 = Hips.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(7, 109).addBox(-0.0999F, 2.8815F, -1.39F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3F, 4.2414F, 8.3894F, 1.2404F, 0.0266F, 0.2573F));

		PartDefinition cube_r59 = Hips.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(29, 92).addBox(-0.0999F, 2.4974F, -4.4005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 22).addBox(-0.0999F, 2.2974F, -4.5005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3F, 4.2414F, 8.3894F, 1.9298F, 0.0266F, 0.2573F));

		PartDefinition cube_r60 = Hips.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(35, 79).addBox(-0.0999F, 2.9875F, -0.143F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3F, 4.2414F, 8.3894F, 0.8477F, 0.0266F, 0.2573F));

		PartDefinition Neckfront_r1 = Hips.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(33, 107).addBox(0.0F, -4.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0922F, -1.0338F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Neckfront_r2 = Hips.addOrReplaceChild("Neckfront_r2", CubeListBuilder.create().texOffs(46, 46).addBox(0.0F, -2.7F, -3.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0783F, 3.3096F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3916F, -3.0257F, 0.1787F, 0.2148F, 0.0385F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(0, 58).addBox(-3.5F, -1.981F, -3.9732F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 15.2451F, -9.7921F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(23, 57).addBox(-4.5F, -2.781F, -3.1731F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 15.687F, -6.5976F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(54, 32).addBox(-4.5F, -2.781F, -0.1731F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 15.687F, -6.5976F, -0.096F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r4 = Bodymiddle.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(107, 90).addBox(0.0F, -4.8F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4007F, -0.8762F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r5 = Bodymiddle.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(83, 107).addBox(0.0F, -4.8F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0878F, -2.8516F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Bodymiddle.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(103, 68).mirror().addBox(-2.6592F, -1.0078F, -0.2724F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.9887F, -0.629F, -0.051F, -0.1735F, -1.29F));

		PartDefinition Bodyfront_r2 = Bodymiddle.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(108, 109).mirror().addBox(-1.9408F, -0.0431F, -0.2724F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.9887F, -0.629F, -0.1311F, -0.1247F, -0.7627F));

		PartDefinition Bodyfront_r3 = Bodymiddle.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(109, 97).mirror().addBox(-3.6592F, -1.0078F, -0.2724F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.5887F, -2.629F, -0.051F, -0.1735F, -1.29F));

		PartDefinition Bodyfront_r4 = Bodymiddle.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(101, 109).mirror().addBox(-1.9408F, -0.0431F, -0.2724F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.5887F, -2.629F, -0.1311F, -0.1247F, -0.7627F));

		PartDefinition Bodyfront_r5 = Bodymiddle.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(48, 15).mirror().addBox(-4.7693F, -0.9594F, -0.4572F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.1887F, -4.429F, 0.0125F, -0.0489F, -1.2273F));

		PartDefinition Bodyfront_r6 = Bodymiddle.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(94, 109).mirror().addBox(-2.0119F, 0.0538F, -0.4572F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.1887F, -4.429F, -0.0136F, -0.0486F, -0.7031F));

		PartDefinition Bodyfront_r7 = Bodymiddle.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(98, 98).mirror().addBox(-5.7783F, -0.9619F, -0.6468F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.8887F, -6.229F, 0.0439F, 0.0135F, -1.158F));

		PartDefinition Bodyfront_r8 = Bodymiddle.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(109, 50).mirror().addBox(-2.021F, 0.0561F, -0.6468F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.8887F, -6.229F, 0.0447F, -0.0102F, -0.635F));

		PartDefinition Bodyfront_r9 = Bodymiddle.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(91, 45).mirror().addBox(-6.8556F, -3.3096F, -0.5429F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.6887F, -8.329F, 0.0366F, 0.118F, -1.5067F));

		PartDefinition Bodyfront_r10 = Bodymiddle.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(98, 50).mirror().addBox(-5.7994F, -0.9474F, -0.5429F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.6887F, -8.329F, 0.0831F, 0.0915F, -1.0687F));

		PartDefinition Bodyfront_r11 = Bodymiddle.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(106, 35).mirror().addBox(-2.032F, 0.0792F, -0.5429F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.6887F, -8.329F, 0.1176F, 0.0378F, -0.5467F));

		PartDefinition Bodyfront_r12 = Bodymiddle.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(50, 13).mirror().addBox(-1.9846F, 0.0083F, -0.5247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.6887F, -10.329F, 0.1761F, 0.076F, -0.4735F));

		PartDefinition Bodyfront_r13 = Bodymiddle.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(97, 29).mirror().addBox(-8.7703F, -3.3114F, -0.5247F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.6887F, -10.329F, 0.0387F, 0.1878F, -1.4365F));

		PartDefinition Bodyfront_r14 = Bodymiddle.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(97, 27).mirror().addBox(-5.7229F, -0.9851F, -0.5247F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.6887F, -10.329F, 0.1149F, 0.1538F, -0.995F));

		PartDefinition Bodyfront_r15 = Bodymiddle.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(108, 109).addBox(-0.0592F, -0.0431F, -0.2724F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.9887F, -0.629F, -0.1311F, 0.1247F, 0.7627F));

		PartDefinition Bodyfront_r16 = Bodymiddle.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(103, 68).addBox(1.6592F, -1.0078F, -0.2724F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.9887F, -0.629F, -0.051F, 0.1735F, 1.29F));

		PartDefinition Bodyfront_r17 = Bodymiddle.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(101, 109).addBox(-0.0592F, -0.0431F, -0.2724F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.5887F, -2.629F, -0.1311F, 0.1247F, 0.7627F));

		PartDefinition Bodyfront_r18 = Bodymiddle.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(109, 97).addBox(1.6592F, -1.0078F, -0.2724F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.5887F, -2.629F, -0.051F, 0.1735F, 1.29F));

		PartDefinition Bodyfront_r19 = Bodymiddle.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(94, 109).addBox(0.0119F, 0.0538F, -0.4572F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.1887F, -4.429F, -0.0136F, 0.0486F, 0.7031F));

		PartDefinition Bodyfront_r20 = Bodymiddle.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(48, 15).addBox(1.7692F, -0.9594F, -0.4572F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.1887F, -4.429F, 0.0125F, 0.0489F, 1.2273F));

		PartDefinition Bodyfront_r21 = Bodymiddle.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(109, 50).addBox(0.021F, 0.0561F, -0.6468F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.8887F, -6.229F, 0.0447F, 0.0102F, 0.635F));

		PartDefinition Bodyfront_r22 = Bodymiddle.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(98, 98).addBox(1.7783F, -0.9619F, -0.6468F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.8887F, -6.229F, 0.0439F, -0.0135F, 1.158F));

		PartDefinition Bodyfront_r23 = Bodymiddle.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(106, 35).addBox(0.032F, 0.0792F, -0.5429F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.6887F, -8.329F, 0.1176F, -0.0378F, 0.5467F));

		PartDefinition Bodyfront_r24 = Bodymiddle.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(98, 50).addBox(1.7994F, -0.9474F, -0.5429F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.6887F, -8.329F, 0.0831F, -0.0915F, 1.0687F));

		PartDefinition Bodyfront_r25 = Bodymiddle.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(91, 45).addBox(4.8556F, -3.3096F, -0.5429F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.6887F, -8.329F, 0.0366F, -0.118F, 1.5067F));

		PartDefinition Bodyfront_r26 = Bodymiddle.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(50, 13).addBox(-0.0154F, 0.0083F, -0.5247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.6887F, -10.329F, 0.1761F, -0.076F, 0.4735F));

		PartDefinition Bodyfront_r27 = Bodymiddle.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(97, 29).addBox(4.7703F, -3.3114F, -0.5247F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.6887F, -10.329F, 0.0387F, -0.1878F, 1.4365F));

		PartDefinition Bodyfront_r28 = Bodymiddle.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(97, 27).addBox(1.7229F, -0.9851F, -0.5247F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.6887F, -10.329F, 0.1149F, -0.1538F, 0.995F));

		PartDefinition Bodymiddle_r6 = Bodymiddle.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(80, 107).addBox(0.0F, -4.7F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.775F, -4.8269F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r7 = Bodymiddle.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(63, 63).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.6185F, -5.8146F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r8 = Bodymiddle.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(68, 107).addBox(0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5488F, -6.8122F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r9 = Bodymiddle.addOrReplaceChild("Bodymiddle_r9", CubeListBuilder.create().texOffs(107, 52).addBox(0.0F, -4.4F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4093F, -8.8073F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r10 = Bodymiddle.addOrReplaceChild("Bodymiddle_r10", CubeListBuilder.create().texOffs(23, 101).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2698F, -10.8024F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r11 = Bodymiddle.addOrReplaceChild("Bodymiddle_r11", CubeListBuilder.create().texOffs(63, 55).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2F, -11.8F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, 0.112F, 0.2703F, -0.0548F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(88, 14).mirror().addBox(-4.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0411F, 11.5906F, -8.4619F, -0.4319F, 0.6929F, 0.7433F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(110, 4).mirror().addBox(-3.6649F, -0.1371F, -3.9009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.2818F, 5.4485F, -7.0016F, 0.311F, -0.8241F, -0.4725F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(-3.6649F, -2.1768F, -3.3013F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2818F, 5.4485F, -7.0016F, 0.8695F, -0.8241F, -0.4725F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(83, 81).mirror().addBox(-1.0263F, -2.0437F, 1.0518F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2818F, 5.4485F, -7.0016F, 0.3087F, -0.0344F, 0.0778F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(73, 101).mirror().addBox(-0.9845F, -1.8056F, 4.4747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2818F, 5.4485F, -7.0016F, 0.3611F, -0.0344F, 0.0778F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(88, 12).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7226F, 12.4422F, -7.8204F, -0.0194F, 0.7251F, 0.6233F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(33, 13).mirror().addBox(-6.2F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7219F, 12.4228F, -7.7265F, 0.042F, 0.9588F, 0.1112F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(21, 73).mirror().addBox(-1.0F, -0.5F, -1.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3888F, 9.0579F, -11.1315F, -1.0278F, -0.1376F, 0.2234F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(94, 70).mirror().addBox(-3.6649F, -0.1282F, -4.2932F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2818F, 5.4485F, -7.0016F, 0.7822F, -0.8241F, -0.4725F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(94, 77).mirror().addBox(-0.9182F, -2.5825F, -3.684F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2818F, 5.4485F, -7.0016F, 1.2566F, -0.1047F, 0.0F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(83, 69).mirror().addBox(-0.8935F, -1.6274F, -2.1476F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2818F, 5.4485F, -7.0016F, 0.6092F, -0.0996F, 0.0168F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(101, 70).mirror().addBox(-0.9845F, -4.2352F, 3.613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2818F, 5.4485F, -7.0016F, -0.0403F, -0.0344F, 0.0778F));

		PartDefinition cube_r73 = Bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(83, 75).mirror().addBox(-1.0263F, -1.7863F, 1.3837F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2818F, 5.4485F, -7.0016F, 0.5007F, -0.0344F, 0.0778F));

		PartDefinition Bodyfront_r29 = Bodyfront.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(88, 37).mirror().addBox(-9.7277F, -3.3082F, -0.3891F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3887F, -1.629F, 0.1224F, 0.0856F, -1.394F));

		PartDefinition Bodyfront_r30 = Bodyfront.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(99, 20).mirror().addBox(-5.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3887F, -1.629F, 0.147F, 0.026F, -0.961F));

		PartDefinition Bodyfront_r31 = Bodyfront.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(110, 37).mirror().addBox(-1.9575F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3887F, -1.629F, 0.1404F, -0.0507F, -0.4429F));

		PartDefinition Bodyfront_r32 = Bodyfront.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(77, 23).mirror().addBox(-10.753F, -3.3117F, -0.5179F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3887F, -3.529F, 0.0387F, 0.1878F, -1.4016F));

		PartDefinition Bodyfront_r33 = Bodyfront.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(99, 18).mirror().addBox(-5.7073F, -0.9927F, -0.5179F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3887F, -3.529F, 0.1149F, 0.1538F, -0.9601F));

		PartDefinition Bodyfront_r34 = Bodyfront.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(110, 20).mirror().addBox(-1.9749F, -0.0061F, -0.5179F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3887F, -3.529F, 0.1761F, 0.076F, -0.4386F));

		PartDefinition Bodyfront_r35 = Bodyfront.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(33, 15).mirror().addBox(-10.7228F, -3.3096F, -0.429F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3887F, -5.629F, 0.0408F, 0.2576F, -1.4012F));

		PartDefinition Bodyfront_r36 = Bodyfront.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(99, 16).mirror().addBox(-5.6791F, -1.0036F, -0.429F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3887F, -5.629F, 0.1473F, 0.2159F, -0.9541F));

		PartDefinition Bodyfront_r37 = Bodyfront.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(110, 18).mirror().addBox(-1.9559F, -0.0296F, -0.429F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3887F, -5.629F, 0.235F, 0.1141F, -0.433F));

		PartDefinition Bodyfront_r38 = Bodyfront.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(110, 16).mirror().addBox(-1.9902F, 0.0251F, -0.3875F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3887F, -7.729F, 0.3092F, 0.161F, -0.4578F));

		PartDefinition Bodyfront_r39 = Bodyfront.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(99, 7).mirror().addBox(-5.7361F, -0.9734F, -0.3875F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3887F, -7.729F, 0.1892F, 0.2932F, -0.9785F));

		PartDefinition Bodyfront_r40 = Bodyfront.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(99, 9).mirror().addBox(-8.7873F, -3.3064F, -0.3875F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3887F, -7.729F, 0.0436F, 0.3448F, -1.4353F));

		PartDefinition Bodyfront_r41 = Bodyfront.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(101, 37).mirror().addBox(-7.7515F, -2.8136F, -0.5883F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.5887F, -9.529F, 0.0471F, 0.4669F, -1.5037F));

		PartDefinition Bodyfront_r42 = Bodyfront.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(99, 5).mirror().addBox(-5.4954F, -0.5419F, -0.5883F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.5887F, -9.529F, 0.2506F, 0.4009F, -1.0274F));

		PartDefinition Bodyfront_r43 = Bodyfront.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(12, 110).mirror().addBox(-1.566F, 0.2784F, -0.5883F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.5887F, -9.529F, 0.4149F, 0.2257F, -0.5073F));

		PartDefinition Bodyfront_r44 = Bodyfront.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(100, 62).mirror().addBox(-4.6196F, -1.0398F, -0.46F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.4353F, -11.1681F, 0.1771F, 0.5216F, -1.235F));

		PartDefinition Bodyfront_r45 = Bodyfront.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(110, 8).mirror().addBox(-1.9225F, -0.0907F, -0.46F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.4353F, -11.1681F, 0.4203F, 0.363F, -0.6805F));

		PartDefinition Bodyfront_r46 = Bodyfront.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(110, 37).addBox(-0.0425F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3887F, -1.629F, 0.0273F, -0.1857F, 0.4506F));

		PartDefinition Bodyfront_r47 = Bodyfront.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(99, 20).addBox(1.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3887F, -1.629F, -0.0702F, -0.1742F, 0.9828F));

		PartDefinition Bodyfront_r48 = Bodyfront.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(88, 37).addBox(4.7277F, -3.3082F, -0.3891F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3887F, -1.629F, -0.1374F, -0.1283F, 1.4219F));

		PartDefinition Bodyfront_r49 = Bodyfront.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(110, 20).addBox(-0.0251F, -0.0061F, -0.5179F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3887F, -3.529F, 0.1761F, -0.076F, 0.4386F));

		PartDefinition Bodyfront_r50 = Bodyfront.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(99, 18).addBox(1.7073F, -0.9927F, -0.5179F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3887F, -3.529F, 0.1149F, -0.1538F, 0.9601F));

		PartDefinition Bodyfront_r51 = Bodyfront.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(77, 23).addBox(4.753F, -3.3117F, -0.5179F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3887F, -3.529F, 0.0387F, -0.1878F, 1.4016F));

		PartDefinition Bodyfront_r52 = Bodyfront.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(110, 18).addBox(-0.0441F, -0.0296F, -0.429F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3887F, -5.629F, 0.235F, -0.1141F, 0.433F));

		PartDefinition Bodyfront_r53 = Bodyfront.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(99, 16).addBox(1.6791F, -1.0036F, -0.429F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3887F, -5.629F, 0.1473F, -0.2159F, 0.9541F));

		PartDefinition Bodyfront_r54 = Bodyfront.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(33, 15).addBox(4.7229F, -3.3096F, -0.429F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3887F, -5.629F, 0.0408F, -0.2576F, 1.4012F));

		PartDefinition Bodyfront_r55 = Bodyfront.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(99, 9).addBox(4.7873F, -3.3064F, -0.3875F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3887F, -7.729F, 0.0436F, -0.3448F, 1.4353F));

		PartDefinition Bodyfront_r56 = Bodyfront.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(99, 7).addBox(1.7361F, -0.9734F, -0.3875F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3887F, -7.729F, 0.1892F, -0.2932F, 0.9785F));

		PartDefinition Bodyfront_r57 = Bodyfront.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(110, 16).addBox(-0.0098F, 0.0251F, -0.3875F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3887F, -7.729F, 0.3092F, -0.161F, 0.4578F));

		PartDefinition Bodyfront_r58 = Bodyfront.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(12, 110).addBox(-0.434F, 0.2784F, -0.5883F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5887F, -9.529F, 0.4149F, -0.2257F, 0.5073F));

		PartDefinition Bodyfront_r59 = Bodyfront.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(99, 5).addBox(1.4954F, -0.5419F, -0.5883F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5887F, -9.529F, 0.2506F, -0.4009F, 1.0274F));

		PartDefinition Bodyfront_r60 = Bodyfront.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(101, 37).addBox(4.7515F, -2.8136F, -0.5883F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5887F, -9.529F, 0.0471F, -0.4669F, 1.5037F));

		PartDefinition Bodyfront_r61 = Bodyfront.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(100, 62).addBox(1.6196F, -1.0398F, -0.46F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.4353F, -11.1681F, 0.1771F, -0.5216F, 1.235F));

		PartDefinition Bodyfront_r62 = Bodyfront.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(110, 8).addBox(-0.0775F, -0.0907F, -0.46F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.4353F, -11.1681F, 0.4203F, -0.363F, 0.6805F));

		PartDefinition Bodyfront_r63 = Bodyfront.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(55, 113).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1514F, -8.0369F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r64 = Bodyfront.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(52, 113).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2909F, -10.0321F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r74 = Bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(83, 81).addBox(0.0263F, -2.0437F, 1.0518F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.2818F, 5.4485F, -7.0016F, 0.3087F, 0.0344F, -0.0778F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(83, 75).addBox(0.0263F, -1.7863F, 1.3837F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2818F, 5.4485F, -7.0016F, 0.5007F, 0.0344F, -0.0778F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(73, 101).addBox(-0.0155F, -1.8056F, 4.4747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.2818F, 5.4485F, -7.0016F, 0.3611F, 0.0344F, -0.0778F));

		PartDefinition cube_r77 = Bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(101, 70).addBox(-0.0155F, -4.2352F, 3.613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.2818F, 5.4485F, -7.0016F, -0.0403F, 0.0344F, -0.0778F));

		PartDefinition cube_r78 = Bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(83, 69).addBox(-0.1065F, -1.6274F, -2.1476F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2818F, 5.4485F, -7.0016F, 0.6092F, 0.0996F, -0.0168F));

		PartDefinition cube_r79 = Bodyfront.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(94, 77).addBox(-0.0818F, -2.5825F, -3.684F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2818F, 5.4485F, -7.0016F, 1.2566F, 0.1047F, 0.0F));

		PartDefinition cube_r80 = Bodyfront.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(110, 4).addBox(2.6649F, -0.1371F, -3.9009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.2818F, 5.4485F, -7.0016F, 0.311F, 0.8241F, 0.4725F));

		PartDefinition cube_r81 = Bodyfront.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 110).addBox(2.6649F, -2.1768F, -3.3013F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2818F, 5.4485F, -7.0016F, 0.8695F, 0.8241F, 0.4725F));

		PartDefinition cube_r82 = Bodyfront.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(94, 70).addBox(2.6649F, -0.1282F, -4.2932F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2818F, 5.4485F, -7.0016F, 0.7822F, 0.8241F, 0.4725F));

		PartDefinition cube_r83 = Bodyfront.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(58, 26).addBox(-2.0F, 1.3209F, 10.4435F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.7653F, -17.2629F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r84 = Bodyfront.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(21, 73).addBox(-1.0F, -0.5F, -1.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3888F, 9.0579F, -11.1315F, -1.0278F, 0.1376F, -0.2234F));

		PartDefinition cube_r85 = Bodyfront.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(46, 83).addBox(-0.5F, 1.2388F, 6.7551F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.7653F, -14.2629F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r86 = Bodyfront.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(88, 14).addBox(-1.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0411F, 11.5906F, -8.4619F, -0.4319F, -0.6929F, -0.7433F));

		PartDefinition cube_r87 = Bodyfront.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(33, 13).addBox(-0.8F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7219F, 12.4228F, -7.7265F, 0.042F, -0.9588F, -0.1112F));

		PartDefinition cube_r88 = Bodyfront.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(88, 12).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7226F, 12.4422F, -7.8204F, -0.0194F, -0.7251F, -0.6233F));

		PartDefinition Bodyfront_r65 = Bodyfront.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(35, 83).addBox(-0.5F, -0.1F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0119F, -6.0418F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r66 = Bodyfront.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(64, 109).addBox(0.0F, -3.5F, 0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.148F, -2.1442F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r67 = Bodyfront.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(36, 113).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0817F, -4.043F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r68 = Bodyfront.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(113, 28).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0119F, -6.0418F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r69 = Bodyfront.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(54, 71).addBox(-0.5F, -0.1F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1829F, -1.1448F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Neck1 = Bodyfront.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -10.0F, -0.3996F, 0.2079F, -0.0666F));

		PartDefinition Neckbase_r1 = Neck1.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(114, 117).addBox(0.0F, -3.0F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 82).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.4281F, -4.125F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Neckmiddlefront_r1 = Neck1.addOrReplaceChild("Neckmiddlefront_r1", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-0.069F, -0.6275F, -0.1025F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4463F, 1.808F, -3.1048F, -0.5039F, -0.2209F, 0.1653F));

		PartDefinition Neckmiddlefront_r2 = Neck1.addOrReplaceChild("Neckmiddlefront_r2", CubeListBuilder.create().texOffs(78, 47).addBox(0.069F, -0.6275F, -0.1025F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4463F, 1.808F, -3.1048F, -0.5039F, 0.2209F, -0.1653F));

		PartDefinition Bodyfront_r70 = Neck1.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(91, 65).addBox(0.0F, -2.0F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2121F, -1.2389F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r71 = Neck1.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(0, 102).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2097F, -1.1691F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.2366F, 0.2744F, 0.0175F));

		PartDefinition Neckmiddlebase_r1 = Neck2.addOrReplaceChild("Neckmiddlebase_r1", CubeListBuilder.create().texOffs(61, 113).addBox(0.0F, -2.3F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5874F, -0.5385F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Neckmiddlefront_r3 = Neck2.addOrReplaceChild("Neckmiddlefront_r3", CubeListBuilder.create().texOffs(90, 16).mirror().addBox(0.3627F, -0.641F, 0.0642F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8491F, 1.5698F, -1.4525F, -0.1828F, -0.2203F, 0.0974F));

		PartDefinition Neckmiddlefront_r4 = Neck2.addOrReplaceChild("Neckmiddlefront_r4", CubeListBuilder.create().texOffs(64, 89).mirror().addBox(0.0317F, -0.4792F, -0.0899F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5442F, 0.9641F, -3.3341F, -0.3218F, -0.1759F, 0.0953F));

		PartDefinition Neckmiddlefront_r5 = Neck2.addOrReplaceChild("Neckmiddlefront_r5", CubeListBuilder.create().texOffs(90, 16).addBox(-0.3627F, -0.641F, 0.0642F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8491F, 1.5698F, -1.4525F, -0.1828F, 0.2203F, -0.0974F));

		PartDefinition Neckmiddlefront_r6 = Neck2.addOrReplaceChild("Neckmiddlefront_r6", CubeListBuilder.create().texOffs(64, 89).addBox(-0.0317F, -0.4792F, -0.0899F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5442F, 0.9641F, -3.3341F, -0.3218F, 0.1759F, -0.0953F));

		PartDefinition Neckmiddlebase_r2 = Neck2.addOrReplaceChild("Neckmiddlebase_r2", CubeListBuilder.create().texOffs(58, 113).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2949F, -3.5259F, -0.2007F, 0.0F, 0.0F));

		PartDefinition Neckmiddlebase_r3 = Neck2.addOrReplaceChild("Neckmiddlebase_r3", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5F, 0.1F, 0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.0648F, 0.0671F, 0.0473F));

		PartDefinition Neckmiddlefront_r7 = Neck3.addOrReplaceChild("Neckmiddlefront_r7", CubeListBuilder.create().texOffs(73, 90).mirror().addBox(0.3202F, -0.5479F, -0.0835F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8285F, 0.6583F, -1.5308F, -0.5116F, -0.1345F, 0.0814F));

		PartDefinition Neckmiddlefront_r8 = Neck3.addOrReplaceChild("Neckmiddlefront_r8", CubeListBuilder.create().texOffs(100, 57).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1901F, -3.6692F, -0.5465F, -0.1345F, 0.0814F));

		PartDefinition Neckmiddlefront_r9 = Neck3.addOrReplaceChild("Neckmiddlefront_r9", CubeListBuilder.create().texOffs(73, 90).addBox(-0.3202F, -0.5479F, -0.0835F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8285F, 0.6583F, -1.5308F, -0.5116F, 0.1345F, -0.0814F));

		PartDefinition Neckmiddlefront_r10 = Neck3.addOrReplaceChild("Neckmiddlefront_r10", CubeListBuilder.create().texOffs(100, 57).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1901F, -3.6692F, -0.5465F, 0.1345F, -0.0814F));

		PartDefinition Neckmiddlefront_r11 = Neck3.addOrReplaceChild("Neckmiddlefront_r11", CubeListBuilder.create().texOffs(0, 85).addBox(-0.5F, 0.0344F, 0.0152F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.0737F, -4.336F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Neckfront_r3 = Neck3.addOrReplaceChild("Neckfront_r3", CubeListBuilder.create().texOffs(71, 113).addBox(0.0F, -2.6685F, 0.0111F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2173F, -1.4794F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Neckfront_r4 = Neck3.addOrReplaceChild("Neckfront_r4", CubeListBuilder.create().texOffs(113, 67).addBox(0.0F, -2.6558F, 0.2092F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7926F, -3.5334F, -0.2705F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.1039F, 0.0025F, -0.13F));

		PartDefinition Neckfront_r5 = Neck4.addOrReplaceChild("Neckfront_r5", CubeListBuilder.create().texOffs(113, 102).addBox(0.0F, -2.839F, 0.0171F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0343F, -1.2262F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Neckfront_r6 = Neck4.addOrReplaceChild("Neckfront_r6", CubeListBuilder.create().texOffs(86, 113).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2721F, -3.1001F, -0.4451F, 0.0F, 0.0F));

		PartDefinition Neckmiddlefront_r12 = Neck4.addOrReplaceChild("Neckmiddlefront_r12", CubeListBuilder.create().texOffs(100, 92).mirror().addBox(-0.539F, -0.6852F, 0.0891F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0435F, -0.7048F, -3.1349F, -0.4418F, -0.1345F, 0.0814F));

		PartDefinition Neckmiddlefront_r13 = Neck4.addOrReplaceChild("Neckmiddlefront_r13", CubeListBuilder.create().texOffs(61, 100).mirror().addBox(-0.2509F, -0.8579F, 0.1157F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2341F, -0.3319F, -1.3145F, -0.6513F, -0.1345F, 0.0814F));

		PartDefinition Neckmiddlefront_r14 = Neck4.addOrReplaceChild("Neckmiddlefront_r14", CubeListBuilder.create().texOffs(100, 92).addBox(0.539F, -0.6852F, 0.0891F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0435F, -0.7048F, -3.1349F, -0.4418F, 0.1345F, -0.0814F));

		PartDefinition Neckmiddlefront_r15 = Neck4.addOrReplaceChild("Neckmiddlefront_r15", CubeListBuilder.create().texOffs(61, 100).addBox(0.2509F, -0.8579F, 0.1157F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2341F, -0.3319F, -1.3145F, -0.6513F, 0.1345F, -0.0814F));

		PartDefinition Neckfront_r7 = Neck4.addOrReplaceChild("Neckfront_r7", CubeListBuilder.create().texOffs(86, 25).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -3.4F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2739F, -3.7011F, 0.1039F, 0.0025F, -0.13F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 91).addBox(-1.5F, -4.0F, -0.9F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9529F, -4.7936F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r89 = Head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(95, 0).addBox(-0.6124F, -0.1833F, -2.0756F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.1124F, -3.0505F, -1.235F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r90 = Head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(115, 72).addBox(-1.2483F, -0.5662F, -1.1336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7483F, -2.5407F, -1.3718F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r91 = Head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(87, 104).addBox(-1.2483F, -0.6862F, -0.8596F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7483F, -2.5407F, -1.3718F, 0.8639F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(78, 59).addBox(-2.0F, 0.0645F, -3.0428F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.4947F, -3.2367F, -1.0401F, 1.1418F, 0.0084F, -0.0081F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(78, 54).addBox(-2.0F, 0.0645F, -3.0428F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5056F, -2.8209F, -0.1307F, 0.8102F, 0.0084F, -0.0081F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(52, 78).addBox(-2.0F, -1.0355F, -3.0428F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4955F, -3.2427F, -0.9402F, 1.5607F, 0.0084F, -0.0081F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(94, 87).addBox(-2.5F, -2.9F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 0.857F, 0.9217F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(114, 111).mirror().addBox(-1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(114, 111).addBox(0.54F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.02F, -0.4611F, -2.1428F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(114, 114).mirror().addBox(-1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(114, 114).addBox(0.54F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.02F, 0.5376F, -2.1951F, 1.117F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(115, 4).mirror().addBox(-1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(47, 102).mirror().addBox(-1.5F, 0.4F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 102).addBox(0.54F, 0.4F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(115, 4).addBox(0.54F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.02F, 0.9759F, -1.2963F, 2.0944F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(79, 114).mirror().addBox(-1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(79, 114).addBox(0.54F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.02F, -2.3067F, -0.467F, -0.8727F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(114, 59).mirror().addBox(-1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(114, 59).addBox(0.54F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.02F, -2.4631F, -1.4547F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(110, 52).mirror().addBox(-1.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(110, 52).addBox(0.54F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.02F, -1.7166F, -1.1817F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(110, 63).mirror().addBox(-1.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(110, 63).addBox(0.54F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.02F, -1.081F, -0.8717F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(47, 110).mirror().addBox(-0.52F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(47, 114).mirror().addBox(-0.52F, -2.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(47, 114).addBox(1.52F, -2.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(47, 110).addBox(1.52F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 0.3745F, -2.6934F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(64, 115).mirror().addBox(-0.52F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(64, 115).addBox(1.52F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -1.7622F, -3.9299F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(108, 11).mirror().addBox(-0.52F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(0, 114).mirror().addBox(-0.76F, -2.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(113, 33).mirror().addBox(-0.6F, -2.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false)
				.texOffs(0, 114).addBox(1.76F, -2.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(113, 33).addBox(1.6F, -2.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(108, 11).addBox(1.52F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, 0.3745F, -2.6934F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(110, 73).mirror().addBox(-0.52F, -1.9F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(110, 73).addBox(1.52F, -1.9F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 0.1193F, -3.6654F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(115, 52).mirror().addBox(-0.5F, -0.2752F, -1.3801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(115, 39).mirror().addBox(-0.5F, -0.2752F, -0.8801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.32F, -0.9632F, -10.8376F, 0.2618F, -0.0175F, 0.0F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(103, 78).mirror().addBox(-0.5F, -0.3027F, -0.2846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.32F, -0.9632F, -10.8376F, 0.5934F, -0.0175F, 0.0F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(115, 42).mirror().addBox(-0.5F, -0.694F, 0.3874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.32F, -0.9632F, -10.8376F, 0.2967F, -0.0175F, 0.0F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(80, 103).mirror().addBox(-0.5F, -0.5797F, -1.2997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.32F, -0.9632F, -10.8376F, 0.5061F, -0.0175F, 0.0F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(17, 115).mirror().addBox(-0.65F, -0.8666F, -2.619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.57F, -1.3495F, -6.7976F, 0.4887F, -0.1047F, -0.0175F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(115, 55).mirror().addBox(-0.55F, 0.2831F, 0.1557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(103, 86).mirror().addBox(-0.55F, -0.7169F, -0.4443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(115, 62).mirror().addBox(-0.55F, 0.2831F, 0.5557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.57F, -1.2495F, -6.7976F, 0.0698F, -0.1047F, -0.0349F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(103, 82).mirror().addBox(-0.55F, 0.0468F, -1.2418F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.57F, -1.2495F, -6.7976F, -0.4363F, -0.1047F, -0.0349F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(103, 74).mirror().addBox(-0.55F, -0.9666F, -1.119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.57F, -1.2495F, -6.7976F, 0.4887F, -0.1047F, -0.0349F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(104, 0).mirror().addBox(-0.55F, 1.0153F, -0.0709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.57F, -1.2495F, -6.7976F, 0.9861F, -0.1047F, -0.0349F));

		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(103, 64).mirror().addBox(-0.55F, -1.2096F, 0.4973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.57F, -1.2495F, -6.7976F, 0.1396F, -0.1047F, -0.0349F));

		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(104, 0).addBox(-0.45F, 1.0153F, -0.0709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.57F, -1.2495F, -6.7976F, 0.9861F, 0.1047F, 0.0349F));

		PartDefinition Head_r28 = Head.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(103, 86).addBox(-0.45F, -0.7169F, -0.4443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F))
				.texOffs(115, 62).addBox(-0.45F, 0.2831F, 0.5557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(115, 55).addBox(-0.45F, 0.2831F, 0.1557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.57F, -1.2495F, -6.7976F, 0.0698F, 0.1047F, 0.0349F));

		PartDefinition Head_r29 = Head.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(103, 82).addBox(-0.45F, 0.0468F, -1.2418F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.57F, -1.2495F, -6.7976F, -0.4363F, 0.1047F, 0.0349F));

		PartDefinition Head_r30 = Head.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(115, 52).addBox(-0.5F, -0.2752F, -1.3801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(115, 39).addBox(-0.5F, -0.2752F, -0.8801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.32F, -0.9632F, -10.8376F, 0.2618F, 0.0175F, 0.0F));

		PartDefinition Head_r31 = Head.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(115, 42).addBox(-0.5F, -0.694F, 0.3874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.32F, -0.9632F, -10.8376F, 0.2967F, 0.0175F, 0.0F));

		PartDefinition Head_r32 = Head.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(80, 103).addBox(-0.5F, -0.5797F, -1.2997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.32F, -0.9632F, -10.8376F, 0.5061F, 0.0175F, 0.0F));

		PartDefinition Head_r33 = Head.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(103, 78).addBox(-0.5F, -0.3027F, -0.2846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.32F, -0.9632F, -10.8376F, 0.5934F, 0.0175F, 0.0F));

		PartDefinition Head_r34 = Head.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(17, 115).addBox(-0.35F, -0.8666F, -2.619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.57F, -1.3495F, -6.7976F, 0.4887F, 0.1047F, 0.0175F));

		PartDefinition Head_r35 = Head.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(103, 74).addBox(-0.45F, -0.9666F, -1.119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.57F, -1.2495F, -6.7976F, 0.4887F, 0.1047F, 0.0349F));

		PartDefinition Head_r36 = Head.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(103, 64).addBox(-0.45F, -1.2096F, 0.4973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.57F, -1.2495F, -6.7976F, 0.1396F, 0.1047F, 0.0349F));

		PartDefinition Head_r37 = Head.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(41, 67).addBox(-2.5F, -4.0F, -3.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, 1.4198F, -1.8465F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Head_r38 = Head.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(83, 87).addBox(-2.5F, -2.9F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 1.2153F, 0.1455F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.0F, 1.4198F, -1.8465F));

		PartDefinition leftFace2 = Head.addOrReplaceChild("leftFace2", CubeListBuilder.create(), PartPose.offset(-0.5F, 2.1697F, 1.3889F));

		PartDefinition Head_r39 = leftFace2.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(7, 105).addBox(1.0F, -0.8409F, -2.3569F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head_r40 = leftFace2.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(115, 78).addBox(1.0F, 0.2645F, -0.9428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(74, 115).addBox(1.0F, -0.1355F, -0.9428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -4.1272F, -0.7251F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftFace2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(115, 75).addBox(-0.7024F, -0.0435F, -0.8376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.6124F, -5.2202F, -2.6238F, 2.4586F, 1.1331F, -0.1443F));

		PartDefinition rightFace2 = Head.addOrReplaceChild("rightFace2", CubeListBuilder.create(), PartPose.offset(0.5F, 2.1697F, 1.3889F));

		PartDefinition Head_r41 = rightFace2.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(7, 105).mirror().addBox(-2.0F, -0.8409F, -2.3569F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head_r42 = rightFace2.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(115, 78).mirror().addBox(-2.0F, 0.2645F, -0.9428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(74, 115).mirror().addBox(-2.0F, -0.1355F, -0.9428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.1272F, -0.7251F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightFace2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(115, 75).mirror().addBox(-0.2976F, -0.0435F, -0.8376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.6124F, -5.2202F, -2.6238F, 2.4586F, -1.1331F, 0.1443F));

		PartDefinition Upperjaw = Head.addOrReplaceChild("Upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -4.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r1 = Upperjaw.addOrReplaceChild("Upperjawslopebase_r1", CubeListBuilder.create().texOffs(88, 6).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.2265F, 0.8227F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftFace = Upperjaw.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.2F, 1.962F, -8.8692F));

		PartDefinition Upperjawslopefront_r1 = leftFace.addOrReplaceChild("Upperjawslopefront_r1", CubeListBuilder.create().texOffs(84, 6).mirror().addBox(0.6F, 0.1504F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(84, 6).addBox(1.4F, 0.1504F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-2.2F, 0.9954F, 0.0958F, 1.8413F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r1 = leftFace.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(41, 64).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.6775F, 1.0935F, 2.1197F, -0.0611F, -0.0524F, 0.0F));

		PartDefinition Upperjawfront_r2 = leftFace.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(73, 9).mirror().addBox(0.3617F, -0.1371F, -4.2555F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.9003F, 7.1863F, 0.0087F, -0.0524F, 0.0F));

		PartDefinition Rightcrestbase_r1 = leftFace.addOrReplaceChild("Rightcrestbase_r1", CubeListBuilder.create().texOffs(115, 81).mirror().addBox(-0.4891F, -1.0047F, -0.8183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1916F, -2.5908F, 8.2354F, -0.0067F, -0.1026F, -0.2348F));

		PartDefinition Rightcrestbase_r2 = leftFace.addOrReplaceChild("Rightcrestbase_r2", CubeListBuilder.create().texOffs(54, 105).mirror().addBox(-0.5187F, -0.6149F, -0.9001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3764F, -3.2058F, 8.8093F, 0.5042F, -0.0531F, -0.1831F));

		PartDefinition Rightcrestbase_r3 = leftFace.addOrReplaceChild("Rightcrestbase_r3", CubeListBuilder.create().texOffs(110, 77).mirror().addBox(-0.5187F, -1.2418F, -0.1709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3764F, -3.2058F, 8.8093F, -0.7088F, -0.0531F, -0.1831F));

		PartDefinition Rightcrestbase_r4 = leftFace.addOrReplaceChild("Rightcrestbase_r4", CubeListBuilder.create().texOffs(61, 105).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3421F, -3.2804F, 8.3531F, 0.2305F, -0.0987F, -0.1708F));

		PartDefinition Rightcrestbase_r5 = leftFace.addOrReplaceChild("Rightcrestbase_r5", CubeListBuilder.create().texOffs(115, 84).mirror().addBox(-0.4891F, -1.1789F, -1.5819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1916F, -2.5908F, 8.2354F, 0.1941F, -0.1026F, -0.2348F));

		PartDefinition Upperjawslopebase_r2 = leftFace.addOrReplaceChild("Upperjawslopebase_r2", CubeListBuilder.create().texOffs(41, 75).mirror().addBox(-0.2F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(41, 75).addBox(0.2F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.7F, -2.9792F, 5.6974F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r3 = leftFace.addOrReplaceChild("Upperjawslopebase_r3", CubeListBuilder.create().texOffs(77, 9).mirror().addBox(-0.2F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(77, 9).addBox(0.2F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.7F, -2.2846F, 1.7582F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r2 = leftFace.addOrReplaceChild("Upperjawslopefront_r2", CubeListBuilder.create().texOffs(110, 93).mirror().addBox(0.6F, -0.0496F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(110, 93).addBox(0.8F, -0.0496F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.4F, 0.0F, 0.0F, 1.6668F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r3 = leftFace.addOrReplaceChild("Upperjawslopefront_r3", CubeListBuilder.create().texOffs(110, 89).mirror().addBox(0.6F, -0.0496F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(110, 89).addBox(0.8F, -0.0496F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-2.4F, -0.9483F, 0.3173F, 1.2479F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r4 = leftFace.addOrReplaceChild("Upperjawslopefront_r4", CubeListBuilder.create().texOffs(110, 85).mirror().addBox(0.6F, -0.0496F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(110, 85).addBox(0.8F, -0.0496F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.4F, -1.6367F, 1.0427F, 0.7592F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r5 = leftFace.addOrReplaceChild("Upperjawslopefront_r5", CubeListBuilder.create().texOffs(110, 81).mirror().addBox(-0.2F, 0.3504F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(110, 81).addBox(0.2F, 0.3504F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.7F, -1.467F, 0.1645F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r3 = leftFace.addOrReplaceChild("Upperjawfront_r3", CubeListBuilder.create().texOffs(98, 100).mirror().addBox(0.3617F, -1.371F, -6.2089F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.9003F, 7.0862F, -0.1484F, -0.0524F, 0.0F));

		PartDefinition Upperjawfront_r4 = leftFace.addOrReplaceChild("Upperjawfront_r4", CubeListBuilder.create().texOffs(108, 26).mirror().addBox(0.3617F, -3.0371F, -4.2555F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.9003F, 7.0862F, 0.0087F, -0.0524F, 0.0F));

		PartDefinition Upperjawbase_r1 = leftFace.addOrReplaceChild("Upperjawbase_r1", CubeListBuilder.create().texOffs(91, 39).mirror().addBox(0.1314F, -0.7889F, 0.1694F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9552F, 1.5629F, 4.2347F, 0.1587F, -0.1026F, -0.0294F));

		PartDefinition Upperjawbase_r2 = leftFace.addOrReplaceChild("Upperjawbase_r2", CubeListBuilder.create().texOffs(21, 64).mirror().addBox(0.1314F, -3.1889F, -3.2306F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.9003F, 7.0862F, 0.0538F, -0.1036F, -0.0257F));

		PartDefinition Rightcrestfront_r1 = leftFace.addOrReplaceChild("Rightcrestfront_r1", CubeListBuilder.create().texOffs(13, 80).mirror().addBox(-0.4863F, -1.1795F, -2.1428F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5629F, -1.7046F, 4.4996F, 0.2741F, -0.097F, -0.268F));

		PartDefinition Rightcrestmiddle_r1 = leftFace.addOrReplaceChild("Rightcrestmiddle_r1", CubeListBuilder.create().texOffs(29, 95).mirror().addBox(-0.5177F, -0.0691F, -2.9465F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2459F, -3.4477F, 6.6664F, 0.3274F, -0.0938F, -0.2644F));

		PartDefinition Leftcrestfront_r1 = leftFace.addOrReplaceChild("Leftcrestfront_r1", CubeListBuilder.create().texOffs(13, 80).addBox(-0.5137F, -1.1795F, -2.1428F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8371F, -1.7046F, 4.4996F, 0.2741F, 0.097F, 0.268F));

		PartDefinition Leftcrestmiddle_r1 = leftFace.addOrReplaceChild("Leftcrestmiddle_r1", CubeListBuilder.create().texOffs(29, 95).addBox(-0.4823F, -0.0691F, -2.9465F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1541F, -3.4477F, 6.6664F, 0.3274F, 0.0938F, 0.2644F));

		PartDefinition Leftcrestbase_r1 = leftFace.addOrReplaceChild("Leftcrestbase_r1", CubeListBuilder.create().texOffs(115, 84).addBox(-0.5109F, -1.1789F, -1.5819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2084F, -2.5908F, 8.2354F, 0.1941F, 0.1026F, 0.2348F));

		PartDefinition Leftcrestbase_r2 = leftFace.addOrReplaceChild("Leftcrestbase_r2", CubeListBuilder.create().texOffs(61, 105).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0579F, -3.2804F, 8.3531F, 0.2305F, 0.0987F, 0.1708F));

		PartDefinition Leftcrestbase_r3 = leftFace.addOrReplaceChild("Leftcrestbase_r3", CubeListBuilder.create().texOffs(115, 81).addBox(-0.5109F, -1.0047F, -0.8183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2084F, -2.5908F, 8.2354F, -0.0067F, 0.1026F, 0.2348F));

		PartDefinition Leftcrestbase_r4 = leftFace.addOrReplaceChild("Leftcrestbase_r4", CubeListBuilder.create().texOffs(110, 77).addBox(-0.4813F, -1.2418F, -0.1709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0236F, -3.2058F, 8.8093F, -0.7088F, 0.0531F, 0.1831F));

		PartDefinition Upperjawfront_r5 = leftFace.addOrReplaceChild("Upperjawfront_r5", CubeListBuilder.create().texOffs(73, 9).addBox(-0.3617F, -0.1371F, -4.2555F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1F, 0.9003F, 7.1863F, 0.0087F, 0.0524F, 0.0F));

		PartDefinition Upperjawfront_r6 = leftFace.addOrReplaceChild("Upperjawfront_r6", CubeListBuilder.create().texOffs(108, 26).addBox(-1.3617F, -3.0371F, -4.2555F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1F, 0.9003F, 7.0862F, 0.0087F, 0.0524F, 0.0F));

		PartDefinition Upperjawfront_r7 = leftFace.addOrReplaceChild("Upperjawfront_r7", CubeListBuilder.create().texOffs(41, 64).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7225F, 1.0935F, 2.1197F, -0.0611F, 0.0524F, 0.0F));

		PartDefinition Upperjawfront_r8 = leftFace.addOrReplaceChild("Upperjawfront_r8", CubeListBuilder.create().texOffs(98, 100).addBox(-1.3617F, -1.371F, -6.2089F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1F, 0.9003F, 7.0862F, -0.1484F, 0.0524F, 0.0F));

		PartDefinition Leftcrestbase_r5 = leftFace.addOrReplaceChild("Leftcrestbase_r5", CubeListBuilder.create().texOffs(54, 105).addBox(-0.4813F, -0.6149F, -0.9001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0236F, -3.2058F, 8.8093F, 0.5042F, 0.0531F, 0.1831F));

		PartDefinition Upperjawbase_r3 = leftFace.addOrReplaceChild("Upperjawbase_r3", CubeListBuilder.create().texOffs(91, 39).addBox(-0.1314F, -0.7889F, 0.1694F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4448F, 1.5629F, 4.2347F, 0.1587F, 0.1026F, 0.0294F));

		PartDefinition Upperjawbase_r4 = leftFace.addOrReplaceChild("Upperjawbase_r4", CubeListBuilder.create().texOffs(21, 64).addBox(-1.1314F, -3.1889F, -3.2306F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.9003F, 7.0862F, 0.0538F, 0.1036F, 0.0257F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5763F, 1.2239F, 0.6562F, 0.0F, 0.0F));

		PartDefinition cube_r94 = Lowerjaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(38, 96).mirror().addBox(-0.5343F, -0.1166F, 1.0656F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3768F, 2.776F, -3.9249F, 0.3873F, -0.0491F, 0.0794F));

		PartDefinition cube_r95 = Lowerjaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-1.1208F, -16.7997F, -6.6097F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 19.6672F, -1.2826F, -0.1535F, -0.3134F, -0.0227F));

		PartDefinition cube_r96 = Lowerjaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(14, 106).mirror().addBox(-0.3178F, -0.469F, -0.2146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3768F, 2.776F, -3.9249F, 0.1503F, -0.1943F, 0.0191F));

		PartDefinition Lowerjawfront_r1 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(91, 53).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3482F, 0.2706F, -9.3972F, 0.0526F, -0.1134F, -0.0046F));

		PartDefinition Lowerjawfront_r2 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r2", CubeListBuilder.create().texOffs(101, 11).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1707F, 1.0078F, -10.68F, 0.096F, -0.0698F, 0.0F));

		PartDefinition Lowerjawfront_r3 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r3", CubeListBuilder.create().texOffs(101, 11).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1707F, 1.0078F, -10.68F, 0.096F, 0.0698F, 0.0F));

		PartDefinition Lowerjawfront_r4 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r4", CubeListBuilder.create().texOffs(101, 11).mirror().addBox(-0.671F, -0.9989F, -0.9881F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1074F, -12.1705F, 0.026F, -0.0696F, 0.0049F));

		PartDefinition Lowerjawfront_r5 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r5", CubeListBuilder.create().texOffs(109, 115).mirror().addBox(-0.3F, -0.9F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 1.0615F, -13.5669F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r1 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r1", CubeListBuilder.create().texOffs(106, 22).mirror().addBox(-2.02F, -1.6F, -3.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(91, 59).mirror().addBox(-2.0F, -1.9F, -2.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(106, 22).addBox(-0.18F, -1.6F, -3.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(91, 59).addBox(-0.2F, -1.9F, -2.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.6F, 1.7866F, -1.4725F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r6 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r6", CubeListBuilder.create().texOffs(116, 0).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.113F)).mirror(false)
				.texOffs(116, 0).addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.2F, 1.8481F, -13.4211F, 1.3003F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r7 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r7", CubeListBuilder.create().texOffs(115, 107).mirror().addBox(-0.5F, -0.1F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false)
				.texOffs(104, 115).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(115, 107).addBox(-0.1F, -0.1F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F))
				.texOffs(104, 115).addBox(-0.1F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 0.8428F, -12.387F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r8 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r8", CubeListBuilder.create().texOffs(101, 105).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4248F, 1.0118F, -9.6446F, 0.1814F, -0.0713F, 0.0159F));

		PartDefinition Lowerjawslopefront_r1 = Lowerjaw.addOrReplaceChild("Lowerjawslopefront_r1", CubeListBuilder.create().texOffs(21, 107).mirror().addBox(-0.1F, -1.5928F, -1.9264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(47, 106).mirror().addBox(-0.1F, -0.7928F, -1.9264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.9495F, -6.6681F, -0.1292F, -0.1571F, 0.0F));

		PartDefinition Lowerjawmiddle_r1 = Lowerjaw.addOrReplaceChild("Lowerjawmiddle_r1", CubeListBuilder.create().texOffs(99, 115).mirror().addBox(-0.1F, -2.1198F, -1.0123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.9495F, -6.6681F, 0.096F, -0.1571F, 0.0F));

		PartDefinition Lowerjawslopefront_r2 = Lowerjaw.addOrReplaceChild("Lowerjawslopefront_r2", CubeListBuilder.create().texOffs(11, 116).mirror().addBox(-0.1F, -2.0819F, -2.1281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.9495F, -6.6681F, 0.2374F, -0.1571F, 0.0F));

		PartDefinition Lowerjawbase_r1 = Lowerjaw.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(115, 93).mirror().addBox(-2.5F, -0.0988F, -0.8521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(115, 93).addBox(-0.7F, -0.0988F, -0.8521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1F, -0.4531F, -3.5403F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r2 = Lowerjaw.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(115, 90).mirror().addBox(-2.5F, -0.0988F, -0.8521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(115, 90).addBox(-0.7F, -0.0988F, -0.8521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.1F, -0.467F, -2.7404F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r3 = Lowerjaw.addOrReplaceChild("Lowerjawbase_r3", CubeListBuilder.create().texOffs(89, 115).mirror().addBox(-2.5F, -0.0988F, -0.8521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(89, 115).addBox(-0.7F, -0.0988F, -0.8521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1F, -0.4112F, -1.9424F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r4 = Lowerjaw.addOrReplaceChild("Lowerjawbase_r4", CubeListBuilder.create().texOffs(115, 87).mirror().addBox(-2.5F, -0.0988F, -0.7521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(115, 87).addBox(-0.7F, -0.0988F, -0.7521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1F, -0.2301F, -1.2662F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopefront_r3 = Lowerjaw.addOrReplaceChild("Lowerjawslopefront_r3", CubeListBuilder.create().texOffs(111, 0).mirror().addBox(-2.5F, -1.9306F, -0.7973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(111, 0).addBox(-0.7F, -1.9306F, -0.7973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1F, 2.263F, -4.2653F, -0.0593F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopefront_r4 = Lowerjaw.addOrReplaceChild("Lowerjawslopefront_r4", CubeListBuilder.create().texOffs(16, 101).mirror().addBox(-2.0F, -1.9306F, -1.7973F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.108F)).mirror(false)
				.texOffs(16, 101).addBox(-0.2F, -1.9306F, -1.7973F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.6F, 2.2375F, -5.0378F, -0.1117F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r9 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r9", CubeListBuilder.create().texOffs(64, 95).mirror().addBox(-0.5F, -0.3056F, -1.2237F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2997F, 1.3546F, -11.0661F, 0.1484F, -0.0698F, 0.0F));

		PartDefinition Lowerjawfront_r10 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r10", CubeListBuilder.create().texOffs(105, 100).mirror().addBox(-0.5F, -0.6644F, -1.2951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.2997F, 1.3546F, -11.0661F, 0.0436F, -0.0698F, 0.0F));

		PartDefinition Lowerjawmiddle_r2 = Lowerjaw.addOrReplaceChild("Lowerjawmiddle_r2", CubeListBuilder.create().texOffs(55, 95).mirror().addBox(-2.0F, -0.1476F, -2.9012F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(55, 95).addBox(-0.2F, -0.1476F, -2.9012F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.6F, -0.3438F, -4.2569F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r11 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r11", CubeListBuilder.create().texOffs(116, 10).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false)
				.texOffs(116, 10).addBox(-0.1F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.2F, 1.6554F, -12.5579F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopefront_r5 = Lowerjaw.addOrReplaceChild("Lowerjawslopefront_r5", CubeListBuilder.create().texOffs(106, 31).mirror().addBox(-0.1F, -0.8774F, -3.6466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.9495F, -6.6681F, -0.0768F, -0.1571F, 0.0F));

		PartDefinition Lowerjawbase_r5 = Lowerjaw.addOrReplaceChild("Lowerjawbase_r5", CubeListBuilder.create().texOffs(94, 105).mirror().addBox(-2.5F, 0.7F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(94, 105).addBox(-0.7F, 0.7F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.1F, -0.2F, -0.8F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r2 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r2", CubeListBuilder.create().texOffs(18, 96).mirror().addBox(-2.5F, -0.8F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(18, 96).addBox(-0.7F, -0.8F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1F, 0.7375F, 0.7989F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r3 = Lowerjaw.addOrReplaceChild("Lowerjawmiddle_r3", CubeListBuilder.create().texOffs(94, 115).mirror().addBox(-0.1F, -2.2996F, -1.1148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.9495F, -6.6681F, 0.4276F, -0.1571F, 0.0F));

		PartDefinition Lowerjawbase_r6 = Lowerjaw.addOrReplaceChild("Lowerjawbase_r6", CubeListBuilder.create().texOffs(73, 105).mirror().addBox(-2.5F, -0.1988F, -1.8521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(73, 105).addBox(-0.7F, -0.1988F, -1.8521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(1.1F, 0.1349F, 0.4992F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopefront_r6 = Lowerjaw.addOrReplaceChild("Lowerjawslopefront_r6", CubeListBuilder.create().texOffs(21, 107).addBox(-0.9F, -1.5928F, -1.9264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F))
				.texOffs(47, 106).addBox(-0.9F, -0.7928F, -1.9264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2F, 1.9495F, -6.6681F, -0.1292F, 0.1571F, 0.0F));

		PartDefinition Lowerjawslopefront_r7 = Lowerjaw.addOrReplaceChild("Lowerjawslopefront_r7", CubeListBuilder.create().texOffs(11, 116).addBox(-0.9F, -2.0819F, -2.1281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(1.2F, 1.9495F, -6.6681F, 0.2374F, 0.1571F, 0.0F));

		PartDefinition Lowerjawslopefront_r8 = Lowerjaw.addOrReplaceChild("Lowerjawslopefront_r8", CubeListBuilder.create().texOffs(106, 31).addBox(-0.9F, -0.8774F, -3.6466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(1.2F, 1.9495F, -6.6681F, -0.0768F, 0.1571F, 0.0F));

		PartDefinition cube_r97 = Lowerjaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(38, 96).addBox(-0.4657F, -0.1166F, 1.0656F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3768F, 2.776F, -3.9249F, 0.3873F, 0.0491F, -0.0794F));

		PartDefinition cube_r98 = Lowerjaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(14, 106).addBox(-0.6822F, -0.469F, -0.2146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3768F, 2.776F, -3.9249F, 0.1503F, 0.1943F, -0.0191F));

		PartDefinition cube_r99 = Lowerjaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 106).addBox(0.1208F, -16.7997F, -6.6097F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 19.6672F, -1.2826F, -0.1535F, 0.3134F, 0.0227F));

		PartDefinition Lowerjawfront_r12 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r12", CubeListBuilder.create().texOffs(91, 53).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3482F, 0.2706F, -9.3972F, 0.0526F, 0.1134F, 0.0046F));

		PartDefinition Lowerjawfront_r13 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r13", CubeListBuilder.create().texOffs(101, 105).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4248F, 1.0118F, -9.6446F, 0.1814F, 0.0713F, -0.0159F));

		PartDefinition Lowerjawfront_r14 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r14", CubeListBuilder.create().texOffs(101, 11).addBox(-0.329F, -0.9989F, -0.9881F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.1074F, -12.1705F, 0.026F, 0.0696F, -0.0049F));

		PartDefinition Lowerjawfront_r15 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r15", CubeListBuilder.create().texOffs(105, 100).addBox(-0.5F, -0.6644F, -1.2951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.2997F, 1.3546F, -11.0661F, 0.0436F, 0.0698F, 0.0F));

		PartDefinition Lowerjawfront_r16 = Lowerjaw.addOrReplaceChild("Lowerjawfront_r16", CubeListBuilder.create().texOffs(64, 95).addBox(-0.5F, -0.3056F, -1.2237F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2997F, 1.3546F, -11.0661F, 0.1484F, 0.0698F, 0.0F));

		PartDefinition Lowerjawmiddle_r4 = Lowerjaw.addOrReplaceChild("Lowerjawmiddle_r4", CubeListBuilder.create().texOffs(99, 115).addBox(-0.9F, -2.1198F, -1.0123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2F, 1.9495F, -6.6681F, 0.096F, 0.1571F, 0.0F));

		PartDefinition Lowerjawmiddle_r5 = Lowerjaw.addOrReplaceChild("Lowerjawmiddle_r5", CubeListBuilder.create().texOffs(94, 115).addBox(-0.9F, -2.2996F, -1.1148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.2F, 1.9495F, -6.6681F, 0.4276F, 0.1571F, 0.0F));

		PartDefinition Leftarm1 = Bodyfront.addOrReplaceChild("Leftarm1", CubeListBuilder.create().texOffs(116, 13).addBox(-0.027F, -0.2648F, 0.4069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.8053F, 9.2442F, -10.5553F, 0.6209F, 0.2264F, -0.1688F));

		PartDefinition Leftupperarm_r1 = Leftarm1.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(94, 111).addBox(-0.5F, -0.1796F, -0.2077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.473F, 2.7352F, 0.9069F, -0.1012F, -0.0234F, -0.0062F));

		PartDefinition Leftupperarm_r2 = Leftarm1.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(19, 111).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.473F, 0.6351F, 0.9069F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftarm1.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(116, 25).addBox(-0.5F, 0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(116, 22).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.473F, 0.2352F, 0.9069F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create().texOffs(68, 100).addBox(-0.5F, -1.35F, 0.2F, 1.0F, 5.25F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 107).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(0.523F, 5.0862F, 0.83F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create().texOffs(67, 71).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5433F, 4.0048F, 0.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Rightarm1 = Bodyfront.addOrReplaceChild("Rightarm1", CubeListBuilder.create().texOffs(27, 116).addBox(-0.973F, -0.2648F, 0.4069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-3.8053F, 9.2442F, -10.5553F, 0.4491F, -0.3252F, 0.3184F));

		PartDefinition Rightupperarm_r1 = Rightarm1.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(104, 111).addBox(-0.5F, -0.1796F, -0.2077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.473F, 2.7352F, 0.9069F, -0.1012F, 0.0234F, 0.0062F));

		PartDefinition Rightupperarm_r2 = Rightarm1.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(99, 111).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.473F, 0.6351F, 0.9069F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightarm1.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(116, 48).addBox(-0.5F, 0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(116, 28).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.473F, 0.2352F, 0.9069F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create().texOffs(37, 101).addBox(-0.5F, -1.35F, 0.2F, 1.0F, 5.25F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 39).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(-0.523F, 5.0862F, 0.83F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create().texOffs(73, 0).addBox(0.0F, 0.0F, -2.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5433F, 4.0048F, 0.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Leftleg1 = Hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create().texOffs(88, 31).addBox(-2.0F, -1.195F, -1.1496F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 1.9F, 2.5715F, -0.0436F, 0.0019F, 0.0436F));

		PartDefinition Leftthigh_r1 = Leftleg1.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(73, 26).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0523F, 0.7422F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftleg1.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(9, 93).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 8.2269F, -1.7738F, 0.2705F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Leftleg1.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(73, 96).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.2331F, -1.9307F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Leftleg1.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(11, 85).addBox(-2.0F, -1.4F, -0.7F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 2.805F, -0.6496F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 13.705F, 0.0504F, 0.9599F, 0.0F, 0.0F));

		PartDefinition Leftshin_r1 = Leftleg2.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(54, 67).addBox(-2.3F, -5.1883F, 0.1687F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(78, 69).addBox(-1.3F, -3.6883F, 0.1687F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(0, 65).addBox(-1.3F, -4.4883F, -1.8313F, 1.0F, 12.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(34, 64).addBox(-1.8F, -4.4883F, -1.8313F, 1.0F, 12.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, 5.6439F, 0.9547F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Leftshin_r2 = Leftleg2.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(108, 68).addBox(-0.8F, -2.8883F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 4.7439F, 1.4547F, -1.5708F, 1.3614F, -1.5708F));

		PartDefinition Leftshin_r3 = Leftleg2.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(36, 108).addBox(-0.8F, -2.7883F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 4.7439F, 1.4547F, 1.5708F, 1.3439F, 1.5708F));

		PartDefinition Leftshin_r4 = Leftleg2.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(109, 111).addBox(-0.8F, -0.2883F, 0.1687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 11.1439F, 1.4547F, -1.5708F, 1.2217F, -1.5708F));

		PartDefinition Leftshin_r5 = Leftleg2.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(0, 97).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3313F, 12.1556F, 2.2547F, -1.5708F, 0.8727F, -1.5708F));

		PartDefinition Leftshin_r6 = Leftleg2.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(9, 99).addBox(-1.0F, -2.9883F, -1.8313F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.5F, 4.1439F, 1.2547F, 1.5708F, 1.2043F, 1.5708F));

		PartDefinition Leftshin_r7 = Leftleg2.addOrReplaceChild("Leftshin_r7", CubeListBuilder.create().texOffs(78, 64).addBox(-2.5F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.3313F, 1.0556F, 1.2547F, -1.5708F, 1.2217F, -1.5708F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create().texOffs(21, 79).addBox(-0.9F, -0.1292F, -1.6609F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 14.4629F, 1.2762F, -0.829F, 0.0F, 0.0F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create().texOffs(58, 12).addBox(-3.0F, -0.5F, -3.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 5.7764F, -0.5819F, 0.3051F, 0.0057F, -0.0435F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create().texOffs(58, 19).addBox(-3.0F, -0.5F, -4.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightleg1 = Hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create().texOffs(35, 89).addBox(-1.0F, -1.195F, -1.1496F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9F, 1.9F, 2.5715F, -0.8206F, 0.3372F, -0.0373F));

		PartDefinition Rightthigh_r1 = Rightleg1.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(77, 17).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0523F, 0.7422F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightleg1.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(82, 93).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 8.2269F, -1.7738F, 0.2705F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Rightleg1.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(97, 22).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.2331F, -1.9307F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Rightleg1.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(20, 88).addBox(0.0F, -1.4F, -0.7F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 2.805F, -0.6496F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 13.705F, 0.0504F, 1.5708F, -0.0873F, 0.0F));

		PartDefinition Rightshin_r1 = Rightleg2.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(82, 99).addBox(-0.7F, -5.1883F, 0.1687F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(30, 79).addBox(0.3F, -3.6883F, 0.1687F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(14, 65).addBox(0.3F, -4.4883F, -1.8313F, 1.0F, 12.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(7, 65).addBox(0.8F, -4.4883F, -1.8313F, 1.0F, 12.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5F, 5.6439F, 0.9547F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Rightshin_r2 = Rightleg2.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(108, 104).addBox(-0.2F, -2.8883F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 4.7439F, 1.4547F, -1.5708F, -1.3614F, 1.5708F));

		PartDefinition Rightshin_r3 = Rightleg2.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(86, 108).addBox(-0.2F, -2.7883F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 4.7439F, 1.4547F, 1.5708F, -1.3439F, -1.5708F));

		PartDefinition Rightshin_r4 = Rightleg2.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(12, 112).addBox(-0.2F, -0.2883F, 0.1687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 11.1439F, 1.4547F, -1.5708F, -1.2217F, 1.5708F));

		PartDefinition Rightshin_r5 = Rightleg2.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(98, 45).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3313F, 12.1556F, 2.2547F, -1.5708F, -0.8727F, 1.5708F));

		PartDefinition Rightshin_r6 = Rightleg2.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(99, 31).addBox(0.0F, -2.9883F, -1.8313F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.5F, 4.1439F, 1.2547F, 1.5708F, -1.2043F, -1.5708F));

		PartDefinition Rightshin_r7 = Rightleg2.addOrReplaceChild("Rightshin_r7", CubeListBuilder.create().texOffs(0, 80).addBox(-1.5F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3313F, 1.0556F, 1.2547F, -1.5708F, -1.2217F, 1.5708F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create().texOffs(65, 80).addBox(-1.1F, -0.1292F, -1.6609F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 14.4629F, 1.2762F, -1.3963F, 0.0F, 0.0F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create().texOffs(44, 60).addBox(-2.0F, -0.5F, -3.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 5.7764F, -0.5819F, 1.3963F, 0.0F, 0.0F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create().texOffs(63, 40).addBox(-2.0F, -0.5F, -4.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.445F, 9.4541F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition Tailbase_r1 = Tail1.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(32, 114).addBox(0.0F, 1.5F, 8.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 22).addBox(0.0F, -0.3F, 6.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4182F, 1.2067F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tail1.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(113, 10).addBox(0.0F, 0.0F, 0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.773F, 4.2764F, 0.5411F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tail1.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(8, 113).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6697F, 2.1318F, 0.6632F, 0.0F, 0.0F));

		PartDefinition Neckfront_r8 = Tail1.addOrReplaceChild("Neckfront_r8", CubeListBuilder.create().texOffs(91, 108).addBox(0.0F, -3.9036F, -0.9955F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7097F, 1.0847F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Neckfront_r9 = Tail1.addOrReplaceChild("Neckfront_r9", CubeListBuilder.create().texOffs(5, 113).addBox(0.0F, -4.0036F, -0.8955F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4112F, 2.9718F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neckfront_r10 = Tail1.addOrReplaceChild("Neckfront_r10", CubeListBuilder.create().texOffs(44, 112).addBox(0.0F, -3.7593F, -0.0467F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3196F, 4.086F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neckfront_r11 = Tail1.addOrReplaceChild("Neckfront_r11", CubeListBuilder.create().texOffs(41, 112).addBox(0.0F, -3.5593F, -0.1467F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0659F, 6.1921F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Neckfront_r12 = Tail1.addOrReplaceChild("Neckfront_r12", CubeListBuilder.create().texOffs(112, 39).addBox(0.0F, -3.3593F, -0.8467F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 111).addBox(0.0F, -3.3593F, 1.1533F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2465F, 8.9036F, -0.192F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tail1.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(76, 109).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4274F, -0.188F, 0.7505F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tail1.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(117, 117).mirror().addBox(-1.3F, -0.2F, 10.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(117, 45).mirror().addBox(-1.4F, -0.2F, 8.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(117, 36).mirror().addBox(-1.4F, -0.2F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(117, 7).mirror().addBox(-1.5F, -0.2F, 4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(116, 70).mirror().addBox(-1.5F, -0.2F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(116, 31).mirror().addBox(-1.5F, -0.2F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(117, 117).addBox(0.3F, -0.2F, 10.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 45).addBox(0.4F, -0.2F, 8.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 36).addBox(0.4F, -0.2F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 7).addBox(0.5F, -0.2F, 4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 70).addBox(0.5F, -0.2F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 31).addBox(0.5F, -0.2F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 0).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6644F, 10.8298F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition Tailmiddlebase_r1 = Tail2.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(66, 118).addBox(0.0F, -1.9F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7799F, 11.0654F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tail2.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(63, 118).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7066F, 8.9667F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r3 = Tail2.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(60, 118).addBox(0.0F, -2.0F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6403F, 7.0679F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r4 = Tail2.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(117, 96).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.567F, 4.9692F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r5 = Tail2.addOrReplaceChild("Tailmiddlebase_r5", CubeListBuilder.create().texOffs(82, 117).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4972F, 2.9704F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r6 = Tail2.addOrReplaceChild("Tailmiddlebase_r6", CubeListBuilder.create().texOffs(79, 117).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4274F, 0.9716F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r7 = Tail2.addOrReplaceChild("Tailmiddlebase_r7", CubeListBuilder.create().texOffs(55, 118).mirror().addBox(-1.0F, -0.3F, 10.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 118).mirror().addBox(-1.0F, -0.3F, 8.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 118).mirror().addBox(-1.1F, -0.3F, 6.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 118).mirror().addBox(-1.2F, -0.3F, 4.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(118, 33).mirror().addBox(-1.2F, -0.3F, 2.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 118).mirror().addBox(-1.3F, -0.3F, 0.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 118).addBox(0.0F, -0.3F, 10.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 118).addBox(0.0F, -0.3F, 8.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 118).addBox(0.1F, -0.3F, 6.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 118).addBox(0.2F, -0.3F, 4.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 33).addBox(0.2F, -0.3F, 2.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 118).addBox(0.3F, -0.3F, 0.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.2F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tail2.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(47, 117).addBox(0.0F, 6.1F, 20.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 117).addBox(0.0F, 5.5F, 18.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 16).addBox(0.0F, 4.8F, 16.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 117).addBox(0.0F, 4.1F, 14.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 102).addBox(0.0F, 3.3F, 12.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 65).addBox(0.0F, 2.5F, 10.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7182F, -9.5933F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2952F, 12.961F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition Tailmiddle_r1 = Tail3.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(25, 119).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3766F, 13.9659F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r2 = Tail3.addOrReplaceChild("Tailmiddle_r2", CubeListBuilder.create().texOffs(12, 119).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2371F, 11.9708F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r3 = Tail3.addOrReplaceChild("Tailmiddle_r3", CubeListBuilder.create().texOffs(9, 119).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0976F, 9.9756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r4 = Tail3.addOrReplaceChild("Tailmiddle_r4", CubeListBuilder.create().texOffs(6, 119).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9581F, 7.9805F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r5 = Tail3.addOrReplaceChild("Tailmiddle_r5", CubeListBuilder.create().texOffs(3, 119).addBox(0.0F, -0.9F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8255F, 6.0851F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r6 = Tail3.addOrReplaceChild("Tailmiddle_r6", CubeListBuilder.create().texOffs(109, 118).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.679F, 3.9903F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r7 = Tail3.addOrReplaceChild("Tailmiddle_r7", CubeListBuilder.create().texOffs(100, 118).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5395F, 1.9951F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r8 = Tail3.addOrReplaceChild("Tailmiddle_r8", CubeListBuilder.create().texOffs(97, 118).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r9 = Tail3.addOrReplaceChild("Tailmiddle_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Tailbase_r7 = Tail3.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(94, 118).addBox(0.0F, 11.3F, 33.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 118).addBox(0.0F, 10.7F, 31.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 118).addBox(0.0F, 9.8F, 29.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 118).addBox(0.0F, 9.3F, 27.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 118).addBox(0.0F, 8.7F, 25.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 118).addBox(0.0F, 7.9F, 23.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 118).addBox(0.0F, 7.3F, 21.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0182F, -21.7933F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(29, 17).addBox(-0.5F, -0.6F, -0.3F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9929F, 15.1069F, -0.0358F, -0.218F, 0.0077F));

		PartDefinition Tailmiddleend_r1 = Tail4.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(120, 3).addBox(0.0F, -2.1F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 119).addBox(0.0F, -1.8F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 113).addBox(0.0F, -1.5F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 110).addBox(0.0F, -1.1F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 104).addBox(0.0F, -0.8F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 101).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.2F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailbase_r8 = Tail4.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(119, 65).addBox(0.0F, 1.6F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 58).addBox(0.0F, 0.8F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 119).addBox(0.0F, 0.0F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 119).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8701F, 5.012F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Tailbase_r9 = Tail4.addOrReplaceChild("Tailbase_r9", CubeListBuilder.create().texOffs(106, 118).addBox(0.0F, 12.4F, 36.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 118).addBox(0.0F, 11.7F, 34.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8182F, -36.0933F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(27, 32).addBox(-0.5F, -0.0906F, -0.1436F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5F, 12.7F, -0.1806F, -0.2577F, 0.0465F));

		PartDefinition Tailbase_r10 = Tail5.addOrReplaceChild("Tailbase_r10", CubeListBuilder.create().texOffs(34, 120).addBox(0.0F, 5.5F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 19).addBox(0.0F, 4.7F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 120).addBox(0.0F, 3.9F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 16).addBox(0.0F, 3.1F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 120).addBox(0.0F, 2.4F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3701F, -7.688F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -0.281F, -0.1732F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2094F, 11.8564F, -0.1772F, -0.1719F, 0.1719F));

		return LayerDefinition.create(meshdefinition, 123, 123);
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