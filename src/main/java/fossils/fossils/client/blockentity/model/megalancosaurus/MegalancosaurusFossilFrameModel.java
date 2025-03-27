package fossils.fossils.client.blockentity.model.megalancosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MegalancosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Megalancosaurus;
	private final ModelPart Body;
	private final ModelPart frontleftarm;
	private final ModelPart frontleftarm2;
	private final ModelPart frontleftarm3;
	private final ModelPart frontleftarm4;
	private final ModelPart frontrightarm;
	private final ModelPart frontrightarm2;
	private final ModelPart frontrightarm3;
	private final ModelPart frontrightarm4;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart head;
	private final ModelPart lowerjaw;
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
	private final ModelPart tail6;
	private final ModelPart TailClaw;

	public MegalancosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Megalancosaurus = this.fossil.getChild("Megalancosaurus");
		this.Body = this.Megalancosaurus.getChild("Body");
		this.frontleftarm = this.Body.getChild("frontleftarm");
		this.frontleftarm2 = this.frontleftarm.getChild("frontleftarm2");
		this.frontleftarm3 = this.frontleftarm2.getChild("frontleftarm3");
		this.frontleftarm4 = this.frontleftarm2.getChild("frontleftarm4");
		this.frontrightarm = this.Body.getChild("frontrightarm");
		this.frontrightarm2 = this.frontrightarm.getChild("frontrightarm2");
		this.frontrightarm3 = this.frontrightarm2.getChild("frontrightarm3");
		this.frontrightarm4 = this.frontrightarm2.getChild("frontrightarm4");
		this.Neck = this.Body.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.head = this.Neck4.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.Body2 = this.Megalancosaurus.getChild("Body2");
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
		this.tail6 = this.Tail5.getChild("tail6");
		this.TailClaw = this.tail6.getChild("TailClaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -5.0F, 13.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(-0.5F, -4.9F, -6.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(7.9F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(6.0F, -2.0F, 18.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -10.0F, -5.9F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Megalancosaurus = fossil.addOrReplaceChild("Megalancosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0961F, 0.693F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Megalancosaurus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 0).addBox(0.0F, 0.6872F, 2.0019F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -2.0872F, -5.8019F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Megalancosaurus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 45).addBox(0.0F, 0.4777F, -0.2014F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -2.0872F, 0.1981F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Body = Megalancosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.676F, -3.5819F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.715F, 0.1712F, 0.2967F, -0.0167F, -0.0051F));

		PartDefinition frontleftarm = Body.addOrReplaceChild("frontleftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2924F, 5.1664F, -3.4116F, 0.5722F, 0.298F, -0.092F));

		PartDefinition frontleftarm2 = frontleftarm.addOrReplaceChild("frontleftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2489F, 0.1383F, 4.8845F, -1.5975F, -0.9345F, 1.0627F));

		PartDefinition frontleftarm3 = frontleftarm2.addOrReplaceChild("frontleftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1639F, 4.1419F, -0.0185F, -0.9955F, 0.3425F, 0.343F));

		PartDefinition frontleftarm4 = frontleftarm2.addOrReplaceChild("frontleftarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3572F, 4.5492F, -0.3312F, -0.9264F, -0.5018F, -0.0865F));

		PartDefinition frontrightarm = Body.addOrReplaceChild("frontrightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2924F, 5.1664F, -3.4116F, 0.1258F, -0.3785F, 0.3233F));

		PartDefinition frontrightarm2 = frontrightarm.addOrReplaceChild("frontrightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2489F, 0.1383F, 4.8845F, -1.4275F, 0.0412F, -0.1734F));

		PartDefinition frontrightarm3 = frontrightarm2.addOrReplaceChild("frontrightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3488F, 4.2445F, -0.358F, -0.2989F, -0.0503F, -0.1064F));

		PartDefinition frontrightarm4 = frontrightarm2.addOrReplaceChild("frontrightarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4097F, 4.2598F, -0.39F, -0.0747F, 0.4408F, 0.6429F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2323F, -4.5659F, 0.6007F, -0.2175F, -0.1468F));

		PartDefinition cube_r5 = Neck.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(40, 52).addBox(-0.5F, -0.3128F, 2.3019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(38, 50).addBox(-0.5F, -0.3128F, -0.2981F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0438F, -4.166F, -0.0699F, -0.0348F, 0.0024F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4689F, -3.9641F, -0.9588F, -0.4492F, 0.554F));

		PartDefinition cube_r6 = Neck2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(43, 41).addBox(-0.5F, -0.4128F, -0.6981F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7069F, -4.7823F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2196F, -4.4804F, -0.5589F, -0.2305F, 0.0435F));

		PartDefinition cube_r7 = Neck3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 55).addBox(-0.5F, -0.5F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7802F, -0.1779F, -0.4369F, -0.0475F, 0.0221F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9633F, -2.4532F, 0.4813F, -0.3973F, -0.4578F));

		PartDefinition cube_r8 = Neck4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(49, 35).addBox(-0.5F, 0.6872F, -1.2981F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6F, -2.2F, -0.4369F, -0.0475F, 0.0221F));

		PartDefinition head = Neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0866F, -3.1854F, 0.3796F, 0.0F, 0.0F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6149F, -0.8573F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Body2 = Megalancosaurus.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.317F, 4.8706F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(13, 45).addBox(-1.0F, 0.7F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.5017F, 0.0785F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tail = Body2.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0983F, 5.0785F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.7F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3409F, 0.0894F, -0.3491F, 0.0F, 0.0F));

		PartDefinition LLeg = Tail.addOrReplaceChild("LLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 3.6466F, 4.2754F, -1.826F, -0.7256F, 0.2885F));

		PartDefinition LLeg3 = LLeg.addOrReplaceChild("LLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6784F, 6.9798F, 0.7737F, 1.1873F, -0.2723F, 0.7176F));

		PartDefinition LFoot = LLeg3.addOrReplaceChild("LFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5487F, 4.5822F, -0.4903F, 1.288F, -0.7235F, -1.3104F));

		PartDefinition finger = LFoot.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2053F, -0.1F, 0.0294F, -0.075F, 0.5081F, -0.0539F));

		PartDefinition finger2 = finger.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offset(0.006F, 0.0F, -2.6068F));

		PartDefinition LFoot2 = LFoot.addOrReplaceChild("LFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2566F, 0.591F, -2.4836F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LLeg2 = Tail.addOrReplaceChild("LLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 3.6466F, 4.2754F, -1.8486F, 0.5399F, -0.1238F));

		PartDefinition LLeg4 = LLeg2.addOrReplaceChild("LLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6784F, 6.9798F, 0.7737F, 1.8802F, 0.3579F, -0.8563F));

		PartDefinition LFoot3 = LLeg4.addOrReplaceChild("LFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5487F, 4.5822F, -0.4903F, 2.6312F, 1.4109F, 2.6974F));

		PartDefinition finger3 = LFoot3.addOrReplaceChild("finger3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2053F, -0.1F, 0.0294F, 0.0F, -0.5672F, 0.0F));

		PartDefinition finger4 = finger3.addOrReplaceChild("finger4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.006F, 0.0F, -2.6068F, 0.0873F, 0.0F, 0.0F));

		PartDefinition LFoot4 = LFoot3.addOrReplaceChild("LFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2557F, 0.5644F, -2.3217F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3972F, -0.6265F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F))
				.texOffs(12, 12).addBox(-0.5F, -0.3972F, 12.0735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.8591F, 6.3894F, 0.2371F, 0.5383F, -0.2147F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(25, 15).addBox(-0.5F, 0.0979F, -0.004F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5663F, 12.675F, 0.3647F, 0.5718F, 0.2221F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, 0.0167F, -0.0547F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1203F, 11.0582F, -0.8481F, -0.1876F, 0.2501F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(17, 28).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.023F, 10.9718F, -1.3545F, -0.0617F, 0.0618F));

		PartDefinition tail6 = Tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(35, 36).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0342F, 6.906F, -1.1185F, -0.1432F, 0.3F));

		PartDefinition TailClaw = tail6.addOrReplaceChild("TailClaw", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0421F, -0.1349F, 5.3122F, -1.5966F, 0.0045F, 0.1745F));

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