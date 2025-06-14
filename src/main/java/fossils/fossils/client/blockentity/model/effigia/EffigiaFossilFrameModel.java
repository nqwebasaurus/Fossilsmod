package fossils.fossils.client.blockentity.model.effigia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EffigiaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart bodyback;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart legL7;
	private final ModelPart legL8;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart bodymiddle;
	private final ModelPart bodyfront;
	private final ModelPart ArmL;
	private final ModelPart ArmL2;
	private final ModelPart ArmL3;
	private final ModelPart ArmL4;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart upperjaw;

	public EffigiaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.bodyback = this.body.getChild("bodyback");
		this.legL = this.bodyback.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.legL3 = this.legL2.getChild("legL3");
		this.legL4 = this.legL3.getChild("legL4");
		this.legL5 = this.bodyback.getChild("legL5");
		this.legL6 = this.legL5.getChild("legL6");
		this.legL7 = this.legL6.getChild("legL7");
		this.legL8 = this.legL7.getChild("legL8");
		this.tail = this.bodyback.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.bodymiddle = this.bodyback.getChild("bodymiddle");
		this.bodyfront = this.bodymiddle.getChild("bodyfront");
		this.ArmL = this.bodyfront.getChild("ArmL");
		this.ArmL2 = this.ArmL.getChild("ArmL2");
		this.ArmL3 = this.bodyfront.getChild("ArmL3");
		this.ArmL4 = this.ArmL3.getChild("ArmL4");
		this.neck = this.bodyfront.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.upperjaw = this.head.getChild("upperjaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -16.65F, 2.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(1, 1).addBox(-0.5F, -17.65F, -15.2F, 1.0F, 19.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(-3, 1).addBox(-4.5F, -13.95F, -15.21F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.75F, 0.0F));

		PartDefinition crossbeam1_r1 = fossil.addOrReplaceChild("crossbeam1_r1", CubeListBuilder.create().texOffs(-1, 1).addBox(-3.0F, -1.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -15.05F, 3.5F, 0.0F, -0.0524F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -3.15F, -8.0F));

		PartDefinition bodyback = body.addOrReplaceChild("bodyback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -12.3F, 7.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition frame8_r1 = bodyback.addOrReplaceChild("frame8_r1", CubeListBuilder.create().texOffs(32, 0).addBox(-0.49F, -0.2F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.9F, 1.3F, -0.0262F, 0.0F, 0.0F));

		PartDefinition legL = bodyback.addOrReplaceChild("legL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, -0.65F, 4.05F, 0.1309F, 0.0F, 0.0F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, 9.5824F, -0.3681F, 1.2654F, 0.0F, 0.0F));

		PartDefinition legL3 = legL2.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.8468F, 1.0613F, -1.9635F, 0.0F, 0.0F));

		PartDefinition legL4 = legL3.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.05F, 0.5383F, -0.3054F, 0.0F, 0.0F));

		PartDefinition legL5 = bodyback.addOrReplaceChild("legL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, -0.65F, 4.05F, -0.7854F, 0.0F, 0.0F));

		PartDefinition legL6 = legL5.addOrReplaceChild("legL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.75F, 9.5824F, -0.3681F, 1.0472F, 0.0F, 0.0F));

		PartDefinition legL7 = legL6.addOrReplaceChild("legL7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.8468F, 1.0613F, -1.4399F, 0.0F, 0.0F));

		PartDefinition legL8 = legL7.addOrReplaceChild("legL8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.05F, 0.5383F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail = bodyback.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -2.6F, 7.0F));

		PartDefinition frame9_r1 = tail.addOrReplaceChild("frame9_r1", CubeListBuilder.create().texOffs(16, 18).addBox(-0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.5939F, -1.8606F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5939F, 9.7394F, 0.1309F, 0.0F, 0.0F));

		PartDefinition frame10_r1 = tail2.addOrReplaceChild("frame10_r1", CubeListBuilder.create().texOffs(0, 15).addBox(-0.49F, -15.55F, 9.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 16.0311F, -9.4887F, -0.0017F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.541F, -0.0748F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.0189F, 11.2113F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(17, 3).addBox(-0.49F, 0.5897F, -0.1907F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.041F, 12.9252F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bodymiddle = bodyback.addOrReplaceChild("bodymiddle", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.6984F, -9.6742F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.8F, 1.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bodyfront = bodymiddle.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0901F, -9.6943F, 0.2182F, 0.0F, 0.0F));

		PartDefinition frame6_r1 = bodyfront.addOrReplaceChild("frame6_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.51F, 0.0013F, 4.2368F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.2156F, -8.9003F, -0.0436F, 0.0F, 0.0F));

		PartDefinition frame5_r1 = bodyfront.addOrReplaceChild("frame5_r1", CubeListBuilder.create().texOffs(33, 29).addBox(-0.5F, -0.1582F, -3.9297F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.5817F, -4.9163F, 0.0262F, 0.0F, 0.0F));

		PartDefinition ArmL = bodyfront.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 4.7117F, -6.396F, 1.1727F, 0.1611F, -0.0674F));

		PartDefinition ArmL2 = ArmL.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.15F, 5.55F, 0.3F, -2.1817F, 0.0F, 0.0F));

		PartDefinition ArmL3 = bodyfront.addOrReplaceChild("ArmL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 4.7117F, -6.396F, 1.0877F, -0.2163F, 0.0289F));

		PartDefinition ArmL4 = ArmL3.addOrReplaceChild("ArmL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.15F, 5.55F, 0.3F, -1.789F, 0.0F, 0.0F));

		PartDefinition neck = bodyfront.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6065F, -9.4627F, -0.7418F, 0.0F, 0.0F));

		PartDefinition frame4_r1 = neck.addOrReplaceChild("frame4_r1", CubeListBuilder.create().texOffs(15, 5).addBox(-0.52F, -0.4576F, -0.4608F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.3592F, -2.3403F, 0.2007F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3588F, -2.659F, -0.1355F, -0.2595F, 0.035F));

		PartDefinition frame3_r1 = neck2.addOrReplaceChild("frame3_r1", CubeListBuilder.create().texOffs(23, 31).addBox(-0.5F, -0.1326F, 0.1515F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.432F, -7.6654F, 0.0908F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.082F, -7.3154F, 0.1168F, -0.4389F, -0.3527F));

		PartDefinition frame1_r1 = neck3.addOrReplaceChild("frame1_r1", CubeListBuilder.create().texOffs(54, 52).addBox(-0.49F, -1.4244F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.95F, -4.6F, 0.48F, 0.0F, 0.0F));

		PartDefinition frame2_r1 = neck3.addOrReplaceChild("frame2_r1", CubeListBuilder.create().texOffs(14, 32).addBox(-0.5F, -0.1878F, -1.0493F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.4F, -3.5F, 0.0175F, -0.0349F, -0.0003F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0258F, -4.4268F, 0.303F, 0.0393F, -0.1249F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.2776F, -0.3125F, 0.0432F, 0.0499F, 0.0F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offset(0.5F, 1.2776F, -0.3125F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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