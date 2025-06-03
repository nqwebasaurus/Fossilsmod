package fossils.fossils.client.blockentity.model.basilosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BasilosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart body;
	private final ModelPart body5;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart body7;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail3;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;

	public BasilosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.body = this.body6.getChild("body");
		this.body5 = this.body.getChild("body5");
		this.body4 = this.body5.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.body7 = this.body2.getChild("body7");
		this.hips = this.body7.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail4 = this.tail2.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail3 = this.tail6.getChild("tail3");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.bone = this.chest.getChild("bone");
		this.bone2 = this.chest.getChild("bone2");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.4183F, -111.2768F, 0.0266F, 0.1745F, 0.0046F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(84, 96).addBox(-3.9F, -0.5F, -6.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 7.9664F, -1.7513F, -1.5708F, -0.3403F, 1.5708F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(86, 98).addBox(-0.5F, 2.0F, 0.7F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.2875F, -1.4643F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(85, 97).addBox(-0.5F, -0.908F, 3.84F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4854F, -9.7706F, 0.3403F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(99, 26).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6619F, 4.7281F, 0.2096F, 0.0427F, 0.0091F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3905F, 5.8543F, -0.2452F, -0.0847F, 0.0212F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(95, 50).addBox(-0.5F, 0.0F, -8.0F, 1.0F, 2.0F, 18.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 8.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(47, 74).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5867F, 17.8378F, -0.061F, -0.087F, 0.0129F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0463F, 19.7928F, -0.1394F, -0.0425F, 0.0117F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(50, 25).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1202F, 21.0834F, -0.0606F, -0.0869F, 0.0167F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2783F, 22.0169F, 0.0741F, -0.0032F, 0.0435F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(1, 0).addBox(-0.5F, 0.8488F, 8.7474F, 1.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5656F, -8.4997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body7 = body2.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(48, 50).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6344F, 21.3003F, -0.436F, 0.0184F, 0.0395F));

		PartDefinition hips = body7.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3079F, 20.9047F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(18, 42).addBox(-2.1F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 9.8331F, 13.0012F, -1.5708F, -0.4451F, -1.5708F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(19, 43).addBox(-0.5F, -5.0F, 0.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 5.3685F, 10.145F, -2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(1, 25).addBox(-0.5F, 0.9014F, 0.0389F, 1.0F, 2.0F, 22.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.4F, -0.4451F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5F, 0.8F, -0.4F, 1.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3762F, 19.5943F, -0.0785F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(1, 50).addBox(-0.5F, 0.8F, -0.5F, 1.0F, 2.0F, 21.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0439F, 21.584F, 0.1658F, 0.0F, 0.0F));

		PartDefinition tail4 = tail2.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(92, 74).addBox(-0.5F, 0.8F, -0.6F, 1.0F, 2.0F, 20.0F, new CubeDeformation(-0.15F))
				.texOffs(111, 93).addBox(-0.5F, 0.8F, 19.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0914F, 20.4248F, 0.2094F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(47, 97).addBox(-0.5F, 0.6F, -0.4F, 1.0F, 2.0F, 17.0F, new CubeDeformation(-0.15F))
				.texOffs(63, 113).addBox(-0.5F, 0.6F, 16.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2599F, 19.4295F, 0.3142F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 98).addBox(-0.5F, 0.6F, -0.2F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0813F, 16.7059F, 0.1833F, 0.0F, 0.0F));

		PartDefinition tail3 = tail6.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(98, 11).addBox(-0.5F, 0.6F, -0.7F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0837F, 12.2275F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9707F, 11.3428F, 12.0946F, 0.5205F, -0.2186F, -0.3126F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7879F, -0.2757F, 0.6109F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2527F, 2.2178F, -0.5534F, 1.8691F, 0.6581F, -1.4535F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9707F, 11.3428F, 12.0946F, 0.5205F, 0.2186F, 0.3126F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7879F, -0.2757F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2527F, 2.2178F, -0.5534F, 1.8691F, -0.6581F, 1.4535F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.2641F, 4.3025F, -2.1153F, 0.5264F, 0.5313F, -0.78F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2846F, 7.3194F, 3.4896F, -0.3488F, 0.0149F, 0.041F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 4.6294F, 1.1607F, 0.384F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.2641F, 4.3025F, -2.1153F, 0.1931F, -0.4164F, 0.4614F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2846F, 7.3194F, 3.4896F, -0.7268F, 0.103F, 0.288F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 4.6294F, 1.1607F, 0.384F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4848F, 1.3397F, -3.1969F, 0.6108F, -0.0858F, 0.0465F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4848F, 1.3397F, -3.1969F, 0.6108F, 0.0858F, -0.0465F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0884F, -5.8334F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(89, 132).addBox(-0.5F, 0.8F, 3.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2919F, -2.6204F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(69, 132).addBox(-0.5F, -0.1F, 2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5695F, -4.6993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(133, 122).addBox(-0.5F, 0.1F, -2.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3695F, -2.7993F, 0.0065F, -0.1718F, -0.0377F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0049F, -3.8256F, -0.4359F, -0.0266F, -0.0346F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(2.2F, 0.4933F, -1.5002F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-2.2F, 0.4933F, -1.5002F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 0.9809F, 1.4481F, 1.4573F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 165, 165);
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