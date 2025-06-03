package fossils.fossils.client.blockentity.model.spiclypeus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SpiclypeusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart rightfoot2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftCheek;
	private final ModelPart rightCheek;
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart leftFace;
	private final ModelPart browHorn;
	private final ModelPart rightFace;
	private final ModelPart browHorn2;
	private final ModelPart nasalHorn;
	private final ModelPart frill;
	private final ModelPart leftFrill;
	private final ModelPart rightFrill;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public SpiclypeusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.rightfoot2 = this.rightfoot.getChild("rightfoot2");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftCheek = this.head.getChild("leftCheek");
		this.rightCheek = this.head.getChild("rightCheek");
		this.leftBeak = this.head.getChild("leftBeak");
		this.rightBeak = this.head.getChild("rightBeak");
		this.leftFace = this.head.getChild("leftFace");
		this.browHorn = this.leftFace.getChild("browHorn");
		this.rightFace = this.head.getChild("rightFace");
		this.browHorn2 = this.rightFace.getChild("browHorn2");
		this.nasalHorn = this.head.getChild("nasalHorn");
		this.frill = this.head.getChild("frill");
		this.leftFrill = this.frill.getChild("leftFrill");
		this.rightFrill = this.frill.getChild("rightFrill");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(2.661F, -23.2F, 3.7148F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -2.0F, -5.0F, 0.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.409F, 0.8216F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 100).addBox(0.0F, -2.4314F, -0.0375F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6608F, 6.8806F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(67, 98).mirror().addBox(1.2412F, -0.5715F, -8.9939F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, 0.7511F, 0.0464F, 0.0242F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 37).mirror().addBox(1.2412F, -7.5513F, -4.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, 1.807F, 0.0464F, 0.0242F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(1.9694F, 3.3091F, -0.9057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, -0.5387F, 0.2465F, 0.0892F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(83, 58).mirror().addBox(1.2412F, -0.8427F, -6.068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, 0.9779F, 0.0464F, 0.0242F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(54, 26).mirror().addBox(1.2412F, 0.9659F, -8.0822F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, 0.6725F, 0.0464F, 0.0242F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(72, 83).mirror().addBox(0.7F, -0.7936F, -5.1386F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(26, 97).mirror().addBox(0.7392F, 7.9862F, 5.1164F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, 0.2683F, 0.1985F, -0.1574F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(94, 78).mirror().addBox(0.7392F, -0.6952F, 8.0576F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, -0.7178F, 0.1985F, -0.1574F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(30, 83).mirror().addBox(1.516F, 2.3987F, 0.5086F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, -0.1652F, 0.2514F, 0.0737F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 69).mirror().addBox(1.516F, -0.1828F, 1.3819F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, -0.7237F, 0.2514F, 0.0737F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(49, 68).mirror().addBox(1.0562F, 2.2642F, 3.7081F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, -0.3306F, 0.1873F, -0.1034F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 51).mirror().addBox(0.8851F, 0.1745F, -2.9694F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, 0.0107F, 0.0836F, -0.1156F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(70, 13).mirror().addBox(0.7F, -0.8605F, -3.8549F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(70, 13).addBox(7.7F, -0.8605F, -3.8549F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-4.7F, -1.9659F, 6.1659F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(67, 65).mirror().addBox(-1.7005F, -1.5746F, -2.0615F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, -1.0896F, 3.7805F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(84, 53).mirror().addBox(-1.7005F, -0.1352F, -0.065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 53).addBox(5.2995F, -0.1352F, -0.065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2995F, -2.3896F, 5.7805F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(99, 97).mirror().addBox(0.7F, -0.7607F, -1.1452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(99, 97).addBox(7.7F, -0.7607F, -1.1452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.7F, -2.6659F, 8.8659F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(84, 47).mirror().addBox(-0.3278F, -0.1424F, -0.103F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -3.0659F, 6.0659F, 0.0886F, 0.1739F, 0.0154F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(70, 33).mirror().addBox(0.8896F, -0.8786F, 0.8705F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.4659F, 2.6659F, -0.0101F, -0.0494F, -0.0207F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(33, 21).mirror().addBox(-0.5136F, -0.8651F, -3.5375F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, 0.096F, -0.1686F, -0.0374F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(34, 58).mirror().addBox(-1.1515F, -0.7599F, 0.9606F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.4659F, 2.6659F, 0.0443F, 0.1744F, 0.0077F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(77, 9).mirror().addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2592F, -0.6535F, -4.6462F, 0.5539F, 0.3495F, -0.0637F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(86, 25).mirror().addBox(-0.1189F, -0.5837F, -1.5701F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9001F, -0.7072F, -4.8052F, 0.5031F, 0.1541F, -0.0395F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(75, 56).mirror().addBox(-0.0073F, -2.0243F, -5.7509F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, 0.466F, 0.0122F, -0.0318F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(34, 51).mirror().addBox(1.7254F, -0.6062F, -3.3226F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, 0.1477F, -0.0535F, 0.3451F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(39, 37).mirror().addBox(0.949F, -0.8651F, -3.4864F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.2659F, 1.4659F, 0.0947F, -0.047F, -0.0257F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(70, 33).addBox(-1.8896F, -0.8786F, 0.8705F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, -2.4659F, 2.6659F, -0.0101F, 0.0494F, 0.0207F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(33, 21).addBox(-1.4864F, -0.8651F, -3.5375F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, 0.096F, 0.1686F, 0.0374F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(39, 37).addBox(-1.949F, -0.8651F, -3.4864F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, 0.0947F, 0.047F, 0.0257F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(75, 56).addBox(-1.9927F, -2.0243F, -5.7509F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, 0.466F, -0.0122F, 0.0318F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(77, 9).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2592F, -0.6535F, -4.6462F, 0.5539F, -0.3495F, 0.0637F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(86, 25).addBox(-0.8811F, -0.5837F, -1.5701F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9001F, -0.7072F, -4.8052F, 0.5031F, -0.1541F, 0.0395F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(34, 58).addBox(-0.8485F, -0.7599F, 0.9606F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, -2.4659F, 2.6659F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(67, 65).addBox(0.7005F, -1.5746F, -2.0615F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2995F, -1.0896F, 3.7805F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(26, 97).addBox(-1.7392F, 7.9862F, 5.1164F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, 0.2683F, -0.1985F, 0.1574F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(94, 78).addBox(-1.7392F, -0.6952F, 8.0576F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, -0.7178F, -0.1985F, 0.1574F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(49, 68).addBox(-2.0562F, 2.2642F, 3.7081F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, -0.3306F, -0.1873F, 0.1034F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(60, 69).addBox(-2.516F, -0.1828F, 1.3819F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, -0.7237F, -0.2514F, -0.0737F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(30, 83).addBox(-2.516F, 2.3987F, 0.5086F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, -0.1652F, -0.2514F, -0.0737F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 93).addBox(-2.9694F, 3.3091F, -0.9057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, -0.5387F, -0.2465F, -0.0892F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(83, 58).addBox(-2.2412F, -0.8427F, -6.068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, 0.9779F, -0.0464F, -0.0242F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(48, 37).addBox(-2.2412F, -7.5513F, -4.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, 1.807F, -0.0464F, -0.0242F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(67, 98).addBox(-2.2412F, -0.5715F, -8.9939F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, 0.7511F, -0.0464F, -0.0242F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(54, 26).addBox(-2.2412F, 0.9659F, -8.0822F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, 0.6725F, -0.0464F, -0.0242F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(12, 51).addBox(-1.8851F, 0.1745F, -2.9694F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, 0.0107F, -0.0836F, 0.1156F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(34, 51).addBox(-3.7254F, -0.6062F, -3.3226F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, 0.1477F, 0.0535F, -0.3451F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(72, 83).addBox(-1.7F, -0.7936F, -5.1386F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.7F, -2.2659F, 1.4659F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(84, 47).addBox(-0.6722F, -0.1424F, -0.103F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.7F, -3.0659F, 6.0659F, 0.0886F, -0.1739F, -0.0154F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(76, 93).addBox(-1.7F, -1.0025F, -2.0043F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.7F, -2.0659F, 7.8659F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 70).addBox(-1.7F, -0.8605F, -3.8549F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(4.7F, -1.9659F, 6.1659F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(74, 67).mirror().addBox(-3.0F, -0.9636F, -0.6709F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 67).addBox(1.0F, -0.9636F, -0.6709F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, -1.9636F, -11.6709F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2908F, 7.3181F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(75, 39).addBox(-1.5F, 9.1833F, -4.9553F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.9F, 0.4999F, 0.2552F, 0.1913F, -0.0166F, 0.0857F));

		PartDefinition cube_r53 = leftleg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(57, 15).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftleg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(67, 26).addBox(-0.5F, -0.1075F, -1.1404F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftleg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(68, 40).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3403F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.8762F, -4.1099F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftleg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(35, 91).addBox(-0.1F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 1.0988F, 0.4068F, -0.1624F, 0.3591F));

		PartDefinition cube_r57 = leftleg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 83).addBox(-0.1F, -0.4383F, -0.1279F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftleg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(67, 59).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftleg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(83, 84).addBox(-1.601F, 3.3011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 87).addBox(-1.101F, -1.7989F, 0.9208F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftleg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(9, 78).addBox(-1.5F, -5.8767F, 0.9507F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1865F, 4.2725F, -0.1391F, -0.0121F, -0.0864F));

		PartDefinition cube_r61 = leftleg3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(23, 79).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(89, 89).addBox(-1.102F, -1.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftfoot.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(69, 92).addBox(-1.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.1697F, -0.2131F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(0, 46).addBox(-1.999F, -0.5853F, -3.8254F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(49, 74).addBox(-1.5F, 9.1833F, -4.9553F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9F, 0.4999F, 0.2552F, 0.4529F, 0.0203F, -0.0849F));

		PartDefinition cube_r63 = rightleg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(55, 42).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightleg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5F, -0.1075F, -1.1404F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightleg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(11, 67).addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3403F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.8762F, -4.1099F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightleg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(20, 91).addBox(-0.9F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(59, 82).addBox(-0.9F, -0.4383F, -0.1279F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightleg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(67, 53).addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightleg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(84, 65).addBox(-0.399F, 3.3011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(5, 86).addBox(0.101F, -1.7989F, 0.9208F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightleg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(36, 77).addBox(-0.5F, -5.8767F, 0.9507F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1865F, 4.2725F, -0.1391F, 0.0121F, 0.0864F));

		PartDefinition cube_r70 = rightleg3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(77, 32).addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(80, 89).addBox(-1.898F, -1.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightfoot.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(92, 3).addBox(-2.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.499F, 3.1697F, -0.2131F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(44, 18).addBox(-2.001F, -0.5853F, -3.8254F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.1484F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0227F, -3.8884F, 0.3364F, -0.1649F, -0.0573F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(93, 100).addBox(0.0F, -2.1616F, -4.6978F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0317F, 2.6968F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(47, 100).addBox(0.0F, -3.0324F, -0.2933F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0317F, -3.7032F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(12, 96).addBox(0.0F, -4.4694F, -0.1443F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5683F, -9.8032F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(52, 98).addBox(0.0F, -3.8694F, -0.1443F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4317F, -7.8032F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(3, 98).addBox(0.0F, -3.2764F, -0.1077F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1317F, -5.8032F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(28, 0).mirror().addBox(-13.8804F, -3.7351F, -0.4699F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7317F, -9.7032F, 0.081F, 0.4145F, -1.3637F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(39, 35).mirror().addBox(-11.0038F, -3.8478F, -1.5367F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.0441F, 0.4531F, -1.3663F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(85, 82).mirror().addBox(-6.1529F, -3.8689F, -0.5849F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.0415F, 0.2961F, -1.3735F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-6.81F, -3.7294F, -0.9246F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0005F, 0.1778F, -1.3814F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(83, 63).mirror().addBox(-10.3996F, -3.7378F, -2.5366F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0006F, 0.4222F, -1.3812F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(20, 54).mirror().addBox(-8.1153F, -3.7578F, -2.4801F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.0434F, 0.2688F, -1.3976F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(92, 61).mirror().addBox(-5.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.0419F, 0.0421F, -1.3878F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(99, 25).mirror().addBox(-4.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.1386F, -0.1535F, -0.8476F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(99, 34).mirror().addBox(-2.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.2446F, -0.1044F, -0.2967F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-4.3843F, -1.7751F, -0.5064F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0108F, 0.0177F, -0.8578F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(52, 56).mirror().addBox(-2.9585F, -0.2821F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0554F, -0.0092F, -0.3139F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(99, 12).mirror().addBox(-2.7287F, -0.981F, -0.3059F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.2381F, 0.0499F, -0.3101F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(99, 43).mirror().addBox(-3.8252F, -2.259F, -0.3935F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.1494F, 0.1755F, -0.8443F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(98, 41).mirror().addBox(-4.362F, -1.7945F, -0.4699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7317F, -9.7032F, 0.2832F, 0.3171F, -0.8116F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(45, 98).mirror().addBox(-2.9488F, -0.3088F, -0.4031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7317F, -9.7032F, 0.4387F, 0.1124F, -0.2938F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(52, 56).addBox(0.9585F, -0.2821F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0554F, 0.0092F, 0.3139F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(73, 0).addBox(2.3843F, -1.7751F, -0.5064F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0108F, -0.0177F, 0.8578F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(83, 63).addBox(6.3996F, -3.7378F, -2.5366F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0006F, -0.4222F, 1.3812F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 9).addBox(2.81F, -3.7294F, -0.9246F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0005F, -0.1778F, 1.3814F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(39, 35).addBox(6.0038F, -3.8478F, -1.5367F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.0441F, -0.4531F, 1.3663F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(85, 82).addBox(2.1529F, -3.8689F, -0.5849F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.0415F, -0.2961F, 1.3735F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(99, 43).addBox(1.8252F, -2.259F, -0.3935F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.1494F, -0.1755F, 0.8443F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(99, 12).addBox(0.7287F, -0.981F, -0.3059F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.2381F, -0.0499F, 0.3101F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(28, 0).addBox(2.8804F, -3.7351F, -0.4699F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7317F, -9.7032F, 0.081F, -0.4145F, 1.3637F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(98, 41).addBox(2.362F, -1.7945F, -0.4699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7317F, -9.7032F, 0.2832F, -0.3171F, 0.8116F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(45, 98).addBox(0.9488F, -0.3088F, -0.4031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7317F, -9.7032F, 0.4387F, -0.1124F, 0.2938F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(20, 54).addBox(5.1153F, -3.7578F, -2.4801F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.0434F, -0.2688F, 1.3976F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(92, 61).addBox(2.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.0419F, -0.0421F, 1.3878F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(99, 25).addBox(2.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.1386F, 0.1535F, 0.8476F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(96, 28).mirror().addBox(-1.0F, 0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3851F, -0.3771F, -9.5666F, 0.429F, -0.1843F, 0.5459F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(97, 9).mirror().addBox(-1.0F, 0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -1.2611F, -7.7786F, 0.3417F, -0.1843F, 0.5459F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(40, 64).mirror().addBox(-1.0F, 0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -1.6611F, -5.7786F, 0.3417F, -0.1843F, 0.5459F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(96, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3464F, -1.5064F, -3.5127F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(96, 38).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3464F, -1.5064F, -3.5127F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(40, 64).addBox(-1.0F, 0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.238F, -1.6611F, -5.7786F, 0.3417F, 0.1843F, -0.5459F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(97, 9).addBox(-1.0F, 0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.238F, -1.2611F, -7.7786F, 0.3417F, 0.1843F, -0.5459F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(96, 28).addBox(-1.0F, 0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3851F, -0.3771F, -9.5666F, 0.429F, 0.1843F, -0.5459F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(99, 34).addBox(0.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.2446F, 0.1044F, 0.2967F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(28, 34).addBox(-1.0F, -1.96F, -0.1826F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.7683F, -9.8032F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(44, 10).addBox(-1.0F, -1.3073F, -7.6534F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.3683F, 2.6968F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7683F, -10.1032F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(96, 96).addBox(0.0F, -7.0823F, 3.3766F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 97).addBox(0.0F, -6.1823F, 1.6766F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1554F, -6.721F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(18, 67).addBox(0.0F, -4.5288F, -0.0003F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4219F, -1.3496F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(0.4375F, 0.4704F, -0.281F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2465F, 8.9839F, -1.6419F, 0.3852F, -1.176F, -0.2027F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(44, 24).mirror().addBox(1.8144F, 0.6068F, -1.5466F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2465F, 8.9839F, -1.6419F, 0.3761F, -1.246F, -0.3376F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(48, 35).mirror().addBox(2.6842F, 0.8728F, -0.0402F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2465F, 8.9839F, -1.6419F, -0.0633F, -1.1529F, 0.208F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(75, 44).mirror().addBox(1.0465F, -0.2187F, 2.7631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(53, 0).mirror().addBox(0.0465F, -0.2187F, -2.2369F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(75, 44).addBox(2.4465F, -0.2187F, 2.7631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(53, 0).addBox(2.4465F, -0.2187F, -2.2369F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.2465F, 8.9839F, -1.6419F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(75, 62).mirror().addBox(0.0465F, 0.2368F, -5.1208F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 62).addBox(2.4465F, 0.2368F, -5.1208F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2465F, 8.9839F, -1.6419F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(40, 68).mirror().addBox(-0.7493F, -2.25F, -2.885F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9446F, 5.812F, -4.2756F, 1.222F, -0.3868F, -0.8037F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(18, 71).mirror().addBox(-0.7394F, -2.25F, -0.1133F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9446F, 5.812F, -4.2756F, 1.1152F, -0.2488F, -0.4656F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(44, 53).mirror().addBox(-1.8532F, -1.8217F, -1.056F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2466F, 4.1871F, -2.0515F, 0.931F, -0.0672F, 0.0803F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(47, 94).mirror().addBox(-1.6271F, 0.0812F, -1.6262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2466F, 2.2871F, -3.1515F, 0.4598F, -0.0672F, 0.0803F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(60, 62).mirror().addBox(-0.5F, -0.6F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.3385F, -1.2242F, 0.4199F, 0.8961F, -0.0672F, 0.0803F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-1.8532F, -1.0852F, 3.8944F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2466F, 4.1871F, -2.0515F, 1.1056F, -0.0672F, 0.0803F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(40, 68).addBox(-0.2507F, -2.25F, -2.885F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.9446F, 5.812F, -4.2756F, 1.222F, 0.3868F, 0.8037F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(18, 71).addBox(-0.2606F, -2.25F, -0.1133F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9446F, 5.812F, -4.2756F, 1.1152F, 0.2488F, 0.4656F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(60, 62).addBox(-0.5F, -0.6F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.3385F, -1.2242F, 0.4199F, 0.8961F, 0.0672F, -0.0803F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 63).addBox(0.8532F, -1.0852F, 3.8944F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2466F, 4.1871F, -2.0515F, 1.1056F, 0.0672F, -0.0803F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(44, 53).addBox(0.8532F, -1.8217F, -1.056F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.2466F, 4.1871F, -2.0515F, 0.931F, 0.0672F, -0.0803F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(47, 94).addBox(0.6271F, 0.0812F, -1.6262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2466F, 2.2871F, -3.1515F, 0.4598F, 0.0672F, -0.0803F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(44, 24).addBox(-2.8144F, 0.6068F, -1.5466F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2465F, 8.9839F, -1.6419F, 0.3761F, 1.246F, 0.3376F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(48, 35).addBox(-3.6842F, 0.8728F, -0.0402F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2465F, 8.9839F, -1.6419F, -0.0633F, 1.1529F, -0.208F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(71, 47).addBox(-1.4375F, 0.4704F, -0.281F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2465F, 8.9839F, -1.6419F, 0.3852F, 1.176F, 0.2027F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(96, 70).mirror().addBox(-0.7F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 96).mirror().addBox(-0.8F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6124F, -2.8259F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(19, 96).addBox(-1.2F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(96, 70).addBox(-1.3F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.6124F, -2.8259F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(53, 24).mirror().addBox(-9.6922F, -2.753F, -0.4665F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2695F, -4.4993F, 0.1238F, 0.585F, -1.3431F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(39, 33).mirror().addBox(-11.6922F, -2.753F, -0.4665F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.5305F, -2.7993F, 0.0972F, 0.4828F, -1.3567F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(28, 31).mirror().addBox(-12.6922F, -2.753F, -0.4665F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.5305F, -1.0993F, 0.081F, 0.4145F, -1.3637F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(98, 95).mirror().addBox(-3.708F, -1.038F, -0.4665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.5305F, -1.0993F, 0.2832F, 0.3171F, -0.8116F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(97, 63).mirror().addBox(-1.9977F, -0.0011F, -0.4289F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.5305F, -1.0993F, 0.4387F, 0.1124F, -0.2938F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(97, 23).mirror().addBox(-1.9977F, -0.0011F, -0.4289F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.5305F, -2.7993F, 0.5061F, 0.1323F, -0.2856F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(98, 90).mirror().addBox(-3.708F, -1.038F, -0.4665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.5305F, -2.7993F, 0.3347F, 0.3673F, -0.7943F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(96, 73).mirror().addBox(-3.708F, -1.038F, -0.4665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2695F, -4.4993F, 0.4158F, 0.4409F, -0.7624F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(96, 82).mirror().addBox(-1.9977F, -0.0011F, -0.4289F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2695F, -4.4993F, 0.6079F, 0.1611F, -0.2707F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(96, 82).addBox(-0.0023F, -0.0011F, -0.4289F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2695F, -4.4993F, 0.6079F, -0.1611F, 0.2707F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(96, 73).addBox(1.708F, -1.038F, -0.4665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2695F, -4.4993F, 0.4158F, -0.4409F, 0.7624F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(53, 24).addBox(2.6922F, -2.753F, -0.4665F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2695F, -4.4993F, 0.1238F, -0.585F, 1.3431F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(97, 23).addBox(-0.0023F, -0.0011F, -0.4289F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.5305F, -2.7993F, 0.5061F, -0.1323F, 0.2856F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(98, 90).addBox(1.708F, -1.038F, -0.4665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.5305F, -2.7993F, 0.3347F, -0.3673F, 0.7943F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(39, 33).addBox(2.6922F, -2.753F, -0.4665F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.5305F, -2.7993F, 0.0972F, -0.4828F, 1.3567F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(97, 63).addBox(-0.0023F, -0.0011F, -0.4289F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -1.5305F, -1.0993F, 0.4387F, -0.1124F, 0.2938F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(98, 95).addBox(1.708F, -1.038F, -0.4665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -1.5305F, -1.0993F, 0.2832F, -0.3171F, 0.8116F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(28, 31).addBox(2.6922F, -2.753F, -0.4665F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -1.5305F, -1.0993F, 0.081F, -0.4145F, 1.3637F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(17, 31).addBox(-1.0F, -1.8282F, -0.1284F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1554F, -4.821F, 0.4189F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 6.8213F, -4.6418F, -0.1833F, 0.0F, -0.1745F));

		PartDefinition cube_r160 = leftarm.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(23, 83).addBox(-0.0544F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r161 = leftarm.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(79, 97).addBox(-0.1791F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0288F, 3.3523F, -0.097F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r162 = leftarm.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(71, 71).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftarm.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(10, 61).addBox(-2.0F, -1.6F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftarm.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 76).addBox(-0.9824F, -3.7907F, -0.4712F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 7.0571F, 3.3001F, -0.8251F, -1.1317F, 1.2702F));

		PartDefinition cube_r165 = leftarm2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(78, 77).addBox(-1.1933F, -4.4546F, 0.3397F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(23, 61).addBox(0.1067F, -5.4546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1439F, 6.5086F, -2.6347F, 0.938F, 0.5578F, -0.5293F));

		PartDefinition cube_r166 = lefthand.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(83, 4).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r167 = lefthand.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(67, 19).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r168 = lefthand.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(71, 88).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r169 = lefthand.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(90, 52).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 6.8213F, -4.6418F, 0.3403F, 0.0F, 0.1745F));

		PartDefinition cube_r170 = rightarm.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(17, 0).addBox(-0.9456F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r171 = rightarm.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(74, 97).addBox(-0.8209F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0288F, 3.3523F, -0.097F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r172 = rightarm.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(27, 71).addBox(-0.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r173 = rightarm.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(57, 56).addBox(-1.0F, -1.6F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r174 = rightarm.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(60, 75).addBox(-1.0176F, -3.7907F, -0.4712F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 7.0571F, 3.3001F, -1.2036F, 0.638F, -1.7412F));

		PartDefinition cube_r175 = rightarm2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(43, 77).addBox(0.1933F, -4.4546F, 0.3397F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 15).addBox(-2.1067F, -5.4546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1439F, 6.5086F, -2.6347F, 1.4546F, -0.9034F, 0.9862F));

		PartDefinition cube_r176 = righthand.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(82, 14).addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r177 = righthand.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(63, 0).addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.1382F, -0.0511F, 0.1759F));

		PartDefinition cube_r178 = righthand.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(21, 25).addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r179 = righthand.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(28, 89).addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.4554F, -5.321F, -0.3357F, -0.2346F, -0.0367F));

		PartDefinition cube_r180 = neck2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(36, 71).addBox(-1.0F, -3.0162F, 0.0031F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7712F, -1.883F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r181 = neck2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(65, 40).addBox(-1.0F, -4.2029F, 0.9208F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 45).addBox(-2.0F, -2.0029F, -0.0792F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 1.7288F, -4.383F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r182 = neck2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(17, 10).mirror().addBox(-7.9341F, -3.2083F, 2.6435F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7288F, -4.383F, -0.1559F, 0.8707F, -1.5968F));

		PartDefinition cube_r183 = neck2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(38, 98).mirror().addBox(-5.0111F, -0.8114F, 2.6435F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7288F, -4.383F, 0.435F, 0.7928F, -0.8161F));

		PartDefinition cube_r184 = neck2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(98, 19).mirror().addBox(-2.9367F, 0.9825F, 2.665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7288F, -4.383F, 0.8041F, 0.4603F, -0.2749F));

		PartDefinition cube_r185 = neck2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(20, 61).mirror().addBox(-2.9605F, -1.12F, 0.9956F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7288F, -4.383F, 0.1251F, 0.9871F, -1.3303F));

		PartDefinition cube_r186 = neck2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(97, 88).mirror().addBox(-2.2287F, 0.1136F, 1.0345F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7288F, -4.383F, 0.7572F, 0.7313F, -0.573F));

		PartDefinition cube_r187 = neck2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(20, 61).addBox(1.9605F, -1.12F, 0.9956F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7288F, -4.383F, 0.1251F, -0.9871F, 1.3303F));

		PartDefinition cube_r188 = neck2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(97, 88).addBox(0.2287F, 0.1136F, 1.0345F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7288F, -4.383F, 0.7572F, -0.7313F, 0.573F));

		PartDefinition cube_r189 = neck2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(98, 19).addBox(0.9367F, 0.9825F, 2.665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7288F, -4.383F, 0.8041F, -0.4603F, 0.2749F));

		PartDefinition cube_r190 = neck2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(38, 98).addBox(3.0111F, -0.8114F, 2.6435F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7288F, -4.383F, 0.435F, -0.7928F, 0.8161F));

		PartDefinition cube_r191 = neck2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(17, 10).addBox(3.9341F, -3.2083F, 2.6435F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7288F, -4.383F, -0.1559F, -0.8707F, 1.5968F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4132F, -4.5076F, -0.0504F, -0.4306F, -0.0128F));

		PartDefinition cube_r192 = neck.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(62, 26).addBox(0.0F, -3.4F, -2.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 29).addBox(-1.0F, -1.4F, -5.7F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -0.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r193 = neck.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(97, 84).mirror().addBox(-2.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2156F, -2.6754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r194 = neck.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(97, 84).addBox(0.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2156F, -2.6754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -5.5F, 0.4784F, -0.0403F, 0.0774F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(17, 40).addBox(-1.0F, -6.067F, 0.6406F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.8178F, -7.1273F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(74, 2).addBox(-0.5F, -3.0541F, -0.0328F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7938F, -7.1001F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(50, 79).addBox(-0.5F, -1.9702F, -0.168F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3822F, -10.5273F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.9702F, -0.168F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3822F, -10.5273F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(78, 50).addBox(0.175F, -0.0473F, -1.4169F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8699F, 3.4209F, -5.7774F, 0.2769F, 0.1104F, 0.0089F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(25, 11).addBox(-2.5F, -7.2F, -1.9F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9822F, -0.2273F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(36, 2).addBox(-4.4037F, -0.7562F, -1.3847F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4037F, -2.3822F, -0.3409F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(2.274F, 0.8804F, -1.3643F, -1.5156F, 0.0302F, 0.0872F));

		PartDefinition cube_r202 = leftCheek.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(40, 94).addBox(-0.1154F, -0.3535F, -2.1507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.526F, -0.8982F, 2.637F, 0.4273F, 0.6184F, 0.3889F));

		PartDefinition cube_r203 = leftCheek.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(74, 9).addBox(-0.3284F, -0.7361F, 1.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(27, 93).addBox(-0.3284F, -0.7361F, -0.4957F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.926F, 0.3018F, 2.237F, 1.0258F, 0.6816F, 0.4262F));

		PartDefinition cube_r204 = leftCheek.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(53, 90).addBox(-0.9604F, -2.0364F, -0.3402F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.426F, 1.8018F, 1.437F, 1.0956F, 0.6816F, 0.4262F));

		PartDefinition cube_r205 = leftCheek.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(54, 7).addBox(-1.642F, -2.1953F, -0.5305F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.726F, 1.3018F, 0.437F, 0.4499F, 0.6816F, 0.4262F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.274F, 0.8804F, -1.3643F, -1.5156F, -0.0302F, -0.0872F));

		PartDefinition cube_r206 = rightCheek.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(40, 94).mirror().addBox(-0.8846F, -0.3535F, -2.1507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.526F, -0.8982F, 2.637F, 0.4273F, -0.6184F, -0.3889F));

		PartDefinition cube_r207 = rightCheek.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(74, 9).mirror().addBox(-0.6716F, -0.7361F, 1.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(27, 93).mirror().addBox(-0.6716F, -0.7361F, -0.4957F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.926F, 0.3018F, 2.237F, 1.0258F, -0.6816F, -0.4262F));

		PartDefinition cube_r208 = rightCheek.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(53, 90).mirror().addBox(-0.0396F, -2.0364F, -0.3402F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.426F, 1.8018F, 1.437F, 1.0956F, -0.6816F, -0.4262F));

		PartDefinition cube_r209 = rightCheek.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(54, 7).mirror().addBox(0.642F, -2.1953F, -0.5305F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.726F, 1.3018F, 0.437F, 0.4499F, -0.6816F, -0.4262F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offset(0.5296F, 4.1294F, -11.1925F));

		PartDefinition cube_r210 = leftBeak.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(78, 67).addBox(-1.2233F, -2.0411F, -0.0664F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5704F, -1.6934F, -0.6304F, -0.8414F, 0.0699F, 0.0695F));

		PartDefinition cube_r211 = leftBeak.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(72, 79).addBox(-0.528F, -2.0439F, 0.0503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(53, 85).addBox(-0.528F, -1.6439F, 0.0503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4644F, 3.5663F, -0.2933F, 0.6421F, 0.0699F, 0.0695F));

		PartDefinition cube_r212 = leftBeak.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(37, 100).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.352F, 1.3729F, -0.377F, -0.5622F, 0.0699F, 0.0695F));

		PartDefinition cube_r213 = leftBeak.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(28, 33).addBox(-0.5551F, -2.3582F, -2.6094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3875F, 3.4212F, 0.3592F, -1.0858F, 0.0699F, 0.0695F));

		PartDefinition cube_r214 = leftBeak.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(28, 2).addBox(-0.7F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1095F, -0.6368F, 0.9343F, 0.0025F, 0.0881F, 0.0886F));

		PartDefinition cube_r215 = leftBeak.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(92, 23).addBox(-1.2164F, 0.074F, 0.0474F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5704F, -1.7934F, -0.6304F, -0.5971F, 0.0699F, 0.0695F));

		PartDefinition cube_r216 = leftBeak.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(99, 54).addBox(-1.5214F, -1.616F, 0.407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(15, 98).addBox(-1.5214F, -2.116F, -0.293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, 2.0066F, -1.2304F, 0.1011F, 0.0699F, 0.0695F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offset(-0.5296F, 4.1294F, -11.1925F));

		PartDefinition cube_r217 = rightBeak.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(78, 67).mirror().addBox(0.2233F, -2.0411F, -0.0664F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -1.6934F, -0.6304F, -0.8414F, -0.0699F, -0.0695F));

		PartDefinition cube_r218 = rightBeak.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(72, 79).mirror().addBox(-0.472F, -2.0439F, 0.0503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(53, 85).mirror().addBox(-0.472F, -1.6439F, 0.0503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4644F, 3.5663F, -0.2933F, 0.6421F, -0.0699F, -0.0695F));

		PartDefinition cube_r219 = rightBeak.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(37, 100).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.352F, 1.3729F, -0.377F, -0.5622F, -0.0699F, -0.0695F));

		PartDefinition cube_r220 = rightBeak.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(28, 33).mirror().addBox(-0.4449F, -2.3582F, -2.6094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3875F, 3.4212F, 0.3592F, -1.0858F, -0.0699F, -0.0695F));

		PartDefinition cube_r221 = rightBeak.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(28, 2).mirror().addBox(-0.3F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1095F, -0.6368F, 0.9343F, 0.0025F, -0.0881F, -0.0886F));

		PartDefinition cube_r222 = rightBeak.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(92, 23).mirror().addBox(0.2164F, 0.074F, 0.0474F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -1.7934F, -0.6304F, -0.5971F, -0.0699F, -0.0695F));

		PartDefinition cube_r223 = rightBeak.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(99, 54).mirror().addBox(0.5214F, -1.616F, 0.407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(15, 98).mirror().addBox(0.5214F, -2.116F, -0.293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, 2.0066F, -1.2304F, 0.1011F, -0.0699F, -0.0695F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.0822F, -4.1273F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(66, 79).addBox(-0.5F, -1.5436F, -4.0831F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4301F, -1.6613F, -1.6501F, 0.3047F, 0.1256F, 0.0215F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(5, 95).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, -2.1984F, 0.8721F, 0.1302F, 0.1256F, 0.0215F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(54, 7).addBox(-0.5F, -1.4921F, -1.1024F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4301F, -1.6613F, -1.6501F, 0.2524F, 0.1256F, 0.0215F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(32, 64).addBox(-1.9873F, -2.0934F, -3.0545F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2102F, -4.4075F, 0.0729F, 0.5118F, 0.6481F, 0.3142F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(63, 49).addBox(0.0025F, -0.1226F, -1.2017F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0079F, -3.4089F, -4.8721F, 0.7778F, -0.0053F, 0.0285F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(44, 53).addBox(0.0025F, -1.218F, -0.0937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0079F, -3.4089F, -4.8721F, -0.2345F, -0.0053F, 0.0285F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(25, 56).addBox(0.0025F, -1.1834F, -0.4221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0079F, -3.4089F, -4.8721F, 0.1145F, -0.0053F, 0.0285F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(93, 19).addBox(0.0025F, -1.112F, -1.3212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0079F, -3.4089F, -4.8721F, 0.8301F, -0.0053F, 0.0285F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(78, 44).addBox(0.0025F, -0.5292F, -1.5954F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-1.0079F, -3.4089F, -4.8721F, 0.3938F, -0.0053F, 0.0285F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(84, 36).addBox(-0.2583F, -0.2F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3983F, -4.9219F, 3.7384F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(40, 10).addBox(-1.37F, -1.15F, -3.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(74, 24).addBox(-1.73F, -1.15F, -3.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(84, 42).addBox(-1.06F, -1.15F, -3.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.7683F, -6.7838F, 2.6222F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(57, 33).addBox(-0.3368F, 0.0366F, -0.4726F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5037F, -7.7644F, 3.7863F, -0.0897F, 0.3445F, 0.3558F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(83, 21).addBox(-1.2087F, -0.7538F, -2.2141F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1037F, -7.7644F, 3.7863F, 0.281F, 0.3245F, -0.0782F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 56).addBox(0.5442F, -0.3105F, -0.7581F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5037F, -7.7644F, 3.7863F, -0.051F, 0.3709F, 0.1428F));

		PartDefinition browHorn = leftFace.addOrReplaceChild("browHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6227F, -7.3919F, -0.52F, -0.2182F, 0.0F, 0.6981F));

		PartDefinition cube_r238 = browHorn.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(85, 77).addBox(-0.5F, -0.445F, -1.5177F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0479F, 0.3445F, 1.7796F, 0.0F, 0.0F));

		PartDefinition cube_r239 = browHorn.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(97, 50).addBox(-0.5F, -1.9966F, -1.0128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.9479F, 0.5445F, 1.0104F, -0.2458F, 0.1515F));

		PartDefinition cube_r240 = browHorn.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(53, 26).addBox(-0.5F, -1.2099F, -1.3643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.9479F, 1.5445F, 0.6452F, 0.0F, 0.0F));

		PartDefinition cube_r241 = browHorn.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(89, 97).addBox(-0.5F, -1.5099F, -0.9643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9479F, 1.5445F, 0.8197F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.0822F, -4.1273F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(66, 79).mirror().addBox(-0.5F, -1.5436F, -4.0831F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4301F, -1.6613F, -1.6501F, 0.3047F, -0.1256F, -0.0215F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(5, 95).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1F, -2.1984F, 0.8721F, 0.1302F, -0.1256F, -0.0215F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(54, 7).mirror().addBox(-0.5F, -1.4921F, -1.1024F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4301F, -1.6613F, -1.6501F, 0.2524F, -0.1256F, -0.0215F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(32, 64).mirror().addBox(-0.0127F, -2.0934F, -3.0545F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2102F, -4.4075F, 0.0729F, 0.5118F, -0.6481F, -0.3142F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(63, 49).mirror().addBox(-1.0025F, -0.1226F, -1.2017F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0079F, -3.4089F, -4.8721F, 0.7778F, 0.0053F, -0.0285F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(44, 53).mirror().addBox(-1.0025F, -1.218F, -0.0937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0079F, -3.4089F, -4.8721F, -0.2345F, 0.0053F, -0.0285F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(25, 56).mirror().addBox(-1.0025F, -1.1834F, -0.4221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0079F, -3.4089F, -4.8721F, 0.1145F, 0.0053F, -0.0285F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(93, 19).mirror().addBox(-1.0025F, -1.112F, -1.3212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0079F, -3.4089F, -4.8721F, 0.8301F, 0.0053F, -0.0285F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(78, 44).mirror().addBox(-1.0025F, -0.5292F, -1.5954F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(1.0079F, -3.4089F, -4.8721F, 0.3938F, 0.0053F, -0.0285F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(84, 36).mirror().addBox(-1.7417F, -0.2F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3983F, -4.9219F, 3.7384F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(40, 10).mirror().addBox(-0.63F, -1.15F, -3.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(74, 24).mirror().addBox(-1.27F, -1.15F, -3.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(84, 42).mirror().addBox(-0.94F, -1.15F, -3.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7683F, -6.7838F, 2.6222F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(57, 33).mirror().addBox(-1.6632F, 0.0366F, -0.4726F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5037F, -7.7644F, 3.7863F, -0.0897F, -0.3445F, -0.3558F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(83, 21).mirror().addBox(-1.7913F, -0.7538F, -2.2141F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1037F, -7.7644F, 3.7863F, 0.281F, -0.3245F, 0.0782F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-1.5442F, -0.3105F, -0.7581F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5037F, -7.7644F, 3.7863F, -0.051F, -0.3709F, -0.1428F));

		PartDefinition browHorn2 = rightFace.addOrReplaceChild("browHorn2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6227F, -7.3919F, -0.52F, -0.2182F, 0.0F, -0.6981F));

		PartDefinition cube_r256 = browHorn2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(85, 77).mirror().addBox(-0.5F, -0.445F, -1.5177F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0479F, 0.3445F, 1.7796F, 0.0F, 0.0F));

		PartDefinition cube_r257 = browHorn2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(97, 50).mirror().addBox(-0.5F, -1.9966F, -1.0128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9479F, 0.5445F, 1.0104F, 0.2458F, -0.1515F));

		PartDefinition cube_r258 = browHorn2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(53, 26).mirror().addBox(-0.5F, -1.2099F, -1.3643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9479F, 1.5445F, 0.6452F, 0.0F, 0.0F));

		PartDefinition cube_r259 = browHorn2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(89, 97).mirror().addBox(-0.5F, -1.5099F, -0.9643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9479F, 1.5445F, 0.8197F, 0.0F, 0.0F));

		PartDefinition nasalHorn = head.addOrReplaceChild("nasalHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.2822F, -8.4273F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r260 = nasalHorn.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(62, 7).addBox(-1.0F, -2.6554F, -0.2464F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -1.8F, -1.6F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r261 = nasalHorn.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(100, 14).addBox(-1.0F, 0.2455F, -1.3598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.8F, -3.1067F, 0.0F, 0.0F));

		PartDefinition cube_r262 = nasalHorn.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(84, 97).addBox(-1.0F, -0.7545F, -0.9598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.8F, -2.5831F, 0.0F, 0.0F));

		PartDefinition cube_r263 = nasalHorn.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(62, 90).addBox(-1.0F, -0.5507F, -1.8885F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.0F, -2.3911F, 0.0F, 0.0F));

		PartDefinition cube_r264 = nasalHorn.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(91, 39).addBox(-0.5783F, -1.9751F, -1.858F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.7478F, -1.7635F, 1.5077F, 1.8151F, -0.1309F, 0.0F));

		PartDefinition cube_r265 = nasalHorn.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(99, 77).addBox(-0.5F, 0.9695F, -0.8676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.249F, -0.9741F, 0.7156F, -0.1309F, 0.0F));

		PartDefinition cube_r266 = nasalHorn.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(91, 73).addBox(-0.4217F, -1.9751F, -1.858F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2522F, -1.7635F, 1.5077F, 1.8151F, 0.1309F, 0.0F));

		PartDefinition cube_r267 = nasalHorn.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(42, 100).addBox(-0.5F, 0.9695F, -0.8676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.249F, -0.9741F, 0.7156F, 0.1309F, 0.0F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3178F, -1.0273F, -0.3863F, 0.009F, 0.0088F));

		PartDefinition cube_r268 = frill.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(15, 88).addBox(-0.5F, -6.9869F, -0.0254F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.9894F, 2.1726F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r269 = frill.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(93, 44).addBox(-1.0F, -0.0195F, -1.2139F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(93, 67).addBox(-1.0F, -0.0195F, -0.8139F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -7.7509F, 5.6999F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r270 = frill.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(97, 31).addBox(-1.0F, -0.4F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -7.3771F, 6.1066F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r271 = frill.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(74, 29).addBox(-2.0F, 3.6293F, -0.2107F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(16, 79).addBox(-1.0F, 4.6293F, -0.2107F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -10.6894F, 8.6726F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r272 = frill.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(11, 15).addBox(-0.5F, -3.8242F, -0.0807F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0479F, -0.0429F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r273 = frill.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 38).addBox(-2.5F, -3.8242F, 0.0193F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0479F, -0.0429F, -1.3963F, 0.0F, 0.0F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(1.017F, -0.453F, 3.5091F, -0.1933F, -0.2635F, 0.128F));

		PartDefinition cube_r274 = leftFrill.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(47, 62).addBox(-2.5F, -1.8F, -0.7F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6884F, 1.942F, 0.1533F, -0.1555F, -0.2181F, -0.8919F));

		PartDefinition cube_r275 = leftFrill.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(88, 8).addBox(-5.2304F, 4.7815F, -0.166F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4126F, -5.8088F, 1.6679F, -0.2088F, -0.1307F, 0.2151F));

		PartDefinition cube_r276 = leftFrill.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(88, 30).addBox(-3.1335F, 4.7632F, -0.1828F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3126F, -5.2088F, 1.7679F, -0.2278F, -0.3768F, 0.2711F));

		PartDefinition cube_r277 = leftFrill.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(20, 99).addBox(-2.183F, 5.99F, -0.1494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3126F, -5.2088F, 1.7679F, -0.1056F, -0.4982F, -0.0048F));

		PartDefinition cube_r278 = leftFrill.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(55, 99).addBox(2.053F, 5.5933F, -0.3758F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3126F, -5.2088F, 1.7679F, -0.3638F, -0.4581F, 0.5927F));

		PartDefinition cube_r279 = leftFrill.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(99, 46).addBox(-0.0044F, -1.9219F, -0.6296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(99, 46).addBox(-0.0044F, -0.9219F, -0.6296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(6.8657F, -7.0943F, 2.6088F, 0.3895F, -0.2684F, -1.9701F));

		PartDefinition cube_r280 = leftFrill.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(6, 99).addBox(-0.5912F, -1.0429F, -0.6296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.8657F, -7.0943F, 2.6088F, 0.4688F, 0.0165F, -2.5762F));

		PartDefinition cube_r281 = leftFrill.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(44, 90).addBox(-2.7973F, -1.5493F, -0.5488F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.9188F, -7.939F, 2.1688F, 0.339F, -0.0718F, -2.7805F));

		PartDefinition cube_r282 = leftFrill.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(68, 95).addBox(-1.4814F, -1.9011F, -1.0909F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(96, 6).addBox(-1.5814F, -1.1011F, -1.0909F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.1801F, -8.2207F, 2.7452F, 0.3395F, 0.0694F, 3.108F));

		PartDefinition cube_r283 = leftFrill.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(33, 21).addBox(-0.711F, -1.574F, -0.813F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(5.1746F, -8.6974F, 2.9115F, 0.3909F, 0.0089F, -2.7472F));

		PartDefinition cube_r284 = leftFrill.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(0, 29).addBox(0.1952F, -1.8434F, -0.813F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.1746F, -8.6974F, 2.9115F, 0.367F, -0.138F, -2.3819F));

		PartDefinition cube_r285 = leftFrill.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(30, 43).addBox(-0.2056F, -1.8503F, -0.813F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(5.1746F, -8.6974F, 2.9115F, 0.3843F, -0.0738F, -2.5452F));

		PartDefinition cube_r286 = leftFrill.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(33, 96).addBox(-0.2056F, -0.8503F, -0.813F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.6746F, -8.0974F, 2.4115F, 0.3195F, -0.1978F, 2.9963F));

		PartDefinition cube_r287 = leftFrill.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(0, 56).addBox(-0.711F, -0.574F, -0.813F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.6746F, -8.0974F, 2.4115F, 0.3532F, -0.1256F, 2.7877F));

		PartDefinition cube_r288 = leftFrill.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(92, 84).addBox(-0.0951F, -0.3531F, -1.4663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4438F, -7.1696F, 0.9636F, -0.8983F, 0.0278F, 2.7053F));

		PartDefinition cube_r289 = leftFrill.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(25, 54).addBox(-0.7267F, -0.3531F, -1.3207F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4438F, -7.1696F, 0.9636F, -0.9098F, -0.2674F, 3.0879F));

		PartDefinition cube_r290 = leftFrill.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(86, 18).addBox(-0.238F, -0.493F, -1.1248F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.7345F, -7.6789F, 1.0651F, -0.8999F, -0.1378F, 2.8904F));

		PartDefinition cube_r291 = leftFrill.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(87, 70).addBox(-0.238F, -0.493F, -0.6248F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7345F, -7.6789F, 1.0651F, -0.8999F, -0.1378F, 2.8904F));

		PartDefinition cube_r292 = leftFrill.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(89, 58).addBox(-1.5F, -0.8F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4345F, -7.6789F, 1.1651F, -0.2995F, -0.0888F, 2.8287F));

		PartDefinition cube_r293 = leftFrill.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(90, 47).addBox(-2.0F, -0.1F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2521F, -6.8531F, 1.9986F, 0.3637F, -0.0888F, 2.8287F));

		PartDefinition cube_r294 = leftFrill.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(20, 51).addBox(-6.8285F, -0.217F, -0.8348F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.1388F, -0.393F, -0.3139F, 0.0225F, 0.3882F, 1.9707F));

		PartDefinition cube_r295 = leftFrill.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(80, 73).addBox(0.4F, -1.1F, -0.9F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.1417F, -7.4826F, 2.9006F, -0.0001F, 0.2321F, 1.8774F));

		PartDefinition cube_r296 = leftFrill.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(80, 0).addBox(-1.5F, -1.0F, -0.8F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2672F, -1.4457F, 0.5052F, -0.2113F, 0.5666F, 1.1477F));

		PartDefinition cube_r297 = leftFrill.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(39, 45).addBox(-2.0F, -1.0F, -0.4F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3296F, -2.4737F, 0.8323F, -0.2683F, 0.3121F, 1.8919F));

		PartDefinition cube_r298 = leftFrill.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(46, 68).addBox(3.0108F, -3.4591F, -0.0388F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.3126F, -5.2088F, 1.7679F, -0.4423F, 0.456F, 2.119F));

		PartDefinition cube_r299 = leftFrill.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(56, 69).addBox(2.5796F, 0.8751F, -0.0388F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(6.3126F, -5.2088F, 1.7679F, -0.616F, -0.1078F, 1.2191F));

		PartDefinition cube_r300 = leftFrill.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(99, 65).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(6.801F, -3.4932F, 1.8675F, -0.34F, 0.2266F, 1.674F));

		PartDefinition cube_r301 = leftFrill.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(91, 13).addBox(0.6214F, -2.184F, -0.0812F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.3126F, -5.2088F, 1.7679F, -0.4788F, 0.4172F, 2.0327F));

		PartDefinition cube_r302 = leftFrill.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(94, 16).addBox(0.2495F, -0.5039F, -0.0812F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(6.3126F, -5.2088F, 1.7679F, -0.6053F, -0.1629F, 1.1397F));

		PartDefinition cube_r303 = leftFrill.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(60, 99).addBox(2.685F, -7.187F, 0.0796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.3126F, -5.2088F, 1.7679F, -0.066F, 0.5373F, 2.7644F));

		PartDefinition cube_r304 = leftFrill.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(91, 0).addBox(5.7928F, 3.2443F, 0.1049F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.08F)), PartPose.offsetAndRotation(6.3126F, -5.2088F, 1.7679F, -0.5409F, 0.0106F, 1.3398F));

		PartDefinition cube_r305 = leftFrill.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(91, 35).addBox(6.5163F, -2.6634F, 0.1049F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.3126F, -5.2088F, 1.7679F, -0.4438F, 0.3202F, 1.9069F));

		PartDefinition cube_r306 = leftFrill.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(44, 24).addBox(3.4208F, -4.9932F, -0.0204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.3126F, -5.2088F, 1.7679F, -0.2603F, 0.4798F, 2.3695F));

		PartDefinition cube_r307 = leftFrill.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 52).addBox(-0.4089F, -0.4805F, -0.0204F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.3126F, -5.2088F, 1.7679F, -0.5174F, 0.1657F, 1.6042F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.017F, -0.453F, 3.5091F, -0.1933F, 0.2635F, -0.128F));

		PartDefinition cube_r308 = rightFrill.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(47, 62).mirror().addBox(-2.5F, -1.8F, -0.7F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6884F, 1.942F, 0.1533F, -0.1555F, 0.2181F, 0.8919F));

		PartDefinition cube_r309 = rightFrill.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(88, 8).mirror().addBox(2.2304F, 4.7815F, -0.166F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4126F, -5.8088F, 1.6679F, -0.2088F, 0.1307F, -0.2151F));

		PartDefinition cube_r310 = rightFrill.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(88, 30).mirror().addBox(0.1335F, 4.7632F, -0.1828F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3126F, -5.2088F, 1.7679F, -0.2278F, 0.3768F, -0.2711F));

		PartDefinition cube_r311 = rightFrill.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(20, 99).mirror().addBox(1.183F, 5.99F, -0.1494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3126F, -5.2088F, 1.7679F, -0.1056F, 0.4982F, 0.0048F));

		PartDefinition cube_r312 = rightFrill.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(55, 99).mirror().addBox(-3.053F, 5.5933F, -0.3758F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3126F, -5.2088F, 1.7679F, -0.3638F, 0.4581F, -0.5927F));

		PartDefinition cube_r313 = rightFrill.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(99, 46).mirror().addBox(-0.9956F, -1.9219F, -0.6296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(99, 46).mirror().addBox(-0.9956F, -0.9219F, -0.6296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-6.8657F, -7.0943F, 2.6088F, 0.3895F, 0.2684F, 1.9701F));

		PartDefinition cube_r314 = rightFrill.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(6, 99).mirror().addBox(-0.4088F, -1.0429F, -0.6296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.8657F, -7.0943F, 2.6088F, 0.4688F, -0.0165F, 2.5762F));

		PartDefinition cube_r315 = rightFrill.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(44, 90).mirror().addBox(-0.2027F, -1.5493F, -0.5488F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9188F, -7.939F, 2.1688F, 0.339F, 0.0718F, 2.7805F));

		PartDefinition cube_r316 = rightFrill.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(68, 95).mirror().addBox(-0.5186F, -1.9011F, -1.0909F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(96, 6).mirror().addBox(-0.4186F, -1.1011F, -1.0909F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1801F, -8.2207F, 2.7452F, 0.3395F, -0.0694F, -3.108F));

		PartDefinition cube_r317 = rightFrill.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(33, 21).mirror().addBox(-0.289F, -1.574F, -0.813F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-5.1746F, -8.6974F, 2.9115F, 0.3909F, -0.0089F, 2.7472F));

		PartDefinition cube_r318 = rightFrill.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-1.1952F, -1.8434F, -0.813F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.1746F, -8.6974F, 2.9115F, 0.367F, 0.138F, 2.3819F));

		PartDefinition cube_r319 = rightFrill.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(30, 43).mirror().addBox(-0.7944F, -1.8503F, -0.813F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-5.1746F, -8.6974F, 2.9115F, 0.3843F, 0.0738F, 2.5452F));

		PartDefinition cube_r320 = rightFrill.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(33, 96).mirror().addBox(-0.7944F, -0.8503F, -0.813F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.6746F, -8.0974F, 2.4115F, 0.3195F, 0.1978F, -2.9963F));

		PartDefinition cube_r321 = rightFrill.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.289F, -0.574F, -0.813F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.6746F, -8.0974F, 2.4115F, 0.3532F, 0.1256F, -2.7877F));

		PartDefinition cube_r322 = rightFrill.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(92, 84).mirror().addBox(-0.9049F, -0.3531F, -1.4663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4438F, -7.1696F, 0.9636F, -0.8983F, -0.0278F, -2.7053F));

		PartDefinition cube_r323 = rightFrill.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(25, 54).mirror().addBox(-0.2733F, -0.3531F, -1.3207F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4438F, -7.1696F, 0.9636F, -0.9098F, 0.2674F, -3.0879F));

		PartDefinition cube_r324 = rightFrill.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(86, 18).mirror().addBox(-2.762F, -0.493F, -1.1248F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.7345F, -7.6789F, 1.0651F, -0.8999F, 0.1378F, -2.8904F));

		PartDefinition cube_r325 = rightFrill.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(87, 70).mirror().addBox(-2.762F, -0.493F, -0.6248F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7345F, -7.6789F, 1.0651F, -0.8999F, 0.1378F, -2.8904F));

		PartDefinition cube_r326 = rightFrill.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(89, 58).mirror().addBox(-1.5F, -0.8F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.4345F, -7.6789F, 1.1651F, -0.2995F, 0.0888F, -2.8287F));

		PartDefinition cube_r327 = rightFrill.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(90, 47).mirror().addBox(-1.0F, -0.1F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2521F, -6.8531F, 1.9986F, 0.3637F, 0.0888F, -2.8287F));

		PartDefinition cube_r328 = rightFrill.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(20, 51).mirror().addBox(-1.1715F, -0.217F, -0.8348F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1388F, -0.393F, -0.3139F, 0.0225F, -0.3882F, -1.9707F));

		PartDefinition cube_r329 = rightFrill.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(80, 73).mirror().addBox(-4.4F, -1.1F, -0.9F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.1417F, -7.4826F, 2.9006F, -0.0001F, -0.2321F, -1.8774F));

		PartDefinition cube_r330 = rightFrill.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-2.5F, -1.0F, -0.8F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2672F, -1.4457F, 0.5052F, -0.2113F, -0.5666F, -1.1477F));

		PartDefinition cube_r331 = rightFrill.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(39, 45).mirror().addBox(-2.0F, -1.0F, -0.4F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3296F, -2.4737F, 0.8323F, -0.2683F, -0.3121F, -1.8919F));

		PartDefinition cube_r332 = rightFrill.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(46, 68).mirror().addBox(-5.0108F, -3.4591F, -0.0388F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.3126F, -5.2088F, 1.7679F, -0.4423F, -0.456F, -2.119F));

		PartDefinition cube_r333 = rightFrill.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(56, 69).mirror().addBox(-4.5796F, 0.8751F, -0.0388F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-6.3126F, -5.2088F, 1.7679F, -0.616F, 0.1078F, -1.2191F));

		PartDefinition cube_r334 = rightFrill.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(99, 65).mirror().addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-6.801F, -3.4932F, 1.8675F, -0.34F, -0.2266F, -1.674F));

		PartDefinition cube_r335 = rightFrill.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(91, 13).mirror().addBox(-3.6214F, -2.184F, -0.0812F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.3126F, -5.2088F, 1.7679F, -0.4788F, -0.4172F, -2.0327F));

		PartDefinition cube_r336 = rightFrill.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(94, 16).mirror().addBox(-2.2495F, -0.5039F, -0.0812F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-6.3126F, -5.2088F, 1.7679F, -0.6053F, 0.1629F, -1.1397F));

		PartDefinition cube_r337 = rightFrill.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(60, 99).mirror().addBox(-3.685F, -7.187F, 0.0796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.3126F, -5.2088F, 1.7679F, -0.066F, -0.5373F, -2.7644F));

		PartDefinition cube_r338 = rightFrill.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-8.7928F, 3.2443F, 0.1049F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.08F)).mirror(false), PartPose.offsetAndRotation(-6.3126F, -5.2088F, 1.7679F, -0.5409F, -0.0106F, -1.3398F));

		PartDefinition cube_r339 = rightFrill.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(91, 35).mirror().addBox(-9.5163F, -2.6634F, 0.1049F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.3126F, -5.2088F, 1.7679F, -0.4438F, -0.3202F, -1.9069F));

		PartDefinition cube_r340 = rightFrill.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(44, 24).mirror().addBox(-4.4208F, -4.9932F, -0.0204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.3126F, -5.2088F, 1.7679F, -0.2603F, -0.4798F, -2.3695F));

		PartDefinition cube_r341 = rightFrill.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-6.5911F, -0.4805F, -0.0204F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.3126F, -5.2088F, 1.7679F, -0.5174F, -0.1657F, -1.6042F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 3.6389F, -3.5648F, 0.4008F, 0.0F, 0.0F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(54, 95).mirror().addBox(-2.0193F, -0.9612F, 0.3519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5F, -3.9F, 0.4073F, -0.158F, -0.0744F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(47, 85).mirror().addBox(-0.8958F, -0.1812F, -3.7021F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.4F, -0.1F, 0.421F, -0.1728F, -0.0245F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(39, 37).mirror().addBox(-2.0616F, -1.3968F, 0.3046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0686F, 1.3423F, -0.6995F, -0.1739F, 0.0154F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(77, 15).mirror().addBox(-0.6F, 0.1249F, -4.4906F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.3F, 1.2F, 0.2793F, -0.192F, 0.0F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(83, 93).mirror().addBox(-0.3611F, -0.6928F, -0.233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-1.1676F, 3.7384F, -7.1F, -0.192F, -0.2967F, 0.0F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(90, 93).mirror().addBox(-0.3611F, -0.6628F, -0.2795F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1676F, 3.7384F, -7.1F, -0.4014F, -0.2967F, 0.0F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(64, 85).mirror().addBox(0.2503F, -0.0096F, 0.0284F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.5F, -5.9F, 0.2594F, -0.1724F, 0.0276F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(61, 95).mirror().addBox(-1.0F, 3.196F, -6.9454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.5F, 1.3F, -0.0349F, -0.1745F, 0.0F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(-2.0616F, -0.9311F, 0.0828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0686F, 1.3423F, -0.0537F, -0.1739F, 0.0154F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(92, 63).mirror().addBox(-2.0616F, 0.1018F, -0.6399F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0686F, 1.3423F, -1.7467F, -0.1739F, 0.0154F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-2.0616F, -0.6805F, -1.672F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0686F, 1.3423F, -0.9438F, -0.1739F, 0.0154F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.0F, -1.5217F, -5.237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.7F, 0.7156F, -0.1745F, 0.0F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(11, 29).mirror().addBox(-0.8958F, -0.1812F, -3.7021F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.1F, -0.1F, 0.421F, -0.1728F, -0.0245F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(36, 86).mirror().addBox(-0.7395F, -0.903F, -2.8712F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.4F, -0.8F, 0.1542F, -0.1713F, 0.0336F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(55, 49).mirror().addBox(-1.0F, 0.6222F, -2.4562F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.7F, 0.5236F, -0.1745F, 0.0F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(54, 95).addBox(1.0193F, -0.9612F, 0.3519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.0F, 4.5F, -3.9F, 0.4073F, 0.158F, 0.0744F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(47, 85).addBox(-0.1042F, -0.1812F, -3.7021F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -0.1F, 0.421F, 0.1728F, 0.0245F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(100, 0).addBox(0.0F, -1.5217F, -5.237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.7156F, 0.1745F, 0.0F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(92, 63).addBox(1.0616F, 0.1018F, -0.6399F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, 1.0686F, 1.3423F, -1.7467F, 0.1739F, -0.0154F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(39, 37).addBox(1.0616F, -1.3968F, 0.3046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0F, 1.0686F, 1.3423F, -0.6995F, 0.1739F, -0.0154F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(18, 30).addBox(1.0616F, -0.9311F, 0.0828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0686F, 1.3423F, -0.0537F, 0.1739F, -0.0154F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(51, 0).addBox(1.0616F, -0.6805F, -1.672F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 1.0686F, 1.3423F, -0.9438F, 0.1739F, -0.0154F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(77, 15).addBox(0.6F, 0.1249F, -4.4906F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 1.2F, 0.2793F, 0.192F, 0.0F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(11, 29).addBox(-0.1042F, -0.1812F, -3.7021F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -0.1F, 0.421F, 0.1728F, 0.0245F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(64, 85).addBox(-1.2503F, -0.0096F, 0.0284F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, -5.9F, 0.2594F, 0.1724F, -0.0276F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(83, 93).addBox(-0.6389F, -0.6928F, -0.233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.8324F, 3.7384F, -7.1F, -0.192F, 0.2967F, 0.0F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(90, 93).addBox(-0.6389F, -0.6628F, -0.2795F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8324F, 3.7384F, -7.1F, -0.4014F, 0.2967F, 0.0F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(61, 95).addBox(0.0F, 3.196F, -6.9454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.3F, -0.0349F, 0.1745F, 0.0F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(36, 86).addBox(-0.2605F, -0.903F, -2.8712F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.4F, -0.8F, 0.1542F, 0.1713F, -0.0336F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(55, 49).addBox(0.0F, 0.6222F, -2.4562F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.5236F, 0.1745F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(11, 15).addBox(-1.0F, -0.1962F, 0.0069F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.004F))
				.texOffs(95, 93).addBox(1.0F, 0.8038F, 1.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 56).addBox(1.0F, 0.8038F, 3.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 86).addBox(1.0F, 0.8038F, 5.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 86).mirror().addBox(-3.0F, 0.8038F, 5.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 56).mirror().addBox(-3.0F, 0.8038F, 3.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 93).mirror().addBox(-3.0F, 0.8038F, 1.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4645F, 7.5087F, -0.4821F, -0.1846F, 0.1169F));

		PartDefinition cube_r372 = tail.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(0, 46).addBox(0.0F, 0.5F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 29).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0315F, 3.2718F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r373 = tail.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(0, 70).addBox(0.0F, -3.278F, 3.6023F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 63).addBox(0.0F, -2.578F, 1.8023F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 56).addBox(0.0F, -2.178F, -0.0977F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1643F, 1.1245F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(30, 43).addBox(-0.5F, -0.8697F, -0.1085F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(75, 52).addBox(0.5F, -0.3697F, -0.1085F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 75).addBox(0.4F, -0.3697F, 1.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 58).addBox(0.0F, -0.3697F, 3.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 58).mirror().addBox(-2.0F, -0.3697F, 3.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 75).mirror().addBox(-2.4F, -0.3697F, 1.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 52).mirror().addBox(-2.5F, -0.3697F, -0.1085F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9695F, 7.0283F, 0.3065F, -0.0832F, -0.0263F));

		PartDefinition cube_r374 = tail2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(60, 62).addBox(0.0F, -1.5611F, -0.0987F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7697F, 3.9915F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r375 = tail2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(0, 63).addBox(0.0F, -1.9F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 63).addBox(0.0F, -1.5F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3697F, 0.3915F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r376 = tail2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(0, 38).addBox(0.0F, 3.7F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 40).addBox(0.0F, 1.9F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 18).addBox(0.0F, 1.2F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.062F, -3.7565F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.203F, -0.0166F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F))
				.texOffs(33, 54).addBox(0.5F, 0.297F, -0.0166F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 35).addBox(0.2F, 0.297F, 1.9834F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 2).addBox(-0.1F, 0.297F, 3.9834F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 2).mirror().addBox(-0.9F, 0.297F, 3.9834F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 35).mirror().addBox(-1.2F, 0.297F, 1.9834F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 54).mirror().addBox(-1.5F, 0.297F, -0.0166F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6721F, 5.671F, 0.301F, 0.1668F, 0.0515F));

		PartDefinition cube_r377 = tail3.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(52, 53).addBox(0.0F, -1.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 42).addBox(0.0F, -2.6F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 0).addBox(0.0F, -1.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 46).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.303F, -0.0166F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r378 = tail3.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(14, 38).addBox(0.0F, 6.9F, 13.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, 5.9F, 11.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(0.0F, 4.7F, 9.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7341F, -9.4274F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(22, 21).addBox(-0.5F, -0.5012F, -0.0752F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2549F, 7.942F, 0.2055F, 0.2137F, 0.0442F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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