package fossils.fossils.client.blockentity.model.ichthyovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IchthyovenatorFossilFrameModel extends SkullModelBase {
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
	private final ModelPart head;
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

	public IchthyovenatorFossilFrameModel(ModelPart root) {
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
		this.head = this.neck.getChild("head");
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.6F, -29.0F, -6.1F, 1.0F, 29.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(1.8F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -25.0F, -5.6F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-5.0F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, -25.0F, -29.7F, -0.3491F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -3.0F, -0.5F, 1.0F, 28.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.2F, -25.0F, -29.7F, 0.0F, 0.3491F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -28.0F, -6.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 18).addBox(-0.6F, 0.9F, 1.0F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -5.2F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightthigh = hips.addOrReplaceChild("rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 0.42F, 0.6F, 0.0339F, -0.011F, -0.041F));

		PartDefinition rightshin = rightthigh.addOrReplaceChild("rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2618F, 10.2892F, -1.5228F, 0.6651F, 0.0F, 0.0424F));

		PartDefinition rightankle = rightshin.addOrReplaceChild("rightankle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0524F, 10.5142F, 0.8396F, -0.7674F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightankle.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.4862F, -0.2121F, 0.1485F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6962F, -2.1762F));

		PartDefinition leftthigh = hips.addOrReplaceChild("leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 0.42F, 0.6F, -0.2715F, 0.011F, 0.041F));

		PartDefinition leftshin = leftthigh.addOrReplaceChild("leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2618F, 10.2892F, -1.5228F, 0.796F, 0.0F, -0.0424F));

		PartDefinition leftankle = leftshin.addOrReplaceChild("leftankle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0524F, 10.5142F, 0.8396F, -0.7674F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftankle.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.4862F, -0.2121F, 0.2794F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6962F, -2.1762F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0F, -4.2F, 0.0436F, 0.1309F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, 0.6557F, -0.1957F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -8.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 8).addBox(-0.5F, 0.9F, -0.2F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -15.8F, 0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -16.8F, 0.0436F, 0.1745F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(23, 51).addBox(-0.5F, 0.971F, -0.2955F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.2F, -7.7F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightupperarm = chest.addOrReplaceChild("rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1F, 9.3959F, -3.828F, 0.2456F, 0.1977F, -0.819F));

		PartDefinition rightlowerarm = rightupperarm.addOrReplaceChild("rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5299F, 7.2649F, -0.0679F, -1.09F, -0.1199F, 0.2569F));

		PartDefinition righthand = rightlowerarm.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0074F, 6.3648F, 5.8015F, 0.0F, 0.0F, 0.1698F));

		PartDefinition rightouterfingers = righthand.addOrReplaceChild("rightouterfingers", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8F, 0.5F, 0.0F, 0.0F, 0.3821F));

		PartDefinition rightthumb = righthand.addOrReplaceChild("rightthumb", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 1.5F, -0.9F, -0.5308F, 0.0F, 0.2122F));

		PartDefinition rightthumbclaw = rightthumb.addOrReplaceChild("rightthumbclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 2.5F, 0.0F, -0.0213F, 0.0F, 0.6793F));

		PartDefinition leftupperarm = chest.addOrReplaceChild("leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1F, 9.3959F, -3.828F, 0.4767F, 0.3316F, 0.9019F));

		PartDefinition leftlowerarm = leftupperarm.addOrReplaceChild("leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5299F, 7.2649F, -0.0679F, -1.0933F, 0.0424F, -0.2972F));

		PartDefinition lefthand = leftlowerarm.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0074F, 6.3648F, 5.8015F, 0.0F, 0.0F, -0.1698F));

		PartDefinition leftouterfingers = lefthand.addOrReplaceChild("leftouterfingers", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8F, 0.5F, 0.0F, 0.0F, -0.3821F));

		PartDefinition leftthumb = lefthand.addOrReplaceChild("leftthumb", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.5F, -0.9F, -0.5241F, 0.088F, -0.0613F));

		PartDefinition leftthumbclaw = leftthumb.addOrReplaceChild("leftthumbclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 2.5F, 0.0F, -0.0197F, 0.0081F, -0.2867F));

		PartDefinition neck5 = chest.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -8.0F, 0.0873F, 0.2182F, 0.0F));

		PartDefinition cube_r8 = neck5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 62).addBox(-1.0F, 0.4714F, -0.7134F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.5F, -3.9F, -0.2269F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offset(0.0F, -1.3F, -3.9F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(68, 38).addBox(-1.0F, -0.2F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.1F, -3.2F, -0.733F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6F, -2.8F, 0.352F, 0.2155F, 0.0153F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 18).addBox(-1.0F, 1.1707F, -0.9121F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -4.3F, -2.6F, -0.8727F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.2F, -3.7F, -0.0193F, 0.2173F, -0.0894F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 63).addBox(-1.0F, 0.7F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.4F, -3.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3F, -4.7F, -0.0479F, 0.2129F, -0.2233F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(68, 55).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0569F, -1.8639F, 0.1139F, -0.0867F, -0.0099F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -3.9F, -0.1252F, -0.1786F, 0.1972F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3F, 1.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftAngularSurangular = jaw.addOrReplaceChild("leftAngularSurangular", CubeListBuilder.create(), PartPose.offset(1.0F, 0.3F, -0.5F));

		PartDefinition leftDentary = leftAngularSurangular.addOrReplaceChild("leftDentary", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.7F, -3.9F, 0.8727F, 0.0F, 0.0F));

		PartDefinition rightAngularSurangular = jaw.addOrReplaceChild("rightAngularSurangular", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.3F, -0.5F));

		PartDefinition rightDentary = rightAngularSurangular.addOrReplaceChild("rightDentary", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.7F, -3.9F, 0.8727F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(38, 21).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.3F, 10.0F, -0.0467F, 0.2608F, -0.0233F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(35, 6).addBox(-0.5F, 0.0524F, -0.0007F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, 0.0266F, 0.1745F, 0.0046F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(-1, 35).addBox(-0.5F, 0.135F, -0.2916F, 1.0F, 2.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, 12.0F, 0.0575F, 0.1314F, -0.0109F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(27, 38).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, 12.0F, 0.2262F, -0.4789F, -0.039F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(41, 40).addBox(-0.5F, 0.3F, -0.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, 11.0F, 0.1264F, -0.5657F, -0.0444F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(20, 21).addBox(-0.4F, 0.2F, -0.1F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.1633F, -0.51F, 0.1243F));

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