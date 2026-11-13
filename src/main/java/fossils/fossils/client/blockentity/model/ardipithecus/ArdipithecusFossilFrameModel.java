package fossils.fossils.client.blockentity.model.ardipithecus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArdipithecusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart opposableToe;
	private final ModelPart opposableToe2;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart opposableToe3;
	private final ModelPart opposableToe4;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart bone4;
	private final ModelPart bone6;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart thumb;
	private final ModelPart thumb2;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart thumb3;
	private final ModelPart thumb4;
	private final ModelPart rightArm4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart bone5;
	private final ModelPart rightFace;
	private final ModelPart bone7;
	private final ModelPart jaw;
	private final ModelPart bone3;
	private final ModelPart tail;

	public ArdipithecusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.opposableToe = this.leftLeg3.getChild("opposableToe");
		this.opposableToe2 = this.opposableToe.getChild("opposableToe2");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.opposableToe3 = this.rightLeg3.getChild("opposableToe3");
		this.opposableToe4 = this.opposableToe3.getChild("opposableToe4");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.bone = this.hips.getChild("bone");
		this.bone2 = this.hips.getChild("bone2");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body4 = this.body.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.bone4 = this.chest.getChild("bone4");
		this.bone6 = this.chest.getChild("bone6");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.thumb = this.leftArm3.getChild("thumb");
		this.thumb2 = this.thumb.getChild("thumb2");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.thumb3 = this.rightArm3.getChild("thumb3");
		this.thumb4 = this.thumb3.getChild("thumb4");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.bone5 = this.leftFace.getChild("bone5");
		this.rightFace = this.head.getChild("rightFace");
		this.bone7 = this.rightFace.getChild("bone7");
		this.jaw = this.head.getChild("jaw");
		this.bone3 = this.jaw.getChild("bone3");
		this.tail = this.hips.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.475F, -35.0F, 4.0F, 1.0F, 35.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -8.2F, 1.3F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(1.525F, -52.5F, 0.5F, -0.3491F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-10.5F, -5.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.025F, -21.5F, 4.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -31.668F, 7.0317F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(53, 51).addBox(-0.425F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2371F, -3.2408F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6082F, 2.5596F, -1.3391F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 15.0432F, 0.501F, 1.8151F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1982F, 13.3323F, -6.7907F, -1.4148F, -0.1603F, 0.0616F));

		PartDefinition opposableToe = leftLeg3.addOrReplaceChild("opposableToe", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3405F, 0.0386F, 0.0965F, 0.0F, 0.0F, 0.4363F));

		PartDefinition opposableToe2 = opposableToe.addOrReplaceChild("opposableToe2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4839F, 4.7462F, -0.3405F, 1.309F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 4.2749F, 0.0205F, 1.1345F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, -0.2629F, -3.6144F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6082F, 2.5596F, -1.3391F, 1.0821F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3F, 15.0432F, 0.501F, 1.0297F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1982F, 13.3323F, -6.7907F, -1.6929F, 0.0639F, -0.1388F));

		PartDefinition opposableToe3 = rightLeg3.addOrReplaceChild("opposableToe3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3405F, 0.0386F, 0.0965F, 0.0F, 0.0F, -0.4363F));

		PartDefinition opposableToe4 = opposableToe3.addOrReplaceChild("opposableToe4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4839F, 4.7462F, -0.3405F, 0.7854F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 4.2749F, 0.0205F, 0.6981F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, -0.2629F, -3.6144F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8281F, -0.7672F, -4.5566F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.8281F, -0.7672F, -4.5566F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3183F, -4.0742F, -0.4011F, -0.017F, -0.0402F));

		PartDefinition cube_r4 = body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(23, 36).addBox(-0.45F, -0.55F, 2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 36).addBox(-0.45F, -0.55F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(20, 33).addBox(-0.45F, -0.55F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0447F, -4.8274F, -0.2063F, -0.0361F, -0.1708F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(73, 60).addBox(-0.45F, 0.775F, 4.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8732F, -5.9268F, -0.5176F, -0.0059F, -0.0972F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(54, 5).addBox(-0.475F, -0.475F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.96F, -1.6285F, 0.1776F, -0.0114F, -0.135F));

		PartDefinition body4 = body.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4857F, -2.7264F, 0.1891F, 0.0331F, -0.1714F));

		PartDefinition cube_r7 = body4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(75, 20).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0156F, -1.9799F, 0.1746F, -0.0344F, -0.0061F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -2.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 14).addBox(-0.5F, 0.6022F, -4.0739F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6199F, -3.6946F, 0.4272F, 0.0181F, -0.0397F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(34, 6).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.3412F, -1.5704F, 0.3041F, 0.0541F, -0.3037F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.4254F, 3.4368F, -3.9385F));

		PartDefinition bone6 = chest.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-0.4254F, 3.4368F, -3.9385F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.7889F, 2.1196F, -3.4533F, 1.5366F, 0.4822F, -0.0104F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2966F, 12.8226F, 6.1559F, -0.5908F, -0.7092F, 0.3967F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2284F, 13.7797F, -1.4263F, -0.1529F, -1.2569F, 0.0228F));

		PartDefinition thumb = leftArm3.addOrReplaceChild("thumb", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1142F, 0.1133F, 0.3107F, 0.9484F, -0.6333F, -0.2064F));

		PartDefinition thumb2 = thumb.addOrReplaceChild("thumb2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.075F, 1.7008F, -0.5174F, 0.0832F, 0.0262F, -0.3043F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8309F, 4.2838F, 0.3601F, 0.7004F, 0.0263F, -0.1009F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.7889F, 2.1196F, -3.4533F, 0.8149F, -0.5778F, 0.0897F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2966F, 12.8226F, 6.1559F, -0.4412F, 0.6761F, -0.3633F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2284F, 13.7797F, -1.4263F, -0.1529F, 1.2569F, -0.0228F));

		PartDefinition thumb3 = rightArm3.addOrReplaceChild("thumb3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1142F, 0.1133F, 0.3107F, 0.9484F, 0.6333F, 0.2064F));

		PartDefinition thumb4 = thumb3.addOrReplaceChild("thumb4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.075F, 1.7008F, -0.5174F, 0.047F, -0.0736F, 1.0018F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8526F, 4.5049F, 0.3351F, 1.0059F, -0.0263F, 0.1009F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2593F, -3.5968F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(95, 38).addBox(-0.175F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1931F, 0.486F, -0.7708F, -0.4323F, -0.2409F, -0.3674F));

		PartDefinition cube_r11 = neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(95, 38).addBox(-0.325F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2647F, -1.0132F, -0.4496F, -0.3593F, -0.3089F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6129F, -0.838F, 0.143F, -0.4109F, -0.1743F));

		PartDefinition cube_r12 = neck2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(83, 4).addBox(-0.425F, -0.525F, 1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(82, 4).addBox(-0.425F, -0.525F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2739F, -1.8283F, -0.9664F, -0.2021F, -0.0761F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1225F, -1.4348F, -0.1454F, -0.2514F, -0.1787F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(44, 51).addBox(-0.5F, 0.5319F, -3.0721F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.7F, -0.9687F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7858F, -1.2037F, 0.2959F, -0.1627F, -0.197F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.8359F, 2.3818F, -9.1283F));

		PartDefinition bone5 = leftFace.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(1.6032F, -3.3121F, 4.3416F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.8359F, 2.3818F, -9.1283F));

		PartDefinition bone7 = rightFace.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-1.6032F, -3.3121F, 4.3416F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.6151F, -1.0267F, 0.8378F, 0.0F, 0.0F));

		PartDefinition bone3 = jaw.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.5129F, 1.8093F, -8.2194F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(32, 57).addBox(-0.421F, -0.3088F, 0.0251F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 57).addBox(-0.421F, -0.3088F, -0.8499F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.0782F, -1.2715F, 0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 108, 108);
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