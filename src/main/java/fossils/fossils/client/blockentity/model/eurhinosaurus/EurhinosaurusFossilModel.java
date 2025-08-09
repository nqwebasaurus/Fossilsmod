package fossils.fossils.client.blockentity.model.eurhinosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EurhinosaurusFossilModel extends SkullModelBase {
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

	public EurhinosaurusFossilModel(ModelPart root) {
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

		PartDefinition Ophthalmosaurus = fossil.addOrReplaceChild("Ophthalmosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.6824F, -4.306F, 0.148F, 0.4044F, -0.1482F));

		PartDefinition Body1 = Ophthalmosaurus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0817F, -16.8422F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 107).mirror().addBox(0.0F, -2.241F, 0.0015F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6817F, 1.2672F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 98).mirror().addBox(0.0F, -2.049F, 0.0263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0183F, -0.6328F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(42, 65).mirror().addBox(-0.5F, -0.5F, -4.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4817F, 1.7672F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(33, 104).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2342F, 0.1526F, 0.3313F, -0.5479F, 0.6504F));

		PartDefinition cube_r5 = Body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(100, 17).addBox(1.8126F, -0.8451F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2342F, 0.1526F, 0.0404F, -0.623F, 1.1682F));

		PartDefinition cube_r6 = Body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(90, 77).addBox(2.9916F, -2.5101F, -0.4853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4658F, 1.9526F, 0.0831F, -0.6215F, 1.4278F));

		PartDefinition cube_r7 = Body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(104, 31).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4658F, 1.9526F, 0.3854F, -0.5067F, 0.8735F));

		PartDefinition cube_r8 = Body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(104, 29).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4658F, 1.9526F, 0.5584F, -0.312F, 0.4463F));

		PartDefinition cube_r9 = Body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(33, 104).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2342F, 0.1526F, 0.3313F, 0.5479F, -0.6504F));

		PartDefinition cube_r10 = Body1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(100, 17).mirror().addBox(-4.8126F, -0.8451F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2342F, 0.1526F, 0.0404F, 0.623F, -1.1682F));

		PartDefinition cube_r11 = Body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(90, 77).mirror().addBox(-6.9916F, -2.5101F, -0.4853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4658F, 1.9526F, 0.0831F, 0.6215F, -1.4278F));

		PartDefinition cube_r12 = Body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(104, 31).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4658F, 1.9526F, 0.3854F, 0.5067F, -0.8735F));

		PartDefinition cube_r13 = Body1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(104, 29).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4658F, 1.9526F, 0.5584F, 0.312F, -0.4463F));

		PartDefinition ForelimbL = Body1.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2F, 4.6459F, 5.3659F, 0.1787F, 0.0487F, 0.0799F));

		PartDefinition cube_r14 = ForelimbL.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(45, 25).mirror().addBox(-20.5F, 0.7F, -0.9F, 15.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 96).mirror().addBox(-5.6F, 0.2F, 0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(91, 59).mirror().addBox(-3.0F, 0.2F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(87, 9).mirror().addBox(-2.025F, 0.2F, 1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8996F, -0.0329F, -2.1116F, 0.0F, 0.0F, -0.6545F));

		PartDefinition cube_r15 = ForelimbL.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(96, 19).mirror().addBox(-1.3F, -0.5F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8848F, 3.1401F, 1.1884F, 0.0F, 0.6109F, -0.6545F));

		PartDefinition cube_r16 = ForelimbL.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(93, 5).mirror().addBox(-0.5F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.1229F, 3.3227F, -2.3116F, 0.0F, -0.3927F, -0.6545F));

		PartDefinition cube_r17 = ForelimbL.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(102, 40).mirror().addBox(-0.075F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.0249F, 1.7129F, -1.5708F, 0.0F, -0.4363F, -0.6545F));

		PartDefinition cube_r18 = ForelimbL.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(21, 102).mirror().addBox(-0.025F, -0.025F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.3493F, 1.3631F, 1.3884F, 0.0F, 0.4669F, -0.6545F));

		PartDefinition ForelimbL2 = Body1.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2F, 4.6459F, 5.3659F, 0.1852F, -0.0011F, -0.3374F));

		PartDefinition cube_r19 = ForelimbL2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(45, 32).mirror().addBox(5.5F, 0.7F, -0.9F, 15.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 79).mirror().addBox(3.6F, 0.2F, 0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(94, 49).mirror().addBox(2.0F, 0.2F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(87, 13).mirror().addBox(-0.975F, 0.2F, 1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8996F, -0.0329F, -2.1116F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r20 = ForelimbL2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(83, 96).mirror().addBox(-0.7F, -0.5F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.8848F, 3.1401F, 1.1884F, 0.0F, -0.6109F, 0.6545F));

		PartDefinition cube_r21 = ForelimbL2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(95, 43).mirror().addBox(-1.5F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(4.1229F, 3.3227F, -2.3116F, 0.0F, 0.3927F, 0.6545F));

		PartDefinition cube_r22 = ForelimbL2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(41, 102).mirror().addBox(-1.925F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(2.0249F, 1.7129F, -1.5708F, 0.0F, 0.4363F, 0.6545F));

		PartDefinition cube_r23 = ForelimbL2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(102, 37).mirror().addBox(-1.975F, -0.025F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(2.3493F, 1.3631F, 1.3884F, 0.0F, -0.4669F, 0.6545F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.026F, 3.1368F, 0.1722F, -0.1397F, 0.0601F));

		PartDefinition cube_r24 = Body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(19, 65).addBox(2.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 8.2159F, 0.1528F, -0.4786F, 1.2749F));

		PartDefinition cube_r25 = Body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(105, 11).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 8.2159F, 0.3623F, -0.3534F, 0.7668F));

		PartDefinition cube_r26 = Body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(105, 9).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 8.2159F, 0.4741F, -0.1806F, 0.3506F));

		PartDefinition cube_r27 = Body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(88, 102).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6398F, 6.2159F, 0.5075F, -0.1925F, 0.3444F));

		PartDefinition cube_r28 = Body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(102, 69).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6398F, 6.2159F, 0.3894F, -0.3775F, 0.7572F));

		PartDefinition cube_r29 = Body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(49, 21).addBox(2.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6398F, 6.2159F, 0.1645F, -0.512F, 1.2693F));

		PartDefinition cube_r30 = Body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(105, 2).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5398F, 4.2159F, 0.5242F, -0.1984F, 0.3412F));

		PartDefinition cube_r31 = Body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(105, 0).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5398F, 4.2159F, 0.4031F, -0.3895F, 0.7521F));

		PartDefinition cube_r32 = Body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(49, 23).addBox(2.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5398F, 4.2159F, 0.1705F, -0.5287F, 1.2663F));

		PartDefinition cube_r33 = Body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(76, 7).addBox(2.9916F, -2.5101F, -0.4853F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.122F, -0.5412F, 1.2933F));

		PartDefinition cube_r34 = Body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(98, 104).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.3704F, -0.4211F, 0.7672F));

		PartDefinition cube_r35 = Body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(88, 104).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.5092F, -0.2394F, 0.3467F));

		PartDefinition cube_r36 = Body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(81, 104).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.5242F, -0.1984F, 0.3412F));

		PartDefinition cube_r37 = Body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(19, 69).addBox(2.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.1705F, -0.5287F, 1.2663F));

		PartDefinition cube_r38 = Body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(62, 104).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.4031F, -0.3895F, 0.7521F));

		PartDefinition cube_r39 = Body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(19, 65).mirror().addBox(-12.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 8.2159F, 0.1528F, 0.4786F, -1.2749F));

		PartDefinition cube_r40 = Body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(105, 11).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 8.2159F, 0.3623F, 0.3534F, -0.7668F));

		PartDefinition cube_r41 = Body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(105, 9).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 8.2159F, 0.4741F, 0.1806F, -0.3506F));

		PartDefinition cube_r42 = Body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(88, 102).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6398F, 6.2159F, 0.5075F, 0.1925F, -0.3444F));

		PartDefinition cube_r43 = Body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(102, 69).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6398F, 6.2159F, 0.3894F, 0.3775F, -0.7572F));

		PartDefinition cube_r44 = Body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(49, 21).mirror().addBox(-12.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6398F, 6.2159F, 0.1645F, 0.512F, -1.2693F));

		PartDefinition cube_r45 = Body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(105, 2).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5398F, 4.2159F, 0.5242F, 0.1984F, -0.3412F));

		PartDefinition cube_r46 = Body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(105, 0).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5398F, 4.2159F, 0.4031F, 0.3895F, -0.7521F));

		PartDefinition cube_r47 = Body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(49, 23).mirror().addBox(-12.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5398F, 4.2159F, 0.1705F, 0.5287F, -1.2663F));

		PartDefinition cube_r48 = Body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(76, 7).mirror().addBox(-9.9916F, -2.5101F, -0.4853F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.122F, 0.5412F, -1.2933F));

		PartDefinition cube_r49 = Body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(98, 104).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.3704F, 0.4211F, -0.7672F));

		PartDefinition cube_r50 = Body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(88, 104).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.5092F, 0.2394F, -0.3467F));

		PartDefinition cube_r51 = Body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(81, 104).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.5242F, 0.1984F, -0.3412F));

		PartDefinition cube_r52 = Body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(19, 69).mirror().addBox(-11.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.1705F, 0.5287F, -1.2663F));

		PartDefinition cube_r53 = Body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(62, 104).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.4031F, 0.3895F, -0.7521F));

		PartDefinition cube_r54 = Body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(104, 43).mirror().addBox(1.0F, -3.4626F, -0.0066F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1557F, 7.7054F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(17, 73).mirror().addBox(1.0F, -3.2277F, -0.0069F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1557F, 5.7054F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(1.0F, -2.8927F, -0.0003F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1557F, 3.7054F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(90, 72).mirror().addBox(-0.5F, -0.9598F, -0.0987F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.223F, -0.7055F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-3.5F, -0.4245F, -6.312F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.1663F, 9.5692F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(63, 55).mirror().addBox(0.5F, 0.0247F, -0.0074F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1557F, 2.7054F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(37, 112).mirror().addBox(1.0F, -2.424F, 0.0494F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8557F, 1.7054F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r61 = Body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(107, 61).mirror().addBox(1.0F, -2.3493F, 0.0209F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3557F, -0.1946F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r62 = Body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(91, 64).mirror().addBox(0.5F, -0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3557F, -0.1946F, 0.2443F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5F, 2.72F, 1.657F));

		PartDefinition cube_r63 = bone2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(88, 35).mirror().addBox(-3.8621F, -0.8035F, -0.8714F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.3382F, 1.8488F, -1.7985F, -0.1655F, 0.7312F, 1.3824F));

		PartDefinition cube_r64 = bone2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(65, 91).mirror().addBox(-0.5F, -1.2521F, -1.7052F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.6802F, 3.7337F, -0.6379F, 0.8361F, -0.5842F, -0.9814F));

		PartDefinition cube_r65 = bone2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(34, 97).mirror().addBox(-2.9076F, -0.8941F, -0.3765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 2.2761F, -3.5384F, -2.5145F, 0.595F, -2.0434F));

		PartDefinition cube_r66 = bone2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(96, 87).mirror().addBox(-2.6076F, -0.8941F, -0.0765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 2.2761F, -3.5384F, -0.5834F, 0.4904F, 0.4109F));

		PartDefinition cube_r67 = bone2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(64, 100).mirror().addBox(0.025F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.3299F, 4.2034F, 1.8929F, 1.9341F, -0.0759F, -0.138F));

		PartDefinition cube_r68 = bone2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(108, 112).mirror().addBox(0.025F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1759F, 4.9646F, 1.2629F, 0.8869F, -0.0759F, -0.138F));

		PartDefinition cube_r69 = bone2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(76, 86).mirror().addBox(-0.5F, -0.7936F, -1.5388F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.6802F, 3.7337F, -0.6379F, 1.1851F, -0.5842F, -0.9814F));

		PartDefinition cube_r70 = bone2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(107, 58).mirror().addBox(-0.5F, 0.025F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.8317F, 1.3512F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r71 = bone2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(97, 28).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.2867F, -1.0947F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r72 = bone2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(74, 98).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.2867F, -1.0947F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r73 = bone2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(16, 98).mirror().addBox(-6.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.806F, -0.0175F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r74 = bone2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(98, 13).mirror().addBox(-6.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.806F, -0.0175F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bone2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(98, 9).mirror().addBox(-6.5F, -0.4F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0734F, 0.0F, 0.0F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.5F, 2.72F, 1.657F));

		PartDefinition cube_r76 = bone3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(88, 35).addBox(-0.1379F, -0.8035F, -0.8714F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.3382F, 1.8488F, -1.7985F, -0.1655F, -0.7312F, -1.3824F));

		PartDefinition cube_r77 = bone3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(65, 91).addBox(-0.5F, -1.2521F, -1.7052F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.6802F, 3.7337F, -0.6379F, 0.8361F, 0.5842F, 0.9814F));

		PartDefinition cube_r78 = bone3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(34, 97).addBox(-0.0924F, -0.8941F, -0.3765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.4F, 2.2761F, -3.5384F, -2.5145F, -0.595F, 2.0434F));

		PartDefinition cube_r79 = bone3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(96, 87).addBox(-0.3924F, -0.8941F, -0.0765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.4F, 2.2761F, -3.5384F, -0.5834F, -0.4904F, -0.4109F));

		PartDefinition cube_r80 = bone3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(64, 100).addBox(-1.025F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.3299F, 4.2034F, 1.8929F, 1.9341F, 0.0759F, 0.138F));

		PartDefinition cube_r81 = bone3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(108, 112).addBox(-1.025F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1759F, 4.9646F, 1.2629F, 0.8869F, 0.0759F, 0.138F));

		PartDefinition cube_r82 = bone3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(76, 86).addBox(-0.5F, -0.7936F, -1.5388F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.6802F, 3.7337F, -0.6379F, 1.1851F, 0.5842F, 0.9814F));

		PartDefinition cube_r83 = bone3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(107, 58).addBox(-0.5F, 0.025F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.0F, 1.8317F, 1.3512F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r84 = bone3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(97, 28).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 1.2867F, -1.0947F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(74, 98).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.0F, 1.2867F, -1.0947F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(16, 98).addBox(5.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.806F, -0.0175F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bone3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(98, 13).addBox(5.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.806F, -0.0175F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(98, 9).addBox(5.5F, -0.4F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0734F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6931F, 9.6655F, 0.1144F, -0.1301F, -0.0149F));

		PartDefinition cube_r89 = Body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(37, 106).mirror().addBox(1.0F, -3.1F, -0.05F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6014F, 5.9278F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r90 = Body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(95, 102).mirror().addBox(1.0F, -3.4368F, 0.0235F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2418F, 3.8854F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r91 = Body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(24, 105).mirror().addBox(1.0F, -3.5301F, 0.1086F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1626F, 1.8399F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r92 = Body3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(21, 105).mirror().addBox(1.0F, -3.5F, 0.05F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 55).mirror().addBox(0.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r93 = Body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(45, 39).mirror().addBox(-4.5F, -0.5573F, -0.6524F, 9.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.7852F, -1.2118F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r94 = Body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(103, 90).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.251F, -0.2382F, 0.7997F));

		PartDefinition cube_r95 = Body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(61, 106).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.3282F, -0.1191F, 0.3728F));

		PartDefinition cube_r96 = Body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(26, 79).addBox(2.9916F, -2.5101F, -0.4853F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.1112F, -0.3265F, 1.2915F));

		PartDefinition cube_r97 = Body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(103, 51).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8784F, 4.2503F, 0.2663F, -0.2599F, 0.796F));

		PartDefinition cube_r98 = Body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(103, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8784F, 4.2503F, 0.3508F, -0.1327F, 0.37F));

		PartDefinition cube_r99 = Body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(25, 48).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8784F, 4.2503F, 0.1141F, -0.3526F, 1.2906F));

		PartDefinition cube_r100 = Body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 71).addBox(2.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.1174F, -0.3699F, 1.2895F));

		PartDefinition cube_r101 = Body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(19, 67).addBox(2.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.1174F, -0.3699F, 1.2895F));

		PartDefinition cube_r102 = Body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(105, 19).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.2775F, -0.2736F, 0.793F));

		PartDefinition cube_r103 = Body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(105, 15).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.3665F, -0.1407F, 0.3678F));

		PartDefinition cube_r104 = Body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(14, 105).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.2775F, -0.2736F, 0.793F));

		PartDefinition cube_r105 = Body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(105, 13).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.3665F, -0.1407F, 0.3678F));

		PartDefinition cube_r106 = Body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(103, 90).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.251F, 0.2382F, -0.7997F));

		PartDefinition cube_r107 = Body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(61, 106).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.3282F, 0.1191F, -0.3728F));

		PartDefinition cube_r108 = Body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(26, 79).mirror().addBox(-9.9916F, -2.5101F, -0.4853F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.1112F, 0.3265F, -1.2915F));

		PartDefinition cube_r109 = Body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(103, 51).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8784F, 4.2503F, 0.2663F, 0.2599F, -0.796F));

		PartDefinition cube_r110 = Body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(103, 49).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8784F, 4.2503F, 0.3508F, 0.1327F, -0.37F));

		PartDefinition cube_r111 = Body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(25, 48).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8784F, 4.2503F, 0.1141F, 0.3526F, -1.2906F));

		PartDefinition cube_r112 = Body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-11.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.1174F, 0.3699F, -1.2895F));

		PartDefinition cube_r113 = Body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(19, 67).mirror().addBox(-12.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.1174F, 0.3699F, -1.2895F));

		PartDefinition cube_r114 = Body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(105, 19).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.2775F, 0.2736F, -0.793F));

		PartDefinition cube_r115 = Body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(105, 15).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.3665F, 0.1407F, -0.3678F));

		PartDefinition cube_r116 = Body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(14, 105).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.2775F, 0.2736F, -0.793F));

		PartDefinition cube_r117 = Body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(105, 13).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.3665F, 0.1407F, -0.3678F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, -0.145F, -0.0927F, -0.0304F));

		PartDefinition cube_r118 = Body10.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(3, 108).mirror().addBox(1.0F, -2.2F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5823F, 5.8297F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Body10.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(107, 53).mirror().addBox(1.0F, -2.4F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2007F, 3.8664F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r120 = Body10.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(53, 107).mirror().addBox(1.0F, -2.7F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1809F, 1.9032F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r121 = Body10.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(50, 107).mirror().addBox(1.0F, -2.8F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5626F, -0.0601F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r122 = Body10.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(25, 55).mirror().addBox(0.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r123 = Body10.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(40, 105).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.3291F, -0.3348F, 0.83F));

		PartDefinition cube_r124 = Body10.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(105, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.4373F, -0.1763F, 0.4091F));

		PartDefinition cube_r125 = Body10.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(95, 47).addBox(2.9916F, -2.5101F, -0.4852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.1324F, -0.4471F, 1.3359F));

		PartDefinition cube_r126 = Body10.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(104, 27).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.3147F, -0.312F, 0.8347F));

		PartDefinition cube_r127 = Body10.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(104, 25).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.4153F, -0.1611F, 0.4129F));

		PartDefinition cube_r128 = Body10.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(91, 69).addBox(2.9916F, -2.5101F, -0.4852F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.1314F, -0.4206F, 1.3364F));

		PartDefinition cube_r129 = Body10.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(87, 17).addBox(2.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.1388F, -0.4369F, 1.2811F));

		PartDefinition cube_r130 = Body10.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(80, 47).addBox(2.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.1388F, -0.4369F, 1.2811F));

		PartDefinition cube_r131 = Body10.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(104, 23).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.3292F, -0.323F, 0.7778F));

		PartDefinition cube_r132 = Body10.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 104).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.4325F, -0.1655F, 0.3578F));

		PartDefinition cube_r133 = Body10.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(103, 94).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.3292F, -0.323F, 0.7778F));

		PartDefinition cube_r134 = Body10.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(103, 92).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.4325F, -0.1655F, 0.3578F));

		PartDefinition cube_r135 = Body10.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(40, 105).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.3291F, 0.3348F, -0.83F));

		PartDefinition cube_r136 = Body10.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(105, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.4373F, 0.1763F, -0.4091F));

		PartDefinition cube_r137 = Body10.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(95, 47).mirror().addBox(-5.9916F, -2.5101F, -0.4852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.1324F, 0.4471F, -1.3359F));

		PartDefinition cube_r138 = Body10.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(104, 27).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.3147F, 0.312F, -0.8347F));

		PartDefinition cube_r139 = Body10.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(104, 25).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.4153F, 0.1611F, -0.4129F));

		PartDefinition cube_r140 = Body10.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(91, 69).mirror().addBox(-6.9916F, -2.5101F, -0.4852F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.1314F, 0.4206F, -1.3364F));

		PartDefinition cube_r141 = Body10.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(87, 17).mirror().addBox(-7.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.1388F, 0.4369F, -1.2811F));

		PartDefinition cube_r142 = Body10.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(80, 47).mirror().addBox(-8.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.1388F, 0.4369F, -1.2811F));

		PartDefinition cube_r143 = Body10.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(104, 23).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.3292F, 0.323F, -0.7778F));

		PartDefinition cube_r144 = Body10.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.4325F, 0.1655F, -0.3578F));

		PartDefinition cube_r145 = Body10.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(103, 94).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.3292F, 0.323F, -0.7778F));

		PartDefinition cube_r146 = Body10.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(103, 92).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.4325F, 0.1655F, -0.3578F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4644F, 7.7689F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r147 = Body11.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(29, 113).mirror().addBox(1.0F, -1.8F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5823F, 5.8297F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Body11.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(26, 113).mirror().addBox(1.0F, -1.9F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2007F, 3.8664F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r149 = Body11.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(89, 112).mirror().addBox(1.0F, -2.0F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1809F, 1.9032F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r150 = Body11.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(55, 112).mirror().addBox(1.0F, -2.0F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5625F, -0.0601F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r151 = Body11.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(0.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r152 = Body11.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(105, 104).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.4847F, -0.2003F, 0.6096F));

		PartDefinition cube_r153 = Body11.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(105, 87).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.3271F, -0.3249F, 0.8308F));

		PartDefinition cube_r154 = Body11.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(105, 85).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.4315F, -0.168F, 0.4102F));

		PartDefinition cube_r155 = Body11.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(36, 71).addBox(2.9916F, -2.5101F, -0.4852F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.1388F, -0.4369F, 1.2811F));

		PartDefinition cube_r156 = Body11.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(105, 83).addBox(2.9916F, -2.5101F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.1443F, -0.4536F, 1.2787F));

		PartDefinition cube_r157 = Body11.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(105, 81).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.3424F, -0.3352F, 0.7736F));

		PartDefinition cube_r158 = Body11.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(105, 79).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.4491F, -0.1716F, 0.355F));

		PartDefinition cube_r159 = Body11.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(54, 105).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.3292F, -0.323F, 0.7778F));

		PartDefinition cube_r160 = Body11.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(47, 105).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.4325F, -0.1655F, 0.3578F));

		PartDefinition cube_r161 = Body11.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(105, 104).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.4847F, 0.2003F, -0.6096F));

		PartDefinition cube_r162 = Body11.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(105, 87).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.3271F, 0.3249F, -0.8308F));

		PartDefinition cube_r163 = Body11.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(105, 85).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.4315F, 0.168F, -0.4102F));

		PartDefinition cube_r164 = Body11.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(36, 71).mirror().addBox(-3.9916F, -2.5101F, -0.4852F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.1388F, 0.4369F, -1.2811F));

		PartDefinition cube_r165 = Body11.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(105, 83).mirror().addBox(-4.9916F, -2.5101F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.1443F, 0.4536F, -1.2787F));

		PartDefinition cube_r166 = Body11.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(105, 81).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.3424F, 0.3352F, -0.7736F));

		PartDefinition cube_r167 = Body11.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(105, 79).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.4491F, 0.1716F, -0.355F));

		PartDefinition cube_r168 = Body11.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(54, 105).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.3292F, 0.323F, -0.7778F));

		PartDefinition cube_r169 = Body11.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(47, 105).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.4325F, 0.1655F, -0.3578F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3906F, 7.6977F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r170 = Body4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(51, 73).mirror().addBox(0.5F, -1.0354F, 0.0445F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3988F, 3.7216F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r171 = Body4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(106, 102).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0147F, 5.832F, 0.4679F, -0.4555F, 0.9183F));

		PartDefinition cube_r172 = Body4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(37, 85).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0147F, 4.232F, 0.5493F, -0.3489F, 0.7112F));

		PartDefinition cube_r173 = Body4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(7, 106).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5147F, 2.332F, 0.5623F, -0.3258F, 0.672F));

		PartDefinition cube_r174 = Body4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 106).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1147F, 0.332F, 0.4263F, -0.3004F, 0.5858F));

		PartDefinition cube_r175 = Body4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(106, 102).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0147F, 5.832F, 0.4679F, 0.4555F, -0.9183F));

		PartDefinition cube_r176 = Body4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(37, 85).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0147F, 4.232F, 0.5493F, 0.3489F, -0.7112F));

		PartDefinition cube_r177 = Body4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(7, 106).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5147F, 2.332F, 0.5623F, 0.3258F, -0.672F));

		PartDefinition cube_r178 = Body4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(21, 114).mirror().addBox(0.0F, -1.5F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 113).mirror().addBox(0.0F, -1.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3273F, 6.3392F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r179 = Body4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(43, 113).mirror().addBox(0.0F, -1.6F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.108F, 4.5526F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r180 = Body4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1147F, 0.332F, 0.4263F, 0.3004F, -0.5858F));

		PartDefinition cube_r181 = Body4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(114, 39).mirror().addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8555F, 6.4612F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r182 = Body4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(114, 35).mirror().addBox(0.0F, -0.4663F, -0.5721F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.873F, 8.4611F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r183 = Body4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(40, 113).mirror().addBox(1.0F, -1.9648F, 2.1357F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 66).mirror().addBox(0.5F, -0.0648F, 0.1357F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4012F, -0.0784F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r184 = Body4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(32, 113).mirror().addBox(1.0F, -1.8648F, 0.0357F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3804F, 0.0194F, -0.3403F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 2.5606F, -0.4401F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r185 = bone.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(108, 75).mirror().addBox(-0.2449F, 0.5655F, -3.3823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.168F, 1.656F, 0.2056F, -0.9617F));

		PartDefinition cube_r186 = bone.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(59, 108).mirror().addBox(-0.2449F, -1.7399F, -3.3208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.168F, 2.5723F, 0.2056F, -0.9617F));

		PartDefinition cube_r187 = bone.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(29, 92).mirror().addBox(-0.2449F, -0.2767F, -3.3277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.168F, 2.0051F, 0.2056F, -0.9617F));

		PartDefinition cube_r188 = bone.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(99, 71).mirror().addBox(-0.2348F, -1.1311F, -3.2124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.368F, 1.5307F, -0.3421F, -0.95F));

		PartDefinition cube_r189 = bone.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(6, 108).mirror().addBox(-0.2348F, -0.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(107, 66).mirror().addBox(-0.2348F, -1.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 91).mirror().addBox(-0.2348F, -0.7952F, -3.1369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.368F, 1.2689F, -0.3421F, -0.95F));

		PartDefinition cube_r190 = bone.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(99, 33).mirror().addBox(-0.2348F, -0.4098F, -3.3689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.368F, 0.9983F, -0.3421F, -0.95F));

		PartDefinition cube_r191 = bone.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(88, 25).mirror().addBox(-0.4F, 0.05F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1254F, -0.7927F, -0.7252F, 0.4082F, 0.0607F, 0.2118F));

		PartDefinition cube_r192 = bone.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(45, 107).mirror().addBox(-0.4F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3245F, 0.0607F, 0.2118F));

		PartDefinition bone4 = Body4.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 2.5606F, -0.4401F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r193 = bone4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(108, 75).addBox(-0.7551F, 0.5655F, -3.3823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.168F, 1.656F, -0.2056F, 0.9617F));

		PartDefinition cube_r194 = bone4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(59, 108).addBox(-0.7551F, -1.7399F, -3.3208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.168F, 2.5723F, -0.2056F, 0.9617F));

		PartDefinition cube_r195 = bone4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(29, 92).addBox(-0.7551F, -0.2767F, -3.3277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.168F, 2.0051F, -0.2056F, 0.9617F));

		PartDefinition cube_r196 = bone4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(99, 71).addBox(-0.7652F, -1.1311F, -3.2124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.368F, 1.5307F, 0.3421F, 0.95F));

		PartDefinition cube_r197 = bone4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(6, 108).addBox(-0.7652F, -0.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 66).addBox(-0.7652F, -1.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 91).addBox(-0.7652F, -0.7952F, -3.1369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.368F, 1.2689F, 0.3421F, 0.95F));

		PartDefinition cube_r198 = bone4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(99, 33).addBox(-0.7652F, -0.4098F, -3.3689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.368F, 0.9983F, 0.3421F, 0.95F));

		PartDefinition cube_r199 = bone4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(88, 25).addBox(-0.6F, 0.05F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1254F, -0.7927F, -0.7252F, 0.4082F, -0.0607F, -0.2118F));

		PartDefinition cube_r200 = bone4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(45, 107).addBox(-0.6F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3245F, -0.0607F, -0.2118F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3555F, 3.2626F, -0.1357F, 0.3765F, 0.5988F, 0.2987F));

		PartDefinition cube_r201 = HindlimbL.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(25, 50).mirror().addBox(-11.0F, 0.5F, -2.0F, 9.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 66).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2391F, -0.3442F, 0.4927F, 0.0F, 0.0F, -0.6109F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3555F, 3.2626F, -0.1357F, 0.3765F, -0.5988F, -0.2987F));

		PartDefinition cube_r202 = HindlimbL2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(52, 50).mirror().addBox(2.0F, 0.5F, -2.0F, 9.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 102).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2391F, -0.3442F, 0.4927F, 0.0F, 0.0F, 0.6109F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0018F, 8.7898F, 0.0174F, 0.0015F, -0.0873F));

		PartDefinition cube_r203 = Body5.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(58, 114).mirror().addBox(1.0F, -1.55F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 108).mirror().addBox(1.0F, -1.55F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 104).mirror().addBox(1.0F, -1.65F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 64).mirror().addBox(0.5F, 0.05F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r204 = Body5.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(70, 113).mirror().addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7129F, 1.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r205 = Body5.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(67, 113).mirror().addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.413F, 5.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r206 = Body5.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(64, 113).mirror().addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.513F, 3.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1222F, 6.7884F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r207 = Body6.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(8, 114).mirror().addBox(1.0F, -1.75F, 3.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(114, 3).mirror().addBox(1.0F, -1.85F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 112).mirror().addBox(1.0F, -2.05F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 17).mirror().addBox(0.5F, -0.55F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r208 = Body6.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(113, 75).mirror().addBox(0.0F, 2.5998F, 3.4174F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 114).mirror().addBox(0.0F, 1.2998F, 1.5175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 114).mirror().addBox(0.0F, 0.0998F, -0.4825F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2908F, 0.6101F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body9 = Body6.addOrReplaceChild("Body9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0651F, 5.9997F, -0.0183F, 0.3054F, -0.0055F));

		PartDefinition cube_r209 = Body9.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(115, 55).mirror().addBox(1.0F, -1.3976F, 3.8993F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 115).mirror().addBox(1.0F, -1.45F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 114).mirror().addBox(1.0F, -1.75F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 71).mirror().addBox(0.5F, -0.55F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r210 = Body9.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(61, 114).mirror().addBox(0.0F, 2.3999F, 3.5175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3907F, -3.3899F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body7 = Body9.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0034F, 6.003F, 0.0163F, 0.2203F, -0.0816F));

		PartDefinition cube_r211 = Body7.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(115, 52).mirror().addBox(1.0F, -0.5162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2595F, 4.0417F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r212 = Body7.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(52, 115).mirror().addBox(1.0F, -0.7162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3119F, 2.0424F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r213 = Body7.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(115, 49).mirror().addBox(1.0F, -0.8162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3642F, 0.0431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r214 = Body7.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(64, 73).mirror().addBox(0.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1613F, 4.9464F, 0.145F, 0.279F, -0.0875F));

		PartDefinition cube_r215 = Body8.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(0.5F, -0.2001F, 0.9126F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 10.3692F, 6.5703F, -0.9624F, -0.0216F, -0.1214F));

		PartDefinition cube_r216 = Body8.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(49, 9).mirror().addBox(0.5F, -0.3397F, -0.0307F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1692F, 3.1703F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r217 = Body8.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(76, 80).mirror().addBox(0.5F, -0.0739F, -1.9466F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8193F, 1.6953F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head = Ophthalmosaurus.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(65, 86).mirror().addBox(-0.9464F, 0.1819F, -9.8335F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0536F, 1.0848F, -19.2102F, -0.2698F, 0.3325F, -0.1696F));

		PartDefinition cube_r218 = Head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(85, 86).mirror().addBox(-1.0F, -0.0831F, -2.5031F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0536F, -0.5639F, -7.844F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r219 = Head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(79, 50).mirror().addBox(-2.5F, -0.0257F, -0.9874F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -2.4682F, -0.1332F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r220 = Head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(80, 44).mirror().addBox(-2.5F, -0.3232F, 0.1734F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -2.6235F, -2.2607F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r221 = Head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(36, 73).mirror().addBox(-2.5F, -1.5507F, 0.0126F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -1.2726F, -2.8565F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r222 = Head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(56, 92).mirror().addBox(-0.5F, -0.0181F, -2.0294F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -1.5848F, -6.0626F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r223 = Head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(20, 87).mirror().addBox(-1.0F, -0.0181F, -1.0294F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -1.9916F, -5.149F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r224 = Head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(65, 80).mirror().addBox(-2.5F, -0.0181F, -1.0294F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5536F, -2.3171F, -4.2035F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r225 = Head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(77, 73).mirror().addBox(-2.5F, -0.0431F, -1.9794F, 4.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5536F, -2.7529F, -2.9724F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r226 = Head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(34, 100).mirror().addBox(0.0F, -0.6832F, -0.6628F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8964F, 1.8323F, -0.6297F, 1.3537F, -0.1225F, 0.0131F));

		PartDefinition cube_r227 = Head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-2.0F, -2.533F, -0.068F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9464F, 2.9407F, -2.9257F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r228 = Head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(80, 39).mirror().addBox(-2.0F, -0.7094F, 0.0682F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0536F, 0.6546F, -4.4985F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r229 = Head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(26, 81).mirror().addBox(-1.5F, -1.7206F, -1.997F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0536F, 0.6546F, -4.4985F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-1.4464F, 0.454F, -6.2482F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(69, 110).mirror().addBox(-0.6F, -0.575F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(64, 110).mirror().addBox(-0.6F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0274F, 1.6223F, 0.2518F, -0.1594F, -0.1567F, -0.0381F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(76, 102).mirror().addBox(-4.25F, -0.0257F, -0.9874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.2903F, 7.2681F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(71, 102).mirror().addBox(-4.25F, -0.0257F, -0.9874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -2.2466F, 6.8523F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.25F, -0.8F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.5626F, 5.5645F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(107, 43).mirror().addBox(-3.75F, -0.0257F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.0F, -2.2466F, 6.8523F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(101, 75).mirror().addBox(-0.2481F, -0.2881F, -1.2583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.45F, 1.3782F, 5.6185F, 0.7079F, -0.1225F, 0.0131F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(28, 102).mirror().addBox(-0.75F, -1.225F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.2386F, 6.4794F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(57, 65).mirror().addBox(-0.75F, -1.425F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0228F, 6.2408F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(110, 61).mirror().addBox(-0.4964F, -0.3567F, 4.7515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(110, 55).mirror().addBox(-0.4964F, -0.3567F, 4.1515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.7F, -5.8F, -0.1148F, -0.1136F, -0.0451F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(107, 46).mirror().addBox(-0.042F, 0.1827F, 3.5183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(106, 71).mirror().addBox(-0.092F, -0.8173F, 2.9183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(37, 81).mirror().addBox(-0.092F, -0.8423F, 2.3183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(106, 33).mirror().addBox(-0.092F, -0.8423F, 1.7183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.7F, -5.8F, 0.0209F, -0.2183F, -0.0459F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(32, 106).mirror().addBox(-0.3119F, -0.8234F, 1.1166F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(27, 106).mirror().addBox(-0.3119F, -0.8234F, 0.5166F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(19, 61).mirror().addBox(-0.3119F, -0.8234F, -0.0833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.7F, -5.8F, 0.0169F, -0.1437F, 0.0043F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(108, 109).mirror().addBox(-0.4892F, -0.5929F, 0.6964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.8858F, 1.3537F, -7.094F, -0.074F, -0.1047F, -0.0014F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(106, 96).mirror().addBox(-0.4555F, -0.5361F, 1.9032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(88, 106).mirror().addBox(-0.4555F, -0.5361F, 1.3033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(83, 106).mirror().addBox(-0.4555F, -0.5361F, 0.7033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0172F, 1.5496F, -8.8992F, 0.0483F, -0.1046F, -0.005F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(103, 109).mirror().addBox(-0.4734F, -0.5361F, 0.1011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0172F, 1.5496F, -8.8992F, 0.0482F, -0.0871F, -0.0045F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(98, 109).mirror().addBox(-0.4776F, -0.4791F, -0.5472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(40, 107).mirror().addBox(-0.4776F, -0.4541F, -1.1472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(83, 109).mirror().addBox(-0.4776F, -0.4791F, -2.3472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(14, 107).mirror().addBox(-0.4776F, -0.4541F, -1.7472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0172F, 1.5496F, -8.8992F, 0.0526F, -0.0871F, -0.0049F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(88, 109).mirror().addBox(-0.3138F, -0.5742F, -2.8952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0172F, 1.5496F, -8.8992F, 0.0872F, -0.0085F, -0.0033F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(78, 109).mirror().addBox(-0.2989F, -0.2786F, -1.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(109, 40).mirror().addBox(-0.2989F, -0.2786F, -2.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(109, 37).mirror().addBox(-0.2989F, -0.2786F, -2.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(109, 4).mirror().addBox(-0.2989F, -0.2786F, -3.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(108, 106).mirror().addBox(-0.2989F, -0.2536F, -3.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(93, 108).mirror().addBox(-0.2989F, -0.2286F, -4.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0195F, 1.4881F, -10.9913F, 0.0523F, -0.0086F, -0.003F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(112, 58).mirror().addBox(-0.2989F, -0.4286F, -5.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(112, 64).mirror().addBox(-0.2989F, -0.4286F, -6.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(74, 112).mirror().addBox(-0.2989F, -0.4286F, -6.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(112, 78).mirror().addBox(-0.2989F, -0.4286F, -7.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(79, 112).mirror().addBox(-0.2989F, -0.4286F, -7.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(112, 7).mirror().addBox(-0.2989F, -0.4286F, -0.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(112, 10).mirror().addBox(-0.2989F, -0.4286F, -1.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(112, 13).mirror().addBox(-0.2989F, -0.4286F, -1.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(112, 16).mirror().addBox(-0.2989F, -0.4286F, -2.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(112, 19).mirror().addBox(-0.2989F, -0.4286F, -3.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(112, 43).mirror().addBox(-0.2989F, -0.4286F, -3.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(112, 46).mirror().addBox(-0.2989F, -0.4286F, -4.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(50, 112).mirror().addBox(-0.2989F, -0.4286F, -4.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.1431F, 2.7123F, -24.9413F, 0.0741F, -0.0086F, -0.003F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(59, 111).mirror().addBox(-0.2989F, -0.4286F, -0.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(111, 69).mirror().addBox(-0.2989F, -0.4286F, -1.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(111, 72).mirror().addBox(-0.2989F, -0.4286F, -1.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(93, 111).mirror().addBox(-0.2989F, -0.4286F, -2.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(111, 95).mirror().addBox(-0.2989F, -0.4286F, -3.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(111, 98).mirror().addBox(-0.2989F, -0.4286F, -3.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(111, 101).mirror().addBox(-0.2989F, -0.4286F, -4.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(112, 0).mirror().addBox(-0.2989F, -0.4286F, -4.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.1008F, 2.3151F, -20.158F, 0.0829F, -0.0086F, -0.003F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(111, 23).mirror().addBox(-0.2989F, -0.4286F, -3.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(111, 26).mirror().addBox(-0.2989F, -0.4286F, -3.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(111, 29).mirror().addBox(-0.2989F, -0.4286F, -4.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(111, 32).mirror().addBox(-0.2989F, -0.4286F, -4.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(21, 111).mirror().addBox(-0.2989F, -0.4286F, -2.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(6, 111).mirror().addBox(-0.2989F, -0.4286F, -1.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(110, 92).mirror().addBox(-0.2989F, -0.4286F, -1.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(110, 89).mirror().addBox(-0.2989F, -0.4286F, -0.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0585F, 1.9179F, -15.3746F, 0.0829F, -0.0086F, -0.003F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(100, 58).mirror().addBox(-0.0748F, 1.55F, 3.2704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.7F, -5.8F, 0.6438F, -0.1631F, -0.0233F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(100, 54).mirror().addBox(-0.0748F, -1.1766F, 2.3068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.7F, -5.8F, -0.0544F, -0.1631F, -0.0233F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(47, 92).mirror().addBox(-0.0748F, -0.2901F, 2.3891F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.7F, -5.8F, 0.2947F, -0.1631F, -0.0233F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(81, 100).mirror().addBox(-0.7172F, 0.1734F, -2.0178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(99, 96).mirror().addBox(-0.7172F, -0.2516F, -2.0178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0567F, -0.3151F, 3.2422F, 1.833F, -0.4351F, 0.0059F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(100, 62).mirror().addBox(-1.0F, -0.7493F, 0.0734F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8012F, -0.3067F, 5.3399F, -2.0633F, 0.0F, 0.0F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(74, 93).mirror().addBox(-1.0F, -0.671F, -2.5887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8012F, -0.3067F, 5.3399F, -1.6793F, 0.0F, 0.0F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(48, 102).mirror().addBox(-0.0882F, -0.9425F, 0.7721F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 102).mirror().addBox(-0.0882F, -0.9425F, -0.1779F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3746F, -2.8471F, 4.1204F, -0.4394F, -0.1984F, 0.1503F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(99, 100).mirror().addBox(-0.0882F, -0.7698F, -0.2767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.3746F, -2.8471F, 4.1204F, -0.6663F, -0.1984F, 0.1503F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(65, 96).mirror().addBox(-0.475F, -0.35F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6641F, -3.279F, 3.9183F, -0.0368F, -0.5288F, 0.2735F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(97, 23).mirror().addBox(-0.7296F, -0.7978F, -0.6775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(11, 86).mirror().addBox(-0.7046F, -1.2978F, -1.1775F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0567F, -0.3151F, 3.2422F, 1.4482F, -0.5562F, 0.0144F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(16, 113).mirror().addBox(-0.6546F, 0.8875F, -0.6092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(73, 106).mirror().addBox(-0.6546F, -0.1125F, -1.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0567F, -0.3151F, 3.2422F, -0.5415F, -0.5562F, 0.0144F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(7, 102).mirror().addBox(-0.6546F, -0.2502F, -1.9024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0567F, -0.3151F, 3.2422F, 1.3609F, -0.5562F, 0.0144F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(68, 106).mirror().addBox(-0.7172F, 0.3334F, -0.281F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0567F, -0.3151F, 3.2422F, 0.9167F, -0.4351F, 0.0059F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(50, 97).mirror().addBox(-0.7172F, -1.5603F, 0.4017F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0567F, -0.3151F, 3.2422F, -0.1741F, -0.4351F, 0.0059F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(57, 97).mirror().addBox(-0.5F, -1.025F, -0.775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7953F, -1.6321F, 4.3284F, -0.1268F, -0.4412F, -0.0009F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-0.6336F, -1.305F, -2.5431F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0567F, -0.3151F, 3.2422F, -1.5837F, -0.5555F, 0.0041F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(43, 97).mirror().addBox(-0.6336F, -0.8893F, -2.4818F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0567F, -0.3151F, 3.2422F, -0.9728F, -0.5555F, 0.0041F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(92, 96).mirror().addBox(-0.5381F, -1.9127F, -1.0514F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3155F, -0.4191F, 1.6785F, -0.7069F, -0.3098F, 0.0175F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(54, 80).mirror().addBox(-0.5112F, -1.9394F, -2.175F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3155F, -0.4191F, 1.6785F, 0.4392F, -0.3092F, 0.0065F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.5935F, 0.4017F, -2.3447F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0567F, -0.3151F, 3.2422F, -0.2945F, -0.5535F, 0.045F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(87, 19).mirror().addBox(0.658F, -0.5945F, 0.0982F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2931F, -0.6775F, 1.3537F, 0.5747F, 0.3788F, -1.1983F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(27, 97).mirror().addBox(0.1F, -0.0181F, -2.0294F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.503F, -1.8895F, 0.2768F, 0.4568F, -0.1305F, -0.0539F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(96, 83).mirror().addBox(-0.325F, -0.4F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.1604F, -0.8024F, -1.0792F, 0.3115F, -0.1543F, -0.0553F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(87, 80).mirror().addBox(0.0F, 0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.266F, -5.9654F, 0.2053F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(56, 87).mirror().addBox(0.0F, -0.275F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.266F, -5.9654F, 0.2023F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(56, 87).mirror().addBox(-0.375F, -0.275F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.266F, -5.9654F, 0.2023F, -0.124F, -0.0254F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(0.0503F, -0.4764F, 1.7035F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.7F, -5.8F, 0.2511F, -0.1631F, -0.0233F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(47, 87).mirror().addBox(0.025F, -0.7756F, -0.2061F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7661F, 0.9913F, -8.3945F, 0.1224F, -0.1045F, -0.0082F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-0.2989F, -0.6306F, -20.6739F, 1.0F, 1.0F, 21.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0195F, 1.4881F, -10.9913F, 0.0829F, -0.0086F, -0.003F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(72, 9).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.375F, 1.3552F, -13.9223F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 23.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.375F, 2.937F, -32.5591F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(38, 92).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.375F, 0.9797F, -11.0478F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(88, 30).mirror().addBox(-0.175F, -0.775F, -0.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9919F, 1.528F, -11.0523F, 0.0525F, -0.0828F, -0.0043F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(38, 87).mirror().addBox(-0.38F, -0.8307F, -1.481F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.8858F, 1.3537F, -7.094F, 0.0482F, -0.1045F, -0.0078F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(43, 80).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.219F, 0.9342F, -0.0922F, -0.0795F, -0.1517F, 0.0194F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(94, 91).mirror().addBox(-0.5412F, 0.4853F, 0.1332F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0567F, -0.3151F, 3.2422F, -0.1041F, -0.4757F, 0.0656F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(29, 87).mirror().addBox(-0.5F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(1.375F, 0.0369F, -5.934F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(80, 54).mirror().addBox(-0.1959F, -0.2894F, -0.1389F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.7F, -5.8F, -0.0003F, -0.1264F, 0.0076F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(1.5536F, 0.454F, -6.2482F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(69, 110).addBox(-0.4F, -0.575F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(64, 110).addBox(-0.4F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.0274F, 1.6223F, 0.2518F, -0.1594F, 0.1567F, 0.0381F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(76, 102).addBox(3.25F, -0.0257F, -0.9874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, -0.2903F, 7.2681F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(71, 102).addBox(3.25F, -0.0257F, -0.9874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -2.2466F, 6.8523F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(89, 0).addBox(-0.75F, -0.8F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5F, -1.5626F, 5.5645F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(107, 43).addBox(2.75F, -0.0257F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, -2.2466F, 6.8523F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(101, 75).addBox(-0.7519F, -0.2881F, -1.2583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.45F, 1.3782F, 5.6185F, 0.7079F, 0.1225F, -0.0131F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(28, 102).addBox(-0.25F, -1.225F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, 1.2386F, 6.4794F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(57, 65).addBox(-0.25F, -1.425F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, -0.0228F, 6.2408F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(110, 61).addBox(-0.5036F, -0.3567F, 4.7515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(110, 55).addBox(-0.5036F, -0.3567F, 4.1515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6F, 0.7F, -5.8F, -0.1148F, 0.1136F, 0.0451F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(107, 46).addBox(-0.958F, 0.1827F, 3.5183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(106, 71).addBox(-0.908F, -0.8173F, 2.9183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(37, 81).addBox(-0.908F, -0.8423F, 2.3183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(106, 33).addBox(-0.908F, -0.8423F, 1.7183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6F, 0.7F, -5.8F, 0.0209F, 0.2183F, 0.0459F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(32, 106).addBox(-0.6881F, -0.8234F, 1.1166F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(27, 106).addBox(-0.6881F, -0.8234F, 0.5166F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(19, 61).addBox(-0.6881F, -0.8234F, -0.0833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6F, 0.7F, -5.8F, 0.0169F, 0.1437F, -0.0043F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(108, 109).addBox(-0.5108F, -0.5929F, 0.6964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.8858F, 1.3537F, -7.094F, -0.074F, 0.1047F, 0.0014F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(106, 96).addBox(-0.5444F, -0.5361F, 1.9032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(88, 106).addBox(-0.5444F, -0.5361F, 1.3033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(83, 106).addBox(-0.5444F, -0.5361F, 0.7033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0172F, 1.5496F, -8.8992F, 0.0483F, 0.1046F, 0.005F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(103, 109).addBox(-0.5266F, -0.5361F, 0.1011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0172F, 1.5496F, -8.8992F, 0.0482F, 0.0871F, 0.0045F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(98, 109).addBox(-0.5224F, -0.4791F, -0.5472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(40, 107).addBox(-0.5224F, -0.4541F, -1.1472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(83, 109).addBox(-0.5224F, -0.4791F, -2.3472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(14, 107).addBox(-0.5224F, -0.4541F, -1.7472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0172F, 1.5496F, -8.8992F, 0.0526F, 0.0871F, 0.0049F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(88, 109).addBox(-0.6862F, -0.5742F, -2.8952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0172F, 1.5496F, -8.8992F, 0.0872F, 0.0085F, 0.0033F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(78, 109).addBox(-0.7011F, -0.2786F, -1.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(109, 40).addBox(-0.7011F, -0.2786F, -2.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(109, 37).addBox(-0.7011F, -0.2786F, -2.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(109, 4).addBox(-0.7011F, -0.2786F, -3.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(108, 106).addBox(-0.7011F, -0.2536F, -3.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(93, 108).addBox(-0.7011F, -0.2286F, -4.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0195F, 1.4881F, -10.9913F, 0.0523F, 0.0086F, 0.003F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(112, 58).addBox(-0.7011F, -0.4286F, -5.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(112, 64).addBox(-0.7011F, -0.4286F, -6.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(74, 112).addBox(-0.7011F, -0.4286F, -6.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(112, 78).addBox(-0.7011F, -0.4286F, -7.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(79, 112).addBox(-0.7011F, -0.4286F, -7.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(112, 7).addBox(-0.7011F, -0.4286F, -0.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(112, 10).addBox(-0.7011F, -0.4286F, -1.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(112, 13).addBox(-0.7011F, -0.4286F, -1.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(112, 16).addBox(-0.7011F, -0.4286F, -2.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(112, 19).addBox(-0.7011F, -0.4286F, -3.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(112, 43).addBox(-0.7011F, -0.4286F, -3.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(112, 46).addBox(-0.7011F, -0.4286F, -4.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(50, 112).addBox(-0.7011F, -0.4286F, -4.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.1431F, 2.7123F, -24.9413F, 0.0741F, 0.0086F, 0.003F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(59, 111).addBox(-0.7011F, -0.4286F, -0.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(111, 69).addBox(-0.7011F, -0.4286F, -1.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(111, 72).addBox(-0.7011F, -0.4286F, -1.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(93, 111).addBox(-0.7011F, -0.4286F, -2.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(111, 95).addBox(-0.7011F, -0.4286F, -3.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(111, 98).addBox(-0.7011F, -0.4286F, -3.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(111, 101).addBox(-0.7011F, -0.4286F, -4.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(112, 0).addBox(-0.7011F, -0.4286F, -4.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.1008F, 2.3151F, -20.158F, 0.0829F, 0.0086F, 0.003F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(111, 23).addBox(-0.7011F, -0.4286F, -3.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(111, 26).addBox(-0.7011F, -0.4286F, -3.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(111, 29).addBox(-0.7011F, -0.4286F, -4.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(111, 32).addBox(-0.7011F, -0.4286F, -4.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(21, 111).addBox(-0.7011F, -0.4286F, -2.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(6, 111).addBox(-0.7011F, -0.4286F, -1.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(110, 92).addBox(-0.7011F, -0.4286F, -1.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(110, 89).addBox(-0.7011F, -0.4286F, -0.6184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0585F, 1.9179F, -15.3746F, 0.0829F, 0.0086F, 0.003F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(100, 58).addBox(-0.9252F, 1.55F, 3.2704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, 0.7F, -5.8F, 0.6438F, 0.1631F, 0.0233F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(100, 54).addBox(-0.9252F, -1.1766F, 2.3068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.6F, 0.7F, -5.8F, -0.0544F, 0.1631F, 0.0233F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(47, 92).addBox(-0.9252F, -0.2901F, 2.3891F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.6F, 0.7F, -5.8F, 0.2947F, 0.1631F, 0.0233F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(81, 100).addBox(-0.2828F, 0.1734F, -2.0178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(99, 96).addBox(-0.2828F, -0.2516F, -2.0178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0567F, -0.3151F, 3.2422F, 1.833F, 0.4351F, -0.0059F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(100, 62).addBox(0.0F, -0.7493F, 0.0734F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8012F, -0.3067F, 5.3399F, -2.0633F, 0.0F, 0.0F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(74, 93).addBox(0.0F, -0.671F, -2.5887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8012F, -0.3067F, 5.3399F, -1.6793F, 0.0F, 0.0F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(48, 102).addBox(-1.9117F, -0.9425F, 0.7721F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 102).addBox(-1.9117F, -0.9425F, -0.1779F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3746F, -2.8471F, 4.1204F, -0.4394F, 0.1984F, -0.1503F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(99, 100).addBox(-0.9118F, -0.7698F, -0.2767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.3746F, -2.8471F, 4.1204F, -0.6663F, 0.1984F, -0.1503F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(65, 96).addBox(-1.525F, -0.35F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6641F, -3.279F, 3.9183F, -0.0368F, 0.5288F, -0.2735F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(97, 23).addBox(-0.2704F, -0.7978F, -0.6775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(11, 86).addBox(-0.2954F, -1.2978F, -1.1775F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0567F, -0.3151F, 3.2422F, 1.4482F, 0.5562F, -0.0144F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(16, 113).addBox(-0.3454F, 0.8875F, -0.6092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(73, 106).addBox(-0.3454F, -0.1125F, -1.5592F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0567F, -0.3151F, 3.2422F, -0.5415F, 0.5562F, -0.0144F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(7, 102).addBox(-0.3454F, -0.2502F, -1.9024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0567F, -0.3151F, 3.2422F, 1.3609F, 0.5562F, -0.0144F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(68, 106).addBox(-0.2828F, 0.3334F, -0.281F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0567F, -0.3151F, 3.2422F, 0.9167F, 0.4351F, -0.0059F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(50, 97).addBox(-0.2828F, -1.5603F, 0.4017F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0567F, -0.3151F, 3.2422F, -0.1741F, 0.4351F, -0.0059F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(57, 97).addBox(-0.5F, -1.025F, -0.775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7953F, -1.6321F, 4.3284F, -0.1268F, 0.4412F, 0.0009F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(98, 0).addBox(-0.3664F, -1.305F, -2.5431F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0567F, -0.3151F, 3.2422F, -1.5837F, 0.5555F, -0.0041F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(43, 97).addBox(-0.3664F, -0.8893F, -2.4818F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0567F, -0.3151F, 3.2422F, -0.9728F, 0.5555F, -0.0041F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(92, 96).addBox(-0.4619F, -1.9127F, -1.0514F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3155F, -0.4191F, 1.6785F, -0.7069F, 0.3098F, -0.0175F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(54, 80).addBox(-0.4888F, -1.9394F, -2.175F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3155F, -0.4191F, 1.6785F, 0.4392F, 0.3092F, -0.0065F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(0, 85).addBox(-1.4065F, 0.4017F, -2.3447F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0567F, -0.3151F, 3.2422F, -0.2945F, 0.5535F, -0.045F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(87, 19).addBox(-1.658F, -0.5945F, 0.0982F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2931F, -0.6775F, 1.3537F, 0.5747F, -0.3788F, 1.1983F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(27, 97).addBox(-1.1F, -0.0181F, -2.0294F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.503F, -1.8895F, 0.2768F, 0.4568F, 0.1305F, 0.0539F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(96, 83).addBox(-1.675F, -0.4F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.1604F, -0.8024F, -1.0792F, 0.3115F, 0.1543F, 0.0553F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(87, 80).addBox(-1.0F, 0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, 0.266F, -5.9654F, 0.2053F, 0.0F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(56, 87).addBox(-0.625F, -0.275F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, 0.266F, -5.9654F, 0.2023F, 0.124F, 0.0254F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(76, 0).addBox(-1.0503F, -0.4764F, 1.7035F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.7F, -5.8F, 0.2511F, 0.1631F, 0.0233F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(47, 87).addBox(-1.025F, -0.7756F, -0.2061F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7661F, 0.9913F, -8.3945F, 0.1224F, 0.1045F, 0.0082F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(0, 25).addBox(-0.7011F, -0.6306F, -20.6739F, 1.0F, 1.0F, 21.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0195F, 1.4881F, -10.9913F, 0.0829F, 0.0086F, 0.003F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(72, 9).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.375F, 1.3552F, -13.9223F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 23.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.375F, 2.937F, -32.5591F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(38, 92).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.375F, 0.9797F, -11.0478F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(88, 30).addBox(-0.825F, -0.775F, -0.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9919F, 1.528F, -11.0523F, 0.0525F, 0.0828F, 0.0043F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(38, 87).addBox(-0.62F, -0.8307F, -1.481F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8858F, 1.3537F, -7.094F, 0.0482F, 0.1045F, 0.0078F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(43, 80).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.219F, 0.9342F, -0.0922F, -0.0795F, 0.1517F, -0.0194F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(94, 91).addBox(-1.4588F, 0.4853F, 0.1332F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0567F, -0.3151F, 3.2422F, -0.1041F, 0.4757F, -0.0656F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(29, 87).addBox(-0.5F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.375F, 0.0369F, -5.934F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(80, 54).addBox(-0.8041F, -0.2894F, -0.1389F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, 0.7F, -5.8F, -0.0003F, 0.1264F, -0.0076F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 2.355F, 0.5334F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r345 = Jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(91, 54).addBox(-0.5F, -0.3996F, -1.4665F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.725F, -0.0572F, -5.5729F, -0.1309F, 0.2662F, 0.0F));

		PartDefinition cube_r346 = Jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 91).addBox(-0.5F, -0.6041F, -1.5192F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.725F, -0.0572F, -5.5729F, 0.0087F, 0.2662F, 0.0F));

		PartDefinition cube_r347 = Jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(80, 60).addBox(-0.2538F, -0.366F, -3.7806F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.6746F, -0.4047F, -10.5286F, -0.0131F, 0.1571F, 0.0F));

		PartDefinition cube_r348 = Jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(9, 98).addBox(-0.5614F, -0.1548F, -1.8798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.307F))
				.texOffs(13, 79).addBox(-0.5614F, 0.0452F, -4.3798F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.6746F, -0.4047F, -6.6286F, -0.1004F, 0.1745F, 0.0F));

		PartDefinition cube_r349 = Jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5614F, -0.4506F, -4.4348F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6746F, -0.4047F, -6.6286F, 0.0087F, 0.1745F, 0.0F));

		PartDefinition cube_r350 = Jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(112, 84).addBox(-0.9963F, -0.9832F, -3.4336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(9, 93).addBox(-0.9963F, -0.9832F, -3.0336F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(3.6751F, 1.5601F, -1.7256F, -0.2793F, 0.384F, 0.0F));

		PartDefinition cube_r351 = Jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(103, 112).addBox(-0.975F, -1.3261F, -0.9752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(93, 38).addBox(-0.975F, -1.3261F, -3.3752F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(3.6751F, 1.5601F, -1.7256F, -0.2813F, 0.3797F, -0.034F));

		PartDefinition cube_r352 = Jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(0, 100).addBox(-0.9F, -0.9261F, -1.7854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(3.8F, 1.1302F, 0.0814F, -0.0087F, 0.1222F, 0.0F));

		PartDefinition cube_r353 = Jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(103, 106).addBox(-0.565F, -0.5766F, -1.5806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(11, 113).addBox(-0.565F, -0.6016F, -2.1306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(57, 70).addBox(-0.565F, -0.6266F, -2.7056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(78, 106).addBox(-0.565F, -0.6516F, -3.3306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 113).addBox(-0.565F, -0.6766F, -3.9056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.6746F, -0.4047F, -6.6286F, 0.0084F, 0.1876F, -0.0024F));

		PartDefinition cube_r354 = Jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(98, 112).addBox(-0.3087F, -0.5835F, -2.3697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(110, 52).addBox(-0.3087F, -0.5835F, -1.7696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1996F, -0.4047F, -14.0286F, 0.0087F, 0.0873F, 0.0F));

		PartDefinition cube_r355 = Jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(110, 49).addBox(-0.2997F, -0.5832F, -1.163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1996F, -0.4047F, -14.0286F, 0.0086F, 0.0873F, 0.0F));

		PartDefinition cube_r356 = Jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(45, 110).addBox(-0.2152F, -0.6388F, -3.9974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6746F, -0.4047F, -10.5286F, 0.0086F, 0.1658F, 0.0F));

		PartDefinition cube_r357 = Jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(40, 110).addBox(-0.3409F, -0.665F, -3.4763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(32, 110).addBox(-0.3409F, -0.615F, -2.8763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(27, 110).addBox(-0.3409F, -0.615F, -2.2763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 106).addBox(-0.341F, -0.64F, -1.7769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(16, 110).addBox(-0.341F, -0.64F, -1.1769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6746F, -0.4047F, -10.5286F, 0.0086F, 0.1352F, -0.0018F));

		PartDefinition cube_r358 = Jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(106, 99).addBox(-0.31F, -0.6403F, -0.5884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6746F, -0.4047F, -10.5286F, 0.0085F, 0.1701F, -0.0024F));

		PartDefinition cube_r359 = Jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(102, 5).addBox(1.0F, -0.8F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F))
				.texOffs(102, 5).mirror().addBox(-5.8F, -0.8F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(1.9F, 0.1224F, 1.4442F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r360 = Jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(84, 112).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.3947F, 1.2863F, 0.0629F, 0.5411F, 0.1222F, 0.0F));

		PartDefinition cube_r361 = Jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(112, 81).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(3.2809F, 1.6446F, -0.8637F, 0.3665F, 0.1222F, 0.0F));

		PartDefinition cube_r362 = Jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(11, 110).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0197F)), PartPose.offsetAndRotation(3.1891F, 1.0768F, -1.6115F, -0.0873F, 0.1222F, 0.0F));

		PartDefinition cube_r363 = Jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(18, 93).addBox(-0.3264F, -0.4185F, -2.6369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.1996F, -0.4047F, -14.0286F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r364 = Jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(18, 93).mirror().addBox(-0.6737F, -0.4185F, -2.6369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.1996F, -0.4047F, -14.0286F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r365 = Jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(91, 54).mirror().addBox(-0.5F, -0.3996F, -1.4665F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.725F, -0.0572F, -5.5729F, -0.1309F, -0.2662F, 0.0F));

		PartDefinition cube_r366 = Jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.5F, -0.6041F, -1.5192F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.725F, -0.0572F, -5.5729F, 0.0087F, -0.2662F, 0.0F));

		PartDefinition cube_r367 = Jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(80, 60).mirror().addBox(-0.7462F, -0.366F, -3.7806F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.6746F, -0.4047F, -10.5286F, -0.0131F, -0.1571F, 0.0F));

		PartDefinition cube_r368 = Jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(9, 98).mirror().addBox(-0.4386F, -0.1548F, -1.8798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.307F)).mirror(false)
				.texOffs(13, 79).mirror().addBox(-0.4386F, 0.0452F, -4.3798F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.6746F, -0.4047F, -6.6286F, -0.1004F, -0.1745F, 0.0F));

		PartDefinition cube_r369 = Jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.4386F, -0.4506F, -4.4348F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6746F, -0.4047F, -6.6286F, 0.0087F, -0.1745F, 0.0F));

		PartDefinition cube_r370 = Jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(112, 84).mirror().addBox(-0.0037F, -0.9832F, -3.4336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(9, 93).mirror().addBox(-0.0037F, -0.9832F, -3.0336F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-3.6751F, 1.5601F, -1.7256F, -0.2793F, -0.384F, 0.0F));

		PartDefinition cube_r371 = Jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(103, 112).mirror().addBox(-0.025F, -1.3261F, -0.9752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(93, 38).mirror().addBox(-0.025F, -1.3261F, -3.3752F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-3.6751F, 1.5601F, -1.7256F, -0.2813F, -0.3797F, 0.034F));

		PartDefinition cube_r372 = Jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-0.1F, -0.9261F, -1.7854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-3.8F, 1.1302F, 0.0814F, -0.0087F, -0.1222F, 0.0F));

		PartDefinition cube_r373 = Jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(103, 106).mirror().addBox(-0.435F, -0.5766F, -1.5806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(11, 113).mirror().addBox(-0.435F, -0.6016F, -2.1306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(57, 70).mirror().addBox(-0.435F, -0.6266F, -2.7056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(78, 106).mirror().addBox(-0.435F, -0.6516F, -3.3306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 113).mirror().addBox(-0.435F, -0.6766F, -3.9056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.6746F, -0.4047F, -6.6286F, 0.0084F, -0.1876F, 0.0024F));

		PartDefinition cube_r374 = Jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(98, 112).mirror().addBox(-0.6913F, -0.5835F, -2.3697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(110, 52).mirror().addBox(-0.6913F, -0.5835F, -1.7696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1996F, -0.4047F, -14.0286F, 0.0087F, -0.0873F, 0.0F));

		PartDefinition cube_r375 = Jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(110, 49).mirror().addBox(-0.7003F, -0.5832F, -1.163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1996F, -0.4047F, -14.0286F, 0.0086F, -0.0873F, 0.0F));

		PartDefinition cube_r376 = Jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(45, 110).mirror().addBox(-0.7848F, -0.6388F, -3.9974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6746F, -0.4047F, -10.5286F, 0.0086F, -0.1658F, 0.0F));

		PartDefinition cube_r377 = Jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(40, 110).mirror().addBox(-0.6591F, -0.665F, -3.4763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(32, 110).mirror().addBox(-0.6591F, -0.615F, -2.8763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(27, 110).mirror().addBox(-0.6591F, -0.615F, -2.2763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(98, 106).mirror().addBox(-0.659F, -0.64F, -1.7769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(16, 110).mirror().addBox(-0.659F, -0.64F, -1.1769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6746F, -0.4047F, -10.5286F, 0.0086F, -0.1352F, 0.0018F));

		PartDefinition cube_r378 = Jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(106, 99).mirror().addBox(-0.69F, -0.6403F, -0.5884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6746F, -0.4047F, -10.5286F, 0.0085F, -0.1701F, 0.0024F));

		PartDefinition cube_r379 = Jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(84, 112).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.3947F, 1.2863F, 0.0629F, 0.5411F, -0.1222F, 0.0F));

		PartDefinition cube_r380 = Jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(112, 81).mirror().addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-3.2809F, 1.6446F, -0.8637F, 0.3665F, -0.1222F, 0.0F));

		PartDefinition cube_r381 = Jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(11, 110).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0197F)).mirror(false), PartPose.offsetAndRotation(-3.1891F, 1.0768F, -1.6115F, -0.0873F, -0.1222F, 0.0F));

		return LayerDefinition.create(meshdefinition, 117, 117);
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