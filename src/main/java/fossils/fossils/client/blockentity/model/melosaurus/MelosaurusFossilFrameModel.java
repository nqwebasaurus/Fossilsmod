package fossils.fossils.client.blockentity.model.melosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MelosaurusFossilFrameModel extends SkullModelBase {
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
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone7;
	private final ModelPart bone3;
	private final ModelPart bone6;

	public MelosaurusFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-1.0F, -7.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(59, 4).addBox(-0.5F, -0.0028F, -3.2109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -2.6682F, 15.6011F, -0.1691F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(56, 1).addBox(-1.6F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.5972F, -2.8109F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(59, 4).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.4972F, -2.8109F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(57, 25).addBox(-0.5F, 0.309F, -4.2999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 28).addBox(-0.5F, 0.309F, -0.5999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2885F, -3.3114F, 0.0443F, 0.0436F, 0.0019F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(57, 19).addBox(-0.5F, 0.3F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.009F, -4.0999F, 0.0797F, 0.221F, -0.0252F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(43, 51).addBox(-0.4F, 0.2126F, -5.0045F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(47, 55).addBox(-0.4F, 0.2126F, -0.3045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 0.1F, -4.2F, -0.006F, 0.1309F, -0.0008F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(17, 52).addBox(-0.5F, 0.1F, -4.975F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 0.1225F, -4.7048F, -0.0106F, 0.0432F, -0.0421F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(44, 4).addBox(-0.5F, 0.3F, -6.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(49, 9).addBox(-0.5F, 0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.975F, 0.0696F, 0.0496F, -0.084F));

		PartDefinition Bodyfront_r1 = chest.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(38, -2).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.0F, -4.3F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition Bodyfront_r2 = chest.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(47, 6).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.8F, -4.3F, -1.5708F, 0.0F, 0.0F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7503F, 3.6469F, -5.0538F, 0.894F, 0.2044F, -0.5429F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0543F, 5.2384F, -0.1672F, -0.341F, 0.0199F, -0.3472F));

		PartDefinition bone = forelegL2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.3235F, 3.2362F, -0.249F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7503F, 3.6469F, -5.0538F, 0.7778F, -0.0793F, 0.486F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0543F, 5.2384F, -0.1672F, -0.3399F, -0.0345F, 0.306F));

		PartDefinition bone8 = forelegL4.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-0.3235F, 3.2362F, -0.249F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.0898F, -5.0304F, -0.4538F, 0.0F, 0.0F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.0898F, -5.0304F, -0.4538F, 0.0F, 0.0F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(43, 58).addBox(-0.5F, -0.0596F, -3.9227F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(48, 67).addBox(-0.5F, -0.0596F, -5.6227F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3424F, -6.0009F, -0.2063F, -0.0028F, -0.0872F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -1.9076F, -3.8117F, -0.3924F, 0.1128F, -0.1468F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.625F, 0.5F, -14.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.605F, 0.5F, -14.0F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6854F, -0.0196F, 0.5498F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, 0.2406F, -0.2247F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(8, 31).addBox(-0.5F, 0.2406F, 8.4753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, 0.0114F, -0.3051F, -0.0894F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(40, 31).addBox(-0.5F, 0.3F, 0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0591F, 8.8013F, 0.058F, -0.2614F, -0.015F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(53, 40).addBox(-0.5F, 0.3976F, -0.2236F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 44).addBox(-0.5F, 0.3976F, 4.4764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.075F, 6.9004F, 0.0178F, -0.3054F, -0.0054F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, 0.0992F, -0.0745F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3416F, 5.0413F, 0.0934F, -0.2607F, -0.0241F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1982F, -0.3576F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0801F, 7.9632F, -0.0748F, 0.6531F, -0.0455F));

		PartDefinition hindlegL = Hips.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9384F, 3.8946F, -3.3948F, 1.2527F, 0.5928F, -0.2752F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1672F, 7.208F, 0.373F, 0.0378F, -0.0218F, 0.3487F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9384F, 3.8946F, -3.3948F, 1.3084F, -0.0058F, 0.0949F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1672F, 7.208F, 0.373F, 0.0436F, 0.0019F, 0.1309F));

		PartDefinition bone7 = hindlegL4.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.1318F, -2.0251F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone6 = Hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.1318F, -2.0251F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 102, 102);
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