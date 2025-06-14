package fossils.fossils.client.blockentity.model.ceratosaurusdentisulcatus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CeratosaurusdentisulcatusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart Lowerjaw;
	private final ModelPart Throat;
	private final ModelPart Masseter;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart Leftleg1;
	private final ModelPart Leftleg2;
	private final ModelPart Leftleg3;
	private final ModelPart Leftleg4;
	private final ModelPart Leftleg5;
	private final ModelPart Rightleg1;
	private final ModelPart Rightleg2;
	private final ModelPart Rightleg3;
	private final ModelPart Rightleg4;
	private final ModelPart Rightleg5;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;

	public CeratosaurusdentisulcatusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neck1 = this.Bodyfront.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.Throat = this.Lowerjaw.getChild("Throat");
		this.Masseter = this.Lowerjaw.getChild("Masseter");
		this.Leftarm1 = this.Bodyfront.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Rightarm1 = this.Bodyfront.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.Leftleg1 = this.Hips.getChild("Leftleg1");
		this.Leftleg2 = this.Leftleg1.getChild("Leftleg2");
		this.Leftleg3 = this.Leftleg2.getChild("Leftleg3");
		this.Leftleg4 = this.Leftleg3.getChild("Leftleg4");
		this.Leftleg5 = this.Leftleg4.getChild("Leftleg5");
		this.Rightleg1 = this.Hips.getChild("Rightleg1");
		this.Rightleg2 = this.Rightleg1.getChild("Rightleg2");
		this.Rightleg3 = this.Rightleg2.getChild("Rightleg3");
		this.Rightleg4 = this.Rightleg3.getChild("Rightleg4");
		this.Rightleg5 = this.Rightleg4.getChild("Rightleg5");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -9.75F, -0.5F, 1.0F, 29.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -19.25F, -22.1F, 0.0F, 0.1396F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.75F, -5.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -19.25F, -22.1F, -0.1396F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(4.0F, -5.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -0.8F, 0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -5.5F, -0.5F, 1.0F, 28.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -0.8F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offset(0.0F, -28.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(24, 16).addBox(-1.0F, 1.5958F, -0.0795F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.3094F, -6.2303F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1971F, -5.7691F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.2832F, -0.0577F, 2.0F, 2.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.6689F, -14.3526F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -14.5F, 0.0873F, 0.0435F, 0.0038F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(17, 32).addBox(0.0F, 1.0476F, -0.4887F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, -0.0211F, -7.2217F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck1 = Bodyfront.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5762F, -7.4827F, 0.0F, 0.1309F, 0.0F));

		PartDefinition Neckbase_r1 = Neck1.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(58, 29).addBox(-1.0F, 0.774F, -5.3829F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.394F, 0.5086F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3418F, -4.2879F, -0.2112F, 0.128F, -0.0274F));

		PartDefinition Neckmiddle_r1 = Neck2.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, 0.8193F, -5.0761F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.614F, -0.2002F, -0.4189F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2143F, -5.1828F, 0.0447F, 0.218F, 0.0097F));

		PartDefinition Neckfront_r1 = Neck3.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(88, 60).addBox(-1.0F, 0.8248F, -3.944F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7681F, 1.0185F, 0.096F, 0.0F, 0.0F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1144F, -2.6815F, 0.2178F, -0.0167F, 0.0403F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.1923F, 1.6793F, 0.0157F, 0.0F, 0.0F));

		PartDefinition Throat = Lowerjaw.addOrReplaceChild("Throat", CubeListBuilder.create(), PartPose.offset(0.0F, 5.5337F, -5.3733F));

		PartDefinition Masseter = Lowerjaw.addOrReplaceChild("Masseter", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5947F, -5.673F));

		PartDefinition Leftarm1 = Bodyfront.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1F, 10.3789F, -3.0217F, -0.8582F, 0.3202F, -0.2208F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, -1.1F, 6.5F, -1.4856F, -0.0189F, 0.2174F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.3226F, 3.963F, 0.0F, -0.5672F, 0.0F));

		PartDefinition Rightarm1 = Bodyfront.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1F, 10.3789F, -3.0217F, -0.3824F, -0.3636F, 0.2306F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, -1.1F, 6.5F, -1.4856F, 0.0189F, -0.2174F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.3226F, 3.963F, 0.0F, 0.6981F, 0.0F));

		PartDefinition Leftleg1 = Hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2F, 0.1029F, -0.1691F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 13.8735F, 0.6084F, 1.4399F, 0.0F, 0.0F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 10.7055F, 2.7323F, -0.8727F, 0.0F, 0.0F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 7.5F, -0.7F, 0.48F, 0.0F, 0.0F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0291F, -3.2238F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Rightleg1 = Hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2F, 0.1029F, -0.1691F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 13.8735F, 0.6084F, 1.2217F, 0.0F, 0.0F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 10.7055F, 2.7323F, -0.829F, 0.0F, 0.0F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 7.5F, -0.7F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0291F, -3.2238F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.2029F, 6.4309F, -0.2629F, 0.0832F, -0.0263F));

		PartDefinition Tailbase_r1 = Tail1.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(25, 47).addBox(-0.5F, 0.6F, -0.2F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5941F, -0.3442F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8357F, 8.3265F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition Tailmiddlebase_r1 = Tail2.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, 0.7248F, -0.1689F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4331F, -0.3381F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0228F, 8.8316F, 0.1772F, 0.1719F, 0.0306F));

		PartDefinition Tailmiddle_r1 = Tail3.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, 0.6983F, -11.8085F, 2.0F, 2.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.2181F, 10.581F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(31, 32).addBox(-0.5F, 0.0F, -0.3F, 2.0F, 2.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4327F, 10.2919F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, 0.5128F, -0.9958F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.3F, 11.5F, 0.0176F, 0.1309F, 0.0023F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(42, 15).addBox(0.0F, 0.4267F, 0.0921F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0145F, 12.6781F, -0.3213F, 0.2073F, -0.0684F));

		return LayerDefinition.create(meshdefinition, 112, 115);
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