package fossils.fossils.client.blockentity.model.ankylosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnkylosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart osteoderms5;
	private final ModelPart bone2;
	private final ModelPart osteoderms19;
	private final ModelPart bone3;
	private final ModelPart bone;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart body;
	private final ModelPart osteoderms4;
	private final ModelPart osteoderms18;
	private final ModelPart body2;
	private final ModelPart osteoderms11;
	private final ModelPart osteoderms17;
	private final ModelPart body3;
	private final ModelPart osteoderms9;
	private final ModelPart osteoderms16;
	private final ModelPart chest;
	private final ModelPart osteoderms3;
	private final ModelPart osteoderms15;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand2;
	private final ModelPart righthand;
	private final ModelPart neck;
	private final ModelPart osteoderms10;
	private final ModelPart osteoderms14;
	private final ModelPart osteoderms2;
	private final ModelPart neck2;
	private final ModelPart osteoderms;
	private final ModelPart osteoderms13;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart osteoderms6;
	private final ModelPart osteoderms20;
	private final ModelPart tail2;
	private final ModelPart osteoderms7;
	private final ModelPart osteoderms21;
	private final ModelPart tail3;
	private final ModelPart osteoderms12;
	private final ModelPart osteoderms22;
	private final ModelPart osteoderms8;
	private final ModelPart leftClub2;
	private final ModelPart rightClub2;

	public AnkylosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.osteoderms5 = this.hips.getChild("osteoderms5");
		this.bone2 = this.osteoderms5.getChild("bone2");
		this.osteoderms19 = this.hips.getChild("osteoderms19");
		this.bone3 = this.osteoderms19.getChild("bone3");
		this.bone = this.hips.getChild("bone");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.body = this.hips.getChild("body");
		this.osteoderms4 = this.body.getChild("osteoderms4");
		this.osteoderms18 = this.body.getChild("osteoderms18");
		this.body2 = this.body.getChild("body2");
		this.osteoderms11 = this.body2.getChild("osteoderms11");
		this.osteoderms17 = this.body2.getChild("osteoderms17");
		this.body3 = this.body2.getChild("body3");
		this.osteoderms9 = this.body3.getChild("osteoderms9");
		this.osteoderms16 = this.body3.getChild("osteoderms16");
		this.chest = this.body3.getChild("chest");
		this.osteoderms3 = this.chest.getChild("osteoderms3");
		this.osteoderms15 = this.chest.getChild("osteoderms15");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand2 = this.leftarm2.getChild("lefthand2");
		this.lefthand = this.lefthand2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand2 = this.rightarm2.getChild("righthand2");
		this.righthand = this.righthand2.getChild("righthand");
		this.neck = this.chest.getChild("neck");
		this.osteoderms10 = this.neck.getChild("osteoderms10");
		this.osteoderms14 = this.neck.getChild("osteoderms14");
		this.osteoderms2 = this.neck.getChild("osteoderms2");
		this.neck2 = this.neck.getChild("neck2");
		this.osteoderms = this.neck2.getChild("osteoderms");
		this.osteoderms13 = this.neck2.getChild("osteoderms13");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.osteoderms6 = this.tail.getChild("osteoderms6");
		this.osteoderms20 = this.tail.getChild("osteoderms20");
		this.tail2 = this.tail.getChild("tail2");
		this.osteoderms7 = this.tail2.getChild("osteoderms7");
		this.osteoderms21 = this.tail2.getChild("osteoderms21");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms12 = this.tail3.getChild("osteoderms12");
		this.osteoderms22 = this.tail3.getChild("osteoderms22");
		this.osteoderms8 = this.tail3.getChild("osteoderms8");
		this.leftClub2 = this.osteoderms8.getChild("leftClub2");
		this.rightClub2 = this.osteoderms8.getChild("rightClub2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -25.0F, 8.2F, 1.0F, 25.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.2F, -10.0F, -0.5F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.5F, -17.0F, -20.0F, 0.3054F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.2F, -5.0F, -0.5F, 1.0F, 22.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-4.5F, -17.0F, -20.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-7.0F, -10.0F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -17.0F, 8.7F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -25.5378F, 9.7532F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5F, 0.8022F, 0.3073F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.711F, -3.6542F, -0.1309F, 0.0F, 0.0F));

		PartDefinition osteoderms5 = hips.addOrReplaceChild("osteoderms5", CubeListBuilder.create(), PartPose.offset(5.9F, -1.6146F, -2.4021F));

		PartDefinition bone2 = osteoderms5.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(4.182F, 0.3402F, 3.2386F));

		PartDefinition osteoderms19 = hips.addOrReplaceChild("osteoderms19", CubeListBuilder.create(), PartPose.offset(-5.9F, -1.6146F, -2.4021F));

		PartDefinition bone3 = osteoderms19.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-4.182F, 0.3402F, 3.2386F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(6.7698F, -1.7595F, 1.5127F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(8.2F, 1.7318F, -0.244F, 0.4189F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 12.0786F, -3.1861F, -0.2007F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.2162F, 2.7509F, 0.0262F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0899F, -1.4652F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.2F, 1.7318F, -0.244F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 12.0786F, -3.1861F, -0.0698F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.2162F, 2.7509F, 0.3316F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0899F, -1.4652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(64, 12).addBox(-0.5F, 0.35F, -9.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3099F, -3.6876F, 0.1223F, 0.0433F, 0.0053F));

		PartDefinition osteoderms4 = body.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offset(5.9F, -0.3047F, -6.0145F));

		PartDefinition osteoderms18 = body.addOrReplaceChild("osteoderms18", CubeListBuilder.create(), PartPose.offset(-5.9F, -0.3047F, -6.0145F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(20, 82).addBox(0.0F, -0.15F, -7.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.4233F, -7.9067F, 0.0792F, 0.1305F, 0.0103F));

		PartDefinition osteoderms11 = body2.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offset(6.4F, -0.728F, -4.1078F));

		PartDefinition osteoderms17 = body2.addOrReplaceChild("osteoderms17", CubeListBuilder.create(), PartPose.offset(-5.4F, -0.728F, -4.1078F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(87, 9).addBox(0.0F, -0.15F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0035F, -6.9501F, 0.0698F, 0.0F, 0.0F));

		PartDefinition osteoderms9 = body3.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offset(6.4F, -0.7245F, -3.1577F));

		PartDefinition osteoderms16 = body3.addOrReplaceChild("osteoderms16", CubeListBuilder.create(), PartPose.offset(-5.4F, -0.7245F, -3.1577F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.5088F, -5.8725F, 0.035F, 0.0872F, 0.0031F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(78, 55).addBox(-0.5F, 0.9F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1799F, -6.9949F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(63, 105).addBox(0.5F, 0.8389F, -0.9927F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 0.8906F, -9.9237F, 0.2007F, 0.0F, 0.0F));

		PartDefinition osteoderms3 = chest.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offset(4.9F, 0.5843F, -9.2852F));

		PartDefinition osteoderms15 = chest.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offset(-4.9F, 0.5843F, -9.2852F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(8.7616F, 6.3458F, -8.2191F, -0.2138F, 0.0338F, -0.0021F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2329F, 8.0814F, 6.4069F, -0.1745F, 0.0F, 0.0F));

		PartDefinition lefthand2 = leftarm2.addOrReplaceChild("lefthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 7.0984F, -1.2652F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lefthand = lefthand2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.0482F, -0.2347F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.7616F, 6.3458F, -8.2191F, 0.1789F, -0.0338F, 0.0021F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2329F, 8.0814F, 6.4069F, -1.0908F, 0.0F, 0.0F));

		PartDefinition righthand2 = rightarm2.addOrReplaceChild("righthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 7.0984F, -1.2652F, 0.1309F, 0.0F, 0.0F));

		PartDefinition righthand = righthand2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.0482F, -0.2347F, 2.0944F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5866F, -10.4931F, 0.0354F, 0.1744F, 0.0062F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(67, 90).addBox(0.5F, -0.2F, -0.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0616F, -4.4667F, -0.1309F, 0.0F, 0.0F));

		PartDefinition osteoderms10 = neck.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4205F, 0.1003F, -1.7233F, -0.1309F, 0.0F, 0.0F));

		PartDefinition osteoderms14 = neck.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4205F, 0.1003F, -1.7233F, -0.1309F, 0.0F, 0.0F));

		PartDefinition osteoderms2 = neck.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8471F, 0.9936F, -3.9968F, 0.0F, 0.2443F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4617F, -4.7211F, -0.4248F, 0.1652F, -0.178F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -0.4F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.2817F, -6.0265F, -0.0873F, -0.0348F, 0.003F));

		PartDefinition osteoderms = neck2.addOrReplaceChild("osteoderms", CubeListBuilder.create(), PartPose.offset(2.4205F, 0.4551F, -2.0821F));

		PartDefinition osteoderms13 = neck2.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offset(-2.4205F, 0.4551F, -2.0821F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8068F, -7.3627F, -0.558F, 0.2028F, -0.0811F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5051F, -0.5265F, 0.7941F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2383F, 5.093F, 0.3783F, -0.244F, -0.0957F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(1, 54).addBox(0.0F, 0.3975F, -0.2872F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1016F, 0.0506F, -0.2443F, 0.0F, 0.0F));

		PartDefinition osteoderms6 = tail.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offset(4.9F, -1.3763F, 0.5049F));

		PartDefinition osteoderms20 = tail.addOrReplaceChild("osteoderms20", CubeListBuilder.create(), PartPose.offset(-4.9F, -1.3763F, 0.5049F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7046F, 10.4872F, 0.1634F, -0.4312F, -0.0688F));

		PartDefinition cube_r10 = tail2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(37, 64).addBox(-0.5F, 0.574F, -1.3254F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 55).addBox(-0.5F, 0.574F, -11.3254F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7067F, 10.5327F, -0.1222F, 0.0346F, -0.0043F));

		PartDefinition osteoderms7 = tail2.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offset(3.3F, -4.0808F, -0.8823F));

		PartDefinition osteoderms21 = tail2.addOrReplaceChild("osteoderms21", CubeListBuilder.create(), PartPose.offset(-3.3F, -4.0808F, -0.8823F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0945F, 9.6161F, 0.1489F, -0.4555F, 0.2586F));

		PartDefinition cube_r11 = tail3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(1, 0).addBox(-0.5F, -0.4174F, -13.9407F, 1.0F, 1.0F, 29.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.9162F, 13.6975F, 0.0873F, 0.0F, 0.0F));

		PartDefinition osteoderms12 = tail3.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offset(2.9F, -6.1753F, 2.5016F));

		PartDefinition osteoderms22 = tail3.addOrReplaceChild("osteoderms22", CubeListBuilder.create(), PartPose.offset(-2.9F, -6.1753F, 2.5016F));

		PartDefinition osteoderms8 = tail3.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offset(-1.0F, -2.4162F, 25.0975F));

		PartDefinition leftClub2 = osteoderms8.addOrReplaceChild("leftClub2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3731F, -1.5886F, -7.3469F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightClub2 = osteoderms8.addOrReplaceChild("rightClub2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3731F, -1.5886F, -7.3469F, -0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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