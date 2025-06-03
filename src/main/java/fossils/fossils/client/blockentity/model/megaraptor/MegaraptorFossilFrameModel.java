package fossils.fossils.client.blockentity.model.megaraptor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MegaraptorFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone5;
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
	private final ModelPart body;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart chest;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Leftarm4;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart Rightarm4;
	private final ModelPart bone4;
	private final ModelPart bone6;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;

	public MegaraptorFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone5 = this.hips.getChild("bone5");
		this.Leftleg1 = this.hips.getChild("Leftleg1");
		this.Leftleg2 = this.Leftleg1.getChild("Leftleg2");
		this.Leftleg3 = this.Leftleg2.getChild("Leftleg3");
		this.Leftleg4 = this.Leftleg3.getChild("Leftleg4");
		this.Leftleg5 = this.Leftleg4.getChild("Leftleg5");
		this.Rightleg1 = this.hips.getChild("Rightleg1");
		this.Rightleg2 = this.Rightleg1.getChild("Rightleg2");
		this.Rightleg3 = this.Rightleg2.getChild("Rightleg3");
		this.Rightleg4 = this.Rightleg3.getChild("Rightleg4");
		this.Rightleg5 = this.Rightleg4.getChild("Rightleg5");
		this.body = this.hips.getChild("body");
		this.bone2 = this.body.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.chest = this.bone3.getChild("chest");
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.Leftarm1 = this.chest.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Leftarm4 = this.Leftarm3.getChild("Leftarm4");
		this.Rightarm1 = this.chest.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.Rightarm4 = this.Rightarm3.getChild("Rightarm4");
		this.bone4 = this.chest.getChild("bone4");
		this.bone6 = this.chest.getChild("bone6");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -32.0F, -0.4F, 1.0F, 32.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.7F, -6.0F, -0.5F, 1.0F, 31.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -25.0F, -22.9F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-1.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -25.0F, -22.9F, -0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(4.2F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -26.0F, 0.1F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -32.7282F, 0.4995F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 23).addBox(-0.5F, 0.9F, -0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.9F, -4.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7113F, 2.5637F, 0.88F, 0.0F, 0.0F, -0.1745F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7113F, 2.5637F, 0.88F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Leftleg1 = hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 1.8423F, -0.0847F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 12.4868F, 0.6846F, 1.1399F, -0.1191F, 0.0545F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 13.0295F, -1.1778F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 7.4032F, -0.3727F, 0.1734F, 0.0262F, -0.0832F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0248F, -3.0271F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightleg1 = hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4F, 1.8423F, -0.0847F, -1.0529F, 0.2324F, 0.0332F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 12.4868F, 0.6846F, 1.612F, 0.1348F, -0.0811F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 13.0295F, -1.1778F, -1.2334F, -0.1262F, 0.094F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 7.4032F, -0.3727F, 1.0105F, 0.0934F, 0.1476F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0248F, -3.0271F, 0.829F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.2F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(13, 53).addBox(-0.5F, 0.0F, -5.2F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition bone2 = body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0087F, -5.9004F, 0.0872F, -0.0038F, 0.0435F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(31, 53).addBox(-0.5F, 0.0F, -11.2F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.2F, -0.0175F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0835F, -5.9298F, 0.0875F, 0.0831F, 0.0511F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(51, 18).addBox(-0.5F, 0.0F, -11.2F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.2F, -0.0175F, 0.0F, 0.0F));

		PartDefinition chest = bone3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2078F, -5.9698F, -0.131F, 0.0433F, -0.0057F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(68, 18).addBox(-0.5F, 0.9022F, -4.2394F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.2F, 0.1396F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.8F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 90).addBox(-0.5F, 0.9022F, -6.2394F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(65, 103).addBox(-0.5F, 0.7022F, -8.0394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9332F, 4.303F, 0.1396F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4319F, -3.2769F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(86, 86).addBox(0.0F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(83, 83).addBox(0.0F, -0.5F, 0.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.6456F, -4.5511F, -0.3491F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2259F, -4.0524F, -0.0521F, 0.0129F, 0.1158F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(63, 43).addBox(0.0F, 0.6F, 0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -3.6F, -4.7F, -0.576F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1F, -4.6F, -0.394F, 0.0806F, -0.0335F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(78, 39).addBox(0.0F, -0.3F, -0.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.6F, -3.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2F, -3.3F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.0F, -0.7F, -3.2F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.7F, -3.2F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5096F, 1.1868F, 1.0036F, 0.0F, 0.0F));

		PartDefinition Leftarm1 = chest.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7F, 7.877F, -1.8967F, 0.8276F, -0.0074F, -0.4302F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2789F, 5.588F, -0.3941F, -1.5118F, -0.2723F, 0.6709F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3836F, 5.5615F, -0.6812F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Leftarm4 = Leftarm3.addOrReplaceChild("Leftarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2864F, -0.2951F, -0.263F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Rightarm1 = chest.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7F, 7.877F, -1.8967F, 0.1143F, 0.2071F, 0.2183F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2789F, 5.588F, -0.3941F, -1.127F, 0.2555F, 0.0579F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3836F, 5.5615F, -0.6812F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Rightarm4 = Rightarm3.addOrReplaceChild("Rightarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2864F, -0.2951F, -0.263F, -0.48F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(3.8F, -1.3449F, -0.392F));

		PartDefinition bone6 = chest.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-3.8F, -1.3449F, -0.392F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(1, 14).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6094F, 5.4978F, -0.0809F, -0.1776F, -0.0288F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(1, 0).addBox(-0.5F, 0.6F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.6939F, 9.8768F, 0.0859F, -0.1673F, -0.1006F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.5F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F))
				.texOffs(9, 37).addBox(-0.5F, 0.5F, 9.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0098F, 10.9066F, 0.1063F, 0.1736F, 0.0184F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(44, 43).addBox(-0.5F, 0.5F, 0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0052F, 9.9503F, 0.1063F, 0.1736F, 0.0184F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(27, 11).addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0087F, 7.9508F, -0.1787F, 0.2148F, -0.0385F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, 0.5F, -0.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.1715F, 0.2581F, -0.0442F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(62, 62).addBox(-0.475F, 0.5F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(67, 67).addBox(-0.475F, 0.5F, 5.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0503F, 8.9804F, -0.2436F, 0.2544F, -0.0625F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(23, 35).addBox(-0.5F, 0.4F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0073F, 5.9666F, -0.332F, 0.2996F, -0.0601F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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