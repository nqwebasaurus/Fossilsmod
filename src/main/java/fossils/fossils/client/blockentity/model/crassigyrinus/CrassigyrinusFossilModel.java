package fossils.fossils.client.blockentity.model.crassigyrinus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CrassigyrinusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart upperjaw;
	private final ModelPart lowerjaw;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart tail4;
	private final ModelPart tail;
	private final ModelPart tail5;
	private final ModelPart tail2;
	private final ModelPart tail6;
	private final ModelPart tail3;
	private final ModelPart tail7;

	public CrassigyrinusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.chest = this.body.getChild("chest");
		this.armL3 = this.chest.getChild("armL3");
		this.armL4 = this.armL3.getChild("armL4");
		this.armL = this.chest.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.neck = this.chest.getChild("neck");
		this.head = this.neck.getChild("head");
		this.upperjaw = this.head.getChild("upperjaw");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.legL = this.body3.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.legL3 = this.legL2.getChild("legL3");
		this.legL4 = this.body3.getChild("legL4");
		this.legL5 = this.legL4.getChild("legL5");
		this.legL6 = this.legL5.getChild("legL6");
		this.tail4 = this.body3.getChild("tail4");
		this.tail = this.tail4.getChild("tail");
		this.tail5 = this.tail.getChild("tail5");
		this.tail2 = this.tail5.getChild("tail2");
		this.tail6 = this.tail2.getChild("tail6");
		this.tail3 = this.tail6.getChild("tail3");
		this.tail7 = this.tail3.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(31, 70).addBox(0.0F, -1.5311F, -3.8837F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 70).addBox(0.0F, -1.5311F, -1.8837F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 0).addBox(0.0F, -1.6311F, 0.1163F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, -0.2185F, 0.0987F, -0.1226F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 12).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.95F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(28, 70).addBox(0.0F, -1.2F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -12.85F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(69, 32).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4287F, 0.3752F, 0.0674F, 0.2457F, -0.1332F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(62, 48).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4287F, 0.3752F, -0.0598F, 0.2727F, -0.6202F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(63, 26).mirror().addBox(-4.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4287F, 0.3752F, -0.1932F, 0.2026F, -1.1728F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 54).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4287F, -1.6247F, 0.0674F, 0.2457F, -0.107F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(62, 46).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4287F, -1.6247F, -0.0598F, 0.2727F, -0.5941F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(63, 24).mirror().addBox(-4.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4287F, -1.6247F, -0.1932F, 0.2026F, -1.1466F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(68, 52).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4287F, -3.6248F, 0.0674F, 0.2457F, -0.107F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(62, 44).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4287F, -3.6248F, -0.0598F, 0.2727F, -0.5941F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(24, 63).mirror().addBox(-4.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4287F, -3.6248F, -0.1932F, 0.2026F, -1.1466F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(68, 30).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4287F, -5.6247F, 0.0674F, 0.2457F, -0.1768F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(62, 42).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4287F, -5.6247F, -0.0598F, 0.2727F, -0.6639F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(17, 63).mirror().addBox(-4.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4287F, -5.6247F, -0.1932F, 0.2026F, -1.2164F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(63, 26).addBox(2.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4287F, 0.3752F, -0.2344F, -0.2193F, 1.1814F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(62, 48).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4287F, 0.3752F, -0.0864F, -0.3081F, 0.6279F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(69, 32).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4287F, 0.3752F, 0.0613F, -0.2889F, 0.1348F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(63, 24).addBox(2.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4287F, -1.6247F, -0.1932F, -0.2026F, 1.1466F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(62, 46).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4287F, -1.6247F, -0.0598F, -0.2727F, 0.5941F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(68, 54).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4287F, -1.6247F, 0.0674F, -0.2457F, 0.107F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(24, 63).addBox(2.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4287F, -3.6248F, -0.1932F, -0.2026F, 1.1466F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(62, 44).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4287F, -3.6248F, -0.0598F, -0.2727F, 0.5941F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(68, 52).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4287F, -3.6248F, 0.0674F, -0.2457F, 0.107F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(17, 63).addBox(2.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4287F, -5.6247F, -0.1932F, -0.2026F, 1.2164F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(62, 42).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4287F, -5.6247F, -0.0598F, -0.2727F, 0.6639F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(68, 30).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4287F, -5.6247F, 0.0674F, -0.2457F, 0.1768F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0333F, -0.3232F, -6.892F, -0.0383F, -0.2525F, -0.0856F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(60, 4).mirror().addBox(-0.9346F, -0.9941F, -1.4476F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.1F, -5.8F, -0.3579F, 0.6418F, 0.0017F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(53, 49).mirror().addBox(-1.8916F, -0.9941F, -0.5242F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.1F, -5.8F, -0.2845F, 0.0182F, 0.2166F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(60, 4).addBox(-1.0654F, -0.9941F, -1.4476F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5665F, 4.1F, -5.8F, -0.3579F, -0.6418F, -0.0017F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(22, 44).addBox(-1.1833F, -0.4526F, -2.3858F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 3.575F, -5.8F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(53, 49).addBox(-0.1084F, -0.9941F, -0.5242F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5665F, 4.1F, -5.8F, -0.2845F, -0.0182F, -0.2166F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(16, 55).addBox(-1.3878F, -3.5439F, -0.5824F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7535F, 3.1135F, -6.2471F, -0.7115F, 0.0175F, -0.2179F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 56).addBox(-1.3878F, -3.6966F, -0.6827F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7535F, 3.1135F, -6.2471F, -0.4497F, 0.0175F, -0.2179F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(16, 55).mirror().addBox(0.3878F, -3.5439F, -0.5824F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6869F, 3.1135F, -6.2471F, -0.7115F, -0.0175F, 0.2179F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(0.3878F, -3.6966F, -0.6827F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6869F, 3.1135F, -6.2471F, -0.4497F, -0.0175F, 0.2179F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(69, 44).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2667F, 0.1945F, -4.7328F, 0.0674F, 0.2457F, -0.491F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(69, 44).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3333F, 0.1945F, -4.7328F, 0.0674F, -0.2457F, 0.491F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(17, 68).mirror().addBox(-3.4599F, -1.9617F, -1.2416F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.2863F, 0.1804F, -1.337F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(53, 4).mirror().addBox(-2.7281F, -0.1854F, -3.1988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.0881F, 0.2386F, -0.8979F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(65, 22).mirror().addBox(-0.797F, 0.1803F, -3.1797F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, 0.0262F, 0.2283F, -0.4134F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(68, 28).mirror().addBox(-1.2025F, 0.142F, -1.2124F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.0007F, 0.3132F, -0.2984F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(42, 62).mirror().addBox(-3.1189F, -0.4146F, -1.2416F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.1532F, 0.3014F, -0.7932F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(17, 68).addBox(2.4599F, -1.9617F, -1.2416F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.2003F, -0.1595F, 1.3224F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(42, 62).addBox(1.1188F, -0.4146F, -1.2416F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.0893F, -0.2396F, 0.776F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(68, 28).addBox(0.2025F, 0.142F, -1.2124F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, 0.0256F, -0.2297F, 0.2914F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(53, 4).addBox(0.7281F, -0.1854F, -3.1988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.0881F, -0.2386F, 0.8979F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(65, 22).addBox(-0.2031F, 0.1803F, -3.1797F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, 0.0262F, -0.2283F, 0.4134F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(70, 20).addBox(0.0F, -0.5098F, -5.0208F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 23).addBox(0.0F, -0.6098F, -3.0208F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 70).addBox(0.0F, -0.7098F, -1.0208F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(-0.5F, -0.0098F, -6.0208F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.0087F, 0.0F, 0.0F));

		PartDefinition armL3 = chest.addOrReplaceChild("armL3", CubeListBuilder.create().texOffs(27, 22).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.088F, 3.3662F, -5.7077F, -0.3491F, -0.6545F, 0.0F));

		PartDefinition armL4 = armL3.addOrReplaceChild("armL4", CubeListBuilder.create().texOffs(34, 21).mirror().addBox(0.0F, -0.5F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition armL = chest.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(27, 50).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1546F, 3.3662F, -5.7077F, -0.3491F, 0.6545F, 0.0F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create().texOffs(73, 27).addBox(0.0F, -0.5F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0333F, 0.0232F, -5.958F, -0.3249F, -0.295F, -0.0667F));

		PartDefinition cube_r49 = neck.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(50, 70).addBox(0.0F, -0.3098F, -7.0208F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 6.0F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r50 = neck.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(44, 49).addBox(-0.5F, 0.7306F, -8.8332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 6.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3496F, -2.766F, 0.0041F, 0.0F, 0.0F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, 1.9F));

		PartDefinition cube_r51 = upperjaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(60, 7).addBox(-1.0F, -0.0421F, -0.947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, -7.0F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r52 = upperjaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(23, 8).addBox(-2.0F, -0.5F, -0.2F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.1178F, -4.3099F, 0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r53 = upperjaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(47, 34).addBox(-2.0F, -0.6F, -1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.0165F, -4.2112F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r54 = upperjaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(38, 0).addBox(-2.0F, -1.97F, 0.0128F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.0722F, -4.8216F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r55 = upperjaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(67, 6).mirror().addBox(-1.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4132F, -1.6967F, 0.0237F, 0.7416F, 0.016F));

		PartDefinition cube_r56 = upperjaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(58, 20).mirror().addBox(-0.0282F, -0.9156F, -1.8759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -1.9778F, -5.6966F, -0.1031F, -0.1934F, 0.6461F));

		PartDefinition cube_r57 = upperjaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(20, 65).mirror().addBox(0.0155F, 0.0229F, -1.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.7707F, -2.6532F, -8.0737F, 0.1395F, -0.359F, 0.7384F));

		PartDefinition cube_r58 = upperjaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(65, 13).mirror().addBox(0.0155F, 0.0229F, -0.6104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.8995F, -2.6729F, -7.488F, -0.1164F, -0.1857F, 0.7168F));

		PartDefinition cube_r59 = upperjaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(65, 19).mirror().addBox(-0.0282F, -0.0156F, -0.9759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.9675F, -2.6407F, -7.4604F, 0.0525F, -0.291F, 0.6493F));

		PartDefinition cube_r60 = upperjaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(11, 44).mirror().addBox(-0.1F, -0.0023F, 0.2605F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(11, 44).addBox(1.1F, -0.0023F, 0.2605F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -1.6413F, -11.2223F, 0.3447F, 0.0F, 0.0F));

		PartDefinition cube_r61 = upperjaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(10, 65).mirror().addBox(-0.1F, 0.0906F, -0.4873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(10, 65).addBox(1.1F, 0.0906F, -0.4873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.0F, -1.6413F, -11.2223F, 0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r62 = upperjaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(65, 10).mirror().addBox(-0.475F, -0.275F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5628F, -1.3407F, -9.864F, 0.3772F, -0.2171F, 0.0222F));

		PartDefinition cube_r63 = upperjaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(39, 38).mirror().addBox(-0.0782F, -0.0156F, -3.8759F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -1.9778F, -5.6966F, 0.0281F, -0.2171F, 0.0222F));

		PartDefinition cube_r64 = upperjaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(38, 13).mirror().addBox(-0.1F, -1.018F, -4.8871F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0222F, -5.7966F, -0.0591F, -0.2171F, 0.0222F));

		PartDefinition cube_r65 = upperjaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(55, 64).mirror().addBox(0.05F, -0.5F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.9769F, -0.8172F, -11.6048F, -0.285F, 0.4688F, -0.1405F));

		PartDefinition cube_r66 = upperjaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(28, 55).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -0.298F, -9.4929F, -0.19F, -0.2171F, 0.0222F));

		PartDefinition cube_r67 = upperjaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(47, 29).mirror().addBox(-0.5F, -0.7F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0991F, 0.0703F, -7.575F, -0.0155F, -0.2171F, 0.0222F));

		PartDefinition cube_r68 = upperjaw.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.8F, -1.0F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0625F, 0.1121F, -9.9569F, 0.0281F, -0.2171F, 0.0222F));

		PartDefinition cube_r69 = upperjaw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-0.7F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7491F, 0.0068F, -6.8332F, 0.1154F, -0.2171F, 0.0222F));

		PartDefinition cube_r70 = upperjaw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(65, 19).addBox(-0.9718F, -0.0156F, -0.9759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9675F, -2.6407F, -7.4604F, 0.0525F, 0.291F, -0.6493F));

		PartDefinition cube_r71 = upperjaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(58, 20).addBox(-0.9718F, -0.9156F, -1.8759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.9F, -1.9778F, -5.6966F, -0.1031F, 0.1934F, -0.6461F));

		PartDefinition cube_r72 = upperjaw.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(65, 10).addBox(-0.525F, -0.275F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5628F, -1.3407F, -9.864F, 0.3772F, 0.2171F, -0.0222F));

		PartDefinition cube_r73 = upperjaw.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(20, 65).addBox(-1.0155F, 0.0229F, -1.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7707F, -2.6532F, -8.0737F, 0.1395F, 0.359F, -0.7384F));

		PartDefinition cube_r74 = upperjaw.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(65, 13).addBox(-1.0155F, 0.0229F, -0.6104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8995F, -2.6729F, -7.488F, -0.1164F, 0.1857F, -0.7168F));

		PartDefinition cube_r75 = upperjaw.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(39, 38).addBox(-0.9218F, -0.0156F, -3.8759F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.9F, -1.9778F, -5.6966F, 0.0281F, 0.2171F, -0.0222F));

		PartDefinition cube_r76 = upperjaw.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(47, 29).addBox(-0.5F, -0.7F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0991F, 0.0703F, -7.575F, -0.0155F, 0.2171F, -0.0222F));

		PartDefinition cube_r77 = upperjaw.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(28, 55).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6679F, -0.298F, -9.4929F, -0.19F, 0.2171F, -0.0222F));

		PartDefinition cube_r78 = upperjaw.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(62, 0).addBox(-0.3F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7491F, 0.0068F, -6.8332F, 0.1154F, 0.2171F, -0.0222F));

		PartDefinition cube_r79 = upperjaw.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 62).addBox(-0.2F, -1.0F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0625F, 0.1121F, -9.9569F, 0.0281F, 0.2171F, -0.0222F));

		PartDefinition cube_r80 = upperjaw.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(31, 63).mirror().addBox(-1.2F, -1.2F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0625F, 0.1121F, -9.9569F, -0.1464F, -0.2171F, 0.0222F));

		PartDefinition cube_r81 = upperjaw.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(31, 63).addBox(0.2F, -1.2F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0625F, 0.1121F, -9.9569F, -0.1464F, 0.2171F, -0.0222F));

		PartDefinition cube_r82 = upperjaw.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(38, 13).addBox(-0.9F, -1.018F, -4.8871F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.0222F, -5.7966F, -0.0591F, 0.2171F, -0.0222F));

		PartDefinition cube_r83 = upperjaw.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(47, 20).addBox(-2.0F, -2.018F, 0.0129F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0222F, -5.7966F, -0.1004F, 0.0F, 0.0F));

		PartDefinition cube_r84 = upperjaw.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(53, 0).addBox(-1.0F, -2.0071F, -1.5871F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(44, 44).addBox(-1.5F, -2.0071F, 1.0129F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(56, 24).addBox(-1.0F, -2.0071F, 0.0129F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0222F, -8.2966F, 0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r85 = upperjaw.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(51, 16).addBox(-1.0F, -0.959F, -0.0799F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.3278F, -10.1466F, -0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r86 = upperjaw.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(55, 46).addBox(-1.0F, -1.0525F, -0.7445F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2278F, -10.1466F, 0.144F, 0.0F, 0.0F));

		PartDefinition cube_r87 = upperjaw.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(59, 39).addBox(-1.0F, -0.3F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(15, 65).addBox(-0.6F, -0.525F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(59, 36).addBox(-1.0F, -0.5F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, -0.8278F, -11.6466F, -0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r88 = upperjaw.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(65, 16).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.1F, -0.6555F, -10.4335F, 0.1004F, 0.0F, 0.0F));

		PartDefinition cube_r89 = upperjaw.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(55, 64).addBox(-1.05F, -0.5F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9769F, -0.8172F, -11.6048F, -0.285F, -0.4688F, 0.1405F));

		PartDefinition cube_r90 = upperjaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(18, 50).addBox(-1.0F, -0.0061F, -2.0044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -2.425F, -8.825F, 0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r91 = upperjaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(16, 38).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -2.9593F, -5.9927F, -0.0723F, -0.2611F, 0.0187F));

		PartDefinition cube_r92 = upperjaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(42, 58).mirror().addBox(-0.1131F, 1.1884F, 1.7786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.85F, -2.2F, 0.177F, -0.0572F, 0.2394F));

		PartDefinition cube_r93 = upperjaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(56, 28).mirror().addBox(-0.1131F, -1.064F, 1.8669F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.85F, -2.2F, -0.3902F, -0.0572F, 0.2394F));

		PartDefinition cube_r94 = upperjaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(21, 55).mirror().addBox(-0.1131F, -0.5363F, 0.0736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.85F, -2.2F, -0.1284F, -0.0572F, 0.2394F));

		PartDefinition cube_r95 = upperjaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(53, 53).mirror().addBox(-0.1131F, -0.0663F, 0.0668F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.85F, -2.2F, 0.0374F, -0.0572F, 0.2394F));

		PartDefinition cube_r96 = upperjaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(0.2774F, 0.2438F, -0.2782F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -2.75F, -4.2F, -0.2723F, -0.3111F, 0.2581F));

		PartDefinition cube_r97 = upperjaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(43, 54).mirror().addBox(0.2774F, -0.0085F, 0.2887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -2.75F, -4.2F, -0.2199F, -0.3111F, 0.2581F));

		PartDefinition cube_r98 = upperjaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(47, 24).mirror().addBox(-0.052F, -0.095F, -0.1045F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -2.75F, -5.4F, -0.1521F, -0.2087F, 0.3553F));

		PartDefinition cube_r99 = upperjaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(21, 55).addBox(-0.8869F, -0.5363F, 0.0736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -1.85F, -2.2F, -0.1284F, 0.0572F, -0.2394F));

		PartDefinition cube_r100 = upperjaw.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(43, 54).addBox(-1.2774F, -0.0085F, 0.2887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0F, -2.75F, -4.2F, -0.2199F, 0.3111F, -0.2581F));

		PartDefinition cube_r101 = upperjaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(56, 28).addBox(-0.8869F, -1.064F, 1.8669F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.5F, -1.85F, -2.2F, -0.3902F, 0.0572F, -0.2394F));

		PartDefinition cube_r102 = upperjaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(42, 58).addBox(-0.8869F, 1.1884F, 1.7786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -1.85F, -2.2F, 0.177F, 0.0572F, -0.2394F));

		PartDefinition cube_r103 = upperjaw.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(53, 53).addBox(-0.8869F, -0.0663F, 0.0668F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5F, -1.85F, -2.2F, 0.0374F, 0.0572F, -0.2394F));

		PartDefinition cube_r104 = upperjaw.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 45).addBox(-1.2774F, 0.2438F, -0.2782F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.75F, -4.2F, -0.2723F, 0.3111F, -0.2581F));

		PartDefinition cube_r105 = upperjaw.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(36, 50).addBox(-1.0F, -0.0098F, -1.9934F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, -2.95F, -6.0F, 0.165F, 0.3422F, 0.0522F));

		PartDefinition cube_r106 = upperjaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(58, 32).addBox(-1.5F, -0.0098F, -0.9934F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -2.95F, -6.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r107 = upperjaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(31, 67).addBox(-1.0F, -0.0545F, -0.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.85F, -2.2F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r108 = upperjaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(67, 6).addBox(0.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.4132F, -1.6967F, 0.0237F, -0.7416F, -0.016F));

		PartDefinition cube_r109 = upperjaw.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(45, 64).addBox(-1.0F, 0.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -2.75F, -3.0F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r110 = upperjaw.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(47, 24).addBox(-0.948F, -0.095F, -0.1045F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6F, -2.75F, -5.4F, -0.1521F, 0.2087F, -0.3553F));

		PartDefinition cube_r111 = upperjaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(16, 38).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, -2.9593F, -5.9927F, -0.0723F, 0.2611F, -0.0187F));

		PartDefinition cube_r112 = upperjaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(15, 38).addBox(-2.0F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -2.75F, -3.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0063F, 3.8139F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r113 = lowerjaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(51, 6).mirror().addBox(0.0097F, 1.888F, -9.3394F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7224F, 0.3138F, -4.0336F, -0.3796F, -0.2094F, 0.0F));

		PartDefinition cube_r114 = lowerjaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(0.0097F, 1.0137F, -6.6641F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7224F, 0.3138F, -4.0336F, -0.2487F, -0.2094F, 0.0F));

		PartDefinition cube_r115 = lowerjaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(28, 38).mirror().addBox(0.0097F, 0.5844F, -3.8633F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7224F, 0.3138F, -4.0336F, -0.1396F, -0.2094F, 0.0F));

		PartDefinition cube_r116 = lowerjaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(50, 64).mirror().addBox(-0.5F, -0.0066F, -0.4921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-2.225F, 0.1133F, -3.9206F, -0.0262F, -0.2618F, 0.0F));

		PartDefinition cube_r117 = lowerjaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2959F, 1.4144F, -3.656F, -0.0262F, -0.2618F, 0.0F));

		PartDefinition cube_r118 = lowerjaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(67, 3).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1916F, -1.1816F, -13.4883F, -0.6545F, -0.2094F, 0.0F));

		PartDefinition cube_r119 = lowerjaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(50, 67).mirror().addBox(0.0097F, 2.1717F, -8.9045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(45, 67).mirror().addBox(0.0097F, 2.0717F, -10.0545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(35, 59).mirror().addBox(0.0097F, 2.6217F, -10.1295F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7224F, 0.3138F, -4.0336F, -0.48F, -0.2094F, 0.0F));

		PartDefinition cube_r120 = lowerjaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(51, 11).mirror().addBox(0.0097F, -0.1545F, -7.93F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(50, 37).mirror().addBox(0.0097F, 0.3455F, -8.93F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7224F, 0.3138F, -4.0336F, -0.2182F, -0.2094F, 0.0F));

		PartDefinition cube_r121 = lowerjaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(33, 44).mirror().addBox(-0.5F, -0.2F, 0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9927F, -0.96F, -9.7194F, -0.1658F, -0.2094F, 0.0F));

		PartDefinition cube_r122 = lowerjaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(17, 22).mirror().addBox(0.0097F, -0.1901F, -6.0367F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7224F, 0.3138F, -4.0336F, -0.1309F, -0.2094F, 0.0F));

		PartDefinition cube_r123 = lowerjaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(28, 59).mirror().addBox(-0.5F, -0.975F, 0.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4881F, 1.6739F, -1.7038F, 0.4363F, -0.0873F, 0.0F));

		PartDefinition cube_r124 = lowerjaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(21, 59).mirror().addBox(-0.5F, -0.975F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4881F, 1.6739F, -1.7038F, 0.1396F, -0.0873F, 0.0F));

		PartDefinition cube_r125 = lowerjaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(35, 55).mirror().addBox(-0.5F, -0.8F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4028F, 0.9667F, -2.6781F, -0.0436F, -0.0873F, 0.0F));

		PartDefinition cube_r126 = lowerjaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(55, 42).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.625F, 0.9137F, -0.1388F, 0.2182F, -0.0873F, 0.0F));

		PartDefinition cube_r127 = lowerjaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(51, 6).addBox(-1.0097F, 1.888F, -9.3394F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7224F, 0.3138F, -4.0336F, -0.3796F, 0.2094F, 0.0F));

		PartDefinition cube_r128 = lowerjaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0097F, 1.0137F, -6.6641F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7224F, 0.3138F, -4.0336F, -0.2487F, 0.2094F, 0.0F));

		PartDefinition cube_r129 = lowerjaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(28, 38).addBox(-1.0097F, 0.5844F, -3.8633F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7224F, 0.3138F, -4.0336F, -0.1396F, 0.2094F, 0.0F));

		PartDefinition cube_r130 = lowerjaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(50, 64).addBox(-0.5F, -0.0066F, -0.4921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.225F, 0.1133F, -3.9206F, -0.0262F, 0.2618F, 0.0F));

		PartDefinition cube_r131 = lowerjaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2959F, 1.4144F, -3.656F, -0.0262F, 0.2618F, 0.0F));

		PartDefinition cube_r132 = lowerjaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(67, 3).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1916F, -1.1816F, -13.4883F, -0.6545F, 0.2094F, 0.0F));

		PartDefinition cube_r133 = lowerjaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(50, 67).addBox(-1.0097F, 2.1717F, -8.9045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 67).addBox(-1.0097F, 2.0717F, -10.0545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 59).addBox(-1.0097F, 2.6217F, -10.1295F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7224F, 0.3138F, -4.0336F, -0.48F, 0.2094F, 0.0F));

		PartDefinition cube_r134 = lowerjaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(51, 11).addBox(-1.0097F, -0.1545F, -7.93F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(50, 37).addBox(-1.0097F, 0.3455F, -8.93F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7224F, 0.3138F, -4.0336F, -0.2182F, 0.2094F, 0.0F));

		PartDefinition cube_r135 = lowerjaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(33, 44).addBox(-0.5F, -0.2F, 0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9927F, -0.96F, -9.7194F, -0.1658F, 0.2094F, 0.0F));

		PartDefinition cube_r136 = lowerjaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(17, 22).addBox(-1.0097F, -0.1901F, -6.0367F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7224F, 0.3138F, -4.0336F, -0.1309F, 0.2094F, 0.0F));

		PartDefinition cube_r137 = lowerjaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(28, 59).addBox(-0.5F, -0.975F, 0.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4881F, 1.6739F, -1.7038F, 0.4363F, 0.0873F, 0.0F));

		PartDefinition cube_r138 = lowerjaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(21, 59).addBox(-0.5F, -0.975F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4881F, 1.6739F, -1.7038F, 0.1396F, 0.0873F, 0.0F));

		PartDefinition cube_r139 = lowerjaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(35, 55).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4028F, 0.9667F, -2.6781F, -0.0436F, 0.0873F, 0.0F));

		PartDefinition cube_r140 = lowerjaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(55, 42).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.625F, 0.9137F, -0.1388F, 0.2182F, 0.0873F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(29, 73).addBox(0.0F, -1.3311F, 0.9663F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 73).addBox(0.0F, -1.3311F, 2.9663F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2958F, 0.9311F, 0.1103F, -0.1444F, -0.031F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(47, 70).addBox(0.0F, -0.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 56).addBox(0.0F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 70).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.731F, 5.4663F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(69, 42).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 9.2441F, 0.0674F, 0.2457F, -0.3164F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(69, 40).mirror().addBox(-1.9408F, -0.417F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 9.2441F, -0.0598F, 0.2727F, -0.8035F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(69, 38).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 7.2442F, 0.0674F, 0.2457F, -0.3164F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(56, 62).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 7.2442F, -0.0598F, 0.2727F, -0.8035F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(69, 36).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 5.2442F, 0.0674F, 0.2457F, -0.3164F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(62, 50).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 5.2442F, -0.0598F, 0.2727F, -0.8035F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(50, 42).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 3.3441F, 0.0674F, 0.2457F, -0.2641F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(38, 20).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 3.3441F, -0.0598F, 0.2727F, -0.7511F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(36, 69).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 1.4441F, 0.0674F, 0.2457F, -0.1332F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(49, 62).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 1.4441F, -0.0598F, 0.2727F, -0.6202F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(69, 34).mirror().addBox(-3.306F, -1.8721F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 1.4441F, -0.1932F, 0.2026F, -1.1728F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(69, 40).addBox(0.9408F, -0.417F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 9.2441F, -0.0598F, -0.2727F, 0.8035F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(69, 42).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 9.2441F, 0.0674F, -0.2457F, 0.3164F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(56, 62).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 7.2442F, -0.0598F, -0.2727F, 0.8035F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(69, 38).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 7.2442F, 0.0674F, -0.2457F, 0.3164F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(62, 50).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 5.2442F, -0.0598F, -0.2727F, 0.8035F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(69, 36).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 5.2442F, 0.0674F, -0.2457F, 0.3164F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(38, 20).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 3.3441F, -0.0598F, -0.2727F, 0.7511F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(50, 42).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 3.3441F, 0.0674F, -0.2457F, 0.2641F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(69, 34).addBox(2.306F, -1.8721F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 1.4441F, -0.0712F, -0.1505F, 1.1513F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(49, 62).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 1.4441F, 0.0172F, -0.1655F, 0.6035F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(36, 69).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 1.4441F, 0.0848F, -0.1159F, 0.13F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1499F, 10.0029F, 0.0144F, -0.349F, -0.0049F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(5, 63).mirror().addBox(-0.4696F, -0.3211F, -0.8632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9938F, 3.248F, 0.6876F, -1.3582F, 0.0415F, -0.6321F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(3, 67).mirror().addBox(-0.4696F, 0.3793F, -0.0653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 58).mirror().addBox(-0.4696F, -0.6207F, -1.0653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9938F, 3.248F, 0.6876F, -1.8818F, 0.0415F, -0.6321F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(49, 58).mirror().addBox(-0.4696F, -1.1355F, -0.907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9938F, 3.248F, 0.6876F, -1.4455F, 0.0415F, -0.6321F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(63, 28).mirror().addBox(0.6F, -1.8148F, -0.9304F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.1F, 1.7F, 0.3016F, 0.0221F, 0.4358F));

		PartDefinition cube_r169 = body3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(5, 59).mirror().addBox(-0.4696F, -1.3128F, -0.4266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9938F, 3.248F, 0.6876F, -0.8346F, 0.0415F, -0.6321F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(60, 10).mirror().addBox(0.6F, -1.6148F, -0.7554F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.1F, 1.7F, -0.1784F, 0.0221F, 0.4358F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(5, 63).addBox(-0.5304F, -0.3211F, -0.8632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9938F, 3.248F, 0.6876F, -1.3582F, -0.0415F, 0.6321F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(3, 67).addBox(-0.5304F, 0.3793F, -0.0653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 58).addBox(-0.5304F, -0.6207F, -1.0653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9938F, 3.248F, 0.6876F, -1.8818F, -0.0415F, 0.6321F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(49, 58).addBox(-0.5304F, -1.1355F, -0.907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9938F, 3.248F, 0.6876F, -1.4455F, -0.0415F, 0.6321F));

		PartDefinition cube_r174 = body3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(5, 59).addBox(-0.5304F, -1.3128F, -0.4266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9938F, 3.248F, 0.6876F, -0.8346F, -0.0415F, 0.6321F));

		PartDefinition cube_r175 = body3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(63, 28).addBox(-1.6F, -1.8148F, -0.9304F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0F, 1.1F, 1.7F, 0.3016F, -0.0221F, -0.4358F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(60, 10).addBox(-1.6F, -1.6148F, -0.7554F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.1F, 1.7F, -0.1784F, -0.0221F, -0.4358F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r178 = body3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(34, 71).mirror().addBox(0.0F, -0.9F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.196F, 3.3548F, 0.0F, 0.0F, -2.0071F));

		PartDefinition cube_r179 = body3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(34, 71).addBox(0.0F, -0.9F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.196F, 3.3548F, 0.0F, 0.0F, 2.0071F));

		PartDefinition cube_r180 = body3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(34, 71).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.404F, 2.8548F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r181 = body3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 71).addBox(0.0F, -0.8F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4869F, 0.9566F, -0.1745F, 0.0F, 0.0F));

		PartDefinition legL = body3.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(9, 50).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8065F, 3.2F, 1.4809F, -0.1437F, 0.0995F, 0.093F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(9, 55).addBox(-0.5F, -0.75F, 0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0904F, 0.1086F, 2.8889F, 0.0428F, -0.1746F, 0.0039F));

		PartDefinition legL3 = legL2.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, -0.25F, 2.25F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r182 = legL3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(12, 61).addBox(0.0168F, -0.8F, -1.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0478F, 0.9764F, 0.967F, -0.4398F, -0.0249F, -0.043F));

		PartDefinition cube_r183 = legL3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(60, 53).addBox(0.0F, -0.5F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.2F, -0.1344F, -0.0249F, -0.043F));

		PartDefinition cube_r184 = legL3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(60, 15).addBox(-0.0054F, -1.1F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.2F, 0.3019F, -0.0249F, -0.043F));

		PartDefinition legL4 = body3.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(9, 31).mirror().addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8065F, 3.2F, 1.4809F, -0.162F, -0.4877F, -0.0309F));

		PartDefinition legL5 = legL4.addOrReplaceChild("legL5", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-0.5F, -0.75F, 0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.0904F, 0.1086F, 2.8889F, 0.0422F, 0.0438F, -0.0095F));

		PartDefinition legL6 = legL5.addOrReplaceChild("legL6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, -0.25F, 2.25F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r185 = legL6.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-0.0168F, -0.8F, -1.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0478F, 0.9764F, 0.967F, -0.4398F, 0.0249F, 0.043F));

		PartDefinition cube_r186 = legL6.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(0.0F, -0.5F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 1.2F, -0.1344F, 0.0249F, 0.043F));

		PartDefinition cube_r187 = legL6.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(0.0054F, -1.1F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 1.2F, 0.3019F, 0.0249F, 0.043F));

		PartDefinition tail4 = body3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2099F, 3.9076F, -0.0283F, -0.3926F, 0.0108F));

		PartDefinition cube_r188 = tail4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(38, 6).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(11, 68).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3396F, 2.9259F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(20, 72).addBox(0.0F, 0.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4557F, -1.0998F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(8, 68).addBox(0.0F, -0.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5639F, 1.0069F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r192 = tail4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(61, 69).addBox(0.0F, -0.3F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6765F, 3.0137F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(50, 54).mirror().addBox(-0.1F, -1.3F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 54).mirror().addBox(0.0F, -1.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.027F, 1.6235F, 0.0F, 0.0F, -1.9199F));

		PartDefinition cube_r194 = tail4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(50, 54).addBox(0.1F, -1.3F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 54).addBox(0.0F, -1.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.027F, 1.6235F, 0.0F, 0.0F, 1.9199F));

		PartDefinition cube_r195 = tail4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(50, 54).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.327F, 0.9235F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail = tail4.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3009F, 5.0803F, 0.2122F, -0.3915F, -0.0311F));

		PartDefinition cube_r196 = tail.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r197 = tail.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(69, 60).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3926F, -0.164F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(22, 68).addBox(-0.004F, -2.9537F, -0.3007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4051F, 3.9428F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(6, 72).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4051F, 3.9428F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(69, 68).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7413F, 3.9016F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(72, 49).addBox(0.0F, -0.0789F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7413F, 3.9016F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r202 = tail.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(69, 64).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7413F, 1.9016F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r203 = tail.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(72, 46).addBox(0.0F, -0.0789F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7413F, 1.9016F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r204 = tail.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(72, 3).addBox(-0.004F, -1.8665F, -0.3149F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4711F, 1.9016F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r205 = tail.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(37, 71).addBox(0.0F, -0.9211F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4711F, 1.9016F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r206 = tail.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(14, 68).mirror().addBox(-0.4F, -1.3F, 4.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 68).mirror().addBox(-0.3F, -1.5F, 2.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 68).mirror().addBox(-0.2F, -1.6F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4924F, -0.1553F, 0.0F, 0.0F, -1.9635F));

		PartDefinition cube_r207 = tail.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(14, 68).addBox(0.4F, -1.3F, 4.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 68).addBox(0.3F, -1.5F, 2.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 68).addBox(0.2F, -1.6F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4924F, -0.1553F, 0.0F, 0.0F, 1.9635F));

		PartDefinition cube_r208 = tail.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(14, 68).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4924F, -0.1553F, -0.5236F, 0.0F, 0.0F));

		PartDefinition tail5 = tail.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0949F, 5.9428F, 0.0472F, -0.3923F, -0.0181F));

		PartDefinition cube_r209 = tail5.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(72, 6).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r210 = tail5.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(32, 22).addBox(-0.5F, -0.5F, 6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1448F, -5.9428F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r211 = tail5.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(60, 64).addBox(-0.004F, -3.9537F, -0.3007F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r212 = tail5.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(12, 72).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r213 = tail5.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(11, 39).addBox(-0.004F, -3.9537F, -0.3007F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 4.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r214 = tail5.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(9, 72).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 4.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r215 = tail5.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(72, 59).addBox(0.0F, -0.0789F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6465F, 3.9588F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r216 = tail5.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(25, 65).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6465F, 3.9588F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r217 = tail5.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(72, 56).addBox(0.0F, -0.0789F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6465F, 1.9588F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r218 = tail5.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(69, 56).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6465F, 1.9588F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r219 = tail5.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(3, 70).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6465F, -0.0412F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r220 = tail5.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(53, 72).addBox(0.0F, -0.0789F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6465F, -0.0412F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r221 = tail5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(69, 46).addBox(-0.004F, -2.9537F, -0.3007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition tail2 = tail5.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(32, 30).addBox(-0.5F, -0.45F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2135F, 6.0571F, -0.0383F, 0.3035F, -0.178F));

		PartDefinition cube_r222 = tail2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(73, 52).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4329F, 1.9432F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r223 = tail2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(39, 63).addBox(-0.004F, -4.9537F, -0.3007F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4329F, 1.9432F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r224 = tail2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(36, 63).addBox(-0.004F, -4.9537F, -0.3007F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4329F, 4.0432F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r225 = tail2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(49, 73).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4329F, 4.0432F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r226 = tail2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(55, 67).addBox(-0.004F, -3.9537F, -0.3007F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4329F, -0.0568F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r227 = tail2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(74, 39).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4329F, -0.0568F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r228 = tail2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(0, 66).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.433F, 4.0017F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r229 = tail2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(72, 65).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.433F, 4.0017F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r230 = tail2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(65, 52).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.433F, 1.9017F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r231 = tail2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(64, 72).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.433F, 1.9017F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r232 = tail2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(72, 62).addBox(0.0F, -0.0789F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.433F, -0.0983F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r233 = tail2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(28, 65).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.433F, -0.0983F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail6 = tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.349F, -0.0653F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.101F, 6.0653F, -0.2591F, 0.5172F, -0.3562F));

		PartDefinition cube_r234 = tail6.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 74).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, 5.9779F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r235 = tail6.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(66, 67).addBox(-0.004F, -3.9537F, -0.3007F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, 5.9779F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r236 = tail6.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(73, 71).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, 3.9779F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r237 = tail6.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(42, 64).addBox(-0.004F, -4.9537F, -0.3007F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, 3.9779F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r238 = tail6.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(59, 73).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, 1.9779F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r239 = tail6.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(63, 63).addBox(-0.004F, -4.9537F, -0.3007F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, 1.9779F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r240 = tail6.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(66, 62).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, 5.9365F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r241 = tail6.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(73, 9).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, 5.9365F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r242 = tail6.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(66, 57).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, 3.9365F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r243 = tail6.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(70, 72).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, 3.9365F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r244 = tail6.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(66, 37).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, 1.9365F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r245 = tail6.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(72, 68).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, 1.9365F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r246 = tail6.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(66, 32).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, -0.0635F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r247 = tail6.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(67, 72).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, -0.0635F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r248 = tail6.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(56, 73).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, -0.0221F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r249 = tail6.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(63, 57).addBox(-0.004F, -4.9537F, -0.3007F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, -0.0221F, -0.672F, 0.0F, 0.0F));

		PartDefinition tail3 = tail6.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0749F, 6.8187F, -0.1443F, 0.1905F, -0.2426F));

		PartDefinition cube_r250 = tail3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(17, 30).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r251 = tail3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(74, 30).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0931F, 4.7592F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r252 = tail3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(70, 13).addBox(-0.004F, -2.9537F, -0.3007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0931F, 4.7592F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r253 = tail3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(15, 74).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1069F, 2.9592F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r254 = tail3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(70, 9).addBox(-0.004F, -2.9537F, -0.3007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1069F, 2.9592F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r255 = tail3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(17, 70).addBox(-0.004F, -2.9537F, -0.3007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5069F, 1.1592F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r256 = tail3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(73, 18).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.459F, 5.1177F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r257 = tail3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(73, 21).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.459F, 5.1177F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r258 = tail3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(73, 12).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.459F, 3.1177F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r259 = tail3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(73, 15).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.459F, 3.1177F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r260 = tail3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(58, 69).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.659F, 1.1177F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r261 = tail3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(70, 17).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.659F, 1.1177F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r262 = tail3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(3, 74).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5069F, 1.1592F, -0.4538F, 0.0F, 0.0F));

		PartDefinition tail7 = tail3.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, 6.0F, -0.1509F, 0.5187F, -0.0752F));

		PartDefinition cube_r263 = tail7.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.5F, 6.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r264 = tail7.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(74, 36).addBox(0.0F, -3.4F, 3.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 74).addBox(0.0F, -2.4F, 1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3069F, 0.8592F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r265 = tail7.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(46, 73).addBox(0.0F, 0.3665F, -0.1149F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.041F, 4.8177F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r266 = tail7.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(43, 73).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.041F, 2.8177F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r267 = tail7.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(26, 73).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.041F, 2.8177F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r268 = tail7.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(73, 24).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.359F, 1.0177F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r269 = tail7.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(23, 73).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.359F, 1.0177F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r270 = tail7.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(32, 74).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5069F, 0.9592F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r271 = tail7.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(74, 33).addBox(-0.004F, -1.9537F, -0.3007F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5069F, 0.9592F, -0.8465F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 77, 77);
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