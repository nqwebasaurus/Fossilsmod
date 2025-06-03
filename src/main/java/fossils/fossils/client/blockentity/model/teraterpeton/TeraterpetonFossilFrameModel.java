package fossils.fossils.client.blockentity.model.teraterpeton;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TeraterpetonFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hip;
	private final ModelPart lowerbody;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart armL5;
	private final ModelPart armL6;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;

	public TeraterpetonFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hip = this.fossil.getChild("hip");
		this.lowerbody = this.hip.getChild("lowerbody");
		this.legL = this.lowerbody.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.legL3 = this.legL2.getChild("legL3");
		this.legL4 = this.lowerbody.getChild("legL4");
		this.legL5 = this.legL4.getChild("legL5");
		this.legL6 = this.legL5.getChild("legL6");
		this.tail = this.lowerbody.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.body = this.hip.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.armL = this.body2.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.armL3 = this.armL2.getChild("armL3");
		this.armL4 = this.body2.getChild("armL4");
		this.armL5 = this.armL4.getChild("armL5");
		this.armL6 = this.armL5.getChild("armL6");
		this.neck = this.body2.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -6.0F, 4.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(1.7F, -6.5F, -6.2F, 0.0F, -0.4014F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(2.0F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7F, -6.5F, -6.2F, -0.4014F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(3.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -8.5F, 4.7F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hip = fossil.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offset(0.0F, -4.5F, 7.0F));

		PartDefinition lowerbody = hip.addOrReplaceChild("lowerbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1F, -3.2F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r4 = lowerbody.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(10, 29).addBox(-0.5F, 0.7527F, -0.2936F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.492F, -0.0527F, 0.0873F, 0.0F, 0.0F));

		PartDefinition legL = lowerbody.addOrReplaceChild("legL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9546F, 1.4878F, 1.3969F, 1.0539F, -1.1782F, -1.0104F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1046F, 0.5277F, -3.3738F, 0.48F, 0.3491F, 0.0F));

		PartDefinition legL3 = legL2.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0583F, 3.8686F, 0.6464F, -0.6196F, 0.0F, 0.0F));

		PartDefinition legL4 = lowerbody.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9546F, 1.4878F, 1.3969F, 0.5102F, 0.8216F, 0.3801F));

		PartDefinition legL5 = legL4.addOrReplaceChild("legL5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1046F, 0.5277F, -3.3738F, 0.48F, -0.3491F, 0.0F));

		PartDefinition legL6 = legL5.addOrReplaceChild("legL6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0583F, 3.8686F, 0.6464F, -0.6196F, 0.0F, 0.0F));

		PartDefinition tail = lowerbody.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, 0.35F, 0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.392F, 3.8473F, -0.0097F, -0.218F, 0.0447F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 7).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(22, 12).addBox(-0.5F, 0.2F, 5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, 5.0F, -0.0206F, -0.2642F, -0.0695F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(17, 15).addBox(0.0115F, 0.1055F, -0.2662F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(22, 20).addBox(0.0115F, 0.1055F, 5.4338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4992F, 0.0666F, 6.0044F, 0.0526F, -0.4375F, 0.0196F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1641F, -0.2278F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5115F, -0.0738F, 5.8613F, 0.2112F, -0.3283F, -0.0661F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, 0.2F, -7.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.2F, 0.0F, -0.1309F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, -0.3F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.7528F, -3.7793F, 0.0524F, 0.0F, 0.0F));

		PartDefinition armL = body2.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5069F, 2.1243F, -2.9588F, 0.0387F, 0.8935F, 0.0453F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1371F, 0.2679F, 3.2911F, 0.2182F, 0.2182F, 0.0F));

		PartDefinition armL3 = armL2.addOrReplaceChild("armL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5675F, 3.7081F, 0.8169F, -0.6868F, -1.1558F, 0.438F));

		PartDefinition armL4 = body2.addOrReplaceChild("armL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5069F, 2.1243F, -2.9588F, -2.7445F, -0.5036F, 2.6148F));

		PartDefinition armL5 = armL4.addOrReplaceChild("armL5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1371F, 0.2679F, 3.2911F, 0.534F, 0.4269F, 0.6923F));

		PartDefinition armL6 = armL5.addOrReplaceChild("armL6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5675F, 3.7081F, 0.8169F, 3.1343F, 1.5312F, 2.0819F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(37, 23).addBox(0.0F, 0.2105F, -2.8435F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.2528F, -3.5793F, -0.1478F, -0.263F, -0.0753F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(37, 28).addBox(-0.5F, 0.1881F, -2.9365F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.0105F, -2.6435F, 0.4518F, -0.2865F, -0.1074F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1924F, -2.2664F, 0.1838F, 0.0438F, 0.0047F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9002F, -0.1576F, -0.0087F, 0.0F, 0.0F));

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