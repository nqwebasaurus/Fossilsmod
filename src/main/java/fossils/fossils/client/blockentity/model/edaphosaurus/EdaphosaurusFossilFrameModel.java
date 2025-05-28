package fossils.fossils.client.blockentity.model.edaphosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EdaphosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart body2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL1;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL6;
	private final ModelPart hindlegL7;
	private final ModelPart hindlegL8;
	private final ModelPart hindlegL9;
	private final ModelPart hindlegL5;
	private final ModelPart hindlegL4;
	private final ModelPart frontlegL;
	private final ModelPart frontlegL1;
	private final ModelPart frontlegL2;
	private final ModelPart frontlegL3;
	private final ModelPart frontlegL6;
	private final ModelPart frontlegL7;
	private final ModelPart frontlegL8;
	private final ModelPart frontlegL9;
	private final ModelPart frontlegL5;
	private final ModelPart frontlegL4;

	public EdaphosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.neck = this.body.getChild("neck");
		this.head = this.neck.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.body2 = this.body.getChild("body2");
		this.tail = this.body2.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.hindlegL = this.body2.getChild("hindlegL");
		this.hindlegL1 = this.hindlegL.getChild("hindlegL1");
		this.hindlegL2 = this.hindlegL1.getChild("hindlegL2");
		this.hindlegL3 = this.hindlegL2.getChild("hindlegL3");
		this.hindlegL6 = this.body2.getChild("hindlegL6");
		this.hindlegL7 = this.hindlegL6.getChild("hindlegL7");
		this.hindlegL8 = this.hindlegL7.getChild("hindlegL8");
		this.hindlegL9 = this.hindlegL8.getChild("hindlegL9");
		this.hindlegL5 = this.body2.getChild("hindlegL5");
		this.hindlegL4 = this.body2.getChild("hindlegL4");
		this.frontlegL = this.body.getChild("frontlegL");
		this.frontlegL1 = this.frontlegL.getChild("frontlegL1");
		this.frontlegL2 = this.frontlegL1.getChild("frontlegL2");
		this.frontlegL3 = this.frontlegL2.getChild("frontlegL3");
		this.frontlegL6 = this.body.getChild("frontlegL6");
		this.frontlegL7 = this.frontlegL6.getChild("frontlegL7");
		this.frontlegL8 = this.frontlegL7.getChild("frontlegL8");
		this.frontlegL9 = this.frontlegL8.getChild("frontlegL9");
		this.frontlegL5 = this.body.getChild("frontlegL5");
		this.frontlegL4 = this.body.getChild("frontlegL4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, -9.0F, 12.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(1, 1).addBox(2.7F, -14.0F, -14.4F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-1.7F, -5.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.2F, -9.0F, -13.9F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -7.0F, 13.0F, 0.1745F, 0.0F, -1.5708F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.45F, -1.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.0F, -14.4F, -9.75F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 12).addBox(-0.5F, 0.3128F, -0.2962F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.65F, -7.5F, 0.2094F, 0.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.65F, -7.5F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r4 = neck.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(47, 46).addBox(-0.5F, 0.3F, -1.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2389F, -2.7671F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -4.75F, 0.0005F, 0.0865F, 0.0114F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4F, -0.6F, 0.8727F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 6.9F, -0.1314F, -0.0865F, 0.0114F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 46).addBox(-0.5F, 0.2F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.2666F, 17.0834F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 28).addBox(0.0F, 0.5319F, -6.7235F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 2.3001F, 14.6721F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 15).addBox(0.0F, 0.5655F, -7.84F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail = body2.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5501F, 19.3221F, 0.1162F, -0.2167F, -0.0251F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.1F, 1.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0817F, -0.8709F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5F, 0.1681F, -0.3026F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.5817F, 11.0291F, -0.3894F, -0.4488F, 0.1762F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0319F, 8.9974F, -0.1064F, -0.6082F, 0.061F));

		PartDefinition cube_r9 = tail3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 2).addBox(-0.6F, 0.1F, -0.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1005F, -0.2218F, 0.0873F, 0.0174F, 0.0015F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3087F, -0.1416F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9995F, 9.7782F, -0.0935F, -0.609F, -0.2567F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(16, 17).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2087F, 10.7584F, 0.0436F, -0.5236F, 0.0F));

		PartDefinition hindlegL = body2.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 6.1001F, 7.2721F, 0.0F, 0.3491F, 0.0F));

		PartDefinition hindlegL1 = hindlegL.addOrReplaceChild("hindlegL1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8191F, 0.0F, 9.4739F, 0.3094F, 0.3725F, -1.1149F));

		PartDefinition hindlegL2 = hindlegL1.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7214F, 3.7443F, -0.1F, -0.3645F, 0.5945F, 1.113F));

		PartDefinition hindlegL3 = hindlegL2.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4753F, 3.9734F, 0.5618F, -0.0477F, -1.5134F, 0.0153F));

		PartDefinition hindlegL6 = body2.addOrReplaceChild("hindlegL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 6.1001F, 7.2721F, 0.0F, -0.3491F, 0.0F));

		PartDefinition hindlegL7 = hindlegL6.addOrReplaceChild("hindlegL7", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8191F, 0.0F, 9.4739F, -0.7089F, -0.3089F, 1.393F));

		PartDefinition hindlegL8 = hindlegL7.addOrReplaceChild("hindlegL8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7214F, 3.7443F, -0.1F, -0.1241F, -0.1058F, -1.0456F));

		PartDefinition hindlegL9 = hindlegL8.addOrReplaceChild("hindlegL9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4753F, 3.9734F, 0.5618F, 0.4759F, 1.5134F, -0.0153F));

		PartDefinition hindlegL5 = body2.addOrReplaceChild("hindlegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 6.1001F, 7.2721F, 0.0F, -0.3491F, 0.0F));

		PartDefinition hindlegL4 = body2.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 6.1001F, 7.2721F, 0.0F, -0.3491F, 0.0F));

		PartDefinition frontlegL = body.addOrReplaceChild("frontlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 5.5F, -5.5F, 0.0F, -0.6981F, 0.0F));

		PartDefinition frontlegL1 = frontlegL.addOrReplaceChild("frontlegL1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9669F, 0.5F, -0.4626F, -0.774F, 0.4326F, -0.6756F));

		PartDefinition frontlegL2 = frontlegL1.addOrReplaceChild("frontlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4172F, 4.5801F, -0.4785F, -0.481F, 0.0925F, 0.6746F));

		PartDefinition frontlegL3 = frontlegL2.addOrReplaceChild("frontlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5023F, 3.8214F, -0.0899F, 1.1421F, -0.0945F, -0.1006F));

		PartDefinition frontlegL6 = body.addOrReplaceChild("frontlegL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 5.5F, -5.5F, 0.0F, 0.6981F, 0.0F));

		PartDefinition frontlegL7 = frontlegL6.addOrReplaceChild("frontlegL7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9669F, 0.5F, -0.4626F, 0.3605F, -0.4326F, 0.6756F));

		PartDefinition frontlegL8 = frontlegL7.addOrReplaceChild("frontlegL8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4172F, 4.5801F, -0.4785F, -0.6753F, -0.2851F, -0.5701F));

		PartDefinition frontlegL9 = frontlegL8.addOrReplaceChild("frontlegL9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5023F, 3.8214F, -0.0899F, 0.1309F, 0.0F, 0.0F));

		PartDefinition frontlegL5 = body.addOrReplaceChild("frontlegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 5.5F, -5.5F, 0.0F, 0.6981F, 0.0F));

		PartDefinition frontlegL4 = body.addOrReplaceChild("frontlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 5.5F, -5.5F, 0.0F, 0.6981F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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