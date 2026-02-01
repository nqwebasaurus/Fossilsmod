package fossils.fossils.client.blockentity.model.torvosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TorvosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
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
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Lowerjaw;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Tail9;

	public TorvosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
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
		this.bone3 = this.Hips.getChild("bone3");
		this.bone5 = this.Hips.getChild("bone5");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.Leftarm1 = this.Bodyfront.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Rightarm1 = this.Bodyfront.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.bone2 = this.Bodyfront.getChild("bone2");
		this.bone4 = this.Bodyfront.getChild("bone4");
		this.Neck1 = this.Bodyfront.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Head = this.Neck6.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Tail9 = this.Tail8.getChild("Tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -33.0F, 2.3F, 1.0F, 38.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.1F, -4.0F, -0.5F, 1.0F, 39.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-4.8F, -30.0F, -27.1F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(4.8F, -6.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.8F, -30.0F, -27.1F, 0.3491F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-6.5F, -4.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -27.0F, 2.8F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.101F, 3.0407F, -0.0384F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, 1.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2991F, -8.1287F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftleg1 = Hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create(), PartPose.offset(3.9F, 0.4139F, 0.0874F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 15.9729F, 1.5977F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1F, 15.1494F, 0.815F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 6.7034F, -0.5313F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.48F, 0.0F, 0.0F));

		PartDefinition Rightleg1 = Hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, 0.4139F, 0.0874F, -1.074F, 0.2068F, 0.1617F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 15.9729F, 1.5977F, 1.3475F, 0.2129F, -0.0479F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 15.1494F, 0.815F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 6.7034F, -0.5313F, 1.0353F, 0.0F, 0.0F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.0484F, 1.3314F, -0.035F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-2.0484F, 1.3314F, -0.035F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(1, 49).addBox(-0.5F, -0.2975F, -9.8916F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0009F, -7.1287F, -0.014F, 0.0873F, -0.0012F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(18, 84).addBox(-0.5F, 0.4F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6975F, -9.6916F, 0.0788F, 0.087F, 0.0069F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -7.15F, 0.0868F, 0.1268F, 0.0546F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(8, 70).addBox(-0.5F, -0.6208F, 4.064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 62).addBox(-0.5F, -0.6208F, 4.864F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3274F, -12.7292F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftarm1 = Bodyfront.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3652F, 9.1F, -8.062F, 0.5041F, 0.1644F, -0.0512F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.023F, 6.1696F, 0.9034F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5433F, 4.0048F, 0.5F, 0.1309F, 0.0F, 0.2182F));

		PartDefinition Rightarm1 = Bodyfront.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3652F, 9.1F, -8.062F, 0.5041F, -0.1644F, 0.0512F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.023F, 6.1696F, 0.9034F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5433F, 4.0048F, 0.5F, 0.1309F, 0.0F, -0.2182F));

		PartDefinition bone2 = Bodyfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0315F, 4.6145F, -8.9167F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0315F, 4.6145F, -8.9167F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neck1 = Bodyfront.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2124F, -7.9894F, -0.1704F, 0.129F, -0.0221F));

		PartDefinition Neckbase_r1 = Neck1.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(48, 91).addBox(-0.6797F, -0.6737F, -0.0248F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.9898F, -5.4143F, 0.1311F, 0.0519F, 0.0068F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6859F, -4.1563F, -0.1886F, 0.0758F, 0.1632F));

		PartDefinition Neckmiddlebase_r1 = Neck2.addOrReplaceChild("Neckmiddlebase_r1", CubeListBuilder.create().texOffs(101, 23).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9195F, -2.8303F, 0.0874F, 0.0522F, 0.0046F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3583F, -4.3379F, -0.0269F, 0.0277F, 0.1723F));

		PartDefinition Neckmiddlefront_r1 = Neck3.addOrReplaceChild("Neckmiddlefront_r1", CubeListBuilder.create().texOffs(115, 91).addBox(-0.575F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5486F, -1.8081F, -0.044F, 0.1221F, -0.0054F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5745F, -2.4352F, 0.0085F, 0.4335F, -0.0516F));

		PartDefinition Neckfront_r1 = Neck4.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(91, 82).addBox(-0.5F, -0.4F, -0.55F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2155F, -4.0711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -4.9F, 0.1736F, 0.1615F, 0.0664F));

		PartDefinition Neckfront_r2 = Neck5.addOrReplaceChild("Neckfront_r2", CubeListBuilder.create().texOffs(103, 7).addBox(-0.5F, -0.4F, -0.85F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2155F, -2.8711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -3.7F, 0.3238F, 0.2072F, 0.0689F));

		PartDefinition Neckfront_r3 = Neck6.addOrReplaceChild("Neckfront_r3", CubeListBuilder.create().texOffs(115, 101).addBox(-0.5F, -0.4F, -1.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2155F, -2.7711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Head = Neck6.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2549F, -3.5694F, 0.0451F, -0.1289F, -0.0229F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.2F, 1.962F, -12.8692F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.2F, 1.962F, -12.8692F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.539F, 0.1309F, 0.7348F, 0.0F, 0.0F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -0.4074F, -0.0052F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7991F, 6.8213F, -0.1233F, -0.0866F, 0.0107F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.1028F, -0.3F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3075F, 11.9948F, 0.1498F, -0.1232F, -0.0623F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(31, 17).addBox(-0.5F, -0.4296F, -0.5797F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2933F, 13.1973F, 0.0827F, -0.1706F, -0.0572F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.0054F, -0.3732F, 1.0F, 2.0F, 13.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.4326F, 12.6838F, 0.0101F, 0.1314F, -0.0419F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0059F, 12.947F, -0.1391F, 0.2594F, -0.0359F));

		PartDefinition Tailendbase_r1 = Tail5.addOrReplaceChild("Tailendbase_r1", CubeListBuilder.create().texOffs(65, 54).addBox(-0.5F, -0.5F, 4.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(56, 45).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2985F, 4.257F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, 0.1577F, -0.4842F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4089F, 10.1684F, -0.0971F, 0.1737F, -0.0168F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(62, 12).addBox(-0.5F, 0.1335F, -0.2849F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.025F, 9.55F, -0.1783F, 0.2148F, -0.0384F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(38, 77).addBox(-0.5F, 0.1335F, -0.3849F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 84).addBox(-0.5F, 0.1335F, 7.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.8F, -0.1325F, 0.173F, -0.023F));

		PartDefinition Tail9 = Tail8.addOrReplaceChild("Tail9", CubeListBuilder.create().texOffs(62, 24).addBox(-0.5F, 0.1335F, 0.0151F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0182F, 7.9017F, -0.1551F, 0.302F, -0.0465F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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