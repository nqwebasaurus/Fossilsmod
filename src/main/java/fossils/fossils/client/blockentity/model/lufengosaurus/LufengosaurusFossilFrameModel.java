package fossils.fossils.client.blockentity.model.lufengosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LufengosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart basin;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart upperarmL2;
	private final ModelPart lowerarmL2;
	private final ModelPart handL2;
	private final ModelPart thumbclawL2;
	private final ModelPart upperarmL3;
	private final ModelPart lowerarmL3;
	private final ModelPart handL3;
	private final ModelPart thumbclawL3;
	private final ModelPart bone4;
	private final ModelPart bone2;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart head1;
	private final ModelPart head2;
	private final ModelPart head4;
	private final ModelPart head3;
	private final ModelPart head5;
	private final ModelPart jaw1;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart upperlegL2;
	private final ModelPart lowerlegL2;
	private final ModelPart feetL2;
	private final ModelPart toesL3;
	private final ModelPart toesL4;
	private final ModelPart upperlegL3;
	private final ModelPart lowerlegL3;
	private final ModelPart feetL3;
	private final ModelPart toesL2;
	private final ModelPart toesL5;
	private final ModelPart bone3;
	private final ModelPart bone5;

	public LufengosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.basin = this.root.getChild("basin");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.Tail6 = this.tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.body = this.basin.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.upperarmL2 = this.chest2.getChild("upperarmL2");
		this.lowerarmL2 = this.upperarmL2.getChild("lowerarmL2");
		this.handL2 = this.lowerarmL2.getChild("handL2");
		this.thumbclawL2 = this.handL2.getChild("thumbclawL2");
		this.upperarmL3 = this.chest2.getChild("upperarmL3");
		this.lowerarmL3 = this.upperarmL3.getChild("lowerarmL3");
		this.handL3 = this.lowerarmL3.getChild("handL3");
		this.thumbclawL3 = this.handL3.getChild("thumbclawL3");
		this.bone4 = this.chest2.getChild("bone4");
		this.bone2 = this.chest2.getChild("bone2");
		this.neck1 = this.chest2.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.head1 = this.neck7.getChild("head1");
		this.head2 = this.head1.getChild("head2");
		this.head4 = this.head2.getChild("head4");
		this.head3 = this.head1.getChild("head3");
		this.head5 = this.head3.getChild("head5");
		this.jaw1 = this.head1.getChild("jaw1");
		this.leftFace = this.head1.getChild("leftFace");
		this.rightFace = this.head1.getChild("rightFace");
		this.upperlegL2 = this.basin.getChild("upperlegL2");
		this.lowerlegL2 = this.upperlegL2.getChild("lowerlegL2");
		this.feetL2 = this.lowerlegL2.getChild("feetL2");
		this.toesL3 = this.feetL2.getChild("toesL3");
		this.toesL4 = this.toesL3.getChild("toesL4");
		this.upperlegL3 = this.basin.getChild("upperlegL3");
		this.lowerlegL3 = this.upperlegL3.getChild("lowerlegL3");
		this.feetL3 = this.lowerlegL3.getChild("feetL3");
		this.toesL2 = this.feetL3.getChild("toesL2");
		this.toesL5 = this.toesL2.getChild("toesL5");
		this.bone3 = this.basin.getChild("bone3");
		this.bone5 = this.basin.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -31.0F, -0.6F, 1.0F, 32.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -11.5F, -0.5F, 1.0F, 34.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.1F, -21.5F, -28.5F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-2.5F, -4.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.1F, -21.5F, -28.5F, 0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-9.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -19.5F, -0.1F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-0.2F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create().texOffs(59, 27).addBox(-0.8F, -1.0159F, -3.2669F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -6.6007F, -0.6205F, -0.1328F, 0.0F, 0.0F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.4F, 0.2448F, 0.0444F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6F, -1.3451F, 5.2377F, 0.0922F, 0.0872F, 0.0042F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(31, 46).addBox(-1.4F, 0.0795F, -0.3307F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 56).addBox(-1.4F, 0.0795F, 10.3693F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1646F, 13.9583F, -0.0025F, 0.0872F, -0.004F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3988F, 10.9385F, -0.113F, -0.1293F, 0.0204F));

		PartDefinition tail6_r1 = tail3.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(13, 45).addBox(-1.1F, -0.4F, 13.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 32).addBox(-1.1F, -0.4F, 0.1F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 0.951F, -0.1024F, 0.0829F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, -0.8897F, 13.8652F, -0.0943F, -0.1303F, 0.0123F));

		PartDefinition tail5_r1 = tail4.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(31, 32).addBox(-0.425F, 0.2F, -0.4F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, -0.036F, 0.7877F, 0.0349F, -0.0044F, -0.0002F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4258F, 11.8343F, -0.0067F, -0.1309F, 0.0009F));

		PartDefinition cube_r4 = tail5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 48).addBox(-0.75F, 0.15F, 0.2F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0076F, 0.0142F, -0.0349F, -0.0087F, 0.0003F));

		PartDefinition Tail6 = tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5201F, 10.9149F, -0.044F, -0.0872F, 0.0038F));

		PartDefinition cube_r5 = Tail6.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(62, 10).addBox(-0.8F, 0.1F, -0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.004F, 0.0489F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3034F, 7.9273F, 0.1116F, 0.2169F, 0.0241F));

		PartDefinition cube_r6 = Tail7.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 77).addBox(-0.725F, 0.05F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.004F, 0.0489F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3203F, -3.4659F, 0.0194F, -0.0436F, -0.0008F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(68, 67).addBox(-0.9F, -0.8873F, -6.4987F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.1891F, -0.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.6109F, -6.9F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition body_r2 = body2.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(57, 46).addBox(-0.9F, 0.45F, 0.975F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.7157F, -9.6999F, 0.0698F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.5579F, -9.0197F, 0.0851F, 0.0435F, 0.0037F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(49, 67).addBox(-0.9F, 0.8008F, 5.7442F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1F, 0.8847F, -12.4401F, 0.0873F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 0.8586F, -6.4418F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition chest_r2 = chest2.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(69, 5).addBox(-0.9F, -1.8983F, -7.4864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(63, 0).addBox(-0.9F, -1.8983F, -6.9864F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.1791F, 0.2412F, 0.096F, 0.0F, 0.0F));

		PartDefinition upperarmL2 = chest2.addOrReplaceChild("upperarmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3875F, 9.5414F, -3.2089F, 0.5009F, 0.1861F, -0.1479F));

		PartDefinition lowerarmL2 = upperarmL2.addOrReplaceChild("lowerarmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8034F, 9.2372F, 0.5601F, 0.2699F, 0.1034F, 0.0804F));

		PartDefinition handL2 = lowerarmL2.addOrReplaceChild("handL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0668F, -0.3729F, -5.343F, -0.0398F, 0.1817F, 0.0453F));

		PartDefinition thumbclawL2 = handL2.addOrReplaceChild("thumbclawL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 0.3772F, -1.0121F, -0.346F, 0.0946F, 0.0238F));

		PartDefinition upperarmL3 = chest2.addOrReplaceChild("upperarmL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1875F, 9.5414F, -3.2089F, 1.1904F, -0.2891F, 0.1696F));

		PartDefinition lowerarmL3 = upperarmL3.addOrReplaceChild("lowerarmL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8034F, 9.2372F, 0.5601F, 0.3572F, -0.1034F, -0.0804F));

		PartDefinition handL3 = lowerarmL3.addOrReplaceChild("handL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0668F, -0.3729F, -5.343F, -0.0398F, -0.1817F, -0.0453F));

		PartDefinition thumbclawL3 = handL3.addOrReplaceChild("thumbclawL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 0.3772F, -1.0121F, -0.346F, -0.0946F, -0.0238F));

		PartDefinition bone4 = chest2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(1.9974F, 9.5077F, -7.9315F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.7974F, 9.5077F, -7.9315F));

		PartDefinition neck1 = chest2.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3849F, -6.9834F, -0.0494F, 0.0F, 0.0F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(79, 52).addBox(-0.5F, -0.5F, -2.45F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 0.8329F, -2.6494F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.2709F, -4.7436F, -0.1118F, 0.0F, 0.0F));

		PartDefinition neck3_r1 = neck2.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(79, 45).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.075F, 0.4954F, -4.748F, -0.1047F, 0.0174F, -0.0018F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4087F, -4.3486F, 0.0681F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(14, 93).addBox(-1.575F, 0.5111F, -0.1519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 90).addBox(-1.575F, 0.5111F, -3.8519F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.2734F, -0.7067F, -0.3229F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9596F, -3.7708F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 89).addBox(-0.575F, -0.525F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8334F, -2.2119F, 0.0086F, -0.0015F, 0.1745F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0239F, -3.8912F, -0.1289F, 0.0493F, 0.0433F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(95, 33).addBox(-0.575F, -0.5F, 3.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(92, 30).addBox(-0.575F, -0.5F, -0.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0208F, 0.8626F, -4.3116F, 0.017F, 0.0061F, 0.3055F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0123F, -3.931F, 0.1716F, 0.129F, 0.0223F));

		PartDefinition cube_r10 = neck5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(104, 65).addBox(-0.45F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 0.843F, -3.3119F, 0.0607F, 0.0672F, 0.306F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.015F, -2.7925F, 0.1952F, 0.0891F, 0.2381F));

		PartDefinition cube_r11 = neck6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(92, 45).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.075F, 0.8744F, -4.0366F, 0.0087F, 0.0175F, 0.0002F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.05F, -3.9F, 0.1355F, 0.2595F, 0.035F));

		PartDefinition cube_r12 = neck7.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(93, 63).addBox(-1.5F, 0.0F, -0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.3413F, -3.1163F, 0.0087F, 0.0F, 0.0F));

		PartDefinition head1 = neck7.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4743F, -4.2007F, 0.3178F, 0.0F, 0.0F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, -0.5F, -3.0F, 0.0456F, 0.0F, 0.0F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -3.4F, 0.3187F, 0.0F, 0.0F));

		PartDefinition head3 = head1.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -3.4F, 0.1367F, 0.0F, 0.0F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.0911F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0987F, 2.0822F, 0.5178F, 0.7856F, 0.0069F, -0.0049F));

		PartDefinition leftFace = head1.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4094F, 0.403F, -0.323F, 0.0F, -0.0175F, 0.0F));

		PartDefinition rightFace = head1.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4094F, 0.403F, -0.323F, 0.0F, 0.0175F, 0.0F));

		PartDefinition upperlegL2 = basin.addOrReplaceChild("upperlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 1.8533F, 0.618F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lowerlegL2 = upperlegL2.addOrReplaceChild("lowerlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 13.4721F, 3.7335F, 0.9105F, 0.0F, 0.0F));

		PartDefinition feetL2 = lowerlegL2.addOrReplaceChild("feetL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 10.7171F, 1.0924F, -0.6355F, 0.0F, 0.0F));

		PartDefinition toesL3 = feetL2.addOrReplaceChild("toesL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 5.3106F, 0.6736F, 0.5505F, 0.0F, 0.0F));

		PartDefinition toesL4 = toesL3.addOrReplaceChild("toesL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, -0.5142F, 0.0F, 0.0F));

		PartDefinition upperlegL3 = basin.addOrReplaceChild("upperlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 1.8533F, 0.618F, -0.48F, 0.0F, 0.0F));

		PartDefinition lowerlegL3 = upperlegL3.addOrReplaceChild("lowerlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 13.4721F, 3.7335F, 1.0414F, 0.0F, 0.0F));

		PartDefinition feetL3 = lowerlegL3.addOrReplaceChild("feetL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 10.7171F, 1.0924F, -0.6355F, 0.0F, 0.0F));

		PartDefinition toesL2 = feetL3.addOrReplaceChild("toesL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 5.3106F, 0.6736F, 0.4196F, 0.0F, 0.0F));

		PartDefinition toesL5 = toesL2.addOrReplaceChild("toesL5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, -0.2087F, 0.0F, 0.0F));

		PartDefinition bone3 = basin.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.8F, -1.7091F, 4.7942F));

		PartDefinition bone5 = basin.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-3.4F, -1.7091F, 4.7942F));

		return LayerDefinition.create(meshdefinition, 133, 133);
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