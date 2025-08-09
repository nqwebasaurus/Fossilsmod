package fossils.fossils.client.blockentity.model.ophthalmosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OphthalmosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Ophthalmosaurus;
	private final ModelPart Body1;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Body3;
	private final ModelPart Body10;
	private final ModelPart Body11;
	private final ModelPart Body4;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart HindlimbL;
	private final ModelPart HindlimbL2;
	private final ModelPart Body5;
	private final ModelPart Body6;
	private final ModelPart Body9;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public OphthalmosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Ophthalmosaurus = this.fossil.getChild("Ophthalmosaurus");
		this.Body1 = this.Ophthalmosaurus.getChild("Body1");
		this.ForelimbL = this.Body1.getChild("ForelimbL");
		this.ForelimbL2 = this.Body1.getChild("ForelimbL2");
		this.Body2 = this.Body1.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body10 = this.Body3.getChild("Body10");
		this.Body11 = this.Body10.getChild("Body11");
		this.Body4 = this.Body11.getChild("Body4");
		this.bone = this.Body4.getChild("bone");
		this.bone4 = this.Body4.getChild("bone4");
		this.HindlimbL = this.Body4.getChild("HindlimbL");
		this.HindlimbL2 = this.Body4.getChild("HindlimbL2");
		this.Body5 = this.Body4.getChild("Body5");
		this.Body6 = this.Body5.getChild("Body6");
		this.Body9 = this.Body6.getChild("Body9");
		this.Body7 = this.Body9.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Head = this.Ophthalmosaurus.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Ophthalmosaurus = fossil.addOrReplaceChild("Ophthalmosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.1181F, 0.675F, -0.0721F, -0.0331F, 0.6145F));

		PartDefinition Body1 = Ophthalmosaurus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0817F, -16.8422F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(99, 94).addBox(0.0F, -2.241F, 0.0015F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6817F, 1.2672F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(61, 102).addBox(0.0F, -2.049F, 0.0263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0183F, -0.6328F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, -0.5F, -4.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.4817F, 1.7672F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 97).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2342F, 0.1526F, 0.2524F, 0.4937F, -0.6896F));

		PartDefinition cube_r5 = Body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(73, 8).mirror().addBox(-6.8126F, -0.8451F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2342F, 0.1526F, 0.0006F, 0.5423F, -1.1901F));

		PartDefinition cube_r6 = Body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 42).mirror().addBox(-11.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4658F, 1.9526F, 0.0686F, 0.5351F, -1.4357F));

		PartDefinition cube_r7 = Body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(92, 79).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4658F, 1.9526F, 0.3235F, 0.439F, -0.9017F));

		PartDefinition cube_r8 = Body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(92, 77).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4658F, 1.9526F, 0.4767F, 0.2734F, -0.4699F));

		PartDefinition cube_r9 = Body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 97).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2342F, 0.1526F, 0.2524F, -0.4937F, 0.6896F));

		PartDefinition cube_r10 = Body1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(73, 8).addBox(1.8126F, -0.8451F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2342F, 0.1526F, 0.0006F, -0.5423F, 1.1901F));

		PartDefinition cube_r11 = Body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(48, 42).addBox(2.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4658F, 1.9526F, 0.0686F, -0.5351F, 1.4357F));

		PartDefinition cube_r12 = Body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(92, 79).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4658F, 1.9526F, 0.3235F, -0.439F, 0.9017F));

		PartDefinition cube_r13 = Body1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(92, 77).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4658F, 1.9526F, 0.4767F, -0.2734F, 0.4699F));

		PartDefinition ForelimbL = Body1.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2F, 6.6459F, 5.3659F, 0.4423F, 0.026F, -0.2377F));

		PartDefinition cube_r14 = ForelimbL.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 11).addBox(5.5F, 0.7F, -0.9F, 10.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(82, 22).addBox(3.6F, 0.2F, 0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(79, 52).addBox(2.0F, 0.2F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F))
				.texOffs(31, 74).addBox(-0.975F, 0.2F, 1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8996F, -0.0329F, -2.1116F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r15 = ForelimbL.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(82, 57).addBox(-0.7F, -0.5F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8848F, 3.1401F, 1.1884F, 0.0F, -0.6109F, 0.6545F));

		PartDefinition cube_r16 = ForelimbL.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 83).addBox(-1.5F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.1229F, 3.3227F, -2.3116F, 0.0F, 0.3927F, 0.6545F));

		PartDefinition cube_r17 = ForelimbL.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(91, 26).addBox(-1.925F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.0249F, 1.7129F, -1.5708F, 0.0F, 0.4363F, 0.6545F));

		PartDefinition cube_r18 = ForelimbL.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(89, 33).addBox(-1.975F, -0.025F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.3493F, 1.3631F, 1.3884F, 0.0F, -0.4669F, 0.6545F));

		PartDefinition ForelimbL2 = Body1.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2F, 6.6459F, 5.3659F, 0.4388F, -0.0632F, 0.3167F));

		PartDefinition cube_r19 = ForelimbL2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 18).addBox(-15.5F, 0.7F, -0.9F, 10.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(29, 83).addBox(-5.6F, 0.2F, 0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(58, 79).addBox(-3.0F, 0.2F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F))
				.texOffs(42, 74).addBox(-2.025F, 0.2F, 1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8996F, -0.0329F, -2.1116F, 0.0F, 0.0F, -0.6545F));

		PartDefinition cube_r20 = ForelimbL2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(83, 46).addBox(-1.3F, -0.5F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.8848F, 3.1401F, 1.1884F, 0.0F, 0.6109F, -0.6545F));

		PartDefinition cube_r21 = ForelimbL2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(38, 83).addBox(-0.5F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-4.1229F, 3.3227F, -2.3116F, 0.0F, -0.3927F, -0.6545F));

		PartDefinition cube_r22 = ForelimbL2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(91, 62).addBox(-0.075F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-2.0249F, 1.7129F, -1.5708F, 0.0F, -0.4363F, -0.6545F));

		PartDefinition cube_r23 = ForelimbL2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(91, 59).addBox(-0.025F, -0.025F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-2.3493F, 1.3631F, 1.3884F, 0.0F, 0.4669F, -0.6545F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.026F, 3.1368F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r24 = Body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(27, 29).mirror().addBox(-17.9916F, -2.5101F, -0.4852F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 8.2158F, 0.1528F, 0.4786F, -1.2749F));

		PartDefinition cube_r25 = Body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(92, 38).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 8.2158F, 0.3623F, 0.3534F, -0.7668F));

		PartDefinition cube_r26 = Body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(92, 36).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 8.2158F, 0.4741F, 0.1806F, -0.3506F));

		PartDefinition cube_r27 = Body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(93, 18).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6398F, 6.2158F, 0.5075F, 0.1925F, -0.3444F));

		PartDefinition cube_r28 = Body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(93, 16).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6398F, 6.2158F, 0.3894F, 0.3775F, -0.7572F));

		PartDefinition cube_r29 = Body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(27, 27).mirror().addBox(-17.9916F, -2.5101F, -0.4852F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6398F, 6.2158F, 0.1645F, 0.512F, -1.2693F));

		PartDefinition cube_r30 = Body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(91, 6).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5398F, 4.2158F, 0.541F, 0.2042F, -0.3378F));

		PartDefinition cube_r31 = Body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(89, 75).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5398F, 4.2158F, 0.4169F, 0.4014F, -0.7467F));

		PartDefinition cube_r32 = Body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(27, 25).mirror().addBox(-17.9916F, -2.5101F, -0.4852F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5398F, 4.2158F, 0.1766F, 0.5453F, -1.2632F));

		PartDefinition cube_r33 = Body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(33, 17).mirror().addBox(-14.9916F, -2.5101F, -0.4853F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.122F, 0.5412F, -1.2933F));

		PartDefinition cube_r34 = Body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(93, 14).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.3704F, 0.4211F, -0.7672F));

		PartDefinition cube_r35 = Body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(93, 12).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.5092F, 0.2394F, -0.3467F));

		PartDefinition cube_r36 = Body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(93, 10).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.5242F, 0.1984F, -0.3412F));

		PartDefinition cube_r37 = Body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(33, 11).mirror().addBox(-16.9916F, -2.5101F, -0.4853F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.1705F, 0.5287F, -1.2663F));

		PartDefinition cube_r38 = Body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(93, 8).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.4031F, 0.3895F, -0.7521F));

		PartDefinition cube_r39 = Body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(27, 29).addBox(2.9916F, -2.5101F, -0.4852F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 8.2158F, 0.1528F, -0.4786F, 1.2749F));

		PartDefinition cube_r40 = Body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(92, 38).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 8.2158F, 0.3623F, -0.3534F, 0.7668F));

		PartDefinition cube_r41 = Body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(92, 36).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 8.2158F, 0.4741F, -0.1806F, 0.3506F));

		PartDefinition cube_r42 = Body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(93, 18).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6398F, 6.2158F, 0.5075F, -0.1925F, 0.3444F));

		PartDefinition cube_r43 = Body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(93, 16).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6398F, 6.2158F, 0.3894F, -0.3775F, 0.7572F));

		PartDefinition cube_r44 = Body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(27, 27).addBox(2.9916F, -2.5101F, -0.4852F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6398F, 6.2158F, 0.1645F, -0.512F, 1.2693F));

		PartDefinition cube_r45 = Body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(91, 6).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5398F, 4.2158F, 0.541F, -0.2042F, 0.3378F));

		PartDefinition cube_r46 = Body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(89, 75).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5398F, 4.2158F, 0.4169F, -0.4014F, 0.7467F));

		PartDefinition cube_r47 = Body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(27, 25).addBox(2.9916F, -2.5101F, -0.4852F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5398F, 4.2158F, 0.1766F, -0.5453F, 1.2632F));

		PartDefinition cube_r48 = Body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(33, 17).addBox(2.9916F, -2.5101F, -0.4853F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.122F, -0.5412F, 1.2933F));

		PartDefinition cube_r49 = Body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(93, 14).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.3704F, -0.4211F, 0.7672F));

		PartDefinition cube_r50 = Body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(93, 12).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.5092F, -0.2394F, 0.3467F));

		PartDefinition cube_r51 = Body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(93, 10).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.5242F, -0.1984F, 0.3412F));

		PartDefinition cube_r52 = Body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(33, 11).addBox(2.9916F, -2.5101F, -0.4853F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.1705F, -0.5287F, 1.2663F));

		PartDefinition cube_r53 = Body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(93, 8).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.4031F, -0.3895F, 0.7521F));

		PartDefinition cube_r54 = Body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(42, 91).addBox(-1.0F, -3.4626F, -0.0066F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 7.7054F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(67, 99).addBox(-1.0F, -3.0277F, -0.0069F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 5.7054F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(98, 83).addBox(-1.0F, -2.4928F, -0.0072F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 3.7054F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(40, 78).addBox(-0.5F, 2.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 6.4941F, 1.3313F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 25).addBox(-4.5F, -1.9753F, -6.0074F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 13.2548F, 7.9577F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(48, 33).addBox(-1.5F, 0.0247F, -0.0074F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 2.7054F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(64, 99).addBox(-1.0F, -2.2245F, 0.0355F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8557F, 1.7054F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r61 = Body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(102, 44).addBox(-1.0F, -2.05F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3557F, -0.1946F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r62 = Body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(31, 78).addBox(-1.5F, -0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3557F, -0.1946F, 0.2443F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.5F, 4.7181F, 1.5697F));

		PartDefinition cube_r63 = bone2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(80, 0).addBox(-0.1379F, -0.8035F, -0.8714F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.3382F, 1.8487F, -1.7985F, -0.1655F, -0.7312F, -1.3824F));

		PartDefinition cube_r64 = bone2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(80, 72).addBox(-0.5F, -1.2521F, -1.7052F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.6802F, 3.7337F, -0.6379F, 0.8361F, 0.5842F, 0.9814F));

		PartDefinition cube_r65 = bone2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(82, 26).addBox(-0.0924F, -0.8941F, -0.3765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.4F, 2.2761F, -3.5384F, -2.5145F, -0.595F, 2.0434F));

		PartDefinition cube_r66 = bone2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(84, 19).addBox(-0.3924F, -0.8941F, -0.0765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.4F, 2.2761F, -3.5384F, -0.5834F, -0.4904F, -0.4109F));

		PartDefinition cube_r67 = bone2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(35, 91).addBox(-1.025F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.3299F, 4.2034F, 1.8929F, 1.9341F, 0.0759F, 0.138F));

		PartDefinition cube_r68 = bone2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(13, 101).addBox(-1.025F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1759F, 4.9646F, 1.2629F, 0.8869F, 0.0759F, 0.138F));

		PartDefinition cube_r69 = bone2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(22, 74).addBox(-0.5F, -0.7936F, -1.5388F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.6802F, 3.7337F, -0.6379F, 1.1851F, 0.5842F, 0.9814F));

		PartDefinition cube_r70 = bone2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(59, 99).addBox(-0.5F, 0.025F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.0F, 1.8317F, 1.3512F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r71 = bone2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(63, 84).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 1.2867F, -1.0947F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r72 = bone2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(39, 87).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.0F, 1.2867F, -1.0947F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r73 = bone2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(32, 87).addBox(5.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.806F, -0.0175F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r74 = bone2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(25, 87).addBox(5.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.806F, -0.0175F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bone2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(19, 40).addBox(5.5F, -0.4F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0734F, 0.0F, 0.0F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.5F, 4.7181F, 1.5697F));

		PartDefinition cube_r76 = bone3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-3.8621F, -0.8035F, -0.8714F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.3382F, 1.8487F, -1.7985F, -0.1655F, 0.7312F, 1.3824F));

		PartDefinition cube_r77 = bone3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(80, 72).mirror().addBox(-0.5F, -1.2521F, -1.7052F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.6802F, 3.7337F, -0.6379F, 0.8361F, -0.5842F, -0.9814F));

		PartDefinition cube_r78 = bone3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(82, 26).mirror().addBox(-2.9076F, -0.8941F, -0.3765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 2.2761F, -3.5384F, -2.5145F, 0.595F, -2.0434F));

		PartDefinition cube_r79 = bone3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(84, 19).mirror().addBox(-2.6076F, -0.8941F, -0.0765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 2.2761F, -3.5384F, -0.5834F, 0.4904F, 0.4109F));

		PartDefinition cube_r80 = bone3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(35, 91).mirror().addBox(0.025F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.3299F, 4.2034F, 1.8929F, 1.9341F, -0.0759F, -0.138F));

		PartDefinition cube_r81 = bone3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(13, 101).mirror().addBox(0.025F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1759F, 4.9646F, 1.2629F, 0.8869F, -0.0759F, -0.138F));

		PartDefinition cube_r82 = bone3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(22, 74).mirror().addBox(-0.5F, -0.7936F, -1.5388F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.6802F, 3.7337F, -0.6379F, 1.1851F, -0.5842F, -0.9814F));

		PartDefinition cube_r83 = bone3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(59, 99).mirror().addBox(-0.5F, 0.025F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.8317F, 1.3512F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r84 = bone3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(63, 84).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.2867F, -1.0947F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(39, 87).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.2867F, -1.0947F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(32, 87).mirror().addBox(-6.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.806F, -0.0175F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bone3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(25, 87).mirror().addBox(-6.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.806F, -0.0175F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(19, 40).mirror().addBox(-6.5F, -0.4F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0734F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6931F, 9.6655F, 0.0704F, 0.1306F, 0.0092F));

		PartDefinition cube_r89 = Body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(10, 97).addBox(-1.0F, -3.1F, -0.05F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6014F, 5.9278F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r90 = Body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(45, 92).addBox(-1.0F, -3.4368F, 0.0235F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2418F, 3.8854F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r91 = Body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(48, 92).addBox(-1.0F, -3.5301F, 0.1086F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1626F, 1.8399F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r92 = Body3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(71, 95).addBox(-1.0F, -3.5F, 0.05F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 0).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r93 = Body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -2.0F, 0.05F, 9.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 13.7692F, -2.8459F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r94 = Body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(18, 97).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2533F, 6.2503F, 0.251F, 0.2382F, -0.7997F));

		PartDefinition cube_r95 = Body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(96, 75).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2533F, 6.2503F, 0.3282F, 0.1191F, -0.3728F));

		PartDefinition cube_r96 = Body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(33, 19).mirror().addBox(-14.9916F, -2.5101F, -0.4853F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2533F, 6.2503F, 0.1112F, 0.3265F, -1.2915F));

		PartDefinition cube_r97 = Body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(93, 67).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8783F, 4.2503F, 0.2663F, 0.2599F, -0.796F));

		PartDefinition cube_r98 = Body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(93, 65).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8783F, 4.2503F, 0.3508F, 0.1327F, -0.37F));

		PartDefinition cube_r99 = Body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(33, 15).mirror().addBox(-15.9916F, -2.5101F, -0.4852F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8783F, 4.2503F, 0.1141F, 0.3526F, -1.2906F));

		PartDefinition cube_r100 = Body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(33, 13).mirror().addBox(-16.9916F, -2.5101F, -0.4852F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.1174F, 0.3699F, -1.2895F));

		PartDefinition cube_r101 = Body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(27, 31).mirror().addBox(-17.9916F, -2.5101F, -0.4852F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.1227F, 0.3866F, -1.2875F));

		PartDefinition cube_r102 = Body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(65, 93).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.2903F, 0.286F, -0.7895F));

		PartDefinition cube_r103 = Body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(58, 93).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.3829F, 0.147F, -0.3655F));

		PartDefinition cube_r104 = Body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(51, 93).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.2775F, 0.2736F, -0.793F));

		PartDefinition cube_r105 = Body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(93, 20).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.3665F, 0.1407F, -0.3678F));

		PartDefinition cube_r106 = Body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(18, 97).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2533F, 6.2503F, 0.251F, -0.2382F, 0.7997F));

		PartDefinition cube_r107 = Body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(96, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2533F, 6.2503F, 0.3282F, -0.1191F, 0.3728F));

		PartDefinition cube_r108 = Body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(33, 19).addBox(2.9916F, -2.5101F, -0.4853F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2533F, 6.2503F, 0.1112F, -0.3265F, 1.2915F));

		PartDefinition cube_r109 = Body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(93, 67).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8783F, 4.2503F, 0.2663F, -0.2599F, 0.796F));

		PartDefinition cube_r110 = Body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(93, 65).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8783F, 4.2503F, 0.3508F, -0.1327F, 0.37F));

		PartDefinition cube_r111 = Body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(33, 15).addBox(2.9916F, -2.5101F, -0.4852F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8783F, 4.2503F, 0.1141F, -0.3526F, 1.2906F));

		PartDefinition cube_r112 = Body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(33, 13).addBox(2.9916F, -2.5101F, -0.4852F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.1174F, -0.3699F, 1.2895F));

		PartDefinition cube_r113 = Body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(27, 31).addBox(2.9916F, -2.5101F, -0.4852F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.1227F, -0.3866F, 1.2875F));

		PartDefinition cube_r114 = Body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(65, 93).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.2903F, -0.286F, 0.7895F));

		PartDefinition cube_r115 = Body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(58, 93).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.3829F, -0.147F, 0.3655F));

		PartDefinition cube_r116 = Body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(51, 93).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.2775F, -0.2736F, 0.793F));

		PartDefinition cube_r117 = Body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(93, 20).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.3665F, -0.1407F, 0.3678F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, -0.1532F, 0.1229F, -0.0629F));

		PartDefinition cube_r118 = Body10.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(70, 101).addBox(-1.0F, -2.2F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5823F, 5.8297F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Body10.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(85, 99).addBox(-1.0F, -2.4F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2007F, 3.8664F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r120 = Body10.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(82, 99).addBox(-1.0F, -2.7F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1809F, 1.9032F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r121 = Body10.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(79, 99).addBox(-1.0F, -2.8F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r122 = Body10.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(19, 44).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r123 = Body10.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(97, 40).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.3291F, 0.3348F, -0.83F));

		PartDefinition cube_r124 = Body10.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(32, 97).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.4373F, 0.1763F, -0.4091F));

		PartDefinition cube_r125 = Body10.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(55, 50).mirror().addBox(-9.9916F, -2.5101F, -0.4852F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.1324F, 0.4471F, -1.3359F));

		PartDefinition cube_r126 = Body10.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(12, 95).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.3147F, 0.312F, -0.8347F));

		PartDefinition cube_r127 = Body10.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(5, 95).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.4153F, 0.1611F, -0.4129F));

		PartDefinition cube_r128 = Body10.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(54, 8).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.1314F, 0.4206F, -1.3364F));

		PartDefinition cube_r129 = Body10.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(33, 23).mirror().addBox(-12.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.1388F, 0.4369F, -1.2811F));

		PartDefinition cube_r130 = Body10.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(33, 21).mirror().addBox(-13.9916F, -2.5101F, -0.4852F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.1388F, 0.4369F, -1.2811F));

		PartDefinition cube_r131 = Body10.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(91, 94).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.3292F, 0.323F, -0.7778F));

		PartDefinition cube_r132 = Body10.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(94, 81).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.4325F, 0.1655F, -0.3578F));

		PartDefinition cube_r133 = Body10.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(94, 31).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.3292F, 0.323F, -0.7778F));

		PartDefinition cube_r134 = Body10.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(94, 29).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.4325F, 0.1655F, -0.3578F));

		PartDefinition cube_r135 = Body10.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(97, 40).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.3291F, -0.3348F, 0.83F));

		PartDefinition cube_r136 = Body10.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(32, 97).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.4373F, -0.1763F, 0.4091F));

		PartDefinition cube_r137 = Body10.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(55, 50).addBox(2.9916F, -2.5101F, -0.4852F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.1324F, -0.4471F, 1.3359F));

		PartDefinition cube_r138 = Body10.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(12, 95).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.3147F, -0.312F, 0.8347F));

		PartDefinition cube_r139 = Body10.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(5, 95).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.4153F, -0.1611F, 0.4129F));

		PartDefinition cube_r140 = Body10.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(54, 8).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.1314F, -0.4206F, 1.3364F));

		PartDefinition cube_r141 = Body10.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(33, 23).addBox(2.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.1388F, -0.4369F, 1.2811F));

		PartDefinition cube_r142 = Body10.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(33, 21).addBox(2.9916F, -2.5101F, -0.4852F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.1388F, -0.4369F, 1.2811F));

		PartDefinition cube_r143 = Body10.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(91, 94).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.3292F, -0.323F, 0.7778F));

		PartDefinition cube_r144 = Body10.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(94, 81).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.4325F, -0.1655F, 0.3578F));

		PartDefinition cube_r145 = Body10.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(94, 31).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.3292F, -0.323F, 0.7778F));

		PartDefinition cube_r146 = Body10.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(94, 29).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.4325F, -0.1655F, 0.3578F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4644F, 7.7689F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition cube_r147 = Body11.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(103, 21).addBox(-1.0F, -1.8F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5823F, 5.8297F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Body11.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(102, 92).addBox(-1.0F, -1.9F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2007F, 3.8664F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r149 = Body11.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(10, 103).addBox(-1.0F, -2.0F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1809F, 1.9032F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r150 = Body11.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(101, 102).addBox(-1.0F, -2.0F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r151 = Body11.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 34).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r152 = Body11.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(78, 34).mirror().addBox(-5.8126F, -0.8451F, -0.4853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.364F, 0.3756F, -1.0272F));

		PartDefinition cube_r153 = Body11.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(97, 42).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.4847F, 0.2003F, -0.6096F));

		PartDefinition cube_r154 = Body11.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(96, 57).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.3271F, 0.3249F, -0.8308F));

		PartDefinition cube_r155 = Body11.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(96, 33).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.4315F, 0.168F, -0.4102F));

		PartDefinition cube_r156 = Body11.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(85, 82).mirror().addBox(-5.9916F, -2.5101F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.1359F, 0.4376F, -1.3346F));

		PartDefinition cube_r157 = Body11.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(69, 6).mirror().addBox(-7.9916F, -2.5101F, -0.4853F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.1388F, 0.4369F, -1.2811F));

		PartDefinition cube_r158 = Body11.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(62, 15).mirror().addBox(-8.9916F, -2.5101F, -0.4853F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.1443F, 0.4536F, -1.2787F));

		PartDefinition cube_r159 = Body11.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(33, 95).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.3424F, 0.3352F, -0.7736F));

		PartDefinition cube_r160 = Body11.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(26, 95).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.4491F, 0.1716F, -0.355F));

		PartDefinition cube_r161 = Body11.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(96, 4).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.3292F, 0.323F, -0.7778F));

		PartDefinition cube_r162 = Body11.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(19, 95).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.4325F, 0.1655F, -0.3578F));

		PartDefinition cube_r163 = Body11.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(78, 34).addBox(1.8126F, -0.8451F, -0.4853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.364F, -0.3756F, 1.0272F));

		PartDefinition cube_r164 = Body11.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(97, 42).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.4847F, -0.2003F, 0.6096F));

		PartDefinition cube_r165 = Body11.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(96, 57).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.3271F, -0.3249F, 0.8308F));

		PartDefinition cube_r166 = Body11.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(96, 33).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.4315F, -0.168F, 0.4102F));

		PartDefinition cube_r167 = Body11.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(85, 82).addBox(2.9916F, -2.5101F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.1359F, -0.4376F, 1.3346F));

		PartDefinition cube_r168 = Body11.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(69, 6).addBox(2.9916F, -2.5101F, -0.4853F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.1388F, -0.4369F, 1.2811F));

		PartDefinition cube_r169 = Body11.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(62, 15).addBox(2.9916F, -2.5101F, -0.4853F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.1443F, -0.4536F, 1.2787F));

		PartDefinition cube_r170 = Body11.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(33, 95).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.3424F, -0.3352F, 0.7736F));

		PartDefinition cube_r171 = Body11.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(26, 95).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.4491F, -0.1716F, 0.355F));

		PartDefinition cube_r172 = Body11.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(96, 4).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.3292F, -0.323F, 0.7778F));

		PartDefinition cube_r173 = Body11.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(19, 95).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.4325F, -0.1655F, 0.3578F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3906F, 7.6977F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r174 = Body4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(67, 79).addBox(-1.5F, -1.0354F, 0.0444F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 1.3988F, 3.7216F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Body4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(84, 93).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0147F, 5.832F, 0.4679F, 0.4555F, -0.9183F));

		PartDefinition cube_r176 = Body4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(93, 69).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0147F, 4.232F, 0.5493F, 0.3489F, -0.7112F));

		PartDefinition cube_r177 = Body4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(22, 66).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5147F, 2.332F, 0.5623F, 0.3258F, -0.672F));

		PartDefinition cube_r178 = Body4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(86, 13).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1147F, 0.332F, 0.2624F, 0.443F, -1.0295F));

		PartDefinition cube_r179 = Body4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(77, 15).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1147F, 0.332F, 0.4263F, 0.3004F, -0.5858F));

		PartDefinition cube_r180 = Body4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(84, 93).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0147F, 5.832F, 0.4679F, -0.4555F, 0.9183F));

		PartDefinition cube_r181 = Body4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(93, 69).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0147F, 4.232F, 0.5493F, -0.3489F, 0.7112F));

		PartDefinition cube_r182 = Body4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(22, 66).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5147F, 2.332F, 0.5623F, -0.3258F, 0.672F));

		PartDefinition cube_r183 = Body4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(49, 102).addBox(0.0F, -1.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3273F, 6.3392F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r184 = Body4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(73, 102).addBox(0.0F, -1.6F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1079F, 4.5526F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r185 = Body4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(86, 13).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1147F, 0.332F, 0.2624F, -0.443F, 1.0295F));

		PartDefinition cube_r186 = Body4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(77, 15).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1147F, 0.332F, 0.4263F, -0.3004F, 0.5858F));

		PartDefinition cube_r187 = Body4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(46, 102).addBox(-1.0F, -1.9648F, 2.1356F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 36).addBox(-1.5F, -0.0648F, 0.1356F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4012F, -0.0784F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r188 = Body4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(14, 87).addBox(-1.0F, -1.8648F, 0.0357F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3804F, 0.0194F, -0.3403F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 4.3867F, 2.5441F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r189 = bone.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(98, 26).addBox(-0.7551F, 0.5655F, -3.3823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.168F, 1.656F, -0.2056F, 0.9617F));

		PartDefinition cube_r190 = bone.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(18, 99).addBox(-0.7551F, -1.7399F, -3.3208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.168F, 2.5723F, -0.2056F, 0.9617F));

		PartDefinition cube_r191 = bone.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(62, 74).addBox(-0.7551F, -0.2767F, -3.3277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.168F, 2.0051F, -0.2056F, 0.9617F));

		PartDefinition cube_r192 = bone.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(60, 89).addBox(-0.7652F, -1.1311F, -3.2124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.368F, 1.5307F, 0.3421F, 0.95F));

		PartDefinition cube_r193 = bone.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(99, 99).addBox(-0.7652F, -0.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 77).addBox(-0.7652F, -1.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 74).addBox(-0.7652F, -0.7952F, -3.1369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.368F, 1.2689F, 0.3421F, 0.95F));

		PartDefinition cube_r194 = bone.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(67, 89).addBox(-0.7652F, -0.4098F, -3.3689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.368F, 0.9983F, 0.3421F, 0.95F));

		PartDefinition cube_r195 = bone.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(49, 79).addBox(-0.6F, 0.05F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1254F, -0.7927F, -0.7252F, 0.4082F, -0.0607F, -0.2118F));

		PartDefinition cube_r196 = bone.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(74, 99).addBox(-0.6F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3245F, -0.0607F, -0.2118F));

		PartDefinition bone4 = Body4.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 4.3867F, 2.5441F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r197 = bone4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(98, 26).mirror().addBox(-0.2449F, 0.5655F, -3.3823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.168F, 1.656F, 0.2056F, -0.9617F));

		PartDefinition cube_r198 = bone4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(18, 99).mirror().addBox(-0.2449F, -1.7399F, -3.3208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.168F, 2.5723F, 0.2056F, -0.9617F));

		PartDefinition cube_r199 = bone4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(62, 74).mirror().addBox(-0.2449F, -0.2767F, -3.3277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.168F, 2.0051F, 0.2056F, -0.9617F));

		PartDefinition cube_r200 = bone4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(60, 89).mirror().addBox(-0.2348F, -1.1311F, -3.2124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.368F, 1.5307F, -0.3421F, -0.95F));

		PartDefinition cube_r201 = bone4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(99, 99).mirror().addBox(-0.2348F, -0.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(99, 77).mirror().addBox(-0.2348F, -1.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 74).mirror().addBox(-0.2348F, -0.7952F, -3.1369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.368F, 1.2689F, -0.3421F, -0.95F));

		PartDefinition cube_r202 = bone4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(67, 89).mirror().addBox(-0.2348F, -0.4098F, -3.3689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.368F, 0.9983F, -0.3421F, -0.95F));

		PartDefinition cube_r203 = bone4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(49, 79).mirror().addBox(-0.4F, 0.05F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1254F, -0.7927F, -0.7252F, 0.4082F, 0.0607F, 0.2118F));

		PartDefinition cube_r204 = bone4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(74, 99).mirror().addBox(-0.4F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3245F, 0.0607F, 0.2118F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3555F, 4.7887F, 2.8511F, 0.508F, -0.7466F, -0.0214F));

		PartDefinition cube_r205 = HindlimbL.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(15, 54).addBox(2.0F, 0.5F, -2.0F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(91, 84).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2391F, -0.3442F, 0.4927F, 0.0F, 0.0F, 0.6109F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3555F, 4.7887F, 2.8511F, 0.508F, 0.7466F, 0.0214F));

		PartDefinition cube_r206 = HindlimbL2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(15, 58).addBox(-7.0F, 0.5F, -2.0F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(91, 87).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2391F, -0.3442F, 0.4927F, 0.0F, 0.0F, -0.6109F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8617F, 6.7871F, 0.0186F, 0.349F, 0.0064F));

		PartDefinition cube_r207 = Body5.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(55, 102).addBox(-1.0F, -1.55F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 102).addBox(-1.0F, -1.55F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 102).addBox(-1.0F, -1.65F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 44).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r208 = Body5.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(98, 102).addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.713F, 1.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r209 = Body5.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(33, 102).addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4129F, 5.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r210 = Body5.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 103).addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.513F, 3.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1222F, 6.7884F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r211 = Body6.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(103, 25).addBox(-1.0F, -1.85F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 102).addBox(-1.0F, -2.05F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 72).addBox(-1.5F, -0.55F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r212 = Body6.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(103, 60).addBox(0.0F, 1.2999F, 1.5175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 32).addBox(0.0F, 0.0998F, -0.4825F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2908F, 0.6101F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body9 = Body6.addOrReplaceChild("Body9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, 4.0F, -0.0176F, 0.1309F, -0.0023F));

		PartDefinition cube_r213 = Body9.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(103, 57).addBox(-1.0F, -1.45F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 102).addBox(-1.0F, -1.75F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 68).addBox(-1.5F, -0.55F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r214 = Body9.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(103, 3).addBox(0.0F, 2.3999F, 3.5175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3907F, -3.3899F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body7 = Body9.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0209F, 4.003F, 0.0043F, -0.1779F, 0.1711F));

		PartDefinition cube_r215 = Body7.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(102, 96).addBox(-1.0F, -0.5162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2595F, 4.0417F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r216 = Body7.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(88, 54).addBox(-1.0F, -0.7162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3119F, 2.0424F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r217 = Body7.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(68, 58).addBox(-1.0F, -0.8162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r218 = Body7.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(32, 61).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0165F, 5.0478F, 0.1385F, -0.2424F, 0.1385F));

		PartDefinition cube_r219 = Body8.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(0, 44).addBox(-1.5F, -0.4F, -0.0874F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 9.2692F, 4.7703F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r220 = Body8.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(27, 33).addBox(-1.5F, -0.3397F, -0.0307F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0692F, 1.3703F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r221 = Body8.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(28, 91).addBox(-1.5F, -0.0739F, 0.0534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -0.2808F, -0.1047F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head = Ophthalmosaurus.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 1.0848F, -19.2102F, -0.197F, -0.4834F, -0.0397F));

		PartDefinition cube_r222 = Head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(84, 15).addBox(-1.0F, 0.0169F, -1.9531F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0536F, -0.5639F, -7.844F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r223 = Head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(55, 44).addBox(-2.5F, -0.0257F, -1.9874F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, -1.7926F, 0.6041F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r224 = Head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 62).addBox(-3.0F, -0.0257F, 0.0126F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4464F, -2.493F, -1.2692F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r225 = Head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(72, 48).addBox(-2.5F, -0.0257F, 0.0126F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -2.6235F, -2.2607F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r226 = Head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(33, 68).addBox(-2.5F, -1.3257F, -0.2874F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -1.2726F, -2.8565F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r227 = Head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(73, 17).addBox(-2.0F, -0.0181F, -2.0294F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4464F, -1.5848F, -6.0626F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r228 = Head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(68, 52).addBox(-2.5F, -0.0181F, -1.0294F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4464F, -1.9916F, -5.149F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r229 = Head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(44, 68).addBox(-1.5F, -0.0181F, -1.0294F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5536F, -2.3171F, -4.2035F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r230 = Head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(22, 68).addBox(-1.5F, -0.0181F, -1.0294F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5536F, -2.559F, -3.2332F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r231 = Head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(11, 72).addBox(-1.0F, -0.5F, -1.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, 0.7819F, -8.6335F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r232 = Head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(15, 62).addBox(-3.5F, -0.9834F, -0.0109F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9464F, 2.0168F, -0.4106F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r233 = Head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(71, 64).addBox(-3.5F, -1.0113F, 0.0182F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9464F, 2.8677F, -0.9318F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r234 = Head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(65, 31).addBox(-3.0F, -2.0414F, 0.0231F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9464F, 3.1393F, -2.9013F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r235 = Head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(64, 10).addBox(-2.0F, -2.0414F, 0.0231F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0536F, 3.0346F, -4.8986F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r236 = Head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(45, 61).addBox(-2.5F, -4.0414F, -1.9769F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4464F, 3.0346F, -4.8986F, -0.192F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4464F, 0.454F, -6.2482F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(91, 54).addBox(-0.5F, -1.375F, -0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.1253F, 6.1179F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(98, 22).addBox(-0.3569F, -1.6397F, 0.868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 44).addBox(-0.3569F, -1.6397F, 0.268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(39, 97).addBox(-0.3569F, -1.6397F, -0.332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5039F, 1.7886F, -3.7168F, -0.0717F, 0.2614F, -0.0094F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(56, 95).addBox(-0.3569F, -1.6397F, 0.868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 59).addBox(-0.3569F, -1.6397F, 0.268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(44, 98).addBox(-0.3569F, -1.6397F, -0.332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.8716F, 1.6632F, -5.4794F, -0.0706F, 0.1917F, -0.0043F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(13, 97).addBox(-0.6569F, -1.5397F, 1.468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.8231F, 1.4962F, -7.8918F, -0.0697F, 0.1047F, 0.0018F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(101, 51).addBox(-0.6569F, -0.6674F, 0.877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(28, 102).addBox(-0.6569F, -0.3674F, 0.877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(38, 101).addBox(-0.6569F, -0.6674F, 0.277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(23, 102).addBox(-0.6569F, -0.3674F, 0.277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(18, 102).addBox(-0.6569F, -0.3674F, -0.323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(101, 29).addBox(-0.6569F, -0.6674F, -0.323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7981F, 1.4962F, -7.8918F, 0.0176F, 0.1047F, 0.0018F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(101, 0).addBox(-0.6193F, -0.315F, 2.0913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 12).addBox(-0.6193F, -0.615F, 2.0913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 9).addBox(-0.6193F, -0.265F, 1.4913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(93, 100).addBox(-0.6193F, -0.565F, 1.4913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(88, 100).addBox(-0.6193F, -0.24F, 0.8913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 6).addBox(-0.6193F, -0.54F, 0.8913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 101).addBox(-0.6193F, -0.265F, -0.3087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 15).addBox(-0.6193F, -0.565F, -0.3087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 100).addBox(-0.6193F, -0.54F, 0.2913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 48).addBox(-0.6193F, -0.24F, 0.2913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0981F, 1.4962F, -10.8918F, 0.0176F, 0.0872F, 0.0018F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(100, 66).addBox(-0.5F, -0.725F, 1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 63).addBox(-0.5F, -0.425F, 1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(54, 99).addBox(-0.5F, -0.5F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(49, 99).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(99, 35).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(33, 99).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(28, 99).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(23, 99).addBox(-0.5F, -0.5F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.2981F, 1.6962F, -13.1918F, 0.0175F, 0.0349F, 0.0018F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(7, 91).addBox(-0.5F, 0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1481F, 0.1309F, 0.0034F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(78, 29).addBox(-1.0816F, -1.0901F, -0.233F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 1.2101F, -4.028F, -0.0969F, 0.2111F, 0.0235F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(7, 87).addBox(-0.375F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3575F, 0.022F, -2.1173F, 0.2086F, 0.2111F, 0.0235F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(90, 41).addBox(-1.0F, -2.3474F, -4.0034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(84, 89).addBox(-1.0F, -2.7724F, -4.0034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.025F, -2.1544F, 4.8394F, 1.7802F, 0.1004F, 0.0F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(51, 95).addBox(-1.0F, -0.8297F, -0.9525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.1544F, 4.8394F, -0.1309F, 0.1004F, 0.0F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(91, 0).addBox(-1.0F, -1.0128F, -1.7643F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.1544F, 4.8394F, 0.0785F, 0.1004F, 0.0F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(18, 86).addBox(-0.95F, -3.4519F, -3.0604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(73, 22).addBox(-0.975F, -3.9519F, -3.5604F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.025F, -2.1544F, 4.8394F, 1.6057F, 0.1004F, 0.0F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(86, 66).addBox(-1.0F, 4.0959F, -0.3541F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.025F, -2.1544F, 4.8394F, -1.1432F, 0.1004F, 0.0F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(19, 34).addBox(-1.0F, -4.1447F, -4.7293F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.025F, -2.1544F, 4.8394F, 1.4137F, 0.1004F, 0.0F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(95, 49).addBox(-1.0F, 0.3741F, -3.4897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.025F, -2.1544F, 4.8394F, 0.8639F, 0.1004F, 0.0F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(86, 8).addBox(-1.0F, 1.3046F, -1.0437F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.025F, -2.1544F, 4.8394F, -0.2269F, 0.1004F, 0.0F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(85, 77).addBox(-1.0F, 0.5202F, -0.4684F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.025F, -2.1544F, 4.8394F, -0.8378F, 0.1004F, 0.0F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(85, 36).addBox(-1.0F, 0.6932F, 0.0974F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.025F, -2.1544F, 4.8394F, -1.7104F, 0.1004F, 0.0F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 87).addBox(-1.0F, 2.262F, -1.4649F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.025F, -2.1544F, 4.8394F, -1.0996F, 0.1004F, 0.0F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(84, 84).addBox(-1.0F, 3.2436F, -3.1289F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.025F, -2.1544F, 4.8394F, -0.6632F, 0.1004F, 0.0F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(79, 89).addBox(-1.0F, -1.8053F, -4.3279F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -2.1544F, 4.8394F, 0.4189F, 0.1004F, 0.0F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(74, 89).addBox(-1.0F, -1.511F, -3.4711F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -2.1544F, 4.8394F, 0.3316F, 0.1004F, 0.0F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(84, 61).addBox(-1.0F, 2.8698F, -3.2141F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -2.1544F, 4.8394F, -0.0524F, 0.1004F, 0.0F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(32, 54).addBox(-1.0F, -1.2925F, -2.5919F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -2.1544F, 4.8394F, 0.2443F, 0.1004F, 0.0F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(77, 84).addBox(-1.0F, -0.0181F, -2.0294F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -2.0388F, 0.1856F, 0.5503F, 0.0835F, 0.0308F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(47, 84).addBox(-2.0F, 0.0169F, 0.2469F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.2204F, -3.4299F, 0.4224F, 0.3586F, 0.1637F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(82, 3).addBox(-1.0F, 0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, 0.266F, -5.9654F, 0.2053F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(82, 3).addBox(-1.0F, 0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, 0.266F, -5.9654F, 0.2053F, 0.2094F, 0.0433F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0816F, -1.0901F, 0.067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.2101F, -4.028F, 0.2522F, 0.2111F, 0.0235F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(77, 67).addBox(-1.025F, -0.7756F, -0.2061F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7661F, 1.3413F, -8.3945F, 0.1224F, 0.1045F, 0.0082F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(71, 58).addBox(-0.575F, -0.9F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, 0.8619F, -3.9101F, 0.1739F, 0.1744F, -0.0077F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(60, 24).addBox(-0.7F, -0.675F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.175F, 1.7368F, -15.3984F, 0.0524F, 0.0349F, 0.0018F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(60, 17).addBox(-0.5F, -0.325F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.375F, 0.9548F, -11.05F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(11, 77).addBox(-0.5F, -0.25F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.375F, 0.9797F, -11.0478F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(71, 74).addBox(-0.825F, -0.75F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9919F, 1.478F, -11.0023F, 0.0525F, 0.0828F, 0.0043F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(77, 10).addBox(-0.875F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7661F, 1.3413F, -8.3945F, 0.0526F, 0.1045F, 0.0082F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(89, 71).addBox(-1.0F, -1.0414F, -1.9769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.199F, -0.6136F, -0.2902F, 0.1158F, -0.0389F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(56, 84).addBox(-1.0F, 2.5803F, -2.0481F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -2.1544F, 4.8394F, 0.1222F, 0.1004F, 0.0F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(76, 36).addBox(-0.5F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.375F, 0.3869F, -5.934F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(87, 29).addBox(-0.9678F, -0.9295F, -0.0338F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.2101F, -4.028F, -0.224F, 0.2368F, -0.0689F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(70, 42).addBox(-0.475F, -0.4F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, 0.8619F, -3.9101F, -0.0443F, 0.1744F, -0.0077F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(70, 84).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2009F, 0.1309F, 0.0034F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.5536F, 0.454F, -6.2482F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(91, 54).mirror().addBox(-0.5F, -1.375F, -0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1253F, 6.1179F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(98, 22).mirror().addBox(-0.6431F, -1.6397F, 0.868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(97, 44).mirror().addBox(-0.6431F, -1.6397F, 0.268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(39, 97).mirror().addBox(-0.6431F, -1.6397F, -0.332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.5039F, 1.7886F, -3.7168F, -0.0717F, -0.2614F, 0.0094F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(56, 95).mirror().addBox(-0.6431F, -1.6397F, 0.868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(98, 59).mirror().addBox(-0.6431F, -1.6397F, 0.268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(44, 98).mirror().addBox(-0.6431F, -1.6397F, -0.332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.8716F, 1.6632F, -5.4794F, -0.0706F, -0.1917F, 0.0043F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(13, 97).mirror().addBox(-0.3431F, -1.5397F, 1.468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.8231F, 1.4962F, -7.8918F, -0.0697F, -0.1047F, -0.0018F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(101, 51).mirror().addBox(-0.3431F, -0.6674F, 0.877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(28, 102).mirror().addBox(-0.3431F, -0.3674F, 0.877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(38, 101).mirror().addBox(-0.3431F, -0.6674F, 0.277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(23, 102).mirror().addBox(-0.3431F, -0.3674F, 0.277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(18, 102).mirror().addBox(-0.3431F, -0.3674F, -0.323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(101, 29).mirror().addBox(-0.3431F, -0.6674F, -0.323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.7981F, 1.4962F, -7.8918F, 0.0176F, -0.1047F, -0.0018F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-0.3806F, -0.315F, 2.0913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(100, 12).mirror().addBox(-0.3806F, -0.615F, 2.0913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(100, 9).mirror().addBox(-0.3806F, -0.265F, 1.4913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(93, 100).mirror().addBox(-0.3806F, -0.565F, 1.4913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(88, 100).mirror().addBox(-0.3806F, -0.24F, 0.8913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(100, 6).mirror().addBox(-0.3806F, -0.54F, 0.8913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(5, 101).mirror().addBox(-0.3806F, -0.265F, -0.3087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(100, 15).mirror().addBox(-0.3806F, -0.565F, -0.3087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 100).mirror().addBox(-0.3806F, -0.54F, 0.2913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(100, 48).mirror().addBox(-0.3806F, -0.24F, 0.2913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0981F, 1.4962F, -10.8918F, 0.0176F, -0.0872F, -0.0018F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(100, 66).mirror().addBox(-0.5F, -0.725F, 1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(100, 63).mirror().addBox(-0.5F, -0.425F, 1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(54, 99).mirror().addBox(-0.5F, -0.5F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(49, 99).mirror().addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(99, 35).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(33, 99).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(28, 99).mirror().addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(23, 99).mirror().addBox(-0.5F, -0.5F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.2981F, 1.6962F, -13.1918F, 0.0175F, -0.0349F, -0.0018F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(7, 91).mirror().addBox(-0.5F, 0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1481F, -0.1309F, -0.0034F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(78, 29).mirror().addBox(0.0816F, -1.0901F, -0.233F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.2101F, -4.028F, -0.0969F, -0.2111F, -0.0235F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(7, 87).mirror().addBox(-0.625F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3575F, 0.022F, -2.1173F, 0.2086F, -0.2111F, -0.0235F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(90, 41).mirror().addBox(0.0F, -2.3474F, -4.0034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(84, 89).mirror().addBox(0.0F, -2.7724F, -4.0034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -2.1544F, 4.8394F, 1.7802F, -0.1004F, 0.0F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(51, 95).mirror().addBox(0.0F, -0.8297F, -0.9525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1544F, 4.8394F, -0.1309F, -0.1004F, 0.0F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(0.0F, -1.0128F, -1.7643F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1544F, 4.8394F, 0.0785F, -0.1004F, 0.0F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(18, 86).mirror().addBox(-0.05F, -3.4519F, -3.0604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(73, 22).mirror().addBox(-0.025F, -3.9519F, -3.5604F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -2.1544F, 4.8394F, 1.6057F, -0.1004F, 0.0F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(86, 66).mirror().addBox(0.0F, 4.0959F, -0.3541F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -2.1544F, 4.8394F, -1.1432F, -0.1004F, 0.0F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(19, 34).mirror().addBox(0.0F, -4.1447F, -4.7293F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -2.1544F, 4.8394F, 1.4137F, -0.1004F, 0.0F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(95, 49).mirror().addBox(0.0F, 0.3741F, -3.4897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -2.1544F, 4.8394F, 0.8639F, -0.1004F, 0.0F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(86, 8).mirror().addBox(0.0F, 1.3046F, -1.0437F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -2.1544F, 4.8394F, -0.2269F, -0.1004F, 0.0F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(85, 77).mirror().addBox(0.0F, 0.5202F, -0.4684F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -2.1544F, 4.8394F, -0.8378F, -0.1004F, 0.0F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(85, 36).mirror().addBox(0.0F, 0.6932F, 0.0974F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -2.1544F, 4.8394F, -1.7104F, -0.1004F, 0.0F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(0.0F, 2.262F, -1.4649F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -2.1544F, 4.8394F, -1.0996F, -0.1004F, 0.0F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(84, 84).mirror().addBox(0.0F, 3.2436F, -3.1289F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -2.1544F, 4.8394F, -0.6632F, -0.1004F, 0.0F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(79, 89).mirror().addBox(0.0F, -1.8053F, -4.3279F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1544F, 4.8394F, 0.4189F, -0.1004F, 0.0F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(74, 89).mirror().addBox(0.0F, -1.511F, -3.4711F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1544F, 4.8394F, 0.3316F, -0.1004F, 0.0F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(84, 61).mirror().addBox(0.0F, 2.8698F, -3.2141F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1544F, 4.8394F, -0.0524F, -0.1004F, 0.0F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(32, 54).mirror().addBox(0.0F, -1.2925F, -2.5919F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1544F, 4.8394F, 0.2443F, -0.1004F, 0.0F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(77, 84).mirror().addBox(0.0F, -0.0181F, -2.0294F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.0388F, 0.1856F, 0.5503F, -0.0835F, -0.0308F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(47, 84).mirror().addBox(0.0F, 0.0169F, 0.2469F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.2204F, -3.4299F, 0.4224F, -0.3586F, -0.1637F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(82, 3).mirror().addBox(0.0F, 0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.266F, -5.9654F, 0.2053F, -0.2094F, -0.0433F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(0.0816F, -1.0901F, 0.067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.2101F, -4.028F, 0.2522F, -0.2111F, -0.0235F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(77, 67).mirror().addBox(0.025F, -0.7756F, -0.2061F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7661F, 1.3413F, -8.3945F, 0.1224F, -0.1045F, -0.0082F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(71, 58).mirror().addBox(-0.425F, -0.9F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.8619F, -3.9101F, 0.1739F, -0.1744F, 0.0077F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(60, 24).mirror().addBox(-0.3F, -0.675F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.175F, 1.7368F, -15.3984F, 0.0524F, -0.0349F, -0.0018F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(60, 17).mirror().addBox(-0.5F, -0.325F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.375F, 0.9548F, -11.05F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(11, 77).mirror().addBox(-0.5F, -0.25F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.375F, 0.9797F, -11.0478F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(71, 74).mirror().addBox(-0.175F, -0.75F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9919F, 1.478F, -11.0023F, 0.0525F, -0.0828F, -0.0043F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(77, 10).mirror().addBox(-0.125F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7661F, 1.3413F, -8.3945F, 0.0526F, -0.1045F, -0.0082F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(89, 71).mirror().addBox(0.0F, -1.0414F, -1.9769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.199F, -0.6136F, -0.2902F, -0.1158F, 0.0389F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(56, 84).mirror().addBox(0.0F, 2.5803F, -2.0481F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1544F, 4.8394F, 0.1222F, -0.1004F, 0.0F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(76, 36).mirror().addBox(-0.5F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.375F, 0.3869F, -5.934F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(87, 29).mirror().addBox(-0.0322F, -0.9295F, -0.0338F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.2101F, -4.028F, -0.224F, -0.2368F, 0.0689F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(70, 42).mirror().addBox(-0.525F, -0.4F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.8619F, -3.9101F, -0.0443F, -0.1744F, 0.0077F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(70, 84).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2009F, -0.1309F, -0.0034F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(38, 53).addBox(-0.4474F, 0.7768F, -22.0176F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.0536F, 1.7624F, 0.3126F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r324 = Jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(53, 53).mirror().addBox(-0.6117F, -0.188F, -0.0812F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(0.0674F, 0.9448F, -21.8911F, -0.1046F, 0.0F, 0.0F));

		PartDefinition cube_r325 = Jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(53, 53).mirror().addBox(-0.8117F, -0.188F, -5.6812F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5301F, -16.3186F, -0.1047F, -0.048F, 0.0F));

		PartDefinition cube_r326 = Jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(38, 53).mirror().addBox(-0.8117F, -0.7533F, -5.7052F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5301F, -16.3186F, 0.0F, -0.048F, 0.0F));

		PartDefinition cube_r327 = Jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(53, 89).mirror().addBox(-0.1001F, -0.6783F, -2.1369F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.5301F, -6.6186F, 0.0F, -0.1353F, 0.0F));

		PartDefinition cube_r328 = Jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(88, 50).mirror().addBox(-0.1001F, 0.1054F, -2.0969F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.5301F, -6.6186F, -0.0524F, -0.1353F, 0.0F));

		PartDefinition cube_r329 = Jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(76, 79).mirror().addBox(-0.1F, -0.0261F, -4.4854F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)).mirror(false)
				.texOffs(58, 61).mirror().addBox(-0.1F, -0.6261F, -5.9854F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 1.5301F, -0.9186F, -0.0087F, -0.1222F, 0.0F));

		PartDefinition cube_r330 = Jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(46, 88).mirror().addBox(-0.1F, 0.4112F, -5.9317F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 1.5301F, -0.9186F, -0.0524F, -0.1222F, 0.0F));

		PartDefinition cube_r331 = Jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-0.1001F, 0.1022F, -5.989F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.5301F, -6.6186F, -0.0436F, -0.1353F, 0.0F));

		PartDefinition cube_r332 = Jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(5, 97).mirror().addBox(-0.1001F, -1.3182F, -2.4513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(94, 96).mirror().addBox(-0.1001F, -1.3182F, -3.0513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(96, 53).mirror().addBox(-0.1001F, -1.4182F, -3.6513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(96, 0).mirror().addBox(-0.1001F, -1.4182F, -4.2513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(96, 90).mirror().addBox(-0.1001F, -1.5182F, -4.8513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(89, 96).mirror().addBox(-0.1001F, -1.5182F, -5.4513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(96, 71).mirror().addBox(-0.1001F, -1.4933F, -6.0513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.95F, 1.5301F, -6.6186F, 0.0262F, -0.1353F, 0.0F));

		PartDefinition cube_r333 = Jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(101, 89).mirror().addBox(-0.8117F, -1.1352F, -5.6981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(101, 86).mirror().addBox(-0.8117F, -1.1352F, -5.0981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(101, 83).mirror().addBox(-0.8117F, -1.1352F, -4.4981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(101, 80).mirror().addBox(-0.8117F, -1.1352F, -3.8981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(101, 72).mirror().addBox(-0.8117F, -1.1352F, -3.2981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(101, 69).mirror().addBox(-0.8117F, -1.1352F, -2.6981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(101, 54).mirror().addBox(-0.8117F, -1.1352F, -2.0981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 96).mirror().addBox(-0.8117F, -1.1602F, -1.4981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(84, 95).mirror().addBox(-0.8117F, -1.1602F, -0.8981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5301F, -16.3186F, 0.0262F, -0.048F, 0.0F));

		PartDefinition cube_r334 = Jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(92, 45).mirror().addBox(-1.0025F, -1.2618F, -4.1771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(79, 95).mirror().addBox(-1.0025F, -1.2868F, -3.5771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(74, 95).mirror().addBox(-1.0025F, -1.2868F, -2.9771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(66, 95).mirror().addBox(-1.0025F, -1.3368F, -2.3771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 92).mirror().addBox(-1.0025F, -1.3368F, -1.7771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(91, 90).mirror().addBox(-1.0025F, -1.3368F, -1.1771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(61, 95).mirror().addBox(-1.0025F, -1.3368F, -0.5771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 1.5301F, -12.4186F, 0.0262F, -0.1004F, 0.0F));

		PartDefinition cube_r335 = Jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(66, 68).mirror().addBox(-0.1001F, -0.7183F, -6.0513F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.5301F, -6.6186F, 0.0262F, -0.1353F, 0.0F));

		PartDefinition cube_r336 = Jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(11, 66).mirror().addBox(-1.0025F, -0.1438F, -3.8755F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5301F, -12.4186F, -0.0873F, -0.1004F, 0.0F));

		PartDefinition cube_r337 = Jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-1.0025F, -0.5474F, -3.9284F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5301F, -12.4186F, 0.0175F, -0.1004F, 0.0F));

		PartDefinition cube_r338 = Jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(20, 81).mirror().addBox(-0.1F, -0.4465F, -2.717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 1.5301F, -0.9186F, 0.2967F, -0.1222F, 0.0F));

		PartDefinition cube_r339 = Jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(21, 91).mirror().addBox(-0.5F, -0.45F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(21, 91).addBox(3.5F, -0.45F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-2.0F, 1.0617F, 0.2471F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r340 = Jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(100, 18).mirror().addBox(-2.0F, -1.0208F, -0.6151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false)
				.texOffs(100, 18).addBox(2.0F, -1.0208F, -0.6151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-0.5F, 0.4768F, 1.2267F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r341 = Jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(9, 82).mirror().addBox(-2.0F, -0.8F, -2.475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(9, 82).addBox(2.0F, -0.8F, -2.475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-0.5F, 0.5224F, 0.4442F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r342 = Jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(91, 22).mirror().addBox(-0.1F, 0.5143F, -4.3035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 1.5301F, -0.9186F, -0.0698F, -0.1222F, 0.0F));

		PartDefinition cube_r343 = Jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(14, 91).mirror().addBox(-0.1F, -0.3533F, -2.3547F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 1.5301F, -0.9186F, 0.0F, -0.1222F, 0.0F));

		PartDefinition cube_r344 = Jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.8117F, -0.3762F, -5.6958F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5301F, -16.3186F, -0.0698F, -0.048F, 0.0F));

		PartDefinition cube_r345 = Jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(0, 54).addBox(-0.1883F, -0.3762F, -5.6958F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.5301F, -16.3186F, -0.0698F, 0.048F, 0.0F));

		PartDefinition cube_r346 = Jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(53, 53).addBox(-0.1883F, -0.188F, -5.6812F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, 1.5301F, -16.3186F, -0.1047F, 0.048F, 0.0F));

		PartDefinition cube_r347 = Jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(38, 53).addBox(-0.1883F, -0.7533F, -5.7052F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, 1.5301F, -16.3186F, 0.0F, 0.048F, 0.0F));

		PartDefinition cube_r348 = Jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(53, 89).addBox(-0.8999F, -0.6783F, -2.1369F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.7F, 1.5301F, -6.6186F, 0.0F, 0.1353F, 0.0F));

		PartDefinition cube_r349 = Jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(88, 50).addBox(-0.8999F, 0.1054F, -2.0969F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.7F, 1.5301F, -6.6186F, -0.0524F, 0.1353F, 0.0F));

		PartDefinition cube_r350 = Jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(76, 79).addBox(-0.9F, -0.0261F, -4.4854F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F))
				.texOffs(58, 61).addBox(-0.9F, -0.6261F, -5.9854F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(2.4F, 1.5301F, -0.9186F, -0.0087F, 0.1222F, 0.0F));

		PartDefinition cube_r351 = Jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(46, 88).addBox(-0.9F, 0.4112F, -5.9317F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(2.4F, 1.5301F, -0.9186F, -0.0524F, 0.1222F, 0.0F));

		PartDefinition cube_r352 = Jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(69, 0).addBox(-0.8999F, 0.1022F, -5.989F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(1.7F, 1.5301F, -6.6186F, -0.0436F, 0.1353F, 0.0F));

		PartDefinition cube_r353 = Jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(5, 97).addBox(-0.8999F, -1.3182F, -2.4513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(94, 96).addBox(-0.8999F, -1.3182F, -3.0513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(96, 53).addBox(-0.8999F, -1.4182F, -3.6513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(96, 0).addBox(-0.8999F, -1.4182F, -4.2513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(96, 90).addBox(-0.8999F, -1.5182F, -4.8513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(89, 96).addBox(-0.8999F, -1.5182F, -5.4513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(96, 71).addBox(-0.8999F, -1.4933F, -6.0513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.95F, 1.5301F, -6.6186F, 0.0262F, 0.1353F, 0.0F));

		PartDefinition cube_r354 = Jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(101, 89).addBox(-0.1883F, -1.1352F, -5.6981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(101, 86).addBox(-0.1883F, -1.1352F, -5.0981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(101, 83).addBox(-0.1883F, -1.1352F, -4.4981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(101, 80).addBox(-0.1883F, -1.1352F, -3.8981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(101, 72).addBox(-0.1883F, -1.1352F, -3.2981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(101, 69).addBox(-0.1883F, -1.1352F, -2.6981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(101, 54).addBox(-0.1883F, -1.1352F, -2.0981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 96).addBox(-0.1883F, -1.1602F, -1.4981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(84, 95).addBox(-0.1883F, -1.1602F, -0.8981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 1.5301F, -16.3186F, 0.0262F, 0.048F, 0.0F));

		PartDefinition cube_r355 = Jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(92, 45).addBox(0.0025F, -1.2618F, -4.1771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(79, 95).addBox(0.0025F, -1.2868F, -3.5771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(74, 95).addBox(0.0025F, -1.2868F, -2.9771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(66, 95).addBox(0.0025F, -1.3368F, -2.3771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 92).addBox(0.0025F, -1.3368F, -1.7771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(91, 90).addBox(0.0025F, -1.3368F, -1.1771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(61, 95).addBox(0.0025F, -1.3368F, -0.5771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.25F, 1.5301F, -12.4186F, 0.0262F, 0.1004F, 0.0F));

		PartDefinition cube_r356 = Jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(66, 68).addBox(-0.8999F, -0.7183F, -6.0513F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.7F, 1.5301F, -6.6186F, 0.0262F, 0.1353F, 0.0F));

		PartDefinition cube_r357 = Jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(11, 66).addBox(0.0025F, -0.1438F, -3.8755F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 1.5301F, -12.4186F, -0.0873F, 0.1004F, 0.0F));

		PartDefinition cube_r358 = Jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(0, 66).addBox(0.0025F, -0.5474F, -3.9284F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(0.0F, 1.5301F, -12.4186F, 0.0175F, 0.1004F, 0.0F));

		PartDefinition cube_r359 = Jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(20, 81).addBox(-0.9F, -0.4465F, -2.717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.4F, 1.5301F, -0.9186F, 0.2967F, 0.1222F, 0.0F));

		PartDefinition cube_r360 = Jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(91, 22).addBox(-0.9F, 0.5143F, -4.3035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(2.4F, 1.5301F, -0.9186F, -0.0698F, 0.1222F, 0.0F));

		PartDefinition cube_r361 = Jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(14, 91).addBox(-0.9F, -0.3533F, -2.3547F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(2.4F, 1.5301F, -0.9186F, 0.0F, 0.1222F, 0.0F));

		return LayerDefinition.create(meshdefinition, 107, 107);
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