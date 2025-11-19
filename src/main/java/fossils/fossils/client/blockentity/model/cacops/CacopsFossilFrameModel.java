package fossils.fossils.client.blockentity.model.cacops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CacopsFossilFrameModel extends SkullModelBase {
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

	public CacopsFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -11.7F, 10.3F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.9F, -4.5F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.5F, -11.5F, -7.8F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.2F, -6.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5F, -9.5F, -7.8F, -0.3047F, -0.021F, -1.6374F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-6.4F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -14.5F, 10.8F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-1.0F, -7.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(52, 48).addBox(-0.5F, -0.0028F, -3.3109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -3.9168F, 13.4065F, -0.3349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(11, 55).addBox(-0.5F, 0.309F, -4.3999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(14, 58).addBox(-0.5F, 0.309F, -0.6999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2885F, -3.3114F, -0.0081F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(39, 53).addBox(-0.5F, 0.3F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.009F, -4.0999F, 0.0087F, 0.0436F, 0.0004F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(41, 36).addBox(-0.4F, 0.2126F, -5.5045F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 40).addBox(-0.4F, 0.2126F, -0.8045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 0.1018F, -3.9F, 0.1166F, 0.0867F, 0.0101F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(41, 29).addBox(-0.5F, 0.1F, -5.175F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 0.1225F, -5.0048F, 0.0611F, 0.0436F, 0.0027F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(50, 54).addBox(-0.5F, 0.3F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.975F, 0.1139F, 0.0867F, 0.0099F));

		PartDefinition forelegL2 = chest.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1131F, 6.4544F, -0.3203F, -0.376F, -0.1284F, -1.3038F));

		PartDefinition forelegL5 = forelegL2.addOrReplaceChild("forelegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6472F, 5.7766F, -2.5301F, -1.0094F, 0.3305F, -0.5337F));

		PartDefinition bone4 = forelegL5.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4518F, 4.6239F, -1.4815F, -0.3679F, -0.1166F, -0.6865F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9F, 0.075F, 0.0F, 0.0F, -0.2182F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1131F, 6.4544F, -0.3203F, 0.3143F, -0.1473F, 0.945F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6472F, 5.7766F, -2.5301F, -1.5175F, -1.1353F, 1.0616F));

		PartDefinition bone10 = forelegL4.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4518F, 4.6239F, -1.4815F, -0.0581F, 0.4927F, 1.3945F));

		PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(0.0F, 2.9F, 0.075F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5871F, 3.0945F, -1.2202F, -0.3203F, -0.0414F, -0.1242F));

		PartDefinition bone12 = chest.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5871F, 3.0945F, -1.2202F, -0.3203F, 0.0414F, 0.1242F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(19, 23).addBox(-0.5F, -0.0596F, -5.6227F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3591F, -3.9996F, -0.058F, 0.0433F, 0.0051F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 1.6037F, -2.4286F, -0.03F, 0.0848F, -0.0898F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(5.0881F, -0.149F, -3.4852F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-5.0681F, -0.149F, -3.4852F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2235F, -1.5296F, 0.3578F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(13, 40).addBox(-0.5F, 0.2406F, -0.3247F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 44).addBox(-0.5F, 0.2406F, 4.3753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, -0.0575F, -0.1743F, 0.01F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(62, 63).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0411F, 4.8463F, 0.1005F, -0.1302F, -0.0131F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(54, 26).addBox(-0.5F, 0.3976F, -0.3236F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1069F, 2.8993F, 0.0527F, -0.1743F, -0.0092F));

		PartDefinition hindlegL2 = Hips.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6894F, 2.7467F, -1.4043F, -0.3333F, 0.3516F, -1.2744F));

		PartDefinition hindlegL5 = hindlegL2.addOrReplaceChild("hindlegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8677F, 7.1136F, -0.122F, 0.1378F, 1.0288F, 1.2525F));

		PartDefinition bone6 = hindlegL5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.153F, 5.3736F, 0.4297F, -0.0449F, -0.1378F, -1.4599F));

		PartDefinition bone9 = bone6.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.0F, 2.9F, 0.075F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6894F, 2.7467F, -1.4043F, 0.2991F, -0.2394F, 1.3263F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8677F, 7.1136F, -0.122F, 0.1378F, -1.0288F, -1.2525F));

		PartDefinition bone7 = hindlegL4.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.153F, 5.3736F, 0.4297F, -0.0391F, 0.1832F, 1.5022F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(0.0F, 2.9F, 0.075F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4142F, 0.6287F, -2.9893F, -0.0852F, 0.0189F, 0.2174F));

		PartDefinition bone13 = Hips.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4142F, 0.6287F, -2.9893F, -0.0852F, -0.0189F, -0.2174F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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