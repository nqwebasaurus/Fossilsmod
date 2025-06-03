package fossils.fossils.client.blockentity.model.australovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AustralovenatorFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
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
	private final ModelPart chest;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Leftarm4;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart Rightarm4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public AustralovenatorFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.chest = this.body.getChild("chest");
		this.Leftarm1 = this.chest.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Leftarm4 = this.Leftarm3.getChild("Leftarm4");
		this.Rightarm1 = this.chest.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.Rightarm4 = this.Rightarm3.getChild("Rightarm4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -22.0F, -1.0F, 1.0F, 22.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 23.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(1.6F, -18.0F, -19.8F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.9F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(1.6F, -18.0F, -19.8F, 0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(3.8F, -5.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -18.0F, -0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -23.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 12).addBox(-0.5F, 0.9F, -0.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.9F, -4.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Leftleg1 = hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4F, 0.5084F, -0.6257F, -0.654F, 0.0266F, 0.0346F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 9.4129F, 0.4154F, 0.925F, 0.0F, 0.0F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 9.1191F, 0.371F, -0.5228F, -0.0784F, -0.0464F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 5.2125F, 0.0756F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0248F, -3.0271F));

		PartDefinition Rightleg1 = hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4F, 0.5084F, -0.6257F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 9.4129F, 0.4154F, 0.8814F, 0.0F, 0.0F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 9.1191F, 0.371F, -0.8651F, 0.1334F, 0.1129F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 5.2125F, 0.0756F, 0.48F, 0.0F, 0.0F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0248F, -3.0271F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.2F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -11.2F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -11.9F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(43, 10).addBox(-0.5F, 0.9022F, -4.2394F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.2F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(66, 66).addBox(0.0F, 0.6022F, -6.9394F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.9F, 0.2F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Leftarm1 = chest.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7F, 5.8084F, -3.8257F, 0.682F, 0.2264F, -0.1688F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2789F, 4.8602F, 0.3544F, -1.8447F, -0.2947F, 0.0814F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 4.5852F, -0.6812F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Leftarm4 = Leftarm3.addOrReplaceChild("Leftarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2864F, -0.2951F, -0.263F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightarm1 = chest.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7F, 5.8084F, -3.8257F, -0.5397F, -0.2264F, 0.1688F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2789F, 4.8602F, 0.3544F, -1.2246F, 0.3442F, 0.2034F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 4.5852F, -0.6812F, -0.4181F, -0.5926F, 0.2106F));

		PartDefinition Rightarm4 = Rightarm3.addOrReplaceChild("Rightarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2864F, -0.2951F, -0.263F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -5.9F, 0.0F, 0.1309F, -0.1745F));

		PartDefinition cube_r8 = neck3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 51).addBox(0.0F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -2.8F, -0.3491F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.6F, 0.1104F, -0.2684F, -0.0909F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 43).addBox(-0.1F, 0.8F, 0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -3.6F, -4.7F, -0.576F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1F, -4.6F, -0.0641F, -0.4891F, 0.3979F));

		PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(53, 62).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.6F, -3.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.0F, -0.7F, -3.2F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.7F, -3.2F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, 0.9F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(34, 23).addBox(-0.5F, -0.1F, 0.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 3.5F, -0.0939F, -0.1389F, -0.0739F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(21, 27).addBox(-0.5F, 0.6F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.7F, 7.0F, 0.0542F, 0.2614F, 0.014F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(17, 15).addBox(-0.5F, 0.4F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0723F, 0.2611F, 0.0187F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, 0.4F, -0.4F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.0928F, -0.3477F, 0.0317F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, 0.4F, -0.7F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.1084F, -0.2603F, 0.028F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.4F, -0.8F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.1965F, -0.2141F, 0.0423F));

		return LayerDefinition.create(meshdefinition, 85, 85);
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