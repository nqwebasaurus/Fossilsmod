package fossils.fossils.client.blockentity.model.ichthyostega;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IchthyostegaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart bodyfront;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart handL;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart handL2;
	private final ModelPart bodyfront2;
	private final ModelPart head;
	private final ModelPart upperjaw1;
	private final ModelPart snout;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lowerjaw1;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bodyrear;
	private final ModelPart tailbase;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart footL;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart footL2;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart bone;
	private final ModelPart bone4;

	public IchthyostegaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.body = this.root.getChild("body");
		this.bodyfront = this.body.getChild("bodyfront");
		this.armL = this.bodyfront.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.handL = this.armL2.getChild("handL");
		this.armL3 = this.bodyfront.getChild("armL3");
		this.armL4 = this.armL3.getChild("armL4");
		this.handL2 = this.armL4.getChild("handL2");
		this.bodyfront2 = this.bodyfront.getChild("bodyfront2");
		this.head = this.bodyfront2.getChild("head");
		this.upperjaw1 = this.head.getChild("upperjaw1");
		this.snout = this.upperjaw1.getChild("snout");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lowerjaw1 = this.head.getChild("lowerjaw1");
		this.bone2 = this.bodyfront.getChild("bone2");
		this.bone3 = this.bodyfront.getChild("bone3");
		this.bodyrear = this.body.getChild("bodyrear");
		this.tailbase = this.bodyrear.getChild("tailbase");
		this.legL = this.tailbase.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.footL = this.legL2.getChild("footL");
		this.legL3 = this.tailbase.getChild("legL3");
		this.legL4 = this.legL3.getChild("legL4");
		this.footL2 = this.legL4.getChild("footL2");
		this.tail1 = this.tailbase.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail = this.tail2.getChild("tail");
		this.tail3 = this.tail.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.bone = this.tailbase.getChild("bone");
		this.bone4 = this.tailbase.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.7F, -7.0F, -8.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.9F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -6.2F, 9.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(1.4F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -6.2F, 9.0F, -0.1309F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(1.85F, -4.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -5.65F, -8.1F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -5.2F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.35F, -3.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(24, 5).addBox(-0.5F, -0.35F, 1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition bodyfront = body.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6869F, -3.5497F, 0.0524F, 0.0436F, 0.0023F));

		PartDefinition bodyfront_r1 = bodyfront.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, 0.2F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.35F, -4.8F, 0.0436F, 0.0F, 0.0F));

		PartDefinition armL = bodyfront.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5576F, 4.8031F, -4.8017F, -0.3316F, -0.916F, 0.8647F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.0F, 0.0F, -0.2182F, 1.0036F, 0.1309F));

		PartDefinition handL = armL2.addOrReplaceChild("handL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3636F, -0.0764F, 0.5749F, 0.5104F, 0.3558F, -0.4522F));

		PartDefinition armL3 = bodyfront.addOrReplaceChild("armL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5576F, 4.8031F, -4.8017F, -0.2006F, -0.0175F, -0.8172F));

		PartDefinition armL4 = armL3.addOrReplaceChild("armL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 0.0F, 0.0F, 1.0427F, -0.8163F, -0.7156F));

		PartDefinition handL2 = armL4.addOrReplaceChild("handL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3636F, -0.0764F, 0.5749F, 0.5104F, -0.3558F, 0.4522F));

		PartDefinition bodyfront2 = bodyfront.addOrReplaceChild("bodyfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -4.9F, 0.1695F, -0.1689F, -0.0441F));

		PartDefinition neck_r1 = bodyfront2.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(32, 8).addBox(-0.5F, 0.6449F, -0.8777F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6449F, -2.7224F, -0.1222F, 0.0F, 0.0F));

		PartDefinition head = bodyfront2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6928F, -2.5848F, -0.3814F, -0.2438F, -0.0273F));

		PartDefinition upperjaw1 = head.addOrReplaceChild("upperjaw1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.9744F, -4.6638F));

		PartDefinition snout = upperjaw1.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, 0.4F, 0.1852F, 0.0F, -0.0035F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.625F, -0.9363F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.625F, -0.9363F));

		PartDefinition lowerjaw1 = head.addOrReplaceChild("lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5658F, -0.3578F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone2 = bodyfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.197F, 1.6813F, -3.1296F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone3 = bodyfront.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.197F, 1.6813F, -3.1296F, 0.0F, -0.1745F, 0.0F));

		PartDefinition bodyrear = body.addOrReplaceChild("bodyrear", CubeListBuilder.create().texOffs(17, 18).addBox(-0.5F, 0.2621F, 0.0228F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6079F, 2.4999F, 0.0264F, -0.1309F, -0.0034F));

		PartDefinition tailbase = bodyrear.addOrReplaceChild("tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0129F, 5.9728F, 0.0264F, -0.1309F, -0.0034F));

		PartDefinition tailbase_r1 = tailbase.addOrReplaceChild("tailbase_r1", CubeListBuilder.create().texOffs(11, 33).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition legL = tailbase.addOrReplaceChild("legL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9955F, 2.0084F, 0.7317F, 0.4955F, 0.3218F, 0.6033F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5752F, 0.3359F, -0.3658F, -0.0142F, -0.1603F, 0.1739F));

		PartDefinition footL = legL2.addOrReplaceChild("footL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.288F, -0.3513F, -0.4145F, -0.3491F, 0.0F, -0.5672F));

		PartDefinition legL3 = tailbase.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9955F, 2.0084F, 0.7317F, -0.0548F, 0.736F, -0.7388F));

		PartDefinition legL4 = legL3.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5752F, 0.3359F, -0.3658F, -0.0142F, 0.1603F, -0.1739F));

		PartDefinition footL2 = legL4.addOrReplaceChild("footL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.288F, -0.3513F, -0.4145F, -0.3491F, 0.0F, 0.5672F));

		PartDefinition tail1 = tailbase.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(32, 14).addBox(-0.5F, 0.3242F, -0.2521F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 17).addBox(-0.5F, 0.3242F, 3.4479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2F, 3.8F, -0.1362F, -0.1743F, 0.0085F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(34, 2).addBox(-0.5F, 0.3953F, 0.1433F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0711F, 3.9046F, -0.0596F, 0.2205F, 0.0296F));

		PartDefinition tail = tail2.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(32, 20).addBox(-0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1953F, 2.9433F, -0.2478F, 0.2188F, 0.1276F));

		PartDefinition tail3 = tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, 0.2199F, -0.4009F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(3, 36).addBox(-0.5F, 0.2199F, 3.2991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0009F, 3.9446F, 0.1825F, 0.43F, 0.0768F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 8).addBox(-0.5F, 0.2654F, -0.2787F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0793F, 3.9213F, 0.1593F, 0.4798F, 0.0131F));

		PartDefinition bone = tailbase.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8015F, 0.4378F, 0.6295F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bone4 = tailbase.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8015F, 0.4378F, 0.6295F, 0.0F, 0.0F, -0.1309F));

		return LayerDefinition.create(meshdefinition, 83, 83);
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