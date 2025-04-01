package fossils.fossils.client.blockentity.model.spinosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SpinosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart rightthigh;
	private final ModelPart rightshin;
	private final ModelPart rightankle;
	private final ModelPart rightfoot;
	private final ModelPart righttoes;
	private final ModelPart leftthigh;
	private final ModelPart leftshin;
	private final ModelPart leftankle;
	private final ModelPart leftfoot;
	private final ModelPart lefttoes;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart rightupperarm;
	private final ModelPart rightlowerarm;
	private final ModelPart righthand;
	private final ModelPart rightouterfingers;
	private final ModelPart rightthumb;
	private final ModelPart rightthumbclaw;
	private final ModelPart leftupperarm;
	private final ModelPart leftlowerarm;
	private final ModelPart lefthand;
	private final ModelPart leftouterfingers;
	private final ModelPart leftthumb;
	private final ModelPart leftthumbclaw;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftAngularSurangular;
	private final ModelPart leftDentary;
	private final ModelPart rightAngularSurangular;
	private final ModelPart rightDentary;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public SpinosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.rightthigh = this.hips.getChild("rightthigh");
		this.rightshin = this.rightthigh.getChild("rightshin");
		this.rightankle = this.rightshin.getChild("rightankle");
		this.rightfoot = this.rightankle.getChild("rightfoot");
		this.righttoes = this.rightfoot.getChild("righttoes");
		this.leftthigh = this.hips.getChild("leftthigh");
		this.leftshin = this.leftthigh.getChild("leftshin");
		this.leftankle = this.leftshin.getChild("leftankle");
		this.leftfoot = this.leftankle.getChild("leftfoot");
		this.lefttoes = this.leftfoot.getChild("lefttoes");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.rightupperarm = this.chest.getChild("rightupperarm");
		this.rightlowerarm = this.rightupperarm.getChild("rightlowerarm");
		this.righthand = this.rightlowerarm.getChild("righthand");
		this.rightouterfingers = this.righthand.getChild("rightouterfingers");
		this.rightthumb = this.righthand.getChild("rightthumb");
		this.rightthumbclaw = this.rightthumb.getChild("rightthumbclaw");
		this.leftupperarm = this.chest.getChild("leftupperarm");
		this.leftlowerarm = this.leftupperarm.getChild("leftlowerarm");
		this.lefthand = this.leftlowerarm.getChild("lefthand");
		this.leftouterfingers = this.lefthand.getChild("leftouterfingers");
		this.leftthumb = this.lefthand.getChild("leftthumb");
		this.leftthumbclaw = this.leftthumb.getChild("leftthumbclaw");
		this.neck5 = this.chest.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck6 = this.neck.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.leftAngularSurangular = this.jaw.getChild("leftAngularSurangular");
		this.leftDentary = this.leftAngularSurangular.getChild("leftDentary");
		this.rightAngularSurangular = this.jaw.getChild("rightAngularSurangular");
		this.rightDentary = this.rightAngularSurangular.getChild("rightDentary");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -31.0F, -0.4F, 1.0F, 31.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -5.5F, -0.5F, 1.0F, 39.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(7.5F, -33.5F, -40.1F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-1.5F, -5.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.5F, -33.5F, -40.1F, 0.3054F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-3.5F, -5.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -33.5F, 0.1F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -30.9F, -2.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 41).addBox(-0.5F, 0.9F, 1.0F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -5.2F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightthigh = hips.addOrReplaceChild("rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2564F, -0.152F, 2.436F, -0.4897F, -0.011F, -0.041F));

		PartDefinition rightshin = rightthigh.addOrReplaceChild("rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3473F, 10.5461F, -0.9976F, 0.735F, 0.0F, 0.0424F));

		PartDefinition rightankle = rightshin.addOrReplaceChild("rightankle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0282F, 15.7806F, -0.12F, -0.2438F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightankle.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.4862F, -0.2121F, 0.1747F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6962F, -2.1762F));

		PartDefinition leftthigh = hips.addOrReplaceChild("leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2564F, -0.152F, 2.436F, 0.4702F, 0.011F, 0.041F));

		PartDefinition leftshin = leftthigh.addOrReplaceChild("leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3473F, 10.5461F, -0.9976F, 0.4732F, 0.0F, -0.0424F));

		PartDefinition leftankle = leftshin.addOrReplaceChild("leftankle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0282F, 15.7806F, -0.12F, -0.6802F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftankle.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.4862F, -0.2121F, 0.7856F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6962F, -2.1762F, -0.829F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0F, -4.2F, -0.01F, -0.1751F, -0.0412F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 41).addBox(-0.5F, 0.6557F, -6.1957F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -8.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(71, 73).addBox(-0.5F, 0.6662F, -10.8959F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -15.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2929F, -25.9522F, -0.1523F, -0.1349F, -0.0288F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, 0.971F, -3.0955F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.333F, -8.5901F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightupperarm = chest.addOrReplaceChild("rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.241F, 9.5951F, -6.5735F, 0.3783F, -0.2537F, -0.6675F));

		PartDefinition rightlowerarm = rightupperarm.addOrReplaceChild("rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3221F, 10.4607F, -0.8235F, -0.9986F, -0.4156F, 0.3079F));

		PartDefinition righthand = rightlowerarm.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1483F, 3.6598F, -0.1985F, 0.0F, 0.0F, 0.1698F));

		PartDefinition rightouterfingers = righthand.addOrReplaceChild("rightouterfingers", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0166F, 3.167F, 0.2F, 0.0F, 0.0F, 0.3821F));

		PartDefinition rightthumb = righthand.addOrReplaceChild("rightthumb", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5907F, 0.2958F, -1.1037F, -0.5308F, 0.0F, 0.2122F));

		PartDefinition rightthumbclaw = rightthumb.addOrReplaceChild("rightthumbclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6055F, 1.5369F, 6.2759F, -0.0213F, 0.0F, 0.6793F));

		PartDefinition leftupperarm = chest.addOrReplaceChild("leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.241F, 9.5951F, -6.5735F, 0.0219F, 0.5959F, 0.6709F));

		PartDefinition leftlowerarm = leftupperarm.addOrReplaceChild("leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3221F, 10.4607F, -0.8235F, -0.8949F, 0.2491F, -0.1345F));

		PartDefinition lefthand = leftlowerarm.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1483F, 3.6598F, -0.1985F, 0.0F, 0.0F, -0.1698F));

		PartDefinition leftouterfingers = lefthand.addOrReplaceChild("leftouterfingers", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0166F, 3.167F, 0.2F, 0.0F, 0.0F, -0.3821F));

		PartDefinition leftthumb = lefthand.addOrReplaceChild("leftthumb", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5907F, 0.2958F, -1.1037F, -0.5308F, 0.0F, -0.2122F));

		PartDefinition leftthumbclaw = leftthumb.addOrReplaceChild("leftthumbclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6055F, 1.5369F, 6.2759F, -0.0213F, 0.0F, -0.6793F));

		PartDefinition neck5 = chest.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.633F, -10.4901F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 88).addBox(-1.0F, 0.8714F, -2.6134F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0F, -5.3F, -0.2269F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4796F, -7.2215F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(104, 31).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -2.6202F, -2.8267F, -0.733F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0255F, -3.3525F, -0.2921F, -0.1564F, 0.0982F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(27, 77).addBox(-1.0F, 1.3707F, -4.2121F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -4.7103F, -2.2155F, -0.8727F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.6103F, -5.9155F, -0.2325F, -0.2008F, -0.0831F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(50, 77).addBox(-1.0F, 0.1742F, -0.0891F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.4F, -6.7F, -0.2444F, -0.0169F, 0.0042F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3F, -6.6F, 0.2474F, -0.0849F, -0.0275F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(105, 61).addBox(-0.5F, 0.5832F, -1.0513F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0993F, -3.8738F, 0.1134F, 0.0F, 0.0F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(74, 96).addBox(-1.0F, 0.0F, -7.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.5628F, -4.5376F, 0.7174F, 0.0736F, 0.0466F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.4085F, -5.949F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.7483F, -1.5709F, -1.6803F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.7483F, -1.5709F, -1.6803F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.8392F, 0.7026F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftAngularSurangular = jaw.addOrReplaceChild("leftAngularSurangular", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7F, 0.3F, -0.5F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftDentary = leftAngularSurangular.addOrReplaceChild("leftDentary", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.7F, -3.9F, 0.8727F, 0.0F, 0.0F));

		PartDefinition rightAngularSurangular = jaw.addOrReplaceChild("rightAngularSurangular", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, 0.3F, -0.5F, -0.096F, 0.0F, 0.0F));

		PartDefinition rightDentary = rightAngularSurangular.addOrReplaceChild("rightDentary", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.7F, -3.9F, 0.8727F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2582F, 10.3978F, -0.2608F, 0.3464F, -0.0443F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(1, 22).addBox(-0.5F, 0.0524F, -0.5007F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0951F, 14.8991F, 0.2011F, 0.3549F, -0.0577F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(37, 22).addBox(-0.5F, 0.135F, -0.5916F, 1.0F, 2.0F, 16.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1698F, 15.9994F, -0.2707F, 0.5527F, -0.3378F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(36, 58).addBox(-0.5F, 0.3F, -0.8F, 1.0F, 2.0F, 16.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1501F, 16.0196F, -0.1333F, 0.3891F, -0.2391F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(72, 18).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1798F, 15.0112F, -0.2241F, 0.3926F, -0.2959F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(70, 41).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0562F, 13.9047F, -0.2316F, 0.0625F, -0.1848F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(86, 0).addBox(0.0F, 0.2F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.0749F, 14.8146F, -0.4012F, 0.0542F, -0.211F));

		return LayerDefinition.create(meshdefinition, 166, 166);
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