package fossils.fossils.client.blockentity.model.yutyrannus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YutyrannusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart rightthigh;
	private final ModelPart rightshin;
	private final ModelPart rightankle;
	private final ModelPart rightfoot;
	private final ModelPart righttoes;
	private final ModelPart leftthigh;
	private final ModelPart leftshin;
	private final ModelPart leftankle;
	private final ModelPart leftfoot;
	private final ModelPart lefttoes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm3;
	private final ModelPart leftarm4;
	private final ModelPart lefthand2;
	private final ModelPart leftfingers;
	private final ModelPart leftclaw;
	private final ModelPart rightarm3;
	private final ModelPart rightarm4;
	private final ModelPart righthand2;
	private final ModelPart rightfingers;
	private final ModelPart rightclaw;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart jaw;

	public YutyrannusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.rightthigh = this.hips.getChild("rightthigh");
		this.rightshin = this.rightthigh.getChild("rightshin");
		this.rightankle = this.rightshin.getChild("rightankle");
		this.rightfoot = this.rightankle.getChild("rightfoot");
		this.righttoes = this.rightfoot.getChild("righttoes");
		this.leftthigh = this.hips.getChild("leftthigh");
		this.leftshin = this.leftthigh.getChild("leftshin");
		this.leftankle = this.leftshin.getChild("leftankle");
		this.leftfoot = this.leftankle.getChild("leftfoot");
		this.lefttoes = this.leftfoot.getChild("lefttoes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm3 = this.chest.getChild("leftarm3");
		this.leftarm4 = this.leftarm3.getChild("leftarm4");
		this.lefthand2 = this.leftarm4.getChild("lefthand2");
		this.leftfingers = this.lefthand2.getChild("leftfingers");
		this.leftclaw = this.lefthand2.getChild("leftclaw");
		this.rightarm3 = this.chest.getChild("rightarm3");
		this.rightarm4 = this.rightarm3.getChild("rightarm4");
		this.righthand2 = this.rightarm4.getChild("righthand2");
		this.rightfingers = this.righthand2.getChild("rightfingers");
		this.rightclaw = this.righthand2.getChild("rightclaw");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -28.0F, 2.9F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(1, 1).addBox(0.0F, -27.0F, -18.4F, 1.0F, 27.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.8F, -4.8F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(1, 1).addBox(7.9F, -3.5F, 20.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -19.5F, -17.9F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.329F, 3.4267F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, 0.7964F, -9.8947F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2F, 4.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightthigh = hips.addOrReplaceChild("rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 0.399F, 0.1733F, -0.0955F, 0.035F, 0.0816F));

		PartDefinition rightshin = rightthigh.addOrReplaceChild("rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2618F, 12.4892F, -1.4228F, 0.796F, 0.0F, 0.0424F));

		PartDefinition rightankle = rightshin.addOrReplaceChild("rightankle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0524F, 12.6142F, 0.7396F, -0.8072F, -0.0682F, -0.1118F));

		PartDefinition rightfoot = rightankle.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0743F, -0.8039F, 0.3667F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6962F, -2.1762F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftthigh = hips.addOrReplaceChild("leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 0.399F, 0.1733F, -0.5301F, -0.0936F, -0.0379F));

		PartDefinition leftshin = leftthigh.addOrReplaceChild("leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2618F, 12.4892F, -1.4228F, 0.7088F, 0.0F, -0.0424F));

		PartDefinition leftankle = leftshin.addOrReplaceChild("leftankle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0524F, 12.6142F, 0.7396F, -0.8965F, 0.0518F, 0.0702F));

		PartDefinition leftfoot = leftankle.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0743F, -0.8039F, 0.6721F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6962F, -2.1762F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4162F, 4.0077F, 0.0966F, 0.1387F, -0.0743F));

		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(17, 40).addBox(-1.0F, -1.8F, -3.3F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.4267F, 2.9921F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1692F, 7.8444F, 0.1516F, -0.0139F, -0.1745F));

		PartDefinition cube_r4 = tail2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2F, -4.8F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 4.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0118F, 14.2188F, -0.0937F, -0.1999F, -0.0679F));

		PartDefinition cube_r5 = tail3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, 1.4F, -5.5F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1973F, 5.5477F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0262F, 11.0007F, -0.0524F, -0.0436F, 0.0023F));

		PartDefinition cube_r6 = tail4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 34).addBox(-2.0F, -2.8F, -5.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 2.8986F, 5.4654F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3082F, 10.6083F, -0.0464F, -0.3487F, 0.0159F));

		PartDefinition cube_r7 = tail5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, 0.1F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0284F, 5.7812F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9686F, 11.6353F, -0.0962F, -0.4346F, 0.0406F));

		PartDefinition cube_r8 = tail6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, 1.75F, -7.25F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.8888F, 7.1672F, -0.48F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6111F, -5.6872F, -0.0429F, -0.0436F, -0.0095F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(16, 26).addBox(-0.5F, 0.959F, -0.1322F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6486F, -10.8654F, 0.0262F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0121F, -10.9135F, -0.0433F, 0.0435F, -0.0076F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(15, 51).addBox(-1.5F, -0.422F, -0.6023F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6022F, -5.2261F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(66, 39).addBox(-1.5F, 0.3817F, -0.1233F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3022F, -9.1261F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftarm3 = chest.addOrReplaceChild("leftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7967F, 8.0401F, -4.9998F, -0.4611F, 0.1966F, -0.2699F));

		PartDefinition leftarm4 = leftarm3.addOrReplaceChild("leftarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3966F, 1.7009F, 5.4048F, 0.083F, -0.1046F, -0.0363F));

		PartDefinition lefthand2 = leftarm4.addOrReplaceChild("lefthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0273F, 5.0738F, -1.5538F, -0.0791F, -0.0368F, -0.4349F));

		PartDefinition leftfingers = lefthand2.addOrReplaceChild("leftfingers", CubeListBuilder.create(), PartPose.offset(-0.2273F, 1.8943F, -0.7714F));

		PartDefinition leftclaw = lefthand2.addOrReplaceChild("leftclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3049F, 0.1884F, -0.8777F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightarm3 = chest.addOrReplaceChild("rightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7967F, 8.0401F, -4.9998F, -0.5228F, -0.4549F, 0.0885F));

		PartDefinition rightarm4 = rightarm3.addOrReplaceChild("rightarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3966F, 1.7009F, 5.4048F, -0.0346F, 0.5186F, 0.4215F));

		PartDefinition righthand2 = rightarm4.addOrReplaceChild("righthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0273F, 5.0738F, -1.5538F, -0.2461F, 0.05F, 0.6091F));

		PartDefinition rightfingers = righthand2.addOrReplaceChild("rightfingers", CubeListBuilder.create(), PartPose.offset(0.2273F, 1.8943F, -0.7714F));

		PartDefinition rightclaw = righthand2.addOrReplaceChild("rightclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3049F, 0.1884F, -0.8777F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1342F, -8.9269F, 0.1018F, 0.0908F, 0.0402F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(45, 38).addBox(-0.5F, -0.5015F, -0.5771F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0276F, -3.9304F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.503F, -3.7071F, 0.0153F, 0.1538F, 0.0817F));

		PartDefinition cube_r13 = neck2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(65, 45).addBox(0.0F, 0.3F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0132F, 0.101F, -0.6545F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8764F, -4.0773F, 0.0703F, 0.1166F, 0.0213F));

		PartDefinition cube_r14 = neck3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(87, 26).addBox(0.0F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.5278F, -0.3196F, -0.3054F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7754F, -1.4407F, -0.1855F, 0.3435F, -0.0631F));

		PartDefinition cube_r15 = neck4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(81, 47).addBox(-1.0F, -1.9F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.5228F, -2.174F, 0.1134F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.123F, -2.089F, 0.0F, 0.1309F, -0.0436F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(-0.5F, 4.542F, 0.7596F));

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