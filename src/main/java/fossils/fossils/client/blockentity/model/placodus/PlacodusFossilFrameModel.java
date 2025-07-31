package fossils.fossils.client.blockentity.model.placodus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlacodusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body3;
	private final ModelPart body6;
	private final ModelPart body2;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart tail;
	private final ModelPart tail5;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart body1;
	private final ModelPart chest;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart armL5;
	private final ModelPart armL6;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lowerjaw;

	public PlacodusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.body4 = this.body.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body3 = this.body5.getChild("body3");
		this.body6 = this.body3.getChild("body6");
		this.body2 = this.body6.getChild("body2");
		this.legL = this.body2.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.legL3 = this.legL2.getChild("legL3");
		this.legL4 = this.body2.getChild("legL4");
		this.legL5 = this.legL4.getChild("legL5");
		this.legL6 = this.legL5.getChild("legL6");
		this.bone2 = this.body2.getChild("bone2");
		this.bone4 = this.body2.getChild("bone4");
		this.tail = this.body2.getChild("tail");
		this.tail5 = this.tail.getChild("tail5");
		this.tail2 = this.tail5.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail6 = this.tail4.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.body1 = this.body.getChild("body1");
		this.chest = this.body1.getChild("chest");
		this.armL = this.chest.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.armL3 = this.armL2.getChild("armL3");
		this.armL4 = this.chest.getChild("armL4");
		this.armL5 = this.armL4.getChild("armL5");
		this.armL6 = this.armL5.getChild("armL6");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lowerjaw = this.head.getChild("lowerjaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -20.3643F, 6.3696F, 0.4564F, 0.0776F, -0.1565F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(34, 14).addBox(0.0F, -0.3F, 0.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.9F, -11.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition body4 = body.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -5.3F, 0.0701F, -0.0871F, -0.0061F));

		PartDefinition cube_r2 = body4.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 22).addBox(-0.5F, 0.4502F, 3.3531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(47, 19).addBox(-0.5F, 0.4502F, -0.3469F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5075F, 0.4293F, 3.8779F, -0.1752F, -0.0859F, 0.0152F));

		PartDefinition cube_r3 = body5.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(47, 25).addBox(-0.5F, 0.4502F, 3.9531F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5075F, -0.4467F, -3.9764F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body3 = body5.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5075F, 0.1533F, 4.0201F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(55, 51).addBox(-0.5F, 0.1998F, 2.3345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 49).addBox(-0.5F, 0.1998F, -0.3655F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1484F, 0.0F, 0.0F));

		PartDefinition body6 = body3.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5075F, 0.3467F, 2.7764F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body6.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 58).addBox(-0.5F, 0.1998F, 3.0345F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5075F, -0.3467F, -2.7764F, -0.1484F, 0.0F, 0.0F));

		PartDefinition body2 = body6.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5075F, 0.4398F, 2.9245F, -0.048F, -0.0872F, 0.0042F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 36).addBox(0.8F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.6509F, 1.6595F, -1.5708F, -0.0698F, -1.5708F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 40).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.9574F, 1.8479F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(43, 37).addBox(-0.5F, 0.1997F, -0.4145F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1139F, 0.3163F, -0.0698F, 0.0F, 0.0F));

		PartDefinition legL = body2.addOrReplaceChild("legL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6F, 1.8905F, 1.6315F, 0.4411F, 0.1137F, -0.704F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0868F, 6.4211F, 2.2439F, 1.3526F, 0.0F, 0.0F));

		PartDefinition legL3 = legL2.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offset(-0.0082F, 2.8404F, 0.6487F));

		PartDefinition legL4 = body2.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6F, 1.8905F, 1.6315F, -0.0494F, -0.1506F, 0.7838F));

		PartDefinition legL5 = legL4.addOrReplaceChild("legL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0868F, 6.4211F, 2.2439F, 1.1345F, 0.0F, 0.0F));

		PartDefinition legL6 = legL5.addOrReplaceChild("legL6", CubeListBuilder.create(), PartPose.offset(0.0082F, 2.8404F, 0.6487F));

		PartDefinition bone2 = body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.9457F, 2.6264F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone4 = body2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.9457F, 2.6264F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail = body2.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(39, 44).addBox(-0.5F, 0.35F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 48).addBox(-0.5F, 0.35F, 4.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2744F, 5.016F, -0.0532F, -0.1743F, 0.0092F));

		PartDefinition tail5 = tail.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(34, 21).addBox(-0.5F, 0.4107F, -0.2668F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0607F, 5.1418F, 0.0F, -0.0873F, 0.0F));

		PartDefinition tail2 = tail5.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.425F, 0.3617F, -0.4657F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(6, 6).addBox(-0.425F, 0.3617F, 7.2343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0607F, 4.7582F, 0.0474F, 0.3051F, 0.0142F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(19, 23).addBox(-0.425F, 0.2422F, -0.2664F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(24, 28).addBox(-0.425F, 0.2422F, 5.4336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1442F, 7.9128F, 0.1674F, 0.431F, 0.0705F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 24).addBox(-0.7F, 0.1488F, 0.0433F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, 0.0747F, 5.7904F, 0.0804F, 0.4786F, 0.0371F));

		PartDefinition tail6 = tail4.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(15, 31).addBox(-0.7F, 0.1488F, -0.2567F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0156F, 5.9438F, -0.0945F, -0.4346F, 0.0399F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(47, 31).addBox(-0.7F, 0.1488F, -0.4567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.007F, 5.9211F, -0.1869F, -0.3865F, 0.0712F));

		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -10.3F, 0.0891F, 0.0869F, 0.0078F));

		PartDefinition cube_r9 = body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 12).addBox(-0.5F, 0.4F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 7).addBox(-0.5F, 0.4F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4772F, -4.0675F, 0.1571F, 0.0F, 0.0F));

		PartDefinition chest = body1.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1031F, -5.6709F, -0.2628F, 0.0843F, -0.0226F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.9278F, -1.4358F, 1.5708F, -0.1571F, 1.5708F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(61, 5).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.7426F, -1.6235F, 1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 4).addBox(-0.5F, 0.4F, -3.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.7F, 0.1571F, 0.0F, 0.0F));

		PartDefinition armL = chest.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7633F, 1.3104F, -1.2749F, -0.1492F, 0.6594F, -0.8229F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1451F, 4.3982F, 2.9708F, 1.8577F, -0.3725F, 0.1313F));

		PartDefinition armL3 = armL2.addOrReplaceChild("armL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2925F, 2.7694F, -0.0995F, -0.0426F, 0.0094F, 0.218F));

		PartDefinition armL4 = chest.addOrReplaceChild("armL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7633F, 1.3104F, -1.2749F, -1.318F, -0.7395F, 1.2563F));

		PartDefinition armL5 = armL4.addOrReplaceChild("armL5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1451F, 4.3982F, 2.9708F, 1.2768F, 0.1612F, -0.1781F));

		PartDefinition armL6 = armL5.addOrReplaceChild("armL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2925F, 2.7694F, -0.0995F, -0.0346F, -0.0266F, -0.654F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.4938F, -0.6261F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.4938F, -0.6261F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(53, 54).addBox(-0.5F, 0.0116F, -2.7113F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3592F, -1.9414F, 0.0343F, 0.0282F, 0.0316F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(56, 37).addBox(-0.5F, 0.0116F, -3.1113F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 38).addBox(-0.5F, 0.0116F, -0.4113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0068F, -2.908F, -0.0483F, 0.1305F, -0.0701F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(58, 28).addBox(-0.5F, 0.0116F, -2.6113F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0016F, -2.975F, -0.1302F, 0.3827F, 0.0694F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5611F, -2.8137F, 0.3631F, 0.1083F, -0.4095F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.775F, 0.1398F, -1.4189F, 0.0F, 0.0524F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.775F, 0.1398F, -1.4189F, 0.0F, -0.0524F, 0.0F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.312F, -1.4527F, 0.8988F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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