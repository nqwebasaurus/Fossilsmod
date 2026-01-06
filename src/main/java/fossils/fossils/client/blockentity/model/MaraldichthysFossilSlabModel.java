package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MaraldichthysFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart maraldichthys;
	private final ModelPart analFin;
	private final ModelPart backLeftFin;
	private final ModelPart backRightFin;
	private final ModelPart frontLeftFin;
	private final ModelPart frontRightFin;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart matrix;

	public MaraldichthysFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.maraldichthys = this.fossil.getChild("maraldichthys");
		this.analFin = this.maraldichthys.getChild("analFin");
		this.backLeftFin = this.maraldichthys.getChild("backLeftFin");
		this.backRightFin = this.maraldichthys.getChild("backRightFin");
		this.frontLeftFin = this.maraldichthys.getChild("frontLeftFin");
		this.frontRightFin = this.maraldichthys.getChild("frontRightFin");
		this.tail = this.maraldichthys.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.matrix = this.fossil.getChild("matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition maraldichthys = fossil.addOrReplaceChild("maraldichthys", CubeListBuilder.create().texOffs(0, 46).addBox(-0.45F, -23.4421F, -1.0596F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.65F, -0.575F, 12.3F, 1.7453F, 0.0F, 1.5708F));

		PartDefinition cube_r1 = maraldichthys.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(34, 31).addBox(-0.5F, 0.0F, -4.65F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -9.4736F, -2.5058F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r2 = maraldichthys.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(13, 51).addBox(-0.45F, -0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 46).addBox(0.225F, -0.1F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.125F, -9.915F, -1.7199F, 2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r3 = maraldichthys.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 46).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, -9.6845F, -2.6401F, 2.138F, 0.0F, 0.0F));

		PartDefinition cube_r4 = maraldichthys.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(41, 51).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.025F, -10.6835F, -2.6837F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r5 = maraldichthys.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 40).addBox(-1.5F, 0.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.975F, -12.4962F, -1.8385F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r6 = maraldichthys.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(47, 31).addBox(-0.025F, 0.0F, -3.75F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.45F, -6.8316F, 1.7947F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r7 = maraldichthys.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 50).addBox(0.0F, 0.0F, -2.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.45F, -10.8302F, 1.69F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r8 = maraldichthys.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(19, 31).addBox(0.0F, -0.5F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.475F, -3.4529F, 0.7533F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r9 = maraldichthys.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -0.325F, -0.65F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.2948F, 0.6446F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r10 = maraldichthys.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(33, 45).addBox(-0.5F, -0.075F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -7.9258F, 0.9394F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r11 = maraldichthys.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(34, 38).addBox(-0.5F, -0.425F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.1419F, -0.0164F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r12 = maraldichthys.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(9, 41).addBox(-0.5F, -1.675F, -0.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(0, 41).addBox(-0.5F, -0.75F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -7.2247F, -1.6158F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r13 = maraldichthys.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(49, 46).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(24, 51).addBox(-0.5F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -7.5921F, 0.3809F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r14 = maraldichthys.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(42, 45).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.025F, -7.5921F, 0.3809F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r15 = maraldichthys.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(46, 51).addBox(-0.125F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.35F, -23.4857F, -1.3587F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r16 = maraldichthys.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(8, 51).addBox(-0.5F, 1.025F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -15.4933F, -1.7076F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r17 = maraldichthys.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(3, 46).addBox(-0.5F, 0.175F, 0.725F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -15.4933F, -1.7076F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r18 = maraldichthys.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(19, 40).addBox(-0.5F, -11.0F, 0.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.4962F, -1.8385F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r19 = maraldichthys.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(47, 36).addBox(-0.5F, 0.25F, -1.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.025F, -12.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition analFin = maraldichthys.addOrReplaceChild("analFin", CubeListBuilder.create().texOffs(24, 46).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.475F, -13.4083F, 0.1732F, 1.2217F, 0.0F, 0.0F));

		PartDefinition backLeftFin = maraldichthys.addOrReplaceChild("backLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.95F, -8.6604F, 0.2525F, 0.0873F, 0.0F, 0.0F));

		PartDefinition backRightFin = maraldichthys.addOrReplaceChild("backRightFin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.95F, -8.6604F, 0.2525F, 0.0873F, 0.0F, 0.0F));

		PartDefinition frontLeftFin = maraldichthys.addOrReplaceChild("frontLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.4834F, -0.3984F, -0.6682F, 0.3879F, -0.2902F));

		PartDefinition frontRightFin = maraldichthys.addOrReplaceChild("frontRightFin", CubeListBuilder.create().texOffs(49, 51).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4834F, -0.3984F, -0.6109F, 0.0F, 0.0F));

		PartDefinition tail = maraldichthys.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(31, 50).addBox(-0.025F, -0.5F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.45F, -15.0542F, -0.3719F, 1.1781F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(49, 41).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0634F, 1.6902F, 0.2618F, 0.0F, 0.0F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create().texOffs(0, 0).addBox(-8.35F, -2.0F, -22.65F, 14.0F, 1.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1F, 1.0F, 8.25F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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