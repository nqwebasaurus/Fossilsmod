package fossils.fossils.client.blockentity.model.hupehsuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HupehsuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Eretmorhipis;
	private final ModelPart neck2;
	private final ModelPart Neck;
	private final ModelPart neck3;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Chest;
	private final ModelPart LArm;
	private final ModelPart LArm2;
	private final ModelPart LArm3;
	private final ModelPart LArm4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart Body2;
	private final ModelPart Tail;
	private final ModelPart body4;
	private final ModelPart Tail2;
	private final ModelPart LLeg;
	private final ModelPart LLeg2;
	private final ModelPart LLeg3;
	private final ModelPart LLeg4;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart tail6;
	private final ModelPart Tail3;
	private final ModelPart tail7;
	private final ModelPart Tail4;
	private final ModelPart Tail5;

	public HupehsuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Eretmorhipis = this.fossil.getChild("Eretmorhipis");
		this.neck2 = this.Eretmorhipis.getChild("neck2");
		this.Neck = this.neck2.getChild("Neck");
		this.neck3 = this.Neck.getChild("neck3");
		this.Head = this.neck3.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Chest = this.Eretmorhipis.getChild("Chest");
		this.LArm = this.Chest.getChild("LArm");
		this.LArm2 = this.LArm.getChild("LArm2");
		this.LArm3 = this.Chest.getChild("LArm3");
		this.LArm4 = this.LArm3.getChild("LArm4");
		this.bone2 = this.Chest.getChild("bone2");
		this.bone4 = this.Chest.getChild("bone4");
		this.Body = this.Chest.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.Body2 = this.body3.getChild("Body2");
		this.Tail = this.Body2.getChild("Tail");
		this.body4 = this.Tail.getChild("body4");
		this.Tail2 = this.body4.getChild("Tail2");
		this.LLeg = this.Tail2.getChild("LLeg");
		this.LLeg2 = this.LLeg.getChild("LLeg2");
		this.LLeg3 = this.Tail2.getChild("LLeg3");
		this.LLeg4 = this.LLeg3.getChild("LLeg4");
		this.bone = this.Tail2.getChild("bone");
		this.bone3 = this.Tail2.getChild("bone3");
		this.tail6 = this.Tail2.getChild("tail6");
		this.Tail3 = this.tail6.getChild("Tail3");
		this.tail7 = this.Tail3.getChild("tail7");
		this.Tail4 = this.tail7.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Eretmorhipis = fossil.addOrReplaceChild("Eretmorhipis", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.4253F, -14.5606F, 0.1349F, -0.036F, 0.2594F));

		PartDefinition cube_r1 = Eretmorhipis.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(76, 82).addBox(0.0F, -1.5F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6872F, -1.1095F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Eretmorhipis.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(58, 76).mirror().addBox(-0.0135F, -0.7544F, 0.0584F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2519F, -3.9745F, -0.8173F, -0.4438F, 0.2873F));

		PartDefinition cube_r3 = Eretmorhipis.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(60, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1383F, -1.5954F, 0.2913F, 0.1888F, -0.7515F));

		PartDefinition cube_r4 = Eretmorhipis.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(74, 40).mirror().addBox(-2.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1383F, -1.5954F, 0.2F, 0.2721F, -1.146F));

		PartDefinition cube_r5 = Eretmorhipis.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(58, 76).addBox(0.0135F, -0.7544F, 0.0584F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2519F, -3.9745F, -0.8173F, 0.4438F, -0.2873F));

		PartDefinition cube_r6 = Eretmorhipis.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 38).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1383F, -1.5954F, 0.2913F, -0.1888F, 0.7515F));

		PartDefinition cube_r7 = Eretmorhipis.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(74, 40).addBox(0.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1383F, -1.5954F, 0.2F, -0.2721F, 1.146F));

		PartDefinition cube_r8 = Eretmorhipis.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 84).addBox(0.0F, -1.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 27).addBox(-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.1F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Eretmorhipis.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(59, 70).addBox(-0.5F, -0.375F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.3413F, -0.4869F, 0.3316F, 0.0F, 0.0F));

		PartDefinition neck2 = Eretmorhipis.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -4.1F, -0.0172F, 0.1298F, -0.132F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(68, 74).mirror().addBox(-0.0439F, -0.5106F, -0.1934F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3519F, -1.6745F, -0.6035F, -0.3725F, 0.2325F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(68, 74).addBox(0.0439F, -0.5106F, -0.1934F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3519F, -1.6745F, -0.6035F, 0.3725F, -0.2325F));

		PartDefinition cube_r12 = neck2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 84).addBox(0.0F, -1.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 17).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Neck = neck2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -2.05F, 0.0133F, 0.3095F, -0.1208F));

		PartDefinition cube_r13 = Neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(84, 61).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 70).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7455F, -1.2512F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Neck.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(76, 73).mirror().addBox(0.0F, -0.4924F, -0.0297F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3481F, -1.8245F, -0.5299F, -0.2272F, 0.1312F));

		PartDefinition cube_r15 = Neck.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(76, 73).addBox(0.0F, -0.4924F, -0.0297F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3481F, -1.8245F, -0.5299F, 0.2272F, -0.1312F));

		PartDefinition neck3 = Neck.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7455F, -1.7512F, 0.0903F, 0.2646F, -0.0201F));

		PartDefinition cube_r16 = neck3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(84, 54).addBox(0.0F, -0.6F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 70).addBox(-0.5F, -0.2F, -2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Head = neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5392F, -1.781F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(72, 62).addBox(-1.0F, -1.0F, 0.0018F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.3163F, -2.4122F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(72, 56).addBox(-1.0F, -0.75F, -0.3983F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -2.98F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(76, 4).addBox(-1.0F, -0.2052F, -0.2033F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.3001F, -2.173F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(63, 66).addBox(-1.0F, 0.0508F, -1.7519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.5F, -0.5386F, -2.2455F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.5152F, -0.9652F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(42, 79).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.489F, -1.0039F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(3, 79).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, -0.4419F, -1.6021F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2079F, 0.074F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Jaw.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(62, 27).mirror().addBox(-0.5F, -0.3088F, -0.3034F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.29F)).mirror(false)
				.texOffs(62, 27).addBox(1.1F, -0.3088F, -0.3034F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-0.8F, -0.5196F, -1.3074F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Jaw.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(52, 70).mirror().addBox(-0.5F, -0.725F, -0.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.301F)).mirror(false)
				.texOffs(52, 70).addBox(1.1F, -0.725F, -0.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-0.8F, -0.1109F, -2.7728F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Jaw.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(30, 70).mirror().addBox(-0.5F, -0.325F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(30, 70).addBox(1.1F, -0.325F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8F, -0.7956F, -2.6272F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Jaw.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(18, 64).mirror().addBox(-0.2748F, -0.379F, -2.6898F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(0, 65).mirror().addBox(-0.2748F, -0.4004F, -4.9401F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.444F, -2.6878F, -0.2094F, -0.0346F, 0.0076F));

		PartDefinition cube_r28 = Jaw.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(27, 65).mirror().addBox(-0.3156F, -0.4948F, -2.7402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.659F, -1.8826F, -9.5156F, -0.2307F, -0.1885F, 0.0356F));

		PartDefinition cube_r29 = Jaw.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(65, 38).mirror().addBox(-0.3156F, -1.3498F, -2.8589F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.825F, -0.444F, -7.2878F, -0.2445F, -0.0695F, 0.0076F));

		PartDefinition cube_r30 = Jaw.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(9, 62).mirror().addBox(-0.2748F, -0.6757F, -2.711F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.444F, -2.6878F, -0.0872F, -0.0346F, 0.0076F));

		PartDefinition cube_r31 = Jaw.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(37, 55).mirror().addBox(-1.3F, -0.7F, -2.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(37, 55).addBox(0.3F, -0.7F, -2.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.0F, 0.5366F, 0.7902F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Jaw.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(18, 64).addBox(-0.7252F, -0.379F, -2.6898F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F))
				.texOffs(0, 65).addBox(-0.7252F, -0.4004F, -4.9401F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.025F, -0.444F, -2.6878F, -0.2094F, 0.0346F, -0.0076F));

		PartDefinition cube_r33 = Jaw.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(27, 65).addBox(-0.6844F, -0.4948F, -2.7402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.659F, -1.8826F, -9.5156F, -0.2307F, 0.1885F, -0.0356F));

		PartDefinition cube_r34 = Jaw.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(65, 38).addBox(-0.6844F, -1.3498F, -2.8589F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.825F, -0.444F, -7.2878F, -0.2445F, 0.0695F, -0.0076F));

		PartDefinition cube_r35 = Jaw.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(9, 62).addBox(-0.7252F, -0.6757F, -2.711F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.025F, -0.444F, -2.6878F, -0.0872F, 0.0346F, -0.0076F));

		PartDefinition cube_r36 = Jaw.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(20, 84).mirror().addBox(0.5011F, -0.6491F, -0.588F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.8332F, 0.2258F, -2.2171F, -0.4996F, -0.325F, 0.1725F));

		PartDefinition cube_r37 = Jaw.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(43, 85).mirror().addBox(0.1149F, -0.0757F, 1.8317F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.8332F, 0.2258F, -2.2171F, -0.2135F, -0.1675F, 0.083F));

		PartDefinition cube_r38 = Jaw.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(43, 85).addBox(-1.1149F, -0.0757F, 1.8317F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.8332F, 0.2258F, -2.2171F, -0.2135F, 0.1675F, -0.083F));

		PartDefinition cube_r39 = Jaw.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(20, 84).addBox(-1.5011F, -0.6491F, -0.588F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.8332F, 0.2258F, -2.2171F, -0.4996F, 0.325F, -0.1725F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2778F, 0.195F));

		PartDefinition cube_r40 = leftFace.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(76, 79).addBox(-0.3884F, -0.4174F, -0.3352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(29, 60).addBox(-0.3884F, -0.4174F, -0.0352F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2042F, 0.8874F, -12.2717F, 0.0524F, 0.0742F, 0.0F));

		PartDefinition cube_r41 = leftFace.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(66, 70).addBox(-0.625F, -0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1425F, -0.1402F, -3.7484F, 0.3211F, -0.218F, -0.0636F));

		PartDefinition cube_r42 = leftFace.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(76, 31).addBox(-0.8F, -1.8742F, -0.2019F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.0781F, -0.4306F, -1.6807F, 0.0F, -0.5411F, -1.5708F));

		PartDefinition cube_r43 = leftFace.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(29, 76).addBox(-0.8F, -1.8742F, -0.2019F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(1.0781F, -0.462F, -2.2799F, 0.0F, -0.0524F, -1.5708F));

		PartDefinition cube_r44 = leftFace.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(69, 32).addBox(-0.75F, -0.7992F, -1.8019F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(1.0031F, -0.4142F, -2.2653F, -0.0175F, 0.2967F, -1.5708F));

		PartDefinition cube_r45 = leftFace.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(16, 69).addBox(-0.8F, -0.2242F, -1.7519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.2986F, -0.5717F, -2.3657F, 0.0687F, 0.2889F, -1.3339F));

		PartDefinition cube_r46 = leftFace.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(70, 66).addBox(-0.7F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8689F, -0.0055F, -3.7646F, 0.2888F, 0.1096F, 0.2318F));

		PartDefinition cube_r47 = leftFace.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(60, 33).addBox(-0.3884F, -0.3962F, -0.0516F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.2042F, 0.8874F, -12.2717F, 0.1222F, 0.0742F, 0.0F));

		PartDefinition cube_r48 = leftFace.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(79, 61).addBox(-0.1452F, -1.0137F, -9.6172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 60).addBox(-0.1452F, -1.0137F, -9.3172F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.975F, 0.9972F, -3.0F, 0.0524F, 0.1091F, 0.0F));

		PartDefinition cube_r49 = leftFace.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(20, 59).addBox(-0.1452F, -1.6386F, -9.2694F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.975F, 0.9972F, -3.0F, 0.1222F, 0.1091F, 0.0F));

		PartDefinition cube_r50 = leftFace.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(47, 60).addBox(-0.2964F, -0.8914F, -2.5989F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.25F, 0.9972F, -7.4F, 0.0524F, -0.0305F, 0.0F));

		PartDefinition cube_r51 = leftFace.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(56, 60).addBox(-0.2964F, -0.759F, -2.6407F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.25F, 0.9972F, -7.4F, 0.0175F, -0.0305F, 0.0F));

		PartDefinition cube_r52 = leftFace.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(11, 57).addBox(-0.5461F, -1.1228F, -7.0141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.975F, 0.9972F, -3.0F, 0.0524F, 0.0567F, 0.0F));

		PartDefinition cube_r53 = leftFace.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(56, 40).addBox(-0.5461F, -0.8361F, -7.0613F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.975F, 0.9972F, -3.0F, 0.0175F, 0.0567F, 0.0F));

		PartDefinition cube_r54 = leftFace.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(28, 46).addBox(-0.6998F, -1.1233F, -4.6289F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.575F, 0.9972F, -3.0F, 0.0524F, -0.0131F, 0.0F));

		PartDefinition cube_r55 = leftFace.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(53, 18).addBox(-0.6998F, -0.6825F, -4.6785F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.575F, 0.9972F, -3.0F, -0.0175F, -0.0131F, 0.0F));

		PartDefinition cube_r56 = leftFace.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 47).addBox(-0.6998F, -0.6825F, -4.6785F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.975F, 0.9972F, -3.0F, -0.0175F, 0.0218F, 0.0F));

		PartDefinition cube_r57 = leftFace.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(43, 41).addBox(-0.6998F, -1.1233F, -4.6289F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.975F, 0.9972F, -3.0F, 0.0524F, 0.0218F, 0.0F));

		PartDefinition cube_r58 = leftFace.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(13, 82).addBox(-0.5F, -0.2779F, -0.8425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.685F, 0.2092F, -2.1634F, 2.7053F, 0.0349F, 0.0F));

		PartDefinition cube_r59 = leftFace.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(3, 82).addBox(-0.5F, -0.597F, -0.3368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.685F, 0.2092F, -2.1634F, 1.6057F, 0.0349F, 0.0F));

		PartDefinition cube_r60 = leftFace.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(81, 79).addBox(-0.5F, -0.8223F, -0.7442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.685F, 0.2092F, -2.1634F, 0.9076F, 0.0349F, 0.0F));

		PartDefinition cube_r61 = leftFace.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(31, 82).addBox(-0.35F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(82, 24).addBox(-0.475F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6853F, 0.2033F, -2.1547F, 1.7366F, 0.0349F, 0.0F));

		PartDefinition cube_r62 = leftFace.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(81, 72).addBox(-0.5F, -0.8916F, -0.6936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.685F, 0.2092F, -2.1634F, 1.5184F, 0.0349F, 0.0F));

		PartDefinition cube_r63 = leftFace.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(81, 58).addBox(-0.5F, -0.3227F, -0.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.685F, 0.2092F, -2.1634F, 0.2094F, 0.0349F, 0.0F));

		PartDefinition cube_r64 = leftFace.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(80, 48).addBox(-0.49F, -1.5557F, -1.8247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.9F, 0.9868F, 0.1926F, 0.4276F, 0.1047F, 0.0F));

		PartDefinition cube_r65 = leftFace.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(56, 80).addBox(-0.49F, -1.0362F, -1.2513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 0.9868F, 0.1926F, -0.1484F, 0.1047F, 0.0F));

		PartDefinition cube_r66 = leftFace.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(81, 3).addBox(-0.7202F, -0.3702F, -1.3959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2004F, 0.229F, 0.0466F, -1.3578F, 0.1978F, -0.5341F));

		PartDefinition cube_r67 = leftFace.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(81, 0).addBox(-0.8039F, -0.3702F, -0.8012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2004F, 0.229F, 0.0466F, -1.3327F, 0.1665F, -0.3957F));

		PartDefinition cube_r68 = leftFace.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(71, 80).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8845F, 0.5173F, -0.0508F, -1.4748F, 0.1047F, 0.0F));

		PartDefinition cube_r69 = leftFace.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(61, 80).addBox(-0.49F, -0.7489F, -1.2668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9F, 0.9868F, 0.1926F, -0.6021F, 0.1047F, 0.0F));

		PartDefinition cube_r70 = leftFace.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(80, 69).addBox(-0.49F, 0.3285F, -1.2677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.9F, 0.9868F, 0.1926F, -1.5272F, 0.1047F, 0.0F));

		PartDefinition cube_r71 = leftFace.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(81, 40).addBox(-0.49F, 0.6303F, 0.4383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 0.9868F, 0.1926F, -2.6965F, 0.1047F, 0.0F));

		PartDefinition cube_r72 = leftFace.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(51, 80).addBox(-0.49F, -1.4192F, -1.381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9F, 0.9868F, 0.1926F, 0.3054F, 0.1047F, 0.0F));

		PartDefinition cube_r73 = leftFace.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(81, 43).addBox(-0.2F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(79, 55).addBox(-0.2F, -0.2F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, -0.7668F, -1.1989F, -0.0611F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2778F, 0.195F));

		PartDefinition cube_r75 = rightFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(76, 79).mirror().addBox(-0.6116F, -0.4174F, -0.3352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(29, 60).mirror().addBox(-0.6116F, -0.4174F, -0.0352F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2042F, 0.8874F, -12.2717F, 0.0524F, -0.0742F, 0.0F));

		PartDefinition cube_r76 = rightFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(66, 70).mirror().addBox(-0.375F, -0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1425F, -0.1402F, -3.7484F, 0.3211F, 0.218F, 0.0636F));

		PartDefinition cube_r77 = rightFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(76, 31).mirror().addBox(-0.2F, -1.8742F, -0.2019F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(-1.0781F, -0.4306F, -1.6807F, 0.0F, 0.5411F, 1.5708F));

		PartDefinition cube_r78 = rightFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(29, 76).mirror().addBox(-0.2F, -1.8742F, -0.2019F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0781F, -0.462F, -2.2799F, 0.0F, 0.0524F, 1.5708F));

		PartDefinition cube_r79 = rightFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(69, 32).mirror().addBox(-0.25F, -0.7992F, -1.8019F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(-1.0031F, -0.4142F, -2.2653F, -0.0175F, -0.2967F, 1.5708F));

		PartDefinition cube_r80 = rightFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(16, 69).mirror().addBox(-0.2F, -0.2242F, -1.7519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(-0.2986F, -0.5717F, -2.3657F, 0.0687F, -0.2889F, 1.3339F));

		PartDefinition cube_r81 = rightFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(70, 66).mirror().addBox(-0.3F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8689F, -0.0055F, -3.7646F, 0.2888F, -0.1096F, -0.2318F));

		PartDefinition cube_r82 = rightFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(60, 33).mirror().addBox(-0.6116F, -0.3962F, -0.0516F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.2042F, 0.8874F, -12.2717F, 0.1222F, -0.0742F, 0.0F));

		PartDefinition cube_r83 = rightFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(79, 61).mirror().addBox(-0.8548F, -1.0137F, -9.6172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 60).mirror().addBox(-0.8548F, -1.0137F, -9.3172F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.9972F, -3.0F, 0.0524F, -0.1091F, 0.0F));

		PartDefinition cube_r84 = rightFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(20, 59).mirror().addBox(-0.8548F, -1.6386F, -9.2694F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.9972F, -3.0F, 0.1222F, -0.1091F, 0.0F));

		PartDefinition cube_r85 = rightFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(47, 60).mirror().addBox(-0.7036F, -0.8914F, -2.5989F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 0.9972F, -7.4F, 0.0524F, 0.0305F, 0.0F));

		PartDefinition cube_r86 = rightFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(56, 60).mirror().addBox(-0.7036F, -0.759F, -2.6407F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 0.9972F, -7.4F, 0.0175F, 0.0305F, 0.0F));

		PartDefinition cube_r87 = rightFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(11, 57).mirror().addBox(-0.4539F, -1.1228F, -7.0141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.9972F, -3.0F, 0.0524F, -0.0567F, 0.0F));

		PartDefinition cube_r88 = rightFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(56, 40).mirror().addBox(-0.4539F, -0.8361F, -7.0613F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.9972F, -3.0F, 0.0175F, -0.0567F, 0.0F));

		PartDefinition cube_r89 = rightFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(28, 46).mirror().addBox(-0.3002F, -1.1233F, -4.6289F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.9972F, -3.0F, 0.0524F, 0.0131F, 0.0F));

		PartDefinition cube_r90 = rightFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(53, 18).mirror().addBox(-0.3002F, -0.6825F, -4.6785F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.9972F, -3.0F, -0.0175F, 0.0131F, 0.0F));

		PartDefinition cube_r91 = rightFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-0.3002F, -0.6825F, -4.6785F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.9972F, -3.0F, -0.0175F, -0.0218F, 0.0F));

		PartDefinition cube_r92 = rightFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(43, 41).mirror().addBox(-0.3002F, -1.1233F, -4.6289F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.9972F, -3.0F, 0.0524F, -0.0218F, 0.0F));

		PartDefinition cube_r93 = rightFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(13, 82).mirror().addBox(-0.5F, -0.2779F, -0.8425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.685F, 0.2092F, -2.1634F, 2.7053F, -0.0349F, 0.0F));

		PartDefinition cube_r94 = rightFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(3, 82).mirror().addBox(-0.5F, -0.597F, -0.3368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.685F, 0.2092F, -2.1634F, 1.6057F, -0.0349F, 0.0F));

		PartDefinition cube_r95 = rightFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(81, 79).mirror().addBox(-0.5F, -0.8223F, -0.7442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.685F, 0.2092F, -2.1634F, 0.9076F, -0.0349F, 0.0F));

		PartDefinition cube_r96 = rightFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(31, 82).mirror().addBox(-0.65F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(82, 24).mirror().addBox(-0.525F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6853F, 0.2033F, -2.1547F, 1.7366F, -0.0349F, 0.0F));

		PartDefinition cube_r97 = rightFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(81, 72).mirror().addBox(-0.5F, -0.8916F, -0.6936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.685F, 0.2092F, -2.1634F, 1.5184F, -0.0349F, 0.0F));

		PartDefinition cube_r98 = rightFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(81, 58).mirror().addBox(-0.5F, -0.3227F, -0.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.685F, 0.2092F, -2.1634F, 0.2094F, -0.0349F, 0.0F));

		PartDefinition cube_r99 = rightFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(80, 48).mirror().addBox(-0.51F, -1.5557F, -1.8247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9868F, 0.1926F, 0.4276F, -0.1047F, 0.0F));

		PartDefinition cube_r100 = rightFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(56, 80).mirror().addBox(-0.51F, -1.0362F, -1.2513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9868F, 0.1926F, -0.1484F, -0.1047F, 0.0F));

		PartDefinition cube_r101 = rightFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(81, 3).mirror().addBox(-0.2798F, -0.3702F, -1.3959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2004F, 0.229F, 0.0466F, -1.3578F, -0.1978F, 0.5341F));

		PartDefinition cube_r102 = rightFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-0.1961F, -0.3702F, -0.8012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2004F, 0.229F, 0.0466F, -1.3327F, -0.1665F, 0.3957F));

		PartDefinition cube_r103 = rightFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(71, 80).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8845F, 0.5173F, -0.0508F, -1.4748F, -0.1047F, 0.0F));

		PartDefinition cube_r104 = rightFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(61, 80).mirror().addBox(-0.51F, -0.7489F, -1.2668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9868F, 0.1926F, -0.6021F, -0.1047F, 0.0F));

		PartDefinition cube_r105 = rightFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(80, 69).mirror().addBox(-0.51F, 0.3285F, -1.2677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9868F, 0.1926F, -1.5272F, -0.1047F, 0.0F));

		PartDefinition cube_r106 = rightFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(81, 40).mirror().addBox(-0.51F, 0.6303F, 0.4383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9868F, 0.1926F, -2.6965F, -0.1047F, 0.0F));

		PartDefinition cube_r107 = rightFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(51, 80).mirror().addBox(-0.51F, -1.4192F, -1.381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9868F, 0.1926F, 0.3054F, -0.1047F, 0.0F));

		PartDefinition cube_r108 = rightFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(-0.8F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(79, 55).mirror().addBox(-0.8F, -0.2F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7668F, -1.1989F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Chest = Eretmorhipis.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7539F, -0.1864F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r110 = Chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(81, 75).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4175F, 2.5003F, 0.1472F, 0.0125F, -0.5686F));

		PartDefinition cube_r111 = Chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(75, 53).mirror().addBox(-2.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4175F, 2.5003F, 0.134F, 0.0545F, -0.9593F));

		PartDefinition cube_r112 = Chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(66, 25).mirror().addBox(-5.4883F, -1.5823F, -0.4866F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4175F, 2.5003F, 0.0986F, 0.1059F, -1.3941F));

		PartDefinition cube_r113 = Chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(76, 46).mirror().addBox(-4.4883F, -1.5823F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5175F, 0.5003F, 0.1506F, 0.2561F, -1.4589F));

		PartDefinition cube_r114 = Chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(51, 76).mirror().addBox(-2.9239F, -0.3824F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5175F, 0.5003F, 0.2445F, 0.169F, -1.0211F));

		PartDefinition cube_r115 = Chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(81, 6).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5175F, 0.5003F, 0.2923F, 0.077F, -0.6363F));

		PartDefinition cube_r116 = Chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(51, 76).addBox(0.9239F, -0.3824F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5175F, 0.5003F, 0.2445F, -0.169F, 1.0211F));

		PartDefinition cube_r117 = Chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(81, 6).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5175F, 0.5003F, 0.2923F, -0.077F, 0.6363F));

		PartDefinition cube_r118 = Chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(76, 46).addBox(2.4883F, -1.5823F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5175F, 0.5003F, 0.1506F, -0.2561F, 1.4589F));

		PartDefinition cube_r119 = Chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(66, 25).addBox(2.4883F, -1.5823F, -0.4866F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4175F, 2.5003F, 0.0986F, -0.1059F, 1.3941F));

		PartDefinition cube_r120 = Chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(66, 0).addBox(-0.0533F, -0.9008F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.2F, 4.0835F, -3.4271F, -1.5708F, -0.9861F, 1.5708F));

		PartDefinition cube_r121 = Chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(65, 43).addBox(-1.2F, -0.9008F, 1.6467F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.2F, 4.0835F, -3.4271F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r122 = Chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(26, 53).addBox(-0.5F, -0.5814F, -3.7844F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(0.0F, -2.7653F, 3.4276F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r123 = Chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(75, 53).addBox(0.9239F, -0.3825F, -0.4866F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4175F, 2.5003F, 0.134F, -0.0545F, 0.9593F));

		PartDefinition cube_r124 = Chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(81, 75).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4175F, 2.5003F, 0.1472F, -0.0125F, 0.5686F));

		PartDefinition cube_r125 = Chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, 0.0F, -8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -0.2443F, 7.9957F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r126 = Chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(19, 80).addBox(0.0F, -2.7F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0663F, 2.8988F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r127 = Chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(80, 14).addBox(0.0F, -2.1F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition LArm = Chest.addOrReplaceChild("LArm", CubeListBuilder.create().texOffs(73, 14).addBox(1.0F, -1.0F, 0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9838F, 4.2944F, -1.0546F, 0.696F, -0.3069F, 0.322F));

		PartDefinition cube_r128 = LArm.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(41, 82).addBox(-1.3F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.5F, 0.9F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r129 = LArm.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(65, 59).addBox(-2.3F, -0.5F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.5F, 0.9F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r130 = LArm.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(44, 71).addBox(-0.1F, -1.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition LArm2 = LArm.addOrReplaceChild("LArm2", CubeListBuilder.create().texOffs(56, 45).addBox(0.3F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.7853F, -0.5F, 0.3441F, 0.0385F, -0.2148F, -0.1787F));

		PartDefinition cube_r131 = LArm2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(17, 22).addBox(1.5F, -0.5F, -0.79F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.5F, -0.5F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r132 = LArm2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(82, 51).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.1042F, 0.0F, 1.1087F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r133 = LArm2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(46, 82).addBox(1.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, 0.0F, 1.3F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r134 = LArm2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(73, 20).addBox(-1.3F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5F, 0.0F, 1.2F, 0.0F, -0.2618F, 0.0F));

		PartDefinition LArm3 = Chest.addOrReplaceChild("LArm3", CubeListBuilder.create().texOffs(73, 14).mirror().addBox(-3.0F, -1.0F, 0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9838F, 4.2944F, -1.0546F, 0.4208F, 0.641F, -0.9034F));

		PartDefinition cube_r135 = LArm3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(41, 82).mirror().addBox(0.3F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.5F, 0.9F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r136 = LArm3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(65, 59).mirror().addBox(-0.7F, -0.5F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.5F, 0.9F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r137 = LArm3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(44, 71).mirror().addBox(-0.9F, -1.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition LArm4 = LArm3.addOrReplaceChild("LArm4", CubeListBuilder.create().texOffs(56, 45).mirror().addBox(-3.3F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.7853F, -0.5F, 0.3441F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r138 = LArm4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(17, 22).mirror().addBox(-6.5F, -0.5F, -0.79F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.5F, -0.5F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r139 = LArm4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(82, 51).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.1042F, 0.0F, 1.1087F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r140 = LArm4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(46, 82).mirror().addBox(-2.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0F, 1.3F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r141 = LArm4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(73, 20).mirror().addBox(-0.7F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0F, 1.2F, 0.0F, 0.2618F, 0.0F));

		PartDefinition bone2 = Chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.0841F, -0.9291F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r142 = bone2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(77, 65).addBox(-0.4918F, -1.2872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1F, 0.1275F, -1.4846F, -1.5708F, -0.6196F, 1.8762F));

		PartDefinition cube_r143 = bone2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(66, 21).addBox(0.9594F, -0.9811F, 1.2257F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.3F, 1.9994F, -2.4981F, -0.6349F, -0.1339F, 0.098F));

		PartDefinition cube_r144 = bone2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(66, 8).addBox(0.5403F, -0.9811F, -0.2214F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.021F)), PartPose.offsetAndRotation(-0.3F, 1.9994F, -2.4981F, -0.6324F, 0.1058F, -0.0772F));

		PartDefinition cube_r145 = bone2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(76, 0).addBox(-0.7044F, 0.0581F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, 0.1275F, -1.4846F, -1.5708F, -1.1257F, 1.8762F));

		PartDefinition cube_r146 = bone2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(65, 62).addBox(-0.8F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(2.0F, 1.2261F, -0.8F, 1.1097F, 0.2762F, 0.502F));

		PartDefinition cube_r147 = bone2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(66, 4).addBox(-1.2F, -0.7567F, 0.1359F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(2.6F, 1.1F, -0.5F, 0.9512F, 0.0F, 0.0349F));

		PartDefinition cube_r148 = bone2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(55, 12).addBox(-1.2F, -0.7112F, -0.2232F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(2.6F, 1.1F, -0.5F, 0.5149F, 0.0F, 0.0349F));

		PartDefinition bone4 = Chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.0841F, -0.9291F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r149 = bone4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(77, 65).mirror().addBox(-0.5082F, -1.2872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1275F, -1.4846F, -1.5708F, 0.6196F, -1.8762F));

		PartDefinition cube_r150 = bone4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(66, 21).mirror().addBox(-1.9594F, -0.9811F, 1.2257F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(0.3F, 1.9994F, -2.4981F, -0.6349F, 0.1339F, -0.098F));

		PartDefinition cube_r151 = bone4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(66, 8).mirror().addBox(-1.5403F, -0.9811F, -0.2214F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.021F)).mirror(false), PartPose.offsetAndRotation(0.3F, 1.9994F, -2.4981F, -0.6324F, -0.1058F, 0.0772F));

		PartDefinition cube_r152 = bone4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.2956F, 0.0581F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1275F, -1.4846F, -1.5708F, 1.1257F, -1.8762F));

		PartDefinition cube_r153 = bone4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(65, 62).mirror().addBox(-0.2F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.2261F, -0.8F, 1.1097F, -0.2762F, -0.502F));

		PartDefinition cube_r154 = bone4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(0.2F, -0.7567F, 0.1359F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 1.1F, -0.5F, 0.9512F, 0.0F, -0.0349F));

		PartDefinition cube_r155 = bone4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(55, 12).mirror().addBox(0.2F, -0.7112F, -0.2232F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 1.1F, -0.5F, 0.5149F, 0.0F, -0.0349F));

		PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8347F, 3.9276F, -0.1051F, -0.0868F, 0.0091F));

		PartDefinition cube_r156 = Body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(21, 74).addBox(0.0F, -3.5F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0302F, 2.0012F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r157 = Body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(10, 75).addBox(0.0F, -3.0F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9953F, 1.0018F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r158 = Body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(31, 74).mirror().addBox(-1.5827F, -0.0206F, -0.496F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5382F, 2.5046F, 0.0428F, 0.0037F, -0.5236F));

		PartDefinition cube_r159 = Body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(73, 23).mirror().addBox(-3.4543F, -0.6243F, -0.4749F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5382F, 2.5046F, 0.0408F, 0.0064F, -0.9163F));

		PartDefinition cube_r160 = Body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(40, 18).mirror().addBox(-7.8668F, -2.0257F, -0.4749F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5382F, 2.5046F, 0.0343F, 0.0231F, -1.3523F));

		PartDefinition cube_r161 = Body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(75, 25).mirror().addBox(-1.583F, -0.0095F, -0.5034F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5382F, 0.5046F, 0.1048F, 0.0165F, -0.5559F));

		PartDefinition cube_r162 = Body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(76, 8).mirror().addBox(-3.4589F, -0.6142F, -0.4823F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5382F, 0.5046F, 0.0931F, 0.042F, -0.948F));

		PartDefinition cube_r163 = Body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(45, 65).mirror().addBox(-6.8753F, -2.0184F, -0.4823F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5382F, 0.5046F, 0.0667F, 0.0774F, -1.3837F));

		PartDefinition cube_r164 = Body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(31, 74).addBox(-0.4173F, -0.0206F, -0.496F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5382F, 2.5046F, 0.0428F, -0.0037F, 0.5236F));

		PartDefinition cube_r165 = Body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(73, 23).addBox(1.4543F, -0.6243F, -0.4749F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5382F, 2.5046F, 0.0408F, -0.0064F, 0.9163F));

		PartDefinition cube_r166 = Body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(40, 18).addBox(2.8668F, -2.0257F, -0.4749F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5382F, 2.5046F, 0.0343F, -0.0231F, 1.3523F));

		PartDefinition cube_r167 = Body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(75, 25).addBox(-0.417F, -0.0095F, -0.5034F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5382F, 0.5046F, 0.1048F, -0.0165F, 0.5559F));

		PartDefinition cube_r168 = Body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(76, 8).addBox(1.4589F, -0.6142F, -0.4823F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5382F, 0.5046F, 0.0931F, -0.042F, 0.948F));

		PartDefinition cube_r169 = Body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(45, 65).addBox(2.8753F, -2.0184F, -0.4823F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5382F, 0.5046F, 0.0667F, -0.0774F, 1.3837F));

		PartDefinition cube_r170 = Body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -0.4057F, -7.8788F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F))
				.texOffs(34, 27).addBox(-2.0F, 0.1684F, -7.7568F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 8.0251F, 4.0011F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r171 = Body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(40, 12).addBox(-1.5F, -1.3718F, -3.9853F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F))
				.texOffs(0, 29).addBox(-2.0F, -0.7764F, -3.9332F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 8.0251F, 4.0011F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(15, 41).addBox(-0.5F, -0.6588F, -0.0011F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -3.5112F, -0.8765F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -1.1F, 4.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(65, 74).addBox(0.0F, -4.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 12).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.5038F, 4.0245F, -0.0175F, -0.0873F, 0.0015F));

		PartDefinition cube_r174 = body3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(73, 73).addBox(0.0F, -4.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r175 = body3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(11, 55).mirror().addBox(-8.0494F, -2.3936F, -0.4843F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0344F, 2.4801F, 0.0476F, 0.0923F, -1.3874F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(78, 29).mirror().addBox(-3.7753F, -0.8806F, -0.4843F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0344F, 2.4801F, 0.0821F, 0.0636F, -0.9507F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(51, 78).mirror().addBox(-1.9771F, -0.1346F, -0.5103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0344F, 2.4801F, 0.1029F, 0.0407F, -0.5581F));

		PartDefinition cube_r178 = body3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(76, 12).mirror().addBox(-1.9752F, -0.138F, -0.4969F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0344F, 0.4801F, 0.0731F, 0.0215F, -0.5585F));

		PartDefinition cube_r179 = body3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(76, 10).mirror().addBox(-3.772F, -0.8829F, -0.4709F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0344F, 0.4801F, 0.062F, 0.0344F, -0.9511F));

		PartDefinition cube_r180 = body3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(53, 25).mirror().addBox(-8.0454F, -2.3943F, -0.4709F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0344F, 0.4801F, 0.0416F, 0.0574F, -1.3873F));

		PartDefinition cube_r181 = body3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(11, 55).addBox(3.0494F, -2.3936F, -0.4843F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0344F, 2.4801F, 0.0476F, -0.0923F, 1.3874F));

		PartDefinition cube_r182 = body3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(36, 82).addBox(-0.5F, 0.375F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -5.7305F, 2.4663F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r183 = body3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(38, 60).addBox(-0.5F, -0.525F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(0.0F, -4.2247F, -0.3145F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r184 = body3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(78, 29).addBox(1.7753F, -0.8806F, -0.4843F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0344F, 2.4801F, 0.0821F, -0.0636F, 0.9507F));

		PartDefinition cube_r185 = body3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(51, 78).addBox(-0.0229F, -0.1346F, -0.5103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0344F, 2.4801F, 0.1029F, -0.0407F, 0.5581F));

		PartDefinition cube_r186 = body3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(28, 41).addBox(-2.0F, -0.6873F, -7.5792F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.01F))
				.texOffs(36, 22).addBox(-2.5F, -0.0875F, -7.5896F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.3289F, 7.6766F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r187 = body3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(76, 12).addBox(-0.0248F, -0.138F, -0.4969F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0344F, 0.4801F, 0.0731F, -0.0215F, 0.5585F));

		PartDefinition cube_r188 = body3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(76, 10).addBox(1.772F, -0.8829F, -0.4709F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0344F, 0.4801F, 0.062F, -0.0344F, 0.9511F));

		PartDefinition cube_r189 = body3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(53, 25).addBox(3.0454F, -2.3943F, -0.4709F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0344F, 0.4801F, 0.0416F, -0.0574F, 1.3873F));

		PartDefinition Body2 = body3.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(54, 48).addBox(-0.5F, -0.2003F, 3.0314F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.2989F, -0.5981F, 0.0052F, -0.0526F, -0.0871F, 0.0046F));

		PartDefinition cube_r190 = Body2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(73, 7).addBox(0.0F, -4.1F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2003F, 6.0314F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r191 = Body2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(73, 0).addBox(0.0F, -4.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2003F, 4.0314F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r192 = Body2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(65, 47).mirror().addBox(-6.956F, -2.0062F, -0.5052F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1653F, 6.5115F, 0.0577F, 0.1072F, -1.4034F));

		PartDefinition cube_r193 = Body2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(58, 74).mirror().addBox(-3.527F, -0.569F, -0.5052F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1653F, 6.5115F, 0.0977F, 0.0728F, -0.9666F));

		PartDefinition cube_r194 = Body2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(74, 59).mirror().addBox(-1.6283F, 0.0582F, -0.5271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1653F, 6.5115F, 0.1207F, 0.0433F, -0.5744F));

		PartDefinition cube_r195 = Body2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(40, 20).mirror().addBox(-8.1322F, -2.3728F, -0.4988F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1653F, 4.5115F, 0.057F, 0.1078F, -1.4039F));

		PartDefinition cube_r196 = Body2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(74, 42).mirror().addBox(-3.8415F, -0.8267F, -0.4988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1653F, 4.5115F, 0.0972F, 0.0736F, -0.967F));

		PartDefinition cube_r197 = Body2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(74, 44).mirror().addBox(-2.0176F, -0.0595F, -0.5256F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1653F, 4.5115F, 0.1206F, 0.0442F, -0.5747F));

		PartDefinition cube_r198 = Body2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(65, 47).addBox(2.956F, -2.0062F, -0.5052F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1653F, 6.5115F, 0.0577F, -0.1072F, 1.4034F));

		PartDefinition cube_r199 = Body2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(58, 74).addBox(1.5269F, -0.569F, -0.5052F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1653F, 6.5115F, 0.0977F, -0.0728F, 0.9666F));

		PartDefinition cube_r200 = Body2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(74, 59).addBox(-0.3717F, 0.0582F, -0.5271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1653F, 6.5115F, 0.1207F, -0.0433F, 0.5744F));

		PartDefinition cube_r201 = Body2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(40, 20).addBox(3.1322F, -2.3728F, -0.4988F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1653F, 4.5115F, 0.057F, -0.1078F, 1.4039F));

		PartDefinition cube_r202 = Body2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(74, 42).addBox(1.8415F, -0.8267F, -0.4988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1653F, 4.5115F, 0.0972F, -0.0736F, 0.967F));

		PartDefinition cube_r203 = Body2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(74, 44).addBox(0.0176F, -0.0595F, -0.5256F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1653F, 4.5115F, 0.1206F, -0.0442F, 0.5747F));

		PartDefinition cube_r204 = Body2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 35).addBox(-2.0F, -1.3658F, -4.0945F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.01F))
				.texOffs(21, 16).addBox(-2.5F, -0.7674F, -4.1259F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.9284F, 7.6975F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r205 = Body2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(9, 67).addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -5.0122F, 5.1755F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r206 = Body2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(45, 67).addBox(-0.5F, 0.375F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(0.0F, -5.306F, 2.2122F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tail = Body2.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(41, 48).addBox(-0.5F, -0.2334F, 0.0689F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0003F, 6.9314F, -0.1051F, -0.0868F, 0.0091F));

		PartDefinition cube_r207 = Tail.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(72, 49).addBox(0.0F, -4.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2334F, 3.0689F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r208 = Tail.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(0, 78).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2334F, 1.0689F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r209 = Tail.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(0, 22).addBox(-1.5F, -1.7283F, -7.0048F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-2.0F, -1.1348F, -7.0671F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4731F, 8.1803F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r210 = Tail.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(32, 33).addBox(-0.5F, -0.05F, -1.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6105F, 5.946F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r211 = Tail.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(47, 33).addBox(-0.5F, -0.05F, -6.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(0.0F, -4.6105F, 5.946F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r212 = Tail.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(74, 38).mirror().addBox(-4.4518F, -1.5887F, -0.2957F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 3.3801F, 0.0901F, 0.1796F, -1.4856F));

		PartDefinition cube_r213 = Tail.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(24, 74).mirror().addBox(-2.8935F, -0.4036F, -0.2957F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 3.3801F, 0.1576F, 0.1248F, -1.0475F));

		PartDefinition cube_r214 = Tail.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(20, 57).mirror().addBox(-0.9826F, -0.0307F, -0.3087F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 3.3801F, 0.1958F, 0.0685F, -0.6569F));

		PartDefinition cube_r215 = Tail.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(69, 36).mirror().addBox(-5.891F, -2.0192F, -0.4002F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 1.4801F, 0.0875F, 0.1894F, -1.4165F));

		PartDefinition cube_r216 = Tail.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(76, 77).mirror().addBox(-3.4735F, -0.6083F, -0.4002F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 1.4801F, 0.1595F, 0.1348F, -0.9777F));

		PartDefinition cube_r217 = Tail.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(78, 27).mirror().addBox(-1.5953F, 0.0018F, -0.4215F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3656F, 1.4801F, 0.2013F, 0.0771F, -0.587F));

		PartDefinition cube_r218 = Tail.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(74, 38).addBox(2.4518F, -1.5887F, -0.2957F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 3.3801F, 0.0901F, -0.1796F, 1.4856F));

		PartDefinition cube_r219 = Tail.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(24, 74).addBox(0.8935F, -0.4036F, -0.2957F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 3.3801F, 0.1576F, -0.1248F, 1.0475F));

		PartDefinition cube_r220 = Tail.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(20, 57).addBox(-0.0174F, -0.0307F, -0.3087F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 3.3801F, 0.1958F, -0.0685F, 0.6569F));

		PartDefinition cube_r221 = Tail.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(69, 36).addBox(2.891F, -2.0192F, -0.4002F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 1.4801F, 0.0875F, -0.1894F, 1.4165F));

		PartDefinition cube_r222 = Tail.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(76, 77).addBox(1.4735F, -0.6083F, -0.4002F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 1.4801F, 0.1595F, -0.1348F, 0.9777F));

		PartDefinition cube_r223 = Tail.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(78, 27).addBox(-0.4047F, 0.0018F, -0.4215F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 1.4801F, 0.2013F, -0.0771F, 0.587F));

		PartDefinition body4 = Tail.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(54, 54).addBox(-1.0F, -0.599F, -0.3112F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 5.3801F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r224 = body4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(78, 35).mirror().addBox(-2.794F, -0.497F, -0.357F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 2.1F, 0.0644F, 0.0322F, -1.2125F));

		PartDefinition cube_r225 = body4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(83, 22).mirror().addBox(-0.9255F, -0.1552F, -0.369F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 2.1F, 0.0745F, 0.0532F, -0.8173F));

		PartDefinition cube_r226 = body4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(83, 8).mirror().addBox(-3.5396F, -1.561F, -0.2954F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.093F, 0.206F, -1.6249F));

		PartDefinition cube_r227 = body4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(51, 74).mirror().addBox(-2.9613F, -0.3414F, -0.2954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.1715F, 0.1475F, -1.1854F));

		PartDefinition cube_r228 = body4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(79, 82).mirror().addBox(-1.0215F, 0.0527F, -0.3091F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.2172F, 0.0844F, -0.7951F));

		PartDefinition cube_r229 = body4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(83, 8).addBox(2.5396F, -1.561F, -0.2954F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.093F, -0.206F, 1.6249F));

		PartDefinition cube_r230 = body4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(68, 78).addBox(0.0F, -3.9F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.599F, 1.6888F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r231 = body4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(48, 75).addBox(0.0F, -3.9F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.599F, -0.3112F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r232 = body4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(40, 0).addBox(-1.5F, -2.1411F, -1.8555F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F))
				.texOffs(17, 27).addBox(-2.0F, -1.5659F, -1.9751F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.1076F, 2.8002F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r233 = body4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(78, 35).addBox(0.794F, -0.497F, -0.357F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.1F, 0.0644F, -0.0322F, 1.2125F));

		PartDefinition cube_r234 = body4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(83, 22).addBox(-0.0745F, -0.1552F, -0.369F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.1F, 0.0745F, -0.0532F, 0.8173F));

		PartDefinition cube_r235 = body4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(51, 74).addBox(0.9613F, -0.3414F, -0.2954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1715F, -0.1475F, 1.1854F));

		PartDefinition cube_r236 = body4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(79, 82).addBox(0.0215F, 0.0527F, -0.3091F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2172F, -0.0844F, 0.7951F));

		PartDefinition Tail2 = body4.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(13, 48).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.3729F, 3.6876F, 0.1227F, -0.1468F, 0.1127F));

		PartDefinition cube_r237 = Tail2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(16, 76).addBox(0.0F, -3.1F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 4.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r238 = Tail2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(34, 76).addBox(0.0F, -3.4F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 2.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r239 = Tail2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(13, 76).mirror().addBox(-0.3F, -1.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.0F, -0.1745F, -1.5708F));

		PartDefinition cube_r240 = Tail2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(13, 76).mirror().addBox(0.375F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 76).mirror().addBox(0.375F, -0.3F, 1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6296F, 2.3099F, 0.0F, 0.0436F, -1.5708F));

		PartDefinition cube_r241 = Tail2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(13, 76).addBox(-0.375F, -0.3F, 1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 76).addBox(-0.375F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6296F, 2.3099F, 0.0F, -0.0436F, 1.5708F));

		PartDefinition cube_r242 = Tail2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(13, 76).addBox(0.3F, -1.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.0F, 0.1745F, 1.5708F));

		PartDefinition cube_r243 = Tail2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(13, 76).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r244 = Tail2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(56, 65).addBox(0.0F, -1.0868F, -0.4009F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, 3.4F, -0.7418F, 0.0F, 0.0F));

		PartDefinition LLeg = Tail2.addOrReplaceChild("LLeg", CubeListBuilder.create().texOffs(14, 73).addBox(-0.3331F, -0.5738F, -0.5494F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8831F, 1.454F, 1.2375F, -0.0187F, -0.6595F, 0.9422F));

		PartDefinition LLeg2 = LLeg.addOrReplaceChild("LLeg2", CubeListBuilder.create().texOffs(81, 31).addBox(0.3767F, 0.0F, -0.7195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(81, 37).addBox(0.3767F, 0.0F, -1.6195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(38, 7).addBox(1.2F, 0.5F, -2.3F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6377F, -0.5738F, 0.2126F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r245 = LLeg2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(8, 81).addBox(-0.7F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(73, 17).addBox(-2.5F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.8F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r246 = LLeg2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(73, 70).addBox(-0.4F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition LLeg3 = Tail2.addOrReplaceChild("LLeg3", CubeListBuilder.create().texOffs(14, 73).mirror().addBox(-1.6669F, -0.5738F, -0.5494F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8831F, 1.454F, 1.2375F, 0.2437F, 1.1256F, -0.6551F));

		PartDefinition LLeg4 = LLeg3.addOrReplaceChild("LLeg4", CubeListBuilder.create().texOffs(81, 31).mirror().addBox(-1.3767F, 0.0F, -0.7195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(81, 37).mirror().addBox(-1.3767F, 0.0F, -1.6195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(38, 7).mirror().addBox(-5.2F, 0.5F, -2.3F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6377F, -0.5738F, 0.2126F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r247 = LLeg4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(8, 81).mirror().addBox(-0.3F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(73, 17).mirror().addBox(0.5F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.8F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r248 = LLeg4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(73, 70).mirror().addBox(-1.6F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition bone = Tail2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.6F, 0.7087F, 0.8042F));

		PartDefinition cube_r249 = bone.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(7, 71).addBox(-0.7F, -0.9504F, 0.3769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, 0.8205F, -0.1F, -0.4454F, -0.0394F, 1.066F));

		PartDefinition cube_r250 = bone.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(36, 65).addBox(-0.7F, -1.0503F, -1.0231F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.8205F, -0.1F, -2.138F, 0.0F, 1.0472F));

		PartDefinition cube_r251 = bone.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(71, 27).addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1012F, 0.0594F, -0.3442F));

		PartDefinition bone3 = Tail2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.6F, 0.7087F, 0.8042F));

		PartDefinition cube_r252 = bone3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(7, 71).mirror().addBox(-0.3F, -0.9504F, 0.3769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.8205F, -0.1F, -0.4454F, 0.0394F, -1.066F));

		PartDefinition cube_r253 = bone3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(36, 65).mirror().addBox(-0.3F, -1.0503F, -1.0231F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.8205F, -0.1F, -2.138F, 0.0F, -1.0472F));

		PartDefinition cube_r254 = bone3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(71, 27).mirror().addBox(-0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1012F, -0.0594F, 0.3442F));

		PartDefinition tail6 = Tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(55, 6).addBox(-0.5F, -0.5488F, 0.0531F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.3488F, 4.8469F, 0.0715F, -0.2176F, -0.0155F));

		PartDefinition cube_r255 = tail6.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(65, 54).addBox(0.0F, 0.4254F, -2.0884F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8152F, 3.2893F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r256 = tail6.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(46, 55).addBox(0.0F, -1.0746F, -0.0884F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5941F, 3.0866F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r257 = tail6.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(82, 64).mirror().addBox(-0.5F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 64).mirror().addBox(-0.5F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5488F, 1.0531F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r258 = tail6.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(82, 64).addBox(0.5F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 64).addBox(0.5F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5488F, 1.0531F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r259 = tail6.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(82, 64).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5488F, 1.0531F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r260 = tail6.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(80, 19).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5488F, 3.0531F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Tail3 = tail6.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(17, 33).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.429F, 3.9999F, -0.0183F, -0.3054F, 0.0055F));

		PartDefinition cube_r261 = Tail3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(28, 80).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9145F, 4.9761F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r262 = Tail3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(25, 80).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9073F, 2.888F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r263 = Tail3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(22, 80).addBox(0.0F, -2.8F, 0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.8F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r264 = Tail3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(75, 49).addBox(0.0F, -2.1F, 1.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(5, 75).addBox(0.0F, -0.8F, 0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3776F, 3.0523F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r265 = Tail3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(65, 49).addBox(0.0F, -0.9F, -0.4F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0851F, 1.1043F, -0.7418F, 0.0F, 0.0F));

		PartDefinition tail7 = Tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(21, 7).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.5304F, 5.8277F, -0.1387F, 0.1618F, -0.1092F));

		PartDefinition cube_r266 = tail7.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(83, 14).addBox(0.0F, -4.45F, 9.525F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 83).addBox(0.0F, -3.75F, 5.725F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 10).addBox(0.0F, -4.05F, 7.625F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -5.0F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r267 = tail7.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(37, 78).addBox(0.0F, -0.9F, -0.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5402F, 5.144F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r268 = tail7.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(38, 74).addBox(0.0F, -0.9F, -0.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4415F, 3.0654F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r269 = tail7.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(24, 76).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5116F, 1.0944F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Tail4 = tail7.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -0.0052F, 6.7999F, -0.0356F, 0.215F, -0.0949F));

		PartDefinition cube_r270 = Tail4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(63, 83).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4511F, 8.5207F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r271 = Tail4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(60, 83).addBox(0.0F, -1.7F, -0.175F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0651F, 6.0194F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r272 = Tail4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(54, 83).addBox(0.0F, -1.3F, -0.675F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4156F, 4.664F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r273 = Tail4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(51, 83).addBox(0.0F, -1.4F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4578F, 2.332F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r274 = Tail4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(83, 18).addBox(0.0F, -1.425F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r275 = Tail4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(3, 85).addBox(0.0F, -6.5F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 83).addBox(0.0F, -4.7F, 1.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 67).addBox(0.0F, -3.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7011F, 1.9077F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r276 = Tail4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(43, 75).addBox(0.0F, -1.0F, -0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6087F, 2.0851F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r277 = Tail4.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(0, 74).addBox(0.0F, -1.1F, -0.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5067F, 0.1154F, -0.7767F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -0.0412F, 9.0249F, 0.054F, 0.3576F, -0.1042F));

		PartDefinition cube_r278 = Tail5.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(82, 84).addBox(0.0F, -0.85F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 84).addBox(0.0F, -0.85F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 84).addBox(0.0F, -0.85F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r279 = Tail5.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(14, 85).addBox(0.0F, -9.9F, 3.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 85).addBox(0.0F, -8.1F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7423F, -7.1172F, -1.0908F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 88, 88);
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