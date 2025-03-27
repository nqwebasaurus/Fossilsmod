package fossils.fossils.client.blockentity.model.drepanosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DrepanosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Drepanosaurus;
	private final ModelPart Body;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart LArm;
	private final ModelPart LArm2;
	private final ModelPart LHand;
	private final ModelPart LClaw;
	private final ModelPart LArm3;
	private final ModelPart LArm4;
	private final ModelPart LHand2;
	private final ModelPart LClaw2;
	private final ModelPart Body2;
	private final ModelPart Tail;
	private final ModelPart LLeg;
	private final ModelPart LLeg3;
	private final ModelPart LFoot;
	private final ModelPart finger;
	private final ModelPart finger2;
	private final ModelPart LFoot2;
	private final ModelPart LLeg2;
	private final ModelPart LLeg4;
	private final ModelPart LFoot3;
	private final ModelPart finger3;
	private final ModelPart finger4;
	private final ModelPart LFoot4;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart TailClaw;

	public DrepanosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Drepanosaurus = this.fossil.getChild("Drepanosaurus");
		this.Body = this.Drepanosaurus.getChild("Body");
		this.Neck = this.Body.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Head = this.Neck4.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.LArm = this.Body.getChild("LArm");
		this.LArm2 = this.LArm.getChild("LArm2");
		this.LHand = this.LArm2.getChild("LHand");
		this.LClaw = this.LHand.getChild("LClaw");
		this.LArm3 = this.Body.getChild("LArm3");
		this.LArm4 = this.LArm3.getChild("LArm4");
		this.LHand2 = this.LArm4.getChild("LHand2");
		this.LClaw2 = this.LHand2.getChild("LClaw2");
		this.Body2 = this.Drepanosaurus.getChild("Body2");
		this.Tail = this.Body2.getChild("Tail");
		this.LLeg = this.Tail.getChild("LLeg");
		this.LLeg3 = this.LLeg.getChild("LLeg3");
		this.LFoot = this.LLeg3.getChild("LFoot");
		this.finger = this.LFoot.getChild("finger");
		this.finger2 = this.finger.getChild("finger2");
		this.LFoot2 = this.LFoot.getChild("LFoot2");
		this.LLeg2 = this.Tail.getChild("LLeg2");
		this.LLeg4 = this.LLeg2.getChild("LLeg4");
		this.LFoot3 = this.LLeg4.getChild("LFoot3");
		this.finger3 = this.LFoot3.getChild("finger3");
		this.finger4 = this.finger3.getChild("finger4");
		this.LFoot4 = this.LFoot3.getChild("LFoot4");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.TailClaw = this.Tail5.getChild("TailClaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.9F, 1.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -12.0F, 15.9F, 0.0F, -0.2094F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(2.5F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -12.0F, 15.9F, -0.2094F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(2.9F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -11.6F, -6.8F, 0.0524F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, -1.4F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -11.6F, -6.8F, 0.0F, 0.0524F, 0.0F));

		PartDefinition Drepanosaurus = fossil.addOrReplaceChild("Drepanosaurus", CubeListBuilder.create().texOffs(22, -1).addBox(-0.5F, -1.5095F, -0.2033F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Drepanosaurus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 21).addBox(0.0F, 0.7872F, -0.0981F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -2.0872F, -5.8019F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Body = Drepanosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8F, -5.7F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 38).addBox(0.0F, 0.7872F, -0.0981F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.5421F, -2.9593F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0293F, -2.4574F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, 31).addBox(-0.5F, -0.2128F, 0.0019F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0438F, -4.166F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4689F, -3.9641F, -0.354F, -0.1639F, 0.0602F));

		PartDefinition cube_r8 = Neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 22).addBox(-0.5F, -0.3128F, -0.3981F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7069F, -4.7823F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2196F, -4.4804F, -0.3862F, 0.1138F, 0.0476F));

		PartDefinition cube_r9 = Neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 30).addBox(-0.5F, 0.5872F, 3.1019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.6633F, -4.7532F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9633F, -2.4532F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(17, 39).addBox(-0.5F, 0.4872F, 0.3019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6F, -2.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0128F, -2.5981F, -0.0422F, 0.0107F, 0.0186F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4428F, 0.8655F, 0.6981F, 0.0F, 0.0F));

		PartDefinition LArm = Body.addOrReplaceChild("LArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 5.8293F, -0.3574F, 0.1621F, 0.4955F, -0.7707F));

		PartDefinition LArm2 = LArm.addOrReplaceChild("LArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 4.8F, -0.6F, -0.9192F, 0.3457F, 0.2952F));

		PartDefinition LHand = LArm2.addOrReplaceChild("LHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4598F, 5.8923F, -0.1104F, 0.035F, 0.2595F, -1.4353F));

		PartDefinition LClaw = LHand.addOrReplaceChild("LClaw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LArm3 = Body.addOrReplaceChild("LArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 5.8293F, -0.3574F, 1.3065F, -0.444F, -0.0763F));

		PartDefinition LArm4 = LArm3.addOrReplaceChild("LArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 4.8F, -0.6F, -1.0104F, 0.1313F, -0.3355F));

		PartDefinition LHand2 = LArm4.addOrReplaceChild("LHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4598F, 5.8923F, -0.1104F, 0.0F, 0.1745F, 1.5708F));

		PartDefinition LClaw2 = LHand2.addOrReplaceChild("LClaw2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body2 = Drepanosaurus.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8F, 5.0F, -0.0437F, -0.0436F, 0.0019F));

		PartDefinition cube_r11 = Body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(22, 18).addBox(-1.0F, 0.8F, 0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.5017F, 0.0785F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tail = Body2.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0983F, 5.0785F, 0.2628F, -0.0843F, -0.0226F));

		PartDefinition cube_r12 = Tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.8F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3409F, 0.0894F, -0.3491F, 0.0F, 0.0F));

		PartDefinition LLeg = Tail.addOrReplaceChild("LLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 4.4591F, 4.9894F, 0.0076F, -0.5725F, -0.7303F));

		PartDefinition LLeg3 = LLeg.addOrReplaceChild("LLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3171F, 4.5972F, 1.1377F, 1.5264F, 0.5574F, 0.4268F));

		PartDefinition LFoot = LLeg3.addOrReplaceChild("LFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 4.7F, -0.2F, 0.6109F, -0.192F, 0.0F));

		PartDefinition finger = LFoot.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2053F, -0.1F, 0.0294F, 0.0F, 0.5672F, 0.0F));

		PartDefinition finger2 = finger.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offset(0.006F, 0.0F, -2.6068F));

		PartDefinition LFoot2 = LFoot.addOrReplaceChild("LFoot2", CubeListBuilder.create(), PartPose.offset(-0.3053F, 0.6F, -2.4706F));

		PartDefinition LLeg2 = Tail.addOrReplaceChild("LLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 4.4591F, 4.9894F, -0.9317F, 1.0521F, -0.2735F));

		PartDefinition LLeg4 = LLeg2.addOrReplaceChild("LLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3171F, 4.5972F, 1.1377F, 0.6973F, -0.5574F, -0.4268F));

		PartDefinition LFoot3 = LLeg4.addOrReplaceChild("LFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 4.7F, -0.2F, 0.0F, 0.192F, 0.0F));

		PartDefinition finger3 = LFoot3.addOrReplaceChild("finger3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2053F, -0.1F, 0.0294F, 0.0F, -0.5672F, 0.0F));

		PartDefinition finger4 = finger3.addOrReplaceChild("finger4", CubeListBuilder.create(), PartPose.offset(-0.006F, 0.0F, -2.6068F));

		PartDefinition LFoot4 = LFoot3.addOrReplaceChild("LFoot4", CubeListBuilder.create(), PartPose.offset(0.3053F, 0.6F, -2.4706F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(-2, -2).addBox(-0.5F, -0.1972F, -0.7265F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.8591F, 6.3894F, 0.1839F, -0.0858F, -0.0159F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, 0.3979F, -0.004F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5972F, 9.6735F, 0.1294F, -0.2615F, 0.0117F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(10, 14).addBox(-0.5F, 0.3167F, -0.2547F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0979F, 7.096F, -0.1919F, 0.3002F, -0.0574F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(20, 9).addBox(-0.5F, 0.3F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.9F, -0.4548F, 0.276F, -0.1325F));

		PartDefinition TailClaw = Tail5.addOrReplaceChild("TailClaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2833F, 6.0253F, -0.7918F, -0.0294F, -0.3379F));

		PartDefinition cube_r13 = TailClaw.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 34).addBox(-0.7F, 0.7F, -0.02F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.02F, 0.0F, 0.0524F, 0.0F));

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