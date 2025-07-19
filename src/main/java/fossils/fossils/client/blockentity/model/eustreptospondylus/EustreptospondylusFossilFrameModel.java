package fossils.fossils.client.blockentity.model.eustreptospondylus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EustreptospondylusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart head2;
	private final ModelPart headsep;
	private final ModelPart head3;
	private final ModelPart head5;
	private final ModelPart Tteeth2;
	private final ModelPart Tteeth1;
	private final ModelPart head6;
	private final ModelPart Rcrest;
	private final ModelPart Rcrest2;
	private final ModelPart Rcrest3;
	private final ModelPart Rcrest4;
	private final ModelPart jaw;
	private final ModelPart jaw2;
	private final ModelPart jaw3;
	private final ModelPart jaw4;
	private final ModelPart Bteeth2;
	private final ModelPart Bteeth1;
	private final ModelPart masseter;
	private final ModelPart throat;
	private final ModelPart leftArm3;
	private final ModelPart leftArm2;
	private final ModelPart leftArm;
	private final ModelPart rightArm3;
	private final ModelPart rightArm2;
	private final ModelPart rightArm;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg;

	public EustreptospondylusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.head2 = this.head.getChild("head2");
		this.headsep = this.head2.getChild("headsep");
		this.head3 = this.headsep.getChild("head3");
		this.head5 = this.headsep.getChild("head5");
		this.Tteeth2 = this.head5.getChild("Tteeth2");
		this.Tteeth1 = this.headsep.getChild("Tteeth1");
		this.head6 = this.headsep.getChild("head6");
		this.Rcrest = this.headsep.getChild("Rcrest");
		this.Rcrest2 = this.Rcrest.getChild("Rcrest2");
		this.Rcrest3 = this.headsep.getChild("Rcrest3");
		this.Rcrest4 = this.Rcrest3.getChild("Rcrest4");
		this.jaw = this.head.getChild("jaw");
		this.jaw2 = this.jaw.getChild("jaw2");
		this.jaw3 = this.jaw2.getChild("jaw3");
		this.jaw4 = this.jaw2.getChild("jaw4");
		this.Bteeth2 = this.jaw4.getChild("Bteeth2");
		this.Bteeth1 = this.jaw2.getChild("Bteeth1");
		this.masseter = this.jaw.getChild("masseter");
		this.throat = this.neck3.getChild("throat");
		this.leftArm3 = this.chest.getChild("leftArm3");
		this.leftArm2 = this.leftArm3.getChild("leftArm2");
		this.leftArm = this.leftArm2.getChild("leftArm");
		this.rightArm3 = this.chest.getChild("rightArm3");
		this.rightArm2 = this.rightArm3.getChild("rightArm2");
		this.rightArm = this.rightArm2.getChild("rightArm");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.leftLeg4 = this.hips.getChild("leftLeg4");
		this.leftLeg2 = this.leftLeg4.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg = this.leftLeg3.getChild("leftLeg");
		this.rightLeg4 = this.hips.getChild("rightLeg4");
		this.rightLeg2 = this.rightLeg4.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg = this.rightLeg3.getChild("rightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -30.0F, 3.6F, 1.0F, 30.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.6F, -7.5F, -0.5F, 1.0F, 27.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(3.0F, -19.5F, -18.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-1.4F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.0F, -19.5F, -18.0F, -0.1309F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-9.9F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -19.5F, 4.1F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, -0.8525F, -4.3215F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -30.45F, 4.0F, -0.03F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, 0.0264F, -13.032F, 1.0F, 2.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8525F, -4.1215F, 0.1588F, -0.1792F, 0.0156F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0736F, -12.932F, 0.0646F, 0.0435F, 0.0028F));

		PartDefinition Box_r1 = chest.addOrReplaceChild("Box_r1", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, 0.6977F, -9.0523F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -0.12F, 0.1571F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0123F, -8.62F, -0.1864F, 0.0F, 0.0F));

		PartDefinition Box_r2 = neck1.addOrReplaceChild("Box_r2", CubeListBuilder.create().texOffs(36, 45).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0155F, -4.1812F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4155F, -3.9812F, -0.1807F, 0.2305F, 0.0448F));

		PartDefinition Box_r3 = neck2.addOrReplaceChild("Box_r3", CubeListBuilder.create().texOffs(24, 56).addBox(-0.5F, 0.7F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0095F, -4.9029F, -0.1396F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4095F, -4.8029F, 0.4446F, 0.2496F, 0.08F));

		PartDefinition Box_r4 = neck3.addOrReplaceChild("Box_r4", CubeListBuilder.create().texOffs(66, 33).addBox(-0.5F, 0.3F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2874F, -3.2898F, -0.3142F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8874F, -3.1898F, -0.3478F, 0.1719F, 0.0304F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1278F, 0.0199F));

		PartDefinition headsep = head2.addOrReplaceChild("headsep", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -7.8F, 0.0859F, 0.0F, 0.0F));

		PartDefinition head3 = headsep.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.9F, 0.488F, 0.0F, 0.0F));

		PartDefinition head5 = headsep.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -3.0F, -0.2405F, 0.0F, 0.0F));

		PartDefinition Tteeth2 = head5.addOrReplaceChild("Tteeth2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.3F, -2.8F));

		PartDefinition Tteeth1 = headsep.addOrReplaceChild("Tteeth1", CubeListBuilder.create(), PartPose.offset(0.0F, 1.9F, -3.0F));

		PartDefinition head6 = headsep.addOrReplaceChild("head6", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition Rcrest = headsep.addOrReplaceChild("Rcrest", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.5F, -1.9F, 0.0681F, 0.1634F, 0.0F));

		PartDefinition Rcrest2 = Rcrest.addOrReplaceChild("Rcrest2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0229F, -0.2045F, 3.4654F, -0.0618F, 0.411F, 0.0F));

		PartDefinition Rcrest3 = headsep.addOrReplaceChild("Rcrest3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.5F, -1.9F, 0.0681F, -0.1634F, 0.0F));

		PartDefinition Rcrest4 = Rcrest3.addOrReplaceChild("Rcrest4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0229F, -0.2045F, 3.4654F, -0.0618F, -0.411F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.4278F, 1.0199F, 0.5672F, 0.0017F, 0.0F));

		PartDefinition jaw2 = jaw.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0018F, 0.3055F, -5.3295F, 0.0782F, 0.0F, 0.0F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -1.1F, -0.1955F, 0.0F, 0.0F));

		PartDefinition jaw4 = jaw2.addOrReplaceChild("jaw4", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -5.9F));

		PartDefinition Bteeth2 = jaw4.addOrReplaceChild("Bteeth2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.8F, -3.0F));

		PartDefinition Bteeth1 = jaw2.addOrReplaceChild("Bteeth1", CubeListBuilder.create(), PartPose.offset(0.5F, -1.7F, -5.99F));

		PartDefinition masseter = jaw.addOrReplaceChild("masseter", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0018F, -2.1945F, -0.1795F, -0.3519F, 0.0F, 0.0F));

		PartDefinition throat = neck3.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.2126F, -1.6898F, -0.0782F, 0.0F, 0.0F));

		PartDefinition leftArm3 = chest.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 8.5123F, -6.82F, 1.0482F, 0.0F, -0.1564F));

		PartDefinition leftArm2 = leftArm3.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 5.0F, 0.0F, -1.2919F, 0.0F, 0.0F));

		PartDefinition leftArm = leftArm2.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 4.2343F, -0.2555F, 0.1017F, -0.0369F, 0.5427F));

		PartDefinition rightArm3 = chest.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 8.5123F, -6.82F, 0.7428F, 0.0F, 0.1564F));

		PartDefinition rightArm2 = rightArm3.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 5.0F, 0.0F, -0.8992F, 0.0F, 0.0F));

		PartDefinition rightArm = rightArm2.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 4.2343F, -0.2555F, 0.1032F, 0.0325F, -0.4992F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(44, 45).addBox(-0.5F, 0.14F, -0.4193F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 54).addBox(-0.5F, 0.14F, 9.2807F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9525F, 6.7785F, -0.0926F, 0.1664F, -0.1023F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(34, 16).addBox(-0.5F, -0.1013F, -0.2453F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.24F, 9.9807F, 0.1056F, 0.1302F, 0.0138F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(18, 18).addBox(-0.5F, 0.1976F, -0.3848F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 30).addBox(-0.5F, 0.1976F, 12.3152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4013F, 11.6547F, 0.0769F, 0.2119F, 0.1016F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2624F, -0.2428F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1024F, 13.0152F, -0.1781F, 0.344F, -0.0606F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, 0.2313F, -0.0381F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0376F, 15.3572F, -0.2702F, -0.2527F, 0.0691F));

		PartDefinition leftLeg4 = hips.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8027F, 1.9475F, 0.3739F, -0.785F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg4.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0471F, 11.9298F, 0.696F, 1.2645F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.9046F, 1.699F, -1.7448F, 0.0F, 0.0F));

		PartDefinition leftLeg = leftLeg3.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.9F, -0.5F, 2.0009F, -0.0211F, -0.0578F));

		PartDefinition rightLeg4 = hips.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8186F, 1.6874F, 0.3974F, -0.093F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg4.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0471F, 11.9298F, 0.696F, 0.7036F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.9046F, 1.699F, -0.9592F, 0.0F, 0.0F));

		PartDefinition rightLeg = rightLeg3.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.9F, -0.5F, 0.3906F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 90, 90);
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