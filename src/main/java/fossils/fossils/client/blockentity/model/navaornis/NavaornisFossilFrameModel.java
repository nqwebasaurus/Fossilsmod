package fossils.fossils.client.blockentity.model.navaornis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NavaornisFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart toe3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart toe2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public NavaornisFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.toe3 = this.leftLeg3.getChild("toe3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.toe2 = this.rightLeg3.getChild("toe2");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -16.0F, 4.4F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(1, 1).addBox(-0.5F, -13.0F, -10.4F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.1F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(1, 1).addBox(3.7F, -2.5F, 14.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -11.5F, -9.9F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4803F, -17.5786F, 6.8875F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 33).addBox(-0.5F, 0.8F, 0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4803F, -0.1212F, -1.646F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 2).addBox(-1.0F, -0.1801F, 3.5415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 0).addBox(-1.0F, -0.1801F, -0.1585F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0197F, -1.6702F, -5.5054F, -0.6196F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6197F, 0.1492F, -2.3006F, 0.0F, 0.0F, 0.2182F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5803F, 0.1492F, -2.3006F, 0.0F, 0.0F, -0.2182F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7197F, 0.9252F, -2.4182F, -1.2983F, -0.1502F, 0.0893F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3F, 8.397F, -0.7574F, 2.0155F, 0.0883F, 0.0971F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 10.5037F, -1.5382F, -1.3526F, 0.0F, 0.0F));

		PartDefinition toe3 = leftLeg3.addOrReplaceChild("toe3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8132F, 3.5313F, 0.2662F, 1.4263F, 0.3795F, -3.0785F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7455F, 0.2457F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9031F, -1.8007F, 0.0038F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6803F, 0.9252F, -2.4182F, -1.2983F, 0.1502F, -0.0893F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 8.397F, -0.7574F, 2.0155F, -0.0883F, -0.0971F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 10.5037F, -1.5382F, -1.3526F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8132F, 3.5313F, 0.2662F, 1.4263F, -0.3795F, 3.0785F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7455F, 0.2457F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9031F, -1.8007F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(49, 17).addBox(-0.5F, 0.6944F, -0.0182F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4803F, 1.1559F, -0.1894F, -0.6545F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, 0.381F, -0.4402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2835F, 1.8669F, 0.2007F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4803F, -2.0197F, -4.8018F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(5, 18).addBox(-1.0F, 1.6494F, -0.3832F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.6F, -3.3F, -0.3578F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.5F, -1.615F, -3.6408F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 18).addBox(-1.0F, 1.6744F, -4.0582F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.985F, 0.3408F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -1.2343F, -3.8409F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(5, 13).addBox(-1.0F, -0.9F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 8).addBox(-1.0F, -0.9F, -5.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.1889F, -1.1697F, -0.1484F, 0.0009F, -0.0013F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0777F, 0.9705F, -4.6675F, 1.8491F, -0.2289F, 2.9954F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3822F, 9.2951F, 0.5375F, 0.7617F, 0.0742F, 2.9799F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2721F, 10.8809F, -1.3904F, 1.5169F, -0.2906F, 0.1798F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0777F, 0.9705F, -4.6675F, 1.8491F, 0.2289F, -2.9954F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3822F, 9.2951F, 0.5375F, 0.7617F, -0.0742F, -2.9799F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2721F, 10.8809F, -1.3904F, 1.5169F, 0.2906F, -0.1798F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.5F, 3.8846F, -6.2622F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.5F, 3.8846F, -6.2622F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0555F, -5.6887F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(5, 38).addBox(0.0F, -0.2943F, -2.9586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.1032F, -0.0049F, -0.4451F, 0.0F, 0.0F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(25, 53).addBox(-0.5F, 0.0691F, -0.4667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4982F, -2.5159F, -0.6281F, 0.1731F, 0.0902F));

		PartDefinition cube_r8 = neck5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(24, 52).addBox(0.0F, 0.6F, -2.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.3F, 0.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5589F, -1.8987F, 0.2015F, 0.0855F, 0.0174F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(58, 50).addBox(-0.5F, -0.825F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0154F, 0.2259F, -0.5405F, -0.8555F, 0.018F, -0.0299F));

		PartDefinition cube_r10 = neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(57, 49).addBox(-0.5F, 0.015F, -0.1428F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.075F, -1.6692F, -0.6991F, -1.03F, 0.018F, -0.0299F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.113F, -0.2527F, 0.2037F, 0.1217F, 0.0482F));

		PartDefinition cube_r11 = neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(29, 66).addBox(-0.5F, -0.0297F, -0.7419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2389F, -1.2244F, 0.2441F, 0.0106F, -0.0423F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7806F, -0.5453F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(24, 64).addBox(-1.0F, 3.5272F, -2.5896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(24, 64).addBox(-1.0F, 1.8272F, -2.5896F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -3.5032F, -2.1951F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5847F, -1.4611F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(52, 25).addBox(-1.0F, 1.5616F, 1.5138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.505F, -1.5265F, -3.4509F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3771F, -2.7602F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.7F, -9.8924F, -0.9983F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.7F, -9.8924F, -0.9983F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.448F, -1.7172F, 0.437F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 88, 88);
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