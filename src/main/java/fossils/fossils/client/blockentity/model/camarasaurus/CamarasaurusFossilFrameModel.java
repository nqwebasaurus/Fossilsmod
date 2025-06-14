package fossils.fossils.client.blockentity.model.camarasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CamarasaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart base;
	private final ModelPart hip;
	private final ModelPart upperlegleft;
	private final ModelPart lowerlegleft;
	private final ModelPart footleft;
	private final ModelPart upperlegright;
	private final ModelPart lowerlegright;
	private final ModelPart footright;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart jaw2;
	private final ModelPart lowerteeth1;
	private final ModelPart lowerteeth2;
	private final ModelPart nose1;
	private final ModelPart head2;
	private final ModelPart nose2;
	private final ModelPart nose3;
	private final ModelPart teeth1;
	private final ModelPart upperarmleft;
	private final ModelPart lowerarmleft;
	private final ModelPart handleft;
	private final ModelPart clawleft;
	private final ModelPart upperarmright;
	private final ModelPart lowerarmright;
	private final ModelPart handright;
	private final ModelPart clawright;

	public CamarasaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.base = this.fossil.getChild("base");
		this.hip = this.base.getChild("hip");
		this.upperlegleft = this.hip.getChild("upperlegleft");
		this.lowerlegleft = this.upperlegleft.getChild("lowerlegleft");
		this.footleft = this.lowerlegleft.getChild("footleft");
		this.upperlegright = this.hip.getChild("upperlegright");
		this.lowerlegright = this.upperlegright.getChild("lowerlegright");
		this.footright = this.lowerlegright.getChild("footright");
		this.tail1 = this.hip.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.body = this.hip.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck = this.neck1.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.jaw2 = this.jaw.getChild("jaw2");
		this.lowerteeth1 = this.jaw2.getChild("lowerteeth1");
		this.lowerteeth2 = this.jaw2.getChild("lowerteeth2");
		this.nose1 = this.head.getChild("nose1");
		this.head2 = this.head.getChild("head2");
		this.nose2 = this.head2.getChild("nose2");
		this.nose3 = this.head2.getChild("nose3");
		this.teeth1 = this.head2.getChild("teeth1");
		this.upperarmleft = this.chest.getChild("upperarmleft");
		this.lowerarmleft = this.upperarmleft.getChild("lowerarmleft");
		this.handleft = this.lowerarmleft.getChild("handleft");
		this.clawleft = this.handleft.getChild("clawleft");
		this.upperarmright = this.chest.getChild("upperarmright");
		this.lowerarmright = this.upperarmright.getChild("lowerarmright");
		this.handright = this.lowerarmright.getChild("handright");
		this.clawright = this.handright.getChild("clawright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -48.0F, 19.0F, 1.0F, 48.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(1, 1).addBox(-0.5F, -62.0F, -23.0F, 1.0F, 62.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -14.0F, -0.5F, 1.0F, 29.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(1, 1).addBox(7.6F, -11.0F, 41.5F, 1.0F, 23.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -37.0F, -22.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition base = fossil.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hip = base.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -49.1F, 24.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition basin2_r1 = hip.addOrReplaceChild("basin2_r1", CubeListBuilder.create().texOffs(1, 51).addBox(-0.5F, -1.0F, 0.3F, 1.0F, 4.0F, 18.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.6115F, -8.5454F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upperlegleft = hip.addOrReplaceChild("upperlegleft", CubeListBuilder.create(), PartPose.offsetAndRotation(11.5F, 3.5408F, -4.0387F, 0.2182F, 0.0F, 0.0F));

		PartDefinition lowerlegleft = upperlegleft.addOrReplaceChild("lowerlegleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 23.3156F, 4.0657F, 0.3491F, 0.0F, 0.0F));

		PartDefinition footleft = lowerlegleft.addOrReplaceChild("footleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 18.8972F, -0.3149F, -0.3054F, 0.0F, 0.0F));

		PartDefinition upperlegright = hip.addOrReplaceChild("upperlegright", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.5F, 3.5408F, -4.0387F, -0.0436F, 0.0F, 0.0F));

		PartDefinition lowerlegright = upperlegright.addOrReplaceChild("lowerlegright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 23.3156F, 4.0657F, 0.3927F, 0.0F, 0.0F));

		PartDefinition footright = lowerlegright.addOrReplaceChild("footright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 18.8972F, -0.3149F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail1 = hip.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4092F, 8.9754F, -0.1541F, -0.3334F, 0.1376F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(1, 25).addBox(-0.5F, 0.3073F, 0.9429F, 1.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8388F, -1.4696F, 0.0873F, -0.0174F, -0.0015F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4852F, 18.2256F, 0.204F, -0.2314F, 0.0395F));

		PartDefinition tail3_r1 = tail2.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(1, 77).addBox(-0.5F, -0.8F, -3.3F, 1.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.638F, 3.4233F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(50, 86).addBox(-0.5F, 0.4113F, -0.9689F, 1.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6178F, 16.369F, 0.0915F, 0.3042F, 0.0275F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(1, 97).addBox(-0.5F, 0.3F, 0.6F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2026F, 15.2315F, 0.0903F, 0.2608F, 0.0233F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(23, 93).addBox(-0.5F, 0.3057F, 0.2693F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, 14.0F, -0.0983F, 0.478F, -0.0453F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0943F, 15.4693F, -0.257F, 0.5522F, -0.137F));

		PartDefinition tail7_r1 = tail6.addOrReplaceChild("tail7_r1", CubeListBuilder.create().texOffs(25, 27).addBox(-0.5F, 2.1303F, -20.9201F, 1.0F, 1.0F, 22.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0105F, 21.3081F, -0.0873F, 0.0043F, -0.0004F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create().texOffs(46, 51).addBox(-0.5F, -1.6539F, -28.8329F, 1.0F, 4.0F, 17.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, 0.6154F, -8.7125F));

		PartDefinition body3_r1 = body.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(89, 86).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6539F, -13.0329F, -0.1309F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(72, 45).addBox(-0.5F, -0.4422F, -14.6626F, 1.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0096F, -30.0879F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(62, 17).addBox(-0.5F, -0.2383F, -8.1472F, 1.0F, 3.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.3104F, -13.8298F, -0.1671F, 0.1008F, 0.0712F));

		PartDefinition neck = neck1.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(59, 14).addBox(-4.5773F, -0.9253F, -10.5651F, 1.0F, 3.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.0773F, 0.6807F, -7.8339F, -0.3318F, -0.0135F, -0.0427F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5F, -0.4642F, -15.0288F, 1.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0773F, -0.631F, -10.6417F, -0.2942F, 0.0193F, 0.0211F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(89, 20).addBox(-0.5F, 0.5078F, -15.2769F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0055F, -15.2425F, -0.1749F, -0.0482F, -0.0986F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2698F, -15.0053F, 0.473F, -0.0016F, 0.0425F));

		PartDefinition neck4_r1 = neck4.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(111, 84).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.7747F, -11.9007F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8193F, -11.9536F, 0.4458F, -0.1098F, -0.0774F));

		PartDefinition neck6_r1 = neck5.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(86, 155).addBox(-0.5F, -0.4521F, -0.3955F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2949F, -4.217F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck5_r1 = neck5.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(143, 88).addBox(-0.5F, 0.4485F, -1.1545F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.2949F, -11.117F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.0441F, -11.0239F, 0.4588F, -0.1175F, -0.0578F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, 0.2F, 0.2618F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3F, -5.8F, 0.48F, 0.0F, 0.0F));

		PartDefinition lowerteeth1 = jaw2.addOrReplaceChild("lowerteeth1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition lowerteeth2 = jaw2.addOrReplaceChild("lowerteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.0F, -2.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition nose1 = head.addOrReplaceChild("nose1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9F, -6.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -6.7F));

		PartDefinition nose2 = head2.addOrReplaceChild("nose2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.15F, -0.85F, 0.9163F, 0.0F, 0.0F));

		PartDefinition nose3 = head2.addOrReplaceChild("nose3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -2.15F, 1.2217F, 0.0F, 0.0F));

		PartDefinition teeth1 = head2.addOrReplaceChild("teeth1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.05F, -5.2F, 0.1384F, 0.0F, 0.0F));

		PartDefinition upperarmleft = chest.addOrReplaceChild("upperarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(13.5F, 23.1919F, -4.1476F, 0.2618F, 0.0F, 0.0F));

		PartDefinition lowerarmleft = upperarmleft.addOrReplaceChild("lowerarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.8835F, 0.2553F, -0.2618F, 0.0F, 0.0F));

		PartDefinition handleft = lowerarmleft.addOrReplaceChild("handleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.1183F, -3.4794F, 0.2182F, 0.0F, 0.0F));

		PartDefinition clawleft = handleft.addOrReplaceChild("clawleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6F, 11.8F, 0.9F, 0.0F, -0.2276F, 0.0F));

		PartDefinition upperarmright = chest.addOrReplaceChild("upperarmright", CubeListBuilder.create(), PartPose.offsetAndRotation(-13.5F, 23.1919F, -4.1476F, 0.8727F, 0.0F, 0.0F));

		PartDefinition lowerarmright = upperarmright.addOrReplaceChild("lowerarmright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.8835F, 0.2553F, -0.7413F, 0.0015F, 0.0061F));

		PartDefinition handright = lowerarmright.addOrReplaceChild("handright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.1183F, -3.4794F, 1.0036F, 0.0F, 0.0F));

		PartDefinition clawright = handright.addOrReplaceChild("clawright", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6F, 11.8F, 0.9F, 0.0F, 0.2276F, 0.0F));

		return LayerDefinition.create(meshdefinition, 183, 210);
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