package fossils.fossils.client.blockentity.model.cymbospondylus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CymbospondylusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Cymbospondylus;
	private final ModelPart Body1;
	private final ModelPart Body2;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
	private final ModelPart ForelimbL3;
	private final ModelPart ForelimbL4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Body3;
	private final ModelPart Body10;
	private final ModelPart Body11;
	private final ModelPart Body23;
	private final ModelPart Body24;
	private final ModelPart Body25;
	private final ModelPart Body26;
	private final ModelPart Body4;
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart HindlimbL;
	private final ModelPart HindlimbL2;
	private final ModelPart HindlimbL3;
	private final ModelPart HindlimbL4;
	private final ModelPart Body5;
	private final ModelPart Body6;
	private final ModelPart Body9;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Body12;
	private final ModelPart Body13;
	private final ModelPart Body14;
	private final ModelPart Body15;
	private final ModelPart Body16;
	private final ModelPart Body17;
	private final ModelPart Body18;
	private final ModelPart Body19;
	private final ModelPart Body20;
	private final ModelPart Body21;
	private final ModelPart Body22;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart bone3;

	public CymbospondylusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Cymbospondylus = this.fossil.getChild("Cymbospondylus");
		this.Body1 = this.Cymbospondylus.getChild("Body1");
		this.Body2 = this.Body1.getChild("Body2");
		this.ForelimbL = this.Body2.getChild("ForelimbL");
		this.ForelimbL2 = this.ForelimbL.getChild("ForelimbL2");
		this.ForelimbL3 = this.Body2.getChild("ForelimbL3");
		this.ForelimbL4 = this.ForelimbL3.getChild("ForelimbL4");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone4 = this.Body2.getChild("bone4");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body10 = this.Body3.getChild("Body10");
		this.Body11 = this.Body10.getChild("Body11");
		this.Body23 = this.Body11.getChild("Body23");
		this.Body24 = this.Body23.getChild("Body24");
		this.Body25 = this.Body24.getChild("Body25");
		this.Body26 = this.Body25.getChild("Body26");
		this.Body4 = this.Body26.getChild("Body4");
		this.bone = this.Body4.getChild("bone");
		this.bone5 = this.Body4.getChild("bone5");
		this.HindlimbL = this.Body4.getChild("HindlimbL");
		this.HindlimbL2 = this.HindlimbL.getChild("HindlimbL2");
		this.HindlimbL3 = this.Body4.getChild("HindlimbL3");
		this.HindlimbL4 = this.HindlimbL3.getChild("HindlimbL4");
		this.Body5 = this.Body4.getChild("Body5");
		this.Body6 = this.Body5.getChild("Body6");
		this.Body9 = this.Body6.getChild("Body9");
		this.Body7 = this.Body9.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Body12 = this.Body8.getChild("Body12");
		this.Body13 = this.Body12.getChild("Body13");
		this.Body14 = this.Body13.getChild("Body14");
		this.Body15 = this.Body14.getChild("Body15");
		this.Body16 = this.Body15.getChild("Body16");
		this.Body17 = this.Body16.getChild("Body17");
		this.Body18 = this.Body17.getChild("Body18");
		this.Body19 = this.Body18.getChild("Body19");
		this.Body20 = this.Body19.getChild("Body20");
		this.Body21 = this.Body20.getChild("Body21");
		this.Body22 = this.Body21.getChild("Body22");
		this.Head = this.Cymbospondylus.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.bone3 = root.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Cymbospondylus = fossil.addOrReplaceChild("Cymbospondylus", CubeListBuilder.create(), PartPose.offset(0.0F, -31.6181F, -10.325F));

		PartDefinition Body1 = Cymbospondylus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8586F, -16.9926F, -0.1748F, -0.0416F, 0.0131F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(95, 136).addBox(0.0F, -1.641F, 0.0015F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 117).addBox(0.0F, -2.541F, 2.0015F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6817F, 0.2672F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(98, 136).addBox(0.0F, -2.435F, -0.0303F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7817F, 4.1672F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(107, 139).addBox(0.0F, -1.349F, 0.0263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0183F, -1.6328F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(27, 60).addBox(-1.0F, -0.5F, -4.4F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.4817F, 1.7672F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(103, 108).mirror().addBox(-9.9916F, -2.5101F, -0.4853F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2658F, 4.7526F, 0.1184F, 0.794F, -1.4047F));

		PartDefinition cube_r6 = Body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(132, 36).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2658F, 4.7526F, 0.5245F, 0.6364F, -0.798F));

		PartDefinition cube_r7 = Body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 132).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2658F, 4.7526F, 0.7281F, 0.3829F, -0.3884F));

		PartDefinition cube_r8 = Body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(132, 34).mirror().addBox(-4.9916F, -2.5101F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6658F, 2.7526F, 0.0434F, 0.959F, -1.468F));

		PartDefinition cube_r9 = Body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(132, 32).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6658F, 2.7526F, 0.6089F, 0.7961F, -0.7479F));

		PartDefinition cube_r10 = Body1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(132, 30).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6658F, 2.7526F, 0.8633F, 0.5039F, -0.3357F));

		PartDefinition cube_r11 = Body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(42, 128).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.8342F, -1.0474F, 0.7599F, 0.8599F, -0.3904F));

		PartDefinition cube_r12 = Body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(132, 120).mirror().addBox(-3.9916F, -2.5101F, -0.4853F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0658F, 0.7526F, -0.2303F, 0.9575F, -1.6925F));

		PartDefinition cube_r13 = Body1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(35, 128).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0658F, 0.7526F, 0.436F, 0.9044F, -0.8782F));

		PartDefinition cube_r14 = Body1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(128, 2).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0658F, 0.7526F, 0.7984F, 0.6513F, -0.3712F));

		PartDefinition cube_r15 = Body1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(42, 128).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.8342F, -1.0474F, 0.7599F, -0.8599F, 0.3904F));

		PartDefinition cube_r16 = Body1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(36, 132).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2658F, 4.7526F, 0.7281F, -0.3829F, 0.3884F));

		PartDefinition cube_r17 = Body1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(132, 36).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2658F, 4.7526F, 0.5245F, -0.6364F, 0.798F));

		PartDefinition cube_r18 = Body1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(103, 108).addBox(2.9916F, -2.5101F, -0.4853F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2658F, 4.7526F, 0.1184F, -0.794F, 1.4047F));

		PartDefinition cube_r19 = Body1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(132, 30).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6658F, 2.7526F, 0.8633F, -0.5039F, 0.3357F));

		PartDefinition cube_r20 = Body1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(132, 32).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6658F, 2.7526F, 0.6089F, -0.7961F, 0.7479F));

		PartDefinition cube_r21 = Body1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(132, 34).addBox(2.9916F, -2.5101F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6658F, 2.7526F, 0.0434F, -0.959F, 1.468F));

		PartDefinition cube_r22 = Body1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(132, 120).addBox(2.9916F, -2.5101F, -0.4853F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0658F, 0.7526F, -0.2303F, -0.9575F, 1.6925F));

		PartDefinition cube_r23 = Body1.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(35, 128).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0658F, 0.7526F, 0.436F, -0.9044F, 0.8782F));

		PartDefinition cube_r24 = Body1.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(128, 2).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0658F, 0.7526F, 0.7984F, -0.6513F, 0.3712F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.021F, 6.027F, 0.2998F, -0.1707F, -0.0366F));

		PartDefinition cube_r25 = Body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(89, 46).mirror().addBox(-14.0099F, -2.5052F, -0.4837F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6557F, 8.2054F, 0.1416F, 0.4452F, -1.2799F));

		PartDefinition cube_r26 = Body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(121, 126).mirror().addBox(-3.8266F, -0.8323F, -0.4837F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6557F, 8.2054F, 0.3358F, 0.3291F, -0.7757F));

		PartDefinition cube_r27 = Body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(59, 129).mirror().addBox(-2.0072F, 0.0175F, -0.4986F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6557F, 8.2054F, 0.4408F, 0.1686F, -0.3564F));

		PartDefinition cube_r28 = Body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(28, 129).mirror().addBox(-2.0073F, 0.0176F, -0.4992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2557F, 6.2054F, 0.4741F, 0.1806F, -0.3506F));

		PartDefinition cube_r29 = Body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(10, 129).mirror().addBox(-3.8266F, -0.8323F, -0.4844F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2557F, 6.2054F, 0.3623F, 0.3534F, -0.7668F));

		PartDefinition cube_r30 = Body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(38, 89).mirror().addBox(-14.0099F, -2.5052F, -0.4844F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2557F, 6.2054F, 0.1528F, 0.4786F, -1.2749F));

		PartDefinition cube_r31 = Body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(128, 128).mirror().addBox(-2.0073F, 0.0176F, -0.4999F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9557F, 4.2054F, 0.4907F, 0.1866F, -0.3476F));

		PartDefinition cube_r32 = Body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(82, 126).mirror().addBox(-3.8266F, -0.8323F, -0.4851F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9557F, 4.2054F, 0.3758F, 0.3655F, -0.7621F));

		PartDefinition cube_r33 = Body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(73, 70).mirror().addBox(-14.01F, -2.5052F, -0.4851F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9557F, 4.2054F, 0.1586F, 0.4953F, -1.2721F));

		PartDefinition cube_r34 = Body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(92, 72).mirror().addBox(-12.109F, -2.996F, -0.4968F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.3159F, 0.1165F, 0.5244F, -1.2961F));

		PartDefinition cube_r35 = Body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(128, 126).mirror().addBox(-4.1411F, -1.2219F, -0.4968F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.3159F, 0.3567F, 0.4089F, -0.7727F));

		PartDefinition cube_r36 = Body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(121, 128).mirror().addBox(-2.4568F, -0.2027F, -0.5145F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.3159F, 0.4923F, 0.2335F, -0.3507F));

		PartDefinition cube_r37 = Body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(80, 128).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3398F, 2.2158F, 0.541F, 0.2042F, -0.3378F));

		PartDefinition cube_r38 = Body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(-13.121F, -2.993F, -0.4788F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3398F, 2.2158F, 0.1766F, 0.5453F, -1.2632F));

		PartDefinition cube_r39 = Body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(126, 76).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3398F, 2.2158F, 0.4169F, 0.4014F, -0.7467F));

		PartDefinition cube_r40 = Body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(89, 46).addBox(3.0099F, -2.5052F, -0.4837F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6557F, 8.2054F, 0.1416F, -0.4452F, 1.2799F));

		PartDefinition cube_r41 = Body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(121, 126).addBox(1.8266F, -0.8323F, -0.4837F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6557F, 8.2054F, 0.3358F, -0.3291F, 0.7757F));

		PartDefinition cube_r42 = Body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(59, 129).addBox(0.0072F, 0.0175F, -0.4986F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6557F, 8.2054F, 0.4408F, -0.1686F, 0.3564F));

		PartDefinition cube_r43 = Body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(28, 129).addBox(0.0073F, 0.0176F, -0.4992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2557F, 6.2054F, 0.4741F, -0.1806F, 0.3506F));

		PartDefinition cube_r44 = Body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(10, 129).addBox(1.8266F, -0.8323F, -0.4844F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2557F, 6.2054F, 0.3623F, -0.3534F, 0.7668F));

		PartDefinition cube_r45 = Body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(38, 89).addBox(3.0099F, -2.5052F, -0.4844F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2557F, 6.2054F, 0.1528F, -0.4786F, 1.2749F));

		PartDefinition cube_r46 = Body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(128, 128).addBox(0.0073F, 0.0176F, -0.4999F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9557F, 4.2054F, 0.4907F, -0.1866F, 0.3476F));

		PartDefinition cube_r47 = Body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(82, 126).addBox(1.8266F, -0.8323F, -0.4851F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9557F, 4.2054F, 0.3758F, -0.3655F, 0.7621F));

		PartDefinition cube_r48 = Body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(73, 70).addBox(3.01F, -2.5052F, -0.4851F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9557F, 4.2054F, 0.1586F, -0.4953F, 1.2721F));

		PartDefinition cube_r49 = Body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(92, 72).addBox(3.109F, -2.996F, -0.4968F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.3159F, 0.1165F, -0.5244F, 1.2961F));

		PartDefinition cube_r50 = Body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(128, 126).addBox(2.1411F, -1.2219F, -0.4968F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.3159F, 0.3567F, -0.4089F, 0.7727F));

		PartDefinition cube_r51 = Body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(121, 128).addBox(0.4568F, -0.2027F, -0.5145F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.3159F, 0.4923F, -0.2335F, 0.3507F));

		PartDefinition cube_r52 = Body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(80, 128).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3398F, 2.2158F, 0.541F, -0.2042F, 0.3378F));

		PartDefinition cube_r53 = Body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(38, 91).addBox(3.121F, -2.993F, -0.4788F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3398F, 2.2158F, 0.1766F, -0.5453F, 1.2632F));

		PartDefinition cube_r54 = Body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(126, 76).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3398F, 2.2158F, 0.4169F, -0.4014F, 0.7467F));

		PartDefinition cube_r55 = Body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(132, 135).addBox(0.0F, -2.43F, -0.1012F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7473F, 7.8734F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(129, 135).addBox(0.0F, -2.4596F, 0.0317F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5504F, 5.6908F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(126, 135).addBox(-1.0F, -2.5928F, -0.0072F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 3.7054F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 117).addBox(-0.5F, 3.2F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 5.4941F, 1.3313F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 60).addBox(-3.5F, -0.8711F, -6.3445F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 11.2147F, 10.7568F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, -1.0495F, -9.9375F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.0557F, 9.7054F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r61 = Body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(123, 135).addBox(-1.0F, -2.4245F, 0.0355F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8557F, 1.7054F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r62 = Body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(120, 135).addBox(-1.0F, -2.45F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3557F, -0.1946F, -0.0175F, 0.0F, 0.0F));

		PartDefinition ForelimbL = Body2.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4709F, 8.2848F, 2.6061F, 0.3321F, -0.0066F, 0.0861F));

		PartDefinition cube_r63 = ForelimbL.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(117, 68).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.5267F, 3.9589F, -1.9924F, 3.079F, -0.8195F, -2.4068F));

		PartDefinition cube_r64 = ForelimbL.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 122).addBox(-1.725F, -0.5F, -0.575F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6911F, 3.1645F, -0.0749F, 3.0963F, -0.3402F, -2.4374F));

		PartDefinition cube_r65 = ForelimbL.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(114, 38).addBox(-2.3F, -0.5F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.7638F, 2.3784F, 0.328F, 3.0907F, 0.5752F, -2.4802F));

		PartDefinition cube_r66 = ForelimbL.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(77, 98).addBox(-0.025F, -0.5F, -4.375F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0966F, 0.2333F, -0.6116F, 0.2024F, -1.3569F, 0.4911F));

		PartDefinition cube_r67 = ForelimbL.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(113, 60).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8765F, 0.2361F, -2.1032F, 0.0152F, -0.0526F, 0.692F));

		PartDefinition cube_r68 = ForelimbL.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(23, 122).addBox(-0.425F, -0.5F, -1.55F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0966F, 0.2333F, -0.6116F, 0.0216F, -0.6628F, 0.6447F));

		PartDefinition ForelimbL2 = ForelimbL.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offset(5.0229F, 3.7227F, -1.9116F));

		PartDefinition cube_r69 = ForelimbL2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(42, 72).addBox(0.0F, 0.025F, 0.0F, 7.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.7029F, 7.4339F, -0.6152F, 0.0F, -0.2094F, 0.6545F));

		PartDefinition cube_r70 = ForelimbL2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(62, 139).addBox(-1.9944F, -0.6329F, -1.0735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5017F, 1.7354F, 1.6218F, 0.0253F, -0.5114F, 0.6287F));

		PartDefinition cube_r71 = ForelimbL2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(22, 133).addBox(-0.6258F, -0.6135F, -2.2767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5017F, 1.7354F, 1.6218F, 0.0725F, -0.6236F, 0.6153F));

		PartDefinition cube_r72 = ForelimbL2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(139, 44).addBox(-1.9353F, -0.6135F, -3.0917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5017F, 1.7354F, 1.6218F, 0.0949F, -0.9019F, 0.5831F));

		PartDefinition cube_r73 = ForelimbL2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(26, 137).addBox(-2.9277F, -0.6135F, -1.2679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5017F, 1.7354F, 1.6218F, 2.8614F, -1.3567F, -2.2098F));

		PartDefinition cube_r74 = ForelimbL2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(125, 116).addBox(1.6632F, -0.5877F, -0.9947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5017F, 1.7354F, 1.6218F, 0.1077F, 1.231F, 0.7747F));

		PartDefinition cube_r75 = ForelimbL2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(123, 30).addBox(-1.575F, -0.5F, -0.65F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4122F, 1.5486F, -0.0423F, 0.0223F, 0.1429F, 0.6443F));

		PartDefinition cube_r76 = ForelimbL2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(132, 57).addBox(-0.7F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5024F, 0.9911F, 3.5318F, -0.0842F, -1.2424F, 0.7279F));

		PartDefinition cube_r77 = ForelimbL2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(125, 57).addBox(-1.0891F, -0.5416F, 1.2914F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5017F, 1.7354F, 1.6218F, -0.0312F, -0.519F, 0.6638F));

		PartDefinition cube_r78 = ForelimbL2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(139, 33).addBox(1.052F, -0.4025F, -1.2983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5017F, 1.7354F, 1.6218F, -0.0135F, -1.3906F, 0.6934F));

		PartDefinition cube_r79 = ForelimbL2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(89, 122).addBox(-2.4566F, -0.463F, 0.5659F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5017F, 1.7354F, 1.6218F, -0.0409F, 0.7467F, 0.6553F));

		PartDefinition cube_r80 = ForelimbL2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(21, 69).addBox(1.7514F, -0.4025F, 0.9706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(137, 114).addBox(1.7514F, -0.4025F, 0.2706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5017F, 1.7354F, 1.6218F, -0.0055F, -1.1113F, 0.685F));

		PartDefinition cube_r81 = ForelimbL2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(10, 133).addBox(0.3663F, -0.4025F, -2.4035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5017F, 1.7354F, 1.6218F, -3.1378F, -0.8783F, -2.4644F));

		PartDefinition cube_r82 = ForelimbL2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(62, 46).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.7326F, 7.4567F, -0.6083F, 0.0F, -0.1222F, 0.6545F));

		PartDefinition ForelimbL3 = Body2.addOrReplaceChild("ForelimbL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4709F, 8.2848F, 2.6061F, 0.5774F, 0.5336F, 0.2267F));

		PartDefinition cube_r83 = ForelimbL3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(47, 119).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.5267F, 3.9589F, -1.9924F, 3.079F, 0.8195F, 2.4068F));

		PartDefinition cube_r84 = ForelimbL3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(9, 122).addBox(-0.275F, -0.5F, -0.575F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6911F, 3.1645F, -0.0749F, 3.0963F, 0.3402F, 2.4374F));

		PartDefinition cube_r85 = ForelimbL3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(114, 42).addBox(-0.7F, -0.5F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.7638F, 2.3784F, 0.328F, 3.0907F, -0.5752F, 2.4802F));

		PartDefinition cube_r86 = ForelimbL3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(99, 78).addBox(-1.975F, -0.5F, -4.375F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0966F, 0.2333F, -0.6116F, 0.2024F, 1.3569F, -0.4911F));

		PartDefinition cube_r87 = ForelimbL3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(113, 64).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8765F, 0.2361F, -2.1032F, 0.0152F, 0.0526F, -0.692F));

		PartDefinition cube_r88 = ForelimbL3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(56, 122).addBox(-1.575F, -0.5F, -1.55F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0966F, 0.2333F, -0.6116F, 0.0216F, 0.6628F, -0.6447F));

		PartDefinition ForelimbL4 = ForelimbL3.addOrReplaceChild("ForelimbL4", CubeListBuilder.create(), PartPose.offset(-5.0229F, 3.7227F, -1.9116F));

		PartDefinition cube_r89 = ForelimbL4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(67, 72).addBox(-7.0F, 0.025F, 0.0F, 7.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.7029F, 7.4339F, -0.6152F, 0.0F, 0.2094F, -0.6545F));

		PartDefinition cube_r90 = ForelimbL4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(139, 96).addBox(0.3444F, -0.6329F, -1.0735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(139, 93).addBox(0.9944F, -0.6329F, -1.0735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5017F, 1.7354F, 1.6218F, 0.0253F, 0.5114F, -0.6287F));

		PartDefinition cube_r91 = ForelimbL4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(58, 133).addBox(-0.3742F, -0.6135F, -2.2767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5017F, 1.7354F, 1.6218F, 0.0725F, 0.6236F, -0.6153F));

		PartDefinition cube_r92 = ForelimbL4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(57, 139).addBox(0.9353F, -0.6135F, -3.0917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5017F, 1.7354F, 1.6218F, 0.0949F, 0.9019F, -0.5831F));

		PartDefinition cube_r93 = ForelimbL4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(5, 133).addBox(1.9277F, -0.6135F, -1.2679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5017F, 1.7354F, 1.6218F, 2.8614F, 1.3567F, 2.2098F));

		PartDefinition cube_r94 = ForelimbL4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(125, 119).addBox(-3.6632F, -0.5877F, -0.9947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5017F, 1.7354F, 1.6218F, 0.1077F, -1.231F, -0.7747F));

		PartDefinition cube_r95 = ForelimbL4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(126, 69).addBox(-0.3642F, -0.6329F, -2.1549F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5017F, 1.7354F, 1.6218F, 0.0221F, 0.0316F, -0.6404F));

		PartDefinition cube_r96 = ForelimbL4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(132, 82).addBox(-0.9F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(80, 132).addBox(-0.3F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5024F, 0.9911F, 3.5318F, -0.0842F, 1.2424F, -0.7279F));

		PartDefinition cube_r97 = ForelimbL4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(125, 82).addBox(-0.9109F, -0.5416F, 1.2914F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5017F, 1.7354F, 1.6218F, -0.0312F, 0.519F, -0.6638F));

		PartDefinition cube_r98 = ForelimbL4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(139, 41).addBox(-2.052F, -0.4025F, -1.2983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5017F, 1.7354F, 1.6218F, -0.0135F, 1.3906F, -0.6934F));

		PartDefinition cube_r99 = ForelimbL4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(114, 122).addBox(-0.5434F, -0.463F, 0.5659F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5017F, 1.7354F, 1.6218F, -0.0409F, -0.7467F, -0.6553F));

		PartDefinition cube_r100 = ForelimbL4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(98, 113).addBox(-2.7514F, -0.4025F, 0.9706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(138, 59).addBox(-2.7514F, -0.4025F, 0.2706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5017F, 1.7354F, 1.6218F, -0.0055F, 1.1113F, -0.685F));

		PartDefinition cube_r101 = ForelimbL4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(53, 133).addBox(-1.3663F, -0.4025F, -2.4035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5017F, 1.7354F, 1.6218F, -3.1378F, 0.8783F, 2.4644F));

		PartDefinition cube_r102 = ForelimbL4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(62, 53).addBox(0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.7326F, 7.4567F, -0.6083F, 0.0F, 0.1222F, -0.6545F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8738F, 7.146F, 2.2042F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r103 = bone2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(99, 85).addBox(-0.5F, -1.8306F, -2.7139F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6006F, 2.2779F, 0.8673F, 1.2627F, -0.1391F, 1.3018F));

		PartDefinition cube_r104 = bone2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(123, 5).addBox(-0.4505F, 0.1153F, 1.311F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.9301F, 0.7696F, -3.9884F, -2.857F, -0.9607F, 2.289F));

		PartDefinition cube_r105 = bone2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(114, 82).addBox(-0.5F, -0.9F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4179F, 2.1866F, -4.9422F, -0.1267F, -0.3022F, -0.7143F));

		PartDefinition cube_r106 = bone2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(92, 98).addBox(-0.5F, -1.1162F, -2.412F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6006F, 2.2779F, 0.8673F, 1.6118F, -0.1391F, 1.3018F));

		PartDefinition cube_r107 = bone2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(32, 122).addBox(-0.5F, -1.45F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6262F, 0.2693F, 0.6294F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r108 = bone2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(54, 101).addBox(-0.5F, -1.0398F, -0.6181F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6262F, 1.2179F, -0.6849F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r109 = bone2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(116, 112).addBox(-0.5F, -0.4684F, -2.758F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.6262F, -0.9324F, -0.2534F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r110 = bone2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(13, 109).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.6262F, -3.9987F, 0.073F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r111 = bone2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(107, 116).addBox(-0.5F, -0.0319F, -0.9039F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6262F, -0.9324F, -0.2534F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r112 = bone2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(107, 136).addBox(-0.5F, -1.0F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 105).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6262F, -5.5661F, -0.4637F, -2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r113 = bone2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(47, 123).addBox(-0.5F, -0.075F, -1.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6262F, -4.1188F, -1.7332F, 2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r114 = bone2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(112, 87).addBox(-0.5F, -0.035F, -0.9874F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6262F, -1.1525F, -0.9541F, 1.8326F, 0.0F, 0.0F));

		PartDefinition bone4 = Body2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8738F, 7.146F, 2.2042F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r115 = bone4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(99, 85).mirror().addBox(-0.5F, -1.8306F, -2.7139F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6006F, 2.2779F, 0.8673F, 1.2627F, 0.1391F, -1.3018F));

		PartDefinition cube_r116 = bone4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(123, 5).mirror().addBox(-2.5495F, 0.1153F, 1.311F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.9301F, 0.7696F, -3.9884F, -2.857F, 0.9607F, -2.289F));

		PartDefinition cube_r117 = bone4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(114, 82).mirror().addBox(-3.5F, -0.9F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.4179F, 2.1866F, -4.9422F, -0.1267F, 0.3022F, 0.7143F));

		PartDefinition cube_r118 = bone4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(92, 98).mirror().addBox(-0.5F, -1.1162F, -2.412F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.6006F, 2.2779F, 0.8673F, 1.6118F, 0.1391F, -1.3018F));

		PartDefinition cube_r119 = bone4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(32, 122).mirror().addBox(-0.5F, -1.45F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6262F, 0.2693F, 0.6294F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r120 = bone4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(54, 101).mirror().addBox(-0.5F, -1.0398F, -0.6181F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6262F, 1.2179F, -0.6849F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r121 = bone4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(116, 112).mirror().addBox(-0.5F, -0.4684F, -2.758F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.6262F, -0.9324F, -0.2534F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r122 = bone4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(13, 109).mirror().addBox(-0.5F, -0.3F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6262F, -3.9987F, 0.073F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r123 = bone4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(107, 116).mirror().addBox(-0.5F, -0.0319F, -0.9039F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6262F, -0.9324F, -0.2534F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r124 = bone4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(107, 136).mirror().addBox(-0.5F, -1.0F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(136, 105).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6262F, -5.5661F, -0.4637F, -2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r125 = bone4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(47, 123).mirror().addBox(-0.5F, -0.075F, -1.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6262F, -4.1188F, -1.7332F, 2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r126 = bone4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(112, 87).mirror().addBox(-0.5F, -0.035F, -0.9874F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6262F, -1.1525F, -0.9541F, 1.8326F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5931F, 9.6655F, 0.4453F, -0.042F, -0.0117F));

		PartDefinition cube_r127 = Body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(3, 136).addBox(-1.0F, -2.3F, -0.0517F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6014F, 5.9278F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r128 = Body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 136).addBox(-1.0F, -2.3368F, 0.0217F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2418F, 3.8854F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r129 = Body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(135, 132).addBox(-1.0F, -2.2351F, -0.0863F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1626F, 2.0399F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r130 = Body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(138, 65).addBox(-1.0F, -2.275F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r131 = Body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 14).addBox(-4.5F, -1.9026F, -0.0947F, 9.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 13.4337F, -3.0712F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r132 = Body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 69).addBox(-2.0F, 0.0F, 0.05F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r133 = Body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(101, 129).mirror().addBox(-4.1512F, -1.2129F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.2503F, 0.117F, 0.0988F, -0.8223F));

		PartDefinition cube_r134 = Body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(94, 129).mirror().addBox(-2.4624F, -0.1902F, -0.4937F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.2503F, 0.1493F, 0.0477F, -0.3877F));

		PartDefinition cube_r135 = Body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(89, 54).mirror().addBox(-14.1221F, -2.9927F, -0.4758F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.2503F, 0.0581F, 0.1416F, -1.3039F));

		PartDefinition cube_r136 = Body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(28, 127).mirror().addBox(-4.1507F, -1.2134F, -0.478F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6784F, 4.2503F, 0.1075F, 0.0952F, -0.8242F));

		PartDefinition cube_r137 = Body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(87, 129).mirror().addBox(-2.4621F, -0.191F, -0.4958F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6784F, 4.2503F, 0.1392F, 0.0483F, -0.3892F));

		PartDefinition cube_r138 = Body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(89, 52).mirror().addBox(-14.1214F, -2.9929F, -0.478F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6784F, 4.2503F, 0.0513F, 0.134F, -1.3058F));

		PartDefinition cube_r139 = Body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(89, 50).mirror().addBox(-14.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1533F, 2.2503F, 0.0496F, 0.1345F, -1.3065F));

		PartDefinition cube_r140 = Body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(89, 48).mirror().addBox(-14.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1467F, 0.3503F, 0.0542F, 0.1513F, -1.3058F));

		PartDefinition cube_r141 = Body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(127, 22).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1467F, 0.3503F, 0.1181F, 0.1092F, -0.8235F));

		PartDefinition cube_r142 = Body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(73, 129).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1467F, 0.3503F, 0.1547F, 0.0566F, -0.3888F));

		PartDefinition cube_r143 = Body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(127, 20).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1533F, 2.2503F, 0.1062F, 0.0964F, -0.8248F));

		PartDefinition cube_r144 = Body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(66, 129).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1533F, 2.2503F, 0.1385F, 0.05F, -0.3897F));

		PartDefinition cube_r145 = Body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(101, 129).addBox(2.1512F, -1.2129F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.2503F, 0.117F, -0.0988F, 0.8223F));

		PartDefinition cube_r146 = Body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(94, 129).addBox(0.4624F, -0.1902F, -0.4937F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.2503F, 0.1493F, -0.0477F, 0.3877F));

		PartDefinition cube_r147 = Body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(89, 54).addBox(3.1221F, -2.9927F, -0.4758F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.2503F, 0.0581F, -0.1416F, 1.3039F));

		PartDefinition cube_r148 = Body3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(28, 127).addBox(2.1507F, -1.2134F, -0.478F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6784F, 4.2503F, 0.1075F, -0.0952F, 0.8242F));

		PartDefinition cube_r149 = Body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(87, 129).addBox(0.4621F, -0.191F, -0.4958F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6784F, 4.2503F, 0.1392F, -0.0483F, 0.3892F));

		PartDefinition cube_r150 = Body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(89, 52).addBox(3.1214F, -2.9929F, -0.478F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6784F, 4.2503F, 0.0513F, -0.134F, 1.3058F));

		PartDefinition cube_r151 = Body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(89, 50).addBox(3.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1533F, 2.2503F, 0.0496F, -0.1345F, 1.3065F));

		PartDefinition cube_r152 = Body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(89, 48).addBox(3.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1467F, 0.3503F, 0.0542F, -0.1513F, 1.3058F));

		PartDefinition cube_r153 = Body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(127, 22).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1467F, 0.3503F, 0.1181F, -0.1092F, 0.8235F));

		PartDefinition cube_r154 = Body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(73, 129).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1467F, 0.3503F, 0.1547F, -0.0566F, 0.3888F));

		PartDefinition cube_r155 = Body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(127, 20).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1533F, 2.2503F, 0.1062F, -0.0964F, 0.8248F));

		PartDefinition cube_r156 = Body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(66, 129).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1533F, 2.2503F, 0.1385F, -0.05F, 0.3897F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, -0.0263F, -0.0872F, 0.0023F));

		PartDefinition cube_r157 = Body10.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(20, 136).addBox(-1.0F, -2.2996F, 0.0343F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5823F, 5.8297F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r158 = Body10.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(12, 136).addBox(-1.0F, -2.2997F, 0.0369F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2007F, 3.8664F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r159 = Body10.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(9, 136).addBox(-1.0F, -2.2999F, 0.0421F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1809F, 1.9032F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r160 = Body10.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(6, 136).addBox(-1.0F, -2.3499F, 0.0421F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r161 = Body10.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(70, 11).addBox(-2.0F, 0.0F, 0.05F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r162 = Body10.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(66, 127).mirror().addBox(-4.1509F, -1.2132F, -0.4749F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.2503F, 0.118F, 0.0973F, -0.8234F));

		PartDefinition cube_r163 = Body10.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(42, 130).mirror().addBox(-2.4622F, -0.1906F, -0.4927F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.2503F, 0.1495F, 0.0459F, -0.3889F));

		PartDefinition cube_r164 = Body10.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(91, 12).mirror().addBox(-14.1217F, -2.9928F, -0.4749F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.2503F, 0.0597F, 0.1407F, -1.3049F));

		PartDefinition cube_r165 = Body10.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(35, 130).mirror().addBox(-4.1517F, -1.2124F, -0.4727F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.1276F, 0.1008F, -0.821F));

		PartDefinition cube_r166 = Body10.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(129, 109).mirror().addBox(-2.4625F, -0.1896F, -0.4905F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.1598F, 0.045F, -0.387F));

		PartDefinition cube_r167 = Body10.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(91, 10).mirror().addBox(-14.1227F, -2.9924F, -0.4727F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.0666F, 0.1483F, -1.3024F));

		PartDefinition cube_r168 = Body10.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(89, 58).mirror().addBox(-14.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.0588F, 0.1682F, -1.3051F));

		PartDefinition cube_r169 = Body10.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(89, 56).mirror().addBox(-14.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1466F, 0.3503F, 0.0635F, 0.185F, -1.3043F));

		PartDefinition cube_r170 = Body10.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(59, 127).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1466F, 0.3503F, 0.142F, 0.1348F, -0.8206F));

		PartDefinition cube_r171 = Body10.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(108, 129).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1466F, 0.3503F, 0.187F, 0.0698F, -0.3868F));

		PartDefinition cube_r172 = Body10.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(127, 45).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.13F, 0.122F, -0.8221F));

		PartDefinition cube_r173 = Body10.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(129, 107).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.1708F, 0.0632F, -0.3878F));

		PartDefinition cube_r174 = Body10.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(66, 127).addBox(2.1509F, -1.2132F, -0.4749F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.2503F, 0.118F, -0.0973F, 0.8234F));

		PartDefinition cube_r175 = Body10.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(42, 130).addBox(0.4622F, -0.1906F, -0.4927F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.2503F, 0.1495F, -0.0459F, 0.3889F));

		PartDefinition cube_r176 = Body10.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(91, 12).addBox(3.1217F, -2.9928F, -0.4749F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.2503F, 0.0597F, -0.1407F, 1.3049F));

		PartDefinition cube_r177 = Body10.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(35, 130).addBox(2.1517F, -1.2124F, -0.4727F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.1276F, -0.1008F, 0.821F));

		PartDefinition cube_r178 = Body10.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(129, 109).addBox(0.4626F, -0.1896F, -0.4905F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.1598F, -0.045F, 0.387F));

		PartDefinition cube_r179 = Body10.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(91, 10).addBox(3.1227F, -2.9924F, -0.4727F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.0666F, -0.1483F, 1.3024F));

		PartDefinition cube_r180 = Body10.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(89, 58).addBox(3.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.0588F, -0.1682F, 1.3051F));

		PartDefinition cube_r181 = Body10.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(89, 56).addBox(3.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1466F, 0.3503F, 0.0635F, -0.185F, 1.3043F));

		PartDefinition cube_r182 = Body10.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(59, 127).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1466F, 0.3503F, 0.142F, -0.1348F, 0.8206F));

		PartDefinition cube_r183 = Body10.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(108, 129).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1466F, 0.3503F, 0.187F, -0.0698F, 0.3868F));

		PartDefinition cube_r184 = Body10.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(127, 45).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.13F, -0.122F, 0.8221F));

		PartDefinition cube_r185 = Body10.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(129, 107).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.1708F, -0.0632F, 0.3878F));

		PartDefinition cube_r186 = Body10.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 25).addBox(-4.5F, -1.8715F, 0.0087F, 9.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 14.4796F, -3.0742F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4644F, 7.7689F, 0.0174F, -0.0872F, 0.0023F));

		PartDefinition cube_r187 = Body11.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(15, 140).addBox(-1.0F, -1.9F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5823F, 5.8297F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r188 = Body11.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(72, 123).addBox(-1.0F, -2.0F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2007F, 3.8664F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r189 = Body11.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(23, 136).addBox(-1.0F, -2.0996F, 0.0343F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1809F, 1.9032F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r190 = Body11.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(138, 70).addBox(-1.0F, -2.1247F, 0.0369F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r191 = Body11.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(70, 22).addBox(-2.0F, 0.0F, 0.05F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r192 = Body11.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(91, 20).mirror().addBox(-14.0165F, -3.018F, -0.5374F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.0962F, 0.1965F, -1.3114F));

		PartDefinition cube_r193 = Body11.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(130, 87).mirror().addBox(-4.0692F, -1.2841F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.1761F, 0.1301F, -0.8295F));

		PartDefinition cube_r194 = Body11.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(80, 130).mirror().addBox(-2.4177F, -0.2895F, -0.5548F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.2158F, 0.0514F, -0.3984F));

		PartDefinition cube_r195 = Body11.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(132, 42).mirror().addBox(-4.1515F, -1.2126F, -0.474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.1616F, 0.1409F, -0.8169F));

		PartDefinition cube_r196 = Body11.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(130, 51).mirror().addBox(-2.4625F, -0.1899F, -0.4919F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.2073F, 0.0672F, -0.3843F));

		PartDefinition cube_r197 = Body11.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(91, 18).mirror().addBox(-14.1225F, -2.9925F, -0.474F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.0781F, 0.1994F, -1.3005F));

		PartDefinition cube_r198 = Body11.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(91, 16).mirror().addBox(-14.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.0588F, 0.1682F, -1.3051F));

		PartDefinition cube_r199 = Body11.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(91, 14).mirror().addBox(-14.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0466F, 0.3503F, 0.0542F, 0.1513F, -1.3058F));

		PartDefinition cube_r200 = Body11.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(126, 74).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0466F, 0.3503F, 0.1181F, 0.1092F, -0.8235F));

		PartDefinition cube_r201 = Body11.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(130, 49).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0466F, 0.3503F, 0.1547F, 0.0566F, -0.3888F));

		PartDefinition cube_r202 = Body11.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(73, 127).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.13F, 0.122F, -0.8221F));

		PartDefinition cube_r203 = Body11.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(130, 47).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.1708F, 0.0632F, -0.3878F));

		PartDefinition cube_r204 = Body11.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(91, 20).addBox(3.0165F, -3.018F, -0.5374F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.0962F, -0.1965F, 1.3114F));

		PartDefinition cube_r205 = Body11.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(130, 87).addBox(2.0692F, -1.2841F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.1761F, -0.1301F, 0.8295F));

		PartDefinition cube_r206 = Body11.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(80, 130).addBox(0.4176F, -0.2895F, -0.5548F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.2158F, -0.0514F, 0.3984F));

		PartDefinition cube_r207 = Body11.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(132, 42).addBox(2.1515F, -1.2126F, -0.474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.1616F, -0.1409F, 0.8169F));

		PartDefinition cube_r208 = Body11.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(130, 51).addBox(0.4625F, -0.1899F, -0.4919F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.2073F, -0.0672F, 0.3843F));

		PartDefinition cube_r209 = Body11.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(91, 18).addBox(3.1225F, -2.9925F, -0.474F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.0781F, -0.1994F, 1.3005F));

		PartDefinition cube_r210 = Body11.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(91, 16).addBox(3.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.0588F, -0.1682F, 1.3051F));

		PartDefinition cube_r211 = Body11.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(91, 14).addBox(3.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0466F, 0.3503F, 0.0542F, -0.1513F, 1.3058F));

		PartDefinition cube_r212 = Body11.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(126, 74).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0466F, 0.3503F, 0.1181F, -0.1092F, 0.8235F));

		PartDefinition cube_r213 = Body11.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(130, 49).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0466F, 0.3503F, 0.1547F, -0.0566F, 0.3888F));

		PartDefinition cube_r214 = Body11.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(35, 36).addBox(-4.5F, -1.8748F, -0.1115F, 9.0F, 2.0F, 7.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 15.3152F, -2.7431F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r215 = Body11.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(73, 127).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.13F, -0.122F, 0.8221F));

		PartDefinition cube_r216 = Body11.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(130, 47).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.1708F, -0.0632F, 0.3878F));

		PartDefinition Body23 = Body11.addOrReplaceChild("Body23", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5537F, 7.762F, -0.0891F, -0.0397F, 0.0454F));

		PartDefinition cube_r217 = Body23.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(76, 141).addBox(-1.0F, -1.9F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5823F, 5.8297F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r218 = Body23.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(73, 141).addBox(-1.0F, -1.9F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2007F, 3.8664F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r219 = Body23.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(70, 141).addBox(-1.0F, -1.9F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1809F, 1.9032F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r220 = Body23.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(141, 69).addBox(-1.0F, -1.9F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r221 = Body23.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(70, 33).addBox(-2.0F, 0.0F, 0.05F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r222 = Body23.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(91, 26).mirror().addBox(-14.0162F, -3.0181F, -0.5386F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.0984F, 0.2139F, -1.3111F));

		PartDefinition cube_r223 = Body23.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(7, 131).mirror().addBox(-4.069F, -1.2844F, -0.5386F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.1861F, 0.1444F, -0.8282F));

		PartDefinition cube_r224 = Body23.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 131).mirror().addBox(-2.4176F, -0.2899F, -0.5559F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.2308F, 0.0603F, -0.3977F));

		PartDefinition cube_r225 = Body23.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(126, 72).mirror().addBox(-4.1513F, -1.2128F, -0.4754F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5534F, 4.2503F, 0.1837F, 0.1681F, -0.8135F));

		PartDefinition cube_r226 = Body23.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(123, 91).mirror().addBox(-2.4624F, -0.1902F, -0.4932F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5534F, 4.2503F, 0.2386F, 0.0828F, -0.382F));

		PartDefinition cube_r227 = Body23.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(68, 44).mirror().addBox(-14.1222F, -2.9926F, -0.4754F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5534F, 4.2503F, 0.0849F, 0.2337F, -1.299F));

		PartDefinition cube_r228 = Body23.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(91, 24).mirror().addBox(-14.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.0825F, 0.2523F, -1.3002F));

		PartDefinition cube_r229 = Body23.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(91, 22).mirror().addBox(-14.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0466F, 0.3503F, 0.0777F, 0.2355F, -1.3013F));

		PartDefinition cube_r230 = Body23.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(127, 93).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0466F, 0.3503F, 0.1782F, 0.173F, -0.8151F));

		PartDefinition cube_r231 = Body23.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(129, 130).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0466F, 0.3503F, 0.2357F, 0.0895F, -0.3829F));

		PartDefinition cube_r232 = Body23.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(127, 85).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.1904F, 0.1857F, -0.8129F));

		PartDefinition cube_r233 = Body23.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(130, 124).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.252F, 0.096F, -0.3814F));

		PartDefinition cube_r234 = Body23.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(91, 26).addBox(3.0162F, -3.0181F, -0.5386F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.0984F, -0.2139F, 1.3111F));

		PartDefinition cube_r235 = Body23.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(7, 131).addBox(2.069F, -1.2844F, -0.5386F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.1861F, -0.1444F, 0.8282F));

		PartDefinition cube_r236 = Body23.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 131).addBox(0.4176F, -0.2899F, -0.5559F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.2308F, -0.0603F, 0.3977F));

		PartDefinition cube_r237 = Body23.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(126, 72).addBox(2.1513F, -1.2128F, -0.4754F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5534F, 4.2503F, 0.1837F, -0.1681F, 0.8135F));

		PartDefinition cube_r238 = Body23.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(123, 91).addBox(0.4624F, -0.1902F, -0.4932F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5534F, 4.2503F, 0.2386F, -0.0828F, 0.382F));

		PartDefinition cube_r239 = Body23.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(68, 44).addBox(3.1222F, -2.9926F, -0.4754F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5534F, 4.2503F, 0.0849F, -0.2337F, 1.299F));

		PartDefinition cube_r240 = Body23.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(91, 24).addBox(3.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.0825F, -0.2523F, 1.3002F));

		PartDefinition cube_r241 = Body23.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(91, 22).addBox(3.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0466F, 0.3503F, 0.0777F, -0.2355F, 1.3013F));

		PartDefinition cube_r242 = Body23.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(127, 93).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0466F, 0.3503F, 0.1782F, -0.173F, 0.8151F));

		PartDefinition cube_r243 = Body23.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(129, 130).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0466F, 0.3503F, 0.2357F, -0.0895F, 0.3829F));

		PartDefinition cube_r244 = Body23.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(35, 14).addBox(-4.5F, -1.8441F, -0.1016F, 9.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 15.4615F, -3.0051F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r245 = Body23.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(127, 85).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.1904F, -0.1857F, 0.8129F));

		PartDefinition cube_r246 = Body23.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(130, 124).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.252F, -0.096F, 0.3814F));

		PartDefinition Body24 = Body23.addOrReplaceChild("Body24", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5434F, 7.8401F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r247 = Body24.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(79, 141).addBox(-1.0F, -1.9F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5823F, 5.8297F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r248 = Body24.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(139, 99).addBox(-1.0F, -2.0F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2007F, 3.8664F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r249 = Body24.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(113, 141).addBox(-1.0F, -2.0F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1809F, 1.9031F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r250 = Body24.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(110, 141).addBox(-1.0F, -1.9F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r251 = Body24.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(21, 72).addBox(-2.0F, 0.0F, 0.05F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r252 = Body24.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(92, 74).mirror().addBox(-12.0104F, -3.0199F, -0.5531F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.0583F, 0.1857F, -1.3248F));

		PartDefinition cube_r253 = Body24.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(87, 131).mirror().addBox(-4.0647F, -1.2887F, -0.5531F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.1378F, 0.1378F, -0.8408F));

		PartDefinition cube_r254 = Body24.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(68, 131).mirror().addBox(-2.4154F, -0.2956F, -0.5704F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.1845F, 0.0743F, -0.4065F));

		PartDefinition cube_r255 = Body24.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(127, 99).mirror().addBox(-4.15F, -1.2141F, -0.4801F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6534F, 4.2503F, 0.152F, 0.1493F, -0.8198F));

		PartDefinition cube_r256 = Body24.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(61, 131).mirror().addBox(-2.4617F, -0.1918F, -0.4979F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6534F, 4.2503F, 0.2022F, 0.0788F, -0.3863F));

		PartDefinition cube_r257 = Body24.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(91, 41).mirror().addBox(-13.1205F, -2.9932F, -0.4801F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6534F, 4.2503F, 0.0655F, 0.2025F, -1.3045F));

		PartDefinition cube_r258 = Body24.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(91, 39).mirror().addBox(-13.121F, -2.993F, -0.4788F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4534F, 2.3503F, 0.0777F, 0.2355F, -1.3013F));

		PartDefinition cube_r259 = Body24.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(91, 28).mirror().addBox(-14.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0466F, 0.3503F, 0.0873F, 0.2691F, -1.2989F));

		PartDefinition cube_r260 = Body24.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(127, 97).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0466F, 0.3503F, 0.2027F, 0.1983F, -0.8106F));

		PartDefinition cube_r261 = Body24.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(54, 131).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0466F, 0.3503F, 0.2683F, 0.1024F, -0.3798F));

		PartDefinition cube_r262 = Body24.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(127, 95).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4534F, 2.3503F, 0.1782F, 0.173F, -0.8151F));

		PartDefinition cube_r263 = Body24.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(22, 131).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4534F, 2.3503F, 0.2357F, 0.0895F, -0.3829F));

		PartDefinition cube_r264 = Body24.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(92, 74).addBox(3.0104F, -3.0199F, -0.5531F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.0583F, -0.1857F, 1.3248F));

		PartDefinition cube_r265 = Body24.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(87, 131).addBox(2.0647F, -1.2887F, -0.5531F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.1378F, -0.1378F, 0.8408F));

		PartDefinition cube_r266 = Body24.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(68, 131).addBox(0.4154F, -0.2956F, -0.5704F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.1845F, -0.0743F, 0.4065F));

		PartDefinition cube_r267 = Body24.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(127, 99).addBox(2.15F, -1.2141F, -0.4801F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6534F, 4.2503F, 0.152F, -0.1493F, 0.8198F));

		PartDefinition cube_r268 = Body24.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(61, 131).addBox(0.4617F, -0.1918F, -0.4979F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6534F, 4.2503F, 0.2022F, -0.0788F, 0.3863F));

		PartDefinition cube_r269 = Body24.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(91, 41).addBox(3.1205F, -2.9932F, -0.4801F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6534F, 4.2503F, 0.0655F, -0.2025F, 1.3045F));

		PartDefinition cube_r270 = Body24.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(91, 39).addBox(3.121F, -2.993F, -0.4788F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4534F, 2.3503F, 0.0777F, -0.2355F, 1.3013F));

		PartDefinition cube_r271 = Body24.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(91, 28).addBox(3.121F, -2.993F, -0.4788F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0466F, 0.3503F, 0.0873F, -0.2691F, 1.2989F));

		PartDefinition cube_r272 = Body24.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(127, 97).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0466F, 0.3503F, 0.2027F, -0.1983F, 0.8106F));

		PartDefinition cube_r273 = Body24.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(54, 131).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0466F, 0.3503F, 0.2683F, -0.1024F, 0.3798F));

		PartDefinition cube_r274 = Body24.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(127, 95).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4534F, 2.3503F, 0.1782F, -0.173F, 0.8151F));

		PartDefinition cube_r275 = Body24.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(22, 131).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4534F, 2.3503F, 0.2357F, -0.0895F, 0.3829F));

		PartDefinition cube_r276 = Body24.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(35, 25).addBox(-4.5F, -1.9611F, -0.0519F, 9.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 15.518F, -2.4452F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Body25 = Body24.addOrReplaceChild("Body25", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5434F, 7.8401F, -0.1228F, -0.1305F, 0.0103F));

		PartDefinition cube_r277 = Body25.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(70, 136).addBox(-1.0F, -2.5F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5823F, 5.8297F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r278 = Body25.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(38, 83).addBox(-1.0F, -2.3F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2007F, 3.8664F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r279 = Body25.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(67, 136).addBox(-1.0F, -2.1F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1809F, 1.9032F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r280 = Body25.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(112, 136).addBox(-1.0F, -2.0F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r281 = Body25.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(68, 0).addBox(-2.0F, 0.0F, 0.05F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r282 = Body25.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(98, 70).mirror().addBox(-11.0104F, -3.0199F, -0.5531F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.0758F, 0.2534F, -1.321F));

		PartDefinition cube_r283 = Body25.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(132, 6).mirror().addBox(-4.0647F, -1.2887F, -0.5531F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.1852F, 0.1896F, -0.833F));

		PartDefinition cube_r284 = Body25.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(132, 4).mirror().addBox(-2.4154F, -0.2956F, -0.5704F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.2489F, 0.1017F, -0.4008F));

		PartDefinition cube_r285 = Body25.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(127, 103).mirror().addBox(-4.15F, -1.2141F, -0.4801F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.2006F, 0.2001F, -0.8114F));

		PartDefinition cube_r286 = Body25.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(108, 131).mirror().addBox(-2.4617F, -0.1919F, -0.4979F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.2672F, 0.1049F, -0.3803F));

		PartDefinition cube_r287 = Body25.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(98, 68).mirror().addBox(-11.1205F, -2.9932F, -0.4801F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.0846F, 0.2698F, -1.3001F));

		PartDefinition cube_r288 = Body25.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(93, 43).mirror().addBox(-12.121F, -2.993F, -0.4788F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2534F, 2.2503F, 0.0825F, 0.2523F, -1.3002F));

		PartDefinition cube_r289 = Body25.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(92, 76).mirror().addBox(-12.121F, -2.993F, -0.4788F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1466F, 0.3503F, 0.0825F, 0.2523F, -1.3002F));

		PartDefinition cube_r290 = Body25.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(103, 127).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1466F, 0.3503F, 0.1904F, 0.1857F, -0.8129F));

		PartDefinition cube_r291 = Body25.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(101, 131).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1466F, 0.3503F, 0.252F, 0.096F, -0.3814F));

		PartDefinition cube_r292 = Body25.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(127, 101).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2534F, 2.2503F, 0.1904F, 0.1857F, -0.8129F));

		PartDefinition cube_r293 = Body25.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(94, 131).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2534F, 2.2503F, 0.252F, 0.096F, -0.3814F));

		PartDefinition cube_r294 = Body25.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(98, 70).addBox(3.0104F, -3.0199F, -0.5531F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.0758F, -0.2534F, 1.321F));

		PartDefinition cube_r295 = Body25.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(132, 6).addBox(2.0647F, -1.2887F, -0.5531F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.1852F, -0.1896F, 0.833F));

		PartDefinition cube_r296 = Body25.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(132, 4).addBox(0.4154F, -0.2956F, -0.5704F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.2489F, -0.1017F, 0.4008F));

		PartDefinition cube_r297 = Body25.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(127, 103).addBox(2.15F, -1.2141F, -0.4801F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.2006F, -0.2001F, 0.8114F));

		PartDefinition cube_r298 = Body25.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(108, 131).addBox(0.4617F, -0.1919F, -0.4979F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.2672F, -0.1049F, 0.3803F));

		PartDefinition cube_r299 = Body25.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(98, 68).addBox(3.1205F, -2.9932F, -0.4801F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.0846F, -0.2698F, 1.3001F));

		PartDefinition cube_r300 = Body25.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(93, 43).addBox(3.121F, -2.993F, -0.4788F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2534F, 2.2503F, 0.0825F, -0.2523F, 1.3002F));

		PartDefinition cube_r301 = Body25.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(92, 76).addBox(3.121F, -2.993F, -0.4788F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1466F, 0.3503F, 0.0825F, -0.2523F, 1.3002F));

		PartDefinition cube_r302 = Body25.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(103, 127).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1466F, 0.3503F, 0.1904F, -0.1857F, 0.8129F));

		PartDefinition cube_r303 = Body25.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(101, 131).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1466F, 0.3503F, 0.252F, -0.096F, 0.3814F));

		PartDefinition cube_r304 = Body25.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(127, 101).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2534F, 2.2503F, 0.1904F, -0.1857F, 0.8129F));

		PartDefinition cube_r305 = Body25.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(0, 36).addBox(-4.5F, -1.9237F, -0.0873F, 9.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 14.7746F, -1.2854F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r306 = Body25.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(94, 131).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2534F, 2.2503F, 0.252F, -0.096F, 0.3814F));

		PartDefinition Body26 = Body25.addOrReplaceChild("Body26", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.517F, 7.805F, -0.0611F, -0.0436F, 0.0027F));

		PartDefinition cube_r307 = Body26.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(104, 136).addBox(-1.0F, -2.9F, 4.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 136).addBox(-1.0F, -2.9F, 2.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 136).addBox(-1.0F, -2.9F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5823F, 5.8297F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r308 = Body26.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(89, 136).addBox(-1.0F, -2.9F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2007F, 3.8664F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r309 = Body26.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(86, 136).addBox(-1.0F, -2.8F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1809F, 1.9031F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r310 = Body26.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(83, 136).addBox(-1.0F, -2.6F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r311 = Body26.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(35, 46).addBox(-2.0F, 0.0F, 0.05F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r312 = Body26.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(29, 132).mirror().addBox(-2.3864F, -0.3491F, -0.5363F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8534F, 10.3503F, 0.4161F, 0.1594F, -0.5175F));

		PartDefinition cube_r313 = Body26.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(132, 28).mirror().addBox(-4.0156F, -1.3249F, -0.5193F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8534F, 10.3503F, 0.3162F, 0.3108F, -0.9389F));

		PartDefinition cube_r314 = Body26.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(112, 85).mirror().addBox(-8.9501F, -3.0294F, -0.5193F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8534F, 10.3503F, 0.1334F, 0.4203F, -1.4403F));

		PartDefinition cube_r315 = Body26.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(132, 26).mirror().addBox(-2.3864F, -0.3491F, -0.5363F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5534F, 8.3503F, 0.3855F, 0.1421F, -0.5221F));

		PartDefinition cube_r316 = Body26.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(132, 24).mirror().addBox(-4.0156F, -1.3249F, -0.5193F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5534F, 8.3503F, 0.2948F, 0.2826F, -0.9452F));

		PartDefinition cube_r317 = Body26.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(67, 112).mirror().addBox(-8.9501F, -3.0294F, -0.5193F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5534F, 8.3503F, 0.1285F, 0.3857F, -1.4423F));

		PartDefinition cube_r318 = Body26.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(103, 110).mirror().addBox(-8.9501F, -3.0294F, -0.5193F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.1261F, 0.3683F, -1.4431F));

		PartDefinition cube_r319 = Body26.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(132, 18).mirror().addBox(-4.0156F, -1.3249F, -0.5193F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.2842F, 0.2684F, -0.9481F));

		PartDefinition cube_r320 = Body26.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(132, 16).mirror().addBox(-2.3864F, -0.3491F, -0.5363F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.3702F, 0.1334F, -0.5242F));

		PartDefinition cube_r321 = Body26.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(132, 14).mirror().addBox(-4.1321F, -1.2293F, -0.4685F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6534F, 4.3503F, 0.2308F, 0.2205F, -0.8568F));

		PartDefinition cube_r322 = Body26.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(132, 12).mirror().addBox(-2.452F, -0.2132F, -0.4863F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6534F, 4.3503F, 0.3027F, 0.1111F, -0.4282F));

		PartDefinition cube_r323 = Body26.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(108, 36).mirror().addBox(-10.0976F, -2.9984F, -0.4685F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6534F, 4.3503F, 0.1018F, 0.3016F, -1.3469F));

		PartDefinition cube_r324 = Body26.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(108, 34).mirror().addBox(-10.121F, -2.993F, -0.4788F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2534F, 2.2503F, 0.0922F, 0.2859F, -1.2976F));

		PartDefinition cube_r325 = Body26.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(106, 7).mirror().addBox(-10.121F, -2.993F, -0.4788F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0466F, 0.3503F, 0.0971F, 0.3027F, -1.2962F));

		PartDefinition cube_r326 = Body26.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(128, 0).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0466F, 0.3503F, 0.2273F, 0.2236F, -0.8054F));

		PartDefinition cube_r327 = Body26.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(132, 10).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0466F, 0.3503F, 0.3009F, 0.1153F, -0.3762F));

		PartDefinition cube_r328 = Body26.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(127, 105).mirror().addBox(-4.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2534F, 2.2503F, 0.215F, 0.211F, -0.8081F));

		PartDefinition cube_r329 = Body26.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(132, 8).mirror().addBox(-2.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2534F, 2.2503F, 0.2846F, 0.1089F, -0.3781F));

		PartDefinition cube_r330 = Body26.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(112, 85).addBox(2.9501F, -3.0294F, -0.5193F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8534F, 10.3503F, 0.1334F, -0.4203F, 1.4403F));

		PartDefinition cube_r331 = Body26.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(132, 28).addBox(2.0156F, -1.3249F, -0.5193F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8534F, 10.3503F, 0.3162F, -0.3108F, 0.9389F));

		PartDefinition cube_r332 = Body26.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(29, 132).addBox(0.3864F, -0.3491F, -0.5363F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8534F, 10.3503F, 0.4161F, -0.1594F, 0.5175F));

		PartDefinition cube_r333 = Body26.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(67, 112).addBox(2.9501F, -3.0294F, -0.5193F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5534F, 8.3503F, 0.1285F, -0.3857F, 1.4423F));

		PartDefinition cube_r334 = Body26.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(132, 24).addBox(2.0156F, -1.3249F, -0.5193F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5534F, 8.3503F, 0.2948F, -0.2826F, 0.9452F));

		PartDefinition cube_r335 = Body26.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(132, 26).addBox(0.3864F, -0.3491F, -0.5363F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5534F, 8.3503F, 0.3855F, -0.1421F, 0.5221F));

		PartDefinition cube_r336 = Body26.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(103, 110).addBox(2.9501F, -3.0294F, -0.5193F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.1261F, -0.3683F, 1.4431F));

		PartDefinition cube_r337 = Body26.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(132, 18).addBox(2.0156F, -1.3249F, -0.5193F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.2842F, -0.2684F, 0.9481F));

		PartDefinition cube_r338 = Body26.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(132, 16).addBox(0.3864F, -0.3491F, -0.5363F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.3702F, -0.1334F, 0.5242F));

		PartDefinition cube_r339 = Body26.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(132, 14).addBox(2.1321F, -1.2293F, -0.4685F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6534F, 4.3503F, 0.2308F, -0.2205F, 0.8568F));

		PartDefinition cube_r340 = Body26.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(132, 12).addBox(0.452F, -0.2132F, -0.4863F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6534F, 4.3503F, 0.3027F, -0.1111F, 0.4282F));

		PartDefinition cube_r341 = Body26.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(108, 36).addBox(3.0976F, -2.9984F, -0.4685F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6534F, 4.3503F, 0.1018F, -0.3016F, 1.3469F));

		PartDefinition cube_r342 = Body26.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(108, 34).addBox(3.121F, -2.993F, -0.4788F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2534F, 2.2503F, 0.0922F, -0.2859F, 1.2976F));

		PartDefinition cube_r343 = Body26.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(106, 7).addBox(3.121F, -2.993F, -0.4788F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0466F, 0.3503F, 0.0971F, -0.3027F, 1.2962F));

		PartDefinition cube_r344 = Body26.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(128, 0).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0466F, 0.3503F, 0.2273F, -0.2236F, 0.8054F));

		PartDefinition cube_r345 = Body26.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(132, 10).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0466F, 0.3503F, 0.3009F, -0.1153F, 0.3762F));

		PartDefinition cube_r346 = Body26.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -1.93F, 0.0168F, 9.0F, 2.0F, 11.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 13.1889F, -0.4945F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r347 = Body26.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(127, 105).addBox(2.1504F, -1.2137F, -0.4788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2534F, 2.2503F, 0.215F, -0.211F, 0.8081F));

		PartDefinition cube_r348 = Body26.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(132, 8).addBox(0.4619F, -0.1913F, -0.4967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2534F, 2.2503F, 0.2846F, -0.1089F, 0.3781F));

		PartDefinition Body4 = Body26.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9766F, 10.6792F, 0.0089F, 0.2182F, 0.0019F));

		PartDefinition cube_r349 = Body4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(130, 122).mirror().addBox(-1.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3141F, 1.8163F, 7.4555F, 0.3107F, 0.3005F, -0.8486F));

		PartDefinition cube_r350 = Body4.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(114, 58).mirror().addBox(-3.356F, -0.346F, -0.44F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0147F, 5.232F, 0.5038F, 0.4147F, -0.8332F));

		PartDefinition cube_r351 = Body4.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(122, 130).mirror().addBox(-3.9665F, -1.3377F, -0.7872F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2627F, 3.7526F, 0.3895F, 0.4509F, -1.174F));

		PartDefinition cube_r352 = Body4.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(115, 130).mirror().addBox(-2.3454F, -0.3819F, -0.8039F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2627F, 3.7526F, 0.538F, 0.2596F, -0.7545F));

		PartDefinition cube_r353 = Body4.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(114, 46).mirror().addBox(-7.9652F, -2.5284F, -0.8524F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0627F, 1.7526F, 0.138F, 0.4197F, -1.5082F));

		PartDefinition cube_r354 = Body4.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(130, 91).mirror().addBox(-3.7976F, -0.8735F, -0.8524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0627F, 1.7526F, 0.3198F, 0.3083F, -1.0075F));

		PartDefinition cube_r355 = Body4.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(130, 89).mirror().addBox(-1.9957F, -0.0327F, -0.8671F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0627F, 1.7526F, 0.4182F, 0.1557F, -0.5869F));

		PartDefinition cube_r356 = Body4.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(130, 122).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3141F, 1.8163F, 7.4555F, 0.3107F, -0.3005F, 0.8486F));

		PartDefinition cube_r357 = Body4.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(114, 58).addBox(0.356F, -0.346F, -0.44F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0147F, 5.232F, 0.5038F, -0.4147F, 0.8332F));

		PartDefinition cube_r358 = Body4.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(51, 136).addBox(0.0F, -2.2F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5132F, 7.1074F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r359 = Body4.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(48, 136).addBox(0.0F, -2.5F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4318F, 5.0833F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r360 = Body4.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(45, 136).addBox(0.0F, -2.8F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0564F, 2.9054F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r361 = Body4.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(42, 136).addBox(-1.0F, -2.7648F, 0.0357F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3804F, 1.0194F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r362 = Body4.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(122, 130).addBox(1.9665F, -1.3377F, -0.7872F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2627F, 3.7526F, 0.3895F, -0.4509F, 1.174F));

		PartDefinition cube_r363 = Body4.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(115, 130).addBox(0.3454F, -0.3819F, -0.8039F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2627F, 3.7526F, 0.538F, -0.2596F, 0.7545F));

		PartDefinition cube_r364 = Body4.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(114, 46).addBox(2.9652F, -2.5284F, -0.8524F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0627F, 1.7526F, 0.138F, -0.4197F, 1.5082F));

		PartDefinition cube_r365 = Body4.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(130, 91).addBox(1.7976F, -0.8735F, -0.8524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0627F, 1.7526F, 0.3198F, -0.3083F, 1.0075F));

		PartDefinition cube_r366 = Body4.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(130, 89).addBox(-0.0043F, -0.0327F, -0.8671F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0627F, 1.7526F, 0.4182F, -0.1557F, 0.5869F));

		PartDefinition cube_r367 = Body4.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(50, 60).addBox(-2.5F, -0.0648F, 0.1356F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.4012F, -0.0784F, -0.1571F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6044F, 7.4494F, 6.7491F, -0.134F, 0.2163F, -0.0289F));

		PartDefinition cube_r368 = bone.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(67, 106).addBox(-0.3496F, 0.8005F, -1.8058F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4871F, 0.7224F, 0.2333F, 1.0495F, -0.4235F, 1.3362F));

		PartDefinition cube_r369 = bone.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(82, 120).addBox(-0.3496F, -3.1007F, -3.1772F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4871F, 0.7224F, 0.2333F, -3.0084F, -0.4235F, 1.3362F));

		PartDefinition cube_r370 = bone.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(66, 118).addBox(-0.3496F, 1.207F, -1.316F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4871F, 0.7224F, 0.2333F, 2.0531F, -0.4235F, 1.3362F));

		PartDefinition cube_r371 = bone.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(123, 122).addBox(-0.3827F, -1.4236F, -0.7011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4871F, 0.7224F, 0.2333F, 1.6689F, -0.3132F, 1.3598F));

		PartDefinition cube_r372 = bone.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(107, 121).addBox(-0.4944F, -1.4115F, -1.6062F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7208F, 1.6911F, -2.1591F, 1.2762F, -0.3132F, 1.3598F));

		PartDefinition cube_r373 = bone.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(40, 117).addBox(-0.3827F, -3.8633F, -2.7975F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4871F, 0.7224F, 0.2333F, 0.9708F, -0.3132F, 1.3598F));

		PartDefinition cube_r374 = bone.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(25, 54).addBox(-0.3827F, -1.409F, -3.9961F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4871F, 0.7224F, 0.2333F, -0.1724F, -0.3132F, 1.3598F));

		PartDefinition cube_r375 = bone.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(116, 117).addBox(-0.3827F, -1.9454F, -1.3717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4871F, 0.7224F, 0.2333F, 0.8399F, -0.3132F, 1.3598F));

		PartDefinition cube_r376 = bone.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(123, 87).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.7914F, -2.9809F, 0.3503F, 1.9354F, -0.0607F, -0.2118F));

		PartDefinition cube_r377 = bone.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(31, 117).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7926F, -2.9678F, 0.3757F, 1.5776F, -0.0607F, -0.2118F));

		PartDefinition bone5 = Body4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6044F, 7.4494F, 6.7491F, -0.134F, -0.2163F, 0.0289F));

		PartDefinition cube_r378 = bone5.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(67, 106).mirror().addBox(-0.6504F, 0.8005F, -1.8058F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4871F, 0.7224F, 0.2333F, 1.0495F, 0.4235F, -1.3362F));

		PartDefinition cube_r379 = bone5.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(82, 120).mirror().addBox(-0.6504F, -3.1007F, -3.1772F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4871F, 0.7224F, 0.2333F, -3.0084F, 0.4235F, -1.3362F));

		PartDefinition cube_r380 = bone5.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(66, 118).mirror().addBox(-0.6504F, 1.207F, -1.316F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4871F, 0.7224F, 0.2333F, 2.0531F, 0.4235F, -1.3362F));

		PartDefinition cube_r381 = bone5.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(123, 122).mirror().addBox(-0.6173F, -1.4236F, -0.7011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.4871F, 0.7224F, 0.2333F, 1.6689F, 0.3132F, -1.3598F));

		PartDefinition cube_r382 = bone5.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(107, 121).mirror().addBox(-0.5056F, -1.4115F, -1.6062F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7208F, 1.6911F, -2.1591F, 1.2762F, 0.3132F, -1.3598F));

		PartDefinition cube_r383 = bone5.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(40, 117).mirror().addBox(-0.6173F, -3.8633F, -2.7975F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4871F, 0.7224F, 0.2333F, 0.9708F, 0.3132F, -1.3598F));

		PartDefinition cube_r384 = bone5.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(25, 54).mirror().addBox(-0.6173F, -1.409F, -3.9961F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4871F, 0.7224F, 0.2333F, -0.1724F, 0.3132F, -1.3598F));

		PartDefinition cube_r385 = bone5.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(116, 117).mirror().addBox(-0.6173F, -1.9454F, -1.3717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4871F, 0.7224F, 0.2333F, 0.8399F, 0.3132F, -1.3598F));

		PartDefinition cube_r386 = bone5.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(123, 87).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.7914F, -2.9809F, 0.3503F, 1.9354F, 0.0607F, 0.2118F));

		PartDefinition cube_r387 = bone5.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(31, 117).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7926F, -2.9678F, 0.3757F, 1.5776F, 0.0607F, 0.2118F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8532F, 7.2403F, 6.7028F, 0.477F, -0.921F, -0.2703F));

		PartDefinition cube_r388 = HindlimbL.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(126, 63).addBox(-0.55F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1969F, 2.3373F, -0.0733F, -3.1416F, -0.4625F, -2.5307F));

		PartDefinition cube_r389 = HindlimbL.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(10, 126).addBox(-0.375F, -0.5F, -1.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.1299F, 1.5901F, 1.6214F, 0.0F, -0.8029F, 0.6109F));

		PartDefinition cube_r390 = HindlimbL.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(118, 103).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.7204F, 2.7039F, 0.9927F, 0.0F, -0.1309F, 0.6109F));

		PartDefinition cube_r391 = HindlimbL.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(113, 72).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8364F, 1.3846F, 0.7927F, 0.0F, -0.1745F, 0.6109F));

		PartDefinition HindlimbL2 = HindlimbL.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offset(4.3162F, 2.9717F, 1.2927F));

		PartDefinition cube_r392 = HindlimbL2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(125, 41).addBox(-1.1464F, -0.5133F, -1.0077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7416F, 0.7349F, 2.5026F, 3.0481F, 0.5105F, -2.5384F));

		PartDefinition cube_r393 = HindlimbL2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(125, 37).addBox(-0.5077F, -0.5133F, -1.6535F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7416F, 0.7349F, 2.5026F, 0.1652F, 1.0525F, 0.7929F));

		PartDefinition cube_r394 = HindlimbL2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(15, 137).addBox(-0.3509F, -0.5133F, -0.2138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7416F, 0.7349F, 2.5026F, 2.7964F, 1.3276F, -2.8284F));

		PartDefinition cube_r395 = HindlimbL2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(136, 129).addBox(-0.6888F, -0.5133F, -0.7533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7416F, 0.7349F, 2.5026F, 2.97F, 1.0735F, -2.6438F));

		PartDefinition cube_r396 = HindlimbL2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(136, 108).addBox(-0.45F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1406F, 0.948F, -0.4109F, 0.0F, -0.6981F, 0.6109F));

		PartDefinition cube_r397 = HindlimbL2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(137, 111).addBox(1.025F, -0.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5958F, -0.2679F, -0.3F, 0.0F, -0.9599F, 0.6109F));

		PartDefinition cube_r398 = HindlimbL2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(125, 33).addBox(-0.5F, -0.5F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7251F, 0.657F, -0.2894F, -3.1416F, -1.4399F, -2.5307F));

		PartDefinition cube_r399 = HindlimbL2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(125, 25).addBox(1.1F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5958F, -0.2679F, -0.3F, 0.0F, -0.1309F, 0.6109F));

		PartDefinition cube_r400 = HindlimbL2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(73, 60).addBox(-0.8F, 0.0F, 0.2F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.6F, -0.5F, 0.0F, -0.2967F, 0.6109F));

		PartDefinition HindlimbL3 = Body4.addOrReplaceChild("HindlimbL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8532F, 7.2403F, 6.7028F, 0.3054F, 0.3927F, 0.0F));

		PartDefinition cube_r401 = HindlimbL3.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(126, 66).addBox(-1.45F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1969F, 2.3373F, -0.0733F, -3.1416F, 0.4625F, 2.5307F));

		PartDefinition cube_r402 = HindlimbL3.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(126, 60).addBox(-1.625F, -0.5F, -1.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.1299F, 1.5901F, 1.6214F, 0.0F, 0.8029F, -0.6109F));

		PartDefinition cube_r403 = HindlimbL3.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(119, 0).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.7204F, 2.7039F, 0.9927F, 0.0F, 0.1309F, -0.6109F));

		PartDefinition cube_r404 = HindlimbL3.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(35, 114).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.8364F, 1.3846F, 0.7927F, 0.0F, 0.1745F, -0.6109F));

		PartDefinition HindlimbL4 = HindlimbL3.addOrReplaceChild("HindlimbL4", CubeListBuilder.create(), PartPose.offset(-4.3162F, 2.9717F, 1.2927F));

		PartDefinition cube_r405 = HindlimbL4.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(125, 112).addBox(0.1464F, -0.5133F, -1.0077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7416F, 0.7349F, 2.5026F, 3.0481F, -0.5105F, 2.5384F));

		PartDefinition cube_r406 = HindlimbL4.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(96, 125).addBox(-0.4923F, -0.5133F, -1.6535F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7416F, 0.7349F, 2.5026F, 0.1652F, -1.0525F, -0.7929F));

		PartDefinition cube_r407 = HindlimbL4.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(137, 84).addBox(-0.6491F, -0.5133F, -0.2138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7416F, 0.7349F, 2.5026F, 2.7964F, -1.3276F, 2.8284F));

		PartDefinition cube_r408 = HindlimbL4.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(137, 81).addBox(-0.3112F, -0.5133F, -0.7533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7416F, 0.7349F, 2.5026F, 2.97F, -1.0735F, 2.6438F));

		PartDefinition cube_r409 = HindlimbL4.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(137, 78).addBox(-0.55F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1406F, 0.948F, -0.4109F, 0.0F, 0.6981F, -0.6109F));

		PartDefinition cube_r410 = HindlimbL4.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(138, 62).addBox(-2.025F, -0.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5958F, -0.2679F, -0.3F, 0.0F, 0.9599F, -0.6109F));

		PartDefinition cube_r411 = HindlimbL4.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(89, 125).addBox(-0.5F, -0.5F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7251F, 0.657F, -0.2894F, -3.1416F, 1.4399F, 2.5307F));

		PartDefinition cube_r412 = HindlimbL4.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(125, 78).addBox(-2.1F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5958F, -0.2679F, -0.3F, 0.0F, 0.1309F, -0.6109F));

		PartDefinition cube_r413 = HindlimbL4.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(73, 65).addBox(-7.2F, 0.0F, 0.2F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 2.6F, -0.5F, 0.0F, 0.2967F, -0.6109F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0617F, 8.8871F, -0.0532F, 0.1743F, -0.0092F));

		PartDefinition cube_r414 = Body5.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(82, 141).addBox(-1.0F, -1.6796F, -0.9936F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1599F, 6.8648F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r415 = Body5.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(32, 140).addBox(-1.0F, -1.7627F, 0.0008F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1599F, 3.8648F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r416 = Body5.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(29, 140).addBox(-1.0F, -1.8476F, 0.0005F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1599F, 1.8648F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r417 = Body5.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(54, 136).addBox(-1.0F, -2.0325F, 0.0002F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1599F, -0.1352F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r418 = Body5.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(100, 141).addBox(0.0F, 4.0998F, 1.5175F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 140).addBox(0.0F, 2.8998F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.284F, 2.3288F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r419 = Body5.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(80, 78).addBox(-2.0F, 0.05F, 0.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1599F, -0.1352F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create().texOffs(38, 140).addBox(0.0F, -2.9449F, 3.036F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0748F, 6.7186F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r420 = Body6.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(35, 140).addBox(-1.0F, -2.475F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.385F, 1.1357F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r421 = Body6.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(141, 103).addBox(-1.0828F, -40.89F, 19.1471F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 141).addBox(-1.0828F, -41.89F, 17.1471F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 45.7515F, 12.664F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r422 = Body6.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(77, 105).addBox(-2.0827F, -46.8982F, -11.8212F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0828F, 45.7515F, 12.664F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body9 = Body6.addOrReplaceChild("Body9", CubeListBuilder.create().texOffs(120, 140).addBox(0.0F, -2.785F, 1.0549F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1999F, 3.9145F, 0.0532F, 0.1743F, 0.0092F));

		PartDefinition cube_r423 = Body9.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(123, 140).addBox(-1.0828F, -49.1897F, -2.4631F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 94).addBox(-2.0827F, -47.2821F, -5.4629F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0828F, 46.3464F, 6.3325F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r424 = Body9.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(56, 119).addBox(-1.0828F, -40.7217F, 23.3418F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 46.3464F, 6.3325F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r425 = Body9.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(141, 107).addBox(-1.0828F, -40.603F, 19.9162F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 46.3464F, 6.3325F, 0.5498F, 0.0F, 0.0F));

		PartDefinition Body7 = Body9.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0208F, 4.0118F, -0.0435F, -0.0872F, -0.0038F));

		PartDefinition cube_r426 = Body7.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(129, 140).addBox(-1.0828F, -49.1277F, 0.6956F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 46.4243F, 0.296F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r427 = Body7.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(126, 140).addBox(-1.0828F, -49.2082F, -0.4788F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 93).addBox(-2.0827F, -47.282F, -1.4785F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 46.4243F, 0.296F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r428 = Body7.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(140, 126).addBox(-1.0828F, -38.9794F, 22.2244F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(140, 0).addBox(-1.0828F, -39.7794F, 20.2244F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 46.4243F, 0.296F, 0.4625F, 0.0F, 0.0F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2255F, 4.9468F, -0.0173F, 0.0F, -0.0038F));

		PartDefinition cube_r429 = Body8.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(85, 141).addBox(-1.0828F, -49.0691F, 7.8384F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 140).addBox(-1.0828F, -49.0691F, 5.8384F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 46.0612F, -5.8585F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r430 = Body8.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(132, 140).addBox(-1.0828F, -49.1093F, 3.0148F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 46.0612F, -5.8585F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r431 = Body8.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(141, 139).addBox(-1.0828F, -35.7174F, 29.2438F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 129).addBox(-1.0828F, -36.5174F, 27.2438F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 141).addBox(-1.0828F, -37.4174F, 25.2438F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 46.0612F, -5.8585F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r432 = Body8.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(32, 93).addBox(-2.0827F, -47.1802F, 4.6643F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0828F, 46.0612F, -5.8585F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body12 = Body8.addOrReplaceChild("Body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.225F, 5.0052F, -0.0173F, -0.0436F, -0.003F));

		PartDefinition cube_r433 = Body12.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(138, 140).addBox(-1.0828F, -49.3061F, 11.4001F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 45.5361F, -12.0599F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r434 = Body12.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(140, 135).addBox(-1.0828F, -48.819F, 11.0544F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 45.5361F, -12.0599F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r435 = Body12.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(47, 93).addBox(-2.0827F, -46.9176F, 10.8755F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 45.5361F, -12.0599F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body13 = Body12.addOrReplaceChild("Body13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, 5.0061F, -0.0088F, 0.0873F, -0.0008F));

		PartDefinition cube_r436 = Body13.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(6, 141).addBox(-1.0F, -1.4162F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9595F, 4.0478F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r437 = Body13.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(3, 141).addBox(-1.0F, -1.5162F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0118F, 2.0485F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r438 = Body13.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(0, 141).addBox(-1.0828F, -49.3816F, 12.997F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 45.5833F, -16.6688F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r439 = Body13.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(98, 60).addBox(-2.0827F, -47.0854F, 15.4817F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 45.5833F, -16.6688F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body14 = Body13.addOrReplaceChild("Body14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1436F, 4.9989F, 0.0263F, 0.0872F, 0.0023F));

		PartDefinition cube_r440 = Body14.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(12, 141).addBox(-1.0F, -1.1162F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0118F, 3.0485F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r441 = Body14.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(9, 141).addBox(-1.0F, -1.2662F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 1.0492F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r442 = Body14.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(62, 98).addBox(-2.0F, -0.0162F, -0.0096F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 0.0492F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body15 = Body14.addOrReplaceChild("Body15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.161F, 4.9012F, -0.0792F, 0.1305F, -0.0103F));

		PartDefinition cube_r443 = Body15.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(41, 141).addBox(-1.0F, -1.3162F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9595F, 4.0478F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r444 = Body15.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(21, 141).addBox(-1.0F, -1.1162F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0118F, 2.0485F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r445 = Body15.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(18, 141).addBox(-1.0F, -0.9662F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 0.0492F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r446 = Body15.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(15, 101).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 0.0492F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body16 = Body15.addOrReplaceChild("Body16", CubeListBuilder.create().texOffs(91, 141).addBox(0.0F, -2.2304F, 5.0396F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1296F, 4.781F, -0.22F, 0.1278F, -0.0285F));

		PartDefinition cube_r447 = Body16.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(47, 141).addBox(-1.0F, -1.3162F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0118F, 3.0485F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r448 = Body16.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(44, 141).addBox(-1.0F, -1.3662F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 1.0492F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r449 = Body16.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(94, 141).addBox(-1.0F, -1.3409F, -0.5161F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0118F, 9.3485F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r450 = Body16.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(88, 141).addBox(-1.0F, -1.8162F, -0.1183F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0118F, 7.0485F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r451 = Body16.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(41, 101).addBox(-1.5F, 0.1147F, -0.0078F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 5.0492F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r452 = Body16.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(28, 101).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 0.0492F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body17 = Body16.addOrReplaceChild("Body17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1503F, 9.5781F, -0.3364F, 0.2137F, -0.0442F));

		PartDefinition cube_r453 = Body17.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(97, 141).addBox(-1.0F, -1.0639F, -0.0089F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9595F, 7.0478F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r454 = Body17.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(141, 65).addBox(-1.0F, -1.2162F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9595F, 5.0478F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r455 = Body17.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(53, 141).addBox(-1.0F, -1.2412F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0118F, 3.0485F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r456 = Body17.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(50, 141).addBox(-1.0F, -1.2662F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 1.0492F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r457 = Body17.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(42, 78).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 0.0492F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body18 = Body17.addOrReplaceChild("Body18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2132F, 7.8269F, 0.0482F, -0.0872F, -0.0042F));

		PartDefinition cube_r458 = Body18.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(142, 36).addBox(-1.0F, -0.5162F, 1.9904F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 47).addBox(-1.0F, -0.5162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9595F, 5.0478F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r459 = Body18.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(142, 50).addBox(-1.0F, -0.7162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0118F, 3.0485F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r460 = Body18.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(67, 141).addBox(-1.0F, -0.9412F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 1.0492F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r461 = Body18.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(61, 78).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 0.0492F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body19 = Body18.addOrReplaceChild("Body19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2191F, 7.9447F, 0.0137F, -0.3054F, -0.0041F));

		PartDefinition cube_r462 = Body19.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(0, 80).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 0.0492F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body20 = Body19.addOrReplaceChild("Body20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2446F, 8.0115F, 0.031F, -0.1745F, -0.0054F));

		PartDefinition cube_r463 = Body20.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(19, 83).addBox(-1.5F, -0.0662F, -0.0596F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5644F, 0.0339F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body21 = Body20.addOrReplaceChild("Body21", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.207F, 7.96F, 0.0849F, -0.2174F, -0.0184F));

		PartDefinition cube_r464 = Body21.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(80, 88).addBox(-1.5F, -0.0662F, -0.0596F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5644F, 0.0339F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body22 = Body21.addOrReplaceChild("Body22", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2199F, 7.9204F, 0.0858F, -0.2609F, -0.0222F));

		PartDefinition cube_r465 = Body22.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(0, 91).addBox(-1.5F, -0.0662F, -0.0596F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5644F, 0.0339F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Head = Cymbospondylus.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 1.0848F, -19.2102F, -0.2649F, 0.2608F, -0.0233F));

		PartDefinition cube_r466 = Head.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(137, 120).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0364F, 1.6502F, -27.1259F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r467 = Head.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(137, 117).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0364F, 1.3823F, -26.4792F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r468 = Head.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(73, 138).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0536F, 1.1921F, -25.5076F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r469 = Head.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(125, 16).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0536F, 0.839F, -23.5601F, 0.1789F, 0.0F, 0.0F));

		PartDefinition cube_r470 = Head.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(116, 25).addBox(-1.0F, -0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4464F, 0.8907F, -23.5734F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r471 = Head.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(98, 116).addBox(-1.0F, 0.0F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4464F, -0.0456F, -17.9077F, 0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r472 = Head.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(118, 98).addBox(-1.0F, -0.025F, -0.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4464F, -0.0388F, -17.7979F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r473 = Head.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(125, 12).addBox(-1.0F, -0.075F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4464F, -0.5377F, -13.0907F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r474 = Head.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(118, 93).addBox(-0.5F, -0.025F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0536F, -0.9804F, -10.1925F, 0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r475 = Head.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(98, 121).addBox(-1.0F, -0.675F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0536F, -0.5869F, -9.0024F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r476 = Head.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(120, 108).addBox(-1.0F, -0.0331F, -1.9531F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0536F, -1.778F, -7.9357F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r477 = Head.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(108, 30).addBox(-2.5F, -1.0F, 0.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0536F, -3.0583F, -0.2662F, -1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r478 = Head.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(113, 75).addBox(-3.0F, -0.0007F, 0.0126F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -2.7278F, 0.6626F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r479 = Head.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(66, 114).addBox(-2.5F, -0.0007F, 0.0126F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -3.1107F, -1.2645F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r480 = Head.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(54, 106).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5536F, -2.7837F, -4.1978F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r481 = Head.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(125, 8).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -1.7823F, -7.9986F, 0.4232F, 0.0F, 0.0F));

		PartDefinition cube_r482 = Head.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(106, 0).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -2.7919F, -4.1932F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r483 = Head.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(0, 100).addBox(-2.5F, -1.775F, -1.05F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0536F, -0.2578F, -1.35F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r484 = Head.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(0, 113).addBox(-2.5F, -1.0F, 0.05F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, -0.4765F, -0.769F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r485 = Head.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(114, 78).addBox(-2.0F, -1.0F, -0.05F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0536F, 0.4559F, -2.4614F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r486 = Head.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(116, 21).addBox(-2.0F, -0.95F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0536F, -0.6097F, -3.7912F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r487 = Head.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(114, 54).addBox(-2.0F, -2.0152F, 0.0014F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0536F, 2.0391F, -5.2026F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r488 = Head.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(90, 107).addBox(-2.0F, -0.975F, 0.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0536F, 0.0967F, -7.276F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4464F, 0.454F, -6.2482F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(35, 109).addBox(-2.0F, -0.15F, -1.85F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.35F, 0.59F, 2.2543F, -2.1642F, 0.0F, 0.0F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(91, 30).addBox(-1.0F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.5F, -1.4625F, -3.9229F, 0.1356F, 0.0692F, 0.0094F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(125, 53).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.225F, -2.2834F, -1.6621F, 0.4984F, 0.2069F, 0.0582F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(75, 131).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.647F, -0.8386F, 0.4346F, 0.2224F, 0.102F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(103, 112).addBox(-2.0F, -0.85F, -1.85F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.35F, 1.362F, 2.0219F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(17, 130).addBox(-0.5F, -0.85F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.5726F, 6.1351F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(62, 136).addBox(-0.5F, -0.55F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.2433F, 5.642F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r496 = leftFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(39, 124).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 0.4027F, 6.7486F, 2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r497 = leftFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(134, 102).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2604F, 1.3623F, -20.3444F, 0.3142F, 0.0785F, 0.0034F));

		PartDefinition cube_r498 = leftFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(120, 132).addBox(-0.425F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2939F, 1.6132F, -20.7599F, 0.2095F, 0.0785F, 0.0034F));

		PartDefinition cube_r499 = leftFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(132, 117).addBox(-0.5F, 0.37F, 0.0522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.3039F, 0.646F, -20.9286F, 0.0175F, 0.0785F, 0.0034F));

		PartDefinition cube_r500 = leftFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5F, 0.15F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1717F, -0.1703F, -14.0673F, 0.1482F, 0.0261F, 0.0034F));

		PartDefinition cube_r501 = leftFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(114, 125).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2799F, 0.6774F, -18.0951F, 0.1133F, 0.0261F, 0.0034F));

		PartDefinition cube_r502 = leftFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(105, 101).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2151F, 1.0244F, -15.5702F, 0.061F, 0.0261F, 0.0034F));

		PartDefinition cube_r503 = leftFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(63, 89).addBox(-0.5F, -0.55F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.9632F, 0.8951F, -10.6302F, 0.0218F, 0.061F, 0.0034F));

		PartDefinition cube_r504 = leftFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(41, 0).addBox(-0.8821F, -0.2543F, -11.9764F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.256F, -1.2824F, -2.4513F, 0.1307F, 0.0872F, 0.0F));

		PartDefinition cube_r505 = leftFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(134, 99).addBox(-0.5F, -0.325F, -1.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(134, 96).addBox(-0.5F, -0.325F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(134, 93).addBox(-0.5F, -0.325F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(134, 44).addBox(-0.5F, -0.325F, 0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(37, 134).addBox(-0.5F, -0.325F, 1.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3179F, 1.5287F, -19.3248F, 0.0348F, 0.0305F, 0.0021F));

		PartDefinition cube_r506 = leftFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(68, 133).addBox(-0.5209F, -0.525F, -1.8498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1593F, 1.5544F, -14.8277F, 0.0348F, 0.0304F, 0.0031F));

		PartDefinition cube_r507 = leftFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(133, 66).addBox(-0.5026F, -0.525F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(133, 63).addBox(-0.5026F, -0.525F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1593F, 1.5544F, -14.8277F, 0.0349F, 0.0478F, 0.0037F));

		PartDefinition cube_r508 = leftFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(32, 134).addBox(-0.5026F, -0.475F, 0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1593F, 1.4544F, -14.8277F, 0.0349F, 0.0478F, 0.0037F));

		PartDefinition cube_r509 = leftFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(63, 133).addBox(-0.5F, -0.5F, -1.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(27, 134).addBox(-0.5F, -0.45F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(134, 20).addBox(-0.5F, -0.45F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 134).addBox(-0.5F, -0.45F, 0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9896F, 1.3301F, -11.2318F, 0.0174F, 0.0479F, 0.0021F));

		PartDefinition cube_r510 = leftFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(137, 90).addBox(-0.5F, -0.4125F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8626F, 1.3181F, -8.5848F, -0.0001F, 0.0479F, 0.0021F));

		PartDefinition cube_r511 = leftFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(57, 136).addBox(-0.5F, -0.625F, -5.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(135, 126).addBox(-0.5F, -0.675F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(137, 87).addBox(-0.5F, -0.65F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(110, 133).addBox(-0.5F, -0.625F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 133).addBox(-0.5F, -0.625F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(133, 60).addBox(-0.5F, -0.625F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1701F, 1.5576F, -2.7257F, -0.0001F, 0.1177F, 0.002F));

		PartDefinition cube_r512 = leftFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(100, 133).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.17F, 1.5326F, -2.7257F, -0.131F, 0.1177F, 0.002F));

		PartDefinition cube_r513 = leftFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(89, 0).addBox(-0.8843F, -0.4586F, -6.9283F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.271F, 0.0073F, -2.2956F, -0.0307F, 0.0959F, 0.002F));

		PartDefinition cube_r514 = leftFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(48, 132).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3464F, -0.2054F, 2.1753F, -1.0667F, 0.1037F, -0.0106F));

		PartDefinition cube_r515 = leftFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(43, 132).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.2439F, 1.6343F, 1.0026F, 0.2859F, 0.1037F, -0.0106F));

		PartDefinition cube_r516 = leftFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(13, 116).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4314F, 1.7046F, -2.0322F, 0.0241F, 0.1037F, -0.0106F));

		PartDefinition cube_r517 = leftFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(123, 48).addBox(-0.5F, -1.45F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0597F, 1.1539F, -1.9156F, -0.1675F, 0.1997F, -0.0083F));

		PartDefinition cube_r518 = leftFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(114, 48).addBox(-0.5F, -1.425F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4372F, -1.1286F, 3.7367F, 0.0355F, 0.0311F, 0.0091F));

		PartDefinition cube_r519 = leftFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(49, 128).addBox(-1.0F, -0.1128F, -1.1393F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.4544F, 3.3394F, 0.0785F, 0.1004F, 0.0F));

		PartDefinition cube_r520 = leftFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(48, 109).addBox(-0.5527F, 3.8907F, -0.979F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.256F, -1.2824F, -2.4513F, -1.2217F, 0.0873F, 0.0F));

		PartDefinition cube_r521 = leftFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(138, 132).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0659F, -0.6814F, -2.523F, -0.8727F, 0.1004F, 0.0F));

		PartDefinition cube_r522 = leftFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(139, 21).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0296F, -0.9822F, -1.5741F, 0.3054F, 0.1004F, 0.0F));

		PartDefinition cube_r523 = leftFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(139, 30).addBox(-0.275F, -0.575F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(139, 27).addBox(-0.8F, -0.575F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(0.0891F, 0.2058F, -1.4828F, 1.5533F, 0.1004F, 0.0F));

		PartDefinition cube_r524 = leftFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(139, 18).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1294F, -0.895F, -0.5829F, 1.4835F, 0.1004F, 0.0F));

		PartDefinition cube_r525 = leftFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(139, 15).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1811F, -0.4221F, -0.0694F, 2.3998F, 0.1004F, 0.0F));

		PartDefinition cube_r526 = leftFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(115, 138).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1935F, 0.9868F, 0.0532F, -2.2689F, 0.1004F, 0.0F));

		PartDefinition cube_r527 = leftFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(78, 138).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0979F, 1.2874F, -0.8957F, -1.2654F, 0.1004F, 0.0F));

		PartDefinition cube_r528 = leftFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(137, 123).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0022F, 1.2438F, -1.8897F, -0.0436F, 0.1004F, 0.0F));

		PartDefinition cube_r529 = leftFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(138, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0977F, 0.9431F, -2.8387F, 1.2654F, 0.1004F, 0.0F));

		PartDefinition cube_r530 = leftFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(135, 0).addBox(-0.5F, -0.45F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0937F, 0.3424F, -2.7983F, 2.3475F, 0.1004F, 0.0F));

		PartDefinition cube_r531 = leftFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(24, 109).addBox(-0.5F, -1.55F, -3.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3673F, -0.8735F, 2.0467F, 0.1571F, 0.1004F, 0.0F));

		PartDefinition cube_r532 = leftFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(116, 9).addBox(-0.925F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0871F, -1.185F, -4.5654F, 0.228F, 0.109F, 0.0367F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.5536F, 0.454F, -6.2482F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(35, 109).mirror().addBox(-2.0F, -0.15F, -1.85F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.35F, 0.59F, 2.2543F, -2.1642F, 0.0F, 0.0F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(91, 30).mirror().addBox(0.0F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.4625F, -3.9229F, 0.1356F, -0.0692F, -0.0094F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(125, 53).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.225F, -2.2834F, -1.6621F, 0.4984F, -0.2069F, -0.0582F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(75, 131).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.647F, -0.8386F, 0.4346F, -0.2224F, -0.102F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(103, 112).mirror().addBox(-2.0F, -0.85F, -1.85F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.35F, 1.362F, 2.0219F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(17, 130).mirror().addBox(-0.5F, -0.85F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5726F, 6.1351F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(62, 136).mirror().addBox(-0.5F, -0.55F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2433F, 5.642F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(39, 124).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4027F, 6.7486F, 2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(134, 102).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2604F, 1.3623F, -20.3444F, 0.3142F, -0.0785F, -0.0034F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(120, 132).mirror().addBox(-0.575F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2939F, 1.6132F, -20.7599F, 0.2095F, -0.0785F, -0.0034F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(132, 117).mirror().addBox(-0.5F, 0.37F, 0.0522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.3039F, 0.646F, -20.9286F, 0.0175F, -0.0785F, -0.0034F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-0.5F, 0.15F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.1717F, -0.1703F, -14.0673F, 0.1482F, -0.0261F, -0.0034F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(114, 125).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2799F, 0.6774F, -18.0951F, 0.1133F, -0.0261F, -0.0034F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(105, 101).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2151F, 1.0244F, -15.5702F, 0.061F, -0.0261F, -0.0034F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(63, 89).mirror().addBox(-0.5F, -0.55F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.9632F, 0.8951F, -10.6302F, 0.0218F, -0.061F, -0.0034F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-0.1179F, -0.2543F, -11.9764F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.256F, -1.2824F, -2.4513F, 0.1307F, -0.0872F, 0.0F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(134, 99).mirror().addBox(-0.5F, -0.325F, -1.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(134, 96).mirror().addBox(-0.5F, -0.325F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(134, 93).mirror().addBox(-0.5F, -0.325F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(134, 44).mirror().addBox(-0.5F, -0.325F, 0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(37, 134).mirror().addBox(-0.5F, -0.325F, 1.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3179F, 1.5287F, -19.3248F, 0.0348F, -0.0305F, -0.0021F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(68, 133).mirror().addBox(-0.4791F, -0.525F, -1.8498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1593F, 1.5544F, -14.8277F, 0.0348F, -0.0304F, -0.0031F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(133, 66).mirror().addBox(-0.4974F, -0.525F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(133, 63).mirror().addBox(-0.4974F, -0.525F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1593F, 1.5544F, -14.8277F, 0.0349F, -0.0478F, -0.0037F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(32, 134).mirror().addBox(-0.4974F, -0.475F, 0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1593F, 1.4544F, -14.8277F, 0.0349F, -0.0478F, -0.0037F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(63, 133).mirror().addBox(-0.5F, -0.5F, -1.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(27, 134).mirror().addBox(-0.5F, -0.45F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(134, 20).mirror().addBox(-0.5F, -0.45F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 134).mirror().addBox(-0.5F, -0.45F, 0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9896F, 1.3301F, -11.2318F, 0.0174F, -0.0479F, -0.0021F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(137, 90).mirror().addBox(-0.5F, -0.4125F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8626F, 1.3181F, -8.5848F, -0.0001F, -0.0479F, -0.0021F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(57, 136).mirror().addBox(-0.5F, -0.625F, -5.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(135, 126).mirror().addBox(-0.5F, -0.675F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(137, 87).mirror().addBox(-0.5F, -0.65F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(110, 133).mirror().addBox(-0.5F, -0.625F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 133).mirror().addBox(-0.5F, -0.625F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(133, 60).mirror().addBox(-0.5F, -0.625F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1701F, 1.5576F, -2.7257F, -0.0001F, -0.1177F, -0.002F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(100, 133).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.17F, 1.5326F, -2.7257F, -0.131F, -0.1177F, -0.002F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.1157F, -0.4586F, -6.9283F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.271F, 0.0073F, -2.2956F, -0.0307F, -0.0959F, -0.002F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(48, 132).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3464F, -0.2054F, 2.1753F, -1.0667F, -0.1037F, 0.0106F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(43, 132).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.2439F, 1.6343F, 1.0026F, 0.2859F, -0.1037F, 0.0106F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(13, 116).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4314F, 1.7046F, -2.0322F, 0.0241F, -0.1037F, 0.0106F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(123, 48).mirror().addBox(-0.5F, -1.45F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0597F, 1.1539F, -1.9156F, -0.1675F, -0.1997F, 0.0083F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(114, 48).mirror().addBox(-0.5F, -1.425F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4372F, -1.1286F, 3.7367F, 0.0355F, -0.0311F, -0.0091F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(49, 128).mirror().addBox(0.0F, -0.1128F, -1.1393F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.4544F, 3.3394F, 0.0785F, -0.1004F, 0.0F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(48, 109).mirror().addBox(-0.4473F, 3.8907F, -0.979F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.256F, -1.2824F, -2.4513F, -1.2217F, -0.0873F, 0.0F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(138, 132).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0659F, -0.6814F, -2.523F, -0.8727F, -0.1004F, 0.0F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(139, 21).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0296F, -0.9822F, -1.5741F, 0.3054F, -0.1004F, 0.0F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(139, 30).mirror().addBox(-0.725F, -0.575F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(139, 27).mirror().addBox(-0.2F, -0.575F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0891F, 0.2058F, -1.4828F, 1.5533F, -0.1004F, 0.0F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(139, 18).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1294F, -0.895F, -0.5829F, 1.4835F, -0.1004F, 0.0F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(139, 15).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1811F, -0.4221F, -0.0694F, 2.3998F, -0.1004F, 0.0F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(115, 138).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1935F, 0.9868F, 0.0532F, -2.2689F, -0.1004F, 0.0F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(78, 138).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0979F, 1.2874F, -0.8957F, -1.2654F, -0.1004F, 0.0F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(137, 123).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0022F, 1.2438F, -1.8897F, -0.0436F, -0.1004F, 0.0F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(138, 75).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0977F, 0.9431F, -2.8387F, 1.2654F, -0.1004F, 0.0F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(135, 0).mirror().addBox(-0.5F, -0.45F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0937F, 0.3424F, -2.7983F, 2.3475F, -0.1004F, 0.0F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(24, 109).mirror().addBox(-0.5F, -1.55F, -3.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3673F, -0.8735F, 2.0467F, 0.1571F, -0.1004F, 0.0F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(116, 9).mirror().addBox(-0.075F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0871F, -1.185F, -4.5654F, 0.228F, -0.109F, -0.0367F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 1.1559F, 0.2816F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r577 = Jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(137, 56).mirror().addBox(-0.9889F, 5.6796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(139, 12).mirror().addBox(-0.9889F, 4.8796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(137, 53).mirror().addBox(-0.9889F, 4.0796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(139, 9).mirror().addBox(-0.9889F, 3.2796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(137, 50).mirror().addBox(-0.9889F, 2.4796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 133).mirror().addBox(-0.9889F, 1.6796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(139, 6).mirror().addBox(-0.9889F, 0.8796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(90, 133).mirror().addBox(-0.9889F, 0.0796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3898F, -2.6155F, -20.6178F, -1.7886F, 0.0013F, 0.0118F));

		PartDefinition cube_r578 = Jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(85, 133).mirror().addBox(-1.0071F, 5.158F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 133).mirror().addBox(-1.0071F, 4.358F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(115, 135).mirror().addBox(-1.0071F, 3.558F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(137, 47).mirror().addBox(-1.0071F, 2.758F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(133, 75).mirror().addBox(-1.0071F, 1.958F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(130, 132).mirror().addBox(-1.0071F, 1.158F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(115, 132).mirror().addBox(-1.0071F, 0.358F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(133, 72).mirror().addBox(-1.0071F, -0.442F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(77, 114).mirror().addBox(-1.0071F, -0.341F, -1.4262F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.5776F, -15.0558F, -1.7893F, -0.051F, 0.0118F));

		PartDefinition cube_r579 = Jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(137, 38).mirror().addBox(0.0759F, 8.8759F, -1.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(139, 24).mirror().addBox(0.0759F, 8.0759F, -1.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 135).mirror().addBox(0.0759F, 7.2759F, -1.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(22, 116).mirror().addBox(0.0759F, -0.6005F, -0.3862F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0224F, -5.2558F, -1.7901F, -0.1208F, 0.0119F));

		PartDefinition cube_r580 = Jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(73, 135).mirror().addBox(0.0759F, 6.4906F, -1.2175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(132, 114).mirror().addBox(0.0759F, 5.6906F, -1.2175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(133, 69).mirror().addBox(0.0759F, 4.8906F, -1.2175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(54, 126).mirror().addBox(0.0759F, 0.9159F, -0.7028F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0224F, -5.2558F, -1.8075F, -0.1208F, 0.0119F));

		PartDefinition cube_r581 = Jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(36, 137).mirror().addBox(0.0759F, 4.1026F, -1.1343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(125, 132).mirror().addBox(0.0759F, 3.3026F, -1.1343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0224F, -5.2558F, -1.825F, -0.1208F, 0.0119F));

		PartDefinition cube_r582 = Jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(132, 53).mirror().addBox(-0.9889F, 4.8249F, -0.5162F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.2148F, -2.6155F, -20.6178F, -1.8279F, 0.0013F, 0.0118F));

		PartDefinition cube_r583 = Jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(18, 122).mirror().addBox(-0.9889F, -0.2777F, -0.6367F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(0.3898F, -2.6155F, -20.6178F, -1.7756F, 0.0013F, 0.0118F));

		PartDefinition cube_r584 = Jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(99, 94).mirror().addBox(-1.0071F, -0.064F, -0.9124F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false)
				.texOffs(0, 126).mirror().addBox(-1.0071F, -0.064F, -0.3124F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.5776F, -15.0558F, -1.9114F, -0.051F, 0.0118F));

		PartDefinition cube_r585 = Jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(91, 113).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.1734F, -0.5608F, -8.7776F, -1.8032F, -0.1208F, 0.0119F));

		PartDefinition cube_r586 = Jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(48, 113).mirror().addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.6758F, 0.0093F, -4.3078F, 3.0189F, -0.0685F, 0.0118F));

		PartDefinition cube_r587 = Jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(132, 38).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.6775F, 0.014F, -4.2834F, 1.6314F, -0.0685F, 0.0118F));

		PartDefinition cube_r588 = Jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(132, 111).mirror().addBox(-0.9889F, 4.2795F, 4.0648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2148F, -2.6155F, -20.6178F, -2.574F, 0.0013F, 0.0118F));

		PartDefinition cube_r589 = Jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(139, 3).mirror().addBox(-0.9889F, 5.2587F, 1.5088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3148F, -2.6155F, -20.6178F, -2.1203F, 0.0013F, 0.0118F));

		PartDefinition cube_r590 = Jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(135, 137).mirror().addBox(-0.9889F, 4.6418F, 0.6646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(0.3898F, -2.6155F, -20.6178F, -1.9806F, 0.0013F, 0.0118F));

		PartDefinition cube_r591 = Jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(132, 78).mirror().addBox(-0.9889F, 2.8694F, -0.0899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.3898F, -2.6155F, -20.6178F, -1.8236F, 0.0013F, 0.0118F));

		PartDefinition cube_r592 = Jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(23, 126).mirror().addBox(-0.9889F, -0.0794F, -0.0393F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(0.3898F, -2.6155F, -20.6178F, -1.841F, 0.0013F, 0.0118F));

		PartDefinition cube_r593 = Jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(5, 126).mirror().addBox(-1.0071F, 2.857F, -0.5165F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.5776F, -15.0558F, -1.8416F, -0.051F, 0.0118F));

		PartDefinition cube_r594 = Jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(59, 113).mirror().addBox(0.0759F, 3.8983F, 0.849F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0224F, -5.2558F, -1.9472F, -0.1208F, 0.0119F));

		PartDefinition cube_r595 = Jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(82, 113).mirror().addBox(0.0759F, 0.9724F, -0.2203F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0224F, -5.2558F, -1.9297F, -0.1208F, 0.0119F));

		PartDefinition cube_r596 = Jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(116, 15).mirror().addBox(-0.0262F, 3.3614F, -0.3522F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.0224F, 0.0442F, -1.5621F, -0.0698F, 0.0F));

		PartDefinition cube_r597 = Jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(25, 47).mirror().addBox(-0.0262F, 0.703F, -0.8168F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.0224F, 0.0442F, -1.4312F, -0.0698F, 0.0F));

		PartDefinition cube_r598 = Jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(31, 137).mirror().addBox(-0.0262F, -0.9566F, 1.0845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.0224F, 0.0442F, -2.1729F, -0.0698F, 0.0F));

		PartDefinition cube_r599 = Jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(65, 123).mirror().addBox(-0.0262F, -1.4894F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.0224F, 0.0442F, -2.9147F, -0.0698F, 0.0F));

		PartDefinition cube_r600 = Jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(75, 122).mirror().addBox(-0.0262F, -1.2544F, -0.8359F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.0224F, 0.0442F, 1.946F, -0.0698F, 0.0F));

		PartDefinition cube_r601 = Jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(132, 53).addBox(-0.0111F, 4.8249F, -0.5162F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.2148F, -2.6155F, -20.6178F, -1.8279F, -0.0013F, -0.0118F));

		PartDefinition cube_r602 = Jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(132, 111).addBox(-0.0111F, 4.2795F, 4.0648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2148F, -2.6155F, -20.6178F, -2.574F, -0.0013F, -0.0118F));

		PartDefinition cube_r603 = Jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(139, 3).addBox(-0.0111F, 5.2587F, 1.5088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3148F, -2.6155F, -20.6178F, -2.1203F, -0.0013F, -0.0118F));

		PartDefinition cube_r604 = Jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(135, 137).addBox(-0.0111F, 4.6418F, 0.6646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-0.3898F, -2.6155F, -20.6178F, -1.9806F, -0.0013F, -0.0118F));

		PartDefinition cube_r605 = Jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(132, 78).addBox(-0.0111F, 2.8694F, -0.0899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.3898F, -2.6155F, -20.6178F, -1.8236F, -0.0013F, -0.0118F));

		PartDefinition cube_r606 = Jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(23, 126).addBox(-0.0111F, -0.0794F, -0.0393F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-0.3898F, -2.6155F, -20.6178F, -1.841F, -0.0013F, -0.0118F));

		PartDefinition cube_r607 = Jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(5, 126).addBox(0.0071F, 2.857F, -0.5165F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.1F, -0.5776F, -15.0558F, -1.8416F, 0.051F, -0.0118F));

		PartDefinition cube_r608 = Jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(99, 94).addBox(0.0071F, -0.064F, -0.9124F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.019F))
				.texOffs(0, 126).addBox(0.0071F, -0.064F, -0.3124F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.1F, -0.5776F, -15.0558F, -1.9114F, 0.051F, -0.0118F));

		PartDefinition cube_r609 = Jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(59, 113).addBox(-1.0759F, 3.8983F, 0.849F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(2.2F, 1.0224F, -5.2558F, -1.9472F, 0.1208F, -0.0119F));

		PartDefinition cube_r610 = Jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(48, 113).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.6758F, 0.0093F, -4.3078F, 3.0189F, 0.0685F, -0.0118F));

		PartDefinition cube_r611 = Jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(132, 38).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.6775F, 0.014F, -4.2834F, 1.6314F, 0.0685F, -0.0118F));

		PartDefinition cube_r612 = Jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(18, 122).addBox(-0.0111F, -0.2777F, -0.6367F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(-0.3898F, -2.6155F, -20.6178F, -1.7756F, -0.0013F, -0.0118F));

		PartDefinition cube_r613 = Jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(77, 114).addBox(0.0071F, -0.341F, -1.4262F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.018F))
				.texOffs(85, 133).addBox(0.0071F, 5.158F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(137, 47).addBox(0.0071F, 2.758F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(115, 135).addBox(0.0071F, 3.558F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 133).addBox(0.0071F, 4.358F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(115, 132).addBox(0.0071F, 0.358F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(130, 132).addBox(0.0071F, 1.158F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(133, 75).addBox(0.0071F, 1.958F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(133, 72).addBox(0.0071F, -0.442F, -1.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, -0.5776F, -15.0558F, -1.7893F, 0.051F, -0.0118F));

		PartDefinition cube_r614 = Jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(137, 53).addBox(-0.0111F, 4.0796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(139, 12).addBox(-0.0111F, 4.8796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(137, 56).addBox(-0.0111F, 5.6796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 133).addBox(-0.0111F, 1.6796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(137, 50).addBox(-0.0111F, 2.4796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(139, 9).addBox(-0.0111F, 3.2796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 133).addBox(-0.0111F, 0.0796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(139, 6).addBox(-0.0111F, 0.8796F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3898F, -2.6155F, -20.6178F, -1.7886F, -0.0013F, -0.0118F));

		PartDefinition cube_r615 = Jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(139, 24).addBox(-1.0759F, 8.0759F, -1.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(137, 38).addBox(-1.0759F, 8.8759F, -1.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 135).addBox(-1.0759F, 7.2759F, -1.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(22, 116).addBox(-1.0759F, -0.6005F, -0.3862F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.2F, 1.0224F, -5.2558F, -1.7901F, 0.1208F, -0.0119F));

		PartDefinition cube_r616 = Jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(73, 135).addBox(-1.0759F, 6.4906F, -1.2175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(132, 114).addBox(-1.0759F, 5.6906F, -1.2175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(133, 69).addBox(-1.0759F, 4.8906F, -1.2175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 126).addBox(-1.0759F, 0.9159F, -0.7028F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(2.2F, 1.0224F, -5.2558F, -1.8075F, 0.1208F, -0.0119F));

		PartDefinition cube_r617 = Jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(36, 137).addBox(-1.0759F, 4.1026F, -1.1343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(125, 132).addBox(-1.0759F, 3.3026F, -1.1343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 1.0224F, -5.2558F, -1.825F, 0.1208F, -0.0119F));

		PartDefinition cube_r618 = Jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(91, 113).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.1734F, -0.5608F, -8.7776F, -1.8032F, 0.1208F, -0.0119F));

		PartDefinition cube_r619 = Jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(82, 113).addBox(-1.0759F, 0.9724F, -0.2203F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.2F, 1.0224F, -5.2558F, -1.9297F, 0.1208F, -0.0119F));

		PartDefinition cube_r620 = Jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(116, 15).addBox(-0.9738F, 3.3614F, -0.3522F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.5F, 1.0224F, 0.0442F, -1.5621F, 0.0698F, 0.0F));

		PartDefinition cube_r621 = Jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(25, 47).addBox(-0.9738F, 0.703F, -0.8168F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.5F, 1.0224F, 0.0442F, -1.4312F, 0.0698F, 0.0F));

		PartDefinition cube_r622 = Jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(31, 137).addBox(-0.9738F, -0.9566F, 1.0845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(2.5F, 1.0224F, 0.0442F, -2.1729F, 0.0698F, 0.0F));

		PartDefinition cube_r623 = Jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(65, 123).addBox(-0.9738F, -1.4894F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.5F, 1.0224F, 0.0442F, -2.9147F, 0.0698F, 0.0F));

		PartDefinition cube_r624 = Jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(75, 122).addBox(-0.9738F, -1.2544F, -0.8359F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(2.5F, 1.0224F, 0.0442F, 1.946F, 0.0698F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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