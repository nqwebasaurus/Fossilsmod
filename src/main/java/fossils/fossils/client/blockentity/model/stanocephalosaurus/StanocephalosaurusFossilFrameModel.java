package fossils.fossils.client.blockentity.model.stanocephalosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StanocephalosaurusFossilFrameModel extends SkullModelBase {
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
	private final ModelPart bone5;
	private final ModelPart bone2;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart leftBrow;
	private final ModelPart rightBrow;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone6;
	private final ModelPart bone3;
	private final ModelPart bone7;

	public StanocephalosaurusFossilFrameModel(ModelPart root) {
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
		this.bone5 = this.forelegL4.getChild("bone5");
		this.bone2 = this.chest.getChild("bone2");
		this.Neck = this.chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.leftBrow = this.Head.getChild("leftBrow");
		this.rightBrow = this.Head.getChild("rightBrow");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.jaw = this.Head.getChild("jaw");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.tail = this.Tailend.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.hindlegL = this.Hips.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.bone4 = this.hindlegL2.getChild("bone4");
		this.hindlegL3 = this.Hips.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.bone6 = this.hindlegL4.getChild("bone6");
		this.bone3 = this.Hips.getChild("bone3");
		this.bone7 = this.Hips.getChild("bone7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(6.7F, -6.0F, -12.6F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(2.4F, -6.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.7F, -6.0F, -12.6F, -0.8727F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(1.0F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-11.5F, -6.9F, 16.4F, -0.1309F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.8F, -3.7F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-11.5F, -6.9F, 16.4F, 0.0F, -0.1309F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -9.225F, -8.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(11, 68).addBox(-0.5F, -0.0028F, -3.4109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-12.0F, -1.0701F, 28.6504F, -0.1255F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(32, 36).addBox(-0.5F, -0.1871F, -6.4624F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 41).addBox(-0.5F, -0.1871F, -0.7624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2076F, -3.2488F, 0.0804F, -0.174F, -0.014F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(17, 36).addBox(-0.5F, -0.1961F, -5.9626F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.016F, -6.1097F, 0.009F, -0.2618F, -0.0023F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4F, -0.2834F, -6.1671F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(4, 43).addBox(-0.4F, -0.2834F, -0.4671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 0.088F, -6.2F, 0.0115F, -0.0873F, -0.001F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(21, 18).addBox(-0.5F, -0.3961F, -8.0376F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 0.1076F, -5.7085F, 0.0528F, -0.1307F, -0.0069F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.1961F, -9.3626F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 25).addBox(-0.5F, -0.1961F, -0.6626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1852F, -7.9788F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7379F, 6.8026F, -9.9299F, 0.7118F, -0.0197F, -1.3552F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3612F, 5.9904F, -1.2376F, -1.8442F, 0.4055F, -0.3225F));

		PartDefinition bone = forelegL2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2274F, 2.8678F, 1.1763F, 0.0091F, -0.0466F, -0.6116F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.738F, 6.8026F, -9.9299F, -0.692F, -0.0734F, 1.3499F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3612F, 5.9904F, -1.2376F, -1.2046F, -0.3448F, 0.0341F));

		PartDefinition bone5 = forelegL4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2274F, 2.8678F, 1.1763F, 0.025F, -0.0357F, 0.3923F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 2.1697F, -10.2017F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -0.5557F, -4.9853F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 16).addBox(-0.5F, -0.5557F, -8.6853F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3466F, -9.0026F, 0.0064F, -0.1258F, 0.044F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.5086F, -8.5985F, -0.1289F, -0.0425F, -0.0578F));

		PartDefinition leftBrow = Head.addOrReplaceChild("leftBrow", CubeListBuilder.create(), PartPose.offset(1.9F, -1.3432F, -3.0961F));

		PartDefinition rightBrow = Head.addOrReplaceChild("rightBrow", CubeListBuilder.create(), PartPose.offset(-1.88F, -1.3432F, -3.0961F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(3.01F, -0.5145F, -6.3197F, 0.0F, 0.1745F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.99F, -0.5145F, -6.3197F, 0.0F, -0.1745F, 0.0F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9606F, 0.1244F, 0.3316F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, 0.2406F, -0.3247F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, -0.1018F, 0.1736F, -0.0176F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(52, 51).addBox(-0.5F, 0.4F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(56, 55).addBox(-0.5F, 0.4F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1347F, 4.7908F, -0.2413F, 0.1306F, -0.0087F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(39, 51).addBox(-0.5F, 0.3976F, 0.1764F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.041F, 4.9007F, -0.0701F, 0.1309F, 0.0022F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -0.0008F, -0.2745F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(3, 70).addBox(-0.5F, -0.0008F, 3.4255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3416F, 5.0413F, 0.0822F, 0.1305F, 0.0107F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(48, 66).addBox(-0.5F, 0.0982F, 0.0924F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1177F, 3.9584F, 0.0368F, 0.0872F, 0.0032F));

		PartDefinition tail = Tailend.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(68, 23).addBox(-0.5F, 0.0424F, -0.4056F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(71, 26).addBox(-0.5F, 0.0424F, 3.2944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0558F, 3.998F, 0.1772F, 0.1719F, 0.0306F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(35, 69).addBox(-0.5F, 0.0424F, -0.1556F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0088F, 3.9157F, 0.0903F, 0.2608F, 0.0233F));

		PartDefinition hindlegL = Hips.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7513F, 5.2129F, -3.4656F, 0.2354F, 0.5446F, -0.7798F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3038F, 5.1502F, 1.5609F, -0.1153F, 0.6777F, 1.3948F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3794F, 3.2087F, 0.0913F, 0.0314F, 0.0591F, -2.2431F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7513F, 5.2129F, -3.4656F, -0.7597F, 0.0693F, 1.1254F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3038F, 5.1502F, 1.5609F, 0.7821F, -0.8667F, -1.9335F));

		PartDefinition bone6 = hindlegL4.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3794F, 3.2087F, 0.0913F, -0.0341F, 0.0506F, 1.4994F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.1318F, -2.0251F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone7 = Hips.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.1318F, -2.0251F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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