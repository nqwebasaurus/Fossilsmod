package fossils.fossils.client.blockentity.model.anatosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnatosuchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart backLeftLeg;
	private final ModelPart backLeftLeg2;
	private final ModelPart backLeftLeg3;
	private final ModelPart backLeftLeg4;
	private final ModelPart backRightLeg;
	private final ModelPart backRightLeg2;
	private final ModelPart backRightLeg3;
	private final ModelPart backRightLeg4;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart frontLeftLeg;
	private final ModelPart frontLeftLeg2;
	private final ModelPart frontLeftLeg3;
	private final ModelPart frontRightLeg;
	private final ModelPart frontRightLeg2;
	private final ModelPart frontRightLeg3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftside;
	private final ModelPart rightside;
	private final ModelPart horn;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public AnatosuchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.backLeftLeg = this.main.getChild("backLeftLeg");
		this.backLeftLeg2 = this.backLeftLeg.getChild("backLeftLeg2");
		this.backLeftLeg3 = this.backLeftLeg2.getChild("backLeftLeg3");
		this.backLeftLeg4 = this.backLeftLeg3.getChild("backLeftLeg4");
		this.backRightLeg = this.main.getChild("backRightLeg");
		this.backRightLeg2 = this.backRightLeg.getChild("backRightLeg2");
		this.backRightLeg3 = this.backRightLeg2.getChild("backRightLeg3");
		this.backRightLeg4 = this.backRightLeg3.getChild("backRightLeg4");
		this.body = this.main.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.frontLeftLeg = this.body3.getChild("frontLeftLeg");
		this.frontLeftLeg2 = this.frontLeftLeg.getChild("frontLeftLeg2");
		this.frontLeftLeg3 = this.frontLeftLeg2.getChild("frontLeftLeg3");
		this.frontRightLeg = this.body3.getChild("frontRightLeg");
		this.frontRightLeg2 = this.frontRightLeg.getChild("frontRightLeg2");
		this.frontRightLeg3 = this.frontRightLeg2.getChild("frontRightLeg3");
		this.neck = this.body3.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftside = this.head.getChild("leftside");
		this.rightside = this.head.getChild("rightside");
		this.horn = this.head.getChild("horn");
		this.tail = this.main.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -9.0F, 2.9F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(1.9F, -8.5F, -6.4F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(1.1F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.9F, -8.5F, -6.4F, -0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -8.5F, 3.4F, 0.0F, 0.0F, 1.5708F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -3.25F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 30).addBox(0.0F, 0.5563F, 0.1637F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -9.75F, 5.9F, -0.2269F, 0.0F, 0.0F));

		PartDefinition backLeftLeg = main.addOrReplaceChild("backLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -8.8F, 6.6F, -0.3491F, 0.0F, 0.0F));

		PartDefinition backLeftLeg2 = backLeftLeg.addOrReplaceChild("backLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5394F, -1.5987F, 0.5236F, 0.0F, 0.0F));

		PartDefinition backLeftLeg3 = backLeftLeg2.addOrReplaceChild("backLeftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, 4.9365F, 0.4649F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backLeftLeg4 = backLeftLeg3.addOrReplaceChild("backLeftLeg4", CubeListBuilder.create(), PartPose.offset(0.25F, -0.0204F, -1.5008F));

		PartDefinition backRightLeg = main.addOrReplaceChild("backRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -8.8F, 6.6F, 0.2618F, 0.0F, 0.0F));

		PartDefinition backRightLeg2 = backRightLeg.addOrReplaceChild("backRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5394F, -1.5987F, 0.6545F, 0.0F, 0.0F));

		PartDefinition backRightLeg3 = backRightLeg2.addOrReplaceChild("backRightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 4.9365F, 0.4649F, -0.3491F, 0.0F, 0.0F));

		PartDefinition backRightLeg4 = backRightLeg3.addOrReplaceChild("backRightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, -0.0204F, -1.5008F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.425F, 5.85F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-1, 19).addBox(-1.5F, 0.05F, -0.35F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.075F, -3.85F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1F, -4.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(11, 24).addBox(-1.5F, 0.05F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.025F, -0.05F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.075F, -2.85F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 9).addBox(-2.0F, 0.35F, 0.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 0.05F, -4.05F, 0.0873F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg = body3.addOrReplaceChild("frontLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 2.8F, -2.45F, -0.2174F, 0.0189F, 0.0852F));

		PartDefinition frontLeftLeg2 = frontLeftLeg.addOrReplaceChild("frontLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9717F, 0.56F, -0.5806F, 0.2069F, -0.0822F));

		PartDefinition frontLeftLeg3 = frontLeftLeg2.addOrReplaceChild("frontLeftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5501F, -0.1535F, 0.8247F, 0.0F, 0.0F));

		PartDefinition frontRightLeg = body3.addOrReplaceChild("frontRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 2.8F, -2.45F, 0.7418F, 0.0F, 0.0F));

		PartDefinition frontRightLeg2 = frontRightLeg.addOrReplaceChild("frontRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9717F, 0.56F, -0.8727F, 0.0F, 0.0F));

		PartDefinition frontRightLeg3 = frontRightLeg2.addOrReplaceChild("frontRightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5501F, -0.1535F, 0.1265F, 0.0F, 0.0F));

		PartDefinition neck = body3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2872F, -3.9962F, 0.1933F, 0.3694F, 0.226F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(39, 19).addBox(-0.5F, 0.0736F, -0.1997F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0034F, -1.9822F, -0.0262F, -0.0349F, 0.0009F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1534F, -1.9322F, 0.4363F, 0.3491F, 0.0F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 33).addBox(-1.5F, -0.3263F, -2.0102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.55F, -0.05F, -0.1484F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5436F, -1.999F, 0.149F, -0.0077F, -0.139F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7252F, 0.0537F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftside = head.addOrReplaceChild("leftside", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7143F, -0.3137F, -1.7528F, 0.043F, -0.0076F, 0.1744F));

		PartDefinition rightside = head.addOrReplaceChild("rightside", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7143F, -0.3137F, -1.7528F, 0.043F, 0.0076F, -0.1744F));

		PartDefinition horn = head.addOrReplaceChild("horn", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.364F, -6.7315F, 0.1091F, 0.0F, 0.0F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0998F, 0.026F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -8.7083F, 8.709F, -0.5186F, 0.1139F, -0.0647F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(13, 7).addBox(0.0F, 0.0028F, -0.1325F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0953F, 4.8628F, -0.0975F, 0.1737F, -0.0169F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(24, 2).addBox(0.0F, 0.0045F, -0.4019F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0199F, 4.7417F, 0.1264F, 0.2598F, 0.0326F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(13, 0).addBox(0.0F, 0.1549F, 0.0734F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0671F, 2.8764F, 0.3878F, 0.325F, 0.1297F));

		return LayerDefinition.create(meshdefinition, 58, 58);
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