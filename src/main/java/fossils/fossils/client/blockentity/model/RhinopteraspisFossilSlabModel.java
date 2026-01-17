package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RhinopteraspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart root;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart head;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
	private final ModelPart wing;
	private final ModelPart cube_r12;
	private final ModelPart wing2;
	private final ModelPart cube_r13;
	private final ModelPart nose;
	private final ModelPart cube_r14;
	private final ModelPart cube_r15;
	private final ModelPart cube_r16;
	private final ModelPart horn;
	private final ModelPart cube_r17;

	public RhinopteraspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.root = this.fossil.getChild("root");
		this.tail = this.root.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.cube_r3 = this.tail4.getChild("cube_r3");
		this.cube_r4 = this.tail4.getChild("cube_r4");
		this.cube_r5 = this.tail4.getChild("cube_r5");
		this.head = this.root.getChild("head");
		this.cube_r6 = this.head.getChild("cube_r6");
		this.cube_r7 = this.head.getChild("cube_r7");
		this.cube_r8 = this.head.getChild("cube_r8");
		this.cube_r9 = this.head.getChild("cube_r9");
		this.cube_r10 = this.head.getChild("cube_r10");
		this.cube_r11 = this.head.getChild("cube_r11");
		this.wing = this.head.getChild("wing");
		this.cube_r12 = this.wing.getChild("cube_r12");
		this.wing2 = this.head.getChild("wing2");
		this.cube_r13 = this.wing2.getChild("cube_r13");
		this.nose = this.head.getChild("nose");
		this.cube_r14 = this.nose.getChild("cube_r14");
		this.cube_r15 = this.nose.getChild("cube_r15");
		this.cube_r16 = this.nose.getChild("cube_r16");
		this.horn = this.head.getChild("horn");
		this.cube_r17 = this.horn.getChild("cube_r17");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(45, 33).addBox(-2.5F, 2.5F, 4.0F, 15.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(45, 46).addBox(-11.5F, -7.5F, 4.0F, 9.0F, 12.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 33).addBox(-11.5F, -9.5F, -6.0F, 12.0F, 14.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-5.5F, -4.5F, -5.0F, 18.0F, 9.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -4.5F, -4.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 0).addBox(7.2932F, -3.5F, -4.7627F, 5.0F, 3.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(27, 69).addBox(7.2932F, -5.5F, -4.7627F, 8.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 58).addBox(-0.7068F, -5.5F, -4.7627F, 8.0F, 7.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 20).addBox(-0.7068F, -7.5F, -4.7627F, 18.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, -5.4F, 2.9F, -0.143F, -0.2201F, 0.5831F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(-18.0F, -4.6F, -7.0F, 0.0F, 0.3491F, 0.8727F));

		PartDefinition tail = root.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(86, 27).addBox(-2.0F, -2.5F, 0.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -17.2F, 1.75F, 0.0F, 0.3491F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(84, 55).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, 5.5F, -0.0077F, 0.1744F, -0.0443F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(27, 58).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, 5.0F, 0.15F, 0.298F, -0.2284F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.134F, 3.6827F, 0.1188F, 0.2201F, -0.5831F));

		PartDefinition cube_r3 = tail4.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(67, 69).addBox(1.5F, 0.225F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -0.216F, 4.5173F, 0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r4 = tail4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(35, 33).addBox(1.5F, -1.625F, -5.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, -0.216F, 4.5173F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = tail4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 83).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8829F, 4.4647F, -0.2618F, 0.0F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(19, 82).addBox(-0.5F, -0.5F, -4.0F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.003F))
				.texOffs(47, 6).addBox(-0.5F, -3.556F, -9.6396F, 5.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(67, 69).addBox(-0.5F, -1.556F, -6.6396F, 5.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(0, 89).addBox(0.0F, -4.731F, -11.9896F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(85, 83).addBox(0.0F, -4.731F, -10.3396F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, -15.7F, -1.75F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 0).addBox(0.0F, 0.975F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.4219F, 1.6349F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(57, 23).addBox(0.0F, 0.6091F, -0.0255F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -5.356F, -5.3396F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(75, 14).addBox(-0.45F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.1703F, -6.4804F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 76).addBox(-1.55F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -3.1703F, -6.4804F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(72, 14).addBox(0.0F, -2.006F, -3.9896F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(66, 86).addBox(-0.5F, -2.006F, -1.9896F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.55F, -9.65F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(74, 46).addBox(-0.5F, -2.0F, -6.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 1.5F, -4.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition wing = head.addOrReplaceChild("wing", CubeListBuilder.create().texOffs(47, 23).addBox(3.875F, 0.4F, 1.2F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offset(-1.5F, -3.8327F, -1.4457F));

		PartDefinition cube_r12 = wing.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(49, 86).addBox(-1.125F, 0.4F, -0.95F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition wing2 = head.addOrReplaceChild("wing2", CubeListBuilder.create().texOffs(47, 0).addBox(-9.875F, 0.4F, 1.2F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offset(5.5F, -3.8327F, -1.4457F));

		PartDefinition cube_r13 = wing2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(86, 38).addBox(-4.875F, 0.4F, -0.95F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(16, 76).addBox(-2.0F, -4.0F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(72, 83).addBox(-1.5F, -4.0F, -15.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -0.55F, -9.65F));

		PartDefinition cube_r14 = nose.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 76).addBox(-1.5F, -0.275F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, -3.5F, -3.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r15 = nose.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).addBox(0.025F, -0.5F, -2.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -3.5F, -3.0F, -0.0016F, -0.3052F, 0.0118F));

		PartDefinition cube_r16 = nose.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 5).addBox(-1.025F, -0.5F, -2.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.5F, -3.0F, -0.0016F, 0.3052F, -0.0118F));

		PartDefinition horn = head.addOrReplaceChild("horn", CubeListBuilder.create().texOffs(47, 4).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -4.4219F, 0.6349F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r17 = horn.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(49, 69).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 4.0F, -0.0916F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}