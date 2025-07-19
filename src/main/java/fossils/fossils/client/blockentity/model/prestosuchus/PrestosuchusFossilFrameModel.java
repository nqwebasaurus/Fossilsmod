package fossils.fossils.client.blockentity.model.prestosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PrestosuchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart upperleg3;
	private final ModelPart leg3;
	private final ModelPart feet3;
	private final ModelPart toes3;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart upperarm2;
	private final ModelPart arm2;
	private final ModelPart hand2;
	private final ModelPart upperarm3;
	private final ModelPart arm3;
	private final ModelPart hand3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart crestl;
	private final ModelPart crestl2;
	private final ModelPart crestl3;
	private final ModelPart crestl4;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public PrestosuchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.upperleg2 = this.hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.upperleg3 = this.hips.getChild("upperleg3");
		this.leg3 = this.upperleg3.getChild("leg3");
		this.feet3 = this.leg3.getChild("feet3");
		this.toes3 = this.feet3.getChild("toes3");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.arm2 = this.upperarm2.getChild("arm2");
		this.hand2 = this.arm2.getChild("hand2");
		this.upperarm3 = this.chest.getChild("upperarm3");
		this.arm3 = this.upperarm3.getChild("arm3");
		this.hand3 = this.arm3.getChild("hand3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.crestl = this.head.getChild("crestl");
		this.crestl2 = this.crestl.getChild("crestl2");
		this.crestl3 = this.head.getChild("crestl3");
		this.crestl4 = this.crestl3.getChild("crestl4");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -22.0F, 1.0F, 1.0F, 22.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.0F, -16.5F, -16.5F, 0.007F, -0.2164F, -0.0275F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(2.5F, -5.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0F, -16.5F, -16.5F, -0.2164F, -0.0069F, 1.5448F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-6.1F, -6.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -13.5F, 1.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -20.0F, 2.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 41).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4F, 1.1319F, -0.3993F, 0.2462F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 10.2227F, 1.157F, 0.5452F, 0.0F, 0.0F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 9.3899F, 2.1734F, 0.1707F, 0.0F, 0.0F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0229F, -3.7873F, -0.829F, 0.0F, 0.0F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4F, 1.1319F, -0.3993F, -0.452F, 0.0F, 0.0F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 10.2227F, 1.157F, 0.6761F, 0.0F, 0.0F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 9.3899F, 2.1734F, -0.1347F, 0.0F, 0.0F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0229F, -3.7873F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(34, 54).addBox(-0.5F, -0.2F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(51, 56).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -12.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -12.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 53).addBox(-0.5F, 1.1428F, 0.153F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1F, -6.0F, 0.192F, 0.0F, 0.0F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 8.4F, -4.2F, 1.0718F, 0.0F, -0.1396F));

		PartDefinition arm2 = upperarm2.addOrReplaceChild("arm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7F, 6.5F, 0.8F, -1.6157F, -0.364F, -1.4434F));

		PartDefinition hand2 = arm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.6718F, -1.0842F, -0.0405F, 0.0253F, 1.0904F));

		PartDefinition upperarm3 = chest.addOrReplaceChild("upperarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 8.4F, -4.2F, -0.1063F, 0.0F, 0.1396F));

		PartDefinition arm3 = upperarm3.addOrReplaceChild("arm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, 6.5F, 0.8F, -1.6762F, -1.1608F, 1.5561F));

		PartDefinition hand3 = arm3.addOrReplaceChild("hand3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.6718F, -1.0842F, 0.0004F, 0.0477F, 1.0472F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -5.2F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r7 = neck3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(70, 19).addBox(0.0F, -0.9046F, 0.076F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.6F, -4.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -4.8F, -0.0873F, -0.3491F, 0.0F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 75).addBox(0.0F, 0.7F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(26, 71).addBox(0.0F, 0.7F, 0.6F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -1.1F, -5.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -5.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(39, 71).addBox(0.0F, 0.3F, -1.8F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.4F, 0.0F, -0.0873F, 0.0F));

		PartDefinition crestl = head.addOrReplaceChild("crestl", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2703F, 0.6012F, -5.6233F, 0.5477F, 0.581F, 0.0424F));

		PartDefinition crestl2 = crestl.addOrReplaceChild("crestl2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0185F, -0.0787F, 2.6969F, -0.211F, -0.5263F, -0.0234F));

		PartDefinition crestl3 = head.addOrReplaceChild("crestl3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2703F, 0.6012F, -5.6233F, 0.5477F, -0.581F, -0.0424F));

		PartDefinition crestl4 = crestl3.addOrReplaceChild("crestl4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0185F, -0.0787F, 2.6969F, -0.211F, 0.5263F, 0.0234F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 2.9F, 3.2F, 0.9076F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(28, 27).addBox(-0.5F, 0.2F, 0.2F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.0F, 5.7F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(1, 26).addBox(-0.5F, 0.2F, 0.1F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, -0.0542F, 0.2614F, -0.014F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(64, 69).addBox(-0.5F, 0.1015F, -0.0349F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 0).addBox(-0.5F, 0.1015F, 4.6651F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(70, 5).addBox(-0.5F, 0.1015F, 10.3651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, 11.0F, -0.0886F, 0.1739F, -0.0154F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, 0.4F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3985F, 10.9651F, -0.1855F, 0.3435F, -0.0631F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, 0.4F, -0.4F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.128F, 0.3031F, -0.0384F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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