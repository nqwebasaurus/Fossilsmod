package fossils.fossils.client.blockentity.model.trilophosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TrilophosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart body1;
	private final ModelPart chest;
	private final ModelPart armLw;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart armL5;
	private final ModelPart armL6;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart neckflap;
	private final ModelPart armRw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public TrilophosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.legL = this.body.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.legL3 = this.legL2.getChild("legL3");
		this.legL4 = this.body.getChild("legL4");
		this.legL5 = this.legL4.getChild("legL5");
		this.legL6 = this.legL5.getChild("legL6");
		this.body1 = this.body.getChild("body1");
		this.chest = this.body1.getChild("chest");
		this.armLw = this.chest.getChild("armLw");
		this.armL = this.armLw.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.armL3 = this.armL2.getChild("armL3");
		this.armL4 = this.armLw.getChild("armL4");
		this.armL5 = this.armL4.getChild("armL5");
		this.armL6 = this.armL5.getChild("armL6");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.neckflap = this.neck.getChild("neckflap");
		this.armRw = this.chest.getChild("armRw");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -6.0F, 3.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.4F, 0.65F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(3.7F, -7.65F, -9.2F, 0.0F, -0.6632F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(3.25F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.7F, -7.65F, -9.2F, -0.6632F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(4.2F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -10.0F, 3.9F, 0.0F, 0.0F, 1.5708F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-0.1F, -6.5F, -2.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(31, 6).addBox(-0.5069F, 0.6712F, -0.1283F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1069F, -1.253F, 3.8243F, -0.3054F, 0.0F, 0.0F));

		PartDefinition legL = body.addOrReplaceChild("legL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6546F, 1.047F, 5.7137F, 1.1515F, -0.8125F, -0.7373F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.45F, 0.48F, 0.3491F, 0.0F));

		PartDefinition legL3 = legL2.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0684F, 4.4868F, 0.3167F, -1.1091F, -0.0407F, 0.6517F));

		PartDefinition legL4 = body.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6546F, 1.047F, 5.7137F, 0.0F, 0.9163F, 0.0F));

		PartDefinition legL5 = legL4.addOrReplaceChild("legL5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.45F, 0.48F, -0.3491F, 0.0F));

		PartDefinition legL6 = legL5.addOrReplaceChild("legL6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0684F, 4.4868F, 0.3167F, -0.5672F, 0.0F, 0.0F));

		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1069F, -0.853F, 3.6243F, 0.0365F, -0.2151F, -0.008F));

		PartDefinition cube_r5 = body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(33, 48).addBox(-0.5069F, 0.6365F, 0.1388F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9F, -3.8F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5069F, -0.4F, 0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4F, -8.8F, 0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body1.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4151F, -8.189F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(19, 53).addBox(-0.5069F, -0.2F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3559F, -1.4791F, -0.1309F, 0.0F, 0.0F));

		PartDefinition armLw = chest.addOrReplaceChild("armLw", CubeListBuilder.create(), PartPose.offset(2.5F, 1.5651F, -3.611F));

		PartDefinition armL = armLw.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, 0.0F, 0.2182F, 0.9163F, 0.0F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0887F, 0.0726F, 4.3097F, -0.2182F, 0.2182F, 0.0F));

		PartDefinition armL3 = armL2.addOrReplaceChild("armL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.451F, 4.2046F, 0.7678F, -0.1745F, -1.2217F, 0.0F));

		PartDefinition armL4 = armLw.addOrReplaceChild("armL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2138F, 1.6F, 0.0F, -1.2206F, -1.1757F, 1.318F));

		PartDefinition armL5 = armL4.addOrReplaceChild("armL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0793F, 0.2679F, 4.2674F, -0.2838F, -0.1194F, 0.3858F));

		PartDefinition armL6 = armL5.addOrReplaceChild("armL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 4.5F, 0.75F, 0.2249F, 1.2936F, -0.3593F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1849F, -2.411F, -0.4752F, -0.3931F, 0.1946F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(29, 54).addBox(-0.5069F, -0.35F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7556F, -0.2976F, -0.3499F, -0.0656F, 0.0239F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(65, 30).addBox(-0.5069F, -0.6435F, -4.6802F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8444F, -2.7976F, 0.257F, -0.5522F, -0.137F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 54).addBox(-0.5069F, 0.65F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3935F, 0.0198F, -0.3316F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.9935F, -3.9052F, 0.2643F, -0.5944F, -0.1504F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.578F, 0.1422F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neckflap = neck.addOrReplaceChild("neckflap", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8056F, -4.0976F, 0.2225F, 0.0F, 0.0F));

		PartDefinition armRw = chest.addOrReplaceChild("armRw", CubeListBuilder.create(), PartPose.offset(-2.5F, 1.5651F, -3.611F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1069F, 1.047F, 9.3243F, -0.2796F, 0.2521F, -0.0715F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(-1, 26).addBox(-0.4069F, -0.1F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1966F, -0.7776F, 0.0F, -0.0175F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(20, 15).addBox(-0.5069F, 0.2563F, -0.3137F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(29, 24).addBox(-0.5069F, 0.2563F, 8.3863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1835F, 7.8379F, 0.0879F, 0.6526F, 0.0535F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5069F, 0.1784F, -0.2034F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 23).addBox(-0.5069F, 0.1784F, 8.4966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0586F, 8.934F, 0.2807F, -0.7219F, -0.1883F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5069F, 0.4809F, -0.1029F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.271F, 8.8704F, 0.1594F, -0.6049F, -0.0911F));

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