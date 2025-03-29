package fossils.fossils.client.blockentity.model.brachiosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BrachiosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart throat1;
	private final ModelPart moveableFlesh;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftFoot;
	private final ModelPart leftFoot2;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightFoot;
	private final ModelPart rightFoot2;

	public BrachiosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.neck = this.body2.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.head = this.neck9.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.throat1 = this.jaw.getChild("throat1");
		this.moveableFlesh = this.jaw.getChild("moveableFlesh");
		this.leftArm = this.body2.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm = this.body2.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftFoot = this.leftLeg2.getChild("leftFoot");
		this.leftFoot2 = this.leftFoot.getChild("leftFoot2");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightFoot = this.rightLeg2.getChild("rightFoot");
		this.rightFoot2 = this.rightFoot.getChild("rightFoot2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -58.0F, 38.0F, 2.0F, 58.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(7.0F, -13.0F, -1.0F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -61.0F, 39.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -21.0F, -1.0F, 2.0F, 42.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4F, -61.0F, -22.9F, -0.2007F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -47.0F, -1.0F, 2.0F, 108.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4F, -61.0F, -22.9F, 0.0F, -0.2007F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 1.45F, -25.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(-0.5F, -60.5F, 63.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(86, 4).addBox(-2.0F, -1.1232F, -6.7257F, 5.0F, 5.0F, 20.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.0111F, -3.4302F, -0.4712F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.25F, 8.2F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r5 = tail1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(85, 127).addBox(-1.0F, 0.5409F, -2.4913F, 4.0F, 4.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, -0.7F, 1.3F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(157, 125).addBox(-2.0F, -0.4555F, -0.0038F, 4.0F, 4.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.95F, 13.375F, -0.3099F, 0.1664F, -0.053F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1555F, 10.7962F, -0.3065F, 0.0832F, -0.0263F));

		PartDefinition cube_r6 = tail3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(95, 38).addBox(-1.0F, 0.9F, 0.175F, 3.0F, 3.0F, 20.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.1614F, -0.3608F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5614F, 19.6142F, 0.1772F, 0.1719F, 0.0306F));

		PartDefinition cube_r7 = tail4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 96).addBox(-0.5F, 1.1F, -1.025F, 2.0F, 2.0F, 21.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.1357F, 0.602F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2643F, 19.577F, 0.1855F, 0.3435F, 0.0631F));

		PartDefinition cube_r8 = tail5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 91).addBox(-0.5F, 0.9F, -0.325F, 2.0F, 2.0F, 21.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.8186F, 0.1841F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 109).addBox(-0.5F, 0.5063F, -0.4528F, 1.0F, 1.0F, 20.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.0186F, 20.6591F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2563F, 19.5472F, -0.0504F, -0.523F, 0.0252F));

		PartDefinition cube_r9 = tail7.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(143, 39).addBox(-0.1F, 1.0585F, -0.525F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.7872F, -0.0769F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(139, 127).addBox(-0.5F, 0.6143F, -0.1616F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0887F, 14.9559F, -0.1181F, -0.7383F, 0.0797F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.5F, -7.5F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(121, 91).addBox(-3.0F, 0.6212F, -0.0791F, 5.0F, 5.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -9.2897F, -11.5791F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(38, 58).addBox(-2.0F, 0.9488F, -0.3866F, 5.0F, 5.0F, 27.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -26.2897F, -30.9791F, -0.7069F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.5F, -32.2F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r12 = body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 82).addBox(-2.0F, 0.7569F, -0.4948F, 5.0F, 5.0F, 21.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -14.7F, -14.65F, -0.6894F, 0.0F, 0.0F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -14.5815F, -17.0953F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(85, 101).addBox(-1.5F, 1.0231F, -0.7745F, 4.0F, 5.0F, 18.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 1.3823F, -14.7032F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(79, 67).addBox(-2.0F, -1.5165F, -22.3423F, 4.0F, 5.0F, 24.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.9823F, -15.0032F, -0.0417F, -0.1893F, -0.3415F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4165F, -22.3423F, -0.2567F, -0.0983F, -0.1999F));

		PartDefinition cube_r14 = neck3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(48, 22).addBox(0.25F, 1.2F, -0.75F, 3.0F, 4.0F, 30.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.75F, -0.5199F, -28.1713F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(63, 120).addBox(-1.5F, -0.7651F, -14.7846F, 3.0F, 4.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.4801F, -28.2213F, -0.1292F, -0.0659F, -0.1674F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1349F, -14.7846F, 0.043F, 0.0076F, -0.1744F));

		PartDefinition cube_r15 = neck5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 48).addBox(-0.25F, 1.0F, 0.35F, 3.0F, 4.0F, 29.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.25F, -2.4846F, -28.7085F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8846F, -28.7585F, 0.2166F, -0.057F, -0.1466F));

		PartDefinition cube_r16 = neck6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(122, 36).addBox(-0.25F, 0.7F, 0.55F, 3.0F, 3.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.25F, -2.2886F, -14.5954F, -0.0698F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5886F, -14.5954F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r17 = neck7.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(143, 22).addBox(-0.25F, 0.9F, -0.05F, 3.0F, 3.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.25F, -2.946F, -12.6159F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.696F, -12.7159F, 0.4743F, -0.0547F, -0.2109F));

		PartDefinition cube_r18 = neck8.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 152).addBox(-1.5F, 0.9495F, -0.0719F, 3.0F, 3.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.9567F, -10.7093F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r19 = neck8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(188, 126).addBox(-1.5F, 0.85F, -0.05F, 3.0F, 3.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -4.5567F, -18.7093F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.8907F, -18.6933F, 0.5088F, -0.1703F, 0.0722F));

		PartDefinition cube_r20 = neck9.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(85, 126).addBox(-0.5F, 1.4F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -2.3415F, -4.444F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r21 = neck9.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(210, 176).addBox(-0.5F, 0.7F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.6415F, -7.444F, 0.0349F, 0.0F, 0.0F));

		PartDefinition head = neck9.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -1.6815F, -7.6565F, 0.4421F, -0.0498F, -0.0868F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 5.2068F, 0.1294F, -0.8552F, 0.0F, 0.0F));

		PartDefinition throat1 = jaw.addOrReplaceChild("throat1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.8557F, 2.3581F, 0.2531F, 0.0F, 0.0F));

		PartDefinition moveableFlesh = jaw.addOrReplaceChild("moveableFlesh", CubeListBuilder.create(), PartPose.offset(-1.0F, -7.5489F, 25.025F));

		PartDefinition leftArm = body2.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(18.5F, 23.5F, -22.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 30.9487F, 1.2168F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 21.2963F, -3.8258F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightArm = body2.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-17.5F, 23.5F, -22.8F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 30.9487F, 1.2168F, -0.7854F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 21.2963F, -3.8258F, 1.0036F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(16.0F, 3.75F, 1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 29.7159F, -0.677F, 0.5672F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg2.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 20.9319F, 0.7163F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -7.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-15.0F, 3.75F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 29.7159F, -0.677F, 0.6545F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg2.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 20.9319F, 0.7163F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -7.0F));

		return LayerDefinition.create(meshdefinition, 240, 240);
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