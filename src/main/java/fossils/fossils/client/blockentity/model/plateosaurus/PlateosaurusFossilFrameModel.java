package fossils.fossils.client.blockentity.model.plateosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlateosaurusFossilFrameModel extends SkullModelBase {
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
	private final ModelPart upperarmL;
	private final ModelPart lowerarmL;
	private final ModelPart handL;
	private final ModelPart thumbclawL;
	private final ModelPart upperarmL2;
	private final ModelPart lowerarmL2;
	private final ModelPart handL2;
	private final ModelPart thumbclawL2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head1;
	private final ModelPart head2;
	private final ModelPart head4;
	private final ModelPart head3;
	private final ModelPart head5;
	private final ModelPart jaw1;
	private final ModelPart upperlegL;
	private final ModelPart lowerlegL;
	private final ModelPart feetL;
	private final ModelPart toesL;
	private final ModelPart toesL2;
	private final ModelPart upperlegL2;
	private final ModelPart lowerlegL2;
	private final ModelPart feetL2;
	private final ModelPart toesL3;
	private final ModelPart toesL4;
	private final ModelPart bone;
	private final ModelPart bone3;

	public PlateosaurusFossilFrameModel(ModelPart root) {
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
		this.upperarmL = this.chest2.getChild("upperarmL");
		this.lowerarmL = this.upperarmL.getChild("lowerarmL");
		this.handL = this.lowerarmL.getChild("handL");
		this.thumbclawL = this.handL.getChild("thumbclawL");
		this.upperarmL2 = this.chest2.getChild("upperarmL2");
		this.lowerarmL2 = this.upperarmL2.getChild("lowerarmL2");
		this.handL2 = this.lowerarmL2.getChild("handL2");
		this.thumbclawL2 = this.handL2.getChild("thumbclawL2");
		this.bone2 = this.chest2.getChild("bone2");
		this.bone4 = this.chest2.getChild("bone4");
		this.neck1 = this.chest2.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head1 = this.neck6.getChild("head1");
		this.head2 = this.head1.getChild("head2");
		this.head4 = this.head2.getChild("head4");
		this.head3 = this.head1.getChild("head3");
		this.head5 = this.head3.getChild("head5");
		this.jaw1 = this.head1.getChild("jaw1");
		this.upperlegL = this.basin.getChild("upperlegL");
		this.lowerlegL = this.upperlegL.getChild("lowerlegL");
		this.feetL = this.lowerlegL.getChild("feetL");
		this.toesL = this.feetL.getChild("toesL");
		this.toesL2 = this.toesL.getChild("toesL2");
		this.upperlegL2 = this.basin.getChild("upperlegL2");
		this.lowerlegL2 = this.upperlegL2.getChild("lowerlegL2");
		this.feetL2 = this.lowerlegL2.getChild("feetL2");
		this.toesL3 = this.feetL2.getChild("toesL3");
		this.toesL4 = this.toesL3.getChild("toesL4");
		this.bone = this.basin.getChild("bone");
		this.bone3 = this.basin.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -28.0F, -3.6F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.8F, 0.5F, -0.5F, 1.0F, 22.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-5.5F, -22.5F, -30.5F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-7.3F, -5.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-5.5F, -22.5F, -30.5F, -0.3927F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(3.0F, -5.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -22.5F, -3.1F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-0.2F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create().texOffs(59, 27).mirror().addBox(-0.8F, -1.0159F, -3.7669F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.2038F, -2.7571F, 0.0417F, 0.0F, 0.0F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.4F, 0.3198F, -0.5556F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(13, 13).mirror().addBox(-1.4F, 0.3198F, 13.1444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6F, -1.3451F, 5.2377F, 0.1625F, 0.0861F, 0.0141F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(31, 46).mirror().addBox(-1.4F, 0.1295F, -0.2307F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1646F, 13.9583F, -0.0375F, 0.1308F, -0.0049F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3988F, 10.9385F, -0.2304F, -0.2126F, 0.0494F));

		PartDefinition tail5_r1 = tail3.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-1.1F, 0.5F, -0.6F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0113F, 0.4334F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, -0.8897F, 13.8652F, -0.1734F, -0.129F, 0.0225F));

		PartDefinition tail5_r2 = tail4.addOrReplaceChild("tail5_r2", CubeListBuilder.create().texOffs(31, 32).mirror().addBox(-1.0F, 0.3F, -0.4F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.0151F, 0.1881F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4258F, 11.8343F, -0.1229F, -0.2166F, 0.0265F));

		PartDefinition cube_r4 = tail5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 57).mirror().addBox(-0.8F, 0.3F, 10.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 48).mirror().addBox(-0.8F, 0.3F, -0.3F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0076F, 0.0142F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tail6 = tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5201F, 10.9149F, 0.2435F, 0.2544F, 0.0624F));

		PartDefinition cube_r5 = Tail6.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(7, 76).mirror().addBox(-0.8F, 0.2F, 7.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 69).mirror().addBox(-0.8F, 0.2F, -0.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.004F, 0.0489F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3034F, 7.9273F, 0.3676F, 0.4104F, 0.1525F));

		PartDefinition cube_r6 = Tail7.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(74, 69).mirror().addBox(-0.8F, 0.2F, -0.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.004F, 0.0489F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3203F, -3.4659F, 0.1065F, 0.0872F, -0.0021F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(20, 69).mirror().addBox(-0.9F, -0.8873F, -7.0987F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.1891F, -0.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.6109F, -7.8F, -0.0176F, 0.1309F, -0.0023F));

		PartDefinition body_r2 = body2.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(57, 57).mirror().addBox(-0.9F, 0.4F, 0.7F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -8.8F, 0.0698F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.5422F, -8.1198F, 0.1294F, 0.0852F, 0.0187F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(63, 9).mirror().addBox(-0.9F, 0.8008F, 5.7442F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.8847F, -12.4401F, 0.0873F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.8586F, -6.4418F, 0.132F, 0.1298F, 0.0172F));

		PartDefinition chest_r2 = chest2.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(39, 69).mirror().addBox(-0.9F, 0.9017F, -6.9864F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, -0.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition upperarmL = chest2.addOrReplaceChild("upperarmL", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6877F, 7.0723F, -8.0651F, 0.3477F, 0.0358F, 1.03F));

		PartDefinition lowerarmL = upperarmL.addOrReplaceChild("lowerarmL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8034F, 8.7046F, 2.0782F, 0.3912F, 0.0671F, -0.1612F));

		PartDefinition handL = lowerarmL.addOrReplaceChild("handL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0668F, -0.3729F, -5.343F, 0.0009F, -0.186F, -0.2672F));

		PartDefinition thumbclawL = handL.addOrReplaceChild("thumbclawL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1366F, 0.5667F, -0.6194F, -0.6307F, -0.1991F, -0.1652F));

		PartDefinition upperarmL2 = chest2.addOrReplaceChild("upperarmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8877F, 7.0723F, -8.0651F, 0.5234F, -0.2431F, -1.087F));

		PartDefinition lowerarmL2 = upperarmL2.addOrReplaceChild("lowerarmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8034F, 8.7046F, 2.0782F, 0.3912F, -0.0671F, 0.1612F));

		PartDefinition handL2 = lowerarmL2.addOrReplaceChild("handL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0668F, -0.3729F, -5.343F, -0.0398F, 0.1817F, 0.0453F));

		PartDefinition thumbclawL2 = handL2.addOrReplaceChild("thumbclawL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 0.3772F, -1.0121F, -0.4821F, -0.1927F, 0.1279F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.5974F, 7.4077F, -9.9315F));

		PartDefinition bone4 = chest2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.7974F, 7.4077F, -9.9315F));

		PartDefinition neck1 = chest2.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.3849F, -6.9834F, -0.1414F, 0.2593F, -0.0365F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(85, 50).mirror().addBox(-1.0F, -0.0093F, 1.8055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(81, 46).mirror().addBox(-1.0F, -0.0093F, 2.5055F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.2922F, -6.9386F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, -0.2709F, -4.7437F, -0.0704F, 0.1878F, -0.2138F));

		PartDefinition neck3_r2 = neck2.addOrReplaceChild("neck3_r2", CubeListBuilder.create().texOffs(81, 31).mirror().addBox(-1.0F, 0.2188F, 0.0816F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3693F, -5.1414F, -0.1048F, -0.026F, 0.0027F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4087F, -4.3486F, -0.1048F, 0.2177F, 0.0151F));

		PartDefinition cube_r7 = neck3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(42, 93).mirror().addBox(-1.5F, 0.6111F, -3.3519F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2734F, -0.7067F, -0.3229F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9596F, -3.7708F, -0.8317F, 0.1177F, -0.0619F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(21, 96).mirror().addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(18, 93).mirror().addBox(-1.5F, 0.0F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3413F, -3.1163F, 0.0087F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0239F, -3.8912F, -0.3494F, 0.1308F, -0.0057F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(93, 77).mirror().addBox(-1.5F, 0.0F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3413F, -3.1162F, 0.0087F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0123F, -3.931F, 0.4765F, 0.0844F, 0.0223F));

		PartDefinition cube_r10 = neck5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(102, 68).mirror().addBox(-1.5F, 0.1F, 0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3413F, -3.1163F, 0.0087F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.015F, -2.7925F, 0.6938F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(56, 109).mirror().addBox(-1.5F, 0.0F, 0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3413F, -3.1163F, 0.0087F, 0.0F, 0.0F));

		PartDefinition head1 = neck6.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.6409F, -3.0772F, -0.0735F, -0.0117F, 0.016F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, -0.5F, -3.0F, 0.0456F, 0.0F, 0.0F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -3.4F, 0.3187F, 0.0F, 0.0F));

		PartDefinition head3 = head1.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -3.4F, 0.1367F, 0.0F, 0.0F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.0911F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0955F, 1.9821F, 1.047F, 0.6547F, 0.0069F, -0.0049F));

		PartDefinition upperlegL = basin.addOrReplaceChild("upperlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 2.3156F, -0.5763F, -1.1273F, 0.411F, 0.0485F));

		PartDefinition lowerlegL = upperlegL.addOrReplaceChild("lowerlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 12.8938F, 2.9176F, 1.6961F, 0.0433F, 0.0054F));

		PartDefinition feetL = lowerlegL.addOrReplaceChild("feetL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 12.9657F, 0.8398F, -0.3737F, 0.0F, 0.0F));

		PartDefinition toesL = feetL.addOrReplaceChild("toesL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 5.8627F, -0.2511F, -0.0604F, 0.0F, 0.0F));

		PartDefinition toesL2 = toesL.addOrReplaceChild("toesL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, -0.1215F, 0.0F, 0.0F));

		PartDefinition upperlegL2 = basin.addOrReplaceChild("upperlegL2", CubeListBuilder.create(), PartPose.offset(3.4F, 2.3156F, -0.5763F));

		PartDefinition lowerlegL2 = upperlegL2.addOrReplaceChild("lowerlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 12.8938F, 2.9176F, 1.0851F, 0.0F, 0.0F));

		PartDefinition feetL2 = lowerlegL2.addOrReplaceChild("feetL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 12.9657F, 0.8398F, -0.6086F, 0.0F, 0.0F));

		PartDefinition toesL3 = feetL2.addOrReplaceChild("toesL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 5.8627F, -0.2511F, 0.1578F, 0.0F, 0.0F));

		PartDefinition toesL4 = toesL3.addOrReplaceChild("toesL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, -0.6014F, 0.0F, 0.0F));

		PartDefinition bone = basin.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-3.4F, -1.3091F, 3.1942F));

		PartDefinition bone3 = basin.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.8F, -1.3091F, 3.1942F));

		return LayerDefinition.create(meshdefinition, 132, 132);
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