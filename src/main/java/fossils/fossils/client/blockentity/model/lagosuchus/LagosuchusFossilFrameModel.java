package fossils.fossils.client.blockentity.model.lagosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LagosuchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Lagosuchus;
	private final ModelPart Body;
	private final ModelPart Body2;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart RArm;
	private final ModelPart RArm2;
	private final ModelPart RHand;
	private final ModelPart RArm3;
	private final ModelPart RArm4;
	private final ModelPart RHand2;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RLeg3;
	private final ModelPart RFoot;
	private final ModelPart RLeg4;
	private final ModelPart RLeg5;
	private final ModelPart RLeg6;
	private final ModelPart RFoot2;

	public LagosuchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Lagosuchus = this.fossil.getChild("Lagosuchus");
		this.Body = this.Lagosuchus.getChild("Body");
		this.Body2 = this.Body.getChild("Body2");
		this.Neck = this.Body2.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Body2.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Body2.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
		this.Tail = this.Lagosuchus.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.RLeg = this.Lagosuchus.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RLeg3 = this.RLeg2.getChild("RLeg3");
		this.RFoot = this.RLeg3.getChild("RFoot");
		this.RLeg4 = this.Lagosuchus.getChild("RLeg4");
		this.RLeg5 = this.RLeg4.getChild("RLeg5");
		this.RLeg6 = this.RLeg5.getChild("RLeg6");
		this.RFoot2 = this.RLeg6.getChild("RFoot2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(1.3F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.9993F, -15.7F, -18.6262F, -0.2531F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.2F, -6.9F, -0.5F, 1.0F, 23.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.9993F, -15.7F, -18.6262F, 0.0F, 0.2531F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(2.2F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -22.2F, -1.8F, 0.0524F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.8F, -0.5F, 1.0F, 25.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -22.2F, -1.8F, 0.0F, -0.0524F, 0.0F));

		PartDefinition Lagosuchus = fossil.addOrReplaceChild("Lagosuchus", CubeListBuilder.create().texOffs(44, 42).addBox(-0.5F, -0.0891F, -2.1147F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -25.75F, -2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Body = Lagosuchus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1891F, -1.9147F, 0.2193F, 0.1298F, 0.0172F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 24).addBox(-0.5F, -0.2495F, 0.0913F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5025F, -5.0134F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 44).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2025F, -10.0134F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5025F, -10.1134F, 0.0004F, 0.1308F, 0.0057F));

		PartDefinition cube_r7 = Body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.5975F, -6.7134F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7975F, -6.6134F, -0.1459F, 0.2254F, -0.0115F));

		PartDefinition cube_r8 = Neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(41, 49).addBox(-0.5F, -0.3727F, -0.3402F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2728F, -2.9387F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3272F, -2.6387F, -0.0994F, -0.2947F, 0.0814F));

		PartDefinition cube_r9 = Neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 13).addBox(-0.5F, 0.6F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.9472F, -6.6802F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, 0.0773F, -2.8813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.4472F, -6.6802F, -0.1309F, 0.3054F, 0.0F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2227F, -2.2813F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.0633F, 0.238F, 0.1745F, 0.0F, 0.0F));

		PartDefinition RArm = Body2.addOrReplaceChild("RArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 6.1975F, -6.2134F, -0.537F, 0.2368F, -0.0429F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0771F, -0.2307F, 6.0801F, 0.3403F, 0.0F, 0.0F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.99F, 5.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition RArm3 = Body2.addOrReplaceChild("RArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 6.1975F, -6.2134F, -1.2352F, -0.2368F, 0.0429F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0771F, -0.2307F, 6.0801F, 0.6021F, 0.0F, 0.0F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.99F, 5.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition Tail = Lagosuchus.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(24, -1).addBox(-0.5F, 0.0987F, -0.4611F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1891F, 3.8853F, 0.0702F, 0.1745F, 0.0046F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(22, 24).addBox(-0.5F, 0.0416F, 0.0624F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0013F, 10.9389F, 0.1506F, 0.1726F, 0.0261F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 0.2853F, -0.0526F, 1.0F, 1.0F, 19.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2584F, 13.8624F, 0.0903F, -0.2608F, -0.0233F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6F, 0.2244F, -0.7993F, 1.0F, 1.0F, 22.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0853F, 19.4474F, -0.065F, -0.3484F, 0.0222F));

		PartDefinition RLeg = Lagosuchus.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 1.0109F, 0.1853F, -0.8901F, 0.0F, 0.0F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 10.1067F, 1.6421F, 1.4835F, 0.0F, 0.0F));

		PartDefinition RLeg3 = RLeg2.addOrReplaceChild("RLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.6486F, 1.1721F, -0.6196F, 0.0F, 0.0F));

		PartDefinition RFoot = RLeg3.addOrReplaceChild("RFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 6.0F, 0.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition RLeg4 = Lagosuchus.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 1.0109F, 0.1853F, 0.1134F, 0.0F, 0.0F));

		PartDefinition RLeg5 = RLeg4.addOrReplaceChild("RLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 10.1067F, 1.6421F, 1.1345F, 0.0F, 0.0F));

		PartDefinition RLeg6 = RLeg5.addOrReplaceChild("RLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.6486F, 1.1721F, -0.7941F, 0.0F, 0.0F));

		PartDefinition RFoot2 = RLeg6.addOrReplaceChild("RFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 6.0F, 0.3F, 0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 67, 67);
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