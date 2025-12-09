package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CyrtocerasFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart shell;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart leg1;
	private final ModelPart leg6;
	private final ModelPart leg2;
	private final ModelPart leg7;
	private final ModelPart leg3;
	private final ModelPart leg8;
	private final ModelPart leg4;
	private final ModelPart leg10;
	private final ModelPart leg5;
	private final ModelPart leg9;
	private final ModelPart bone;

	public CyrtocerasFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.shell = this.body.getChild("shell");
		this.bone2 = this.shell.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
		this.leg1 = this.body.getChild("leg1");
		this.leg6 = this.body.getChild("leg6");
		this.leg2 = this.body.getChild("leg2");
		this.leg7 = this.body.getChild("leg7");
		this.leg3 = this.body.getChild("leg3");
		this.leg8 = this.body.getChild("leg8");
		this.leg4 = this.body.getChild("leg4");
		this.leg10 = this.body.getChild("leg10");
		this.leg5 = this.body.getChild("leg5");
		this.leg9 = this.body.getChild("leg9");
		this.bone = this.body.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -3.0F, -21.0F, 22.0F, 3.0F, 37.0F, new CubeDeformation(0.0F))
				.texOffs(0, 41).addBox(-6.0F, -6.0F, -20.0F, 20.0F, 3.0F, 23.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(-5.0F, -9.0F, -19.0F, 19.0F, 3.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 82).addBox(-4.0F, 0.0F, -33.0F, 18.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(64, 41).addBox(-5.1F, 0.0F, -24.0F, 17.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(59, 68).addBox(-6.0F, 0.0F, -12.0F, 16.0F, 3.0F, 12.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -3.0F, 14.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 12.0F));

		PartDefinition shell = body.addOrReplaceChild("shell", CubeListBuilder.create().texOffs(0, 15).addBox(-6.0F, -2.0F, -8.0F, 12.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(27, 27).addBox(4.0F, -10.0F, -5.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(49, 68).addBox(4.0F, -7.0F, -7.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(55, 84).addBox(-6.0F, -12.0F, -3.0F, 12.0F, 12.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(20, 23).addBox(-6.0F, -12.0F, -4.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 0).addBox(-6.0F, -12.0F, -6.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -6.4F, -5.0F, 3.1416F, -0.1309F, -1.5708F));

		PartDefinition bone2 = shell.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(64, 57).addBox(-5.0F, -3.0F, 11.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 0).addBox(-5.0F, -10.0F, -1.0F, 10.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 5.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 51).addBox(-4.0F, -7.7517F, 0.4292F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-4.0F, -7.7517F, 1.8292F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9483F, 11.3615F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0517F, 7.8164F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone4.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 23).addBox(-3.0F, -5.8517F, -1.0F, 6.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0517F, -0.1212F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 41).addBox(-2.0F, -4.5F, 0.2987F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5517F, 4.5802F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone5.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -3.5F, 5.7987F, -0.2182F, 0.0F, -1.2217F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, 3.2987F, 0.48F, 0.0F, 0.0F));

		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(3.0F, -4.0F, 7.0F));

		PartDefinition leg6 = body.addOrReplaceChild("leg6", CubeListBuilder.create(), PartPose.offset(-3.0F, -4.0F, 7.0F));

		PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -6.0F, 7.0F, 0.0F, -0.0436F, -0.3927F));

		PartDefinition leg7 = body.addOrReplaceChild("leg7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -6.0F, 7.0F, 0.0F, 0.0436F, 0.3927F));

		PartDefinition leg3 = body.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -2.0F, 7.0F, 0.0F, -0.0436F, 0.3491F));

		PartDefinition leg8 = body.addOrReplaceChild("leg8", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -2.0F, 7.0F, 0.0F, 0.0436F, -0.3491F));

		PartDefinition leg4 = body.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -1.0F, 7.0F, -0.0873F, 0.0436F, 1.3963F));

		PartDefinition leg10 = body.addOrReplaceChild("leg10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -1.0F, 7.0F, -0.0873F, -0.0436F, -1.3963F));

		PartDefinition leg5 = body.addOrReplaceChild("leg5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -7.0F, 7.0F, 0.0F, 0.0F, -1.3526F));

		PartDefinition leg9 = body.addOrReplaceChild("leg9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -7.0F, 7.0F, 0.0F, 0.0F, 1.3526F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.0F, 3.0F, -1.1345F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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