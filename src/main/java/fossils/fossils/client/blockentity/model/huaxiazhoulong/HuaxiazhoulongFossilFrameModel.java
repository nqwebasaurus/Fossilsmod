package fossils.fossils.client.blockentity.model.huaxiazhoulong;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HuaxiazhoulongFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart osteoderms5;
	private final ModelPart osteoderms14;
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
	private final ModelPart osteoderms15;
	private final ModelPart chest;
	private final ModelPart osteoderms3;
	private final ModelPart osteoderms16;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart lefthand2;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart righthand2;
	private final ModelPart neck;
	private final ModelPart osteoderms2;
	private final ModelPart osteoderms11;
	private final ModelPart osteoderms9;
	private final ModelPart osteoderms17;
	private final ModelPart neck2;
	private final ModelPart osteoderms;
	private final ModelPart osteoderms10;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart osteoderms6;
	private final ModelPart osteoderms13;
	private final ModelPart tail2;
	private final ModelPart osteoderms7;
	private final ModelPart osteoderms12;
	private final ModelPart tail3;
	private final ModelPart osteoderms8;
	private final ModelPart leftClub2;
	private final ModelPart rightClub2;

	public HuaxiazhoulongFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.osteoderms5 = this.hips.getChild("osteoderms5");
		this.osteoderms14 = this.hips.getChild("osteoderms14");
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
		this.osteoderms15 = this.body.getChild("osteoderms15");
		this.chest = this.body.getChild("chest");
		this.osteoderms3 = this.chest.getChild("osteoderms3");
		this.osteoderms16 = this.chest.getChild("osteoderms16");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.lefthand2 = this.leftarm2.getChild("lefthand2");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.righthand2 = this.rightarm2.getChild("righthand2");
		this.neck = this.chest.getChild("neck");
		this.osteoderms2 = this.neck.getChild("osteoderms2");
		this.osteoderms11 = this.neck.getChild("osteoderms11");
		this.osteoderms9 = this.neck.getChild("osteoderms9");
		this.osteoderms17 = this.neck.getChild("osteoderms17");
		this.neck2 = this.neck.getChild("neck2");
		this.osteoderms = this.neck2.getChild("osteoderms");
		this.osteoderms10 = this.neck2.getChild("osteoderms10");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.osteoderms6 = this.tail.getChild("osteoderms6");
		this.osteoderms13 = this.tail.getChild("osteoderms13");
		this.tail2 = this.tail.getChild("tail2");
		this.osteoderms7 = this.tail2.getChild("osteoderms7");
		this.osteoderms12 = this.tail2.getChild("osteoderms12");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms8 = this.tail3.getChild("osteoderms8");
		this.leftClub2 = this.osteoderms8.getChild("leftClub2");
		this.rightClub2 = this.osteoderms8.getChild("rightClub2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -14.0F, 9.3F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(0.8F, -6.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, -12.5F, 9.8F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-2.5F, -5.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, -10.5F, -8.8F, 0.1571F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-0.2F, -1.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(1.5F, -10.5F, -8.8F, 0.0F, -0.1571F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.639F, 9.5542F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 32).addBox(-0.5F, 0.6022F, 0.9074F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.711F, -3.6542F, -0.1309F, 0.0F, 0.0F));

		PartDefinition osteoderms5 = hips.addOrReplaceChild("osteoderms5", CubeListBuilder.create(), PartPose.offset(5.6838F, -1.785F, 2.1713F));

		PartDefinition osteoderms14 = hips.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offset(-5.6838F, -1.785F, 2.1713F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2F, -0.5626F, 0.0961F, 0.637F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 7.1108F, -2.6201F, -0.2443F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7943F, 2.821F, 0.2007F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -1.2F, 0.0F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2F, -0.5626F, 0.0961F, 0.0698F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 7.1108F, -2.6201F, 0.0611F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7943F, 2.821F, 0.2007F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -1.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(21, 13).addBox(-0.5F, 0.15F, -8.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.161F, -2.6542F, 0.0964F, -0.0869F, -0.0084F));

		PartDefinition osteoderms4 = body.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offset(6.05F, 0.25F, -2.5F));

		PartDefinition osteoderms15 = body.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offset(-6.05F, 0.25F, -2.5F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.129F, -8.0756F, 0.0349F, -0.0436F, -0.0015F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(31, 31).addBox(-0.5F, 0.7F, -0.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1799F, -5.8949F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(53, 21).addBox(0.5F, 0.5389F, -0.2927F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 0.8906F, -8.8237F, 0.2007F, 0.0F, 0.0F));

		PartDefinition osteoderms3 = chest.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offset(4.9F, 0.5843F, -8.1852F));

		PartDefinition osteoderms16 = chest.addOrReplaceChild("osteoderms16", CubeListBuilder.create(), PartPose.offset(-4.9F, 0.5843F, -8.1852F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7F, 4.1161F, -8.7485F, 0.0044F, 0.0338F, -0.0021F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2329F, 3.724F, 3.9546F, -0.1309F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offset(0.0F, 5.5121F, -1.474F));

		PartDefinition lefthand2 = leftarm2.addOrReplaceChild("lefthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 4.5207F, -1.6045F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7F, 4.1161F, -8.7485F, -0.4756F, -0.0338F, 0.0021F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2329F, 3.724F, 3.9546F, -0.2182F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.5121F, -1.474F, 0.6109F, 0.0F, 0.0F));

		PartDefinition righthand2 = rightarm2.addOrReplaceChild("righthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 4.5207F, -1.6045F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.394F, -8.7058F, 0.0793F, -0.1672F, -0.1008F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(40, 16).addBox(0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.0616F, -4.4668F, -0.1309F, 0.0F, 0.0F));

		PartDefinition osteoderms2 = neck.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8471F, 0.9936F, -3.9968F, 0.0F, 0.2443F, 0.0F));

		PartDefinition osteoderms11 = neck.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8471F, 0.9936F, -3.9968F, 0.0F, -0.2443F, 0.0F));

		PartDefinition osteoderms9 = neck.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6213F, 0.6936F, -0.8918F, 0.0F, 0.2443F, 0.0F));

		PartDefinition osteoderms17 = neck.addOrReplaceChild("osteoderms17", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6213F, 0.6936F, -0.8918F, 0.0F, -0.2443F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4617F, -4.7211F, -0.1757F, -0.144F, -0.0631F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(33, 45).addBox(0.0F, -0.3F, -1.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0233F, -2.5398F, -0.0873F, 0.0F, 0.0F));

		PartDefinition osteoderms = neck2.addOrReplaceChild("osteoderms", CubeListBuilder.create(), PartPose.offset(2.4205F, 0.4551F, -2.0821F));

		PartDefinition osteoderms10 = neck2.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offset(-2.4205F, 0.4551F, -2.0821F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3771F, -4.0846F, -0.0219F, -0.2279F, -0.208F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9698F, 0.4081F, 0.4887F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4585F, 3.0952F, 0.1416F, 0.1732F, 0.0188F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(-2, 22).addBox(0.0F, 0.3975F, -0.4872F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.1016F, 0.0506F, -0.2443F, 0.0F, 0.0F));

		PartDefinition osteoderms6 = tail.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offset(1.0F, -0.5526F, 1.929F));

		PartDefinition osteoderms13 = tail.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.5526F, 1.929F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.747F, 6.8411F, 0.1776F, 0.2608F, 0.0233F));

		PartDefinition cube_r10 = tail2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.774F, -0.4254F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5486F, 0.3095F, -0.1222F, 0.0F, 0.0F));

		PartDefinition osteoderms7 = tail2.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offset(1.5629F, 0.5115F, 1.422F));

		PartDefinition osteoderms12 = tail2.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offset(-1.5629F, 0.5115F, 1.422F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7755F, 8.539F, 0.0256F, 0.2618F, -0.0047F));

		PartDefinition cube_r11 = tail3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5174F, -0.4407F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9838F, 0.0975F, 0.0873F, 0.0F, 0.0F));

		PartDefinition osteoderms8 = tail3.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.5162F, 11.4975F));

		PartDefinition leftClub2 = osteoderms8.addOrReplaceChild("leftClub2", CubeListBuilder.create(), PartPose.offset(1.9731F, -1.2702F, -1.8274F));

		PartDefinition rightClub2 = osteoderms8.addOrReplaceChild("rightClub2", CubeListBuilder.create(), PartPose.offset(0.0269F, -1.2702F, -1.8274F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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