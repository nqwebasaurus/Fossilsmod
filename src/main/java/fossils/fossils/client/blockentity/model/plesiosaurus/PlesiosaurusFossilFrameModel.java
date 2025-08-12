package fossils.fossils.client.blockentity.model.plesiosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlesiosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart BackFlipperR2;
	private final ModelPart BackFlipperMiddleR2;
	private final ModelPart BackFlipperEndR2;
	private final ModelPart BackFlipperR3;
	private final ModelPart BackFlipperMiddleR3;
	private final ModelPart BackFlipperEndR3;
	private final ModelPart bone2;
	private final ModelPart bone6;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart tailfin;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart chest;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart neck;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart Lowerjaw;

	public PlesiosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.BackFlipperR2 = this.Hips.getChild("BackFlipperR2");
		this.BackFlipperMiddleR2 = this.BackFlipperR2.getChild("BackFlipperMiddleR2");
		this.BackFlipperEndR2 = this.BackFlipperMiddleR2.getChild("BackFlipperEndR2");
		this.BackFlipperR3 = this.Hips.getChild("BackFlipperR3");
		this.BackFlipperMiddleR3 = this.BackFlipperR3.getChild("BackFlipperMiddleR3");
		this.BackFlipperEndR3 = this.BackFlipperMiddleR3.getChild("BackFlipperEndR3");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone6 = this.Hips.getChild("bone6");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.tailfin = this.Tail3.getChild("tailfin");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.chest = this.Bodyfront.getChild("chest");
		this.FrontFlipperR2 = this.chest.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.FrontFlipperR3 = this.chest.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
		this.bone = this.chest.getChild("bone");
		this.bone5 = this.chest.getChild("bone5");
		this.neck = this.chest.getChild("neck");
		this.Neck1 = this.neck.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.bone3 = this.Head.getChild("bone3");
		this.bone4 = this.Head.getChild("bone4");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -12.2128F, 11.1812F, -0.1298F, -0.017F, -0.1298F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(-2, 22).addBox(-3.9F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1606F, 1.3513F, -1.5708F, -0.0524F, -1.5708F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 26).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.1606F, 1.3513F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 24).addBox(0.0F, 0.3F, 2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -3.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition BackFlipperR2 = Hips.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2304F, 3.5608F, 0.9712F, -0.0525F, -0.4174F, 0.8599F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.164F, 0.0189F, 1.6447F, -0.0411F, -0.3027F, 0.1372F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.6407F, 0.0F, -0.9261F, -0.0172F, -0.1298F, 0.132F));

		PartDefinition BackFlipperR3 = Hips.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2304F, 3.5608F, 0.9712F, 0.1022F, 0.4086F, -0.4786F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.164F, 0.0189F, 1.6447F, -0.0275F, 0.3042F, -0.0915F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.6407F, 0.0F, -0.9261F, -0.0341F, 0.1264F, -0.264F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.7616F, 5.6239F, -5.7982F));

		PartDefinition bone6 = Hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-2.7616F, 5.6239F, -5.7982F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, 0.4394F, -0.5485F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(51, 3).addBox(-0.5F, 0.4394F, 3.1515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -0.2509F, -0.1548F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7003F, 3.9057F, 0.0792F, -0.1305F, -0.0103F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(19, 14).addBox(-0.5F, 0.0986F, -0.5555F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3649F, 5.992F, 0.0268F, -0.2181F, -0.0058F));

		PartDefinition tailfin = Tail3.addOrReplaceChild("tailfin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7151F, 7.2008F, -0.9163F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(36, 24).addBox(-0.5F, 0.1F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4539F, -0.9251F, 0.0131F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(30, 36).addBox(-0.5F, 0.6F, -5.425F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(34, 40).addBox(-0.5F, 0.6F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.9F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offset(0.0F, 0.4F, -5.05F));

		PartDefinition cube_r4 = Bodyfront.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 36).addBox(0.0F, 0.1F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.3F, -6.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition chest = Bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.2939F, -5.9504F, 0.1223F, 0.0433F, 0.0053F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-2, 12).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 3.8351F, -5.8702F, -1.5708F, -0.0349F, 1.5708F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(5, 19).addBox(-0.5F, 2.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, 0.7323F, -2.9767F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, 0.1F, -7.8F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3067F, 3.9779F, -6.4399F, -0.0526F, -0.4935F, -0.2819F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.7239F, -0.0709F, -1.5197F, -0.054F, 0.3892F, -0.1415F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3469F, 0.0F, -0.8308F, 0.0341F, -0.1264F, -0.264F));

		PartDefinition FrontFlipperR3 = chest.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3067F, 3.9779F, -6.4399F, 0.4709F, 0.372F, 0.5911F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.7239F, -0.0709F, -1.5197F, -0.0894F, -0.3829F, 0.2355F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3469F, 0.0F, -0.8308F, 0.0057F, 0.1308F, 0.044F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5986F, 8.4659F, -6.4739F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5986F, 8.4659F, -6.4739F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5292F, -7.9951F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(49, 24).addBox(0.0F, 0.8F, 3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(52, 26).addBox(0.0F, 0.8F, 7.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck1 = neck.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0126F, -4.0727F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition cube_r9 = Neck1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 50).addBox(0.0F, 0.8F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -4.2F, 0.0528F, 0.1307F, 0.0069F));

		PartDefinition cube_r10 = Neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(38, 53).addBox(0.0F, 0.3F, 11.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 50).addBox(0.0F, 0.3F, 7.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -11.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(15, 36).addBox(-0.5F, 0.2F, -5.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0435F, -3.5253F, 0.0F, 0.0436F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.275F, -6.175F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Neck4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(41, 21).addBox(-0.5F, 0.1F, 7.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 16).addBox(-0.5F, 0.1F, 1.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0724F, -5.7501F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Neck5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(30, 43).addBox(-0.5F, 0.1F, 3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -8.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2091F, -4.9458F, 0.0609F, -0.0053F, 0.0871F));

		PartDefinition cube_r13 = Neck6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(46, 50).addBox(-0.5F, 0.1F, 4.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -8.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1861F, -3.9187F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Neck7.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(19, 23).addBox(-0.5F, 0.1F, 1.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -8.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5324F, -7.1854F));

		PartDefinition bone3 = Head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.7778F, 0.6821F, -3.3824F));

		PartDefinition bone4 = Head.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.7778F, 0.6821F, -3.3824F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0773F, 0.7917F, 0.48F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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