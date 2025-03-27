package fossils.fossils.client.blockentity.model.tiktaalik;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TiktaalikFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart cube_r1;
	private final ModelPart body2;
	private final ModelPart cube_r2;
	private final ModelPart body3;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart body4;
	private final ModelPart cube_r5;
	private final ModelPart analfin;
	private final ModelPart body5;
	private final ModelPart cube_r6;
	private final ModelPart body6;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart upperjaw;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;

	public TiktaalikFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.cube_r1 = this.body.getChild("cube_r1");
		this.body2 = this.body.getChild("body2");
		this.cube_r2 = this.body2.getChild("cube_r2");
		this.body3 = this.body2.getChild("body3");
		this.cube_r3 = this.body3.getChild("cube_r3");
		this.cube_r4 = this.body3.getChild("cube_r4");
		this.hindlegL = this.body3.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.hindlegL3 = this.body3.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.body4 = this.body3.getChild("body4");
		this.cube_r5 = this.body4.getChild("cube_r5");
		this.analfin = this.body4.getChild("analfin");
		this.body5 = this.body4.getChild("body5");
		this.cube_r6 = this.body5.getChild("cube_r6");
		this.body6 = this.body5.getChild("body6");
		this.head = this.body.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.bone2 = this.lowerjaw.getChild("bone2");
		this.bone4 = this.lowerjaw.getChild("bone4");
		this.upperjaw = this.head.getChild("upperjaw");
		this.bone = this.upperjaw.getChild("bone");
		this.bone3 = this.upperjaw.getChild("bone3");
		this.forelegL = this.body.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.forelegL3 = this.body.getChild("forelegL3");
		this.forelegL4 = this.forelegL3.getChild("forelegL4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -3.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -5.4F, 1.8F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(11, 25).addBox(-5.0F, 3.7F, 2.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(11, 25).addBox(-1.0F, 2.7F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(38, 51).addBox(-1.0F, 2.0F, -1.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -1.6F, -13.3F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -2.3F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r2 = body2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 27).addBox(-0.5F, -0.3953F, -11.4991F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.9823F, 10.954F, -0.0131F, 0.0044F, -0.0001F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 9.6F, 0.0443F, -0.1743F, -0.0096F));

		PartDefinition cube_r3 = body3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 8).addBox(-1.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.1597F, 5.2686F, 0.0F, -0.0349F, -1.5708F));

		PartDefinition cube_r4 = body3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 8).addBox(-0.5F, 2.17F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(30, 0).addBox(-0.5F, 2.07F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.7F, -0.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition hindlegL = body3.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9F, 3.85F, 5.75F, 0.2941F, -0.2982F, -0.978F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3F, 0.0F, 0.6981F, 0.0F, -0.1745F));

		PartDefinition hindlegL3 = body3.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9F, 3.85F, 5.75F, 0.7304F, 0.2982F, 0.978F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3F, 0.0F, 0.48F, 0.0F, 0.1745F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 8.1F, -0.043F, -0.0434F, 0.0095F));

		PartDefinition cube_r5 = body4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.6F, -0.2F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition analfin = body4.addOrReplaceChild("analfin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3F, 10.05F, 0.8727F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, 10.9F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r6 = body5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 3).addBox(-0.5F, 0.6F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(30, 16).addBox(-0.5F, 0.3F, -0.7F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.5F, 10.6F, 0.0F, 0.1745F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.15F, -13.45F, 0.0F, -0.1745F, 0.0F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -0.1F, 0.1838F, 0.0063F, -0.0024F));

		PartDefinition bone2 = lowerjaw.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-0.0055F, -0.7306F, -12.9706F));

		PartDefinition bone4 = lowerjaw.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0055F, -0.7306F, -12.9706F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.05F, -0.15F, 0.1134F, 0.0F, 0.0F));

		PartDefinition bone = upperjaw.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.663F, -13.5289F, -0.1134F, 0.0F, 0.0F));

		PartDefinition bone3 = upperjaw.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.663F, -13.5289F, -0.1134F, 0.0F, 0.0F));

		PartDefinition forelegL = body.addOrReplaceChild("forelegL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.25F, 2.3F, -9.8F, 1.0897F, -0.2141F, -1.2045F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0312F, 3.3369F, 0.2771F, -0.4893F, 0.0464F, -0.0763F));

		PartDefinition forelegL3 = body.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.25F, 2.3F, -9.8F, 0.5661F, 0.2141F, 1.2045F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0312F, 3.3369F, 0.2771F, -0.4805F, -0.4263F, 0.1225F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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