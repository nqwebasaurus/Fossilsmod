package fossils.fossils.client.blockentity.model.asfaltovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AsfaltovenatorFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart heads;
	private final ModelPart jaw;
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
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public AsfaltovenatorFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.Leftarm1 = this.chest.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Rightarm1 = this.chest.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.heads = this.neck.getChild("heads");
		this.jaw = this.heads.getChild("jaw");
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
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -33.0F, 4.0F, 1.0F, 33.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 26.25F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(1.2F, -9.4F, -0.5F, 1.0F, 32.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -22.6F, -20.3F, 0.0F, -0.1571F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.6F, -3.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -22.6F, -20.3F, 0.1571F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(8.9F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -21.5F, 4.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -32.6F, 4.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, 1.2F, -1.9F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.7F, -3.4F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -5.4F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(38, 20).addBox(-0.5F, 0.9F, 0.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -11.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -12.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(41, 35).addBox(-0.5F, 1.0599F, -0.0342F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.6F, -10.6F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Leftarm1 = chest.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7F, 10.1084F, -7.0257F, 0.2282F, 0.2264F, -0.1688F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2789F, 4.8602F, 0.3544F, -1.0435F, 0.1133F, 0.0657F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 4.5852F, -0.6812F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Rightarm1 = chest.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7F, 10.1084F, -7.0257F, 0.8391F, -0.2264F, 0.1688F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2789F, 4.8602F, 0.3544F, -1.2654F, 0.0F, 0.0F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 4.5852F, -0.6812F, 0.0F, 0.0F, -0.2182F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, -10.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r7 = neck3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 18).addBox(-0.5F, 0.7F, 0.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -4.4F, -0.2269F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -3.9F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(34, 62).addBox(-0.5F, 0.2883F, 0.2181F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.8F, -4.4F, -0.637F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(80, 31).addBox(-0.8F, -1.0F, -4.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.4F, -4.7F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(67, 37).addBox(-1.0F, 1.0F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -2.0F, -2.4F, -0.5061F, 0.0F, 0.0F));

		PartDefinition heads = neck.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -4.0F, -0.1995F, -0.1581F, -0.1294F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(1.0F, 1.7F, 1.1F));

		PartDefinition Leftleg1 = hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4F, 1.7084F, 0.2743F, 0.0425F, -0.0262F, 0.0832F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 12.197F, -1.149F, 0.9595F, -0.025F, 0.0357F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 13.2191F, -0.029F, -0.5653F, -0.0617F, -0.0618F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 6.3125F, -0.7244F, -0.0872F, -0.0038F, -0.0435F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5973F, -5.0844F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightleg1 = hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4F, 1.7084F, 0.2743F, -1.0241F, 0.0454F, -0.0724F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 12.197F, -1.149F, 1.7453F, 0.0F, 0.0F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 13.2191F, -0.029F, -1.5924F, -0.1725F, 0.1175F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 6.3125F, -0.7244F, 1.789F, 0.0F, 0.0F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5973F, -5.0844F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(17, 38).addBox(-0.5F, 0.0929F, 0.0078F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.4F, -0.1314F, -0.0865F, 0.0114F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(19, 21).addBox(-0.5F, 0.0019F, -0.5564F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2113F, 12.073F, 0.2184F, -0.0426F, -0.0094F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(35, 4).addBox(-0.5018F, 0.3001F, -1.0086F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.2989F, 13.7261F, -0.1051F, 0.0868F, -0.0091F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(35, 49).addBox(-0.4943F, 0.5055F, -0.0569F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.2F, 12.9965F, -0.176F, 0.1289F, -0.0229F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 18).addBox(-0.4743F, 0.2856F, -0.3066F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.2945F, 11.0572F, -0.3518F, 0.123F, -0.045F));

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