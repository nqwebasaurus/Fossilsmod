package fossils.fossils.client.blockentity.model.platyhystrix;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlatyhystrixFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart forelegL2;
	private final ModelPart forelegL5;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone2;
	private final ModelPart bone12;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL5;
	private final ModelPart bone6;
	private final ModelPart bone9;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone3;
	private final ModelPart bone13;

	public PlatyhystrixFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.body2 = this.Bodyfront.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.forelegL2 = this.chest.getChild("forelegL2");
		this.forelegL5 = this.forelegL2.getChild("forelegL5");
		this.bone4 = this.forelegL5.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
		this.forelegL3 = this.chest.getChild("forelegL3");
		this.forelegL4 = this.forelegL3.getChild("forelegL4");
		this.bone10 = this.forelegL4.getChild("bone10");
		this.bone11 = this.bone10.getChild("bone11");
		this.bone2 = this.chest.getChild("bone2");
		this.bone12 = this.chest.getChild("bone12");
		this.Neck = this.chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.jaw = this.Head.getChild("jaw");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.hindlegL2 = this.Hips.getChild("hindlegL2");
		this.hindlegL5 = this.hindlegL2.getChild("hindlegL5");
		this.bone6 = this.hindlegL5.getChild("bone6");
		this.bone9 = this.bone6.getChild("bone9");
		this.hindlegL3 = this.Hips.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.bone7 = this.hindlegL4.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone3 = this.Hips.getChild("bone3");
		this.bone13 = this.Hips.getChild("bone13");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -5.0F, 10.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.6F, -7.5F, -6.6F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(4.8F, -5.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.6F, -7.5F, -6.6F, 0.3927F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(4.2F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.5F, 10.6F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-1.0F, -7.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(38, 57).addBox(-0.5F, -0.0028F, -3.6109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 2.0832F, 13.4065F, -0.204F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(54, 27).addBox(-0.5F, 0.309F, -4.6999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 30).addBox(-0.5F, 0.309F, -0.9999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2885F, -3.3114F, -0.0081F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, 0.3F, -4.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.009F, -4.0999F, -0.0087F, 0.0873F, 0.0008F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(41, 27).addBox(-0.4F, 0.2126F, -5.0045F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 0.1018F, -3.9F, 0.0992F, 0.0867F, 0.0101F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, 0.1F, -5.375F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(46, 4).addBox(-0.5F, 0.1F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 0.1225F, -5.0048F, 0.0442F, 0.1307F, 0.008F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(55, 18).addBox(-0.5F, 0.3F, -4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.975F, 0.1313F, 0.0867F, 0.0099F));

		PartDefinition forelegL2 = chest.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1131F, 6.4544F, -0.3203F, 1.5424F, 0.3208F, -1.3156F));

		PartDefinition forelegL5 = forelegL2.addOrReplaceChild("forelegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6472F, 5.7766F, -2.5301F, -2.4547F, -0.1446F, -0.1234F));

		PartDefinition bone4 = forelegL5.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.042F, 4.3875F, -1.3198F, -0.4266F, -0.2103F, -0.4562F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, 2.9F, 0.075F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1131F, 6.4544F, -0.3203F, 1.1209F, -0.3171F, 1.4074F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6472F, 5.7766F, -2.5301F, -1.9252F, 0.5791F, 0.3689F));

		PartDefinition bone10 = forelegL4.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1398F, 4.5864F, -1.234F, -0.5755F, 0.626F, 0.0898F));

		PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(0.0F, 2.9F, 0.075F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5871F, 3.0945F, -1.2202F, -0.3203F, -0.0414F, -0.1242F));

		PartDefinition bone12 = chest.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5871F, 3.0945F, -1.2202F, -0.3203F, 0.0414F, 0.1242F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.0596F, -5.8227F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3591F, -3.9996F, 0.1087F, 0.13F, 0.0153F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.4198F, -6.3283F, 0.2256F, 0.139F, -0.1556F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(5.0881F, 1.851F, -1.3852F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-5.0681F, 1.851F, -1.3852F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2235F, 1.4704F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(28, 43).addBox(-0.5F, 0.2406F, -0.5247F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 47).addBox(-0.5F, 0.2406F, 4.1753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, -0.1895F, -0.2614F, 0.0152F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(63, 52).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0411F, 4.8463F, -0.1137F, -0.3039F, -0.0314F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(27, 57).addBox(-0.5F, 0.2976F, -0.3236F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1069F, 2.8993F, -0.032F, -0.3486F, -0.0189F));

		PartDefinition hindlegL2 = Hips.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6894F, 2.7466F, -1.4043F, -1.3459F, -0.3357F, -1.5362F));

		PartDefinition hindlegL5 = hindlegL2.addOrReplaceChild("hindlegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8677F, 7.1136F, -0.122F, 0.399F, -0.1583F, 2.9064F));

		PartDefinition bone6 = hindlegL5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.153F, 5.3736F, 0.4297F, 0.0508F, -0.1803F, -1.9903F));

		PartDefinition bone9 = bone6.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9F, 0.075F, 0.0F, 0.0F, -0.3054F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6894F, 2.7466F, -1.4043F, -0.893F, 0.1084F, 1.5867F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8677F, 7.1136F, -0.122F, 1.0767F, 0.0718F, -2.7034F));

		PartDefinition bone7 = hindlegL4.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.153F, 5.3736F, 0.4297F, -0.1848F, -0.0305F, -0.0186F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9F, 0.075F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4142F, 0.6287F, -2.9893F, -0.0852F, 0.0189F, 0.2174F));

		PartDefinition bone13 = Hips.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4142F, 0.6287F, -2.9893F, -0.0852F, -0.0189F, -0.2174F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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