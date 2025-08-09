package fossils.fossils.client.blockentity.model.xinpusaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class XinpusaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Xinpusaurus;
	private final ModelPart Chest;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart Jaw;
	private final ModelPart RArm;
	private final ModelPart RArm2;
	private final ModelPart RHand;
	private final ModelPart RArm3;
	private final ModelPart RArm4;
	private final ModelPart RHand2;
	private final ModelPart Hip;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RFoot;
	private final ModelPart RLeg3;
	private final ModelPart RLeg4;
	private final ModelPart RFoot2;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;

	public XinpusaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Xinpusaurus = this.fossil.getChild("Xinpusaurus");
		this.Chest = this.Xinpusaurus.getChild("Chest");
		this.Neck = this.Chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.bone = this.Head.getChild("bone");
		this.bone2 = this.Head.getChild("bone2");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Chest.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Chest.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
		this.Hip = this.Xinpusaurus.getChild("Hip");
		this.RLeg = this.Hip.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RFoot = this.RLeg2.getChild("RFoot");
		this.RLeg3 = this.Hip.getChild("RLeg3");
		this.RLeg4 = this.RLeg3.getChild("RLeg4");
		this.RFoot2 = this.RLeg4.getChild("RFoot2");
		this.Tail = this.Hip.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Xinpusaurus = fossil.addOrReplaceChild("Xinpusaurus", CubeListBuilder.create().texOffs(35, 0).addBox(-2.0F, 1.4F, -6.0F, 4.0F, 2.0F, 13.0F, new CubeDeformation(0.01F))
				.texOffs(54, 86).addBox(0.0F, -4.45F, -6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 87).addBox(0.0F, -4.55F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 26).addBox(0.0F, -4.65F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 30).addBox(0.0F, -4.65F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 37).addBox(0.0F, -4.65F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 88).addBox(0.0F, -4.65F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 88).addBox(0.0F, -4.55F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 16).addBox(-0.5F, -2.7F, -6.1F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, -0.0373F, 0.2867F, -0.4473F));

		PartDefinition cube_r1 = Xinpusaurus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(86, 82).mirror().addBox(-3.2873F, -1.7282F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 6.1209F, 0.023F, 0.5202F, -1.5584F));

		PartDefinition cube_r2 = Xinpusaurus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(86, 80).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 6.1209F, 0.5091F, 0.2072F, -0.4511F));

		PartDefinition cube_r3 = Xinpusaurus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 6.1209F, 0.2973F, 0.434F, -0.9749F));

		PartDefinition cube_r4 = Xinpusaurus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(78, 71).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 4.1209F, 0.2973F, 0.434F, -0.8353F));

		PartDefinition cube_r5 = Xinpusaurus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-4.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 4.1209F, 0.023F, 0.5202F, -1.4188F));

		PartDefinition cube_r6 = Xinpusaurus.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(86, 78).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 4.1209F, 0.5091F, 0.2072F, -0.3115F));

		PartDefinition cube_r7 = Xinpusaurus.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(78, 69).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 2.1209F, 0.2973F, 0.434F, -0.8353F));

		PartDefinition cube_r8 = Xinpusaurus.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(79, 79).mirror().addBox(-4.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 2.1209F, 0.023F, 0.5202F, -1.4188F));

		PartDefinition cube_r9 = Xinpusaurus.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(86, 76).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 2.1209F, 0.5091F, 0.2072F, -0.3115F));

		PartDefinition cube_r10 = Xinpusaurus.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(78, 67).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 0.1209F, 0.2973F, 0.434F, -0.8353F));

		PartDefinition cube_r11 = Xinpusaurus.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(79, 77).mirror().addBox(-4.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 0.1209F, 0.023F, 0.5202F, -1.4188F));

		PartDefinition cube_r12 = Xinpusaurus.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(86, 56).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 0.1209F, 0.5091F, 0.2072F, -0.3115F));

		PartDefinition cube_r13 = Xinpusaurus.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(76, 58).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -1.8791F, 0.2973F, 0.434F, -0.8353F));

		PartDefinition cube_r14 = Xinpusaurus.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(51, 79).mirror().addBox(-4.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -1.8791F, 0.023F, 0.5202F, -1.4188F));

		PartDefinition cube_r15 = Xinpusaurus.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(86, 35).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -1.8791F, 0.5091F, 0.2072F, -0.3115F));

		PartDefinition cube_r16 = Xinpusaurus.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(75, 29).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -3.8791F, 0.2973F, 0.434F, -0.8353F));

		PartDefinition cube_r17 = Xinpusaurus.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(44, 79).mirror().addBox(-4.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -3.8791F, 0.023F, 0.5202F, -1.4188F));

		PartDefinition cube_r18 = Xinpusaurus.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(86, 7).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -3.8791F, 0.5091F, 0.2072F, -0.3115F));

		PartDefinition cube_r19 = Xinpusaurus.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(85, 71).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -5.8791F, 0.5602F, 0.223F, -0.3006F));

		PartDefinition cube_r20 = Xinpusaurus.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(71, 67).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -5.8791F, 0.3368F, 0.4725F, -0.818F));

		PartDefinition cube_r21 = Xinpusaurus.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(79, 35).mirror().addBox(-4.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -5.8791F, 0.0324F, 0.5719F, -1.4139F));

		PartDefinition cube_r22 = Xinpusaurus.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(86, 82).addBox(2.2873F, -1.7282F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 6.1209F, 0.023F, -0.5202F, 1.5584F));

		PartDefinition cube_r23 = Xinpusaurus.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(86, 80).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 6.1209F, 0.5091F, -0.2072F, 0.4511F));

		PartDefinition cube_r24 = Xinpusaurus.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(79, 0).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 6.1209F, 0.2973F, -0.434F, 0.9749F));

		PartDefinition cube_r25 = Xinpusaurus.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(78, 71).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 4.1209F, 0.2973F, -0.434F, 0.8353F));

		PartDefinition cube_r26 = Xinpusaurus.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(5, 80).addBox(2.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 4.1209F, 0.023F, -0.5202F, 1.4188F));

		PartDefinition cube_r27 = Xinpusaurus.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(86, 78).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 4.1209F, 0.5091F, -0.2072F, 0.3115F));

		PartDefinition cube_r28 = Xinpusaurus.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(78, 69).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 2.1209F, 0.2973F, -0.434F, 0.8353F));

		PartDefinition cube_r29 = Xinpusaurus.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(79, 79).addBox(2.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 2.1209F, 0.023F, -0.5202F, 1.4188F));

		PartDefinition cube_r30 = Xinpusaurus.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(86, 76).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 2.1209F, 0.5091F, -0.2072F, 0.3115F));

		PartDefinition cube_r31 = Xinpusaurus.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(78, 67).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 0.1209F, 0.2973F, -0.434F, 0.8353F));

		PartDefinition cube_r32 = Xinpusaurus.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(79, 77).addBox(2.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 0.1209F, 0.023F, -0.5202F, 1.4188F));

		PartDefinition cube_r33 = Xinpusaurus.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(86, 56).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 0.1209F, 0.5091F, -0.2072F, 0.3115F));

		PartDefinition cube_r34 = Xinpusaurus.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(76, 58).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -1.8791F, 0.2973F, -0.434F, 0.8353F));

		PartDefinition cube_r35 = Xinpusaurus.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(51, 79).addBox(2.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -1.8791F, 0.023F, -0.5202F, 1.4188F));

		PartDefinition cube_r36 = Xinpusaurus.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(86, 35).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -1.8791F, 0.5091F, -0.2072F, 0.3115F));

		PartDefinition cube_r37 = Xinpusaurus.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(75, 29).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -3.8791F, 0.2973F, -0.434F, 0.8353F));

		PartDefinition cube_r38 = Xinpusaurus.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(44, 79).addBox(2.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -3.8791F, 0.023F, -0.5202F, 1.4188F));

		PartDefinition cube_r39 = Xinpusaurus.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(86, 7).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -3.8791F, 0.5091F, -0.2072F, 0.3115F));

		PartDefinition cube_r40 = Xinpusaurus.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(85, 71).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -5.8791F, 0.5602F, -0.223F, 0.3006F));

		PartDefinition cube_r41 = Xinpusaurus.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(71, 67).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -5.8791F, 0.3368F, -0.4725F, 0.818F));

		PartDefinition cube_r42 = Xinpusaurus.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(79, 35).addBox(2.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -5.8791F, 0.0324F, -0.5719F, 1.4139F));

		PartDefinition Chest = Xinpusaurus.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(13, 88).addBox(0.0F, -1.275F, -6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 88).addBox(0.0F, -1.775F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 88).addBox(0.0F, -1.975F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.275F, -6.0F, -0.0117F, 0.3515F, 0.0929F));

		PartDefinition cube_r43 = Chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(80, 45).mirror().addBox(0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 69).mirror().addBox(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2869F, 4.2831F, -3.7307F, 1.2953F, 0.0673F, 0.1124F));

		PartDefinition cube_r44 = Chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(30, 73).mirror().addBox(-0.5F, -0.833F, -1.4807F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1059F, 3.2662F, -2.5767F, 1.8538F, 0.0673F, 0.0687F));

		PartDefinition cube_r45 = Chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(49, 63).mirror().addBox(-0.5F, -1.4654F, -1.7943F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1059F, 3.2662F, -2.5767F, 1.0335F, 0.0673F, 0.0687F));

		PartDefinition cube_r46 = Chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(86, 84).mirror().addBox(-3.2873F, -1.7282F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2493F, -3.7791F, 0.0611F, 0.7096F, -1.3967F));

		PartDefinition cube_r47 = Chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(79, 2).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2493F, -3.7791F, 0.4501F, 0.5718F, -0.7614F));

		PartDefinition cube_r48 = Chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(83, 86).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2493F, -3.7791F, 0.6983F, 0.2622F, -0.2674F));

		PartDefinition cube_r49 = Chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(87, 13).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1493F, -1.7791F, 0.5773F, 0.2282F, -0.2968F));

		PartDefinition cube_r50 = Chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(79, 8).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1493F, -1.7791F, 0.3502F, 0.4852F, -0.8118F));

		PartDefinition cube_r51 = Chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(71, 54).mirror().addBox(-3.2873F, -1.7282F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1493F, -1.7791F, 0.0357F, 0.5892F, -1.4121F));

		PartDefinition cube_r52 = Chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(80, 45).addBox(-1.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 69).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2869F, 4.2831F, -3.7307F, 1.2953F, -0.0673F, -0.1124F));

		PartDefinition cube_r53 = Chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(30, 73).addBox(-0.5F, -0.833F, -1.4807F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.1059F, 3.2662F, -2.5767F, 1.8538F, -0.0673F, -0.0687F));

		PartDefinition cube_r54 = Chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(49, 63).addBox(-0.5F, -1.4654F, -1.7943F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1059F, 3.2662F, -2.5767F, 1.0335F, -0.0673F, -0.0687F));

		PartDefinition cube_r55 = Chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(23, 57).addBox(-0.5F, -0.25F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.275F, -6.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(87, 64).addBox(0.766F, -0.6428F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.525F, -5.5F, 0.3476F, -0.751F, 1.2271F));

		PartDefinition cube_r57 = Chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(86, 84).addBox(2.2873F, -1.7282F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2493F, -3.7791F, 0.0611F, -0.7096F, 1.3967F));

		PartDefinition cube_r58 = Chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(79, 2).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2493F, -3.7791F, 0.4501F, -0.5718F, 0.7614F));

		PartDefinition cube_r59 = Chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(83, 86).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2493F, -3.7791F, 0.6983F, -0.2622F, 0.2674F));

		PartDefinition cube_r60 = Chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(87, 13).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1493F, -1.7791F, 0.5773F, -0.2282F, 0.2968F));

		PartDefinition cube_r61 = Chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(79, 8).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1493F, -1.7791F, 0.3502F, -0.4852F, 0.8118F));

		PartDefinition cube_r62 = Chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(71, 54).addBox(2.2873F, -1.7282F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1493F, -1.7791F, 0.0357F, -0.5892F, 1.4121F));

		PartDefinition cube_r63 = Chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(87, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.525F, -5.5F, 0.7414F, -0.3712F, 0.5215F));

		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(64, 22).addBox(-0.5F, -0.35F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(89, 4).addBox(0.0F, -1.25F, -1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4144F, -6.1311F, -0.139F, 0.3205F, 0.1478F));

		PartDefinition cube_r64 = Neck.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(22, 88).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.25F, -1.4F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -2.9F, -0.2322F, 0.2618F, -0.0036F));

		PartDefinition cube_r65 = Head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(60, 69).addBox(-1.0F, -0.7905F, -0.2004F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 1.7539F, -14.83F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(62, 37).addBox(-1.0F, -0.7906F, -5.8004F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5F, 0.8753F, -12.3829F, 0.3447F, 0.0F, 0.0F));

		PartDefinition cube_r67 = Head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(65, 77).addBox(-1.0F, -0.0906F, -1.8754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -0.2921F, -10.957F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r68 = Head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(37, 73).addBox(-1.0F, -0.0278F, -2.0003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.5F, -0.9637F, -9.0793F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r69 = Head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(9, 71).addBox(-0.5F, -0.0354F, -2.0213F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.4412F, -7.1441F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r70 = Head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(27, 41).addBox(-1.0F, -0.0287F, -0.9881F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, -1.657F, -6.2388F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r71 = Head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(75, 19).addBox(-1.0F, -0.0139F, -1.0028F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.8278F, -5.2691F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r72 = Head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(70, 0).addBox(-1.0F, -0.0267F, -2.0094F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9259F, -3.2724F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r73 = Head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(70, 7).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9448F, -2.2888F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r74 = Head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(70, 4).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.9099F, -1.2895F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r75 = Head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 71).addBox(-1.5F, 0.0F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8002F, -0.3962F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r76 = Head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(73, 22).addBox(-1.5F, 0.0035F, -0.9999F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, -1.5802F, 0.6402F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r77 = Head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(71, 51).addBox(-1.5F, 0.2035F, 0.0001F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.0001F, -0.2892F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.0F, -0.0106F, -0.3781F));

		PartDefinition cube_r78 = leftFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(84, 10).addBox(-1.0F, -1.4156F, -2.0004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.425F, 1.4091F, -10.7284F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(35, 81).addBox(-0.75F, -1.1429F, -0.3447F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 82).addBox(-0.75F, -0.8429F, 0.3553F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.625F, 1.0982F, -11.9847F, 0.4974F, 0.0524F, 0.0F));

		PartDefinition cube_r80 = leftFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(68, 81).addBox(-0.75F, -1.1457F, 1.0735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.625F, 1.0982F, -11.9847F, 0.192F, 0.0524F, 0.0F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(72, 77).addBox(-0.875F, -0.8906F, -0.1004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.625F, 1.0982F, -11.9847F, 0.1658F, 0.0524F, 0.0F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(45, 81).addBox(-0.45F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6525F, 0.9556F, -9.5036F, -0.6881F, 0.0844F, -0.065F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(85, 17).addBox(-0.925F, 1.2042F, -1.3726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(83, 73).addBox(-0.925F, 2.5042F, -2.5726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.025F, -0.9807F, -6.7005F, -0.5321F, 0.1396F, 0.0031F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(84, 4).addBox(-0.925F, 0.7847F, -3.4936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.025F, -0.9807F, -6.7005F, 0.1224F, 0.1396F, 0.0031F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(82, 27).addBox(-1.0F, 0.9825F, -0.6844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0106F)), PartPose.offsetAndRotation(0.025F, -0.9807F, -6.7005F, -0.0958F, 0.1396F, 0.0031F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 74).addBox(-1.0F, 0.881F, -3.0914F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.025F, -0.9807F, -6.7005F, 0.1405F, 0.139F, 0.0129F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(79, 31).addBox(-0.925F, 1.5759F, -1.1676F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.025F, -0.9807F, -6.7005F, -0.9859F, 0.1396F, 0.0031F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(5, 85).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(58, 82).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5089F, -0.4596F, -8.4044F, 0.3457F, 0.1515F, 0.0086F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(70, 10).addBox(-1.0F, -0.4873F, -1.972F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.025F, -0.9807F, -6.7005F, 0.2536F, 0.148F, 0.0053F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(23, 75).addBox(-1.025F, -0.0267F, -2.0094F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9152F, -2.8943F, 0.0613F, 0.1221F, 0.0027F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(84, 42).addBox(-1.0F, -0.2814F, -2.9839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -1.9152F, -2.8943F, 0.1834F, 0.1221F, 0.0027F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(44, 70).addBox(-0.78F, -1.1246F, 0.6846F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.9152F, -2.8943F, -2.164F, 0.1221F, 0.0027F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(23, 70).addBox(-0.78F, 0.9259F, -0.2117F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.5F, -1.9152F, -2.8943F, -1.239F, 0.1221F, 0.0027F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(9, 66).addBox(-0.78F, 1.3593F, -2.4227F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.9152F, -2.8943F, -0.2791F, 0.1221F, 0.0027F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(17, 65).addBox(-1.32F, 0.5758F, -2.4179F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(51, 70).addBox(-0.56F, 0.5758F, -2.4179F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.5F, -1.9152F, -2.8943F, 0.0002F, 0.1221F, 0.0027F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(79, 4).addBox(-1.0F, -0.4083F, -3.9423F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.5F, -1.9152F, -2.8943F, 0.2183F, 0.1221F, 0.0027F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(28, 82).addBox(-1.0F, 1.0063F, 0.031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.025F, -0.9807F, -6.7005F, 0.0351F, 0.1396F, 0.0031F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(77, 37).addBox(-1.0F, 2.1415F, -3.2947F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.9152F, -2.8943F, -0.1002F, 0.1221F, 0.0027F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(63, 85).addBox(-1.0F, 1.9395F, -1.6971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -1.9152F, -2.8943F, 0.0351F, 0.1221F, 0.0027F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(78, 81).addBox(-1.0F, 0.7275F, -1.2891F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -1.9152F, -2.8943F, 0.2445F, 0.1221F, 0.0027F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(27, 36).addBox(-0.78F, 0.973F, -1.811F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.5F, -1.9152F, -2.8943F, 0.0525F, 0.1221F, 0.0027F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(16, 75).addBox(-0.675F, 0.9963F, 0.796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.5F, -1.9152F, -2.8943F, -0.6282F, 0.1221F, 0.0027F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(16, 70).addBox(-1.0F, 0.8651F, -1.3388F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(77, 41).addBox(-0.675F, 2.1901F, -0.2388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, -1.9152F, -2.8943F, 0.0263F, 0.1221F, 0.0027F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 78).addBox(0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -1.0454F, 0.8469F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(30, 70).addBox(-0.5F, 0.15F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.1408F, 0.3561F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(30, 78).addBox(0.5F, -0.5F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -1.0454F, 0.8469F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(17, 60).addBox(-0.4F, -0.475F, -1.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4661F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.0106F, -0.3781F));

		PartDefinition cube_r108 = rightFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(84, 10).mirror().addBox(0.0F, -1.4156F, -2.0004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.425F, 1.4091F, -10.7284F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(35, 81).mirror().addBox(-0.25F, -1.1429F, -0.3447F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 82).mirror().addBox(-0.25F, -0.8429F, 0.3553F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.625F, 1.0982F, -11.9847F, 0.4974F, -0.0524F, 0.0F));

		PartDefinition cube_r110 = rightFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(68, 81).mirror().addBox(-0.25F, -1.1457F, 1.0735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.625F, 1.0982F, -11.9847F, 0.192F, -0.0524F, 0.0F));

		PartDefinition cube_r111 = rightFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(72, 77).mirror().addBox(-0.125F, -0.8906F, -0.1004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.625F, 1.0982F, -11.9847F, 0.1658F, -0.0524F, 0.0F));

		PartDefinition cube_r112 = rightFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(45, 81).mirror().addBox(-0.55F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6525F, 0.9556F, -9.5036F, -0.6881F, -0.0844F, 0.065F));

		PartDefinition cube_r113 = rightFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(85, 17).mirror().addBox(-0.075F, 1.2042F, -1.3726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(83, 73).mirror().addBox(-0.075F, 2.5042F, -2.5726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.025F, -0.9807F, -6.7005F, -0.5321F, -0.1396F, -0.0031F));

		PartDefinition cube_r114 = rightFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(84, 4).mirror().addBox(-0.075F, 0.7847F, -3.4936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.025F, -0.9807F, -6.7005F, 0.1224F, -0.1396F, -0.0031F));

		PartDefinition cube_r115 = rightFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(82, 27).mirror().addBox(0.0F, 0.9825F, -0.6844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0106F)).mirror(false), PartPose.offsetAndRotation(-0.025F, -0.9807F, -6.7005F, -0.0958F, -0.1396F, -0.0031F));

		PartDefinition cube_r116 = rightFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(0.0F, 0.881F, -3.0914F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.025F, -0.9807F, -6.7005F, 0.1405F, -0.139F, -0.0129F));

		PartDefinition cube_r117 = rightFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(79, 31).mirror().addBox(-0.075F, 1.5759F, -1.1676F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.025F, -0.9807F, -6.7005F, -0.9859F, -0.1396F, -0.0031F));

		PartDefinition cube_r118 = rightFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(5, 85).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(58, 82).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5089F, -0.4596F, -8.4044F, 0.3457F, -0.1515F, -0.0086F));

		PartDefinition cube_r119 = rightFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(70, 10).mirror().addBox(0.0F, -0.4873F, -1.972F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.025F, -0.9807F, -6.7005F, 0.2536F, -0.148F, -0.0053F));

		PartDefinition cube_r120 = rightFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(23, 75).mirror().addBox(0.025F, -0.0267F, -2.0094F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9152F, -2.8943F, 0.0613F, -0.1221F, -0.0027F));

		PartDefinition cube_r121 = rightFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(84, 42).mirror().addBox(0.0F, -0.2814F, -2.9839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9152F, -2.8943F, 0.1834F, -0.1221F, -0.0027F));

		PartDefinition cube_r122 = rightFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(44, 70).mirror().addBox(-0.22F, -1.1246F, 0.6846F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9152F, -2.8943F, -2.164F, -0.1221F, -0.0027F));

		PartDefinition cube_r123 = rightFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(23, 70).mirror().addBox(-0.22F, 0.9259F, -0.2117F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9152F, -2.8943F, -1.239F, -0.1221F, -0.0027F));

		PartDefinition cube_r124 = rightFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(9, 66).mirror().addBox(-0.22F, 1.3593F, -2.4227F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9152F, -2.8943F, -0.2791F, -0.1221F, -0.0027F));

		PartDefinition cube_r125 = rightFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(17, 65).mirror().addBox(-0.68F, 0.5758F, -2.4179F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(51, 70).mirror().addBox(-0.44F, 0.5758F, -2.4179F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9152F, -2.8943F, 0.0002F, -0.1221F, -0.0027F));

		PartDefinition cube_r126 = rightFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(79, 4).mirror().addBox(0.0F, -0.4083F, -3.9423F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9152F, -2.8943F, 0.2183F, -0.1221F, -0.0027F));

		PartDefinition cube_r127 = rightFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(28, 82).mirror().addBox(0.0F, 1.0063F, 0.031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.025F, -0.9807F, -6.7005F, 0.0351F, -0.1396F, -0.0031F));

		PartDefinition cube_r128 = rightFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(77, 37).mirror().addBox(0.0F, 2.1415F, -3.2947F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9152F, -2.8943F, -0.1002F, -0.1221F, -0.0027F));

		PartDefinition cube_r129 = rightFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(63, 85).mirror().addBox(0.0F, 1.9395F, -1.6971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9152F, -2.8943F, 0.0351F, -0.1221F, -0.0027F));

		PartDefinition cube_r130 = rightFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(78, 81).mirror().addBox(0.0F, 0.7275F, -1.2891F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9152F, -2.8943F, 0.2445F, -0.1221F, -0.0027F));

		PartDefinition cube_r131 = rightFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(27, 36).mirror().addBox(-0.22F, 0.973F, -1.811F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9152F, -2.8943F, 0.0525F, -0.1221F, -0.0027F));

		PartDefinition cube_r132 = rightFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(16, 75).mirror().addBox(-0.325F, 0.9963F, 0.796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9152F, -2.8943F, -0.6282F, -0.1221F, -0.0027F));

		PartDefinition cube_r133 = rightFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(16, 70).mirror().addBox(0.0F, 0.8651F, -1.3388F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(77, 41).mirror().addBox(-0.325F, 2.1901F, -0.2388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9152F, -2.8943F, 0.0263F, -0.1221F, -0.0027F));

		PartDefinition cube_r134 = rightFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-1.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0454F, 0.8469F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(30, 70).mirror().addBox(-0.5F, 0.15F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1408F, 0.3561F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(30, 78).mirror().addBox(-1.5F, -0.5F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0454F, 0.8469F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(17, 60).mirror().addBox(-0.6F, -0.475F, -1.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4661F, 0.0F, 0.0F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7999F, -5.9892F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r138 = bone.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(58, 74).addBox(-0.88F, -0.8567F, -0.7964F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.355F, -1.2557F, -2.989F, 0.5018F, 0.0F, 0.0F));

		PartDefinition cube_r139 = bone.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(60, 63).addBox(-2.0F, 0.676F, -3.1214F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -3.7258F, 2.7168F, 0.0007F, 0.1217F, 0.0112F));

		PartDefinition bone2 = Head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7999F, -5.9892F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r140 = bone2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(58, 74).mirror().addBox(-0.12F, -0.8567F, -0.7964F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.355F, -1.2557F, -2.989F, 0.5018F, 0.0F, 0.0F));

		PartDefinition cube_r141 = bone2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(0.0F, 0.881F, -3.0914F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -2.7913F, -1.0895F, 0.1405F, -0.139F, -0.0129F));

		PartDefinition cube_r142 = bone2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(69, 73).mirror().addBox(-0.5F, -1.1F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8183F, 2.9529F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r143 = bone2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(64, 16).mirror().addBox(-0.5F, -0.9F, -1.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5F, 3.6F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r144 = bone2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(60, 63).mirror().addBox(0.0F, 0.676F, -3.1214F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -3.7258F, 2.7168F, 0.0007F, -0.1217F, -0.0112F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.825F, 0.5535F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r145 = Jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(24, 85).mirror().addBox(0.0F, -0.2697F, -0.7802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0866F, -2.8075F, -1.1868F, -0.1091F, 0.0F));

		PartDefinition cube_r146 = Jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(85, 23).mirror().addBox(-0.5F, -0.575F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0197F)).mirror(false)
				.texOffs(85, 23).addBox(1.5F, -0.575F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0197F)), PartPose.offsetAndRotation(-1.0F, 0.3981F, -2.3207F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(82, 14).mirror().addBox(-0.5F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(82, 14).addBox(1.5F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0F, 0.7317F, -1.9872F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(26, 65).mirror().addBox(-1.5F, -0.0049F, -2.9661F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.023F)).mirror(false)
				.texOffs(26, 65).addBox(0.5F, -0.0049F, -2.9661F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(0.0F, -0.1637F, 0.3633F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r149 = Jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(85, 20).mirror().addBox(-1.5F, -1.7395F, -1.0014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(19, 85).mirror().addBox(-1.5F, -0.9395F, -1.0014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(85, 20).addBox(0.5F, -1.7395F, -1.0014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(19, 85).addBox(0.5F, -0.9395F, -1.0014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6874F, -0.7227F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r150 = Jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(75, 25).mirror().addBox(0.0F, -0.573F, -2.0011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0866F, -2.8075F, 0.1484F, -0.1091F, 0.0F));

		PartDefinition cube_r151 = Jaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(29, 85).mirror().addBox(0.0F, -0.2368F, -2.8444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(0, 66).mirror().addBox(0.0F, -0.0368F, -2.8444F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0866F, -2.8075F, -0.0262F, -0.1091F, 0.0F));

		PartDefinition cube_r152 = Jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(34, 85).mirror().addBox(0.0F, 0.2314F, -3.2868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0866F, -2.8075F, -0.2094F, -0.1091F, 0.0F));

		PartDefinition cube_r153 = Jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(51, 75).mirror().addBox(0.0F, -0.4854F, -5.234F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0866F, -2.8075F, 0.0087F, -0.1091F, 0.0F));

		PartDefinition cube_r154 = Jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(35, 68).mirror().addBox(0.0F, 0.0592F, -5.7461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(44, 75).mirror().addBox(0.0F, -0.0158F, -7.6211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(67, 56).mirror().addBox(0.0F, 0.1592F, -5.7461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0866F, -2.8075F, -0.096F, -0.1091F, 0.0F));

		PartDefinition cube_r155 = Jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(7, 76).mirror().addBox(0.0F, 0.9468F, -7.4523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0866F, -2.8075F, -0.2182F, -0.1091F, 0.0F));

		PartDefinition cube_r156 = Jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(76, 73).mirror().addBox(0.0F, 0.0212F, -9.1927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(85, 48).mirror().addBox(-0.05F, -0.7225F, -7.4212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 81).mirror().addBox(0.0F, -1.0475F, -8.0212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0866F, -2.8075F, -0.0785F, -0.1091F, 0.0F));

		PartDefinition cube_r157 = Jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(37, 77).mirror().addBox(-0.4885F, -0.4668F, -0.9881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0115F, 1.0659F, -12.4242F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r158 = Jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(77, 10).mirror().addBox(-0.4885F, -0.5342F, -1.009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.0115F, 1.0659F, -12.4242F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r159 = Jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(85, 61).mirror().addBox(-0.6254F, -0.5055F, 0.399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(85, 58).mirror().addBox(-0.6254F, -0.5805F, -0.201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(58, 85).mirror().addBox(-0.6254F, -0.6055F, -0.801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(49, 85).mirror().addBox(-0.6254F, -0.4305F, -1.401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4151F, 0.5696F, -8.1172F, -0.0791F, -0.1613F, 0.0042F));

		PartDefinition cube_r160 = Jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(85, 45).mirror().addBox(0.0F, -2.2568F, -8.4965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(44, 85).mirror().addBox(0.0F, -1.8568F, -8.4965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(39, 85).mirror().addBox(0.0F, -2.0568F, -9.1965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(76, 54).mirror().addBox(0.0F, -1.5568F, -9.1965F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0866F, -2.8075F, 0.096F, -0.1091F, 0.0F));

		PartDefinition cube_r161 = Jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(58, 78).mirror().addBox(-1.5F, -1.9895F, -1.0264F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(58, 78).addBox(0.5F, -1.9895F, -1.0264F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.9907F, -1.6769F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r162 = Jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(5, 82).mirror().addBox(-1.5F, -1.1395F, -1.0513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(5, 82).addBox(0.5F, -1.1395F, -1.0513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.781F, -0.6877F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r163 = Jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(75, 15).mirror().addBox(-0.1F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(75, 15).addBox(1.9F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.4F, -0.173F, 0.3306F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(24, 85).addBox(-1.0F, -0.2697F, -0.7802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.5F, 1.0866F, -2.8075F, -1.1868F, 0.1091F, 0.0F));

		PartDefinition cube_r165 = Jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(75, 25).addBox(-1.0F, -0.573F, -2.0011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5F, 1.0866F, -2.8075F, 0.1484F, 0.1091F, 0.0F));

		PartDefinition cube_r166 = Jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(29, 85).addBox(-1.0F, -0.2368F, -2.8444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(0, 66).addBox(-1.0F, -0.0368F, -2.8444F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5F, 1.0866F, -2.8075F, -0.0262F, 0.1091F, 0.0F));

		PartDefinition cube_r167 = Jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(34, 85).addBox(-1.0F, 0.2314F, -3.2868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.5F, 1.0866F, -2.8075F, -0.2094F, 0.1091F, 0.0F));

		PartDefinition cube_r168 = Jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(51, 75).addBox(-1.0F, -0.4854F, -5.234F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5F, 1.0866F, -2.8075F, 0.0087F, 0.1091F, 0.0F));

		PartDefinition cube_r169 = Jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(35, 68).addBox(-1.0F, 0.0592F, -5.7461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F))
				.texOffs(44, 75).addBox(-1.0F, -0.0158F, -7.6211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F))
				.texOffs(67, 56).addBox(-1.0F, 0.1592F, -5.7461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5F, 1.0866F, -2.8075F, -0.096F, 0.1091F, 0.0F));

		PartDefinition cube_r170 = Jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(7, 76).addBox(-1.0F, 0.9468F, -7.4523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, 1.0866F, -2.8075F, -0.2182F, 0.1091F, 0.0F));

		PartDefinition cube_r171 = Jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(76, 73).addBox(-1.0F, 0.0212F, -9.1927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F))
				.texOffs(85, 48).addBox(-0.95F, -0.7225F, -7.4212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 81).addBox(-1.0F, -1.0475F, -8.0212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5F, 1.0866F, -2.8075F, -0.0785F, 0.1091F, 0.0F));

		PartDefinition cube_r172 = Jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(85, 61).addBox(-0.3746F, -0.5055F, 0.399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(85, 58).addBox(-0.3746F, -0.5805F, -0.201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(58, 85).addBox(-0.3746F, -0.6055F, -0.801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(49, 85).addBox(-0.3746F, -0.4305F, -1.401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4151F, 0.5696F, -8.1172F, -0.0791F, 0.1613F, -0.0042F));

		PartDefinition cube_r173 = Jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(85, 45).addBox(-1.0F, -2.2568F, -8.4965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(44, 85).addBox(-1.0F, -1.8568F, -8.4965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(39, 85).addBox(-1.0F, -2.0568F, -9.1965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(76, 54).addBox(-1.0F, -1.5568F, -9.1965F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, 1.0866F, -2.8075F, 0.096F, 0.1091F, 0.0F));

		PartDefinition RArm = Chest.addOrReplaceChild("RArm", CubeListBuilder.create().texOffs(64, 27).addBox(0.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 3.775F, -3.0F, 1.435F, -1.3977F, 0.2694F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create().texOffs(71, 64).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5F, 1.0F, 0.0F, -0.0681F, 0.298F, -0.2284F));

		PartDefinition cube_r174 = RArm2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(71, 61).addBox(1.0F, -1.0F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create().texOffs(0, 60).addBox(-0.3422F, -0.7394F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition RArm3 = Chest.addOrReplaceChild("RArm3", CubeListBuilder.create().texOffs(64, 27).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 3.775F, -3.0F, 1.435F, 1.3977F, -0.2694F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create().texOffs(71, 64).mirror().addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 1.0F, 0.0F, -0.0681F, -0.298F, 0.2284F));

		PartDefinition cube_r175 = RArm4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(71, 61).mirror().addBox(-4.0F, -1.0F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-3.6578F, -0.7394F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Hip = Xinpusaurus.addOrReplaceChild("Hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1445F, 6.9007F, 0.0484F, -0.2615F, -0.0125F));

		PartDefinition cube_r176 = Hip.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(50, 56).addBox(-2.0F, -1.898F, -0.9607F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4001F, 0.8316F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r177 = Hip.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(73, 81).mirror().addBox(-0.3F, -1.3F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.9302F, 3.6067F, 6.9488F, -2.7818F, 0.0671F, -0.7678F));

		PartDefinition cube_r178 = Hip.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(63, 81).mirror().addBox(-0.5F, -1.0923F, -0.2726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5219F, 3.8642F, 4.9711F, -0.9647F, -0.0815F, -0.7165F));

		PartDefinition cube_r179 = Hip.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(50, 81).mirror().addBox(-0.5F, -1.0231F, -0.7443F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.5219F, 3.8642F, 4.9711F, -0.4848F, -0.0815F, -0.7165F));

		PartDefinition cube_r180 = Hip.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(14, 79).mirror().addBox(-0.5F, -1.9864F, -0.0397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(14, 79).addBox(3.5F, -1.9864F, -0.0397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0F, 1.5609F, 5.3747F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r181 = Hip.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(80, 60).mirror().addBox(-0.5F, -1.4F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(80, 60).addBox(3.5F, -1.4F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.0F, 2.892F, 6.4263F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r182 = Hip.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(80, 49).mirror().addBox(-0.5F, -1.9511F, -0.0485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 49).addBox(3.5F, -1.9511F, -0.0485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.4609F, 4.8747F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r183 = Hip.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(47, 88).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 7.5F, 0.0329F, -0.1264F, -0.3519F));

		PartDefinition cube_r184 = Hip.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(42, 88).mirror().addBox(-1.766F, -0.6428F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 5.5F, 0.2279F, 0.1366F, -1.0482F));

		PartDefinition cube_r185 = Hip.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(37, 88).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 5.5F, 0.2622F, -0.0396F, -0.371F));

		PartDefinition cube_r186 = Hip.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(32, 88).mirror().addBox(-1.766F, -0.6428F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 3.5F, 0.1473F, 0.2066F, -0.9446F));

		PartDefinition cube_r187 = Hip.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(27, 88).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 3.5F, 0.2448F, 0.0648F, -0.2538F));

		PartDefinition cube_r188 = Hip.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(80, 64).mirror().addBox(-2.766F, -0.6428F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 1.5F, 0.1516F, 0.4123F, -1.0845F));

		PartDefinition cube_r189 = Hip.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(88, 73).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 1.5F, 0.3817F, 0.2198F, -0.3755F));

		PartDefinition cube_r190 = Hip.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(73, 81).addBox(-0.7F, -1.3F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.9302F, 3.6067F, 6.9488F, -2.7818F, -0.0671F, 0.7678F));

		PartDefinition cube_r191 = Hip.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(63, 81).addBox(-0.5F, -1.0923F, -0.2726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5219F, 3.8642F, 4.9711F, -0.9647F, 0.0815F, 0.7165F));

		PartDefinition cube_r192 = Hip.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(50, 81).addBox(-0.5F, -1.0231F, -0.7443F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.5219F, 3.8642F, 4.9711F, -0.4848F, 0.0815F, 0.7165F));

		PartDefinition cube_r193 = Hip.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(50, 45).addBox(-0.5F, -0.75F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r194 = Hip.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(47, 88).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 7.5F, 0.0329F, 0.1264F, 0.3519F));

		PartDefinition cube_r195 = Hip.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(42, 88).addBox(0.766F, -0.6428F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 5.5F, 0.2279F, -0.1366F, 1.0482F));

		PartDefinition cube_r196 = Hip.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(37, 88).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 5.5F, 0.2622F, 0.0396F, 0.371F));

		PartDefinition cube_r197 = Hip.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(32, 88).addBox(0.766F, -0.6428F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 3.5F, 0.1473F, -0.2066F, 0.9446F));

		PartDefinition cube_r198 = Hip.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(27, 88).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 3.5F, 0.2448F, -0.0648F, 0.2538F));

		PartDefinition cube_r199 = Hip.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(80, 64).addBox(0.766F, -0.6428F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 1.5F, 0.1516F, -0.4123F, 1.0845F));

		PartDefinition cube_r200 = Hip.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(88, 73).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 1.5F, 0.3817F, -0.2198F, 0.3755F));

		PartDefinition cube_r201 = Hip.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(38, 57).addBox(0.0F, -1.6F, 0.6F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(22, 90).addBox(0.0F, -1.5F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.75F, 2.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition RLeg = Hip.addOrReplaceChild("RLeg", CubeListBuilder.create().texOffs(35, 65).addBox(0.0F, -0.5F, -0.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 3.2F, 6.0F, 0.1191F, -0.9437F, 0.9242F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create().texOffs(71, 45).addBox(0.1809F, -0.5F, -0.9264F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r202 = RLeg2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(71, 48).addBox(1.0F, -0.5F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8191F, 0.0F, 0.5736F, 0.0F, -0.1745F, 0.0F));

		PartDefinition RFoot = RLeg2.addOrReplaceChild("RFoot", CubeListBuilder.create().texOffs(62, 31).addBox(0.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.1808F, 0.0F, 0.2736F));

		PartDefinition RLeg3 = Hip.addOrReplaceChild("RLeg3", CubeListBuilder.create().texOffs(35, 65).mirror().addBox(-4.0F, -0.5F, -0.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.2F, 6.0F, 0.1191F, 0.9437F, -0.9242F));

		PartDefinition RLeg4 = RLeg3.addOrReplaceChild("RLeg4", CubeListBuilder.create().texOffs(71, 45).mirror().addBox(-3.1808F, -0.5F, -0.9264F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r203 = RLeg4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(71, 48).mirror().addBox(-4.0F, -0.5F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8191F, 0.0F, 0.5736F, 0.0F, 0.1745F, 0.0F));

		PartDefinition RFoot2 = RLeg4.addOrReplaceChild("RFoot2", CubeListBuilder.create().texOffs(62, 31).mirror().addBox(-4.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.1808F, 0.0F, 0.2736F));

		PartDefinition Tail = Hip.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7277F, 9.3996F, 0.0929F, -0.2166F, 0.0508F));

		PartDefinition cube_r204 = Tail.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(22, 79).addBox(0.0F, 1.2745F, 6.408F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 79).addBox(0.0F, 0.7811F, 4.4595F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 49).addBox(0.0F, 0.1888F, 2.5258F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 37).addBox(0.0F, -0.1068F, 0.5478F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 88).addBox(0.0F, -0.4024F, -1.4302F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.44F, 2.9729F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r205 = Tail.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-1.0F, 0.2F, 0.0F, 1.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5F, -0.4F, -0.0698F, 0.0174F, -0.0012F));

		PartDefinition cube_r206 = Tail.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 36).addBox(0.0F, 0.2F, 0.0F, 1.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -0.4F, -0.0698F, -0.0174F, 0.0012F));

		PartDefinition cube_r207 = Tail.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(35, 31).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.4F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r208 = Tail.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(84, 30).addBox(0.0F, -2.4F, 11.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 81).addBox(0.0F, -2.7F, 15.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 53).addBox(0.0F, -2.6F, 13.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 83).addBox(0.0F, -2.3F, 9.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 83).addBox(0.0F, -2.2F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 0).addBox(0.0F, -1.8F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.45F, -5.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(27, 45).addBox(-0.5F, -0.65F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6921F, 11.5249F, 0.0393F, 0.4796F, 0.0182F));

		PartDefinition cube_r209 = Tail2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(10, 82).addBox(0.0F, 2.6581F, 15.3349F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.26F, -7.5271F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r210 = Tail2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(74, 85).addBox(0.0F, -2.1F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1914F, 4.5887F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r211 = Tail2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(55, 81).addBox(0.0F, 2.7581F, 15.3349F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 86).addBox(0.0F, 2.6603F, 13.3273F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 65).addBox(0.0F, 2.5636F, 11.3345F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 79).addBox(0.0F, 1.5746F, 9.4451F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.26F, -9.4271F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r212 = Tail2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(71, 85).addBox(0.0F, -2.1F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 51).addBox(0.0F, -2.1F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 85).addBox(0.0F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1914F, 2.6887F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r213 = Tail2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(85, 66).addBox(0.0F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1914F, 0.6887F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r214 = Tail2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.8F, 0.45F, -0.1F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6F, 0.1F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r215 = Tail2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 49).addBox(-0.2F, 0.45F, -0.1F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, 0.1F, 0.0F, -0.0349F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.45F, 0.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2244F, 9.9996F, 0.0839F, 0.5232F, 0.0201F));

		PartDefinition cube_r216 = Tail3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(90, 21).addBox(0.0F, -2.3F, 19.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 17).addBox(0.0F, -2.3F, 17.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 86).addBox(0.0F, -2.3F, 15.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 51).addBox(0.0F, -2.3F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 41).addBox(0.0F, -2.3F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 9).addBox(0.0F, -2.2F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 85).addBox(0.0F, -2.2F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 85).addBox(0.0F, -2.1F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9914F, -5.5113F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r217 = Tail3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(89, 0).addBox(0.0F, 4.4428F, 31.388F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 88).addBox(0.0F, 4.4428F, 29.388F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 88).addBox(0.0F, 4.345F, 27.3805F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 66).addBox(0.0F, 4.1483F, 25.3876F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 88).addBox(0.0F, 3.8527F, 23.4096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 88).addBox(0.0F, 3.7549F, 21.402F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 22).addBox(0.0F, 2.8548F, 19.3649F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 17).addBox(0.0F, 2.8559F, 17.3425F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.06F, -17.6271F, 0.1484F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 15.9F, 0.1309F, 0.48F, 0.0F));

		PartDefinition cube_r218 = Tail4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(31, 90).addBox(0.0F, -0.85F, 12.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 90).addBox(0.0F, -0.95F, 10.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 90).addBox(0.0F, -1.05F, 8.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 37).addBox(0.0F, -1.15F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 90).addBox(0.0F, -1.25F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 90).addBox(0.0F, -1.35F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 31).addBox(0.0F, -1.35F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r219 = Tail4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(65, 74).addBox(0.0F, 7.5428F, 41.388F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 28).addBox(0.0F, 7.0428F, 39.388F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 90).addBox(0.0F, 6.4428F, 37.388F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 25).addBox(0.0F, 6.0428F, 35.388F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 90).addBox(0.0F, 5.6428F, 33.388F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.04F, -33.5271F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r220 = Tail4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, -0.1396F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 93, 93);
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