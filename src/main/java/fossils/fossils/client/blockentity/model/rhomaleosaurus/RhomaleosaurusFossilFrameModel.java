package fossils.fossils.client.blockentity.model.rhomaleosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RhomaleosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart BackFlipperL;
	private final ModelPart BackFlipperMiddleL;
	private final ModelPart BackFlipperEndL;
	private final ModelPart BackFlipperL2;
	private final ModelPart BackFlipperMiddleL2;
	private final ModelPart BackFlipperEndL2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart Bodyfront;
	private final ModelPart chest;
	private final ModelPart FrontFlipperL;
	private final ModelPart FrontFlipperMiddleL;
	private final ModelPart FrontFlipperEndL;
	private final ModelPart FrontFlipperL2;
	private final ModelPart FrontFlipperMiddleL2;
	private final ModelPart FrontFlipperEndL2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tailfluke1;
	private final ModelPart Tail4;
	private final ModelPart Tailfluke2;
	private final ModelPart Tailfluke3;

	public RhomaleosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.BackFlipperL = this.Hips.getChild("BackFlipperL");
		this.BackFlipperMiddleL = this.BackFlipperL.getChild("BackFlipperMiddleL");
		this.BackFlipperEndL = this.BackFlipperMiddleL.getChild("BackFlipperEndL");
		this.BackFlipperL2 = this.Hips.getChild("BackFlipperL2");
		this.BackFlipperMiddleL2 = this.BackFlipperL2.getChild("BackFlipperMiddleL2");
		this.BackFlipperEndL2 = this.BackFlipperMiddleL2.getChild("BackFlipperEndL2");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone4 = this.Hips.getChild("bone4");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.Bodyfront = this.body2.getChild("Bodyfront");
		this.chest = this.Bodyfront.getChild("chest");
		this.FrontFlipperL = this.chest.getChild("FrontFlipperL");
		this.FrontFlipperMiddleL = this.FrontFlipperL.getChild("FrontFlipperMiddleL");
		this.FrontFlipperEndL = this.FrontFlipperMiddleL.getChild("FrontFlipperEndL");
		this.FrontFlipperL2 = this.chest.getChild("FrontFlipperL2");
		this.FrontFlipperMiddleL2 = this.FrontFlipperL2.getChild("FrontFlipperMiddleL2");
		this.FrontFlipperEndL2 = this.FrontFlipperMiddleL2.getChild("FrontFlipperEndL2");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.Neck1 = this.chest.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Head = this.Neck6.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tailfluke1 = this.Tail3.getChild("Tailfluke1");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tailfluke2 = this.Tail4.getChild("Tailfluke2");
		this.Tailfluke3 = this.Tailfluke2.getChild("Tailfluke3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(36, 49).addBox(-0.5F, -1.3592F, 14.0437F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -20.9F, 1.5F, 0.7267F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(30, 43).addBox(2.4F, -0.5F, -6.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8592F, 15.7437F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(40, 53).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -0.8592F, 15.7437F, -1.5708F, 0.0F, 0.0F));

		PartDefinition BackFlipperL = Hips.addOrReplaceChild("BackFlipperL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9432F, 2.0491F, 15.8635F, -0.2097F, -0.3879F, -0.5308F));

		PartDefinition BackFlipperMiddleL = BackFlipperL.addOrReplaceChild("BackFlipperMiddleL", CubeListBuilder.create(), PartPose.offsetAndRotation(11.1585F, 0.5F, -0.1872F, -0.0285F, -0.1278F, 0.22F));

		PartDefinition BackFlipperEndL = BackFlipperMiddleL.addOrReplaceChild("BackFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8307F, 0.5F, -1.0037F, 0.0F, 0.1658F, 0.0F));

		PartDefinition BackFlipperL2 = Hips.addOrReplaceChild("BackFlipperL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9432F, 2.0491F, 15.8635F, -0.177F, 0.4454F, 0.2951F));

		PartDefinition BackFlipperMiddleL2 = BackFlipperL2.addOrReplaceChild("BackFlipperMiddleL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.1585F, 0.5F, -0.1872F, -0.0341F, 0.1264F, -0.264F));

		PartDefinition BackFlipperEndL2 = BackFlipperMiddleL2.addOrReplaceChild("BackFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8307F, 0.5F, -1.0037F, 0.0F, -0.1658F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.7616F, 3.611F, 9.383F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.7616F, 3.611F, 9.383F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4342F, 13.9437F, -0.0024F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(25, 54).addBox(-0.5F, -0.3F, 18.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 48).addBox(-0.5F, -0.3F, 11.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7012F, -19.0993F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0988F, -6.9993F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = body.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(53, 49).addBox(-0.5F, -0.3F, 5.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8F, -12.1F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -7.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = body2.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(37, 63).addBox(-0.5F, -0.3F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 58).addBox(-0.5F, -0.3F, -1.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7F, -5.1F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1804F, -5.9874F, -0.0908F, -0.0873F, 0.0003F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(47, 58).addBox(-0.5F, -0.3F, 7.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3261F, -13.2623F, -0.0175F, 0.0F, 0.0F));

		PartDefinition chest = Bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0739F, -5.9623F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = chest.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(67, 62).addBox(-0.5F, -0.3F, 6.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(62, 58).addBox(-0.5F, -0.3F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4F, -7.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = chest.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(54, 50).addBox(3.5F, -0.5F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6698F, -3.3041F, -1.5708F, 0.0175F, 1.5708F));

		PartDefinition Bodyfront_r4 = chest.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(64, 60).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.6698F, -3.3041F, -1.5882F, 0.0F, 0.0F));

		PartDefinition FrontFlipperL = chest.addOrReplaceChild("FrontFlipperL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4997F, 5.1053F, -2.7735F, 0.0909F, -0.1574F, 0.6858F));

		PartDefinition FrontFlipperMiddleL = FrontFlipperL.addOrReplaceChild("FrontFlipperMiddleL", CubeListBuilder.create(), PartPose.offsetAndRotation(10.5524F, -0.3954F, 1.8217F, 0.0744F, -0.158F, -0.4422F));

		PartDefinition FrontFlipperEndL = FrontFlipperMiddleL.addOrReplaceChild("FrontFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(8.2443F, -1.5F, -0.0469F, 0.0285F, -0.1278F, -0.22F));

		PartDefinition FrontFlipperL2 = chest.addOrReplaceChild("FrontFlipperL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4997F, 5.1053F, -2.7735F, -0.0885F, 0.1503F, -0.5403F));

		PartDefinition FrontFlipperMiddleL2 = FrontFlipperL2.addOrReplaceChild("FrontFlipperMiddleL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.5524F, -0.3954F, 1.8217F, 0.023F, 0.173F, 0.1329F));

		PartDefinition FrontFlipperEndL2 = FrontFlipperMiddleL2.addOrReplaceChild("FrontFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.2443F, -1.5F, -0.0469F, 0.0341F, 0.1264F, 0.264F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(7.0986F, 8.1726F, -4.0227F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-7.0986F, 8.1726F, -4.0227F));

		PartDefinition Neck1 = chest.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(71, 72).addBox(-0.5F, 0.2156F, -3.8918F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.0F, -0.0466F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0529F, -3.9893F, -0.1388F, -0.2121F, 0.0534F));

		PartDefinition Neckmiddlebase_r1 = Neck2.addOrReplaceChild("Neckmiddlebase_r1", CubeListBuilder.create().texOffs(63, 75).addBox(-0.5F, -0.3F, 8.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 72).addBox(-0.5F, -0.3F, 4.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6332F, -8.9362F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(68, 6).addBox(-0.51F, 0.2328F, -4.8545F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.01F, 0.019F, -3.9421F, 0.0008F, -0.0874F, 0.0432F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(70, 47).addBox(-0.51F, 0.1201F, -5.1833F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(74, 51).addBox(-0.51F, 0.1201F, -0.4833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1115F, -4.9613F, -0.1045F, -0.214F, 0.1313F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create().texOffs(69, 40).addBox(-0.51F, 0.1201F, -5.2833F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(73, 44).addBox(-0.51F, 0.1201F, -0.5833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0071F, -5.0003F, -0.2318F, -0.2551F, 0.0595F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(54, 24).addBox(-0.51F, 0.1201F, -6.7833F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0063F, -4.9773F, -0.1194F, -0.1309F, -0.0015F));

		PartDefinition Head = Neck6.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.49F, 0.6511F, -8.3842F, -0.4363F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.0736F, -0.7817F, -17.1414F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.9264F, -0.7817F, -17.1414F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.6214F, 3.3363F, 0.7679F, 0.0F, 0.0F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(69, 33).addBox(-0.5F, -0.2999F, -0.3107F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(73, 37).addBox(-0.5F, -0.2999F, 4.3894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0592F, 20.9438F, 0.067F, 0.1741F, 0.0116F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, 0.0996F, 0.0123F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3991F, 4.9766F, 0.0222F, 0.1309F, -0.0028F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(17, 57).addBox(-0.5F, 0.2006F, -0.469F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(22, 62).addBox(-0.5F, 0.2006F, 5.231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1004F, 6.9873F, 0.1094F, 0.1309F, -0.0028F));

		PartDefinition Tailfluke1 = Tail3.addOrReplaceChild("Tailfluke1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -2.4009F, -0.0521F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(25, 37).addBox(-0.5F, 0.2496F, -0.1534F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0509F, 5.8479F, 0.219F, 0.1308F, -0.0056F));

		PartDefinition Tailfluke2 = Tail4.addOrReplaceChild("Tailfluke2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9728F, -0.6426F, 0.2759F, 0.0F, 0.0F));

		PartDefinition Tailfluke3 = Tailfluke2.addOrReplaceChild("Tailfluke3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0F, 6.0F, -1.0826F, 0.0F, 0.0F));

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