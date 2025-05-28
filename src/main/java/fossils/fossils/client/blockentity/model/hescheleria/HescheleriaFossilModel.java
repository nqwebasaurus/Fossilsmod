package fossils.fossils.client.blockentity.model.hescheleria;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HescheleriaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hescheleria;
	private final ModelPart Chest;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart bone;
	private final ModelPart Jaw;
	private final ModelPart bone4;
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

	public HescheleriaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hescheleria = this.fossil.getChild("Hescheleria");
		this.Chest = this.Hescheleria.getChild("Chest");
		this.Neck = this.Chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.bone = this.Head.getChild("bone");
		this.Jaw = this.Head.getChild("Jaw");
		this.bone4 = this.Jaw.getChild("bone4");
		this.RArm = this.Chest.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Chest.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
		this.Hip = this.Hescheleria.getChild("Hip");
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

		PartDefinition Hescheleria = fossil.addOrReplaceChild("Hescheleria", CubeListBuilder.create().texOffs(35, 0).addBox(-2.0F, 1.4F, -6.0F, 4.0F, 2.0F, 13.0F, new CubeDeformation(0.01F))
				.texOffs(13, 77).addBox(0.0F, -4.45F, -6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 77).addBox(0.0F, -4.55F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 59).addBox(0.0F, -4.65F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 68).addBox(0.0F, -4.65F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 72).addBox(0.0F, -4.65F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 7).addBox(0.0F, -4.65F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 15).addBox(0.0F, -4.55F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 16).addBox(-0.5F, -2.7F, -6.1F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.3624F, -6.9064F, -0.2168F, 0.2325F, -0.3453F, 0.3004F));

		PartDefinition cube_r1 = Hescheleria.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(14, 71).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 6.1209F, 0.2973F, 0.434F, -0.9749F));

		PartDefinition cube_r2 = Hescheleria.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 77).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 6.1209F, 0.5091F, 0.2072F, -0.4511F));

		PartDefinition cube_r3 = Hescheleria.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-3.2873F, -1.7282F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 6.1209F, 0.023F, 0.5202F, -1.5584F));

		PartDefinition cube_r4 = Hescheleria.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(77, 32).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 4.1209F, 0.5091F, 0.2072F, -0.3115F));

		PartDefinition cube_r5 = Hescheleria.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(72, 55).mirror().addBox(-4.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 4.1209F, 0.023F, 0.5202F, -1.4188F));

		PartDefinition cube_r6 = Hescheleria.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(7, 71).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 4.1209F, 0.2973F, 0.434F, -0.8353F));

		PartDefinition cube_r7 = Hescheleria.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(77, 30).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 2.1209F, 0.5091F, 0.2072F, -0.3115F));

		PartDefinition cube_r8 = Hescheleria.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(26, 72).mirror().addBox(-4.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 2.1209F, 0.023F, 0.5202F, -1.4188F));

		PartDefinition cube_r9 = Hescheleria.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 53).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 2.1209F, 0.2973F, 0.434F, -0.8353F));

		PartDefinition cube_r10 = Hescheleria.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(26, 77).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 0.1209F, 0.5091F, 0.2072F, -0.3115F));

		PartDefinition cube_r11 = Hescheleria.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-4.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 0.1209F, 0.023F, 0.5202F, -1.4188F));

		PartDefinition cube_r12 = Hescheleria.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(70, 51).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 0.1209F, 0.2973F, 0.434F, -0.8353F));

		PartDefinition cube_r13 = Hescheleria.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(77, 13).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -1.8791F, 0.5091F, 0.2072F, -0.3115F));

		PartDefinition cube_r14 = Hescheleria.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(71, 38).mirror().addBox(-4.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -1.8791F, 0.023F, 0.5202F, -1.4188F));

		PartDefinition cube_r15 = Hescheleria.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(70, 49).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -1.8791F, 0.2973F, 0.434F, -0.8353F));

		PartDefinition cube_r16 = Hescheleria.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(8, 77).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -3.8791F, 0.5091F, 0.2072F, -0.3115F));

		PartDefinition cube_r17 = Hescheleria.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(71, 36).mirror().addBox(-4.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -3.8791F, 0.023F, 0.5202F, -1.4188F));

		PartDefinition cube_r18 = Hescheleria.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(70, 13).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -3.8791F, 0.2973F, 0.434F, -0.8353F));

		PartDefinition cube_r19 = Hescheleria.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(71, 19).mirror().addBox(-4.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -5.8791F, 0.0324F, 0.5719F, -1.4139F));

		PartDefinition cube_r20 = Hescheleria.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(69, 66).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -5.8791F, 0.3368F, 0.4725F, -0.818F));

		PartDefinition cube_r21 = Hescheleria.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(77, 5).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -5.8791F, 0.5602F, 0.223F, -0.3006F));

		PartDefinition cube_r22 = Hescheleria.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(77, 34).addBox(2.2873F, -1.7282F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 6.1209F, 0.023F, -0.5202F, 1.5584F));

		PartDefinition cube_r23 = Hescheleria.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(48, 77).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 6.1209F, 0.5091F, -0.2072F, 0.4511F));

		PartDefinition cube_r24 = Hescheleria.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(14, 71).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 6.1209F, 0.2973F, -0.434F, 0.9749F));

		PartDefinition cube_r25 = Hescheleria.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(7, 71).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 4.1209F, 0.2973F, -0.434F, 0.8353F));

		PartDefinition cube_r26 = Hescheleria.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(72, 55).addBox(2.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 4.1209F, 0.023F, -0.5202F, 1.4188F));

		PartDefinition cube_r27 = Hescheleria.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(77, 32).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 4.1209F, 0.5091F, -0.2072F, 0.3115F));

		PartDefinition cube_r28 = Hescheleria.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(70, 53).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 2.1209F, 0.2973F, -0.434F, 0.8353F));

		PartDefinition cube_r29 = Hescheleria.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(26, 72).addBox(2.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 2.1209F, 0.023F, -0.5202F, 1.4188F));

		PartDefinition cube_r30 = Hescheleria.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(77, 30).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 2.1209F, 0.5091F, -0.2072F, 0.3115F));

		PartDefinition cube_r31 = Hescheleria.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(70, 51).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 0.1209F, 0.2973F, -0.434F, 0.8353F));

		PartDefinition cube_r32 = Hescheleria.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 72).addBox(2.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 0.1209F, 0.023F, -0.5202F, 1.4188F));

		PartDefinition cube_r33 = Hescheleria.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(26, 77).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 0.1209F, 0.5091F, -0.2072F, 0.3115F));

		PartDefinition cube_r34 = Hescheleria.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(70, 49).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -1.8791F, 0.2973F, -0.434F, 0.8353F));

		PartDefinition cube_r35 = Hescheleria.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(71, 38).addBox(2.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -1.8791F, 0.023F, -0.5202F, 1.4188F));

		PartDefinition cube_r36 = Hescheleria.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(77, 13).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -1.8791F, 0.5091F, -0.2072F, 0.3115F));

		PartDefinition cube_r37 = Hescheleria.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(70, 13).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -3.8791F, 0.2973F, -0.434F, 0.8353F));

		PartDefinition cube_r38 = Hescheleria.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(71, 36).addBox(2.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -3.8791F, 0.023F, -0.5202F, 1.4188F));

		PartDefinition cube_r39 = Hescheleria.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(8, 77).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -3.8791F, 0.5091F, -0.2072F, 0.3115F));

		PartDefinition cube_r40 = Hescheleria.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(77, 5).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -5.8791F, 0.5602F, -0.223F, 0.3006F));

		PartDefinition cube_r41 = Hescheleria.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(69, 66).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -5.8791F, 0.3368F, -0.4725F, 0.818F));

		PartDefinition cube_r42 = Hescheleria.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(71, 19).addBox(2.2873F, -1.7282F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -5.8791F, 0.0324F, -0.5719F, 1.4139F));

		PartDefinition Chest = Hescheleria.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(16, 78).addBox(0.0F, -1.275F, -6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 19).addBox(0.0F, -1.775F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 78).addBox(0.0F, -1.975F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.275F, -6.0F, -0.3686F, 0.1197F, 0.2591F));

		PartDefinition cube_r43 = Chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(72, 68).mirror().addBox(0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 58).mirror().addBox(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2869F, 4.2831F, -3.7307F, 1.2953F, 0.0673F, 0.1124F));

		PartDefinition cube_r44 = Chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.5F, -0.833F, -1.4807F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1059F, 3.2662F, -2.5767F, 1.8538F, 0.0673F, 0.0687F));

		PartDefinition cube_r45 = Chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(77, 50).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2493F, -3.7791F, 0.6983F, 0.2622F, -0.2674F));

		PartDefinition cube_r46 = Chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(71, 15).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2493F, -3.7791F, 0.4501F, 0.5718F, -0.7614F));

		PartDefinition cube_r47 = Chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(77, 48).mirror().addBox(-3.2873F, -1.7282F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2493F, -3.7791F, 0.0611F, 0.7096F, -1.3967F));

		PartDefinition cube_r48 = Chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(77, 52).mirror().addBox(-0.9027F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1493F, -1.7791F, 0.5773F, 0.2282F, -0.2968F));

		PartDefinition cube_r49 = Chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(71, 17).mirror().addBox(-2.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1493F, -1.7791F, 0.3502F, 0.4852F, -0.8118F));

		PartDefinition cube_r50 = Chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(76, 66).mirror().addBox(-3.2873F, -1.7282F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1493F, -1.7791F, 0.0357F, 0.5892F, -1.4121F));

		PartDefinition cube_r51 = Chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(30, 56).mirror().addBox(-0.5F, -1.4654F, -1.7943F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1059F, 3.2662F, -2.5767F, 1.0335F, 0.0673F, 0.0687F));

		PartDefinition cube_r52 = Chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(78, 11).mirror().addBox(-1.766F, -0.6428F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.525F, -5.5F, 0.3476F, 0.751F, -1.2271F));

		PartDefinition cube_r53 = Chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.525F, -5.5F, 0.7414F, 0.3712F, -0.5215F));

		PartDefinition cube_r54 = Chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(72, 68).addBox(-1.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 58).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2869F, 4.2831F, -3.7307F, 1.2953F, -0.0673F, -0.1124F));

		PartDefinition cube_r55 = Chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -0.833F, -1.4807F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.1059F, 3.2662F, -2.5767F, 1.8538F, -0.0673F, -0.0687F));

		PartDefinition cube_r56 = Chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(30, 56).addBox(-0.5F, -1.4654F, -1.7943F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1059F, 3.2662F, -2.5767F, 1.0335F, -0.0673F, -0.0687F));

		PartDefinition cube_r57 = Chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -0.25F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.275F, -6.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(78, 11).addBox(0.766F, -0.6428F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.525F, -5.5F, 0.3476F, -0.751F, 1.2271F));

		PartDefinition cube_r59 = Chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(77, 48).addBox(2.2873F, -1.7282F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2493F, -3.7791F, 0.0611F, -0.7096F, 1.3967F));

		PartDefinition cube_r60 = Chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(71, 15).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2493F, -3.7791F, 0.4501F, -0.5718F, 0.7614F));

		PartDefinition cube_r61 = Chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(77, 50).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2493F, -3.7791F, 0.6983F, -0.2622F, 0.2674F));

		PartDefinition cube_r62 = Chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(77, 52).addBox(-0.0973F, 0.1415F, -0.3392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1493F, -1.7791F, 0.5773F, -0.2282F, 0.2968F));

		PartDefinition cube_r63 = Chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(71, 17).addBox(0.8449F, -0.353F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1493F, -1.7791F, 0.3502F, -0.4852F, 0.8118F));

		PartDefinition cube_r64 = Chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(76, 66).addBox(2.2873F, -1.7282F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1493F, -1.7791F, 0.0357F, -0.5892F, 1.4121F));

		PartDefinition cube_r65 = Chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(77, 63).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.525F, -5.5F, 0.7414F, -0.3712F, 0.5215F));

		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(61, 50).addBox(-0.5F, -0.35F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 80).addBox(0.0F, -1.25F, -1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4144F, -6.1311F, -0.1708F, 0.2572F, 0.2099F));

		PartDefinition cube_r66 = Neck.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(78, 23).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.25F, -1.4F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(44, 64).addBox(0.84F, -1.3001F, -5.6892F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(28, 63).addBox(0.08F, -1.3001F, -5.6892F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(44, 64).mirror().addBox(-1.84F, -1.3001F, -5.6892F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(28, 63).mirror().addBox(-2.08F, -1.3001F, -5.6892F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -2.9F, -0.3086F, 0.2367F, -0.2578F));

		PartDefinition cube_r67 = Head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 77).addBox(-1.0F, 0.3065F, -1.228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(75, 76).addBox(-1.0F, 0.3065F, -2.028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 69).addBox(-1.0F, 0.0065F, -1.928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.9999F, -8.6892F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r68 = Head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(70, 76).addBox(-1.0F, -0.0358F, -1.012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.5F, 0.0999F, -8.2892F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r69 = Head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(28, 68).addBox(-0.5F, -0.0232F, -2.0224F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.2001F, -6.8892F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r70 = Head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(21, 67).addBox(-1.0F, -0.0846F, -1.0148F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, -1.6001F, -6.0892F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r71 = Head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(15, 53).addBox(-1.0F, -0.0093F, -0.9658F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.9001F, -5.2892F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r72 = Head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(61, 45).mirror().addBox(-0.03F, -1.0F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(61, 45).addBox(0.79F, -1.0F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(-1.38F, 0.3999F, -7.2892F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r73 = Head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(64, 16).mirror().addBox(-0.5F, -1.6998F, -0.2248F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(64, 16).addBox(1.74F, -1.6998F, -0.2248F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.12F, 0.8999F, -4.6892F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r74 = Head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(70, 8).mirror().addBox(0.0F, -1.0F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(14, 67).mirror().addBox(0.0F, 1.0F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(70, 8).addBox(1.8F, -1.0F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(14, 67).addBox(1.8F, 1.0F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, -0.7422F, -3.1577F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r75 = Head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(9, 62).mirror().addBox(-0.5F, -1.8358F, -0.2654F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(9, 62).addBox(1.74F, -1.8358F, -0.2654F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.12F, -1.486F, -4.3922F, -2.1642F, 0.0F, 0.0F));

		PartDefinition cube_r76 = Head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(15, 48).mirror().addBox(-0.5F, -1.8169F, -0.2498F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(15, 48).addBox(1.74F, -1.8169F, -0.2498F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.12F, -0.986F, -5.8922F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r77 = Head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(37, 64).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(37, 64).addBox(1.74F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.12F, -0.0001F, -5.2892F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r78 = Head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(51, 67).mirror().addBox(-0.4F, -0.9543F, -1.9985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(51, 67).addBox(1.4F, -0.9543F, -1.9985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 1.3578F, -4.3577F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(26, 74).mirror().addBox(-0.4F, -0.9892F, -0.9979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(26, 74).addBox(1.4F, -0.9892F, -0.9979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 1.3578F, -3.3577F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r80 = Head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(70, 44).mirror().addBox(-1.5F, -2.9F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(70, 44).addBox(0.5F, -2.9F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.2999F, 0.0108F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r81 = Head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(63, 62).addBox(-1.0F, -0.0013F, -1.9983F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1001F, -3.2892F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r82 = Head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(17, 56).addBox(-1.5F, 0.0F, -2.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0001F, -0.3892F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r83 = Head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(64, 27).addBox(-1.5F, 0.0035F, 0.0001F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -2.0001F, -0.2892F, -0.2269F, 0.0F, 0.0F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(41, 58).addBox(-0.6F, -3.0F, -0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7999F, -5.9892F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r84 = bone.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(42, 69).mirror().addBox(-0.5F, -0.1811F, -0.1244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.1F, -2.2F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r85 = bone.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(42, 69).addBox(-0.5F, -0.1811F, -0.1244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -1.1F, -2.2F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r86 = bone.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(35, 69).mirror().addBox(-0.5F, -1.0073F, -1.569F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.6F, -0.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bone.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(35, 69).addBox(-0.5F, -1.0073F, -1.569F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, -0.6F, -0.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(73, 40).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.7918F, -0.6864F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r89 = bone.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(73, 40).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.7918F, -0.6864F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r90 = bone.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(58, 69).addBox(-0.5F, -1.1F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.8183F, 2.9529F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r91 = bone.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(17, 61).addBox(-0.5F, -0.9F, -1.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 3.6F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2999F, 0.0108F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r92 = Jaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-1.5F, -0.9049F, -0.3161F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.381F, -0.4877F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r93 = Jaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(70, 4).mirror().addBox(-1.5F, -1.1395F, -1.2014F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.781F, -0.8877F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r94 = Jaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(7, 67).mirror().addBox(-0.1F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(7, 67).addBox(1.9F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.4F, 0.79F, 0.4F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r95 = Jaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(70, 0).addBox(0.5F, -0.9049F, -0.3161F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.381F, -0.4877F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r96 = Jaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(70, 4).addBox(0.5F, -1.1395F, -1.2014F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.781F, -0.8877F, 0.3578F, 0.0F, 0.0F));

		PartDefinition bone4 = Jaw.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -4.6F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r97 = bone4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(62, 36).mirror().addBox(-1.5F, -0.0305F, -2.9579F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.719F, 4.6123F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r98 = bone4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(72, 63).mirror().addBox(-1.0F, -0.9466F, -0.996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(72, 63).addBox(0.8F, -0.9466F, -0.996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4F, 0.9F, -0.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r99 = bone4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(62, 31).mirror().addBox(-1.0F, -0.968F, -3.0225F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(62, 31).addBox(0.8F, -0.968F, -3.0225F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 2.7F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r100 = bone4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.9F, -0.7198F, -3.3676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(52, 58).mirror().addBox(-0.8F, -0.0198F, -3.2676F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(0, 74).addBox(-0.1F, -0.7198F, -3.3676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(52, 58).addBox(-0.2F, -0.0198F, -3.2676F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.01F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r101 = bone4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-1.0F, 0.0F, -2.98F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 62).addBox(0.8F, 0.0F, -2.98F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.3F, 1.79F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r102 = bone4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(62, 36).addBox(0.5F, -0.0305F, -2.9579F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.719F, 4.6123F, 0.1571F, 0.0F, 0.0F));

		PartDefinition RArm = Chest.addOrReplaceChild("RArm", CubeListBuilder.create().texOffs(61, 55).addBox(0.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 3.775F, -3.0F, -2.2493F, -1.3991F, -2.3285F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create().texOffs(60, 66).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5F, 1.0F, 0.0F, -0.0681F, 0.298F, -0.2284F));

		PartDefinition cube_r103 = RArm2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(51, 64).addBox(1.0F, -1.0F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create().texOffs(44, 52).addBox(-0.3422F, -0.7394F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition RArm3 = Chest.addOrReplaceChild("RArm3", CubeListBuilder.create().texOffs(61, 55).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 3.775F, -3.0F, 1.435F, 1.3977F, -0.2694F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create().texOffs(60, 66).mirror().addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 1.0F, 0.0F, -0.0731F, -0.4721F, 0.2417F));

		PartDefinition cube_r104 = RArm4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(51, 64).mirror().addBox(-4.0F, -1.0F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create().texOffs(44, 52).mirror().addBox(-3.6578F, -0.7394F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition Hip = Hescheleria.addOrReplaceChild("Hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1445F, 6.9007F, 0.3572F, 0.2594F, 0.0281F));

		PartDefinition cube_r105 = Hip.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(44, 45).addBox(-2.0F, -1.898F, -0.9607F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4001F, 0.8316F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r106 = Hip.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 7.5F, 0.0329F, -0.1264F, -0.3519F));

		PartDefinition cube_r107 = Hip.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(73, 21).mirror().addBox(-0.3F, -1.3F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.9302F, 3.6067F, 6.9488F, -2.7818F, 0.0671F, -0.7678F));

		PartDefinition cube_r108 = Hip.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(12, 73).mirror().addBox(-0.5F, -1.0923F, -0.2726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5219F, 3.8642F, 4.9711F, -0.9647F, -0.0815F, -0.7165F));

		PartDefinition cube_r109 = Hip.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-0.5F, -1.4F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(72, 72).addBox(3.5F, -1.4F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.0F, 2.892F, 6.4263F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r110 = Hip.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(21, 71).mirror().addBox(-0.5F, -1.9864F, -0.0397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(21, 71).addBox(3.5F, -1.9864F, -0.0397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0F, 1.5609F, 5.3746F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r111 = Hip.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(-0.5F, -1.0231F, -0.7444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.5219F, 3.8642F, 4.9711F, -0.4848F, -0.0815F, -0.7165F));

		PartDefinition cube_r112 = Hip.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(72, 59).mirror().addBox(-0.5F, -1.9511F, -0.0485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 59).addBox(3.5F, -1.9511F, -0.0485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.4609F, 4.8746F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r113 = Hip.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(42, 78).mirror().addBox(-1.766F, -0.6428F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 5.5F, 0.2279F, 0.1366F, -1.0482F));

		PartDefinition cube_r114 = Hip.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(78, 40).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 5.5F, 0.2622F, -0.0396F, -0.371F));

		PartDefinition cube_r115 = Hip.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(78, 38).mirror().addBox(-1.766F, -0.6428F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 3.5F, 0.1473F, 0.2066F, -0.9446F));

		PartDefinition cube_r116 = Hip.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(37, 78).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 3.5F, 0.2448F, 0.0648F, -0.2538F));

		PartDefinition cube_r117 = Hip.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(72, 57).mirror().addBox(-2.766F, -0.6428F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 1.5F, 0.1516F, 0.4123F, -1.0845F));

		PartDefinition cube_r118 = Hip.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(78, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 1.5F, 0.3817F, 0.2198F, -0.3755F));

		PartDefinition cube_r119 = Hip.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(73, 21).addBox(-0.7F, -1.3F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.9302F, 3.6067F, 6.9488F, -2.7818F, -0.0671F, 0.7678F));

		PartDefinition cube_r120 = Hip.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(12, 73).addBox(-0.5F, -1.0923F, -0.2726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5219F, 3.8642F, 4.9711F, -0.9647F, 0.0815F, 0.7165F));

		PartDefinition cube_r121 = Hip.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(7, 73).addBox(-0.5F, -1.0231F, -0.7444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.5219F, 3.8642F, 4.9711F, -0.4848F, 0.0815F, 0.7165F));

		PartDefinition cube_r122 = Hip.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(23, 45).addBox(-0.5F, -0.75F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r123 = Hip.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(78, 46).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 7.5F, 0.0329F, 0.1264F, 0.3519F));

		PartDefinition cube_r124 = Hip.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(42, 78).addBox(0.766F, -0.6428F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 5.5F, 0.2279F, -0.1366F, 1.0482F));

		PartDefinition cube_r125 = Hip.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(78, 40).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 5.5F, 0.2622F, 0.0396F, 0.371F));

		PartDefinition cube_r126 = Hip.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(78, 38).addBox(0.766F, -0.6428F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 3.5F, 0.1473F, -0.2066F, 0.9446F));

		PartDefinition cube_r127 = Hip.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(37, 78).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 3.5F, 0.2448F, -0.0648F, 0.2538F));

		PartDefinition cube_r128 = Hip.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(72, 57).addBox(0.766F, -0.6428F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 1.5F, 0.1516F, -0.4123F, 1.0845F));

		PartDefinition cube_r129 = Hip.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(78, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 1.5F, 0.3817F, -0.2198F, 0.3755F));

		PartDefinition cube_r130 = Hip.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(23, 36).addBox(0.0F, -1.6F, 0.6F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(34, 78).addBox(0.0F, -1.5F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.75F, 2.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition RLeg = Hip.addOrReplaceChild("RLeg", CubeListBuilder.create().texOffs(62, 41).addBox(0.0F, -0.5F, -0.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 3.2F, 6.0F, 0.692F, -0.8032F, 0.5777F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create().texOffs(64, 21).addBox(0.1808F, -0.5F, -0.9264F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, -0.3127F, -0.5338F, 0.5661F));

		PartDefinition cube_r131 = RLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(64, 24).addBox(1.0F, -0.5F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8192F, 0.0F, 0.5736F, 0.0F, -0.1745F, 0.0F));

		PartDefinition RFoot = RLeg2.addOrReplaceChild("RFoot", CubeListBuilder.create().texOffs(0, 56).addBox(0.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.1808F, 0.0F, 0.2736F));

		PartDefinition RLeg3 = Hip.addOrReplaceChild("RLeg3", CubeListBuilder.create().texOffs(62, 41).mirror().addBox(-4.0F, -0.5F, -0.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.2F, 6.0F, -0.2457F, 1.2675F, -1.5283F));

		PartDefinition RLeg4 = RLeg3.addOrReplaceChild("RLeg4", CubeListBuilder.create().texOffs(64, 21).mirror().addBox(-3.1808F, -0.5F, -0.9264F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -0.121F, 0.6003F, -0.212F));

		PartDefinition cube_r132 = RLeg4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(64, 24).mirror().addBox(-4.0F, -0.5F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8192F, 0.0F, 0.5736F, 0.0F, 0.1745F, 0.0F));

		PartDefinition RFoot2 = RLeg4.addOrReplaceChild("RFoot2", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-4.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1808F, 0.0F, 0.2736F, 0.0F, 0.0F, 0.3491F));

		PartDefinition Tail = Hip.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7277F, 9.3996F, 0.3685F, 0.2694F, -0.0592F));

		PartDefinition cube_r133 = Tail.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(52, 71).addBox(0.0F, 1.2745F, 6.408F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 71).addBox(0.0F, 0.7811F, 4.4595F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 30).addBox(0.0F, 0.1888F, 2.5258F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 73).addBox(0.0F, -0.1068F, 0.5478F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 78).addBox(0.0F, -0.4024F, -1.4302F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.44F, 2.9729F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r134 = Tail.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(35, 31).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.4F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r135 = Tail.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(64, 73).addBox(0.0F, -2.4F, 11.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 73).addBox(0.0F, -2.7F, 15.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 73).addBox(0.0F, -2.6F, 13.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 73).addBox(0.0F, -2.3F, 9.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 73).addBox(0.0F, -2.2F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 42).addBox(0.0F, -1.8F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.45F, -5.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.65F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, 11.3F, 0.1694F, 0.436F, 0.0163F));

		PartDefinition cube_r136 = Tail2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(33, 73).addBox(0.0F, 2.6581F, 15.3349F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.26F, -7.5271F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r137 = Tail2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(23, 75).addBox(0.0F, -2.1F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1914F, 4.5887F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r138 = Tail2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(73, 25).addBox(0.0F, 2.7581F, 15.3349F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 0).addBox(0.0F, 2.6603F, 13.3273F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 73).addBox(0.0F, 2.5636F, 11.3345F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 71).addBox(0.0F, 1.5746F, 9.4451F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.26F, -9.4271F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r139 = Tail2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(20, 75).addBox(0.0F, -2.1F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 77).addBox(0.0F, -2.1F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 8).addBox(0.0F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1914F, 2.6887F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r140 = Tail2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(74, 30).addBox(0.0F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1914F, 0.6887F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.45F, 0.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 9.3F, -0.2677F, -0.3924F, -0.0145F));

		PartDefinition cube_r141 = Tail3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(71, 79).addBox(0.0F, -2.3F, 19.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 79).addBox(0.0F, -2.3F, 17.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 54).addBox(0.0F, -2.3F, 15.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 79).addBox(0.0F, -2.3F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 79).addBox(0.0F, -2.3F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 79).addBox(0.0F, -2.2F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 25).addBox(0.0F, -2.2F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 43).addBox(0.0F, -2.1F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9914F, -4.5113F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r142 = Tail3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(74, 79).addBox(0.0F, 4.4428F, 31.388F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 25).addBox(0.0F, 4.4428F, 29.388F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 79).addBox(0.0F, 4.345F, 27.3804F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 78).addBox(0.0F, 4.1483F, 25.3876F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 78).addBox(0.0F, 3.8527F, 23.4096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 78).addBox(0.0F, 3.7549F, 21.402F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 73).addBox(0.0F, 2.8549F, 19.3649F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 73).addBox(0.0F, 2.8559F, 17.3425F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.06F, -16.6271F, 0.1484F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, 15.9F, -0.3491F, -0.6109F, 0.0F));

		PartDefinition cube_r143 = Tail4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(80, 0).addBox(0.0F, -0.85F, 12.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 77).addBox(0.0F, -0.95F, 10.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 74).addBox(0.0F, -1.05F, 8.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 71).addBox(0.0F, -1.15F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 68).addBox(0.0F, -1.25F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 58).addBox(0.0F, -1.35F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 80).addBox(0.0F, -1.35F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Tail4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(77, 79).addBox(0.0F, 7.5428F, 41.388F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 80).addBox(0.0F, 7.0428F, 39.388F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 80).addBox(0.0F, 6.4428F, 37.388F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 80).addBox(0.0F, 6.0428F, 35.388F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 80).addBox(0.0F, 5.6428F, 33.388F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.04F, -32.5271F, 0.1484F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 83, 83);
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