package fossils.fossils.client.blockentity.model.eretmorhipis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EretmorhipisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Eretmorhipis;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart Body;
	private final ModelPart LArm;
	private final ModelPart LArm2;
	private final ModelPart LArm3;
	private final ModelPart LArm4;
	private final ModelPart Body2;
	private final ModelPart Tail;
	private final ModelPart LLeg;
	private final ModelPart LLeg2;
	private final ModelPart LLeg3;
	private final ModelPart LLeg4;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;

	public EretmorhipisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Eretmorhipis = this.fossil.getChild("Eretmorhipis");
		this.Neck = this.Eretmorhipis.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.Body = this.Eretmorhipis.getChild("Body");
		this.LArm = this.Body.getChild("LArm");
		this.LArm2 = this.LArm.getChild("LArm2");
		this.LArm3 = this.Body.getChild("LArm3");
		this.LArm4 = this.LArm3.getChild("LArm4");
		this.Body2 = this.Body.getChild("Body2");
		this.Tail = this.Body2.getChild("Tail");
		this.LLeg = this.Tail.getChild("LLeg");
		this.LLeg2 = this.LLeg.getChild("LLeg2");
		this.LLeg3 = this.Tail.getChild("LLeg3");
		this.LLeg4 = this.LLeg3.getChild("LLeg4");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Eretmorhipis = fossil.addOrReplaceChild("Eretmorhipis", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.1697F, -18.8529F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Eretmorhipis.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 63).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1042F, -0.9872F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Eretmorhipis.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(68, 20).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, 0.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Eretmorhipis.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(6, 43).addBox(0.0F, -1.5F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 11).addBox(0.0F, -1.2F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 51).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 57).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.7F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Eretmorhipis.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(65, 47).mirror().addBox(-4.4883F, -1.5823F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7383F, 2.8046F, 0.0558F, 0.5572F, -1.6025F));

		PartDefinition cube_r5 = Eretmorhipis.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(67, 2).mirror().addBox(-2.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7383F, 2.8046F, 0.3046F, 0.4771F, -1.1075F));

		PartDefinition cube_r6 = Eretmorhipis.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(27, 61).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7383F, 2.8046F, 0.4665F, 0.3402F, -0.7055F));

		PartDefinition cube_r7 = Eretmorhipis.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(19, 43).mirror().addBox(-0.0135F, -0.7543F, 0.0584F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3481F, 0.4255F, -0.8173F, -0.4438F, 0.2873F));

		PartDefinition cube_r8 = Eretmorhipis.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 49).mirror().addBox(-0.0439F, -0.5106F, -0.1934F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3481F, -1.3745F, -0.6035F, -0.3725F, 0.2325F));

		PartDefinition cube_r9 = Eretmorhipis.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 43).addBox(0.0135F, -0.7543F, 0.0584F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3481F, 0.4255F, -0.8173F, 0.4438F, -0.2873F));

		PartDefinition cube_r10 = Eretmorhipis.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(40, 49).addBox(0.0439F, -0.5106F, -0.1934F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3481F, -1.3745F, -0.6035F, 0.3725F, -0.2325F));

		PartDefinition cube_r11 = Eretmorhipis.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(27, 61).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7383F, 2.8046F, 0.4665F, -0.3402F, 0.7055F));

		PartDefinition cube_r12 = Eretmorhipis.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(67, 2).addBox(0.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7383F, 2.8046F, 0.3046F, -0.4771F, 1.1075F));

		PartDefinition cube_r13 = Eretmorhipis.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(65, 47).addBox(2.4883F, -1.5823F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7383F, 2.8046F, 0.0558F, -0.5572F, 1.6025F));

		PartDefinition cube_r14 = Eretmorhipis.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(52, 29).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.3578F, 3.0078F, 0.192F, 0.0F, 0.0F));

		PartDefinition Neck = Eretmorhipis.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -1.75F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r15 = Neck.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(52, 40).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 54).addBox(0.0F, -0.6F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 7).addBox(-0.5F, -0.2F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7455F, -1.2512F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Neck.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(28, 40).mirror().addBox(0.0F, -0.4924F, -0.0296F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3481F, -1.8245F, -0.5299F, -0.2272F, 0.1312F));

		PartDefinition cube_r17 = Neck.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(28, 40).addBox(0.0F, -0.4924F, -0.0296F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3481F, -1.8245F, -0.5299F, 0.2272F, -0.1312F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.405F, -3.9137F, -0.0873F, -0.3054F, 0.0F));

		PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 54).mirror().addBox(-0.5F, -0.6941F, -2.5228F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 54).addBox(0.5F, -0.6941F, -2.5228F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.68F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(21, 64).mirror().addBox(-0.2F, -0.2727F, -0.2796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(21, 64).addBox(0.2F, -0.2727F, -0.2796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 1.1F, -5.48F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(64, 63).mirror().addBox(-0.3F, -0.1801F, -1.7931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(64, 63).addBox(0.3F, -0.1801F, -1.7931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.68F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(24, 56).mirror().addBox(-1.01F, -0.6F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 56).addBox(0.01F, -0.6F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.2F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(9, 64).mirror().addBox(-1.0F, -0.4F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2778F, 0.195F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(44, 65).mirror().addBox(-1.21F, -1.0343F, -0.1867F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 65).addBox(0.21F, -1.0343F, -0.1867F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.5F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(47, 16).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -2.98F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(16, 20).addBox(-1.5F, -0.1552F, -0.2033F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.5F, -2.18F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 37).addBox(-1.5F, -0.0992F, -0.2519F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.68F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(59, 18).addBox(-1.5F, -0.7237F, -1.7073F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.9F, -3.28F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(9, 64).addBox(0.0F, -0.4F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(32, 31).addBox(-1.0F, -0.4F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.2778F, 0.195F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(65, 24).addBox(-0.5F, -0.1F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r30 = Head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(24, 51).addBox(-1.2F, -0.3F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7F, 0.3851F, -0.7872F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0366F, 0.2634F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Jaw.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(28, 40).mirror().addBox(-0.4F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.444F, -4.8878F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition cube_r32 = Jaw.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(64, 51).mirror().addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.301F)).mirror(false)
				.texOffs(64, 51).addBox(1.1F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-0.8F, -0.224F, -2.0367F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Jaw.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(16, 54).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)).mirror(false)
				.texOffs(16, 54).addBox(1.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-0.8F, 0.0131F, -0.419F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Jaw.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(37, 64).mirror().addBox(-0.5F, -0.3088F, -0.3034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.29F)).mirror(false)
				.texOffs(37, 64).addBox(1.1F, -0.3088F, -0.3034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-0.8F, -0.424F, -1.5367F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Jaw.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(58, 40).mirror().addBox(-1.3F, -0.7F, -4.55F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(58, 40).addBox(0.3F, -0.7F, -4.55F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.5366F, 0.5902F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Jaw.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(28, 40).addBox(-0.6F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.444F, -4.8878F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition Body = Eretmorhipis.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -5.9F, 5.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(40, 68).addBox(0.0F, -2.5F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 69).addBox(0.0F, -2.3F, -4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 11).addBox(0.0F, -2.0F, -6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 69).addBox(0.0F, -1.6F, -8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 30).addBox(-0.5F, 0.0F, -8.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -1.6F, 8.8F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(-2.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0383F, 7.3046F, 0.1957F, 0.173F, -0.8151F));

		PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(-4.4883F, -1.5823F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0383F, 7.3046F, 0.104F, 0.2392F, -1.2559F));

		PartDefinition cube_r40 = Body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(68, 30).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0383F, 7.3046F, 0.2492F, 0.0988F, -0.4257F));

		PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(69, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0383F, 5.3046F, 0.2892F, 0.1168F, -0.4912F));

		PartDefinition cube_r42 = Body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(67, 49).mirror().addBox(-2.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0383F, 5.3046F, 0.2263F, 0.2046F, -0.8791F));

		PartDefinition cube_r43 = Body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(28, 66).mirror().addBox(-4.4883F, -1.5823F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0383F, 5.3046F, 0.1181F, 0.2807F, -1.3221F));

		PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(66, 40).mirror().addBox(-4.4883F, -1.5823F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9383F, 3.3046F, 0.1473F, 0.3634F, -1.3827F));

		PartDefinition cube_r45 = Body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(65, 67).mirror().addBox(-2.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9383F, 3.3046F, 0.2887F, 0.2674F, -0.9343F));

		PartDefinition cube_r46 = Body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(46, 69).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9383F, 3.3046F, 0.3697F, 0.152F, -0.5502F));

		PartDefinition cube_r47 = Body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-2.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8383F, 1.3046F, 0.3401F, 0.3169F, -0.9981F));

		PartDefinition cube_r48 = Body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(51, 69).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8383F, 1.3046F, 0.4348F, 0.1796F, -0.618F));

		PartDefinition cube_r49 = Body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(66, 42).mirror().addBox(-4.4883F, -1.5823F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8383F, 1.3046F, 0.172F, 0.4294F, -1.4517F));

		PartDefinition cube_r50 = Body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(68, 30).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0383F, 7.3046F, 0.2492F, -0.0988F, 0.4257F));

		PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(15, 67).addBox(0.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0383F, 7.3046F, 0.1957F, -0.173F, 0.8151F));

		PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(66, 18).addBox(2.4883F, -1.5823F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0383F, 7.3046F, 0.104F, -0.2392F, 1.2559F));

		PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(69, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0383F, 5.3046F, 0.2892F, -0.1168F, 0.4912F));

		PartDefinition cube_r54 = Body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(67, 49).addBox(0.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0383F, 5.3046F, 0.2263F, -0.2046F, 0.8791F));

		PartDefinition cube_r55 = Body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(28, 66).addBox(2.4883F, -1.5823F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0383F, 5.3046F, 0.1181F, -0.2807F, 1.3221F));

		PartDefinition cube_r56 = Body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(46, 69).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9383F, 3.3046F, 0.3697F, -0.152F, 0.5502F));

		PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(65, 67).addBox(0.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9383F, 3.3046F, 0.2887F, -0.2674F, 0.9343F));

		PartDefinition cube_r58 = Body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(66, 40).addBox(2.4883F, -1.5823F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9383F, 3.3046F, 0.1473F, -0.3634F, 1.3827F));

		PartDefinition cube_r59 = Body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(66, 42).addBox(2.4883F, -1.5823F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8383F, 1.3046F, 0.172F, -0.4294F, 1.4517F));

		PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 68).addBox(0.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8383F, 1.3046F, 0.3401F, -0.3169F, 0.9981F));

		PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(51, 69).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8383F, 1.3046F, 0.4348F, -0.1796F, 0.618F));

		PartDefinition cube_r62 = Body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(32, 27).addBox(-3.0F, -2.6221F, -7.4979F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 5.0356F, 8.5293F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r63 = Body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0376F, -1.9822F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.021F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.957F, -1.8789F, -1.5708F, 0.6196F, -1.5708F));

		PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(40, 53).mirror().addBox(-1.2F, -1.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 2.257F, -2.6789F, -1.5708F, 1.1257F, -1.5708F));

		PartDefinition cube_r65 = Body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(35, 59).mirror().addBox(-0.8F, 0.5F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(57, 60).mirror().addBox(-1.2F, 0.5F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.021F)).mirror(false)
				.texOffs(57, 60).addBox(0.6F, 0.5F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.021F)), PartPose.offsetAndRotation(-0.2F, 3.0765F, 1.3619F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(36, 40).mirror().addBox(-0.2F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.3387F, -0.5072F, 1.1097F, -0.2762F, -0.502F));

		PartDefinition cube_r67 = Body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(59, 11).mirror().addBox(-2.5F, -1.0F, -1.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(59, 11).addBox(1.5F, -1.0F, -1.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 1.1126F, 0.2927F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r68 = Body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(36, 40).addBox(-0.8F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(2.0F, 2.3387F, -0.5072F, 1.1097F, 0.2762F, 0.502F));

		PartDefinition cube_r69 = Body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 0).addBox(0.0376F, -1.9822F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.021F)), PartPose.offsetAndRotation(0.8F, 0.957F, -1.8789F, -1.5708F, -0.6196F, 1.5708F));

		PartDefinition cube_r70 = Body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(40, 53).addBox(0.2F, -1.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(46, 0).addBox(0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.8F, 2.257F, -2.6789F, -1.5708F, -1.1257F, 1.5708F));

		PartDefinition cube_r71 = Body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.0564F, -4.0844F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -4.1F, 4.3F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r72 = Body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, -0.1087F, -4.8011F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -4.5F, 9.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r73 = Body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(32, 27).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9F, 3.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r74 = Body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(51, 65).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition LArm = Body.addOrReplaceChild("LArm", CubeListBuilder.create().texOffs(62, 34).addBox(0.0F, -1.0F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 63).addBox(2.0F, -1.0F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0368F, 3.1816F, -0.931F, 1.1008F, -0.6878F, 0.5479F));

		PartDefinition LArm2 = LArm.addOrReplaceChild("LArm2", CubeListBuilder.create().texOffs(43, 24).addBox(1.0F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -0.5F, 0.5F, -0.1966F, 0.3331F, -0.4142F));

		PartDefinition cube_r75 = LArm2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(40, 51).addBox(1.0F, -0.5F, -0.99F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.5F, -0.5F, 0.205F, -0.0416F, 0.3057F));

		PartDefinition cube_r76 = LArm2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(35, 17).addBox(-1.5F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.5F, 0.0F, 1.2F, 0.0F, -0.2618F, 0.0F));

		PartDefinition LArm3 = Body.addOrReplaceChild("LArm3", CubeListBuilder.create().texOffs(62, 34).mirror().addBox(-2.0F, -1.0F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 63).mirror().addBox(-3.0F, -1.0F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0368F, 3.1816F, -0.931F, 1.0055F, 0.7442F, -0.3593F));

		PartDefinition LArm4 = LArm3.addOrReplaceChild("LArm4", CubeListBuilder.create().texOffs(43, 24).mirror().addBox(-4.0F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.5F, 0.5F, -0.124F, -0.4197F, 0.0649F));

		PartDefinition cube_r77 = LArm4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(40, 51).mirror().addBox(-6.0F, -0.5F, -0.99F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.5F, -0.5F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r78 = LArm4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(35, 17).mirror().addBox(-1.5F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.0F, 1.2F, 0.0F, 0.2618F, 0.0F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(35, 11).addBox(-0.5F, -4.8003F, 0.4314F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(57, 0).addBox(-0.5F, -0.2003F, 0.0314F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.01F))
				.texOffs(54, 51).addBox(-0.5F, -3.3003F, 0.0314F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.01F))
				.texOffs(16, 0).addBox(-3.5F, 3.7997F, 0.0314F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.01F))
				.texOffs(37, 68).addBox(0.0F, -2.8003F, 0.0314F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 68).addBox(0.0F, -2.9003F, 2.0314F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 68).addBox(0.0F, -3.0003F, 4.0314F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 68).addBox(0.0F, -2.8003F, 6.0314F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4036F, 8.793F, -0.1222F, -0.0873F, 0.0F));

		PartDefinition cube_r79 = Body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-4.593F, -1.5501F, -0.5188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3653F, 6.5115F, 0.0875F, 0.1894F, -1.2245F));

		PartDefinition cube_r80 = Body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(53, 11).mirror().addBox(-3.0052F, -0.309F, -0.5188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3653F, 6.5115F, 0.1595F, 0.1348F, -0.7857F));

		PartDefinition cube_r81 = Body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(14, 34).mirror().addBox(-1.0466F, 0.0989F, -0.533F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3653F, 6.5115F, 0.2013F, 0.0771F, -0.395F));

		PartDefinition cube_r82 = Body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(58, 47).mirror().addBox(-4.5894F, -1.5512F, -0.5149F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3653F, 4.5115F, 0.104F, 0.2392F, -1.2035F));

		PartDefinition cube_r83 = Body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(63, 60).mirror().addBox(-3.0023F, -0.3115F, -0.5149F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3653F, 4.5115F, 0.1957F, 0.173F, -0.7627F));

		PartDefinition cube_r84 = Body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(42, 59).mirror().addBox(-1.045F, 0.0955F, -0.5291F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3653F, 4.5115F, 0.2492F, 0.0988F, -0.3733F));

		PartDefinition cube_r85 = Body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(51, 60).mirror().addBox(-4.4933F, -1.5807F, -0.4855F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3653F, 2.5115F, 0.104F, 0.2392F, -1.2035F));

		PartDefinition cube_r86 = Body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(64, 55).mirror().addBox(-2.9278F, -0.3789F, -0.4855F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3653F, 2.5115F, 0.1957F, 0.173F, -0.7627F));

		PartDefinition cube_r87 = Body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(-1.0022F, 0.0048F, -0.4989F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3653F, 2.5115F, 0.2492F, 0.0988F, -0.3733F));

		PartDefinition cube_r88 = Body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(66, 13).mirror().addBox(-4.4883F, -1.5823F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3653F, 0.5115F, 0.104F, 0.2392F, -1.2384F));

		PartDefinition cube_r89 = Body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(67, 4).mirror().addBox(-2.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3653F, 0.5115F, 0.1957F, 0.173F, -0.7976F));

		PartDefinition cube_r90 = Body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(68, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3653F, 0.5115F, 0.2492F, 0.0988F, -0.4082F));

		PartDefinition cube_r91 = Body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 58).addBox(2.593F, -1.5501F, -0.5188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3653F, 6.5115F, 0.0875F, -0.1894F, 1.2245F));

		PartDefinition cube_r92 = Body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(53, 11).addBox(1.0052F, -0.309F, -0.5188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3653F, 6.5115F, 0.1595F, -0.1348F, 0.7857F));

		PartDefinition cube_r93 = Body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(14, 34).addBox(0.0466F, 0.0989F, -0.533F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3653F, 6.5115F, 0.2013F, -0.0771F, 0.395F));

		PartDefinition cube_r94 = Body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(58, 47).addBox(2.5894F, -1.5512F, -0.5149F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3653F, 4.5115F, 0.104F, -0.2392F, 1.2035F));

		PartDefinition cube_r95 = Body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(63, 60).addBox(1.0023F, -0.3115F, -0.5149F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3653F, 4.5115F, 0.1957F, -0.173F, 0.7627F));

		PartDefinition cube_r96 = Body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(42, 59).addBox(0.045F, 0.0955F, -0.5291F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3653F, 4.5115F, 0.2492F, -0.0988F, 0.3733F));

		PartDefinition cube_r97 = Body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(51, 60).addBox(2.4933F, -1.5807F, -0.4855F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3653F, 2.5115F, 0.104F, -0.2392F, 1.2035F));

		PartDefinition cube_r98 = Body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(64, 55).addBox(0.9278F, -0.3789F, -0.4855F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3653F, 2.5115F, 0.1957F, -0.173F, 0.7627F));

		PartDefinition cube_r99 = Body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(69, 51).addBox(0.0022F, 0.0048F, -0.4989F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3653F, 2.5115F, 0.2492F, -0.0988F, 0.3733F));

		PartDefinition cube_r100 = Body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(68, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3653F, 0.5115F, 0.2492F, -0.0988F, 0.4082F));

		PartDefinition cube_r101 = Body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(67, 4).addBox(0.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3653F, 0.5115F, 0.1957F, -0.173F, 0.7976F));

		PartDefinition cube_r102 = Body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(66, 13).addBox(2.4883F, -1.5823F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3653F, 0.5115F, 0.104F, -0.2392F, 1.2384F));

		PartDefinition cube_r103 = Body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(28, 59).addBox(-0.5F, -1.1F, -1.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.6337F, 6.0003F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tail = Body2.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(47, 13).addBox(-0.5F, -0.2334F, 0.0689F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(46, 40).addBox(-0.5F, -3.2334F, -0.4311F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(21, 68).addBox(0.0F, -2.9334F, 1.0689F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0003F, 6.9314F, -0.1571F, -0.1309F, 0.0F));

		PartDefinition cube_r104 = Tail.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(7, 68).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2334F, 7.0689F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Tail.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(10, 68).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2334F, 5.0689F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r106 = Tail.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(13, 68).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2334F, 3.0689F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r107 = Tail.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(16, 15).addBox(-2.5F, -2.9F, 0.0F, 5.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6666F, 1.0689F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r108 = Tail.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 2.3013F, 8.8719F, -1.4066F, -0.0594F, 0.3442F));

		PartDefinition cube_r109 = Tail.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(14, 61).mirror().addBox(-0.3F, -0.6504F, -0.0231F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.1218F, 8.7719F, -0.4451F, 0.0F, -1.0472F));

		PartDefinition cube_r110 = Tail.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(62, 29).mirror().addBox(-0.3F, -0.6504F, -0.5231F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.1218F, 8.7719F, -1.8762F, 0.0F, -1.0472F));

		PartDefinition cube_r111 = Tail.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(14, 61).addBox(-0.7F, -0.6504F, -0.0231F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, 3.1218F, 8.7719F, -0.4451F, 0.0F, 1.0472F));

		PartDefinition cube_r112 = Tail.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(62, 29).addBox(-0.7F, -0.6504F, -0.5231F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.1218F, 8.7719F, -1.8762F, 0.0F, 1.0472F));

		PartDefinition cube_r113 = Tail.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 54).addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 2.3013F, 8.8719F, -1.4066F, 0.0594F, -0.3442F));

		PartDefinition cube_r114 = Tail.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-2.0123F, 0.0227F, -0.2799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1656F, 8.6801F, -0.0832F, 0.0155F, -0.6104F));

		PartDefinition cube_r115 = Tail.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(23, 34).mirror().addBox(-3.3221F, -1.6312F, -0.357F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 7.4801F, 0.0448F, 0.0564F, -1.4043F));

		PartDefinition cube_r116 = Tail.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(16, 5).mirror().addBox(-2.794F, -0.497F, -0.357F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 7.4801F, 0.0644F, 0.0322F, -0.9682F));

		PartDefinition cube_r117 = Tail.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(14, 39).mirror().addBox(-0.9255F, -0.1552F, -0.369F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 7.4801F, 0.0745F, 0.0184F, -0.5756F));

		PartDefinition cube_r118 = Tail.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(12, 50).mirror().addBox(-3.5396F, -1.561F, -0.2954F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 5.3801F, 0.093F, 0.206F, -1.3456F));

		PartDefinition cube_r119 = Tail.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(16, 11).mirror().addBox(-2.9613F, -0.3414F, -0.2954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 5.3801F, 0.1715F, 0.1475F, -0.9062F));

		PartDefinition cube_r120 = Tail.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(28, 47).mirror().addBox(-1.0215F, 0.0527F, -0.3091F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 5.3801F, 0.2172F, 0.0844F, -0.5159F));

		PartDefinition cube_r121 = Tail.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(20, 61).mirror().addBox(-4.4518F, -1.5887F, -0.2957F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 3.3801F, 0.1181F, 0.2807F, -1.3046F));

		PartDefinition cube_r122 = Tail.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(45, 7).mirror().addBox(-2.8935F, -0.4036F, -0.2957F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 3.3801F, 0.2263F, 0.2046F, -0.8617F));

		PartDefinition cube_r123 = Tail.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(32, 55).mirror().addBox(-0.9826F, -0.0307F, -0.3087F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 3.3801F, 0.2892F, 0.1168F, -0.4738F));

		PartDefinition cube_r124 = Tail.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(-4.5189F, -1.571F, -0.4264F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 1.4801F, 0.1325F, 0.3221F, -1.248F));

		PartDefinition cube_r125 = Tail.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(46, 45).mirror().addBox(-2.9469F, -0.3593F, -0.4264F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 1.4801F, 0.2572F, 0.2361F, -0.8026F));

		PartDefinition cube_r126 = Tail.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(23, 11).mirror().addBox(-1.0132F, 0.0304F, -0.44F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 1.4801F, 0.3293F, 0.1345F, -0.4164F));

		PartDefinition cube_r127 = Tail.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(23, 34).addBox(2.3221F, -1.6312F, -0.357F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 7.4801F, 0.0448F, -0.0564F, 1.4043F));

		PartDefinition cube_r128 = Tail.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(16, 5).addBox(0.794F, -0.497F, -0.357F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 7.4801F, 0.0644F, -0.0322F, 0.9682F));

		PartDefinition cube_r129 = Tail.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(67, 0).addBox(0.0123F, 0.0227F, -0.2799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1656F, 8.6801F, -0.0832F, -0.0155F, 0.6104F));

		PartDefinition cube_r130 = Tail.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(14, 39).addBox(-0.0745F, -0.1552F, -0.369F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 7.4801F, 0.0745F, -0.0184F, 0.5756F));

		PartDefinition cube_r131 = Tail.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(12, 50).addBox(2.5396F, -1.561F, -0.2954F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 5.3801F, 0.093F, -0.206F, 1.3456F));

		PartDefinition cube_r132 = Tail.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(16, 11).addBox(0.9613F, -0.3414F, -0.2954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 5.3801F, 0.1715F, -0.1475F, 0.9062F));

		PartDefinition cube_r133 = Tail.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(28, 47).addBox(0.0215F, 0.0527F, -0.3091F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 5.3801F, 0.2172F, -0.0844F, 0.5159F));

		PartDefinition cube_r134 = Tail.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(20, 61).addBox(2.4518F, -1.5887F, -0.2957F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 3.3801F, 0.1181F, -0.2807F, 1.3046F));

		PartDefinition cube_r135 = Tail.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(45, 7).addBox(0.8935F, -0.4036F, -0.2957F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 3.3801F, 0.2263F, -0.2046F, 0.8617F));

		PartDefinition cube_r136 = Tail.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(32, 55).addBox(-0.0174F, -0.0307F, -0.3087F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 3.3801F, 0.2892F, -0.1168F, 0.4738F));

		PartDefinition cube_r137 = Tail.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(57, 4).addBox(2.5189F, -1.571F, -0.4264F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 1.4801F, 0.1325F, -0.3221F, 1.248F));

		PartDefinition cube_r138 = Tail.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(46, 45).addBox(0.9469F, -0.3593F, -0.4264F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 1.4801F, 0.2572F, -0.2361F, 0.8026F));

		PartDefinition cube_r139 = Tail.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(23, 11).addBox(0.0132F, 0.0304F, -0.44F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 1.4801F, 0.3293F, -0.1345F, 0.4164F));

		PartDefinition cube_r140 = Tail.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(47, 11).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -3.1503F, 7.4778F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r141 = Tail.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -1.7F, -2.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.0354F, 4.0221F, 0.0F, 0.0F, 0.0F));

		PartDefinition LLeg = Tail.addOrReplaceChild("LLeg", CubeListBuilder.create().texOffs(29, 11).addBox(-0.1331F, -0.5738F, -0.5494F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0192F, 2.948F, 9.0123F, 0.0581F, -0.8758F, 1.0807F));

		PartDefinition LLeg2 = LLeg.addOrReplaceChild("LLeg2", CubeListBuilder.create().texOffs(30, 51).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 49).addBox(0.0F, 0.0F, 0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(52, 24).addBox(1.8F, 0.5F, -1.8F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6377F, -0.5738F, 0.2126F, 0.0F, -0.2618F, 0.0F));

		PartDefinition LLeg3 = Tail.addOrReplaceChild("LLeg3", CubeListBuilder.create().texOffs(29, 11).mirror().addBox(-2.8669F, -0.5738F, -0.5494F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0192F, 2.948F, 9.0123F, 0.8675F, 0.4757F, -0.5184F));

		PartDefinition LLeg4 = LLeg3.addOrReplaceChild("LLeg4", CubeListBuilder.create().texOffs(30, 51).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(0, 49).mirror().addBox(-2.0F, 0.0F, 0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(52, 24).mirror().addBox(-5.8F, 0.5F, -1.8F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6377F, -0.5738F, 0.2126F, 0.0F, 0.2618F, -0.2618F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F))
				.texOffs(34, 67).addBox(0.0F, -2.3F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0334F, 9.0689F, -0.1745F, -0.2182F, 0.0F));

		PartDefinition cube_r142 = Tail2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(52, 24).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 9.5F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Tail2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(46, 38).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 7.5F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Tail2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(56, 51).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 5.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r145 = Tail2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(58, 40).addBox(0.0F, -2.6F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 3.6F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r146 = Tail2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(43, 69).addBox(0.0F, -2.4F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 1.6F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Tail2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(57, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4052F, 9.9045F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Tail2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(58, 65).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1464F, 6.5728F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r149 = Tail2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(66, 9).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1464F, 2.2728F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r150 = Tail2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, -1.8F, -0.1F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(16, 15).addBox(0.0F, 0.2F, -1.6F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, 3.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r151 = Tail2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(23, 30).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3488F, 10.3469F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r152 = Tail2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(38, 0).addBox(0.0F, -0.3F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.164F, 7.7362F, -0.829F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.8F, 10.0F, 0.0524F, -0.2182F, 0.0F));

		PartDefinition cube_r153 = Tail3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 7).addBox(0.0F, -4.3F, 10.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 22).addBox(0.0F, -3.8F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 30).addBox(0.0F, -3.4F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 30).addBox(0.0F, -3.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 43).addBox(0.0F, -2.6F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 4).addBox(0.0F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.0F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r154 = Tail3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(8, 0).addBox(0.0F, -7.9F, 4.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(0.0F, -5.9F, 3.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(8, 15).addBox(0.0F, -3.9F, 2.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(7, 22).addBox(0.0F, -1.9F, 0.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(14, 30).addBox(0.0F, 0.1F, -0.3F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.5F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -0.5F, 12.5F, 0.192F, 0.3491F, 0.0F));

		PartDefinition cube_r155 = Tail4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(20, 15).addBox(0.0F, -3.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 11).addBox(0.0F, -2.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r156 = Tail4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, -6.5F, 2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 15).addBox(0.0F, -4.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 0).addBox(0.0F, -2.5F, 0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 7).addBox(0.0F, -0.5F, -1.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7011F, 1.9077F, -1.0908F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(16, 40).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -0.0412F, 9.0249F, 0.1484F, 0.48F, 0.0F));

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