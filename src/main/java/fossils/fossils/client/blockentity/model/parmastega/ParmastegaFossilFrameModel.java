package fossils.fossils.client.blockentity.model.parmastega;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ParmastegaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Parmastega;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Upperjaw;
	private final ModelPart Snout;
	private final ModelPart Jawwhole;
	private final ModelPart Jaw;
	private final ModelPart Jaw2;
	private final ModelPart LArm;
	private final ModelPart LArm2;
	private final ModelPart LArm3;
	private final ModelPart LArm4;
	private final ModelPart Body;
	private final ModelPart Body2;
	private final ModelPart LLeg;
	private final ModelPart LLeg2;
	private final ModelPart LLeg3;
	private final ModelPart LLeg4;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;

	public ParmastegaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Parmastega = this.fossil.getChild("Parmastega");
		this.Neck = this.Parmastega.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Upperjaw = this.Head.getChild("Upperjaw");
		this.Snout = this.Upperjaw.getChild("Snout");
		this.Jawwhole = this.Upperjaw.getChild("Jawwhole");
		this.Jaw = this.Jawwhole.getChild("Jaw");
		this.Jaw2 = this.Jawwhole.getChild("Jaw2");
		this.LArm = this.Parmastega.getChild("LArm");
		this.LArm2 = this.LArm.getChild("LArm2");
		this.LArm3 = this.Parmastega.getChild("LArm3");
		this.LArm4 = this.LArm3.getChild("LArm4");
		this.Body = this.Parmastega.getChild("Body");
		this.Body2 = this.Body.getChild("Body2");
		this.LLeg = this.Body2.getChild("LLeg");
		this.LLeg2 = this.LLeg.getChild("LLeg2");
		this.LLeg3 = this.Body2.getChild("LLeg3");
		this.LLeg4 = this.LLeg3.getChild("LLeg4");
		this.Tail = this.Body2.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Parmastega = fossil.addOrReplaceChild("Parmastega", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F))
				.texOffs(3, 3).addBox(-0.495F, 0.35F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(1, 3).addBox(-2.995F, 1.75F, -0.24F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -14.0F, -7.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Neck = Parmastega.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(35, 43).addBox(-0.5F, 0.0F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition Upperjaw = Head.addOrReplaceChild("Upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.2214F, -0.1704F, -0.0381F));

		PartDefinition Snout = Upperjaw.addOrReplaceChild("Snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Jawwhole = Upperjaw.addOrReplaceChild("Jawwhole", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8F, 0.3F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Jaw = Jawwhole.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 0.1F, 0.4F, 0.1635F, 0.2259F, 0.0F));

		PartDefinition Jaw2 = Jawwhole.addOrReplaceChild("Jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 0.1F, 0.4F, 0.1635F, -0.2259F, 0.0F));

		PartDefinition LArm = Parmastega.addOrReplaceChild("LArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 2.5F, -0.5F, 0.6831F, -0.6593F, 0.2503F));

		PartDefinition LArm2 = LArm.addOrReplaceChild("LArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0F, 0.5F, 0.0692F, 0.2527F, 0.2706F));

		PartDefinition LArm3 = Parmastega.addOrReplaceChild("LArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 2.5F, -0.5F, 0.6831F, 0.6593F, -0.2503F));

		PartDefinition LArm4 = LArm3.addOrReplaceChild("LArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.5F, 0.0465F, -0.2577F, -0.1806F));

		PartDefinition Body = Parmastega.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition frame3_r1 = Body.addOrReplaceChild("frame3_r1", CubeListBuilder.create().texOffs(-1, -1).addBox(-0.45F, -1.0F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 1.0F, -1.5F, 0.0F, -0.0175F, 0.0F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F))
				.texOffs(30, 6).addBox(-2.995F, 0.8F, 4.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.0443F, 0.1744F, -0.0077F));

		PartDefinition LLeg = Body2.addOrReplaceChild("LLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 1.0F, 5.0F, -0.3224F, -0.9464F, 1.612F));

		PartDefinition LLeg2 = LLeg.addOrReplaceChild("LLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.0F, 0.0F, -0.0411F, -0.3027F, 0.1372F));

		PartDefinition LLeg3 = Body2.addOrReplaceChild("LLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 1.0F, 5.0F, 0.6013F, 0.5805F, -0.4957F));

		PartDefinition LLeg4 = LLeg3.addOrReplaceChild("LLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 0.0F, 0.0F, -0.0681F, 0.298F, -0.2284F));

		PartDefinition Tail = Body2.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, 7.2F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition frame5_r1 = Tail.addOrReplaceChild("frame5_r1", CubeListBuilder.create().texOffs(36, 36).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.1284F, 2.0204F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(28, 8).addBox(-0.5F, 0.5F, -0.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.3473F, 4.7837F, 0.0F, -0.2182F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(8, 41).addBox(-0.5F, 0.5F, 0.35F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.8F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5F, 0.5F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.9F, 0.0F, -0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 57, 57);
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