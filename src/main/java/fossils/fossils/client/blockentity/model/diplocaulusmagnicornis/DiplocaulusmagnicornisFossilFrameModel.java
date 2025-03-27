package fossils.fossils.client.blockentity.model.diplocaulusmagnicornis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DiplocaulusmagnicornisFossilFrameModel extends SkullModelBase {
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
	private final ModelPart bone4;
	private final ModelPart bone2;
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

	public DiplocaulusmagnicornisFossilFrameModel(ModelPart root) {
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
		this.bone4 = this.upperjaw.getChild("bone4");
		this.bone2 = this.upperjaw.getChild("bone2");
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

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, -1.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 34).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0949F, -6.9474F, 1.5533F, -0.0175F, 1.5711F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(26, 39).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -0.0949F, -6.9474F, 1.5882F, -0.0175F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 37).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.372F, -9.3699F, 0.0175F, 0.0F, 0.0F));

		PartDefinition forelegL = body.addOrReplaceChild("forelegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, -0.322F, -7.4699F, -0.2599F, -0.8412F, 0.4781F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.65F, 0.5F, 0.2F, 1.1072F, 0.148F, 0.0568F));

		PartDefinition forelegL3 = forelegL2.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0896F, 0.0132F, 0.1732F));

		PartDefinition forelegL4 = body.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, -0.322F, -7.4699F, -0.505F, 1.2089F, -0.7596F));

		PartDefinition forelegL5 = forelegL4.addOrReplaceChild("forelegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.65F, 0.5F, 0.2F, 1.1053F, -0.2456F, -0.0567F));

		PartDefinition forelegL6 = forelegL5.addOrReplaceChild("forelegL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0896F, -0.0132F, -0.1732F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.772F, -8.2699F, -0.0876F, -0.1795F, -0.0184F));

		PartDefinition cube_r4 = neck.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 38).addBox(-0.6F, 0.2F, -1.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition wholehead = neck.addOrReplaceChild("wholehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -3.0F, 0.016F, -0.0425F, 0.2173F));

		PartDefinition lowerhead = wholehead.addOrReplaceChild("lowerhead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -4.8F, 0.3054F, 0.0F, 0.0F));

		PartDefinition jaw = lowerhead.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0015F, 0.948F));

		PartDefinition upperjaw = wholehead.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -0.25F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone4 = upperjaw.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition bone2 = upperjaw.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(29, 29).addBox(-0.5F, -0.1F, -0.6F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.272F, -6.2699F, 0.0438F, 0.1309F, 0.0019F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 7.1F, 0.0441F, 0.1744F, 0.0039F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.0956F, -1.0999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.4F, 0.0006F, 0.0434F, -0.0095F));

		PartDefinition cube_r6 = body4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1, 18).addBox(-0.5F, 0.0F, 0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail = body4.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.0936F, -0.201F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.25F, 2.5F, -0.043F, 0.2164F, -0.0336F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(3, 33).addBox(-0.1F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.9064F, 3.299F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 35).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.4064F, 3.299F, 1.5708F, 0.0F, 0.0F));

		PartDefinition hindlegL2 = tail.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 0.75F, 3.3F, -0.6296F, -1.219F, 0.9723F));

		PartDefinition hindlegL3 = hindlegL2.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, 0.25F, -0.7F, 1.2654F, -0.4363F, 0.0F));

		PartDefinition hindlegL7 = hindlegL3.addOrReplaceChild("hindlegL7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9F, 0.0F, 0.0F, -0.135F, -0.0434F, -0.1656F));

		PartDefinition hindlegL4 = tail.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 0.75F, 3.3F, -0.335F, 0.9057F, -0.6398F));

		PartDefinition hindlegL5 = hindlegL4.addOrReplaceChild("hindlegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 0.25F, -0.7F, 1.1474F, 0.8455F, -0.1928F));

		PartDefinition hindlegL6 = hindlegL5.addOrReplaceChild("hindlegL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, 0.0F, 0.0F, -0.135F, 0.0434F, 0.1656F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(14, 17).addBox(-0.5F, -0.05F, -0.7F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0436F, 6.999F, 0.0877F, 0.176F, 0.0266F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0625F, 0.0F, 8.8238F, 0.0266F, -0.1745F, -0.0046F));

		PartDefinition cube_r9 = tail3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(17, -1).addBox(-0.5625F, 0.2F, -0.9F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.25F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5625F, 0.1F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.35F, 10.4F, -0.0007F, -0.3925F, 0.0097F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.593F, 0.1F, -0.25F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0305F, 0.0F, 10.9914F, -0.1745F, -0.3054F, 0.0F));

		return LayerDefinition.create(meshdefinition, 55, 50);
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