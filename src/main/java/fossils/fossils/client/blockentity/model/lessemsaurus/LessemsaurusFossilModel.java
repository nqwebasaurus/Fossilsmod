package fossils.fossils.client.blockentity.model.lessemsaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LessemsaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart basin;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart upperarmL;
	private final ModelPart lowerarmL;
	private final ModelPart handL;
	private final ModelPart thumbclawL;
	private final ModelPart upperarmL2;
	private final ModelPart lowerarmL2;
	private final ModelPart handL2;
	private final ModelPart thumbclawL2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart neck4;
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
	private final ModelPart bone4;

	public LessemsaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.basin = this.root.getChild("basin");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.body = this.basin.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.upperarmL = this.body3.getChild("upperarmL");
		this.lowerarmL = this.upperarmL.getChild("lowerarmL");
		this.handL = this.lowerarmL.getChild("handL");
		this.thumbclawL = this.handL.getChild("thumbclawL");
		this.upperarmL2 = this.body3.getChild("upperarmL2");
		this.lowerarmL2 = this.upperarmL2.getChild("lowerarmL2");
		this.handL2 = this.lowerarmL2.getChild("handL2");
		this.thumbclawL2 = this.handL2.getChild("thumbclawL2");
		this.bone2 = this.body3.getChild("bone2");
		this.bone3 = this.body3.getChild("bone3");
		this.chest = this.body3.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.neck4 = this.neck3.getChild("neck4");
		this.head1 = this.neck4.getChild("head1");
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
		this.bone4 = this.basin.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.1F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.1663F, 16.0759F, -0.0368F, 0.0F, 0.0F));

		PartDefinition basin_r1 = basin.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(139, 71).addBox(-0.1F, -5.2F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.557F, 8.0843F, -0.1309F, 0.0F, 0.0F));

		PartDefinition basin_r2 = basin.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(145, 49).addBox(-0.1F, -5.0F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6878F, 5.0871F, -0.0873F, 0.0F, 0.0F));

		PartDefinition basin_r3 = basin.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(40, 145).addBox(-0.1F, -5.0F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8187F, 2.09F, -0.096F, 0.0F, 0.0F));

		PartDefinition basin_r4 = basin.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(35, 145).addBox(-0.1F, -5.0F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9495F, -0.9072F, -0.0873F, 0.0F, 0.0F));

		PartDefinition basin_r5 = basin.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(145, 32).addBox(-0.1F, -6.3F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(35, 85).mirror().addBox(-3.2F, 0.0F, 0.0F, 2.0F, 0.0F, 14.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(35, 85).addBox(1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 14.0F, new CubeDeformation(0.002F))
				.texOffs(74, 72).addBox(-1.1F, -1.5F, 0.0F, 2.0F, 3.0F, 14.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5818F, -3.9697F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.206F, 9.9555F, 0.1051F, 0.2128F, 0.0651F));

		PartDefinition tail7_r1 = tail1.addOrReplaceChild("tail7_r1", CubeListBuilder.create().texOffs(16, 138).addBox(0.0F, 5.8325F, 9.4625F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(93, 136).addBox(0.0F, 3.8227F, 5.9681F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 141).addBox(0.0F, 1.8129F, 2.4737F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(145, 145).addBox(0.0F, -0.3812F, -0.9432F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.7597F, 8.8065F, 0.4887F, 0.0F, 0.0F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(150, 24).addBox(0.0F, -0.2168F, -0.7917F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.3451F, 4.5511F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail8_r1 = tail1.addOrReplaceChild("tail8_r1", CubeListBuilder.create().texOffs(5, 148).addBox(0.0F, -3.7F, -0.2F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.2269F, 19.5757F, -0.3316F, 0.0F, 0.0F));

		PartDefinition tail7_r2 = tail1.addOrReplaceChild("tail7_r2", CubeListBuilder.create().texOffs(140, 145).addBox(0.0F, -7.5F, 15.1F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(135, 145).addBox(0.0F, -7.1F, 12.1F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(91, 145).addBox(0.0F, -6.8F, 9.1F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(145, 57).addBox(0.0F, -6.4F, 6.1F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(105, 140).addBox(0.0F, -6.1F, 3.1F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(139, 120).addBox(0.0F, -5.6F, 0.1F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.1353F, 0.8933F, -0.288F, 0.0F, 0.0F));

		PartDefinition tail3_r1 = tail1.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(51, 27).mirror().addBox(-2.1F, 0.0F, 0.1F, 2.0F, 0.0F, 22.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.361F, 0.7886F, -0.07F, 0.0696F, -0.0049F));

		PartDefinition tail2_r2 = tail1.addOrReplaceChild("tail2_r2", CubeListBuilder.create().texOffs(51, 27).addBox(0.1F, 0.0F, 0.1F, 2.0F, 0.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.361F, 0.7886F, -0.07F, -0.0696F, 0.0049F));

		PartDefinition tail1_r1 = tail1.addOrReplaceChild("tail1_r1", CubeListBuilder.create().texOffs(51, 0).addBox(-1.0F, -1.5F, 0.1F, 2.0F, 3.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.2913F, -0.2089F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7349F, 22.6944F, -0.1375F, 0.3331F, -0.1317F));

		PartDefinition tail10_r1 = tail2.addOrReplaceChild("tail10_r1", CubeListBuilder.create().texOffs(150, 155).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -2.1145F, 20.9352F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail9_r1 = tail2.addOrReplaceChild("tail9_r1", CubeListBuilder.create().texOffs(155, 146).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -2.0098F, 17.937F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail8_r2 = tail2.addOrReplaceChild("tail8_r2", CubeListBuilder.create().texOffs(26, 153).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.9051F, 14.9388F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail7_r3 = tail2.addOrReplaceChild("tail7_r3", CubeListBuilder.create().texOffs(150, 34).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.8004F, 11.9406F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail6_r1 = tail2.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(150, 145).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.6957F, 8.9425F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail5_r1 = tail2.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(150, 112).addBox(-0.1F, -2.9F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.591F, 5.9443F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail4_r1 = tail2.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(150, 59).addBox(-0.1F, -3.0F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4863F, 2.9461F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail3_r2 = tail2.addOrReplaceChild("tail3_r2", CubeListBuilder.create().texOffs(10, 148).addBox(-0.1F, -3.2F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3816F, -0.0521F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail2_r3 = tail2.addOrReplaceChild("tail2_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.1F, -1.5F, -0.5F, 2.0F, 3.0F, 23.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.5F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail12_r1 = tail2.addOrReplaceChild("tail12_r1", CubeListBuilder.create().texOffs(149, 123).addBox(0.0F, 15.2924F, 28.6732F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(145, 113).addBox(0.0F, 12.807F, 24.8841F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(21, 146).addBox(0.0F, 11.2094F, 21.0259F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(26, 146).addBox(0.0F, 9.8301F, 17.2712F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.0684F, -12.7846F, 0.4887F, 0.0F, 0.0F));

		PartDefinition tail8_r3 = tail2.addOrReplaceChild("tail8_r3", CubeListBuilder.create().texOffs(63, 141).addBox(0.0F, 0.0264F, -0.6214F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.3828F, 3.2385F, 0.6196F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1408F, 23.9488F, 0.1988F, 0.2404F, 0.0789F));

		PartDefinition tail11_r1 = tail3.addOrReplaceChild("tail11_r1", CubeListBuilder.create().texOffs(118, 156).addBox(0.0F, -2.1F, 21.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(113, 156).addBox(0.0F, -2.0F, 18.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(156, 107).addBox(0.0F, -2.2F, 15.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(95, 156).addBox(0.0F, -2.2F, 12.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(90, 156).addBox(0.0F, -2.2F, 9.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(62, 156).addBox(0.0F, -2.2F, 6.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.1988F, -0.0681F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail5_r2 = tail3.addOrReplaceChild("tail5_r2", CubeListBuilder.create().texOffs(57, 156).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.7487F, 2.9489F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail4_r2 = tail3.addOrReplaceChild("tail4_r2", CubeListBuilder.create().texOffs(155, 155).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.801F, -0.0507F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail19_r1 = tail3.addOrReplaceChild("tail19_r1", CubeListBuilder.create().texOffs(144, 157).addBox(0.0F, 25.2716F, 49.4279F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(139, 157).addBox(0.0F, 23.9716F, 46.4279F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(157, 12).addBox(0.0F, 22.3716F, 43.4279F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(36, 153).addBox(0.0F, 20.0716F, 40.4279F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(31, 153).addBox(0.0F, 18.7716F, 37.4279F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(110, 148).addBox(0.0F, 16.7716F, 34.4279F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(52, 146).addBox(0.0F, 15.3716F, 31.4279F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.1672F, -35.6527F, 0.4887F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1327F, 22.915F, 0.1192F, -0.4293F, -0.0263F));

		PartDefinition tail12_r2 = tail4.addOrReplaceChild("tail12_r2", CubeListBuilder.create().texOffs(48, 155).addBox(-0.1F, -1.1F, 14.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 152).addBox(-0.1F, -1.1F, 12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 149).addBox(-0.1F, -1.1F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 146).addBox(-0.1F, -1.1F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 143).addBox(-0.1F, -1.1F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 142).addBox(-0.1F, -1.1F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 139).addBox(-0.1F, -1.1F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 66).addBox(-0.1F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2118F, 0.9408F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail27_r1 = tail4.addOrReplaceChild("tail27_r1", CubeListBuilder.create().texOffs(40, 163).addBox(0.0F, 4.8F, 13.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(163, 39).addBox(0.0F, 4.3F, 11.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 161).addBox(0.0F, 3.4F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 65).addBox(0.0F, 2.0F, 7.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 100).addBox(0.0F, 1.3F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 62).addBox(0.0F, 0.7F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 58).addBox(0.0F, 0.0F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 54).addBox(0.0F, -0.5F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.8545F, 1.3156F, 0.2705F, 0.0F, 0.0F));

		PartDefinition tail4_r3 = tail4.addOrReplaceChild("tail4_r3", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1083F, 0.0094F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3088F, 15.7447F, 0.2027F, -0.8079F, -0.6606F));

		PartDefinition tail5_r3 = tail5.addOrReplaceChild("tail5_r3", CubeListBuilder.create().texOffs(51, 50).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 20.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1083F, 0.0094F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 87).addBox(-1.1F, -1.0771F, -12.1964F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(144, 105).addBox(-0.1F, -5.2771F, -12.1964F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(144, 120).addBox(-0.1F, -5.5771F, -9.1964F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9497F, -3.6642F, 0.0039F, -0.1309F, -0.0005F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(145, 24).addBox(-0.1F, -5.0F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8771F, -3.1964F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(0, 145).addBox(-0.1F, -5.0F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7771F, -6.1964F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(35, 72).addBox(-5.6F, -4.0264F, 0.1F, 11.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 20.1229F, -11.1964F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(155, 38).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3315F, -2.0872F, 0.0554F, -0.0092F, -0.3139F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(153, 77).mirror().addBox(-4.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3315F, -2.0872F, 0.0108F, 0.0177F, -0.8578F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(155, 63).mirror().addBox(-5.64F, -3.7431F, -0.5392F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3315F, -5.0872F, 0.0424F, 0.2349F, -1.3761F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(153, 75).mirror().addBox(-5.0377F, -1.4136F, -0.5392F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3315F, -5.0872F, 0.1553F, 0.182F, -0.8433F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(150, 118).mirror().addBox(-2.4756F, -0.1539F, -0.4871F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3315F, -5.0872F, 0.2631F, 0.0578F, -0.3088F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 102).mirror().addBox(-7.7341F, -4.2342F, -0.5409F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3315F, -8.0872F, 0.0566F, 0.3034F, -1.3723F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(153, 73).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3315F, -8.0872F, 0.203F, 0.2339F, -0.8334F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(153, 71).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3315F, -8.0872F, 0.3298F, 0.0789F, -0.3042F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(153, 69).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2315F, -11.0872F, 0.4135F, 0.1047F, -0.2965F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(35, 69).mirror().addBox(-9.7341F, -4.2342F, -0.5409F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2315F, -11.0872F, 0.0752F, 0.3889F, -1.366F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(153, 67).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2315F, -11.0872F, 0.2643F, 0.298F, -0.8173F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(153, 77).addBox(1.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.3315F, -2.0872F, 0.0108F, -0.0177F, 0.8578F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(155, 38).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.3315F, -2.0872F, 0.0554F, 0.0092F, 0.3139F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(150, 118).addBox(-0.5244F, -0.1539F, -0.4871F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.3315F, -5.0872F, 0.2631F, -0.0578F, 0.3088F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(153, 75).addBox(2.0377F, -1.4136F, -0.5392F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.3315F, -5.0872F, 0.1553F, -0.182F, 0.8433F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(155, 63).addBox(3.64F, -3.7431F, -0.5392F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.3315F, -5.0872F, 0.0424F, -0.2349F, 1.3761F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(153, 71).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.3315F, -8.0872F, 0.3298F, -0.0789F, 0.3042F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(153, 73).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.3315F, -8.0872F, 0.203F, -0.2339F, 0.8334F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(52, 102).addBox(3.7341F, -4.2342F, -0.5409F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.3315F, -8.0872F, 0.0566F, -0.3034F, 1.3723F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(153, 67).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2315F, -11.0872F, 0.2643F, -0.298F, 0.8173F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(35, 69).addBox(3.7341F, -4.2342F, -0.5409F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2315F, -11.0872F, 0.0752F, -0.3889F, 1.366F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(153, 69).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2315F, -11.0872F, 0.4135F, -0.1047F, 0.2965F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5141F, -11.9968F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition body_r4 = body2.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(96, 147).addBox(-0.1F, -4.0F, -0.1F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6521F, -2.9734F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body_r5 = body2.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(75, 147).addBox(-0.1F, -3.8F, -0.1F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7045F, -5.9729F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body_r6 = body2.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(16, 147).addBox(-0.1F, -3.4F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8586F, -9.0707F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(153, 65).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1826F, -8.0904F, 0.4303F, 0.1098F, -0.2947F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(152, 133).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1826F, -8.0904F, 0.2769F, 0.3107F, -0.8135F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(102, 24).mirror().addBox(-15.7341F, -4.2342F, -0.5409F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1826F, -8.0904F, 0.079F, 0.406F, -1.3645F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(119, 46).mirror().addBox(-13.7341F, -4.2342F, -0.5409F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1826F, -5.0904F, 0.079F, 0.406F, -1.3645F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(152, 97).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1826F, -5.0904F, 0.2769F, 0.3107F, -0.8135F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(151, 19).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1826F, -5.0904F, 0.4303F, 0.1098F, -0.2947F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(122, 97).mirror().addBox(-11.7341F, -4.2342F, -0.5409F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4826F, -2.0904F, 0.0713F, 0.3718F, -1.3674F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(151, 139).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4826F, -2.0904F, 0.2519F, 0.2853F, -0.8209F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(151, 47).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4826F, -2.0904F, 0.3967F, 0.0996F, -0.2983F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(102, 24).addBox(3.7341F, -4.2342F, -0.5409F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.1826F, -8.0904F, 0.079F, -0.406F, 1.3645F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(152, 133).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.1826F, -8.0904F, 0.2769F, -0.3107F, 0.8135F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(153, 65).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.1826F, -8.0904F, 0.4303F, -0.1098F, 0.2947F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(151, 19).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.1826F, -5.0904F, 0.4303F, -0.1098F, 0.2947F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(152, 97).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.1826F, -5.0904F, 0.2769F, -0.3107F, 0.8135F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(119, 46).addBox(3.7341F, -4.2342F, -0.5409F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.1826F, -5.0904F, 0.079F, -0.406F, 1.3645F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(151, 47).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.4826F, -2.0904F, 0.3967F, -0.0996F, 0.2983F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(151, 139).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.4826F, -2.0904F, 0.2519F, -0.2853F, 0.8209F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(122, 97).addBox(3.7341F, -4.2342F, -0.5409F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.4826F, -2.0904F, 0.0713F, -0.3718F, 1.3674F));

		PartDefinition body_r7 = body2.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(0, 54).addBox(-4.6F, -4.0008F, 0.0555F, 9.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.7139F, -10.83F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body_r8 = body2.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(97, 90).addBox(-1.1F, -1.5F, -10.1F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(102, 12).addBox(-1.1F, -1.6F, -6.8F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0261F, -11.1017F, 0.132F, -0.1298F, -0.0172F));

		PartDefinition body_r9 = body3.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(147, 6).addBox(-0.1F, -3.4F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -0.8F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body_r10 = body3.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(146, 135).addBox(-0.1F, -3.2F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -3.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(94, 61).mirror().addBox(-17.7341F, -4.2342F, -0.5409F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0435F, -5.6887F, 0.0713F, 0.3718F, -1.3674F));

		PartDefinition cube_r42 = body3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(154, 127).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0435F, -5.6887F, 0.2519F, 0.2853F, -0.8209F));

		PartDefinition cube_r43 = body3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(153, 87).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0435F, -5.6887F, 0.3967F, 0.0996F, -0.2983F));

		PartDefinition cube_r44 = body3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(94, 65).mirror().addBox(-16.7341F, -4.2342F, -0.5409F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1435F, -2.6887F, 0.0566F, 0.3034F, -1.3723F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(153, 85).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1435F, -2.6887F, 0.203F, 0.2339F, -0.8334F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(153, 83).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1435F, -2.6887F, 0.3298F, 0.0789F, -0.3042F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(153, 81).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1435F, 0.3113F, 0.2964F, 0.0684F, -0.3067F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(153, 79).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1435F, 0.3113F, 0.179F, 0.208F, -0.8387F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(94, 63).mirror().addBox(-16.7341F, -4.2342F, -0.5409F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1435F, 0.3113F, 0.0494F, 0.2692F, -1.3743F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(153, 87).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.0435F, -5.6887F, 0.3967F, -0.0996F, 0.2983F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(154, 127).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.0435F, -5.6887F, 0.2519F, -0.2853F, 0.8209F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(94, 61).addBox(3.7341F, -4.2342F, -0.5409F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.0435F, -5.6887F, 0.0713F, -0.3718F, 1.3674F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(153, 83).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1435F, -2.6887F, 0.3298F, -0.0789F, 0.3042F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(153, 85).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1435F, -2.6887F, 0.203F, -0.2339F, 0.8334F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(94, 65).addBox(3.7341F, -4.2342F, -0.5409F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1435F, -2.6887F, 0.0566F, -0.3034F, 1.3723F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(94, 63).addBox(3.7341F, -4.2342F, -0.5409F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1435F, 0.3113F, 0.0494F, -0.2692F, 1.3743F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(153, 79).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1435F, 0.3113F, 0.179F, -0.208F, 0.8387F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(153, 81).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1435F, 0.3113F, 0.2964F, -0.0684F, 0.3067F));

		PartDefinition body_r11 = body3.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(152, 12).addBox(-0.1F, -3.1F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -6.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body_r12 = body3.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(94, 50).addBox(-3.6F, -2.8077F, -0.0142F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.9417F, -8.4442F, -0.3665F, 0.0F, 0.0F));

		PartDefinition upperarmL = body3.addOrReplaceChild("upperarmL", CubeListBuilder.create().texOffs(84, 143).addBox(-0.2479F, -0.8957F, 0.018F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.209F))
				.texOffs(29, 87).addBox(-0.2479F, 2.6043F, -0.782F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(5.3669F, 11.58F, -12.7846F, -0.0682F, 0.253F, -0.1442F));

		PartDefinition upperarm4_r1 = upperarmL.addOrReplaceChild("upperarm4_r1", CubeListBuilder.create().texOffs(21, 139).addBox(-0.5F, -4.4768F, -1.2206F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5521F, 2.4043F, -1.882F, -0.9076F, 0.0F, 0.0F));

		PartDefinition upperarm4_r2 = upperarmL.addOrReplaceChild("upperarm4_r2", CubeListBuilder.create().texOffs(138, 33).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5521F, 4.5997F, -2.546F, 0.5236F, 0.0F, 0.0F));

		PartDefinition upperarm3_r1 = upperarmL.addOrReplaceChild("upperarm3_r1", CubeListBuilder.create().texOffs(138, 113).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5521F, 1.1297F, -2.0891F, -0.1309F, 0.0F, 0.0F));

		PartDefinition upperarm5_r1 = upperarmL.addOrReplaceChild("upperarm5_r1", CubeListBuilder.create().texOffs(162, 85).addBox(-0.5F, -0.2F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.256F)), PartPose.offsetAndRotation(0.2521F, 11.1043F, -1.282F, -0.3054F, 0.0F, 0.0F));

		PartDefinition upperarm4_r3 = upperarmL.addOrReplaceChild("upperarm4_r3", CubeListBuilder.create().texOffs(162, 82).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.26F)), PartPose.offsetAndRotation(0.2521F, 11.1043F, -1.282F, -1.0036F, 0.0F, 0.0F));

		PartDefinition upperarm5_r2 = upperarmL.addOrReplaceChild("upperarm5_r2", CubeListBuilder.create().texOffs(138, 40).addBox(-0.5F, -1.2F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.2521F, 3.7336F, 1.1504F, 1.3614F, 0.0F, 0.0F));

		PartDefinition upperarm4_r4 = upperarmL.addOrReplaceChild("upperarm4_r4", CubeListBuilder.create().texOffs(137, 135).addBox(-0.5F, -2.3F, -3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.198F)), PartPose.offsetAndRotation(0.2521F, 1.3377F, 2.9558F, 0.925F, 0.0F, 0.0F));

		PartDefinition upperarm3_r2 = upperarmL.addOrReplaceChild("upperarm3_r2", CubeListBuilder.create().texOffs(45, 146).addBox(-0.5F, 0.2F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.2521F, -1.0714F, 2.2877F, 0.2705F, 0.0F, 0.0F));

		PartDefinition lowerarmL = upperarmL.addOrReplaceChild("lowerarmL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.645F, 11.8743F, -0.4736F, 0.7993F, 0.663F, -0.6544F));

		PartDefinition arms4_r1 = lowerarmL.addOrReplaceChild("arms4_r1", CubeListBuilder.create().texOffs(71, 104).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5591F, -1.897F, -3.9888F, -0.2967F, 0.0F, 0.0F));

		PartDefinition arms3_r1 = lowerarmL.addOrReplaceChild("arms3_r1", CubeListBuilder.create().texOffs(52, 104).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5591F, -1.897F, -3.9888F, -0.0873F, 0.0F, 0.0F));

		PartDefinition arms2_r1 = lowerarmL.addOrReplaceChild("arms2_r1", CubeListBuilder.create().texOffs(0, 103).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-0.5591F, 0.503F, -2.7888F, -0.0873F, 0.0F, 0.0F));

		PartDefinition handL = lowerarmL.addOrReplaceChild("handL", CubeListBuilder.create().texOffs(51, 121).addBox(-2.0F, -1.65F, -5.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.6893F, -1.397F, -8.2722F, -0.1418F, -1.083F, 0.0591F));

		PartDefinition thumbclawL = handL.addOrReplaceChild("thumbclawL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, -1.2F, -0.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition thumbclaw2_r1 = thumbclawL.addOrReplaceChild("thumbclaw2_r1", CubeListBuilder.create().texOffs(37, 131).addBox(-1.0F, -1.2F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1F, -1.6F, 0.0F, -0.3054F, 0.0F));

		PartDefinition upperarmL2 = body3.addOrReplaceChild("upperarmL2", CubeListBuilder.create().texOffs(117, 143).addBox(-0.7521F, -0.8957F, 0.018F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.209F))
				.texOffs(79, 136).addBox(-0.7521F, 2.6043F, -0.782F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-5.5669F, 11.58F, -12.7846F, 0.9354F, -0.253F, 0.1442F));

		PartDefinition upperarm5_r3 = upperarmL2.addOrReplaceChild("upperarm5_r3", CubeListBuilder.create().texOffs(68, 139).addBox(-0.5F, -4.4768F, -1.2206F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.5521F, 2.4043F, -1.882F, -0.9076F, 0.0F, 0.0F));

		PartDefinition upperarm5_r4 = upperarmL2.addOrReplaceChild("upperarm5_r4", CubeListBuilder.create().texOffs(138, 57).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5521F, 4.5997F, -2.546F, 0.5236F, 0.0F, 0.0F));

		PartDefinition upperarm4_r5 = upperarmL2.addOrReplaceChild("upperarm4_r5", CubeListBuilder.create().texOffs(28, 139).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.5521F, 1.1297F, -2.0891F, -0.1309F, 0.0F, 0.0F));

		PartDefinition upperarm6_r1 = upperarmL2.addOrReplaceChild("upperarm6_r1", CubeListBuilder.create().texOffs(162, 110).addBox(-0.5F, -0.2F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.256F)), PartPose.offsetAndRotation(-0.2521F, 11.1043F, -1.282F, -0.3054F, 0.0F, 0.0F));

		PartDefinition upperarm5_r5 = upperarmL2.addOrReplaceChild("upperarm5_r5", CubeListBuilder.create().texOffs(105, 162).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.26F)), PartPose.offsetAndRotation(-0.2521F, 11.1043F, -1.282F, -1.0036F, 0.0F, 0.0F));

		PartDefinition upperarm6_r2 = upperarmL2.addOrReplaceChild("upperarm6_r2", CubeListBuilder.create().texOffs(49, 141).addBox(-0.5F, -1.2F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.2521F, 3.7336F, 1.1504F, 1.3614F, 0.0F, 0.0F));

		PartDefinition upperarm5_r6 = upperarmL2.addOrReplaceChild("upperarm5_r6", CubeListBuilder.create().texOffs(7, 138).addBox(-0.5F, -2.3F, -3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.198F)), PartPose.offsetAndRotation(-0.2521F, 1.3377F, 2.9558F, 0.925F, 0.0F, 0.0F));

		PartDefinition upperarm4_r6 = upperarmL2.addOrReplaceChild("upperarm4_r6", CubeListBuilder.create().texOffs(146, 65).addBox(-0.5F, 0.2F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.2521F, -1.0714F, 2.2877F, 0.2705F, 0.0F, 0.0F));

		PartDefinition lowerarmL2 = upperarmL2.addOrReplaceChild("lowerarmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.645F, 11.8743F, -0.4736F, 0.305F, 0.0136F, 1.1685F));

		PartDefinition arms5_r1 = lowerarmL2.addOrReplaceChild("arms5_r1", CubeListBuilder.create().texOffs(107, 79).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5591F, -1.897F, -3.9888F, -0.2967F, 0.0F, 0.0F));

		PartDefinition arms4_r2 = lowerarmL2.addOrReplaceChild("arms4_r2", CubeListBuilder.create().texOffs(107, 69).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5591F, -1.897F, -3.9888F, -0.0873F, 0.0F, 0.0F));

		PartDefinition arms3_r2 = lowerarmL2.addOrReplaceChild("arms3_r2", CubeListBuilder.create().texOffs(90, 104).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(0.5591F, 0.503F, -2.7888F, -0.0873F, 0.0F, 0.0F));

		PartDefinition handL2 = lowerarmL2.addOrReplaceChild("handL2", CubeListBuilder.create().texOffs(66, 121).addBox(0.0F, -1.65F, -5.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.6893F, -1.397F, -8.2722F, -0.0338F, -0.6133F, 0.1062F));

		PartDefinition thumbclawL2 = handL2.addOrReplaceChild("thumbclawL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, -1.2F, -0.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition thumbclaw3_r1 = thumbclawL2.addOrReplaceChild("thumbclaw3_r1", CubeListBuilder.create().texOffs(11, 132).addBox(-1.0F, -1.2F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.1F, -1.6F, 0.0F, 0.3054F, 0.0F));

		PartDefinition bone2 = body3.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.4974F, 9.5044F, -16.8928F));

		PartDefinition body_r13 = bone2.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(104, 114).addBox(-2.5F, -2.0F, -2.6F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8784F, 0.9923F, 0.3758F));

		PartDefinition body_r14 = bone2.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(128, 121).addBox(-0.8493F, -0.0035F, -1.6974F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.7026F, -3.4178F, 5.2452F, -1.6523F, 0.6055F, -0.11F));

		PartDefinition body_r15 = bone2.addOrReplaceChild("body_r15", CubeListBuilder.create().texOffs(146, 99).addBox(-0.8493F, 0.773F, -3.356F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7026F, -3.4178F, 5.2452F, -0.8233F, 0.6055F, -0.11F));

		PartDefinition body_r16 = bone2.addOrReplaceChild("body_r16", CubeListBuilder.create().texOffs(89, 114).addBox(-0.8493F, 0.1197F, -1.554F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.7026F, -3.4178F, 5.2452F, -1.3469F, 0.6055F, -0.11F));

		PartDefinition body_r17 = bone2.addOrReplaceChild("body_r17", CubeListBuilder.create().texOffs(128, 99).addBox(-0.5F, -1.5202F, -0.9908F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.6026F, -5.3178F, 7.8452F, -0.9154F, 0.2581F, -0.2244F));

		PartDefinition body_r18 = bone2.addOrReplaceChild("body_r18", CubeListBuilder.create().texOffs(110, 125).addBox(-0.5F, -1.5976F, -1.3604F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6026F, -5.3178F, 7.8452F, -0.959F, 0.2581F, -0.2244F));

		PartDefinition body_r19 = bone2.addOrReplaceChild("body_r19", CubeListBuilder.create().texOffs(136, 0).addBox(-1.0885F, -3.0696F, -1.1433F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2026F, -6.0178F, 8.3452F, -0.6915F, 0.2202F, -0.2616F));

		PartDefinition body_r20 = bone2.addOrReplaceChild("body_r20", CubeListBuilder.create().texOffs(125, 0).addBox(-1.0885F, -6.2344F, -0.3039F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.2026F, -6.0178F, 8.3452F, -0.4297F, 0.2202F, -0.2616F));

		PartDefinition body_r21 = bone2.addOrReplaceChild("body_r21", CubeListBuilder.create().texOffs(59, 132).addBox(-1.0885F, -4.9374F, -1.1381F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.2026F, -6.0178F, 8.3452F, -1.1279F, 0.2202F, -0.2616F));

		PartDefinition body_r22 = bone2.addOrReplaceChild("body_r22", CubeListBuilder.create().texOffs(136, 50).addBox(-1.0885F, -7.2192F, -0.5685F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2026F, -6.0178F, 8.3452F, -1.0406F, 0.2202F, -0.2616F));

		PartDefinition bone3 = body3.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-2.6974F, 9.5044F, -16.8928F));

		PartDefinition body_r23 = bone3.addOrReplaceChild("body_r23", CubeListBuilder.create().texOffs(104, 114).mirror().addBox(1.5F, -2.0F, -2.6F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8784F, -0.9923F, -0.3758F));

		PartDefinition body_r24 = bone3.addOrReplaceChild("body_r24", CubeListBuilder.create().texOffs(128, 121).mirror().addBox(-0.1507F, -0.0035F, -1.6974F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7026F, -3.4178F, 5.2452F, -1.6523F, -0.6055F, 0.11F));

		PartDefinition body_r25 = bone3.addOrReplaceChild("body_r25", CubeListBuilder.create().texOffs(146, 99).mirror().addBox(-0.1507F, 0.773F, -3.356F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7026F, -3.4178F, 5.2452F, -0.8233F, -0.6055F, 0.11F));

		PartDefinition body_r26 = bone3.addOrReplaceChild("body_r26", CubeListBuilder.create().texOffs(89, 114).mirror().addBox(-0.1507F, 0.1197F, -1.554F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.7026F, -3.4178F, 5.2452F, -1.3469F, -0.6055F, 0.11F));

		PartDefinition body_r27 = bone3.addOrReplaceChild("body_r27", CubeListBuilder.create().texOffs(128, 99).mirror().addBox(-0.5F, -1.5202F, -0.9908F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.6026F, -5.3178F, 7.8452F, -0.9154F, -0.2581F, 0.2244F));

		PartDefinition body_r28 = bone3.addOrReplaceChild("body_r28", CubeListBuilder.create().texOffs(110, 125).mirror().addBox(-0.5F, -1.5976F, -1.3604F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6026F, -5.3178F, 7.8452F, -0.959F, -0.2581F, 0.2244F));

		PartDefinition body_r29 = bone3.addOrReplaceChild("body_r29", CubeListBuilder.create().texOffs(136, 0).mirror().addBox(0.0885F, -3.0696F, -1.1433F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2026F, -6.0178F, 8.3452F, -0.6915F, -0.2202F, 0.2616F));

		PartDefinition body_r30 = bone3.addOrReplaceChild("body_r30", CubeListBuilder.create().texOffs(125, 0).mirror().addBox(0.0885F, -6.2344F, -0.3039F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.2026F, -6.0178F, 8.3452F, -0.4297F, -0.2202F, 0.2616F));

		PartDefinition body_r31 = bone3.addOrReplaceChild("body_r31", CubeListBuilder.create().texOffs(59, 132).mirror().addBox(0.0885F, -4.9374F, -1.1381F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.2026F, -6.0178F, 8.3452F, -1.1279F, -0.2202F, 0.2616F));

		PartDefinition body_r32 = bone3.addOrReplaceChild("body_r32", CubeListBuilder.create().texOffs(136, 50).mirror().addBox(0.0885F, -7.2192F, -0.5685F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2026F, -6.0178F, 8.3452F, -1.0406F, -0.2202F, 0.2616F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(100, 39).addBox(-1.1F, -3.0168F, -6.2452F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3484F, -7.5556F, -0.1344F, 0.0F, 0.0F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(85, 152).addBox(-0.1F, -2.4F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0168F, -5.2452F, -0.0436F, 0.0F, 0.0F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(80, 152).addBox(-0.1F, -2.825F, -2.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8168F, -0.2452F, 0.0436F, 0.0F, 0.0F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(68, 90).mirror().addBox(-0.1F, 0.2F, -0.3F, 1.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7698F, 13.8644F, -0.0457F, -0.2545F, -0.6296F, 0.5984F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(100, 27).mirror().addBox(-0.6F, 0.2F, -0.7F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7698F, 13.8644F, -0.0457F, -0.2546F, -0.7049F, 0.6268F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(32, 114).mirror().addBox(-0.4F, 0.2F, 0.3F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8346F, 13.5233F, -1.5703F, -0.2626F, -0.8742F, 0.6872F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(155, 116).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.2049F, -4.2081F, 0.5739F, 0.1517F, -0.276F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(153, 91).mirror().addBox(-4.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.2049F, -4.2081F, 0.3882F, 0.4166F, -0.7739F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(19, 112).mirror().addBox(-15.5459F, -3.252F, -0.5375F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.2049F, -4.2081F, 0.1146F, 0.551F, -1.3481F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(153, 89).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -1.2049F, -0.8081F, 0.5315F, 0.1396F, -0.2821F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(94, 67).mirror().addBox(-16.7341F, -4.2342F, -0.5409F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -1.2049F, -0.8081F, 0.1035F, 0.5084F, -1.3537F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(151, 21).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -1.2049F, -0.8081F, 0.3545F, 0.3859F, -0.787F));

		PartDefinition chest_r6 = chest.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(68, 90).addBox(-0.9F, 0.2F, -0.3F, 1.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5698F, 13.8644F, -0.0457F, -0.2545F, 0.6296F, -0.5984F));

		PartDefinition chest_r7 = chest.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(100, 27).addBox(-0.4F, 0.2F, -0.7F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5698F, 13.8644F, -0.0457F, -0.2546F, 0.7049F, -0.6268F));

		PartDefinition chest_r8 = chest.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(32, 114).addBox(-0.6F, 0.2F, 0.3F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6346F, 13.5233F, -1.5703F, -0.2626F, 0.8742F, -0.6872F));

		PartDefinition chest_r9 = chest.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(13, 114).addBox(-1.0F, 0.1F, -3.1F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 12.4832F, -2.7452F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(19, 112).addBox(3.5459F, -3.252F, -0.5375F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -1.2049F, -4.2081F, 0.1146F, -0.551F, 1.3481F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(153, 91).addBox(1.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -1.2049F, -4.2081F, 0.3882F, -0.4166F, 0.7739F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(155, 116).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -1.2049F, -4.2081F, 0.5739F, -0.1517F, 0.276F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(151, 21).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2049F, -0.8081F, 0.3545F, -0.3859F, 0.787F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(94, 67).addBox(3.7341F, -4.2342F, -0.5409F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2049F, -0.8081F, 0.1035F, -0.5084F, 1.3537F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(153, 89).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2049F, -0.8081F, 0.5315F, -0.1396F, 0.2821F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9218F, -6.2014F, -0.4996F, -0.1948F, 0.0079F));

		PartDefinition neck4_r1 = neck1.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(74, 154).addBox(-0.1F, -2.3544F, 0.0209F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8422F, -7.8174F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(0, 153).addBox(-0.1F, -2.5544F, 0.0209F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8162F, -4.9983F, 0.1658F, 0.0F, 0.0F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(101, 152).addBox(-0.1F, -3.6544F, 7.7209F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(29, 100).addBox(-1.1F, -1.2544F, 0.7209F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 3.5513F, -9.0044F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r71 = neck1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(154, 40).mirror().addBox(-5.5871F, -1.1029F, -0.5369F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.6168F, -6.8067F, 1.0562F, 1.365F, -0.4953F));

		PartDefinition cube_r72 = neck1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(134, 153).mirror().addBox(-2.8261F, -0.0209F, -0.5369F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.6168F, -6.8067F, 1.3863F, 0.9906F, -0.1445F));

		PartDefinition cube_r73 = neck1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(153, 101).mirror().addBox(-2.8261F, -0.0209F, -0.5369F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.6168F, -4.1067F, 1.2989F, 0.8399F, -0.2012F));

		PartDefinition cube_r74 = neck1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(141, 97).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9613F, 2.0249F, -2.0379F, 1.0969F, 1.1671F, -0.4372F));

		PartDefinition cube_r75 = neck1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(29, 98).mirror().addBox(-0.9642F, 0.0538F, -0.4345F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.4168F, -0.8067F, 1.0963F, 0.2688F, -0.1644F));

		PartDefinition cube_r76 = neck1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(153, 99).mirror().addBox(-3.8525F, -0.4559F, -0.4506F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.4168F, -0.8067F, 0.8908F, 0.7342F, -0.4927F));

		PartDefinition cube_r77 = neck1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(119, 48).mirror().addBox(-13.0924F, -2.321F, -0.4506F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.4168F, -0.8067F, 0.3395F, 1.0529F, -1.1809F));

		PartDefinition cube_r78 = neck1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(134, 153).addBox(-0.1739F, -0.0209F, -0.5369F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.6168F, -6.8067F, 1.3863F, -0.9906F, 0.1445F));

		PartDefinition cube_r79 = neck1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(154, 40).addBox(2.5871F, -1.1029F, -0.5369F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.6168F, -6.8067F, 1.0562F, -1.365F, 0.4953F));

		PartDefinition cube_r80 = neck1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(141, 97).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7613F, 2.0249F, -2.0379F, 1.0969F, -1.1671F, 0.4372F));

		PartDefinition cube_r81 = neck1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(153, 101).addBox(-0.1739F, -0.0209F, -0.5369F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6168F, -4.1067F, 1.2989F, -0.8399F, 0.2012F));

		PartDefinition cube_r82 = neck1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(119, 48).addBox(3.0924F, -2.321F, -0.4506F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4168F, -0.8067F, 0.3395F, -1.0529F, 1.1809F));

		PartDefinition cube_r83 = neck1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(153, 99).addBox(0.8524F, -0.4559F, -0.4506F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4168F, -0.8067F, 0.8908F, -0.7342F, 0.4927F));

		PartDefinition cube_r84 = neck1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(29, 98).addBox(-0.0358F, 0.0538F, -0.4345F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4168F, -0.8067F, 1.0963F, -0.2688F, 0.1644F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(124, 155).addBox(0.0F, -2.5669F, -6.0556F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(159, 5).addBox(0.0F, -2.1669F, -9.0556F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.3934F, -8.1425F, -0.0502F, -0.1707F, 0.0045F));

		PartDefinition neck3_r2 = neck2.addOrReplaceChild("neck3_r2", CubeListBuilder.create().texOffs(122, 99).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9585F, -3.0812F, -0.0436F, 0.0F, 0.0F));

		PartDefinition neck2_r2 = neck2.addOrReplaceChild("neck2_r2", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -0.4666F, 2.282F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.5851F, -11.2315F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r85 = neck2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(52, 100).mirror().addBox(-1.9336F, -0.6742F, -1.1898F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 69).mirror().addBox(-4.8261F, -0.0209F, -0.5369F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5234F, -5.5642F, 1.3561F, 1.3418F, -0.199F));

		PartDefinition cube_r86 = neck2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(90, 154).mirror().addBox(-5.5871F, -1.1029F, -0.5369F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1234F, -2.4642F, 0.8119F, 1.503F, -0.7413F));

		PartDefinition cube_r87 = neck2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(154, 42).mirror().addBox(-2.8261F, -0.0209F, -0.5369F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1234F, -2.4642F, 1.4621F, 1.1266F, -0.0817F));

		PartDefinition cube_r88 = neck2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(52, 100).addBox(-3.0664F, -0.6742F, -1.1898F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 69).addBox(-0.1739F, -0.0209F, -0.5369F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5234F, -5.5642F, 1.3561F, -1.3418F, 0.199F));

		PartDefinition cube_r89 = neck2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(154, 42).addBox(-0.1739F, -0.0209F, -0.5369F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1234F, -2.4642F, 1.4621F, -1.1266F, 0.0817F));

		PartDefinition cube_r90 = neck2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(90, 154).addBox(2.5871F, -1.1029F, -0.5369F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1234F, -2.4642F, 0.8119F, -1.503F, 0.7413F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6184F, -9.0276F, 0.4706F, -0.3496F, -0.2803F));

		PartDefinition neck5_r1 = neck3.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(109, 104).addBox(-1.0F, -0.6798F, 3.7211F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7514F, -9.7039F, -0.3578F, 0.0F, 0.0F));

		PartDefinition neck6_r1 = neck3.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(21, 153).addBox(0.0F, -2.2798F, 0.0211F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6674F, -5.0914F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r91 = neck3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(115, 154).mirror().addBox(-3.0123F, -0.5892F, -0.9603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4342F, -1.777F, -5.1798F, 0.4962F, 1.0862F, -1.1028F));

		PartDefinition cube_r92 = neck3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(141, 133).mirror().addBox(-4.1448F, 0.1057F, -0.5799F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0521F, -0.3887F, -2.5931F, 0.4532F, 1.0396F, -1.1521F));

		PartDefinition cube_r93 = neck3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(115, 154).addBox(0.0123F, -0.5892F, -0.9603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4342F, -1.777F, -5.1798F, 0.4962F, -1.0862F, 1.1028F));

		PartDefinition cube_r94 = neck3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(141, 133).addBox(0.1448F, 0.1057F, -0.5799F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0521F, -0.3887F, -2.5931F, 0.4532F, -1.0396F, 1.1521F));

		PartDefinition neck4_r2 = neck3.addOrReplaceChild("neck4_r2", CubeListBuilder.create().texOffs(150, 53).addBox(0.0F, -2.1798F, 0.0211F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7105F, -2.2464F, -0.5323F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1149F, -6.1983F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck7_r1 = neck.addOrReplaceChild("neck7_r1", CubeListBuilder.create().texOffs(134, 155).addBox(0.0F, -1.6798F, -1.8788F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0831F, -2.5688F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck6_r2 = neck.addOrReplaceChild("neck6_r2", CubeListBuilder.create().texOffs(129, 155).addBox(0.0F, -1.9798F, 0.0212F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5667F, -1.5975F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r95 = neck.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(154, 125).mirror().addBox(2.6062F, -1.8282F, -1.3304F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(154, 123).mirror().addBox(-0.4215F, -1.1625F, -1.1569F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4342F, 0.3379F, 1.0185F, 0.4962F, 1.0862F, -1.1028F));

		PartDefinition cube_r96 = neck.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(154, 125).addBox(-5.6062F, -1.8282F, -1.3304F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 123).addBox(-2.5785F, -1.1625F, -1.1569F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4342F, 0.3379F, 1.0185F, 0.4962F, -1.0862F, 1.1028F));

		PartDefinition neck5_r2 = neck.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(123, 12).addBox(-1.0F, -0.6798F, -1.2789F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -3.4F, -0.3578F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.034F, -10.8657F, 0.3292F, -0.29F, -0.0974F));

		PartDefinition neck6_r3 = neck4.addOrReplaceChild("neck6_r3", CubeListBuilder.create().texOffs(155, 141).addBox(0.0F, -0.8F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7652F, -2.5727F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r97 = neck4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(151, 45).mirror().addBox(5.9013F, -2.636F, -2.6187F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4342F, 1.257F, 5.6859F, 0.4962F, 1.0862F, -1.1028F));

		PartDefinition cube_r98 = neck4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(151, 45).addBox(-8.9013F, -2.636F, -2.6187F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4342F, 1.257F, 5.6859F, 0.4962F, -1.0862F, 1.1028F));

		PartDefinition neck5_r3 = neck4.addOrReplaceChild("neck5_r3", CubeListBuilder.create().texOffs(122, 89).addBox(-1.0F, -0.9F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.3194F, -4.7201F, -0.2182F, 0.0F, 0.0F));

		PartDefinition head1 = neck4.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5194F, -5.2201F, 0.056F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(155, 27).mirror().addBox(-0.1172F, -0.698F, -0.2219F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-1.4191F, -0.7188F, -4.9327F, 0.1213F, -0.2432F, -0.077F));

		PartDefinition head13_r1 = head1.addOrReplaceChild("head13_r1", CubeListBuilder.create().texOffs(50, 159).mirror().addBox(0.1733F, 0.2523F, -0.8403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8028F, -6.2915F, -1.9037F, -0.0535F, 0.0576F));

		PartDefinition head14_r1 = head1.addOrReplaceChild("head14_r1", CubeListBuilder.create().texOffs(30, 163).mirror().addBox(0.1733F, 0.5749F, 0.2213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8028F, -6.2915F, -2.6019F, -0.0535F, 0.0576F));

		PartDefinition head15_r1 = head1.addOrReplaceChild("head15_r1", CubeListBuilder.create().texOffs(20, 163).mirror().addBox(0.1733F, -0.6254F, 0.5947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(45, 159).mirror().addBox(0.1733F, -0.6254F, 1.2947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8028F, -6.2915F, 3.1141F, -0.0535F, 0.0576F));

		PartDefinition head12_r1 = head1.addOrReplaceChild("head12_r1", CubeListBuilder.create().texOffs(35, 163).mirror().addBox(0.1733F, 0.25F, -0.1074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8028F, -6.2915F, -1.991F, -0.0535F, 0.0576F));

		PartDefinition head14_r2 = head1.addOrReplaceChild("head14_r2", CubeListBuilder.create().texOffs(158, 120).mirror().addBox(0.1733F, 0.8323F, 0.431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8028F, -6.2915F, -2.2964F, -0.0535F, 0.0576F));

		PartDefinition head12_r2 = head1.addOrReplaceChild("head12_r2", CubeListBuilder.create().texOffs(105, 159).mirror().addBox(-0.025F, 0.2541F, -0.9639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 159).mirror().addBox(-0.025F, 1.0541F, -0.9639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.2062F, -3.6813F, -1.9865F, -0.1818F, 0.0107F));

		PartDefinition head10_r1 = head1.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(81, 121).mirror().addBox(-0.025F, -0.1791F, -0.1004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.2062F, -3.6813F, -3.121F, -0.1818F, 0.0107F));

		PartDefinition cube_r100 = head1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(150, 129).mirror().addBox(-0.1172F, -0.698F, -1.7219F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.067F, -0.4075F, -6.2514F, 0.3875F, -0.2836F, -0.094F));

		PartDefinition cube_r101 = head1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(137, 141).mirror().addBox(-0.1172F, -0.698F, -1.6219F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.4191F, -0.7188F, -4.9327F, 0.2434F, -0.2432F, -0.077F));

		PartDefinition cube_r102 = head1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(141, 129).mirror().addBox(-1.2243F, -0.698F, -1.2761F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9927F, -0.9459F, -3.3943F, 0.1537F, -0.5022F, -0.1178F));

		PartDefinition head11_r1 = head1.addOrReplaceChild("head11_r1", CubeListBuilder.create().texOffs(94, 161).mirror().addBox(0.0F, -0.3794F, -4.7618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, -0.5428F, -0.1058F, -0.0359F));

		PartDefinition cube_r103 = head1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(142, 20).mirror().addBox(-1.206F, -0.698F, -0.7591F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.9927F, -0.9459F, -3.3943F, 0.1495F, 0.4483F, 0.0218F));

		PartDefinition head6_r1 = head1.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(160, 139).mirror().addBox(-2.0F, -0.45F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(160, 139).addBox(1.0F, -0.45F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1777F, 1.8282F, -2.2427F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head1.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(133, 160).mirror().addBox(-0.075F, -0.241F, 0.6005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, -1.6336F, -0.1058F, -0.0359F));

		PartDefinition head3_r1 = head1.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(143, 153).mirror().addBox(-0.075F, 0.0063F, -1.1941F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, -1.3282F, -0.1058F, -0.0359F));

		PartDefinition head2_r1 = head1.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(123, 160).mirror().addBox(0.025F, -0.2517F, -1.2556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, -0.0628F, -0.1058F, -0.0359F));

		PartDefinition head3_r2 = head1.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(25, 159).mirror().addBox(0.025F, -0.9747F, -2.0417F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, -0.3028F, -0.1058F, -0.0359F));

		PartDefinition head7_r1 = head1.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(5, 155).mirror().addBox(0.025F, 2.5815F, -2.2279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, -1.4155F, -0.1058F, -0.0359F));

		PartDefinition head4_r2 = head1.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(100, 158).mirror().addBox(0.025F, -1.8866F, -2.9951F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, -0.3465F, -0.1058F, -0.0359F));

		PartDefinition head4_r3 = head1.addOrReplaceChild("head4_r3", CubeListBuilder.create().texOffs(146, 84).mirror().addBox(0.025F, 0.1391F, -2.015F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, -1.8518F, -0.1058F, -0.0359F));

		PartDefinition head15_r2 = head1.addOrReplaceChild("head15_r2", CubeListBuilder.create().texOffs(143, 162).mirror().addBox(-0.15F, -0.2314F, 0.4227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, -2.8554F, -0.1058F, -0.0359F));

		PartDefinition head10_r2 = head1.addOrReplaceChild("head10_r2", CubeListBuilder.create().texOffs(159, 161).mirror().addBox(0.0F, -1.6285F, 1.0295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(162, 10).mirror().addBox(0.0F, -1.0285F, 1.0295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, 2.2497F, -0.1058F, -0.0359F));

		PartDefinition head9_r1 = head1.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(161, 132).mirror().addBox(0.0F, -0.5975F, 0.8033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, 2.9478F, -0.1058F, -0.0359F));

		PartDefinition head14_r3 = head1.addOrReplaceChild("head14_r3", CubeListBuilder.create().texOffs(138, 162).mirror().addBox(-0.15F, 0.0036F, 0.6541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(162, 116).mirror().addBox(-0.15F, 0.6036F, 0.6541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(162, 151).mirror().addBox(-0.2F, 1.2301F, 0.6155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, 2.9042F, -0.1058F, -0.0359F));

		PartDefinition head12_r3 = head1.addOrReplaceChild("head12_r3", CubeListBuilder.create().texOffs(162, 113).mirror().addBox(-0.15F, 0.2354F, 1.1092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, 2.5551F, -0.1058F, -0.0359F));

		PartDefinition head7_r2 = head1.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(60, 161).mirror().addBox(0.0F, 2.5559F, -0.4715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, -2.1136F, -0.1058F, -0.0359F));

		PartDefinition head8_r1 = head1.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(160, 20).mirror().addBox(0.0F, 1.9023F, -2.771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, -1.5464F, -0.1058F, -0.0359F));

		PartDefinition head8_r2 = head1.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(161, 107).mirror().addBox(0.0F, 1.6364F, 2.0508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 161).mirror().addBox(0.0F, 1.6364F, 2.6508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(115, 161).mirror().addBox(0.0F, 2.2364F, 2.6508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(162, 13).mirror().addBox(-0.15F, 2.3364F, 1.8509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(160, 55).mirror().addBox(0.075F, 2.3364F, 1.8509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, -2.8117F, -0.1058F, -0.0359F));

		PartDefinition head10_r3 = head1.addOrReplaceChild("head10_r3", CubeListBuilder.create().texOffs(89, 161).mirror().addBox(0.0F, 1.9207F, -3.7773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, -1.2846F, -0.1058F, -0.0359F));

		PartDefinition head9_r2 = head1.addOrReplaceChild("head9_r2", CubeListBuilder.create().texOffs(162, 79).mirror().addBox(0.0F, 2.8081F, -1.8359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 1.6923F, 1.0081F, -1.9391F, -0.1058F, -0.0359F));

		PartDefinition head3_r3 = head1.addOrReplaceChild("head3_r3", CubeListBuilder.create().texOffs(133, 160).addBox(-0.925F, -0.241F, 0.6005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, -1.6336F, 0.1058F, 0.0359F));

		PartDefinition head6_r2 = head1.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(149, 104).addBox(-1.5F, 0.175F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 149).addBox(-1.5F, 0.025F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.4383F, 0.2434F, -1.8937F, 0.0F, 0.0F));

		PartDefinition head8_r3 = head1.addOrReplaceChild("head8_r3", CubeListBuilder.create().texOffs(157, 129).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4615F, 0.7405F, -1.117F, 0.0F, 0.0F));

		PartDefinition head7_r3 = head1.addOrReplaceChild("head7_r3", CubeListBuilder.create().texOffs(157, 49).addBox(-1.0F, -1.475F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(157, 30).addBox(-1.0F, -0.975F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7556F, -0.7049F, -1.7715F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head1.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(125, 9).addBox(-2.0F, -0.45F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 94).addBox(-1.5F, 0.55F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -0.489F, 1.4369F, -2.2427F, 0.0F, 0.0F));

		PartDefinition head5_r2 = head1.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(80, 149).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -1.8171F, -1.8615F, -1.5882F, 0.0F, 0.0F));

		PartDefinition head6_r3 = head1.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(5, 155).addBox(-1.025F, 2.5815F, -2.2279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, -1.4155F, 0.1058F, 0.0359F));

		PartDefinition cube_r104 = head1.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(150, 129).addBox(-0.8828F, -0.698F, -1.7219F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.067F, -0.4075F, -6.2514F, 0.3875F, 0.2836F, 0.094F));

		PartDefinition cube_r105 = head1.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(155, 27).addBox(-1.8828F, -0.698F, -0.2219F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(1.4191F, -0.7188F, -4.9327F, 0.1213F, 0.2432F, 0.077F));

		PartDefinition cube_r106 = head1.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(137, 141).addBox(-1.8828F, -0.698F, -1.6219F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.4191F, -0.7188F, -4.9327F, 0.2434F, 0.2432F, 0.077F));

		PartDefinition cube_r107 = head1.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(142, 20).addBox(-0.794F, -0.698F, -0.7591F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9927F, -0.9459F, -3.3943F, 0.1495F, -0.4483F, -0.0218F));

		PartDefinition cube_r108 = head1.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(141, 129).addBox(-0.7757F, -0.698F, -1.2761F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9927F, -0.9459F, -3.3943F, 0.1537F, 0.5022F, 0.1178F));

		PartDefinition head6_r4 = head1.addOrReplaceChild("head6_r4", CubeListBuilder.create().texOffs(149, 120).addBox(-1.2F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 142).addBox(-1.2F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -1.5752F, -2.8318F, -1.3265F, 0.0F, 0.0F));

		PartDefinition head10_r4 = head1.addOrReplaceChild("head10_r4", CubeListBuilder.create().texOffs(94, 161).addBox(-1.0F, -0.3794F, -4.7618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, -0.5428F, 0.1058F, 0.0359F));

		PartDefinition head9_r3 = head1.addOrReplaceChild("head9_r3", CubeListBuilder.create().texOffs(89, 161).addBox(-1.0F, 1.9207F, -3.7773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, -1.2846F, 0.1058F, 0.0359F));

		PartDefinition head8_r4 = head1.addOrReplaceChild("head8_r4", CubeListBuilder.create().texOffs(162, 79).addBox(-1.0F, 2.8081F, -1.8359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, -1.9391F, 0.1058F, 0.0359F));

		PartDefinition head7_r4 = head1.addOrReplaceChild("head7_r4", CubeListBuilder.create().texOffs(160, 20).addBox(-1.0F, 1.9023F, -2.771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, -1.5464F, 0.1058F, 0.0359F));

		PartDefinition head9_r4 = head1.addOrReplaceChild("head9_r4", CubeListBuilder.create().texOffs(115, 161).addBox(-1.0F, 2.2364F, 2.6508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(162, 13).addBox(-0.85F, 2.3364F, 1.8509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(160, 55).addBox(-1.075F, 2.3364F, 1.8509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(110, 161).addBox(-1.0F, 1.6364F, 2.6508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(161, 107).addBox(-1.0F, 1.6364F, 2.0508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, -2.8117F, 0.1058F, 0.0359F));

		PartDefinition head11_r2 = head1.addOrReplaceChild("head11_r2", CubeListBuilder.create().texOffs(105, 159).addBox(-0.975F, 0.2541F, -0.9639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 159).addBox(-0.975F, 1.0541F, -0.9639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 1.2062F, -3.6813F, -1.9865F, 0.1818F, -0.0107F));

		PartDefinition head15_r3 = head1.addOrReplaceChild("head15_r3", CubeListBuilder.create().texOffs(45, 159).addBox(-1.1733F, -0.6254F, 1.2947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(20, 163).addBox(-1.1733F, -0.6254F, 0.5947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.8028F, -6.2915F, 3.1141F, 0.0535F, -0.0576F));

		PartDefinition head13_r2 = head1.addOrReplaceChild("head13_r2", CubeListBuilder.create().texOffs(158, 120).addBox(-1.1733F, 0.8323F, 0.431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.0F, 0.8028F, -6.2915F, -2.2964F, 0.0535F, -0.0576F));

		PartDefinition head13_r3 = head1.addOrReplaceChild("head13_r3", CubeListBuilder.create().texOffs(30, 163).addBox(-1.1733F, 0.5749F, 0.2213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.0F, 0.8028F, -6.2915F, -2.6019F, 0.0535F, -0.0576F));

		PartDefinition head12_r4 = head1.addOrReplaceChild("head12_r4", CubeListBuilder.create().texOffs(15, 163).addBox(-1.1733F, 0.4716F, -0.1779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.8028F, -6.2915F, -2.82F, 0.0535F, -0.0576F));

		PartDefinition head12_r5 = head1.addOrReplaceChild("head12_r5", CubeListBuilder.create().texOffs(50, 159).addBox(-1.1733F, 0.2523F, -0.8403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.0F, 0.8028F, -6.2915F, -1.9037F, 0.0535F, -0.0576F));

		PartDefinition head11_r3 = head1.addOrReplaceChild("head11_r3", CubeListBuilder.create().texOffs(35, 163).addBox(-1.1733F, 0.25F, -0.1074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(1.0F, 0.8028F, -6.2915F, -1.991F, 0.0535F, -0.0576F));

		PartDefinition head9_r5 = head1.addOrReplaceChild("head9_r5", CubeListBuilder.create().texOffs(81, 121).addBox(-0.975F, -0.1791F, -0.1004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 1.2062F, -3.6813F, -3.121F, 0.1818F, -0.0107F));

		PartDefinition head15_r4 = head1.addOrReplaceChild("head15_r4", CubeListBuilder.create().texOffs(162, 151).addBox(-0.8F, 1.2301F, 0.6155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(138, 162).addBox(-0.85F, 0.0036F, 0.6541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(162, 116).addBox(-0.85F, 0.6036F, 0.6541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, 2.9042F, 0.1058F, 0.0359F));

		PartDefinition head14_r4 = head1.addOrReplaceChild("head14_r4", CubeListBuilder.create().texOffs(143, 162).addBox(-0.85F, -0.2314F, 0.4227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, -2.8554F, 0.1058F, 0.0359F));

		PartDefinition head11_r4 = head1.addOrReplaceChild("head11_r4", CubeListBuilder.create().texOffs(162, 113).addBox(-0.85F, 0.2354F, 1.1092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, 2.5551F, 0.1058F, 0.0359F));

		PartDefinition head10_r5 = head1.addOrReplaceChild("head10_r5", CubeListBuilder.create().texOffs(162, 10).addBox(-1.0F, -1.0285F, 1.0295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(159, 161).addBox(-1.0F, -1.6285F, 1.0295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, 2.2497F, 0.1058F, 0.0359F));

		PartDefinition head8_r5 = head1.addOrReplaceChild("head8_r5", CubeListBuilder.create().texOffs(161, 132).addBox(-1.0F, -0.5975F, 0.8033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, 2.9478F, 0.1058F, 0.0359F));

		PartDefinition head6_r5 = head1.addOrReplaceChild("head6_r5", CubeListBuilder.create().texOffs(60, 161).addBox(-1.0F, 2.5559F, -0.4715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, -2.1136F, 0.1058F, 0.0359F));

		PartDefinition head3_r4 = head1.addOrReplaceChild("head3_r4", CubeListBuilder.create().texOffs(146, 84).addBox(-1.025F, 0.1391F, -2.015F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, -1.8518F, 0.1058F, 0.0359F));

		PartDefinition head2_r2 = head1.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(143, 153).addBox(-0.925F, 0.0063F, -1.1941F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, -1.3282F, 0.1058F, 0.0359F));

		PartDefinition head3_r5 = head1.addOrReplaceChild("head3_r5", CubeListBuilder.create().texOffs(100, 158).addBox(-1.025F, -1.8866F, -2.9951F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, -0.3465F, 0.1058F, 0.0359F));

		PartDefinition head2_r3 = head1.addOrReplaceChild("head2_r3", CubeListBuilder.create().texOffs(25, 159).addBox(-1.025F, -0.9747F, -2.0417F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, -0.3028F, 0.1058F, 0.0359F));

		PartDefinition head1_r1 = head1.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(123, 160).addBox(-1.025F, -0.2517F, -1.2556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.025F, 1.6923F, 1.0081F, -0.0628F, 0.1058F, 0.0359F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.5F, -3.0F, 0.0456F, 0.0F, 0.0F));

		PartDefinition head9_r6 = head2.addOrReplaceChild("head9_r6", CubeListBuilder.create().texOffs(149, 160).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8502F, -6.0662F, 0.9512F, 0.0F, 0.0F));

		PartDefinition head8_r6 = head2.addOrReplaceChild("head8_r6", CubeListBuilder.create().texOffs(160, 148).addBox(-1.0F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4F, 0.4538F, -5.4893F, 0.6021F, 0.0F, 0.0F));

		PartDefinition head7_r5 = head2.addOrReplaceChild("head7_r5", CubeListBuilder.create().texOffs(149, 107).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.6276F, -4.1776F, 0.6894F, 0.0F, 0.0F));

		PartDefinition head6_r6 = head2.addOrReplaceChild("head6_r6", CubeListBuilder.create().texOffs(68, 85).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.4F, -1.0816F, -3.2865F, 0.4712F, 0.0F, 0.0F));

		PartDefinition head5_r3 = head2.addOrReplaceChild("head5_r3", CubeListBuilder.create().texOffs(5, 159).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -1.2034F, -2.294F, 0.1222F, 0.0F, 0.0F));

		PartDefinition head4_r4 = head2.addOrReplaceChild("head4_r4", CubeListBuilder.create().texOffs(159, 0).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4F, -1.1076F, -1.2986F, -0.096F, 0.0F, 0.0F));

		PartDefinition head3_r6 = head2.addOrReplaceChild("head3_r6", CubeListBuilder.create().texOffs(0, 159).addBox(-1.0F, 0.0F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -1.1023F, -0.6986F, -0.0087F, 0.0F, 0.0F));

		PartDefinition head2_r4 = head2.addOrReplaceChild("head2_r4", CubeListBuilder.create().texOffs(146, 89).addBox(-1.5F, 0.0F, -1.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, -1.05F, 0.3F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -3.4F, 0.3187F, 0.0F, 0.0F));

		PartDefinition head3 = head1.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -3.4F, 0.1367F, 0.0F, 0.0F));

		PartDefinition head8_r7 = head3.addOrReplaceChild("head8_r7", CubeListBuilder.create().texOffs(55, 161).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(55, 161).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.4414F, -5.5646F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head7_r6 = head3.addOrReplaceChild("head7_r6", CubeListBuilder.create().texOffs(160, 158).mirror().addBox(0.0492F, 0.5719F, -1.5921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3972F, -2.8915F, -0.0806F, -0.0938F, -0.0284F));

		PartDefinition head5_r4 = head3.addOrReplaceChild("head5_r4", CubeListBuilder.create().texOffs(115, 149).mirror().addBox(0.0F, -0.9618F, -2.8417F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.2062F, -0.2813F, -0.1649F, -0.1787F, 0.0357F));

		PartDefinition head7_r7 = head3.addOrReplaceChild("head7_r7", CubeListBuilder.create().texOffs(25, 163).mirror().addBox(0.0F, 0.3178F, -2.9698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(160, 155).mirror().addBox(0.0F, 0.2428F, -1.8948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.2062F, -0.2813F, -0.1125F, -0.1787F, 0.0357F));

		PartDefinition head5_r5 = head3.addOrReplaceChild("head5_r5", CubeListBuilder.create().texOffs(154, 160).mirror().addBox(0.0F, 0.1688F, -0.8187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(30, 159).mirror().addBox(0.0F, -1.1062F, -0.9937F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.2062F, -0.2813F, -0.0078F, -0.1787F, 0.0357F));

		PartDefinition head6_r7 = head3.addOrReplaceChild("head6_r7", CubeListBuilder.create().texOffs(12, 155).mirror().addBox(0.0492F, 0.2185F, -2.1443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3972F, -2.8915F, -0.1243F, -0.0938F, -0.0284F));

		PartDefinition head7_r8 = head3.addOrReplaceChild("head7_r8", CubeListBuilder.create().texOffs(160, 142).mirror().addBox(0.0492F, -0.2044F, -2.5109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3972F, -2.8915F, 0.0939F, -0.0938F, -0.0284F));

		PartDefinition head7_r9 = head3.addOrReplaceChild("head7_r9", CubeListBuilder.create().texOffs(67, 155).mirror().addBox(0.0F, -0.038F, -1.9799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2497F, -1.8633F, -1.2582F, 0.138F, -0.233F, 0.0632F));

		PartDefinition head6_r8 = head3.addOrReplaceChild("head6_r8", CubeListBuilder.create().texOffs(106, 155).mirror().addBox(0.0F, -2.338F, -2.1799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.2062F, -0.2813F, 0.4024F, -0.1787F, 0.0357F));

		PartDefinition head7_r10 = head3.addOrReplaceChild("head7_r10", CubeListBuilder.create().texOffs(155, 112).mirror().addBox(0.0F, -2.0429F, -1.1511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.2062F, -0.2813F, -0.034F, -0.1787F, 0.0357F));

		PartDefinition head4_r5 = head3.addOrReplaceChild("head4_r5", CubeListBuilder.create().texOffs(10, 159).mirror().addBox(0.025F, -1.5923F, -4.6831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.025F, 0.6923F, 4.4081F, -0.0025F, -0.1097F, -0.0211F));

		PartDefinition head6_r9 = head3.addOrReplaceChild("head6_r9", CubeListBuilder.create().texOffs(160, 142).addBox(-1.0492F, -0.2044F, -2.5109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3972F, -2.8915F, 0.0939F, 0.0938F, 0.0284F));

		PartDefinition head6_r10 = head3.addOrReplaceChild("head6_r10", CubeListBuilder.create().texOffs(160, 158).addBox(-1.0492F, 0.5719F, -1.5921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, -0.3972F, -2.8915F, -0.0806F, 0.0938F, 0.0284F));

		PartDefinition head5_r6 = head3.addOrReplaceChild("head5_r6", CubeListBuilder.create().texOffs(12, 155).addBox(-1.0492F, 0.2185F, -2.1443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.0F, -0.3972F, -2.8915F, -0.1243F, 0.0938F, 0.0284F));

		PartDefinition head6_r11 = head3.addOrReplaceChild("head6_r11", CubeListBuilder.create().texOffs(25, 163).addBox(-1.0F, 0.3178F, -2.9698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(160, 155).addBox(-1.0F, 0.2428F, -1.8948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, 0.2062F, -0.2813F, -0.1125F, 0.1787F, -0.0357F));

		PartDefinition head6_r12 = head3.addOrReplaceChild("head6_r12", CubeListBuilder.create().texOffs(155, 112).addBox(-1.0F, -2.0429F, -1.1511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.2062F, -0.2813F, -0.034F, 0.1787F, -0.0357F));

		PartDefinition head6_r13 = head3.addOrReplaceChild("head6_r13", CubeListBuilder.create().texOffs(67, 155).addBox(-1.0F, -0.038F, -1.9799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2497F, -1.8633F, -1.2582F, 0.138F, 0.233F, -0.0632F));

		PartDefinition head5_r7 = head3.addOrReplaceChild("head5_r7", CubeListBuilder.create().texOffs(106, 155).addBox(-1.0F, -2.338F, -2.1799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.2062F, -0.2813F, 0.4024F, 0.1787F, -0.0357F));

		PartDefinition head4_r6 = head3.addOrReplaceChild("head4_r6", CubeListBuilder.create().texOffs(115, 149).addBox(-1.0F, -0.9618F, -2.8417F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 0.2062F, -0.2813F, -0.1649F, 0.1787F, -0.0357F));

		PartDefinition head7_r11 = head3.addOrReplaceChild("head7_r11", CubeListBuilder.create().texOffs(160, 145).addBox(-1.3483F, -0.46F, -1.0909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(155, 23).addBox(-1.3483F, -1.46F, -2.0909F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3972F, -2.8915F, 0.6009F, 0.0452F, -0.0643F));

		PartDefinition head5_r8 = head3.addOrReplaceChild("head5_r8", CubeListBuilder.create().texOffs(123, 20).addBox(-1.3483F, -1.3651F, -0.5257F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -0.3972F, -2.8915F, 0.2955F, 0.0452F, -0.0643F));

		PartDefinition head4_r7 = head3.addOrReplaceChild("head4_r7", CubeListBuilder.create().texOffs(154, 160).addBox(-1.0F, 0.1688F, -0.8187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(30, 159).addBox(-1.0F, -1.1062F, -0.9937F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.2062F, -0.2813F, -0.0078F, 0.1787F, -0.0357F));

		PartDefinition head3_r7 = head3.addOrReplaceChild("head3_r7", CubeListBuilder.create().texOffs(10, 159).addBox(-1.025F, -1.5923F, -4.6831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.025F, 0.6923F, 4.4081F, -0.0025F, 0.1097F, 0.0211F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.0911F, 0.0F, 0.0F));

		PartDefinition head5_r9 = head5.addOrReplaceChild("head5_r9", CubeListBuilder.create().texOffs(72, 160).addBox(-0.5F, -0.45F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.3F, -1.6F, -0.1309F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0923F, 3.0946F, 0.7223F, 0.6547F, -0.0069F, 0.0049F));

		PartDefinition jaw5_r1 = jaw1.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(150, 151).mirror().addBox(-0.2F, 0.0554F, -4.8249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(155, 34).mirror().addBox(-0.2F, -0.5446F, -4.8249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -0.1833F, -0.1658F, 0.0F));

		PartDefinition jaw6_r1 = jaw1.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(162, 76).mirror().addBox(-0.5F, -0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.3002F, -0.7295F, -2.8706F, -0.4712F, -0.1658F, 0.0F));

		PartDefinition jaw5_r2 = jaw1.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(162, 73).mirror().addBox(-0.25F, -0.9654F, -3.7978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.2953F, -0.0785F, -0.1658F, 0.0F));

		PartDefinition jaw4_r1 = jaw1.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(146, 79).mirror().addBox(-0.2F, -1.2654F, -3.2978F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -0.0785F, -0.1658F, 0.0F));

		PartDefinition jaw3_r1 = jaw1.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(128, 109).mirror().addBox(-0.2F, -0.187F, -1.8991F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -0.1309F, -0.1658F, 0.0F));

		PartDefinition jaw5_r3 = jaw1.addOrReplaceChild("jaw5_r3", CubeListBuilder.create().texOffs(162, 91).mirror().addBox(-0.2F, -0.7968F, -2.6019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(162, 88).mirror().addBox(-0.2F, -0.7968F, -3.2019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -0.4538F, -0.1658F, 0.0F));

		PartDefinition jaw9_r1 = jaw1.addOrReplaceChild("jaw9_r1", CubeListBuilder.create().texOffs(162, 100).mirror().addBox(-0.2F, 3.7307F, -1.5378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -1.5795F, -0.1658F, 0.0F));

		PartDefinition jaw10_r1 = jaw1.addOrReplaceChild("jaw10_r1", CubeListBuilder.create().texOffs(158, 135).mirror().addBox(-0.2F, 4.3787F, -0.061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(158, 103).mirror().addBox(-0.2F, 4.3787F, 0.239F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -1.7933F, -0.1658F, 0.0F));

		PartDefinition jaw18_r1 = jaw1.addOrReplaceChild("jaw18_r1", CubeListBuilder.create().texOffs(155, 59).mirror().addBox(-0.2F, -0.0686F, -7.1099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -0.1702F, -0.1658F, 0.0F));

		PartDefinition jaw17_r1 = jaw1.addOrReplaceChild("jaw17_r1", CubeListBuilder.create().texOffs(155, 93).mirror().addBox(-0.2F, -0.9507F, -8.548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -0.0393F, -0.1658F, 0.0F));

		PartDefinition jaw16_r1 = jaw1.addOrReplaceChild("jaw16_r1", CubeListBuilder.create().texOffs(160, 52).mirror().addBox(-0.2F, -0.0047F, -9.1114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -0.1527F, -0.1658F, 0.0F));

		PartDefinition jaw15_r1 = jaw1.addOrReplaceChild("jaw15_r1", CubeListBuilder.create().texOffs(162, 58).mirror().addBox(-0.2F, 4.3444F, -8.1198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -0.6763F, -0.1658F, 0.0F));

		PartDefinition jaw20_r1 = jaw1.addOrReplaceChild("jaw20_r1", CubeListBuilder.create().texOffs(10, 163).mirror().addBox(-0.2F, 4.5455F, -1.6622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -1.5926F, -0.1658F, 0.0F));

		PartDefinition jaw19_r1 = jaw1.addOrReplaceChild("jaw19_r1", CubeListBuilder.create().texOffs(162, 70).mirror().addBox(-0.2F, 5.4573F, -0.9185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(162, 67).mirror().addBox(-0.2F, 6.2573F, -0.9185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -1.7235F, -0.1658F, 0.0F));

		PartDefinition jaw17_r2 = jaw1.addOrReplaceChild("jaw17_r2", CubeListBuilder.create().texOffs(65, 162).mirror().addBox(-0.2F, 6.9951F, -1.5059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(162, 64).mirror().addBox(-0.2F, 7.8951F, -1.4809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -1.6362F, -0.1658F, 0.0F));

		PartDefinition jaw15_r2 = jaw1.addOrReplaceChild("jaw15_r2", CubeListBuilder.create().texOffs(162, 61).mirror().addBox(-0.2F, 8.5737F, -2.2499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(50, 162).mirror().addBox(-0.2F, 8.5737F, -1.9499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(45, 162).mirror().addBox(-0.2F, 7.9737F, -1.9499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -1.549F, -0.1658F, 0.0F));

		PartDefinition jaw12_r1 = jaw1.addOrReplaceChild("jaw12_r1", CubeListBuilder.create().texOffs(162, 36).mirror().addBox(-0.2F, 7.4759F, -1.3755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(162, 33).mirror().addBox(-0.2F, 6.8759F, -1.3755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -1.6188F, -0.1658F, 0.0F));

		PartDefinition jaw10_r2 = jaw1.addOrReplaceChild("jaw10_r2", CubeListBuilder.create().texOffs(162, 26).mirror().addBox(-0.2F, 6.3126F, -1.1278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -1.6537F, -0.1658F, 0.0F));

		PartDefinition jaw9_r2 = jaw1.addOrReplaceChild("jaw9_r2", CubeListBuilder.create().texOffs(162, 23).mirror().addBox(-0.2F, 5.7522F, -0.7857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -1.7061F, -0.1658F, 0.0F));

		PartDefinition jaw8_r1 = jaw1.addOrReplaceChild("jaw8_r1", CubeListBuilder.create().texOffs(35, 159).mirror().addBox(-0.2F, 4.3248F, -1.5576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -1.5752F, -0.1658F, 0.0F));

		PartDefinition jaw7_r1 = jaw1.addOrReplaceChild("jaw7_r1", CubeListBuilder.create().texOffs(162, 97).mirror().addBox(-0.2F, 3.0718F, -1.8796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -1.4923F, -0.1658F, 0.0F));

		PartDefinition jaw6_r2 = jaw1.addOrReplaceChild("jaw6_r2", CubeListBuilder.create().texOffs(41, 155).mirror().addBox(-0.2F, 1.9747F, -2.8372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -1.1868F, -0.1658F, 0.0F));

		PartDefinition jaw5_r4 = jaw1.addOrReplaceChild("jaw5_r4", CubeListBuilder.create().texOffs(162, 94).mirror().addBox(-0.2F, 1.511F, -2.7197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -1.2392F, -0.1658F, 0.0F));

		PartDefinition jaw4_r2 = jaw1.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(160, 44).mirror().addBox(-0.2F, -0.2574F, -2.1487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(151, 135).mirror().addBox(-0.2F, -0.2574F, -1.7737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -0.7418F, -0.1658F, 0.0F));

		PartDefinition jaw2_r1 = jaw1.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(152, 8).mirror().addBox(-0.2F, -0.2827F, -1.7906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, -0.0538F, -0.3703F, -0.4363F, -0.1658F, 0.0F));

		PartDefinition jaw5_r5 = jaw1.addOrReplaceChild("jaw5_r5", CubeListBuilder.create().texOffs(155, 34).addBox(-0.8F, -0.5446F, -4.8249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F))
				.texOffs(150, 151).addBox(-0.8F, 0.0554F, -4.8249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -0.1833F, 0.1658F, 0.0F));

		PartDefinition jaw5_r6 = jaw1.addOrReplaceChild("jaw5_r6", CubeListBuilder.create().texOffs(162, 76).addBox(-0.5F, -0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.1156F, -0.7295F, -2.8706F, -0.4712F, 0.1658F, 0.0F));

		PartDefinition jaw4_r3 = jaw1.addOrReplaceChild("jaw4_r3", CubeListBuilder.create().texOffs(162, 73).addBox(-0.75F, -0.9654F, -3.7978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.2953F, -0.0785F, 0.1658F, 0.0F));

		PartDefinition jaw3_r2 = jaw1.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(146, 79).addBox(-0.8F, -1.2654F, -3.2978F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -0.0785F, 0.1658F, 0.0F));

		PartDefinition jaw2_r2 = jaw1.addOrReplaceChild("jaw2_r2", CubeListBuilder.create().texOffs(128, 109).addBox(-0.8F, -0.187F, -1.8991F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -0.1309F, 0.1658F, 0.0F));

		PartDefinition jaw4_r4 = jaw1.addOrReplaceChild("jaw4_r4", CubeListBuilder.create().texOffs(162, 91).addBox(-0.8F, -0.7968F, -2.6019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(162, 88).addBox(-0.8F, -0.7968F, -3.2019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -0.4538F, 0.1658F, 0.0F));

		PartDefinition jaw8_r2 = jaw1.addOrReplaceChild("jaw8_r2", CubeListBuilder.create().texOffs(162, 100).addBox(-0.8F, 3.7307F, -1.5378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -1.5795F, 0.1658F, 0.0F));

		PartDefinition jaw9_r3 = jaw1.addOrReplaceChild("jaw9_r3", CubeListBuilder.create().texOffs(158, 135).addBox(-0.8F, 4.3787F, -0.061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(158, 103).addBox(-0.8F, 4.3787F, 0.239F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -1.7933F, 0.1658F, 0.0F));

		PartDefinition jaw17_r3 = jaw1.addOrReplaceChild("jaw17_r3", CubeListBuilder.create().texOffs(155, 59).addBox(-0.8F, -0.0686F, -7.1099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -0.1702F, 0.1658F, 0.0F));

		PartDefinition jaw16_r2 = jaw1.addOrReplaceChild("jaw16_r2", CubeListBuilder.create().texOffs(155, 93).addBox(-0.8F, -0.9507F, -8.548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -0.0393F, 0.1658F, 0.0F));

		PartDefinition jaw15_r3 = jaw1.addOrReplaceChild("jaw15_r3", CubeListBuilder.create().texOffs(160, 52).addBox(-0.8F, -0.0047F, -9.1114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -0.1527F, 0.1658F, 0.0F));

		PartDefinition jaw14_r1 = jaw1.addOrReplaceChild("jaw14_r1", CubeListBuilder.create().texOffs(162, 58).addBox(-0.8F, 4.3444F, -8.1198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -0.6763F, 0.1658F, 0.0F));

		PartDefinition jaw19_r2 = jaw1.addOrReplaceChild("jaw19_r2", CubeListBuilder.create().texOffs(10, 163).addBox(-0.8F, 4.5455F, -1.6622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -1.5926F, 0.1658F, 0.0F));

		PartDefinition jaw18_r2 = jaw1.addOrReplaceChild("jaw18_r2", CubeListBuilder.create().texOffs(162, 70).addBox(-0.8F, 5.4573F, -0.9185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(162, 67).addBox(-0.8F, 6.2573F, -0.9185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -1.7235F, 0.1658F, 0.0F));

		PartDefinition jaw16_r3 = jaw1.addOrReplaceChild("jaw16_r3", CubeListBuilder.create().texOffs(65, 162).addBox(-0.8F, 6.9951F, -1.5059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(162, 64).addBox(-0.8F, 7.8951F, -1.4809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -1.6362F, 0.1658F, 0.0F));

		PartDefinition jaw14_r2 = jaw1.addOrReplaceChild("jaw14_r2", CubeListBuilder.create().texOffs(162, 61).addBox(-0.8F, 8.5737F, -2.2499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(50, 162).addBox(-0.8F, 8.5737F, -1.9499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(45, 162).addBox(-0.8F, 7.9737F, -1.9499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -1.549F, 0.1658F, 0.0F));

		PartDefinition jaw11_r1 = jaw1.addOrReplaceChild("jaw11_r1", CubeListBuilder.create().texOffs(162, 36).addBox(-0.8F, 7.4759F, -1.3755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(162, 33).addBox(-0.8F, 6.8759F, -1.3755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -1.6188F, 0.1658F, 0.0F));

		PartDefinition jaw9_r4 = jaw1.addOrReplaceChild("jaw9_r4", CubeListBuilder.create().texOffs(162, 26).addBox(-0.8F, 6.3126F, -1.1278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -1.6537F, 0.1658F, 0.0F));

		PartDefinition jaw8_r3 = jaw1.addOrReplaceChild("jaw8_r3", CubeListBuilder.create().texOffs(162, 23).addBox(-0.8F, 5.7522F, -0.7857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -1.7061F, 0.1658F, 0.0F));

		PartDefinition jaw7_r2 = jaw1.addOrReplaceChild("jaw7_r2", CubeListBuilder.create().texOffs(35, 159).addBox(-0.8F, 4.3248F, -1.5576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -1.5752F, 0.1658F, 0.0F));

		PartDefinition jaw6_r3 = jaw1.addOrReplaceChild("jaw6_r3", CubeListBuilder.create().texOffs(162, 97).addBox(-0.8F, 3.0718F, -1.8796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -1.4923F, 0.1658F, 0.0F));

		PartDefinition jaw5_r7 = jaw1.addOrReplaceChild("jaw5_r7", CubeListBuilder.create().texOffs(41, 155).addBox(-0.8F, 1.9747F, -2.8372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -1.1868F, 0.1658F, 0.0F));

		PartDefinition jaw4_r5 = jaw1.addOrReplaceChild("jaw4_r5", CubeListBuilder.create().texOffs(162, 94).addBox(-0.8F, 1.511F, -2.7197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -1.2392F, 0.1658F, 0.0F));

		PartDefinition jaw3_r3 = jaw1.addOrReplaceChild("jaw3_r3", CubeListBuilder.create().texOffs(160, 44).addBox(-0.8F, -0.2574F, -2.1487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(151, 135).addBox(-0.8F, -0.2574F, -1.7737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -0.7418F, 0.1658F, 0.0F));

		PartDefinition jaw1_r1 = jaw1.addOrReplaceChild("jaw1_r1", CubeListBuilder.create().texOffs(152, 8).addBox(-0.8F, -0.2827F, -1.7906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(1.8F, -0.0538F, -0.3703F, -0.4363F, 0.1658F, 0.0F));

		PartDefinition upperlegL = basin.addOrReplaceChild("upperlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6F, 1.691F, 1.9855F, -0.5672F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = upperlegL.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(144, 71).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.1811F, 4.8383F, 1.1345F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperlegL.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(125, 33).addBox(-1.5F, -0.2F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.7322F, 2.6637F, 0.7418F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperlegL.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(19, 103).addBox(-1.0F, -4.0F, -0.9F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 11.2697F, 1.6852F, 0.3491F, 0.0F, 0.0F));

		PartDefinition upperleg5_r3 = upperlegL.addOrReplaceChild("upperleg5_r3", CubeListBuilder.create().texOffs(137, 80).addBox(-1.5F, -3.0308F, -0.0528F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 10.3711F, -0.1173F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg5_r4 = upperlegL.addOrReplaceChild("upperleg5_r4", CubeListBuilder.create().texOffs(24, 133).addBox(-1.5F, -0.0308F, -0.0528F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.3F, 0.532F, 0.5236F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperlegL.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(137, 65).addBox(-1.5F, -3.0308F, -0.0528F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.3F, 0.532F, 0.2182F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperlegL.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(138, 13).addBox(-0.5F, -3.4753F, -0.7933F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, 7.3247F, 1.5254F, 0.4276F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperlegL.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(110, 142).addBox(-0.5F, -0.5247F, -0.7933F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 7.3247F, 1.5254F, -0.3927F, 0.0F, 0.0F));

		PartDefinition upperleg3_r2 = upperlegL.addOrReplaceChild("upperleg3_r2", CubeListBuilder.create().texOffs(125, 26).addBox(-1.5F, -1.4F, -0.7F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4531F, -0.6839F, 0.5585F, 0.0F, 0.0F));

		PartDefinition upperleg2_r1 = upperlegL.addOrReplaceChild("upperleg2_r1", CubeListBuilder.create().texOffs(81, 125).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.9F, 0.032F, 0.0873F, 0.0F, 0.0F));

		PartDefinition lowerlegL = upperlegL.addOrReplaceChild("lowerlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 15.3419F, 4.0705F, 1.0414F, 0.0F, 0.0F));

		PartDefinition lowerleg6_r1 = lowerlegL.addOrReplaceChild("lowerleg6_r1", CubeListBuilder.create().texOffs(67, 151).addBox(-1.8F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 2.1618F, 0.2657F, 1.5708F, 0.4625F, 1.5708F));

		PartDefinition lowerleg5_r1 = lowerlegL.addOrReplaceChild("lowerleg5_r1", CubeListBuilder.create().texOffs(45, 151).addBox(0.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.75F, 0.8122F, 2.7513F, -1.5708F, 1.2828F, -1.5708F));

		PartDefinition lowerleg4_r1 = lowerlegL.addOrReplaceChild("lowerleg4_r1", CubeListBuilder.create().texOffs(142, 45).addBox(-1.9F, -1.3F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.75F, 0.663F, 0.732F, 1.5708F, 1.2915F, 1.5708F));

		PartDefinition lowerleg4_r2 = lowerlegL.addOrReplaceChild("lowerleg4_r2", CubeListBuilder.create().texOffs(42, 137).addBox(-2.0F, 0.05F, 0.35F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1F, 5.9355F, -0.2261F, 1.5708F, 1.5097F, 1.5708F));

		PartDefinition lowerleg3_r1 = lowerlegL.addOrReplaceChild("lowerleg3_r1", CubeListBuilder.create().texOffs(145, 0).addBox(-0.8F, -11.15F, 0.35F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1F, 13.225F, 0.1511F, -1.5708F, 1.4573F, -1.5708F));

		PartDefinition lowerleg4_r3 = lowerlegL.addOrReplaceChild("lowerleg4_r3", CubeListBuilder.create().texOffs(37, 123).addBox(-2.9607F, -0.0526F, -2.85F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.06F)), PartPose.offsetAndRotation(0.4F, -0.275F, 1.1511F, -1.5708F, 0.9861F, -1.5708F));

		PartDefinition lowerleg4_r4 = lowerlegL.addOrReplaceChild("lowerleg4_r4", CubeListBuilder.create().texOffs(110, 135).addBox(-2.0071F, -0.045F, -1.85F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, 1.925F, -1.7489F, 1.5708F, 1.1432F, 1.5708F));

		PartDefinition lowerleg3_r2 = lowerlegL.addOrReplaceChild("lowerleg3_r2", CubeListBuilder.create().texOffs(129, 20).addBox(-1.9F, -13.45F, -2.85F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, 13.225F, 0.1511F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition lowerleg2_r1 = lowerlegL.addOrReplaceChild("lowerleg2_r1", CubeListBuilder.create().texOffs(39, 54).addBox(-2.2F, -11.95F, -1.85F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1F, 13.225F, 0.1511F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition feetL = lowerlegL.addOrReplaceChild("feetL", CubeListBuilder.create().texOffs(99, 125).addBox(-1.5F, -0.1003F, -1.0004F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 13.0297F, 1.1947F, -0.6355F, 0.0F, 0.0F));

		PartDefinition toes3_r1 = feetL.addOrReplaceChild("toes3_r1", CubeListBuilder.create().texOffs(84, 136).addBox(-0.7137F, -0.4464F, -0.363F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6615F, 5.4721F, 1.3658F, 2.3654F, -0.3331F, -0.1453F));

		PartDefinition toesL = feetL.addOrReplaceChild("toesL", CubeListBuilder.create().texOffs(119, 39).addBox(-2.9F, -0.9235F, -3.6059F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 5.163F, -0.2699F, 0.245F, 0.0F, 0.0F));

		PartDefinition toesL2 = toesL.addOrReplaceChild("toesL2", CubeListBuilder.create().texOffs(51, 114).addBox(-2.9F, -0.9235F, -3.6059F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, 0.0094F, 0.0F, 0.0F));

		PartDefinition upperlegL2 = basin.addOrReplaceChild("upperlegL2", CubeListBuilder.create(), PartPose.offset(-4.8F, 1.691F, 1.9855F));

		PartDefinition upperleg7_r1 = upperlegL2.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(144, 75).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.1811F, 4.8383F, 1.1345F, 0.0F, 0.0F));

		PartDefinition upperleg6_r2 = upperlegL2.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(126, 74).addBox(-1.5F, -0.2F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.7322F, 2.6637F, 0.7418F, 0.0F, 0.0F));

		PartDefinition upperleg6_r3 = upperlegL2.addOrReplaceChild("upperleg6_r3", CubeListBuilder.create().texOffs(50, 132).addBox(-1.0F, -4.0F, -0.9F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 11.2697F, 1.6852F, 0.3491F, 0.0F, 0.0F));

		PartDefinition upperleg6_r4 = upperlegL2.addOrReplaceChild("upperleg6_r4", CubeListBuilder.create().texOffs(137, 99).addBox(-0.5F, -3.0308F, -0.0528F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 10.3711F, -0.1173F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg6_r5 = upperlegL2.addOrReplaceChild("upperleg6_r5", CubeListBuilder.create().texOffs(99, 134).addBox(-0.5F, -0.0308F, -0.0528F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 13.3F, 0.532F, 0.5236F, 0.0F, 0.0F));

		PartDefinition upperleg5_r5 = upperlegL2.addOrReplaceChild("upperleg5_r5", CubeListBuilder.create().texOffs(137, 86).addBox(-0.5F, -3.0308F, -0.0528F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 13.3F, 0.532F, 0.2182F, 0.0F, 0.0F));

		PartDefinition upperleg5_r6 = upperlegL2.addOrReplaceChild("upperleg5_r6", CubeListBuilder.create().texOffs(138, 26).addBox(-0.5F, -3.4753F, -0.7933F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, 7.3247F, 1.5254F, 0.4276F, 0.0F, 0.0F));

		PartDefinition upperleg4_r3 = upperlegL2.addOrReplaceChild("upperleg4_r3", CubeListBuilder.create().texOffs(128, 142).addBox(-0.5F, -0.5247F, -0.7933F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 7.3247F, 1.5254F, -0.3927F, 0.0F, 0.0F));

		PartDefinition upperleg4_r4 = upperlegL2.addOrReplaceChild("upperleg4_r4", CubeListBuilder.create().texOffs(125, 58).addBox(-1.5F, -1.4F, -0.7F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4531F, -0.6839F, 0.5585F, 0.0F, 0.0F));

		PartDefinition upperleg3_r3 = upperlegL2.addOrReplaceChild("upperleg3_r3", CubeListBuilder.create().texOffs(90, 125).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.9F, 0.032F, 0.0873F, 0.0F, 0.0F));

		PartDefinition lowerlegL2 = upperlegL2.addOrReplaceChild("lowerlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 15.3419F, 4.0705F, 0.6051F, 0.0F, 0.0F));

		PartDefinition lowerleg7_r1 = lowerlegL2.addOrReplaceChild("lowerleg7_r1", CubeListBuilder.create().texOffs(152, 4).addBox(-0.2F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 2.1618F, 0.2657F, 1.5708F, -0.4625F, -1.5708F));

		PartDefinition lowerleg6_r2 = lowerlegL2.addOrReplaceChild("lowerleg6_r2", CubeListBuilder.create().texOffs(152, 0).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.75F, 0.8122F, 2.7513F, -1.5708F, -1.2828F, 1.5708F));

		PartDefinition lowerleg5_r2 = lowerlegL2.addOrReplaceChild("lowerleg5_r2", CubeListBuilder.create().texOffs(7, 144).addBox(-1.1F, -1.3F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.75F, 0.663F, 0.732F, 1.5708F, -1.2915F, -1.5708F));

		PartDefinition lowerleg5_r3 = lowerlegL2.addOrReplaceChild("lowerleg5_r3", CubeListBuilder.create().texOffs(137, 105).addBox(0.0F, 0.05F, 0.35F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1F, 5.9355F, -0.2261F, 1.5708F, -1.5097F, -1.5708F));

		PartDefinition lowerleg4_r5 = lowerlegL2.addOrReplaceChild("lowerleg4_r5", CubeListBuilder.create().texOffs(145, 13).addBox(-1.2F, -11.15F, 0.35F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 13.225F, 0.1511F, -1.5708F, -1.4573F, 1.5708F));

		PartDefinition lowerleg5_r4 = lowerlegL2.addOrReplaceChild("lowerleg5_r4", CubeListBuilder.create().texOffs(123, 50).addBox(-0.0393F, -0.0526F, -2.85F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.06F)), PartPose.offsetAndRotation(-0.4F, -0.275F, 1.1511F, -1.5708F, -0.9861F, 1.5708F));

		PartDefinition lowerleg5_r5 = lowerlegL2.addOrReplaceChild("lowerleg5_r5", CubeListBuilder.create().texOffs(128, 135).addBox(0.0071F, -0.045F, -1.85F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 1.925F, -1.7489F, 1.5708F, -1.1432F, -1.5708F));

		PartDefinition lowerleg4_r6 = lowerlegL2.addOrReplaceChild("lowerleg4_r6", CubeListBuilder.create().texOffs(128, 129).addBox(-1.1F, -13.45F, -2.85F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, 13.225F, 0.1511F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition lowerleg3_r3 = lowerlegL2.addOrReplaceChild("lowerleg3_r3", CubeListBuilder.create().texOffs(119, 121).addBox(0.2F, -11.95F, -1.85F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1F, 13.225F, 0.1511F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition feetL2 = lowerlegL2.addOrReplaceChild("feetL2", CubeListBuilder.create().texOffs(126, 65).addBox(-1.5F, -0.1003F, -1.0004F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 13.0297F, 1.1947F, -0.7664F, 0.0F, 0.0F));

		PartDefinition toes4_r1 = feetL2.addOrReplaceChild("toes4_r1", CubeListBuilder.create().texOffs(119, 136).addBox(-0.2863F, -0.4464F, -0.363F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6615F, 5.4721F, 1.3658F, 2.3654F, 0.3331F, 0.1453F));

		PartDefinition toesL3 = feetL2.addOrReplaceChild("toesL3", CubeListBuilder.create().texOffs(119, 114).addBox(-2.1F, -0.9235F, -3.6059F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 5.163F, -0.2699F, 0.3759F, 0.0F, 0.0F));

		PartDefinition toesL4 = toesL3.addOrReplaceChild("toesL4", CubeListBuilder.create().texOffs(70, 114).addBox(-2.1F, -0.9235F, -3.6059F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, -0.1215F, 0.0F, 0.0F));

		PartDefinition bone = basin.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(4.0F, -2.4435F, 4.8978F));

		PartDefinition basin_r6 = bone.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(137, 92).addBox(-1.1949F, 0.96F, -6.7775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3316F, 0.0F, -0.2269F));

		PartDefinition basin_r7 = bone.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(128, 160).addBox(-1.1949F, -2.9101F, -4.6747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(150, 49).addBox(-1.1949F, -3.9101F, -5.6747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4102F, 0.0F, -0.2269F));

		PartDefinition basin_r8 = bone.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(150, 30).addBox(-1.1949F, 3.9962F, -2.3337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F))
				.texOffs(84, 158).addBox(-1.1949F, -4.0481F, 0.8984F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2043F, 0.0F, -0.2269F));

		PartDefinition basin_r9 = bone.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(126, 80).addBox(-1.1949F, -2.749F, -4.6094F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, -0.2269F));

		PartDefinition basin_r10 = bone.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(79, 158).addBox(-1.1949F, -2.5197F, 2.724F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0262F, 0.0F, -0.2269F));

		PartDefinition basin_r11 = bone.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(147, 40).addBox(-1.1949F, -4.0501F, 1.9657F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5498F, 0.0F, -0.2269F));

		PartDefinition basin_r12 = bone.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(0, 129).addBox(-1.1949F, -2.6453F, -1.1885F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0698F, 0.0F, -0.2269F));

		PartDefinition basin_r13 = bone.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(98, 140).addBox(-1.0F, -1.961F, 1.1401F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9372F, -0.8233F, -0.5672F, 0.0F, 0.2356F));

		PartDefinition basin_r14 = bone.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(160, 17).addBox(-0.9811F, -0.0227F, -0.6464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 159).addBox(-0.9811F, -0.0227F, -1.6464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 7.9372F, 0.5767F, 1.1636F, -0.2375F, 0.2426F));

		PartDefinition basin_r15 = bone.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(52, 153).addBox(-0.9811F, -1.4389F, 0.0114F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.7F, 7.9372F, 0.5767F, 0.4655F, -0.2375F, 0.2426F));

		PartDefinition basin_r16 = bone.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(57, 149).addBox(0.1322F, -0.1752F, -0.4972F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6F, 9.5372F, 1.8767F, 0.9546F, -0.0871F, 0.0613F));

		PartDefinition basin_r17 = bone.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(129, 148).addBox(0.1322F, 1.91F, 0.1978F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.6F, 9.5372F, 1.8767F, 0.6055F, -0.0871F, 0.0613F));

		PartDefinition basin_r18 = bone.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(15, 159).addBox(0.1322F, 3.9309F, 1.6269F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-3.6F, 9.5372F, 1.8767F, 0.431F, -0.0871F, 0.0613F));

		PartDefinition basin_r19 = bone.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(40, 159).addBox(0.1322F, 4.629F, 0.4099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6F, 9.5372F, 1.8767F, 0.7626F, -0.0871F, 0.0613F));

		PartDefinition basin_r20 = bone.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(68, 146).addBox(0.1322F, 2.838F, -6.7236F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.6F, 9.5372F, 1.8767F, 1.74F, -0.0871F, 0.0613F));

		PartDefinition basin_r21 = bone.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(138, 7).addBox(-0.1559F, 2.9715F, -8.4146F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.9F, 11.1122F, -6.8233F, 0.48F, 0.0F, 0.0524F));

		PartDefinition basin_r22 = bone.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(157, 151).addBox(-0.1559F, 4.5568F, -2.422F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9F, 11.1122F, -6.8233F, -0.3054F, 0.0F, 0.0524F));

		PartDefinition basin_r23 = bone.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(155, 53).addBox(-0.1559F, 4.8701F, -1.5799F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.9F, 11.1122F, -6.8233F, -0.5672F, 0.0F, 0.0524F));

		PartDefinition basin_r24 = bone.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(124, 148).addBox(-0.1559F, -0.3027F, -2.4176F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9F, 11.1122F, -6.8233F, -0.3927F, 0.0F, 0.0524F));

		PartDefinition basin_r25 = bone.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(62, 149).addBox(-0.1559F, 0.0139F, -1.436F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-3.9F, 11.1122F, -6.8233F, -0.5236F, 0.0F, 0.0524F));

		PartDefinition basin_r26 = bone.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(0, 137).addBox(-1.0F, 1.7263F, -7.8279F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9372F, -0.8233F, 0.2182F, 0.0F, 0.2356F));

		PartDefinition basin_r27 = bone.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(35, 137).addBox(-1.4161F, -0.4581F, -0.973F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 7.1372F, -6.8233F, -0.3043F, -0.0262F, 0.3967F));

		PartDefinition basin_r28 = bone.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(13, 123).addBox(-1.0F, 5.4606F, -0.7837F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9372F, -0.8233F, -0.829F, 0.0F, 0.2356F));

		PartDefinition basin_r29 = bone.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(68, 132).addBox(-1.0F, 5.0963F, -3.7101F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9372F, -0.8233F, -0.6545F, 0.0F, 0.2356F));

		PartDefinition basin_r30 = bone.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(0, 113).addBox(-1.0F, -1.0295F, -3.0071F, 1.0F, 10.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.9372F, -0.8233F, -0.0436F, 0.0F, 0.2356F));

		PartDefinition basin_r31 = bone.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(26, 123).addBox(-1.0F, 0.9726F, -2.0052F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9372F, -0.8233F, -0.9599F, 0.0F, 0.2356F));

		PartDefinition bone4 = basin.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-4.2F, -2.4435F, 4.8978F));

		PartDefinition basin_r32 = bone4.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(137, 92).mirror().addBox(0.1949F, 0.96F, -6.7775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3316F, 0.0F, 0.2269F));

		PartDefinition basin_r33 = bone4.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(128, 160).mirror().addBox(0.1949F, -2.9101F, -4.6747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(150, 49).mirror().addBox(0.1949F, -3.9101F, -5.6747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4102F, 0.0F, 0.2269F));

		PartDefinition basin_r34 = bone4.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(150, 30).mirror().addBox(0.1949F, 3.9962F, -2.3337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(84, 158).mirror().addBox(0.1949F, -4.0481F, 0.8984F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2043F, 0.0F, 0.2269F));

		PartDefinition basin_r35 = bone4.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(126, 80).mirror().addBox(0.1949F, -2.749F, -4.6094F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.2269F));

		PartDefinition basin_r36 = bone4.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(79, 158).mirror().addBox(0.1949F, -2.5197F, 2.724F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0262F, 0.0F, 0.2269F));

		PartDefinition basin_r37 = bone4.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(147, 40).mirror().addBox(0.1949F, -4.0501F, 1.9657F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5498F, 0.0F, 0.2269F));

		PartDefinition basin_r38 = bone4.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(0, 129).mirror().addBox(0.1949F, -2.6453F, -1.1885F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0698F, 0.0F, 0.2269F));

		PartDefinition basin_r39 = bone4.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(98, 140).mirror().addBox(0.0F, -1.961F, 1.1401F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9372F, -0.8233F, -0.5672F, 0.0F, -0.2356F));

		PartDefinition basin_r40 = bone4.addOrReplaceChild("basin_r40", CubeListBuilder.create().texOffs(160, 17).mirror().addBox(-0.0189F, -0.0227F, -0.6464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 159).mirror().addBox(-0.0189F, -0.0227F, -1.6464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, 7.9372F, 0.5767F, 1.1636F, 0.2375F, -0.2426F));

		PartDefinition basin_r41 = bone4.addOrReplaceChild("basin_r41", CubeListBuilder.create().texOffs(52, 153).mirror().addBox(-0.0189F, -1.4389F, 0.0114F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.7F, 7.9372F, 0.5767F, 0.4655F, 0.2375F, -0.2426F));

		PartDefinition basin_r42 = bone4.addOrReplaceChild("basin_r42", CubeListBuilder.create().texOffs(57, 149).mirror().addBox(-1.1322F, -0.1752F, -0.4972F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.6F, 9.5372F, 1.8767F, 0.9546F, 0.0871F, -0.0613F));

		PartDefinition basin_r43 = bone4.addOrReplaceChild("basin_r43", CubeListBuilder.create().texOffs(129, 148).mirror().addBox(-1.1322F, 1.91F, 0.1978F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.6F, 9.5372F, 1.8767F, 0.6055F, 0.0871F, -0.0613F));

		PartDefinition basin_r44 = bone4.addOrReplaceChild("basin_r44", CubeListBuilder.create().texOffs(15, 159).mirror().addBox(-1.1322F, 3.9309F, 1.6269F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(3.6F, 9.5372F, 1.8767F, 0.431F, 0.0871F, -0.0613F));

		PartDefinition basin_r45 = bone4.addOrReplaceChild("basin_r45", CubeListBuilder.create().texOffs(40, 159).mirror().addBox(-1.1322F, 4.629F, 0.4099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.6F, 9.5372F, 1.8767F, 0.7626F, 0.0871F, -0.0613F));

		PartDefinition basin_r46 = bone4.addOrReplaceChild("basin_r46", CubeListBuilder.create().texOffs(68, 146).mirror().addBox(-1.1322F, 2.838F, -6.7236F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.6F, 9.5372F, 1.8767F, 1.74F, 0.0871F, -0.0613F));

		PartDefinition basin_r47 = bone4.addOrReplaceChild("basin_r47", CubeListBuilder.create().texOffs(138, 7).mirror().addBox(-0.8441F, 2.9715F, -8.4146F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(3.9F, 11.1122F, -6.8233F, 0.48F, 0.0F, -0.0524F));

		PartDefinition basin_r48 = bone4.addOrReplaceChild("basin_r48", CubeListBuilder.create().texOffs(157, 151).mirror().addBox(-0.8441F, 4.5568F, -2.422F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.9F, 11.1122F, -6.8233F, -0.3054F, 0.0F, -0.0524F));

		PartDefinition basin_r49 = bone4.addOrReplaceChild("basin_r49", CubeListBuilder.create().texOffs(155, 53).mirror().addBox(-0.8441F, 4.8701F, -1.5799F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(3.9F, 11.1122F, -6.8233F, -0.5672F, 0.0F, -0.0524F));

		PartDefinition basin_r50 = bone4.addOrReplaceChild("basin_r50", CubeListBuilder.create().texOffs(124, 148).mirror().addBox(-0.8441F, -0.3027F, -2.4176F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.9F, 11.1122F, -6.8233F, -0.3927F, 0.0F, -0.0524F));

		PartDefinition basin_r51 = bone4.addOrReplaceChild("basin_r51", CubeListBuilder.create().texOffs(62, 149).mirror().addBox(-0.8441F, 0.0139F, -1.436F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(3.9F, 11.1122F, -6.8233F, -0.5236F, 0.0F, -0.0524F));

		PartDefinition basin_r52 = bone4.addOrReplaceChild("basin_r52", CubeListBuilder.create().texOffs(0, 137).mirror().addBox(0.0F, 1.7263F, -7.8279F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9372F, -0.8233F, 0.2182F, 0.0F, -0.2356F));

		PartDefinition basin_r53 = bone4.addOrReplaceChild("basin_r53", CubeListBuilder.create().texOffs(35, 137).mirror().addBox(0.4161F, -0.4581F, -0.973F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, 7.1372F, -6.8233F, -0.3043F, 0.0262F, -0.3967F));

		PartDefinition basin_r54 = bone4.addOrReplaceChild("basin_r54", CubeListBuilder.create().texOffs(13, 123).mirror().addBox(0.0F, 5.4606F, -0.7837F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9372F, -0.8233F, -0.829F, 0.0F, -0.2356F));

		PartDefinition basin_r55 = bone4.addOrReplaceChild("basin_r55", CubeListBuilder.create().texOffs(68, 132).mirror().addBox(0.0F, 5.0963F, -3.7101F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9372F, -0.8233F, -0.6545F, 0.0F, -0.2356F));

		PartDefinition basin_r56 = bone4.addOrReplaceChild("basin_r56", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(0.0F, -1.0295F, -3.0071F, 1.0F, 10.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9372F, -0.8233F, -0.0436F, 0.0F, -0.2356F));

		PartDefinition basin_r57 = bone4.addOrReplaceChild("basin_r57", CubeListBuilder.create().texOffs(26, 123).mirror().addBox(0.0F, 0.9726F, -2.0052F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9372F, -0.8233F, -0.9599F, 0.0F, -0.2356F));

		return LayerDefinition.create(meshdefinition, 168, 168);
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