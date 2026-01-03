package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlatylomaspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Platylomaspis;
	private final ModelPart body;
	private final ModelPart Cephalon;
	private final ModelPart Ventralrim;
	private final ModelPart CheekL;
	private final ModelPart leftHead;
	private final ModelPart CheekR;
	private final ModelPart Rostrum;

	public PlatylomaspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Platylomaspis = this.fossil.getChild("Platylomaspis");
		this.body = this.Platylomaspis.getChild("body");
		this.Cephalon = this.body.getChild("Cephalon");
		this.Ventralrim = this.Cephalon.getChild("Ventralrim");
		this.CheekL = this.Ventralrim.getChild("CheekL");
		this.leftHead = this.CheekL.getChild("leftHead");
		this.CheekR = this.Ventralrim.getChild("CheekR");
		this.Rostrum = this.Ventralrim.getChild("Rostrum");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5668F, -1.5F, -0.1672F, 12.0F, 3.0F, 18.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-12.5F, -1.5F, -16.5F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 37).addBox(-3.3F, -1.5F, -11.3F, 20.0F, 3.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -1.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-21.3F, -3.0F, -33.4F, 21.0F, 3.0F, 33.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3F, 0.0F, 20.4F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Platylomaspis = fossil.addOrReplaceChild("Platylomaspis", CubeListBuilder.create(), PartPose.offset(-2.0F, 2.0F, 10.0F));

		PartDefinition body = Platylomaspis.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Cephalon = body.addOrReplaceChild("Cephalon", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0037F, -3.0666F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(72, 37).addBox(-4.5F, 0.2963F, -4.0666F, 9.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 57).addBox(-3.0F, -1.4037F, -2.0666F, 6.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.9F, -6.5963F, -7.4334F, 0.0F, 0.2182F, 0.0F));

		PartDefinition MedialOpening_r1 = Cephalon.addOrReplaceChild("MedialOpening_r1", CubeListBuilder.create().texOffs(76, 29).addBox(-4.0F, -1.2F, -1.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.5963F, -3.0666F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Ventralrim = Cephalon.addOrReplaceChild("Ventralrim", CubeListBuilder.create().texOffs(0, 72).addBox(-3.0F, -6.0F, 0.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.5963F, 2.9334F));

		PartDefinition CheekL = Ventralrim.addOrReplaceChild("CheekL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition leftHead = CheekL.addOrReplaceChild("leftHead", CubeListBuilder.create().texOffs(0, 21).addBox(0.0F, -5.9F, -8.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 47).addBox(3.0F, -6.0F, -4.0F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(76, 16).addBox(6.4F, -6.0F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offset(-4.0F, 6.0F, 0.0F));

		PartDefinition cube_r4 = leftHead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(58, 72).addBox(-5.7374F, -0.6082F, -2.8209F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-7.0062F, -3.7882F, 6.8935F, 0.0F, -1.0036F, -0.2182F));

		PartDefinition cube_r5 = leftHead.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 16).addBox(-9.3478F, -1.2849F, 10.258F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0522F, -4.4151F, -14.258F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r6 = leftHead.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(76, 8).addBox(-2.886F, -1.2849F, 7.8576F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0522F, -4.4151F, -14.258F, 0.0F, -0.5236F, -0.2182F));

		PartDefinition cube_r7 = leftHead.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(72, 49).addBox(-0.6929F, -0.5669F, -0.5019F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0522F, -4.4151F, -14.258F, 0.0873F, -0.7854F, -0.2182F));

		PartDefinition cube_r8 = leftHead.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(58, 72).addBox(-0.5F, -0.5F, -0.7F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.3996F, -5.5F, 5.4826F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r9 = leftHead.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(82, 72).addBox(-4.8281F, -0.5F, -3.4283F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.3498F, -4.8F, 2.7413F, 0.0F, 1.5272F, -0.2618F));

		PartDefinition cube_r10 = leftHead.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 47).addBox(-4.6502F, -0.5F, -6.7413F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3498F, -4.8F, 2.7413F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r11 = leftHead.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(82, 72).addBox(-2.0F, -0.5F, -1.9F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.0F, -5.5F, 5.5F, 0.0F, -1.5272F, 0.0F));

		PartDefinition cube_r12 = leftHead.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(72, 49).addBox(-1.0F, -0.5F, -8.7426F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6359F, -5.5F, -8.2401F, 0.0873F, 0.7854F, 0.0F));

		PartDefinition cube_r13 = leftHead.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(76, 8).addBox(-4.6F, -6.0F, -6.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(11.0F, 0.0F, -4.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r14 = leftHead.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 21).addBox(-6.1F, -0.4F, -0.25F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -5.5F, -7.75F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r15 = leftHead.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(21, 24).addBox(-3.1F, -0.5F, -4.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.1F, -0.5F, -5.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 15).addBox(-4.1F, -0.5F, -3.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 77).addBox(-6.1F, -0.5F, -2.25F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -5.5F, -7.75F, 0.0873F, 0.0F, -0.2182F));

		PartDefinition cube_r16 = leftHead.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(58, 77).addBox(-2.0F, -0.5F, -2.25F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(21, 15).addBox(-2.0F, -0.5F, -3.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 24).addBox(-2.0F, -0.5F, -4.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, -0.5F, -5.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -5.5F, -7.75F, 0.0873F, 0.0F, 0.0F));

		PartDefinition CheekR = Ventralrim.addOrReplaceChild("CheekR", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -6.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition Rostrum = Ventralrim.addOrReplaceChild("Rostrum", CubeListBuilder.create().texOffs(21, 11).addBox(-1.5F, -1.0F, -5.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(43, 72).addBox(-1.0F, -1.0F, -15.8F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -9.0F, 0.0436F, 0.0F, 0.0F));

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