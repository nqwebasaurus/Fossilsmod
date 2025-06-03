package fossils.fossils.client.blockentity.model.gastonia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GastoniaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart osteoderms17;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart leftleg4;
	private final ModelPart leftleg5;
	private final ModelPart leftleg6;
	private final ModelPart leftfoot3;
	private final ModelPart leftfoot4;
	private final ModelPart backPlates4;
	private final ModelPart body;
	private final ModelPart osteoderms16;
	private final ModelPart chest;
	private final ModelPart backPlates6;
	private final ModelPart osteoderms15;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck3;
	private final ModelPart osteoderms13;
	private final ModelPart neck2;
	private final ModelPart osteoderms14;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart backPlates5;
	private final ModelPart tail;
	private final ModelPart osteoderms22;
	private final ModelPart osteoderms7;
	private final ModelPart tail2;
	private final ModelPart osteoderms18;
	private final ModelPart tail3;
	private final ModelPart osteoderms19;
	private final ModelPart tail4;
	private final ModelPart osteoderms20;
	private final ModelPart tail5;
	private final ModelPart osteoderms21;

	public GastoniaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.osteoderms17 = this.hips.getChild("osteoderms17");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.leftleg4 = this.hips.getChild("leftleg4");
		this.leftleg5 = this.leftleg4.getChild("leftleg5");
		this.leftleg6 = this.leftleg5.getChild("leftleg6");
		this.leftfoot3 = this.leftleg6.getChild("leftfoot3");
		this.leftfoot4 = this.leftfoot3.getChild("leftfoot4");
		this.backPlates4 = this.hips.getChild("backPlates4");
		this.body = this.hips.getChild("body");
		this.osteoderms16 = this.body.getChild("osteoderms16");
		this.chest = this.body.getChild("chest");
		this.backPlates6 = this.chest.getChild("backPlates6");
		this.osteoderms15 = this.chest.getChild("osteoderms15");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck3 = this.chest.getChild("neck3");
		this.osteoderms13 = this.neck3.getChild("osteoderms13");
		this.neck2 = this.neck3.getChild("neck2");
		this.osteoderms14 = this.neck2.getChild("osteoderms14");
		this.head = this.neck2.getChild("head");
		this.bone = this.head.getChild("bone");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.backPlates5 = this.body.getChild("backPlates5");
		this.tail = this.hips.getChild("tail");
		this.osteoderms22 = this.tail.getChild("osteoderms22");
		this.osteoderms7 = this.tail.getChild("osteoderms7");
		this.tail2 = this.tail.getChild("tail2");
		this.osteoderms18 = this.tail2.getChild("osteoderms18");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms19 = this.tail3.getChild("osteoderms19");
		this.tail4 = this.tail3.getChild("tail4");
		this.osteoderms20 = this.tail4.getChild("osteoderms20");
		this.tail5 = this.tail4.getChild("tail5");
		this.osteoderms21 = this.tail5.getChild("osteoderms21");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -19.0F, 5.0F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.9F, -2.0F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -16.0F, -12.5F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-3.5F, -5.5F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -16.0F, -12.5F, 0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-1.8F, -8.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -19.0F, 5.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -19.9F, 6.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(71, 71).addBox(0.0F, 0.6199F, 0.5834F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -3.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(72, 97).addBox(-0.5F, -0.6917F, -0.3084F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 0.4569F, -7.616F, -0.0873F, 0.0174F, -0.0015F));

		PartDefinition osteoderms17 = hips.addOrReplaceChild("osteoderms17", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.5F, -14.066F, -8.4611F, -0.3499F, 0.0656F, -0.0239F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(7.4F, 1.4999F, -0.1448F, 0.1658F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1012F, -3.5118F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.6678F, 2.5803F, -0.4887F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4752F, 0.5373F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftleg4 = hips.addOrReplaceChild("leftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.4F, 1.4999F, -0.1448F, -0.1833F, 0.0F, 0.0F));

		PartDefinition leftleg5 = leftleg4.addOrReplaceChild("leftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1012F, -3.5118F, 0.0874F, 0.0049F, 0.0016F));

		PartDefinition leftleg6 = leftleg5.addOrReplaceChild("leftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.6678F, 2.5803F, -0.358F, -0.0075F, -0.002F));

		PartDefinition leftfoot3 = leftleg6.addOrReplaceChild("leftfoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftfoot4 = leftfoot3.addOrReplaceChild("leftfoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4752F, 0.5373F, 0.4712F, 0.0F, 0.0F));

		PartDefinition backPlates4 = hips.addOrReplaceChild("backPlates4", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.1F, -14.7511F, -8.4674F, 0.0F, 0.2618F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -9.3F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(13, 37).addBox(0.0F, 0.7082F, -0.3785F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition osteoderms16 = body.addOrReplaceChild("osteoderms16", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -11.9308F, -4.1488F, -0.1309F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -6.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 43).addBox(-2.5354F, 0.1838F, 0.0591F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 87).addBox(-2.5354F, -0.0794F, 2.8144F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.2793F, 0.0F, 0.0F));

		PartDefinition backPlates6 = chest.addOrReplaceChild("backPlates6", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4293F, -7.1716F, -5.8763F, 0.0F, -0.0349F, 0.0015F));

		PartDefinition osteoderms15 = chest.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -11.3828F, -5.6469F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.3F, 8.0973F, -3.0537F, 0.4561F, 0.1025F, -0.1907F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 5.0571F, 2.3001F, -0.4968F, -0.9643F, 0.997F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2181F, 5.8808F, -2.9354F, 1.0401F, 0.6496F, -0.633F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.3F, 8.0973F, -3.0537F, -0.3141F, 0.0008F, 0.2182F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 5.0571F, 2.3001F, -0.3129F, 1.0161F, -0.7774F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2181F, 5.8808F, -2.9354F, 1.1054F, -0.6437F, 0.5477F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8F, -6.8F, 0.1418F, -0.1728F, -0.0245F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(98, 99).addBox(0.0F, 0.0F, -4.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition osteoderms13 = neck3.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -14.7653F, -1.791F, 0.0F, -0.1396F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.7F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(36, 87).addBox(0.0F, 0.1F, -4.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition osteoderms14 = neck2.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offset(-2.0F, -14.7653F, -1.9866F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8781F, -4.2801F, 0.1227F, -0.39F, -0.0469F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.1764F, 0.2042F, -1.419F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 0.9876F, -5.2416F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.9876F, -5.2416F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 2.0399F, -0.908F, -0.1222F, 0.0F, 0.0F));

		PartDefinition backPlates5 = body.addOrReplaceChild("backPlates5", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.7F, -7.4885F, 1.4256F, -0.1586F, -0.4921F, 0.0754F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(12, 73).addBox(-0.5F, 0.1F, 0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.7F, 3.1F, -0.4018F, 0.0402F, -0.0171F));

		PartDefinition osteoderms22 = tail.addOrReplaceChild("osteoderms22", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, -0.9664F, 7.9473F, 0.0F, -0.0349F, 0.0F));

		PartDefinition osteoderms7 = tail.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -30.5928F, -8.6771F, -0.4189F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(67, 5).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0723F, 0.2611F, 0.0187F));

		PartDefinition osteoderms18 = tail2.addOrReplaceChild("osteoderms18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -33.9489F, -4.8011F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(-1, 49).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.1929F, 0.3085F, 0.1764F));

		PartDefinition osteoderms19 = tail3.addOrReplaceChild("osteoderms19", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1089F, 0.397F, 10.2053F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(53, 52).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.2292F, 0.35F, 0.1639F));

		PartDefinition osteoderms20 = tail4.addOrReplaceChild("osteoderms20", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -12.7721F, 1.1034F, -0.4014F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.3421F, -0.3865F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2262F, 8.9999F, 0.1579F, 0.4384F, 0.1503F));

		PartDefinition osteoderms21 = tail5.addOrReplaceChild("osteoderms21", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -12.7662F, -1.0275F, -0.5062F, -0.0153F, 0.0085F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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