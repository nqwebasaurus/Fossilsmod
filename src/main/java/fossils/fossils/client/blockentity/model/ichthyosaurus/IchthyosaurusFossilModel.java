package fossils.fossils.client.blockentity.model.ichthyosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IchthyosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Ichthyosaurus;
	private final ModelPart Body1;
	private final ModelPart Body2;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
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
	private final ModelPart Body12;
	private final ModelPart Body9;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public IchthyosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Ichthyosaurus = this.fossil.getChild("Ichthyosaurus");
		this.Body1 = this.Ichthyosaurus.getChild("Body1");
		this.Body2 = this.Body1.getChild("Body2");
		this.ForelimbL = this.Body2.getChild("ForelimbL");
		this.ForelimbL2 = this.Body2.getChild("ForelimbL2");
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
		this.Body12 = this.Body6.getChild("Body12");
		this.Body9 = this.Body12.getChild("Body9");
		this.Body7 = this.Body9.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Head = this.Ichthyosaurus.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Ichthyosaurus = fossil.addOrReplaceChild("Ichthyosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.1181F, 0.675F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Body1 = Ichthyosaurus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9817F, -18.3422F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(94, 100).addBox(0.0F, -2.0411F, 0.0015F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5817F, 2.7672F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(91, 100).addBox(0.0F, -1.449F, 0.0263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8817F, 0.8672F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(34, 40).addBox(-0.5F, -0.5F, -4.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -1.3817F, 3.2672F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(88, 31).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3658F, 3.4526F, 0.5917F, 0.3269F, -0.3486F));

		PartDefinition cube_r5 = Body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(88, 67).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3658F, 3.4526F, 0.4114F, 0.5333F, -0.7733F));

		PartDefinition cube_r6 = Body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(29, 20).mirror().addBox(-11.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3658F, 3.4526F, 0.0893F, 0.656F, -1.3367F));

		PartDefinition cube_r7 = Body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, 50).mirror().addBox(-6.8126F, -0.8451F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6658F, 1.6526F, 0.0006F, 0.5423F, -1.1029F));

		PartDefinition cube_r8 = Body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(86, 61).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6658F, 1.6526F, 0.2524F, 0.4937F, -0.6024F));

		PartDefinition cube_r9 = Body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(86, 61).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6658F, 1.6526F, 0.2524F, -0.4937F, 0.6024F));

		PartDefinition cube_r10 = Body1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(64, 50).addBox(1.8126F, -0.8451F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6658F, 1.6526F, 0.0006F, -0.5423F, 1.1029F));

		PartDefinition cube_r11 = Body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(29, 20).addBox(2.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3658F, 3.4526F, 0.0893F, -0.656F, 1.3367F));

		PartDefinition cube_r12 = Body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(88, 67).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3658F, 3.4526F, 0.4114F, -0.5333F, 0.7733F));

		PartDefinition cube_r13 = Body1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(88, 31).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3658F, 3.4526F, 0.5917F, -0.3269F, 0.3486F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.926F, 4.6368F, 0.0701F, -0.0871F, -0.0061F));

		PartDefinition cube_r14 = Body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(89, 86).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.4169F, 0.4014F, -0.7467F));

		PartDefinition cube_r15 = Body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(27, 28).mirror().addBox(-15.9916F, -2.5101F, -0.4853F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.1766F, 0.5453F, -1.2632F));

		PartDefinition cube_r16 = Body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(89, 88).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.541F, 0.2042F, -0.3378F));

		PartDefinition cube_r17 = Body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(90, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.5261F, 0.2453F, -0.3427F));

		PartDefinition cube_r18 = Body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(90, 6).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.3843F, 0.4332F, -0.7615F));

		PartDefinition cube_r19 = Body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(29, 2).mirror().addBox(-14.9916F, -2.5101F, -0.4853F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.1276F, 0.5579F, -1.2904F));

		PartDefinition cube_r20 = Body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(27, 22).mirror().addBox(-16.9916F, -2.5101F, -0.4852F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5398F, 4.2158F, 0.1766F, 0.5453F, -1.2632F));

		PartDefinition cube_r21 = Body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(74, 90).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5398F, 4.2158F, 0.4169F, 0.4014F, -0.7467F));

		PartDefinition cube_r22 = Body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(90, 74).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5398F, 4.2158F, 0.541F, 0.2042F, -0.3378F));

		PartDefinition cube_r23 = Body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(27, 24).mirror().addBox(-16.9916F, -2.5101F, -0.4852F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6398F, 6.2158F, 0.1645F, 0.512F, -1.2693F));

		PartDefinition cube_r24 = Body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(90, 76).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6398F, 6.2158F, 0.3894F, 0.3775F, -0.7572F));

		PartDefinition cube_r25 = Body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(90, 78).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6398F, 6.2158F, 0.5075F, 0.1925F, -0.3444F));

		PartDefinition cube_r26 = Body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(90, 80).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 8.2158F, 0.4952F, 0.1232F, -0.3474F));

		PartDefinition cube_r27 = Body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(81, 90).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 8.2158F, 0.4068F, 0.3091F, -0.7524F));

		PartDefinition cube_r28 = Body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(27, 26).mirror().addBox(-16.9916F, -2.5101F, -0.4852F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 8.2158F, 0.218F, 0.46F, -1.2453F));

		PartDefinition cube_r29 = Body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(27, 26).addBox(2.9916F, -2.5101F, -0.4852F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 8.2158F, 0.1528F, -0.4786F, 1.2749F));

		PartDefinition cube_r30 = Body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(81, 90).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 8.2158F, 0.3623F, -0.3534F, 0.7668F));

		PartDefinition cube_r31 = Body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(90, 80).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 8.2158F, 0.4741F, -0.1806F, 0.3506F));

		PartDefinition cube_r32 = Body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(90, 78).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6398F, 6.2158F, 0.5075F, -0.1925F, 0.3444F));

		PartDefinition cube_r33 = Body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(90, 76).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6398F, 6.2158F, 0.3894F, -0.3775F, 0.7572F));

		PartDefinition cube_r34 = Body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(27, 24).addBox(2.9916F, -2.5101F, -0.4852F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6398F, 6.2158F, 0.1645F, -0.512F, 1.2693F));

		PartDefinition cube_r35 = Body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(90, 74).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5398F, 4.2158F, 0.541F, -0.2042F, 0.3378F));

		PartDefinition cube_r36 = Body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(74, 90).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5398F, 4.2158F, 0.4169F, -0.4014F, 0.7467F));

		PartDefinition cube_r37 = Body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(27, 22).addBox(2.9916F, -2.5101F, -0.4852F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5398F, 4.2158F, 0.1766F, -0.5453F, 1.2632F));

		PartDefinition cube_r38 = Body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(29, 2).addBox(2.9916F, -2.5101F, -0.4853F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.1276F, -0.5579F, 1.2904F));

		PartDefinition cube_r39 = Body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(90, 6).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.3843F, -0.4332F, 0.7615F));

		PartDefinition cube_r40 = Body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(90, 4).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.5261F, -0.2453F, 0.3427F));

		PartDefinition cube_r41 = Body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(89, 88).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.541F, -0.2042F, 0.3378F));

		PartDefinition cube_r42 = Body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(27, 28).addBox(2.9916F, -2.5101F, -0.4853F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.1766F, -0.5453F, 1.2632F));

		PartDefinition cube_r43 = Body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(89, 86).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.4169F, -0.4014F, 0.7467F));

		PartDefinition cube_r44 = Body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(52, 94).addBox(-1.0F, -2.5626F, -0.0066F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 7.7054F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(44, 65).addBox(-1.0F, -2.5277F, -0.0069F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 5.7054F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(22, 60).addBox(-1.0F, -2.0928F, -0.0072F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 3.7054F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(29, 71).addBox(-0.5F, 2.4F, -3.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 6.4941F, 1.3313F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 22).addBox(-4.5F, -2.8288F, -6.293F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 13.2548F, 7.9577F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, 0.0247F, -0.0074F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 2.7054F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(100, 100).addBox(-1.0F, -1.9245F, 0.0355F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8557F, 1.7054F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r51 = Body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(97, 100).addBox(-1.0F, -1.95F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3557F, -0.1946F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 71).addBox(-1.5F, -0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3557F, -0.1946F, 0.2443F, 0.0F, 0.0F));

		PartDefinition ForelimbL = Body2.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0854F, 6.168F, 0.2729F, 0.3199F, -0.2448F, 0.3236F));

		PartDefinition cube_r53 = ForelimbL.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 8).addBox(5.5F, 0.7F, -0.9F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(78, 26).addBox(3.6F, 0.2F, 0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 62).addBox(2.0F, 0.2F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F))
				.texOffs(69, 0).addBox(-0.975F, 0.2F, 1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8996F, -0.0329F, -2.1116F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r54 = ForelimbL.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(78, 50).addBox(-0.7F, -0.5F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8848F, 3.1401F, 1.1884F, 0.0F, -0.6109F, 0.6545F));

		PartDefinition cube_r55 = ForelimbL.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(75, 46).addBox(-1.5F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.1228F, 3.3227F, -2.3116F, 0.0F, 0.3927F, 0.6545F));

		PartDefinition cube_r56 = ForelimbL.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(85, 16).addBox(-1.925F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.0249F, 1.7129F, -1.5708F, 0.0F, 0.4363F, 0.6545F));

		PartDefinition cube_r57 = ForelimbL.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(81, 67).addBox(-1.975F, -0.025F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.3493F, 1.3631F, 1.3884F, 0.0F, -0.4669F, 0.6545F));

		PartDefinition ForelimbL2 = Body2.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0854F, 6.168F, 0.2729F, 0.6165F, 0.0121F, -0.3561F));

		PartDefinition cube_r58 = ForelimbL2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 15).addBox(-13.5F, 0.7F, -0.9F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(80, 0).addBox(-5.6F, 0.2F, 0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 76).addBox(-3.0F, 0.2F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F))
				.texOffs(69, 22).addBox(-2.025F, 0.2F, 1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8996F, -0.0329F, -2.1116F, 0.0F, 0.0F, -0.6545F));

		PartDefinition cube_r59 = ForelimbL2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(18, 80).addBox(-1.3F, -0.5F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.8848F, 3.1401F, 1.1884F, 0.0F, 0.6109F, -0.6545F));

		PartDefinition cube_r60 = ForelimbL2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(27, 76).addBox(-0.5F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-4.1228F, 3.3227F, -2.3116F, 0.0F, -0.3927F, -0.6545F));

		PartDefinition cube_r61 = ForelimbL2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(56, 85).addBox(-0.075F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-2.0249F, 1.7129F, -1.5708F, 0.0F, -0.4363F, -0.6545F));

		PartDefinition cube_r62 = ForelimbL2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(49, 85).addBox(-0.025F, -0.025F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-2.3493F, 1.3631F, 1.3884F, 0.0F, 0.4669F, -0.6545F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.5F, 4.4181F, -0.9303F));

		PartDefinition cube_r63 = bone2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(70, 67).addBox(-0.1379F, -0.8035F, -0.8714F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.3382F, 1.8487F, -1.7985F, -0.1655F, -0.7312F, -1.3824F));

		PartDefinition cube_r64 = bone2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(20, 71).addBox(-0.4106F, -1.4712F, -2.5238F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.2397F, 2.7419F, 0.0047F, 1.0785F, 0.2083F, 1.0771F));

		PartDefinition cube_r65 = bone2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(69, 80).addBox(-0.0924F, -0.8941F, -0.3765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.4F, 2.276F, -3.5384F, -2.5145F, -0.595F, 2.0434F));

		PartDefinition cube_r66 = bone2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(79, 64).addBox(-0.3924F, -0.8941F, -0.0765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.4F, 2.276F, -3.5384F, -0.5834F, -0.4904F, -0.4109F));

		PartDefinition cube_r67 = bone2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(7, 82).addBox(-0.0281F, 0.7318F, -0.987F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.2397F, 2.7419F, 0.0047F, 2.366F, 0.0108F, 0.157F));

		PartDefinition cube_r68 = bone2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(35, 100).addBox(-0.0281F, 0.7206F, 0.0063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2397F, 2.7419F, 0.0047F, 1.3188F, 0.0108F, 0.157F));

		PartDefinition cube_r69 = bone2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(17, 31).addBox(-0.4106F, -1.2794F, -2.233F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.2397F, 2.7419F, 0.0047F, 1.4276F, 0.2083F, 1.0771F));

		PartDefinition cube_r70 = bone2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(40, 97).addBox(-0.5F, 0.025F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.0F, 1.8317F, 1.3512F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r71 = bone2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(62, 80).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 1.2867F, -1.0947F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r72 = bone2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 81).addBox(5.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.806F, -0.0175F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r73 = bone2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(80, 70).addBox(5.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.806F, -0.0175F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r74 = bone2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(70, 100).addBox(-0.5F, 0.025F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(100, 69).addBox(-0.5F, -0.375F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -2.3954F, 1.3517F, 1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bone2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(100, 72).addBox(-0.5F, 0.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -2.3954F, 1.3517F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r76 = bone2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(28, 85).addBox(-0.5F, -0.25F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.0F, -1.4463F, 0.8991F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r77 = bone2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(21, 85).addBox(5.5F, -0.4F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0734F, 0.0F, 0.0F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.5F, 4.4181F, -0.9303F));

		PartDefinition cube_r78 = bone3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(70, 67).mirror().addBox(-3.8621F, -0.8035F, -0.8714F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.3382F, 1.8487F, -1.7985F, -0.1655F, 0.7312F, 1.3824F));

		PartDefinition cube_r79 = bone3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(20, 71).mirror().addBox(-0.5894F, -1.4712F, -2.5238F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.2397F, 2.7419F, 0.0047F, 1.0785F, -0.2083F, -1.0771F));

		PartDefinition cube_r80 = bone3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(69, 80).mirror().addBox(-2.9076F, -0.8941F, -0.3765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 2.276F, -3.5384F, -2.5145F, 0.595F, -2.0434F));

		PartDefinition cube_r81 = bone3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(79, 64).mirror().addBox(-2.6076F, -0.8941F, -0.0765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 2.276F, -3.5384F, -0.5834F, 0.4904F, 0.4109F));

		PartDefinition cube_r82 = bone3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(7, 82).mirror().addBox(-0.9719F, 0.7318F, -0.987F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.2397F, 2.7419F, 0.0047F, 2.366F, -0.0108F, -0.157F));

		PartDefinition cube_r83 = bone3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(35, 100).mirror().addBox(-0.9719F, 0.7206F, 0.0063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2397F, 2.7419F, 0.0047F, 1.3188F, -0.0108F, -0.157F));

		PartDefinition cube_r84 = bone3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(17, 31).mirror().addBox(-0.5894F, -1.2794F, -2.233F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.2397F, 2.7419F, 0.0047F, 1.4276F, -0.2083F, -1.0771F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(40, 97).mirror().addBox(-0.5F, 0.025F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.8317F, 1.3512F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(62, 80).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.2867F, -1.0947F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bone3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-6.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.806F, -0.0175F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(80, 70).mirror().addBox(-6.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.806F, -0.0175F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r89 = bone3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(70, 100).mirror().addBox(-0.5F, 0.025F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(100, 69).mirror().addBox(-0.5F, -0.375F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -2.3954F, 1.3517F, 1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r90 = bone3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(100, 72).mirror().addBox(-0.5F, 0.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -2.3954F, 1.3517F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r91 = bone3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(28, 85).mirror().addBox(-0.5F, -0.25F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -1.4463F, 0.8991F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(21, 85).mirror().addBox(-6.5F, -0.4F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0734F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6931F, 9.6655F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r93 = Body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(64, 97).addBox(-1.0F, -2.4F, -0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6014F, 5.9278F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r94 = Body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(61, 97).addBox(-1.0F, -2.5368F, 0.0235F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2418F, 3.8854F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r95 = Body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(58, 97).addBox(-1.0F, -2.6301F, 0.1086F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1626F, 1.8399F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r96 = Body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(55, 97).addBox(-1.0F, -2.4F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r97 = Body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -2.8863F, -0.1063F, 9.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 13.7692F, -2.8459F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r98 = Body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(29, 6).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r99 = Body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(90, 82).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.3665F, 0.1407F, -0.3678F));

		PartDefinition cube_r100 = Body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(90, 84).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.2775F, 0.2736F, -0.793F));

		PartDefinition cube_r101 = Body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(88, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.3994F, 0.1532F, -0.363F));

		PartDefinition cube_r102 = Body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(91, 33).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.3032F, 0.2984F, -0.7858F));

		PartDefinition cube_r103 = Body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-15.9916F, -2.5101F, -0.4852F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.128F, 0.4034F, -1.2855F));

		PartDefinition cube_r104 = Body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(29, 4).mirror().addBox(-14.9916F, -2.5101F, -0.4852F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.1174F, 0.3699F, -1.2895F));

		PartDefinition cube_r105 = Body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(29, 16).mirror().addBox(-13.9916F, -2.5101F, -0.4852F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8783F, 4.2503F, 0.1141F, 0.3526F, -1.2906F));

		PartDefinition cube_r106 = Body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(91, 35).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8783F, 4.2503F, 0.3508F, 0.1327F, -0.37F));

		PartDefinition cube_r107 = Body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(91, 37).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8783F, 4.2503F, 0.2663F, 0.2599F, -0.796F));

		PartDefinition cube_r108 = Body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(29, 18).mirror().addBox(-12.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2533F, 6.2503F, 0.1112F, 0.3265F, -1.2915F));

		PartDefinition cube_r109 = Body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(91, 39).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2533F, 6.2503F, 0.3282F, 0.1191F, -0.3728F));

		PartDefinition cube_r110 = Body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(91, 41).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2533F, 6.2503F, 0.251F, 0.2382F, -0.7997F));

		PartDefinition cube_r111 = Body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(91, 41).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2533F, 6.2503F, 0.251F, -0.2382F, 0.7997F));

		PartDefinition cube_r112 = Body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(91, 39).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2533F, 6.2503F, 0.3282F, -0.1191F, 0.3728F));

		PartDefinition cube_r113 = Body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(29, 18).addBox(2.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2533F, 6.2503F, 0.1112F, -0.3265F, 1.2915F));

		PartDefinition cube_r114 = Body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(91, 37).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8783F, 4.2503F, 0.2663F, -0.2599F, 0.796F));

		PartDefinition cube_r115 = Body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(91, 35).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8783F, 4.2503F, 0.3508F, -0.1327F, 0.37F));

		PartDefinition cube_r116 = Body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(29, 16).addBox(2.9916F, -2.5101F, -0.4852F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8783F, 4.2503F, 0.1141F, -0.3526F, 1.2906F));

		PartDefinition cube_r117 = Body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(29, 4).addBox(2.9916F, -2.5101F, -0.4852F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.1174F, -0.3699F, 1.2895F));

		PartDefinition cube_r118 = Body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(29, 0).addBox(2.9916F, -2.5101F, -0.4852F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.128F, -0.4034F, 1.2855F));

		PartDefinition cube_r119 = Body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(91, 33).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.3032F, -0.2984F, 0.7858F));

		PartDefinition cube_r120 = Body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(88, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.3994F, -0.1532F, 0.363F));

		PartDefinition cube_r121 = Body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(90, 84).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.2775F, -0.2736F, 0.793F));

		PartDefinition cube_r122 = Body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(90, 82).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.3665F, -0.1407F, 0.3678F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, -0.1839F, -0.0858F, 0.0159F));

		PartDefinition cube_r123 = Body10.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(97, 79).addBox(-1.0F, -2.2F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5823F, 5.8297F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r124 = Body10.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(97, 74).addBox(-1.0F, -2.4F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2007F, 3.8664F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r125 = Body10.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(97, 69).addBox(-1.0F, -2.3F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1809F, 1.9032F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r126 = Body10.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(67, 97).addBox(-1.0F, -2.2F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r127 = Body10.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(27, 30).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r128 = Body10.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(91, 43).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5534F, 2.2503F, 0.5158F, 0.1955F, -0.3428F));

		PartDefinition cube_r129 = Body10.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(91, 45).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5534F, 2.2503F, 0.3962F, 0.3835F, -0.7546F));

		PartDefinition cube_r130 = Body10.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(91, 47).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.4824F, 0.1836F, -0.3491F));

		PartDefinition cube_r131 = Body10.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(92, 8).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.369F, 0.3595F, -0.7645F));

		PartDefinition cube_r132 = Body10.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(46, 30).mirror().addBox(-11.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.1557F, 0.487F, -1.2735F));

		PartDefinition cube_r133 = Body10.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(48, 14).mirror().addBox(-9.9916F, -2.5101F, -0.4852F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5534F, 2.2503F, 0.1675F, 0.5203F, -1.2678F));

		PartDefinition cube_r134 = Body10.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(56, 28).mirror().addBox(-7.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9534F, 4.2503F, 0.1669F, 0.5477F, -1.3199F));

		PartDefinition cube_r135 = Body10.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(10, 92).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9534F, 4.2503F, 0.5379F, 0.2123F, -0.3901F));

		PartDefinition cube_r136 = Body10.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(92, 10).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9534F, 4.2503F, 0.4103F, 0.4076F, -0.8009F));

		PartDefinition cube_r137 = Body10.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(76, 19).mirror().addBox(-6.9916F, -2.5101F, -0.4852F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1534F, 6.1503F, 0.166F, 0.5657F, -1.3894F));

		PartDefinition cube_r138 = Body10.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(92, 12).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1534F, 6.1503F, 0.5522F, 0.2237F, -0.456F));

		PartDefinition cube_r139 = Body10.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(92, 14).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1534F, 6.1503F, 0.4194F, 0.4236F, -0.8663F));

		PartDefinition cube_r140 = Body10.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(92, 14).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1534F, 6.1503F, 0.4194F, -0.4236F, 0.8663F));

		PartDefinition cube_r141 = Body10.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(92, 12).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1534F, 6.1503F, 0.5522F, -0.2237F, 0.456F));

		PartDefinition cube_r142 = Body10.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(76, 19).addBox(2.9916F, -2.5101F, -0.4852F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1534F, 6.1503F, 0.166F, -0.5657F, 1.3894F));

		PartDefinition cube_r143 = Body10.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(92, 10).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9534F, 4.2503F, 0.4103F, -0.4076F, 0.8009F));

		PartDefinition cube_r144 = Body10.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(10, 92).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9534F, 4.2503F, 0.5379F, -0.2123F, 0.3901F));

		PartDefinition cube_r145 = Body10.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(56, 28).addBox(2.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9534F, 4.2503F, 0.1669F, -0.5477F, 1.3199F));

		PartDefinition cube_r146 = Body10.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(48, 14).addBox(2.9916F, -2.5101F, -0.4852F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5534F, 2.2503F, 0.1675F, -0.5203F, 1.2678F));

		PartDefinition cube_r147 = Body10.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(46, 30).addBox(2.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.1557F, -0.487F, 1.2735F));

		PartDefinition cube_r148 = Body10.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(92, 8).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.369F, -0.3595F, 0.7645F));

		PartDefinition cube_r149 = Body10.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(91, 47).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.4824F, -0.1836F, 0.3491F));

		PartDefinition cube_r150 = Body10.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(91, 45).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5534F, 2.2503F, 0.3962F, -0.3835F, 0.7546F));

		PartDefinition cube_r151 = Body10.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(91, 43).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5534F, 2.2503F, 0.5158F, -0.1955F, 0.3428F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4644F, 7.7689F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r152 = Body11.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(10, 101).addBox(-1.0F, -1.825F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1809F, 1.9032F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r153 = Body11.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 101).addBox(-1.0F, -1.95F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r154 = Body11.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(11, 60).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r155 = Body11.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(92, 16).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.5326F, 0.2013F, -0.5315F));

		PartDefinition cube_r156 = Body11.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.41F, 0.3955F, -0.9414F));

		PartDefinition cube_r157 = Body11.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(92, 20).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2284F, 0.3503F, 0.5326F, 0.2013F, -0.4966F));

		PartDefinition cube_r158 = Body11.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(92, 22).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2284F, 0.3503F, 0.41F, 0.3955F, -0.9065F));

		PartDefinition cube_r159 = Body11.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(92, 24).mirror().addBox(-4.9916F, -2.5101F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2284F, 0.3503F, 0.1736F, 0.537F, -1.4218F));

		PartDefinition cube_r160 = Body11.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(69, 4).mirror().addBox(-3.9916F, -2.5101F, -0.4853F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.1736F, 0.537F, -1.4568F));

		PartDefinition cube_r161 = Body11.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(69, 4).addBox(2.9916F, -2.5101F, -0.4853F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.1736F, -0.537F, 1.4568F));

		PartDefinition cube_r162 = Body11.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(92, 24).addBox(2.9916F, -2.5101F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2284F, 0.3503F, 0.1736F, -0.537F, 1.4218F));

		PartDefinition cube_r163 = Body11.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(92, 22).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2284F, 0.3503F, 0.41F, -0.3955F, 0.9065F));

		PartDefinition cube_r164 = Body11.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(92, 20).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2284F, 0.3503F, 0.5326F, -0.2013F, 0.4966F));

		PartDefinition cube_r165 = Body11.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(92, 18).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.41F, -0.3955F, 0.9414F));

		PartDefinition cube_r166 = Body11.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(92, 16).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.5326F, -0.2013F, 0.5315F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6582F, 3.8372F, 0.0701F, 0.0871F, 0.0061F));

		PartDefinition cube_r167 = Body4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(71, 70).addBox(-1.5F, -1.0354F, 0.0445F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 1.3988F, 3.7216F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r168 = Body4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(95, 30).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1147F, 0.332F, 0.4263F, 0.3004F, -0.5858F));

		PartDefinition cube_r169 = Body4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(95, 67).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1147F, 0.332F, 0.2624F, 0.443F, -1.0295F));

		PartDefinition cube_r170 = Body4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(17, 38).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5147F, 2.332F, 0.5623F, 0.3258F, -0.672F));

		PartDefinition cube_r171 = Body4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(49, 92).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0147F, 4.232F, 0.5493F, 0.3489F, -0.7112F));

		PartDefinition cube_r172 = Body4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(92, 49).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0147F, 5.832F, 0.4679F, 0.4555F, -0.9183F));

		PartDefinition cube_r173 = Body4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(92, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0147F, 5.832F, 0.4679F, -0.4555F, 0.9183F));

		PartDefinition cube_r174 = Body4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(49, 92).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0147F, 4.232F, 0.5493F, -0.3489F, 0.7112F));

		PartDefinition cube_r175 = Body4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(17, 38).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5147F, 2.332F, 0.5623F, -0.3258F, 0.672F));

		PartDefinition cube_r176 = Body4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(102, 50).addBox(0.0F, -1.65F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4098F, 5.836F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r177 = Body4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(45, 101).addBox(0.0F, -1.4F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1079F, 4.5526F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Body4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(95, 67).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1147F, 0.332F, 0.2624F, -0.443F, 1.0295F));

		PartDefinition cube_r179 = Body4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(95, 30).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1147F, 0.332F, 0.4263F, -0.3004F, 0.5858F));

		PartDefinition cube_r180 = Body4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(88, 100).addBox(-1.0F, -1.7648F, 2.1357F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 65).addBox(-1.5F, -0.0648F, 0.1357F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4012F, -0.0784F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r181 = Body4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(63, 102).addBox(-1.0F, -1.8648F, 0.0357F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3804F, 0.0194F, -0.2531F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 4.6742F, 0.2819F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r182 = bone.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(10, 98).addBox(-0.7551F, 0.5655F, -3.3823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.168F, 1.656F, -0.2056F, 0.9617F));

		PartDefinition cube_r183 = bone.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(97, 51).addBox(-0.7551F, -1.7399F, -3.3208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.168F, 2.5723F, -0.2056F, 0.9617F));

		PartDefinition cube_r184 = bone.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(76, 14).addBox(-0.7551F, -0.2767F, -3.3277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.168F, 2.0051F, -0.2056F, 0.9617F));

		PartDefinition cube_r185 = bone.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(42, 85).addBox(-0.7652F, -1.1311F, -3.2124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.368F, 1.5307F, 0.3421F, 0.95F));

		PartDefinition cube_r186 = bone.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(100, 81).addBox(-0.7652F, -0.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 100).addBox(-0.7652F, -1.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 9).addBox(-0.7652F, -0.7952F, -3.1369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.368F, 1.2689F, 0.3421F, 0.95F));

		PartDefinition cube_r187 = bone.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(35, 85).addBox(-0.7652F, -0.4098F, -3.3689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4802F, 0.6053F, -0.368F, 0.9983F, 0.3421F, 0.95F));

		PartDefinition cube_r188 = bone.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(53, 70).addBox(-0.6F, 0.05F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1254F, -0.7927F, -0.7252F, 0.4082F, -0.0607F, -0.2118F));

		PartDefinition cube_r189 = bone.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(15, 97).addBox(-0.6F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3245F, -0.0607F, -0.2118F));

		PartDefinition bone4 = Body4.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 4.6742F, 0.2819F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r190 = bone4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(10, 98).mirror().addBox(-0.2449F, 0.5655F, -3.3823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.168F, 1.656F, 0.2056F, -0.9617F));

		PartDefinition cube_r191 = bone4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(97, 51).mirror().addBox(-0.2449F, -1.7399F, -3.3208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.168F, 2.5723F, 0.2056F, -0.9617F));

		PartDefinition cube_r192 = bone4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(76, 14).mirror().addBox(-0.2449F, -0.2767F, -3.3277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.168F, 2.0051F, 0.2056F, -0.9617F));

		PartDefinition cube_r193 = bone4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(42, 85).mirror().addBox(-0.2348F, -1.1311F, -3.2124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.368F, 1.5307F, -0.3421F, -0.95F));

		PartDefinition cube_r194 = bone4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(100, 81).mirror().addBox(-0.2348F, -0.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 100).mirror().addBox(-0.2348F, -1.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 9).mirror().addBox(-0.2348F, -0.7952F, -3.1369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.368F, 1.2689F, -0.3421F, -0.95F));

		PartDefinition cube_r195 = bone4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(35, 85).mirror().addBox(-0.2348F, -0.4098F, -3.3689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.6053F, -0.368F, 0.9983F, -0.3421F, -0.95F));

		PartDefinition cube_r196 = bone4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(53, 70).mirror().addBox(-0.4F, 0.05F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1254F, -0.7927F, -0.7252F, 0.4082F, 0.0607F, 0.2118F));

		PartDefinition cube_r197 = bone4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(15, 97).mirror().addBox(-0.4F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3245F, 0.0607F, 0.2118F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7238F, 5.5152F, 0.4597F, 0.3923F, -0.8038F, 0.1437F));

		PartDefinition cube_r198 = HindlimbL.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(34, 48).addBox(2.0F, 0.5F, -2.0F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(7, 86).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2391F, -0.3442F, 0.4927F, 0.0F, 0.0F, 0.6109F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7238F, 5.5152F, 0.4597F, -0.5827F, 0.6389F, -0.6222F));

		PartDefinition cube_r199 = HindlimbL2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 49).addBox(-7.0F, 0.5F, -2.0F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(86, 58).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2391F, -0.3442F, 0.4927F, 0.0F, 0.0F, -0.6109F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8617F, 6.7871F, -0.0358F, 0.218F, -0.0077F));

		PartDefinition cube_r200 = Body5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(60, 102).addBox(-1.0F, -1.35F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 3).addBox(-1.0F, -1.45F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 40).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r201 = Body5.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(54, 102).addBox(-1.0F, -1.575F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3455F, 0.9344F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r202 = Body5.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(51, 102).addBox(0.0F, -0.1002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.713F, 1.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r203 = Body5.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(101, 96).addBox(0.0F, -0.1002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.413F, 5.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r204 = Body5.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(101, 84).addBox(0.0F, 0.0998F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.513F, 3.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1222F, 6.7884F, 0.0181F, 0.2618F, 0.0047F));

		PartDefinition cube_r205 = Body6.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(85, 100).addBox(-1.0F, -1.85F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 102).addBox(-1.0F, -1.9F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 22).addBox(-1.5F, -0.55F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r206 = Body6.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(10, 89).addBox(0.0F, 1.4998F, 1.2175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 93).addBox(0.0F, 0.5998F, -0.4825F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2908F, 0.6101F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body12 = Body6.addOrReplaceChild("Body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.075F, 4.0F, -0.0183F, 0.3054F, -0.0055F));

		PartDefinition cube_r207 = Body12.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(74, 83).addBox(-1.0F, -0.95F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.32F, 2.1371F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r208 = Body12.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(48, 102).addBox(-1.0F, -1.65F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 52).addBox(-1.5F, -0.55F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r209 = Body12.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(66, 102).addBox(0.0F, 0.0998F, -0.4826F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2908F, 0.6101F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body9 = Body12.addOrReplaceChild("Body9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0552F, 4.0007F, -0.0186F, -0.349F, 0.0064F));

		PartDefinition cube_r210 = Body9.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(102, 66).addBox(-1.0F, -1.05F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 32).addBox(-1.5F, -0.55F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r211 = Body9.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(102, 29).addBox(-1.0F, -1.25F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body7 = Body9.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0209F, 4.003F, -0.0096F, -0.4363F, 0.0041F));

		PartDefinition cube_r212 = Body7.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(6, 103).addBox(-1.0F, -0.4162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3119F, 2.0424F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r213 = Body7.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(3, 103).addBox(-1.0F, -0.5162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r214 = Body7.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(63, 6).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0338F, 4.0862F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r215 = Body8.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(74, 4).addBox(-1.5F, -0.9389F, -0.0184F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 9.9164F, 5.8269F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r216 = Body8.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(72, 31).addBox(-1.5F, -0.9389F, -0.0184F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 7.4893F, 4.0636F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r217 = Body8.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(0, 40).addBox(-1.5F, -0.8642F, -0.2426F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4693F, 0.9703F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r218 = Body8.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(83, 4).addBox(-1.5F, -0.0739F, 0.0534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -0.2807F, -0.1047F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head = Ichthyosaurus.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 2.4794F, -19.3322F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r219 = Head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(18, 76).addBox(-1.0F, -0.025F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0536F, -0.219F, -8.6254F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r220 = Head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(78, 54).addBox(-1.0F, 0.0169F, -1.6531F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0536F, -0.5639F, -7.844F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r221 = Head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(49, 40).addBox(-2.5F, -0.0257F, -1.9874F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, -1.7926F, 0.6041F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r222 = Head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(17, 49).addBox(-3.0F, -0.0757F, -0.6874F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4464F, -2.493F, -1.2692F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r223 = Head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(65, 18).addBox(-2.5F, -0.0257F, 0.0126F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -2.6235F, -2.2607F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r224 = Head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(59, 64).addBox(-2.5F, -1.3257F, -0.2874F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -1.2726F, -2.8565F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r225 = Head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 66).addBox(-2.0F, -0.0431F, -1.9794F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4464F, -1.4995F, -6.0103F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r226 = Head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(48, 64).addBox(-2.5F, -0.0181F, -0.9794F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4464F, -1.9916F, -5.149F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r227 = Head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(64, 44).addBox(-1.5F, -0.0181F, -1.0044F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5536F, -2.4117F, -4.236F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r228 = Head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(64, 38).addBox(-1.5F, -0.0181F, -1.0294F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5536F, -2.559F, -3.2332F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r229 = Head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(13, 54).addBox(-1.0F, -0.5F, -2.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, 0.4399F, -7.6939F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4464F, 0.454F, -6.2482F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(30, 100).addBox(-0.5F, -0.0671F, -0.136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7F, -0.0342F, 7.2056F, -0.192F, 0.0175F, -0.0698F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(99, 16).addBox(-0.5F, 0.0089F, -0.5325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0342F, 7.2056F, 1.117F, 0.0175F, -0.0698F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(26, 54).addBox(-0.5F, -2.1639F, -0.5042F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7F, -0.0342F, 7.2056F, 0.7243F, 0.0175F, -0.0698F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(64, 89).addBox(-0.5F, -1.0F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(59, 89).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(44, 89).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2754F, 1.3103F, -1.8211F, -0.0698F, 0.0349F, 0.0018F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(39, 89).addBox(-0.1894F, 0.3341F, -2.7973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(47, 94).addBox(-0.1894F, 0.2841F, -3.3973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(34, 89).addBox(-0.1894F, 0.3591F, -3.9973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, -0.071F, 0.1916F, -0.0093F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(10, 94).addBox(-0.225F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.4649F, 1.1198F, -4.1228F, -0.0269F, 0.1917F, -0.0043F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(96, 86).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.2364F, 1.2146F, -4.7268F, -0.0245F, 0.1906F, 0.021F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(99, 47).addBox(-0.5F, -0.3F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(87, 70).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(87, 54).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5791F, 1.3203F, -6.4907F, 0.0628F, 0.1906F, 0.021F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(87, 50).addBox(-0.5F, -0.975F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6933F, 1.2529F, -7.0759F, 0.0159F, 0.1913F, -0.0128F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(87, 23).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7693F, 1.286F, -7.6656F, 0.0181F, 0.1041F, 0.011F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(94, 0).addBox(-1.6399F, -1.3014F, 8.3369F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(74, 86).addBox(-1.6399F, -1.4514F, 7.7369F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(84, 86).addBox(-1.6399F, -1.3014F, 7.1369F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6F, 1.5369F, -17.2101F, -0.0263F, 0.1047F, -0.0027F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(66, 93).addBox(-1.5096F, -1.5513F, 6.5529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(93, 63).addBox(-1.5096F, -1.3013F, 5.9529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(14, 88).addBox(-1.5096F, -1.4513F, 5.3529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 97).addBox(-1.5096F, -1.4263F, 4.1529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(93, 59).addBox(-1.5096F, -1.3013F, 4.7529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6F, 1.5369F, -17.2101F, -0.0262F, 0.0872F, -0.002F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(61, 93).addBox(-1.2751F, -1.3261F, 3.5934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(56, 93).addBox(-1.2751F, -1.2761F, 2.9934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(93, 55).addBox(-1.2751F, -1.3011F, 2.3934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(42, 93).addBox(-1.2751F, -1.3261F, 1.7934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(37, 93).addBox(-1.2751F, -1.3261F, 1.1934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(32, 93).addBox(-1.2751F, -1.3261F, 0.5934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(27, 93).addBox(-1.2751F, -1.3511F, -0.0066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6F, 1.5369F, -17.2101F, -0.0262F, 0.0349F, 0.0003F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(85, 8).addBox(-0.7974F, 0.4068F, -1.2386F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, -0.1484F, 0.061F, 0.0034F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(47, 75).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2906F, 0.5645F, -2.6484F, -0.0112F, 0.1413F, 0.0232F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(81, 30).addBox(-0.5736F, -0.6205F, -3.3679F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.2069F, 0.1413F, 0.0232F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 85).addBox(-1.0F, -2.3474F, -4.0034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(84, 46).addBox(-1.0F, -2.7724F, -4.0034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.075F, -2.4545F, 4.8394F, 1.7802F, 0.1004F, 0.0F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(79, 58).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3183F, -3.0257F, 3.0605F, -0.0087F, 0.1004F, 0.0F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(48, 80).addBox(-0.95F, -3.4519F, -3.0604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(11, 66).addBox(-0.975F, -3.9519F, -3.5604F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.075F, -2.4545F, 4.8394F, 1.6057F, 0.1004F, 0.0F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(98, 41).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1007F, 1.318F, 0.1541F, -2.2078F, 0.1004F, 0.0F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(85, 12).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6171F, -0.6498F, 5.2826F, 3.0281F, 0.1004F, 0.0F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(81, 96).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.598F, -1.6314F, 5.0927F, 1.7628F, 0.1004F, 0.0F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(98, 63).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5174F, -2.2262F, 4.2929F, 0.9338F, 0.1004F, 0.0F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(98, 60).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, -2.5518F, 3.3521F, -0.3316F, 0.1004F, 0.0F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(98, 57).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3228F, -2.6215F, 2.3596F, -1.6406F, 0.1004F, 0.0F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(98, 54).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2309F, -2.2228F, 1.4471F, -2.7314F, 0.1004F, 0.0F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(45, 98).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1473F, -1.6709F, 0.6174F, 2.1555F, 0.1004F, 0.0F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(76, 96).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0717F, -1.0148F, -0.1335F, 0.7156F, 0.1004F, 0.0F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(98, 44).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0053F, -0.2658F, -0.7928F, -0.7243F, 0.1004F, 0.0F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(71, 96).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0201F, 0.7232F, -0.6457F, -1.4224F, 0.1004F, 0.0F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(94, 92).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1922F, 1.7247F, 1.0631F, 2.7227F, 0.1004F, 0.0F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(41, 80).addBox(-1.0F, -3.1446F, -4.7293F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.075F, -2.4545F, 4.8394F, 1.4137F, 0.1004F, 0.0F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(93, 26).addBox(-1.0F, 0.3741F, -3.4897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.075F, -2.4545F, 4.8394F, 0.8639F, 0.1004F, 0.0F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(84, 34).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5964F, 0.9806F, 5.0769F, -0.1396F, 0.1004F, 0.0F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(86, 96).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1301F, -2.4669F, 1.1914F, -1.0647F, 0.1004F, 0.0F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(78, 80).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2198F, -2.9131F, 2.0818F, 0.4625F, 0.1004F, 0.0F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(34, 80).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2623F, 1.2945F, 2.5037F, -0.096F, 0.1004F, 0.0F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(69, 83).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3164F, -3.0235F, 3.0415F, 0.1134F, 0.1004F, 0.0F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(27, 80).addBox(-1.0F, 0.0819F, -2.0294F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -2.0388F, 0.1856F, 0.5154F, 0.0835F, 0.0308F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(9, 78).addBox(-2.0F, 0.0169F, -1.8531F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3035F, -0.9603F, -1.6364F, 0.3875F, 0.3586F, 0.1637F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(22, 65).addBox(-0.6648F, -0.5036F, -1.5347F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.3352F, 0.5287F, -6.1053F, 0.1267F, 0.0F, 0.0F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(62, 70).addBox(-0.5F, -0.4376F, -0.0026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.8527F, 0.2817F, -4.6266F, 0.2113F, 0.1773F, 0.0263F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(44, 70).addBox(-0.5F, -0.4316F, -2.9972F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.8527F, 0.2817F, -4.6266F, 0.1241F, 0.1773F, 0.0263F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(75, 41).addBox(-0.6986F, -1.0897F, -4.0975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.2506F, 0.1413F, 0.0232F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(69, 26).addBox(-1.9255F, -0.542F, 6.7527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6F, 1.5369F, -17.2101F, 0.0785F, 0.1048F, 0.0036F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(37, 59).addBox(-2.5632F, -0.027F, 9.3117F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, 1.5369F, -17.2101F, 0.1296F, 0.1739F, -0.0154F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(25, 97).addBox(-1.2751F, -1.0745F, 3.8929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(32, 52).addBox(-1.2751F, -0.6995F, -0.2821F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.6F, 1.5369F, -17.2101F, 0.0087F, 0.0349F, 0.0003F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(45, 52).addBox(-0.5F, -0.675F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.2981F, 1.218F, -14.9942F, 0.0524F, 0.0349F, 0.0003F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(51, 45).addBox(-1.275F, -0.949F, -0.2861F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.308F)), PartPose.offsetAndRotation(-0.6F, 1.5369F, -17.2101F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(38, 75).addBox(-0.5F, -0.425F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.375F, 0.8391F, -11.5213F, 0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(56, 75).addBox(-0.5F, -0.625F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.2081F, 1.084F, -11.4748F, 0.0524F, 0.0829F, 0.0007F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(75, 36).addBox(-1.5813F, -0.8028F, 4.169F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 1.5369F, -17.2101F, 0.0088F, 0.0829F, 0.0007F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(69, 57).addBox(-0.5F, -1.075F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F))
				.texOffs(69, 52).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.1498F, 1.5222F, -10.2422F, 0.0262F, 0.1048F, 0.0036F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(99, 22).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0974F, 2.0868F, 0.7097F, -1.7274F, 0.0461F, -0.0387F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(99, 19).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.017F, 0.8771F, -0.0184F, -0.2439F, 0.0461F, -0.0387F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(84, 42).addBox(-0.8156F, 0.86F, -1.8976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, -0.1566F, 0.0461F, -0.0387F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(55, 80).addBox(-0.5F, -1.975F, 0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6268F, 0.0272F, 6.124F, 1.5621F, 0.1004F, 0.0F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(99, 13).addBox(-0.5F, -0.975F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6268F, 0.0272F, 6.124F, 1.1257F, 0.1004F, 0.0F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(99, 10).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6F, 0.9909F, 5.8581F, 2.8711F, 0.1004F, 0.0F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(99, 7).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5384F, 1.7789F, 5.2455F, -2.234F, 0.1004F, 0.0F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(99, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4512F, 2.2713F, 4.3795F, -1.0559F, 0.1004F, 0.0F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(49, 88).addBox(-1.0F, 2.3303F, -2.0481F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -2.1545F, 4.8394F, 0.1222F, 0.1004F, 0.0F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(48, 59).addBox(-0.5F, -0.475F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-1.375F, 0.7012F, -8.9771F, 0.1051F, 0.0868F, 0.0091F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(84, 38).addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2202F, 1.0209F, -2.9532F, -0.1318F, 0.1672F, -0.0679F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(26, 59).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F))
				.texOffs(58, 58).addBox(-0.5F, -0.8F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.5754F, 1.2386F, -5.6948F, 0.0423F, 0.1739F, -0.0154F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(80, 21).addBox(-0.7974F, -1.0068F, -1.2386F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.2007F, 0.061F, 0.0034F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.5536F, 0.454F, -6.2482F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(30, 100).mirror().addBox(-0.5F, -0.0671F, -0.136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.0342F, 7.2056F, -0.192F, -0.0175F, 0.0698F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(99, 16).mirror().addBox(-0.5F, 0.0089F, -0.5325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.0342F, 7.2056F, 1.117F, -0.0175F, 0.0698F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(26, 54).mirror().addBox(-0.5F, -2.1639F, -0.5042F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.0342F, 7.2056F, 0.7243F, -0.0175F, 0.0698F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(64, 89).mirror().addBox(-0.5F, -1.0F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(59, 89).mirror().addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(44, 89).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2754F, 1.3103F, -1.8211F, -0.0698F, -0.0349F, -0.0018F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(39, 89).mirror().addBox(-0.8106F, 0.3341F, -2.7973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(47, 94).mirror().addBox(-0.8106F, 0.2841F, -3.3973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(34, 89).mirror().addBox(-0.8106F, 0.3591F, -3.9973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, -0.071F, -0.1916F, 0.0093F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(10, 94).mirror().addBox(-0.775F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.4649F, 1.1198F, -4.1228F, -0.0269F, -0.1917F, 0.0043F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(96, 86).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.2364F, 1.2146F, -4.7268F, -0.0245F, -0.1906F, -0.021F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(99, 47).mirror().addBox(-0.5F, -0.3F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(87, 70).mirror().addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(87, 54).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.5791F, 1.3203F, -6.4907F, 0.0628F, -0.1906F, -0.021F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(87, 50).mirror().addBox(-0.5F, -0.975F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6933F, 1.2529F, -7.0759F, 0.0159F, -0.1913F, 0.0128F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(87, 23).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.7693F, 1.286F, -7.6656F, 0.0181F, -0.1041F, -0.011F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(0.6399F, -1.3014F, 8.3369F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(74, 86).mirror().addBox(0.6399F, -1.4514F, 7.7369F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(84, 86).mirror().addBox(0.6399F, -1.3014F, 7.1369F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6F, 1.5369F, -17.2101F, -0.0263F, -0.1047F, 0.0027F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(66, 93).mirror().addBox(0.5096F, -1.5513F, 6.5529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(93, 63).mirror().addBox(0.5096F, -1.3013F, 5.9529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(14, 88).mirror().addBox(0.5096F, -1.4513F, 5.3529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 97).mirror().addBox(0.5096F, -1.4263F, 4.1529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(93, 59).mirror().addBox(0.5096F, -1.3013F, 4.7529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6F, 1.5369F, -17.2101F, -0.0262F, -0.0872F, 0.002F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(61, 93).mirror().addBox(0.2751F, -1.3261F, 3.5934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(56, 93).mirror().addBox(0.2751F, -1.2761F, 2.9934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(93, 55).mirror().addBox(0.2751F, -1.3011F, 2.3934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(42, 93).mirror().addBox(0.2751F, -1.3261F, 1.7934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(37, 93).mirror().addBox(0.2751F, -1.3261F, 1.1934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(32, 93).mirror().addBox(0.2751F, -1.3261F, 0.5934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(27, 93).mirror().addBox(0.2751F, -1.3511F, -0.0066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6F, 1.5369F, -17.2101F, -0.0262F, -0.0349F, -0.0003F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(85, 8).mirror().addBox(-0.2026F, 0.4068F, -1.2386F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, -0.1484F, -0.061F, -0.0034F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(47, 75).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2906F, 0.5645F, -2.6484F, -0.0112F, -0.1413F, -0.0232F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(81, 30).mirror().addBox(-0.4264F, -0.6205F, -3.3679F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, 0.2069F, -0.1413F, -0.0232F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(0.0F, -2.3474F, -4.0034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(84, 46).mirror().addBox(0.0F, -2.7724F, -4.0034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.075F, -2.4545F, 4.8394F, 1.7802F, -0.1004F, 0.0F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(79, 58).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3183F, -3.0257F, 3.0605F, -0.0087F, -0.1004F, 0.0F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(48, 80).mirror().addBox(-0.05F, -3.4519F, -3.0604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(11, 66).mirror().addBox(-0.025F, -3.9519F, -3.5604F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.075F, -2.4545F, 4.8394F, 1.6057F, -0.1004F, 0.0F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(98, 41).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1007F, 1.318F, 0.1541F, -2.2078F, -0.1004F, 0.0F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(85, 12).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6171F, -0.6498F, 5.2826F, 3.0281F, -0.1004F, 0.0F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(81, 96).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.598F, -1.6314F, 5.0927F, 1.7628F, -0.1004F, 0.0F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(98, 63).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5174F, -2.2262F, 4.2929F, 0.9338F, -0.1004F, 0.0F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(98, 60).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4227F, -2.5518F, 3.3521F, -0.3316F, -0.1004F, 0.0F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(98, 57).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3228F, -2.6215F, 2.3596F, -1.6406F, -0.1004F, 0.0F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(98, 54).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2309F, -2.2228F, 1.4471F, -2.7314F, -0.1004F, 0.0F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(45, 98).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1473F, -1.6709F, 0.6174F, 2.1555F, -0.1004F, 0.0F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(76, 96).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0717F, -1.0148F, -0.1335F, 0.7156F, -0.1004F, 0.0F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(98, 44).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0053F, -0.2658F, -0.7928F, -0.7243F, -0.1004F, 0.0F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(71, 96).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0201F, 0.7232F, -0.6457F, -1.4224F, -0.1004F, 0.0F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(94, 92).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1922F, 1.7247F, 1.0631F, 2.7227F, -0.1004F, 0.0F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(41, 80).mirror().addBox(0.0F, -3.1446F, -4.7293F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.075F, -2.4545F, 4.8394F, 1.4137F, -0.1004F, 0.0F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(93, 26).mirror().addBox(0.0F, 0.3741F, -3.4897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.075F, -2.4545F, 4.8394F, 0.8639F, -0.1004F, 0.0F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(84, 34).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5964F, 0.9806F, 5.0769F, -0.1396F, -0.1004F, 0.0F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(86, 96).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1301F, -2.4669F, 1.1914F, -1.0647F, -0.1004F, 0.0F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(78, 80).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2198F, -2.9131F, 2.0818F, 0.4625F, -0.1004F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(34, 80).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2623F, 1.2945F, 2.5037F, -0.096F, -0.1004F, 0.0F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(69, 83).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3164F, -3.0235F, 3.0415F, 0.1134F, -0.1004F, 0.0F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(27, 80).mirror().addBox(0.0F, 0.0819F, -2.0294F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.0388F, 0.1856F, 0.5154F, -0.0835F, -0.0308F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(9, 78).mirror().addBox(0.0F, 0.0169F, -1.8531F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.3035F, -0.9603F, -1.6364F, 0.3875F, -0.3586F, -0.1637F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(22, 65).mirror().addBox(-0.3352F, -0.5036F, -1.5347F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.3352F, 0.5287F, -6.1053F, 0.1267F, 0.0F, 0.0F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(62, 70).mirror().addBox(-0.5F, -0.4376F, -0.0026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.8527F, 0.2817F, -4.6266F, 0.2113F, -0.1773F, -0.0263F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(44, 70).mirror().addBox(-0.5F, -0.4316F, -2.9972F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.8527F, 0.2817F, -4.6266F, 0.1241F, -0.1773F, -0.0263F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(75, 41).mirror().addBox(-0.3014F, -1.0897F, -4.0975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, 0.2506F, -0.1413F, -0.0232F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(69, 26).mirror().addBox(0.9254F, -0.542F, 6.7527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6F, 1.5369F, -17.2101F, 0.0785F, -0.1048F, -0.0036F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(37, 59).mirror().addBox(1.5632F, -0.027F, 9.3117F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6F, 1.5369F, -17.2101F, 0.1296F, -0.1739F, 0.0154F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(25, 97).mirror().addBox(0.2751F, -1.0745F, 3.8929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(32, 52).mirror().addBox(0.2751F, -0.6995F, -0.2821F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.6F, 1.5369F, -17.2101F, 0.0087F, -0.0349F, -0.0003F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(45, 52).mirror().addBox(-0.5F, -0.675F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(1.2981F, 1.218F, -14.9942F, 0.0524F, -0.0349F, -0.0003F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(51, 45).mirror().addBox(0.275F, -0.949F, -0.2861F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.6F, 1.5369F, -17.2101F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(38, 75).mirror().addBox(-0.5F, -0.425F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.375F, 0.8391F, -11.5213F, 0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(56, 75).mirror().addBox(-0.5F, -0.625F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.2081F, 1.084F, -11.4748F, 0.0524F, -0.0829F, -0.0007F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(75, 36).mirror().addBox(0.5813F, -0.8028F, 4.169F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6F, 1.5369F, -17.2101F, 0.0088F, -0.0829F, -0.0007F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(69, 57).mirror().addBox(-0.5F, -1.075F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(69, 52).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.1498F, 1.5222F, -10.2422F, 0.0262F, -0.1048F, -0.0036F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(99, 22).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0974F, 2.0868F, 0.7097F, -1.7274F, -0.0461F, 0.0387F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(99, 19).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.017F, 0.8771F, -0.0184F, -0.2439F, -0.0461F, 0.0387F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(84, 42).mirror().addBox(-0.1844F, 0.86F, -1.8976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, -0.1566F, -0.0461F, 0.0387F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(55, 80).mirror().addBox(-0.5F, -1.975F, 0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6268F, 0.0272F, 6.124F, 1.5621F, -0.1004F, 0.0F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(99, 13).mirror().addBox(-0.5F, -0.975F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6268F, 0.0272F, 6.124F, 1.1257F, -0.1004F, 0.0F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(99, 10).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.9909F, 5.8581F, 2.8711F, -0.1004F, 0.0F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(99, 7).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5384F, 1.7789F, 5.2455F, -2.234F, -0.1004F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4512F, 2.2713F, 4.3795F, -1.0559F, -0.1004F, 0.0F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(49, 88).mirror().addBox(0.0F, 2.3303F, -2.0481F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1545F, 4.8394F, 0.1222F, -0.1004F, 0.0F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(48, 59).mirror().addBox(-0.5F, -0.475F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(1.375F, 0.7012F, -8.9771F, 0.1051F, -0.0868F, -0.0091F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(84, 38).mirror().addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2202F, 1.0209F, -2.9532F, -0.1318F, -0.1672F, 0.0679F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(26, 59).mirror().addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(58, 58).mirror().addBox(-0.5F, -0.8F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.5754F, 1.2386F, -5.6948F, 0.0423F, -0.1739F, 0.0154F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(80, 21).mirror().addBox(-0.2026F, -1.0068F, -1.2386F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, 0.2007F, -0.061F, -0.0034F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 1.2339F, 1.1197F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r362 = Jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(20, 97).mirror().addBox(-0.8534F, -1.2459F, -3.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, 0.6545F, -0.0873F, 0.0F));

		PartDefinition cube_r363 = Jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(20, 100).mirror().addBox(-0.8534F, 1.4301F, -4.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, 0.0175F, -0.0873F, 0.0F));

		PartDefinition cube_r364 = Jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(25, 100).mirror().addBox(-0.8199F, -1.0419F, -2.7333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.033F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, 0.5672F, -0.0698F, 0.0F));

		PartDefinition cube_r365 = Jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(98, 26).mirror().addBox(-0.8534F, 0.9759F, -4.2325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, 0.1222F, -0.0873F, 0.0F));

		PartDefinition cube_r366 = Jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-0.0356F, 0.6206F, -4.1224F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-1.4379F, 0.3768F, -12.3144F, -0.0262F, -0.1353F, 0.0F));

		PartDefinition cube_r367 = Jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(54, 16).mirror().addBox(-0.0356F, 0.9016F, -4.0581F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-1.4379F, 0.3768F, -12.3144F, -0.0567F, -0.1353F, 0.0F));

		PartDefinition cube_r368 = Jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(65, 12).mirror().addBox(-0.9485F, 1.3062F, -13.226F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(14, 84).mirror().addBox(-0.9485F, 1.3123F, -9.3068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, -0.0524F, -0.1004F, 0.0F));

		PartDefinition cube_r369 = Jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(5, 89).mirror().addBox(-1.1962F, -0.6294F, -13.3014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(91, 96).mirror().addBox(-1.1962F, -0.5544F, -12.7014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, 0.0262F, -0.1004F, 0.0F));

		PartDefinition cube_r370 = Jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(19, 89).mirror().addBox(-0.2843F, -0.2891F, -0.8062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(63, 85).mirror().addBox(-0.2843F, -0.3891F, -2.6062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(38, 71).mirror().addBox(-0.2843F, -0.2391F, -3.2062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(92, 51).mirror().addBox(-0.2843F, -0.4391F, -3.8062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(92, 69).mirror().addBox(-0.2843F, -0.4141F, -4.4062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.4379F, 0.3768F, -12.3144F, 0.0262F, -0.1353F, 0.0F));

		PartDefinition cube_r371 = Jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(87, 19).mirror().addBox(-0.2843F, -0.158F, -1.3774F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.4379F, 0.3768F, -12.3144F, -0.0087F, -0.1353F, 0.0F));

		PartDefinition cube_r372 = Jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(79, 86).mirror().addBox(-0.2843F, -0.324F, -1.9781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.4379F, 0.3768F, -12.3144F, -0.0175F, -0.1353F, 0.0F));

		PartDefinition cube_r373 = Jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(24, 89).mirror().addBox(-0.5919F, -0.5183F, -0.9819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(29, 89).mirror().addBox(-0.5919F, -0.4433F, -1.5819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(74, 92).mirror().addBox(-0.5919F, -0.4433F, -2.1819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(79, 92).mirror().addBox(-0.5919F, -0.6183F, -2.7819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(84, 92).mirror().addBox(-0.5919F, -0.4683F, -3.3819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(89, 92).mirror().addBox(-0.5919F, -0.3933F, -3.9819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 93).mirror().addBox(-0.5919F, -0.4933F, -4.5819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(5, 93).mirror().addBox(-0.5919F, -0.4933F, -5.1819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(98, 32).mirror().addBox(-0.5919F, -0.2933F, -5.7819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2379F, 0.3768F, -19.1144F, -0.0088F, -0.048F, 0.0017F));

		PartDefinition cube_r374 = Jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(96, 96).mirror().addBox(-1.1962F, 0.5547F, -12.0097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(17, 93).mirror().addBox(-1.1962F, 0.6024F, -11.4119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(22, 93).mirror().addBox(-1.1962F, 0.6501F, -10.8142F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, -0.0611F, -0.1004F, 0.0F));

		PartDefinition cube_r375 = Jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(88, 27).mirror().addBox(-1.1962F, 1.2194F, -10.1332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 60).mirror().addBox(-0.9485F, 2.2501F, -13.0405F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, -0.1047F, -0.1004F, 0.0F));

		PartDefinition cube_r376 = Jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(98, 35).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.6729F, 1.1631F, -8.1913F, -2.993F, 0.1154F, -3.1094F));

		PartDefinition cube_r377 = Jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(83, 74).mirror().addBox(-0.8534F, 1.8176F, -7.3929F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, -0.0524F, -0.0873F, 0.0F));

		PartDefinition cube_r378 = Jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(83, 78).mirror().addBox(-0.8534F, 1.601F, -7.34F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, -0.096F, -0.0873F, 0.0F));

		PartDefinition cube_r379 = Jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(9, 73).mirror().addBox(-0.8534F, 1.1405F, -5.999F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, -0.0087F, -0.0873F, 0.0F));

		PartDefinition cube_r380 = Jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(83, 82).mirror().addBox(-0.9485F, 1.9403F, -9.2324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, -0.0698F, -0.1004F, 0.0F));

		PartDefinition cube_r381 = Jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(46, 32).mirror().addBox(-0.5919F, 0.0905F, -5.767F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.2379F, 0.3768F, -19.1144F, -0.0349F, -0.048F, 0.0017F));

		PartDefinition cube_r382 = Jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(98, 38).mirror().addBox(-0.5919F, 2.2145F, -5.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.2379F, 0.3768F, -19.1144F, -0.4451F, -0.048F, 0.0017F));

		PartDefinition cube_r383 = Jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(48, 6).mirror().addBox(-0.5919F, 0.4699F, -5.6985F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2379F, 0.3768F, -19.1144F, -0.1048F, -0.048F, 0.0017F));

		PartDefinition cube_r384 = Jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(40, 100).mirror().addBox(-0.8534F, 2.5265F, 0.3846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, -1.2741F, -0.0873F, 0.0F));

		PartDefinition cube_r385 = Jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(50, 99).mirror().addBox(-0.8534F, -1.1591F, 1.6375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, -2.7576F, -0.0873F, 0.0F));

		PartDefinition cube_r386 = Jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(75, 100).mirror().addBox(-0.8534F, -1.7573F, -1.012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, 2.042F, -0.0873F, 0.0F));

		PartDefinition cube_r387 = Jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(99, 90).mirror().addBox(-0.8534F, -0.0955F, -0.883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, 0.6021F, -0.0873F, 0.0F));

		PartDefinition cube_r388 = Jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(100, 75).mirror().addBox(-0.8534F, -0.879F, -0.096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, -0.7069F, -0.0873F, 0.0F));

		PartDefinition cube_r389 = Jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(100, 78).mirror().addBox(-0.8534F, -1.2347F, -1.2556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, -1.7104F, -0.0873F, 0.0F));

		PartDefinition cube_r390 = Jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(5, 97).mirror().addBox(-0.8199F, -1.9379F, -0.1173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, 2.0508F, -0.0698F, 0.0F));

		PartDefinition cube_r391 = Jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(30, 97).mirror().addBox(-0.8199F, -0.1173F, 0.0129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.033F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, -2.6616F, -0.0698F, 0.0F));

		PartDefinition cube_r392 = Jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(97, 4).mirror().addBox(-0.8199F, -0.8039F, -0.8673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, -1.2217F, -0.0698F, 0.0F));

		PartDefinition cube_r393 = Jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(99, 93).mirror().addBox(-0.8534F, -0.1203F, -4.0675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.033F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, 0.3054F, -0.0873F, 0.0F));

		PartDefinition cube_r394 = Jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(5, 100).mirror().addBox(-0.8534F, -5.8657F, -2.4301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-1.8379F, 0.3768F, 0.6856F, 1.5882F, -0.0873F, 0.0F));

		PartDefinition cube_r395 = Jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(35, 97).mirror().addBox(-0.5919F, 3.9545F, 1.6269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(15, 100).mirror().addBox(-0.5919F, 3.5545F, 1.6269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.2379F, 0.3768F, -19.1144F, -1.885F, -0.048F, 0.0017F));

		PartDefinition cube_r396 = Jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.5919F, -1.7374F, -0.4332F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.2379F, 0.3768F, -19.1144F, 3.0456F, -0.048F, 0.0017F));

		PartDefinition cube_r397 = Jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(65, 75).mirror().addBox(-0.0356F, 0.718F, -7.0216F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(-1.4379F, 0.3768F, -12.3144F, -0.048F, -0.1353F, 0.0F));

		PartDefinition cube_r398 = Jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(74, 75).mirror().addBox(-0.0356F, 0.9154F, -6.9991F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4379F, 0.3768F, -12.3144F, -0.0654F, -0.1353F, 0.0F));

		PartDefinition cube_r399 = Jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(69, 89).mirror().addBox(-0.2748F, -0.4594F, -7.2674F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(54, 88).mirror().addBox(-0.2748F, -0.2594F, -6.6674F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(88, 63).mirror().addBox(-0.2748F, -0.3594F, -6.0674F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 89).mirror().addBox(-0.2748F, -0.3594F, -5.4674F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(89, 0).mirror().addBox(-0.2748F, -0.2594F, -4.8674F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.4379F, 0.3768F, -12.3144F, -0.0089F, -0.1352F, 0.0021F));

		PartDefinition cube_r400 = Jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(48, 6).addBox(-0.4081F, 0.4699F, -5.6985F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2379F, 0.3768F, -19.1144F, -0.1048F, 0.048F, -0.0017F));

		PartDefinition cube_r401 = Jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(0, 53).addBox(-0.4081F, -1.7374F, -0.4332F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.2379F, 0.3768F, -19.1144F, 3.0456F, 0.048F, -0.0017F));

		PartDefinition cube_r402 = Jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(15, 100).addBox(-0.4081F, 3.5545F, 1.6269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(35, 97).addBox(-0.4081F, 3.9545F, 1.6269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.2379F, 0.3768F, -19.1144F, -1.885F, 0.048F, -0.0017F));

		PartDefinition cube_r403 = Jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(98, 38).addBox(-0.4081F, 2.2145F, -5.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.2379F, 0.3768F, -19.1144F, -0.4451F, 0.048F, -0.0017F));

		PartDefinition cube_r404 = Jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(46, 32).addBox(-0.4081F, 0.0905F, -5.767F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2379F, 0.3768F, -19.1144F, -0.0349F, 0.048F, -0.0017F));

		PartDefinition cube_r405 = Jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(14, 84).addBox(-0.0515F, 1.3123F, -9.3068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F))
				.texOffs(65, 12).addBox(-0.0515F, 1.3062F, -13.226F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, -0.0524F, 0.1004F, 0.0F));

		PartDefinition cube_r406 = Jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(83, 82).addBox(-0.0515F, 1.9403F, -9.2324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, -0.0698F, 0.1004F, 0.0F));

		PartDefinition cube_r407 = Jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(9, 73).addBox(-0.1466F, 1.1405F, -5.999F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, -0.0087F, 0.0873F, 0.0F));

		PartDefinition cube_r408 = Jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(83, 78).addBox(-0.1466F, 1.601F, -7.34F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, -0.096F, 0.0873F, 0.0F));

		PartDefinition cube_r409 = Jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(83, 74).addBox(-0.1466F, 1.8176F, -7.3929F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, -0.0524F, 0.0873F, 0.0F));

		PartDefinition cube_r410 = Jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(0, 60).addBox(-0.0515F, 2.2501F, -13.0405F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F))
				.texOffs(88, 27).addBox(0.1962F, 1.2194F, -10.1332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, -0.1047F, 0.1004F, 0.0F));

		PartDefinition cube_r411 = Jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(98, 35).mirror().addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.6729F, 1.1631F, -8.1913F, -2.993F, -0.1154F, 3.1094F));

		PartDefinition cube_r412 = Jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(22, 93).addBox(0.1962F, 0.6501F, -10.8142F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(17, 93).addBox(0.1962F, 0.6024F, -11.4119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(96, 96).addBox(0.1962F, 0.5547F, -12.0097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, -0.0611F, 0.1004F, 0.0F));

		PartDefinition cube_r413 = Jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(91, 96).addBox(0.1962F, -0.5544F, -12.7014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 89).addBox(0.1962F, -0.6294F, -13.3014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, 0.0262F, 0.1004F, 0.0F));

		PartDefinition cube_r414 = Jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(98, 32).addBox(-0.4081F, -0.2933F, -5.7819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 93).addBox(-0.4081F, -0.4933F, -5.1819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 93).addBox(-0.4081F, -0.4933F, -4.5819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(89, 92).addBox(-0.4081F, -0.3933F, -3.9819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(84, 92).addBox(-0.4081F, -0.4683F, -3.3819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(79, 92).addBox(-0.4081F, -0.6183F, -2.7819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(74, 92).addBox(-0.4081F, -0.4433F, -2.1819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(29, 89).addBox(-0.4081F, -0.4433F, -1.5819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(24, 89).addBox(-0.4081F, -0.5183F, -0.9819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2379F, 0.3768F, -19.1144F, -0.0088F, 0.048F, -0.0017F));

		PartDefinition cube_r415 = Jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(89, 0).addBox(-0.7252F, -0.2594F, -4.8674F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 89).addBox(-0.7252F, -0.3594F, -5.4674F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(88, 63).addBox(-0.7252F, -0.3594F, -6.0674F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(54, 88).addBox(-0.7252F, -0.2594F, -6.6674F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(69, 89).addBox(-0.7252F, -0.4594F, -7.2674F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.4379F, 0.3768F, -12.3144F, -0.0089F, 0.1352F, -0.0021F));

		PartDefinition cube_r416 = Jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(92, 69).addBox(-0.7157F, -0.4141F, -4.4062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(92, 51).addBox(-0.7157F, -0.4391F, -3.8062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(38, 71).addBox(-0.7157F, -0.2391F, -3.2062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(63, 85).addBox(-0.7157F, -0.3891F, -2.6062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(19, 89).addBox(-0.7157F, -0.2891F, -0.8062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.4379F, 0.3768F, -12.3144F, 0.0262F, 0.1353F, 0.0F));

		PartDefinition cube_r417 = Jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(79, 86).addBox(-0.7157F, -0.324F, -1.9781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.4379F, 0.3768F, -12.3144F, -0.0175F, 0.1353F, 0.0F));

		PartDefinition cube_r418 = Jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(87, 19).addBox(-0.7157F, -0.158F, -1.3774F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.4379F, 0.3768F, -12.3144F, -0.0087F, 0.1353F, 0.0F));

		PartDefinition cube_r419 = Jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(54, 16).addBox(-0.9644F, 0.9016F, -4.0581F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.4379F, 0.3768F, -12.3144F, -0.0567F, 0.1353F, 0.0F));

		PartDefinition cube_r420 = Jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(74, 75).addBox(-0.9644F, 0.9154F, -6.9991F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4379F, 0.3768F, -12.3144F, -0.0654F, 0.1353F, 0.0F));

		PartDefinition cube_r421 = Jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(65, 75).addBox(-0.9644F, 0.718F, -7.0216F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(1.4379F, 0.3768F, -12.3144F, -0.048F, 0.1353F, 0.0F));

		PartDefinition cube_r422 = Jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(58, 0).addBox(-0.9644F, 0.6206F, -4.1224F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(1.4379F, 0.3768F, -12.3144F, -0.0262F, 0.1353F, 0.0F));

		PartDefinition cube_r423 = Jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(100, 78).addBox(-0.1466F, -1.2347F, -1.2556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, -1.7104F, 0.0873F, 0.0F));

		PartDefinition cube_r424 = Jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(100, 75).addBox(-0.1466F, -0.879F, -0.096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, -0.7069F, 0.0873F, 0.0F));

		PartDefinition cube_r425 = Jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(99, 90).addBox(-0.1466F, -0.0955F, -0.883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, 0.6021F, 0.0873F, 0.0F));

		PartDefinition cube_r426 = Jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(75, 100).addBox(-0.1466F, -1.7573F, -1.012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, 2.042F, 0.0873F, 0.0F));

		PartDefinition cube_r427 = Jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(50, 99).addBox(-0.1466F, -1.1591F, 1.6375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, -2.7576F, 0.0873F, 0.0F));

		PartDefinition cube_r428 = Jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(40, 100).addBox(-0.1466F, 2.5265F, 0.3846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, -1.2741F, 0.0873F, 0.0F));

		PartDefinition cube_r429 = Jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(98, 26).addBox(-0.1466F, 0.9759F, -4.2325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, 0.1222F, 0.0873F, 0.0F));

		PartDefinition cube_r430 = Jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(97, 4).addBox(-0.1801F, -0.8039F, -0.8673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, -1.2217F, 0.0698F, 0.0F));

		PartDefinition cube_r431 = Jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(30, 97).addBox(-0.1801F, -0.1173F, 0.0129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.033F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, -2.6616F, 0.0698F, 0.0F));

		PartDefinition cube_r432 = Jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(5, 97).addBox(-0.1801F, -1.9379F, -0.1173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, 2.0508F, 0.0698F, 0.0F));

		PartDefinition cube_r433 = Jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(25, 100).addBox(-0.1801F, -1.0419F, -2.7333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.033F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, 0.5672F, 0.0698F, 0.0F));

		PartDefinition cube_r434 = Jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(5, 100).addBox(-0.1466F, -5.8657F, -2.4301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, 1.5882F, 0.0873F, 0.0F));

		PartDefinition cube_r435 = Jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(20, 100).addBox(-0.1466F, 1.4301F, -4.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, 0.0175F, 0.0873F, 0.0F));

		PartDefinition cube_r436 = Jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(99, 93).addBox(-0.1466F, -0.1203F, -4.0675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.033F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, 0.3054F, 0.0873F, 0.0F));

		PartDefinition cube_r437 = Jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(20, 97).addBox(-0.1466F, -1.2459F, -3.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.8379F, 0.3768F, 0.6856F, 0.6545F, 0.0873F, 0.0F));

		return LayerDefinition.create(meshdefinition, 106, 106);
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