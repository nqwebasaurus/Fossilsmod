package fossils.fossils.client.blockentity.model.argentavis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArgentavisFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart toe3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart toe2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart neck10;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public ArgentavisFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.toe3 = this.leftLeg3.getChild("toe3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.toe2 = this.rightLeg3.getChild("toe2");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck7 = this.neck2.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.neck10 = this.neck9.getChild("neck10");
		this.head = this.neck10.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -30.5506F, 6.3398F, 0.2966F, 0.1309F, -0.0011F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -0.8F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.9549F, -0.7643F, -1.5708F, 0.9512F, -1.5708F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.3051F, -0.4335F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.6196F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5F, 0.974F, -4.5424F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.974F, -4.5424F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.935F, 3.4355F, 2.1172F, -1.6839F, -0.0106F, -0.2126F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2071F, 9.6565F, 2.2328F, 1.0255F, -0.1784F, 0.0995F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.003F, 14.3199F, -3.1546F, -0.4378F, -0.0791F, 0.037F));

		PartDefinition toe3 = leftLeg3.addOrReplaceChild("toe3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.375F, 7.0962F, -0.3641F, 0.6981F, -0.3927F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7376F, 8.7882F, -0.6247F, 0.7458F, 0.0599F, 0.1285F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5027F, -3.3623F, 0.4752F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.935F, 3.4355F, 2.1172F, -1.6402F, 0.0106F, 0.2126F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2071F, 9.6565F, 2.2328F, 1.1128F, 0.1784F, -0.0995F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.003F, 14.3199F, -3.1546F, -0.6109F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.375F, 7.0962F, -0.3641F, 0.6981F, 0.3927F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7376F, 8.7882F, -0.6247F, 1.0623F, 0.1276F, 0.1099F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5027F, -3.3623F, 0.2134F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(83, 98).addBox(-0.5F, 0.6944F, -0.8932F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(84, 99).addBox(-0.5F, 0.6944F, 0.8068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(84, 99).addBox(-0.5F, 0.6944F, 1.5068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.1553F, 4.0927F, -0.829F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(90, 98).addBox(-0.505F, -0.175F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.005F, 0.8981F, 2.0591F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 76).addBox(-0.505F, -0.275F, -0.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, 1.925F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.4F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, 0.6994F, -3.6832F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.1F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1702F, -7.4128F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(52, 47).addBox(-1.0F, -0.55F, 1.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(49, 44).addBox(-1.0F, -0.55F, -2.125F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.7F, -2.3F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(43, 38).addBox(1.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.6341F, -2.4174F, -1.5708F, -1.4399F, 1.5708F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.287F, -0.1215F, -1.4115F, 2.8788F, 0.2434F, 0.6886F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0644F, 20.2454F, -1.7765F, 2.3691F, -0.1384F, 3.0123F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7267F, 29.6275F, 3.2519F, 1.3296F, -0.4112F, 0.3494F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.287F, -0.1215F, -1.4115F, 2.6764F, -0.0438F, -0.668F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0644F, 20.2454F, -1.7765F, 2.2732F, 0.0465F, -3.106F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7267F, 29.6275F, 3.2519F, 1.2066F, 0.3264F, -0.3274F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0142F, -0.1474F, -3.0035F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.0142F, -0.1474F, -3.0035F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8093F, -4.1F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r6 = neck6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(73, 72).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2131F, -3.253F, -0.4276F, 0.0F, 0.0F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0001F, -2.7542F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(68, 4).addBox(0.005F, -0.375F, -3.575F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.505F, 0.9138F, 0.1583F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9983F, -2.401F, 0.7399F, -0.0589F, 0.0644F));

		PartDefinition cube_r8 = neck4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(67, 30).addBox(-0.995F, -1.4231F, 1.7713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.495F, -3.3882F, -3.9709F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2888F, -1.9482F, 0.313F, -0.0269F, 0.083F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(33, 105).addBox(-0.995F, 3.1773F, -1.6317F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.495F, -6.1189F, -0.6178F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8246F, -0.6854F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(77, 109).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2076F, -0.6579F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(77, 109).addBox(-0.995F, 1.7522F, -1.5396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.495F, -3.3083F, -2.2532F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck7 = neck2.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6757F, -0.9972F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck7.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(109, 92).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6301F, -0.932F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck7.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(109, 92).addBox(-0.995F, 1.7522F, -1.5396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.495F, -2.8858F, -2.5273F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.941F, -1.7695F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck8.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(109, 96).addBox(-0.995F, 3.2772F, -1.4896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(109, 96).addBox(-0.995F, 1.5772F, -1.4896F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.495F, -3.3461F, -2.1947F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -1.425F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck9.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(97, 109).addBox(-0.995F, 2.0022F, -1.5146F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.495F, -3.3461F, -2.1947F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck10 = neck9.addOrReplaceChild("neck10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1F, -0.725F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r16 = neck10.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(102, 109).addBox(-0.995F, 2.1272F, -1.5396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.495F, -2.6461F, -2.8947F, 0.7941F, 0.0F, 0.0F));

		PartDefinition head = neck10.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8815F, -1.3581F, 0.8883F, 0.0678F, -0.055F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.2F, -12.517F, -3.363F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2F, -12.517F, -3.363F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.7518F, -0.6699F, -0.2524F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 130, 130);
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