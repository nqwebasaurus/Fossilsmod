package fossils.fossils.client.blockentity.model.proterogyrinus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProterogyrinusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart bone;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart bone11;
	private final ModelPart bone2;
	private final ModelPart bone7;
	private final ModelPart Neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Lowerjawback;
	private final ModelPart bone3;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart bone6;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone5;
	private final ModelPart bone8;

	public ProterogyrinusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.body = this.Hips.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.body2 = this.Bodyfront.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.forelegL = this.chest.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.bone = this.forelegL2.getChild("bone");
		this.forelegL3 = this.chest.getChild("forelegL3");
		this.forelegL4 = this.forelegL3.getChild("forelegL4");
		this.bone11 = this.forelegL4.getChild("bone11");
		this.bone2 = this.chest.getChild("bone2");
		this.bone7 = this.chest.getChild("bone7");
		this.Neck = this.chest.getChild("Neck");
		this.neck2 = this.Neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.Head = this.neck3.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.bone3 = this.Lowerjawback.getChild("bone3");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.tail = this.Tailend.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.hindlegL = this.Hips.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.bone4 = this.hindlegL2.getChild("bone4");
		this.bone6 = this.bone4.getChild("bone6");
		this.hindlegL3 = this.Hips.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.bone9 = this.hindlegL4.getChild("bone9");
		this.bone10 = this.bone9.getChild("bone10");
		this.bone5 = this.Hips.getChild("bone5");
		this.bone8 = this.Hips.getChild("bone8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -11.0F, 16.6F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(0.3F, -13.0F, -13.2F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -8.5F, -12.7F, 0.0F, 0.0F, -1.6406F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-3.9F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -10.0F, 17.1F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-1.0F, -9.225F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(47, 22).addBox(-0.5F, -0.0028F, -3.4109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.7013F, 19.5282F, -0.2389F, 0.0F, 0.0F));

		PartDefinition body = Hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, 0.3F, -6.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(26, 5).addBox(-0.5F, 0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3568F, -3.4213F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(34, 8).addBox(-0.4F, 0.2126F, -5.9045F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 0.088F, -6.2F, 0.1511F, 0.0F, 0.0F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, 0.125F, -7.875F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 0.1076F, -5.7085F, 0.0979F, -0.0392F, -0.0476F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3F, -9.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(8, 8).addBox(-0.5F, 0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1852F, -7.9788F, -0.0785F, 0.0F, 0.0F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7566F, 4.1856F, -8.4027F, -0.2065F, -0.292F, -0.7996F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3612F, 5.9904F, -1.2376F, -2.7969F, 1.0666F, -1.5207F));

		PartDefinition bone = forelegL2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.554F, 3.8934F, 0.9285F, -0.0117F, 0.2603F, -1.2681F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7566F, 4.1856F, -8.4027F, 0.4044F, 0.292F, 0.7996F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3612F, 5.9904F, -1.2376F, -2.5442F, -1.0855F, 1.5154F));

		PartDefinition bone11 = forelegL4.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.554F, 3.8934F, 0.9285F, -0.0117F, -0.2603F, 1.2681F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3428F, 2.2678F, -8.3202F, -0.48F, 0.0F, 0.0F));

		PartDefinition bone7 = chest.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3428F, 2.2678F, -8.3202F, -0.48F, 0.0F, 0.0F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(61, 59).addBox(-0.5F, -0.0596F, -2.7227F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3466F, -9.0026F, -0.1541F, 0.0F, 0.0F));

		PartDefinition neck2 = Neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(52, 59).addBox(-0.5F, 0.1F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 60).addBox(-0.5F, 0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.157F, -2.8728F, -0.1138F, 0.1688F, -0.0624F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(48, -1).addBox(-0.5F, 0.1F, -4.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0033F, -2.9288F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Head = neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7676F, -4.4749F, -0.1916F, -0.0167F, -0.0857F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.0015F, 0.305F, -1.4115F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.0015F, 0.305F, -1.4115F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6675F, 2.8557F, 0.0611F, 0.0F, 0.0F));

		PartDefinition bone3 = Lowerjawback.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.5375F, 6.8339F, -8.8218F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, -0.0479F, 0.0F, 0.0F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(40, 4).addBox(-0.5F, -0.5F, 4.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 0).addBox(-0.5F, -0.5F, -0.15F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7406F, -0.2747F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(34, 22).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1347F, 4.7908F, 0.0997F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(22, 39).addBox(-0.5F, 0.3476F, -0.1236F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.041F, 4.9007F, -0.0441F, 0.1745F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3416F, 5.0413F, -0.04F, 0.1743F, 0.0082F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(8, 46).addBox(-0.5F, -0.6F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.05F, 0.5992F, 1.5255F, 0.0F, -0.0131F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(44, 46).addBox(-0.5F, 0.1982F, 0.0924F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1177F, 3.9584F, 0.037F, 0.1308F, 0.0048F));

		PartDefinition tail = Tailend.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(33, 46).addBox(-0.5F, 0.1424F, -0.3556F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 49).addBox(-0.5F, 0.1424F, 3.3444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0558F, 3.998F, 0.1145F, 0.1741F, 0.0123F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(46, 39).addBox(-0.5F, 0.1424F, -0.0556F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(49, 42).addBox(-0.5F, 0.1424F, 3.4444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 0.0088F, 3.9157F, 0.0457F, 0.3051F, 0.0138F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(49, 6).addBox(-0.5F, 0.1424F, -0.0806F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0004F, 4.0027F, 0.0F, 0.3927F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0852F, 0.3051F, -0.0138F));

		PartDefinition Tailend_r1 = tail4.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(52, 15).addBox(-0.5F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(49, 12).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6424F, 1.4444F, 0.0F, -0.0175F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(20, 52).addBox(-0.5F, 0.1424F, -0.1556F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0025F, 3.9539F, -0.0888F, 0.2615F, -0.0117F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0003F, 4.0038F, -0.1761F, 0.2615F, -0.0117F));

		PartDefinition Tailend_r2 = tail6.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(31, 52).addBox(-0.4337F, -0.5F, -0.1012F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(33, 54).addBox(-0.4337F, -0.5F, 3.5988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6424F, -0.3556F, 0.0F, -0.0175F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(42, 52).addBox(-0.5F, 0.1424F, 0.0444F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0004F, 4.0038F, -0.176F, 0.1289F, -0.0229F));

		PartDefinition hindlegL = Hips.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1645F, 4.2536F, -1.3236F, -0.3601F, -0.1141F, -1.2006F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2583F, 6.157F, 1.4833F, 0.7423F, 0.9531F, 1.7729F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5417F, 4.0962F, 0.2501F, -0.1278F, -0.0918F, -1.1851F));

		PartDefinition bone6 = bone4.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0624F, 3.6301F, 0.0098F, 0.0F, 0.0F, -0.2094F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1645F, 4.2536F, -1.3236F, -0.3601F, 0.1141F, 1.2006F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2583F, 6.157F, 1.4833F, 0.4468F, -0.4368F, -1.3307F));

		PartDefinition bone9 = hindlegL4.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5417F, 4.0962F, 0.2501F, -0.1274F, 0.0485F, 1.1906F));

		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0624F, 3.6301F, 0.0098F, 0.0F, 0.0F, 0.2094F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -2.171F, -1.9828F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone8 = Hips.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -2.171F, -1.9828F, -0.2182F, 0.0F, 0.0F));

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