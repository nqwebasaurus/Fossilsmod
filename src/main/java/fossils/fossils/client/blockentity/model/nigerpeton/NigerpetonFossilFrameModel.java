package fossils.fossils.client.blockentity.model.nigerpeton;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NigerpetonFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftFoot;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightFoot;
	private final ModelPart tail1;
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
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone12;
	private final ModelPart bone14;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart bone22;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone3;
	private final ModelPart bone23;
	private final ModelPart bone13;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone4;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone11;
	private final ModelPart bone24;
	private final ModelPart bone25;

	public NigerpetonFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftFoot = this.leftLeg2.getChild("leftFoot");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightFoot = this.rightLeg2.getChild("rightFoot");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
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
		this.neck = this.chest.getChild("neck");
		this.head = this.neck.getChild("head");
		this.bone9 = this.head.getChild("bone9");
		this.bone10 = this.bone9.getChild("bone10");
		this.bone12 = this.bone10.getChild("bone12");
		this.bone14 = this.bone9.getChild("bone14");
		this.bone17 = this.bone14.getChild("bone17");
		this.bone18 = this.head.getChild("bone18");
		this.bone19 = this.bone18.getChild("bone19");
		this.bone20 = this.bone19.getChild("bone20");
		this.bone21 = this.bone18.getChild("bone21");
		this.bone22 = this.bone21.getChild("bone22");
		this.bone7 = this.head.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone3 = this.head.getChild("bone3");
		this.bone23 = this.bone3.getChild("bone23");
		this.bone13 = this.head.getChild("bone13");
		this.bone5 = this.bone13.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
		this.bone4 = this.head.getChild("bone4");
		this.bone15 = this.bone4.getChild("bone15");
		this.bone16 = this.bone15.getChild("bone16");
		this.jaw = this.head.getChild("jaw");
		this.bone2 = this.jaw.getChild("bone2");
		this.bone11 = this.bone2.getChild("bone11");
		this.bone24 = this.jaw.getChild("bone24");
		this.bone25 = this.bone24.getChild("bone25");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -4.0F, 1.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(1.9F, -4.9F, -9.2F, 0.0F, -0.3403F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(1.6F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.9F, -4.9F, -9.2F, -0.3403F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(3.3F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -7.0F, 2.2F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 3.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, 0.6F, 0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.55F, -4.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8723F, -1.5735F, -0.633F, -0.186F, 0.1457F, 0.3345F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.904F, 0.6363F, 1.1848F, -2.7225F, -1.2905F, 2.4819F));

		PartDefinition leftFoot = leftLeg2.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(3.25F, 0.0F, 0.0F, -0.2267F, 0.9112F, -0.5097F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8723F, -1.5735F, -0.633F, 0.0702F, -1.244F, -0.4988F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.904F, 0.6363F, 1.1848F, 0.0F, 1.2654F, 0.0F));

		PartDefinition rightFoot = rightLeg2.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.25F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.4363F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, 0.3296F, -0.0668F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.7F, 1.9F, -0.2706F, -0.2527F, 0.0692F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 14).addBox(-0.5F, 0.2872F, -0.1038F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.019F, 4.8218F, 0.1155F, -0.4338F, -0.0487F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(39, 9).addBox(-0.6F, 0.2938F, -0.4922F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0126F, 4.9831F, 0.0481F, -0.4359F, -0.0203F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, 0.344F, 0.0165F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0123F, 2.9956F, 0.0472F, -0.3923F, -0.0181F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.2F, -4.1F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-2, 13).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.65F, -5.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -5.9F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 7).addBox(-0.5F, 0.45F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.956F, 2.8681F, -2.4351F, 0.3143F, -0.0549F, 0.1605F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.784F, -0.1309F, -0.158F, -0.1184F, 1.0224F, -0.0135F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(3.25F, 0.5F, 0.0F, 0.0757F, 0.0011F, -0.3332F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.956F, 2.8681F, -2.4351F, -0.0163F, 1.1189F, -0.3741F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.784F, -0.1309F, -0.158F, -0.1533F, -0.8997F, 0.0011F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.25F, 0.5F, 0.0F, 0.0873F, -0.3491F, 0.3054F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(40, 15).addBox(-0.5F, 0.1F, -3.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, -4.0F, -0.4822F, 0.0224F, 0.208F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -2.3F, -0.1326F, -0.0001F, 0.1716F));

		PartDefinition bone9 = head.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, -6.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.05F, -0.45F, 0.0436F, -0.0436F, 0.0F));

		PartDefinition bone12 = bone10.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6545F, 0.0F));

		PartDefinition bone14 = bone9.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.05F, -0.45F, 0.0436F, 0.0436F, 0.0F));

		PartDefinition bone17 = bone14.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6545F, 0.0F));

		PartDefinition bone18 = head.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, -6.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone19 = bone18.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.05F, -0.45F, 0.0436F, 0.0436F, 0.0F));

		PartDefinition bone20 = bone19.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6545F, 0.0F));

		PartDefinition bone21 = bone18.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.05F, -0.45F, 0.0436F, -0.0436F, 0.0F));

		PartDefinition bone22 = bone21.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6545F, 0.0F));

		PartDefinition bone7 = head.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, -6.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone3 = head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, -6.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone23 = bone3.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone13 = head.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -7.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone5 = bone13.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.35F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone4 = head.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -7.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone15 = bone4.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.35F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.8022F, 1.3642F, 0.672F, 0.0F, 0.0F));

		PartDefinition bone2 = jaw.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.4627F, -8.1411F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone11 = bone2.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone24 = jaw.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.4627F, -8.1411F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone25 = bone24.addOrReplaceChild("bone25", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 70, 70);
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