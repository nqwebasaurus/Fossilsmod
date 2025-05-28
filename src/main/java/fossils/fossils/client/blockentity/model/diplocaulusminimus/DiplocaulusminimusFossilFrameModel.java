package fossils.fossils.client.blockentity.model.diplocaulusminimus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DiplocaulusminimusFossilFrameModel extends SkullModelBase {
	private final ModelPart body;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart forelegL5;
	private final ModelPart forelegL6;
	private final ModelPart neck;
	private final ModelPart wholehead;
	private final ModelPart lowerhead;
	private final ModelPart jaw;
	private final ModelPart upperjaw;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart tail;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL7;
	private final ModelPart hindlegL4;
	private final ModelPart hindlegL5;
	private final ModelPart hindlegL6;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public DiplocaulusminimusFossilFrameModel(ModelPart root) {
		this.body = root.getChild("body");
		this.forelegL = this.body.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.forelegL3 = this.forelegL2.getChild("forelegL3");
		this.forelegL4 = this.body.getChild("forelegL4");
		this.forelegL5 = this.forelegL4.getChild("forelegL5");
		this.forelegL6 = this.forelegL5.getChild("forelegL6");
		this.neck = this.body.getChild("neck");
		this.wholehead = this.neck.getChild("wholehead");
		this.lowerhead = this.wholehead.getChild("lowerhead");
		this.jaw = this.lowerhead.getChild("jaw");
		this.upperjaw = this.wholehead.getChild("upperjaw");
		this.bone3 = this.upperjaw.getChild("bone3");
		this.bone4 = this.upperjaw.getChild("bone4");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.tail = this.body4.getChild("tail");
		this.hindlegL2 = this.tail.getChild("hindlegL2");
		this.hindlegL3 = this.hindlegL2.getChild("hindlegL3");
		this.hindlegL7 = this.hindlegL3.getChild("hindlegL7");
		this.hindlegL4 = this.tail.getChild("hindlegL4");
		this.hindlegL5 = this.hindlegL4.getChild("hindlegL5");
		this.hindlegL6 = this.hindlegL5.getChild("hindlegL6");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, -1.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 37).addBox(-1.9F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0003F, 1.1945F, -7.4284F, 1.4069F, -0.0869F, 1.5775F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(33, 40).addBox(-0.4564F, -0.4825F, -0.5011F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, -0.7966F, -8.9596F, 0.0175F, -0.096F, -0.0017F));

		PartDefinition forelegL = body.addOrReplaceChild("forelegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, -0.322F, -7.4699F, -0.4547F, -1.1702F, 0.7054F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.65F, 0.5F, 0.2F, 1.1072F, 0.148F, 0.0568F));

		PartDefinition forelegL3 = forelegL2.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0896F, 0.0132F, 0.1732F));

		PartDefinition forelegL4 = body.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, -0.322F, -7.4699F, -0.3797F, 1.0903F, -0.6225F));

		PartDefinition forelegL5 = forelegL4.addOrReplaceChild("forelegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.65F, 0.5F, 0.2F, 1.1072F, -0.148F, -0.0568F));

		PartDefinition forelegL6 = forelegL5.addOrReplaceChild("forelegL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0896F, -0.0132F, -0.1732F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.772F, -8.2699F, -0.1309F, 0.0F, -0.2618F));

		PartDefinition cube_r3 = neck.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 37).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.1712F, -2.6401F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition wholehead = neck.addOrReplaceChild("wholehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition lowerhead = wholehead.addOrReplaceChild("lowerhead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -4.8F, 0.5236F, 0.0F, 0.0F));

		PartDefinition jaw = lowerhead.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0015F, 0.948F));

		PartDefinition upperjaw = wholehead.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -0.25F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone3 = upperjaw.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition bone4 = upperjaw.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.272F, -6.2699F, 0.0873F, 0.0F, 0.0873F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 7.1F, 0.0379F, -0.1327F, 0.044F));

		PartDefinition cube_r4 = body3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(10, 39).addBox(-0.5F, 0.0044F, -1.3999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 3.4F));

		PartDefinition cube_r5 = body4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail = body4.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(31, 32).addBox(-0.5F, 0.0064F, 0.199F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.25F, 2.5F, 0.0295F, -0.1167F, 0.1475F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(34, 35).addBox(-1.5F, 0.1F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5064F, 3.699F, 0.0F, -1.5708F, 0.0F));

		PartDefinition hindlegL2 = tail.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 0.75F, 3.3F, -0.2587F, -0.6551F, 0.5323F));

		PartDefinition hindlegL3 = hindlegL2.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, 0.25F, -0.7F, 0.9615F, -1.0745F, 0.418F));

		PartDefinition hindlegL7 = hindlegL3.addOrReplaceChild("hindlegL7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9F, 0.0F, 0.0F, -0.036F, -0.1371F, -1.1696F));

		PartDefinition hindlegL4 = tail.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 0.75F, 3.3F, -0.8036F, 1.2851F, -1.1554F));

		PartDefinition hindlegL5 = hindlegL4.addOrReplaceChild("hindlegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 0.25F, -0.7F, 1.1982F, 0.7248F, -0.1211F));

		PartDefinition hindlegL6 = hindlegL5.addOrReplaceChild("hindlegL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, 0.0F, 0.0F, -0.0999F, 0.1007F, 0.6435F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(28, 13).addBox(-0.5F, 0.05F, -0.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0436F, 6.999F, 0.104F, -0.1182F, -0.1371F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0625F, 0.0F, 8.8238F, 0.1337F, -0.3487F, -0.0159F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(13, 18).addBox(-0.6625F, 0.3F, -0.7F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.25F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(18, 0).addBox(-0.5625F, 0.2F, 0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.35F, 10.4F, 0.1459F, 0.2088F, 0.1312F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.593F, 0.2F, -0.45F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0305F, 0.0F, 10.9914F, 0.1818F, 0.4675F, 0.1386F));

		return LayerDefinition.create(meshdefinition, 58, 50);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.body.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}