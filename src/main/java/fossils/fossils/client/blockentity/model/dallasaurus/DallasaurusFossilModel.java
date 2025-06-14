package fossils.fossils.client.blockentity.model.dallasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DallasaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart frontleftflipper;
	private final ModelPart frontrightflipper;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart hips;
	private final ModelPart backleftflipper;
	private final ModelPart backrightflipper;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public DallasaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.frontleftflipper = this.chest.getChild("frontleftflipper");
		this.frontrightflipper = this.chest.getChild("frontrightflipper");
		this.body = this.chest.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.hips = this.body3.getChild("hips");
		this.backleftflipper = this.hips.getChild("backleftflipper");
		this.backrightflipper = this.hips.getChild("backrightflipper");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.0F, -12.3988F, -5.0634F, -0.1321F, 0.3896F, -0.0504F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 44).addBox(0.0F, -1.5599F, 0.0026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 8).mirror().addBox(-7.5861F, -0.0009F, -0.405F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2385F, 6.0102F, 3.2308F, 0.0984F, 0.9376F, 0.6284F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(34, 28).mirror().addBox(-6.0861F, -0.0009F, -0.405F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2385F, 6.0102F, 3.2308F, 0.0203F, 0.6836F, 0.5311F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(33, 43).mirror().addBox(-5.0861F, -0.0009F, -0.405F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2385F, 6.0102F, 3.2308F, 0.0052F, 0.422F, 0.5069F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(40, 6).mirror().addBox(-4.4861F, -0.0009F, -0.505F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4212F, 5.9838F, 2.4524F, 0.1175F, 0.2015F, 0.6762F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(51, 45).mirror().addBox(-3.4861F, -0.0009F, -0.405F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5311F, 6.0655F, 1.1596F, 0.098F, 0.0392F, 0.5526F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, 70).mirror().addBox(-0.4783F, -0.5F, -1.3019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(68, 69).mirror().addBox(-0.4783F, -0.5F, -0.3019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2107F, 5.1657F, -2.0604F, -0.9865F, -0.987F, 1.5389F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(0.0F, -0.5F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 5.7934F, -3.3832F, -0.1376F, -0.4761F, 0.0634F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(78, 60).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8249F, -3.4059F, 0.7044F, 0.3055F, -0.2926F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(63, 33).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8249F, -3.4059F, 0.5201F, 0.6008F, -0.7043F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(62, 6).mirror().addBox(-4.2375F, -1.8712F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8249F, -3.4059F, 0.084F, 0.7694F, -1.3758F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 78).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3249F, -1.4059F, 0.5197F, 0.231F, -0.266F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(52, 40).mirror().addBox(-5.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3249F, -1.4059F, 0.0573F, 0.5774F, -1.3168F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3249F, -1.4059F, 0.3678F, 0.4592F, -0.7059F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(41, 69).mirror().addBox(-0.5F, -0.425F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.706F, 3.9935F, -2.3773F, 0.8727F, -0.1309F, 0.0F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(46, 70).mirror().addBox(-0.5F, -0.525F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8057F, 1.8413F, -1.62F, 1.6319F, -0.1309F, 0.0F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(69, 5).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6881F, 3.155F, -2.5132F, -2.7576F, -0.1309F, 0.0F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(48, 67).mirror().addBox(-0.5F, -0.0503F, 0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 3.2758F, -2.4231F, 2.6878F, -0.1309F, 0.0F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(70, 32).mirror().addBox(-0.5F, -0.55F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7217F, 2.1727F, -2.2585F, 2.0682F, -0.1309F, 0.0F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(30, 77).mirror().addBox(-0.5F, 0.7898F, -0.0592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 3.2758F, -2.4231F, 0.0698F, -0.1309F, 0.0F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(7, 54).mirror().addBox(-0.5F, -0.9656F, 0.0052F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8246F, 4.3285F, -1.4764F, 1.405F, -0.1309F, 0.0F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(54, 29).mirror().addBox(-0.8031F, -0.5F, -1.3707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2107F, 5.1657F, -2.0604F, -0.612F, -0.6431F, 1.0368F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(28, 54).mirror().addBox(-0.1331F, -0.5F, -1.3396F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2107F, 5.1657F, -2.0604F, -1.817F, -1.0769F, 2.4872F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(27, 50).mirror().addBox(-2.0F, 0.6F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(27, 50).addBox(0.0F, 0.6F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(51, 2).addBox(-1.0F, 0.6F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F))
				.texOffs(14, 54).addBox(-0.5F, 0.6F, -2.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.8234F, -2.2566F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(25, 10).mirror().addBox(-3.9F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4646F, 6.2921F, -0.0169F, 0.0769F, -0.1827F, 0.8844F));

		PartDefinition cube_r26 = chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(78, 60).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8249F, -3.4059F, 0.7044F, -0.3055F, 0.2926F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(63, 33).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8249F, -3.4059F, 0.5201F, -0.6008F, 0.7043F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(62, 6).addBox(2.2375F, -1.8712F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8249F, -3.4059F, 0.084F, -0.7694F, 1.3758F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(60, 78).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3249F, -1.4059F, 0.5197F, -0.231F, 0.266F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(52, 40).addBox(2.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3249F, -1.4059F, 0.0573F, -0.5774F, 1.3168F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(62, 0).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3249F, -1.4059F, 0.3678F, -0.4592F, 0.7059F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(15, 23).addBox(0.0F, -1.2286F, 0.0379F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -4.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(41, 69).addBox(-0.5F, -0.425F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.706F, 3.9935F, -2.3773F, 0.8727F, 0.1309F, 0.0F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(46, 70).addBox(-0.5F, -0.525F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.8057F, 1.8413F, -1.62F, 1.6319F, 0.1309F, 0.0F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(69, 5).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.6881F, 3.155F, -2.5132F, -2.7576F, 0.1309F, 0.0F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(48, 67).addBox(-0.5F, -0.0503F, 0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.7F, 3.2758F, -2.4231F, 2.6878F, 0.1309F, 0.0F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(70, 32).addBox(-0.5F, -0.55F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7217F, 2.1727F, -2.2585F, 2.0682F, 0.1309F, 0.0F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(30, 77).addBox(-0.5F, 0.7898F, -0.0592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.7F, 3.2758F, -2.4231F, 0.0698F, 0.1309F, 0.0F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(7, 54).addBox(-0.5F, -0.9656F, 0.0052F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.8246F, 4.3285F, -1.4764F, 1.405F, 0.1309F, 0.0F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(54, 29).addBox(-0.1969F, -0.5F, -1.3707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2107F, 5.1657F, -2.0604F, -0.612F, 0.6431F, -1.0368F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(28, 54).addBox(-0.8669F, -0.5F, -1.3396F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2107F, 5.1657F, -2.0604F, -1.817F, 1.0769F, -2.4872F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(20, 70).addBox(-0.5217F, -0.5F, -1.3019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(68, 69).addBox(-0.5217F, -0.5F, -0.3019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2107F, 5.1657F, -2.0604F, -0.9865F, 0.987F, -1.5389F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -0.5F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 5.7934F, -3.3832F, -0.1376F, 0.4761F, -0.0634F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(21, 54).addBox(-0.5F, -1.1411F, 1.974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(42, 45).addBox(-0.5F, -1.1415F, -1.0181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 6.7234F, -0.4566F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(25, 8).addBox(-0.4139F, -0.0009F, -0.405F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2385F, 6.0102F, 3.2308F, 0.0984F, -0.9376F, -0.6284F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(34, 28).addBox(0.0861F, -0.0009F, -0.405F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2385F, 6.0102F, 3.2308F, 0.0203F, -0.6836F, -0.5311F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(33, 43).addBox(0.0861F, -0.0009F, -0.405F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2385F, 6.0102F, 3.2308F, 0.0052F, -0.422F, -0.5069F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(40, 6).addBox(-0.5139F, -0.0009F, -0.505F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4212F, 5.9838F, 2.4524F, 0.1175F, -0.2015F, -0.6762F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(51, 45).addBox(-0.5139F, -0.0009F, -0.405F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5311F, 6.0655F, 1.1596F, 0.098F, -0.0392F, -0.5526F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(25, 10).addBox(-0.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4646F, 6.2921F, -0.0169F, 0.0769F, 0.1827F, -0.8844F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(30, 37).addBox(-0.5F, -0.8F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.1F, 0.2618F, 0.0F, 0.0F));

		PartDefinition frontleftflipper = chest.addOrReplaceChild("frontleftflipper", CubeListBuilder.create().texOffs(36, 52).addBox(-2.2162F, -0.5902F, -0.8511F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(70, 23).addBox(0.6838F, -0.5902F, -0.8511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(69, 45).addBox(3.0652F, -0.5902F, 0.2422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F))
				.texOffs(36, 69).addBox(3.5652F, -0.5902F, 0.2422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.686F, 4.9696F, 0.2526F, 1.0808F, -1.1379F, 0.6591F));

		PartDefinition cube_r52 = frontleftflipper.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(56, 62).addBox(-0.6F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.346F, -0.0902F, 0.2034F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r53 = frontleftflipper.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 54).addBox(-0.7289F, 1.8817F, -0.4991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(6.5635F, -2.3473F, 1.5394F, -0.2182F, 0.9599F, 0.0F));

		PartDefinition cube_r54 = frontleftflipper.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(62, 44).addBox(-1.2515F, 1.5729F, -2.0206F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(6.3828F, -2.155F, 0.7135F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r55 = frontleftflipper.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(9, 44).addBox(-0.6208F, 1.8654F, -0.5875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(6.7767F, -2.3473F, 0.7791F, -0.1745F, 1.1345F, 0.0F));

		PartDefinition cube_r56 = frontleftflipper.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(22, 38).addBox(-0.427F, 1.5729F, -2.0292F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(6.3828F, -2.155F, 0.7135F, 0.0F, 1.4399F, 0.0F));

		PartDefinition cube_r57 = frontleftflipper.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(7, 62).addBox(0.258F, 1.5729F, -1.937F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(42, 62).addBox(0.758F, 1.5729F, -1.937F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(6.3828F, -2.155F, 0.7135F, -3.1416F, 1.4399F, 3.1416F));

		PartDefinition cube_r58 = frontleftflipper.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(70, 20).addBox(-0.005F, 1.6737F, -0.8334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(6.9237F, -2.1474F, -0.1273F, 3.0107F, 1.4399F, 3.1416F));

		PartDefinition cube_r59 = frontleftflipper.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(52, 36).addBox(-0.4532F, 1.7438F, -0.3911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(6.5983F, -2.2473F, 0.1468F, -0.2182F, 1.3963F, 0.0F));

		PartDefinition cube_r60 = frontleftflipper.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(35, 63).addBox(-0.6F, -0.5F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(3.1742F, -0.0902F, -0.6149F, 0.0F, -0.2356F, 0.0F));

		PartDefinition cube_r61 = frontleftflipper.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(25, 73).addBox(-1.6F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(25, 70).addBox(-2.1F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.6838F, -0.0902F, -1.0511F, 0.0F, 0.2443F, 0.0F));

		PartDefinition frontrightflipper = chest.addOrReplaceChild("frontrightflipper", CubeListBuilder.create().texOffs(36, 52).mirror().addBox(-0.7838F, -0.5902F, -0.8511F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(70, 23).mirror().addBox(-1.6838F, -0.5902F, -0.8511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(69, 45).mirror().addBox(-4.0652F, -0.5902F, 0.2422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false)
				.texOffs(36, 69).mirror().addBox(-4.5652F, -0.5902F, 0.2422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.686F, 4.9696F, 0.2526F, 1.0808F, 1.1379F, -0.6591F));

		PartDefinition cube_r62 = frontrightflipper.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(56, 62).mirror().addBox(-1.4F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.346F, -0.0902F, 0.2034F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r63 = frontrightflipper.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.2711F, 1.8817F, -0.4991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-6.5635F, -2.3473F, 1.5394F, -0.2182F, -0.9599F, 0.0F));

		PartDefinition cube_r64 = frontrightflipper.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(62, 44).mirror().addBox(0.2515F, 1.5729F, -2.0206F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-6.3828F, -2.155F, 0.7135F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r65 = frontrightflipper.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(-0.3792F, 1.8654F, -0.5875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-6.7767F, -2.3473F, 0.7791F, -0.1745F, -1.1345F, 0.0F));

		PartDefinition cube_r66 = frontrightflipper.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(22, 38).mirror().addBox(-0.573F, 1.5729F, -2.0292F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-6.3828F, -2.155F, 0.7135F, 0.0F, -1.4399F, 0.0F));

		PartDefinition cube_r67 = frontrightflipper.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(7, 62).mirror().addBox(-1.258F, 1.5729F, -1.937F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(42, 62).mirror().addBox(-1.758F, 1.5729F, -1.937F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-6.3828F, -2.155F, 0.7135F, -3.1416F, -1.4399F, -3.1416F));

		PartDefinition cube_r68 = frontrightflipper.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(70, 20).mirror().addBox(-0.995F, 1.6737F, -0.8334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-6.9237F, -2.1474F, -0.1273F, 3.0107F, -1.4399F, -3.1416F));

		PartDefinition cube_r69 = frontrightflipper.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(52, 36).mirror().addBox(-0.5468F, 1.7438F, -0.3911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-6.5983F, -2.2473F, 0.1468F, -0.2182F, -1.3963F, 0.0F));

		PartDefinition cube_r70 = frontrightflipper.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(35, 63).mirror().addBox(-1.4F, -0.5F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-3.1742F, -0.0902F, -0.6149F, 0.0F, 0.2356F, 0.0F));

		PartDefinition cube_r71 = frontrightflipper.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(25, 73).mirror().addBox(0.6F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(25, 70).mirror().addBox(1.1F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.6838F, -0.0902F, -1.0511F, 0.0F, -0.2443F, 0.0F));

		PartDefinition body = chest.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4367F, 0.0395F, 0.0184F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(22, 81).addBox(0.0F, -0.7715F, -0.0741F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(19, 81).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.1F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(57, 42).mirror().addBox(-5.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5249F, 10.2941F, 0.022F, 0.2627F, -1.2712F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(80, 20).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5249F, 10.2941F, 0.2289F, 0.0969F, -0.2537F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(7, 66).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5249F, 10.2941F, 0.1561F, 0.2132F, -0.7163F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-6.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2249F, 8.2941F, 0.0382F, 0.3127F, -1.2666F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(14, 80).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2249F, 8.2941F, 0.2799F, 0.1099F, -0.2485F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2249F, 8.2941F, 0.1968F, 0.2474F, -0.707F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(36, 50).mirror().addBox(-6.2375F, -1.8712F, -0.5599F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1249F, 6.2941F, 0.0438F, 0.3293F, -1.2648F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(65, 12).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1249F, 6.2941F, 0.2106F, 0.2587F, -0.7036F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(75, 78).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1249F, 6.2941F, 0.297F, 0.1142F, -0.2466F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(70, 78).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0751F, 4.3941F, 0.2561F, 0.0949F, -0.1993F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(65, 10).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0751F, 4.3941F, 0.1818F, 0.2235F, -0.6589F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(49, 27).mirror().addBox(-6.2375F, -1.8712F, -0.5599F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0751F, 4.3941F, 0.0385F, 0.2846F, -1.2149F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(78, 68).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 2.3941F, 0.3131F, 0.1169F, -0.1908F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(65, 8).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 2.3941F, 0.2242F, 0.2683F, -0.6461F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(46, 43).mirror().addBox(-6.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 2.3941F, 0.0502F, 0.3445F, -1.2088F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(65, 78).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 0.3941F, 0.3948F, 0.1459F, -0.2227F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(63, 51).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 0.3941F, 0.2802F, 0.3395F, -0.6596F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(53, 6).mirror().addBox(-5.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 0.3941F, 0.0573F, 0.4332F, -1.2364F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(7, 66).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5249F, 10.2941F, 0.1561F, -0.2132F, 0.7163F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(80, 20).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5249F, 10.2941F, 0.2289F, -0.0969F, 0.2537F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(57, 42).addBox(2.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5249F, 10.2941F, 0.022F, -0.2627F, 1.2712F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 66).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2249F, 8.2941F, 0.1968F, -0.2474F, 0.707F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(14, 80).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2249F, 8.2941F, 0.2799F, -0.1099F, 0.2485F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(51, 0).addBox(2.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2249F, 8.2941F, 0.0382F, -0.3127F, 1.2666F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(36, 50).addBox(2.2375F, -1.8712F, -0.5599F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1249F, 6.2941F, 0.0438F, -0.3293F, 1.2648F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(65, 12).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1249F, 6.2941F, 0.2106F, -0.2587F, 0.7036F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(75, 78).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1249F, 6.2941F, 0.297F, -0.1142F, 0.2466F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(70, 78).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0751F, 4.3941F, 0.2561F, -0.0949F, 0.1993F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(65, 10).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0751F, 4.3941F, 0.1818F, -0.2235F, 0.6589F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(49, 27).addBox(2.2375F, -1.8712F, -0.5599F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0751F, 4.3941F, 0.0385F, -0.2846F, 1.2149F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(78, 68).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 2.3941F, 0.3131F, -0.1169F, 0.1908F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(65, 8).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 2.3941F, 0.2242F, -0.2683F, 0.6461F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(46, 43).addBox(2.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 2.3941F, 0.0502F, -0.3445F, 1.2088F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(65, 78).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 0.3941F, 0.3948F, -0.1459F, 0.2227F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(63, 51).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 0.3941F, 0.2802F, -0.3395F, 0.6596F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(53, 6).addBox(2.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 0.3941F, 0.0573F, -0.4332F, 1.2364F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(83, 32).addBox(0.0F, -1.0001F, 3.9384F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 29).addBox(0.0F, -1.0001F, 1.9384F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 80).addBox(0.0F, -0.8001F, -0.0616F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3087F, 5.9004F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(80, 77).addBox(0.0F, -0.8023F, 0.0479F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5087F, 3.8004F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(19, 13).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0087F, 3.8004F, -0.096F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.5939F, 10.7628F, 0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(83, 38).addBox(0.0F, -1.1F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 35).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(33, 81).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(25, 81).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(14, 66).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0466F, 7.5917F, 0.1807F, 0.2888F, -1.0719F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(80, 22).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0466F, 7.5917F, 0.2844F, 0.1538F, -0.6085F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(25, 79).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0466F, 5.5917F, 0.3575F, 0.2033F, -0.5955F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(65, 18).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0466F, 5.5917F, 0.2254F, 0.3651F, -1.0575F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(20, 79).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 3.5917F, 0.2912F, 0.1586F, -0.5378F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(54, 33).mirror().addBox(-3.8817F, -0.4515F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 3.5917F, 0.1848F, 0.296F, -1.0011F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(79, 3).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 1.5917F, 0.3194F, 0.1584F, -0.2894F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(65, 16).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 1.5917F, 0.211F, 0.3082F, -0.7494F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(65, 14).mirror().addBox(-4.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 1.5917F, 0.0159F, 0.3713F, -1.3203F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(80, 22).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0466F, 7.5917F, 0.2844F, -0.1538F, 0.6085F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(14, 66).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0466F, 7.5917F, 0.1807F, -0.2888F, 1.0719F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(25, 79).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0466F, 5.5917F, 0.3575F, -0.2033F, 0.5955F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(65, 18).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0466F, 5.5917F, 0.2254F, -0.3651F, 1.0575F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(20, 79).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 3.5917F, 0.2912F, -0.1586F, 0.5378F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(54, 33).addBox(0.8817F, -0.4515F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 3.5917F, 0.1848F, -0.296F, 1.0011F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(79, 3).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 1.5917F, 0.3194F, -0.1584F, 0.2894F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(65, 16).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 1.5917F, 0.211F, -0.3082F, 0.7494F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(65, 14).addBox(2.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 1.5917F, 0.0159F, -0.3713F, 1.3203F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0698F, 7.9988F, 0.25F, 0.2116F, 0.0536F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(75, 80).addBox(-0.5F, -1.5F, 3.925F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 74).addBox(-0.5F, -1.2F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 80).addBox(-0.5F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(83, 47).addBox(-0.5F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(36, 81).addBox(-0.5F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(78, 58).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 9.4917F, 0.4006F, 0.2865F, -0.6299F));

		PartDefinition cube_r138 = body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(78, 56).mirror().addBox(-1.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 9.4917F, 0.2252F, 0.4582F, -1.1025F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(77, 18).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 7.4917F, 0.3641F, 0.2606F, -0.6398F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(76, 66).mirror().addBox(-1.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 7.4917F, 0.2036F, 0.4192F, -1.1116F));

		PartDefinition cube_r141 = body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(58, 20).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 5.4917F, 0.3641F, 0.2606F, -0.6398F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(44, 8).mirror().addBox(-1.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 5.4917F, 0.2036F, 0.4192F, -1.1116F));

		PartDefinition cube_r143 = body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(80, 24).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 3.5917F, 0.3695F, 0.2533F, -0.6047F));

		PartDefinition cube_r144 = body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(31, 66).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 3.5917F, 0.2124F, 0.415F, -1.0743F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(79, 41).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 1.5917F, 0.3132F, 0.1922F, -0.5678F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(49, 65).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 1.5917F, 0.1893F, 0.3358F, -1.0335F));

		PartDefinition cube_r147 = body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(78, 56).addBox(0.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 9.4917F, 0.2252F, -0.4582F, 1.1025F));

		PartDefinition cube_r148 = body3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(78, 58).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 9.4917F, 0.4006F, -0.2865F, 0.6299F));

		PartDefinition cube_r149 = body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(76, 66).addBox(0.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 7.4917F, 0.2036F, -0.4192F, 1.1116F));

		PartDefinition cube_r150 = body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(77, 18).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 7.4917F, 0.3641F, -0.2606F, 0.6398F));

		PartDefinition cube_r151 = body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(58, 20).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 5.4917F, 0.3641F, -0.2606F, 0.6398F));

		PartDefinition cube_r152 = body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(44, 8).addBox(0.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 5.4917F, 0.2036F, -0.4192F, 1.1116F));

		PartDefinition cube_r153 = body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(80, 24).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 3.5917F, 0.3695F, -0.2533F, 0.6047F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(31, 66).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 3.5917F, 0.2124F, -0.415F, 1.0743F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(79, 41).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 1.5917F, 0.3132F, -0.1922F, 0.5678F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(49, 65).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 1.5917F, 0.1893F, -0.3358F, 1.0335F));

		PartDefinition hips = body3.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(30, 30).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.012F, 11.0062F, 0.2009F, 0.2504F, -0.1232F));

		PartDefinition cube_r157 = hips.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(72, 80).addBox(-0.5F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 4.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r158 = hips.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(69, 80).addBox(-0.5F, -0.725F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r159 = hips.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(39, 81).addBox(-0.5F, -0.775F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r160 = hips.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(79, 43).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 0.5917F, 0.0739F, 0.0642F, -0.7366F));

		PartDefinition cube_r161 = hips.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(49, 18).mirror().addBox(-1.0F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1037F, 3.4391F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r162 = hips.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(-0.5064F, -0.1415F, -0.2063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 29).mirror().addBox(-0.5064F, -0.7415F, -0.2063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.1525F, 1.2471F, 0.8626F, -1.2972F, -0.0715F, 0.5003F));

		PartDefinition cube_r163 = hips.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(45, 54).mirror().addBox(-0.5064F, -0.5707F, -1.3541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1525F, 1.2471F, 0.8626F, -1.175F, -0.0715F, 0.5003F));

		PartDefinition cube_r164 = hips.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(40, 78).mirror().addBox(-0.853F, -0.4241F, -0.6384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.5968F, 2.6158F, 0.8039F, -0.0352F, 0.5048F, 0.4719F));

		PartDefinition cube_r165 = hips.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(66, 66).mirror().addBox(-1.7018F, -0.4241F, -0.3398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(66, 53).mirror().addBox(-1.3018F, -0.4241F, -0.3398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(67, 2).mirror().addBox(-1.3018F, -0.4241F, -0.6398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(49, 62).mirror().addBox(-0.7018F, -0.4241F, -0.6398F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.5968F, 2.6158F, 0.8039F, -0.0308F, 0.0164F, 0.4884F));

		PartDefinition cube_r166 = hips.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(70, 48).mirror().addBox(-1.361F, -0.4241F, -1.2501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5968F, 2.6158F, 0.8039F, -0.0396F, 0.6792F, 0.4641F));

		PartDefinition cube_r167 = hips.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(61, 66).mirror().addBox(-1.1806F, -0.1416F, -0.4117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5935F, 2.6002F, 1.8127F, 0.3251F, -0.1594F, 0.8068F));

		PartDefinition cube_r168 = hips.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(43, 66).mirror().addBox(-1.2658F, -0.1416F, 0.1785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.5935F, 2.6002F, 1.8127F, 0.4962F, -0.8467F, 0.475F));

		PartDefinition cube_r169 = hips.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(78, 26).mirror().addBox(-1.703F, -0.1416F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(78, 38).mirror().addBox(-1.103F, -0.1416F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.5935F, 2.6002F, 1.8127F, 0.3402F, -0.3327F, 0.7452F));

		PartDefinition cube_r170 = hips.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(50, 78).mirror().addBox(-0.8042F, -0.3013F, -0.3953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5935F, 2.6002F, 1.8127F, 0.2847F, -0.0342F, 0.4667F));

		PartDefinition cube_r171 = hips.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(63, 48).mirror().addBox(-0.7286F, -0.297F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.5935F, 2.6002F, 1.8127F, 0.4326F, -0.1931F, 0.3938F));

		PartDefinition cube_r172 = hips.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(79, 43).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 0.5917F, 0.0739F, -0.0642F, 0.7366F));

		PartDefinition cube_r173 = hips.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(49, 18).addBox(0.0F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1037F, 3.4391F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r174 = hips.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(35, 78).addBox(-0.4936F, -0.1415F, -0.2063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 29).addBox(-0.4936F, -0.7415F, -0.2063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.1525F, 1.2471F, 0.8626F, -1.2972F, 0.0715F, -0.5003F));

		PartDefinition cube_r175 = hips.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(45, 54).addBox(-0.4936F, -0.5707F, -1.3541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1525F, 1.2471F, 0.8626F, -1.175F, 0.0715F, -0.5003F));

		PartDefinition cube_r176 = hips.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(40, 78).addBox(-0.147F, -0.4241F, -0.6384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5968F, 2.6158F, 0.8039F, -0.0352F, -0.5048F, -0.4719F));

		PartDefinition cube_r177 = hips.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(66, 66).addBox(0.7018F, -0.4241F, -0.3398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(66, 53).addBox(0.3018F, -0.4241F, -0.3398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(67, 2).addBox(0.3018F, -0.4241F, -0.6398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(49, 62).addBox(-1.2982F, -0.4241F, -0.6398F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.5968F, 2.6158F, 0.8039F, -0.0308F, -0.0164F, -0.4884F));

		PartDefinition cube_r178 = hips.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(70, 48).addBox(0.361F, -0.4241F, -1.2501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5968F, 2.6158F, 0.8039F, -0.0396F, -0.6792F, -0.4641F));

		PartDefinition cube_r179 = hips.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(61, 66).addBox(0.1806F, -0.1416F, -0.4117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5935F, 2.6002F, 1.8127F, 0.3251F, 0.1594F, -0.8068F));

		PartDefinition cube_r180 = hips.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(43, 66).addBox(0.2658F, -0.1416F, 0.1785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5935F, 2.6002F, 1.8127F, 0.4962F, 0.8467F, -0.475F));

		PartDefinition cube_r181 = hips.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(78, 26).addBox(0.703F, -0.1416F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(78, 38).addBox(0.103F, -0.1416F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5935F, 2.6002F, 1.8127F, 0.3402F, 0.3327F, -0.7452F));

		PartDefinition cube_r182 = hips.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(50, 78).addBox(-0.1958F, -0.3013F, -0.3953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5935F, 2.6002F, 1.8127F, 0.2847F, 0.0342F, -0.4667F));

		PartDefinition cube_r183 = hips.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(63, 48).addBox(-1.2714F, -0.297F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.5935F, 2.6002F, 1.8127F, 0.4326F, 0.1931F, -0.3938F));

		PartDefinition cube_r184 = hips.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(78, 53).addBox(-1.5935F, 0.1164F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5935F, 2.6002F, 1.8127F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r185 = hips.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(63, 80).addBox(0.0F, -3.0F, -3.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.107F, 6.4002F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r186 = hips.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(38, 66).addBox(-1.5968F, 0.0484F, -0.6398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5968F, 2.6158F, 0.8039F, -0.0349F, 0.0F, 0.0F));

		PartDefinition backleftflipper = hips.addOrReplaceChild("backleftflipper", CubeListBuilder.create().texOffs(53, 69).addBox(2.4838F, -0.5902F, -0.0511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0075F, 2.0367F, 0.9293F, 0.4084F, -1.0444F, 1.1143F));

		PartDefinition cube_r187 = backleftflipper.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(28, 62).addBox(-0.25F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(55, 78).addBox(-0.75F, -0.5F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(21, 62).addBox(-0.75F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(6.2733F, 0.1098F, 1.2034F, 0.0F, 1.2654F, 0.0F));

		PartDefinition cube_r188 = backleftflipper.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(18, 49).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(5.9397F, 0.1098F, 1.8018F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r189 = backleftflipper.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(14, 62).addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(5.4447F, 0.1098F, 2.2968F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r190 = backleftflipper.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(61, 39).addBox(-1.3F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(4.5838F, -0.0902F, 1.0489F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r191 = backleftflipper.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(61, 30).addBox(-0.55F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(4.2554F, -0.0902F, 0.3164F, 0.0F, -0.2356F, 0.0F));

		PartDefinition cube_r192 = backleftflipper.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.7587F, -0.0902F, 0.373F, 0.0F, 0.1134F, 0.0F));

		PartDefinition cube_r193 = backleftflipper.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(51, 47).addBox(-3.3F, 0.0F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.2838F, -0.5902F, 0.2489F, 0.0F, -0.1309F, 0.0F));

		PartDefinition backrightflipper = hips.addOrReplaceChild("backrightflipper", CubeListBuilder.create().texOffs(53, 69).mirror().addBox(-3.4838F, -0.5902F, -0.0511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0075F, 2.0367F, 0.9293F, 0.4084F, 1.0444F, -1.1143F));

		PartDefinition cube_r194 = backrightflipper.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(28, 62).mirror().addBox(-0.75F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(55, 78).mirror().addBox(-0.25F, -0.5F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(21, 62).mirror().addBox(-0.25F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-6.2733F, 0.1098F, 1.2034F, 0.0F, -1.2654F, 0.0F));

		PartDefinition cube_r195 = backrightflipper.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(18, 49).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-5.9397F, 0.1098F, 1.8018F, 0.0F, -1.0036F, 0.0F));

		PartDefinition cube_r196 = backrightflipper.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(14, 62).mirror().addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-5.4447F, 0.1098F, 2.2968F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r197 = backrightflipper.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(61, 39).mirror().addBox(-0.7F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-4.5838F, -0.0902F, 1.0489F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r198 = backrightflipper.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(61, 30).mirror().addBox(-1.45F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-4.2554F, -0.0902F, 0.3164F, 0.0F, 0.2356F, 0.0F));

		PartDefinition cube_r199 = backrightflipper.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.7587F, -0.0902F, 0.373F, 0.0F, -0.1134F, 0.0F));

		PartDefinition cube_r200 = backrightflipper.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(51, 47).mirror().addBox(0.3F, 0.0F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.2838F, -0.5902F, 0.2489F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.007F, 4.9002F, 0.0816F, 0.0144F, -0.1739F));

		PartDefinition cube_r201 = tail.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(48, 81).addBox(-0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r202 = tail.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(42, 55).addBox(-0.5F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r203 = tail.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(42, 81).addBox(-0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r204 = tail.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(11, 80).addBox(0.0F, 0.3964F, 1.8546F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 79).addBox(0.0F, -0.4036F, -0.1454F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7F, 2.4F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r205 = tail.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(60, 80).addBox(0.0F, -1.2F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1F, 0.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r206 = tail.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(34, 22).mirror().addBox(-0.7F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, 3.5F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r207 = tail.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(34, 22).addBox(-0.3F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 3.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 30).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.1179F, 0.1898F, -0.1074F));

		PartDefinition cube_r208 = tail2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(54, 81).addBox(-0.5F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r209 = tail2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(51, 81).addBox(-0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r210 = tail2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(81, 50).addBox(-0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r211 = tail2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 80).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.829F, 4.2018F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r212 = tail2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(30, 80).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6749F, 1.5814F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r213 = tail2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(36, 10).mirror().addBox(-0.7F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, 3.5F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r214 = tail2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(36, 10).addBox(-0.3F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 3.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(25, 0).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r215 = tail3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(81, 70).addBox(-0.5F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r216 = tail3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(81, 65).addBox(-0.5F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r217 = tail3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(45, 83).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.442F, 5.2872F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r218 = tail3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(81, 62).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8176F, 3.2018F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r219 = tail3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(3, 80).addBox(0.0F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.9031F, 0.762F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r220 = tail3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(57, 81).addBox(-0.5F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r221 = tail3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(36, 16).mirror().addBox(-0.5F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, 3.5F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r222 = tail3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(36, 16).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 3.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 22).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r223 = tail4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(15, 27).addBox(-0.5F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r224 = tail4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(80, 47).addBox(-0.5F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r225 = tail4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(80, 32).addBox(-0.5F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r226 = tail4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(82, 0).addBox(0.0F, 9.9964F, 13.8546F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 80).addBox(0.0F, 8.8964F, 11.8546F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7F, -13.6F, 0.6458F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(43, 30).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0174F, 5.9015F, 0.1883F, -0.0857F, -0.0163F));

		PartDefinition cube_r227 = tail5.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(6, 82).addBox(-0.5F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 3.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r228 = tail5.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(82, 5).addBox(-0.5F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(11, 38).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0292F, 3.9044F, 0.0616F, -0.1307F, -0.008F));

		PartDefinition cube_r229 = tail6.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(82, 11).addBox(-0.5F, -0.3F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 4.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r230 = tail6.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(82, 8).addBox(-0.5F, -0.4F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0259F, 3.9034F, -0.0698F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -3.7F, 0.1445F, -0.2592F, -0.0373F));

		PartDefinition cube_r231 = neck.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(14, 82).addBox(0.5F, -0.7925F, -0.9738F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3F, -1.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r232 = neck.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(22, 43).addBox(0.0F, -0.7F, -1.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -2.8F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r233 = neck.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(6, 80).mirror().addBox(-1.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1249F, -1.5059F, 0.526F, 0.6666F, -0.9684F));

		PartDefinition cube_r234 = neck.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(79, 45).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1249F, -1.5059F, 0.7371F, 0.3639F, -0.5494F));

		PartDefinition cube_r235 = neck.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(6, 80).addBox(0.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1249F, -1.5059F, 0.526F, -0.6666F, 0.9684F));

		PartDefinition cube_r236 = neck.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(79, 45).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1249F, -1.5059F, 0.7371F, -0.3639F, 0.5494F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4433F, -3.6012F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r237 = neck2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(83, 26).addBox(0.5F, -0.7F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 0.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r238 = neck2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(82, 17).addBox(0.5F, -1.1F, -2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(0.0F, -0.6F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(82, 14).mirror().addBox(0.0F, -0.4781F, -0.0121F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1F, -2.5F, -0.7311F, -0.4539F, 0.7292F));

		PartDefinition cube_r240 = neck2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(66, 35).mirror().addBox(0.0F, -0.7781F, -0.0121F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1F, -0.9F, -0.7311F, -0.4539F, 0.7292F));

		PartDefinition cube_r241 = neck2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(82, 14).addBox(0.0F, -0.4781F, -0.0121F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1F, -2.5F, -0.7311F, 0.4539F, -0.7292F));

		PartDefinition cube_r242 = neck2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(66, 35).addBox(0.0F, -0.7781F, -0.0121F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.1F, -0.9F, -0.7311F, 0.4539F, -0.7292F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4349F, -3.9015F, -0.1865F, -0.4755F, 0.0182F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 71).addBox(-1.1671F, -0.6867F, -0.5171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8103F, -0.9456F, -0.8095F, -0.1075F, 0.2256F, -0.0241F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(45, 73).addBox(-0.5F, -0.3693F, -0.6097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(63, 23).addBox(-1.0F, -0.3693F, -1.4097F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(63, 20).addBox(-1.0F, -0.3693F, -1.0097F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.3071F, -1.849F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(56, 22).addBox(-0.5F, -0.3693F, -0.2847F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.0F, -1.3071F, -1.849F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(47, 50).addBox(-1.0F, -0.3379F, -1.8055F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, -1.48F, -2.8193F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(61, 26).mirror().addBox(-0.168F, -0.5517F, -1.0222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(61, 26).addBox(0.032F, -0.5517F, -1.0222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F))
				.texOffs(35, 55).addBox(-0.068F, -0.5517F, -1.0222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.432F, -1.1019F, -4.9548F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(21, 58).addBox(-1.0F, -0.332F, -1.6384F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, -1.1924F, -7.0884F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.3F, -0.3604F, -0.289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.1167F, -7.0553F, 0.095F, -0.1435F, -0.0099F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 62).addBox(-0.7F, -0.3604F, -0.289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, -1.1167F, -7.0553F, 0.095F, 0.1435F, 0.0099F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(52, 54).addBox(-1.0F, -0.3111F, -1.6856F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -1.2973F, -5.6948F, 0.096F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.9F, -1.3478F, -0.4013F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(56, 65).addBox(-0.8414F, -0.3632F, -0.5081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.52F, 1.1476F, -0.5559F, 1.2564F, 0.7973F, -0.1809F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(56, 72).addBox(-0.45F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.596F, 0.3953F, 0.1105F, 1.5257F, 1.4427F, 0.2005F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(51, 72).addBox(-0.7977F, -0.6062F, -0.3809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0897F, 0.4022F, -0.4082F, 1.7651F, 1.181F, 0.2312F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(77, 9).addBox(-0.7977F, -0.2617F, -0.3705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.0897F, 0.4022F, -0.4082F, 1.5556F, 1.181F, 0.2312F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(40, 72).addBox(-0.7697F, -0.7591F, -0.3605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0897F, 0.4022F, -0.4082F, 1.506F, 0.8201F, 0.0278F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(35, 72).addBox(-0.7697F, -1.0997F, -0.2968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.0897F, 0.4022F, -0.4082F, 1.6631F, 0.8201F, 0.0278F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(72, 17).addBox(-0.7806F, -0.8425F, -0.3605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.0897F, 0.4022F, -0.4082F, 1.4531F, 1.1853F, -0.0339F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(63, 69).addBox(-0.5313F, -0.5096F, -0.1605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6718F, 1.3736F, 0.1861F, 0.4855F, 0.2022F, 0.055F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(69, 42).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6711F, 0.84F, 0.1643F, 0.9338F, 0.2094F, 0.0F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(58, 69).addBox(-0.5313F, -0.2618F, -0.3276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.6718F, 1.3736F, 0.1861F, 1.2099F, 0.2022F, 0.055F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(63, 62).addBox(-0.6855F, -1.6913F, -0.721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.625F, 0.1175F, -1.1523F, 1.5074F, 0.2455F, -0.06F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(63, 58).addBox(-1.2008F, -1.7232F, -0.637F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, 0.4F, 0.1F, 1.3813F, 0.2193F, -0.0583F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(77, 15).addBox(-0.55F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 77).addBox(-0.55F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.58F, 0.1761F, -1.5581F, -0.1582F, -0.7122F, 0.0535F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(0, 58).addBox(-0.69F, -0.3052F, -1.7047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2001F, -0.0353F, -3.9193F, 0.0618F, 0.2279F, 0.0187F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(73, 38).addBox(-0.6962F, 1.1274F, 0.3356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-1.0625F, 0.5709F, -3.3558F, 1.1432F, 0.1833F, 0.0F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(73, 29).addBox(-0.6962F, 1.0643F, 0.0919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0625F, 0.5709F, -3.3558F, 1.0559F, 0.1833F, 0.0F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(49, 58).addBox(-0.6962F, -0.8095F, -0.3114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(42, 58).addBox(-0.6962F, -0.5095F, -0.3114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F))
				.texOffs(28, 58).addBox(-0.6962F, -0.1095F, -0.3114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0625F, 0.5709F, -3.3558F, -0.048F, 0.1833F, 0.0F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(73, 60).addBox(-0.6712F, -0.2606F, -0.3453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(73, 57).addBox(-0.6712F, -0.2606F, 0.0547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0625F, 0.5709F, -3.3558F, 0.5105F, 0.1833F, 0.0F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(10, 74).addBox(-0.6712F, -1.252F, -0.5688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(77, 12).addBox(-0.5825F, -1.577F, -0.4938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 77).addBox(-0.6462F, -1.577F, -0.4938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(21, 66).addBox(-0.6712F, -1.6519F, -0.2688F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-1.0625F, 0.5709F, -3.3558F, -1.6101F, 0.1833F, 0.0F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(5, 74).addBox(-0.6712F, -1.3221F, 0.5828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.0625F, 0.5709F, -3.3558F, -0.781F, 0.1833F, 0.0F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(74, 3).addBox(-0.6712F, -1.364F, 0.7774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.0625F, 0.5709F, -3.3558F, -0.5192F, 0.1833F, 0.0F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 74).addBox(-0.6712F, -0.8069F, 0.7378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0625F, 0.5709F, -3.3558F, -0.0829F, 0.1833F, 0.0F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(73, 68).addBox(-0.6712F, -0.4712F, 0.4385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.0625F, 0.5709F, -3.3558F, 0.2269F, 0.1833F, 0.0F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(59, 35).addBox(-0.4964F, -0.4752F, -0.9854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.3851F, 0.5752F, -3.9202F, -0.0829F, 0.192F, 0.0F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(35, 59).addBox(-0.4964F, -0.7722F, -0.9692F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.3851F, 0.5752F, -3.9202F, 0.048F, 0.192F, 0.0F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(60, 2).addBox(-0.5F, -0.636F, -0.9675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.6183F, 0.5259F, -5.1823F, 0.0567F, 0.1745F, 0.0F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(49, 13).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.6199F, 0.3451F, -5.7531F, 0.0526F, 0.1265F, 0.0018F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(9, 49).addBox(-0.6711F, -0.3985F, -0.4148F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.6901F, 0.3778F, -7.8417F, 0.0524F, 0.0916F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(49, 8).addBox(-0.6711F, -0.404F, -0.4163F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-1.6901F, 0.3778F, -7.8417F, -0.0829F, 0.0916F, 0.0F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(59, 54).addBox(-0.5F, -0.3604F, -1.0084F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6183F, 0.5259F, -5.1823F, -0.1178F, 0.1745F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(56, 58).addBox(-0.4964F, -0.226F, -0.9964F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.3851F, 0.5752F, -3.9202F, -0.1702F, 0.192F, 0.0F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(72, 14).addBox(-0.6962F, 0.3716F, 0.7563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-1.0625F, 0.5709F, -3.3558F, 0.3447F, 0.1833F, 0.0F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(56, 50).addBox(-0.5F, -0.4F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.7609F, 1.0031F, -0.9608F, 0.1917F, -0.0088F, 0.0043F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(76, 35).addBox(0.1F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(45, 76).addBox(0.1F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.8923F, 1.1199F, -3.6229F, 0.1425F, -0.0204F, -0.0303F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(20, 76).addBox(-0.5753F, -0.5146F, 0.0983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(25, 76).addBox(-0.5753F, -0.3146F, 0.0983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(70, 75).addBox(-0.5753F, -0.5646F, -0.3017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(75, 75).addBox(-0.5753F, -0.3646F, -0.3017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(60, 75).addBox(-0.5753F, -0.4646F, -0.7017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(65, 75).addBox(-0.5753F, -0.6646F, -0.7017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(50, 75).addBox(-0.5753F, -0.6646F, -1.1017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(55, 75).addBox(-0.5753F, -0.4646F, -1.1017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.3977F, 1.0747F, -4.6145F, 0.0563F, 0.1974F, -0.0181F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(40, 75).addBox(-0.449F, -0.3567F, 0.0986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(75, 47).addBox(-0.449F, -0.5567F, 0.0986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(75, 32).addBox(-0.449F, -0.4567F, -0.3014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F))
				.texOffs(35, 75).addBox(-0.449F, -0.5567F, -0.3014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(75, 20).addBox(-0.449F, -0.5067F, -0.7014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F))
				.texOffs(75, 23).addBox(-0.449F, -0.6067F, -0.7014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(74, 44).addBox(-0.449F, -0.5067F, -1.1014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F))
				.texOffs(74, 41).addBox(-0.449F, -0.6067F, -1.1014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.7708F, 0.9295F, -6.2262F, -0.0323F, 0.1235F, -0.0349F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(30, 74).addBox(-0.8474F, -0.3549F, -5.1622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(15, 74).addBox(-0.8474F, -0.3299F, -5.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(72, 11).addBox(-0.5474F, -0.4549F, -1.0122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.565F, 1.161F, -2.5655F, -0.1193F, -0.0204F, -0.0303F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(72, 8).addBox(-0.5474F, -0.5676F, -0.9673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.565F, 1.161F, -2.5655F, -0.4073F, -0.0204F, -0.0303F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(72, 0).addBox(-0.4785F, -0.419F, -0.6976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.565F, 1.161F, -2.5655F, -0.1618F, 0.2852F, -0.2136F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(71, 65).addBox(-0.4785F, -0.5691F, -0.6361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.565F, 1.161F, -2.5655F, -0.4585F, 0.2852F, -0.2136F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(71, 51).addBox(-0.4776F, -0.3059F, -0.4007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.565F, 1.161F, -2.5655F, 0.0151F, 0.0017F, -0.0764F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(71, 35).addBox(-0.4776F, -0.5691F, -0.3555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.565F, 1.161F, -2.5655F, -0.4387F, 0.0017F, -0.0764F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(30, 71).addBox(-0.4714F, -0.2651F, -0.1143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.565F, 1.161F, -2.5655F, -0.0247F, 0.0161F, -0.0219F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(15, 71).addBox(-0.4714F, -0.4802F, 0.0156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.565F, 1.161F, -2.5655F, -0.1468F, 0.0161F, -0.0219F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(73, 26).addBox(-0.6378F, -0.8868F, 0.5544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(10, 71).addBox(-0.6378F, -1.2867F, 0.5544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-1.7622F, 1.6646F, -1.5577F, 0.532F, -0.0088F, 0.0043F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(73, 54).addBox(-0.7493F, -0.5159F, -0.5529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 71).addBox(-0.7493F, -0.5159F, -0.1529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.52F, 1.1476F, -0.5559F, -0.2359F, -0.0077F, 0.0061F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.9F, -1.3478F, -0.4013F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(56, 65).mirror().addBox(-0.1586F, -0.3632F, -0.5081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.52F, 1.1476F, -0.5559F, 1.2564F, -0.7973F, 0.1809F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(56, 72).mirror().addBox(-0.55F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.596F, 0.3953F, 0.1105F, 1.5257F, -1.4427F, -0.2005F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(51, 72).mirror().addBox(-0.2023F, -0.6062F, -0.3809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0897F, 0.4022F, -0.4082F, 1.7651F, -1.181F, -0.2312F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(77, 9).mirror().addBox(-0.2023F, -0.2617F, -0.3705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.0897F, 0.4022F, -0.4082F, 1.5556F, -1.181F, -0.2312F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(40, 72).mirror().addBox(-0.2303F, -0.7591F, -0.3605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0897F, 0.4022F, -0.4082F, 1.506F, -0.8201F, -0.0278F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(35, 72).mirror().addBox(-0.2303F, -1.0997F, -0.2968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(1.0897F, 0.4022F, -0.4082F, 1.6631F, -0.8201F, -0.0278F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(72, 17).mirror().addBox(-0.2194F, -0.8425F, -0.3605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(1.0897F, 0.4022F, -0.4082F, 1.4531F, -1.1853F, 0.0339F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(63, 69).mirror().addBox(-0.4687F, -0.5096F, -0.1605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6718F, 1.3736F, 0.1861F, 0.4855F, -0.2022F, -0.055F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(69, 42).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6711F, 0.84F, 0.1643F, 0.9338F, -0.2094F, 0.0F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(58, 69).mirror().addBox(-0.4687F, -0.2618F, -0.3276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.6718F, 1.3736F, 0.1861F, 1.2099F, -0.2022F, -0.055F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(63, 62).mirror().addBox(-0.3145F, -1.6913F, -0.721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.625F, 0.1175F, -1.1523F, 1.5074F, -0.2455F, 0.06F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(63, 58).mirror().addBox(0.2008F, -1.7232F, -0.637F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.4F, 0.1F, 1.3813F, -0.2193F, 0.0583F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(77, 15).mirror().addBox(-0.45F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 77).mirror().addBox(-0.45F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.58F, 0.1761F, -1.5581F, -0.1582F, 0.7122F, -0.0535F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.31F, -0.3052F, -1.7047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2001F, -0.0353F, -3.9193F, 0.0618F, -0.2279F, -0.0187F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-0.3038F, 1.1274F, 0.3356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(1.0625F, 0.5709F, -3.3558F, 1.1432F, -0.1833F, 0.0F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(73, 29).mirror().addBox(-0.3038F, 1.0643F, 0.0919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0625F, 0.5709F, -3.3558F, 1.0559F, -0.1833F, 0.0F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(49, 58).mirror().addBox(-0.3038F, -0.8095F, -0.3114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(42, 58).mirror().addBox(-0.3038F, -0.5095F, -0.3114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(28, 58).mirror().addBox(-0.3038F, -0.1095F, -0.3114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0625F, 0.5709F, -3.3558F, -0.048F, -0.1833F, 0.0F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(73, 60).mirror().addBox(-0.3288F, -0.2606F, -0.3453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(73, 57).mirror().addBox(-0.3288F, -0.2606F, 0.0547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0625F, 0.5709F, -3.3558F, 0.5105F, -0.1833F, 0.0F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(10, 74).mirror().addBox(-0.3288F, -1.252F, -0.5688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(77, 12).mirror().addBox(-0.4175F, -1.577F, -0.4938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(10, 77).mirror().addBox(-0.3538F, -1.577F, -0.4938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(21, 66).mirror().addBox(-0.3288F, -1.6519F, -0.2688F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(1.0625F, 0.5709F, -3.3558F, -1.6101F, -0.1833F, 0.0F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(5, 74).mirror().addBox(-0.3288F, -1.3221F, 0.5828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.0625F, 0.5709F, -3.3558F, -0.781F, -0.1833F, 0.0F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(74, 3).mirror().addBox(-0.3288F, -1.364F, 0.7774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.0625F, 0.5709F, -3.3558F, -0.5192F, -0.1833F, 0.0F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.3288F, -0.8069F, 0.7378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0625F, 0.5709F, -3.3558F, -0.0829F, -0.1833F, 0.0F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(73, 68).mirror().addBox(-0.3288F, -0.4712F, 0.4385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.0625F, 0.5709F, -3.3558F, 0.2269F, -0.1833F, 0.0F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(59, 35).mirror().addBox(-0.5036F, -0.4752F, -0.9854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.3851F, 0.5752F, -3.9202F, -0.0829F, -0.192F, 0.0F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(35, 59).mirror().addBox(-0.5036F, -0.7722F, -0.9692F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.3851F, 0.5752F, -3.9202F, 0.048F, -0.192F, 0.0F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(60, 2).mirror().addBox(-0.5F, -0.636F, -0.9675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.6183F, 0.5259F, -5.1823F, 0.0567F, -0.1745F, 0.0F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(49, 13).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.6199F, 0.3451F, -5.7531F, 0.0526F, -0.1265F, -0.0018F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(9, 49).mirror().addBox(-0.3289F, -0.3985F, -0.4148F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.6901F, 0.3778F, -7.8417F, 0.0524F, -0.0916F, 0.0F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(49, 8).mirror().addBox(-0.3289F, -0.404F, -0.4163F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(1.6901F, 0.3778F, -7.8417F, -0.0829F, -0.0916F, 0.0F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(59, 54).mirror().addBox(-0.5F, -0.3604F, -1.0084F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6183F, 0.5259F, -5.1823F, -0.1178F, -0.1745F, 0.0F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(56, 58).mirror().addBox(-0.5036F, -0.226F, -0.9964F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.3851F, 0.5752F, -3.9202F, -0.1702F, -0.192F, 0.0F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(72, 14).mirror().addBox(-0.3038F, 0.3716F, 0.7563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(1.0625F, 0.5709F, -3.3558F, 0.3447F, -0.1833F, 0.0F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(56, 50).mirror().addBox(-0.5F, -0.4F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.7609F, 1.0031F, -0.9608F, 0.1917F, 0.0088F, -0.0043F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(76, 35).mirror().addBox(-1.1F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(45, 76).mirror().addBox(-1.1F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.8923F, 1.1199F, -3.6229F, 0.1425F, 0.0204F, 0.0303F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(20, 76).mirror().addBox(-0.4247F, -0.5146F, 0.0983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(25, 76).mirror().addBox(-0.4247F, -0.3146F, 0.0983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(70, 75).mirror().addBox(-0.4247F, -0.5646F, -0.3017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(75, 75).mirror().addBox(-0.4247F, -0.3646F, -0.3017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(60, 75).mirror().addBox(-0.4247F, -0.4646F, -0.7017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(65, 75).mirror().addBox(-0.4247F, -0.6646F, -0.7017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(50, 75).mirror().addBox(-0.4247F, -0.6646F, -1.1017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(55, 75).mirror().addBox(-0.4247F, -0.4646F, -1.1017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.3977F, 1.0747F, -4.6145F, 0.0563F, -0.1974F, 0.0181F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(40, 75).mirror().addBox(-0.551F, -0.3567F, 0.0986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(75, 47).mirror().addBox(-0.551F, -0.5567F, 0.0986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(75, 32).mirror().addBox(-0.551F, -0.4567F, -0.3014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false)
				.texOffs(35, 75).mirror().addBox(-0.551F, -0.5567F, -0.3014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(75, 20).mirror().addBox(-0.551F, -0.5067F, -0.7014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false)
				.texOffs(75, 23).mirror().addBox(-0.551F, -0.6067F, -0.7014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(74, 44).mirror().addBox(-0.551F, -0.5067F, -1.1014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false)
				.texOffs(74, 41).mirror().addBox(-0.551F, -0.6067F, -1.1014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.7708F, 0.9295F, -6.2262F, -0.0323F, -0.1235F, 0.0349F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(30, 74).mirror().addBox(-0.1526F, -0.3549F, -5.1622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(15, 74).mirror().addBox(-0.1526F, -0.3299F, -5.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(72, 11).mirror().addBox(-0.4526F, -0.4549F, -1.0122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.565F, 1.161F, -2.5655F, -0.1193F, 0.0204F, 0.0303F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(72, 8).mirror().addBox(-0.4526F, -0.5676F, -0.9673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.565F, 1.161F, -2.5655F, -0.4073F, 0.0204F, 0.0303F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-0.5215F, -0.419F, -0.6976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.565F, 1.161F, -2.5655F, -0.1618F, -0.2852F, 0.2136F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(71, 65).mirror().addBox(-0.5215F, -0.5691F, -0.6361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.565F, 1.161F, -2.5655F, -0.4585F, -0.2852F, 0.2136F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(71, 51).mirror().addBox(-0.5224F, -0.3059F, -0.4007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.565F, 1.161F, -2.5655F, 0.0151F, -0.0017F, 0.0764F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(71, 35).mirror().addBox(-0.5224F, -0.5691F, -0.3555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(1.565F, 1.161F, -2.5655F, -0.4387F, -0.0017F, 0.0764F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(30, 71).mirror().addBox(-0.5286F, -0.2651F, -0.1143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.565F, 1.161F, -2.5655F, -0.0247F, -0.0161F, 0.0219F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(15, 71).mirror().addBox(-0.5286F, -0.4802F, 0.0156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.565F, 1.161F, -2.5655F, -0.1468F, -0.0161F, 0.0219F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(73, 26).mirror().addBox(-0.3622F, -0.8868F, 0.5544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(10, 71).mirror().addBox(-0.3622F, -1.2867F, 0.5544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(1.7622F, 1.6646F, -1.5577F, 0.532F, 0.0088F, -0.0043F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(73, 54).mirror().addBox(-0.2507F, -0.5159F, -0.5529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 71).mirror().addBox(-0.2507F, -0.5159F, -0.1529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.52F, 1.1476F, -0.5559F, -0.2359F, 0.0077F, -0.0061F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3502F, 0.0836F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(58, 16).mirror().addBox(-0.3F, -0.6306F, -0.2686F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, -4.2F, -0.0975F, -0.4077F, 0.0628F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(41, 37).mirror().addBox(-0.5956F, -0.4311F, 1.0907F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, -4.2F, 0.0395F, -0.1985F, 0.0717F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(41, 37).addBox(-0.4044F, -0.4311F, 1.0907F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.5F, -4.2F, 0.0395F, 0.1985F, -0.0717F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(58, 16).addBox(-0.7F, -0.6306F, -0.2686F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.5F, -4.2F, -0.0975F, 0.4077F, -0.0628F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(68, 62).mirror().addBox(-0.3159F, -0.0193F, -4.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(68, 59).mirror().addBox(-0.3159F, -0.0193F, -4.6007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(68, 56).mirror().addBox(-0.3159F, 0.0307F, -5.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(68, 39).mirror().addBox(-0.3159F, 0.0557F, -5.6007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(31, 68).mirror().addBox(-0.3159F, 0.1057F, -6.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(68, 29).mirror().addBox(-0.3159F, 0.1057F, -6.6007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(68, 26).mirror().addBox(-0.3159F, 0.0807F, -7.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(15, 68).mirror().addBox(-0.3159F, 0.1307F, -7.6007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(10, 68).mirror().addBox(-0.3159F, 0.1307F, -8.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(5, 68).mirror().addBox(-0.3159F, 0.1307F, -8.6007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(33, 45).mirror().addBox(-0.3159F, 0.3807F, -8.7007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, 0.0611F, -0.1484F, 0.0F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(14, 58).mirror().addBox(-0.3159F, 0.3372F, -6.3476F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, 0.0698F, -0.1484F, 0.0F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(77, 6).mirror().addBox(-0.3159F, 0.9395F, -3.0696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, -0.1309F, -0.1484F, 0.0F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(-0.3159F, 0.8261F, -3.4299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, -0.0873F, -0.1484F, 0.0F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(58, 12).mirror().addBox(-0.3159F, 0.2479F, -5.007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, 0.0873F, -0.1484F, 0.0F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.3159F, 0.2639F, -1.4282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, -0.5454F, -0.1484F, 0.0F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(76, 71).mirror().addBox(-0.3159F, -0.0377F, -1.9331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, -0.2836F, -0.1484F, 0.0F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(26, 66).mirror().addBox(-0.3159F, 1.6616F, -0.6134F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, -1.2828F, -0.1484F, 0.0F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-0.3159F, 1.1112F, -1.51F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, -0.8029F, -0.1484F, 0.0F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(76, 63).mirror().addBox(-0.3159F, 0.5211F, -1.7436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, -0.6327F, -0.1484F, 0.0F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(58, 8).mirror().addBox(-0.3159F, -0.2376F, -2.0798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, -0.0218F, -0.1484F, 0.0F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(20, 73).mirror().addBox(-0.3159F, -0.2518F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, 0.6109F, -0.1484F, 0.0F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.3159F, -0.3511F, -3.5228F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, 0.2531F, -0.1484F, 0.0F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(7, 58).mirror().addBox(-0.3159F, -0.3714F, -5.0552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(61, 72).mirror().addBox(-0.3159F, -0.3217F, -0.512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, 0.2182F, -0.1484F, 0.0F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(47, 22).mirror().addBox(-0.3159F, -0.1008F, -3.1431F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, 0.2618F, -0.1484F, 0.0F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(71, 72).mirror().addBox(-0.3159F, -0.2176F, -0.8621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, 0.48F, -0.1484F, 0.0F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(66, 72).mirror().addBox(-0.3159F, -0.3052F, -0.8504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, 0.096F, -0.1484F, 0.0F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(76, 50).mirror().addBox(-0.3159F, -0.2725F, -0.2204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0267F, -0.2036F, 0.4363F, -0.1484F, 0.0F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(68, 62).addBox(-0.6841F, -0.0193F, -4.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(68, 59).addBox(-0.6841F, -0.0193F, -4.6007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(68, 56).addBox(-0.6841F, 0.0307F, -5.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(68, 39).addBox(-0.6841F, 0.0557F, -5.6007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(31, 68).addBox(-0.6841F, 0.1057F, -6.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(68, 29).addBox(-0.6841F, 0.1057F, -6.6007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(68, 26).addBox(-0.6841F, 0.0807F, -7.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(15, 68).addBox(-0.6841F, 0.1307F, -7.6007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 68).addBox(-0.6841F, 0.1307F, -8.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 68).addBox(-0.6841F, 0.1307F, -8.6007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(33, 45).addBox(-0.6841F, 0.3807F, -8.7007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, 0.0611F, 0.1484F, 0.0F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(14, 58).addBox(-0.6841F, 0.3372F, -6.3476F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, 0.0698F, 0.1484F, 0.0F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(77, 6).addBox(-0.6841F, 0.9395F, -3.0696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, -0.1309F, 0.1484F, 0.0F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(5, 77).addBox(-0.6841F, 0.8261F, -3.4299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, -0.0873F, 0.1484F, 0.0F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(58, 12).addBox(-0.6841F, 0.2479F, -5.007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, 0.0873F, 0.1484F, 0.0F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(0, 77).addBox(-0.6841F, 0.2639F, -1.4282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, -0.5454F, 0.1484F, 0.0F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(76, 71).addBox(-0.6841F, -0.0377F, -1.9331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, -0.2836F, 0.1484F, 0.0F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(26, 66).addBox(-0.6841F, 1.6616F, -0.6134F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, -1.2828F, 0.1484F, 0.0F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(77, 0).addBox(-0.6841F, 1.1112F, -1.51F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, -0.8029F, 0.1484F, 0.0F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(76, 63).addBox(-0.6841F, 0.5211F, -1.7436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, -0.6327F, 0.1484F, 0.0F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(58, 8).addBox(-0.6841F, -0.2376F, -2.0798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, -0.0218F, 0.1484F, 0.0F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(20, 73).addBox(-0.6841F, -0.2518F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, 0.6109F, 0.1484F, 0.0F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(0, 49).addBox(-0.6841F, -0.3511F, -3.5228F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, 0.2531F, 0.1484F, 0.0F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(7, 58).addBox(-0.6841F, -0.3714F, -5.0552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F))
				.texOffs(61, 72).addBox(-0.6841F, -0.3217F, -0.512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, 0.2182F, 0.1484F, 0.0F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(47, 22).addBox(-0.6841F, -0.1008F, -3.1431F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, 0.2618F, 0.1484F, 0.0F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(71, 72).addBox(-0.6841F, -0.2176F, -0.8621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, 0.48F, 0.1484F, 0.0F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(66, 72).addBox(-0.6841F, -0.3052F, -0.8504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, 0.096F, 0.1484F, 0.0F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(76, 50).addBox(-0.6841F, -0.2725F, -0.2204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.4F, 0.0267F, -0.2036F, 0.4363F, 0.1484F, 0.0F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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