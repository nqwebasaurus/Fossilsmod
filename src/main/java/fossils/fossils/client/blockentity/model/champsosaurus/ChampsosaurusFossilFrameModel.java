package fossils.fossils.client.blockentity.model.champsosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ChampsosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL7;
	private final ModelPart hindlegL4;
	private final ModelPart hindlegL5;
	private final ModelPart hindlegL6;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart forelegL5;
	private final ModelPart forelegL6;
	private final ModelPart body4;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public ChampsosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.hindlegL2 = this.bone.getChild("hindlegL2");
		this.hindlegL3 = this.hindlegL2.getChild("hindlegL3");
		this.hindlegL7 = this.hindlegL3.getChild("hindlegL7");
		this.hindlegL4 = this.bone.getChild("hindlegL4");
		this.hindlegL5 = this.hindlegL4.getChild("hindlegL5");
		this.hindlegL6 = this.hindlegL5.getChild("hindlegL6");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.forelegL = this.body3.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.forelegL3 = this.forelegL2.getChild("forelegL3");
		this.forelegL4 = this.body3.getChild("forelegL4");
		this.forelegL5 = this.forelegL4.getChild("forelegL5");
		this.forelegL6 = this.forelegL5.getChild("forelegL6");
		this.body4 = this.body3.getChild("body4");
		this.neck = this.body4.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 25.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.5F, 1.3F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -11.4483F, -0.0261F, 0.4651F, 0.6771F, 0.1259F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 37).addBox(-0.5F, -0.3F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.1216F, 2.7367F, 0.8556F, 2.2814F, -1.3422F, 2.4439F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 35).addBox(0.2F, 0.8F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.3491F, 0.3659F, -2.4309F, -1.3422F, 2.4439F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, 0.8824F, 4.6432F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.0F, -6.0F, -0.1484F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.3F, 0.9978F, 0.417F));

		PartDefinition hindlegL2 = bone.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0685F, 1.3667F, 0.6606F, 0.2743F, -1.1105F, 0.6657F));

		PartDefinition hindlegL3 = hindlegL2.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3304F, 0.1662F, -0.1163F, 1.1982F, -0.7248F, 0.1211F));

		PartDefinition hindlegL7 = hindlegL3.addOrReplaceChild("hindlegL7", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9839F, -0.1812F, 0.0477F, -0.0732F, -0.0581F, -0.5061F));

		PartDefinition hindlegL4 = bone.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5315F, 1.3667F, 0.6606F, -0.5284F, 0.2942F, -0.8759F));

		PartDefinition hindlegL5 = hindlegL4.addOrReplaceChild("hindlegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3304F, 0.1662F, -0.1163F, 1.0413F, 1.0009F, -0.3254F));

		PartDefinition hindlegL6 = hindlegL5.addOrReplaceChild("hindlegL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9839F, -0.1812F, 0.0477F, -0.084F, 0.0409F, 0.2883F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.85F, -1.4F, -0.1063F, -0.1736F, 0.0184F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 38).addBox(-2.0F, 0.4F, 9.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(11, 35).addBox(-2.0F, 0.4F, 5.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, -1.1F, -9.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(34, 10).addBox(-0.5F, 0.0F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4599F, -3.9985F, 0.0266F, -0.1745F, -0.0046F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2123F, -3.9986F, -0.0983F, -0.2171F, 0.0212F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(21, 39).addBox(-1.2F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.3931F, -1.085F, -1.5461F, 0.068F, -1.4854F));

		PartDefinition cube_r6 = body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 42).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.3746F, -0.8555F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 40).addBox(-1.5F, 0.4F, 5.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition forelegL = body3.addOrReplaceChild("forelegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3379F, 1.8725F, -1.5966F, -0.8452F, 0.3584F, 0.9432F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7486F, 0.0861F, 0.4872F, 2.0225F, 0.9938F, 0.4741F));

		PartDefinition forelegL3 = forelegL2.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5959F, 0.1274F, -0.2775F, 0.0894F, -0.0143F, 0.4774F));

		PartDefinition forelegL4 = body3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3379F, 1.8725F, -1.5966F, -0.6434F, 0.9152F, -1.081F));

		PartDefinition forelegL5 = forelegL4.addOrReplaceChild("forelegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7486F, 0.0861F, 0.4872F, 1.9328F, -0.8333F, -0.3611F));

		PartDefinition forelegL6 = forelegL5.addOrReplaceChild("forelegL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5959F, 0.1274F, -0.2775F, 0.0894F, 0.0143F, -0.4774F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(44, 42).addBox(-0.5F, -0.2F, -3.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(46, 44).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1715F, -2.8889F, 0.1108F, -0.2545F, -0.1133F));

		PartDefinition neck = body4.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3913F, -3.0F, -0.2358F, -0.3456F, 0.0332F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(33, 40).addBox(-1.0F, -0.45F, 5.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.6F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1307F, -0.9846F, -3.4235F, -0.5782F, -0.1836F, 0.1186F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.1307F, 2.4936F, -9.5689F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.1307F, 2.4936F, -9.5689F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1307F, 1.3317F, -0.5129F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, 0.2448F, -0.385F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F))
				.texOffs(24, 5).addBox(-0.5F, 0.2448F, 5.215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.8338F, 2.0015F, 0.1072F, 0.217F, 0.0232F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 19).addBox(-0.5F, 0.2406F, 0.1708F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0113F, 5.4F, 0.263F, -0.4784F, -0.0408F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(30, 33).addBox(-0.5F, -0.0381F, -0.2468F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2845F, 6.0979F, -0.1126F, -0.3054F, -0.0055F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(32, 19).addBox(-0.5F, -0.013F, -0.1774F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0103F, 4.6502F, -0.083F, -0.4796F, 0.0182F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2678F, -0.0375F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2811F, 4.5269F, -0.2826F, -0.4281F, 0.0715F));

		return LayerDefinition.create(meshdefinition, 75, 75);
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