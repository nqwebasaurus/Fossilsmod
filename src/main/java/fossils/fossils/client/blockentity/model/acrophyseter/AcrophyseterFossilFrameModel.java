package fossils.fossils.client.blockentity.model.acrophyseter;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AcrophyseterFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart body;
	private final ModelPart body5;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;

	public AcrophyseterFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.leftarm = this.body6.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.body6.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.bone2 = this.body6.getChild("bone2");
		this.bone3 = this.body6.getChild("bone3");
		this.body = this.body6.getChild("body");
		this.body5 = this.body.getChild("body5");
		this.body4 = this.body5.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.hips = this.body2.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.neck2 = this.chest.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -20.402F, -20.9275F, -0.04F, -0.2616F, 0.0104F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 65).addBox(-0.5F, 0.543F, 0.068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7854F, -2.5206F, 0.2531F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0624F, 0.4829F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body6.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 4).addBox(-0.5F, 0.625F, 5.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(36, 0).addBox(-0.5F, 0.6F, -0.425F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.104F, 0.0109F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body6.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, -8).addBox(2.5F, -0.5F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 5.8784F, 1.65F, -1.5708F, 0.0436F, 1.5708F));

		PartDefinition cube_r4 = body6.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, -2).addBox(-0.5F, -0.8F, -0.125F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.2947F, 1.5499F, -1.6144F, 0.0F, 0.0F));

		PartDefinition leftarm = body6.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.2135F, 9.0289F, 0.9355F, 0.8061F, -0.0218F, -1.3537F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1618F, 3.9904F, 0.1568F, -0.0573F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 3.1637F, 0.7842F, 0.384F, 0.0F, 0.0F));

		PartDefinition rightarm = body6.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.2135F, 9.0289F, 0.9355F, 0.8985F, -0.0949F, 0.8918F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1618F, 3.9904F, 0.1568F, -0.0573F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 3.1637F, 0.7842F, 0.384F, 0.0F, 0.0F));

		PartDefinition bone2 = body6.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5765F, 6.3662F, 1.2764F, -0.3743F, -0.0148F, -0.1301F));

		PartDefinition bone3 = body6.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5765F, 6.3662F, 1.2764F, -0.3743F, 0.0148F, 0.1301F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5957F, 5.8766F, -0.4459F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(21, 9).addBox(-0.5F, 0.6575F, -0.0704F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3034F, 5.9565F, -0.1046F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.75F, -0.15F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9F, -0.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7134F, 8.0024F, -0.2529F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(25, 5).addBox(-0.5F, -0.825F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 0).addBox(-0.5F, -0.825F, -6.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.1182F, 6.4726F, 0.0742F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, 0.6063F, 0.1498F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3504F, 6.8384F, 0.0627F, 0.0F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2669F, 6.032F, 0.1056F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(24, 41).addBox(0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.9702F, 2.8803F, -1.5708F, -0.1833F, 1.5708F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 42).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.3154F, 2.3883F, -1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(24, 41).addBox(-0.5F, 1.4738F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.9537F, -8.4029F, -0.2094F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9579F, 4.9196F, 0.1608F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(24, 30).addBox(-0.5F, 0.5835F, 5.4743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 25).addBox(-0.5F, 0.5835F, -0.2257F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.175F, -0.025F, -0.4843F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9536F, 5.1845F, -0.4301F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.25F, 0.025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5128F, -0.026F, 0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2646F, 4.8704F, 0.0968F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(5, 32).addBox(-0.5F, -0.3F, 5.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 27).addBox(-0.5F, -0.3F, -0.275F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4973F, -0.0046F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2304F, 5.8944F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(20, 38).addBox(-0.5F, -0.825F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.7167F, 5.938F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(15, 33).addBox(-0.5F, 0.175F, 0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.025F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, 5.95F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(30, 33).addBox(-0.5F, 0.15F, 0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.025F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4805F, -2.1145F, 0.2863F, 0.0F, 0.0F));

		PartDefinition cube_r17 = neck2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(99, 87).addBox(-0.5F, 1.15F, 4.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0677F, -0.3018F, -0.1549F, -0.0135F, -0.0862F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(3.8F, -1.1067F, -8.1002F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-3.8F, -1.1067F, -8.1002F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.9933F, -1.1665F, 1.1956F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 115, 115);
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