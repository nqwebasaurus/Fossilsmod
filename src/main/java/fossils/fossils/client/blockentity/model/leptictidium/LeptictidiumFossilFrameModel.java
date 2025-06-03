package fossils.fossils.client.blockentity.model.leptictidium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LeptictidiumFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart bone4;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart bone3;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftZygomaticarch;
	private final ModelPart rightZygomaticarch;
	private final ModelPart leftMaxilla;
	private final ModelPart rightMaxilla;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public LeptictidiumFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.leftLeg1 = this.bone.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftFoot = this.leftLeg2.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.bone4 = this.hips.getChild("bone4");
		this.rightLeg1 = this.bone4.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightFoot = this.rightLeg2.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body4 = this.body.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.leftArm1 = this.bone2.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.bone3 = this.chest.getChild("bone3");
		this.rightArm1 = this.bone3.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftZygomaticarch = this.head.getChild("leftZygomaticarch");
		this.rightZygomaticarch = this.head.getChild("rightZygomaticarch");
		this.leftMaxilla = this.head.getChild("leftMaxilla");
		this.rightMaxilla = this.head.getChild("rightMaxilla");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.775F, 0.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(5.0F, -8.5F, -8.9F, 0.0F, -0.6545F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-1.6F, -1.7F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(5.0F, -8.5F, -8.9F, 0.6545F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-0.6F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -9.6F, 1.0F, 0.0436F, 0.0019F, -1.6144F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 1).addBox(-0.9F, -1.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -8.5F, 1.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.7683F, 1.7233F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 24).addBox(-0.5F, 0.7F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 21).addBox(-0.5F, 0.7F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.1604F, 1.3192F, -0.1921F, -0.0343F, 0.0067F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.95F, 1.0641F, -1.7334F));

		PartDefinition leftLeg1 = bone.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.65F, -0.7548F, 1.3061F, -1.1551F, -0.3634F, -0.0493F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.8903F, 0.6626F, 0.8814F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg2.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.2776F, 0.1161F, 0.6985F, 0.0167F, 0.0403F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.2296F, -2.9543F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.95F, 1.0641F, -1.7334F));

		PartDefinition rightLeg1 = bone4.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.65F, -0.7548F, 1.3061F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.8903F, 0.6626F, 2.1904F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg2.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.2776F, 0.1161F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.2296F, -2.9543F, -0.5672F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5075F, -1.9306F, 0.2466F, -0.2967F, -0.0735F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, 0.6F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.828F, -3.9592F, -0.1571F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.628F, -3.9592F, -0.134F, -0.2163F, 0.0289F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 12).addBox(-1.0F, 0.2F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.2607F, -0.5509F, 0.1571F, 0.0F, 0.0F));

		PartDefinition body4 = body.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.4789F, -1.8632F, 0.2803F, -0.0839F, -0.0241F));

		PartDefinition cube_r8 = body4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(28, 35).addBox(-1.0F, 0.7F, 4.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -6.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0978F, -1.7623F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 8).addBox(-0.5F, 0.6186F, 2.2405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.778F, -4.0456F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(32, 27).addBox(-0.5F, -0.1747F, 3.3866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(31, 26).addBox(-0.5F, -0.1747F, 1.6866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.778F, -5.2456F, 0.4887F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.8806F, 0.628F, -2.5068F));

		PartDefinition leftArm1 = bone2.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3643F, 1.9547F, -1.2685F, 1.3785F, 0.3187F, -0.1359F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0101F, 1.7862F, -1.3343F, -2.3566F, 0.0387F, -0.0202F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2214F, 1.7967F, -0.315F, 0.0584F, -0.1042F, 0.449F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0159F, 0.7712F, -0.0055F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.8806F, 0.628F, -2.5068F));

		PartDefinition rightArm1 = bone3.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3643F, 1.9547F, -1.2685F, 1.6839F, -0.3187F, 0.1359F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0101F, 1.7862F, -1.3343F, -2.3566F, -0.0387F, 0.0202F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2214F, 1.7967F, -0.315F, 0.0938F, 0.074F, -0.0559F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0159F, 0.7712F, -0.0055F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3046F, -3.4131F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(31, 32).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 31).addBox(-0.5F, 0.2F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.7F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3992F, -1.597F, -0.4544F, -0.2532F, -0.0195F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, 0.2F, 1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2827F, -1.4733F, 1.0893F, -0.2366F, -0.4216F));

		PartDefinition leftZygomaticarch = head.addOrReplaceChild("leftZygomaticarch", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9624F, -0.2068F, -1.2177F, 0.0F, 0.829F, 0.0F));

		PartDefinition rightZygomaticarch = head.addOrReplaceChild("rightZygomaticarch", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9624F, -0.2068F, -1.2177F, 0.0F, -0.829F, 0.0F));

		PartDefinition leftMaxilla = head.addOrReplaceChild("leftMaxilla", CubeListBuilder.create(), PartPose.offset(0.417F, -0.6549F, -8.874F));

		PartDefinition rightMaxilla = head.addOrReplaceChild("rightMaxilla", CubeListBuilder.create(), PartPose.offset(-0.417F, -0.6549F, -8.874F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, -0.2814F, -0.4289F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6934F, 1.812F, 0.0925F, 0.2594F, -0.0101F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(23, 18).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 14).addBox(-0.5F, 0.2F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1427F, 5.0074F, 0.0F, 0.0175F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1932F, 4.8951F, 0.202F, 0.2976F, 0.0696F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 4).addBox(-0.5F, 0.2F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0009F, 8.0009F, -0.0464F, 0.3487F, -0.0159F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 7).addBox(-0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0256F, 4.9271F, -0.1162F, 0.2167F, -0.0251F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0166F, 4.9336F, -0.2076F, 0.2564F, -0.0534F));

		return LayerDefinition.create(meshdefinition, 57, 57);
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