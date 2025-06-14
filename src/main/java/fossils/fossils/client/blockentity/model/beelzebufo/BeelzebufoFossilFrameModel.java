package fossils.fossils.client.blockentity.model.beelzebufo;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BeelzebufoFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart froge;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart wholehead;
	private final ModelPart headbase;
	private final ModelPart headdonotmove;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public BeelzebufoFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.froge = this.fossil.getChild("froge");
		this.hips = this.froge.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.leftArm1 = this.neck.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.neck.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.bone2 = this.neck.getChild("bone2");
		this.bone3 = this.neck.getChild("bone3");
		this.wholehead = this.neck.getChild("wholehead");
		this.headbase = this.wholehead.getChild("headbase");
		this.headdonotmove = this.headbase.getChild("headdonotmove");
		this.leftFace = this.headdonotmove.getChild("leftFace");
		this.rightFace = this.headdonotmove.getChild("rightFace");
		this.jaw = this.wholehead.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -18.0F, 8.2F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(-0.5F, -26.0F, -12.0F, 1.0F, 26.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(4.0F, -7.5F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 1).addBox(0.3F, -3.0F, 19.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -15.5F, -11.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition froge = fossil.addOrReplaceChild("froge", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.5F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition hips = froge.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.3495F, 0.523F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, 0.55F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.653F, 4.816F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 39).addBox(-0.5F, 0.575F, 0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2582F, -0.1003F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(64, 17).addBox(-1.0F, -0.4F, 2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(62, 15).addBox(-1.0F, -0.4F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.5834F, -3.1485F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 6.3794F, 10.9424F, 0.0159F, -0.3487F, -0.0464F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 6.3794F, 10.9424F, 0.0159F, 0.3487F, 0.0464F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 4.3928F, 8.7364F, 0.8365F, 0.1348F, -1.2348F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.3858F, 0.8286F, 0.4715F, -0.1057F, 0.339F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.3946F, 0.278F, -0.5063F, -0.5623F, 0.4369F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.166F, 8.071F, -0.4382F, 1.1979F, 0.0199F, -0.0586F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, -2.5F, -0.2096F, -0.0098F, 0.0784F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 4.3928F, 8.7364F, 0.8365F, -0.1348F, 1.2348F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.3858F, 0.8286F, 0.4715F, 0.1057F, -0.339F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.3946F, 0.278F, -0.5063F, 0.5623F, -0.4369F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.166F, 8.071F, -0.4382F, 1.1979F, -0.0199F, 0.0586F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.5F, -0.2096F, 0.0098F, -0.0784F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1331F, -3.1537F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 61).addBox(-1.0F, 0.6044F, -3.9301F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5F, -0.5F, 2.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.8F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(77, 29).addBox(-1.0F, 0.1F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(76, 28).addBox(-1.0F, 0.1F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2445F, -1.8103F, 0.0456F, 0.0022F, 0.0127F));

		PartDefinition cube_r7 = neck3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(82, 18).addBox(-1.0F, -0.2643F, 0.1306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5F, 0.2F, -1.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3325F, -0.906F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(68, 71).addBox(-1.0F, 0.5738F, 2.0562F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.9F, -2.4F, -0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0902F, -1.4466F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(76, 58).addBox(-0.5F, 0.133F, -3.1698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(76, 58).addBox(-0.5F, 0.133F, -2.4698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(75, 57).addBox(-0.5F, 0.133F, -1.7698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8F, -1.5F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(54, 75).addBox(-0.5F, 0.5574F, 0.3335F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.3F, -1.6F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftArm1 = neck.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(6.8362F, 5.2064F, -2.6891F, 0.8892F, 0.5109F, -0.0962F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0501F, 6.8693F, 2.146F, -0.2358F, 0.0805F, 0.0764F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5187F, 5.3965F, -1.2123F, -0.1731F, 1.0385F, -0.2515F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightArm1 = neck.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.8362F, 5.2064F, -2.6891F, 0.8892F, -0.5109F, 0.0962F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0501F, 6.8693F, 2.146F, -0.2358F, -0.0805F, -0.0764F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5187F, 5.3965F, -1.2123F, -0.1731F, -1.0385F, 0.2515F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone2 = neck.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(4.567F, -0.1275F, 1.5907F));

		PartDefinition bone3 = neck.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-4.567F, -0.1275F, 1.5907F));

		PartDefinition wholehead = neck.addOrReplaceChild("wholehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1697F, -3.2884F, -0.0436F, 0.0F, 0.0F));

		PartDefinition headbase = wholehead.addOrReplaceChild("headbase", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6F, 0.0F));

		PartDefinition headdonotmove = headbase.addOrReplaceChild("headdonotmove", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -11.25F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftFace = headdonotmove.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(5.9368F, -0.975F, 0.1495F));

		PartDefinition rightFace = headdonotmove.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-5.9368F, -0.975F, 0.1495F));

		PartDefinition jaw = wholehead.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 4.8925F, 0.5641F, 0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 88, 88);
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