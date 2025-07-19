package fossils.fossils.client.blockentity.model.plateosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlateosaurusFossilModel extends SkullModelBase {
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

	public PlateosaurusFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-0.2F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create().texOffs(58, 27).mirror().addBox(-1.3F, -2.0159F, -3.7669F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(62, 0).mirror().addBox(-3.3F, -1.0159F, -3.7669F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 0).addBox(0.7F, -1.0159F, -3.7669F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.2038F, -2.7571F, 0.0417F, 0.0F, 0.0F));

		PartDefinition basin_r1 = basin.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(44, 120).mirror().addBox(0.0F, -0.4018F, -1.132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.6275F, 5.8735F, 1.0123F, 0.0F, 0.0F));

		PartDefinition basin_r2 = basin.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(39, 105).mirror().addBox(-0.2F, -3.65F, 3.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(27, 105).mirror().addBox(-0.2F, -3.15F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.9659F, -0.7669F, -0.1309F, 0.0F, 0.0F));

		PartDefinition basin_r3 = basin.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(49, 110).mirror().addBox(-0.2F, -3.05F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.9659F, -3.7669F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.4F, -0.6802F, -0.0556F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -1.3451F, 5.2377F, 0.1625F, 0.0861F, 0.0141F));

		PartDefinition tail8_r1 = tail1.addOrReplaceChild("tail8_r1", CubeListBuilder.create().texOffs(120, 97).mirror().addBox(-0.5F, -2.9F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.6802F, 13.0444F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail7_r1 = tail1.addOrReplaceChild("tail7_r1", CubeListBuilder.create().texOffs(54, 117).mirror().addBox(-0.5F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.6802F, 10.9444F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail6_r1 = tail1.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(117, 26).mirror().addBox(-0.5F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.6802F, 8.9444F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail5_r1 = tail1.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(23, 117).mirror().addBox(-0.5F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.6802F, 6.9444F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4_r1 = tail1.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(35, 86).mirror().addBox(-0.5F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.6802F, 4.9444F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail3_r1 = tail1.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(20, 117).mirror().addBox(-0.5F, -3.4F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.6802F, 2.9444F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(44, 105).mirror().addBox(-0.5F, -3.4F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.6802F, -0.0556F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3_r2 = tail1.addOrReplaceChild("tail3_r2", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, 0.3F, -0.1F, 2.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0198F, 0.0444F, 0.0F, -0.0436F, 0.0F));

		PartDefinition tail2_r2 = tail1.addOrReplaceChild("tail2_r2", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-2.0F, 0.3F, -0.1F, 2.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0198F, 0.0444F, 0.0F, 0.0436F, 0.0F));

		PartDefinition basin_r4 = tail1.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(45, 112).mirror().addBox(-0.5F, 0.9848F, 1.3835F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 109).mirror().addBox(-0.5F, 0.0848F, -0.6165F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1758F, 9.6946F, 0.5498F, 0.0F, 0.0F));

		PartDefinition basin_r5 = tail1.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(51, 116).mirror().addBox(-0.5F, -0.0152F, -0.9165F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1792F, 7.6698F, 0.576F, 0.0F, 0.0F));

		PartDefinition basin_r6 = tail1.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(48, 116).mirror().addBox(-0.5F, 0.0848F, -0.6165F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.2556F, 4.8107F, 0.6632F, 0.0F, 0.0F));

		PartDefinition basin_r7 = tail1.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(98, 116).mirror().addBox(-0.5F, 0.3848F, -0.2165F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.7832F, 1.8575F, 0.8203F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(31, 46).mirror().addBox(-1.4F, -0.8705F, -0.0307F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1646F, 13.9583F, -0.0375F, 0.1308F, -0.0049F));

		PartDefinition tail7_r2 = tail2.addOrReplaceChild("tail7_r2", CubeListBuilder.create().texOffs(15, 121).mirror().addBox(-0.5F, -2.5F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.8705F, 8.8693F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail6_r2 = tail2.addOrReplaceChild("tail6_r2", CubeListBuilder.create().texOffs(121, 0).mirror().addBox(-0.5F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.8705F, 6.9693F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail5_r2 = tail2.addOrReplaceChild("tail5_r2", CubeListBuilder.create().texOffs(120, 111).mirror().addBox(-0.5F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.8705F, 4.9693F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4_r2 = tail2.addOrReplaceChild("tail4_r2", CubeListBuilder.create().texOffs(104, 120).mirror().addBox(-0.5F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.8705F, 2.9693F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail3_r3 = tail2.addOrReplaceChild("tail3_r3", CubeListBuilder.create().texOffs(101, 120).mirror().addBox(-0.5F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.8705F, 0.9693F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail4_r3 = tail2.addOrReplaceChild("tail4_r3", CubeListBuilder.create().texOffs(56, 46).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1295F, 0.9693F, 0.0F, -0.0698F, 0.0F));

		PartDefinition tail3_r4 = tail2.addOrReplaceChild("tail3_r4", CubeListBuilder.create().texOffs(56, 46).mirror().addBox(-1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.1295F, 0.9693F, 0.0F, 0.0698F, 0.0F));

		PartDefinition basin_r8 = tail2.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(87, 116).mirror().addBox(-0.5F, 5.9848F, 11.3835F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 116).mirror().addBox(-0.5F, 4.9848F, 9.3835F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 116).mirror().addBox(-0.5F, 4.1848F, 7.3835F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(105, 112).mirror().addBox(-0.5F, 2.4848F, 5.3835F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(102, 112).mirror().addBox(-0.5F, 1.6848F, 3.3835F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.0113F, -4.2637F, 0.5498F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3988F, 10.9385F, -0.2304F, -0.2126F, 0.0494F));

		PartDefinition tail4_r4 = tail3.addOrReplaceChild("tail4_r4", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-1.1F, -0.2F, -0.5F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(31, 0).mirror().addBox(-1.1F, -0.5F, -0.5F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0113F, 0.4334F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail10_r1 = tail3.addOrReplaceChild("tail10_r1", CubeListBuilder.create().texOffs(127, 3).mirror().addBox(-0.5F, -1.4697F, -0.0312F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.3221F, 11.8995F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail9_r1 = tail3.addOrReplaceChild("tail9_r1", CubeListBuilder.create().texOffs(93, 126).mirror().addBox(-0.5F, -1.6697F, -0.0312F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.1826F, 9.9044F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail8_r2 = tail3.addOrReplaceChild("tail8_r2", CubeListBuilder.create().texOffs(90, 126).mirror().addBox(-0.5F, -1.8697F, -0.0312F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.0431F, 7.9092F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail7_r3 = tail3.addOrReplaceChild("tail7_r3", CubeListBuilder.create().texOffs(87, 126).mirror().addBox(-0.5F, -1.9627F, 0.0685F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.9035F, 5.8141F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail6_r3 = tail3.addOrReplaceChild("tail6_r3", CubeListBuilder.create().texOffs(93, 121).mirror().addBox(-0.5F, -2.0697F, -0.0312F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.764F, 3.919F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail5_r3 = tail3.addOrReplaceChild("tail5_r3", CubeListBuilder.create().texOffs(60, 121).mirror().addBox(-0.5F, -2.2697F, -0.0312F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.6245F, 1.9238F, -0.2356F, 0.0F, 0.0F));

		PartDefinition tail4_r5 = tail3.addOrReplaceChild("tail4_r5", CubeListBuilder.create().texOffs(57, 121).mirror().addBox(-0.6F, -2.3594F, 0.0637F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4887F, -0.1666F, -0.192F, 0.0F, 0.0F));

		PartDefinition basin_r9 = tail3.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(126, 50).mirror().addBox(0.0F, -0.5F, -0.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.6412F, 13.0237F, 0.637F, 0.0F, 0.0F));

		PartDefinition basin_r10 = tail3.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(20, 126).mirror().addBox(0.0F, 0.0F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.4567F, 10.2496F, 0.6807F, 0.0F, 0.0F));

		PartDefinition basin_r11 = tail3.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(28, 125).mirror().addBox(0.0F, 3.5F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 119).mirror().addBox(0.0F, 1.5F, 3.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 116).mirror().addBox(0.0F, -0.4F, 1.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 113).mirror().addBox(0.0F, -1.7F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.3904F, 1.0687F, 0.7243F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, -0.8897F, 13.8653F, -0.1734F, -0.129F, 0.0225F));

		PartDefinition tail10_r2 = tail4.addOrReplaceChild("tail10_r2", CubeListBuilder.create().texOffs(128, 102).mirror().addBox(-0.5F, -0.8425F, -0.022F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.815F, 9.9881F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail9_r2 = tail4.addOrReplaceChild("tail9_r2", CubeListBuilder.create().texOffs(102, 128).mirror().addBox(-0.5F, -0.9692F, 0.0768F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.815F, 7.8881F, -0.1833F, 0.0F, 0.0F));

		PartDefinition tail8_r3 = tail4.addOrReplaceChild("tail8_r3", CubeListBuilder.create().texOffs(128, 99).mirror().addBox(-0.5F, -1.0029F, -0.0209F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.715F, 5.9881F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail7_r4 = tail4.addOrReplaceChild("tail7_r4", CubeListBuilder.create().texOffs(127, 122).mirror().addBox(-0.5F, -1.233F, -0.0186F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.6151F, 3.9881F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail6_r4 = tail4.addOrReplaceChild("tail6_r4", CubeListBuilder.create().texOffs(109, 127).mirror().addBox(-0.5F, -1.2632F, -0.0198F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.6151F, 1.9881F, -0.096F, 0.0F, 0.0F));

		PartDefinition tail5_r4 = tail4.addOrReplaceChild("tail5_r4", CubeListBuilder.create().texOffs(106, 127).mirror().addBox(-0.5F, -1.3933F, -0.0176F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.515F, -0.0119F, -0.1396F, 0.0F, 0.0F));

		PartDefinition basin_r12 = tail4.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(128, 55).mirror().addBox(0.0F, 6.1F, 9.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 128).mirror().addBox(0.0F, 5.0F, 7.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 128).mirror().addBox(0.0F, 3.9F, 5.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(127, 126).mirror().addBox(0.0F, 2.6F, 3.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 27).mirror().addBox(0.0F, 0.7F, 1.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2484F, -0.8415F, 0.637F, 0.0F, 0.0F));

		PartDefinition tail4_r6 = tail4.addOrReplaceChild("tail4_r6", CubeListBuilder.create().texOffs(31, 32).mirror().addBox(-1.0F, -0.5F, -0.2F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.015F, 0.1881F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4258F, 11.8342F, -0.1229F, -0.2166F, 0.0265F));

		PartDefinition cube_r1 = tail5.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(115, 128).mirror().addBox(-0.3F, -0.6208F, 0.0049F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0076F, 8.0142F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r2 = tail5.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(112, 128).mirror().addBox(-0.3F, -0.7906F, 0.0037F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0076F, 6.0142F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r3 = tail5.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(128, 111).mirror().addBox(-0.3F, -0.9604F, 0.0024F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0076F, 4.0142F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r4 = tail5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(128, 108).mirror().addBox(-0.3F, -1.1302F, 0.0012F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0076F, 2.0142F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r5 = tail5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(128, 105).mirror().addBox(-0.3F, -0.8002F, 0.014F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3924F, 0.0142F, -0.1658F, 0.0F, 0.0F));

		PartDefinition basin_r13 = tail5.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(124, 128).mirror().addBox(0.0F, 4.9F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(121, 128).mirror().addBox(0.0F, 4.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(118, 128).mirror().addBox(0.0F, 2.9F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 128).mirror().addBox(0.0F, 1.8F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(128, 117).mirror().addBox(0.0F, 0.7F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.3929F, 1.7114F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.8F, -0.5F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0076F, 0.0142F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tail6 = tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5201F, 10.9149F, 0.2435F, 0.2544F, 0.0624F));

		PartDefinition cube_r7 = Tail6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.8F, -0.6F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.004F, 0.0489F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3033F, 7.9273F, 0.3676F, 0.4104F, 0.1525F));

		PartDefinition cube_r8 = Tail7.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(74, 69).mirror().addBox(-0.8F, -0.6F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.004F, 0.0489F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3203F, -3.4659F, 0.1065F, 0.0872F, -0.0021F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(12, 109).mirror().addBox(-0.4F, -4.5873F, -3.0987F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 69).mirror().addBox(-1.4F, -1.8873F, -7.0987F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.1891F, -0.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(110, 21).mirror().addBox(-0.4F, -2.7989F, -1.5769F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.7109F, -4.6F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(25, 60).mirror().addBox(-3.9F, -3.413F, -0.0459F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 14.4891F, -8.2F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(57, 119).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1366F, -2.189F, 0.028F, -0.0375F, 1.1627F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(117, 9).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1366F, -2.189F, 0.0803F, 0.0011F, 0.6194F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(111, 76).addBox(-0.5245F, -0.1539F, -0.4871F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.0366F, -5.189F, 0.2464F, -0.0525F, 0.5191F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(111, 74).addBox(2.0377F, -1.4136F, -0.5392F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.0366F, -5.189F, 0.1435F, -0.1689F, 1.0548F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(60, 99).addBox(3.64F, -3.7431F, -0.5392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.0366F, -5.189F, 0.039F, -0.2178F, 1.5863F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(117, 9).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.1366F, -2.189F, 0.0803F, -0.0011F, -0.6194F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(57, 119).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.1366F, -2.189F, 0.028F, 0.0375F, -1.1627F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(60, 99).mirror().addBox(-4.64F, -3.7431F, -0.5392F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0366F, -5.189F, 0.039F, 0.2178F, -1.5863F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(111, 74).mirror().addBox(-5.0377F, -1.4136F, -0.5392F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0366F, -5.189F, 0.1435F, 0.1689F, -1.0548F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(111, 76).mirror().addBox(-2.4756F, -0.1539F, -0.4871F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0366F, -5.189F, 0.2464F, 0.0525F, -0.5191F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.6109F, -7.8F, -0.0176F, 0.1309F, -0.0023F));

		PartDefinition body_r4 = body2.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(110, 15).mirror().addBox(-0.4F, -3.0809F, 0.0976F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4F, -1.2F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body_r5 = body2.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(7, 109).mirror().addBox(-0.4F, -2.7F, 4.7F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(56, 57).mirror().addBox(-1.4F, -0.6F, 0.7F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -8.8F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(111, 72).addBox(3.7341F, -4.2342F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.6475F, -0.089F, 0.0752F, -0.3889F, 1.5405F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(111, 70).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.6475F, -0.089F, 0.2643F, -0.298F, 0.9918F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(111, 68).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.6475F, -0.089F, 0.4135F, -0.1047F, 0.4711F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(93, 83).addBox(3.7341F, -4.2342F, -0.5409F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9475F, -2.989F, 0.1057F, -0.5169F, 1.5271F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(17, 111).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9475F, -2.989F, 0.3611F, -0.3921F, 0.959F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(108, 110).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9475F, -2.989F, 0.5399F, -0.1421F, 0.4555F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(99, 110).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.1475F, -5.989F, 0.5909F, -0.1564F, 0.3956F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(90, 110).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.1475F, -5.989F, 0.4019F, -0.4288F, 0.8904F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(81, 53).addBox(3.7341F, -4.2342F, -0.5409F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.1475F, -5.989F, 0.1191F, -0.568F, 1.4678F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(111, 68).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.6475F, -0.089F, 0.4135F, 0.1047F, -0.4711F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(111, 70).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.6475F, -0.089F, 0.2643F, 0.298F, -0.9918F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(111, 72).mirror().addBox(-6.7341F, -4.2342F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.6475F, -0.089F, 0.0752F, 0.3889F, -1.5405F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(108, 110).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9475F, -2.989F, 0.5399F, 0.1421F, -0.4555F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(17, 111).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9475F, -2.989F, 0.3611F, 0.3921F, -0.959F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(93, 83).mirror().addBox(-8.7341F, -4.2342F, -0.5409F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9475F, -2.989F, 0.1057F, 0.5169F, -1.5271F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(99, 110).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1475F, -5.989F, 0.5909F, 0.1564F, -0.3956F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(90, 110).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1475F, -5.989F, 0.4019F, 0.4288F, -0.8904F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(81, 53).mirror().addBox(-10.7341F, -4.2342F, -0.5409F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1475F, -5.989F, 0.1191F, 0.568F, -1.4678F));

		PartDefinition body_r6 = body2.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(5, 115).mirror().addBox(-0.4F, -1.92F, -0.0377F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -7.1F, 0.1134F, 0.0F, 0.0F));

		PartDefinition body_r7 = body2.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(33, 16).mirror().addBox(-3.9F, -2.883F, 0.0226F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 15.3F, -7.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(114, 50).mirror().addBox(-0.3F, -2.0505F, -1.7337F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.5422F, -8.1198F, 0.1294F, 0.0852F, 0.0187F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(114, 37).mirror().addBox(-0.4F, -1.9992F, 7.7442F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 9).mirror().addBox(-1.4F, -0.1992F, 5.7442F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.8847F, -12.4401F, 0.0873F, 0.0F, 0.0F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(84, 126).mirror().addBox(-0.4F, -1.6983F, 0.0135F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.2847F, -6.7401F, 0.0436F, 0.0F, 0.0F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-3.4F, -2.0587F, 0.0208F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 12.9847F, -6.6401F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(33, 29).addBox(3.5459F, -3.252F, -0.5375F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.4054F, -6.0692F, 0.1146F, -0.551F, 1.4528F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(81, 110).addBox(1.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.4054F, -6.0692F, 0.3882F, -0.4166F, 0.8786F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(67, 101).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.4054F, -6.0692F, 0.5739F, -0.1517F, 0.3807F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(33, 27).addBox(3.6588F, -3.8413F, -0.5396F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.0054F, -3.6692F, 0.1014F, -0.4999F, 1.4943F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(108, 96).addBox(2.1032F, -1.4892F, -0.5396F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.0054F, -3.6692F, 0.3478F, -0.3797F, 0.9291F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(107, 58).addBox(-0.4293F, -0.1847F, -0.4845F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.0054F, -3.6692F, 0.523F, -0.1372F, 0.4229F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(79, 57).addBox(3.7341F, -4.2342F, -0.5409F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.8054F, -0.6692F, 0.0771F, -0.3975F, 1.4874F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(107, 3).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.8054F, -0.6692F, 0.2706F, -0.3044F, 0.9376F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(96, 5).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.8054F, -0.6692F, 0.4219F, -0.1073F, 0.4178F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(67, 101).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.4054F, -6.0692F, 0.5739F, 0.1517F, -0.3807F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(81, 110).mirror().addBox(-4.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.4054F, -6.0692F, 0.3882F, 0.4166F, -0.8786F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(33, 29).mirror().addBox(-12.5459F, -3.252F, -0.5375F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.4054F, -6.0692F, 0.1146F, 0.551F, -1.4528F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(107, 58).mirror().addBox(-2.5707F, -0.1847F, -0.4845F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.0054F, -3.6692F, 0.523F, 0.1372F, -0.4229F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(108, 96).mirror().addBox(-5.1031F, -1.4892F, -0.5396F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.0054F, -3.6692F, 0.3478F, 0.3797F, -0.9291F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(33, 27).mirror().addBox(-12.6588F, -3.8413F, -0.5396F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.0054F, -3.6692F, 0.1014F, 0.4999F, -1.4943F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(96, 5).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8054F, -0.6692F, 0.4219F, 0.1073F, -0.4178F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(107, 3).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8054F, -0.6692F, 0.2706F, 0.3044F, -0.9376F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(79, 57).mirror().addBox(-11.7341F, -4.2342F, -0.5409F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8054F, -0.6692F, 0.0771F, 0.3975F, -1.4874F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.8586F, -6.4418F, 0.132F, 0.1298F, 0.0172F));

		PartDefinition chest_r4 = chest2.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(81, 126).mirror().addBox(-0.4F, -1.7653F, -0.0762F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest_r5 = chest2.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(61, 128).mirror().addBox(-0.4F, -2.0315F, -0.1538F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, -3.9F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest_r6 = chest2.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(78, 126).mirror().addBox(-0.4F, -1.8748F, -0.0573F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r55 = chest2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(85, 55).addBox(0.3837F, -0.0297F, -0.1922F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 55).addBox(2.3837F, -0.0297F, -0.1922F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2654F, 10.1221F, -3.8488F, -1.0919F, -1.0237F, 0.2525F));

		PartDefinition cube_r56 = chest2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(81, 55).addBox(0.0837F, -0.0297F, -0.5922F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2654F, 10.1221F, -3.8488F, -0.8429F, -0.8914F, -0.0516F));

		PartDefinition cube_r57 = chest2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(82, 55).addBox(-0.4F, 0.0948F, -0.4495F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2654F, 9.6221F, -4.2488F, -0.6134F, -0.5765F, -0.3934F));

		PartDefinition cube_r58 = chest2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(83, 7).addBox(3.5459F, -3.252F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.2468F, -5.4274F, 0.1146F, -0.551F, 1.575F));

		PartDefinition cube_r59 = chest2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(110, 88).addBox(1.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.2468F, -5.4274F, 0.3882F, -0.4166F, 1.0008F));

		PartDefinition cube_r60 = chest2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(116, 58).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.2468F, -5.4274F, 0.5739F, -0.1517F, 0.5029F));

		PartDefinition cube_r61 = chest2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(81, 55).addBox(3.5459F, -3.252F, -0.5375F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9468F, -3.4274F, 0.1014F, -0.4999F, 1.5292F));

		PartDefinition cube_r62 = chest2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(110, 86).addBox(1.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9468F, -3.4274F, 0.3478F, -0.3797F, 0.964F));

		PartDefinition cube_r63 = chest2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(94, 15).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9468F, -3.4274F, 0.523F, -0.1372F, 0.4578F));

		PartDefinition cube_r64 = chest2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(101, 91).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.7468F, -1.4274F, 0.4724F, -0.1224F, 0.4295F));

		PartDefinition cube_r65 = chest2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(110, 84).addBox(1.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.7468F, -1.4274F, 0.3087F, -0.3423F, 0.943F));

		PartDefinition cube_r66 = chest2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(79, 59).addBox(3.5459F, -3.252F, -0.5375F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.7468F, -1.4274F, 0.0889F, -0.4487F, 1.5F));

		PartDefinition cube_r67 = chest2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(116, 58).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.2468F, -5.4274F, 0.5739F, 0.1517F, -0.5029F));

		PartDefinition cube_r68 = chest2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(110, 88).mirror().addBox(-4.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.2468F, -5.4274F, 0.3882F, 0.4166F, -1.0008F));

		PartDefinition cube_r69 = chest2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(83, 7).mirror().addBox(-7.5459F, -3.252F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.2468F, -5.4274F, 0.1146F, 0.551F, -1.575F));

		PartDefinition cube_r70 = chest2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(94, 15).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9468F, -3.4274F, 0.523F, 0.1372F, -0.4578F));

		PartDefinition cube_r71 = chest2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(110, 86).mirror().addBox(-4.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9468F, -3.4274F, 0.3478F, 0.3797F, -0.964F));

		PartDefinition cube_r72 = chest2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(85, 55).mirror().addBox(-2.3837F, -0.0297F, -0.1922F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 55).mirror().addBox(-8.3837F, -0.0297F, -0.1922F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0654F, 10.1221F, -3.8488F, -1.0919F, 1.0237F, -0.2525F));

		PartDefinition cube_r73 = chest2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(81, 55).mirror().addBox(-6.0837F, -0.0297F, -0.5922F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0654F, 10.1221F, -3.8488F, -0.8429F, 0.8914F, 0.0516F));

		PartDefinition cube_r74 = chest2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(82, 55).mirror().addBox(-4.6F, 0.0948F, -0.4495F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0654F, 9.6221F, -4.2488F, -0.6134F, 0.5765F, 0.3934F));

		PartDefinition cube_r75 = chest2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(81, 55).mirror().addBox(-9.5459F, -3.252F, -0.5375F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9468F, -3.4274F, 0.1014F, 0.4999F, -1.5292F));

		PartDefinition cube_r76 = chest2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(101, 91).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.7468F, -1.4274F, 0.4724F, 0.1224F, -0.4295F));

		PartDefinition cube_r77 = chest2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(110, 84).mirror().addBox(-4.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.7468F, -1.4274F, 0.3087F, 0.3423F, -0.943F));

		PartDefinition cube_r78 = chest2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(79, 59).mirror().addBox(-11.5459F, -3.252F, -0.5375F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.7468F, -1.4274F, 0.0889F, 0.4487F, -1.5F));

		PartDefinition chest_r7 = chest2.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(38, 69).mirror().addBox(-1.4F, -0.0983F, -6.9864F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, -0.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition upperarmL = chest2.addOrReplaceChild("upperarmL", CubeListBuilder.create().texOffs(120, 67).mirror().addBox(-0.7521F, 0.1043F, 1.118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.209F)).mirror(false), PartPose.offsetAndRotation(-3.6877F, 7.0723F, -8.065F, 0.3477F, 0.0358F, 1.03F));

		PartDefinition upperarm4_r1 = upperarmL.addOrReplaceChild("upperarm4_r1", CubeListBuilder.create().texOffs(106, 105).mirror().addBox(-0.5F, -0.1F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5521F, 3.1899F, -0.7041F, 0.9599F, 0.0F, 0.0F));

		PartDefinition upperarm3_r1 = upperarmL.addOrReplaceChild("upperarm3_r1", CubeListBuilder.create().texOffs(106, 79).mirror().addBox(-0.5F, 0.1F, 1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.5521F, 1.1297F, -2.0891F, -0.1309F, 0.0F, 0.0F));

		PartDefinition upperarm4_r2 = upperarmL.addOrReplaceChild("upperarm4_r2", CubeListBuilder.create().texOffs(117, 5).mirror().addBox(-0.5F, -0.8F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2521F, 7.1042F, 1.318F, -0.0873F, 0.0F, 0.0F));

		PartDefinition upperarm4_r3 = upperarmL.addOrReplaceChild("upperarm4_r3", CubeListBuilder.create().texOffs(120, 70).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2521F, 4.0512F, 1.1211F, 0.6109F, 0.0F, 0.0F));

		PartDefinition upperarm3_r2 = upperarmL.addOrReplaceChild("upperarm3_r2", CubeListBuilder.create().texOffs(116, 0).mirror().addBox(-0.5F, -3.5F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2521F, 7.1042F, 1.318F, 0.1745F, 0.0F, 0.0F));

		PartDefinition upperarm5_r1 = upperarmL.addOrReplaceChild("upperarm5_r1", CubeListBuilder.create().texOffs(69, 120).mirror().addBox(-0.5F, -0.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2521F, 3.7336F, 1.1504F, 1.5359F, 0.0F, 0.0F));

		PartDefinition upperarm4_r4 = upperarmL.addOrReplaceChild("upperarm4_r4", CubeListBuilder.create().texOffs(18, 106).mirror().addBox(-0.5F, -2.3F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.195F)).mirror(false), PartPose.offsetAndRotation(-0.2521F, 1.3377F, 2.9558F, 0.925F, 0.0F, 0.0F));

		PartDefinition upperarm3_r3 = upperarmL.addOrReplaceChild("upperarm3_r3", CubeListBuilder.create().texOffs(38, 112).mirror().addBox(-0.5F, -1.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2521F, 1.145F, 2.9024F, 0.6632F, 0.0F, 0.0F));

		PartDefinition lowerarmL = upperarmL.addOrReplaceChild("lowerarmL", CubeListBuilder.create().texOffs(77, 85).mirror().addBox(0.0591F, 0.003F, -5.0888F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8034F, 8.7046F, 2.0782F, 0.3912F, 0.0671F, -0.1612F));

		PartDefinition arms4_r1 = lowerarmL.addOrReplaceChild("arms4_r1", CubeListBuilder.create().texOffs(9, 86).mirror().addBox(-0.5F, 0.7F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5591F, -1.897F, -3.9888F, 0.0087F, 0.0F, 0.0F));

		PartDefinition handL = lowerarmL.addOrReplaceChild("handL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0668F, -0.3729F, -5.343F, 0.0009F, -0.186F, -0.2672F));

		PartDefinition hands4_r1 = handL.addOrReplaceChild("hands4_r1", CubeListBuilder.create().texOffs(88, 93).mirror().addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.0F, 2.1178F, -1.2322F, 0.48F, 0.0F, 0.0F));

		PartDefinition hands2_r1 = handL.addOrReplaceChild("hands2_r1", CubeListBuilder.create().texOffs(79, 61).mirror().addBox(-1.0F, -0.8F, -2.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.35F, -3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition thumbclawL = handL.addOrReplaceChild("thumbclawL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1366F, 0.5667F, -0.6194F, -0.6307F, -0.1991F, -0.1652F));

		PartDefinition thumbclaw2_r1 = thumbclawL.addOrReplaceChild("thumbclaw2_r1", CubeListBuilder.create().texOffs(9, 79).mirror().addBox(-1.0F, -1.2F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1F, -2.1F, 0.0F, 0.3054F, 0.0F));

		PartDefinition upperarmL2 = chest2.addOrReplaceChild("upperarmL2", CubeListBuilder.create().texOffs(120, 73).mirror().addBox(-0.2479F, 0.1043F, 1.118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.209F)).mirror(false), PartPose.offsetAndRotation(2.8877F, 7.0723F, -8.065F, 0.5234F, -0.2431F, -1.087F));

		PartDefinition upperarm5_r2 = upperarmL2.addOrReplaceChild("upperarm5_r2", CubeListBuilder.create().texOffs(67, 108).mirror().addBox(-0.5F, -0.1F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5521F, 3.1899F, -0.7041F, 0.9599F, 0.0F, 0.0F));

		PartDefinition upperarm4_r5 = upperarmL2.addOrReplaceChild("upperarm4_r5", CubeListBuilder.create().texOffs(107, 53).mirror().addBox(-0.5F, 0.1F, 1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.5521F, 1.1297F, -2.0891F, -0.1309F, 0.0F, 0.0F));

		PartDefinition upperarm5_r3 = upperarmL2.addOrReplaceChild("upperarm5_r3", CubeListBuilder.create().texOffs(15, 117).mirror().addBox(-0.5F, -0.8F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2521F, 7.1042F, 1.318F, -0.0873F, 0.0F, 0.0F));

		PartDefinition upperarm5_r4 = upperarmL2.addOrReplaceChild("upperarm5_r4", CubeListBuilder.create().texOffs(120, 90).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2521F, 4.0512F, 1.1211F, 0.6109F, 0.0F, 0.0F));

		PartDefinition upperarm4_r6 = upperarmL2.addOrReplaceChild("upperarm4_r6", CubeListBuilder.create().texOffs(93, 116).mirror().addBox(-0.5F, -3.5F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.2521F, 7.1042F, 1.318F, 0.1745F, 0.0F, 0.0F));

		PartDefinition upperarm6_r1 = upperarmL2.addOrReplaceChild("upperarm6_r1", CubeListBuilder.create().texOffs(74, 120).mirror().addBox(-0.5F, -0.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.2521F, 3.7336F, 1.1504F, 1.5359F, 0.0F, 0.0F));

		PartDefinition upperarm5_r5 = upperarmL2.addOrReplaceChild("upperarm5_r5", CubeListBuilder.create().texOffs(107, 37).mirror().addBox(-0.5F, -2.3F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.195F)).mirror(false), PartPose.offsetAndRotation(0.2521F, 1.3377F, 2.9558F, 0.925F, 0.0F, 0.0F));

		PartDefinition upperarm4_r7 = upperarmL2.addOrReplaceChild("upperarm4_r7", CubeListBuilder.create().texOffs(108, 112).mirror().addBox(-0.5F, -1.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.2521F, 1.145F, 2.9024F, 0.6632F, 0.0F, 0.0F));

		PartDefinition lowerarmL2 = upperarmL2.addOrReplaceChild("lowerarmL2", CubeListBuilder.create().texOffs(22, 86).mirror().addBox(-1.0591F, 0.003F, -5.0888F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8034F, 8.7046F, 2.0782F, 0.3912F, -0.0671F, 0.1612F));

		PartDefinition arms5_r1 = lowerarmL2.addOrReplaceChild("arms5_r1", CubeListBuilder.create().texOffs(88, 17).mirror().addBox(-0.5F, 0.7F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5591F, -1.897F, -3.9888F, 0.0087F, 0.0F, 0.0F));

		PartDefinition handL2 = lowerarmL2.addOrReplaceChild("handL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0668F, -0.3729F, -5.343F, -0.0398F, 0.1817F, 0.0453F));

		PartDefinition hands5_r1 = handL2.addOrReplaceChild("hands5_r1", CubeListBuilder.create().texOffs(94, 7).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1178F, -1.2322F, 0.48F, 0.0F, 0.0F));

		PartDefinition hands3_r1 = handL2.addOrReplaceChild("hands3_r1", CubeListBuilder.create().texOffs(81, 9).mirror().addBox(0.0F, -0.8F, -2.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition thumbclawL2 = handL2.addOrReplaceChild("thumbclawL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 0.3772F, -1.0121F, -0.4821F, -0.1927F, 0.1279F));

		PartDefinition thumbclaw3_r1 = thumbclawL2.addOrReplaceChild("thumbclaw3_r1", CubeListBuilder.create().texOffs(24, 79).mirror().addBox(-1.0F, -1.2F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.1F, -1.6F, 0.0F, -0.3054F, 0.0F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.5974F, 7.4077F, -9.9315F));

		PartDefinition body_r8 = bone2.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(101, 85).mirror().addBox(-0.1507F, 0.9965F, -1.1974F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7026F, -3.4178F, 5.2452F, -1.6523F, -0.6055F, 0.11F));

		PartDefinition body_r9 = bone2.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(49, 105).mirror().addBox(-0.5F, -1.225F, -0.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4301F, -3.7826F, 2.6534F, -0.4306F, -0.6055F, 0.11F));

		PartDefinition body_r10 = bone2.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(51, 99).mirror().addBox(-0.5F, -1.0F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.9708F, -2.672F, 3.2537F, -0.9978F, -0.6055F, 0.11F));

		PartDefinition body_r11 = bone2.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(42, 99).mirror().addBox(-0.5F, -1.0119F, 0.0208F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9334F, 1.9599F, 4.2111F, -0.5994F, 0.0F, 0.0F));

		PartDefinition body_r12 = bone2.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(42, 99).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.9334F, 0.5599F, 3.5111F, -0.774F, 0.0F, 0.0F));

		PartDefinition body_r13 = bone2.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(42, 99).mirror().addBox(-1.1F, 0.7F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.9708F, -2.672F, 3.2537F, -0.4249F, -1.0596F, -0.6304F));

		PartDefinition body_r14 = bone2.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(31, 119).mirror().addBox(-0.4912F, 2.1791F, -1.4363F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.8913F, -5.3916F, 7.462F, -0.6339F, -0.173F, 0.2202F));

		PartDefinition body_r15 = bone2.addOrReplaceChild("body_r15", CubeListBuilder.create().texOffs(34, 104).mirror().addBox(-0.4912F, -1.8128F, -0.4098F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-2.8913F, -5.3916F, 7.462F, -1.0266F, -0.173F, 0.2202F));

		PartDefinition body_r16 = bone2.addOrReplaceChild("body_r16", CubeListBuilder.create().texOffs(0, 119).mirror().addBox(-0.4912F, 1.7518F, -0.5693F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8913F, -5.3916F, 7.462F, -1.2011F, -0.173F, 0.2202F));

		PartDefinition body_r17 = bone2.addOrReplaceChild("body_r17", CubeListBuilder.create().texOffs(112, 5).mirror().addBox(-0.4912F, -1.8646F, -1.055F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8913F, -5.3916F, 7.462F, -0.9393F, -0.173F, 0.2202F));

		PartDefinition body_r18 = bone2.addOrReplaceChild("body_r18", CubeListBuilder.create().texOffs(118, 104).mirror().addBox(-0.5472F, -3.0617F, -0.805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8913F, -5.3916F, 7.462F, -0.6688F, -0.1358F, 0.2576F));

		PartDefinition body_r19 = bone2.addOrReplaceChild("body_r19", CubeListBuilder.create().texOffs(119, 60).mirror().addBox(-0.5472F, -3.855F, 0.0471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.8913F, -5.3916F, 7.462F, -0.6251F, -0.1358F, 0.2576F));

		PartDefinition body_r20 = bone2.addOrReplaceChild("body_r20", CubeListBuilder.create().texOffs(118, 80).mirror().addBox(-0.5472F, -3.7534F, -0.1272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.8913F, -5.3916F, 7.462F, -0.407F, -0.1358F, 0.2576F));

		PartDefinition body_r21 = bone2.addOrReplaceChild("body_r21", CubeListBuilder.create().texOffs(105, 5).mirror().addBox(-0.5472F, -3.6272F, -1.6651F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.8913F, -5.3916F, 7.462F, -1.3233F, -0.1358F, 0.2576F));

		PartDefinition body_r22 = bone2.addOrReplaceChild("body_r22", CubeListBuilder.create().texOffs(26, 118).mirror().addBox(-0.5472F, -3.1338F, -1.7942F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8913F, -5.3916F, 7.462F, -1.9341F, -0.1358F, 0.2576F));

		PartDefinition bone4 = chest2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.7974F, 7.4077F, -9.9315F));

		PartDefinition body_r23 = bone4.addOrReplaceChild("body_r23", CubeListBuilder.create().texOffs(101, 85).addBox(-0.8493F, 0.9965F, -1.1974F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.7026F, -3.4178F, 5.2452F, -1.6523F, 0.6055F, -0.11F));

		PartDefinition body_r24 = bone4.addOrReplaceChild("body_r24", CubeListBuilder.create().texOffs(49, 105).addBox(-0.5F, -1.225F, -0.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4301F, -3.7826F, 2.6534F, -0.4306F, 0.6055F, -0.11F));

		PartDefinition body_r25 = bone4.addOrReplaceChild("body_r25", CubeListBuilder.create().texOffs(51, 99).addBox(-0.5F, -1.0F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.9708F, -2.672F, 3.2537F, -0.9978F, 0.6055F, -0.11F));

		PartDefinition body_r26 = bone4.addOrReplaceChild("body_r26", CubeListBuilder.create().texOffs(42, 99).addBox(-0.5F, -1.0119F, 0.0208F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.9334F, 1.9599F, 4.2111F, -0.5994F, 0.0F, 0.0F));

		PartDefinition body_r27 = bone4.addOrReplaceChild("body_r27", CubeListBuilder.create().texOffs(42, 99).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9334F, 0.5599F, 3.5111F, -0.774F, 0.0F, 0.0F));

		PartDefinition body_r28 = bone4.addOrReplaceChild("body_r28", CubeListBuilder.create().texOffs(42, 99).addBox(0.1F, 0.7F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.9708F, -2.672F, 3.2537F, -0.4249F, 1.0596F, 0.6304F));

		PartDefinition body_r29 = bone4.addOrReplaceChild("body_r29", CubeListBuilder.create().texOffs(31, 119).addBox(-0.5088F, 2.1791F, -1.4363F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.8913F, -5.3916F, 7.462F, -0.6339F, 0.173F, -0.2202F));

		PartDefinition body_r30 = bone4.addOrReplaceChild("body_r30", CubeListBuilder.create().texOffs(34, 104).addBox(-0.5088F, -1.8128F, -0.4098F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(2.8913F, -5.3916F, 7.462F, -1.0266F, 0.173F, -0.2202F));

		PartDefinition body_r31 = bone4.addOrReplaceChild("body_r31", CubeListBuilder.create().texOffs(0, 119).addBox(-0.5088F, 1.7518F, -0.5693F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8913F, -5.3916F, 7.462F, -1.2011F, 0.173F, -0.2202F));

		PartDefinition body_r32 = bone4.addOrReplaceChild("body_r32", CubeListBuilder.create().texOffs(112, 5).addBox(-0.5088F, -1.8646F, -1.055F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.8913F, -5.3916F, 7.462F, -0.9393F, 0.173F, -0.2202F));

		PartDefinition body_r33 = bone4.addOrReplaceChild("body_r33", CubeListBuilder.create().texOffs(118, 104).addBox(-0.4528F, -3.0617F, -0.805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8913F, -5.3916F, 7.462F, -0.6688F, 0.1358F, -0.2576F));

		PartDefinition body_r34 = bone4.addOrReplaceChild("body_r34", CubeListBuilder.create().texOffs(119, 60).addBox(-0.4528F, -3.855F, 0.0471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.8913F, -5.3916F, 7.462F, -0.6251F, 0.1358F, -0.2576F));

		PartDefinition body_r35 = bone4.addOrReplaceChild("body_r35", CubeListBuilder.create().texOffs(118, 80).addBox(-0.4528F, -3.7534F, -0.1272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.8913F, -5.3916F, 7.462F, -0.407F, 0.1358F, -0.2576F));

		PartDefinition body_r36 = bone4.addOrReplaceChild("body_r36", CubeListBuilder.create().texOffs(105, 5).addBox(-0.4528F, -3.6272F, -1.6651F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.8913F, -5.3916F, 7.462F, -1.3233F, 0.1358F, -0.2576F));

		PartDefinition body_r37 = bone4.addOrReplaceChild("body_r37", CubeListBuilder.create().texOffs(26, 118).addBox(-0.4528F, -3.1338F, -1.7942F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8913F, -5.3916F, 7.462F, -1.9341F, 0.1358F, -0.2576F));

		PartDefinition neck1 = chest2.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.3849F, -6.9834F, -0.1414F, 0.2593F, -0.0365F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(56, 105).mirror().addBox(-0.5F, -2.0328F, -1.0747F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.1078F, 0.2614F, 0.096F, 0.0F, 0.0F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(0, 114).mirror().addBox(-0.5F, -1.8281F, -2.0774F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.1078F, -1.7386F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(81, 46).mirror().addBox(-1.0F, -0.7093F, 2.1055F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.2922F, -6.9386F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r79 = neck1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(119, 48).addBox(1.5917F, -0.6587F, -0.549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1549F, 0.5015F, -2.7031F, 0.2874F, -0.8552F, 1.2985F));

		PartDefinition cube_r80 = neck1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(64, 117).addBox(-0.2871F, -0.1895F, -0.5098F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1549F, 0.5015F, -2.7031F, 0.5818F, -0.7222F, 0.9419F));

		PartDefinition cube_r81 = neck1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(57, 117).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4619F, -0.444F, 0.8062F, -0.2823F, 0.5229F));

		PartDefinition cube_r82 = neck1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(94, 13).addBox(1.7107F, -1.0354F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4619F, -0.444F, 0.551F, -0.6376F, 0.9886F));

		PartDefinition cube_r83 = neck1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(64, 117).mirror().addBox(-1.7129F, -0.1895F, -0.5098F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7549F, 0.5015F, -2.7031F, 0.5818F, 0.7222F, -0.9419F));

		PartDefinition cube_r84 = neck1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(119, 48).mirror().addBox(-3.5917F, -0.6587F, -0.549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7549F, 0.5015F, -2.7031F, 0.2874F, 0.8552F, -1.2985F));

		PartDefinition cube_r85 = neck1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(94, 13).mirror().addBox(-6.7107F, -1.0354F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.4619F, -0.444F, 0.551F, 0.6376F, -0.9886F));

		PartDefinition cube_r86 = neck1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(57, 117).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.4619F, -0.444F, 0.8062F, 0.2823F, -0.5229F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, -0.2709F, -4.7437F, -0.0704F, 0.1878F, -0.2138F));

		PartDefinition neck4_r1 = neck2.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(113, 78).mirror().addBox(-0.5F, -1.8843F, 1.2657F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 113).mirror().addBox(-0.5F, -1.8843F, -1.5343F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1534F, -3.0688F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r87 = neck2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(119, 52).addBox(1.7768F, -0.6202F, -0.4836F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5451F, 0.2724F, -3.8595F, 0.4835F, -1.1427F, 1.1317F));

		PartDefinition cube_r88 = neck2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(118, 78).addBox(-0.1214F, -0.0985F, -0.4447F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5451F, 0.2724F, -3.8595F, 0.8904F, -0.9491F, 0.7108F));

		PartDefinition cube_r89 = neck2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(71, 118).addBox(-0.2871F, -0.1895F, -0.5098F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5451F, 0.5724F, -0.9595F, 0.9495F, -0.9768F, 0.6622F));

		PartDefinition cube_r90 = neck2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(119, 50).addBox(1.5917F, -0.6588F, -0.549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5451F, 0.5724F, -0.9595F, 0.5324F, -1.1818F, 1.0868F));

		PartDefinition cube_r91 = neck2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(118, 78).mirror().addBox(-1.8786F, -0.0985F, -0.4447F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4549F, 0.2724F, -3.8595F, 0.8904F, 0.9491F, -0.7108F));

		PartDefinition cube_r92 = neck2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(119, 52).mirror().addBox(-3.7768F, -0.6202F, -0.4836F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4549F, 0.2724F, -3.8595F, 0.4835F, 1.1427F, -1.1317F));

		PartDefinition cube_r93 = neck2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(71, 118).mirror().addBox(-1.7129F, -0.1895F, -0.5098F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4549F, 0.5724F, -0.9595F, 0.9495F, 0.9768F, -0.6622F));

		PartDefinition cube_r94 = neck2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(119, 50).mirror().addBox(-3.5917F, -0.6588F, -0.549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4549F, 0.5724F, -0.9595F, 0.5324F, 1.1818F, -1.0868F));

		PartDefinition neck2_r2 = neck2.addOrReplaceChild("neck2_r2", CubeListBuilder.create().texOffs(81, 31).mirror().addBox(-1.0F, -0.2812F, -4.6184F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1534F, -0.1688F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4087F, -4.3486F, -0.1048F, 0.2177F, 0.0151F));

		PartDefinition cube_r95 = neck3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(108, 116).mirror().addBox(-1.0F, -1.2889F, -2.1519F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(42, 93).mirror().addBox(-1.5F, -0.0889F, -3.3519F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2734F, -0.7067F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r96 = neck3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(111, 98).addBox(0.0F, -0.1F, -0.6F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.2085F, -2.0518F, 0.299F, -0.977F, 1.2235F));

		PartDefinition cube_r97 = neck3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(111, 98).mirror().addBox(-3.0F, -0.1F, -0.6F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.2085F, -2.0518F, 0.299F, 0.977F, -1.2235F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9596F, -3.7708F, -0.8317F, 0.1177F, -0.0619F));

		PartDefinition cube_r98 = neck.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(113, 104).mirror().addBox(-1.0F, -1.8F, 1.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 93).mirror().addBox(-1.5F, -0.7F, -0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3413F, -3.1163F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r99 = neck.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(111, 100).addBox(0.0F, -0.1F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5853F, 0.419F, -1.415F, 1.3344F, -1.3074F, 0.2722F));

		PartDefinition cube_r100 = neck.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(111, 100).mirror().addBox(-3.0F, -0.1F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4147F, 0.419F, -1.415F, 1.3344F, 1.3074F, -0.2722F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0239F, -3.8912F, -0.3494F, 0.1308F, -0.0057F));

		PartDefinition cube_r101 = neck4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(99, 128).mirror().addBox(-1.0F, -1.7F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(128, 96).mirror().addBox(-1.0F, -1.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 77).mirror().addBox(-1.5F, -0.7F, -0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3413F, -3.1163F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r102 = neck4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(117, 109).addBox(-0.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4157F, 0.4162F, -2.8837F, 0.7662F, -1.3155F, 0.7784F));

		PartDefinition cube_r103 = neck4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(111, 102).addBox(-0.1F, 0.0F, -0.7F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5168F, 0.1777F, -0.3671F, 0.8772F, -1.3018F, 0.713F));

		PartDefinition cube_r104 = neck4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(117, 109).mirror().addBox(-1.7F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5843F, 0.4162F, -2.8837F, 0.7662F, 1.3155F, -0.7784F));

		PartDefinition cube_r105 = neck4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(111, 102).mirror().addBox(-2.9F, 0.0F, -0.7F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4832F, 0.1777F, -0.3671F, 0.8772F, 1.3018F, -0.713F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0123F, -3.931F, 0.4765F, 0.0844F, 0.0223F));

		PartDefinition cube_r106 = neck5.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(96, 128).mirror().addBox(-1.0F, -1.7F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(102, 68).mirror().addBox(-1.5F, -0.7F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3413F, -3.1163F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r107 = neck5.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(117, 95).addBox(0.0F, -0.1F, -0.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.1148F, -1.6587F, 0.8537F, -1.1757F, 0.7105F));

		PartDefinition cube_r108 = neck5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(117, 95).mirror().addBox(-2.0F, -0.1F, -0.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1148F, -1.6587F, 0.8537F, 1.1757F, -0.7105F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.015F, -2.7925F, 0.6938F, 0.0F, 0.0F));

		PartDefinition cube_r109 = neck6.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(128, 78).mirror().addBox(-1.0F, -1.7F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 109).mirror().addBox(-1.5F, -0.7F, 1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3413F, -3.1163F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r110 = neck6.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(113, 117).addBox(0.0F, -0.1F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2298F, -1.6662F, 0.316F, -1.187F, 1.2223F));

		PartDefinition cube_r111 = neck6.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(113, 117).mirror().addBox(-2.0F, -0.1F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.2298F, -1.6662F, 0.316F, 1.187F, -1.2223F));

		PartDefinition head1 = neck6.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.641F, -3.0772F, -0.0735F, -0.0117F, 0.016F));

		PartDefinition head5_r1 = head1.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(38, 116).mirror().addBox(-0.5F, -1.975F, -0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6351F, -2.0855F, -1.5533F, 0.0F, 0.0F));

		PartDefinition head17_r1 = head1.addOrReplaceChild("head17_r1", CubeListBuilder.create().texOffs(124, 32).addBox(0.1019F, -1.0134F, -0.5704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.6089F, 0.803F, -0.009F, 2.8156F, 0.0742F, -0.0044F));

		PartDefinition head16_r1 = head1.addOrReplaceChild("head16_r1", CubeListBuilder.create().texOffs(124, 8).addBox(0.1019F, -1.0295F, -0.34F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6089F, 0.803F, -0.009F, 2.3792F, 0.0742F, -0.0044F));

		PartDefinition head15_r1 = head1.addOrReplaceChild("head15_r1", CubeListBuilder.create().texOffs(123, 106).addBox(0.1019F, -0.7528F, -0.0994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.6089F, 0.803F, -0.009F, 2.7719F, 0.0742F, -0.0044F));

		PartDefinition head13_r1 = head1.addOrReplaceChild("head13_r1", CubeListBuilder.create().texOffs(123, 103).addBox(0.1166F, -0.4643F, -0.204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6089F, 0.803F, -0.009F, 2.8136F, 0.0742F, -0.0044F));

		PartDefinition head16_r2 = head1.addOrReplaceChild("head16_r2", CubeListBuilder.create().texOffs(124, 35).addBox(0.1019F, -0.0169F, -0.1816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6089F, 0.803F, -0.009F, -3.1186F, 0.0742F, -0.0044F));

		PartDefinition head12_r1 = head1.addOrReplaceChild("head12_r1", CubeListBuilder.create().texOffs(123, 100).addBox(0.1166F, 0.194F, -0.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.6089F, 0.803F, -0.009F, 3.1191F, 0.0742F, -0.0044F));

		PartDefinition head16_r3 = head1.addOrReplaceChild("head16_r3", CubeListBuilder.create().texOffs(10, 120).addBox(0.1166F, -0.0168F, -0.1536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6089F, 0.803F, -0.009F, 2.5082F, 0.0742F, -0.0044F));

		PartDefinition head23_r1 = head1.addOrReplaceChild("head23_r1", CubeListBuilder.create().texOffs(125, 72).addBox(-0.4655F, -0.9626F, -0.3584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F))
				.texOffs(63, 125).addBox(-0.5155F, -0.518F, -0.4022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.3276F, 1.0147F, -5.5759F, 2.4667F, 0.2224F, 0.0084F));

		PartDefinition head22_r1 = head1.addOrReplaceChild("head22_r1", CubeListBuilder.create().texOffs(125, 66).addBox(-0.5155F, -0.4738F, -0.6084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.3276F, 1.0147F, -5.5759F, 1.8122F, 0.2224F, 0.0084F));

		PartDefinition head24_r1 = head1.addOrReplaceChild("head24_r1", CubeListBuilder.create().texOffs(125, 75).addBox(-0.4655F, -0.8642F, -0.6045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3276F, 1.0147F, -5.5759F, 2.0827F, 0.2224F, 0.0084F));

		PartDefinition head23_r2 = head1.addOrReplaceChild("head23_r2", CubeListBuilder.create().texOffs(125, 69).addBox(-0.5155F, -0.2241F, -0.3421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3276F, 1.0147F, -5.5759F, 1.1577F, 0.2224F, 0.0084F));

		PartDefinition head20_r1 = head1.addOrReplaceChild("head20_r1", CubeListBuilder.create().texOffs(120, 14).addBox(-0.5155F, -0.1192F, -0.3304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3276F, 1.0147F, -5.5759F, 2.0304F, 0.2224F, 0.0084F));

		PartDefinition head20_r2 = head1.addOrReplaceChild("head20_r2", CubeListBuilder.create().texOffs(23, 125).addBox(-0.5018F, -0.6996F, -0.7722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(125, 23).addBox(-0.5018F, -0.6996F, -0.4723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8322F, 0.7936F, -3.1555F, -2.7688F, 0.2007F, 0.0132F));

		PartDefinition head20_r3 = head1.addOrReplaceChild("head20_r3", CubeListBuilder.create().texOffs(41, 125).addBox(-0.5013F, -0.335F, -0.3558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(125, 20).addBox(-0.5013F, -0.335F, -0.5558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8322F, 0.7936F, -3.1555F, 2.772F, 0.2006F, 0.0084F));

		PartDefinition head23_r3 = head1.addOrReplaceChild("head23_r3", CubeListBuilder.create().texOffs(125, 29).addBox(-0.5018F, -0.1889F, -0.3547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(125, 26).addBox(-0.5018F, -0.5639F, -0.3547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8322F, 0.7936F, -3.1555F, -2.5506F, 0.2007F, 0.0132F));

		PartDefinition head7_r1 = head1.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(120, 11).addBox(-0.9535F, 0.8284F, -0.4239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.467F, 0.5763F, -0.1806F, -1.4168F, 0.1102F, 0.0009F));

		PartDefinition head19_r1 = head1.addOrReplaceChild("head19_r1", CubeListBuilder.create().texOffs(119, 84).addBox(-0.4875F, -0.8733F, -0.7007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(124, 60).addBox(-0.4875F, -0.8733F, -0.9757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.0483F, 0.2295F, -1.736F, -3.0312F, 0.1091F, 0.0F));

		PartDefinition head21_r1 = head1.addOrReplaceChild("head21_r1", CubeListBuilder.create().texOffs(119, 87).addBox(-0.4875F, -0.5745F, -0.8909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.0483F, 0.2295F, -1.736F, -2.6385F, 0.1091F, 0.0F));

		PartDefinition head26_r1 = head1.addOrReplaceChild("head26_r1", CubeListBuilder.create().texOffs(124, 93).addBox(-0.4875F, -0.2653F, -0.0807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(124, 86).addBox(-0.4875F, -0.1653F, -0.0807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.0483F, 0.2295F, -1.736F, -2.5687F, 0.1091F, 0.0F));

		PartDefinition head18_r1 = head1.addOrReplaceChild("head18_r1", CubeListBuilder.create().texOffs(124, 44).addBox(-0.4875F, -0.8537F, -0.3901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.0483F, 0.2295F, -1.736F, 2.8157F, 0.1091F, 0.0F));

		PartDefinition head28_r1 = head1.addOrReplaceChild("head28_r1", CubeListBuilder.create().texOffs(125, 11).addBox(-0.3875F, -0.4342F, -0.3636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(107, 124).addBox(-0.5625F, -0.4342F, -0.3636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0483F, 0.2295F, -1.736F, 3.06F, 0.1091F, 0.0F));

		PartDefinition head23_r4 = head1.addOrReplaceChild("head23_r4", CubeListBuilder.create().texOffs(124, 63).addBox(-0.4875F, -0.1857F, -0.907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.0483F, 0.2295F, -1.736F, -1.5215F, 0.1091F, 0.0F));

		PartDefinition head24_r2 = head1.addOrReplaceChild("head24_r2", CubeListBuilder.create().texOffs(124, 83).addBox(-0.4875F, 0.0959F, -0.4966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0483F, 0.2295F, -1.736F, -2.0451F, 0.1091F, 0.0F));

		PartDefinition head22_r2 = head1.addOrReplaceChild("head22_r2", CubeListBuilder.create().texOffs(68, 126).addBox(-0.4875F, -0.5373F, -0.8544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.0483F, 0.2295F, -1.736F, -1.8706F, 0.1091F, 0.0F));

		PartDefinition head8_r1 = head1.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(119, 44).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9081F, 0.2746F, -1.111F, -1.5041F, 0.1102F, 0.0009F));

		PartDefinition head4_r1 = head1.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(112, 125).addBox(-0.1166F, -1.1902F, -0.5085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(124, 38).addBox(-0.1166F, 0.0348F, -1.1585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(119, 36).addBox(-0.1166F, -0.9652F, -0.7585F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6089F, 0.803F, -0.009F, -0.3029F, 0.0742F, -0.0044F));

		PartDefinition head7_r2 = head1.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(109, 0).addBox(0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(109, 0).mirror().addBox(-2.1F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.6624F, 1.2761F, -3.1154F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head1.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(95, 112).addBox(-0.0166F, -0.7265F, -0.1928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.6089F, 0.803F, -0.009F, -1.3283F, 0.0742F, -0.0044F));

		PartDefinition head2_r1 = head1.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(118, 119).addBox(-0.1166F, 0.0482F, -0.1302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6089F, 0.803F, -0.009F, -0.0629F, 0.0742F, -0.0044F));

		PartDefinition head4_r2 = head1.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(5, 120).addBox(-0.9535F, 0.2283F, -1.4566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.467F, 0.5763F, -0.1806F, -0.3478F, 0.1102F, 0.0009F));

		PartDefinition head4_r3 = head1.addOrReplaceChild("head4_r3", CubeListBuilder.create().texOffs(119, 40).addBox(-0.1166F, -0.8327F, -0.4776F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6089F, 0.803F, -0.009F, -1.8519F, 0.0742F, -0.0044F));

		PartDefinition head5_r2 = head1.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(103, 65).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4973F, 0.5885F, -2.5918F, 0.0F, 0.0F));

		PartDefinition head4_r4 = head1.addOrReplaceChild("head4_r4", CubeListBuilder.create().texOffs(31, 116).mirror().addBox(-0.5F, -1.025F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7188F, -0.1372F, -2.1118F, 0.0F, 0.0F));

		PartDefinition head5_r3 = head1.addOrReplaceChild("head5_r3", CubeListBuilder.create().texOffs(114, 55).mirror().addBox(-0.5F, -0.0034F, -0.0108F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6521F, -1.1106F, -1.501F, 0.0F, 0.0F));

		PartDefinition head7_r3 = head1.addOrReplaceChild("head7_r3", CubeListBuilder.create().texOffs(119, 44).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9081F, 0.2746F, -1.111F, -1.5041F, -0.1102F, -0.0009F));

		PartDefinition head6_r1 = head1.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(120, 11).mirror().addBox(-0.0465F, 0.8284F, -0.4239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.467F, 0.5763F, -0.1806F, -1.4168F, -0.1102F, -0.0009F));

		PartDefinition cube_r112 = head1.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(103, 48).addBox(-0.915F, 0.1863F, -0.3589F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(103, 60).addBox(-1.415F, 0.1863F, -0.1089F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.6641F, 0.0249F, -5.7695F, 0.3278F, 0.3496F, 0.1109F));

		PartDefinition cube_r113 = head1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(66, 81).addBox(0.7068F, -0.0114F, 1.7113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6641F, 0.0249F, -5.7695F, 0.2413F, -0.342F, -0.0768F));

		PartDefinition cube_r114 = head1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(66, 81).mirror().addBox(-1.7068F, -0.0114F, 1.7113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.6641F, 0.0249F, -5.7695F, 0.2413F, 0.342F, 0.0768F));

		PartDefinition cube_r115 = head1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(103, 60).mirror().addBox(0.415F, 0.1863F, -0.1089F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(103, 48).mirror().addBox(-0.085F, 0.1863F, -0.3589F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6641F, 0.0249F, -5.7695F, 0.3278F, -0.3496F, -0.1109F));

		PartDefinition head6_r2 = head1.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(96, 43).mirror().addBox(-1.3F, 0.0F, -0.075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.5318F, -2.0563F, -1.4312F, 0.0F, 0.0F));

		PartDefinition head15_r2 = head1.addOrReplaceChild("head15_r2", CubeListBuilder.create().texOffs(10, 120).mirror().addBox(-1.1166F, -0.0168F, -0.1536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6089F, 0.803F, -0.009F, 2.5082F, -0.0742F, 0.0044F));

		PartDefinition head27_r1 = head1.addOrReplaceChild("head27_r1", CubeListBuilder.create().texOffs(125, 11).mirror().addBox(-0.6125F, -0.4342F, -0.3636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(107, 124).mirror().addBox(-0.4375F, -0.4342F, -0.3636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0483F, 0.2295F, -1.736F, 3.06F, -0.1091F, 0.0F));

		PartDefinition head25_r1 = head1.addOrReplaceChild("head25_r1", CubeListBuilder.create().texOffs(124, 93).mirror().addBox(-0.5125F, -0.2653F, -0.0807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(124, 86).mirror().addBox(-0.5125F, -0.1653F, -0.0807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.0483F, 0.2295F, -1.736F, -2.5687F, -0.1091F, 0.0F));

		PartDefinition head23_r5 = head1.addOrReplaceChild("head23_r5", CubeListBuilder.create().texOffs(124, 83).mirror().addBox(-0.5125F, 0.0959F, -0.4966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0483F, 0.2295F, -1.736F, -2.0451F, -0.1091F, 0.0F));

		PartDefinition head22_r3 = head1.addOrReplaceChild("head22_r3", CubeListBuilder.create().texOffs(124, 63).mirror().addBox(-0.5125F, -0.1857F, -0.907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.0483F, 0.2295F, -1.736F, -1.5215F, -0.1091F, 0.0F));

		PartDefinition head21_r2 = head1.addOrReplaceChild("head21_r2", CubeListBuilder.create().texOffs(68, 126).mirror().addBox(-0.5125F, -0.5373F, -0.8544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.0483F, 0.2295F, -1.736F, -1.8706F, -0.1091F, 0.0F));

		PartDefinition head20_r4 = head1.addOrReplaceChild("head20_r4", CubeListBuilder.create().texOffs(119, 87).mirror().addBox(-0.5125F, -0.5745F, -0.8909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.0483F, 0.2295F, -1.736F, -2.6385F, -0.1091F, 0.0F));

		PartDefinition head19_r2 = head1.addOrReplaceChild("head19_r2", CubeListBuilder.create().texOffs(124, 60).mirror().addBox(-0.5125F, -0.8733F, -0.9757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(119, 84).mirror().addBox(-0.5125F, -0.8733F, -0.7007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0483F, 0.2295F, -1.736F, -3.0312F, -0.1091F, 0.0F));

		PartDefinition head22_r4 = head1.addOrReplaceChild("head22_r4", CubeListBuilder.create().texOffs(125, 29).mirror().addBox(-0.4982F, -0.1889F, -0.3547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(125, 26).mirror().addBox(-0.4982F, -0.5639F, -0.3547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8322F, 0.7936F, -3.1555F, -2.5506F, -0.2007F, -0.0132F));

		PartDefinition head20_r5 = head1.addOrReplaceChild("head20_r5", CubeListBuilder.create().texOffs(125, 23).mirror().addBox(-0.4982F, -0.6996F, -0.4723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(23, 125).mirror().addBox(-0.4982F, -0.6996F, -0.7722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.8322F, 0.7936F, -3.1555F, -2.7688F, -0.2007F, -0.0132F));

		PartDefinition head19_r3 = head1.addOrReplaceChild("head19_r3", CubeListBuilder.create().texOffs(41, 125).mirror().addBox(-0.4987F, -0.335F, -0.3558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(125, 20).mirror().addBox(-0.4987F, -0.335F, -0.5558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8322F, 0.7936F, -3.1555F, 2.772F, -0.2006F, -0.0084F));

		PartDefinition head22_r5 = head1.addOrReplaceChild("head22_r5", CubeListBuilder.create().texOffs(125, 69).mirror().addBox(-0.4845F, -0.2241F, -0.3421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.3276F, 1.0147F, -5.5759F, 1.1577F, -0.2224F, -0.0084F));

		PartDefinition head23_r6 = head1.addOrReplaceChild("head23_r6", CubeListBuilder.create().texOffs(125, 75).mirror().addBox(-0.5345F, -0.8642F, -0.6045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3276F, 1.0147F, -5.5759F, 2.0827F, -0.2224F, -0.0084F));

		PartDefinition head22_r6 = head1.addOrReplaceChild("head22_r6", CubeListBuilder.create().texOffs(125, 72).mirror().addBox(-0.5345F, -0.9626F, -0.3584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false)
				.texOffs(63, 125).mirror().addBox(-0.4845F, -0.518F, -0.4022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.3276F, 1.0147F, -5.5759F, 2.4667F, -0.2224F, -0.0084F));

		PartDefinition head21_r3 = head1.addOrReplaceChild("head21_r3", CubeListBuilder.create().texOffs(125, 66).mirror().addBox(-0.4845F, -0.4738F, -0.6084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.3276F, 1.0147F, -5.5759F, 1.8122F, -0.2224F, -0.0084F));

		PartDefinition head19_r4 = head1.addOrReplaceChild("head19_r4", CubeListBuilder.create().texOffs(120, 14).mirror().addBox(-0.4845F, -0.1192F, -0.3304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3276F, 1.0147F, -5.5759F, 2.0304F, -0.2224F, -0.0084F));

		PartDefinition head17_r2 = head1.addOrReplaceChild("head17_r2", CubeListBuilder.create().texOffs(124, 44).mirror().addBox(-0.5125F, -0.8537F, -0.3901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.0483F, 0.2295F, -1.736F, 2.8157F, -0.1091F, 0.0F));

		PartDefinition head16_r4 = head1.addOrReplaceChild("head16_r4", CubeListBuilder.create().texOffs(124, 32).mirror().addBox(-1.1019F, -1.0134F, -0.5704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.6089F, 0.803F, -0.009F, 2.8156F, -0.0742F, 0.0044F));

		PartDefinition head15_r3 = head1.addOrReplaceChild("head15_r3", CubeListBuilder.create().texOffs(124, 8).mirror().addBox(-1.1019F, -1.0295F, -0.34F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6089F, 0.803F, -0.009F, 2.3792F, -0.0742F, 0.0044F));

		PartDefinition head15_r4 = head1.addOrReplaceChild("head15_r4", CubeListBuilder.create().texOffs(124, 35).mirror().addBox(-1.1019F, -0.0169F, -0.1816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6089F, 0.803F, -0.009F, -3.1186F, -0.0742F, 0.0044F));

		PartDefinition head14_r1 = head1.addOrReplaceChild("head14_r1", CubeListBuilder.create().texOffs(123, 106).mirror().addBox(-1.1019F, -0.7528F, -0.0994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.6089F, 0.803F, -0.009F, 2.7719F, -0.0742F, 0.0044F));

		PartDefinition head12_r2 = head1.addOrReplaceChild("head12_r2", CubeListBuilder.create().texOffs(123, 103).mirror().addBox(-1.1166F, -0.4643F, -0.204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6089F, 0.803F, -0.009F, 2.8136F, -0.0742F, 0.0044F));

		PartDefinition head11_r1 = head1.addOrReplaceChild("head11_r1", CubeListBuilder.create().texOffs(123, 100).mirror().addBox(-1.1166F, 0.194F, -0.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.6089F, 0.803F, -0.009F, 3.1191F, -0.0742F, 0.0044F));

		PartDefinition head3_r2 = head1.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(119, 40).mirror().addBox(-0.8834F, -0.8327F, -0.4776F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6089F, 0.803F, -0.009F, -1.8519F, -0.0742F, 0.0044F));

		PartDefinition head2_r2 = head1.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(95, 112).mirror().addBox(-0.9834F, -0.7265F, -0.1928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.6089F, 0.803F, -0.009F, -1.3283F, -0.0742F, 0.0044F));

		PartDefinition head3_r3 = head1.addOrReplaceChild("head3_r3", CubeListBuilder.create().texOffs(5, 120).mirror().addBox(-0.0465F, 0.2283F, -1.4566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.467F, 0.5763F, -0.1806F, -0.3478F, -0.1102F, -0.0009F));

		PartDefinition head3_r4 = head1.addOrReplaceChild("head3_r4", CubeListBuilder.create().texOffs(124, 38).mirror().addBox(-0.8834F, 0.0348F, -1.1585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(112, 125).mirror().addBox(-0.8834F, -1.1902F, -0.5085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(119, 36).mirror().addBox(-0.8834F, -0.9652F, -0.7585F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6089F, 0.803F, -0.009F, -0.3029F, -0.0742F, 0.0044F));

		PartDefinition head1_r1 = head1.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(118, 119).mirror().addBox(-0.8834F, 0.0482F, -0.1302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6089F, 0.803F, -0.009F, -0.0629F, -0.0742F, 0.0044F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, -0.5F, -3.0F, 0.0456F, 0.0F, 0.0F));

		PartDefinition head7_r4 = head2.addOrReplaceChild("head7_r4", CubeListBuilder.create().texOffs(123, 111).mirror().addBox(0.0F, -0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.7571F, -3.9557F, 1.1694F, 0.0F, 0.0F));

		PartDefinition head8_r2 = head2.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(123, 119).addBox(-0.975F, -0.175F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.6F, 2.5902F, -3.445F, 2.0463F, 0.2081F, 0.0726F));

		PartDefinition head7_r5 = head2.addOrReplaceChild("head7_r5", CubeListBuilder.create().texOffs(123, 119).mirror().addBox(-0.025F, -0.175F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.5902F, -3.445F, 2.0463F, -0.2081F, -0.0726F));

		PartDefinition head6_r3 = head2.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(117, 122).mirror().addBox(0.0F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.8086F, -3.934F, 1.2566F, 0.0F, 0.0F));

		PartDefinition head6_r4 = head2.addOrReplaceChild("head6_r4", CubeListBuilder.create().texOffs(124, 41).mirror().addBox(0.0F, -0.125F, 0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(112, 122).mirror().addBox(0.0F, -0.125F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1764F, -3.6917F, 0.6632F, 0.0F, 0.0F));

		PartDefinition head3_r5 = head2.addOrReplaceChild("head3_r5", CubeListBuilder.create().texOffs(124, 0).mirror().addBox(-0.5F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.3017F, -1.9295F, 0.2531F, 0.0F, 0.0F));

		PartDefinition head2_r3 = head2.addOrReplaceChild("head2_r3", CubeListBuilder.create().texOffs(112, 42).mirror().addBox(-0.5F, 0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.3017F, -1.9295F, 0.1484F, 0.0F, 0.0F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -3.4F, 0.3187F, 0.0F, 0.0F));

		PartDefinition head3 = head1.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -3.4F, 0.1367F, 0.0F, 0.0F));

		PartDefinition head5_r4 = head3.addOrReplaceChild("head5_r4", CubeListBuilder.create().texOffs(120, 17).addBox(-0.9F, -0.025F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(126, 47).addBox(-0.925F, 0.025F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(122, 122).addBox(-1.075F, -0.45F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3628F, 0.0898F, 1.3263F, 0.0672F, 0.1448F, 0.0011F));

		PartDefinition head7_r6 = head3.addOrReplaceChild("head7_r6", CubeListBuilder.create().texOffs(120, 20).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5246F, 0.7403F, -0.4317F, -0.0204F, 0.2321F, -0.0007F));

		PartDefinition head8_r3 = head3.addOrReplaceChild("head8_r3", CubeListBuilder.create().texOffs(101, 125).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4092F, 0.7241F, -1.2232F, -0.0204F, 0.2321F, -0.0007F));

		PartDefinition head9_r1 = head3.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(120, 23).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2939F, 0.6579F, -2.0137F, -0.0202F, 0.1885F, 0.0002F));

		PartDefinition head10_r1 = head3.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(120, 26).addBox(-0.575F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1785F, 0.6418F, -2.8051F, 0.1108F, 0.1448F, 0.0011F));

		PartDefinition head8_r4 = head3.addOrReplaceChild("head8_r4", CubeListBuilder.create().texOffs(96, 125).addBox(-0.5F, -0.425F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(5, 123).addBox(-0.5F, -0.425F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.1629F, -0.2492F, -2.3612F, 0.7584F, 0.2194F, -0.0206F));

		PartDefinition head7_r7 = head3.addOrReplaceChild("head7_r7", CubeListBuilder.create().texOffs(18, 123).addBox(-0.5F, -0.3777F, -0.9016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2092F, 0.1663F, -2.0735F, -0.0337F, 0.2072F, 0.0289F));

		PartDefinition head5_r5 = head3.addOrReplaceChild("head5_r5", CubeListBuilder.create().texOffs(0, 123).addBox(-0.9934F, -1.0042F, 0.0281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.753F, 0.6996F, -1.362F, 0.001F, 0.2301F, 0.0164F));

		PartDefinition head7_r8 = head3.addOrReplaceChild("head7_r8", CubeListBuilder.create().texOffs(125, 89).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.2918F, -0.3853F, -1.1621F, -0.0517F, 0.2508F, 0.0266F));

		PartDefinition head6_r5 = head3.addOrReplaceChild("head6_r5", CubeListBuilder.create().texOffs(10, 123).addBox(-0.5F, -0.5043F, -0.0984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0842F, 0.1663F, -2.0735F, -0.0512F, 0.2072F, 0.0289F));

		PartDefinition head5_r6 = head3.addOrReplaceChild("head5_r6", CubeListBuilder.create().texOffs(36, 126).addBox(-0.9435F, -0.954F, 1.0276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.753F, 0.6996F, -1.362F, 0.0357F, 0.183F, 0.0079F));

		PartDefinition head7_r9 = head3.addOrReplaceChild("head7_r9", CubeListBuilder.create().texOffs(112, 46).addBox(-0.9493F, -0.1868F, -0.1646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8281F, -0.8568F, -0.9357F, 0.1263F, 0.1835F, -0.0026F));

		PartDefinition head8_r5 = head3.addOrReplaceChild("head8_r5", CubeListBuilder.create().texOffs(119, 64).addBox(-0.9493F, -0.1368F, 0.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1524F, -1.1651F, 0.8165F, -0.0121F, 0.0967F, 0.0062F));

		PartDefinition head9_r2 = head3.addOrReplaceChild("head9_r2", CubeListBuilder.create().texOffs(125, 14).addBox(-0.9493F, 0.0132F, 0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, -1.3023F, 1.8136F, -0.143F, 0.0967F, 0.0062F));

		PartDefinition head10_r2 = head3.addOrReplaceChild("head10_r2", CubeListBuilder.create().texOffs(125, 17).addBox(-0.9493F, 0.0132F, 0.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3257F, -1.1878F, 2.6017F, -0.2478F, 0.0967F, 0.0062F));

		PartDefinition head6_r6 = head3.addOrReplaceChild("head6_r6", CubeListBuilder.create().texOffs(18, 123).mirror().addBox(-0.5F, -0.3777F, -0.9016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2092F, 0.1663F, -2.0735F, -0.0337F, -0.2072F, -0.0289F));

		PartDefinition head6_r7 = head3.addOrReplaceChild("head6_r7", CubeListBuilder.create().texOffs(125, 89).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.2918F, -0.3853F, -1.1621F, -0.0517F, -0.2508F, -0.0266F));

		PartDefinition head5_r7 = head3.addOrReplaceChild("head5_r7", CubeListBuilder.create().texOffs(10, 123).mirror().addBox(-0.5F, -0.5043F, -0.0984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.0842F, 0.1663F, -2.0735F, -0.0512F, -0.2072F, -0.0289F));

		PartDefinition head9_r3 = head3.addOrReplaceChild("head9_r3", CubeListBuilder.create().texOffs(125, 17).mirror().addBox(-0.0507F, 0.0132F, 0.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3257F, -1.1878F, 2.6017F, -0.2478F, -0.0967F, -0.0062F));

		PartDefinition head8_r6 = head3.addOrReplaceChild("head8_r6", CubeListBuilder.create().texOffs(125, 14).mirror().addBox(-0.0507F, 0.0132F, 0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -1.3023F, 1.8136F, -0.143F, -0.0967F, -0.0062F));

		PartDefinition head7_r10 = head3.addOrReplaceChild("head7_r10", CubeListBuilder.create().texOffs(119, 64).mirror().addBox(-0.0507F, -0.1368F, 0.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1524F, -1.1651F, 0.8165F, -0.0121F, -0.0967F, -0.0062F));

		PartDefinition head6_r8 = head3.addOrReplaceChild("head6_r8", CubeListBuilder.create().texOffs(112, 46).mirror().addBox(-0.0507F, -0.1868F, -0.1646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8281F, -0.8568F, -0.9357F, 0.1263F, -0.1835F, 0.0026F));

		PartDefinition head7_r11 = head3.addOrReplaceChild("head7_r11", CubeListBuilder.create().texOffs(96, 125).mirror().addBox(-0.5F, -0.425F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(5, 123).mirror().addBox(-0.5F, -0.425F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.1629F, -0.2492F, -2.3612F, 0.7584F, -0.2194F, 0.0206F));

		PartDefinition head4_r5 = head3.addOrReplaceChild("head4_r5", CubeListBuilder.create().texOffs(0, 123).mirror().addBox(-0.0066F, -1.0042F, 0.0281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.753F, 0.6996F, -1.362F, 0.001F, -0.2301F, -0.0164F));

		PartDefinition head4_r6 = head3.addOrReplaceChild("head4_r6", CubeListBuilder.create().texOffs(36, 126).mirror().addBox(-0.0565F, -0.954F, 1.0276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.753F, 0.6996F, -1.362F, 0.0357F, -0.183F, -0.0079F));

		PartDefinition head9_r4 = head3.addOrReplaceChild("head9_r4", CubeListBuilder.create().texOffs(120, 26).mirror().addBox(-0.425F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1785F, 0.6418F, -2.8051F, 0.1108F, -0.1448F, -0.0011F));

		PartDefinition head8_r7 = head3.addOrReplaceChild("head8_r7", CubeListBuilder.create().texOffs(120, 23).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2939F, 0.6579F, -2.0137F, -0.0202F, -0.1885F, -0.0002F));

		PartDefinition head7_r12 = head3.addOrReplaceChild("head7_r12", CubeListBuilder.create().texOffs(101, 125).mirror().addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4092F, 0.7241F, -1.2232F, -0.0204F, -0.2321F, 0.0007F));

		PartDefinition head6_r9 = head3.addOrReplaceChild("head6_r9", CubeListBuilder.create().texOffs(120, 20).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5246F, 0.7403F, -0.4317F, -0.0204F, -0.2321F, 0.0007F));

		PartDefinition head5_r8 = head3.addOrReplaceChild("head5_r8", CubeListBuilder.create().texOffs(126, 47).mirror().addBox(-0.075F, 0.025F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(120, 17).mirror().addBox(-0.1F, -0.025F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(122, 122).mirror().addBox(0.075F, -0.45F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3628F, 0.0898F, 1.3263F, 0.0672F, -0.1448F, -0.0011F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.0911F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0955F, 1.9821F, 1.047F, 0.6547F, 0.0069F, -0.0049F));

		PartDefinition jaw5_r1 = jaw1.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(88, 112).addBox(-0.5F, -0.8F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7743F, -0.1755F, -3.4331F, -0.3011F, 0.1658F, 0.0F));

		PartDefinition jaw7_r1 = jaw1.addOrReplaceChild("jaw7_r1", CubeListBuilder.create().texOffs(122, 125).addBox(-0.5F, -0.3F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(123, 97).addBox(-0.5F, -0.3F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0316F, -0.7295F, -1.9955F, -0.4712F, 0.1658F, 0.0F));

		PartDefinition jaw5_r2 = jaw1.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(64, 119).addBox(-0.75F, -0.9654F, -3.9728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.716F, -0.0539F, 0.5797F, -0.0785F, 0.1658F, 0.0F));

		PartDefinition jaw4_r1 = jaw1.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(81, 112).addBox(-0.8F, -0.7654F, -1.7978F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.3403F, 0.1275F, -1.8683F, -0.2007F, 0.1658F, 0.0F));

		PartDefinition jaw5_r3 = jaw1.addOrReplaceChild("jaw5_r3", CubeListBuilder.create().texOffs(117, 125).addBox(-0.8F, -0.787F, 0.1009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(125, 114).addBox(-0.8F, -0.787F, -0.1991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5617F, 0.528F, -0.5453F, 0.2618F, 0.1658F, 0.0F));

		PartDefinition jaw6_r1 = jaw1.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(54, 113).addBox(-0.475F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5068F, 1.0175F, -0.8554F, -0.264F, 0.1578F, -0.1275F));

		PartDefinition jaw5_r4 = jaw1.addOrReplaceChild("jaw5_r4", CubeListBuilder.create().texOffs(31, 126).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6277F, 1.2067F, 0.078F, -0.0201F, -0.0375F, -0.0659F));

		PartDefinition jaw4_r2 = jaw1.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(66, 113).addBox(-0.8F, -0.7001F, 0.0257F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0455F, 0.2124F, -3.2274F, -0.4944F, 0.309F, -0.212F));

		PartDefinition jaw3_r1 = jaw1.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(112, 64).addBox(-0.8F, -0.787F, -1.8991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5781F, 0.541F, -0.4475F, -0.2356F, 0.1658F, 0.0F));

		PartDefinition jaw5_r5 = jaw1.addOrReplaceChild("jaw5_r5", CubeListBuilder.create().texOffs(113, 119).addBox(-0.8F, -0.5218F, -2.6019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.591F, -0.0539F, -0.3703F, -0.4538F, 0.1658F, 0.0F));

		PartDefinition jaw10_r1 = jaw1.addOrReplaceChild("jaw10_r1", CubeListBuilder.create().texOffs(73, 126).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(56, 126).addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7343F, -1.1505F, -3.6723F, -1.6537F, 0.1658F, 0.0F));

		PartDefinition jaw10_r2 = jaw1.addOrReplaceChild("jaw10_r2", CubeListBuilder.create().texOffs(88, 123).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.5038F, -0.9706F, -5.0496F, -1.7061F, 0.1658F, 0.0F));

		PartDefinition jaw18_r1 = jaw1.addOrReplaceChild("jaw18_r1", CubeListBuilder.create().texOffs(0, 126).addBox(-0.5F, -0.45F, 0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.3004F, -1.0576F, -6.2651F, 0.0044F, 0.1658F, 0.0F));

		PartDefinition jaw17_r1 = jaw1.addOrReplaceChild("jaw17_r1", CubeListBuilder.create().texOffs(5, 126).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2182F, -0.7613F, -6.7565F, 0.2662F, 0.1658F, 0.0F));

		PartDefinition jaw16_r1 = jaw1.addOrReplaceChild("jaw16_r1", CubeListBuilder.create().texOffs(83, 123).addBox(-0.5F, -0.525F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.1556F, -0.7925F, -7.1304F, 0.1091F, 0.1658F, 0.0F));

		PartDefinition jaw20_r1 = jaw1.addOrReplaceChild("jaw20_r1", CubeListBuilder.create().texOffs(123, 80).addBox(-0.8F, 3.2455F, -1.4622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.591F, -0.0539F, -0.3703F, -1.5926F, 0.1658F, 0.0F));

		PartDefinition jaw19_r1 = jaw1.addOrReplaceChild("jaw19_r1", CubeListBuilder.create().texOffs(78, 123).addBox(-0.8F, 4.1573F, -0.9185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.591F, -0.0539F, -0.3703F, -1.7235F, 0.1658F, 0.0F));

		PartDefinition jaw20_r2 = jaw1.addOrReplaceChild("jaw20_r2", CubeListBuilder.create().texOffs(15, 126).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1519F, -1.2576F, -7.1523F, -1.3308F, 0.1658F, 0.0F));

		PartDefinition jaw19_r2 = jaw1.addOrReplaceChild("jaw19_r2", CubeListBuilder.create().texOffs(10, 126).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2837F, -1.35F, -6.3651F, -1.549F, 0.1658F, 0.0F));

		PartDefinition jaw18_r2 = jaw1.addOrReplaceChild("jaw18_r2", CubeListBuilder.create().texOffs(73, 123).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4154F, -1.2977F, -5.5778F, -1.6362F, 0.1658F, 0.0F));

		PartDefinition jaw12_r1 = jaw1.addOrReplaceChild("jaw12_r1", CubeListBuilder.create().texOffs(68, 123).addBox(-0.5F, -0.3F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.152F, -1.263F, -7.1516F, -1.2261F, 0.1658F, 0.0F));

		PartDefinition jaw11_r1 = jaw1.addOrReplaceChild("jaw11_r1", CubeListBuilder.create().texOffs(123, 57).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.216F, -0.9941F, -6.7694F, -1.5315F, 0.1658F, 0.0F));

		PartDefinition jaw10_r3 = jaw1.addOrReplaceChild("jaw10_r3", CubeListBuilder.create().texOffs(52, 123).addBox(-0.5F, -0.525F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3127F, -1.0279F, -6.1915F, -1.5664F, 0.1658F, 0.0F));

		PartDefinition jaw6_r2 = jaw1.addOrReplaceChild("jaw6_r2", CubeListBuilder.create().texOffs(47, 123).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7423F, -0.8707F, -3.6244F, -1.4486F, 0.1658F, 0.0F));

		PartDefinition jaw5_r6 = jaw1.addOrReplaceChild("jaw5_r6", CubeListBuilder.create().texOffs(51, 126).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.829F, -0.9267F, -3.1061F, -1.4137F, 0.1658F, 0.0F));

		PartDefinition jaw4_r3 = jaw1.addOrReplaceChild("jaw4_r3", CubeListBuilder.create().texOffs(36, 123).addBox(-0.8F, -0.2218F, -0.8019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2567F, -1.3756F, -2.3681F, 0.1614F, 0.1658F, 0.0F));

		PartDefinition jaw4_r4 = jaw1.addOrReplaceChild("jaw4_r4", CubeListBuilder.create().texOffs(31, 123).addBox(-0.8F, -0.1574F, -0.8487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4217F, -0.8584F, -1.3822F, -0.6109F, 0.1658F, 0.0F));

		PartDefinition jaw3_r2 = jaw1.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(46, 126).addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1217F, -0.3485F, -1.357F, -0.8727F, 0.1658F, 0.0F));

		PartDefinition jaw2_r1 = jaw1.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(112, 60).addBox(-0.8F, -0.2827F, -1.7906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(1.591F, -0.0539F, -0.3703F, -0.4363F, 0.1658F, 0.0F));

		PartDefinition jaw4_r5 = jaw1.addOrReplaceChild("jaw4_r5", CubeListBuilder.create().texOffs(88, 112).mirror().addBox(-0.5F, -0.8F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5833F, -0.1755F, -3.4331F, -0.3011F, -0.1658F, 0.0F));

		PartDefinition jaw6_r3 = jaw1.addOrReplaceChild("jaw6_r3", CubeListBuilder.create().texOffs(122, 125).mirror().addBox(-0.5F, -0.3F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(123, 97).mirror().addBox(-0.5F, -0.3F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8406F, -0.7295F, -1.9955F, -0.4712F, -0.1658F, 0.0F));

		PartDefinition jaw4_r6 = jaw1.addOrReplaceChild("jaw4_r6", CubeListBuilder.create().texOffs(64, 119).mirror().addBox(-0.25F, -0.9654F, -3.9728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.0539F, 0.5797F, -0.0785F, -0.1658F, 0.0F));

		PartDefinition jaw3_r3 = jaw1.addOrReplaceChild("jaw3_r3", CubeListBuilder.create().texOffs(81, 112).mirror().addBox(-0.2F, -0.7654F, -1.7978F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.1493F, 0.1275F, -1.8683F, -0.2007F, -0.1658F, 0.0F));

		PartDefinition jaw4_r7 = jaw1.addOrReplaceChild("jaw4_r7", CubeListBuilder.create().texOffs(117, 125).mirror().addBox(-0.2F, -0.787F, 0.1009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(125, 114).mirror().addBox(-0.2F, -0.787F, -0.1991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3707F, 0.528F, -0.5453F, 0.2618F, -0.1658F, 0.0F));

		PartDefinition jaw5_r7 = jaw1.addOrReplaceChild("jaw5_r7", CubeListBuilder.create().texOffs(54, 113).mirror().addBox(-0.525F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3157F, 1.0175F, -0.8554F, -0.264F, -0.1578F, 0.1275F));

		PartDefinition jaw4_r8 = jaw1.addOrReplaceChild("jaw4_r8", CubeListBuilder.create().texOffs(31, 126).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4367F, 1.2067F, 0.078F, -0.0201F, 0.0375F, 0.0659F));

		PartDefinition jaw3_r4 = jaw1.addOrReplaceChild("jaw3_r4", CubeListBuilder.create().texOffs(66, 113).mirror().addBox(-0.2F, -0.7001F, 0.0257F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1455F, 0.2124F, -3.2274F, -0.4944F, -0.309F, 0.212F));

		PartDefinition jaw2_r2 = jaw1.addOrReplaceChild("jaw2_r2", CubeListBuilder.create().texOffs(112, 64).mirror().addBox(-0.2F, -0.787F, -1.8991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3871F, 0.541F, -0.4475F, -0.2356F, -0.1658F, 0.0F));

		PartDefinition jaw4_r9 = jaw1.addOrReplaceChild("jaw4_r9", CubeListBuilder.create().texOffs(113, 119).mirror().addBox(-0.2F, -0.5218F, -2.6019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.0539F, -0.3703F, -0.4538F, -0.1658F, 0.0F));

		PartDefinition jaw9_r1 = jaw1.addOrReplaceChild("jaw9_r1", CubeListBuilder.create().texOffs(73, 126).mirror().addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(56, 126).mirror().addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5433F, -1.1505F, -3.6723F, -1.6537F, -0.1658F, 0.0F));

		PartDefinition jaw9_r2 = jaw1.addOrReplaceChild("jaw9_r2", CubeListBuilder.create().texOffs(88, 123).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.3128F, -0.9706F, -5.0496F, -1.7061F, -0.1658F, 0.0F));

		PartDefinition jaw17_r2 = jaw1.addOrReplaceChild("jaw17_r2", CubeListBuilder.create().texOffs(0, 126).mirror().addBox(-0.5F, -0.45F, 0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-0.1094F, -1.0576F, -6.2651F, 0.0044F, -0.1658F, 0.0F));

		PartDefinition jaw16_r2 = jaw1.addOrReplaceChild("jaw16_r2", CubeListBuilder.create().texOffs(5, 126).mirror().addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.0272F, -0.7613F, -6.7565F, 0.2662F, -0.1658F, 0.0F));

		PartDefinition jaw15_r1 = jaw1.addOrReplaceChild("jaw15_r1", CubeListBuilder.create().texOffs(83, 123).mirror().addBox(-0.5F, -0.525F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(0.0354F, -0.7925F, -7.1304F, 0.1091F, -0.1658F, 0.0F));

		PartDefinition jaw19_r3 = jaw1.addOrReplaceChild("jaw19_r3", CubeListBuilder.create().texOffs(123, 80).mirror().addBox(-0.2F, 3.2455F, -1.4622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.0539F, -0.3703F, -1.5926F, -0.1658F, 0.0F));

		PartDefinition jaw18_r3 = jaw1.addOrReplaceChild("jaw18_r3", CubeListBuilder.create().texOffs(78, 123).mirror().addBox(-0.2F, 4.1573F, -0.9185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.0539F, -0.3703F, -1.7235F, -0.1658F, 0.0F));

		PartDefinition jaw19_r4 = jaw1.addOrReplaceChild("jaw19_r4", CubeListBuilder.create().texOffs(15, 126).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0391F, -1.2576F, -7.1523F, -1.3308F, -0.1658F, 0.0F));

		PartDefinition jaw18_r4 = jaw1.addOrReplaceChild("jaw18_r4", CubeListBuilder.create().texOffs(10, 126).mirror().addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0926F, -1.35F, -6.3651F, -1.549F, -0.1658F, 0.0F));

		PartDefinition jaw17_r3 = jaw1.addOrReplaceChild("jaw17_r3", CubeListBuilder.create().texOffs(73, 123).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2244F, -1.2977F, -5.5778F, -1.6362F, -0.1658F, 0.0F));

		PartDefinition jaw11_r2 = jaw1.addOrReplaceChild("jaw11_r2", CubeListBuilder.create().texOffs(68, 123).mirror().addBox(-0.5F, -0.3F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.039F, -1.263F, -7.1516F, -1.2261F, -0.1658F, 0.0F));

		PartDefinition jaw10_r4 = jaw1.addOrReplaceChild("jaw10_r4", CubeListBuilder.create().texOffs(123, 57).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.025F, -0.9941F, -6.7694F, -1.5315F, -0.1658F, 0.0F));

		PartDefinition jaw9_r3 = jaw1.addOrReplaceChild("jaw9_r3", CubeListBuilder.create().texOffs(52, 123).mirror().addBox(-0.5F, -0.525F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1217F, -1.0279F, -6.1915F, -1.5664F, -0.1658F, 0.0F));

		PartDefinition jaw5_r8 = jaw1.addOrReplaceChild("jaw5_r8", CubeListBuilder.create().texOffs(47, 123).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5513F, -0.8707F, -3.6244F, -1.4486F, -0.1658F, 0.0F));

		PartDefinition jaw4_r10 = jaw1.addOrReplaceChild("jaw4_r10", CubeListBuilder.create().texOffs(51, 126).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.638F, -0.9267F, -3.1061F, -1.4137F, -0.1658F, 0.0F));

		PartDefinition jaw3_r5 = jaw1.addOrReplaceChild("jaw3_r5", CubeListBuilder.create().texOffs(36, 123).mirror().addBox(-0.2F, -0.2218F, -0.8019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0657F, -1.3756F, -2.3681F, 0.1614F, -0.1658F, 0.0F));

		PartDefinition jaw3_r6 = jaw1.addOrReplaceChild("jaw3_r6", CubeListBuilder.create().texOffs(31, 123).mirror().addBox(-0.2F, -0.1574F, -0.8487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2307F, -0.8584F, -1.3822F, -0.6109F, -0.1658F, 0.0F));

		PartDefinition jaw2_r3 = jaw1.addOrReplaceChild("jaw2_r3", CubeListBuilder.create().texOffs(46, 126).mirror().addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.9307F, -0.3485F, -1.357F, -0.8727F, -0.1658F, 0.0F));

		PartDefinition jaw1_r1 = jaw1.addOrReplaceChild("jaw1_r1", CubeListBuilder.create().texOffs(112, 60).mirror().addBox(-0.2F, -0.2827F, -1.7906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.0539F, -0.3703F, -0.4363F, -0.1658F, 0.0F));

		PartDefinition upperlegL = basin.addOrReplaceChild("upperlegL", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-1.0F, -0.6F, -0.5679F, 2.0F, 10.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 2.3156F, -0.5763F, -1.1273F, 0.411F, 0.0485F));

		PartDefinition upperleg6_r1 = upperlegL.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(96, 38).mirror().addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 13.0762F, 2.7054F, 1.0036F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperlegL.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-1.5F, -1.8F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 13.0132F, 0.7841F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperlegL.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(101, 15).mirror().addBox(-1.0F, -1.8F, -1.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.2697F, 1.6852F, 0.5236F, 0.0F, 0.0F));

		PartDefinition upperleg5_r3 = upperlegL.addOrReplaceChild("upperleg5_r3", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.5F, 0.0692F, -0.0528F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.2313F, -0.0849F, 0.4538F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperlegL.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(103, 32).mirror().addBox(-0.5F, 0.0442F, -0.0278F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 9.3405F, -0.5506F, 0.2356F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperlegL.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(92, 105).mirror().addBox(-0.5F, -4.7753F, -0.0933F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 7.3247F, 1.5254F, 0.4276F, 0.0F, 0.0F));

		PartDefinition upperleg4_r3 = upperlegL.addOrReplaceChild("upperleg4_r3", CubeListBuilder.create().texOffs(99, 105).mirror().addBox(-0.5F, -0.0247F, -1.9933F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 5.3386F, 2.3163F, -1.5272F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperlegL.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(85, 105).mirror().addBox(-0.5F, -2.1247F, -2.3933F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 7.3247F, 1.5254F, -0.5672F, 0.0F, 0.0F));

		PartDefinition upperleg3_r2 = upperlegL.addOrReplaceChild("upperleg3_r2", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-1.5F, -1.4F, -0.7F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4531F, -0.6839F, 0.5585F, 0.0F, 0.0F));

		PartDefinition lowerlegL = upperlegL.addOrReplaceChild("lowerlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 12.8938F, 2.9177F, 1.6961F, 0.0433F, 0.0054F));

		PartDefinition lowerleg6_r1 = lowerlegL.addOrReplaceChild("lowerleg6_r1", CubeListBuilder.create().texOffs(112, 33).mirror().addBox(0.2F, -0.9F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 2.1618F, 0.2657F, 1.5708F, 0.192F, -1.5708F));

		PartDefinition lowerleg4_r1 = lowerlegL.addOrReplaceChild("lowerleg4_r1", CubeListBuilder.create().texOffs(25, 48).mirror().addBox(0.6F, -4.05F, 0.35F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1F, 5.9355F, -0.2261F, 1.5708F, -1.5097F, -1.5708F));

		PartDefinition lowerleg4_r2 = lowerlegL.addOrReplaceChild("lowerleg4_r2", CubeListBuilder.create().texOffs(90, 85).mirror().addBox(-0.0393F, -0.1527F, -2.85F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.06F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1328F, 0.0977F, -1.5708F, -1.2915F, 1.5708F));

		PartDefinition lowerleg4_r3 = lowerlegL.addOrReplaceChild("lowerleg4_r3", CubeListBuilder.create().texOffs(48, 60).mirror().addBox(0.0071F, -0.045F, -1.85F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.925F, -1.7489F, 1.5708F, -1.1868F, -1.5708F));

		PartDefinition lowerleg3_r1 = lowerlegL.addOrReplaceChild("lowerleg3_r1", CubeListBuilder.create().texOffs(77, 92).mirror().addBox(-1.1F, -13.45F, -2.85F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 13.225F, 0.1511F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition lowerleg4_r4 = lowerlegL.addOrReplaceChild("lowerleg4_r4", CubeListBuilder.create().texOffs(104, 73).mirror().addBox(-0.1F, 0.05F, -1.85F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.1F, 9.2901F, 0.3894F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition lowerleg4_r5 = lowerlegL.addOrReplaceChild("lowerleg4_r5", CubeListBuilder.create().texOffs(103, 43).mirror().addBox(-2.3F, 8.75F, -1.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(0, 92).mirror().addBox(-1.8F, -1.25F, -1.85F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.1F, 2.4255F, 1.2004F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition lowerleg2_r1 = lowerlegL.addOrReplaceChild("lowerleg2_r1", CubeListBuilder.create().texOffs(48, 79).mirror().addBox(-0.9F, -1.25F, -1.85F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.1F, 2.4255F, 1.2004F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition feetL = lowerlegL.addOrReplaceChild("feetL", CubeListBuilder.create().texOffs(66, 85).mirror().addBox(-1.5F, -0.1003F, -1.0004F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 12.9657F, 0.8398F, -0.3737F, 0.0F, 0.0F));

		PartDefinition toes3_r1 = feetL.addOrReplaceChild("toes3_r1", CubeListBuilder.create().texOffs(98, 53).mirror().addBox(-0.2863F, -0.4464F, -0.363F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6615F, 5.4721F, 1.3658F, 2.3654F, 0.3331F, 0.1453F));

		PartDefinition toesL = feetL.addOrReplaceChild("toesL", CubeListBuilder.create().texOffs(58, 39).mirror().addBox(-2.1F, -0.9235F, -3.6059F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 5.8627F, -0.2511F, -0.0604F, 0.0F, 0.0F));

		PartDefinition toesL2 = toesL.addOrReplaceChild("toesL2", CubeListBuilder.create().texOffs(62, 19).mirror().addBox(-2.1F, -0.9235F, -3.6059F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, -0.1215F, 0.0F, 0.0F));

		PartDefinition upperlegL2 = basin.addOrReplaceChild("upperlegL2", CubeListBuilder.create().texOffs(39, 79).mirror().addBox(-1.0F, -0.6F, -0.5679F, 2.0F, 10.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offset(3.4F, 2.3156F, -0.5763F));

		PartDefinition upperleg7_r1 = upperlegL2.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(7, 99).mirror().addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 13.0762F, 2.7054F, 1.0036F, 0.0F, 0.0F));

		PartDefinition upperleg6_r2 = upperlegL2.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(75, 98).mirror().addBox(-1.5F, -1.8F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 13.0132F, 0.7841F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upperleg6_r3 = upperlegL2.addOrReplaceChild("upperleg6_r3", CubeListBuilder.create().texOffs(101, 21).mirror().addBox(-1.0F, -1.8F, -1.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.2697F, 1.6852F, 0.5236F, 0.0F, 0.0F));

		PartDefinition upperleg6_r4 = upperlegL2.addOrReplaceChild("upperleg6_r4", CubeListBuilder.create().texOffs(9, 104).mirror().addBox(-1.5F, 0.0692F, -0.0528F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 11.2313F, -0.0849F, 0.4538F, 0.0F, 0.0F));

		PartDefinition upperleg5_r4 = upperlegL2.addOrReplaceChild("upperleg5_r4", CubeListBuilder.create().texOffs(67, 103).mirror().addBox(-1.5F, 0.0442F, -0.0278F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 9.3405F, -0.5506F, 0.2356F, 0.0F, 0.0F));

		PartDefinition upperleg5_r5 = upperlegL2.addOrReplaceChild("upperleg5_r5", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(-0.5F, -4.7753F, -0.0933F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3F, 7.3247F, 1.5254F, 0.4276F, 0.0F, 0.0F));

		PartDefinition upperleg5_r6 = upperlegL2.addOrReplaceChild("upperleg5_r6", CubeListBuilder.create().texOffs(108, 91).mirror().addBox(-0.5F, -0.0247F, -1.9933F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 5.3386F, 2.3163F, -1.5272F, 0.0F, 0.0F));

		PartDefinition upperleg4_r4 = upperlegL2.addOrReplaceChild("upperleg4_r4", CubeListBuilder.create().texOffs(74, 108).mirror().addBox(-0.5F, -2.1247F, -2.3933F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3F, 7.3247F, 1.5254F, -0.5672F, 0.0F, 0.0F));

		PartDefinition upperleg4_r5 = upperlegL2.addOrReplaceChild("upperleg4_r5", CubeListBuilder.create().texOffs(88, 24).mirror().addBox(-1.5F, -1.4F, -0.7F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4531F, -0.6839F, 0.5585F, 0.0F, 0.0F));

		PartDefinition lowerlegL2 = upperlegL2.addOrReplaceChild("lowerlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 12.8938F, 2.9177F, 1.0851F, 0.0F, 0.0F));

		PartDefinition lowerleg7_r1 = lowerlegL2.addOrReplaceChild("lowerleg7_r1", CubeListBuilder.create().texOffs(17, 113).mirror().addBox(-2.2F, -0.9F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.75F, 2.1618F, 0.2657F, 1.5708F, -0.192F, 1.5708F));

		PartDefinition lowerleg5_r1 = lowerlegL2.addOrReplaceChild("lowerleg5_r1", CubeListBuilder.create().texOffs(29, 93).mirror().addBox(-1.6F, -4.05F, 0.35F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 5.9355F, -0.2261F, 1.5708F, 1.5097F, 1.5708F));

		PartDefinition lowerleg5_r2 = lowerlegL2.addOrReplaceChild("lowerleg5_r2", CubeListBuilder.create().texOffs(91, 69).mirror().addBox(-1.9607F, -0.1527F, -2.85F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.06F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.1328F, 0.0977F, -1.5708F, 1.2915F, -1.5708F));

		PartDefinition lowerleg5_r3 = lowerlegL2.addOrReplaceChild("lowerleg5_r3", CubeListBuilder.create().texOffs(60, 101).mirror().addBox(-1.0071F, -0.045F, -1.85F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.925F, -1.7489F, 1.5708F, 1.1868F, 1.5708F));

		PartDefinition lowerleg4_r6 = lowerlegL2.addOrReplaceChild("lowerleg4_r6", CubeListBuilder.create().texOffs(7, 93).mirror().addBox(-0.9F, -13.45F, -2.85F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4F, 13.225F, 0.1511F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition lowerleg5_r4 = lowerlegL2.addOrReplaceChild("lowerleg5_r4", CubeListBuilder.create().texOffs(104, 99).mirror().addBox(-0.9F, 0.05F, -1.85F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 9.2901F, 0.3894F, -1.5708F, 1.5272F, -1.5708F));

		PartDefinition lowerleg5_r5 = lowerlegL2.addOrReplaceChild("lowerleg5_r5", CubeListBuilder.create().texOffs(76, 103).mirror().addBox(0.3F, 8.75F, -1.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(35, 92).mirror().addBox(0.8F, -1.25F, -1.85F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.4255F, 1.2004F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition lowerleg3_r2 = lowerlegL2.addOrReplaceChild("lowerleg3_r2", CubeListBuilder.create().texOffs(81, 17).mirror().addBox(-0.1F, -1.25F, -1.85F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.4255F, 1.2004F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition feetL2 = lowerlegL2.addOrReplaceChild("feetL2", CubeListBuilder.create().texOffs(55, 90).mirror().addBox(-1.5F, -0.1003F, -1.0004F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 12.9657F, 0.8398F, -0.6086F, 0.0F, 0.0F));

		PartDefinition toes4_r1 = feetL2.addOrReplaceChild("toes4_r1", CubeListBuilder.create().texOffs(18, 99).mirror().addBox(-0.7137F, -0.4464F, -0.363F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6615F, 5.4721F, 1.3658F, 2.3654F, -0.3331F, -0.1453F));

		PartDefinition toesL3 = feetL2.addOrReplaceChild("toesL3", CubeListBuilder.create().texOffs(77, 39).mirror().addBox(-2.9F, -0.9235F, -3.6059F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 5.8627F, -0.2511F, 0.1578F, 0.0F, 0.0F));

		PartDefinition toesL4 = toesL3.addOrReplaceChild("toesL4", CubeListBuilder.create().texOffs(74, 78).mirror().addBox(-2.9F, -0.9235F, -3.6059F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, -0.6014F, 0.0F, 0.0F));

		PartDefinition bone = basin.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-3.4F, -1.3091F, 3.1942F));

		PartDefinition basin_r14 = bone.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(103, 27).mirror().addBox(-0.5019F, 0.9114F, -4.7595F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7163F, -0.4386F, -1.9238F, -0.3316F, 0.0F, -0.0349F));

		PartDefinition basin_r15 = bone.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(120, 29).mirror().addBox(-0.5019F, -1.7827F, -3.1541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(107, 11).mirror().addBox(-0.5019F, -2.6827F, -4.1541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.7163F, -0.4386F, -1.9238F, 0.4102F, 0.0F, -0.0349F));

		PartDefinition basin_r16 = bone.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(121, 54).mirror().addBox(-0.5019F, 2.4192F, -1.0738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.7163F, -0.4386F, -1.9238F, -1.2043F, 0.0F, -0.0349F));

		PartDefinition basin_r17 = bone.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(94, 31).mirror().addBox(-0.5019F, 0.0079F, 0.0182F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.6599F, -2.0551F, -4.9609F, 0.1134F, 0.0F, -0.0349F));

		PartDefinition basin_r18 = bone.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(119, 32).mirror().addBox(-0.5019F, -2.7738F, 1.9405F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.7163F, -0.4386F, -1.9238F, -0.4189F, 0.0F, -0.0349F));

		PartDefinition basin_r19 = bone.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(26, 112).mirror().addBox(-0.5F, -1.65F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7074F, -0.642F, 0.734F, -1.3352F, 0.0F, -0.0349F));

		PartDefinition basin_r20 = bone.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(120, 116).mirror().addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6951F, -0.9917F, 1.7455F, -0.9861F, 0.0F, -0.0349F));

		PartDefinition basin_r21 = bone.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(86, 99).mirror().addBox(-0.5019F, -1.945F, -0.2268F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7163F, -0.4386F, -1.9238F, -0.0698F, 0.0F, -0.0349F));

		PartDefinition basin_r22 = bone.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(94, 46).mirror().addBox(-0.4996F, -4.9324F, -1.3294F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.917F, 3.4498F, -3.4121F, -0.5672F, 0.0F, -0.0611F));

		PartDefinition basin_r23 = bone.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(26, 122).mirror().addBox(0.03F, 7.5001F, -3.7871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(63, 122).mirror().addBox(0.03F, 8.0001F, -3.7871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0138F)).mirror(false), PartPose.offsetAndRotation(0.6539F, 6.1888F, -7.324F, -0.01F, -0.1219F, -0.1663F));

		PartDefinition basin_r24 = bone.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(122, 5).mirror().addBox(0.03F, 8.6326F, 0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0134F)).mirror(false)
				.texOffs(107, 121).mirror().addBox(0.03F, 8.1326F, 0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(112, 27).mirror().addBox(0.03F, 4.2326F, 0.3766F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0139F)).mirror(false)
				.texOffs(115, 11).mirror().addBox(0.03F, 1.2326F, 0.3766F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0134F)).mirror(false), PartPose.offsetAndRotation(0.6539F, 6.1888F, -7.324F, -0.5336F, -0.1219F, -0.1663F));

		PartDefinition basin_r25 = bone.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(10, 115).mirror().addBox(0.03F, 1.2871F, 0.1906F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.6539F, 6.1888F, -7.324F, -0.4899F, -0.1219F, -0.1663F));

		PartDefinition basin_r26 = bone.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(36, 119).mirror().addBox(0.03F, -0.4251F, -0.251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6539F, 6.1888F, -7.324F, -0.1845F, -0.1219F, -0.1663F));

		PartDefinition basin_r27 = bone.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(57, 69).mirror().addBox(-0.4996F, -0.1033F, -4.4652F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(0.917F, 3.4498F, -3.4121F, 0.2182F, 0.0F, -0.0611F));

		PartDefinition basin_r28 = bone.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(92, 61).mirror().addBox(-0.4996F, 0.7825F, -3.4918F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.917F, 3.4498F, -3.4121F, -0.48F, 0.0F, -0.0611F));

		PartDefinition basin_r29 = bone.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(115, 21).mirror().addBox(0.0993F, -0.5088F, -1.4418F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.673F, 6.0015F, 0.1425F, 1.1617F, 0.2613F, -0.133F));

		PartDefinition basin_r30 = bone.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(96, 122).mirror().addBox(0.0752F, 5.5231F, -1.1544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.673F, 6.0015F, 0.1425F, 1.1618F, 0.2771F, -0.1312F));

		PartDefinition basin_r31 = bone.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(31, 112).mirror().addBox(0.0752F, 5.3191F, -0.012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.673F, 6.0015F, 0.1425F, 0.6818F, 0.2771F, -0.1312F));

		PartDefinition basin_r32 = bone.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(115, 112).mirror().addBox(0.0752F, 2.7416F, -0.2877F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.673F, 6.0015F, 0.1425F, 0.7429F, 0.2771F, -0.1312F));

		PartDefinition basin_r33 = bone.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(115, 90).mirror().addBox(0.0752F, 2.6413F, -1.0865F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.673F, 6.0015F, 0.1425F, 1.0745F, 0.2771F, -0.1312F));

		PartDefinition basin_r34 = bone.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(115, 16).mirror().addBox(0.0993F, -0.1818F, -0.3902F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.673F, 6.0015F, 0.1425F, 0.8127F, 0.2613F, -0.133F));

		PartDefinition basin_r35 = bone.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(95, 99).mirror().addBox(-0.4996F, -0.9438F, -3.0388F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.0263F, 5.2369F, 0.4997F, 0.6981F, 0.0F, -0.0611F));

		PartDefinition basin_r36 = bone.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(66, 94).mirror().addBox(-0.4996F, 0.0562F, -3.0388F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.9083F, 3.3087F, -0.018F, 0.2618F, 0.0F, -0.0611F));

		PartDefinition basin_r37 = bone.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(99, 93).mirror().addBox(-0.4996F, 0.3562F, -0.5388F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.917F, 3.4498F, -3.4121F, 0.7854F, 0.0F, -0.0611F));

		PartDefinition basin_r38 = bone.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(55, 81).mirror().addBox(-0.4587F, -2.3899F, -3.2221F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.917F, 3.4498F, -3.4121F, -0.7209F, 0.0237F, -0.0255F));

		PartDefinition bone3 = basin.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.8F, -1.3091F, 3.1942F));

		PartDefinition basin_r39 = bone3.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(103, 27).addBox(-0.4981F, 0.9114F, -4.7595F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7163F, -0.4386F, -1.9238F, -0.3316F, 0.0F, 0.0349F));

		PartDefinition basin_r40 = bone3.addOrReplaceChild("basin_r40", CubeListBuilder.create().texOffs(120, 29).addBox(-0.4981F, -1.7827F, -3.1541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(107, 11).addBox(-0.4981F, -2.6827F, -4.1541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.7163F, -0.4386F, -1.9238F, 0.4102F, 0.0F, 0.0349F));

		PartDefinition basin_r41 = bone3.addOrReplaceChild("basin_r41", CubeListBuilder.create().texOffs(121, 54).addBox(-0.4981F, 2.4192F, -1.0738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7163F, -0.4386F, -1.9238F, -1.2043F, 0.0F, 0.0349F));

		PartDefinition basin_r42 = bone3.addOrReplaceChild("basin_r42", CubeListBuilder.create().texOffs(94, 31).addBox(-0.4981F, 0.0079F, 0.0182F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6599F, -2.0551F, -4.9609F, 0.1134F, 0.0F, 0.0349F));

		PartDefinition basin_r43 = bone3.addOrReplaceChild("basin_r43", CubeListBuilder.create().texOffs(119, 32).addBox(-0.4981F, -2.7738F, 1.9405F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7163F, -0.4386F, -1.9238F, -0.4189F, 0.0F, 0.0349F));

		PartDefinition basin_r44 = bone3.addOrReplaceChild("basin_r44", CubeListBuilder.create().texOffs(26, 112).addBox(-0.5F, -1.65F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7074F, -0.642F, 0.734F, -1.3352F, 0.0F, 0.0349F));

		PartDefinition basin_r45 = bone3.addOrReplaceChild("basin_r45", CubeListBuilder.create().texOffs(120, 116).addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6951F, -0.9917F, 1.7455F, -0.9861F, 0.0F, 0.0349F));

		PartDefinition basin_r46 = bone3.addOrReplaceChild("basin_r46", CubeListBuilder.create().texOffs(86, 99).addBox(-0.4981F, -1.945F, -0.2268F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7163F, -0.4386F, -1.9238F, -0.0698F, 0.0F, 0.0349F));

		PartDefinition basin_r47 = bone3.addOrReplaceChild("basin_r47", CubeListBuilder.create().texOffs(94, 46).addBox(-0.5005F, -4.9324F, -1.3294F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.917F, 3.4498F, -3.4121F, -0.5672F, 0.0F, 0.0611F));

		PartDefinition basin_r48 = bone3.addOrReplaceChild("basin_r48", CubeListBuilder.create().texOffs(26, 122).addBox(-1.03F, 7.5001F, -3.7871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F))
				.texOffs(63, 122).addBox(-1.03F, 8.0001F, -3.7871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0138F)), PartPose.offsetAndRotation(-0.6539F, 6.1888F, -7.324F, -0.01F, 0.1219F, 0.1663F));

		PartDefinition basin_r49 = bone3.addOrReplaceChild("basin_r49", CubeListBuilder.create().texOffs(122, 5).addBox(-1.03F, 8.6326F, 0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0134F))
				.texOffs(107, 121).addBox(-1.03F, 8.1326F, 0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(112, 27).addBox(-1.03F, 4.2326F, 0.3766F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0139F))
				.texOffs(115, 11).addBox(-1.03F, 1.2326F, 0.3766F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0134F)), PartPose.offsetAndRotation(-0.6539F, 6.1888F, -7.324F, -0.5336F, 0.1219F, 0.1663F));

		PartDefinition basin_r50 = bone3.addOrReplaceChild("basin_r50", CubeListBuilder.create().texOffs(10, 115).addBox(-1.03F, 1.2871F, 0.1906F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.6539F, 6.1888F, -7.324F, -0.4899F, 0.1219F, 0.1663F));

		PartDefinition basin_r51 = bone3.addOrReplaceChild("basin_r51", CubeListBuilder.create().texOffs(36, 119).addBox(-1.03F, -0.4251F, -0.251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6539F, 6.1888F, -7.324F, -0.1845F, 0.1219F, 0.1663F));

		PartDefinition basin_r52 = bone3.addOrReplaceChild("basin_r52", CubeListBuilder.create().texOffs(57, 69).addBox(-0.5005F, -0.1033F, -4.4652F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-0.917F, 3.4498F, -3.4121F, 0.2182F, 0.0F, 0.0611F));

		PartDefinition basin_r53 = bone3.addOrReplaceChild("basin_r53", CubeListBuilder.create().texOffs(92, 61).addBox(-0.5005F, 0.7825F, -3.4918F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.917F, 3.4498F, -3.4121F, -0.48F, 0.0F, 0.0611F));

		PartDefinition basin_r54 = bone3.addOrReplaceChild("basin_r54", CubeListBuilder.create().texOffs(115, 21).addBox(-1.0993F, -0.5088F, -1.4418F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.673F, 6.0015F, 0.1425F, 1.1617F, -0.2613F, 0.133F));

		PartDefinition basin_r55 = bone3.addOrReplaceChild("basin_r55", CubeListBuilder.create().texOffs(96, 122).addBox(-1.0752F, 5.5231F, -1.1544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.673F, 6.0015F, 0.1425F, 1.1618F, -0.2771F, 0.1312F));

		PartDefinition basin_r56 = bone3.addOrReplaceChild("basin_r56", CubeListBuilder.create().texOffs(31, 112).addBox(-1.0752F, 5.3191F, -0.012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.673F, 6.0015F, 0.1425F, 0.6818F, -0.2771F, 0.1312F));

		PartDefinition basin_r57 = bone3.addOrReplaceChild("basin_r57", CubeListBuilder.create().texOffs(115, 112).addBox(-1.0752F, 2.7416F, -0.2877F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.673F, 6.0015F, 0.1425F, 0.7429F, -0.2771F, 0.1312F));

		PartDefinition basin_r58 = bone3.addOrReplaceChild("basin_r58", CubeListBuilder.create().texOffs(115, 90).addBox(-1.0752F, 2.6413F, -1.0865F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.673F, 6.0015F, 0.1425F, 1.0745F, -0.2771F, 0.1312F));

		PartDefinition basin_r59 = bone3.addOrReplaceChild("basin_r59", CubeListBuilder.create().texOffs(115, 16).addBox(-1.0993F, -0.1818F, -0.3902F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.673F, 6.0015F, 0.1425F, 0.8127F, -0.2613F, 0.133F));

		PartDefinition basin_r60 = bone3.addOrReplaceChild("basin_r60", CubeListBuilder.create().texOffs(95, 99).addBox(-0.5004F, -0.9438F, -3.0388F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.0263F, 5.2369F, 0.4997F, 0.6981F, 0.0F, 0.0611F));

		PartDefinition basin_r61 = bone3.addOrReplaceChild("basin_r61", CubeListBuilder.create().texOffs(66, 94).addBox(-0.5004F, 0.0562F, -3.0388F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.9083F, 3.3087F, -0.018F, 0.2618F, 0.0F, 0.0611F));

		PartDefinition basin_r62 = bone3.addOrReplaceChild("basin_r62", CubeListBuilder.create().texOffs(99, 93).addBox(-0.5005F, 0.3562F, -0.5388F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.917F, 3.4498F, -3.4121F, 0.7854F, 0.0F, 0.0611F));

		PartDefinition basin_r63 = bone3.addOrReplaceChild("basin_r63", CubeListBuilder.create().texOffs(55, 81).addBox(-0.5413F, -2.3899F, -3.2221F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.917F, 3.4498F, -3.4121F, -0.7209F, -0.0237F, 0.0255F));

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