package fossils.fossils.client.blockentity.model.nannopterygius;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NannopterygiusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Nannopterygius;
	private final ModelPart Body1;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Body3;
	private final ModelPart Body10;
	private final ModelPart body;
	private final ModelPart Body11;
	private final ModelPart Body4;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart HindlimbL;
	private final ModelPart HindlimbL2;
	private final ModelPart Body5;
	private final ModelPart tail;
	private final ModelPart Body6;
	private final ModelPart Body9;
	private final ModelPart Body7;
	private final ModelPart Body12;
	private final ModelPart Body13;
	private final ModelPart Body14;
	private final ModelPart Body8;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public NannopterygiusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Nannopterygius = this.fossil.getChild("Nannopterygius");
		this.Body1 = this.Nannopterygius.getChild("Body1");
		this.ForelimbL = this.Body1.getChild("ForelimbL");
		this.ForelimbL2 = this.Body1.getChild("ForelimbL2");
		this.Body2 = this.Body1.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body10 = this.Body3.getChild("Body10");
		this.body = this.Body10.getChild("body");
		this.Body11 = this.body.getChild("Body11");
		this.Body4 = this.Body11.getChild("Body4");
		this.bone = this.Body4.getChild("bone");
		this.bone4 = this.Body4.getChild("bone4");
		this.HindlimbL = this.Body4.getChild("HindlimbL");
		this.HindlimbL2 = this.Body4.getChild("HindlimbL2");
		this.Body5 = this.Body4.getChild("Body5");
		this.tail = this.Body5.getChild("tail");
		this.Body6 = this.tail.getChild("Body6");
		this.Body9 = this.Body6.getChild("Body9");
		this.Body7 = this.Body9.getChild("Body7");
		this.Body12 = this.Body7.getChild("Body12");
		this.Body13 = this.Body12.getChild("Body13");
		this.Body14 = this.Body13.getChild("Body14");
		this.Body8 = this.Body14.getChild("Body8");
		this.Head = this.Nannopterygius.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Nannopterygius = fossil.addOrReplaceChild("Nannopterygius", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.7149F, 0.6123F, 0.0865F, 0.0114F, -0.1304F));

		PartDefinition Body1 = Nannopterygius.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.485F, -16.9049F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 93).addBox(0.0F, -2.3411F, 0.0015F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.085F, 1.3299F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(63, 100).addBox(0.0F, -2.249F, 0.0263F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.615F, -0.5701F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 28).addBox(-0.5F, -0.5F, -4.4F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.115F, 1.8299F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8309F, 0.2154F, 0.3313F, 0.5479F, -0.6504F));

		PartDefinition cube_r5 = Body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(83, 13).mirror().addBox(-4.8126F, -0.8451F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8309F, 0.2154F, 0.0404F, 0.623F, -1.1682F));

		PartDefinition cube_r6 = Body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(83, 25).mirror().addBox(-5.9916F, -2.5101F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3309F, 2.0154F, 0.096F, 0.6905F, -1.4199F));

		PartDefinition cube_r7 = Body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(85, 88).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3309F, 2.0154F, 0.4383F, 0.5596F, -0.8466F));

		PartDefinition cube_r8 = Body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(88, 71).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3309F, 2.0154F, 0.6253F, 0.3414F, -0.4249F));

		PartDefinition cube_r9 = Body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(89, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8309F, 0.2154F, 0.3313F, -0.5479F, 0.6504F));

		PartDefinition cube_r10 = Body1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(83, 13).addBox(1.8126F, -0.8451F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8309F, 0.2154F, 0.0404F, -0.623F, 1.1682F));

		PartDefinition cube_r11 = Body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(83, 25).addBox(2.9916F, -2.5101F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3309F, 2.0154F, 0.096F, -0.6905F, 1.4199F));

		PartDefinition cube_r12 = Body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(85, 88).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3309F, 2.0154F, 0.4383F, -0.5596F, 0.8466F));

		PartDefinition cube_r13 = Body1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(88, 71).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3309F, 2.0154F, 0.6253F, -0.3414F, 0.4249F));

		PartDefinition ForelimbL = Body1.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.2195F, 8.618F, 3.6917F, 0.4712F, -0.4233F, -0.3134F));

		PartDefinition cube_r14 = ForelimbL.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(17, 49).addBox(-2.0F, 0.0F, -1.7F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5922F, 3.6935F, -0.6489F, 0.0F, 0.1745F, 0.6545F));

		PartDefinition cube_r15 = ForelimbL.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(101, 0).addBox(-1.375F, -0.5F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(99, 15).addBox(-0.575F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9122F, 2.4044F, -0.5228F, -3.1416F, 1.5272F, -2.4871F));

		PartDefinition cube_r16 = ForelimbL.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(60, 76).addBox(-0.6F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2234F, 1.8758F, -1.3749F, 0.0F, 0.9599F, 0.6545F));

		PartDefinition cube_r17 = ForelimbL.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(98, 72).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.4646F, 1.203F, -1.3407F, 0.0F, 1.0036F, 0.6545F));

		PartDefinition cube_r18 = ForelimbL.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(45, 93).addBox(-1.825F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(2.1249F, 1.7096F, -1.5081F, 0.0F, 0.4363F, 0.6545F));

		PartDefinition cube_r19 = ForelimbL.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 93).addBox(1.0F, 0.2F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(88, 39).addBox(-0.975F, 0.2F, 1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9996F, -0.0362F, -2.0489F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r20 = ForelimbL.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(99, 12).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.1703F, 1.7394F, 0.1406F, 0.0F, -0.6065F, 0.6545F));

		PartDefinition cube_r21 = ForelimbL.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(87, 81).addBox(-1.125F, -0.5F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.7972F, 0.6909F, 0.2492F, 0.0F, 0.2749F, 0.6545F));

		PartDefinition ForelimbL2 = Body1.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.2195F, 8.618F, 3.6917F, 0.6454F, -0.2842F, 0.21F));

		PartDefinition cube_r22 = ForelimbL2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(13, 53).addBox(-3.0F, 0.0F, -1.7F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5922F, 3.6935F, -0.6489F, 0.0F, -0.1745F, -0.6545F));

		PartDefinition cube_r23 = ForelimbL2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(13, 101).addBox(0.375F, -0.5F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(100, 68).addBox(-0.425F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.9122F, 2.4044F, -0.5228F, -3.1416F, -1.5272F, 2.4871F));

		PartDefinition cube_r24 = ForelimbL2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 81).addBox(-0.4F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.2234F, 1.8758F, -1.3749F, 0.0F, -0.9599F, -0.6545F));

		PartDefinition cube_r25 = ForelimbL2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(8, 100).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.4646F, 1.203F, -1.3407F, 0.0F, -1.0036F, -0.6545F));

		PartDefinition cube_r26 = ForelimbL2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(3, 100).addBox(0.825F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(-2.1249F, 1.7096F, -1.5081F, 0.0F, -0.4363F, -0.6545F));

		PartDefinition cube_r27 = ForelimbL2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(97, 99).addBox(-2.0F, 0.2F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(62, 88).addBox(-1.025F, 0.2F, 1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9996F, -0.0362F, -2.0489F, 0.0F, 0.0F, -0.6545F));

		PartDefinition cube_r28 = ForelimbL2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(99, 86).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-2.1703F, 1.7394F, 0.1406F, 0.0F, 0.6065F, -0.6545F));

		PartDefinition cube_r29 = ForelimbL2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(55, 88).addBox(-0.875F, -0.5F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.7972F, 0.6909F, 0.2492F, 0.0F, -0.2749F, -0.6545F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.026F, 3.1368F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r30 = Body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(25, 22).mirror().addBox(-16.8486F, -2.0318F, -0.5704F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.559F, 8.3681F, 0.1123F, 0.3531F, -1.2913F));

		PartDefinition cube_r31 = Body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(88, 69).mirror().addBox(-3.465F, -0.4869F, -0.5704F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.559F, 8.3681F, 0.2649F, 0.2612F, -0.7964F));

		PartDefinition cube_r32 = Body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(89, 51).mirror().addBox(-1.533F, 0.1776F, -0.582F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.559F, 8.3681F, 0.35F, 0.1344F, -0.3701F));

		PartDefinition cube_r33 = Body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(89, 49).mirror().addBox(-1.5469F, 0.2111F, -0.5942F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.359F, 6.3681F, 0.4077F, 0.1563F, -0.3618F));

		PartDefinition cube_r34 = Body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(89, 47).mirror().addBox(-3.4919F, -0.4625F, -0.5825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.359F, 6.3681F, 0.3096F, 0.3046F, -0.7839F));

		PartDefinition cube_r35 = Body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(27, 19).mirror().addBox(-14.8837F, -2.0226F, -0.5825F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.359F, 6.3681F, 0.1306F, 0.4118F, -1.2844F));

		PartDefinition cube_r36 = Body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(89, 45).mirror().addBox(-1.538F, 0.188F, -0.689F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.159F, 4.4681F, 0.4741F, 0.1806F, -0.3506F));

		PartDefinition cube_r37 = Body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(92, 88).mirror().addBox(-3.4747F, -0.4798F, -0.6773F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.159F, 4.4681F, 0.3623F, 0.3534F, -0.7668F));

		PartDefinition cube_r38 = Body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(33, 6).mirror().addBox(-11.8605F, -2.0301F, -0.6773F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.159F, 4.4681F, 0.1528F, 0.4786F, -1.2749F));

		PartDefinition cube_r39 = Body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(65, 62).mirror().addBox(-7.9916F, -2.5101F, -0.4853F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8569F, 0.4786F, 0.1642F, 0.6583F, -1.2695F));

		PartDefinition cube_r40 = Body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(89, 23).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8569F, 0.4786F, 0.4708F, 0.504F, -0.7224F));

		PartDefinition cube_r41 = Body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(89, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8569F, 0.4786F, 0.6287F, 0.2792F, -0.316F));

		PartDefinition cube_r42 = Body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(89, 19).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1569F, 2.4786F, 0.5242F, 0.1984F, -0.3412F));

		PartDefinition cube_r43 = Body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(57, 46).mirror().addBox(-9.9916F, -2.5101F, -0.4853F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1569F, 2.4786F, 0.1705F, 0.5287F, -1.2663F));

		PartDefinition cube_r44 = Body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(89, 2).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1569F, 2.4786F, 0.4031F, 0.3895F, -0.7521F));

		PartDefinition cube_r45 = Body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(25, 22).addBox(2.8487F, -2.0318F, -0.5704F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.559F, 8.3681F, 0.1123F, -0.3531F, 1.2913F));

		PartDefinition cube_r46 = Body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(88, 69).addBox(1.465F, -0.4869F, -0.5704F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.559F, 8.3681F, 0.2649F, -0.2612F, 0.7964F));

		PartDefinition cube_r47 = Body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(89, 51).addBox(-0.467F, 0.1776F, -0.582F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.559F, 8.3681F, 0.35F, -0.1344F, 0.3701F));

		PartDefinition cube_r48 = Body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(89, 49).addBox(-0.4531F, 0.2111F, -0.5942F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.359F, 6.3681F, 0.4077F, -0.1563F, 0.3618F));

		PartDefinition cube_r49 = Body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(89, 47).addBox(1.4919F, -0.4625F, -0.5825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.359F, 6.3681F, 0.3096F, -0.3046F, 0.7839F));

		PartDefinition cube_r50 = Body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(27, 19).addBox(2.8838F, -2.0226F, -0.5825F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.359F, 6.3681F, 0.1306F, -0.4118F, 1.2844F));

		PartDefinition cube_r51 = Body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(89, 45).addBox(-0.462F, 0.188F, -0.689F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.159F, 4.4681F, 0.4741F, -0.1806F, 0.3506F));

		PartDefinition cube_r52 = Body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(92, 88).addBox(1.4747F, -0.4798F, -0.6773F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.159F, 4.4681F, 0.3623F, -0.3534F, 0.7668F));

		PartDefinition cube_r53 = Body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(33, 6).addBox(2.8605F, -2.0301F, -0.6773F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.159F, 4.4681F, 0.1528F, -0.4786F, 1.2749F));

		PartDefinition cube_r54 = Body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(65, 62).addBox(2.9916F, -2.5101F, -0.4853F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8569F, 0.4786F, 0.1642F, -0.6583F, 1.2695F));

		PartDefinition cube_r55 = Body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(89, 23).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8569F, 0.4786F, 0.4708F, -0.504F, 0.7224F));

		PartDefinition cube_r56 = Body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(89, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8569F, 0.4786F, 0.6287F, -0.2792F, 0.316F));

		PartDefinition cube_r57 = Body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(89, 19).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1569F, 2.4786F, 0.5242F, -0.1984F, 0.3412F));

		PartDefinition cube_r58 = Body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(57, 46).addBox(2.9916F, -2.5101F, -0.4853F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1569F, 2.4786F, 0.1705F, -0.5287F, 1.2663F));

		PartDefinition cube_r59 = Body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(89, 2).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1569F, 2.4786F, 0.4031F, -0.3895F, 0.7521F));

		PartDefinition cube_r60 = Body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(71, 94).addBox(-1.0F, -3.4719F, 4.9561F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.559F, 2.7681F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r61 = Body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(68, 94).addBox(-1.0F, -3.0108F, 2.9875F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.559F, 2.7681F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r62 = Body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(30, 94).addBox(-1.0F, -2.4753F, 0.9926F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 40).addBox(-1.5F, 0.0247F, -0.0074F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -0.559F, 2.7681F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r63 = Body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(48, 88).addBox(-1.0F, -1.0F, -2.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(76, 29).addBox(-0.5F, -1.0F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 11.6512F, 0.257F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r64 = Body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 22).addBox(-4.5F, -1.2753F, -4.0074F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 13.8515F, 8.0204F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r65 = Body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(27, 94).addBox(-1.0F, -2.4245F, 0.0355F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.259F, 1.7681F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(60, 93).addBox(-1.0F, -2.45F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.241F, -0.1319F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r67 = Body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(48, 70).addBox(-1.5F, -0.05F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.241F, -0.1319F, 0.2443F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.5F, 5.7181F, 1.5697F));

		PartDefinition cube_r68 = bone2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(45, 81).addBox(-0.025F, -0.9F, -0.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.8819F, 2.3121F, -3.414F, -0.2055F, -0.7026F, -1.0444F));

		PartDefinition cube_r69 = bone2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(20, 76).addBox(-0.0364F, -1.5819F, -0.8828F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.6802F, 4.4305F, -0.7752F, 0.8361F, 0.5842F, 0.9814F));

		PartDefinition cube_r70 = bone2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(83, 10).addBox(0.9076F, -0.8941F, -0.4765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.4F, 2.8728F, -3.4757F, -2.5145F, -0.595F, 2.0434F));

		PartDefinition cube_r71 = bone2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(80, 51).addBox(-0.4866F, -0.7969F, -0.2238F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.9F, 3.5728F, -2.9757F, -0.3081F, 0.0956F, -0.5742F));

		PartDefinition cube_r72 = bone2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(94, 14).addBox(-0.0373F, -0.8809F, 0.1019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.3299F, 4.9001F, 1.7556F, 1.9341F, 0.0759F, 0.138F));

		PartDefinition cube_r73 = bone2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(12, 94).addBox(-0.0373F, -1.0287F, 0.1541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1759F, 5.6613F, 1.1256F, 0.8869F, 0.0759F, 0.138F));

		PartDefinition cube_r74 = bone2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(23, 87).addBox(-1.0F, -2.5F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.6177F, 5.7178F, -0.9565F, 1.5402F, 0.6869F, 1.5678F));

		PartDefinition cube_r75 = bone2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(69, 15).addBox(-0.0364F, -0.8222F, -0.6532F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.6802F, 4.4305F, -0.7752F, 1.1851F, 0.5842F, 0.9814F));

		PartDefinition cube_r76 = bone2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(55, 93).addBox(0.5F, 0.025F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.0F, 3.3284F, 1.0139F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r77 = bone2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(38, 81).addBox(0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 2.7835F, -1.432F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r78 = bone2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(52, 84).addBox(0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.0F, 2.7835F, -1.432F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r79 = bone2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(45, 84).addBox(6.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.6907F, -0.3548F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r80 = bone2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(75, 74).addBox(6.5F, 0.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.6907F, -0.3548F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r81 = bone2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(87, 15).addBox(6.5F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.4967F, -0.3373F, 1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r82 = bone2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(50, 93).addBox(6.5F, -0.525F, 0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4967F, -0.3373F, 1.0734F, 0.0F, 0.0F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.5F, 5.7181F, 1.5697F));

		PartDefinition cube_r83 = bone3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(45, 81).mirror().addBox(-2.975F, -0.9F, -0.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.8819F, 2.3121F, -3.414F, -0.2055F, 0.7026F, 1.0444F));

		PartDefinition cube_r84 = bone3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(20, 76).mirror().addBox(-0.9636F, -1.5819F, -0.8828F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.6802F, 4.4305F, -0.7752F, 0.8361F, -0.5842F, -0.9814F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(83, 10).mirror().addBox(-3.9076F, -0.8941F, -0.4765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 2.8728F, -3.4757F, -2.5145F, 0.595F, -2.0434F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(80, 51).mirror().addBox(-2.5134F, -0.7969F, -0.2238F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 3.5728F, -2.9757F, -0.3081F, -0.0956F, 0.5742F));

		PartDefinition cube_r87 = bone3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(94, 14).mirror().addBox(-0.9627F, -0.8809F, 0.1019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.3299F, 4.9001F, 1.7556F, 1.9341F, -0.0759F, -0.138F));

		PartDefinition cube_r88 = bone3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(12, 94).mirror().addBox(-0.9627F, -1.0287F, 0.1541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1759F, 5.6613F, 1.1256F, 0.8869F, -0.0759F, -0.138F));

		PartDefinition cube_r89 = bone3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(23, 87).mirror().addBox(0.0F, -2.5F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.6177F, 5.7178F, -0.9565F, 1.5402F, -0.6869F, -1.5678F));

		PartDefinition cube_r90 = bone3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(69, 15).mirror().addBox(-0.9636F, -0.8222F, -0.6532F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.6802F, 4.4305F, -0.7752F, 1.1851F, -0.5842F, -0.9814F));

		PartDefinition cube_r91 = bone3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(55, 93).mirror().addBox(-1.5F, 0.025F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.3284F, 1.0139F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(38, 81).mirror().addBox(-1.5F, -2.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 2.7835F, -1.432F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r93 = bone3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(52, 84).mirror().addBox(-1.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 2.7835F, -1.432F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r94 = bone3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(45, 84).mirror().addBox(-7.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6907F, -0.3548F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r95 = bone3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(75, 74).mirror().addBox(-7.5F, 0.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6907F, -0.3548F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r96 = bone3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(87, 15).mirror().addBox(-7.5F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4967F, -0.3373F, 1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r97 = bone3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(50, 93).mirror().addBox(-7.5F, -0.525F, 0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4967F, -0.3373F, 1.0734F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1931F, 9.6655F, 0.1485F, 0.0432F, 0.0065F));

		PartDefinition cube_r98 = Body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(76, 88).addBox(-1.0F, -2.875F, -0.05F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1981F, 5.9905F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r99 = Body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(94, 77).addBox(-1.0F, -2.9868F, 0.0235F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8385F, 3.9481F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r100 = Body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(74, 94).addBox(-1.0F, -2.9301F, 0.1086F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4342F, 1.9026F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r101 = Body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(55, 99).addBox(-1.0F, -2.8F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 28).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 0.0342F, 0.0026F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r102 = Body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 15).addBox(-5.5F, -2.0F, 0.05F, 9.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 17.3796F, 0.2653F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 8).addBox(-5.5F, -2.0F, 0.05F, 9.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 15.7527F, -3.3889F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r104 = Body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(90, 53).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8501F, 6.313F, 0.0576F, 0.0348F, -0.8263F));

		PartDefinition cube_r105 = Body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(28, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8501F, 6.313F, 0.0685F, 0.0146F, -0.3902F));

		PartDefinition cube_r106 = Body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 4).mirror().addBox(-17.9916F, -2.5101F, -0.4853F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8501F, 6.313F, 0.035F, 0.0574F, -1.3062F));

		PartDefinition cube_r107 = Body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(12, 90).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4751F, 4.313F, 0.0837F, 0.0696F, -0.8261F));

		PartDefinition cube_r108 = Body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(90, 8).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4751F, 4.313F, 0.1069F, 0.0351F, -0.3905F));

		PartDefinition cube_r109 = Body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(-17.9916F, -2.5101F, -0.4852F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4751F, 4.313F, 0.0421F, 0.1004F, -1.3069F));

		PartDefinition cube_r110 = Body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 2).mirror().addBox(-17.9916F, -2.5101F, -0.4853F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0501F, 2.313F, 0.0496F, 0.1345F, -1.3065F));

		PartDefinition cube_r111 = Body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-17.9916F, -2.5101F, -0.4853F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6501F, 0.413F, 0.0588F, 0.1682F, -1.3051F));

		PartDefinition cube_r112 = Body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(90, 6).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6501F, 0.413F, 0.13F, 0.122F, -0.8221F));

		PartDefinition cube_r113 = Body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(90, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6501F, 0.413F, 0.1708F, 0.0632F, -0.3878F));

		PartDefinition cube_r114 = Body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(89, 62).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0501F, 2.313F, 0.1062F, 0.0964F, -0.8248F));

		PartDefinition cube_r115 = Body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(89, 60).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0501F, 2.313F, 0.1385F, 0.05F, -0.3897F));

		PartDefinition cube_r116 = Body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(90, 53).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8501F, 6.313F, 0.0576F, -0.0348F, 0.8263F));

		PartDefinition cube_r117 = Body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(28, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8501F, 6.313F, 0.0685F, -0.0146F, 0.3902F));

		PartDefinition cube_r118 = Body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 4).addBox(2.9916F, -2.5101F, -0.4853F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8501F, 6.313F, 0.035F, -0.0574F, 1.3062F));

		PartDefinition cube_r119 = Body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(12, 90).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4751F, 4.313F, 0.0837F, -0.0696F, 0.8261F));

		PartDefinition cube_r120 = Body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(90, 8).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4751F, 4.313F, 0.1069F, -0.0351F, 0.3905F));

		PartDefinition cube_r121 = Body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 6).addBox(2.9916F, -2.5101F, -0.4852F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4751F, 4.313F, 0.0421F, -0.1004F, 1.3069F));

		PartDefinition cube_r122 = Body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 2).addBox(2.9916F, -2.5101F, -0.4853F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0501F, 2.313F, 0.0496F, -0.1345F, 1.3065F));

		PartDefinition cube_r123 = Body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 0).addBox(2.9916F, -2.5101F, -0.4853F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6501F, 0.413F, 0.0588F, -0.1682F, 1.3051F));

		PartDefinition cube_r124 = Body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(90, 6).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6501F, 0.413F, 0.13F, -0.122F, 0.8221F));

		PartDefinition cube_r125 = Body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(90, 4).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6501F, 0.413F, 0.1708F, -0.0632F, 0.3878F));

		PartDefinition cube_r126 = Body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(89, 62).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0501F, 2.313F, 0.1062F, -0.0964F, 0.8248F));

		PartDefinition cube_r127 = Body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(89, 60).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0501F, 2.313F, 0.1385F, -0.05F, 0.3897F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, -0.1139F, 0.0867F, -0.0099F));

		PartDefinition cube_r128 = Body10.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(5, 95).addBox(-1.0F, -2.9F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4158F, 1.9659F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r129 = Body10.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(94, 90).addBox(-1.0F, -2.85F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0342F, 0.0026F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r130 = Body10.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(61, 8).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 0.0342F, 0.0026F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r131 = Body10.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(25, 26).mirror().addBox(-15.9916F, -2.5101F, -0.4852F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2501F, 2.313F, 0.0496F, 0.1345F, -1.3065F));

		PartDefinition cube_r132 = Body10.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(25, 24).mirror().addBox(-16.9916F, -2.5101F, -0.4852F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6501F, 0.413F, 0.0542F, 0.1513F, -1.3058F));

		PartDefinition cube_r133 = Body10.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(79, 90).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6501F, 0.413F, 0.1181F, 0.1092F, -0.8235F));

		PartDefinition cube_r134 = Body10.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(69, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6501F, 0.413F, 0.1547F, 0.0566F, -0.3888F));

		PartDefinition cube_r135 = Body10.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(90, 57).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2501F, 2.313F, 0.1062F, 0.0964F, -0.8248F));

		PartDefinition cube_r136 = Body10.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(90, 55).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2501F, 2.313F, 0.1385F, 0.05F, -0.3897F));

		PartDefinition cube_r137 = Body10.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(25, 26).addBox(2.9916F, -2.5101F, -0.4852F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2501F, 2.313F, 0.0496F, -0.1345F, 1.3065F));

		PartDefinition cube_r138 = Body10.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(25, 24).addBox(2.9916F, -2.5101F, -0.4852F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6501F, 0.413F, 0.0542F, -0.1513F, 1.3058F));

		PartDefinition cube_r139 = Body10.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(79, 90).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6501F, 0.413F, 0.1181F, -0.1092F, 0.8235F));

		PartDefinition cube_r140 = Body10.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(69, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6501F, 0.413F, 0.1547F, -0.0566F, 0.3888F));

		PartDefinition cube_r141 = Body10.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(90, 57).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2501F, 2.313F, 0.1062F, -0.0964F, 0.8248F));

		PartDefinition cube_r142 = Body10.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(90, 55).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2501F, 2.313F, 0.1385F, -0.05F, 0.3897F));

		PartDefinition body = Body10.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.9501F, 4.013F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(37, 64).addBox(-1.5F, 0.0F, 4.05F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, -0.9159F, -4.0104F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(95, 31).addBox(-1.0F, -2.9F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2289F, 1.8794F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(8, 95).addBox(-1.0F, -2.975F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1527F, -0.0839F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(42, 91).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2F, 2.3F, 0.0955F, 0.0705F, -0.8252F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(35, 91).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2F, 2.3F, 0.118F, 0.0309F, -0.3901F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(33, 2).mirror().addBox(-13.9916F, -2.5101F, -0.4852F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2F, 2.3F, 0.0522F, 0.1066F, -1.3058F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, 0.3F, 0.1276F, 0.1008F, -0.8384F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(86, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, 0.3F, 0.1598F, 0.045F, -0.4044F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(33, 0).mirror().addBox(-14.9916F, -2.5101F, -0.4852F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, 0.3F, 0.0666F, 0.1483F, -1.3199F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(42, 91).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 2.3F, 0.0955F, -0.0705F, 0.8252F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(35, 91).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 2.3F, 0.118F, -0.0309F, 0.3901F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(33, 2).addBox(2.9916F, -2.5101F, -0.4852F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 2.3F, 0.0522F, -0.1066F, 1.3058F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 91).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, 0.3F, 0.1276F, -0.1008F, 0.8384F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(86, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, 0.3F, 0.1598F, -0.045F, 0.4044F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(33, 0).addBox(2.9916F, -2.5101F, -0.4852F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, 0.3F, 0.0666F, -0.1483F, 1.3199F));

		PartDefinition Body11 = body.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.5143F, 3.7559F, -0.1489F, 0.0863F, -0.0129F));

		PartDefinition cube_r158 = Body11.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(94, 95).addBox(-1.0F, -2.675F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.179F, 5.8924F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r159 = Body11.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(95, 64).addBox(-1.0F, -2.7F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7974F, 3.9291F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r160 = Body11.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(63, 95).addBox(-1.0F, -2.725F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4158F, 1.9659F, -0.2662F, 0.0F, 0.0F));

		PartDefinition cube_r161 = Body11.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(95, 36).addBox(-1.0F, -2.675F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 8).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 0.0342F, 0.0026F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r162 = Body11.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(92, 25).mirror().addBox(-1.5555F, 0.2283F, -0.5181F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0501F, 6.313F, 0.239F, 0.0819F, -0.4692F));

		PartDefinition cube_r163 = Body11.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(12, 92).mirror().addBox(-3.5064F, -0.4504F, -0.5062F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0501F, 6.313F, 0.1844F, 0.1675F, -0.9006F));

		PartDefinition cube_r164 = Body11.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(59, 32).mirror().addBox(-9.9023F, -2.0186F, -0.5062F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0501F, 6.313F, 0.0858F, 0.2335F, -1.3861F));

		PartDefinition cube_r165 = Body11.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(69, 88).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7501F, 4.313F, 0.2191F, 0.2073F, -0.8942F));

		PartDefinition cube_r166 = Body11.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(88, 67).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7501F, 4.313F, 0.2867F, 0.1039F, -0.4648F));

		PartDefinition cube_r167 = Body11.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(46, 16).mirror().addBox(-10.9916F, -2.5101F, -0.4853F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7501F, 4.313F, 0.0977F, 0.2846F, -1.383F));

		PartDefinition cube_r168 = Body11.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(44, 37).mirror().addBox(-11.9916F, -2.5101F, -0.4853F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3501F, 2.313F, 0.0873F, 0.2691F, -1.3687F));

		PartDefinition cube_r169 = Body11.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(33, 4).mirror().addBox(-12.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0501F, 0.413F, 0.0873F, 0.2691F, -1.3338F));

		PartDefinition cube_r170 = Body11.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(91, 75).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0501F, 0.413F, 0.2027F, 0.1983F, -0.8455F));

		PartDefinition cube_r171 = Body11.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(91, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0501F, 0.413F, 0.2683F, 0.1024F, -0.4147F));

		PartDefinition cube_r172 = Body11.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(56, 91).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3501F, 2.313F, 0.2027F, 0.1983F, -0.8804F));

		PartDefinition cube_r173 = Body11.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(49, 91).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3501F, 2.313F, 0.2683F, 0.1024F, -0.4496F));

		PartDefinition cube_r174 = Body11.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(59, 32).addBox(2.9022F, -2.0186F, -0.5062F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0501F, 6.313F, 0.0858F, -0.2335F, 1.3861F));

		PartDefinition cube_r175 = Body11.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(12, 92).addBox(1.5064F, -0.4504F, -0.5062F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0501F, 6.313F, 0.1844F, -0.1675F, 0.9006F));

		PartDefinition cube_r176 = Body11.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(92, 25).addBox(-0.4445F, 0.2283F, -0.5181F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0501F, 6.313F, 0.239F, -0.0819F, 0.4692F));

		PartDefinition cube_r177 = Body11.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(69, 88).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7501F, 4.313F, 0.2191F, -0.2073F, 0.8942F));

		PartDefinition cube_r178 = Body11.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(88, 67).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7501F, 4.313F, 0.2867F, -0.1039F, 0.4648F));

		PartDefinition cube_r179 = Body11.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(46, 16).addBox(2.9916F, -2.5101F, -0.4853F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7501F, 4.313F, 0.0977F, -0.2846F, 1.383F));

		PartDefinition cube_r180 = Body11.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(44, 37).addBox(2.9916F, -2.5101F, -0.4853F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3501F, 2.313F, 0.0873F, -0.2691F, 1.3687F));

		PartDefinition cube_r181 = Body11.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(33, 4).addBox(2.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0501F, 0.413F, 0.0873F, -0.2691F, 1.3338F));

		PartDefinition cube_r182 = Body11.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(91, 75).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0501F, 0.413F, 0.2027F, -0.1983F, 0.8455F));

		PartDefinition cube_r183 = Body11.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(91, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0501F, 0.413F, 0.2683F, -0.1024F, 0.4147F));

		PartDefinition cube_r184 = Body11.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(56, 91).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3501F, 2.313F, 0.2027F, -0.1983F, 0.8804F));

		PartDefinition cube_r185 = Body11.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(49, 91).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3501F, 2.313F, 0.2683F, -0.1024F, 0.4496F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7939F, 7.835F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r186 = Body4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(81, 36).addBox(-0.5F, -1.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(79, 34).addBox(-0.5F, -1.0F, -3.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.765F, 6.6818F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r187 = Body4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(57, 70).addBox(-1.5F, -1.0354F, 0.0445F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 1.5858F, 3.682F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r188 = Body4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(20, 71).addBox(0.0F, -1.85F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5144F, 6.2996F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r189 = Body4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(96, 17).addBox(0.0F, -1.825F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.295F, 4.513F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r190 = Body4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(17, 96).addBox(-1.0F, -2.3648F, 2.1356F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 49).addBox(-1.5F, -0.0648F, 0.1356F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, -0.2142F, -0.118F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r191 = Body4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 96).addBox(-1.0F, -2.5148F, 0.0357F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1934F, -0.0202F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r192 = Body4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(68, 59).addBox(-1.5F, -0.9648F, 3.4357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(65, 56).addBox(-1.5F, -0.9648F, 0.0357F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6651F, -0.4152F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r193 = Body4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(98, 75).mirror().addBox(-0.9822F, 0.1953F, -0.3736F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2562F, 6.278F, 0.5049F, 0.1989F, -0.5888F));

		PartDefinition cube_r194 = Body4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(54, 26).mirror().addBox(-3.5262F, -1.5832F, -0.366F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2562F, 6.278F, 0.157F, 0.5138F, -1.5169F));

		PartDefinition cube_r195 = Body4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(68, 92).mirror().addBox(-2.9718F, -0.2378F, -0.366F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2562F, 6.278F, 0.3842F, 0.3824F, -1.003F));

		PartDefinition cube_r196 = Body4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(83, 43).mirror().addBox(-5.9916F, -2.5101F, -0.4852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.5562F, 4.278F, 0.1227F, 0.3866F, -1.3399F));

		PartDefinition cube_r197 = Body4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(92, 42).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.5562F, 4.278F, 0.2903F, 0.286F, -0.8419F));

		PartDefinition cube_r198 = Body4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(74, 46).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.5562F, 4.278F, 0.3829F, 0.147F, -0.4178F));

		PartDefinition cube_r199 = Body4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(74, 34).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0562F, 2.278F, 0.3027F, 0.1111F, -0.4282F));

		PartDefinition cube_r200 = Body4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(71, 54).mirror().addBox(-7.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0562F, 2.278F, 0.1018F, 0.3016F, -1.3469F));

		PartDefinition cube_r201 = Body4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(92, 29).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0562F, 2.278F, 0.2308F, 0.2205F, -0.8568F));

		PartDefinition cube_r202 = Body4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(28, 92).mirror().addBox(-3.4931F, -0.4609F, -0.502F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.6562F, 0.278F, 0.2075F, 0.194F, -0.8616F));

		PartDefinition cube_r203 = Body4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(59, 34).mirror().addBox(-8.8856F, -2.0217F, -0.502F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.6562F, 0.278F, 0.0937F, 0.2676F, -1.3492F));

		PartDefinition cube_r204 = Body4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(92, 27).mirror().addBox(-1.548F, 0.2132F, -0.5137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6562F, 0.278F, 0.2708F, 0.0966F, -0.4315F));

		PartDefinition cube_r205 = Body4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(68, 92).addBox(0.9718F, -0.2378F, -0.366F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2562F, 6.278F, 0.3842F, -0.3824F, 1.003F));

		PartDefinition cube_r206 = Body4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(54, 26).addBox(2.5262F, -1.5832F, -0.366F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2562F, 6.278F, 0.157F, -0.5138F, 1.5169F));

		PartDefinition cube_r207 = Body4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(98, 75).addBox(-0.0178F, 0.1953F, -0.3736F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2562F, 6.278F, 0.5049F, -0.1989F, 0.5888F));

		PartDefinition cube_r208 = Body4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(74, 46).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5562F, 4.278F, 0.3829F, -0.147F, 0.4178F));

		PartDefinition cube_r209 = Body4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(92, 42).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5562F, 4.278F, 0.2903F, -0.286F, 0.8419F));

		PartDefinition cube_r210 = Body4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(83, 43).addBox(2.9916F, -2.5101F, -0.4852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5562F, 4.278F, 0.1227F, -0.3866F, 1.3399F));

		PartDefinition cube_r211 = Body4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(92, 29).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0562F, 2.278F, 0.2308F, -0.2205F, 0.8568F));

		PartDefinition cube_r212 = Body4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(71, 54).addBox(2.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0562F, 2.278F, 0.1018F, -0.3016F, 1.3469F));

		PartDefinition cube_r213 = Body4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(74, 34).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0562F, 2.278F, 0.3027F, -0.1111F, 0.4282F));

		PartDefinition cube_r214 = Body4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(92, 27).addBox(-0.4521F, 0.2132F, -0.5137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6562F, 0.278F, 0.2708F, -0.0966F, 0.4315F));

		PartDefinition cube_r215 = Body4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(59, 34).addBox(2.8856F, -2.0217F, -0.502F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.6562F, 0.278F, 0.0937F, -0.2676F, 1.3492F));

		PartDefinition cube_r216 = Body4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(28, 92).addBox(1.4931F, -0.4609F, -0.502F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.6562F, 0.278F, 0.2075F, -0.194F, 0.8616F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 5.6375F, 7.6436F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r217 = bone.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(38, 96).addBox(-0.7551F, 0.5655F, -3.3823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4802F, 1.7987F, -0.0426F, 1.656F, -0.2056F, 1.0926F));

		PartDefinition cube_r218 = bone.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(33, 96).addBox(-0.7551F, -1.7399F, -3.3208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4802F, 1.7987F, -0.0426F, 2.5723F, -0.2056F, 1.0926F));

		PartDefinition cube_r219 = bone.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(76, 56).addBox(-0.7551F, -0.2767F, -3.3277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4802F, 1.7987F, -0.0426F, 2.0051F, -0.2056F, 1.0926F));

		PartDefinition cube_r220 = bone.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(66, 84).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1358F, 2.233F, -1.7987F, 0.9449F, 0.294F, 0.8446F));

		PartDefinition cube_r221 = bone.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(96, 22).addBox(-0.7652F, -0.4952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 0).addBox(-0.7652F, -1.0952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(51, 76).addBox(-0.7652F, -0.7952F, -3.1369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4802F, 1.7987F, -0.2426F, 0.7704F, 0.294F, 0.8446F));

		PartDefinition cube_r222 = bone.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(59, 84).addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9884F, 1.9744F, -2.1142F, 0.6308F, 0.294F, 0.8446F));

		PartDefinition cube_r223 = bone.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(42, 76).addBox(-0.6F, 0.05F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1254F, 0.4007F, -0.5998F, 0.4082F, -0.0607F, -0.2118F));

		PartDefinition cube_r224 = bone.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(95, 69).addBox(-0.6F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1934F, 0.1254F, 1.3245F, -0.0607F, -0.2118F));

		PartDefinition bone4 = Body4.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 5.6375F, 7.6436F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r225 = bone4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(38, 96).mirror().addBox(-0.2449F, 0.5655F, -3.3823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 1.7987F, -0.0426F, 1.656F, 0.2056F, -1.0926F));

		PartDefinition cube_r226 = bone4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(33, 96).mirror().addBox(-0.2449F, -1.7399F, -3.3208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 1.7987F, -0.0426F, 2.5723F, 0.2056F, -1.0926F));

		PartDefinition cube_r227 = bone4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(76, 56).mirror().addBox(-0.2449F, -0.2767F, -3.3277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 1.7987F, -0.0426F, 2.0051F, 0.2056F, -1.0926F));

		PartDefinition cube_r228 = bone4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(66, 84).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1358F, 2.233F, -1.7987F, 0.9449F, -0.294F, -0.8446F));

		PartDefinition cube_r229 = bone4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(96, 22).mirror().addBox(-0.2348F, -0.4952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 0).mirror().addBox(-0.2348F, -1.0952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(51, 76).mirror().addBox(-0.2348F, -0.7952F, -3.1369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 1.7987F, -0.2426F, 0.7704F, -0.294F, -0.8446F));

		PartDefinition cube_r230 = bone4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(59, 84).mirror().addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.9884F, 1.9744F, -2.1142F, 0.6308F, -0.294F, -0.8446F));

		PartDefinition cube_r231 = bone4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(42, 76).mirror().addBox(-0.4F, 0.05F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1254F, 0.4007F, -0.5998F, 0.4082F, 0.0607F, 0.2118F));

		PartDefinition cube_r232 = bone4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(95, 69).mirror().addBox(-0.4F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1934F, 0.1254F, 1.3245F, 0.0607F, 0.2118F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3565F, 7.5234F, 8.5338F, 0.6627F, -0.7198F, -0.3929F));

		PartDefinition cube_r233 = HindlimbL.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(69, 22).addBox(2.0F, 0.5F, -1.5F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(41, 88).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2391F, -0.4507F, 0.6181F, 0.0F, 0.0F, 0.6109F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3565F, 7.5234F, 8.5338F, 0.5158F, 0.3544F, 0.112F));

		PartDefinition cube_r234 = HindlimbL2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(70, 43).addBox(-6.0F, 0.5F, -1.5F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(88, 64).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2391F, -0.4507F, 0.6181F, 0.0F, 0.0F, -0.6109F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1553F, 6.6221F, -0.0695F, -0.0433F, 0.0106F));

		PartDefinition cube_r235 = Body5.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(101, 43).addBox(-1.0F, -1.85F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 36).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -0.4693F, 0.0826F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r236 = Body5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(101, 21).addBox(0.0F, 0.9855F, -1.2826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6066F, 1.5466F, 0.637F, 0.0F, 0.0F));

		PartDefinition tail = Body5.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -0.0362F, 2.7845F, -0.031F, -0.1745F, 0.0054F));

		PartDefinition cube_r237 = tail.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(30, 53).addBox(-1.0F, -1.8F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 0).addBox(-1.5F, 0.05F, 3.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r238 = tail.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(101, 47).addBox(-1.0F, -1.875F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3476F, -0.0005F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r239 = tail.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, 0.8984F, -1.4174F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3759F, 2.464F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r240 = tail.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(34, 82).addBox(0.0F, 0.8984F, -1.4174F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4759F, 0.464F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body6 = tail.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0917F, 3.9284F, -0.0443F, -0.1744F, 0.0077F));

		PartDefinition cube_r241 = Body6.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(58, 101).addBox(-1.0F, -2.4F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 4).addBox(-1.0F, -2.475F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 48).addBox(-1.5F, -0.55F, -0.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.2083F, 0.0716F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r242 = Body6.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(72, 29).addBox(0.0F, 2.923F, 0.3489F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 15).addBox(0.0F, 1.5607F, -1.5342F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2842F, 0.5356F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body9 = Body6.addOrReplaceChild("Body9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, 3.9F, -0.1299F, -0.3464F, 0.0443F));

		PartDefinition cube_r243 = Body9.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(26, 102).addBox(-1.0F, -2.375F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 3).addBox(-1.0F, -2.325F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 64).addBox(-1.5F, -0.55F, -0.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.2102F, 0.1506F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r244 = Body9.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(85, 31).addBox(0.0F, 4.0628F, 2.4063F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3861F, -3.3854F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r245 = Body9.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 65).addBox(-1.5F, -0.9496F, -0.0581F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, 2.6102F, 0.1506F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Body7 = Body9.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2172F, 4.0321F, -0.0092F, -0.3054F, 0.0028F));

		PartDefinition cube_r246 = Body7.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(23, 102).addBox(-1.0F, -1.3162F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0724F, 4.0022F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r247 = Body7.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(29, 102).addBox(-1.0F, -1.6412F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1248F, 2.0029F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r248 = Body7.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(102, 7).addBox(-1.0F, -1.7662F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1772F, 0.0035F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r249 = Body7.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(52, 57).addBox(-1.5F, -0.8847F, -5.0602F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, 1.8228F, 5.0035F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r250 = Body7.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(47, 49).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1772F, 0.0035F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body12 = Body7.addOrReplaceChild("Body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1503F, 5.0065F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r251 = Body12.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(13, 50).addBox(-1.0F, -1.1162F, 0.9904F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1248F, 2.0029F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r252 = Body12.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(38, 77).addBox(-1.0F, -1.3412F, 0.9904F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1772F, 0.0036F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r253 = Body12.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 50).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1772F, 0.0036F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body13 = Body12.addOrReplaceChild("Body13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, 5.0F, -0.0886F, 0.1739F, -0.0154F));

		PartDefinition cube_r254 = Body13.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(19, 90).addBox(-1.0F, -0.6162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0725F, 4.0022F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r255 = Body13.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(101, 59).addBox(-1.0F, -0.8162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1248F, 2.0029F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r256 = Body13.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(12, 87).addBox(-1.0F, -0.9412F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1772F, 0.0036F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r257 = Body13.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(57, 39).addBox(-1.5F, -1.0155F, -0.0619F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 1.8228F, 0.0036F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r258 = Body13.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(39, 57).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1772F, 0.0036F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body14 = Body13.addOrReplaceChild("Body14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2322F, 4.9486F, -0.0567F, 0.3921F, -0.0217F));

		PartDefinition cube_r259 = Body14.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(32, 102).addBox(-1.0F, -0.6162F, 0.9904F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1772F, 0.0035F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r260 = Body14.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(29, 77).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1772F, 0.0035F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body8 = Body14.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4801F, 2.6755F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r261 = Body8.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(13, 57).addBox(-1.5F, 2.8784F, 11.891F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 1.0839F, 1.7388F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r262 = Body8.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(78, 15).addBox(-1.5F, -1.0178F, -0.0148F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 10.0323F, 5.4122F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r263 = Body8.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(46, 8).addBox(-1.5F, -0.0178F, -0.0148F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.0946F, 4.0917F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r264 = Body8.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(48, 64).addBox(-1.5F, -0.4178F, -0.2148F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0839F, 1.7388F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r265 = Body8.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(73, 84).addBox(-1.5F, -0.0739F, 0.0534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -0.4661F, 0.2638F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head = Nannopterygius.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 2.5043F, -19.3344F, -0.2474F, -0.3335F, -0.0811F));

		PartDefinition cube_r266 = Head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(9, 77).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5536F, -0.3494F, -7.4374F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r267 = Head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(24, 64).addBox(-1.5F, 0.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5536F, -1.6336F, 0.308F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r268 = Head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(77, 70).addBox(-1.995F, -0.0007F, -1.0124F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0586F, -2.4489F, -0.2404F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r269 = Head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(72, 12).addBox(-2.0F, -0.0007F, -0.0124F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0586F, -2.5794F, -1.2319F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r270 = Head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(72, 6).addBox(-1.5F, -0.0257F, 0.0126F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0536F, -2.6235F, -2.2607F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r271 = Head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(71, 48).addBox(-1.5F, -1.3257F, -0.2874F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, -1.2726F, -2.8565F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r272 = Head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(79, 39).addBox(-0.5F, 0.0F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5536F, -1.2689F, -5.8869F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r273 = Head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(33, 71).addBox(-0.5F, -0.0052F, -1.0006F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0536F, -1.7951F, -5.0623F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r274 = Head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(11, 71).addBox(-0.5F, -0.0181F, -1.0294F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0536F, -2.3171F, -4.2035F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r275 = Head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5F, -0.0181F, -1.0294F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0536F, -2.559F, -3.2332F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r276 = Head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(72, 25).addBox(-2.5F, -1.9834F, 0.0891F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4464F, 1.4168F, -0.4106F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r277 = Head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(0, 71).addBox(-2.5F, -1.9834F, -0.0109F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4464F, 1.4168F, -0.4106F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r278 = Head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(66, 70).addBox(-2.5F, -2.0113F, 0.0182F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, 2.2677F, -0.9318F, 0.9687F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9464F, 0.454F, -6.2482F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(86, 99).addBox(-0.5F, -0.5664F, 0.6974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(35, 93).addBox(-0.5F, -0.6164F, 0.0974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.1576F, 1.2907F, -2.2207F, -0.1572F, 0.1745F, -0.0012F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(81, 99).addBox(-0.5F, -0.5591F, -0.4978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(76, 99).addBox(-0.5F, -0.5591F, -1.0978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(71, 99).addBox(-0.5F, -0.5591F, -1.6978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.1576F, 1.2907F, -2.2207F, -0.0525F, 0.1745F, -0.0012F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(66, 99).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3606F, 1.1848F, -3.1108F, -0.0524F, 0.0872F, -0.0012F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(50, 99).addBox(-1.118F, -0.3427F, 6.5743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(87, 96).addBox(-1.118F, -0.3427F, 5.9743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(82, 96).addBox(-1.118F, -0.3677F, 5.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(18, 101).addBox(-1.118F, -0.3177F, 4.1743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(96, 59).addBox(-1.118F, -0.3427F, 4.7743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.4919F, 0.878F, -11.7023F, -0.0175F, 0.0872F, -0.0012F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(77, 96).addBox(-0.8827F, -0.3178F, 3.5943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(53, 96).addBox(-0.8827F, -0.2428F, 2.9943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(96, 50).addBox(-0.8827F, -0.2428F, 2.3943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(48, 96).addBox(-0.8827F, -0.2428F, 1.7943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(96, 47).addBox(-0.8827F, -0.2428F, 1.1943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(96, 44).addBox(-0.8827F, -0.2428F, 0.5943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(43, 96).addBox(-0.8827F, -0.2428F, -0.0057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.4919F, 0.878F, -11.7023F, -0.0174F, 0.0349F, 0.0006F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(88, 35).addBox(-0.5F, 0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1481F, 0.1309F, 0.0034F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(88, 31).addBox(-0.525F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0189F, 0.1409F, -1.1211F, 0.1198F, 0.1418F, 0.015F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(92, 10).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(92, 10).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4107F, -3.0983F, 3.978F, -0.0436F, 0.1004F, 0.0F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(85, 54).addBox(-1.0F, -1.0128F, -1.8393F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.1544F, 4.8394F, 0.0785F, 0.1004F, 0.0F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(27, 82).addBox(-0.4125F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(24, 69).addBox(-0.4625F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.465F, -0.1235F, 2.8965F, 1.6058F, 0.1309F, 0.0011F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(99, 40).addBox(-0.5F, -0.7158F, -1.9036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(40, 99).addBox(-0.5F, -0.6158F, -1.9036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3583F, -0.1482F, 2.7122F, -1.4835F, 0.1178F, 0.0F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(91, 100).addBox(-0.5F, 0.8989F, -0.4068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3583F, -0.1482F, 2.7122F, -2.6442F, 0.1178F, 0.0F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(35, 99).addBox(-0.5F, -1.2545F, 0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3583F, -0.1482F, 2.7122F, 2.2427F, 0.1178F, 0.0F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(79, 92).addBox(-0.5F, -2.3178F, -0.6927F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3583F, -0.1482F, 2.7122F, 1.3701F, 0.1178F, 0.0F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(30, 99).addBox(-0.5F, -0.762F, -2.296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3583F, -0.1482F, 2.7122F, 0.4102F, 0.1178F, 0.0F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(89, 92).addBox(-0.5F, 0.1074F, -0.9419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3583F, -0.1482F, 2.7122F, -0.637F, 0.1178F, 0.0F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(42, 71).addBox(-0.5F, -1.0785F, 0.8961F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3583F, -0.1482F, 2.7122F, -1.7279F, 0.1178F, 0.0F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(99, 28).addBox(-0.5F, -2.1769F, -1.1381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3583F, -0.1482F, 2.7122F, -2.8449F, 0.1178F, 0.0F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(99, 25).addBox(-0.5F, -0.5274F, -2.3992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3583F, -0.1482F, 2.7122F, 2.5656F, 0.1178F, 0.0F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(25, 99).addBox(-0.5F, 1.3463F, -0.6887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3583F, -0.1482F, 2.7122F, 1.4748F, 0.1178F, 0.0F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(99, 18).addBox(-0.5F, -0.5914F, 1.3314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3583F, -0.1482F, 2.7122F, 0.2094F, 0.1178F, 0.0F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(63, 91).addBox(-0.5F, -2.3147F, -0.3464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3583F, -0.1482F, 2.7122F, -0.8378F, 0.1178F, 0.0F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(85, 27).addBox(-0.5F, -1.2225F, -1.9958F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3583F, -0.1482F, 2.7122F, -1.7104F, 0.1178F, 0.0F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(0, 85).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0451F, -1.7693F, 0.3465F, 0.5241F, 0.0998F, 0.0105F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(80, 84).addBox(-0.5F, -0.0886F, -0.0285F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1398F, -2.1914F, 1.2481F, 0.5241F, 0.0998F, 0.0105F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(70, 64).addBox(-0.5F, -0.925F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2638F, 0.995F, 2.5193F, -0.1833F, 0.1004F, 0.0F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(19, 30).addBox(-1.0F, -1.2925F, -2.6419F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -2.1544F, 4.8394F, 0.2443F, 0.1004F, 0.0F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(82, 20).addBox(-1.0F, 0.2819F, -2.0294F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -2.0388F, 0.1856F, 0.5503F, 0.0835F, 0.0308F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(84, 73).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3578F, -0.7425F, -1.3988F, 0.3467F, 0.2054F, 0.0746F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(79, 64).addBox(-1.0F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3441F, -0.1188F, -1.233F, 0.2513F, 0.1942F, 0.019F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(56, 18).addBox(-0.6827F, -0.2664F, -0.316F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6917F, 0.7279F, -11.6979F, 0.0567F, 0.0349F, 0.0006F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(26, 57).addBox(-0.8827F, -0.4164F, -0.316F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.4919F, 0.878F, -11.7023F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(59, 25).addBox(-0.8831F, -0.4669F, -0.3187F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.4919F, 0.878F, -11.7023F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(69, 79).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.875F, 0.807F, -4.6872F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(18, 81).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.875F, 0.482F, -7.3357F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -0.975F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.6274F, 1.0415F, -5.0103F, 0.1746F, 0.0829F, 0.0015F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(78, 79).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.6274F, 1.0415F, -5.0103F, -0.0698F, 0.0829F, 0.0015F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 75).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-0.5188F, 0.482F, -7.3374F, 0.1048F, 0.0829F, 0.0015F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(66, 74).addBox(-1.1889F, -0.5197F, 4.1539F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4919F, 0.878F, -11.7023F, 0.0175F, 0.0829F, 0.0015F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(60, 79).addBox(-0.5F, -0.5F, -0.825F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1201F, 0.8488F, -1.1611F, -0.2204F, 0.1158F, -0.0389F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(92, 84).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5367F, 1.8599F, 5.229F, 0.9512F, 0.1004F, 0.0F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(84, 92).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4423F, 2.1937F, 4.2911F, 0.3403F, 0.1004F, 0.0F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(7, 91).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3421F, 2.2286F, 3.2967F, 0.0349F, 0.1004F, 0.0F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(87, 77).addBox(-0.9678F, -1.1295F, 0.0912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.2101F, -4.028F, -0.0494F, 0.2368F, -0.0689F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(9, 82).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2009F, 0.1309F, 0.0034F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.0536F, 0.454F, -6.2482F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(86, 99).mirror().addBox(-0.5F, -0.5664F, 0.6974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(35, 93).mirror().addBox(-0.5F, -0.6164F, 0.0974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.1576F, 1.2907F, -2.2207F, -0.1572F, -0.1745F, 0.0012F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(81, 99).mirror().addBox(-0.5F, -0.5591F, -0.4978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(76, 99).mirror().addBox(-0.5F, -0.5591F, -1.0978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(71, 99).mirror().addBox(-0.5F, -0.5591F, -1.6978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.1576F, 1.2907F, -2.2207F, -0.0525F, -0.1745F, 0.0012F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(66, 99).mirror().addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.3606F, 1.1848F, -3.1108F, -0.0524F, -0.0872F, 0.0012F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(50, 99).mirror().addBox(0.1181F, -0.3427F, 6.5743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(87, 96).mirror().addBox(0.1181F, -0.3427F, 5.9743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(82, 96).mirror().addBox(0.1181F, -0.3677F, 5.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(18, 101).mirror().addBox(0.1181F, -0.3177F, 4.1743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(96, 59).mirror().addBox(0.1181F, -0.3427F, 4.7743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.4919F, 0.878F, -11.7023F, -0.0175F, -0.0872F, 0.0012F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(77, 96).mirror().addBox(-0.1173F, -0.3178F, 3.5943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(53, 96).mirror().addBox(-0.1173F, -0.2428F, 2.9943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(96, 50).mirror().addBox(-0.1173F, -0.2428F, 2.3943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(48, 96).mirror().addBox(-0.1173F, -0.2428F, 1.7943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(96, 47).mirror().addBox(-0.1173F, -0.2428F, 1.1943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(96, 44).mirror().addBox(-0.1173F, -0.2428F, 0.5943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(43, 96).mirror().addBox(-0.1173F, -0.2428F, -0.0057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.4919F, 0.878F, -11.7023F, -0.0174F, -0.0349F, -0.0006F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(88, 35).mirror().addBox(-0.5F, 0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1481F, -0.1309F, -0.0034F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(88, 31).mirror().addBox(-0.475F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0189F, 0.1409F, -1.1211F, 0.1198F, -0.1418F, -0.015F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(92, 10).mirror().addBox(-0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(92, 10).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4107F, -3.0983F, 3.978F, -0.0436F, -0.1004F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(85, 54).mirror().addBox(0.0F, -1.0128F, -1.8393F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1544F, 4.8394F, 0.0785F, -0.1004F, 0.0F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(27, 82).mirror().addBox(-0.5875F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(24, 69).mirror().addBox(-0.5375F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.465F, -0.1235F, 2.8965F, 1.6058F, -0.1309F, -0.0011F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(99, 40).mirror().addBox(-0.5F, -0.7158F, -1.9036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(40, 99).mirror().addBox(-0.5F, -0.6158F, -1.9036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3583F, -0.1482F, 2.7122F, -1.4835F, -0.1178F, 0.0F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(91, 100).mirror().addBox(-0.5F, 0.8989F, -0.4068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3583F, -0.1482F, 2.7122F, -2.6442F, -0.1178F, 0.0F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(35, 99).mirror().addBox(-0.5F, -1.2545F, 0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3583F, -0.1482F, 2.7122F, 2.2427F, -0.1178F, 0.0F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(79, 92).mirror().addBox(-0.5F, -2.3178F, -0.6927F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3583F, -0.1482F, 2.7122F, 1.3701F, -0.1178F, 0.0F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(30, 99).mirror().addBox(-0.5F, -0.762F, -2.296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3583F, -0.1482F, 2.7122F, 0.4102F, -0.1178F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(89, 92).mirror().addBox(-0.5F, 0.1074F, -0.9419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3583F, -0.1482F, 2.7122F, -0.637F, -0.1178F, 0.0F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(42, 71).mirror().addBox(-0.5F, -1.0785F, 0.8961F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3583F, -0.1482F, 2.7122F, -1.7279F, -0.1178F, 0.0F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(99, 28).mirror().addBox(-0.5F, -2.1769F, -1.1381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3583F, -0.1482F, 2.7122F, -2.8449F, -0.1178F, 0.0F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(99, 25).mirror().addBox(-0.5F, -0.5274F, -2.3992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3583F, -0.1482F, 2.7122F, 2.5656F, -0.1178F, 0.0F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(25, 99).mirror().addBox(-0.5F, 1.3463F, -0.6887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3583F, -0.1482F, 2.7122F, 1.4748F, -0.1178F, 0.0F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(99, 18).mirror().addBox(-0.5F, -0.5914F, 1.3314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3583F, -0.1482F, 2.7122F, 0.2094F, -0.1178F, 0.0F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(63, 91).mirror().addBox(-0.5F, -2.3147F, -0.3464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3583F, -0.1482F, 2.7122F, -0.8378F, -0.1178F, 0.0F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(85, 27).mirror().addBox(-0.5F, -1.2225F, -1.9958F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3583F, -0.1482F, 2.7122F, -1.7104F, -0.1178F, 0.0F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0451F, -1.7693F, 0.3465F, 0.5241F, -0.0998F, -0.0105F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(80, 84).mirror().addBox(-0.5F, -0.0886F, -0.0285F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1398F, -2.1914F, 1.2481F, 0.5241F, -0.0998F, -0.0105F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(70, 64).mirror().addBox(-0.5F, -0.925F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2638F, 0.995F, 2.5193F, -0.1833F, -0.1004F, 0.0F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(19, 30).mirror().addBox(0.0F, -1.2925F, -2.6419F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1544F, 4.8394F, 0.2443F, -0.1004F, 0.0F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(82, 20).mirror().addBox(0.0F, 0.2819F, -2.0294F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.0388F, 0.1856F, 0.5503F, -0.0835F, -0.0308F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(84, 73).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.3578F, -0.7425F, -1.3988F, 0.3467F, -0.2054F, -0.0746F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(79, 64).mirror().addBox(0.0F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3441F, -0.1188F, -1.233F, 0.2513F, -0.1942F, -0.019F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.3173F, -0.2664F, -0.316F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6917F, 0.7279F, -11.6979F, 0.0567F, -0.0349F, -0.0006F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(26, 57).mirror().addBox(-0.1173F, -0.4164F, -0.316F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.4919F, 0.878F, -11.7023F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(59, 25).mirror().addBox(-0.1169F, -0.4669F, -0.3187F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4919F, 0.878F, -11.7023F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(69, 79).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.875F, 0.807F, -4.6872F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(18, 81).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.875F, 0.482F, -7.3357F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, -0.975F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.6274F, 1.0415F, -5.0103F, 0.1746F, -0.0829F, -0.0015F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(78, 79).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.6274F, 1.0415F, -5.0103F, -0.0698F, -0.0829F, -0.0015F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(0.5188F, 0.482F, -7.3374F, 0.1048F, -0.0829F, -0.0015F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(66, 74).mirror().addBox(0.1889F, -0.5197F, 4.1539F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4919F, 0.878F, -11.7023F, 0.0175F, -0.0829F, -0.0015F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(60, 79).mirror().addBox(-0.5F, -0.5F, -0.825F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1201F, 0.8488F, -1.1611F, -0.2204F, -0.1158F, 0.0389F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(92, 84).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5367F, 1.8599F, 5.229F, 0.9512F, -0.1004F, 0.0F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(84, 92).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4423F, 2.1937F, 4.2911F, 0.3403F, -0.1004F, 0.0F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(7, 91).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3421F, 2.2286F, 3.2967F, 0.0349F, -0.1004F, 0.0F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(87, 77).mirror().addBox(-0.0322F, -1.1295F, 0.0912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.2101F, -4.028F, -0.0494F, -0.2368F, 0.0689F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(9, 82).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2009F, -0.1309F, -0.0034F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 1.7624F, 0.3126F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r369 = Jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(81, 5).mirror().addBox(-0.0156F, 0.2352F, -5.617F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.3713F, 0.9003F, -5.8082F, -0.2925F, -0.0828F, 0.0025F));

		PartDefinition cube_r370 = Jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(80, 46).mirror().addBox(-0.0156F, 0.1204F, -3.1639F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3713F, 0.9003F, -5.8082F, -0.2881F, -0.0828F, 0.0025F));

		PartDefinition cube_r371 = Jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.0156F, -0.4685F, -3.1041F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.3713F, 0.9003F, -5.8082F, -0.1921F, -0.0828F, 0.0025F));

		PartDefinition cube_r372 = Jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.0156F, -0.8354F, -5.7325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3713F, 0.9003F, -5.8082F, -0.1005F, -0.0828F, 0.0025F));

		PartDefinition cube_r373 = Jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(19, 93).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false)
				.texOffs(19, 93).addBox(2.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-1.5F, -0.6948F, 0.4828F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r374 = Jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(45, 99).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(45, 99).addBox(2.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.5F, 0.7675F, 1.122F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r375 = Jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-0.3047F, -0.5F, -7.4799F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7213F, 0.2003F, -11.1582F, -0.0874F, -0.0654F, 0.0025F));

		PartDefinition cube_r376 = Jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(38, 39).mirror().addBox(0.0396F, -0.7544F, -7.4621F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.7213F, 0.2003F, -11.1582F, -0.0524F, -0.0175F, 0.0F));

		PartDefinition cube_r377 = Jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(19, 39).mirror().addBox(-0.3047F, -0.7544F, -7.4947F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.7213F, 0.2003F, -11.1582F, -0.0525F, -0.0654F, 0.0025F));

		PartDefinition cube_r378 = Jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(98, 65).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.3209F, 2.391F, -2.3525F, 0.0436F, -0.1222F, 0.0F));

		PartDefinition cube_r379 = Jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(59, 64).mirror().addBox(-0.1F, -0.6761F, -4.8354F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.4301F, -0.9186F, -0.0087F, -0.1222F, 0.0F));

		PartDefinition cube_r380 = Jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.5F, -1.0F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.0174F, 2.334F, -4.8246F, -0.3142F, -0.1222F, 0.0F));

		PartDefinition cube_r381 = Jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(98, 62).mirror().addBox(-0.3707F, -1.0087F, -2.4611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(58, 98).mirror().addBox(-0.3707F, -1.0087F, -3.0611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(11, 97).mirror().addBox(-0.3707F, -0.9836F, -3.6611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3713F, 0.9003F, -5.8082F, -0.1665F, -0.17F, 0.0072F));

		PartDefinition cube_r382 = Jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(98, 37).mirror().addBox(-0.3047F, -1.1832F, -7.4869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(98, 34).mirror().addBox(-0.3047F, -1.1832F, -6.8869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(98, 31).mirror().addBox(-0.3047F, -1.1832F, -6.2869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(20, 98).mirror().addBox(-0.3047F, -1.1832F, -5.6869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(97, 96).mirror().addBox(-0.3047F, -1.1832F, -5.0869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(97, 93).mirror().addBox(-0.3047F, -1.1832F, -4.4869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(97, 90).mirror().addBox(-0.3047F, -1.1832F, -3.8869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(65, 36).mirror().addBox(-0.3047F, -1.1082F, -3.2869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(19, 36).mirror().addBox(-0.3047F, -1.1082F, -2.6869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7213F, 0.2003F, -11.1582F, -0.0263F, -0.0654F, 0.0025F));

		PartDefinition cube_r383 = Jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(97, 83).mirror().addBox(-0.3978F, -1.0831F, -2.0859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 93).mirror().addBox(-0.3228F, -1.0331F, -1.4859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(28, 87).mirror().addBox(-0.3228F, -1.0331F, -0.8859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7213F, 0.2003F, -11.1582F, -0.0265F, -0.1177F, 0.0053F));

		PartDefinition cube_r384 = Jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(97, 80).mirror().addBox(-0.2983F, -1.3469F, -5.8515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(97, 77).mirror().addBox(-0.2983F, -1.3469F, -5.2515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(97, 56).mirror().addBox(-0.2983F, -1.3469F, -4.6515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(97, 53).mirror().addBox(-0.2493F, -1.3466F, -4.0716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3713F, 0.9003F, -5.8082F, -0.0703F, -0.1351F, 0.0053F));

		PartDefinition cube_r385 = Jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(34, 86).mirror().addBox(-0.05F, -0.6465F, -0.817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.4301F, -0.9186F, 0.4246F, -0.0427F, 0.0362F));

		PartDefinition cube_r386 = Jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(97, 9).mirror().addBox(-0.5F, -0.65F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0306F)).mirror(false)
				.texOffs(97, 9).addBox(2.5F, -0.65F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0306F)), PartPose.offsetAndRotation(-1.5F, 0.9617F, 0.2471F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r387 = Jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(97, 6).mirror().addBox(-0.5F, -0.45F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(97, 6).addBox(2.5F, -0.45F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.5F, 0.0925F, 0.5544F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r388 = Jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(16, 86).mirror().addBox(-0.5F, 0.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(16, 86).addBox(2.5F, 0.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.5F, 0.8557F, -2.1205F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r389 = Jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(85, 84).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.033F)).mirror(false), PartPose.offsetAndRotation(-1.2128F, 2.4558F, -3.2329F, -0.1047F, -0.1222F, 0.0F));

		PartDefinition cube_r390 = Jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(97, 3).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.464F, 2.0946F, -1.4352F, 0.3054F, -0.1222F, 0.0F));

		PartDefinition cube_r391 = Jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(0, 30).addBox(-0.6953F, -0.5F, -7.4799F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7213F, 0.2003F, -11.1582F, -0.0874F, 0.0654F, -0.0025F));

		PartDefinition cube_r392 = Jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(38, 39).addBox(-1.0396F, -0.7544F, -7.4621F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.7213F, 0.2003F, -11.1582F, -0.0524F, 0.0175F, 0.0F));

		PartDefinition cube_r393 = Jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(80, 46).addBox(-0.9844F, 0.1204F, -3.1639F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3713F, 0.9003F, -5.8082F, -0.2881F, 0.0828F, -0.0025F));

		PartDefinition cube_r394 = Jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(0, 58).addBox(-0.9844F, -0.4685F, -3.1041F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.3713F, 0.9003F, -5.8082F, -0.1921F, 0.0828F, -0.0025F));

		PartDefinition cube_r395 = Jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(81, 5).addBox(-0.9844F, 0.2352F, -5.617F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.3713F, 0.9003F, -5.8082F, -0.2925F, 0.0828F, -0.0025F));

		PartDefinition cube_r396 = Jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(80, 0).addBox(-0.9844F, -0.8354F, -5.7325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3713F, 0.9003F, -5.8082F, -0.1005F, 0.0828F, -0.0025F));

		PartDefinition cube_r397 = Jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(19, 39).addBox(-0.6953F, -0.7544F, -7.4947F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.7213F, 0.2003F, -11.1582F, -0.0525F, 0.0654F, -0.0025F));

		PartDefinition cube_r398 = Jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(98, 65).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.3209F, 2.391F, -2.3525F, 0.0436F, 0.1222F, 0.0F));

		PartDefinition cube_r399 = Jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(59, 64).addBox(-0.9F, -0.6761F, -4.8354F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.9F, 1.4301F, -0.9186F, -0.0087F, 0.1222F, 0.0F));

		PartDefinition cube_r400 = Jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -1.0F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.0174F, 2.334F, -4.8246F, -0.3142F, 0.1222F, 0.0F));

		PartDefinition cube_r401 = Jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(98, 62).addBox(-0.6293F, -1.0087F, -2.4611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(58, 98).addBox(-0.6293F, -1.0087F, -3.0611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(11, 97).addBox(-0.6293F, -0.9836F, -3.6611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3713F, 0.9003F, -5.8082F, -0.1665F, 0.17F, -0.0072F));

		PartDefinition cube_r402 = Jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(98, 37).addBox(-0.6953F, -1.1832F, -7.4869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 34).addBox(-0.6953F, -1.1832F, -6.8869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 31).addBox(-0.6953F, -1.1832F, -6.2869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(20, 98).addBox(-0.6953F, -1.1832F, -5.6869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 96).addBox(-0.6953F, -1.1832F, -5.0869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 93).addBox(-0.6953F, -1.1832F, -4.4869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 90).addBox(-0.6953F, -1.1832F, -3.8869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(65, 36).addBox(-0.6953F, -1.1082F, -3.2869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(19, 36).addBox(-0.6953F, -1.1082F, -2.6869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7213F, 0.2003F, -11.1582F, -0.0263F, 0.0654F, -0.0025F));

		PartDefinition cube_r403 = Jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(97, 83).addBox(-0.6022F, -1.0831F, -2.0859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 93).addBox(-0.6772F, -1.0331F, -1.4859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(28, 87).addBox(-0.6772F, -1.0331F, -0.8859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7213F, 0.2003F, -11.1582F, -0.0265F, 0.1177F, -0.0053F));

		PartDefinition cube_r404 = Jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(97, 80).addBox(-0.7017F, -1.3469F, -5.8515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 77).addBox(-0.7017F, -1.3469F, -5.2515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 56).addBox(-0.7017F, -1.3469F, -4.6515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 53).addBox(-0.7507F, -1.3466F, -4.0716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3713F, 0.9003F, -5.8082F, -0.0703F, 0.1351F, -0.0053F));

		PartDefinition cube_r405 = Jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(34, 86).addBox(-0.95F, -0.6465F, -0.817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.9F, 1.4301F, -0.9186F, 0.4246F, 0.0427F, -0.0362F));

		PartDefinition cube_r406 = Jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(85, 84).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.033F)), PartPose.offsetAndRotation(1.2128F, 2.4558F, -3.2329F, -0.1047F, 0.1222F, 0.0F));

		PartDefinition cube_r407 = Jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(97, 3).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.464F, 2.0946F, -1.4352F, 0.3054F, 0.1222F, 0.0F));

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