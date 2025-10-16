package fossils.fossils.client.blockentity.model.postosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PostosuchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart upperleg3;
	private final ModelPart leg3;
	private final ModelPart feet3;
	private final ModelPart toes3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart crestl;
	private final ModelPart crestl2;
	private final ModelPart crestl3;
	private final ModelPart crestl4;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail7;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public PostosuchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.upperleg2 = this.hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.upperleg3 = this.hips.getChild("upperleg3");
		this.leg3 = this.upperleg3.getChild("leg3");
		this.feet3 = this.leg3.getChild("feet3");
		this.toes3 = this.feet3.getChild("toes3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.Leftarm1 = this.chest.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Rightarm1 = this.chest.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.crestl = this.head.getChild("crestl");
		this.crestl2 = this.crestl.getChild("crestl2");
		this.crestl3 = this.head.getChild("crestl3");
		this.crestl4 = this.crestl3.getChild("crestl4");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail7 = this.tail.getChild("tail7");
		this.tail2 = this.tail7.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -16.0F, -1.9F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.6F, -2.15F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.5F, -10.65F, -16.9F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(1.15F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.5F, -10.65F, -16.9F, 0.2182F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-4.7F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -12.0F, -1.4F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.5387F, 0.0263F, 0.2143F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(5, 15).addBox(-0.5F, 0.8F, 6.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 10).addBox(-0.5F, 0.8F, -0.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0311F, -0.9296F, -1.1182F, 0.0F, 0.0F, 0.0436F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0311F, -0.9296F, -1.1182F, 0.0F, 0.0F, -0.0436F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -2.3232F, -1.0535F, -0.0593F, -0.0574F, -0.1177F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 8.5325F, 1.4718F, 1.0688F, -0.0632F, 0.0943F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 7.0264F, -0.3761F, -0.0476F, 0.0429F, -0.0077F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0229F, -3.3873F, -0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -2.3232F, -1.0535F, -0.5929F, -0.0402F, -0.0271F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 8.5325F, 1.4718F, 0.8328F, 0.0252F, -0.0356F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 7.0264F, -0.3761F, -0.0901F, 0.0229F, 0.0842F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0229F, -3.3873F, -0.3491F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(51, 7).addBox(-0.5F, 0.2999F, -5.0122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.7F, -3.0F, -0.0352F, 0.1308F, -0.0046F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(15, 47).addBox(-0.5F, 0.4F, -5.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 51).addBox(-0.5F, 0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1001F, -4.9122F, 0.051F, 0.0872F, -0.0032F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1572F, -4.9912F, -0.0915F, -0.0169F, -0.0085F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 53).addBox(-0.4941F, 0.9395F, 2.1618F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0059F, 1.0233F, -7.2223F, 0.192F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.2894F, 3.7489F, -5.5662F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.2894F, 3.7489F, -5.5662F));

		PartDefinition Leftarm1 = chest.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9786F, 5.1786F, -4.902F, 0.9873F, 0.209F, -0.1198F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3638F, 4.0497F, 0.482F, -1.1046F, 0.0653F, 0.1135F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4889F, 3.7879F, 0.3F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Rightarm1 = chest.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9786F, 5.1786F, -4.902F, 0.4312F, -0.0994F, 0.0474F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3638F, 4.0497F, 0.482F, -0.8428F, -0.0653F, -0.1135F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4889F, 3.7879F, 0.3F, 0.0F, 0.0F, -0.2182F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0059F, 1.558F, -4.8253F, -0.3913F, 0.3699F, -0.1319F));

		PartDefinition cube_r6 = neck3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(69, 49).addBox(0.0059F, -1.1046F, 4.676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(67, 47).addBox(0.0059F, -1.1046F, 1.976F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.5869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2557F, -3.0053F, -0.1219F, 0.1347F, -0.0019F));

		PartDefinition cube_r7 = neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 69).addBox(0.0059F, 0.6F, 4.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(51, 67).addBox(0.0059F, 0.6F, 1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.5006F, -4.9738F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0994F, -2.9738F, -0.07F, 0.0901F, 0.0374F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(41, 57).addBox(0.0059F, 0.2F, -0.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1239F, -3.0873F, 0.0869F, -0.0076F, 0.0869F));

		PartDefinition crestl = head.addOrReplaceChild("crestl", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2549F, -0.5969F, -6.7907F, 0.5009F, 0.5964F, 0.0524F));

		PartDefinition crestl2 = crestl.addOrReplaceChild("crestl2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4758F, 0.541F, 3.3676F, -0.3681F, -0.5263F, -0.0234F));

		PartDefinition crestl3 = head.addOrReplaceChild("crestl3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2668F, -0.5969F, -6.7907F, 0.5009F, -0.5964F, -0.0524F));

		PartDefinition crestl4 = crestl3.addOrReplaceChild("crestl4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4758F, 0.541F, 3.3676F, -0.3681F, 0.5263F, 0.0234F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0277F, 2.9692F, -7.6683F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.0158F, 2.9692F, -7.6683F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 1.9998F, 0.9737F, 1.1606F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(32, 24).addBox(-0.5F, -0.0531F, -0.2963F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0743F, 4.0076F, 0.0906F, -0.1738F, -0.0157F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.1F, -0.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(4, 53).addBox(-0.5F, -0.1F, 4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0469F, 5.9037F, 0.0F, -0.1745F, 0.0F));

		PartDefinition tail2 = tail7.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 24).addBox(-0.5F, 0.1143F, -0.0638F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, 4.9F, -0.0787F, -0.0872F, 0.0031F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(55, 4).addBox(-0.5F, -0.1F, 4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2143F, 6.0362F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, 0.0015F, 0.0651F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, 4.9F, -0.0818F, 0.245F, -0.0096F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.4F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4026F, 6.9304F, -0.088F, 0.1304F, -0.0115F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(15, 32).addBox(-0.5F, 0.407F, -0.3999F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0209F, 6.0515F, -0.2454F, 0.1741F, -0.0123F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.507F, -0.5999F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.1584F, 0.1293F, -0.0206F));

		return LayerDefinition.create(meshdefinition, 98, 98);
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