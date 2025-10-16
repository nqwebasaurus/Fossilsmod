package fossils.fossils.client.blockentity.model.gerrothorax;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GerrothoraxFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart bone;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart bone8;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Tailend2;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone7;
	private final ModelPart bone3;
	private final ModelPart bone6;

	public GerrothoraxFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.body2 = this.Bodyfront.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.forelegL = this.chest.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.bone = this.forelegL2.getChild("bone");
		this.forelegL3 = this.chest.getChild("forelegL3");
		this.forelegL4 = this.forelegL3.getChild("forelegL4");
		this.bone8 = this.forelegL4.getChild("bone8");
		this.bone2 = this.chest.getChild("bone2");
		this.bone5 = this.chest.getChild("bone5");
		this.Neck = this.chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.jaw = this.Head.getChild("jaw");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Tailend2 = this.Tailend.getChild("Tailend2");
		this.hindlegL = this.Hips.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.bone4 = this.hindlegL2.getChild("bone4");
		this.hindlegL3 = this.Hips.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.bone7 = this.hindlegL4.getChild("bone7");
		this.bone3 = this.Hips.getChild("bone3");
		this.bone6 = this.Hips.getChild("bone6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -5.0F, 12.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(1.7F, -8.5F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.3F, -4.3F, -9.0F, -0.2967F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.3F, -4.3F, -9.0F, 0.0F, -0.2967F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(2.8F, -5.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -6.5F, 12.6F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-1.0F, -7.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(36, 19).addBox(-0.5F, -0.0028F, -3.4109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 2.281F, 15.8867F, -0.1255F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(37, 35).addBox(-0.5F, 0.309F, -4.4999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(40, 38).addBox(-0.5F, 0.309F, -0.7999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2885F, -3.3114F, 0.0268F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(40, 7).addBox(-0.5F, 0.3F, -4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.009F, -4.0999F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(24, 35).addBox(-0.4F, 0.2126F, -4.9045F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 0.1018F, -3.9F, 0.0641F, -0.0871F, -0.0056F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, 0.1F, -5.275F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(4, 34).addBox(-0.5F, 0.1F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 0.1225F, -5.0048F, 0.035F, -0.0872F, -0.0031F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, 0.3F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.975F, 0.0088F, -0.0873F, -0.0008F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5849F, 3.477F, -4.2047F, 0.4004F, 0.336F, -1.0527F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0554F, 3.3442F, -0.1694F, -1.2193F, -0.3333F, -0.2185F));

		PartDefinition bone = forelegL2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.3235F, 2.3362F, -0.249F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.5849F, 3.477F, -4.2047F, -0.1882F, -0.0008F, 1.3148F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0554F, 3.3442F, -0.1694F, -1.1496F, -0.1198F, 0.0577F));

		PartDefinition bone8 = forelegL4.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-0.3235F, 2.3362F, -0.249F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 0.9227F, -3.3227F, -0.4538F, 0.0F, 0.0F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 0.9227F, -3.3227F, -0.4538F, 0.0F, 0.0F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(35, 39).addBox(-0.5F, -0.0596F, -5.7227F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3424F, -6.0009F, 0.0641F, -0.0435F, -0.0028F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.2568F, -4.3419F, -0.8019F, -0.0617F, 0.001F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5504F, -1.7091F, -7.7339F, 0.2804F, -0.0215F, 0.0505F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5304F, -1.7091F, -7.7339F, 0.2804F, 0.0215F, -0.0505F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0011F, 1.587F, -2.7976F, 0.5507F, -0.0057F, 0.0071F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(30, 28).addBox(-0.5F, 0.2406F, -0.4247F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(34, 32).addBox(-0.5F, 0.2406F, 4.2753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, -0.0307F, 0.1308F, -0.004F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(38, 57).addBox(-0.5F, 0.3F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0411F, 4.8463F, -0.0139F, 0.1309F, -0.0018F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, 0.3976F, -0.2236F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 58).addBox(-0.5F, 0.3976F, 2.4764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1069F, 2.8993F, 0.0084F, 0.1309F, 0.0011F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(24, 42).addBox(-0.5F, 0.0992F, 0.0255F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3225F, 3.0314F, -0.0413F, 0.1744F, -0.0072F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(55, 46).addBox(-0.5F, 0.1982F, -0.2576F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1177F, 3.9583F, -0.1479F, 0.1295F, -0.0192F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create().texOffs(57, 40).addBox(-0.5F, 0.1482F, -0.6076F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.028F, 2.9273F, 0.0293F, 0.3053F, 0.0088F));

		PartDefinition hindlegL = Hips.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7184F, 1.4802F, -3.0397F, 0.4573F, 0.4613F, -0.8021F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2898F, 4.4132F, 0.2538F, 0.8707F, -0.5225F, -0.1926F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7421F, 0.1848F, -0.3054F, 0.0F, 0.0F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7184F, 1.4802F, -3.0397F, 0.6876F, -0.0897F, 0.8707F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2898F, 4.4132F, 0.2538F, 0.8112F, 0.4384F, 0.2145F));

		PartDefinition bone7 = hindlegL4.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7421F, 0.1848F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4F, 0.1615F, -3.012F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone6 = Hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4F, 0.1615F, -3.012F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 88, 88);
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