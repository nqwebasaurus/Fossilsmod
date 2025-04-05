package fossils.fossils.client.blockentity.model.allosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AllosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Head;
	private final ModelPart bone;
	private final ModelPart leftFace2;
	private final ModelPart rightFace2;
	private final ModelPart Upperjaw;
	private final ModelPart leftFace;
	private final ModelPart Lowerjaw;
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

	public AllosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Root = this.fossil.getChild("Root");
		this.Hips = this.Root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neck1 = this.Bodyfront.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Head = this.Neck4.getChild("Head");
		this.bone = this.Head.getChild("bone");
		this.leftFace2 = this.Head.getChild("leftFace2");
		this.rightFace2 = this.Head.getChild("rightFace2");
		this.Upperjaw = this.Head.getChild("Upperjaw");
		this.leftFace = this.Upperjaw.getChild("leftFace");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -30.0F, 1.5F, 1.0F, 32.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.7F, -9.25F, -0.5F, 1.0F, 32.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-5.9F, -20.75F, -20.6F, 0.0F, 0.4538F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-3.55F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-5.9F, -20.75F, -20.6F, 0.4538F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-12.2F, -5.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -17.5F, 2.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Root = fossil.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, -29.0F, -1.0F));

		PartDefinition Hips = Root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.0051F, -2.4001F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3916F, -3.0257F, 0.1787F, 0.2148F, 0.0385F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(63, 63).addBox(-0.5F, 0.7F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.6185F, -5.8146F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(63, 55).addBox(-0.5F, 0.7F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.2F, -11.8F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, 0.112F, 0.2703F, -0.0548F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(35, 83).addBox(-0.5F, 0.6F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.0119F, -6.0418F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(54, 71).addBox(-0.5F, 0.6F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.1829F, -1.1448F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Neck1 = Bodyfront.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -10.0F, -0.3996F, 0.2079F, -0.0666F));

		PartDefinition Neckbase_r1 = Neck1.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(94, 82).addBox(-0.5F, -0.3F, 0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.4281F, -4.125F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Neck1.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(-1, 101).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.2097F, -1.1691F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.2366F, 0.2744F, 0.0175F));

		PartDefinition Neckmiddlebase_r1 = Neck2.addOrReplaceChild("Neckmiddlebase_r1", CubeListBuilder.create().texOffs(83, -1).addBox(-0.5F, 0.8F, 0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.1309F, 0.0173F, -0.0023F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.0648F, 0.0671F, 0.0473F));

		PartDefinition Neckmiddlefront_r1 = Neck3.addOrReplaceChild("Neckmiddlefront_r1", CubeListBuilder.create().texOffs(0, 85).addBox(-0.5F, 0.8344F, 0.2152F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.0737F, -4.336F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.1039F, 0.0025F, -0.13F));

		PartDefinition Neckfront_r1 = Neck4.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(86, 25).addBox(-0.5F, 0.3F, -0.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.9F, -3.4F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2739F, -3.7011F, 0.1039F, 0.0025F, -0.13F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.0F, 1.4198F, -1.8465F));

		PartDefinition leftFace2 = Head.addOrReplaceChild("leftFace2", CubeListBuilder.create(), PartPose.offset(-0.5F, 2.1697F, 1.3889F));

		PartDefinition rightFace2 = Head.addOrReplaceChild("rightFace2", CubeListBuilder.create(), PartPose.offset(0.5F, 2.1697F, 1.3889F));

		PartDefinition Upperjaw = Head.addOrReplaceChild("Upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -4.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftFace = Upperjaw.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.2F, 1.962F, -8.8692F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5763F, 1.2239F, 0.6562F, 0.0F, 0.0F));

		PartDefinition Leftarm1 = Bodyfront.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8053F, 9.2442F, -10.5553F, 0.6209F, 0.2264F, -0.1688F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.523F, 5.0862F, 0.83F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5433F, 4.0048F, 0.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Rightarm1 = Bodyfront.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8053F, 9.2442F, -10.5553F, 0.4491F, -0.3252F, 0.3184F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.523F, 5.0862F, 0.83F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5433F, 4.0048F, 0.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Leftleg1 = Hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, 1.9F, 2.5715F, -0.0436F, 0.0019F, 0.0436F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 13.705F, 0.0504F, 0.9599F, 0.0F, 0.0F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1F, 14.4629F, 1.2762F, -0.829F, 0.0F, 0.0F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 5.7764F, -0.5819F, 0.3051F, 0.0057F, -0.0435F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightleg1 = Hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, 1.9F, 2.5715F, -0.8206F, 0.3372F, -0.0373F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 13.705F, 0.0504F, 1.5708F, -0.0873F, 0.0F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 14.4629F, 1.2762F, -1.3963F, 0.0F, 0.0F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 5.7764F, -0.5819F, 1.3963F, 0.0F, 0.0F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.445F, 9.4541F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition Tailbase_r1 = Tail1.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(31, -2).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6644F, 10.8298F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition Tailmiddlebase_r1 = Tail2.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.2F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2952F, 12.961F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition Tailmiddle_r1 = Tail3.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.6F, -0.2F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(29, 17).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.9929F, 15.1069F, -0.0358F, -0.218F, 0.0077F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(27, 32).addBox(-0.5F, 0.6094F, -0.3436F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.5F, 12.7F, -0.1806F, -0.2577F, 0.0465F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, 0.419F, -0.3731F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.2094F, 11.8564F, -0.1772F, -0.1719F, 0.1719F));

		return LayerDefinition.create(meshdefinition, 123, 123);
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