package fossils.fossils.client.blockentity.model.hyperodapedon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HyperodapedonFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart leftArm7;
	private final ModelPart leftArm8;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart rightArm7;
	private final ModelPart rightArm8;
	private final ModelPart Belly;
	private final ModelPart body2;
	private final ModelPart Bodyfront;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone6;
	private final ModelPart leftArm2;
	private final ModelPart leftArm;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightArm2;
	private final ModelPart rightArm;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart Neck2;
	private final ModelPart neck3;
	private final ModelPart Head2;
	private final ModelPart Lowerjaw1;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Tail1;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart bone2;
	private final ModelPart bone5;

	public HyperodapedonFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.leftArm5 = this.Hips.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.leftArm7 = this.leftArm6.getChild("leftArm7");
		this.leftArm8 = this.leftArm7.getChild("leftArm8");
		this.rightArm5 = this.Hips.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.rightArm7 = this.rightArm6.getChild("rightArm7");
		this.rightArm8 = this.rightArm7.getChild("rightArm8");
		this.Belly = this.Hips.getChild("Belly");
		this.body2 = this.Belly.getChild("body2");
		this.Bodyfront = this.body2.getChild("Bodyfront");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone3 = this.bone.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone6 = this.bone3.getChild("bone6");
		this.leftArm2 = this.bone3.getChild("leftArm2");
		this.leftArm = this.leftArm2.getChild("leftArm");
		this.leftArm3 = this.leftArm.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightArm2 = this.bone3.getChild("rightArm2");
		this.rightArm = this.rightArm2.getChild("rightArm");
		this.rightArm3 = this.rightArm.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.Neck2 = this.bone.getChild("Neck2");
		this.neck3 = this.Neck2.getChild("neck3");
		this.Head2 = this.neck3.getChild("Head2");
		this.Lowerjaw1 = this.Head2.getChild("Lowerjaw1");
		this.leftFace = this.Head2.getChild("leftFace");
		this.rightFace = this.Head2.getChild("rightFace");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail4 = this.Tail1.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone5 = this.Hips.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -6.8F, 8.4F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.7F, -7.4F, -5.6F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-2.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.7F, -7.4F, -5.6F, 0.3927F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-2.3F, -2.4F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -8.3F, 8.9F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.4F, 7.7F, -0.3916F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(22, 27).addBox(0.8842F, -0.3F, 3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3842F, 0.4091F, -2.9063F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftArm5 = Hips.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0119F, 0.9208F, 2.3963F, 0.1102F, 0.1446F, 0.4895F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(5.8792F, 0.2932F, -0.3144F, -2.0178F, -1.0298F, 3.0945F));

		PartDefinition leftArm7 = leftArm6.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0223F, 0.2383F, -1.9763F, -0.0018F, -0.0611F, 0.0004F));

		PartDefinition leftArm8 = leftArm7.addOrReplaceChild("leftArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.289F, 0.0F, -0.9165F, 0.0F, 1.1956F, 0.0F));

		PartDefinition rightArm5 = Hips.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0119F, 0.9208F, 2.3963F, 0.1582F, -0.5717F, -0.5964F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.8792F, 0.2932F, -0.3144F, -0.8025F, 0.8688F, -1.6825F));

		PartDefinition rightArm7 = rightArm6.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0223F, 0.2383F, -1.9763F, -0.002F, 0.4538F, -0.0012F));

		PartDefinition rightArm8 = rightArm7.addOrReplaceChild("rightArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.289F, 0.0F, -0.9165F, 0.0F, -0.9774F, 0.0F));

		PartDefinition Belly = Hips.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2625F, 0.7217F, 0.212F, -0.0853F, -0.0183F));

		PartDefinition Belly_r1 = Belly.addOrReplaceChild("Belly_r1", CubeListBuilder.create().texOffs(11, 27).addBox(0.8842F, -0.2F, 6.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3842F, -1.0166F, -10.1734F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body2 = Belly.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0158F, -1.4916F, -4.3234F, 0.0786F, -0.0435F, -0.0034F));

		PartDefinition Belly_r2 = body2.addOrReplaceChild("Belly_r2", CubeListBuilder.create().texOffs(9, 33).addBox(0.8842F, -0.2F, 0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(10, 35).addBox(0.8842F, -0.2F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4F, 0.5F, -3.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2762F, -2.8535F, 0.1256F, -0.1299F, -0.0164F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(18, 33).addBox(0.8842F, -0.2237F, 6.9609F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4F, 1.1669F, -9.8572F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0331F, -2.9572F, 0.1136F, -0.0434F, -0.0049F));

		PartDefinition Bodyfront_r2 = bone.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(17, 10).addBox(0.8842F, -0.642F, -4.5209F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4F, 1.0F, -0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(3.3842F, 4.1381F, -5.9865F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.1F, -0.7889F, 1.3948F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-6.7F, -0.7889F, 1.3948F));

		PartDefinition leftArm2 = bone3.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2515F, -1.3317F, 1.8479F, -0.1171F, -0.8128F, 0.64F));

		PartDefinition leftArm = leftArm2.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1403F, 0.1773F, -0.6036F, 0.403F, -0.0646F, 0.9981F));

		PartDefinition leftArm3 = leftArm.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3608F, 1.1543F, -1.2969F, 0.0F, -0.3054F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2867F, -1.0852F, -0.9022F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rightArm2 = bone3.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5485F, -1.3317F, 1.8479F, 0.0263F, -0.5374F, -0.4729F));

		PartDefinition rightArm = rightArm2.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1403F, 0.1773F, -0.6036F, 0.1412F, 0.0646F, -0.9981F));

		PartDefinition rightArm3 = rightArm.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3608F, 1.1543F, -1.2969F, 0.0F, 0.3054F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2867F, -1.0852F, -0.9022F, 0.0F, -0.1309F, 0.0F));

		PartDefinition Neck2 = bone.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6235F, -4.7722F, -0.242F, -0.125F, 0.0386F));

		PartDefinition Neck_r1 = Neck2.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(42, 44).addBox(0.8842F, -0.3375F, 2.7526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 43).addBox(0.8842F, -0.3375F, 1.0526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4F, 0.7907F, -3.0119F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = Neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0907F, -2.0119F, 0.1949F, -0.1713F, -0.0336F));

		PartDefinition Neck_r2 = neck3.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(17, 21).addBox(0.8842F, -0.3572F, -0.3488F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4F, 0.7F, -3.3F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head2 = neck3.addOrReplaceChild("Head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2094F, -4.2314F, 0.3377F, -0.2116F, -0.0537F));

		PartDefinition Lowerjaw1 = Head2.addOrReplaceChild("Lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.237F, 0.6334F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftFace = Head2.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.4F, -1.3656F, -1.496F));

		PartDefinition rightFace = Head2.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.3684F, -1.3656F, -1.496F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5158F, 0.0024F, -0.1156F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0158F, 0.4841F, 4.0187F, -0.1349F, -0.0865F, 0.0117F));

		PartDefinition Tail4 = Tail1.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(28, 21).addBox(-0.5158F, 0.3289F, -0.3246F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 23).addBox(-0.5158F, 0.3289F, 2.3754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3226F, 3.8847F, -0.0106F, -0.1318F, -0.0859F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(32, 15).addBox(-0.5158F, 0.2547F, -0.057F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1039F, 2.9754F, 0.1088F, -0.2051F, -0.1507F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0547F, 2.943F, 0.1272F, -0.2343F, -0.3267F));

		PartDefinition Tail6_r1 = Tail6.addOrReplaceChild("Tail6_r1", CubeListBuilder.create().texOffs(44, 5).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 4).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0158F, 0.6787F, 1.5742F, 0.0F, 0.0698F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(7, 43).addBox(-0.5158F, 0.1787F, -0.1258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(8, 44).addBox(-0.5158F, 0.1787F, 1.5742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.025F, 1.9F, 0.1363F, -0.1297F, -0.0177F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(14, 43).addBox(-0.5158F, 0.1787F, -0.0258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.05F, 1.925F, 0.3167F, -0.2076F, -0.0675F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5F, 4.8529F, 2.7181F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-1.5F, 4.8529F, 2.7181F));

		return LayerDefinition.create(meshdefinition, 70, 70);
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