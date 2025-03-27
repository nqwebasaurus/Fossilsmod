package fossils.fossils.client.blockentity.model.poposaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PoposaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Poposaurus;
	private final ModelPart Basin;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart LArm;
	private final ModelPart LArm2;
	private final ModelPart LHand;
	private final ModelPart LArm3;
	private final ModelPart LArm4;
	private final ModelPart LHand2;
	private final ModelPart LLeg;
	private final ModelPart LLeg2;
	private final ModelPart LFoot;
	private final ModelPart LFoot2;
	private final ModelPart LLeg3;
	private final ModelPart LLeg4;
	private final ModelPart LFoot3;
	private final ModelPart LFoot4;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public PoposaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Poposaurus = this.fossil.getChild("Poposaurus");
		this.Basin = this.Poposaurus.getChild("Basin");
		this.Body = this.Basin.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.Neck = this.Chest.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.LArm = this.Chest.getChild("LArm");
		this.LArm2 = this.LArm.getChild("LArm2");
		this.LHand = this.LArm2.getChild("LHand");
		this.LArm3 = this.Chest.getChild("LArm3");
		this.LArm4 = this.LArm3.getChild("LArm4");
		this.LHand2 = this.LArm4.getChild("LHand2");
		this.LLeg = this.Basin.getChild("LLeg");
		this.LLeg2 = this.LLeg.getChild("LLeg2");
		this.LFoot = this.LLeg2.getChild("LFoot");
		this.LFoot2 = this.LFoot.getChild("LFoot2");
		this.LLeg3 = this.Basin.getChild("LLeg3");
		this.LLeg4 = this.LLeg3.getChild("LLeg4");
		this.LFoot3 = this.LLeg4.getChild("LFoot3");
		this.LFoot4 = this.LFoot3.getChild("LFoot4");
		this.Tail = this.Basin.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.tail5 = this.Tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Poposaurus = fossil.addOrReplaceChild("Poposaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.5F, -12.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Basin = Poposaurus.addOrReplaceChild("Basin", CubeListBuilder.create().texOffs(21, 25).addBox(-0.5F, -1.1F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(46, 5).addBox(0.5F, -0.6F, -1.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 52).addBox(1.5F, -1.3F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(64, 4).addBox(1.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 52).mirror().addBox(-2.5F, -1.3F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 4).mirror().addBox(-2.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 5).mirror().addBox(-1.5F, -0.6F, -1.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 36).addBox(0.0F, -2.5F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 40).addBox(0.0F, -2.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 59).addBox(0.0F, -2.7F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 13.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Basin_r1 = Basin.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(74, 63).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 4.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Basin_r2 = Basin.addOrReplaceChild("Basin_r2", CubeListBuilder.create().texOffs(69, 38).mirror().addBox(-0.1934F, -1.9648F, -3.0988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(69, 35).mirror().addBox(-0.1934F, -2.2648F, -3.0988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.0748F, -4.2566F, 1.5714F, -0.0126F, -0.1103F));

		PartDefinition Basin_r3 = Basin.addOrReplaceChild("Basin_r3", CubeListBuilder.create().texOffs(74, 22).mirror().addBox(-0.1934F, -0.2717F, -3.7195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.0748F, -4.2566F, 0.8034F, -0.0126F, -0.1103F));

		PartDefinition Basin_r4 = Basin.addOrReplaceChild("Basin_r4", CubeListBuilder.create().texOffs(69, 32).mirror().addBox(-0.1934F, 1.682F, -2.6964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.0748F, -4.2566F, 0.0006F, -0.0126F, -0.1103F));

		PartDefinition Basin_r5 = Basin.addOrReplaceChild("Basin_r5", CubeListBuilder.create().texOffs(69, 62).mirror().addBox(-0.1934F, 2.2336F, -0.9557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.0748F, -4.2566F, -0.6801F, -0.0126F, -0.1103F));

		PartDefinition Basin_r6 = Basin.addOrReplaceChild("Basin_r6", CubeListBuilder.create().texOffs(47, 73).mirror().addBox(-0.1934F, -3.3624F, -0.4332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 68).mirror().addBox(-0.1934F, -2.8624F, -0.4332F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.5945F, 4.6995F, -6.2761F, -0.8201F, -0.0048F, -0.1109F));

		PartDefinition Basin_r7 = Basin.addOrReplaceChild("Basin_r7", CubeListBuilder.create().texOffs(42, 73).mirror().addBox(-0.2F, 2.2319F, -1.0575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(40, 65).mirror().addBox(-0.2F, -0.3681F, -1.0575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.6435F, 1.5269F, 0.892F, 0.3382F, -0.4245F));

		PartDefinition Basin_r8 = Basin.addOrReplaceChild("Basin_r8", CubeListBuilder.create().texOffs(36, 10).mirror().addBox(-0.2F, -0.3853F, -0.5006F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.6435F, 1.5269F, 0.4383F, 0.3382F, -0.4245F));

		PartDefinition Basin_r9 = Basin.addOrReplaceChild("Basin_r9", CubeListBuilder.create().texOffs(69, 65).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(69, 65).addBox(3.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0F, 1.0492F, -1.6579F, -1.5533F, 0.0F, 0.0F));

		PartDefinition Basin_r10 = Basin.addOrReplaceChild("Basin_r10", CubeListBuilder.create().texOffs(32, 58).mirror().addBox(-0.3F, -0.3483F, -0.6211F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.9748F, -1.5566F, -0.9192F, -0.4893F, -0.125F));

		PartDefinition Basin_r11 = Basin.addOrReplaceChild("Basin_r11", CubeListBuilder.create().texOffs(35, 65).mirror().addBox(-0.5F, -2.8F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(35, 65).addBox(3.5F, -2.8F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 0.6624F, -1.1496F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Basin_r12 = Basin.addOrReplaceChild("Basin_r12", CubeListBuilder.create().texOffs(69, 59).mirror().addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 59).addBox(3.5F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0993F, -1.3009F, -0.7679F, 0.0F, 0.0F));

		PartDefinition Basin_r13 = Basin.addOrReplaceChild("Basin_r13", CubeListBuilder.create().texOffs(7, 64).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(7, 64).addBox(3.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.0F, -0.3F, -1.0F, -0.6458F, 0.0F, 0.0F));

		PartDefinition Basin_r14 = Basin.addOrReplaceChild("Basin_r14", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-2.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(64, 0).addBox(1.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.3F, -1.3F, 0.4887F, 0.0F, 0.0F));

		PartDefinition Basin_r15 = Basin.addOrReplaceChild("Basin_r15", CubeListBuilder.create().texOffs(9, 55).mirror().addBox(-2.5F, 0.0F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(9, 55).addBox(1.5F, 0.0F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.3F, 1.6F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Basin_r16 = Basin.addOrReplaceChild("Basin_r16", CubeListBuilder.create().texOffs(69, 38).addBox(-0.8066F, -1.9648F, -3.0988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 35).addBox(-0.8066F, -2.2648F, -3.0988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.8F, 3.0748F, -4.2566F, 1.5714F, 0.0126F, 0.1103F));

		PartDefinition Basin_r17 = Basin.addOrReplaceChild("Basin_r17", CubeListBuilder.create().texOffs(74, 22).addBox(-0.8066F, -0.2717F, -3.7195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 3.0748F, -4.2566F, 0.8034F, 0.0126F, 0.1103F));

		PartDefinition Basin_r18 = Basin.addOrReplaceChild("Basin_r18", CubeListBuilder.create().texOffs(69, 32).addBox(-0.8066F, 1.682F, -2.6964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.8F, 3.0748F, -4.2566F, 0.0006F, 0.0126F, 0.1103F));

		PartDefinition Basin_r19 = Basin.addOrReplaceChild("Basin_r19", CubeListBuilder.create().texOffs(69, 62).addBox(-0.8066F, 2.2336F, -0.9557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 3.0748F, -4.2566F, -0.6801F, 0.0126F, 0.1103F));

		PartDefinition Basin_r20 = Basin.addOrReplaceChild("Basin_r20", CubeListBuilder.create().texOffs(47, 73).addBox(-0.8066F, -3.3624F, -0.4332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 68).addBox(-0.8066F, -2.8624F, -0.4332F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.5945F, 4.6995F, -6.2761F, -0.8201F, 0.0048F, 0.1109F));

		PartDefinition Basin_r21 = Basin.addOrReplaceChild("Basin_r21", CubeListBuilder.create().texOffs(62, 73).mirror().addBox(-0.2312F, 0.6088F, -1.7163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 2.2435F, 2.9269F, 1.7653F, 0.1407F, -0.0866F));

		PartDefinition Basin_r22 = Basin.addOrReplaceChild("Basin_r22", CubeListBuilder.create().texOffs(64, 10).mirror().addBox(-0.2312F, 1.4606F, -0.2374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 2.2435F, 2.9269F, 0.4738F, 0.1407F, -0.0866F));

		PartDefinition Basin_r23 = Basin.addOrReplaceChild("Basin_r23", CubeListBuilder.create().texOffs(69, 68).mirror().addBox(-0.2312F, 1.4182F, -0.7527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 2.2435F, 2.9269F, 1.1544F, 0.1407F, -0.0866F));

		PartDefinition Basin_r24 = Basin.addOrReplaceChild("Basin_r24", CubeListBuilder.create().texOffs(69, 20).mirror().addBox(-0.2312F, -0.2205F, -0.4448F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 2.2435F, 2.9269F, 0.9625F, 0.1407F, -0.0866F));

		PartDefinition Basin_r25 = Basin.addOrReplaceChild("Basin_r25", CubeListBuilder.create().texOffs(62, 73).addBox(-0.7688F, 0.6088F, -1.7163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 2.2435F, 2.9269F, 1.7653F, -0.1407F, 0.0866F));

		PartDefinition Basin_r26 = Basin.addOrReplaceChild("Basin_r26", CubeListBuilder.create().texOffs(64, 10).addBox(-0.7688F, 1.4606F, -0.2374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.8F, 2.2435F, 2.9269F, 0.4738F, -0.1407F, 0.0866F));

		PartDefinition Basin_r27 = Basin.addOrReplaceChild("Basin_r27", CubeListBuilder.create().texOffs(69, 68).addBox(-0.7688F, 1.4182F, -0.7527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.8F, 2.2435F, 2.9269F, 1.1544F, -0.1407F, 0.0866F));

		PartDefinition Basin_r28 = Basin.addOrReplaceChild("Basin_r28", CubeListBuilder.create().texOffs(69, 20).addBox(-0.7688F, -0.2205F, -0.4448F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.8F, 2.2435F, 2.9269F, 0.9625F, -0.1407F, 0.0866F));

		PartDefinition Basin_r29 = Basin.addOrReplaceChild("Basin_r29", CubeListBuilder.create().texOffs(42, 73).addBox(-0.8F, 2.2319F, -1.0575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(40, 65).addBox(-0.8F, -0.3681F, -1.0575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.3F, 0.6435F, 1.5269F, 0.892F, -0.3382F, 0.4245F));

		PartDefinition Basin_r30 = Basin.addOrReplaceChild("Basin_r30", CubeListBuilder.create().texOffs(36, 10).addBox(-0.8F, -0.3853F, -0.5006F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3F, 0.6435F, 1.5269F, 0.4383F, -0.3382F, 0.4245F));

		PartDefinition Basin_r31 = Basin.addOrReplaceChild("Basin_r31", CubeListBuilder.create().texOffs(32, 58).addBox(-0.7F, -0.3483F, -0.6211F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 0.9748F, -1.5566F, -0.9192F, 0.4893F, 0.125F));

		PartDefinition Body = Basin.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.557F, -6.9804F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.01F))
				.texOffs(49, 61).addBox(0.0F, -1.757F, -4.9804F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 28).addBox(0.0F, -1.857F, -2.9804F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.573F, -3.0153F, 0.1072F, 0.217F, 0.0232F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(74, 32).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.757F, -0.4804F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 60).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.757F, -6.4804F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 45).addBox(-1.5F, -1.0F, 0.4F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 5.343F, -7.5804F, -0.2443F, 0.0F, 0.0F));

		PartDefinition body9_r1 = Body.addOrReplaceChild("body9_r1", CubeListBuilder.create().texOffs(76, 9).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1498F, -6.5324F, 0.4003F, 0.066F, -0.3874F));

		PartDefinition body10_r1 = Body.addOrReplaceChild("body10_r1", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1498F, -6.5324F, 0.3432F, 0.2202F, -0.7813F));

		PartDefinition body11_r1 = Body.addOrReplaceChild("body11_r1", CubeListBuilder.create().texOffs(42, 23).mirror().addBox(-5.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1498F, -6.5324F, 0.1884F, 0.3612F, -1.3087F));

		PartDefinition body10_r2 = Body.addOrReplaceChild("body10_r2", CubeListBuilder.create().texOffs(76, 4).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1498F, -2.5324F, 0.2951F, 0.1607F, -0.4659F));

		PartDefinition body11_r2 = Body.addOrReplaceChild("body11_r2", CubeListBuilder.create().texOffs(76, 2).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1498F, -2.5324F, 0.2058F, 0.2661F, -0.8811F));

		PartDefinition body12_r1 = Body.addOrReplaceChild("body12_r1", CubeListBuilder.create().texOffs(55, 68).mirror().addBox(-3.4538F, -1.309F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1498F, -2.5324F, 0.0416F, 0.3324F, -1.4254F));

		PartDefinition body9_r2 = Body.addOrReplaceChild("body9_r2", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1498F, -0.5324F, 0.1595F, 0.0563F, -0.6589F));

		PartDefinition body10_r3 = Body.addOrReplaceChild("body10_r3", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1498F, -0.5324F, 0.1231F, 0.1161F, -1.0751F));

		PartDefinition body11_r3 = Body.addOrReplaceChild("body11_r3", CubeListBuilder.create().texOffs(24, 75).mirror().addBox(-2.4538F, -1.309F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1498F, -0.5324F, 0.0484F, 0.1621F, -1.6019F));

		PartDefinition body10_r4 = Body.addOrReplaceChild("body10_r4", CubeListBuilder.create().texOffs(62, 49).mirror().addBox(-4.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1498F, -4.5324F, 0.1517F, 0.3676F, -1.3916F));

		PartDefinition body9_r3 = Body.addOrReplaceChild("body9_r3", CubeListBuilder.create().texOffs(19, 75).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1498F, -4.5324F, 0.3162F, 0.2431F, -0.8573F));

		PartDefinition body8_r1 = Body.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(74, 44).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1498F, -4.5324F, 0.3848F, 0.0973F, -0.4584F));

		PartDefinition body11_r4 = Body.addOrReplaceChild("body11_r4", CubeListBuilder.create().texOffs(55, 68).addBox(1.4538F, -1.309F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1498F, -2.5324F, 0.0416F, -0.3324F, 1.4254F));

		PartDefinition body10_r5 = Body.addOrReplaceChild("body10_r5", CubeListBuilder.create().texOffs(76, 2).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1498F, -2.5324F, 0.2058F, -0.2661F, 0.8811F));

		PartDefinition body9_r4 = Body.addOrReplaceChild("body9_r4", CubeListBuilder.create().texOffs(76, 4).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1498F, -2.5324F, 0.2951F, -0.1607F, 0.4659F));

		PartDefinition body10_r6 = Body.addOrReplaceChild("body10_r6", CubeListBuilder.create().texOffs(24, 75).addBox(1.4538F, -1.309F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1498F, -0.5324F, 0.0484F, -0.1621F, 1.6019F));

		PartDefinition body9_r5 = Body.addOrReplaceChild("body9_r5", CubeListBuilder.create().texOffs(0, 76).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1498F, -0.5324F, 0.1231F, -0.1161F, 1.0751F));

		PartDefinition body8_r2 = Body.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(76, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1498F, -0.5324F, 0.1595F, -0.0563F, 0.6589F));

		PartDefinition body10_r7 = Body.addOrReplaceChild("body10_r7", CubeListBuilder.create().texOffs(42, 23).addBox(1.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1498F, -6.5324F, 0.1884F, -0.3612F, 1.3087F));

		PartDefinition body9_r6 = Body.addOrReplaceChild("body9_r6", CubeListBuilder.create().texOffs(5, 76).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1498F, -6.5324F, 0.3432F, -0.2202F, 0.7813F));

		PartDefinition body8_r3 = Body.addOrReplaceChild("body8_r3", CubeListBuilder.create().texOffs(76, 9).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1498F, -6.5324F, 0.4003F, -0.066F, 0.3874F));

		PartDefinition body7_r1 = Body.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(74, 44).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1498F, -4.5324F, 0.3848F, -0.0973F, 0.4584F));

		PartDefinition body8_r4 = Body.addOrReplaceChild("body8_r4", CubeListBuilder.create().texOffs(19, 75).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1498F, -4.5324F, 0.3162F, -0.2431F, 0.8573F));

		PartDefinition body9_r7 = Body.addOrReplaceChild("body9_r7", CubeListBuilder.create().texOffs(62, 49).addBox(1.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1498F, -4.5324F, 0.1517F, -0.3676F, 1.3916F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(42, 16).addBox(-0.5F, -0.466F, -4.9594F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.124F, -6.921F, 0.1056F, 0.217F, 0.0232F));

		PartDefinition cube_r4 = Chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(45, 51).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.566F, -1.4594F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(17, 40).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.566F, -3.4594F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-0.7F, 0.0F, -4.1F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4462F, 4.5906F, -1.5541F, -3.0968F, 0.6327F, -3.0828F));

		PartDefinition cube_r7 = Chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(27, 10).mirror().addBox(-0.7F, 0.0F, -2.8F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4462F, 4.5906F, -1.5541F, -3.0289F, 0.9628F, -3.0374F));

		PartDefinition cube_r8 = Chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 57).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5735F, -3.239F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(65, 17).mirror().addBox(-0.5F, -0.3F, -0.8F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, 4.6223F, -1.7218F, 1.3761F, 1.3042F, 1.6739F));

		PartDefinition body11_r5 = Chest.addOrReplaceChild("body11_r5", CubeListBuilder.create().texOffs(39, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0257F, -3.6114F, 0.3774F, 0.2291F, -0.6597F));

		PartDefinition body12_r2 = Chest.addOrReplaceChild("body12_r2", CubeListBuilder.create().texOffs(34, 76).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0257F, -3.6114F, 0.2545F, 0.3612F, -1.0758F));

		PartDefinition body13_r1 = Chest.addOrReplaceChild("body13_r1", CubeListBuilder.create().texOffs(64, 8).mirror().addBox(-4.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0257F, -3.6114F, 0.0301F, 0.4376F, -1.6394F));

		PartDefinition body10_r8 = Chest.addOrReplaceChild("body10_r8", CubeListBuilder.create().texOffs(29, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0257F, -1.6114F, 0.3601F, 0.1436F, -0.4788F));

		PartDefinition body11_r6 = Chest.addOrReplaceChild("body11_r6", CubeListBuilder.create().texOffs(76, 11).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0257F, -1.6114F, 0.274F, 0.276F, -0.8856F));

		PartDefinition body12_r3 = Chest.addOrReplaceChild("body12_r3", CubeListBuilder.create().texOffs(27, 56).mirror().addBox(-5.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0257F, -1.6114F, 0.096F, 0.3749F, -1.4293F));

		PartDefinition cube_r10 = Chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(57, 10).mirror().addBox(0.0F, -0.9F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.8158F, -3.941F, 1.0601F, -0.6733F, -0.8388F));

		PartDefinition cube_r11 = Chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(37, 73).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 73).addBox(3.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.3104F, 0.009F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(62, 63).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(62, 63).addBox(3.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.0F, 1.1306F, -1.5473F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.5F, 0.1F, -2.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 45).addBox(3.5F, 0.1F, -2.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 0.5307F, -2.5169F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(57, 10).addBox(-1.0F, -0.9F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.8158F, -3.941F, 1.0601F, 0.6733F, 0.8388F));

		PartDefinition cube_r15 = Chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(14, 64).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2598F, -2.6808F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(46, 0).addBox(-0.3F, 0.0F, -4.1F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4462F, 4.5906F, -1.5541F, -3.0968F, -0.6327F, 3.0828F));

		PartDefinition cube_r17 = Chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(27, 10).addBox(-0.3F, 0.0F, -2.8F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4462F, 4.5906F, -1.5541F, -3.0289F, -0.9628F, 3.0374F));

		PartDefinition cube_r18 = Chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(65, 17).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9586F, 4.6223F, -1.7218F, 1.3761F, -1.3042F, -1.6739F));

		PartDefinition body12_r4 = Chest.addOrReplaceChild("body12_r4", CubeListBuilder.create().texOffs(64, 8).addBox(1.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0257F, -3.6114F, 0.0301F, -0.4376F, 1.6394F));

		PartDefinition body11_r7 = Chest.addOrReplaceChild("body11_r7", CubeListBuilder.create().texOffs(34, 76).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0257F, -3.6114F, 0.2545F, -0.3612F, 1.0758F));

		PartDefinition body10_r9 = Chest.addOrReplaceChild("body10_r9", CubeListBuilder.create().texOffs(39, 76).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0257F, -3.6114F, 0.3774F, -0.2291F, 0.6597F));

		PartDefinition body11_r8 = Chest.addOrReplaceChild("body11_r8", CubeListBuilder.create().texOffs(27, 56).addBox(1.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0257F, -1.6114F, 0.096F, -0.3749F, 1.4293F));

		PartDefinition body10_r10 = Chest.addOrReplaceChild("body10_r10", CubeListBuilder.create().texOffs(76, 11).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0257F, -1.6114F, 0.274F, -0.276F, 0.8856F));

		PartDefinition body9_r8 = Chest.addOrReplaceChild("body9_r8", CubeListBuilder.create().texOffs(29, 76).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0257F, -1.6114F, 0.3601F, -0.1436F, 0.4788F));

		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(17, 36).addBox(0.0F, -1.5315F, -0.7946F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0641F, -4.9271F, -0.318F, 0.1384F, 0.0295F));

		PartDefinition cube_r19 = Neck.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(59, 76).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8618F, -2.2703F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Neck.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(69, 28).mirror().addBox(-0.0661F, -0.4792F, -0.0754F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4562F, 0.451F, -0.5246F, -0.5782F, -0.4647F, 0.2484F));

		PartDefinition cube_r21 = Neck.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(69, 24).mirror().addBox(-0.0969F, -0.5366F, -0.0563F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4212F, 0.2337F, -2.6672F, -0.5072F, -0.3334F, 0.1545F));

		PartDefinition cube_r22 = Neck.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(69, 28).addBox(0.0661F, -0.4792F, -0.0754F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4562F, 0.451F, -0.5246F, -0.5782F, 0.4647F, -0.2484F));

		PartDefinition cube_r23 = Neck.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(69, 24).addBox(0.0969F, -0.5366F, -0.0563F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4212F, 0.2337F, -2.6672F, -0.5072F, 0.3334F, -0.1545F));

		PartDefinition cube_r24 = Neck.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(37, 45).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0472F, -3.8931F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4211F, -3.6994F, 0.2155F, 0.1973F, 0.149F));

		PartDefinition cube_r25 = Neck2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(56, 76).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4331F, -0.4806F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Neck2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(76, 50).addBox(-0.5F, -1.348F, -0.5837F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 45).addBox(-1.0F, -1.048F, -1.5837F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4613F, -2.4732F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Neck2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.079F, -0.6621F, -0.1557F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.464F, 0.4642F, -0.7277F, -0.4108F, -0.2895F, 0.1237F));

		PartDefinition cube_r28 = Neck2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(68, 55).mirror().addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3677F, -3.0514F, -0.4051F, -0.2415F, 0.1022F));

		PartDefinition cube_r29 = Neck2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 69).addBox(0.079F, -0.6621F, -0.1557F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.464F, 0.4642F, -0.7277F, -0.4108F, 0.2895F, -0.1237F));

		PartDefinition cube_r30 = Neck2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(68, 55).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3677F, -3.0514F, -0.4051F, 0.2415F, -0.1022F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2387F, -4.0732F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Neck3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(9, 52).addBox(-0.5F, -1.3F, 0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 60).addBox(-1.0F, -0.9F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 0.6F, -1.4F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0954F, -1.0944F, -0.0082F, 0.2531F, -0.1886F));

		PartDefinition cube_r32 = Head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(65, 14).addBox(-1.0F, -0.1134F, -1.003F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2729F, 0.1181F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(62, 67).addBox(0.0F, -0.1134F, 0.097F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0F, -1.1017F, -0.8884F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(61, 55).addBox(0.0F, -0.0134F, -2.003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.9785F, -4.4821F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(62, 41).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(62, 41).addBox(0.44F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.72F, -0.154F, -7.0496F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(-0.52F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(32, 73).mirror().addBox(-0.63F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(32, 73).addBox(1.07F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(73, 6).addBox(0.96F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.72F, -0.4912F, -2.071F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 0).addBox(0.94F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.72F, -0.5643F, -2.1177F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(71, 47).addBox(0.94F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.72F, -0.0188F, -2.4674F, -2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r39 = Head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(71, 3).mirror().addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(71, 3).addBox(0.94F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.72F, -0.1117F, -1.8339F, -2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(71, 10).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(71, 10).addBox(0.94F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.72F, -0.0484F, -1.6194F, -2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(67, 71).addBox(0.94F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.72F, -0.9843F, -1.6309F, -2.5395F, 0.0F, 0.0F));

		PartDefinition cube_r42 = Head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(71, 50).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(71, 50).addBox(0.94F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.72F, -1.0522F, -2.227F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(57, 70).mirror().addBox(-1.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(57, 70).addBox(0.44F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.22F, 0.323F, -0.3914F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(52, 70).mirror().addBox(-1.0F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(52, 70).addBox(0.44F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.22F, -0.2785F, -0.4817F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(62, 70).mirror().addBox(-1.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(62, 70).addBox(0.44F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.22F, 0.0506F, -0.926F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(47, 70).mirror().addBox(-1.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(47, 70).addBox(0.44F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.22F, -0.4331F, -0.0061F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(63, 34).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(63, 34).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.72F, -0.9372F, -0.3275F, 0.0F, 0.1222F, 1.5708F));

		PartDefinition cube_r48 = Head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(42, 61).mirror().addBox(-1.0F, -0.0134F, -1.903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(42, 61).addBox(-0.4F, -0.0134F, -1.903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, -1.1354F, -2.689F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(72, 13).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(12, 72).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(72, 13).addBox(0.74F, -0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(12, 72).addBox(0.74F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.62F, -0.6482F, -4.3486F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(62, 33).mirror().addBox(-0.5F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(62, 33).addBox(0.74F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.62F, -0.5749F, -2.9506F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r51 = Head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(62, 37).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(62, 37).addBox(0.74F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.62F, -0.101F, -4.9407F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-1.0F, -0.9F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 61).addBox(-0.4F, -0.9F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.3855F, -2.8894F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(52, 55).addBox(0.0F, -0.0134F, -2.003F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(-1.0F, -1.2052F, -0.6902F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(42, 70).addBox(0.0F, -0.5815F, -0.2823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 21).addBox(0.0F, -0.8815F, -0.1823F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.4786F, -7.2687F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(62, 45).addBox(0.1F, -0.8815F, 0.0177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.5152F, -6.5696F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(74, 19).addBox(-1.0F, 0.2185F, -0.0823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 65).addBox(-1.0F, -0.1815F, -0.1823F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.0371F, -8.375F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(74, 25).addBox(-1.0F, -0.0815F, -2.1823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(73, 56).addBox(-1.0F, -0.0815F, -1.5823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 70).addBox(-1.0F, -0.0415F, -0.8488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -0.7503F, -6.5038F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(62, 29).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.17F)), PartPose.offsetAndRotation(0.0F, 0.5486F, -5.7226F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(37, 70).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6178F, -4.7778F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(62, 25).mirror().addBox(-1.0F, -0.9F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(62, 25).addBox(-0.4F, -0.9F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, 1.0169F, -4.7499F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r61 = Head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(63, 34).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(63, 34).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.72F, -0.9372F, -0.3275F, 0.0F, -0.1222F, -1.5708F));

		PartDefinition cube_r62 = Head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(18, 56).addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5969F, -1.9972F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r63 = Head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(55, 65).addBox(0.0F, -1.0F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4855F, -2.7894F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7404F, -0.19F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r64 = Jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(64, 51).mirror().addBox(-1.0F, -0.4622F, -0.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(64, 51).addBox(0.0F, -0.4622F, -0.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.2051F, -4.3148F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r65 = Jaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(28, 64).mirror().addBox(-1.0F, -0.1622F, -0.1523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(28, 64).addBox(0.0F, -0.1622F, -0.1523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, -0.2051F, -4.3148F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Jaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(21, 64).mirror().addBox(-1.0F, -0.7622F, -1.7523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(21, 64).addBox(0.0F, -0.7622F, -1.7523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.7717F, -2.9235F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r67 = Jaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(31, 51).mirror().addBox(-1.0F, -0.1722F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(31, 51).addBox(-0.6F, -0.1722F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3F, -0.9925F, -6.7501F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r68 = Jaw.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(22, 51).mirror().addBox(-1.0F, -0.1722F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(72, 71).addBox(-0.8F, -0.1722F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(22, 51).addBox(-0.6F, -0.1722F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.3F, -0.5974F, -6.8127F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r69 = Jaw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(13, 50).mirror().addBox(-1.0F, -0.7722F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(13, 50).addBox(-0.6F, -0.7722F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 0.5859F, -4.394F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r70 = Jaw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(62, 59).mirror().addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(17, 72).mirror().addBox(-0.504F, -1.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.9294F, -1.3292F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r71 = Jaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(48, 50).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.9294F, -1.3292F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r72 = Jaw.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(27, 72).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1853F, -2.1329F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r73 = Jaw.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(22, 72).mirror().addBox(-0.5F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(72, 16).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1016F, -0.9358F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r74 = Jaw.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(48, 45).mirror().addBox(-0.5F, -0.4F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5931F, 1.3702F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r75 = Jaw.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(57, 73).addBox(0.0F, -0.7722F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(0, 73).addBox(0.0F, -0.7722F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.094F, -6.9222F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r76 = Jaw.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(5, 73).addBox(0.0F, -0.3722F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, -0.7949F, -6.7814F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r77 = Jaw.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(62, 59).addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F))
				.texOffs(17, 72).addBox(-0.496F, -1.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7F, 0.9294F, -1.3292F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r78 = Jaw.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(48, 50).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7F, 0.9294F, -1.3292F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Jaw.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(27, 72).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, -0.1853F, -2.1329F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r80 = Jaw.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(22, 72).addBox(-0.5F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(72, 16).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, -0.1016F, -0.9358F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r81 = Jaw.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(48, 45).addBox(-0.5F, -0.4F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7F, 0.5931F, 1.3702F, -0.2094F, 0.0F, 0.0F));

		PartDefinition LArm = Chest.addOrReplaceChild("LArm", CubeListBuilder.create().texOffs(12, 68).addBox(-0.5F, 2.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3383F, 3.5046F, -3.1407F, 0.73F, 0.1748F, -0.1311F));

		PartDefinition cube_r82 = LArm.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(69, 41).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2201F, -0.1396F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r83 = LArm.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(17, 68).addBox(0.5F, -1.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 2.1F, 0.7F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r84 = LArm.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(52, 73).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition LArm2 = LArm.addOrReplaceChild("LArm2", CubeListBuilder.create().texOffs(57, 45).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(27, 58).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.767F, 0.4456F, -1.7017F, 0.0F, 0.0F));

		PartDefinition LHand = LArm2.addOrReplaceChild("LHand", CubeListBuilder.create().texOffs(55, 39).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.2088F, 3.6137F, -0.1F, 0.0F, 0.0F, 0.6981F));

		PartDefinition LArm3 = Chest.addOrReplaceChild("LArm3", CubeListBuilder.create().texOffs(22, 68).addBox(-0.5F, 2.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3383F, 3.5046F, -3.1407F, 0.7836F, -0.0715F, 0.0501F));

		PartDefinition cube_r85 = LArm3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(69, 44).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2201F, -0.1396F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r86 = LArm3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(27, 68).addBox(-1.5F, -1.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 2.1F, 0.7F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r87 = LArm3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(73, 53).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition LArm4 = LArm3.addOrReplaceChild("LArm4", CubeListBuilder.create().texOffs(52, 59).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(57, 59).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.767F, 0.4456F, -0.8727F, 0.0F, 0.0F));

		PartDefinition LHand2 = LArm4.addOrReplaceChild("LHand2", CubeListBuilder.create().texOffs(45, 55).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.2088F, 3.6137F, -0.1F, 0.0F, 0.0F, -0.6545F));

		PartDefinition LLeg = Basin.addOrReplaceChild("LLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 0.9356F, 0.133F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r88 = LLeg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(45, 65).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.9138F, -0.9711F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r89 = LLeg.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(37, 59).addBox(-1.0F, -0.1F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.2467F, 0.6909F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r90 = LLeg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(57, 51).addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.1F, 0.2793F, 0.0F, 0.0F));

		PartDefinition LLeg2 = LLeg.addOrReplaceChild("LLeg2", CubeListBuilder.create().texOffs(57, 24).addBox(-1.0F, 1.1697F, -0.3373F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(57, 0).addBox(-1.0F, 0.0697F, -0.8373F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(40, 51).addBox(0.0F, 0.1697F, -0.3373F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 6.7188F, -0.1483F, 1.9635F, 0.0F, 0.0F));

		PartDefinition LFoot = LLeg2.addOrReplaceChild("LFoot", CubeListBuilder.create().texOffs(40, 25).addBox(-1.5F, -0.5F, -3.8F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6648F, 0.1163F, -0.1484F, 0.0F, 0.0F));

		PartDefinition LFoot2 = LFoot.addOrReplaceChild("LFoot2", CubeListBuilder.create().texOffs(40, 39).addBox(-1.5F, -0.4F, -3.8F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.136F, -3.5362F, 0.3054F, 0.0F, 0.0F));

		PartDefinition LLeg3 = Basin.addOrReplaceChild("LLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 0.9356F, 0.133F, 0.1313F, 0.0057F, 0.1308F));

		PartDefinition cube_r91 = LLeg3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(50, 65).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 3.9138F, -0.9711F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r92 = LLeg3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(60, 15).addBox(0.0F, -0.1F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.2467F, 0.6909F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r93 = LLeg3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(9, 60).addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.1F, 0.2793F, 0.0F, 0.0F));

		PartDefinition LLeg4 = LLeg3.addOrReplaceChild("LLeg4", CubeListBuilder.create().texOffs(57, 31).addBox(0.0F, 1.1697F, -0.3373F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(57, 5).addBox(0.0F, 0.0697F, -0.8373F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(55, 16).addBox(-1.0F, 0.1697F, -0.3373F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 6.7188F, -0.1483F, 0.7399F, -0.0668F, 0.0562F));

		PartDefinition LFoot3 = LLeg4.addOrReplaceChild("LFoot3", CubeListBuilder.create().texOffs(40, 32).addBox(-1.5F, -0.5F, -3.8F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6648F, 0.1163F, 0.1581F, 0.1429F, -0.0656F));

		PartDefinition LFoot4 = LFoot3.addOrReplaceChild("LFoot4", CubeListBuilder.create().texOffs(42, 10).addBox(-1.5F, -0.4F, -3.8F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.136F, -3.5362F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Tail = Basin.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.6021F, -0.004F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5167F, 4.9235F, -0.0436F, 0.0872F, -0.0038F));

		PartDefinition cube_r94 = Tail.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(73, 74).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6021F, 6.996F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r95 = Tail.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(70, 74).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6021F, 4.996F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r96 = Tail.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(74, 67).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6021F, 2.996F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r97 = Tail.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(47, 76).addBox(0.0F, 1.7F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 46).addBox(0.0F, 0.3F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 76).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6059F, 3.5449F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r98 = Tail.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(16, 75).addBox(0.0F, 0.0F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5902F, 0.7542F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r99 = Tail.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(67, 74).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6021F, 0.996F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0485F, 8.8956F, 0.1118F, 0.2031F, -0.0795F));

		PartDefinition cube_r100 = Tail2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(76, 74).addBox(0.0F, -1.6F, 5.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 75).addBox(0.0F, -1.9F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 0).addBox(-0.5F, -0.7F, -0.6F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1488F, 0.5276F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r101 = Tail2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(62, 76).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2522F, 3.9757F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r102 = Tail2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(13, 75).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4265F, 1.9833F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Tail2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(19, 77).addBox(0.0F, 6.7F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 76).addBox(0.0F, 4.3F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 76).addBox(0.0F, 2.9F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6545F, -5.3506F, 0.6632F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7248F, 7.7079F, 0.0873F, -0.0859F, 0.0152F));

		PartDefinition cube_r104 = Tail3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(77, 16).addBox(0.0F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4928F, 2.1162F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Tail3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(77, 13).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.58F, 0.1181F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r106 = Tail3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(77, 31).addBox(0.0F, 11.7655F, 15.9756F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 28).addBox(0.0F, 10.4837F, 14.4371F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 77).addBox(0.0F, 9.2019F, 12.8986F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 77).addBox(0.0F, 8.0F, 11.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9297F, -13.0585F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r107 = Tail3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(21, 14).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0718F, 0.2961F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5794F, -0.1569F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.404F, 9.0763F, -0.1398F, -0.4342F, 0.0212F));

		PartDefinition tail5 = Tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(21, 35).addBox(-0.5F, -0.4142F, -0.1098F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.1692F, 11.8107F, -0.1962F, -0.4721F, 0.0902F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.2269F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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