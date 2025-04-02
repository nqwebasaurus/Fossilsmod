package fossils.fossils.client.blockentity.model.pantheratigris;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PantheratigrisFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm5;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart sternum;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftThumb;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightThumb;
	private final ModelPart rightArm4;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftCanine;
	private final ModelPart rightCanine;
	private final ModelPart leftCanine2;
	private final ModelPart rightCanine2;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart leftCanine3;
	private final ModelPart rightCanine3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public PantheratigrisFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm5 = this.leftLeg3.getChild("leftArm5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm5 = this.rightLeg3.getChild("rightArm5");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.sternum = this.chest.getChild("sternum");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftThumb = this.leftArm3.getChild("leftThumb");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightThumb = this.rightArm3.getChild("rightThumb");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftCanine = this.head.getChild("leftCanine");
		this.rightCanine = this.head.getChild("rightCanine");
		this.leftCanine2 = this.head.getChild("leftCanine2");
		this.rightCanine2 = this.head.getChild("rightCanine2");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.leftCanine3 = this.jaw.getChild("leftCanine3");
		this.rightCanine3 = this.jaw.getChild("rightCanine3");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.9F, -23.0F, 14.0F, 1.0F, 23.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(3.3F, -4.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -18.5F, 14.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(3.0F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.5F, -22.0F, -13.9F, -0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-0.6F, -6.0F, -0.5F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.5F, -22.0F, -13.9F, 0.0F, 0.0873F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -23.9075F, 12.1984F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 0.6014F, 0.0389F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 1.5126F, 2.5223F, 0.4974F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.2449F, -0.6572F, 0.9338F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0528F, -0.2661F, -1.309F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftLeg3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 4.5364F, 0.7627F, 1.0559F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 1.5126F, 2.5223F, 0.2833F, -0.1677F, -0.0486F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.2449F, -0.6572F, 0.8901F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0528F, -0.2661F, -1.2654F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightLeg3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 4.5364F, 0.7627F, 1.0996F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -3.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 32).addBox(-0.5F, 0.5488F, 9.6474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.1675F, -13.1658F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8028F, -3.6452F, -0.289F, 0.0837F, -0.0248F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3241F, -7.6807F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4949F, -5.9528F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(15, 10).addBox(-0.5F, -0.3F, -4.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.5909F, -0.8958F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.203F, -13.7595F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(-1, 32).addBox(-0.5F, -1.2785F, 6.54F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 5.0094F, -9.5777F, 0.3403F, 0.0F, 0.0F));

		PartDefinition sternum = chest.addOrReplaceChild("sternum", CubeListBuilder.create(), PartPose.offset(0.1359F, 6.2734F, 0.9649F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9F, 3.7137F, -3.1594F, -0.0212F, 0.1643F, -0.2594F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 7.8623F, 1.7487F, -1.7491F, -0.7033F, 0.724F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 7.3379F, 1.3658F, 0.2955F, -0.5902F, -0.1678F));

		PartDefinition leftThumb = leftArm3.addOrReplaceChild("leftThumb", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2383F, 2.1254F, -0.2606F, -0.1021F, 0.2158F, 1.0023F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0236F, 3.0605F, 0.0949F, 1.7104F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9F, 3.7137F, -3.1594F, 0.6258F, -0.6203F, 0.1553F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 7.8623F, 1.7487F, -1.8689F, 0.5608F, -0.3741F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 7.3379F, 1.3658F, 0.1403F, 1.0746F, 0.4786F));

		PartDefinition rightThumb = rightArm3.addOrReplaceChild("rightThumb", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2383F, 2.1254F, -0.2606F, -0.0924F, -0.22F, -1.0467F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0236F, 3.0605F, 0.0949F, 1.5795F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3783F, -3.4491F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(61, 4).addBox(-0.5F, 0.5F, 4.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9639F, -5.7128F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3943F, -1.9248F, 0.4637F, 0.2749F, 0.1349F));

		PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -4.6993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, 0.1068F, -1.656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offset(0.0F, -0.6493F, -4.7036F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.081F, -1.0864F, -0.3981F, 0.1611F, -0.0674F));

		PartDefinition leftCanine = head.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(0.641F, 5.8486F, -4.6207F, 0.0595F, -0.093F, -0.2528F));

		PartDefinition rightCanine = head.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.641F, 5.8486F, -4.6207F, 0.0595F, 0.093F, 0.2528F));

		PartDefinition leftCanine2 = head.addOrReplaceChild("leftCanine2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5976F, 5.8418F, -5.1098F, -0.3797F, -0.1647F, -0.1461F));

		PartDefinition rightCanine2 = head.addOrReplaceChild("rightCanine2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5976F, 5.8418F, -5.1098F, -0.3797F, 0.1647F, 0.1461F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.4495F, -5.0505F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.4495F, -5.0505F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(1.4F, 1.4328F, 2.0323F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-1.4F, 1.4328F, 2.0323F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.2061F, -0.5724F, 1.5795F, 0.0F, 0.0F));

		PartDefinition leftCanine3 = jaw.addOrReplaceChild("leftCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2113F, 1.536F, -6.3325F, -1.1202F, 0.0554F, -2.6677F));

		PartDefinition rightCanine3 = jaw.addOrReplaceChild("rightCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9887F, 1.536F, -6.3325F, -1.1202F, -0.0554F, 2.6677F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(13, 27).addBox(-0.5F, 0.2897F, -0.114F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2464F, 1.6845F, -0.6096F, -0.2163F, 0.1487F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(-1, 38).addBox(-0.5F, 0.065F, -0.4039F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1897F, 3.586F, 0.3981F, -0.1611F, -0.0674F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(13, 20).addBox(-0.5F, 0.1855F, 0.1575F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 2.7952F, 0.1865F, -0.4728F, -0.0857F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, 0.2894F, -0.249F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 4).addBox(-0.5F, 0.2894F, 4.451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0132F, 4.6957F, 0.2815F, -0.1258F, -0.0363F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(11, 33).addBox(-0.5F, -0.1759F, -0.1632F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(14, 36).addBox(-0.5F, -0.1759F, 3.5368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5578F, 4.9631F, 0.4899F, -0.1932F, -0.102F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(30, 9).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.7505F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 90, 90);
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