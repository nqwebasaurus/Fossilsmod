package fossils.fossils.client.blockentity.model.livyatan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LivyatanFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
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
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;

	public LivyatanFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
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
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.4609F, -55.701F, 0.0232F, -0.0121F, 0.4798F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(41, 87).addBox(9.0F, -1.0F, -18.5F, 2.0F, 2.0F, 37.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 10.0543F, 2.555F, -1.5708F, -0.3054F, 1.5708F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 97).addBox(-1.0F, 0.0F, 1.5F, 2.0F, 2.0F, 27.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.1239F, 1.1031F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(65, 111).addBox(-1.0F, 0.8065F, -0.3873F, 2.0F, 4.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.2854F, -5.5706F, 0.3054F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(28, 111).addBox(-1.0F, -0.4F, -0.3F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.393F, 6.83F, 0.2137F, -0.0762F, -0.061F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7413F, 13.7215F, -0.1402F, -0.0864F, 0.0122F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(56, 88).addBox(-1.0F, -2.9154F, 0.0794F, 2.0F, 4.0F, 18.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.8F, -0.4F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(50, 21).addBox(-1.0F, -1.4F, 0.0F, 2.0F, 4.0F, 19.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1509F, 16.9254F, -0.131F, -0.0435F, 0.0038F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(1, 46).addBox(-1.0F, 0.0F, 0.1F, 2.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2953F, 18.7348F, -0.2999F, -0.115F, 0.1073F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(1, 21).addBox(-1.0F, -0.85F, 0.0F, 2.0F, 4.0F, 20.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.9902F, 18.8764F, -0.2453F, -0.1696F, 0.0706F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.493F, 20.1306F, -0.01F, -0.1807F, 0.0394F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(93, 64).addBox(-0.5F, 0.8487F, 8.7474F, 1.0F, 4.0F, 18.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -3.0656F, -8.4997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5025F, 17.4822F, 0.1061F, -0.2276F, 0.0014F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 64).addBox(-0.5F, 0.9014F, 0.0389F, 1.0F, 4.0F, 19.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.4F, -0.4451F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(101, 34).addBox(-0.5F, -0.8F, 0.0F, 1.0F, 4.0F, 16.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 8.6562F, 16.6935F, -0.3584F, -0.2316F, 0.0042F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(65, 129).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0898F, 15.9733F, 0.0089F, -0.1745F, -0.0015F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(68, 146).addBox(-0.5F, -0.3F, -0.4F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2449F, 11.7572F, 0.248F, -0.1693F, -0.0426F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(136, 64).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1F, 9.0F, 0.2443F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(19.3771F, 18.9206F, 5.6884F, 0.5895F, 0.1069F, -1.0829F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 8.1511F, 0.1813F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 6.4838F, 1.9099F, 0.384F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-19.3771F, 18.9206F, 5.6884F, 0.3529F, -0.1337F, 0.9011F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 8.1511F, 0.1813F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 6.4838F, 1.9099F, 0.384F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6838F, -5.0159F, 0.288F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0744F, -0.277F, -0.043F, -0.0076F, -0.1744F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(41, 171).addBox(-1.5F, -2.7679F, -0.0951F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.062F, -3.6409F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(1, 171).addBox(-1.5F, -1.0F, -1.1F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.438F, -5.5409F, -0.3229F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6832F, -8.526F, -1.0384F, 0.4668F, -0.1748F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(3.2F, 11.6405F, -7.4633F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-3.2F, 11.6405F, -7.4633F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 4.4061F, 5.2837F, 1.2566F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 224, 224);
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