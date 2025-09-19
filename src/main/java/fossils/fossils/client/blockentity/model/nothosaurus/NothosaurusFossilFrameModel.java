package fossils.fossils.client.blockentity.model.nothosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NothosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart chest;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart armL5;
	private final ModelPart armL6;
	private final ModelPart Neckbase;
	private final ModelPart Neckmiddlebase;
	private final ModelPart Neckmiddlefront;
	private final ModelPart Neckfront;
	private final ModelPart Head;
	private final ModelPart Lowerjawback;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Bellyflab;
	private final ModelPart FrontFlipperR3;
	private final ModelPart leftArm2;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperR2;
	private final ModelPart rightArm2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart bone2;
	private final ModelPart bone4;

	public NothosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.chest = this.Bodyfront.getChild("chest");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.armL = this.chest.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.armL3 = this.armL2.getChild("armL3");
		this.armL4 = this.chest.getChild("armL4");
		this.armL5 = this.armL4.getChild("armL5");
		this.armL6 = this.armL5.getChild("armL6");
		this.Neckbase = this.chest.getChild("Neckbase");
		this.Neckmiddlebase = this.Neckbase.getChild("Neckmiddlebase");
		this.Neckmiddlefront = this.Neckmiddlebase.getChild("Neckmiddlefront");
		this.Neckfront = this.Neckmiddlefront.getChild("Neckfront");
		this.Head = this.Neckfront.getChild("Head");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Bellyflab = this.Hips.getChild("Bellyflab");
		this.FrontFlipperR3 = this.Hips.getChild("FrontFlipperR3");
		this.leftArm2 = this.FrontFlipperR3.getChild("leftArm2");
		this.FrontFlipperMiddleR3 = this.leftArm2.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperR2 = this.Hips.getChild("FrontFlipperR2");
		this.rightArm2 = this.FrontFlipperR2.getChild("rightArm2");
		this.FrontFlipperMiddleR2 = this.rightArm2.getChild("FrontFlipperMiddleR2");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone4 = this.Hips.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.6F, 1.0F, -0.1736F, 0.0804F, 0.4293F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(2, 17).addBox(-0.1F, -0.5F, -4.9F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.5968F, 16.4878F, -1.5708F, 0.0524F, -1.5708F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(8, 23).addBox(-0.5F, -9.0009F, 0.4235F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -1.0775F, 7.8351F, -1.5184F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.0009F, -0.1765F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0775F, 5.4351F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3768F, 5.0552F, -0.0042F, -0.1716F, -0.0275F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(39, 60).addBox(-1.524F, -0.1619F, 11.1759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(34, 55).addBox(-1.524F, -0.1619F, 5.4759F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.024F, 0.0461F, -11.5478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(1.024F, 0.0461F, -6.0478F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = body.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(59, 18).addBox(-1.524F, -0.1619F, 4.7759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(54, 13).addBox(-1.524F, -0.1619F, -0.9241F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(55, 46).addBox(-0.51F, 0.1314F, -6.0474F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.014F, -0.3038F, -6.0503F, 0.0277F, -0.1742F, -0.0112F));

		PartDefinition chest = Bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0617F, -5.8807F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = chest.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(64, 58).addBox(-0.51F, 0.5051F, 4.1342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 54).addBox(-0.51F, 0.5051F, -0.5658F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = chest.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(52, 46).addBox(-0.5F, -0.5F, -6.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.01F, 3.2199F, 0.7942F, -1.5708F, 0.0873F, -1.5708F));

		PartDefinition Bodyfront_r3 = chest.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(62, 56).addBox(-0.51F, -5.0949F, 1.0342F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.1F, -1.4835F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6679F, 5.2345F, 0.4368F, 0.0F, 0.0F, -0.1222F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6879F, 5.2345F, 0.4368F, 0.0F, 0.0F, 0.1222F));

		PartDefinition armL = chest.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4366F, 2.9831F, 0.9822F, -0.075F, -0.0228F, -1.1773F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3911F, 5.382F, 6.8533F, 1.4958F, -0.0655F, 0.1708F));

		PartDefinition armL3 = armL2.addOrReplaceChild("armL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2924F, 5.2147F, 0.3892F, 0.0873F, 0.0F, 0.0F));

		PartDefinition armL4 = chest.addOrReplaceChild("armL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4566F, 2.9831F, 0.9822F, 0.0961F, -0.0008F, 0.8728F));

		PartDefinition armL5 = armL4.addOrReplaceChild("armL5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3911F, 5.382F, 6.8533F, 1.4958F, 0.0655F, -0.1708F));

		PartDefinition armL6 = armL5.addOrReplaceChild("armL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2924F, 5.2147F, 0.3892F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neckbase = chest.addOrReplaceChild("Neckbase", CubeListBuilder.create().texOffs(38, 46).addBox(-0.51F, 0.0167F, -6.9797F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5829F, -5.0208F, -0.1508F, -0.1726F, 0.0261F));

		PartDefinition Neckmiddlebase = Neckbase.addOrReplaceChild("Neckmiddlebase", CubeListBuilder.create().texOffs(0, 36).addBox(-0.51F, 0.1995F, -8.0968F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 43).addBox(-0.51F, 0.1995F, -0.3968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1701F, -6.9827F, -0.1826F, -0.2732F, -0.0643F));

		PartDefinition Neckmiddlefront = Neckmiddlebase.addOrReplaceChild("Neckmiddlefront", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, 0.1922F, -7.2924F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(6, 52).addBox(-0.5F, 0.1922F, -0.5924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.01F, -0.0041F, -7.8156F, -0.3359F, -0.3393F, -0.0486F));

		PartDefinition Neckfront = Neckmiddlefront.addOrReplaceChild("Neckfront", CubeListBuilder.create().texOffs(13, 59).addBox(-0.5F, -0.0165F, -5.4284F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1601F, -7.2464F, -0.1525F, -0.4101F, -0.1428F));

		PartDefinition Head = Neckfront.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4837F, -3.6394F, -0.1158F, -0.2945F, -0.0823F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8093F, 0.2268F, 1.021F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.8826F, -0.4866F, -3.423F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.8826F, -0.4866F, -3.423F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(50, 24).addBox(-0.5F, 0.0971F, -0.1523F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(56, 30).addBox(-0.5F, 0.0971F, 6.5477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.7775F, 16.8351F, 0.2981F, 0.2162F, 0.0136F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0501F, 7.0901F, 0.192F, 0.1302F, 0.0136F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, 0.0991F, 0.5231F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0717F, -0.5737F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2032F, 5.8289F, 0.1328F, 0.2163F, 0.0287F));

		PartDefinition Tailmiddle_r1 = Tailmiddle.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(23, 58).addBox(-0.5F, -0.1001F, 7.4095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 52).addBox(-0.5F, -0.1001F, 0.7095F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0551F, -1.0379F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(27, 24).addBox(-0.5F, 0.1258F, 0.109F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5258F, 6.783F, -0.0292F, -0.1745F, 0.0051F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0998F, -0.293F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0364F, 10.0089F, -0.0787F, -0.4787F, 0.0363F));

		PartDefinition Bellyflab = Hips.addOrReplaceChild("Bellyflab", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 3.8225F, 17.9351F, 0.1274F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR3 = Hips.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7463F, 1.2248F, 16.6202F, -0.1848F, -1.1061F, 1.2483F));

		PartDefinition leftArm2 = FrontFlipperR3.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(8.1419F, -0.1811F, -0.7551F, 3.1416F, 0.1745F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = leftArm2.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5168F, -0.1024F, -4.6567F, -0.0418F, 0.7409F, -0.0591F));

		PartDefinition FrontFlipperR2 = Hips.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7463F, 1.2248F, 16.6202F, 0.12F, 0.7945F, -0.2052F));

		PartDefinition rightArm2 = FrontFlipperR2.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.1419F, -0.1811F, -0.7551F, 3.1416F, -0.1745F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = rightArm2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5168F, -0.1024F, -4.6567F, -0.0418F, -0.7409F, 0.0591F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0775F, 5.4351F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0775F, 5.4351F));

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