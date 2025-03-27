package fossils.fossils.client.blockentity.model.arizonasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArizonasaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart Base;
	private final ModelPart cube_r3;
	private final ModelPart Body;
	private final ModelPart cube_r4;
	private final ModelPart Body2;
	private final ModelPart cube_r5;
	private final ModelPart RightArm3;
	private final ModelPart RightArm4;
	private final ModelPart RightArmHand2;
	private final ModelPart LeftArm3;
	private final ModelPart LeftArm4;
	private final ModelPart LeftArmHand2;
	private final ModelPart Neck;
	private final ModelPart cube_r6;
	private final ModelPart Neck2;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RFoot;
	private final ModelPart RFoot2;
	private final ModelPart RLeg3;
	private final ModelPart RLeg4;
	private final ModelPart RFoot3;
	private final ModelPart RFoot4;
	private final ModelPart Tail;
	private final ModelPart cube_r9;
	private final ModelPart Tail2;
	private final ModelPart cube_r10;
	private final ModelPart Tail3;
	private final ModelPart Tail4;

	public ArizonasaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.Base = this.fossil.getChild("Base");
		this.cube_r3 = this.Base.getChild("cube_r3");
		this.Body = this.Base.getChild("Body");
		this.cube_r4 = this.Body.getChild("cube_r4");
		this.Body2 = this.Body.getChild("Body2");
		this.cube_r5 = this.Body2.getChild("cube_r5");
		this.RightArm3 = this.Body2.getChild("RightArm3");
		this.RightArm4 = this.RightArm3.getChild("RightArm4");
		this.RightArmHand2 = this.RightArm4.getChild("RightArmHand2");
		this.LeftArm3 = this.Body2.getChild("LeftArm3");
		this.LeftArm4 = this.LeftArm3.getChild("LeftArm4");
		this.LeftArmHand2 = this.LeftArm4.getChild("LeftArmHand2");
		this.Neck = this.Body2.getChild("Neck");
		this.cube_r6 = this.Neck.getChild("cube_r6");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.cube_r7 = this.Neck2.getChild("cube_r7");
		this.cube_r8 = this.Neck2.getChild("cube_r8");
		this.Head = this.Neck2.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.RLeg = this.Base.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RFoot = this.RLeg2.getChild("RFoot");
		this.RFoot2 = this.RFoot.getChild("RFoot2");
		this.RLeg3 = this.Base.getChild("RLeg3");
		this.RLeg4 = this.RLeg3.getChild("RLeg4");
		this.RFoot3 = this.RLeg4.getChild("RFoot3");
		this.RFoot4 = this.RFoot3.getChild("RFoot4");
		this.Tail = this.Base.getChild("Tail");
		this.cube_r9 = this.Tail.getChild("cube_r9");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.cube_r10 = this.Tail2.getChild("cube_r10");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(15, 28).addBox(-1.0F, -14.0F, -9.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(20, 28).addBox(-0.5F, -14.0F, 5.1F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 39).addBox(5.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -8.0F, 5.6F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 39).addBox(2.1F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -8.0F, -9.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Base = fossil.addOrReplaceChild("Base", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.75F, 5.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Base.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.5F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.5038F, -1.8255F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Body = Base.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2038F, -2.0255F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, 0.2593F, -0.6619F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(0.0F, 0.286F, -8.88F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -8.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, 1.2174F, 0.3016F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.3167F, -4.8535F, 0.1396F, 0.0F, 0.0F));

		PartDefinition RightArm3 = Body2.addOrReplaceChild("RightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 5.0972F, -2.8735F, 1.0385F, 0.5233F, 0.0804F));

		PartDefinition RightArm4 = RightArm3.addOrReplaceChild("RightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 4.7F, 0.8F, -1.2725F, 0.3286F, 0.219F));

		PartDefinition RightArmHand2 = RightArm4.addOrReplaceChild("RightArmHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 4.39F, 0.5F, 0.0F, 0.0F, 1.0036F));

		PartDefinition LeftArm3 = Body2.addOrReplaceChild("LeftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 5.0972F, -2.8735F, 0.6627F, -0.3598F, -0.0004F));

		PartDefinition LeftArm4 = LeftArm3.addOrReplaceChild("LeftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 4.7F, 0.8F, -1.1345F, 0.0F, 0.0F));

		PartDefinition LeftArmHand2 = LeftArm4.addOrReplaceChild("LeftArmHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 4.39F, 0.5F, 0.0F, 0.0F, -0.9599F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3972F, -3.8735F, 0.0864F, 0.045F, -0.0401F));

		PartDefinition cube_r6 = Neck.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 32).addBox(-0.5F, 0.4759F, -3.199F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(0.0F, -0.0805F, -0.207F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4971F, -2.8691F, -0.0269F, 0.0656F, 0.0598F));

		PartDefinition cube_r7 = Neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 37).addBox(-0.5F, 1.534F, 0.0985F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.3019F, -3.0128F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, 1.6F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(0.0F, -1.2019F, -4.9128F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3019F, -4.7128F, -0.0028F, -0.0577F, 0.0759F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1314F, 0.2393F, 0.4014F, 0.0F, 0.0F));

		PartDefinition RLeg = Base.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 0.6962F, 0.6745F, -0.0873F, 0.0F, 0.0F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 6.9314F, 0.2871F, 0.829F, 0.0F, 0.0F));

		PartDefinition RFoot = RLeg2.addOrReplaceChild("RFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.7631F, 0.7156F, -0.1309F, 0.0F, 0.0F));

		PartDefinition RFoot2 = RFoot.addOrReplaceChild("RFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5532F, -2.8625F, -0.5236F, 0.0F, 0.0F));

		PartDefinition RLeg3 = Base.addOrReplaceChild("RLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 0.6962F, 0.6745F, -0.3054F, 0.0F, 0.0F));

		PartDefinition RLeg4 = RLeg3.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 6.9314F, 0.2871F, 0.48F, 0.0F, 0.0F));

		PartDefinition RFoot3 = RLeg4.addOrReplaceChild("RFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.7631F, 0.7156F, -0.1309F, 0.0F, 0.0F));

		PartDefinition RFoot4 = RFoot3.addOrReplaceChild("RFoot4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5532F, -2.8625F));

		PartDefinition Tail = Base.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(25, 32).addBox(-0.5F, 0.21F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(0.0F, -0.5038F, 3.8745F, -0.0886F, 0.1739F, -0.0154F));

		PartDefinition cube_r9 = Tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(27, 24).addBox(0.0F, 0.61F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -0.4F, 5.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, 11.0F, -0.0452F, 0.2615F, -0.0117F));

		PartDefinition cube_r10 = Tail2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(27, 12).addBox(-0.5F, 0.5F, -0.4F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(0.0F, -0.2072F, 0.0627F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3118F, -0.4345F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.1728F, 9.7627F, -0.0443F, 0.1744F, -0.0077F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, 0.0095F, -0.0939F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(0.0F, 0.2818F, 11.4655F, -0.0457F, 0.3051F, -0.0138F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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