package fossils.fossils.client.blockentity.model.kunbarrasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KunbarrasaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart osteoderms5;
	private final ModelPart osteoderms13;
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
	private final ModelPart osteoderms12;
	private final ModelPart chest;
	private final ModelPart osteoderms3;
	private final ModelPart osteoderms11;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck;
	private final ModelPart osteoderms2;
	private final ModelPart osteoderms10;
	private final ModelPart neck2;
	private final ModelPart osteoderms;
	private final ModelPart osteoderms9;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart osteoderms6;
	private final ModelPart osteoderms14;
	private final ModelPart tail2;
	private final ModelPart osteoderms7;
	private final ModelPart osteoderms15;
	private final ModelPart tail3;
	private final ModelPart osteoderms8;

	public KunbarrasaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.osteoderms5 = this.hips.getChild("osteoderms5");
		this.osteoderms13 = this.hips.getChild("osteoderms13");
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
		this.osteoderms12 = this.body.getChild("osteoderms12");
		this.chest = this.body.getChild("chest");
		this.osteoderms3 = this.chest.getChild("osteoderms3");
		this.osteoderms11 = this.chest.getChild("osteoderms11");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck = this.chest.getChild("neck");
		this.osteoderms2 = this.neck.getChild("osteoderms2");
		this.osteoderms10 = this.neck.getChild("osteoderms10");
		this.neck2 = this.neck.getChild("neck2");
		this.osteoderms = this.neck2.getChild("osteoderms");
		this.osteoderms9 = this.neck2.getChild("osteoderms9");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.osteoderms6 = this.tail.getChild("osteoderms6");
		this.osteoderms14 = this.tail.getChild("osteoderms14");
		this.tail2 = this.tail.getChild("tail2");
		this.osteoderms7 = this.tail2.getChild("osteoderms7");
		this.osteoderms15 = this.tail2.getChild("osteoderms15");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms8 = this.tail3.getChild("osteoderms8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -13.0F, 7.8F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(1, 1).addBox(0.9F, -13.0F, -9.0F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -9.0F, -8.5F, 0.1047F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.7F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -11.0F, 8.3F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -11.939F, 8.1542F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 10).addBox(-0.5F, -0.0978F, -0.0926F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.711F, -3.6542F, -0.1309F, 0.0F, 0.0F));

		PartDefinition osteoderms5 = hips.addOrReplaceChild("osteoderms5", CubeListBuilder.create(), PartPose.offset(5.6838F, -0.785F, 2.1713F));

		PartDefinition osteoderms13 = hips.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offset(-5.6838F, -0.785F, 2.1713F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, -0.0577F, 0.0664F, 0.2443F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 5.7948F, -2.6816F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0246F, 3.5116F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -1.2F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -0.0577F, 0.0664F, -0.4102F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 5.7948F, -2.6816F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0246F, 3.5116F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -1.2F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.55F, -8.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.261F, -3.6542F, 0.0F, -0.0873F, 0.0F));

		PartDefinition osteoderms4 = body.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offset(6.05F, 0.25F, -2.5F));

		PartDefinition osteoderms12 = body.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offset(-6.05F, 0.25F, -2.5F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.229F, -7.8756F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.2183F, -4.8956F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(39, 33).addBox(0.5F, -0.5194F, -2.7365F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 0.929F, -5.0244F, 0.2007F, 0.0F, 0.0F));

		PartDefinition osteoderms3 = chest.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offset(3.9F, 0.9346F, -6.2149F));

		PartDefinition osteoderms11 = chest.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offset(-3.9F, 0.9346F, -6.2149F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 4.3941F, -4.7684F, -0.7418F, 0.0F, -0.2618F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.4457F, 3.1653F, -0.2574F, 0.0338F, 0.2597F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5076F, -1.5054F, 1.8762F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 4.3941F, -4.7684F, 0.1309F, 0.0F, 0.2618F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.4457F, 3.1653F, 0.0044F, -0.0338F, -0.2597F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5076F, -1.5054F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4324F, -7.7065F, -0.1589F, -0.1815F, -0.0884F));

		PartDefinition cube_r6 = neck.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 38).addBox(0.6F, -0.3F, 1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.1034F, -4.4678F, -0.1309F, 0.0F, 0.0F));

		PartDefinition osteoderms2 = neck.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offset(3.0213F, 1.1518F, -1.4929F));

		PartDefinition osteoderms10 = neck.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offset(-3.0213F, 1.1518F, -1.4929F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5035F, -2.7222F, -0.093F, -0.1308F, 0.044F));

		PartDefinition cube_r7 = neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(43, 13).addBox(0.0F, -0.2F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.4001F, -1.7456F, -0.0873F, 0.0F, 0.0F));

		PartDefinition osteoderms = neck2.addOrReplaceChild("osteoderms", CubeListBuilder.create(), PartPose.offset(2.4205F, 0.8319F, -1.2879F));

		PartDefinition osteoderms9 = neck2.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offset(-2.4205F, 0.8319F, -1.2879F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3003F, -2.6904F, -0.3491F, 0.0F, -0.0436F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8491F, -0.7783F, 0.3578F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4585F, 3.1952F, 0.4215F, -0.275F, 0.1288F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 14).addBox(0.0F, 0.4975F, -0.8872F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.1024F, -0.0494F, -0.2443F, 0.0F, 0.0F));

		PartDefinition osteoderms6 = tail.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offset(1.0F, -0.5535F, 1.829F));

		PartDefinition osteoderms14 = tail.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.5535F, 1.829F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2461F, 8.4411F, 0.3445F, -0.1221F, -0.0666F));

		PartDefinition cube_r9 = tail2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(-1, 15).addBox(-0.5F, 0.774F, -0.8254F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5486F, 0.3095F, -0.1222F, 0.0F, 0.0F));

		PartDefinition osteoderms7 = tail2.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offset(1.5629F, 0.5115F, 1.422F));

		PartDefinition osteoderms15 = tail2.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offset(-1.5629F, 0.5115F, 1.422F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0755F, 10.539F, 0.2887F, -0.229F, 0.1599F));

		PartDefinition cube_r10 = tail3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5174F, -0.2407F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9838F, 0.0975F, 0.0873F, 0.0F, 0.0F));

		PartDefinition osteoderms8 = tail3.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.5162F, 11.4975F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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