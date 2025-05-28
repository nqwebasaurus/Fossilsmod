package fossils.fossils.client.blockentity.model.eretmorhipis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EretmorhipisFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Eretmorhipis;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart Body;
	private final ModelPart LArm;
	private final ModelPart LArm2;
	private final ModelPart LArm3;
	private final ModelPart LArm4;
	private final ModelPart Body2;
	private final ModelPart Tail;
	private final ModelPart LLeg;
	private final ModelPart LLeg2;
	private final ModelPart LLeg3;
	private final ModelPart LLeg4;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;

	public EretmorhipisFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Eretmorhipis = this.fossil.getChild("Eretmorhipis");
		this.Neck = this.Eretmorhipis.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.Body = this.Eretmorhipis.getChild("Body");
		this.LArm = this.Body.getChild("LArm");
		this.LArm2 = this.LArm.getChild("LArm2");
		this.LArm3 = this.Body.getChild("LArm3");
		this.LArm4 = this.LArm3.getChild("LArm4");
		this.Body2 = this.Body.getChild("Body2");
		this.Tail = this.Body2.getChild("Tail");
		this.LLeg = this.Tail.getChild("LLeg");
		this.LLeg2 = this.LLeg.getChild("LLeg2");
		this.LLeg3 = this.Tail.getChild("LLeg3");
		this.LLeg4 = this.LLeg3.getChild("LLeg4");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Eretmorhipis = fossil.addOrReplaceChild("Eretmorhipis", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.1697F, -18.8529F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Eretmorhipis.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(14, 30).addBox(0.8F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.6543F, 3.4432F, 1.5708F, 0.0698F, 1.5708F));

		PartDefinition cube_r2 = Eretmorhipis.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 43).addBox(-0.5F, 1.1F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, -0.3527F, 1.9797F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Eretmorhipis.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, -0.0955F, -0.2269F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.7F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Neck = Eretmorhipis.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -1.75F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r4 = Neck.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, 0.2033F, -3.2627F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7455F, -1.2512F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.405F, -3.9137F, -0.0873F, -0.3054F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0366F, 0.2634F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Body = Eretmorhipis.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(13, 51).addBox(-0.5F, 0.4045F, -7.9269F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, -1.6F, 8.8F, 0.0349F, 0.0F, 0.0F));

		PartDefinition LArm = Body.addOrReplaceChild("LArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0368F, 3.1816F, -0.931F, 1.1008F, -0.6878F, 0.5479F));

		PartDefinition LArm2 = LArm.addOrReplaceChild("LArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -0.5F, 0.5F, -0.1966F, 0.3331F, -0.4142F));

		PartDefinition LArm3 = Body.addOrReplaceChild("LArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0368F, 3.1816F, -0.931F, 1.0055F, 0.7442F, -0.3593F));

		PartDefinition LArm4 = LArm3.addOrReplaceChild("LArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -0.5F, 0.5F, -0.124F, -0.4197F, 0.0649F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(29, 49).addBox(-0.5F, 0.2001F, -0.1895F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.4036F, 8.793F, -0.1222F, -0.0873F, 0.0F));

		PartDefinition Tail = Body2.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5F, 0.1776F, -0.0456F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, -0.0003F, 6.9314F, -0.1571F, -0.1309F, 0.0F));

		PartDefinition cube_r6 = Tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(46, 40).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, 2.0531F, 8.8788F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, 2.0531F, 8.8788F, 1.5708F, 0.1745F, -1.5708F));

		PartDefinition LLeg = Tail.addOrReplaceChild("LLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0192F, 2.948F, 9.0123F, 0.0581F, -0.8758F, 1.0807F));

		PartDefinition LLeg2 = LLeg.addOrReplaceChild("LLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6377F, -0.5738F, 0.2126F, 0.0F, -0.2618F, 0.0F));

		PartDefinition LLeg3 = Tail.addOrReplaceChild("LLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0192F, 2.948F, 9.0123F, 0.8675F, 0.4757F, -0.5184F));

		PartDefinition LLeg4 = LLeg3.addOrReplaceChild("LLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6377F, -0.5738F, 0.2126F, 0.0F, 0.2618F, -0.2618F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(18, 27).addBox(-0.5F, 0.2399F, -0.415F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0334F, 9.0689F, -0.1745F, -0.2182F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5706F, 0.0146F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, 0.8F, 10.0F, 0.0524F, -0.2182F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(34, 38).addBox(-0.5F, -0.0955F, -0.0731F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5F, 12.5F, 0.192F, 0.3491F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(35, 11).addBox(-0.5F, -0.0998F, -0.5843F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, -0.0412F, 9.0249F, 0.1484F, 0.48F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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