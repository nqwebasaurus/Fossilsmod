package fossils.fossils.client.blockentity.model.limnoscelis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LimnoscelisFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart leftArm7;
	private final ModelPart leftArm8;
	private final ModelPart leftArm9;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart rightArm7;
	private final ModelPart rightArm8;
	private final ModelPart rightArm9;
	private final ModelPart Belly;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart leftArm2;
	private final ModelPart leftArm;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightArm2;
	private final ModelPart rightArm;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart Neck;
	private final ModelPart neck2;
	private final ModelPart Head;
	private final ModelPart Upperjaw1;
	private final ModelPart Upperjaw2;
	private final ModelPart Upperteeth2;
	private final ModelPart Upperteeth1;
	private final ModelPart Lowerjaw1;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart bone2;
	private final ModelPart bone4;

	public LimnoscelisFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.leftArm5 = this.Hips.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.leftArm7 = this.leftArm6.getChild("leftArm7");
		this.leftArm8 = this.leftArm7.getChild("leftArm8");
		this.leftArm9 = this.leftArm8.getChild("leftArm9");
		this.rightArm5 = this.Hips.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.rightArm7 = this.rightArm6.getChild("rightArm7");
		this.rightArm8 = this.rightArm7.getChild("rightArm8");
		this.rightArm9 = this.rightArm8.getChild("rightArm9");
		this.Belly = this.Hips.getChild("Belly");
		this.body = this.Belly.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone3 = this.bone.getChild("bone3");
		this.leftArm2 = this.bone3.getChild("leftArm2");
		this.leftArm = this.leftArm2.getChild("leftArm");
		this.leftArm3 = this.leftArm.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightArm2 = this.bone3.getChild("rightArm2");
		this.rightArm = this.rightArm2.getChild("rightArm");
		this.rightArm3 = this.rightArm.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.Neck = this.bone.getChild("Neck");
		this.neck2 = this.Neck.getChild("neck2");
		this.Head = this.neck2.getChild("Head");
		this.Upperjaw1 = this.Head.getChild("Upperjaw1");
		this.Upperjaw2 = this.Upperjaw1.getChild("Upperjaw2");
		this.Upperteeth2 = this.Upperjaw2.getChild("Upperteeth2");
		this.Upperteeth1 = this.Upperjaw1.getChild("Upperteeth1");
		this.Lowerjaw1 = this.Head.getChild("Lowerjaw1");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone4 = this.Hips.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.4F, -1.75F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(9.0F, -7.95F, -15.8F, 0.0F, -0.829F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-2.55F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(9.0F, -7.95F, -15.8F, 0.829F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-2.0F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -8.5F, 5.1F, 0.1309F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -8.5F, 5.1F, 0.0F, -0.1309F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.2F, 2.6F, -0.0861F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(25, 28).addBox(0.8842F, -0.3F, 9.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 22).addBox(0.8842F, -0.3F, 2.7F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3842F, 0.4091F, -2.9063F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftArm5 = Hips.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0119F, 2.677F, 3.1214F, 0.1211F, -0.6536F, 0.1766F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3982F, 0.0349F, -0.3703F, 0.8433F, -1.2369F, 0.4039F));

		PartDefinition leftArm7 = leftArm6.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(3.765F, 0.7374F, -2.6238F, -0.0019F, -0.2618F, 0.0008F));

		PartDefinition leftArm8 = leftArm7.addOrReplaceChild("leftArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.289F, 0.0F, -0.9165F, 0.0F, 1.0472F, 0.0F));

		PartDefinition leftArm9 = leftArm8.addOrReplaceChild("leftArm9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3471F, 0.0F, -1.5726F, 0.0F, -0.0436F, 0.0F));

		PartDefinition rightArm5 = Hips.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0119F, 2.677F, 3.1214F, 0.1207F, -0.6483F, -0.3236F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3982F, 0.0349F, -0.3703F, -0.1931F, 0.3372F, -1.3618F));

		PartDefinition rightArm7 = rightArm6.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.765F, 0.7374F, -2.6238F, -1.5813F, 1.569F, -1.5816F));

		PartDefinition rightArm8 = rightArm7.addOrReplaceChild("rightArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.289F, 0.0F, -0.9165F, 0.0F, -1.0472F, 0.0F));

		PartDefinition rightArm9 = rightArm8.addOrReplaceChild("rightArm9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3471F, 0.0F, -1.5726F, 0.0F, -0.7418F, 0.0F));

		PartDefinition Belly = Hips.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0158F, 0.1091F, -0.0063F, 0.038F, -0.2616F, -0.0098F));

		PartDefinition Belly_r1 = Belly.addOrReplaceChild("Belly_r1", CubeListBuilder.create().texOffs(15, 31).addBox(0.8842F, -0.3F, 3.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4F, 0.2638F, -9.7034F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body = Belly.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.15F, -0.2362F, -5.9034F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition Belly_r2 = body.addOrReplaceChild("Belly_r2", CubeListBuilder.create().texOffs(36, 22).addBox(0.8842F, -0.3F, -0.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.25F, 0.5F, -3.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2262F, -4.9035F, -0.0414F, -0.0872F, 0.0036F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(40, 19).addBox(0.8842F, -0.2237F, 9.5609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 15).addBox(0.8842F, -0.2237F, 4.8609F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.25F, 1.1669F, -9.8572F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.1669F, -4.9572F, 0.0723F, -0.2611F, -0.0187F));

		PartDefinition Bodyfront_r2 = bone.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(30, 38).addBox(0.8842F, -0.642F, -4.6209F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.35F, 1.0F, -0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(3.4342F, 4.1381F, -5.9865F));

		PartDefinition leftArm2 = bone3.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3881F, 0.028F, 1.0564F, 0.3004F, -1.0003F, 0.1104F));

		PartDefinition leftArm = leftArm2.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7561F, 0.1655F, -0.6232F, 0.72F, -0.1721F, 1.0432F));

		PartDefinition leftArm3 = leftArm.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.683F, 1.0176F, -1.9603F, 0.0F, -0.3054F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5346F, 0.0F, -1.8871F, 0.0F, 0.9163F, 0.0F));

		PartDefinition rightArm2 = bone3.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4119F, 0.028F, 1.0564F, 0.1637F, -0.1982F, -0.3979F));

		PartDefinition rightArm = rightArm2.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7561F, 0.1655F, -0.6232F, -0.2814F, -0.1215F, -0.9583F));

		PartDefinition rightArm3 = rightArm.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.683F, 1.0176F, -1.9603F, -0.0681F, 0.298F, -0.2284F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offset(-0.5346F, 0.0F, -1.8871F));

		PartDefinition Neck = bone.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.05F, 0.6235F, -4.7722F, -0.3009F, 0.0F, 0.0F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(36, 64).addBox(0.8842F, -0.3375F, 2.6526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 63).addBox(0.8842F, -0.3375F, 0.9526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4F, 0.7906F, -3.0119F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = Neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0907F, -2.0119F, 0.2564F, -0.2378F, -0.0276F));

		PartDefinition Neck_r2 = neck2.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(43, 29).addBox(0.8842F, -0.3572F, -0.4488F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4F, 0.7F, -3.3F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head = neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.05F, -0.5699F, -3.3965F, 0.1228F, -0.273F, -0.1313F));

		PartDefinition Upperjaw1 = Head.addOrReplaceChild("Upperjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.35F, -1.4315F, -3.8121F, 0.0848F, 0.0F, 0.0F));

		PartDefinition Upperjaw2 = Upperjaw1.addOrReplaceChild("Upperjaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.9F, -3.3F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Upperteeth2 = Upperjaw2.addOrReplaceChild("Upperteeth2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0F));

		PartDefinition Upperteeth1 = Upperjaw1.addOrReplaceChild("Upperteeth1", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, -3.0F));

		PartDefinition Lowerjaw1 = Head.addOrReplaceChild("Lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.025F, 1.8009F, -0.3826F, 0.6109F, 0.0F, 0.0F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5158F, 0.0024F, 0.0844F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0158F, 0.6091F, 7.0187F, -0.1002F, 0.2262F, 0.0631F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(19, 13).addBox(-0.5158F, 0.3289F, -0.2246F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 19).addBox(-0.5158F, 0.3289F, 6.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2976F, 7.7844F, 0.0439F, 0.2691F, -0.1149F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5158F, 0.2547F, 0.043F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0289F, 6.9754F, 0.0817F, 0.261F, 0.0211F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5158F, 0.1787F, -0.2258F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0547F, 10.943F, -0.0404F, -0.218F, 0.0087F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(30, 31).addBox(-0.4908F, 0.1787F, -0.3258F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.025F, 0.025F, 5.9F, -0.1328F, -0.3029F, 0.0398F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(36, 8).addBox(-0.4908F, 0.1787F, -0.3258F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.05F, 4.825F, -0.1762F, -0.2579F, 0.0454F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5F, 5.1529F, 3.1181F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.5F, 5.1529F, 3.1181F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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