package fossils.fossils.client.blockentity.model.piscobalaena;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PiscobalaenaFossilFrameModel extends SkullModelBase {
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
	private final ModelPart tail5;
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

	public PiscobalaenaFossilFrameModel(ModelPart root) {
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
		this.tail5 = this.tail4.getChild("tail5");
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

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -165.0543F, -13.5138F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 67).addBox(-8.6F, -1.0F, -20.0F, 2.0F, 2.0F, 40.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 11.8223F, 1.5651F, -1.5708F, 0.3054F, -1.5708F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(45, 93).addBox(-1.0F, -4.9084F, 1.0097F, 2.0F, 2.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.8354F, -4.4206F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 94).addBox(-1.0F, -2.9084F, 0.0097F, 2.0F, 4.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.8354F, -4.4206F, 0.3054F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(83, 91).addBox(-1.0F, -0.5841F, -0.1731F, 2.0F, 4.0F, 13.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2027F, 6.8691F, 0.1396F, 0.0F, 0.0F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5893F, 12.8291F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 49).addBox(-1.0F, -2.9904F, -0.9206F, 2.0F, 4.0F, 19.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.8F, 0.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(50, 24).addBox(-1.0F, -1.25F, -0.025F, 2.0F, 4.0F, 19.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1509F, 17.9254F, 0.1924F, 0.0868F, 0.0091F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(1, 73).addBox(-1.0F, 0.0F, -0.025F, 2.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2523F, 18.4632F, 0.1222F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(1, 24).addBox(-1.0F, -0.85F, -0.275F, 2.0F, 4.0F, 20.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.9113F, 17.9951F, 0.0786F, 0.0435F, 0.0034F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2362F, 20.061F, 0.3406F, 0.0411F, 0.0146F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(72, 10).addBox(-3.9F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.1096F, 3.3959F, -1.5708F, -0.2094F, -1.5708F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(73, 11).addBox(-0.5F, 1.0F, 1.4F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 3.0635F, 6.2145F, -1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, 0.7487F, 7.0474F, 1.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0656F, -7.3997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5025F, 18.2822F, 0.3344F, -0.0016F, 0.1379F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 49).addBox(-0.5F, 0.7514F, -0.7861F, 1.0F, 4.0F, 19.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.4F, -0.4451F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(45, 73).addBox(-0.5F, 0.125F, -0.275F, 1.0F, 4.0F, 16.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.8175F, 17.2382F, -0.661F, 0.0731F, 0.1645F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(96, 24).addBox(-0.7F, -0.9F, 0.525F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.0898F, 15.5733F, -0.2646F, -0.0194F, 0.0956F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6394F, 11.8232F, -0.1633F, -0.0144F, 0.1793F));

		PartDefinition cube_r9 = tail3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(119, 64).addBox(-0.175F, -2.5F, -0.375F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2F, 0.9F, 0.0F, -0.0567F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, 9.0F, -0.086F, -0.0283F, 0.1776F));

		PartDefinition cube_r10 = tail4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(118, 115).addBox(-0.5F, -0.2F, -10.1F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.0F, -0.0175F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 96).addBox(-0.475F, -0.2F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(20.7166F, 18.2534F, 3.3773F, 0.4553F, -0.2023F, -0.6705F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 7.9428F, 0.4483F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1778F, 8.2202F, 2.6692F, 0.7731F, 0.0442F, 0.0229F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-20.7166F, 18.2534F, 3.3773F, 0.495F, 0.0207F, 1.0214F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 7.9428F, 0.4483F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.402F, 12.6065F, 8.9206F, 2.3685F, 0.0442F, 3.1187F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(16.4183F, 24.875F, 2.6768F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.4183F, 24.875F, 2.6768F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6838F, -5.0159F, 0.288F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0744F, -0.277F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(4, 153).addBox(-1.5F, -2.2679F, 3.1049F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(1, 150).addBox(-1.5F, -2.2679F, -0.8951F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.062F, -3.6409F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(1, 140).addBox(-1.5F, -1.0F, -2.9F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.938F, -5.8409F, -0.3229F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2643F, -8.2586F, -0.48F, 0.0F, 0.0F));

		PartDefinition Baleen = head.addOrReplaceChild("Baleen", CubeListBuilder.create(), PartPose.offsetAndRotation(7.1161F, -1.0034F, -30.1406F, -0.6975F, 0.0336F, 0.0401F));

		PartDefinition Baleen2 = head.addOrReplaceChild("Baleen2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.1161F, -1.0034F, -30.1406F, -0.6975F, -0.0336F, -0.0401F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(3.2F, 11.6405F, -7.4633F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-3.2F, 11.6405F, -7.4633F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 0.8218F, -3.2457F, 0.1222F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 208, 208);
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