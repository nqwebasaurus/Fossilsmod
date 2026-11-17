package fossils.fossils.client.blockentity.model.lufengosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LufengosaurusFossilModel extends SkullModelBase {
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

	public LufengosaurusFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-0.2F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create().texOffs(58, 27).addBox(-1.3F, -2.0159F, -3.7669F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.002F))
				.texOffs(0, 61).addBox(0.4F, -1.0159F, -3.7669F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 61).mirror().addBox(-3.0F, -1.0159F, -3.7669F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 106).addBox(-0.3F, -5.2159F, -3.7669F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -6.6007F, -0.6205F, -0.1328F, 0.0F, 0.0F));

		PartDefinition basin_r1 = basin.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(41, 105).addBox(-0.2F, -4.25F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1F, -1.5743F, 2.2074F, -0.0436F, 0.0F, 0.0F));

		PartDefinition basin_r2 = basin.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(18, 106).addBox(-0.2F, -3.65F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1F, -1.9659F, -0.7669F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.4F, -0.6802F, -0.0556F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.3451F, 5.2377F, 0.0922F, 0.0872F, 0.0042F));

		PartDefinition tail8_r1 = tail1.addOrReplaceChild("tail8_r1", CubeListBuilder.create().texOffs(74, 123).addBox(-0.5F, -2.9F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.6802F, 13.0444F, -0.48F, 0.0F, 0.0F));

		PartDefinition tail7_r1 = tail1.addOrReplaceChild("tail7_r1", CubeListBuilder.create().texOffs(65, 119).addBox(-0.5F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.6802F, 10.9444F, -0.5236F, 0.0F, 0.0F));

		PartDefinition tail6_r1 = tail1.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(53, 118).addBox(-0.5F, -3.5F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.6802F, 8.9444F, -0.48F, 0.0F, 0.0F));

		PartDefinition tail5_r1 = tail1.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(32, 118).addBox(-0.5F, -3.6F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.6802F, 6.9444F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail4_r1 = tail1.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(105, 117).addBox(-0.5F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.6802F, 4.9444F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail3_r1 = tail1.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(21, 61).addBox(-0.5F, -4.3F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.6802F, 2.9444F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(83, 104).addBox(-0.5F, -4.3F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.6802F, -0.0556F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail4_r2 = tail1.addOrReplaceChild("tail4_r2", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-2.0F, 0.3F, -0.1F, 2.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0198F, 0.0444F, 0.0F, 0.0436F, 0.0F));

		PartDefinition tail3_r2 = tail1.addOrReplaceChild("tail3_r2", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, 0.3F, -0.1F, 2.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0198F, 0.0444F, 0.0F, -0.0436F, 0.0F));

		PartDefinition basin_r3 = tail1.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(30, 106).addBox(-0.5F, 0.0966F, -0.066F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.1758F, 11.3946F, 0.3752F, 0.0F, 0.0F));

		PartDefinition basin_r4 = tail1.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(71, 105).addBox(-0.5F, -0.5152F, -0.6165F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.1758F, 9.6946F, 0.4189F, 0.0F, 0.0F));

		PartDefinition basin_r5 = tail1.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(68, 105).addBox(-0.5F, -0.2152F, -0.9165F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.1792F, 7.6698F, 0.4014F, 0.0F, 0.0F));

		PartDefinition basin_r6 = tail1.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(65, 105).addBox(-0.5F, 0.0848F, -0.6165F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.2556F, 4.8107F, 0.4451F, 0.0F, 0.0F));

		PartDefinition basin_r7 = tail1.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(31, 82).addBox(-0.5F, 0.3848F, -0.2165F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.7832F, 1.8575F, 0.5149F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(31, 46).addBox(-1.4F, -0.8705F, -0.0307F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1646F, 13.9583F, -0.0025F, 0.0872F, -0.004F));

		PartDefinition tail7_r2 = tail2.addOrReplaceChild("tail7_r2", CubeListBuilder.create().texOffs(71, 123).addBox(-0.5F, -2.7F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.4F, -0.8705F, 8.8693F, -0.5236F, 0.0F, 0.0F));

		PartDefinition tail6_r2 = tail2.addOrReplaceChild("tail6_r2", CubeListBuilder.create().texOffs(68, 123).addBox(-0.5F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.4F, -0.8705F, 6.9693F, -0.5236F, 0.0F, 0.0F));

		PartDefinition tail5_r2 = tail2.addOrReplaceChild("tail5_r2", CubeListBuilder.create().texOffs(61, 123).addBox(-0.5F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.4F, -0.8705F, 4.9693F, -0.5236F, 0.0F, 0.0F));

		PartDefinition tail4_r3 = tail2.addOrReplaceChild("tail4_r3", CubeListBuilder.create().texOffs(15, 123).addBox(-0.5F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.4F, -0.8705F, 2.9693F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail3_r3 = tail2.addOrReplaceChild("tail3_r3", CubeListBuilder.create().texOffs(0, 123).addBox(-0.5F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.4F, -0.8705F, 0.9693F, -0.4363F, 0.0F, 0.0F));

		PartDefinition basin_r8 = tail2.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(62, 116).addBox(0.0F, -0.9F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.5019F, 9.3615F, 0.4625F, 0.0F, 0.0F));

		PartDefinition basin_r9 = tail2.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(108, 115).addBox(0.0F, -1.0F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.9501F, 7.2904F, 0.3752F, 0.0F, 0.0F));

		PartDefinition basin_r10 = tail2.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(115, 93).addBox(0.0F, -0.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.8866F, 4.9059F, 0.4189F, 0.0F, 0.0F));

		PartDefinition basin_r11 = tail2.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(62, 108).addBox(0.0F, -1.1F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.9937F, 2.6259F, 0.4189F, 0.0F, 0.0F));

		PartDefinition basin_r12 = tail2.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(33, 106).addBox(0.0F, -1.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 1.2713F, 0.4503F, 0.4189F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3988F, 10.9385F, -0.113F, -0.1293F, 0.0204F));

		PartDefinition tail4_r4 = tail3.addOrReplaceChild("tail4_r4", CubeListBuilder.create().texOffs(0, 32).addBox(-1.1F, -0.2F, -0.5F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.005F))
				.texOffs(31, 0).addBox(-1.1F, -0.5F, -0.5F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.0113F, 0.4334F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail10_r1 = tail3.addOrReplaceChild("tail10_r1", CubeListBuilder.create().texOffs(127, 129).addBox(-0.5F, -1.4697F, -0.0312F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.3221F, 11.8995F, -0.2356F, 0.0F, 0.0F));

		PartDefinition tail9_r1 = tail3.addOrReplaceChild("tail9_r1", CubeListBuilder.create().texOffs(124, 129).addBox(-0.5F, -1.7697F, -0.0312F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.1826F, 9.9043F, -0.2793F, 0.0F, 0.0F));

		PartDefinition tail8_r2 = tail3.addOrReplaceChild("tail8_r2", CubeListBuilder.create().texOffs(122, 121).addBox(-0.5F, -2.0697F, -0.0312F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.0431F, 7.9092F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail7_r3 = tail3.addOrReplaceChild("tail7_r3", CubeListBuilder.create().texOffs(122, 116).addBox(-0.5F, -2.2627F, 0.0685F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.9036F, 5.8141F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail6_r3 = tail3.addOrReplaceChild("tail6_r3", CubeListBuilder.create().texOffs(114, 122).addBox(-0.5F, -2.4697F, -0.0312F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.764F, 3.919F, -0.4102F, 0.0F, 0.0F));

		PartDefinition tail5_r3 = tail3.addOrReplaceChild("tail5_r3", CubeListBuilder.create().texOffs(45, 120).addBox(-0.5F, -2.5697F, -0.0312F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.6245F, 1.9238F, -0.4538F, 0.0F, 0.0F));

		PartDefinition tail4_r5 = tail3.addOrReplaceChild("tail4_r5", CubeListBuilder.create().texOffs(111, 122).addBox(-0.6F, -2.5594F, 0.0637F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.4887F, -0.1667F, -0.4538F, 0.0F, 0.0F));

		PartDefinition basin_r13 = tail3.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(64, 125).addBox(0.0F, -0.1F, -0.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -0.6412F, 13.0238F, 0.637F, 0.0F, 0.0F));

		PartDefinition basin_r14 = tail3.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(126, 82).addBox(0.0F, 0.3F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -0.4567F, 10.2496F, 0.6807F, 0.0F, 0.0F));

		PartDefinition basin_r15 = tail3.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(100, 122).addBox(0.0F, 3.9F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 88).addBox(0.0F, 1.5F, 3.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 115).addBox(0.0F, -0.4F, 1.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 115).addBox(0.0F, -1.6F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 1.3904F, 1.0687F, 0.7243F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, -0.8897F, 13.8652F, -0.0943F, -0.1303F, 0.0123F));

		PartDefinition tail10_r2 = tail4.addOrReplaceChild("tail10_r2", CubeListBuilder.create().texOffs(130, 58).addBox(-0.5F, -0.5425F, -0.0219F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.2F, -0.815F, 9.9881F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail9_r2 = tail4.addOrReplaceChild("tail9_r2", CubeListBuilder.create().texOffs(130, 55).addBox(-0.5F, -0.7692F, 0.0768F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.2F, -0.815F, 7.8881F, -0.1833F, 0.0F, 0.0F));

		PartDefinition tail8_r3 = tail4.addOrReplaceChild("tail8_r3", CubeListBuilder.create().texOffs(40, 130).addBox(-0.5F, -0.9029F, -0.0209F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.2F, -0.715F, 5.9881F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail7_r4 = tail4.addOrReplaceChild("tail7_r4", CubeListBuilder.create().texOffs(129, 111).addBox(-0.5F, -1.033F, -0.0186F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.2F, -0.6151F, 3.9881F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail6_r4 = tail4.addOrReplaceChild("tail6_r4", CubeListBuilder.create().texOffs(121, 129).addBox(-0.5F, -1.1632F, -0.0198F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.2F, -0.6151F, 1.9881F, -0.096F, 0.0F, 0.0F));

		PartDefinition tail5_r4 = tail4.addOrReplaceChild("tail5_r4", CubeListBuilder.create().texOffs(105, 129).addBox(-0.5F, -1.2933F, -0.0176F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.2F, -0.5151F, -0.0119F, -0.1396F, 0.0F, 0.0F));

		PartDefinition basin_r16 = tail4.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(102, 129).addBox(0.0F, 6.6F, 9.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 128).addBox(0.0F, 5.6F, 7.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 127).addBox(0.0F, 4.2F, 5.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 101).addBox(0.0F, 3.1F, 3.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 122).addBox(0.0F, 0.9F, 1.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.2484F, -0.8415F, 0.637F, 0.0F, 0.0F));

		PartDefinition tail4_r6 = tail4.addOrReplaceChild("tail4_r6", CubeListBuilder.create().texOffs(31, 32).addBox(-1.0F, -0.5F, -0.2F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.2F, -0.0151F, 0.1881F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4258F, 11.8343F, -0.0067F, -0.1309F, 0.0009F));

		PartDefinition cube_r1 = tail5.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(130, 90).addBox(-0.3F, -0.6906F, 0.0037F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0076F, 6.0142F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r2 = tail5.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(88, 130).addBox(-0.3F, -0.7604F, 0.0024F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0076F, 4.0142F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r3 = tail5.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(85, 130).addBox(-0.3F, -0.8302F, 0.0012F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0076F, 2.0142F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r4 = tail5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(82, 130).addBox(-0.3F, -0.5002F, 0.014F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3924F, 0.0142F, -0.1658F, 0.0F, 0.0F));

		PartDefinition basin_r17 = tail5.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(108, 130).addBox(0.0F, 4.9F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 67).addBox(0.0F, 4.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 64).addBox(0.0F, 2.9F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 130).addBox(0.0F, 1.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 61).addBox(0.0F, 1.1F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.3929F, 1.7114F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r5 = tail5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 48).addBox(-0.8F, -0.5F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0076F, 0.0142F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tail6 = tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5201F, 10.9149F, -0.044F, -0.0872F, 0.0038F));

		PartDefinition cube_r6 = Tail6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 10).addBox(-0.8F, -0.6F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.004F, 0.0489F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3034F, 7.9273F, 0.1116F, 0.2169F, 0.0241F));

		PartDefinition cube_r7 = Tail7.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(57, 77).addBox(-0.8F, -0.6F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.004F, 0.0489F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3203F, -3.4659F, 0.0194F, -0.0436F, -0.0008F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(23, 111).addBox(-0.4F, -4.8873F, -3.0987F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(67, 67).addBox(-1.4F, -1.8873F, -7.0987F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.1891F, -0.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(17, 113).addBox(-0.4F, -3.1989F, -1.5769F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.7109F, -4.6F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(56, 58).addBox(-3.9F, -2.4385F, 0.5227F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 14.4891F, -8.2F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(111, 26).mirror().addBox(-6.64F, -3.7431F, -0.5392F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0366F, -5.189F, 0.0378F, 0.2876F, -1.5866F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(112, 28).mirror().addBox(-5.0377F, -1.4136F, -0.5392F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0366F, -5.189F, 0.1789F, 0.2295F, -1.0478F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(112, 30).mirror().addBox(-2.4756F, -0.1539F, -0.4871F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0366F, -5.189F, 0.3073F, 0.087F, -0.5149F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(116, 19).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.1366F, -2.189F, 0.0803F, -0.0011F, -0.6194F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(108, 113).mirror().addBox(-4.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.1366F, -2.189F, 0.028F, 0.0375F, -1.1627F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(108, 113).addBox(1.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1366F, -2.189F, 0.028F, -0.0375F, 1.1627F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(116, 19).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1366F, -2.189F, 0.0803F, 0.0011F, 0.6194F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(112, 30).addBox(-0.5245F, -0.1539F, -0.4871F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.0366F, -5.189F, 0.3073F, -0.087F, 0.5149F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(112, 28).addBox(2.0377F, -1.4136F, -0.5392F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.0366F, -5.189F, 0.1789F, -0.2295F, 1.0478F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(111, 26).addBox(3.64F, -3.7431F, -0.5392F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.0366F, -5.189F, 0.0378F, -0.2876F, 1.5866F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.6109F, -6.9F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition body_r4 = body2.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(5, 112).addBox(-0.4F, -3.4809F, 0.0976F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.4157F, -2.0999F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body_r5 = body2.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(12, 107).addBox(-0.4F, -3.2F, 4.7F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.002F))
				.texOffs(56, 46).addBox(-1.4F, -0.6F, 0.7F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.7157F, -9.6999F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(77, 39).mirror().addBox(-12.7341F, -4.2342F, -0.5409F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1632F, -6.8889F, 0.0998F, 0.3943F, -1.4768F));

		PartDefinition cube_r19 = body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(112, 32).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1632F, -6.8889F, 0.2876F, 0.2908F, -0.9308F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(112, 45).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1632F, -6.8889F, 0.4293F, 0.0874F, -0.4153F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(112, 47).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9632F, -3.8889F, 0.3986F, 0.0718F, -0.4706F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(112, 49).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9632F, -3.8889F, 0.268F, 0.2621F, -0.989F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(81, 28).mirror().addBox(-10.7341F, -4.2342F, -0.5409F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9632F, -3.8889F, 0.0984F, 0.36F, -1.5302F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(112, 51).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.6632F, -0.9889F, 0.3511F, 0.0729F, -0.4766F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(53, 112).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.6632F, -0.9889F, 0.225F, 0.2394F, -1.0023F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(98, 27).mirror().addBox(-8.7341F, -4.2342F, -0.5409F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.6632F, -0.9889F, 0.0729F, 0.3191F, -1.5413F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(98, 27).addBox(3.7341F, -4.2342F, -0.5409F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.6632F, -0.9889F, 0.0729F, -0.3191F, 1.5413F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(53, 112).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.6632F, -0.9889F, 0.225F, -0.2394F, 1.0023F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(112, 51).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.6632F, -0.9889F, 0.3511F, -0.0729F, 0.4766F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(81, 28).addBox(3.7341F, -4.2342F, -0.5409F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9632F, -3.8889F, 0.0984F, -0.36F, 1.5302F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(112, 49).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9632F, -3.8889F, 0.268F, -0.2621F, 0.989F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(112, 47).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9632F, -3.8889F, 0.3986F, -0.0718F, 0.4706F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(112, 45).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.1632F, -6.8889F, 0.4293F, -0.0874F, 0.4153F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(112, 32).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.1632F, -6.8889F, 0.2876F, -0.2908F, 0.9308F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(77, 39).addBox(3.7341F, -4.2342F, -0.5409F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.1632F, -6.8889F, 0.0998F, -0.3943F, 1.4768F));

		PartDefinition body_r6 = body2.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(103, 111).addBox(-0.4F, -2.42F, -0.0377F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1157F, -7.9999F, 0.1134F, 0.0F, 0.0F));

		PartDefinition body_r7 = body2.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(33, 16).addBox(-3.9F, -1.9907F, 0.1651F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 15.3157F, -7.9999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.5579F, -9.0197F, 0.0851F, 0.0435F, 0.0037F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(0, 113).addBox(-0.4F, -2.6352F, 0.0064F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.0153F, -1.7401F, 0.0436F, 0.0F, 0.0F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(81, 112).addBox(-0.4F, -2.3992F, 7.7442F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(48, 67).addBox(-1.4F, -0.1992F, 5.7442F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1F, 0.8847F, -12.4401F, 0.0873F, 0.0F, 0.0F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(130, 24).addBox(-0.4F, -1.6983F, 0.0135F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.2847F, -6.7401F, 0.0436F, 0.0F, 0.0F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(25, 60).addBox(-3.4F, -1.7587F, 2.0208F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 12.9847F, -6.6401F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(112, 53).mirror().addBox(-2.9511F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8054F, -0.6692F, 0.4059F, 0.1002F, -0.4195F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(112, 55).mirror().addBox(-5.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8054F, -0.6692F, 0.2598F, 0.2903F, -0.9408F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(33, 27).mirror().addBox(-13.7341F, -4.2342F, -0.5409F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8054F, -0.6692F, 0.0755F, 0.3801F, -1.488F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(112, 57).mirror().addBox(-2.5707F, -0.1847F, -0.4845F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.0054F, -3.6692F, 0.507F, 0.13F, -0.4251F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(112, 74).mirror().addBox(-5.1031F, -1.4892F, -0.5396F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.0054F, -3.6692F, 0.3367F, 0.3657F, -0.9332F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(33, 29).mirror().addBox(-13.6588F, -3.8413F, -0.5396F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.0054F, -3.6692F, 0.0999F, 0.4825F, -1.495F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(116, 43).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.4054F, -6.0692F, 0.5411F, 0.1386F, -0.3854F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(112, 76).mirror().addBox(-4.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.4054F, -6.0692F, 0.3641F, 0.3896F, -0.888F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(34, 77).mirror().addBox(-13.5459F, -3.252F, -0.5375F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.4054F, -6.0692F, 0.1098F, 0.5163F, -1.4552F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(34, 77).addBox(3.5459F, -3.252F, -0.5375F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.4054F, -6.0692F, 0.1098F, -0.5163F, 1.4552F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(112, 76).addBox(1.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.4054F, -6.0692F, 0.3641F, -0.3896F, 0.888F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(116, 43).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.4054F, -6.0692F, 0.5411F, -0.1386F, 0.3854F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(33, 29).addBox(3.6588F, -3.8413F, -0.5396F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.0054F, -3.6692F, 0.0999F, -0.4825F, 1.495F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(112, 74).addBox(2.1032F, -1.4892F, -0.5396F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.0054F, -3.6692F, 0.3367F, -0.3657F, 0.9332F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(112, 57).addBox(-0.4293F, -0.1847F, -0.4845F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.0054F, -3.6692F, 0.507F, -0.13F, 0.4251F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(33, 27).addBox(3.7341F, -4.2342F, -0.5409F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.8054F, -0.6692F, 0.0755F, -0.3801F, 1.488F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(112, 55).addBox(2.3648F, -1.7918F, -0.5409F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.8054F, -0.6692F, 0.2598F, -0.2903F, 0.9408F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(112, 53).addBox(-0.0489F, -0.3078F, -0.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.8054F, -0.6692F, 0.4059F, -0.1002F, 0.4195F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 0.8586F, -6.4418F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition chest_r5 = chest2.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(37, 130).addBox(-0.4F, -1.4653F, -0.0762F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4F, -2.0F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest_r6 = chest2.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(34, 130).addBox(-0.4F, -1.4315F, -0.1538F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.9F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest_r7 = chest2.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(18, 96).addBox(-0.4F, -1.7748F, -0.0573F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -6.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r54 = chest2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(77, 41).mirror().addBox(-12.5459F, -3.252F, -0.5375F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.7468F, -1.4274F, 0.0976F, 0.5531F, -1.4958F));

		PartDefinition cube_r55 = chest2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(112, 84).mirror().addBox(-4.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.7468F, -1.4274F, 0.3762F, 0.4263F, -0.9176F));

		PartDefinition cube_r56 = chest2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(117, 91).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.7468F, -1.4274F, 0.5689F, 0.1654F, -0.4156F));

		PartDefinition cube_r57 = chest2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9468F, -3.4274F, 0.6025F, 0.1753F, -0.4455F));

		PartDefinition cube_r58 = chest2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(112, 86).mirror().addBox(-4.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9468F, -3.4274F, 0.4031F, 0.4509F, -0.9417F));

		PartDefinition cube_r59 = chest2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(77, 43).mirror().addBox(-11.5459F, -3.252F, -0.5375F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9468F, -3.4274F, 0.1057F, 0.5871F, -1.527F));

		PartDefinition cube_r60 = chest2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(48, 65).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.2468F, -5.4274F, 0.7309F, 0.2336F, -0.4727F));

		PartDefinition cube_r61 = chest2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(53, 110).mirror().addBox(-4.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.2468F, -5.4274F, 0.4991F, 0.5612F, -0.9485F));

		PartDefinition cube_r62 = chest2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(103, 34).mirror().addBox(-7.5459F, -3.252F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.2468F, -5.4274F, 0.1136F, 0.7255F, -1.5756F));

		PartDefinition cube_r63 = chest2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(34, 75).mirror().addBox(-4.6F, 0.0948F, -0.4495F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5654F, 9.622F, -4.2488F, -0.6134F, 0.5765F, 0.3934F));

		PartDefinition cube_r64 = chest2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(90, 85).mirror().addBox(-6.0837F, -0.0297F, -0.5922F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5654F, 10.122F, -3.8488F, -0.8429F, 0.8914F, 0.0516F));

		PartDefinition cube_r65 = chest2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(90, 87).mirror().addBox(-8.3837F, -0.0297F, -0.1922F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(118, 93).mirror().addBox(-2.3837F, -0.0297F, -0.1922F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5654F, 10.122F, -3.8488F, -1.0919F, 1.0237F, -0.2525F));

		PartDefinition cube_r66 = chest2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(118, 93).addBox(0.3837F, -0.0297F, -0.1922F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 87).addBox(2.3837F, -0.0297F, -0.1922F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7654F, 10.122F, -3.8488F, -1.0919F, -1.0237F, 0.2525F));

		PartDefinition cube_r67 = chest2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(90, 85).addBox(0.0837F, -0.0297F, -0.5922F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7654F, 10.122F, -3.8488F, -0.8429F, -0.8914F, -0.0516F));

		PartDefinition cube_r68 = chest2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(34, 75).addBox(-0.4F, 0.0948F, -0.4495F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7654F, 9.622F, -4.2488F, -0.6134F, -0.5765F, -0.3934F));

		PartDefinition cube_r69 = chest2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(103, 34).addBox(3.5459F, -3.252F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.2468F, -5.4274F, 0.1136F, -0.7255F, 1.5756F));

		PartDefinition cube_r70 = chest2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(53, 110).addBox(1.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.2468F, -5.4274F, 0.4991F, -0.5612F, 0.9485F));

		PartDefinition cube_r71 = chest2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(48, 65).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.2468F, -5.4274F, 0.7309F, -0.2336F, 0.4727F));

		PartDefinition cube_r72 = chest2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(77, 43).addBox(3.5459F, -3.252F, -0.5375F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.9468F, -3.4274F, 0.1057F, -0.5871F, 1.527F));

		PartDefinition cube_r73 = chest2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(112, 86).addBox(1.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.9468F, -3.4274F, 0.4031F, -0.4509F, 0.9417F));

		PartDefinition cube_r74 = chest2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(40, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.9468F, -3.4274F, 0.6025F, -0.1753F, 0.4455F));

		PartDefinition cube_r75 = chest2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(117, 91).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.7468F, -1.4274F, 0.5689F, -0.1654F, 0.4156F));

		PartDefinition cube_r76 = chest2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(112, 84).addBox(1.7107F, -1.0354F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.7468F, -1.4274F, 0.3762F, -0.4263F, 0.9176F));

		PartDefinition cube_r77 = chest2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(77, 41).addBox(3.5459F, -3.252F, -0.5375F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.7468F, -1.4274F, 0.0976F, -0.5531F, 1.4958F));

		PartDefinition chest_r8 = chest2.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(62, 0).addBox(-1.4F, -0.0983F, -6.9864F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, -0.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition upperarmL2 = chest2.addOrReplaceChild("upperarmL2", CubeListBuilder.create().texOffs(123, 18).addBox(-0.2479F, 0.1042F, 0.118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.209F)), PartPose.offsetAndRotation(4.3875F, 9.5414F, -3.2089F, 0.5009F, 0.1861F, -0.1479F));

		PartDefinition upperarm6_r1 = upperarmL2.addOrReplaceChild("upperarm6_r1", CubeListBuilder.create().texOffs(108, 94).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5521F, 2.5796F, -1.3989F, 0.1396F, 0.0F, 0.0F));

		PartDefinition upperarm5_r1 = upperarmL2.addOrReplaceChild("upperarm5_r1", CubeListBuilder.create().texOffs(107, 79).addBox(-0.5F, -0.3F, 0.475F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5521F, 3.1899F, -1.7041F, 0.9599F, 0.0F, 0.0F));

		PartDefinition upperarm4_r1 = upperarmL2.addOrReplaceChild("upperarm4_r1", CubeListBuilder.create().texOffs(74, 105).addBox(-0.5F, -1.625F, -1.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5521F, 1.6296F, 0.2935F, -0.3491F, 0.0F, 0.0F));

		PartDefinition upperarm10_r1 = upperarmL2.addOrReplaceChild("upperarm10_r1", CubeListBuilder.create().texOffs(3, 125).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2521F, 9.0886F, 0.5875F, -2.7489F, 0.0F, 0.0F));

		PartDefinition upperarm9_r1 = upperarmL2.addOrReplaceChild("upperarm9_r1", CubeListBuilder.create().texOffs(117, 124).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2521F, 9.1322F, -0.4116F, -1.5272F, 0.0F, 0.0F));

		PartDefinition upperarm8_r1 = upperarmL2.addOrReplaceChild("upperarm8_r1", CubeListBuilder.create().texOffs(124, 111).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2521F, 8.2452F, -0.8733F, -1.0908F, 0.0F, 0.0F));

		PartDefinition upperarm7_r1 = upperarmL2.addOrReplaceChild("upperarm7_r1", CubeListBuilder.create().texOffs(93, 124).addBox(-0.5F, -0.225F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2521F, 7.9005F, 0.0281F, -0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm7_r2 = upperarmL2.addOrReplaceChild("upperarm7_r2", CubeListBuilder.create().texOffs(40, 120).addBox(-0.5F, -2.2F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(85, 120).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2521F, 7.3231F, 0.5247F, 0.0436F, 0.0F, 0.0F));

		PartDefinition upperarm6_r2 = upperarmL2.addOrReplaceChild("upperarm6_r2", CubeListBuilder.create().texOffs(90, 120).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2521F, 7.3231F, 0.5247F, -0.3054F, 0.0F, 0.0F));

		PartDefinition upperarm5_r2 = upperarmL2.addOrReplaceChild("upperarm5_r2", CubeListBuilder.create().texOffs(0, 119).addBox(-0.4F, -0.7F, -1.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2521F, 4.0512F, 0.1211F, 0.6109F, 0.0F, 0.0F));

		PartDefinition upperarm4_r2 = upperarmL2.addOrReplaceChild("upperarm4_r2", CubeListBuilder.create().texOffs(15, 70).addBox(-0.5F, -1.5F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2521F, 5.0857F, 0.4425F, 0.0436F, 0.0F, 0.0F));

		PartDefinition upperarm6_r3 = upperarmL2.addOrReplaceChild("upperarm6_r3", CubeListBuilder.create().texOffs(123, 105).addBox(-0.5F, -0.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.2521F, 3.7336F, 0.1504F, 1.5359F, 0.0F, 0.0F));

		PartDefinition upperarm5_r3 = upperarmL2.addOrReplaceChild("upperarm5_r3", CubeListBuilder.create().texOffs(46, 110).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.195F)), PartPose.offsetAndRotation(0.2521F, 2.224F, 0.5904F, 1.3614F, 0.0F, 0.0F));

		PartDefinition upperarm4_r3 = upperarmL2.addOrReplaceChild("upperarm4_r3", CubeListBuilder.create().texOffs(103, 123).addBox(-0.5F, -1.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.2521F, 1.145F, 1.9024F, 0.6632F, 0.0F, 0.0F));

		PartDefinition lowerarmL2 = upperarmL2.addOrReplaceChild("lowerarmL2", CubeListBuilder.create().texOffs(81, 0).addBox(-1.0591F, 0.003F, -5.0888F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8034F, 9.2372F, 0.5601F, 0.2699F, 0.1034F, 0.0804F));

		PartDefinition arms5_r1 = lowerarmL2.addOrReplaceChild("arms5_r1", CubeListBuilder.create().texOffs(81, 14).addBox(-0.5F, 0.7F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5591F, -1.897F, -3.9888F, 0.0087F, 0.0F, 0.0F));

		PartDefinition handL2 = lowerarmL2.addOrReplaceChild("handL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0668F, -0.3729F, -5.343F, -0.0398F, 0.1817F, 0.0453F));

		PartDefinition hands5_r1 = handL2.addOrReplaceChild("hands5_r1", CubeListBuilder.create().texOffs(103, 74).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.0F, 2.1178F, -1.2322F, 0.48F, 0.0F, 0.0F));

		PartDefinition hands3_r1 = handL2.addOrReplaceChild("hands3_r1", CubeListBuilder.create().texOffs(0, 88).addBox(0.0F, -0.8F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, 0.35F, -3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition thumbclawL2 = handL2.addOrReplaceChild("thumbclawL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 0.3772F, -1.0121F, -0.346F, 0.0946F, 0.0238F));

		PartDefinition thumbclaw3_r1 = thumbclawL2.addOrReplaceChild("thumbclaw3_r1", CubeListBuilder.create().texOffs(93, 69).addBox(-1.0F, -1.2F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1F, -1.6F, 0.0F, -0.3054F, 0.0F));

		PartDefinition upperarmL3 = chest2.addOrReplaceChild("upperarmL3", CubeListBuilder.create().texOffs(125, 63).addBox(-0.7521F, 0.1042F, 0.118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.209F)), PartPose.offsetAndRotation(-4.1875F, 9.5414F, -3.2089F, 1.1904F, -0.2891F, 0.1696F));

		PartDefinition upperarm7_r3 = upperarmL3.addOrReplaceChild("upperarm7_r3", CubeListBuilder.create().texOffs(109, 104).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5521F, 2.5796F, -1.3989F, 0.1396F, 0.0F, 0.0F));

		PartDefinition upperarm6_r4 = upperarmL3.addOrReplaceChild("upperarm6_r4", CubeListBuilder.create().texOffs(108, 99).addBox(-0.5F, -0.3F, 0.475F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5521F, 3.1899F, -1.7041F, 0.9599F, 0.0F, 0.0F));

		PartDefinition upperarm5_r4 = upperarmL3.addOrReplaceChild("upperarm5_r4", CubeListBuilder.create().texOffs(95, 106).addBox(-0.5F, -1.625F, -1.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.5521F, 1.6296F, 0.2935F, -0.3491F, 0.0F, 0.0F));

		PartDefinition upperarm11_r1 = upperarmL3.addOrReplaceChild("upperarm11_r1", CubeListBuilder.create().texOffs(125, 114).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2521F, 9.0886F, 0.5875F, -2.7489F, 0.0F, 0.0F));

		PartDefinition upperarm10_r2 = upperarmL3.addOrReplaceChild("upperarm10_r2", CubeListBuilder.create().texOffs(125, 94).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2521F, 9.1322F, -0.4116F, -1.5272F, 0.0F, 0.0F));

		PartDefinition upperarm9_r2 = upperarmL3.addOrReplaceChild("upperarm9_r2", CubeListBuilder.create().texOffs(125, 91).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2521F, 8.2452F, -0.8733F, -1.0908F, 0.0F, 0.0F));

		PartDefinition upperarm8_r2 = upperarmL3.addOrReplaceChild("upperarm8_r2", CubeListBuilder.create().texOffs(77, 125).addBox(-0.5F, -0.225F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2521F, 7.9005F, 0.0281F, -0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm8_r3 = upperarmL3.addOrReplaceChild("upperarm8_r3", CubeListBuilder.create().texOffs(120, 59).addBox(-0.5F, -2.2F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(95, 120).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2521F, 7.3231F, 0.5247F, 0.0436F, 0.0F, 0.0F));

		PartDefinition upperarm7_r4 = upperarmL3.addOrReplaceChild("upperarm7_r4", CubeListBuilder.create().texOffs(117, 120).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2521F, 7.3231F, 0.5247F, -0.3054F, 0.0F, 0.0F));

		PartDefinition upperarm6_r5 = upperarmL3.addOrReplaceChild("upperarm6_r5", CubeListBuilder.create().texOffs(15, 119).addBox(-0.6F, -0.7F, -1.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2521F, 4.0512F, 0.1211F, 0.6109F, 0.0F, 0.0F));

		PartDefinition upperarm5_r5 = upperarmL3.addOrReplaceChild("upperarm5_r5", CubeListBuilder.create().texOffs(115, 69).addBox(-0.5F, -1.5F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2521F, 5.0857F, 0.4425F, 0.0436F, 0.0F, 0.0F));

		PartDefinition upperarm7_r5 = upperarmL3.addOrReplaceChild("upperarm7_r5", CubeListBuilder.create().texOffs(125, 69).addBox(-0.5F, -0.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.2521F, 3.7336F, 0.1504F, 1.5359F, 0.0F, 0.0F));

		PartDefinition upperarm6_r6 = upperarmL3.addOrReplaceChild("upperarm6_r6", CubeListBuilder.create().texOffs(74, 110).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.195F)), PartPose.offsetAndRotation(-0.2521F, 2.224F, 0.5904F, 1.3614F, 0.0F, 0.0F));

		PartDefinition upperarm5_r6 = upperarmL3.addOrReplaceChild("upperarm5_r6", CubeListBuilder.create().texOffs(125, 66).addBox(-0.5F, -1.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.2521F, 1.145F, 1.9024F, 0.6632F, 0.0F, 0.0F));

		PartDefinition lowerarmL3 = upperarmL3.addOrReplaceChild("lowerarmL3", CubeListBuilder.create().texOffs(81, 7).addBox(0.0591F, 0.003F, -5.0888F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8034F, 9.2372F, 0.5601F, 0.3572F, -0.1034F, -0.0804F));

		PartDefinition arms6_r1 = lowerarmL3.addOrReplaceChild("arms6_r1", CubeListBuilder.create().texOffs(81, 21).addBox(-0.5F, 0.7F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5591F, -1.897F, -3.9888F, 0.0087F, 0.0F, 0.0F));

		PartDefinition handL3 = lowerarmL3.addOrReplaceChild("handL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0668F, -0.3729F, -5.343F, -0.0398F, -0.1817F, -0.0453F));

		PartDefinition hands6_r1 = handL3.addOrReplaceChild("hands6_r1", CubeListBuilder.create().texOffs(104, 60).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.0F, 2.1178F, -1.2322F, 0.48F, 0.0F, 0.0F));

		PartDefinition hands4_r1 = handL3.addOrReplaceChild("hands4_r1", CubeListBuilder.create().texOffs(31, 88).addBox(-1.0F, -0.8F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 0.35F, -3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition thumbclawL3 = handL3.addOrReplaceChild("thumbclawL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 0.3772F, -1.0121F, -0.346F, -0.0946F, -0.0238F));

		PartDefinition thumbclaw4_r1 = thumbclawL3.addOrReplaceChild("thumbclaw4_r1", CubeListBuilder.create().texOffs(94, 0).addBox(-1.0F, -1.2F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.1F, -1.6F, 0.0F, 0.3054F, 0.0F));

		PartDefinition bone4 = chest2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(1.9974F, 9.5077F, -7.9315F));

		PartDefinition body_r8 = bone4.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(94, 74).addBox(-0.8493F, 0.9965F, -1.1974F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.7026F, -3.4178F, 5.2452F, -1.6523F, 0.6055F, -0.11F));

		PartDefinition body_r9 = bone4.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(5, 107).addBox(-0.5F, -0.125F, -0.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7687F, -3.7947F, 3.1416F, -1.3469F, 0.6055F, -0.11F));

		PartDefinition body_r10 = bone4.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.9708F, -2.672F, 3.2537F, -0.9978F, 0.6055F, -0.11F));

		PartDefinition body_r11 = bone4.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(74, 100).addBox(-0.5F, -0.3755F, -0.0557F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.9334F, 0.4525F, 4.2334F, -0.5122F, 0.0F, 0.0F));

		PartDefinition body_r12 = bone4.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(40, 100).addBox(-0.5F, -0.3718F, -2.944F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9334F, 0.4525F, 4.2334F, -0.6867F, 0.0F, 0.0F));

		PartDefinition body_r13 = bone4.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(42, 94).addBox(0.1F, 0.7F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.9708F, -2.672F, 3.2537F, -0.4249F, 1.0596F, 0.6304F));

		PartDefinition body_r14 = bone4.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(35, 120).addBox(-0.5F, -0.525F, -1.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(119, 78).addBox(-0.5F, -0.525F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.8781F, -3.332F, 4.8656F, 0.5006F, 0.173F, -0.2202F));

		PartDefinition body_r15 = bone4.addOrReplaceChild("body_r15", CubeListBuilder.create().texOffs(73, 119).addBox(-0.5F, -1.0F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.8781F, -3.332F, 4.8656F, -0.0666F, 0.173F, -0.2202F));

		PartDefinition body_r16 = bone4.addOrReplaceChild("body_r16", CubeListBuilder.create().texOffs(36, 105).addBox(-0.5088F, -1.8128F, -1.6098F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(2.8913F, -5.3916F, 7.462F, -0.6339F, 0.173F, -0.2202F));

		PartDefinition body_r17 = bone4.addOrReplaceChild("body_r17", CubeListBuilder.create().texOffs(68, 119).addBox(-0.5088F, 1.7518F, -0.5693F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8913F, -5.3916F, 7.462F, -1.2011F, 0.173F, -0.2202F));

		PartDefinition body_r18 = bone4.addOrReplaceChild("body_r18", CubeListBuilder.create().texOffs(114, 4).addBox(-0.5088F, -1.8646F, -2.055F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.8913F, -5.3916F, 7.462F, -0.5902F, 0.173F, -0.2202F));

		PartDefinition body_r19 = bone4.addOrReplaceChild("body_r19", CubeListBuilder.create().texOffs(114, 21).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5445F, -7.7765F, 9.1568F, -3.1122F, 0.1358F, -0.2576F));

		PartDefinition body_r20 = bone4.addOrReplaceChild("body_r20", CubeListBuilder.create().texOffs(126, 15).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.2763F, -8.7329F, 9.0415F, 1.6874F, 0.1358F, -0.2576F));

		PartDefinition body_r21 = bone4.addOrReplaceChild("body_r21", CubeListBuilder.create().texOffs(114, 0).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0106F, -9.3389F, 8.2916F, 0.8584F, 0.1358F, -0.2576F));

		PartDefinition body_r22 = bone4.addOrReplaceChild("body_r22", CubeListBuilder.create().texOffs(121, 10).addBox(-0.5F, -1.075F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.1191F, -8.4827F, 7.4631F, -0.3197F, 0.1358F, -0.2576F));

		PartDefinition body_r23 = bone4.addOrReplaceChild("body_r23", CubeListBuilder.create().texOffs(120, 69).addBox(-0.5F, -1.0F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3155F, -7.4655F, 6.905F, -0.2324F, 0.1358F, -0.2576F));

		PartDefinition body_r24 = bone4.addOrReplaceChild("body_r24", CubeListBuilder.create().texOffs(120, 65).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0311F, -8.5276F, 6.873F, 0.0294F, 0.1358F, -0.2576F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.7974F, 9.5077F, -7.9315F));

		PartDefinition body_r25 = bone2.addOrReplaceChild("body_r25", CubeListBuilder.create().texOffs(94, 74).mirror().addBox(-0.1507F, 0.9965F, -1.1974F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7026F, -3.4178F, 5.2452F, -1.6523F, -0.6055F, 0.11F));

		PartDefinition body_r26 = bone2.addOrReplaceChild("body_r26", CubeListBuilder.create().texOffs(5, 107).mirror().addBox(-0.5F, -0.125F, -0.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7687F, -3.7947F, 3.1416F, -1.3469F, -0.6055F, 0.11F));

		PartDefinition body_r27 = bone2.addOrReplaceChild("body_r27", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.9708F, -2.672F, 3.2537F, -0.9978F, -0.6055F, 0.11F));

		PartDefinition body_r28 = bone2.addOrReplaceChild("body_r28", CubeListBuilder.create().texOffs(74, 100).mirror().addBox(-0.5F, -0.3755F, -0.0557F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.9334F, 0.4525F, 4.2334F, -0.5122F, 0.0F, 0.0F));

		PartDefinition body_r29 = bone2.addOrReplaceChild("body_r29", CubeListBuilder.create().texOffs(40, 100).mirror().addBox(-0.5F, -0.3718F, -2.944F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9334F, 0.4525F, 4.2334F, -0.6867F, 0.0F, 0.0F));

		PartDefinition body_r30 = bone2.addOrReplaceChild("body_r30", CubeListBuilder.create().texOffs(42, 94).mirror().addBox(-1.1F, 0.7F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.9708F, -2.672F, 3.2537F, -0.4249F, -1.0596F, -0.6304F));

		PartDefinition body_r31 = bone2.addOrReplaceChild("body_r31", CubeListBuilder.create().texOffs(35, 120).mirror().addBox(-0.5F, -0.525F, -1.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(119, 78).mirror().addBox(-0.5F, -0.525F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.8781F, -3.332F, 4.8656F, 0.5006F, -0.173F, 0.2202F));

		PartDefinition body_r32 = bone2.addOrReplaceChild("body_r32", CubeListBuilder.create().texOffs(73, 119).mirror().addBox(-0.5F, -1.0F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.8781F, -3.332F, 4.8656F, -0.0666F, -0.173F, 0.2202F));

		PartDefinition body_r33 = bone2.addOrReplaceChild("body_r33", CubeListBuilder.create().texOffs(36, 105).mirror().addBox(-0.4912F, -1.8128F, -1.6098F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-2.8913F, -5.3916F, 7.462F, -0.6339F, -0.173F, 0.2202F));

		PartDefinition body_r34 = bone2.addOrReplaceChild("body_r34", CubeListBuilder.create().texOffs(68, 119).mirror().addBox(-0.4912F, 1.7518F, -0.5693F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8913F, -5.3916F, 7.462F, -1.2011F, -0.173F, 0.2202F));

		PartDefinition body_r35 = bone2.addOrReplaceChild("body_r35", CubeListBuilder.create().texOffs(114, 4).mirror().addBox(-0.4912F, -1.8646F, -2.055F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8913F, -5.3916F, 7.462F, -0.5902F, -0.173F, 0.2202F));

		PartDefinition body_r36 = bone2.addOrReplaceChild("body_r36", CubeListBuilder.create().texOffs(114, 21).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5445F, -7.7765F, 9.1568F, -3.1122F, -0.1358F, 0.2576F));

		PartDefinition body_r37 = bone2.addOrReplaceChild("body_r37", CubeListBuilder.create().texOffs(126, 15).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.2763F, -8.7329F, 9.0415F, 1.6874F, -0.1358F, 0.2576F));

		PartDefinition body_r38 = bone2.addOrReplaceChild("body_r38", CubeListBuilder.create().texOffs(114, 0).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0106F, -9.3389F, 8.2916F, 0.8584F, -0.1358F, 0.2576F));

		PartDefinition body_r39 = bone2.addOrReplaceChild("body_r39", CubeListBuilder.create().texOffs(121, 10).mirror().addBox(-0.5F, -1.075F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.1191F, -8.4827F, 7.4631F, -0.3197F, -0.1358F, 0.2576F));

		PartDefinition body_r40 = bone2.addOrReplaceChild("body_r40", CubeListBuilder.create().texOffs(120, 69).mirror().addBox(-0.5F, -1.0F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3155F, -7.4655F, 6.905F, -0.2324F, -0.1358F, 0.2576F));

		PartDefinition body_r41 = bone2.addOrReplaceChild("body_r41", CubeListBuilder.create().texOffs(120, 65).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0311F, -8.5276F, 6.873F, 0.0294F, -0.1358F, 0.2576F));

		PartDefinition neck1 = chest2.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3849F, -6.9834F, -0.0494F, 0.0F, 0.0F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(31, 130).addBox(-0.5F, -2.0328F, -1.0747F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.6F, -0.1078F, 0.2614F, 0.0087F, 0.0F, 0.0F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(22, 117).addBox(-0.5F, -1.8281F, -2.0774F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.6F, -0.1078F, -1.7386F, -0.0785F, 0.0F, 0.0F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(79, 52).addBox(-1.0F, -0.7093F, 2.1055F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.6F, 0.2922F, -6.9386F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r78 = neck1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(94, 25).mirror().addBox(-6.7107F, -1.0354F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4619F, -0.444F, 0.5754F, 0.6666F, -0.9738F));

		PartDefinition cube_r79 = neck1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(118, 95).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4619F, -0.444F, 0.8379F, 0.2996F, -0.5138F));

		PartDefinition cube_r80 = neck1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(118, 97).mirror().addBox(-1.7129F, -0.1895F, -0.5098F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3549F, 0.5015F, -2.7031F, 0.5818F, 0.7222F, -0.9419F));

		PartDefinition cube_r81 = neck1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(119, 8).mirror().addBox(-3.5917F, -0.6587F, -0.549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3549F, 0.5015F, -2.7031F, 0.2874F, 0.8552F, -1.2985F));

		PartDefinition cube_r82 = neck1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(119, 8).addBox(1.5917F, -0.6587F, -0.549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5549F, 0.5015F, -2.7031F, 0.2874F, -0.8552F, 1.2985F));

		PartDefinition cube_r83 = neck1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(118, 97).addBox(-0.2871F, -0.1895F, -0.5098F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5549F, 0.5015F, -2.7031F, 0.5818F, -0.7222F, 0.9419F));

		PartDefinition cube_r84 = neck1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(118, 95).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4619F, -0.444F, 0.8379F, -0.2996F, 0.5138F));

		PartDefinition cube_r85 = neck1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(94, 25).addBox(1.7107F, -1.0354F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4619F, -0.444F, 0.5754F, -0.6666F, 0.9738F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.2709F, -4.7436F, -0.1118F, 0.0F, 0.0F));

		PartDefinition neck4_r1 = neck2.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(116, 38).addBox(0.0F, -1.3F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6913F, -0.788F, -0.0611F, 0.0F, 0.0F));

		PartDefinition neck3_r2 = neck2.addOrReplaceChild("neck3_r2", CubeListBuilder.create().texOffs(116, 14).addBox(-0.5F, -2.2843F, -1.5343F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1534F, -3.0688F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r86 = neck2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(104, 70).mirror().addBox(-5.5917F, -0.6587F, -0.549F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4549F, 0.5724F, -0.9595F, 0.5324F, 1.1818F, -1.0868F));

		PartDefinition cube_r87 = neck2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(119, 4).mirror().addBox(-1.7129F, -0.1895F, -0.5098F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4549F, 0.5724F, -0.9595F, 0.9495F, 0.9768F, -0.6622F));

		PartDefinition cube_r88 = neck2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(119, 6).mirror().addBox(-1.8786F, -0.0985F, -0.4447F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4549F, 0.2724F, -3.8595F, 0.8904F, 0.9491F, -0.7108F));

		PartDefinition cube_r89 = neck2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(104, 72).mirror().addBox(-5.7768F, -0.6202F, -0.4836F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4549F, 0.2724F, -3.8595F, 0.4835F, 1.1427F, -1.1317F));

		PartDefinition cube_r90 = neck2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(104, 72).addBox(1.7768F, -0.6202F, -0.4836F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4549F, 0.2724F, -3.8595F, 0.4835F, -1.1427F, 1.1317F));

		PartDefinition cube_r91 = neck2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(119, 6).addBox(-0.1214F, -0.0985F, -0.4447F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4549F, 0.2724F, -3.8595F, 0.8904F, -0.9491F, 0.7108F));

		PartDefinition cube_r92 = neck2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(119, 4).addBox(-0.2871F, -0.1895F, -0.5098F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4549F, 0.5724F, -0.9595F, 0.9495F, -0.9768F, 0.6622F));

		PartDefinition cube_r93 = neck2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(104, 70).addBox(1.5917F, -0.6587F, -0.549F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4549F, 0.5724F, -0.9595F, 0.5324F, -1.1818F, 1.0868F));

		PartDefinition neck2_r2 = neck2.addOrReplaceChild("neck2_r2", CubeListBuilder.create().texOffs(79, 45).addBox(-1.0F, -0.2812F, -4.6184F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1534F, -0.1688F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4087F, -4.3486F, 0.0681F, 0.0F, 0.0F));

		PartDefinition cube_r94 = neck3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(100, 117).addBox(-1.0F, -1.6889F, -2.1519F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.002F))
				.texOffs(11, 90).addBox(-1.5F, -0.0889F, -3.3519F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0F, -0.2734F, -0.7067F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r95 = neck3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(94, 80).mirror().addBox(-5.0F, -0.1F, -0.6F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2085F, -2.0518F, 0.299F, 0.977F, -1.2235F));

		PartDefinition cube_r96 = neck3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(94, 80).addBox(0.0F, -0.1F, -0.6F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2085F, -2.0518F, 0.299F, -0.977F, 1.2235F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9596F, -3.7708F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r97 = neck.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(116, 100).addBox(-1.0F, -2.4F, 1.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(90, 89).addBox(-1.5F, -0.7F, -0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 0.3413F, -3.1163F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r98 = neck.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(94, 82).mirror().addBox(-5.0F, -0.1F, -0.4F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4147F, 0.419F, -1.415F, 1.3344F, 1.3074F, -0.2722F));

		PartDefinition cube_r99 = neck.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(94, 82).addBox(0.0F, -0.1F, -0.4F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4147F, 0.419F, -1.415F, 1.3344F, -1.3074F, 0.2722F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0239F, -3.8912F, -0.1289F, 0.0493F, 0.0433F));

		PartDefinition cube_r100 = neck4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(28, 130).addBox(-1.0F, -2.0F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 130).addBox(-1.0F, -1.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 30).addBox(-1.5F, -0.7F, -0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3413F, -3.1163F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r101 = neck4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(96, 43).mirror().addBox(-4.9F, 0.0F, -0.7F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4832F, 0.1777F, -0.3671F, 0.8772F, 1.3018F, -0.713F));

		PartDefinition cube_r102 = neck4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(105, 15).mirror().addBox(-3.7F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5843F, 0.4163F, -2.8837F, 0.7662F, 1.3155F, -0.7784F));

		PartDefinition cube_r103 = neck4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(105, 15).addBox(-0.3F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5843F, 0.4163F, -2.8837F, 0.7662F, -1.3155F, 0.7784F));

		PartDefinition cube_r104 = neck4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(96, 43).addBox(-0.1F, 0.0F, -0.7F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4832F, 0.1777F, -0.3671F, 0.8772F, -1.3018F, 0.713F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0123F, -3.931F, 0.1716F, 0.129F, 0.0223F));

		PartDefinition cube_r105 = neck5.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(130, 93).addBox(-1.0F, -1.65F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 65).addBox(-1.5F, -0.7F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 0.3413F, -3.1163F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r106 = neck5.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(105, 17).mirror().addBox(-4.0F, -0.1F, -0.7F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1148F, -1.6587F, 0.8537F, 1.1757F, -0.7105F));

		PartDefinition cube_r107 = neck5.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(105, 17).addBox(0.0F, -0.1F, -0.7F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1148F, -1.6587F, 0.8537F, -1.1757F, 0.7105F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.015F, -2.7925F, 0.1952F, 0.0891F, 0.2381F));

		PartDefinition cube_r108 = neck6.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(94, 130).addBox(-1.0F, -1.625F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 45).addBox(-1.5F, -0.7F, -0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3413F, -3.1163F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r109 = neck6.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(105, 19).mirror().addBox(-4.0F, -0.1F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2298F, -1.6662F, 0.316F, 1.187F, -1.2223F));

		PartDefinition cube_r110 = neck6.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(105, 19).addBox(0.0F, -0.1F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2298F, -1.6662F, 0.316F, -1.187F, 1.2223F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.05F, -3.9F, 0.1355F, 0.2595F, 0.035F));

		PartDefinition cube_r111 = neck7.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(97, 130).addBox(-1.0F, -1.375F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 63).addBox(-1.5F, -0.7F, -0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3413F, -3.1163F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r112 = neck7.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(113, 63).mirror().addBox(-3.0F, -0.1F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2298F, -1.6662F, 0.316F, 1.187F, -1.2223F));

		PartDefinition cube_r113 = neck7.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(113, 63).addBox(0.0F, -0.1F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2298F, -1.6662F, 0.316F, -1.187F, 1.2223F));

		PartDefinition head1 = neck7.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4743F, -4.2007F, 0.3178F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head1.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(117, 88).addBox(-0.5F, -1.975F, 0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -0.6351F, -2.0855F, -1.5533F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head1.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(86, 117).addBox(-1.0F, -0.45F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.0832F, 0.2267F, -1.8937F, 0.0F, 0.0F));

		PartDefinition head5_r2 = head1.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(35, 117).addBox(-0.5F, -0.0034F, 0.0392F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -0.6521F, -1.1106F, -1.501F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head1.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(117, 113).addBox(-1.3F, -1.0F, -0.075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2645F, -3.0199F, -1.3526F, 0.0F, 0.0F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, -0.5F, -3.0F, 0.0456F, 0.0F, 0.0F));

		PartDefinition head8_r1 = head2.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(121, 108).addBox(-0.5F, -0.35F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.1F, 1.8864F, -2.7367F, 0.1658F, 0.0F, 0.0F));

		PartDefinition head7_r1 = head2.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(35, 124).addBox(0.0F, -0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.4F, 1.8571F, -2.8057F, 1.1694F, 0.0F, 0.0F));

		PartDefinition head8_r2 = head2.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(121, 54).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.1F, 0.3048F, -0.6712F, -2.9583F, 0.0F, 0.0F));

		PartDefinition head7_r2 = head2.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(121, 51).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.1F, 0.5211F, -1.3369F, 1.885F, 0.0F, 0.0F));

		PartDefinition head6_r2 = head2.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(126, 72).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.1F, 0.8498F, -1.955F, 0.4887F, 0.0F, 0.0F));

		PartDefinition head5_r3 = head2.addOrReplaceChild("head5_r3", CubeListBuilder.create().texOffs(126, 9).addBox(0.0F, -0.125F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4F, 1.2764F, -2.5417F, 0.6632F, 0.0F, 0.0F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -3.4F, 0.3187F, 0.0F, 0.0F));

		PartDefinition head3 = head1.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -3.4F, 0.1367F, 0.0F, 0.0F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.0911F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0987F, 2.0822F, 0.5178F, 0.7856F, 0.0069F, -0.0049F));

		PartDefinition jaw3_r1 = jaw1.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(109, 41).mirror().addBox(-0.2F, -0.2827F, -1.7906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-1.3936F, 0.1462F, 0.2297F, -0.4363F, -0.1658F, 0.0F));

		PartDefinition jaw4_r1 = jaw1.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(125, 120).mirror().addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.9243F, -0.1485F, -0.757F, -0.8727F, -0.1658F, 0.0F));

		PartDefinition jaw5_r1 = jaw1.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(125, 123).mirror().addBox(-0.2F, -0.1574F, -0.8487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2243F, -0.6584F, -0.7822F, -0.6109F, -0.1658F, 0.0F));

		PartDefinition jaw5_r2 = jaw1.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(121, 102).mirror().addBox(-0.2F, -0.0468F, -0.9769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0593F, -1.1756F, -1.7681F, 0.1614F, -0.1658F, 0.0F));

		PartDefinition jaw6_r1 = jaw1.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(126, 0).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.6336F, -0.6526F, -2.4945F, -1.5882F, -0.1658F, 0.0F));

		PartDefinition jaw7_r1 = jaw1.addOrReplaceChild("jaw7_r1", CubeListBuilder.create().texOffs(27, 118).mirror().addBox(-0.5F, -0.425F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5449F, -0.6707F, -3.0244F, -1.7104F, -0.1658F, 0.0F));

		PartDefinition jaw20_r1 = jaw1.addOrReplaceChild("jaw20_r1", CubeListBuilder.create().texOffs(5, 128).mirror().addBox(-0.2F, 4.1573F, -0.0435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(10, 128).mirror().addBox(-0.2F, 4.8573F, -0.0435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(15, 128).mirror().addBox(-0.2F, 3.4573F, -0.0435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(128, 18).mirror().addBox(-0.2F, 2.7573F, -0.0435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.3936F, -0.8538F, 0.2297F, -1.7235F, -0.1658F, 0.0F));

		PartDefinition jaw11_r1 = jaw1.addOrReplaceChild("jaw11_r1", CubeListBuilder.create().texOffs(97, 127).mirror().addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(129, 78).mirror().addBox(-0.5F, 0.1F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(129, 81).mirror().addBox(-0.5F, 0.4F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.192F)).mirror(false), PartPose.offsetAndRotation(-0.3064F, -0.7706F, -4.4496F, -1.7061F, -0.1658F, 0.0F));

		PartDefinition jaw6_r2 = jaw1.addOrReplaceChild("jaw6_r2", CubeListBuilder.create().texOffs(121, 82).mirror().addBox(-0.5F, -0.675F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7658F, -0.5253F, -1.7043F, -0.0175F, -0.1658F, 0.0F));

		PartDefinition jaw4_r2 = jaw1.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(10, 113).mirror().addBox(-0.2F, -0.787F, -1.7991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.3647F, 0.7177F, 0.0566F, -0.3752F, -0.1658F, 0.0F));

		PartDefinition jaw5_r3 = jaw1.addOrReplaceChild("jaw5_r3", CubeListBuilder.create().texOffs(36, 113).mirror().addBox(-0.0859F, -1.2926F, 0.3942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1519F, 0.4124F, -2.6274F, -0.4944F, -0.309F, 0.212F));

		PartDefinition jaw7_r2 = jaw1.addOrReplaceChild("jaw7_r2", CubeListBuilder.create().texOffs(109, 109).mirror().addBox(-0.4743F, -0.9991F, -0.5017F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3094F, 1.2175F, -0.2554F, -0.264F, -0.1578F, 0.1275F));

		PartDefinition jaw5_r4 = jaw1.addOrReplaceChild("jaw5_r4", CubeListBuilder.create().texOffs(25, 57).mirror().addBox(-0.2F, -0.7869F, -0.1991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(92, 36).mirror().addBox(-0.2F, -0.7869F, 0.1009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.3643F, 0.728F, 0.0547F, 0.2618F, -0.1658F, 0.0F));

		PartDefinition jaw5_r5 = jaw1.addOrReplaceChild("jaw5_r5", CubeListBuilder.create().texOffs(113, 59).mirror().addBox(-0.2F, -0.9154F, -1.7978F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.1429F, 0.3275F, -1.2683F, -0.2007F, -0.1658F, 0.0F));

		PartDefinition jaw8_r1 = jaw1.addOrReplaceChild("jaw8_r1", CubeListBuilder.create().texOffs(126, 3).mirror().addBox(-0.6F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8342F, -0.5295F, -1.3956F, -0.4712F, -0.1658F, 0.0F));

		PartDefinition jaw6_r3 = jaw1.addOrReplaceChild("jaw6_r3", CubeListBuilder.create().texOffs(48, 114).mirror().addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.4862F, -0.5651F, -3.3754F, -0.2574F, -0.1658F, 0.0F));

		PartDefinition jaw14_r1 = jaw1.addOrReplaceChild("jaw14_r1", CubeListBuilder.create().texOffs(129, 87).mirror().addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.4088F, -1.0562F, -5.6552F, -1.7276F, 0.5515F, -0.1051F));

		PartDefinition jaw5_r6 = jaw1.addOrReplaceChild("jaw5_r6", CubeListBuilder.create().texOffs(48, 114).addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.6836F, -0.5651F, -3.3754F, -0.2574F, 0.1658F, 0.0F));

		PartDefinition jaw7_r3 = jaw1.addOrReplaceChild("jaw7_r3", CubeListBuilder.create().texOffs(126, 3).addBox(-0.4F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0316F, -0.5295F, -1.3956F, -0.4712F, 0.1658F, 0.0F));

		PartDefinition jaw4_r3 = jaw1.addOrReplaceChild("jaw4_r3", CubeListBuilder.create().texOffs(113, 59).addBox(-0.8F, -0.9154F, -1.7978F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.3403F, 0.3275F, -1.2683F, -0.2007F, 0.1658F, 0.0F));

		PartDefinition jaw5_r7 = jaw1.addOrReplaceChild("jaw5_r7", CubeListBuilder.create().texOffs(92, 36).addBox(-0.8F, -0.7869F, 0.1009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(25, 57).addBox(-0.8F, -0.7869F, -0.1991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.5617F, 0.728F, 0.0547F, 0.2618F, 0.1658F, 0.0F));

		PartDefinition jaw6_r4 = jaw1.addOrReplaceChild("jaw6_r4", CubeListBuilder.create().texOffs(109, 109).addBox(-0.5257F, -0.9991F, -0.5017F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5068F, 1.2175F, -0.2554F, -0.264F, 0.1578F, -0.1275F));

		PartDefinition jaw4_r4 = jaw1.addOrReplaceChild("jaw4_r4", CubeListBuilder.create().texOffs(36, 113).addBox(-0.9141F, -1.2926F, 0.3942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0455F, 0.4124F, -2.6274F, -0.4944F, 0.309F, -0.212F));

		PartDefinition jaw3_r2 = jaw1.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(10, 113).addBox(-0.8F, -0.787F, -1.7991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.5621F, 0.7177F, 0.0566F, -0.3752F, 0.1658F, 0.0F));

		PartDefinition jaw5_r8 = jaw1.addOrReplaceChild("jaw5_r8", CubeListBuilder.create().texOffs(121, 82).addBox(-0.5F, -0.675F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9632F, -0.5253F, -1.7043F, -0.0175F, 0.1658F, 0.0F));

		PartDefinition jaw13_r1 = jaw1.addOrReplaceChild("jaw13_r1", CubeListBuilder.create().texOffs(129, 87).addBox(-0.8F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.6062F, -1.0562F, -5.6552F, -1.7276F, -0.5515F, 0.1051F));

		PartDefinition jaw12_r1 = jaw1.addOrReplaceChild("jaw12_r1", CubeListBuilder.create().texOffs(129, 81).addBox(-0.5F, 0.4F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.192F))
				.texOffs(129, 78).addBox(-0.5F, 0.1F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(97, 127).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.5038F, -0.7706F, -4.4496F, -1.7061F, 0.1658F, 0.0F));

		PartDefinition jaw20_r2 = jaw1.addOrReplaceChild("jaw20_r2", CubeListBuilder.create().texOffs(10, 128).addBox(-0.8F, 4.8573F, -0.0435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(128, 18).addBox(-0.8F, 2.7573F, -0.0435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(15, 128).addBox(-0.8F, 3.4573F, -0.0435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(5, 128).addBox(-0.8F, 4.1573F, -0.0435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.591F, -0.8538F, 0.2297F, -1.7235F, 0.1658F, 0.0F));

		PartDefinition jaw6_r5 = jaw1.addOrReplaceChild("jaw6_r5", CubeListBuilder.create().texOffs(27, 118).addBox(-0.5F, -0.425F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7423F, -0.6707F, -3.0244F, -1.7104F, 0.1658F, 0.0F));

		PartDefinition jaw5_r9 = jaw1.addOrReplaceChild("jaw5_r9", CubeListBuilder.create().texOffs(126, 0).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.831F, -0.6526F, -2.4945F, -1.5882F, 0.1658F, 0.0F));

		PartDefinition jaw4_r5 = jaw1.addOrReplaceChild("jaw4_r5", CubeListBuilder.create().texOffs(121, 102).addBox(-0.8F, -0.0468F, -0.9769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2567F, -1.1756F, -1.7681F, 0.1614F, 0.1658F, 0.0F));

		PartDefinition jaw4_r6 = jaw1.addOrReplaceChild("jaw4_r6", CubeListBuilder.create().texOffs(125, 123).addBox(-0.8F, -0.1574F, -0.8487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4217F, -0.6584F, -0.7822F, -0.6109F, 0.1658F, 0.0F));

		PartDefinition jaw3_r3 = jaw1.addOrReplaceChild("jaw3_r3", CubeListBuilder.create().texOffs(125, 120).addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1217F, -0.1485F, -0.757F, -0.8727F, 0.1658F, 0.0F));

		PartDefinition jaw2_r1 = jaw1.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(109, 41).addBox(-0.8F, -0.2827F, -1.7906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(1.591F, 0.1462F, 0.2297F, -0.4363F, 0.1658F, 0.0F));

		PartDefinition leftFace = head1.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4094F, 0.403F, -0.323F, 0.0F, -0.0175F, 0.0F));

		PartDefinition head8_r3 = leftFace.addOrReplaceChild("head8_r3", CubeListBuilder.create().texOffs(125, 57).addBox(0.0539F, -0.0874F, -2.1813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(55, 125).addBox(0.1289F, -0.0874F, -1.4813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3842F, 0.7587F, -2.8495F, 0.1108F, 0.1012F, 0.0011F));

		PartDefinition head6_r3 = leftFace.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(50, 125).addBox(0.1289F, -0.045F, -0.7624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3842F, 0.7587F, -2.8495F, 0.0672F, 0.1012F, 0.0011F));

		PartDefinition head6_r4 = leftFace.addOrReplaceChild("head6_r4", CubeListBuilder.create().texOffs(125, 60).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.406F, 1.1371F, -1.6868F, 0.1981F, 0.1448F, 0.0011F));

		PartDefinition head5_r4 = leftFace.addOrReplaceChild("head5_r4", CubeListBuilder.create().texOffs(40, 124).addBox(-0.9F, -1.625F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7539F, 2.2868F, -2.0647F, 0.0672F, 0.1448F, 0.0011F));

		PartDefinition head8_r4 = leftFace.addOrReplaceChild("head8_r4", CubeListBuilder.create().texOffs(30, 124).addBox(0.0394F, -2.5045F, -0.4964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.3842F, 0.7587F, -2.8495F, 1.7332F, 0.1037F, 0.0714F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(126, 52).addBox(-0.9536F, -0.5751F, 0.1179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5659F, -0.5183F, -2.6393F, 0.257F, 0.8705F, -0.189F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(126, 49).addBox(-0.0181F, -0.5751F, -0.182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5659F, -0.5183F, -2.6393F, 0.174F, -0.3302F, -0.4442F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(114, 34).addBox(0.1313F, -0.961F, 0.8237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5842F, 0.7587F, -3.8495F, 0.2297F, 0.3551F, -0.3353F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(93, 117).addBox(-1.7653F, -0.5383F, -0.7615F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5659F, -0.5183F, -2.6393F, 0.3422F, -0.7645F, -0.6407F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(113, 65).addBox(-0.5192F, -0.5383F, -0.7113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5659F, -0.5183F, -2.6393F, 0.5421F, -1.0821F, -0.8877F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(116, 105).addBox(-1.2812F, -0.5383F, -0.1373F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5659F, -0.5183F, -2.6393F, 0.263F, 0.3717F, -0.3015F));

		PartDefinition head30_r1 = leftFace.addOrReplaceChild("head30_r1", CubeListBuilder.create().texOffs(126, 28).addBox(-0.4959F, -0.6241F, -0.7536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(5, 122).addBox(-0.4959F, -0.4241F, -0.7536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.2365F, 0.3198F, -4.0124F, 1.5061F, 0.1482F, 0.0083F));

		PartDefinition head28_r1 = leftFace.addOrReplaceChild("head28_r1", CubeListBuilder.create().texOffs(121, 28).addBox(-0.4959F, -0.1971F, -0.4701F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2365F, 0.3198F, -4.0124F, 0.808F, 0.1482F, 0.0083F));

		PartDefinition head27_r1 = leftFace.addOrReplaceChild("head27_r1", CubeListBuilder.create().texOffs(121, 99).addBox(-0.4959F, -0.5762F, -0.1611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.2365F, 0.3198F, -4.0124F, -0.1083F, 0.1482F, 0.0083F));

		PartDefinition head26_r1 = leftFace.addOrReplaceChild("head26_r1", CubeListBuilder.create().texOffs(82, 127).addBox(-0.4959F, -0.8472F, -0.4406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2365F, 0.3198F, -4.0124F, -0.7628F, 0.1482F, 0.0083F));

		PartDefinition head26_r2 = leftFace.addOrReplaceChild("head26_r2", CubeListBuilder.create().texOffs(10, 122).addBox(-0.4959F, -0.6517F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(126, 21).addBox(-0.4959F, -0.7518F, -0.6393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.2365F, 0.3198F, -4.0124F, -1.1555F, 0.1482F, 0.0083F));

		PartDefinition head24_r1 = leftFace.addOrReplaceChild("head24_r1", CubeListBuilder.create().texOffs(125, 25).addBox(-0.4959F, -0.3748F, -0.4099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2365F, 0.3198F, -4.0124F, -2.5517F, 0.1482F, 0.0083F));

		PartDefinition head23_r1 = leftFace.addOrReplaceChild("head23_r1", CubeListBuilder.create().texOffs(38, 127).addBox(-0.4959F, -0.8789F, -0.3026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.2365F, 0.3198F, -4.0124F, 2.4661F, 0.1482F, 0.0083F));

		PartDefinition head12_r1 = leftFace.addOrReplaceChild("head12_r1", CubeListBuilder.create().texOffs(23, 125).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1567F, -0.7357F, -2.6441F, 0.2265F, 0.1549F, 0.0286F));

		PartDefinition head12_r2 = leftFace.addOrReplaceChild("head12_r2", CubeListBuilder.create().texOffs(121, 48).addBox(-0.0534F, -0.5522F, -1.4847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.3842F, 0.7587F, -2.8495F, -1.3048F, -0.0119F, -0.0293F));

		PartDefinition head12_r3 = leftFace.addOrReplaceChild("head12_r3", CubeListBuilder.create().texOffs(45, 125).addBox(0.0269F, -0.4808F, -1.0795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(18, 125).addBox(0.0269F, -0.7808F, -1.4795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3842F, 0.7587F, -2.8495F, -1.3006F, 0.1549F, 0.0286F));

		PartDefinition head10_r1 = leftFace.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(8, 125).addBox(0.0269F, 0.4846F, -0.1014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3842F, 0.7587F, -2.8495F, -2.7841F, 0.1549F, 0.0286F));

		PartDefinition head9_r1 = leftFace.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(113, 127).addBox(-0.0213F, -1.3788F, 0.6223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3842F, 0.7587F, -2.8495F, 2.1449F, 0.1025F, 0.0284F));

		PartDefinition head8_r5 = leftFace.addOrReplaceChild("head8_r5", CubeListBuilder.create().texOffs(126, 43).addBox(-0.0213F, -1.9679F, -1.581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3842F, 0.7587F, -2.8495F, 0.9232F, 0.1025F, 0.0284F));

		PartDefinition head7_r3 = leftFace.addOrReplaceChild("head7_r3", CubeListBuilder.create().texOffs(121, 34).addBox(-0.0213F, -0.5325F, -2.2672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3842F, 0.7587F, -2.8495F, 0.1814F, 0.1025F, 0.0284F));

		PartDefinition head6_r5 = leftFace.addOrReplaceChild("head6_r5", CubeListBuilder.create().texOffs(87, 127).addBox(-0.0584F, 0.6978F, -0.5212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3842F, 0.7587F, -2.8495F, -1.4483F, 0.1307F, 0.0079F));

		PartDefinition head5_r5 = leftFace.addOrReplaceChild("head5_r5", CubeListBuilder.create().texOffs(121, 31).addBox(-0.0584F, -0.4584F, -0.7406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3842F, 0.7587F, -2.8495F, 0.0353F, 0.1307F, 0.0079F));

		PartDefinition head29_r1 = leftFace.addOrReplaceChild("head29_r1", CubeListBuilder.create().texOffs(126, 40).addBox(-0.4977F, -0.645F, -0.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.431F, 0.2401F, -2.5397F, 1.2363F, 0.1664F, 0.0182F));

		PartDefinition head28_r2 = leftFace.addOrReplaceChild("head28_r2", CubeListBuilder.create().texOffs(78, 122).addBox(-0.4977F, -0.176F, -0.6808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.431F, 0.2401F, -2.5397F, -0.1164F, 0.1664F, 0.0182F));

		PartDefinition head27_r2 = leftFace.addOrReplaceChild("head27_r2", CubeListBuilder.create().texOffs(56, 122).addBox(-0.4977F, -0.5388F, -0.2011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.431F, 0.2401F, -2.5397F, -1.3381F, 0.1664F, 0.0182F));

		PartDefinition head26_r3 = leftFace.addOrReplaceChild("head26_r3", CubeListBuilder.create().texOffs(126, 37).addBox(-0.4977F, -0.7273F, -0.3487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.431F, 0.2401F, -2.5397F, -1.7744F, 0.1664F, 0.0182F));

		PartDefinition head25_r1 = leftFace.addOrReplaceChild("head25_r1", CubeListBuilder.create().texOffs(33, 127).addBox(-0.4977F, -0.5528F, -0.648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.431F, 0.2401F, -2.5397F, -2.6034F, 0.1664F, 0.0182F));

		PartDefinition head24_r2 = leftFace.addOrReplaceChild("head24_r2", CubeListBuilder.create().texOffs(126, 34).addBox(-0.4977F, -0.1578F, -0.6353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.431F, 0.2401F, -2.5397F, -2.6907F, 0.1664F, 0.0182F));

		PartDefinition head23_r2 = leftFace.addOrReplaceChild("head23_r2", CubeListBuilder.create().texOffs(126, 6).addBox(-0.4977F, -0.0759F, -0.4297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.431F, 0.2401F, -2.5397F, -3.0398F, 0.1664F, 0.0182F));

		PartDefinition head8_r6 = leftFace.addOrReplaceChild("head8_r6", CubeListBuilder.create().texOffs(121, 73).addBox(0.0087F, -1.2847F, 1.1671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5842F, 0.7587F, -3.6495F, -0.0118F, 0.149F, 0.0062F));

		PartDefinition head5_r6 = leftFace.addOrReplaceChild("head5_r6", CubeListBuilder.create().texOffs(108, 127).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2216F, 1.2021F, -1.7233F, -1.3291F, 0.1448F, 0.0011F));

		PartDefinition head4_r2 = leftFace.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(92, 127).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.078F, 1.3126F, -2.7068F, 0.1108F, 0.1448F, 0.0011F));

		PartDefinition head28_r3 = leftFace.addOrReplaceChild("head28_r3", CubeListBuilder.create().texOffs(122, 126).addBox(-0.3875F, -0.4342F, -0.3636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(126, 108).addBox(-0.5625F, -0.4342F, -0.3636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5144F, -0.1485F, -1.127F, 3.06F, 0.1091F, 0.0F));

		PartDefinition head26_r4 = leftFace.addOrReplaceChild("head26_r4", CubeListBuilder.create().texOffs(28, 127).addBox(-0.4875F, -0.2653F, -0.0807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(103, 126).addBox(-0.4875F, -0.1653F, -0.0807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5144F, -0.1485F, -1.127F, -2.5687F, 0.1091F, 0.0F));

		PartDefinition head21_r1 = leftFace.addOrReplaceChild("head21_r1", CubeListBuilder.create().texOffs(121, 45).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.6018F, -0.326F, -0.4439F, 0.634F, 0.1091F, 0.0F));

		PartDefinition head20_r1 = leftFace.addOrReplaceChild("head20_r1", CubeListBuilder.create().texOffs(121, 40).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5809F, 0.2424F, -0.6348F, 1.2449F, 0.1091F, 0.0F));

		PartDefinition head19_r1 = leftFace.addOrReplaceChild("head19_r1", CubeListBuilder.create().texOffs(121, 37).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.5236F, 0.5317F, -1.1574F, 2.0739F, 0.1091F, 0.0F));

		PartDefinition head18_r1 = leftFace.addOrReplaceChild("head18_r1", CubeListBuilder.create().texOffs(120, 25).addBox(-0.4875F, -0.8537F, -0.3902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5144F, -0.1485F, -1.127F, 2.8157F, 0.1091F, 0.0F));

		PartDefinition head24_r3 = leftFace.addOrReplaceChild("head24_r3", CubeListBuilder.create().texOffs(126, 97).addBox(-0.4875F, 0.0959F, -0.4966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5144F, -0.1485F, -1.127F, -2.0451F, 0.1091F, 0.0F));

		PartDefinition head23_r3 = leftFace.addOrReplaceChild("head23_r3", CubeListBuilder.create().texOffs(126, 100).addBox(-0.4875F, -0.1857F, -0.907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.5144F, -0.1485F, -1.127F, -1.5215F, 0.1091F, 0.0F));

		PartDefinition head22_r1 = leftFace.addOrReplaceChild("head22_r1", CubeListBuilder.create().texOffs(125, 117).addBox(-0.5F, -0.45F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5343F, -0.4982F, -1.0601F, -1.6088F, 0.1091F, 0.0F));

		PartDefinition head2_r1 = leftFace.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(80, 118).addBox(-0.1166F, -0.8268F, -0.1303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0629F, 0.0742F, -0.0044F));

		PartDefinition head3_r1 = leftFace.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(117, 116).addBox(-0.1166F, -0.8152F, -0.8335F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(124, 76).addBox(-0.1166F, -0.9902F, -0.5085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3029F, 0.0742F, -0.0044F));

		PartDefinition head4_r3 = leftFace.addOrReplaceChild("head4_r3", CubeListBuilder.create().texOffs(56, 118).addBox(-0.1166F, -0.8327F, -0.4776F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.8519F, 0.0742F, -0.0044F));

		PartDefinition head24_r4 = leftFace.addOrReplaceChild("head24_r4", CubeListBuilder.create().texOffs(58, 128).addBox(-0.5679F, -0.5006F, -0.3113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.3679F, -0.7043F, 0.6046F, 0.3398F, 0.1026F, -3.0853F));

		PartDefinition head23_r4 = leftFace.addOrReplaceChild("head23_r4", CubeListBuilder.create().texOffs(53, 128).addBox(-0.5883F, -0.5006F, -0.6814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3679F, -0.7043F, 0.6046F, 0.3666F, 0.3895F, -2.9767F));

		PartDefinition head22_r2 = leftFace.addOrReplaceChild("head22_r2", CubeListBuilder.create().texOffs(77, 128).addBox(-0.3587F, -0.5006F, -0.2922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(72, 128).addBox(-0.3587F, -0.5006F, -0.6922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.3679F, -0.7043F, 0.6046F, 0.3386F, 0.0615F, -3.0998F));

		PartDefinition head20_r2 = leftFace.addOrReplaceChild("head20_r2", CubeListBuilder.create().texOffs(121, 21).addBox(-0.5F, -0.375F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.7509F, -0.3913F, 0.4545F, -0.3697F, 0.0742F, -0.0044F));

		PartDefinition head19_r2 = leftFace.addOrReplaceChild("head19_r2", CubeListBuilder.create().texOffs(48, 128).addBox(-0.5F, -1.075F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(129, 75).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7307F, 0.237F, 0.1465F, -0.4569F, 0.0742F, -0.0044F));

		PartDefinition head17_r1 = leftFace.addOrReplaceChild("head17_r1", CubeListBuilder.create().texOffs(128, 103).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.7157F, 0.5699F, -0.0747F, 0.983F, 0.0742F, -0.0044F));

		PartDefinition head18_r2 = leftFace.addOrReplaceChild("head18_r2", CubeListBuilder.create().texOffs(0, 128).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(127, 126).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6948F, 0.5765F, -0.3567F, 0.6339F, 0.0742F, -0.0044F));

		PartDefinition head16_r1 = leftFace.addOrReplaceChild("head16_r1", CubeListBuilder.create().texOffs(67, 128).addBox(0.1019F, -1.2295F, -0.14F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.15F, 0.3F, 0.45F, 2.3792F, 0.0742F, -0.0044F));

		PartDefinition head8_r7 = leftFace.addOrReplaceChild("head8_r7", CubeListBuilder.create().texOffs(121, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4002F, -1.0905F, -0.193F, -1.4867F, 0.1102F, 0.0009F));

		PartDefinition head10_r2 = leftFace.addOrReplaceChild("head10_r2", CubeListBuilder.create().texOffs(43, 128).addBox(-0.5F, -0.3F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.6911F, -1.0038F, 0.2825F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition head9_r2 = leftFace.addOrReplaceChild("head9_r2", CubeListBuilder.create().texOffs(20, 128).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.6911F, -0.8835F, 0.664F, 1.2654F, 0.0F, 0.0F));

		PartDefinition head8_r8 = leftFace.addOrReplaceChild("head8_r8", CubeListBuilder.create().texOffs(121, 14).addBox(-0.5F, -1.5F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(129, 84).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.6911F, -0.5352F, 1.0747F, 2.8187F, 0.0F, 0.0F));

		PartDefinition head3_r2 = leftFace.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(55, 114).addBox(-0.0166F, -0.7265F, -0.1928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.3283F, 0.0742F, -0.0044F));

		PartDefinition rightFace = head1.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4094F, 0.403F, -0.323F, 0.0F, 0.0175F, 0.0F));

		PartDefinition head9_r3 = rightFace.addOrReplaceChild("head9_r3", CubeListBuilder.create().texOffs(125, 57).mirror().addBox(-1.0539F, -0.0874F, -2.1813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(55, 125).mirror().addBox(-1.1289F, -0.0874F, -1.4813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3842F, 0.7587F, -2.8495F, 0.1108F, -0.1012F, -0.0011F));

		PartDefinition head7_r4 = rightFace.addOrReplaceChild("head7_r4", CubeListBuilder.create().texOffs(50, 125).mirror().addBox(-1.1289F, -0.045F, -0.7624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3842F, 0.7587F, -2.8495F, 0.0672F, -0.1012F, -0.0011F));

		PartDefinition head7_r5 = rightFace.addOrReplaceChild("head7_r5", CubeListBuilder.create().texOffs(125, 60).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.406F, 1.1371F, -1.6868F, 0.1981F, -0.1448F, -0.0011F));

		PartDefinition head6_r6 = rightFace.addOrReplaceChild("head6_r6", CubeListBuilder.create().texOffs(40, 124).mirror().addBox(-0.1F, -1.625F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7539F, 2.2868F, -2.0647F, 0.0672F, -0.1448F, -0.0011F));

		PartDefinition head9_r4 = rightFace.addOrReplaceChild("head9_r4", CubeListBuilder.create().texOffs(30, 124).mirror().addBox(-1.0394F, -2.5045F, -0.4964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.3842F, 0.7587F, -2.8495F, 1.7332F, -0.1037F, -0.0714F));

		PartDefinition cube_r120 = rightFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(126, 52).mirror().addBox(-0.0464F, -0.5751F, 0.1179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.5659F, -0.5183F, -2.6393F, 0.257F, -0.8705F, 0.189F));

		PartDefinition cube_r121 = rightFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(126, 49).mirror().addBox(-0.9819F, -0.5751F, -0.182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5659F, -0.5183F, -2.6393F, 0.174F, 0.3302F, 0.4442F));

		PartDefinition cube_r122 = rightFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(114, 34).mirror().addBox(-1.1313F, -0.961F, 0.8237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5842F, 0.7587F, -3.8495F, 0.2297F, -0.3551F, 0.3353F));

		PartDefinition cube_r123 = rightFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(93, 117).mirror().addBox(-0.2347F, -0.5383F, -0.7615F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.5659F, -0.5183F, -2.6393F, 0.3422F, 0.7645F, 0.6407F));

		PartDefinition cube_r124 = rightFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(113, 65).mirror().addBox(-0.4808F, -0.5383F, -0.7113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5659F, -0.5183F, -2.6393F, 0.5421F, 1.0821F, 0.8877F));

		PartDefinition cube_r125 = rightFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(116, 105).mirror().addBox(-0.7188F, -0.5383F, -0.1373F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.5659F, -0.5183F, -2.6393F, 0.263F, -0.3717F, 0.3015F));

		PartDefinition head31_r1 = rightFace.addOrReplaceChild("head31_r1", CubeListBuilder.create().texOffs(126, 28).mirror().addBox(-0.5041F, -0.6241F, -0.7536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(5, 122).mirror().addBox(-0.5041F, -0.4241F, -0.7536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.2365F, 0.3198F, -4.0124F, 1.5061F, -0.1482F, -0.0083F));

		PartDefinition head29_r2 = rightFace.addOrReplaceChild("head29_r2", CubeListBuilder.create().texOffs(121, 28).mirror().addBox(-0.5041F, -0.1971F, -0.4701F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2365F, 0.3198F, -4.0124F, 0.808F, -0.1482F, -0.0083F));

		PartDefinition head28_r4 = rightFace.addOrReplaceChild("head28_r4", CubeListBuilder.create().texOffs(121, 99).mirror().addBox(-0.5041F, -0.5762F, -0.1611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.2365F, 0.3198F, -4.0124F, -0.1083F, -0.1482F, -0.0083F));

		PartDefinition head27_r3 = rightFace.addOrReplaceChild("head27_r3", CubeListBuilder.create().texOffs(82, 127).mirror().addBox(-0.5041F, -0.8472F, -0.4406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2365F, 0.3198F, -4.0124F, -0.7628F, -0.1482F, -0.0083F));

		PartDefinition head27_r4 = rightFace.addOrReplaceChild("head27_r4", CubeListBuilder.create().texOffs(10, 122).mirror().addBox(-0.5041F, -0.6517F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(126, 21).mirror().addBox(-0.5041F, -0.7518F, -0.6393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.2365F, 0.3198F, -4.0124F, -1.1555F, -0.1482F, -0.0083F));

		PartDefinition head25_r2 = rightFace.addOrReplaceChild("head25_r2", CubeListBuilder.create().texOffs(125, 25).mirror().addBox(-0.5041F, -0.3748F, -0.4099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2365F, 0.3198F, -4.0124F, -2.5517F, -0.1482F, -0.0083F));

		PartDefinition head24_r5 = rightFace.addOrReplaceChild("head24_r5", CubeListBuilder.create().texOffs(38, 127).mirror().addBox(-0.5041F, -0.8789F, -0.3026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.2365F, 0.3198F, -4.0124F, 2.4661F, -0.1482F, -0.0083F));

		PartDefinition head13_r1 = rightFace.addOrReplaceChild("head13_r1", CubeListBuilder.create().texOffs(23, 125).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1567F, -0.7357F, -2.6441F, 0.2265F, -0.1549F, -0.0286F));

		PartDefinition head13_r2 = rightFace.addOrReplaceChild("head13_r2", CubeListBuilder.create().texOffs(121, 48).mirror().addBox(-0.9466F, -0.5522F, -1.4847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.3842F, 0.7587F, -2.8495F, -1.3048F, 0.0119F, 0.0293F));

		PartDefinition head13_r3 = rightFace.addOrReplaceChild("head13_r3", CubeListBuilder.create().texOffs(45, 125).mirror().addBox(-1.0269F, -0.4808F, -1.0795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(18, 125).mirror().addBox(-1.0269F, -0.7808F, -1.4795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3842F, 0.7587F, -2.8495F, -1.3006F, -0.1549F, -0.0286F));

		PartDefinition head11_r1 = rightFace.addOrReplaceChild("head11_r1", CubeListBuilder.create().texOffs(8, 125).mirror().addBox(-1.0269F, 0.4846F, -0.1014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3842F, 0.7587F, -2.8495F, -2.7841F, -0.1549F, -0.0286F));

		PartDefinition head10_r3 = rightFace.addOrReplaceChild("head10_r3", CubeListBuilder.create().texOffs(113, 127).mirror().addBox(-0.9787F, -1.3788F, 0.6223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3842F, 0.7587F, -2.8495F, 2.1449F, -0.1025F, -0.0284F));

		PartDefinition head9_r5 = rightFace.addOrReplaceChild("head9_r5", CubeListBuilder.create().texOffs(126, 43).mirror().addBox(-0.9787F, -1.9679F, -1.581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3842F, 0.7587F, -2.8495F, 0.9232F, -0.1025F, -0.0284F));

		PartDefinition head8_r9 = rightFace.addOrReplaceChild("head8_r9", CubeListBuilder.create().texOffs(121, 34).mirror().addBox(-0.9787F, -0.5325F, -2.2672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3842F, 0.7587F, -2.8495F, 0.1814F, -0.1025F, -0.0284F));

		PartDefinition head7_r6 = rightFace.addOrReplaceChild("head7_r6", CubeListBuilder.create().texOffs(87, 127).mirror().addBox(-0.9416F, 0.6978F, -0.5212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3842F, 0.7587F, -2.8495F, -1.4483F, -0.1307F, -0.0079F));

		PartDefinition head6_r7 = rightFace.addOrReplaceChild("head6_r7", CubeListBuilder.create().texOffs(121, 31).mirror().addBox(-0.9416F, -0.4584F, -0.7406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3842F, 0.7587F, -2.8495F, 0.0353F, -0.1307F, -0.0079F));

		PartDefinition head30_r2 = rightFace.addOrReplaceChild("head30_r2", CubeListBuilder.create().texOffs(126, 40).mirror().addBox(-0.5023F, -0.645F, -0.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.431F, 0.2401F, -2.5397F, 1.2363F, -0.1664F, -0.0182F));

		PartDefinition head29_r3 = rightFace.addOrReplaceChild("head29_r3", CubeListBuilder.create().texOffs(78, 122).mirror().addBox(-0.5023F, -0.176F, -0.6808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.431F, 0.2401F, -2.5397F, -0.1164F, -0.1664F, -0.0182F));

		PartDefinition head28_r5 = rightFace.addOrReplaceChild("head28_r5", CubeListBuilder.create().texOffs(56, 122).mirror().addBox(-0.5023F, -0.5388F, -0.2011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.431F, 0.2401F, -2.5397F, -1.3381F, -0.1664F, -0.0182F));

		PartDefinition head27_r5 = rightFace.addOrReplaceChild("head27_r5", CubeListBuilder.create().texOffs(126, 37).mirror().addBox(-0.5023F, -0.7273F, -0.3487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.431F, 0.2401F, -2.5397F, -1.7744F, -0.1664F, -0.0182F));

		PartDefinition head26_r5 = rightFace.addOrReplaceChild("head26_r5", CubeListBuilder.create().texOffs(33, 127).mirror().addBox(-0.5023F, -0.5528F, -0.648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.431F, 0.2401F, -2.5397F, -2.6034F, -0.1664F, -0.0182F));

		PartDefinition head25_r3 = rightFace.addOrReplaceChild("head25_r3", CubeListBuilder.create().texOffs(126, 34).mirror().addBox(-0.5023F, -0.1578F, -0.6353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.431F, 0.2401F, -2.5397F, -2.6907F, -0.1664F, -0.0182F));

		PartDefinition head24_r6 = rightFace.addOrReplaceChild("head24_r6", CubeListBuilder.create().texOffs(126, 6).mirror().addBox(-0.5023F, -0.0759F, -0.4297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.431F, 0.2401F, -2.5397F, -3.0398F, -0.1664F, -0.0182F));

		PartDefinition head9_r6 = rightFace.addOrReplaceChild("head9_r6", CubeListBuilder.create().texOffs(121, 73).mirror().addBox(-1.0088F, -1.2847F, 1.1671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5842F, 0.7587F, -3.6495F, -0.0118F, -0.149F, -0.0062F));

		PartDefinition head6_r8 = rightFace.addOrReplaceChild("head6_r8", CubeListBuilder.create().texOffs(108, 127).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2216F, 1.2021F, -1.7233F, -1.3291F, -0.1448F, -0.0011F));

		PartDefinition head5_r7 = rightFace.addOrReplaceChild("head5_r7", CubeListBuilder.create().texOffs(92, 127).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.078F, 1.3126F, -2.7068F, 0.1108F, -0.1448F, -0.0011F));

		PartDefinition head29_r4 = rightFace.addOrReplaceChild("head29_r4", CubeListBuilder.create().texOffs(122, 126).mirror().addBox(-0.6125F, -0.4342F, -0.3636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(126, 108).mirror().addBox(-0.4375F, -0.4342F, -0.3636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5144F, -0.1485F, -1.127F, 3.06F, -0.1091F, 0.0F));

		PartDefinition head27_r6 = rightFace.addOrReplaceChild("head27_r6", CubeListBuilder.create().texOffs(28, 127).mirror().addBox(-0.5125F, -0.2653F, -0.0807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(103, 126).mirror().addBox(-0.5125F, -0.1653F, -0.0807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.5144F, -0.1485F, -1.127F, -2.5687F, -0.1091F, 0.0F));

		PartDefinition head22_r3 = rightFace.addOrReplaceChild("head22_r3", CubeListBuilder.create().texOffs(121, 45).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.6018F, -0.326F, -0.4439F, 0.634F, -0.1091F, 0.0F));

		PartDefinition head21_r2 = rightFace.addOrReplaceChild("head21_r2", CubeListBuilder.create().texOffs(121, 40).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.5809F, 0.2424F, -0.6348F, 1.2449F, -0.1091F, 0.0F));

		PartDefinition head20_r3 = rightFace.addOrReplaceChild("head20_r3", CubeListBuilder.create().texOffs(121, 37).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.5236F, 0.5317F, -1.1574F, 2.0739F, -0.1091F, 0.0F));

		PartDefinition head19_r3 = rightFace.addOrReplaceChild("head19_r3", CubeListBuilder.create().texOffs(120, 25).mirror().addBox(-0.5125F, -0.8537F, -0.3902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.5144F, -0.1485F, -1.127F, 2.8157F, -0.1091F, 0.0F));

		PartDefinition head25_r4 = rightFace.addOrReplaceChild("head25_r4", CubeListBuilder.create().texOffs(126, 97).mirror().addBox(-0.5125F, 0.0959F, -0.4966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5144F, -0.1485F, -1.127F, -2.0451F, -0.1091F, 0.0F));

		PartDefinition head24_r7 = rightFace.addOrReplaceChild("head24_r7", CubeListBuilder.create().texOffs(126, 100).mirror().addBox(-0.5125F, -0.1857F, -0.907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.5144F, -0.1485F, -1.127F, -1.5215F, -0.1091F, 0.0F));

		PartDefinition head23_r5 = rightFace.addOrReplaceChild("head23_r5", CubeListBuilder.create().texOffs(125, 117).mirror().addBox(-0.5F, -0.45F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.5343F, -0.4982F, -1.0601F, -1.6088F, -0.1091F, 0.0F));

		PartDefinition head3_r3 = rightFace.addOrReplaceChild("head3_r3", CubeListBuilder.create().texOffs(80, 118).mirror().addBox(-0.8834F, -0.8268F, -0.1303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0629F, -0.0742F, 0.0044F));

		PartDefinition head4_r4 = rightFace.addOrReplaceChild("head4_r4", CubeListBuilder.create().texOffs(117, 116).mirror().addBox(-0.8834F, -0.8152F, -0.8335F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(124, 76).mirror().addBox(-0.8834F, -0.9902F, -0.5085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3029F, -0.0742F, 0.0044F));

		PartDefinition head5_r8 = rightFace.addOrReplaceChild("head5_r8", CubeListBuilder.create().texOffs(56, 118).mirror().addBox(-0.8834F, -0.8327F, -0.4776F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.8519F, -0.0742F, 0.0044F));

		PartDefinition head25_r5 = rightFace.addOrReplaceChild("head25_r5", CubeListBuilder.create().texOffs(58, 128).mirror().addBox(-0.4321F, -0.5006F, -0.3113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.3679F, -0.7043F, 0.6046F, 0.3398F, -0.1026F, 3.0853F));

		PartDefinition head24_r8 = rightFace.addOrReplaceChild("head24_r8", CubeListBuilder.create().texOffs(53, 128).mirror().addBox(-0.4117F, -0.5006F, -0.6814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3679F, -0.7043F, 0.6046F, 0.3666F, -0.3895F, 2.9767F));

		PartDefinition head23_r6 = rightFace.addOrReplaceChild("head23_r6", CubeListBuilder.create().texOffs(77, 128).mirror().addBox(-0.6413F, -0.5006F, -0.2922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(72, 128).mirror().addBox(-0.6413F, -0.5006F, -0.6922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.3679F, -0.7043F, 0.6046F, 0.3386F, -0.0615F, 3.0998F));

		PartDefinition head21_r3 = rightFace.addOrReplaceChild("head21_r3", CubeListBuilder.create().texOffs(121, 21).mirror().addBox(-0.5F, -0.375F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.7509F, -0.3913F, 0.4545F, -0.3697F, -0.0742F, 0.0044F));

		PartDefinition head20_r4 = rightFace.addOrReplaceChild("head20_r4", CubeListBuilder.create().texOffs(48, 128).mirror().addBox(-0.5F, -1.075F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(129, 75).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7307F, 0.237F, 0.1465F, -0.4569F, -0.0742F, 0.0044F));

		PartDefinition head18_r3 = rightFace.addOrReplaceChild("head18_r3", CubeListBuilder.create().texOffs(128, 103).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.7157F, 0.5699F, -0.0747F, 0.983F, -0.0742F, 0.0044F));

		PartDefinition head19_r4 = rightFace.addOrReplaceChild("head19_r4", CubeListBuilder.create().texOffs(0, 128).mirror().addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(127, 126).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6948F, 0.5765F, -0.3567F, 0.6339F, -0.0742F, 0.0044F));

		PartDefinition head17_r2 = rightFace.addOrReplaceChild("head17_r2", CubeListBuilder.create().texOffs(67, 128).mirror().addBox(-1.1019F, -1.2295F, -0.14F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 0.3F, 0.45F, 2.3792F, -0.0742F, 0.0044F));

		PartDefinition head9_r7 = rightFace.addOrReplaceChild("head9_r7", CubeListBuilder.create().texOffs(121, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4002F, -1.0905F, -0.193F, -1.4867F, -0.1102F, -0.0009F));

		PartDefinition head11_r2 = rightFace.addOrReplaceChild("head11_r2", CubeListBuilder.create().texOffs(43, 128).mirror().addBox(-0.5F, -0.3F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.6911F, -1.0038F, 0.2825F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition head10_r4 = rightFace.addOrReplaceChild("head10_r4", CubeListBuilder.create().texOffs(20, 128).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.6911F, -0.8835F, 0.664F, 1.2654F, 0.0F, 0.0F));

		PartDefinition head9_r8 = rightFace.addOrReplaceChild("head9_r8", CubeListBuilder.create().texOffs(121, 14).mirror().addBox(-0.5F, -1.5F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(129, 84).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.6911F, -0.5352F, 1.0747F, 2.8187F, 0.0F, 0.0F));

		PartDefinition head4_r5 = rightFace.addOrReplaceChild("head4_r5", CubeListBuilder.create().texOffs(55, 114).mirror().addBox(-0.9834F, -0.7265F, -0.1928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.3283F, -0.0742F, 0.0044F));

		PartDefinition upperlegL2 = basin.addOrReplaceChild("upperlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 1.8533F, 0.618F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg7_r1 = upperlegL2.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(94, 15).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.9762F, 3.1054F, 1.0036F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = upperlegL2.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(94, 5).addBox(-1.5F, -1.8F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 13.9132F, 1.1841F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upperleg6_r2 = upperlegL2.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(99, 95).addBox(-1.0F, -1.8F, -1.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 12.1697F, 2.0852F, 0.5236F, 0.0F, 0.0F));

		PartDefinition upperleg6_r3 = upperlegL2.addOrReplaceChild("upperleg6_r3", CubeListBuilder.create().texOffs(105, 5).addBox(-1.5F, 0.0692F, -0.0528F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 12.1313F, 0.3151F, 0.4538F, 0.0F, 0.0F));

		PartDefinition upperleg9_r1 = upperlegL2.addOrReplaceChild("upperleg9_r1", CubeListBuilder.create().texOffs(9, 102).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6291F, 1.2536F, -1.4835F, 0.0F, 0.0F));

		PartDefinition upperleg8_r1 = upperlegL2.addOrReplaceChild("upperleg8_r1", CubeListBuilder.create().texOffs(99, 101).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 4.3509F, -0.9903F, -0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg7_r2 = upperlegL2.addOrReplaceChild("upperleg7_r2", CubeListBuilder.create().texOffs(90, 101).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.349F, -0.9031F, 0.0436F, 0.0F, 0.0F));

		PartDefinition upperleg6_r4 = upperlegL2.addOrReplaceChild("upperleg6_r4", CubeListBuilder.create().texOffs(31, 95).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 9.3234F, -0.5115F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperlegL2.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(9, 96).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.2212F, 0.2649F, 0.2618F, 0.0F, 0.0F));

		PartDefinition upperleg8_r2 = upperlegL2.addOrReplaceChild("upperleg8_r2", CubeListBuilder.create().texOffs(107, 21).addBox(-0.5F, -2.075F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.3F, 5.1112F, 1.534F, 2.5656F, 0.0F, 0.0F));

		PartDefinition upperleg7_r3 = upperlegL2.addOrReplaceChild("upperleg7_r3", CubeListBuilder.create().texOffs(88, 106).addBox(-0.5F, -1.8F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 4.3915F, 2.407F, 1.4748F, 0.0F, 0.0F));

		PartDefinition upperleg6_r5 = upperlegL2.addOrReplaceChild("upperleg6_r5", CubeListBuilder.create().texOffs(40, 68).addBox(-0.5F, 0.2F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.3F, 3.6377F, 0.5118F, 0.9948F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperlegL2.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(48, 60).addBox(-0.5F, -4.7753F, -0.3933F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 7.3247F, 1.5254F, 0.4276F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperlegL2.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(79, 59).addBox(-1.5F, -1.4F, -0.7F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4531F, -0.6839F, 0.5585F, 0.0F, 0.0F));

		PartDefinition lowerlegL2 = upperlegL2.addOrReplaceChild("lowerlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 13.4721F, 3.7335F, 0.9105F, 0.0F, 0.0F));

		PartDefinition lowerleg7_r1 = lowerlegL2.addOrReplaceChild("lowerleg7_r1", CubeListBuilder.create().texOffs(114, 10).addBox(-2.2F, -0.9F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 2.1618F, 0.2657F, 1.5708F, -0.192F, 1.5708F));

		PartDefinition lowerleg5_r1 = lowerlegL2.addOrReplaceChild("lowerleg5_r1", CubeListBuilder.create().texOffs(25, 48).addBox(-1.6F, -4.05F, 0.35F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1F, 5.9355F, -0.2261F, 1.5708F, 1.5097F, 1.5708F));

		PartDefinition lowerleg5_r2 = lowerlegL2.addOrReplaceChild("lowerleg5_r2", CubeListBuilder.create().texOffs(83, 77).addBox(-1.9607F, -0.1526F, -2.85F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.06F)), PartPose.offsetAndRotation(0.4F, -0.1328F, 0.0977F, -1.5708F, 1.2915F, -1.5708F));

		PartDefinition lowerleg5_r3 = lowerlegL2.addOrReplaceChild("lowerleg5_r3", CubeListBuilder.create().texOffs(83, 96).addBox(-1.0071F, -0.045F, -1.85F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, 1.925F, -1.7489F, 1.5708F, 1.1868F, 1.5708F));

		PartDefinition lowerleg4_r1 = lowerlegL2.addOrReplaceChild("lowerleg4_r1", CubeListBuilder.create().texOffs(92, 51).addBox(-0.9F, -13.45F, -2.85F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, 13.225F, 0.1511F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition lowerleg5_r4 = lowerlegL2.addOrReplaceChild("lowerleg5_r4", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, 5.75F, -1.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.012F))
				.texOffs(83, 85).addBox(0.8F, -1.25F, -1.85F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.4255F, 1.2003F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition lowerleg3_r1 = lowerlegL2.addOrReplaceChild("lowerleg3_r1", CubeListBuilder.create().texOffs(24, 82).addBox(-0.1F, -1.25F, -1.85F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1F, 2.4255F, 1.2003F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition feetL2 = lowerlegL2.addOrReplaceChild("feetL2", CubeListBuilder.create().texOffs(72, 77).addBox(-1.5F, -0.1003F, -1.0004F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 10.7171F, 1.0924F, -0.6355F, 0.0F, 0.0F));

		PartDefinition toes4_r1 = feetL2.addOrReplaceChild("toes4_r1", CubeListBuilder.create().texOffs(45, 79).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9971F, 3.6024F, 0.8895F, 2.4345F, -0.3421F, 0.2142F));

		PartDefinition toesL3 = feetL2.addOrReplaceChild("toesL3", CubeListBuilder.create().texOffs(58, 39).addBox(-2.9F, -0.9235F, -3.6059F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 5.3106F, 0.6736F, 0.5505F, 0.0F, 0.0F));

		PartDefinition toesL4 = toesL3.addOrReplaceChild("toesL4", CubeListBuilder.create().texOffs(21, 68).addBox(-2.9F, -0.9235F, -3.6059F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, -0.5142F, 0.0F, 0.0F));

		PartDefinition upperlegL3 = basin.addOrReplaceChild("upperlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 1.8533F, 0.618F, -0.48F, 0.0F, 0.0F));

		PartDefinition upperleg8_r3 = upperlegL3.addOrReplaceChild("upperleg8_r3", CubeListBuilder.create().texOffs(94, 20).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.9762F, 3.1054F, 1.0036F, 0.0F, 0.0F));

		PartDefinition upperleg7_r4 = upperlegL3.addOrReplaceChild("upperleg7_r4", CubeListBuilder.create().texOffs(94, 10).addBox(-1.5F, -1.8F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 13.9132F, 1.1841F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upperleg7_r5 = upperlegL3.addOrReplaceChild("upperleg7_r5", CubeListBuilder.create().texOffs(18, 100).addBox(-1.0F, -1.8F, -1.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 12.1697F, 2.0852F, 0.5236F, 0.0F, 0.0F));

		PartDefinition upperleg7_r6 = upperlegL3.addOrReplaceChild("upperleg7_r6", CubeListBuilder.create().texOffs(105, 10).addBox(-0.5F, 0.0692F, -0.0528F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 12.1313F, 0.3151F, 0.4538F, 0.0F, 0.0F));

		PartDefinition upperleg10_r1 = upperlegL3.addOrReplaceChild("upperleg10_r1", CubeListBuilder.create().texOffs(103, 50).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6291F, 1.2536F, -1.4835F, 0.0F, 0.0F));

		PartDefinition upperleg9_r2 = upperlegL3.addOrReplaceChild("upperleg9_r2", CubeListBuilder.create().texOffs(103, 45).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 4.3509F, -0.9903F, -0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg8_r4 = upperlegL3.addOrReplaceChild("upperleg8_r4", CubeListBuilder.create().texOffs(103, 29).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.349F, -0.9031F, 0.0436F, 0.0F, 0.0F));

		PartDefinition upperleg7_r7 = upperlegL3.addOrReplaceChild("upperleg7_r7", CubeListBuilder.create().texOffs(90, 95).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 9.3234F, -0.5115F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg6_r6 = upperlegL3.addOrReplaceChild("upperleg6_r6", CubeListBuilder.create().texOffs(98, 36).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.2212F, 0.2649F, 0.2618F, 0.0F, 0.0F));

		PartDefinition upperleg9_r3 = upperlegL3.addOrReplaceChild("upperleg9_r3", CubeListBuilder.create().texOffs(107, 36).addBox(-0.5F, -2.075F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.3F, 5.1112F, 1.534F, 2.5656F, 0.0F, 0.0F));

		PartDefinition upperleg8_r5 = upperlegL3.addOrReplaceChild("upperleg8_r5", CubeListBuilder.create().texOffs(102, 106).addBox(-0.5F, -1.8F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 4.3915F, 2.407F, 1.4748F, 0.0F, 0.0F));

		PartDefinition upperleg7_r8 = upperlegL3.addOrReplaceChild("upperleg7_r8", CubeListBuilder.create().texOffs(53, 105).addBox(-0.5F, 0.2F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.3F, 3.6377F, 0.5118F, 0.9948F, 0.0F, 0.0F));

		PartDefinition upperleg6_r7 = upperlegL3.addOrReplaceChild("upperleg6_r7", CubeListBuilder.create().texOffs(46, 105).addBox(-0.5F, -4.7753F, -0.3933F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 7.3247F, 1.5254F, 0.4276F, 0.0F, 0.0F));

		PartDefinition upperleg5_r3 = upperlegL3.addOrReplaceChild("upperleg5_r3", CubeListBuilder.create().texOffs(0, 81).addBox(-1.5F, -1.4F, -0.7F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4531F, -0.6839F, 0.5585F, 0.0F, 0.0F));

		PartDefinition lowerlegL3 = upperlegL3.addOrReplaceChild("lowerlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 13.4721F, 3.7335F, 1.0414F, 0.0F, 0.0F));

		PartDefinition lowerleg8_r1 = lowerlegL3.addOrReplaceChild("lowerleg8_r1", CubeListBuilder.create().texOffs(28, 114).addBox(0.2F, -0.9F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 2.1618F, 0.2657F, 1.5708F, 0.192F, -1.5708F));

		PartDefinition lowerleg6_r1 = lowerlegL3.addOrReplaceChild("lowerleg6_r1", CubeListBuilder.create().texOffs(60, 99).addBox(0.6F, -4.05F, 0.35F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1F, 5.9355F, -0.2261F, 1.5708F, -1.5097F, -1.5708F));

		PartDefinition lowerleg6_r2 = lowerlegL3.addOrReplaceChild("lowerleg6_r2", CubeListBuilder.create().texOffs(56, 85).addBox(-0.0393F, -0.1526F, -2.85F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.06F)), PartPose.offsetAndRotation(-0.4F, -0.1328F, 0.0977F, -1.5708F, -1.2915F, 1.5708F));

		PartDefinition lowerleg6_r3 = lowerlegL3.addOrReplaceChild("lowerleg6_r3", CubeListBuilder.create().texOffs(67, 97).addBox(0.0071F, -0.045F, -1.85F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 1.925F, -1.7489F, 1.5708F, -1.1868F, -1.5708F));

		PartDefinition lowerleg5_r5 = lowerlegL3.addOrReplaceChild("lowerleg5_r5", CubeListBuilder.create().texOffs(56, 93).addBox(-1.1F, -13.45F, -2.85F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, 13.225F, 0.1511F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition lowerleg6_r4 = lowerlegL3.addOrReplaceChild("lowerleg6_r4", CubeListBuilder.create().texOffs(27, 101).addBox(-2.0F, 5.75F, -1.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.012F))
				.texOffs(67, 86).addBox(-1.8F, -1.25F, -1.85F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 2.4255F, 1.2003F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition lowerleg4_r2 = lowerlegL3.addOrReplaceChild("lowerleg4_r2", CubeListBuilder.create().texOffs(86, 66).addBox(-0.9F, -1.25F, -1.85F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1F, 2.4255F, 1.2003F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition feetL3 = lowerlegL3.addOrReplaceChild("feetL3", CubeListBuilder.create().texOffs(34, 79).addBox(-1.5F, -0.1003F, -1.0004F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 10.7171F, 1.0924F, -0.6355F, 0.0F, 0.0F));

		PartDefinition toes5_r1 = feetL3.addOrReplaceChild("toes5_r1", CubeListBuilder.create().texOffs(13, 82).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9971F, 3.6024F, 0.8895F, 2.4345F, 0.3421F, -0.2142F));

		PartDefinition toesL2 = feetL3.addOrReplaceChild("toesL2", CubeListBuilder.create().texOffs(62, 20).addBox(-2.1F, -0.9235F, -3.6059F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 5.3106F, 0.6736F, 0.4196F, 0.0F, 0.0F));

		PartDefinition toesL5 = toesL2.addOrReplaceChild("toesL5", CubeListBuilder.create().texOffs(15, 75).addBox(-2.1F, -0.9235F, -3.6059F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, -0.2087F, 0.0F, 0.0F));

		PartDefinition bone3 = basin.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.8F, -1.7091F, 4.7942F));

		PartDefinition basin_r18 = bone3.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(105, 0).addBox(-0.4981F, 0.8114F, -4.7595F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7163F, -0.4386F, -1.9238F, -0.3316F, 0.0F, 0.0349F));

		PartDefinition basin_r19 = bone3.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(25, 122).addBox(-0.4981F, -1.7827F, -3.1541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(110, 89).addBox(-0.4981F, -2.6827F, -4.1541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.7163F, -0.4386F, -1.9238F, 0.4102F, 0.0F, 0.0349F));

		PartDefinition basin_r20 = bone3.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(20, 122).addBox(-0.4981F, 2.4192F, -1.0738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7163F, -0.4386F, -1.9238F, -1.2043F, 0.0F, 0.0349F));

		PartDefinition basin_r21 = bone3.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(22, 93).addBox(-0.4981F, 0.0079F, 0.0182F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6599F, -2.0551F, -4.9609F, 0.1134F, 0.0F, 0.0349F));

		PartDefinition basin_r22 = bone3.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(121, 85).addBox(-0.4981F, -2.7738F, 1.9405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7163F, -0.4386F, -1.9238F, -0.4189F, 0.0F, 0.0349F));

		PartDefinition basin_r23 = bone3.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(10, 117).addBox(-0.5F, -1.0F, -0.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7075F, -0.638F, -0.1392F, -0.8552F, 0.0F, 0.0349F));

		PartDefinition basin_r24 = bone3.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(116, 108).addBox(-0.5F, -1.0F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7075F, -0.638F, -0.1392F, -1.5533F, 0.0F, 0.0349F));

		PartDefinition basin_r25 = bone3.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(43, 114).addBox(-0.5F, -1.15F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7074F, -0.642F, 0.734F, -1.3352F, 0.0F, 0.0349F));

		PartDefinition basin_r26 = bone3.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(126, 31).addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6951F, -0.9917F, 1.7455F, -0.9861F, 0.0F, 0.0349F));

		PartDefinition basin_r27 = bone3.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(101, 89).addBox(-0.4981F, -1.945F, -0.2268F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7163F, -0.4386F, -1.9238F, -0.0698F, 0.0F, 0.0349F));

		PartDefinition basin_r28 = bone3.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(48, 122).addBox(-0.5F, 2.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7168F, 0.1692F, -2.183F, 0.3927F, 0.0F, 0.0611F));

		PartDefinition basin_r29 = bone3.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(74, 93).addBox(-0.5F, -0.3F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7168F, 0.1692F, -2.183F, -0.48F, 0.0F, 0.0611F));

		PartDefinition basin_r30 = bone3.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(83, 124).addBox(-1.03F, 7.5001F, -3.7871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F))
				.texOffs(124, 79).addBox(-1.03F, 8.0001F, -3.7871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0138F)), PartPose.offsetAndRotation(-0.6539F, 7.0388F, -7.799F, 0.0766F, 0.1071F, 0.1762F));

		PartDefinition basin_r31 = bone3.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(126, 46).addBox(-1.03F, 8.6326F, 0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0134F))
				.texOffs(126, 12).addBox(-1.03F, 8.1326F, 0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(98, 111).addBox(-1.03F, 4.2326F, 0.3766F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0139F))
				.texOffs(65, 114).addBox(-1.03F, 1.2326F, 0.3766F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0134F)), PartPose.offsetAndRotation(-0.6539F, 7.0388F, -7.799F, -0.447F, 0.1071F, 0.1762F));

		PartDefinition basin_r32 = bone3.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(105, 84).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.3255F, 8.0668F, -7.3143F, -1.1451F, 0.1071F, 0.1762F));

		PartDefinition basin_r33 = bone3.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(51, 94).addBox(-0.5F, -2.725F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.7178F, 9.7285F, -8.1986F, -0.3161F, 0.1071F, 0.1762F));

		PartDefinition basin_r34 = bone3.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(5, 118).addBox(-1.03F, -0.4251F, -0.401F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6539F, 7.0388F, -7.799F, -0.0979F, 0.1071F, 0.1762F));

		PartDefinition basin_r35 = bone3.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5005F, -0.1033F, -5.1652F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0134F)), PartPose.offsetAndRotation(-0.917F, 3.4498F, -3.4121F, 0.2182F, 0.0F, 0.0611F));

		PartDefinition basin_r36 = bone3.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(103, 55).addBox(-0.5F, 1.775F, -2.025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9719F, 4.3404F, -5.5584F, -0.829F, 0.0F, 0.0611F));

		PartDefinition basin_r37 = bone3.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(92, 57).addBox(-0.5F, -0.325F, -3.325F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9719F, 4.3404F, -5.5584F, -0.0436F, 0.0F, 0.0611F));

		PartDefinition basin_r38 = bone3.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(45, 87).addBox(-0.5F, -0.425F, -2.425F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9719F, 4.3404F, -5.5584F, -0.8727F, 0.0F, 0.0611F));

		PartDefinition basin_r39 = bone3.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(124, 88).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.3383F, 12.0194F, 3.6041F, -1.8926F, -0.2613F, 0.133F));

		PartDefinition basin_r40 = bone3.addOrReplaceChild("basin_r40", CubeListBuilder.create().texOffs(88, 124).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.2831F, 12.8171F, 3.0035F, -0.6709F, -0.2613F, 0.133F));

		PartDefinition basin_r41 = bone3.addOrReplaceChild("basin_r41", CubeListBuilder.create().texOffs(23, 106).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.756F, 12.7667F, 1.0749F, -0.06F, -0.2613F, 0.133F));

		PartDefinition basin_r42 = bone3.addOrReplaceChild("basin_r42", CubeListBuilder.create().texOffs(114, 78).addBox(-0.5F, -1.5F, -0.975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.6144F, 11.0166F, 1.4183F, 0.3763F, -0.2613F, 0.133F));

		PartDefinition basin_r43 = bone3.addOrReplaceChild("basin_r43", CubeListBuilder.create().texOffs(75, 114).addBox(-0.5F, -0.1F, -1.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 114).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.3619F, 9.1903F, 1.3884F, 0.7254F, -0.2613F, 0.133F));

		PartDefinition basin_r44 = bone3.addOrReplaceChild("basin_r44", CubeListBuilder.create().texOffs(93, 111).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.8786F, 8.4459F, -0.0336F, 0.769F, -0.2613F, 0.133F));

		PartDefinition basin_r45 = bone3.addOrReplaceChild("basin_r45", CubeListBuilder.create().texOffs(48, 118).addBox(-0.5F, -2.45F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.7376F, 8.4182F, -0.5424F, 0.8999F, -0.2613F, 0.133F));

		PartDefinition basin_r46 = bone3.addOrReplaceChild("basin_r46", CubeListBuilder.create().texOffs(88, 111).addBox(-0.5F, -2.1F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.7376F, 8.4182F, -0.5424F, 0.6381F, -0.2613F, 0.133F));

		PartDefinition basin_r47 = bone3.addOrReplaceChild("basin_r47", CubeListBuilder.create().texOffs(74, 86).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0517F, 5.6457F, -2.7436F, -0.1745F, 0.0F, 0.0611F));

		PartDefinition basin_r48 = bone3.addOrReplaceChild("basin_r48", CubeListBuilder.create().texOffs(51, 99).addBox(-0.5005F, 0.3562F, -1.9388F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.917F, 3.4498F, -3.4121F, 0.7854F, 0.0F, 0.0611F));

		PartDefinition basin_r49 = bone3.addOrReplaceChild("basin_r49", CubeListBuilder.create().texOffs(81, 30).addBox(-0.5413F, -1.1899F, -3.2221F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.917F, 3.4498F, -3.4121F, -0.8082F, -0.0237F, 0.0255F));

		PartDefinition bone5 = basin.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-3.4F, -1.7091F, 4.7942F));

		PartDefinition basin_r50 = bone5.addOrReplaceChild("basin_r50", CubeListBuilder.create().texOffs(105, 0).mirror().addBox(-0.5019F, 0.8114F, -4.7595F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7163F, -0.4386F, -1.9238F, -0.3316F, 0.0F, -0.0349F));

		PartDefinition basin_r51 = bone5.addOrReplaceChild("basin_r51", CubeListBuilder.create().texOffs(25, 122).mirror().addBox(-0.5019F, -1.7827F, -3.1541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(110, 89).mirror().addBox(-0.5019F, -2.6827F, -4.1541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.7163F, -0.4386F, -1.9238F, 0.4102F, 0.0F, -0.0349F));

		PartDefinition basin_r52 = bone5.addOrReplaceChild("basin_r52", CubeListBuilder.create().texOffs(20, 122).mirror().addBox(-0.5019F, 2.4192F, -1.0738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.7163F, -0.4386F, -1.9238F, -1.2043F, 0.0F, -0.0349F));

		PartDefinition basin_r53 = bone5.addOrReplaceChild("basin_r53", CubeListBuilder.create().texOffs(22, 93).mirror().addBox(-0.5019F, 0.0079F, 0.0182F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.6599F, -2.0551F, -4.9609F, 0.1134F, 0.0F, -0.0349F));

		PartDefinition basin_r54 = bone5.addOrReplaceChild("basin_r54", CubeListBuilder.create().texOffs(121, 85).mirror().addBox(-0.5019F, -2.7738F, 1.9405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.7163F, -0.4386F, -1.9238F, -0.4189F, 0.0F, -0.0349F));

		PartDefinition basin_r55 = bone5.addOrReplaceChild("basin_r55", CubeListBuilder.create().texOffs(10, 117).mirror().addBox(-0.5F, -1.0F, -0.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.7075F, -0.638F, -0.1392F, -0.8552F, 0.0F, -0.0349F));

		PartDefinition basin_r56 = bone5.addOrReplaceChild("basin_r56", CubeListBuilder.create().texOffs(116, 108).mirror().addBox(-0.5F, -1.0F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.7075F, -0.638F, -0.1392F, -1.5533F, 0.0F, -0.0349F));

		PartDefinition basin_r57 = bone5.addOrReplaceChild("basin_r57", CubeListBuilder.create().texOffs(43, 114).mirror().addBox(-0.5F, -1.15F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7074F, -0.642F, 0.734F, -1.3352F, 0.0F, -0.0349F));

		PartDefinition basin_r58 = bone5.addOrReplaceChild("basin_r58", CubeListBuilder.create().texOffs(126, 31).mirror().addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6951F, -0.9917F, 1.7455F, -0.9861F, 0.0F, -0.0349F));

		PartDefinition basin_r59 = bone5.addOrReplaceChild("basin_r59", CubeListBuilder.create().texOffs(101, 89).mirror().addBox(-0.5019F, -1.945F, -0.2268F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7163F, -0.4386F, -1.9238F, -0.0698F, 0.0F, -0.0349F));

		PartDefinition basin_r60 = bone5.addOrReplaceChild("basin_r60", CubeListBuilder.create().texOffs(48, 122).mirror().addBox(-0.5F, 2.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7168F, 0.1692F, -2.183F, 0.3927F, 0.0F, -0.0611F));

		PartDefinition basin_r61 = bone5.addOrReplaceChild("basin_r61", CubeListBuilder.create().texOffs(74, 93).mirror().addBox(-0.5F, -0.3F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7168F, 0.1692F, -2.183F, -0.48F, 0.0F, -0.0611F));

		PartDefinition basin_r62 = bone5.addOrReplaceChild("basin_r62", CubeListBuilder.create().texOffs(83, 124).mirror().addBox(0.03F, 7.5001F, -3.7871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(124, 79).mirror().addBox(0.03F, 8.0001F, -3.7871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0138F)).mirror(false), PartPose.offsetAndRotation(0.6539F, 7.0388F, -7.799F, 0.0766F, -0.1071F, -0.1762F));

		PartDefinition basin_r63 = bone5.addOrReplaceChild("basin_r63", CubeListBuilder.create().texOffs(126, 46).mirror().addBox(0.03F, 8.6326F, 0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0134F)).mirror(false)
				.texOffs(126, 12).mirror().addBox(0.03F, 8.1326F, 0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(98, 111).mirror().addBox(0.03F, 4.2326F, 0.3766F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0139F)).mirror(false)
				.texOffs(65, 114).mirror().addBox(0.03F, 1.2326F, 0.3766F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0134F)).mirror(false), PartPose.offsetAndRotation(0.6539F, 7.0388F, -7.799F, -0.447F, -0.1071F, -0.1762F));

		PartDefinition basin_r64 = bone5.addOrReplaceChild("basin_r64", CubeListBuilder.create().texOffs(105, 84).mirror().addBox(-0.5F, -1.5F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.3255F, 8.0668F, -7.3143F, -1.1451F, -0.1071F, -0.1762F));

		PartDefinition basin_r65 = bone5.addOrReplaceChild("basin_r65", CubeListBuilder.create().texOffs(51, 94).mirror().addBox(-0.5F, -2.725F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.7178F, 9.7285F, -8.1986F, -0.3161F, -0.1071F, -0.1762F));

		PartDefinition basin_r66 = bone5.addOrReplaceChild("basin_r66", CubeListBuilder.create().texOffs(5, 118).mirror().addBox(0.03F, -0.4251F, -0.401F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6539F, 7.0388F, -7.799F, -0.0979F, -0.1071F, -0.1762F));

		PartDefinition basin_r67 = bone5.addOrReplaceChild("basin_r67", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.4996F, -0.1033F, -5.1652F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0134F)).mirror(false), PartPose.offsetAndRotation(0.917F, 3.4498F, -3.4121F, 0.2182F, 0.0F, -0.0611F));

		PartDefinition basin_r68 = bone5.addOrReplaceChild("basin_r68", CubeListBuilder.create().texOffs(103, 55).mirror().addBox(-0.5F, 1.775F, -2.025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9719F, 4.3404F, -5.5584F, -0.829F, 0.0F, -0.0611F));

		PartDefinition basin_r69 = bone5.addOrReplaceChild("basin_r69", CubeListBuilder.create().texOffs(92, 57).mirror().addBox(-0.5F, -0.325F, -3.325F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.9719F, 4.3404F, -5.5584F, -0.0436F, 0.0F, -0.0611F));

		PartDefinition basin_r70 = bone5.addOrReplaceChild("basin_r70", CubeListBuilder.create().texOffs(45, 87).mirror().addBox(-0.5F, -0.425F, -2.425F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.9719F, 4.3404F, -5.5584F, -0.8727F, 0.0F, -0.0611F));

		PartDefinition basin_r71 = bone5.addOrReplaceChild("basin_r71", CubeListBuilder.create().texOffs(124, 88).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(3.3383F, 12.0194F, 3.6041F, -1.8926F, 0.2613F, -0.133F));

		PartDefinition basin_r72 = bone5.addOrReplaceChild("basin_r72", CubeListBuilder.create().texOffs(88, 124).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(3.2831F, 12.8171F, 3.0035F, -0.6709F, 0.2613F, -0.133F));

		PartDefinition basin_r73 = bone5.addOrReplaceChild("basin_r73", CubeListBuilder.create().texOffs(23, 106).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.756F, 12.7667F, 1.0749F, -0.06F, 0.2613F, -0.133F));

		PartDefinition basin_r74 = bone5.addOrReplaceChild("basin_r74", CubeListBuilder.create().texOffs(114, 78).mirror().addBox(-0.5F, -1.5F, -0.975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.6144F, 11.0166F, 1.4183F, 0.3763F, 0.2613F, -0.133F));

		PartDefinition basin_r75 = bone5.addOrReplaceChild("basin_r75", CubeListBuilder.create().texOffs(75, 114).mirror().addBox(-0.5F, -0.1F, -1.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 114).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.3619F, 9.1903F, 1.3884F, 0.7254F, 0.2613F, -0.133F));

		PartDefinition basin_r76 = bone5.addOrReplaceChild("basin_r76", CubeListBuilder.create().texOffs(93, 111).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.8786F, 8.4459F, -0.0336F, 0.769F, 0.2613F, -0.133F));

		PartDefinition basin_r77 = bone5.addOrReplaceChild("basin_r77", CubeListBuilder.create().texOffs(48, 118).mirror().addBox(-0.5F, -2.45F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.7376F, 8.4182F, -0.5424F, 0.8999F, 0.2613F, -0.133F));

		PartDefinition basin_r78 = bone5.addOrReplaceChild("basin_r78", CubeListBuilder.create().texOffs(88, 111).mirror().addBox(-0.5F, -2.1F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.7376F, 8.4182F, -0.5424F, 0.6381F, 0.2613F, -0.133F));

		PartDefinition basin_r79 = bone5.addOrReplaceChild("basin_r79", CubeListBuilder.create().texOffs(74, 86).mirror().addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.0517F, 5.6457F, -2.7436F, -0.1745F, 0.0F, -0.0611F));

		PartDefinition basin_r80 = bone5.addOrReplaceChild("basin_r80", CubeListBuilder.create().texOffs(51, 99).mirror().addBox(-0.4996F, 0.3562F, -1.9388F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.917F, 3.4498F, -3.4121F, 0.7854F, 0.0F, -0.0611F));

		PartDefinition basin_r81 = bone5.addOrReplaceChild("basin_r81", CubeListBuilder.create().texOffs(81, 30).mirror().addBox(-0.4587F, -1.1899F, -3.2221F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.917F, 3.4498F, -3.4121F, -0.8082F, 0.0237F, -0.0255F));

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