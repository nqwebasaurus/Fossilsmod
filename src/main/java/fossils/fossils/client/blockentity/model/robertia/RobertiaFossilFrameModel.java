package fossils.fossils.client.blockentity.model.robertia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RobertiaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart leftTusk;
	private final ModelPart rightTusk;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart bone2;
	private final ModelPart bone6;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart bone;
	private final ModelPart bone5;

	public RobertiaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.Bodyfront = this.body3.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.neck2 = this.Neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.bone3 = this.head.getChild("bone3");
		this.bone4 = this.head.getChild("bone4");
		this.leftTusk = this.head.getChild("leftTusk");
		this.rightTusk = this.head.getChild("rightTusk");
		this.upperarm1 = this.Bodyfront.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.Bodyfront.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.bone2 = this.Bodyfront.getChild("bone2");
		this.bone6 = this.Bodyfront.getChild("bone6");
		this.upperleg1 = this.Hips.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.Hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.bone = this.Hips.getChild("bone");
		this.bone5 = this.Hips.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -14.0F, 10.7F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.575F, -5.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.5F, -10.0F, -12.9F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.5F, -10.0F, -12.9F, 0.2618F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(1.0F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -10.0F, 11.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.7F, 12.5F, -0.2169F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(20, 5).addBox(-0.5F, 0.5F, 6.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 0).addBox(-0.5F, 0.5F, 0.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.4374F, -4.9915F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0375F, 1.9085F, -0.0006F, 0.1745F, 0.0F));

		PartDefinition Tail2_r1 = Tail1.addOrReplaceChild("Tail2_r1", CubeListBuilder.create().texOffs(52, 59).addBox(-0.5F, -0.6F, 0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1625F, -0.3598F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(57, 25).addBox(-0.5F, -0.0283F, -0.1494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0375F, 1.8402F, -0.1942F, 0.1713F, -0.0335F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(21, 58).addBox(-0.5F, 0.0145F, -0.4586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0283F, 1.9506F, -0.0008F, 0.2182F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(13, 16).addBox(-0.5F, -0.1626F, -5.0347F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6624F, -3.9915F, 0.0599F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, 0.1F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2626F, -4.7847F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(13, 23).addBox(-0.5F, 0.1F, -5.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 27).addBox(-0.5F, 0.1F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.95F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, 0.1F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.9F, 0.1012F, -0.0913F, 0.0344F));

		PartDefinition Bodyfront = body3.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.275F, -4.875F, -0.025F, -0.1309F, 0.0033F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.8F, 1.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.7959F, -6.8804F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5959F, -6.0054F, -0.1416F, -0.2593F, 0.0365F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(58, 6).addBox(-0.5F, -0.1F, 5.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 5).addBox(-0.5F, -0.1F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.589F, -6.0139F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck2 = Neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1862F, -1.8525F, -0.2203F, -0.2173F, 0.0193F));

		PartDefinition Neck_r2 = neck2.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(27, 7).addBox(-0.5F, -0.1F, 1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4778F, -6.0864F, 0.0349F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8342F, -4.8404F, -0.45F, -0.0295F, -0.1089F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1549F, 0.2589F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7389F, 5.5315F, -7.684F, 0.1536F, -0.354F, 0.2246F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7389F, 5.5315F, -7.684F, 0.1536F, 0.354F, -0.2246F));

		PartDefinition bone3 = head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.0F, 3.409F, -9.3867F));

		PartDefinition bone4 = head.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.0F, 3.409F, -9.3867F));

		PartDefinition leftTusk = head.addOrReplaceChild("leftTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(1.631F, 7.6499F, -5.7117F, 0.5876F, 0.5758F, 0.1171F));

		PartDefinition rightTusk = head.addOrReplaceChild("rightTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.631F, 7.6499F, -5.7117F, 0.5876F, -0.5758F, -0.1171F));

		PartDefinition upperarm1 = Bodyfront.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6551F, 5.0044F, -2.9368F, 0.3248F, -0.0397F, -0.8486F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6795F, 4.7465F, -0.4007F, -0.6439F, -0.478F, 1.4176F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0518F, 4.4716F, -1.0283F, 0.7185F, 1.0288F, -0.129F));

		PartDefinition upperarm2 = Bodyfront.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6551F, 5.0044F, -2.9368F, 0.892F, 0.0397F, 0.8486F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6795F, 4.7465F, -0.4007F, -0.6439F, 0.478F, -1.4176F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0518F, 4.4716F, -1.0283F, 0.8933F, -1.1199F, -0.0695F));

		PartDefinition bone2 = Bodyfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(4.0F, 1.7959F, 2.1196F));

		PartDefinition bone6 = Bodyfront.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-4.0F, 1.7959F, 2.1196F));

		PartDefinition upperleg1 = Hips.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4101F, 2.3024F, -0.4736F, -0.7016F, 0.1228F, -0.9243F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7083F, 8.044F, 0.4834F, 0.6157F, -0.4832F, 0.5007F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.273F, 5.308F, -0.1457F, 0.3226F, 0.0242F, 0.4358F));

		PartDefinition upperleg2 = Hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4101F, 2.3024F, -0.4736F, -0.3962F, -0.1228F, 0.9243F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7083F, 8.044F, 0.4834F, 1.052F, 0.4832F, -0.5007F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.273F, 5.308F, -0.1457F, -0.4646F, -0.3978F, -0.2102F));

		PartDefinition bone = Hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2362F, -0.5711F, 0.2902F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2362F, -0.5711F, 0.2902F, 0.0F, 0.0F, -0.1745F));

		return LayerDefinition.create(meshdefinition, 83, 83);
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