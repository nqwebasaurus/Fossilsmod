package fossils.fossils.client.blockentity.model.balaena;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BalaenaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart body;
	private final ModelPart body5;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart Baleen;
	private final ModelPart Baleen2;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;

	public BalaenaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.body = this.body6.getChild("body");
		this.body5 = this.body.getChild("body5");
		this.body4 = this.body5.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.hips = this.body2.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.bone = this.chest.getChild("bone");
		this.bone2 = this.chest.getChild("bone2");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.Baleen = this.head.getChild("Baleen");
		this.Baleen2 = this.head.getChild("Baleen2");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.9543F, -15.5138F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(196, 111).addBox(-13.5F, -1.0F, -20.5F, 2.0F, 2.0F, 42.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 18.5454F, -1.4712F, -1.5708F, 0.3054F, -1.5708F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(215, 130).addBox(-1.0F, 1.8065F, 5.7127F, 2.0F, 2.0F, 23.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.2854F, -3.9706F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(225, 140).addBox(-1.0F, 1.8065F, -0.3873F, 2.0F, 4.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.2854F, -5.5706F, 0.3054F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(30, 206).addBox(-1.0F, 0.6F, -0.3F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.393F, 6.83F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7413F, 13.7215F, -0.0349F, -0.0436F, 0.0015F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(176, 26).addBox(-1.0F, -1.9154F, 0.0794F, 2.0F, 4.0F, 18.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.8F, -0.4F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(98, 158).addBox(-1.0F, -0.4F, 0.0F, 2.0F, 4.0F, 19.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1509F, 16.9254F, -0.1397F, 0.0259F, -0.0036F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(145, 158).addBox(-1.0F, 1.0F, 0.3F, 2.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2953F, 18.7348F, -0.1398F, -0.0432F, 0.0061F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(156, 62).addBox(-1.0F, 0.15F, 0.0F, 2.0F, 4.0F, 20.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.9902F, 18.8764F, 0.0699F, -0.0435F, -0.003F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.493F, 20.1306F, 0.3756F, -0.0406F, -0.016F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(140, 181).addBox(-1.0F, 1.8487F, 8.0474F, 2.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0656F, -8.4997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5025F, 17.1822F, 0.4098F, -0.0174F, 0.04F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 172).addBox(-6.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.469F, -3.101F, -1.5708F, -0.4451F, -1.5708F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 173).addBox(-0.5F, -1.0986F, 5.8389F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.4F, -2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 161).addBox(-1.0F, 1.9014F, -0.1611F, 2.0F, 4.0F, 20.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.4F, -0.4451F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(205, 49).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.6562F, 16.6936F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(99, 247).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 13.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0898F, 15.9733F, 0.1226F, 0.0866F, 0.0107F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(268, 172).addBox(-0.5F, 0.7F, -0.5F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2449F, 11.7572F, 0.1747F, 0.043F, 0.0076F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(162, 259).addBox(-0.5F, 0.8F, -0.2F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1F, 9.0F, 0.2014F, 0.0942F, -0.0253F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(21.3117F, 29.6575F, 2.3382F, 0.6886F, 0.1586F, -0.601F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 10.1526F, 2.0504F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1854F, 11.9499F, 4.4269F, 0.6859F, 0.0442F, 0.0229F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-21.3117F, 29.6575F, 2.3382F, 0.6886F, -0.1586F, 0.601F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 10.1526F, 2.0504F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1854F, 11.9499F, 4.4269F, 0.6859F, -0.0442F, -0.0229F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(16.4183F, 24.875F, 2.6769F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.4183F, 24.875F, 2.6769F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6838F, -5.0159F, 0.288F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0744F, -0.277F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(308, 98).addBox(-1.5F, -1.7679F, -0.0951F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.062F, -3.6409F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(183, 303).addBox(-1.0F, -2.0F, -5.3F, 2.0F, 4.0F, 15.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.6038F, -12.3396F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(163, 283).addBox(0.6F, -1.0F, -18.5F, 2.0F, 2.0F, 35.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.6066F, -18.8282F, -1.5708F, -0.3229F, -1.5708F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(184, 304).addBox(-1.5F, 10.0F, 0.5F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -1.438F, -5.5409F, -1.8937F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1162F, -10.8226F, -1.1327F, 0.0975F, -0.0026F));

		PartDefinition Baleen = head.addOrReplaceChild("Baleen", CubeListBuilder.create(), PartPose.offset(6.7161F, 25.7552F, -68.2585F));

		PartDefinition Baleen2 = head.addOrReplaceChild("Baleen2", CubeListBuilder.create(), PartPose.offset(-6.7161F, 25.7552F, -68.2585F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(3.2F, 11.6405F, -7.4633F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-3.2F, 11.6405F, -7.4633F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 5.4312F, 2.4323F, 1.3003F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 352, 352);
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