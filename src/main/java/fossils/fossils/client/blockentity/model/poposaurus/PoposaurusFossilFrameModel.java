package fossils.fossils.client.blockentity.model.poposaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PoposaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Poposaurus;
	private final ModelPart Basin;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart LArm;
	private final ModelPart LArm2;
	private final ModelPart LHand;
	private final ModelPart LArm3;
	private final ModelPart LArm4;
	private final ModelPart LHand2;
	private final ModelPart LLeg;
	private final ModelPart LLeg2;
	private final ModelPart LFoot;
	private final ModelPart LFoot2;
	private final ModelPart LLeg3;
	private final ModelPart LLeg4;
	private final ModelPart LFoot3;
	private final ModelPart LFoot4;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public PoposaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Poposaurus = this.fossil.getChild("Poposaurus");
		this.Basin = this.Poposaurus.getChild("Basin");
		this.Body = this.Basin.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.Neck = this.Chest.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.LArm = this.Chest.getChild("LArm");
		this.LArm2 = this.LArm.getChild("LArm2");
		this.LHand = this.LArm2.getChild("LHand");
		this.LArm3 = this.Chest.getChild("LArm3");
		this.LArm4 = this.LArm3.getChild("LArm4");
		this.LHand2 = this.LArm4.getChild("LHand2");
		this.LLeg = this.Basin.getChild("LLeg");
		this.LLeg2 = this.LLeg.getChild("LLeg2");
		this.LFoot = this.LLeg2.getChild("LFoot");
		this.LFoot2 = this.LFoot.getChild("LFoot2");
		this.LLeg3 = this.Basin.getChild("LLeg3");
		this.LLeg4 = this.LLeg3.getChild("LLeg4");
		this.LFoot3 = this.LLeg4.getChild("LFoot3");
		this.LFoot4 = this.LFoot3.getChild("LFoot4");
		this.Tail = this.Basin.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.tail5 = this.Tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.6F, 0.1F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-3.1F, -15.1F, -10.3F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.1F, -11.7F, -10.3F, 0.4316F, 0.0662F, 1.4282F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-0.8F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -15.2F, 1.1F, -0.0694F, -0.0073F, 1.4663F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, -0.9F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -15.1F, 1.1F, 0.0F, -0.0698F, 0.0F));

		PartDefinition Poposaurus = fossil.addOrReplaceChild("Poposaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.5F, -12.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Basin = Poposaurus.addOrReplaceChild("Basin", CubeListBuilder.create().texOffs(21, 25).addBox(-0.5F, -0.4F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8F, 13.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Body = Basin.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, 0.143F, -6.7804F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.573F, -3.0153F, 0.1072F, 0.217F, 0.0232F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(41, 15).addBox(-0.5F, 0.234F, -5.5594F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.124F, -6.921F, 0.1056F, 0.217F, 0.0232F));

		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0641F, -4.9271F, -0.318F, 0.1384F, 0.0295F));

		PartDefinition cube_r5 = Neck.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(37, 45).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0472F, -3.8931F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4211F, -3.6994F, 0.2155F, 0.1973F, 0.149F));

		PartDefinition cube_r6 = Neck2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 45).addBox(-1.0F, -0.348F, -1.5837F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.4613F, -2.4732F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2387F, -4.0732F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Neck3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 60).addBox(-1.0F, -0.2F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.6F, -1.4F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0954F, -1.0944F, -0.0082F, 0.2531F, -0.1886F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7404F, -0.19F, 0.8727F, 0.0F, 0.0F));

		PartDefinition LArm = Chest.addOrReplaceChild("LArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3383F, 3.5046F, -3.1407F, 0.73F, 0.1748F, -0.1311F));

		PartDefinition LArm2 = LArm.addOrReplaceChild("LArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.767F, 0.4456F, -1.7017F, 0.0F, 0.0F));

		PartDefinition LHand = LArm2.addOrReplaceChild("LHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2088F, 3.6137F, -0.1F, 0.0F, 0.0F, 0.6981F));

		PartDefinition LArm3 = Chest.addOrReplaceChild("LArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3383F, 3.5046F, -3.1407F, 0.7836F, -0.0715F, 0.0501F));

		PartDefinition LArm4 = LArm3.addOrReplaceChild("LArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.767F, 0.4456F, -0.8727F, 0.0F, 0.0F));

		PartDefinition LHand2 = LArm4.addOrReplaceChild("LHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2088F, 3.6137F, -0.1F, 0.0F, 0.0F, -0.6545F));

		PartDefinition LLeg = Basin.addOrReplaceChild("LLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 0.9356F, 0.133F, -1.2654F, 0.0F, 0.0F));

		PartDefinition LLeg2 = LLeg.addOrReplaceChild("LLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 6.7188F, -0.1483F, 1.9635F, 0.0F, 0.0F));

		PartDefinition LFoot = LLeg2.addOrReplaceChild("LFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.6648F, 0.1163F, -0.1484F, 0.0F, 0.0F));

		PartDefinition LFoot2 = LFoot.addOrReplaceChild("LFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.136F, -3.5362F, 0.3054F, 0.0F, 0.0F));

		PartDefinition LLeg3 = Basin.addOrReplaceChild("LLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 0.9356F, 0.133F, 0.1313F, 0.0057F, 0.1308F));

		PartDefinition LLeg4 = LLeg3.addOrReplaceChild("LLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 6.7188F, -0.1483F, 0.7399F, -0.0668F, 0.0562F));

		PartDefinition LFoot3 = LLeg4.addOrReplaceChild("LFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.6648F, 0.1163F, 0.1581F, 0.1429F, -0.0656F));

		PartDefinition LFoot4 = LFoot3.addOrReplaceChild("LFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.136F, -3.5362F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Tail = Basin.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, 0.0979F, -0.204F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(8, 22).addBox(-0.5F, 0.0979F, 8.296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -0.5167F, 4.9235F, -0.0436F, 0.0872F, -0.0038F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0485F, 8.8956F, 0.1118F, 0.2031F, -0.0795F));

		PartDefinition cube_r8 = Tail2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1488F, 0.5276F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7248F, 7.7079F, 0.0873F, -0.0859F, 0.0152F));

		PartDefinition cube_r9 = Tail3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(21, 14).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(29, 22).addBox(-0.5F, 0.1F, 8.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -0.0718F, 0.2961F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0206F, -0.1569F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.404F, 9.0763F, -0.1398F, -0.4342F, 0.0212F));

		PartDefinition tail5 = Tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(21, 35).addBox(-0.5F, 0.1858F, -0.3098F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1692F, 11.8107F, -0.1962F, -0.4721F, 0.0902F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.2269F, 0.0F, 0.0F));

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