package fossils.fossils.client.blockentity.model.thalattosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ThalattosuchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Body;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Lowerjaw;
	private final ModelPart bone3;
	private final ModelPart bone6;
	private final ModelPart snout;
	private final ModelPart bone4;
	private final ModelPart bone16;
	private final ModelPart Body2;
	private final ModelPart Body3;
	private final ModelPart Body4;
	private final ModelPart Tail;
	private final ModelPart leftUpperLegL;
	private final ModelPart leftLowerLegL;
	private final ModelPart leftFootL;
	private final ModelPart rightUpperLegL;
	private final ModelPart rightLowerLegL;
	private final ModelPart rightFootL;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart leftUpperArm;
	private final ModelPart rightUpperArm;

	public ThalattosuchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Body = this.fossil.getChild("Body");
		this.Neck = this.Body.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.bone3 = this.Lowerjaw.getChild("bone3");
		this.bone6 = this.bone3.getChild("bone6");
		this.snout = this.Head.getChild("snout");
		this.bone4 = this.snout.getChild("bone4");
		this.bone16 = this.Neck.getChild("bone16");
		this.Body2 = this.Body.getChild("Body2");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body4 = this.Body3.getChild("Body4");
		this.Tail = this.Body4.getChild("Tail");
		this.leftUpperLegL = this.Tail.getChild("leftUpperLegL");
		this.leftLowerLegL = this.leftUpperLegL.getChild("leftLowerLegL");
		this.leftFootL = this.leftLowerLegL.getChild("leftFootL");
		this.rightUpperLegL = this.Tail.getChild("rightUpperLegL");
		this.rightLowerLegL = this.rightUpperLegL.getChild("rightLowerLegL");
		this.rightFootL = this.rightLowerLegL.getChild("rightFootL");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.leftUpperArm = this.Body.getChild("leftUpperArm");
		this.rightUpperArm = this.Body.getChild("rightUpperArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, -1.0F));

		PartDefinition Body = fossil.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(53, 40).addBox(-0.5F, 0.7F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -6.5F, -14.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 46).addBox(-1.2F, -3.5F, -13.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.0F, 12.8F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 49).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.5F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.6F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Neck.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 50).addBox(-0.5F, 0.7F, -0.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -5.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6566F, 0.4903F, 0.48F, 0.0F, 0.0F));

		PartDefinition bone3 = Lowerjaw.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2432F, -6.5106F, -0.096F, 0.0F, 0.0F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0572F, -5.9598F, 0.0175F, 0.0F, 0.0F));

		PartDefinition snout = Head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7566F, -7.0097F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone4 = snout.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone16 = Neck.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.9F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.15F, 1.5F));

		PartDefinition cube_r4 = Body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 13).addBox(-0.5F, 0.45F, -0.4F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, 0.4F, 0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.25F, 8.0F, 0.044F, 0.1308F, 0.0057F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r5 = Body4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 49).addBox(-1.0F, 0.65F, -0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.2F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tail = Body4.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(14, 11).addBox(-0.5F, 0.5F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.4F, 7.2F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r6 = Tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -3.0F, 12.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.0F, -12.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r7 = Tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(14, 13).addBox(-0.5F, 0.7F, -0.7F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftUpperLegL = Tail.addOrReplaceChild("leftUpperLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 2.9F, 0.45F, 0.9188F, 0.5632F, -0.6716F));

		PartDefinition leftLowerLegL = leftUpperLegL.addOrReplaceChild("leftLowerLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2857F, 7.5395F, 0.1403F, 0.5459F, -0.3289F, 0.2291F));

		PartDefinition leftFootL = leftLowerLegL.addOrReplaceChild("leftFootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1673F, 2.8998F, 0.589F, 0.2618F, 0.0F, -0.2182F));

		PartDefinition rightUpperLegL = Tail.addOrReplaceChild("rightUpperLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 2.9F, 0.45F, 0.1586F, -0.4132F, 1.1699F));

		PartDefinition rightLowerLegL = rightUpperLegL.addOrReplaceChild("rightLowerLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2857F, 7.5395F, 0.1403F, 0.503F, 0.3945F, -0.3503F));

		PartDefinition rightFootL = rightLowerLegL.addOrReplaceChild("rightFootL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1673F, 2.8998F, 0.589F, 0.2597F, -0.0338F, 0.3447F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, 9.8F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r8 = Tail2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, 0.65F, -0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, 11.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r9 = Tail3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.75F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.0F, -0.3F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, 9.7F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r10 = Tail4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(53, 40).addBox(-0.5F, -0.4471F, -0.5608F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 6.05F, 3.3F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Tail4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(55, 60).addBox(-0.5F, 0.4499F, 0.1459F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.85F, 2.6F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Tail4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(41, 58).addBox(-0.5F, 0.3892F, -0.4526F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition leftUpperArm = Body.addOrReplaceChild("leftUpperArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 3.35F, 0.05F, -0.0347F, 0.5691F, 0.0179F));

		PartDefinition rightUpperArm = Body.addOrReplaceChild("rightUpperArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 3.35F, 0.05F, -0.3044F, -0.7151F, -0.2692F));

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