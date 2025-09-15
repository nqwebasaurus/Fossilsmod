package fossils.fossils.client.blockentity.model.megalocephalus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MegalocephalusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone10;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart bone;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart bone6;
	private final ModelPart neck2;
	private final ModelPart head2;
	private final ModelPart upperjaw;
	private final ModelPart leftFace;
	private final ModelPart bone5;
	private final ModelPart rightFace;
	private final ModelPart bone8;
	private final ModelPart lowerjaw;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart tail6;
	private final ModelPart tail;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart bone3;
	private final ModelPart bone9;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone7;

	public MegalocephalusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.chest = this.body.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone10 = this.chest.getChild("bone10");
		this.forelegL = this.chest.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.bone = this.forelegL2.getChild("bone");
		this.forelegL3 = this.chest.getChild("forelegL3");
		this.forelegL4 = this.forelegL3.getChild("forelegL4");
		this.bone6 = this.forelegL4.getChild("bone6");
		this.neck2 = this.chest.getChild("neck2");
		this.head2 = this.neck2.getChild("head2");
		this.upperjaw = this.head2.getChild("upperjaw");
		this.leftFace = this.upperjaw.getChild("leftFace");
		this.bone5 = this.leftFace.getChild("bone5");
		this.rightFace = this.upperjaw.getChild("rightFace");
		this.bone8 = this.rightFace.getChild("bone8");
		this.lowerjaw = this.head2.getChild("lowerjaw");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.tail6 = this.body3.getChild("tail6");
		this.tail = this.tail6.getChild("tail");
		this.tail7 = this.tail.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.bone3 = this.body3.getChild("bone3");
		this.bone9 = this.body3.getChild("bone9");
		this.hindlegL = this.body3.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.bone4 = this.hindlegL2.getChild("bone4");
		this.hindlegL3 = this.body3.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.bone7 = this.hindlegL4.getChild("bone7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 25.0F, -9.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(81, 40).addBox(0.0F, -1.8311F, -3.8837F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 80).addBox(0.0F, -1.8311F, -1.8837F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 19).addBox(0.0F, -1.9311F, 0.1163F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, -0.176F, 0.1289F, 0.108F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.95F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(77, 83).addBox(0.0F, -1.5F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -12.85F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(73, 72).mirror().addBox(-4.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4287F, 0.3752F, -0.1932F, 0.2026F, -1.1728F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 69).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4287F, 0.3752F, -0.0598F, 0.2727F, -0.6202F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(69, 15).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4287F, 0.3752F, 0.0674F, 0.2457F, -0.1332F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(73, 70).mirror().addBox(-4.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4287F, -1.6248F, -0.1932F, 0.2026F, -1.1466F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(69, 13).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4287F, -1.6248F, -0.0598F, 0.2727F, -0.5941F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, 69).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4287F, -1.6248F, 0.0674F, 0.2457F, -0.107F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(73, 11).mirror().addBox(-4.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4287F, -3.6248F, -0.1932F, 0.2026F, -1.1466F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(68, 68).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4287F, -3.6248F, -0.0598F, 0.2727F, -0.5941F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(68, 66).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4287F, -3.6248F, 0.0674F, 0.2457F, -0.107F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(72, 62).mirror().addBox(-4.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4287F, -5.6248F, -0.1932F, 0.2026F, -1.2164F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(68, 54).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4287F, -5.6248F, -0.0598F, 0.2727F, -0.6639F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(68, 52).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4287F, -5.6248F, 0.0674F, 0.2457F, -0.1768F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(73, 72).addBox(2.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4287F, 0.3752F, -0.1932F, -0.2026F, 1.1728F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(26, 69).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4287F, 0.3752F, -0.0598F, -0.2727F, 0.6202F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(69, 15).addBox(-0.9754F, 0.0542F, -0.3612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4287F, 0.3752F, 0.0674F, -0.2457F, 0.1332F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(73, 70).addBox(2.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4287F, -1.6248F, -0.1932F, -0.2026F, 1.1466F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(69, 13).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4287F, -1.6248F, -0.0598F, -0.2727F, 0.5941F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(10, 69).addBox(-0.9754F, 0.0542F, -0.3612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4287F, -1.6248F, 0.0674F, -0.2457F, 0.107F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(73, 11).addBox(2.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4287F, -3.6248F, -0.1932F, -0.2026F, 1.1466F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(68, 68).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4287F, -3.6248F, -0.0598F, -0.2727F, 0.5941F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(68, 66).addBox(-0.9754F, 0.0542F, -0.3612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4287F, -3.6248F, 0.0674F, -0.2457F, 0.107F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(72, 62).addBox(2.306F, -1.8721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4287F, -5.6248F, -0.1932F, -0.2026F, 1.2164F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(68, 54).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4287F, -5.6248F, -0.0598F, -0.2727F, 0.6639F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(68, 52).addBox(-0.9754F, 0.0542F, -0.3612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4287F, -5.6248F, 0.0674F, -0.2457F, 0.1768F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0333F, -0.3232F, -6.892F, -0.132F, -0.1298F, 0.0172F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(29, 55).addBox(0.075F, -0.5F, -0.625F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4667F, 4.0123F, -1.3749F, -0.0123F, -0.7854F, 0.0087F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(49, 6).addBox(-2.1833F, -0.9724F, 0.121F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 4.475F, -2.5F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(36, 22).addBox(-2.1833F, -0.4526F, -1.3858F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 3.575F, -3.8F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(81, 38).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2667F, 0.1945F, -4.7328F, 0.0674F, 0.2457F, -0.491F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(81, 38).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3333F, 0.1945F, -4.7328F, 0.0674F, -0.2457F, 0.491F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(80, 26).mirror().addBox(-3.5812F, -2.4328F, -1.3571F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.2003F, 0.1595F, -1.3224F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(69, 41).mirror().addBox(-3.4655F, -0.7559F, -1.3571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.0893F, 0.2396F, -0.776F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(69, 39).mirror().addBox(-1.6688F, -0.0044F, -1.3178F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, 0.0256F, 0.2297F, -0.2914F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(69, 37).mirror().addBox(-2.7281F, -0.1854F, -3.1988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.0881F, 0.2386F, -0.8979F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(78, 54).mirror().addBox(-0.797F, 0.1803F, -3.1797F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, 0.0262F, 0.2283F, -0.4134F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(80, 26).addBox(2.5812F, -2.4328F, -1.3571F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.2003F, -0.1595F, 1.3224F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(69, 41).addBox(1.4655F, -0.7559F, -1.3571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.0893F, -0.2396F, 0.776F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(69, 39).addBox(-0.3312F, -0.0044F, -1.3178F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, 0.0256F, -0.2297F, 0.2914F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(69, 37).addBox(0.7281F, -0.1854F, -3.1988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.0881F, -0.2386F, 0.8979F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(78, 54).addBox(-0.2031F, 0.1803F, -3.1797F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, 0.0262F, -0.2283F, 0.4134F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(74, 83).addBox(0.0F, -0.7098F, -5.0208F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 28).addBox(0.0F, -0.9098F, -3.0208F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 77).addBox(0.0F, -1.0098F, -1.0208F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 0).addBox(-0.5F, -0.0098F, -6.0208F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.0087F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5665F, 4.1F, -3.8F));

		PartDefinition cube_r43 = bone2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(62, 14).addBox(-0.9654F, -0.9941F, -1.3226F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3579F, -0.6418F, -0.0017F));

		PartDefinition cube_r44 = bone2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(39, 60).addBox(-1.3878F, -3.5439F, -0.5824F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1869F, -0.9865F, -0.4471F, -0.7115F, 0.0175F, -0.2179F));

		PartDefinition cube_r45 = bone2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(45, 57).addBox(-1.3878F, -3.6966F, -0.6826F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1869F, -0.9865F, -0.4471F, -0.4497F, 0.0175F, -0.2179F));

		PartDefinition cube_r46 = bone2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(77, 59).addBox(-1.0833F, -0.9291F, -2.1539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.05F, 0.375F, 3.4F, -0.0622F, -0.2281F, -0.0327F));

		PartDefinition cube_r47 = bone2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(78, 45).addBox(-1.0333F, -1.0541F, -0.9789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3788F, 0.3221F, 1.902F, -0.3821F, -0.7349F, 0.0652F));

		PartDefinition cube_r48 = bone2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(50, 58).addBox(-1.0833F, -0.9541F, -1.9789F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, 0.375F, 3.4F, -0.0829F, -0.7504F, 0.0098F));

		PartDefinition cube_r49 = bone2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(49, 10).addBox(-0.1084F, -0.9941F, -0.5242F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2845F, -0.0182F, -0.2166F));

		PartDefinition bone10 = chest.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(-1.5F, 4.1F, -3.8F));

		PartDefinition cube_r50 = bone10.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(62, 14).mirror().addBox(-1.0346F, -0.9941F, -1.3226F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3579F, 0.6418F, 0.0017F));

		PartDefinition cube_r51 = bone10.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(39, 60).mirror().addBox(0.3878F, -3.5439F, -0.5824F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1869F, -0.9865F, -0.4471F, -0.7115F, -0.0175F, 0.2179F));

		PartDefinition cube_r52 = bone10.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(45, 57).mirror().addBox(0.3878F, -3.6966F, -0.6826F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1869F, -0.9865F, -0.4471F, -0.4497F, -0.0175F, 0.2179F));

		PartDefinition cube_r53 = bone10.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(77, 59).mirror().addBox(0.0833F, -0.9291F, -2.1539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.375F, 3.4F, -0.0622F, 0.2281F, 0.0327F));

		PartDefinition cube_r54 = bone10.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(78, 45).mirror().addBox(0.0333F, -1.0541F, -0.9789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3788F, 0.3221F, 1.902F, -0.3821F, 0.7349F, -0.0652F));

		PartDefinition cube_r55 = bone10.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(50, 58).mirror().addBox(0.0833F, -0.9541F, -1.9789F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.375F, 3.4F, -0.0829F, 0.7504F, -0.0098F));

		PartDefinition cube_r56 = bone10.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(49, 10).mirror().addBox(-1.8916F, -0.9941F, -0.5242F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2845F, 0.0182F, 0.2166F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create().texOffs(65, 8).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(3.6576F, 3.012F, -3.6937F, 0.9901F, 0.1895F, -0.3818F));

		PartDefinition cube_r57 = forelegL.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(10, 71).addBox(-0.5F, -0.875F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0834F, -0.2305F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r58 = forelegL.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(68, 70).addBox(-0.5F, 0.75F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.5903F, -0.6226F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r59 = forelegL.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(76, 13).addBox(-0.5F, -1.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.5903F, -0.6226F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r60 = forelegL.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(70, 33).addBox(-0.5F, -0.675F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0278F, 4.5279F, -0.0468F, -0.7524F, -0.1511F, -0.3429F));

		PartDefinition cube_r61 = forelegL2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(28, 76).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 2.1327F, 1.3354F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r62 = forelegL2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(56, 80).addBox(-0.5F, -0.325F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(77, 20).addBox(-0.5F, -1.025F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 0.5595F, 0.5769F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r63 = forelegL2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(73, 7).addBox(-0.5F, -1.125F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0765F, 0.5595F, 0.5769F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r64 = forelegL2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5F, -1.2F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(38, 66).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 1.0362F, -0.649F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone = forelegL2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3235F, 3.2362F, -0.249F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r65 = bone.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(47, 27).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(65, 17).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-3.5911F, 3.012F, -3.6937F, 1.2955F, -0.1895F, 0.3818F));

		PartDefinition cube_r66 = forelegL3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(53, 71).addBox(-0.5F, -0.875F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0834F, -0.2305F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r67 = forelegL3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(48, 71).addBox(-0.5F, 0.75F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.5903F, -0.6226F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r68 = forelegL3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(76, 42).addBox(-0.5F, -1.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.5903F, -0.6226F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r69 = forelegL3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(36, 71).addBox(-0.5F, -0.675F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0278F, 4.5279F, -0.0468F, -0.7569F, -0.1198F, 0.0577F));

		PartDefinition cube_r70 = forelegL4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0765F, 2.1327F, 1.3354F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r71 = forelegL4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(80, 68).addBox(-0.5F, -0.325F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(6, 78).addBox(-0.5F, -1.025F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0765F, 0.5595F, 0.5769F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r72 = forelegL4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(73, 47).addBox(-0.5F, -1.125F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0765F, 0.5595F, 0.5769F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r73 = forelegL4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(5, 67).addBox(-0.5F, -1.2F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(63, 66).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0765F, 1.0362F, -0.649F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone6 = forelegL4.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3235F, 3.2362F, -0.249F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r74 = bone6.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(48, 41).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0333F, 0.0232F, -5.958F, -0.219F, 0.1561F, 0.0995F));

		PartDefinition cube_r75 = neck2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(83, 74).addBox(0.0F, -0.6098F, -7.0208F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 6.0F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r76 = neck2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(49, 17).addBox(-0.5F, 0.7306F, -8.8332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 6.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head2 = neck2.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3496F, -2.766F, -0.3082F, 0.2082F, -0.0657F));

		PartDefinition upperjaw = head2.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1F, 1.9F));

		PartDefinition cube_r77 = upperjaw.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(58, 71).addBox(-1.0F, 0.0079F, 0.0031F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9111F, -6.6817F, 0.5192F, 0.0F, 0.0F));

		PartDefinition cube_r78 = upperjaw.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(17, 22).addBox(-3.0F, -0.6278F, -0.5397F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 1.5883F, -3.9797F, 0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r79 = upperjaw.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(38, 14).addBox(-3.0F, -0.5586F, -1.4653F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.5883F, -3.9797F, -0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r80 = upperjaw.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(38, 17).addBox(-1.0F, -0.3321F, -2.1871F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.3718F, -8.1343F, 0.2138F, 0.0F, 0.0F));

		PartDefinition cube_r81 = upperjaw.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(23, 8).addBox(-2.5F, -0.0071F, 0.0129F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.7179F, -7.301F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r82 = upperjaw.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(65, 22).addBox(-1.0F, -0.9821F, -0.0621F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6219F, -8.222F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r83 = upperjaw.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(63, 34).addBox(-1.0F, -0.959F, 0.9201F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.3722F, -10.1466F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r84 = upperjaw.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(76, 36).addBox(-1.5F, -0.0061F, -1.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -0.9079F, -6.6486F, 0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r85 = upperjaw.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, 0.019F, -0.9794F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0499F, -8.3215F, 0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r86 = upperjaw.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(75, 66).addBox(-1.0F, 0.019F, -0.9794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.469F, -7.525F, 0.4843F, 0.0F, 0.0F));

		PartDefinition cube_r87 = upperjaw.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(70, 25).addBox(-1.5F, 0.0152F, -0.9934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -1.7691F, -4.9089F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r88 = upperjaw.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(48, 48).addBox(-2.0F, -0.1866F, 1.0231F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9F, -3.0F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r89 = upperjaw.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(74, 4).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.3924F, -2.4827F, -0.037F, 0.7851F, -0.0262F));

		PartDefinition cube_r90 = upperjaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(28, 64).addBox(-1.5F, -0.0061F, 0.0304F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -1.9F, -3.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r91 = upperjaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(78, 28).addBox(-0.5F, -0.9775F, -0.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.4722F, -10.1466F, 0.144F, 0.0F, 0.0F));

		PartDefinition cube_r92 = upperjaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(66, 47).addBox(-1.0F, -0.85F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.6785F, -11.3744F, 0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r93 = upperjaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(79, 3).addBox(-0.5F, -0.15F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(14, 66).addBox(-1.0F, -0.15F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8878F, -11.9104F, -0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r94 = upperjaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(21, 78).addBox(-0.5F, -0.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6628F, -11.2475F, 0.3272F, 0.0F, 0.0F));

		PartDefinition cube_r95 = upperjaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(22, 43).addBox(-1.5F, -0.075F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -1.848F, -2.9442F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftFace = upperjaw.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9F, -0.7132F, -1.6967F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(21, 67).addBox(-0.3F, -1.175F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3491F, 2.52F, -5.1365F, 0.1154F, 0.2171F, -0.0222F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(38, 50).addBox(-0.5F, -0.8F, -0.575F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0991F, 2.5835F, -5.8783F, -0.0592F, 0.2345F, -0.0225F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(72, 58).addBox(-0.4F, -1.325F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3375F, 2.6253F, -8.2602F, 0.0281F, 0.2171F, -0.0222F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(41, 76).addBox(-1.7816F, -0.276F, -0.9452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5312F, 0.5329F, 1.1156F, 0.1503F, -0.1536F, 0.876F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(54, 34).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2351F, 0.5589F, 0.1727F, 0.1019F, -0.1015F, 0.7339F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(53, 14).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.1657F, -0.2636F, 0.5763F, 0.1599F, 0.9153F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(20, 54).addBox(0.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.9663F, 0.7163F, -0.1218F, 0.1599F, 0.9153F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(80, 65).addBox(2.3212F, -0.2233F, -3.2413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6678F, 1.9652F, -6.2462F, -0.0364F, 1.1337F, -0.0141F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(61, 80).addBox(1.249F, -0.2233F, -3.3493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6678F, 1.9652F, -6.2462F, -0.0209F, 0.7411F, 0.0048F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(29, 50).addBox(-0.177F, -0.2233F, -2.9384F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6678F, 1.9652F, -6.2462F, -0.0158F, 0.2176F, 0.0155F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(72, 0).addBox(-0.3F, -1.425F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3375F, 2.6253F, -8.2602F, -0.1464F, 0.2171F, -0.0222F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(49, 66).addBox(-1.85F, -0.15F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.0867F, 1.4466F, -8.0808F, 0.2074F, 0.1638F, 0.202F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(80, 71).addBox(-0.85F, -0.225F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.206F, 1.4229F, -7.5139F, 0.1619F, 0.2089F, -0.0424F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(10, 81).addBox(-0.85F, -0.5F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0751F, 2.0445F, -8.2552F, -0.0126F, 0.2089F, -0.0424F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(20, 49).addBox(-0.5F, -0.6108F, -1.3517F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9F, 2.5383F, -2.3584F, 0.0316F, 0.2179F, 0.0053F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(56, 66).addBox(-1.85F, -0.15F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.9511F, 1.5211F, -8.5867F, 0.15F, 0.2666F, 0.2273F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(81, 13).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.6378F, 1.8592F, -8.4615F, 0.0744F, 0.2961F, -0.0436F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(5, 81).addBox(-0.85F, -0.5F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F)), PartPose.offsetAndRotation(0.8707F, 2.0444F, -8.9247F, -0.0129F, 0.2961F, -0.0436F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(66, 80).addBox(-0.8F, -0.3F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(20, 81).addBox(-0.85F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.734F, 1.5716F, -9.252F, 0.1621F, 0.3087F, 0.2302F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(15, 81).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.4267F, 1.9096F, -9.1126F, 0.0742F, 0.3397F, -0.0442F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4326F, 2.0595F, -9.1145F, -0.0131F, 0.3397F, -0.0442F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(57, 62).addBox(-0.7057F, -1.0244F, -0.0011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8997F, 2.5902F, -4.3102F, -0.0502F, 0.1383F, -0.0187F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 62).addBox(-1.0011F, -0.0244F, -0.2754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6567F, 1.4537F, -5.9037F, -0.0886F, 0.3122F, -0.0342F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(9, 55).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3904F, 1.4167F, -6.8935F, 0.0455F, 0.2579F, 0.224F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(62, 38).addBox(-0.5F, -0.1244F, -1.0266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9152F, 1.5467F, -6.7404F, -0.015F, 0.2614F, -0.0108F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(78, 48).addBox(-0.7197F, -0.5F, -0.5537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.329F, 1.9836F, -10.1285F, -0.1528F, -0.2817F, 0.0852F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(41, 79).addBox(-0.1803F, -0.15F, -0.1537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3805F, 1.6146F, -10.1322F, 0.2517F, -1.162F, -0.0581F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(26, 79).addBox(-0.1803F, -0.55F, -0.1536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3914F, 2.0144F, -10.1268F, 0.0335F, -1.162F, -0.0581F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(78, 74).addBox(-0.1803F, -0.5F, -0.1536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F)), PartPose.offsetAndRotation(0.3914F, 2.0144F, -10.1268F, -0.1664F, -1.1562F, 0.1598F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(76, 39).addBox(-0.575F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1653F, 1.5754F, -10.2943F, 0.1263F, -0.5664F, -0.0147F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(78, 51).addBox(-0.2303F, -0.5F, -0.5537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.329F, 1.9836F, -10.1285F, -0.1761F, -0.5831F, 0.1401F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(7, 59).addBox(-0.4275F, -0.4034F, -0.853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.4544F, 1.5894F, 1.7884F, -0.3534F, -0.0312F, -0.7848F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(61, 1).addBox(-0.5F, -0.1955F, -0.5093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6983F, 0.8236F, 1.6451F, -1.4993F, 0.0676F, -0.7866F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5F, -0.4955F, -1.7093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6983F, 0.8236F, 1.6451F, -0.9757F, 0.0676F, -0.7866F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(58, 21).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(2.063F, 1.1555F, 1.9788F, -0.9757F, 0.0676F, -0.7866F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(77, 77).addBox(-0.975F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0594F, 1.123F, -8.5921F, 0.1158F, 0.1793F, -0.6151F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(72, 77).addBox(-0.875F, -0.1F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0147F, 1.3097F, -9.5206F, 0.0533F, 0.5696F, -0.6075F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(67, 77).addBox(-0.975F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0844F, 0.8708F, -7.6765F, 0.203F, 0.1793F, -0.6151F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(31, 81).addBox(-0.975F, -0.075F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.053F, 0.6056F, -6.7192F, 0.3719F, 0.0575F, -0.6634F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(56, 27).addBox(-1.0329F, -0.0705F, -1.9041F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2414F, -0.2975F, -5.1324F, 0.466F, 0.1746F, -0.6046F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -0.45F, -1.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4582F, -0.576F, -3.2172F, 0.3901F, 0.2638F, -0.5561F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(25, 71).addBox(-1.0F, 0.0F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1373F, -1.2813F, -0.4381F, -0.3202F, -0.0062F, -0.5615F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(80, 10).addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(80, 16).addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5463F, 1.8314F, -9.7794F, 0.2851F, 0.3275F, 0.0961F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(79, 62).addBox(-0.1F, -0.9775F, -0.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.9F, 2.1854F, -8.4499F, 0.144F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(20, 71).addBox(-1.0F, 0.0F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3659F, -1.4487F, -1.2859F, -0.4749F, 0.3068F, -0.7185F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(46, 80).addBox(-1.0F, 1.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0985F, -0.3719F, -4.1332F, 0.0258F, 0.2792F, -0.7438F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(11, 49).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0985F, -0.3719F, -4.1332F, 0.4185F, 0.2792F, -0.7438F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(80, 23).addBox(-0.3795F, -2.1782F, -0.3068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5485F, 0.5413F, -3.0589F, -1.1556F, 0.1779F, -0.7237F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(41, 72).addBox(-0.3795F, -1.9266F, 0.0814F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1497F)), PartPose.offsetAndRotation(0.5485F, 0.5413F, -3.0589F, -0.5883F, 0.1779F, -0.7237F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(72, 21).addBox(-0.3795F, -2.1729F, -0.7833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.5485F, 0.5413F, -3.0589F, -1.7228F, 0.1779F, -0.7237F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(3, 72).addBox(-0.3795F, -0.8313F, 0.1933F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5485F, 0.5413F, -3.0589F, -0.632F, 0.1779F, -0.7237F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(73, 29).addBox(-0.6046F, -0.7771F, -0.2632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8619F, 0.6449F, -3.2959F, -0.1619F, 0.1556F, -0.7448F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(51, 0).addBox(-0.3795F, 0.5169F, -2.8747F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 59).addBox(-0.3795F, 0.0419F, -1.6997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.5485F, 0.5413F, -3.0589F, -0.2677F, 0.2613F, -0.7089F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 51).addBox(-0.3795F, -1.1755F, -2.7418F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1496F)), PartPose.offsetAndRotation(0.5485F, 0.5413F, -3.0589F, 0.3432F, 0.2613F, -0.7089F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(59, 48).addBox(-0.5F, -0.6F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.6962F, 0.8593F, -3.8803F, 0.3432F, 0.2613F, -0.7089F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 61).addBox(-0.3795F, -1.1581F, -0.6497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5485F, 0.5413F, -3.0589F, -0.1956F, 0.1779F, -0.7237F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(38, 6).addBox(-0.4F, -0.9F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.455F, 0.5223F, -2.1173F, -0.0657F, 0.2185F, -0.7654F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(38, 55).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4582F, -0.6631F, -2.221F, 0.0693F, 0.0531F, -0.6527F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(7, 63).addBox(-0.2055F, 0.1335F, -0.8856F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3794F, 1.6144F, 1.7884F, -0.2363F, 0.0788F, -0.294F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(57, 58).addBox(-1.0519F, -0.9281F, -1.8146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0818F, 1.289F, 0.8701F, -0.0935F, 0.1592F, -0.8097F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(14, 62).addBox(-0.4019F, 0.1219F, -1.8646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4495F, 1.3944F, 0.9889F, 0.0059F, 0.1843F, -0.2432F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(32, 60).addBox(-0.425F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0581F, 2.1182F, -1.7138F, 0.0403F, 0.206F, -0.0523F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(51, 80).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4043F, -0.273F, 1.3171F, -0.4669F, -1.0545F, 0.42F));

		PartDefinition bone5 = leftFace.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2924F, 0.5667F, -3.1577F, 0.0F, -0.1309F, 0.0F));

		PartDefinition rightFace = upperjaw.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.9F, -0.7132F, -1.6967F));

		PartDefinition cube_r159 = rightFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(21, 67).mirror().addBox(-0.7F, -1.175F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3491F, 2.52F, -5.1365F, 0.1154F, -0.2171F, 0.0222F));

		PartDefinition cube_r160 = rightFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(38, 50).mirror().addBox(-0.5F, -0.8F, -0.575F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0991F, 2.5835F, -5.8783F, -0.0592F, -0.2345F, 0.0225F));

		PartDefinition cube_r161 = rightFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(72, 58).mirror().addBox(-0.6F, -1.325F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3375F, 2.6253F, -8.2602F, 0.0281F, -0.2171F, 0.0222F));

		PartDefinition cube_r162 = rightFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(41, 76).mirror().addBox(0.7816F, -0.276F, -0.9452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5312F, 0.5329F, 1.1156F, 0.1503F, 0.1536F, -0.876F));

		PartDefinition cube_r163 = rightFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(54, 34).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2351F, 0.5589F, 0.1727F, 0.1019F, 0.1015F, -0.7339F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(53, 14).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.1657F, -0.2636F, 0.5763F, -0.1599F, -0.9153F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(20, 54).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.9663F, 0.7163F, -0.1218F, -0.1599F, -0.9153F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(80, 65).mirror().addBox(-3.3212F, -0.2233F, -3.2413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6678F, 1.9652F, -6.2462F, -0.0364F, -1.1337F, 0.0141F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(61, 80).mirror().addBox(-2.249F, -0.2233F, -3.3493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6678F, 1.9652F, -6.2462F, -0.0209F, -0.7411F, -0.0048F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(29, 50).mirror().addBox(-0.823F, -0.2233F, -2.9384F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6678F, 1.9652F, -6.2462F, -0.0158F, -0.2176F, -0.0155F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-0.7F, -1.425F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3375F, 2.6253F, -8.2602F, -0.1464F, -0.2171F, 0.0222F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(49, 66).mirror().addBox(-0.15F, -0.15F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.0867F, 1.4466F, -8.0808F, 0.2074F, -0.1638F, -0.202F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(80, 71).mirror().addBox(-0.15F, -0.225F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.206F, 1.4229F, -7.5139F, 0.1619F, -0.2089F, 0.0424F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-0.15F, -0.5F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0751F, 2.0445F, -8.2552F, -0.0126F, -0.2089F, 0.0424F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(20, 49).mirror().addBox(-0.5F, -0.6108F, -1.3517F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 2.5383F, -2.3584F, 0.0316F, -0.2179F, -0.0053F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(56, 66).mirror().addBox(-0.15F, -0.15F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.9511F, 1.5211F, -8.5867F, 0.15F, -0.2666F, -0.2273F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(81, 13).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.6378F, 1.8592F, -8.4615F, 0.0744F, -0.2961F, 0.0436F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.15F, -0.5F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F)).mirror(false), PartPose.offsetAndRotation(-0.8707F, 2.0444F, -8.9247F, -0.0129F, -0.2961F, 0.0436F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(66, 80).mirror().addBox(-0.2F, -0.3F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(20, 81).mirror().addBox(-0.15F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.734F, 1.5716F, -9.252F, 0.1621F, -0.3087F, -0.2302F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(15, 81).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.4267F, 1.9096F, -9.1126F, 0.0742F, -0.3397F, 0.0442F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4326F, 2.0595F, -9.1145F, -0.0131F, -0.3397F, 0.0442F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(57, 62).mirror().addBox(-0.2943F, -1.0244F, -0.0011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8997F, 2.5902F, -4.3102F, -0.0502F, -0.1383F, 0.0187F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(50, 62).mirror().addBox(0.0011F, -0.0244F, -0.2754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6567F, 1.4537F, -5.9037F, -0.0886F, -0.3122F, 0.0342F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(9, 55).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3904F, 1.4167F, -6.8935F, 0.0455F, -0.2579F, -0.224F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(-0.5F, -0.1244F, -1.0266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9152F, 1.5467F, -6.7404F, -0.015F, -0.2614F, 0.0108F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(78, 48).mirror().addBox(-0.2803F, -0.5F, -0.5537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(0.329F, 1.9836F, -10.1285F, -0.1528F, 0.2817F, -0.0852F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(41, 79).mirror().addBox(-0.8197F, -0.15F, -0.1537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3805F, 1.6146F, -10.1322F, 0.2517F, 1.162F, 0.0581F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(26, 79).mirror().addBox(-0.8197F, -0.55F, -0.1536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3914F, 2.0144F, -10.1268F, 0.0335F, 1.162F, 0.0581F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(78, 74).mirror().addBox(-0.8197F, -0.5F, -0.1536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F)).mirror(false), PartPose.offsetAndRotation(-0.3914F, 2.0144F, -10.1268F, -0.1664F, 1.1562F, -0.1598F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(76, 39).mirror().addBox(-0.425F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1653F, 1.5754F, -10.2943F, 0.1263F, 0.5664F, 0.0147F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(78, 51).mirror().addBox(-0.7697F, -0.5F, -0.5537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.329F, 1.9836F, -10.1285F, -0.1761F, 0.5831F, -0.1401F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(7, 59).mirror().addBox(-0.5725F, -0.4034F, -0.853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4544F, 1.5894F, 1.7884F, -0.3534F, 0.0312F, 0.7848F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(61, 1).mirror().addBox(-0.5F, -0.1955F, -0.5093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6983F, 0.8236F, 1.6451F, -1.4993F, -0.0676F, 0.7866F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-0.5F, -0.4955F, -1.7093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6983F, 0.8236F, 1.6451F, -0.9757F, -0.0676F, 0.7866F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(58, 21).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-2.063F, 1.1555F, 1.9788F, -0.9757F, -0.0676F, 0.7866F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(77, 77).mirror().addBox(-0.025F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0594F, 1.123F, -8.5921F, 0.1158F, -0.1793F, 0.6151F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(72, 77).mirror().addBox(-0.125F, -0.1F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0147F, 1.3097F, -9.5206F, 0.0533F, -0.5696F, 0.6075F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(67, 77).mirror().addBox(-0.025F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0844F, 0.8708F, -7.6765F, 0.203F, -0.1793F, 0.6151F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(31, 81).mirror().addBox(-0.025F, -0.075F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.053F, 0.6056F, -6.7192F, 0.3719F, -0.0575F, 0.6634F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(56, 27).mirror().addBox(0.0329F, -0.0705F, -1.9041F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2414F, -0.2975F, -5.1324F, 0.466F, -0.1746F, 0.6046F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.5F, -0.45F, -1.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4582F, -0.576F, -3.2172F, 0.3901F, -0.2638F, 0.5561F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(25, 71).mirror().addBox(0.0F, 0.0F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1373F, -1.2813F, -0.4381F, -0.3202F, 0.0062F, 0.5615F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(80, 10).mirror().addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(80, 16).mirror().addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5463F, 1.8314F, -9.7794F, 0.2851F, -0.3275F, -0.0961F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(79, 62).mirror().addBox(-0.9F, -0.9775F, -0.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.9F, 2.1854F, -8.4499F, 0.144F, 0.0F, 0.0F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(20, 71).mirror().addBox(0.0F, 0.0F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3659F, -1.4487F, -1.2859F, -0.4749F, -0.3068F, 0.7185F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(46, 80).mirror().addBox(0.0F, 1.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0985F, -0.3719F, -4.1332F, 0.0258F, -0.2792F, 0.7438F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(11, 49).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0985F, -0.3719F, -4.1332F, 0.4185F, -0.2792F, 0.7438F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(80, 23).mirror().addBox(-0.6205F, -2.1782F, -0.3068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5485F, 0.5413F, -3.0589F, -1.1556F, -0.1779F, 0.7237F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(41, 72).mirror().addBox(-0.6205F, -1.9266F, 0.0814F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1497F)).mirror(false), PartPose.offsetAndRotation(-0.5485F, 0.5413F, -3.0589F, -0.5883F, -0.1779F, 0.7237F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(72, 21).mirror().addBox(-0.6205F, -2.1729F, -0.7833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.5485F, 0.5413F, -3.0589F, -1.7228F, -0.1779F, 0.7237F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(3, 72).mirror().addBox(-0.6205F, -0.8313F, 0.1933F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5485F, 0.5413F, -3.0589F, -0.632F, -0.1779F, 0.7237F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(73, 29).mirror().addBox(-0.3954F, -0.7771F, -0.2632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8619F, 0.6449F, -3.2959F, -0.1619F, -0.1556F, 0.7448F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-0.6205F, 0.5169F, -2.8747F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(25, 59).mirror().addBox(-0.6205F, 0.0419F, -1.6997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.5485F, 0.5413F, -3.0589F, -0.2677F, -0.2613F, 0.7089F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.6205F, -1.1755F, -2.7418F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1496F)).mirror(false), PartPose.offsetAndRotation(-0.5485F, 0.5413F, -3.0589F, 0.3432F, -0.2613F, 0.7089F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(59, 48).mirror().addBox(-0.5F, -0.6F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.6962F, 0.8593F, -3.8803F, 0.3432F, -0.2613F, 0.7089F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.6205F, -1.1581F, -0.6497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5485F, 0.5413F, -3.0589F, -0.1956F, -0.1779F, 0.7237F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(38, 6).mirror().addBox(-0.6F, -0.9F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.455F, 0.5223F, -2.1173F, -0.0657F, -0.2185F, 0.7654F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(38, 55).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4582F, -0.6631F, -2.221F, 0.0693F, -0.0531F, 0.6527F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(7, 63).mirror().addBox(-0.7945F, 0.1335F, -0.8856F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3794F, 1.6144F, 1.7884F, -0.2363F, -0.0788F, 0.294F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(57, 58).mirror().addBox(0.0519F, -0.9281F, -1.8146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0818F, 1.289F, 0.8701F, -0.0935F, -0.1592F, 0.8097F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(14, 62).mirror().addBox(-0.5981F, 0.1219F, -1.8646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4495F, 1.3944F, 0.9889F, 0.0059F, -0.1843F, 0.2432F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(32, 60).mirror().addBox(-0.575F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0581F, 2.1182F, -1.7138F, 0.0403F, -0.206F, 0.0523F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(51, 80).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4043F, -0.273F, 1.3171F, -0.4669F, 1.0545F, -0.42F));

		PartDefinition bone8 = rightFace.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2924F, 0.5667F, -3.1577F, 0.0F, 0.1309F, 0.0F));

		PartDefinition lowerjaw = head2.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.12F, 2.5495F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r222 = lowerjaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(75, 25).mirror().addBox(-0.1488F, -1.2596F, -0.9841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6224F, -0.5612F, -10.6086F, -0.1559F, -0.3919F, -0.0196F));

		PartDefinition cube_r223 = lowerjaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(33, 75).mirror().addBox(-0.1488F, -0.9295F, -1.0451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6224F, -0.5612F, -10.6086F, -0.3304F, -0.3919F, -0.0196F));

		PartDefinition cube_r224 = lowerjaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(47, 52).mirror().addBox(-0.0298F, -0.1984F, -3.8205F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7224F, -0.5612F, -7.0086F, -0.1995F, -0.2617F, -0.0075F));

		PartDefinition cube_r225 = lowerjaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.1199F, -0.5621F, -3.6241F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2224F, 0.4388F, -4.4086F, -0.2216F, -0.2268F, -0.0074F));

		PartDefinition cube_r226 = lowerjaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(76, 80).mirror().addBox(-0.2699F, -1.3484F, -2.7502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-4.0224F, 0.4388F, -2.0086F, -0.0262F, -0.384F, 0.0F));

		PartDefinition cube_r227 = lowerjaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(16, 78).mirror().addBox(-0.2699F, -0.0841F, -2.379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0224F, 0.4388F, -2.0086F, -0.2007F, -0.384F, 0.0F));

		PartDefinition cube_r228 = lowerjaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(18, 75).mirror().addBox(-0.1491F, -0.8222F, -1.8996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(75, 17).mirror().addBox(-0.1491F, -0.8222F, -2.3746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6224F, -0.5612F, -10.6086F, -0.4395F, -0.3919F, -0.0196F));

		PartDefinition cube_r229 = lowerjaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(23, 75).mirror().addBox(-0.15F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(23, 75).addBox(0.5981F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.724F, -1.6681F, -11.9158F, -0.4395F, 0.0F, 0.0F));

		PartDefinition cube_r230 = lowerjaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(11, 78).mirror().addBox(-0.1491F, -1.7049F, -1.8726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6224F, -0.5612F, -10.6086F, -0.1689F, -0.3919F, -0.0196F));

		PartDefinition cube_r231 = lowerjaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(71, 80).mirror().addBox(-0.1491F, -1.1672F, -2.0805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6224F, -0.5612F, -10.6086F, -0.2562F, -0.3919F, -0.0196F));

		PartDefinition cube_r232 = lowerjaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(63, 25).mirror().addBox(-0.0298F, -0.944F, -4.477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.7224F, -0.5612F, -7.0086F, -0.1821F, -0.2617F, -0.0075F));

		PartDefinition cube_r233 = lowerjaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(11, 43).mirror().addBox(-0.0298F, -0.5723F, -4.0512F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7224F, -0.5612F, -7.0086F, -0.1646F, -0.2617F, -0.0075F));

		PartDefinition cube_r234 = lowerjaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.1199F, -1.7895F, -4.9591F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.2224F, 0.4388F, -4.4086F, -0.1038F, -0.2268F, -0.0074F));

		PartDefinition cube_r235 = lowerjaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(49, 22).mirror().addBox(-0.1199F, -1.4096F, -2.7981F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2224F, 0.4388F, -4.4086F, -0.0645F, -0.2268F, -0.0074F));

		PartDefinition cube_r236 = lowerjaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(21, 63).mirror().addBox(-0.5F, -0.975F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.6461F, 0.8287F, 0.1019F, 0.2182F, -0.0873F, 0.0F));

		PartDefinition cube_r237 = lowerjaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(60, 4).mirror().addBox(0.0588F, -0.1945F, -1.6158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0224F, 0.4388F, -2.0086F, -0.1309F, -0.2094F, 0.0F));

		PartDefinition cube_r238 = lowerjaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(57, 44).mirror().addBox(0.0588F, -1.0101F, -1.9875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0224F, 0.4388F, -2.0086F, -0.2007F, -0.2094F, 0.0F));

		PartDefinition cube_r239 = lowerjaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(61, 52).mirror().addBox(-0.5F, -1.0F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.625F, 0.9137F, -0.1388F, -0.2618F, -0.0873F, 0.0F));

		PartDefinition cube_r240 = lowerjaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(75, 25).addBox(-0.8512F, -1.2596F, -0.9841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6224F, -0.5612F, -10.6086F, -0.1559F, 0.3919F, 0.0196F));

		PartDefinition cube_r241 = lowerjaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(33, 75).addBox(-0.8512F, -0.9295F, -1.0451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6224F, -0.5612F, -10.6086F, -0.3304F, 0.3919F, 0.0196F));

		PartDefinition cube_r242 = lowerjaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(47, 52).addBox(-0.9702F, -0.1984F, -3.8205F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7224F, -0.5612F, -7.0086F, -0.1995F, 0.2617F, 0.0075F));

		PartDefinition cube_r243 = lowerjaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 39).addBox(-0.8801F, -0.5621F, -3.6241F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.2224F, 0.4388F, -4.4086F, -0.2216F, 0.2268F, 0.0074F));

		PartDefinition cube_r244 = lowerjaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(76, 80).addBox(-0.7301F, -1.3484F, -2.7502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(4.0224F, 0.4388F, -2.0086F, -0.0262F, 0.384F, 0.0F));

		PartDefinition cube_r245 = lowerjaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(16, 78).addBox(-0.7301F, -0.0841F, -2.379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0224F, 0.4388F, -2.0086F, -0.2007F, 0.384F, 0.0F));

		PartDefinition cube_r246 = lowerjaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(18, 75).addBox(-0.8509F, -0.8222F, -1.8996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(75, 17).addBox(-0.8509F, -0.8222F, -2.3746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6224F, -0.5612F, -10.6086F, -0.4395F, 0.3919F, 0.0196F));

		PartDefinition cube_r247 = lowerjaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(11, 78).addBox(-0.8509F, -1.7049F, -1.8726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6224F, -0.5612F, -10.6086F, -0.1689F, 0.3919F, 0.0196F));

		PartDefinition cube_r248 = lowerjaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(71, 80).addBox(-0.8509F, -1.1672F, -2.0805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6224F, -0.5612F, -10.6086F, -0.2562F, 0.3919F, 0.0196F));

		PartDefinition cube_r249 = lowerjaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(63, 25).addBox(-0.9702F, -0.944F, -4.477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.7224F, -0.5612F, -7.0086F, -0.1821F, 0.2617F, 0.0075F));

		PartDefinition cube_r250 = lowerjaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(11, 43).addBox(-0.9702F, -0.5723F, -4.0512F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7224F, -0.5612F, -7.0086F, -0.1646F, 0.2617F, 0.0075F));

		PartDefinition cube_r251 = lowerjaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 45).addBox(-0.8801F, -1.7895F, -4.9591F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.2224F, 0.4388F, -4.4086F, -0.1038F, 0.2268F, 0.0074F));

		PartDefinition cube_r252 = lowerjaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(49, 22).addBox(-0.8801F, -1.4096F, -2.7981F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2224F, 0.4388F, -4.4086F, -0.0645F, 0.2268F, 0.0074F));

		PartDefinition cube_r253 = lowerjaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(21, 63).addBox(-0.5F, -0.975F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.6461F, 0.8287F, 0.1019F, 0.2182F, 0.0873F, 0.0F));

		PartDefinition cube_r254 = lowerjaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(60, 4).addBox(-1.0588F, -0.1945F, -1.6158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0224F, 0.4388F, -2.0086F, -0.1309F, 0.2094F, 0.0F));

		PartDefinition cube_r255 = lowerjaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(57, 44).addBox(-1.0588F, -1.0101F, -1.9875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.0224F, 0.4388F, -2.0086F, -0.2007F, 0.2094F, 0.0F));

		PartDefinition cube_r256 = lowerjaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(61, 52).addBox(-0.5F, -1.0F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.625F, 0.9137F, -0.1388F, -0.2618F, 0.0873F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(25, 82).addBox(0.0F, -1.6311F, 0.9663F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 82).addBox(0.0F, -1.6311F, 2.9663F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2958F, 0.9311F, 0.0223F, -0.0436F, -0.001F));

		PartDefinition cube_r257 = body2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r258 = body2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(3, 84).addBox(0.0F, -0.7F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 84).addBox(0.0F, -0.7F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 82).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.731F, 5.4663F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r259 = body2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(60, 8).mirror().addBox(-2.2751F, -0.7707F, -0.5007F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0671F, 9.2441F, -0.0598F, 0.2727F, -0.9431F));

		PartDefinition cube_r260 = body2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(69, 56).mirror().addBox(-1.4855F, -0.1088F, -0.4661F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0671F, 9.2441F, 0.0674F, 0.2457F, -0.4561F));

		PartDefinition cube_r261 = body2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(66, 50).mirror().addBox(-3.2751F, -0.7707F, -0.5007F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0579F, 7.2441F, -0.0598F, 0.2727F, -0.8035F));

		PartDefinition cube_r262 = body2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(69, 64).mirror().addBox(-1.4855F, -0.1088F, -0.4661F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0579F, 7.2441F, 0.0674F, 0.2457F, -0.3164F));

		PartDefinition cube_r263 = body2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(67, 5).mirror().addBox(-3.2751F, -0.7707F, -0.5007F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 5.2441F, -0.0598F, 0.2727F, -0.8035F));

		PartDefinition cube_r264 = body2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(55, 69).mirror().addBox(-1.4855F, -0.1089F, -0.4661F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 5.2441F, 0.0674F, 0.2457F, -0.3164F));

		PartDefinition cube_r265 = body2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(48, 69).mirror().addBox(-3.2928F, -0.7518F, -0.5046F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 3.3441F, -0.0598F, 0.2727F, -0.7511F));

		PartDefinition cube_r266 = body2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(69, 45).mirror().addBox(-1.4928F, -0.084F, -0.4696F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 3.3441F, 0.0674F, 0.2457F, -0.2641F));

		PartDefinition cube_r267 = body2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(58, 25).mirror().addBox(-3.4958F, -2.317F, -0.5127F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 1.4441F, -0.1932F, 0.2026F, -1.1728F));

		PartDefinition cube_r268 = body2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(56, 32).mirror().addBox(-3.3326F, -0.7006F, -0.5127F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 1.4441F, -0.0598F, 0.2727F, -0.6202F));

		PartDefinition cube_r269 = body2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(69, 43).mirror().addBox(-1.5053F, -0.0202F, -0.477F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1329F, 1.4441F, 0.0674F, 0.2457F, -0.1332F));

		PartDefinition cube_r270 = body2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(60, 8).addBox(1.2751F, -0.7707F, -0.5007F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0671F, 9.2441F, -0.0598F, -0.2727F, 0.9431F));

		PartDefinition cube_r271 = body2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(69, 56).addBox(-0.5145F, -0.1088F, -0.4661F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0671F, 9.2441F, 0.0674F, -0.2457F, 0.4561F));

		PartDefinition cube_r272 = body2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(66, 50).addBox(1.2751F, -0.7707F, -0.5007F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0579F, 7.2441F, -0.0598F, -0.2727F, 0.8035F));

		PartDefinition cube_r273 = body2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(69, 64).addBox(-0.5145F, -0.1088F, -0.4661F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0579F, 7.2441F, 0.0674F, -0.2457F, 0.3164F));

		PartDefinition cube_r274 = body2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(67, 5).addBox(1.2751F, -0.7707F, -0.5007F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 5.2441F, -0.0598F, -0.2727F, 0.8035F));

		PartDefinition cube_r275 = body2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(55, 69).addBox(-0.5145F, -0.1089F, -0.4661F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 5.2441F, 0.0674F, -0.2457F, 0.3164F));

		PartDefinition cube_r276 = body2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(48, 69).addBox(1.2928F, -0.7518F, -0.5046F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 3.3441F, -0.0598F, -0.2727F, 0.7511F));

		PartDefinition cube_r277 = body2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(69, 45).addBox(-0.5072F, -0.084F, -0.4696F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 3.3441F, 0.0674F, -0.2457F, 0.2641F));

		PartDefinition cube_r278 = body2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(58, 25).addBox(2.4958F, -2.317F, -0.5127F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 1.4441F, -0.1932F, -0.2026F, 1.1728F));

		PartDefinition cube_r279 = body2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(56, 32).addBox(1.3326F, -0.7006F, -0.5127F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 1.4441F, -0.0598F, -0.2727F, 0.6202F));

		PartDefinition cube_r280 = body2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(69, 43).addBox(-0.4947F, -0.0202F, -0.477F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1329F, 1.4441F, 0.0674F, -0.2457F, 0.1332F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1499F, 10.0029F, 0.0137F, -0.1745F, -0.0024F));

		PartDefinition cube_r281 = body3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(43, 35).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r282 = body3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(9, 84).mirror().addBox(0.0F, -0.9F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.196F, 3.3548F, 0.0F, 0.0F, -2.0071F));

		PartDefinition cube_r283 = body3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(9, 84).addBox(0.0F, -0.9F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.196F, 3.3548F, 0.0F, 0.0F, 2.0071F));

		PartDefinition cube_r284 = body3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(14, 59).addBox(0.0F, 0.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6655F, 2.8078F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r285 = body3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(6, 84).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.404F, 2.8548F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r286 = body3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(84, 3).addBox(0.0F, -0.9F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4869F, 0.9566F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail6 = body3.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2099F, 3.9076F, 0.1471F, -0.3053F, 0.0083F));

		PartDefinition cube_r287 = tail6.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(30, 35).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r288 = tail6.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(83, 44).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3396F, 2.9259F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r289 = tail6.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(71, 83).addBox(0.0F, -0.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5639F, 1.0069F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r290 = tail6.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(44, 83).addBox(0.0F, -0.3F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6765F, 3.0137F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r291 = tail6.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-0.1F, -1.3F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 83).mirror().addBox(0.0F, -1.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.027F, 1.6235F, 0.0F, 0.0F, -1.9199F));

		PartDefinition cube_r292 = tail6.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(83, 6).addBox(0.1F, -1.3F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 83).addBox(0.0F, -1.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.027F, 1.6235F, 0.0F, 0.0F, 1.9199F));

		PartDefinition cube_r293 = tail6.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(82, 56).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.327F, 0.9235F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail = tail6.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3009F, 5.0803F, 0.206F, 0.0F, 0.0F));

		PartDefinition cube_r294 = tail.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(32, 27).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r295 = tail.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(81, 34).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3926F, -0.164F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r296 = tail.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(50, 83).addBox(-0.004F, -2.9537F, -0.3007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4051F, 3.9428F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r297 = tail.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(37, 84).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4051F, 3.9428F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r298 = tail.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(83, 48).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7413F, 3.9016F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r299 = tail.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(84, 34).addBox(0.0F, -0.0789F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7413F, 3.9016F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r300 = tail.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(47, 83).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7413F, 1.9016F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r301 = tail.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(34, 84).addBox(0.0F, -0.0789F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7413F, 1.9016F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r302 = tail.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(31, 84).addBox(-0.004F, -1.8665F, -0.3149F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4711F, 1.9016F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r303 = tail.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(21, 84).addBox(0.0F, -0.9211F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4711F, 1.9016F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r304 = tail.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(18, 84).mirror().addBox(-0.4F, -1.3F, 4.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 84).mirror().addBox(-0.3F, -1.5F, 2.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 84).mirror().addBox(-0.2F, -1.6F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4924F, -0.1553F, 0.0F, 0.0F, -1.9635F));

		PartDefinition cube_r305 = tail.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(18, 84).addBox(0.4F, -1.3F, 4.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 84).addBox(0.3F, -1.5F, 2.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 84).addBox(0.2F, -1.6F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4924F, -0.1553F, 0.0F, 0.0F, 1.9635F));

		PartDefinition cube_r306 = tail.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(11, 39).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4924F, -0.1553F, -0.5236F, 0.0F, 0.0F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0949F, 5.9428F, 0.2182F, 0.1309F, 0.0F));

		PartDefinition cube_r307 = tail7.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(85, 0).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r308 = tail7.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(17, 27).addBox(-0.5F, -0.5F, 6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1448F, -5.9428F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r309 = tail7.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(30, 71).addBox(-0.004F, -3.9537F, -0.3007F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r310 = tail7.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(83, 84).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r311 = tail7.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(46, 75).addBox(-0.004F, -3.9537F, -0.3007F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 4.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r312 = tail7.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(84, 80).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 4.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r313 = tail7.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(80, 84).addBox(0.0F, -0.0789F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6465F, 3.9588F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r314 = tail7.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(38, 75).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6465F, 3.9588F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r315 = tail7.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(84, 60).addBox(0.0F, -0.0789F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6465F, 1.9588F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r316 = tail7.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(53, 83).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6465F, 1.9588F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r317 = tail7.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(83, 52).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6465F, -0.0412F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r318 = tail7.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(84, 40).addBox(0.0F, -0.0789F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6465F, -0.0412F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r319 = tail7.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(38, 80).addBox(-0.004F, -2.9537F, -0.3007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(15, 35).addBox(-0.5F, -0.45F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2135F, 6.0571F, 0.1035F, 0.2181F, 0.0035F));

		PartDefinition cube_r320 = tail8.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(3, 87).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4329F, 1.9432F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r321 = tail8.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(70, 7).addBox(-0.004F, -4.9537F, -0.3007F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4329F, 1.9432F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r322 = tail8.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(0, 70).addBox(-0.004F, -4.9537F, -0.3007F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4329F, 4.0432F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r323 = tail8.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(0, 87).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4329F, 4.0432F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r324 = tail8.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(3, 76).addBox(-0.004F, -3.9537F, -0.3007F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4329F, -0.0568F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r325 = tail8.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(54, 38).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4329F, -0.0568F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r326 = tail8.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(52, 75).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.433F, 4.0017F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r327 = tail8.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(85, 19).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.433F, 4.0017F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r328 = tail8.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(75, 51).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.433F, 1.9017F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r329 = tail8.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(85, 16).addBox(0.0F, -0.0789F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.433F, 1.9017F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r330 = tail8.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(85, 10).addBox(0.0F, -0.0789F, -0.0398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.433F, -0.0983F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r331 = tail8.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(49, 75).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.433F, -0.0983F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.349F, -0.0653F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.101F, 6.0653F));

		PartDefinition cube_r332 = tail9.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(85, 77).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, 5.9779F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r333 = tail9.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(0, 76).addBox(-0.004F, -3.9537F, -0.3007F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, 5.9779F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r334 = tail9.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(85, 69).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, 3.9779F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r335 = tail9.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(69, 58).addBox(-0.004F, -4.9537F, -0.3007F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, 3.9779F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r336 = tail9.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(85, 66).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, 1.9779F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r337 = tail9.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(33, 69).addBox(-0.004F, -4.9537F, -0.3007F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, 1.9779F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r338 = tail9.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(64, 75).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, 5.9364F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r339 = tail9.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(85, 63).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, 5.9364F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r340 = tail9.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(61, 75).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, 3.9364F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r341 = tail9.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(85, 56).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, 3.9364F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r342 = tail9.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(58, 75).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, 1.9364F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r343 = tail9.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(85, 31).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, 1.9364F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r344 = tail9.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(55, 75).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, -0.0636F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r345 = tail9.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(85, 25).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.534F, -0.0636F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r346 = tail9.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(85, 22).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, -0.0221F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r347 = tail9.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(17, 69).addBox(-0.004F, -4.9537F, -0.3007F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3319F, -0.0221F, -0.672F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0749F, 6.8187F, 0.0741F, 0.2605F, -0.0259F));

		PartDefinition cube_r348 = tail10.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r349 = tail10.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(86, 43).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0931F, 4.7592F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r350 = tail10.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(65, 83).addBox(-0.004F, -2.9537F, -0.3007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0931F, 4.7592F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r351 = tail10.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(40, 86).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1069F, 2.9592F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r352 = tail10.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(62, 83).addBox(-0.004F, -2.9537F, -0.3007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1069F, 2.9592F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r353 = tail10.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(59, 83).addBox(-0.004F, -2.9537F, -0.3007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5069F, 1.1592F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r354 = tail10.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(86, 37).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.459F, 5.1177F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r355 = tail10.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(86, 28).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.459F, 5.1177F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r356 = tail10.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(27, 86).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.459F, 3.1177F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r357 = tail10.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(24, 86).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.459F, 3.1177F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r358 = tail10.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(56, 83).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.659F, 1.1177F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r359 = tail10.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(86, 13).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.659F, 1.1177F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r360 = tail10.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(86, 6).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5069F, 1.1592F, -0.4538F, 0.0F, 0.0F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, 6.0F, -0.0063F, 0.3027F, -0.0411F));

		PartDefinition cube_r361 = tail11.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(19, 12).addBox(-0.5F, -0.5F, 6.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r362 = tail11.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(86, 86).addBox(0.0F, -3.4F, 3.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 52).addBox(0.0F, -2.4F, 1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3069F, 0.8592F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r363 = tail11.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(86, 83).addBox(0.0F, 0.3665F, -0.1149F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.041F, 4.8177F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r364 = tail11.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(77, 86).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.041F, 2.8177F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r365 = tail11.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(82, 0).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.041F, 2.8177F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r366 = tail11.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(74, 86).addBox(-0.004F, 0.8665F, -0.3149F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.359F, 1.0177F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r367 = tail11.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(86, 72).addBox(0.0F, -0.0789F, -0.0397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.359F, 1.0177F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r368 = tail11.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(86, 49).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5069F, 0.9592F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r369 = tail11.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(86, 46).addBox(-0.004F, -1.9537F, -0.3007F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5069F, 0.9592F, -0.8465F, 0.0F, 0.0F));

		PartDefinition bone3 = body3.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.0F, 1.1F, 1.7F));

		PartDefinition cube_r370 = bone3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(70, 17).addBox(-1.6F, -1.8148F, -0.9304F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3016F, -0.0221F, -0.4358F));

		PartDefinition cube_r371 = bone3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(63, 71).addBox(-0.5304F, -0.3211F, -0.8632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0062F, 2.148F, -1.0124F, -1.3582F, -0.0415F, 0.6321F));

		PartDefinition cube_r372 = bone3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(75, 33).addBox(-0.5304F, 0.3793F, -0.0653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 58).addBox(-0.5304F, -0.6207F, -1.0653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0062F, 2.148F, -1.0124F, -1.8818F, -0.0415F, 0.6321F));

		PartDefinition cube_r373 = bone3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(58, 17).addBox(-0.5304F, -1.1355F, -0.907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0062F, 2.148F, -1.0124F, -1.4455F, -0.0415F, 0.6321F));

		PartDefinition cube_r374 = bone3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(58, 10).addBox(-0.5304F, -1.3128F, -0.4266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0062F, 2.148F, -1.0124F, -0.8346F, -0.0415F, 0.6321F));

		PartDefinition cube_r375 = bone3.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(0, 65).addBox(-1.6F, -1.6148F, -0.7554F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1784F, -0.0221F, -0.4358F));

		PartDefinition bone9 = body3.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(-2.0F, 1.1F, 1.7F));

		PartDefinition cube_r376 = bone9.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(70, 17).mirror().addBox(0.6F, -1.8148F, -0.9304F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3016F, 0.0221F, 0.4358F));

		PartDefinition cube_r377 = bone9.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(63, 71).mirror().addBox(-0.4696F, -0.3211F, -0.8632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.0062F, 2.148F, -1.0124F, -1.3582F, 0.0415F, -0.6321F));

		PartDefinition cube_r378 = bone9.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(75, 33).mirror().addBox(-0.4696F, 0.3793F, -0.0653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 58).mirror().addBox(-0.4696F, -0.6207F, -1.0653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.0062F, 2.148F, -1.0124F, -1.8818F, 0.0415F, -0.6321F));

		PartDefinition cube_r379 = bone9.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(58, 17).mirror().addBox(-0.4696F, -1.1355F, -0.907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0062F, 2.148F, -1.0124F, -1.4455F, 0.0415F, -0.6321F));

		PartDefinition cube_r380 = bone9.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(58, 10).mirror().addBox(-0.4696F, -1.3128F, -0.4266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.0062F, 2.148F, -1.0124F, -0.8346F, 0.0415F, -0.6321F));

		PartDefinition cube_r381 = bone9.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(0.6F, -1.6148F, -0.7554F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1784F, 0.0221F, 0.4358F));

		PartDefinition hindlegL = body3.addOrReplaceChild("hindlegL", CubeListBuilder.create().texOffs(33, 78).addBox(-0.5396F, 3.6222F, -0.7119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.1391F, 2.5662F, 2.0177F, 0.8656F, 0.2164F, -0.1524F));

		PartDefinition cube_r382 = hindlegL.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(56, 52).addBox(5.0F, -3.125F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-5.5396F, 2.634F, 0.4958F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r383 = hindlegL.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(8, 75).addBox(-0.5F, -0.2F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0396F, 3.9472F, -0.2369F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r384 = hindlegL.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(77, 56).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0396F, 3.9472F, -0.2369F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r385 = hindlegL.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(68, 29).addBox(5.0F, -0.125F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5396F, 2.3103F, 0.5123F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r386 = hindlegL.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(33, 64).addBox(5.0F, 1.0F, -1.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.5396F, -1.366F, 1.5958F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(64, 56).addBox(-0.4826F, -0.1538F, -1.1996F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(63, 29).addBox(-0.4826F, -0.2538F, -0.0996F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(68, 74).addBox(-0.4826F, 2.5462F, -0.0996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0467F, 4.7665F, 0.5342F, 0.3044F, -0.0094F, 0.0434F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(30, 42).addBox(-0.5F, 0.1F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0174F, 3.1462F, -0.1996F, -0.1731F, 0.0227F, 0.1289F));

		PartDefinition hindlegL3 = body3.addOrReplaceChild("hindlegL3", CubeListBuilder.create().texOffs(80, 31).addBox(-0.4604F, 3.6222F, -0.7119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.1391F, 2.5662F, 2.0177F, 0.8656F, -0.2164F, 0.1524F));

		PartDefinition cube_r387 = hindlegL3.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(57, 38).addBox(-6.0F, -3.125F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(5.5396F, 2.634F, 0.4958F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r388 = hindlegL3.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(13, 75).addBox(-0.5F, -0.2F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0396F, 3.9472F, -0.2369F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r389 = hindlegL3.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(78, 7).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0396F, 3.9472F, -0.2369F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r390 = hindlegL3.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(43, 68).addBox(-6.0F, -0.125F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5396F, 2.3103F, 0.5123F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r391 = hindlegL3.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(64, 42).addBox(-6.0F, 1.0F, -1.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.5396F, -1.366F, 1.5958F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(64, 61).addBox(-0.5174F, -0.1538F, -1.1996F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(44, 63).addBox(-0.5174F, -0.2538F, -0.0996F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(73, 74).addBox(-0.5174F, 2.5462F, -0.0996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0467F, 4.7665F, 0.5342F, 0.3044F, 0.0094F, -0.0434F));

		PartDefinition bone7 = hindlegL4.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(39, 42).addBox(-0.5F, 0.1F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.0174F, 3.1462F, -0.1996F, -0.1731F, -0.0227F, -0.1289F));

		return LayerDefinition.create(meshdefinition, 89, 89);
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