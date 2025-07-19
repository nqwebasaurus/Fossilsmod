package fossils.fossils.client.blockentity.model.herrerasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HerrerasaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart basin;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head1;
	private final ModelPart jaw1;
	private final ModelPart jaw2;
	private final ModelPart jaw3;
	private final ModelPart lowerteeth2;
	private final ModelPart lowerteeth1;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart teeth2;
	private final ModelPart head4;
	private final ModelPart teeth1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart hand3;
	private final ModelPart hand4;
	private final ModelPart upperarm3;
	private final ModelPart lowerarm3;
	private final ModelPart hand5;
	private final ModelPart hand6;
	private final ModelPart hand7;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart upperleg1;
	private final ModelPart lowerleg1;
	private final ModelPart feet1;
	private final ModelPart toes1;
	private final ModelPart toes2;
	private final ModelPart upperleg2;
	private final ModelPart lowerleg2;
	private final ModelPart feet2;
	private final ModelPart toes3;
	private final ModelPart toes4;
	private final ModelPart bone2;
	private final ModelPart bone3;

	public HerrerasaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.basin = this.root.getChild("basin");
		this.body = this.basin.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head1 = this.neck4.getChild("head1");
		this.jaw1 = this.head1.getChild("jaw1");
		this.jaw2 = this.jaw1.getChild("jaw2");
		this.jaw3 = this.jaw2.getChild("jaw3");
		this.lowerteeth2 = this.jaw3.getChild("lowerteeth2");
		this.lowerteeth1 = this.jaw2.getChild("lowerteeth1");
		this.head2 = this.head1.getChild("head2");
		this.head3 = this.head2.getChild("head3");
		this.teeth2 = this.head3.getChild("teeth2");
		this.head4 = this.head3.getChild("head4");
		this.teeth1 = this.head2.getChild("teeth1");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.hand3 = this.lowerarm2.getChild("hand3");
		this.hand4 = this.lowerarm2.getChild("hand4");
		this.upperarm3 = this.chest.getChild("upperarm3");
		this.lowerarm3 = this.upperarm3.getChild("lowerarm3");
		this.hand5 = this.lowerarm3.getChild("hand5");
		this.hand6 = this.lowerarm3.getChild("hand6");
		this.hand7 = this.lowerarm3.getChild("hand7");
		this.bone = this.chest.getChild("bone");
		this.bone4 = this.chest.getChild("bone4");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.upperleg1 = this.basin.getChild("upperleg1");
		this.lowerleg1 = this.upperleg1.getChild("lowerleg1");
		this.feet1 = this.lowerleg1.getChild("feet1");
		this.toes1 = this.feet1.getChild("toes1");
		this.toes2 = this.toes1.getChild("toes2");
		this.upperleg2 = this.basin.getChild("upperleg2");
		this.lowerleg2 = this.upperleg2.getChild("lowerleg2");
		this.feet2 = this.lowerleg2.getChild("feet2");
		this.toes3 = this.feet2.getChild("toes3");
		this.toes4 = this.toes3.getChild("toes4");
		this.bone2 = this.basin.getChild("bone2");
		this.bone3 = this.basin.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create().texOffs(26, 91).addBox(0.2F, -3.102F, -2.8674F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.2F, -9.2F, -0.5F));

		PartDefinition basin_r1 = basin.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(3, 107).addBox(0.7F, -2.7744F, 5.0452F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).mirror().addBox(-1.8F, 0.9256F, 1.0452F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 26).addBox(1.2F, 0.9256F, 1.0452F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(25, 13).addBox(0.2F, -0.0744F, 0.0452F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -0.6107F, -3.9205F, -0.0873F, 0.0F, 0.0F));

		PartDefinition basin_r2 = basin.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(6, 107).addBox(0.7F, -2.2877F, 0.0271F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0107F, 5.0795F, -0.1309F, 0.0F, 0.0F));

		PartDefinition basin_r3 = basin.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(41, 107).addBox(0.7F, -2.4541F, -0.0627F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2107F, 3.1795F, -0.1309F, 0.0F, 0.0F));

		PartDefinition basin_r4 = basin.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(0, 107).addBox(0.7F, -2.7246F, -0.9658F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3107F, 0.0795F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body_r1 = basin.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(38, 107).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.8533F, 5.4454F, 0.6981F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create().texOffs(17, 47).addBox(-0.3F, -0.5688F, -7.1294F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(109, 41).addBox(0.2F, -2.1409F, -7.1235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 107).addBox(0.2F, -2.8199F, -1.125F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1728F, -3.7062F, 0.0088F, -0.0873F, -0.0008F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(9, 107).addBox(0.6F, -2.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.4269F, -2.6243F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(56, 109).addBox(0.6F, -1.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.5339F, -4.6239F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body_r4 = body.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(0, 111).addBox(-2.5F, -1.3F, -3.5F, 5.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 10.8312F, -3.6294F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(100, 55).mirror().addBox(-3.939F, -2.1009F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -0.6449F, -0.0085F, 0.0784F, -1.6152F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(99, 92).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -0.6449F, 0.0381F, 0.069F, -1.0027F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(108, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -0.6449F, 0.0722F, 0.0316F, -0.3484F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(83, 24).mirror().addBox(-5.939F, -2.1009F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -2.6449F, -0.0074F, 0.2093F, -1.5627F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(99, 34).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -2.6449F, 0.1152F, 0.1752F, -0.9409F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(108, 39).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -2.6449F, 0.1977F, 0.0694F, -0.2897F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(67, 18).mirror().addBox(-7.939F, -2.1009F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -4.6449F, -0.0068F, 0.2791F, -1.4927F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(99, 21).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -4.6449F, 0.1575F, 0.2315F, -0.8626F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(107, 66).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -4.6449F, 0.2649F, 0.0892F, -0.2145F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(50, 10).mirror().addBox(-9.939F, -2.1009F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -6.6449F, -0.0068F, 0.2791F, -1.4229F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(99, 5).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -6.6449F, 0.1575F, 0.2315F, -0.7928F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(106, 86).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -6.6449F, 0.2649F, 0.0892F, -0.1447F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(108, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -0.6449F, 0.0722F, -0.0316F, 0.3484F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(99, 92).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -0.6449F, 0.0381F, -0.069F, 1.0027F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(100, 55).addBox(1.939F, -2.1009F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -0.6449F, -0.0085F, -0.0784F, 1.6152F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(108, 39).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -2.6449F, 0.1977F, -0.0694F, 0.2897F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(99, 34).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -2.6449F, 0.1152F, -0.1752F, 0.9409F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(83, 24).addBox(1.939F, -2.1009F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -2.6449F, -0.0074F, -0.2093F, 1.5627F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(107, 66).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -4.6449F, 0.2649F, -0.0892F, 0.2145F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(99, 21).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -4.6449F, 0.1575F, -0.2315F, 0.8626F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(67, 18).addBox(1.939F, -2.1009F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -4.6449F, -0.0068F, -0.2791F, 1.4927F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(106, 86).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -6.6449F, 0.2649F, -0.0892F, 0.1447F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(99, 5).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -6.6449F, 0.1575F, -0.2315F, 0.7928F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(50, 10).addBox(1.939F, -2.1009F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -6.6449F, -0.0068F, -0.2791F, 1.4229F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(29, 109).addBox(-0.4F, -1.7305F, -5.8863F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 47).addBox(-0.9F, -0.5374F, -6.8909F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0314F, -7.2386F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-10.939F, -2.1009F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -1.4064F, -0.0073F, 0.2267F, -1.3881F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(30, 83).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -1.4064F, 0.1257F, 0.1893F, -0.7645F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(106, 9).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -1.4064F, 0.2145F, 0.0744F, -0.1139F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(42, 35).mirror().addBox(-10.939F, -2.1009F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -3.4064F, -0.007F, 0.2616F, -1.3531F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(77, 69).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -3.4064F, 0.1468F, 0.2174F, -0.7253F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(105, 14).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -3.4064F, 0.2481F, 0.0843F, -0.0763F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(44, 63).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -5.4064F, 0.179F, 0.2595F, -0.7177F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(50, 8).mirror().addBox(-9.939F, -2.1009F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -5.4064F, -0.0065F, 0.314F, -1.353F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(83, 26).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -5.4064F, 0.2985F, 0.0989F, -0.0717F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(106, 9).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -1.4064F, 0.2145F, -0.0744F, 0.1139F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(30, 83).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -1.4064F, 0.1257F, -0.1893F, 0.7645F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(48, 21).addBox(1.939F, -2.1009F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -1.4064F, -0.0073F, -0.2267F, 1.3881F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(105, 14).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -3.4064F, 0.2481F, -0.0843F, 0.0763F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(77, 69).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -3.4064F, 0.1468F, -0.2174F, 0.7253F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(42, 35).addBox(1.939F, -2.1009F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -3.4064F, -0.007F, -0.2616F, 1.3531F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(83, 26).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -5.4064F, 0.2985F, -0.0989F, 0.0717F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(50, 8).addBox(1.939F, -2.1009F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -5.4064F, -0.0065F, -0.314F, 1.353F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(44, 63).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -5.4064F, 0.179F, -0.2595F, 0.7177F));

		PartDefinition body_r5 = body2.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(91, 116).addBox(-2.5F, -1.3321F, 0.1013F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 9.4219F, -3.5678F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body_r6 = body2.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(108, 115).addBox(-2.0F, -3.0126F, -4.1433F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 11.1219F, -3.7678F, -0.4363F, 0.0F, 0.0F));

		PartDefinition body_r7 = body2.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(32, 109).addBox(0.6F, -1.4F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5165F, -1.785F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body_r8 = body2.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(109, 45).addBox(0.6F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5235F, -3.8857F, -0.0436F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.6958F, -6.9236F, -0.0873F, -0.0435F, 0.0038F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(83, 107).addBox(0.6F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.639F, -6.7057F, 0.0349F, 0.0F, 0.0F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(73, 107).addBox(0.6F, -2.1F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 107).addBox(0.6F, -2.1F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 107).addBox(0.6F, -2.125F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 47).addBox(0.1F, -1.0F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 0.639F, -6.7057F, 0.1222F, 0.0F, 0.0F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(42, 26).mirror().addBox(-0.5091F, -0.0047F, -0.7248F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 8.0347F, -0.4252F, -0.1224F, -0.569F, 0.2487F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(57, 37).mirror().addBox(-0.5091F, -0.0047F, -0.3248F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 8.0347F, -0.4252F, 0.0065F, -0.7782F, 0.2525F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(44, 66).mirror().addBox(-1.4651F, 0.4F, -0.5985F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 7.5347F, -1.3252F, -0.5486F, -1.3239F, 1.5301F));

		PartDefinition chest_r6 = chest.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(67, 12).mirror().addBox(-0.4651F, 0.4F, -0.2985F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 7.5347F, -1.3252F, -0.1458F, -0.9502F, 0.7849F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(95, 65).mirror().addBox(-3.7934F, -0.6088F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3104F, -6.2827F, 0.2248F, 0.6793F, -1.1801F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(109, 16).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3104F, -6.2827F, 0.6011F, 0.4037F, -0.4786F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(94, 23).mirror().addBox(-4.939F, -2.1009F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3104F, -4.2827F, -0.0035F, 0.6107F, -1.4215F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(100, 67).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3104F, -4.2827F, 0.3793F, 0.4909F, -0.7134F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(109, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3104F, -4.2827F, 0.5879F, 0.1761F, -0.1016F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(76, 108).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0104F, -2.2827F, 0.5021F, 0.1546F, -0.0459F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(48, 23).mirror().addBox(-6.939F, -2.1009F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0104F, -2.2827F, -0.0045F, 0.5234F, -1.3522F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(100, 59).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0104F, -2.2827F, 0.3163F, 0.4243F, -0.6714F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(108, 74).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.3896F, -0.2827F, 0.4F, 0.1274F, -0.0254F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(100, 57).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.3896F, -0.2827F, 0.2456F, 0.3426F, -0.663F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(57, 44).mirror().addBox(-8.939F, -2.1009F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.3896F, -0.2827F, -0.0056F, 0.4187F, -1.3178F));

		PartDefinition chest_r7 = chest.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(44, 66).addBox(0.4651F, 0.4F, -0.5985F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 7.5347F, -1.3252F, -0.5486F, 1.3239F, -1.5301F));

		PartDefinition chest_r8 = chest.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(42, 26).addBox(-0.4909F, -0.0047F, -0.7248F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 8.0347F, -0.4252F, -0.1224F, 0.569F, -0.2487F));

		PartDefinition chest_r9 = chest.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(57, 37).addBox(-0.4909F, -0.0047F, -0.3248F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 8.0347F, -0.4252F, 0.0065F, 0.7782F, -0.2525F));

		PartDefinition chest_r10 = chest.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(67, 12).addBox(-0.5349F, 0.4F, -0.2985F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 7.5347F, -1.3252F, -0.1458F, 0.9502F, -0.7849F));

		PartDefinition chest_r11 = chest.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(76, 6).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 7.5347F, -1.3252F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(109, 16).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3104F, -6.2827F, 0.6011F, -0.4037F, 0.4786F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(95, 65).addBox(0.7933F, -0.6088F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3104F, -6.2827F, 0.2248F, -0.6793F, 1.1801F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(109, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3104F, -4.2827F, 0.5879F, -0.1761F, 0.1016F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(100, 67).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3104F, -4.2827F, 0.3793F, -0.4909F, 0.7134F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(94, 23).addBox(1.939F, -2.1009F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3104F, -4.2827F, -0.0035F, -0.6107F, 1.4215F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(100, 59).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0104F, -2.2827F, 0.3163F, -0.4243F, 0.6714F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(48, 23).addBox(1.939F, -2.1009F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0104F, -2.2827F, -0.0045F, -0.5234F, 1.3522F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(76, 108).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0104F, -2.2827F, 0.5021F, -0.1546F, 0.0459F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(57, 44).addBox(1.939F, -2.1009F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.3896F, -0.2827F, -0.0056F, -0.4187F, 1.3178F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(100, 57).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.3896F, -0.2827F, 0.2456F, -0.3426F, 0.663F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(108, 74).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.3896F, -0.2827F, 0.4F, -0.1274F, 0.0254F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(62, 72).addBox(-0.4F, -0.7056F, -3.8655F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.002F))
				.texOffs(110, 61).addBox(0.1F, -1.7056F, -1.8655F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3694F, -6.7967F, -0.2054F, 0.046F, 0.052F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(86, 107).addBox(0.6F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2056F, -3.3655F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r65 = neck1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(96, 14).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.159F, -3.6861F, 0.4038F, 1.098F, -1.0819F));

		PartDefinition cube_r66 = neck1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(96, 12).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.159F, -1.4861F, 0.4559F, 0.9431F, -1.0344F));

		PartDefinition cube_r67 = neck1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(96, 14).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.159F, -3.6861F, 0.4038F, -1.098F, 1.0819F));

		PartDefinition cube_r68 = neck1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(96, 12).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.159F, -1.4861F, 0.4559F, -0.9431F, 1.0344F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0603F, -3.8577F, -0.6275F, 0.0443F, 0.1425F));

		PartDefinition neck4_r1 = neck2.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(76, 110).addBox(0.6F, -1.1F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 68).addBox(0.6F, -1.1F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 65).addBox(0.1F, -0.1F, 2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7561F, -6.8926F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r69 = neck2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(101, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.5808F, -3.7284F, 1.5891F, 1.3549F, 0.0556F));

		PartDefinition cube_r70 = neck2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(101, 40).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1808F, -1.6284F, 1.4051F, 1.3515F, -0.1426F));

		PartDefinition cube_r71 = neck2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(101, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.5808F, -3.7284F, 1.5891F, -1.3549F, -0.0556F));

		PartDefinition cube_r72 = neck2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(101, 40).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1808F, -1.6284F, 1.4051F, -1.3515F, 0.1426F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.7591F, -4.747F, 0.2207F, -0.0485F, 0.2128F));

		PartDefinition neck5_r1 = neck3.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(110, 101).addBox(0.6F, -2.0F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 110).addBox(0.6F, -2.0F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 84).addBox(0.1F, -1.0F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.8012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r73 = neck3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(109, 26).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.4217F, -2.7814F, 1.138F, 1.2835F, -0.4242F));

		PartDefinition cube_r74 = neck3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(101, 75).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.2217F, -0.7814F, 0.7327F, 1.24F, -0.8579F));

		PartDefinition cube_r75 = neck3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(109, 26).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.4217F, -2.7814F, 1.138F, -1.2835F, 0.4242F));

		PartDefinition cube_r76 = neck3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(101, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2217F, -0.7814F, 0.7327F, -1.24F, 0.8579F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.36F, -2.8054F, 0.5074F, -0.0708F, -0.4239F));

		PartDefinition neck5_r2 = neck4.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(104, 107).addBox(0.6F, -2.2F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 85).addBox(0.1F, -1.0F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.8012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r77 = neck4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(109, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.2616F, -1.776F, 0.7057F, 1.2397F, -0.8446F));

		PartDefinition cube_r78 = neck4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(109, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2616F, -1.776F, 0.7057F, -1.2397F, 0.8446F));

		PartDefinition head1 = neck4.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.52F, 0.5047F, -2.8429F, 0.357F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head1.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(12, 78).addBox(-1.92F, 0.0038F, -1.9639F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.3858F, 0.3395F, 0.096F, 0.0F, 0.0F));

		PartDefinition head15_r1 = head1.addOrReplaceChild("head15_r1", CubeListBuilder.create().texOffs(104, 98).mirror().addBox(-0.5F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(104, 88).mirror().addBox(-0.5F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.686F, -0.2862F, -5.5806F, 2.6958F, -0.1792F, -0.033F));

		PartDefinition head16_r1 = head1.addOrReplaceChild("head16_r1", CubeListBuilder.create().texOffs(101, 94).mirror().addBox(0.2836F, -3.2058F, -0.3166F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.74F, 0.5781F, -4.0037F, 1.4741F, -0.1792F, -0.033F));

		PartDefinition head17_r1 = head1.addOrReplaceChild("head17_r1", CubeListBuilder.create().texOffs(105, 11).mirror().addBox(0.2836F, -3.366F, -2.2033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.74F, 0.5781F, -4.0037F, 0.8196F, -0.1792F, -0.033F));

		PartDefinition head18_r1 = head1.addOrReplaceChild("head18_r1", CubeListBuilder.create().texOffs(15, 105).mirror().addBox(0.2836F, -2.0761F, -2.9247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.74F, 0.5781F, -4.0037F, 0.2087F, -0.1792F, -0.033F));

		PartDefinition head4_r2 = head1.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(100, 102).mirror().addBox(-1.775F, -0.875F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(100, 102).addBox(0.615F, -0.875F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.16F, 0.8999F, -0.0384F, 0.6283F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head1.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(94, 106).mirror().addBox(-1.775F, -1.875F, 0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(106, 94).mirror().addBox(-1.775F, -1.375F, 0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(106, 94).addBox(0.615F, -1.375F, 0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(94, 106).addBox(0.615F, -1.875F, 0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.16F, 0.8749F, 0.0116F, 0.6283F, 0.0F, 0.0F));

		PartDefinition head5_r2 = head1.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(30, 106).mirror().addBox(-1.48F, -0.6138F, -0.5213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 106).addBox(0.32F, -0.6138F, -0.5213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 48).addBox(-1.58F, -0.6138F, -0.5463F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.16F, -1.4358F, -0.2355F, 0.6632F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head1.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(40, 99).mirror().addBox(-0.98F, -0.0284F, 0.0237F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(86, 57).addBox(-1.08F, -0.0034F, 0.0237F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(40, 99).addBox(0.82F, -0.0284F, 0.0237F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.34F, -2.3858F, -1.2105F, -0.2007F, 0.0F, 0.0F));

		PartDefinition head13_r1 = head1.addOrReplaceChild("head13_r1", CubeListBuilder.create().texOffs(63, 104).mirror().addBox(-3.0F, -0.0085F, -1.0279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 104).addBox(-0.96F, -0.0085F, -1.0279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.56F, 0.9642F, -1.3355F, 3.0369F, 0.0F, 0.0F));

		PartDefinition head14_r1 = head1.addOrReplaceChild("head14_r1", CubeListBuilder.create().texOffs(68, 104).mirror().addBox(-3.0F, -0.0185F, -0.028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(68, 104).addBox(-0.96F, -0.0185F, -0.028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.56F, 0.0642F, -0.2355F, -2.5045F, 0.0F, 0.0F));

		PartDefinition head13_r2 = head1.addOrReplaceChild("head13_r2", CubeListBuilder.create().texOffs(84, 104).mirror().addBox(-3.0F, 1.4438F, 0.06F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(101, 81).mirror().addBox(-3.0F, -0.0562F, 0.06F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(84, 104).addBox(-0.96F, 1.4438F, 0.06F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(101, 81).addBox(-0.96F, -0.0562F, 0.06F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.56F, 0.9642F, -1.2355F, 2.7838F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head1.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(36, 104).mirror().addBox(-3.0F, -0.034F, 0.051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 104).addBox(-0.96F, -0.034F, 0.051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.56F, -1.7358F, -4.1355F, 0.3752F, 0.0F, 0.0F));

		PartDefinition head5_r3 = head1.addOrReplaceChild("head5_r3", CubeListBuilder.create().texOffs(104, 30).mirror().addBox(-3.0F, -0.0488F, -0.1006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(104, 30).addBox(-0.96F, -0.0488F, -0.1006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.56F, -1.1358F, -4.7355F, 0.7679F, 0.0F, 0.0F));

		PartDefinition head4_r3 = head1.addOrReplaceChild("head4_r3", CubeListBuilder.create().texOffs(26, 96).mirror().addBox(-3.0F, 0.7785F, -1.9434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(26, 96).addBox(-0.96F, 0.7785F, -1.9434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(73, 72).addBox(-2.98F, -0.0215F, -2.0434F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.56F, -2.3358F, -3.1355F, 0.2443F, 0.0F, 0.0F));

		PartDefinition head12_r1 = head1.addOrReplaceChild("head12_r1", CubeListBuilder.create().texOffs(51, 104).mirror().addBox(-3.0F, 0.0193F, 0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(104, 48).mirror().addBox(-3.0F, 0.0193F, 0.4236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(51, 104).addBox(-0.96F, 0.0193F, 0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(104, 48).addBox(-0.96F, 0.0193F, 0.4236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.56F, 0.5642F, -3.3355F, 2.6442F, 0.0F, 0.0F));

		PartDefinition head10_r1 = head1.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(46, 104).mirror().addBox(-3.0F, 0.0183F, 0.0532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 104).addBox(-0.96F, 0.0183F, 0.0532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.56F, 0.0642F, -2.4355F, -2.6354F, 0.0F, 0.0F));

		PartDefinition head9_r1 = head1.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(104, 45).mirror().addBox(-3.0F, -0.0063F, -0.0037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(104, 45).addBox(-0.96F, -0.0063F, -0.0037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.56F, -0.7358F, -1.9355F, -2.1555F, 0.0F, 0.0F));

		PartDefinition head8_r1 = head1.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(104, 42).mirror().addBox(-3.0F, -0.0383F, -0.0556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(104, 42).addBox(-0.96F, -0.0383F, -0.0556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.56F, -1.6358F, -2.2355F, -1.2828F, 0.0F, 0.0F));

		PartDefinition head7_r1 = head1.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(41, 104).mirror().addBox(-3.0F, -0.0283F, -0.0261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(41, 104).addBox(-0.96F, -0.0283F, -0.0261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.56F, -2.1358F, -3.1355F, -0.4974F, 0.0F, 0.0F));

		PartDefinition head11_r1 = head1.addOrReplaceChild("head11_r1", CubeListBuilder.create().texOffs(10, 104).mirror().addBox(-1.375F, -0.4F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false)
				.texOffs(99, 106).mirror().addBox(-1.6F, -0.4F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false)
				.texOffs(99, 106).addBox(0.64F, -0.4F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(10, 104).addBox(0.415F, -0.4F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.06F, -0.8301F, -3.3351F, -3.1154F, 0.0F, 0.0F));

		PartDefinition head2_r1 = head1.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(74, 42).addBox(-1.92F, -0.4F, -1.075F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, 0.7705F, -0.4554F, -0.0698F, 0.0F, 0.0F));

		PartDefinition head3_r2 = head1.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(68, 46).addBox(-1.92F, -2.0273F, -0.0323F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 1.1642F, -4.3355F, -0.0611F, 0.0F, 0.0F));

		PartDefinition head17_r2 = head1.addOrReplaceChild("head17_r2", CubeListBuilder.create().texOffs(15, 105).addBox(-1.2836F, -2.0761F, -2.9247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.9F, 0.5781F, -4.0037F, 0.2087F, 0.1792F, 0.033F));

		PartDefinition head19_r1 = head1.addOrReplaceChild("head19_r1", CubeListBuilder.create().texOffs(106, 91).mirror().addBox(-2.0F, -0.2188F, -0.231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(106, 91).addBox(-1.56F, -0.2188F, -0.231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.36F, -0.4505F, -10.8539F, 0.4712F, 0.0F, 0.0F));

		PartDefinition head18_r2 = head1.addOrReplaceChild("head18_r2", CubeListBuilder.create().texOffs(89, 106).mirror().addBox(-2.0F, -3.6068F, -2.623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(89, 106).addBox(-1.56F, -3.6068F, -2.623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.36F, 0.5495F, -7.1539F, 0.8203F, 0.0F, 0.0F));

		PartDefinition head16_r2 = head1.addOrReplaceChild("head16_r2", CubeListBuilder.create().texOffs(105, 11).addBox(-1.2836F, -3.366F, -2.2033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.9F, 0.5781F, -4.0037F, 0.8196F, 0.1792F, 0.033F));

		PartDefinition head15_r2 = head1.addOrReplaceChild("head15_r2", CubeListBuilder.create().texOffs(101, 94).addBox(-1.2836F, -3.2058F, -0.3166F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9F, 0.5781F, -4.0037F, 1.4741F, 0.1792F, 0.033F));

		PartDefinition head14_r2 = head1.addOrReplaceChild("head14_r2", CubeListBuilder.create().texOffs(104, 98).addBox(-0.5F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(104, 88).addBox(-0.5F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.846F, -0.2862F, -5.5806F, 2.6958F, 0.1792F, 0.033F));

		PartDefinition head1_r1 = head1.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(40, 72).addBox(-1.92F, 0.0819F, 0.0475F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4358F, -3.2355F, 0.0175F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.45F, 0.4588F, 0.6109F, 0.0F, 0.0F));

		PartDefinition jaw8_r1 = jaw1.addOrReplaceChild("jaw8_r1", CubeListBuilder.create().texOffs(106, 77).mirror().addBox(-0.0261F, -0.3514F, -1.2235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(106, 33).mirror().addBox(-0.0261F, -0.3514F, -0.7235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.44F, 0.5131F, -4.2066F, -0.1064F, -0.1735F, 0.0192F));

		PartDefinition jaw9_r1 = jaw1.addOrReplaceChild("jaw9_r1", CubeListBuilder.create().texOffs(56, 106).mirror().addBox(-0.0261F, -0.7557F, -0.9998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(106, 36).mirror().addBox(-0.0261F, -0.7557F, -1.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.44F, 0.5131F, -4.2066F, 0.3299F, -0.1735F, 0.0192F));

		PartDefinition jaw6_r1 = jaw1.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(92, 98).mirror().addBox(-0.025F, -1.515F, -1.9125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(92, 98).addBox(2.115F, -1.515F, -1.9125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.465F, 1.5664F, -2.218F, 0.0698F, 0.0F, 0.0F));

		PartDefinition jaw4_r1 = jaw1.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(7, 95).mirror().addBox(-0.025F, 0.0123F, -2.0157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(7, 95).addBox(1.865F, 0.0123F, -2.0157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.34F, -0.6086F, -2.143F, -0.0349F, 0.0F, 0.0F));

		PartDefinition jaw5_r1 = jaw1.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(67, 94).mirror().addBox(-0.025F, -2.015F, -1.8125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(67, 94).addBox(1.865F, -2.015F, -1.8125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.34F, 1.4664F, -2.218F, 0.0698F, 0.0F, 0.0F));

		PartDefinition jaw4_r2 = jaw1.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.025F, -0.9462F, -1.6874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(0, 95).addBox(1.865F, -0.9462F, -1.6874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.34F, 0.9664F, -0.618F, 0.2618F, 0.0F, 0.0F));

		PartDefinition jaw3_r1 = jaw1.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(97, 42).mirror().addBox(-0.025F, -0.0065F, -1.6454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(97, 42).addBox(1.865F, -0.0065F, -1.6454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.34F, -0.0336F, -0.618F, -0.3491F, 0.0F, 0.0F));

		PartDefinition jaw2_r1 = jaw1.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(49, 95).mirror().addBox(-0.025F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(49, 95).addBox(1.865F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.34F, 0.1664F, 0.082F, 0.1745F, 0.0F, 0.0F));

		PartDefinition jaw8_r2 = jaw1.addOrReplaceChild("jaw8_r2", CubeListBuilder.create().texOffs(56, 106).addBox(-0.9739F, -0.7557F, -0.9998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(106, 36).addBox(-0.9739F, -0.7557F, -1.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.6F, 0.5131F, -4.2066F, 0.3299F, 0.1735F, -0.0192F));

		PartDefinition jaw7_r1 = jaw1.addOrReplaceChild("jaw7_r1", CubeListBuilder.create().texOffs(106, 77).addBox(-0.9739F, -0.3514F, -1.2235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(106, 33).addBox(-0.9739F, -0.3514F, -0.7235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.6F, 0.5131F, -4.2066F, -0.1064F, 0.1735F, -0.0192F));

		PartDefinition jaw2 = jaw1.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1336F, -5.018F));

		PartDefinition jaw5_r2 = jaw2.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(99, 98).mirror().addBox(0.0989F, -0.9055F, -0.7508F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.44F, 0.6467F, 0.8114F, 0.0856F, -0.1735F, 0.0192F));

		PartDefinition jaw4_r3 = jaw2.addOrReplaceChild("jaw4_r3", CubeListBuilder.create().texOffs(33, 98).mirror().addBox(0.0989F, 0.2505F, -2.4114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.44F, 0.6467F, 0.8114F, -0.1762F, -0.1735F, 0.0192F));

		PartDefinition jaw3_r2 = jaw2.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(47, 84).mirror().addBox(0.0989F, -1.1136F, -2.6233F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.44F, 0.6467F, 0.8114F, 0.2601F, -0.1735F, 0.0192F));

		PartDefinition jaw4_r4 = jaw2.addOrReplaceChild("jaw4_r4", CubeListBuilder.create().texOffs(99, 98).addBox(-1.0989F, -0.9055F, -0.7508F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.6F, 0.6467F, 0.8114F, 0.0856F, 0.1735F, -0.0192F));

		PartDefinition jaw3_r3 = jaw2.addOrReplaceChild("jaw3_r3", CubeListBuilder.create().texOffs(33, 98).addBox(-1.0989F, 0.2505F, -2.4114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.6F, 0.6467F, 0.8114F, -0.1762F, 0.1735F, -0.0192F));

		PartDefinition jaw2_r2 = jaw2.addOrReplaceChild("jaw2_r2", CubeListBuilder.create().texOffs(47, 84).addBox(-1.0989F, -1.1136F, -2.6233F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.6F, 0.6467F, 0.8114F, 0.2601F, 0.1735F, -0.0192F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.84F, -4.8F, -0.0456F, 0.0F, 0.0F));

		PartDefinition jaw11_r1 = jaw3.addOrReplaceChild("jaw11_r1", CubeListBuilder.create().texOffs(5, 104).mirror().addBox(0.0989F, -1.4009F, -2.985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.44F, -0.1933F, 5.6114F, 0.095F, -0.1742F, 0.0112F));

		PartDefinition jaw10_r1 = jaw3.addOrReplaceChild("jaw10_r1", CubeListBuilder.create().texOffs(104, 0).mirror().addBox(0.0989F, -0.8432F, -4.0911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.44F, -0.1933F, 5.6114F, -0.0359F, -0.1742F, 0.0112F));

		PartDefinition jaw9_r2 = jaw3.addOrReplaceChild("jaw9_r2", CubeListBuilder.create().texOffs(101, 85).mirror().addBox(-0.0417F, -1.0907F, -0.6984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(85, 43).mirror().addBox(-0.0417F, -0.9907F, -1.6984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(78, 33).mirror().addBox(-0.0417F, -1.0907F, -2.6984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(42, 95).mirror().addBox(-0.0417F, -0.2907F, -1.9984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.54F, -0.1933F, 1.3114F, -0.0355F, -0.087F, 0.0081F));

		PartDefinition jaw5_r3 = jaw3.addOrReplaceChild("jaw5_r3", CubeListBuilder.create().texOffs(14, 95).mirror().addBox(0.0989F, -0.3824F, -4.4581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.44F, -0.1933F, 5.6114F, 0.0165F, -0.1742F, 0.0112F));

		PartDefinition jaw4_r5 = jaw3.addOrReplaceChild("jaw4_r5", CubeListBuilder.create().texOffs(94, 94).mirror().addBox(0.0989F, -0.9246F, -4.4502F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.44F, -0.1933F, 5.6114F, 0.1386F, -0.1742F, 0.0112F));

		PartDefinition jaw4_r6 = jaw3.addOrReplaceChild("jaw4_r6", CubeListBuilder.create().texOffs(14, 95).addBox(-1.0989F, -0.3824F, -4.4581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.1933F, 5.6114F, 0.0165F, 0.1742F, -0.0112F));

		PartDefinition jaw10_r2 = jaw3.addOrReplaceChild("jaw10_r2", CubeListBuilder.create().texOffs(5, 104).addBox(-1.0989F, -1.4009F, -2.985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6F, -0.1933F, 5.6114F, 0.095F, 0.1742F, -0.0112F));

		PartDefinition jaw9_r3 = jaw3.addOrReplaceChild("jaw9_r3", CubeListBuilder.create().texOffs(104, 0).addBox(-1.0989F, -0.8432F, -4.0911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6F, -0.1933F, 5.6114F, -0.0359F, 0.1742F, -0.0112F));

		PartDefinition jaw8_r3 = jaw3.addOrReplaceChild("jaw8_r3", CubeListBuilder.create().texOffs(101, 85).addBox(-0.9583F, -1.0907F, -0.6984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(85, 43).addBox(-0.9583F, -0.9907F, -1.6984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(78, 33).addBox(-0.9583F, -1.0907F, -2.6984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 95).addBox(-0.9583F, -0.2907F, -1.9984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.1933F, 1.3114F, -0.0355F, 0.087F, -0.0081F));

		PartDefinition jaw5_r4 = jaw3.addOrReplaceChild("jaw5_r4", CubeListBuilder.create().texOffs(69, 20).addBox(-0.4643F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0444F, -0.0603F, -0.9445F, -0.0355F, 0.0F, 0.0F));

		PartDefinition jaw3_r4 = jaw3.addOrReplaceChild("jaw3_r4", CubeListBuilder.create().texOffs(94, 94).addBox(-1.0989F, -0.9246F, -4.4502F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6F, -0.1933F, 5.6114F, 0.1386F, 0.1742F, -0.0112F));

		PartDefinition lowerteeth2 = jaw3.addOrReplaceChild("lowerteeth2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -0.1F));

		PartDefinition lowerteeth1 = jaw2.addOrReplaceChild("lowerteeth1", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6F, 0.2F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0642F, -3.6355F, 0.0585F, 0.0F, 0.0F));

		PartDefinition head4_r4 = head2.addOrReplaceChild("head4_r4", CubeListBuilder.create().texOffs(99, 88).mirror().addBox(0.3405F, -1.4818F, -2.7187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 18).mirror().addBox(0.3405F, -1.4818F, -2.3187F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.74F, -1.4861F, -0.3681F, 0.1205F, -0.1808F, -0.0224F));

		PartDefinition head4_r5 = head2.addOrReplaceChild("head4_r5", CubeListBuilder.create().texOffs(83, 18).mirror().addBox(0.3405F, -2.5152F, -3.2907F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.74F, -1.4861F, -0.3681F, 0.2514F, -0.1808F, -0.0224F));

		PartDefinition head3_r3 = head2.addOrReplaceChild("head3_r3", CubeListBuilder.create().texOffs(83, 18).addBox(-1.3405F, -2.5152F, -3.2907F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9F, -1.4861F, -0.3681F, 0.2514F, 0.1808F, 0.0224F));

		PartDefinition head3_r4 = head2.addOrReplaceChild("head3_r4", CubeListBuilder.create().texOffs(99, 88).addBox(-1.3405F, -1.4818F, -2.7187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 18).addBox(-1.3405F, -1.4818F, -2.3187F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9F, -1.4861F, -0.3681F, 0.1205F, 0.1808F, 0.0224F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8F, -5.1F, -0.0911F, 0.0F, 0.0F));

		PartDefinition head13_r3 = head3.addOrReplaceChild("head13_r3", CubeListBuilder.create().texOffs(106, 19).mirror().addBox(-0.4742F, -0.4661F, -0.4775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.919F, 0.2911F, 5.0084F, 0.2155F, -0.0292F, 0.0283F));

		PartDefinition head12_r2 = head3.addOrReplaceChild("head12_r2", CubeListBuilder.create().texOffs(106, 6).mirror().addBox(-0.1592F, 0.1142F, 1.728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(106, 3).mirror().addBox(-0.1592F, 0.0142F, 0.728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(105, 104).mirror().addBox(-0.1592F, -0.1858F, -0.272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.74F, 0.9F, 1.7F, 0.4363F, -0.1571F, 0.0F));

		PartDefinition head9_r2 = head3.addOrReplaceChild("head9_r2", CubeListBuilder.create().texOffs(102, 61).mirror().addBox(-0.3F, 0.9213F, 2.3001F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.24F, 0.5F, -2.4F, 0.4363F, -0.0873F, 0.0F));

		PartDefinition head8_r2 = head3.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(102, 51).mirror().addBox(-0.3F, 0.9386F, 1.4829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.24F, 0.5F, -2.4F, 0.3491F, -0.0873F, 0.0F));

		PartDefinition head7_r2 = head3.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(31, 102).mirror().addBox(-0.3F, -0.1351F, 0.6929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(105, 101).mirror().addBox(-0.3F, 0.4649F, -0.3071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.24F, 0.5F, -2.4F, 0.2182F, -0.0873F, 0.0F));

		PartDefinition head5_r4 = head3.addOrReplaceChild("head5_r4", CubeListBuilder.create().texOffs(95, 61).mirror().addBox(-0.7F, -0.4F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 61).addBox(-0.46F, -0.4F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.16F, 0.5F, -2.1F, 0.2182F, 0.0F, 0.0F));

		PartDefinition head6_r2 = head3.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(56, 96).mirror().addBox(0.734F, -1.2705F, -6.4749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(79, 101).mirror().addBox(0.734F, -1.3705F, -4.4749F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.74F, 0.3139F, 4.7319F, 0.0347F, -0.07F, -0.0053F));

		PartDefinition head7_r3 = head3.addOrReplaceChild("head7_r3", CubeListBuilder.create().texOffs(105, 69).mirror().addBox(-0.3951F, 0.1358F, -1.0363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(78, 105).mirror().addBox(-0.3951F, 0.1358F, -1.5363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.1642F, -0.8914F, -1.6889F, 0.7334F, -0.0672F, -0.0204F));

		PartDefinition head4_r6 = head3.addOrReplaceChild("head4_r6", CubeListBuilder.create().texOffs(95, 51).mirror().addBox(0.734F, 0.0155F, -6.4027F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.74F, 0.3139F, 4.7319F, -0.0525F, -0.07F, -0.0053F));

		PartDefinition head6_r3 = head3.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(86, 52).mirror().addBox(-0.5801F, 0.084F, -2.6978F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1642F, -1.4915F, 0.9111F, 0.2442F, -0.07F, -0.0053F));

		PartDefinition head6_r4 = head3.addOrReplaceChild("head6_r4", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(0.3299F, -1.6562F, -3.5827F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.74F, 0.3139F, 4.7319F, 0.122F, -0.178F, -0.0389F));

		PartDefinition head12_r3 = head3.addOrReplaceChild("head12_r3", CubeListBuilder.create().texOffs(106, 19).addBox(-0.5258F, -0.4661F, -0.4775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.079F, 0.2911F, 5.0084F, 0.2155F, 0.0292F, -0.0283F));

		PartDefinition head11_r2 = head3.addOrReplaceChild("head11_r2", CubeListBuilder.create().texOffs(106, 6).addBox(-0.8408F, 0.1142F, 1.728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(106, 3).addBox(-0.8408F, 0.0142F, 0.728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(105, 104).addBox(-0.8408F, -0.1858F, -0.272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9F, 0.9F, 1.7F, 0.4363F, 0.1571F, 0.0F));

		PartDefinition head8_r3 = head3.addOrReplaceChild("head8_r3", CubeListBuilder.create().texOffs(102, 61).addBox(-0.7F, 0.9213F, 2.3001F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 0.5F, -2.4F, 0.4363F, 0.0873F, 0.0F));

		PartDefinition head7_r4 = head3.addOrReplaceChild("head7_r4", CubeListBuilder.create().texOffs(102, 51).addBox(-0.7F, 0.9386F, 1.4829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 0.5F, -2.4F, 0.3491F, 0.0873F, 0.0F));

		PartDefinition head6_r5 = head3.addOrReplaceChild("head6_r5", CubeListBuilder.create().texOffs(31, 102).addBox(-0.7F, -0.1351F, 0.6929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(105, 101).addBox(-0.7F, 0.4649F, -0.3071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 0.5F, -2.4F, 0.2182F, 0.0873F, 0.0F));

		PartDefinition head5_r5 = head3.addOrReplaceChild("head5_r5", CubeListBuilder.create().texOffs(0, 85).addBox(-1.3299F, -1.6562F, -3.5827F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.9F, 0.3139F, 4.7319F, 0.122F, 0.178F, 0.0389F));

		PartDefinition head7_r5 = head3.addOrReplaceChild("head7_r5", CubeListBuilder.create().texOffs(78, 105).addBox(-0.6049F, 0.1358F, -1.5363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(105, 69).addBox(-0.6049F, 0.1358F, -1.0363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3242F, -0.8914F, -1.6889F, 0.7334F, 0.0672F, 0.0204F));

		PartDefinition head5_r6 = head3.addOrReplaceChild("head5_r6", CubeListBuilder.create().texOffs(86, 52).addBox(-0.4199F, 0.084F, -2.6978F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3242F, -1.4915F, 0.9111F, 0.2442F, 0.07F, 0.0053F));

		PartDefinition head5_r7 = head3.addOrReplaceChild("head5_r7", CubeListBuilder.create().texOffs(56, 96).addBox(-1.734F, -1.2705F, -6.4749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(79, 101).addBox(-1.734F, -1.3705F, -4.4749F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.9F, 0.3139F, 4.7319F, 0.0347F, 0.07F, 0.0053F));

		PartDefinition head3_r5 = head3.addOrReplaceChild("head3_r5", CubeListBuilder.create().texOffs(95, 51).addBox(-1.734F, 0.0155F, -6.4027F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.9F, 0.3139F, 4.7319F, -0.0525F, 0.07F, 0.0053F));

		PartDefinition teeth2 = head3.addOrReplaceChild("teeth2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2F, 0.5F));

		PartDefinition head4 = head3.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 1.7F, 0.07F, 0.0F, 0.0F));

		PartDefinition head6_r6 = head4.addOrReplaceChild("head6_r6", CubeListBuilder.create().texOffs(104, 16).addBox(-0.42F, -0.0332F, 0.0507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.9809F, -4.5148F, 1.2654F, 0.0F, 0.0F));

		PartDefinition head5_r8 = head4.addOrReplaceChild("head5_r8", CubeListBuilder.create().texOffs(55, 100).addBox(-0.42F, 0.0149F, 0.0035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.025F, -4.25F, 0.637F, 0.0F, 0.0F));

		PartDefinition head6_r7 = head4.addOrReplaceChild("head6_r7", CubeListBuilder.create().texOffs(94, 7).mirror().addBox(-0.5F, -0.1916F, -0.1133F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.035F, -0.6F, -1.3F, 0.1306F, -0.2007F, 0.0043F));

		PartDefinition head7_r6 = head4.addOrReplaceChild("head7_r6", CubeListBuilder.create().texOffs(94, 37).mirror().addBox(-0.5F, -0.0617F, 1.8231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.035F, -0.6F, -1.3F, 0.2004F, -0.2007F, 0.0043F));

		PartDefinition head5_r9 = head4.addOrReplaceChild("head5_r9", CubeListBuilder.create().texOffs(94, 7).addBox(-0.5F, -0.1916F, -0.1133F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.125F, -0.6F, -1.3F, 0.1306F, 0.2007F, -0.0043F));

		PartDefinition head6_r8 = head4.addOrReplaceChild("head6_r8", CubeListBuilder.create().texOffs(94, 37).addBox(-0.5F, -0.0617F, 1.8231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.125F, -0.6F, -1.3F, 0.2004F, 0.2007F, -0.0043F));

		PartDefinition head5_r10 = head4.addOrReplaceChild("head5_r10", CubeListBuilder.create().texOffs(93, 68).addBox(-0.42F, 0.0368F, -0.0425F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition head5_r11 = head4.addOrReplaceChild("head5_r11", CubeListBuilder.create().texOffs(14, 83).addBox(-0.42F, 0.0223F, -0.0102F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.625F, -3.425F, 0.1004F, 0.0F, 0.0F));

		PartDefinition head4_r7 = head4.addOrReplaceChild("head4_r7", CubeListBuilder.create().texOffs(60, 91).addBox(-0.42F, 0.0368F, -1.9675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.5F, 0.1484F, 0.0F, 0.0F));

		PartDefinition teeth1 = head2.addOrReplaceChild("teeth1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.7F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(26, 100).addBox(-0.3F, -0.0851F, 0.1686F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7011F, 6.3613F, -3.9922F, -0.2946F, -0.2192F, -0.4781F));

		PartDefinition upperarm4_r1 = upperarm2.addOrReplaceChild("upperarm4_r1", CubeListBuilder.create().texOffs(68, 99).addBox(-0.5F, 2.8514F, 0.1274F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.8885F, 0.4283F, 0.4014F, 0.0F, 0.0F));

		PartDefinition upperarm3_r1 = upperarm2.addOrReplaceChild("upperarm3_r1", CubeListBuilder.create().texOffs(12, 99).addBox(-0.5F, 0.0214F, -0.2607F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2F, 1.8885F, 0.4283F, 0.5323F, 0.0F, 0.0F));

		PartDefinition upperarm5_r1 = upperarm2.addOrReplaceChild("upperarm5_r1", CubeListBuilder.create().texOffs(104, 27).addBox(-0.5F, -0.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(25, 104).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.8497F, 0.1244F, 0.3054F, 0.0F, 0.0F));

		PartDefinition upperarm3_r2 = upperarm2.addOrReplaceChild("upperarm3_r2", CubeListBuilder.create().texOffs(101, 77).addBox(-0.5F, -0.9F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, 0.9149F, 0.6686F, -0.1745F, 0.0F, 0.0F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create().texOffs(80, 95).addBox(-0.4F, -0.1996F, -1.2998F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0914F, 7.5409F, 3.1034F, -1.0136F, -0.2987F, 0.1323F));

		PartDefinition lowerarm4_r1 = lowerarm2.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(99, 29).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 3.6004F, -1.0998F, 0.1047F, 0.0F, 0.0F));

		PartDefinition lowerarm3_r1 = lowerarm2.addOrReplaceChild("lowerarm3_r1", CubeListBuilder.create().texOffs(99, 16).addBox(-0.5296F, -0.2435F, -0.0719F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.1F, 3.4004F, -0.4998F, 0.1334F, 0.0181F, 0.0093F));

		PartDefinition lowerarm2_r1 = lowerarm2.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(95, 55).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 1.4004F, 0.1002F, -0.0848F, 0.0181F, 0.0093F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(51, 72).addBox(-0.9313F, -0.069F, -0.8151F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3409F, 6.0535F, -0.4402F, -0.1472F, -0.0699F, 0.2937F));

		PartDefinition hand3 = lowerarm2.addOrReplaceChild("hand3", CubeListBuilder.create().texOffs(21, 91).addBox(-0.6448F, -0.1571F, -0.829F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0086F, 5.992F, 0.2563F, 0.0709F, -0.0699F, 0.2937F));

		PartDefinition hand4 = lowerarm2.addOrReplaceChild("hand4", CubeListBuilder.create().texOffs(70, 86).addBox(-0.8736F, -0.2769F, -0.1549F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.2005F, 6.2237F, -0.0496F, 0.2891F, -0.0699F, 0.2937F));

		PartDefinition upperarm3 = chest.addOrReplaceChild("upperarm3", CubeListBuilder.create().texOffs(90, 102).addBox(-0.7F, -0.0851F, 0.1686F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5011F, 6.3613F, -3.9922F, 0.0623F, -0.0451F, 0.0747F));

		PartDefinition upperarm5_r2 = upperarm3.addOrReplaceChild("upperarm5_r2", CubeListBuilder.create().texOffs(85, 99).addBox(-0.5F, 2.8514F, 0.1274F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.8885F, 0.4283F, 0.4014F, 0.0F, 0.0F));

		PartDefinition upperarm4_r2 = upperarm3.addOrReplaceChild("upperarm4_r2", CubeListBuilder.create().texOffs(50, 99).addBox(-0.5F, 0.0214F, -0.2607F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2F, 1.8885F, 0.4283F, 0.5323F, 0.0F, 0.0F));

		PartDefinition upperarm6_r1 = upperarm3.addOrReplaceChild("upperarm6_r1", CubeListBuilder.create().texOffs(106, 83).addBox(-0.5F, -0.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(106, 80).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 2.8497F, 0.1244F, 0.3054F, 0.0F, 0.0F));

		PartDefinition upperarm4_r3 = upperarm3.addOrReplaceChild("upperarm4_r3", CubeListBuilder.create().texOffs(95, 102).addBox(-0.5F, -0.9F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 0.9149F, 0.6686F, -0.1745F, 0.0F, 0.0F));

		PartDefinition lowerarm3 = upperarm3.addOrReplaceChild("lowerarm3", CubeListBuilder.create().texOffs(21, 98).addBox(-0.6F, -0.1996F, -1.2998F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0914F, 7.5409F, 3.1034F, -0.8333F, 0.5563F, 0.3781F));

		PartDefinition lowerarm5_r1 = lowerarm3.addOrReplaceChild("lowerarm5_r1", CubeListBuilder.create().texOffs(99, 46).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 3.6004F, -1.0998F, 0.1047F, 0.0F, 0.0F));

		PartDefinition lowerarm4_r2 = lowerarm3.addOrReplaceChild("lowerarm4_r2", CubeListBuilder.create().texOffs(45, 99).addBox(-0.4704F, -0.2435F, -0.0719F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1F, 3.4004F, -0.4998F, 0.1334F, -0.0181F, -0.0093F));

		PartDefinition lowerarm3_r2 = lowerarm3.addOrReplaceChild("lowerarm3_r2", CubeListBuilder.create().texOffs(74, 97).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 1.4004F, 0.1002F, -0.0848F, -0.0181F, -0.0093F));

		PartDefinition hand5 = lowerarm3.addOrReplaceChild("hand5", CubeListBuilder.create().texOffs(94, 88).addBox(-0.0687F, -0.069F, -0.8151F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3409F, 6.0535F, -0.4402F, -0.1472F, 0.0699F, -0.2937F));

		PartDefinition hand6 = lowerarm3.addOrReplaceChild("hand6", CubeListBuilder.create().texOffs(37, 91).addBox(-0.3552F, -0.1571F, -0.829F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0086F, 5.992F, 0.2563F, 0.0709F, 0.0699F, -0.2937F));

		PartDefinition hand7 = lowerarm3.addOrReplaceChild("hand7", CubeListBuilder.create().texOffs(75, 89).addBox(-0.1264F, -0.2769F, -0.1549F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.2005F, 6.2237F, -0.0496F, 0.3327F, 0.0699F, -0.2937F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-0.5F, 7.5838F, 1.0422F));

		PartDefinition chest_r12 = bone.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(85, 79).addBox(-1.0003F, 2.3722F, 1.3251F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(3.7956F, -5.0819F, -3.6982F, 1.9203F, 0.3013F, -0.1823F));

		PartDefinition chest_r13 = bone.addOrReplaceChild("chest_r13", CubeListBuilder.create().texOffs(85, 74).addBox(-1.0003F, -0.3112F, 3.3359F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(85, 38).addBox(-1.0003F, -0.3112F, 2.9359F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(3.7956F, -5.0819F, -3.6982F, 1.004F, 0.3013F, -0.1823F));

		PartDefinition chest_r14 = bone.addOrReplaceChild("chest_r14", CubeListBuilder.create().texOffs(81, 46).addBox(-0.9637F, -1.4956F, 0.3314F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(3.0007F, -2.8163F, -5.1971F, 0.3796F, 0.5967F, 0.0908F));

		PartDefinition chest_r15 = bone.addOrReplaceChild("chest_r15", CubeListBuilder.create().texOffs(0, 65).addBox(-0.9637F, -0.4296F, -2.9644F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.404F)), PartPose.offsetAndRotation(3.0007F, -2.8163F, -5.1971F, 1.4268F, 0.5967F, 0.0908F));

		PartDefinition chest_r16 = bone.addOrReplaceChild("chest_r16", CubeListBuilder.create().texOffs(80, 12).addBox(-0.9637F, -0.9032F, -2.3262F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(3.0007F, -2.8163F, -5.1971F, 0.6938F, 0.5967F, 0.0908F));

		PartDefinition chest_r17 = bone.addOrReplaceChild("chest_r17", CubeListBuilder.create().texOffs(84, 69).addBox(-0.9637F, -1.179F, -2.309F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.404F)), PartPose.offsetAndRotation(3.0007F, -2.8163F, -5.1971F, 0.2138F, 0.5967F, 0.0908F));

		PartDefinition chest_r18 = bone.addOrReplaceChild("chest_r18", CubeListBuilder.create().texOffs(76, 78).addBox(-0.9637F, -1.8712F, -2.2511F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(3.0007F, -2.8163F, -5.1971F, -0.5716F, 0.5967F, 0.0908F));

		PartDefinition chest_r19 = bone.addOrReplaceChild("chest_r19", CubeListBuilder.create().texOffs(29, 68).addBox(-0.9637F, -2.1891F, -1.6918F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(3.0007F, -2.8163F, -5.1971F, -0.3447F, 0.5967F, 0.0908F));

		PartDefinition chest_r20 = bone.addOrReplaceChild("chest_r20", CubeListBuilder.create().texOffs(51, 47).addBox(-1.0003F, -0.4856F, -2.1899F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(3.7956F, -5.0819F, -3.6982F, 0.9517F, 0.3013F, -0.1823F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.7F, 7.5838F, 1.0422F));

		PartDefinition chest_r21 = bone4.addOrReplaceChild("chest_r21", CubeListBuilder.create().texOffs(85, 79).mirror().addBox(-0.9997F, 2.3722F, 1.3251F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(-3.7956F, -5.0819F, -3.6982F, 1.9203F, -0.3013F, 0.1823F));

		PartDefinition chest_r22 = bone4.addOrReplaceChild("chest_r22", CubeListBuilder.create().texOffs(85, 74).mirror().addBox(-0.9997F, -0.3112F, 3.3359F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(85, 38).mirror().addBox(-0.9997F, -0.3112F, 2.9359F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(-3.7956F, -5.0819F, -3.6982F, 1.004F, -0.3013F, 0.1823F));

		PartDefinition chest_r23 = bone4.addOrReplaceChild("chest_r23", CubeListBuilder.create().texOffs(81, 46).mirror().addBox(-1.0363F, -1.4956F, 0.3314F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-3.0007F, -2.8163F, -5.1971F, 0.3796F, -0.5967F, -0.0908F));

		PartDefinition chest_r24 = bone4.addOrReplaceChild("chest_r24", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-1.0363F, -0.4296F, -2.9644F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.404F)).mirror(false), PartPose.offsetAndRotation(-3.0007F, -2.8163F, -5.1971F, 1.4268F, -0.5967F, -0.0908F));

		PartDefinition chest_r25 = bone4.addOrReplaceChild("chest_r25", CubeListBuilder.create().texOffs(80, 12).mirror().addBox(-1.0363F, -0.9032F, -2.3262F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-3.0007F, -2.8163F, -5.1971F, 0.6938F, -0.5967F, -0.0908F));

		PartDefinition chest_r26 = bone4.addOrReplaceChild("chest_r26", CubeListBuilder.create().texOffs(84, 69).mirror().addBox(-1.0363F, -1.179F, -2.309F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.404F)).mirror(false), PartPose.offsetAndRotation(-3.0007F, -2.8163F, -5.1971F, 0.2138F, -0.5967F, -0.0908F));

		PartDefinition chest_r27 = bone4.addOrReplaceChild("chest_r27", CubeListBuilder.create().texOffs(76, 78).mirror().addBox(-1.0363F, -1.8712F, -2.2511F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-3.0007F, -2.8163F, -5.1971F, -0.5716F, -0.5967F, -0.0908F));

		PartDefinition chest_r28 = bone4.addOrReplaceChild("chest_r28", CubeListBuilder.create().texOffs(29, 68).mirror().addBox(-1.0363F, -2.1891F, -1.6918F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(-3.0007F, -2.8163F, -5.1971F, -0.3447F, -0.5967F, -0.0908F));

		PartDefinition chest_r29 = bone4.addOrReplaceChild("chest_r29", CubeListBuilder.create().texOffs(51, 47).mirror().addBox(-0.9997F, -0.4856F, -2.1899F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-3.7956F, -5.0819F, -3.6982F, 0.9517F, -0.3013F, 0.1823F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 36).addBox(0.2F, -0.9521F, -0.0584F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1873F, 6.0008F, -0.1231F, 0.2166F, -0.0266F));

		PartDefinition tail3_r1 = tail1.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(48, 13).mirror().addBox(-1.8F, 0.0F, 0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.0479F, 0.8415F, 0.0F, 0.0349F, 0.0F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(48, 13).addBox(-0.2F, 0.0F, 0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.0479F, 0.8415F, 0.0F, -0.0349F, 0.0F));

		PartDefinition body_r9 = tail1.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(26, 107).addBox(0.6F, -2.0802F, 11.1124F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 107).addBox(0.6F, -2.026F, 9.1084F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 107).addBox(0.6F, -1.8718F, 7.1043F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 107).addBox(0.6F, -1.9161F, 5.0827F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.8669F, -4.0595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body_r10 = tail1.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(60, 100).addBox(0.6F, 3.0736F, 3.2874F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 99).addBox(0.6F, 1.0736F, 1.2874F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 72).addBox(0.6F, -1.3264F, -0.7126F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.2686F, 2.286F, 0.829F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(23, 26).addBox(0.2F, -0.9101F, -0.116F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0351F, 7.8889F, 0.05F, 0.2615F, 0.0129F));

		PartDefinition tail4_r1 = tail2.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-1.4F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.0899F, 0.884F, 0.0F, 0.0698F, 0.0F));

		PartDefinition tail3_r2 = tail2.addOrReplaceChild("tail3_r2", CubeListBuilder.create().texOffs(50, 0).addBox(-0.6F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.0899F, 0.884F, 0.0F, -0.0698F, 0.0F));

		PartDefinition body_r11 = tail2.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(40, 68).addBox(0.6F, -1.5473F, -0.6802F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.7248F, 7.5822F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body_r12 = tail2.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(42, 91).addBox(0.6F, -1.4123F, -0.9033F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9248F, 5.8822F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body_r13 = tail2.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(64, 107).addBox(0.6F, -2.7229F, 23.0671F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 107).addBox(0.6F, -2.7648F, 21.0708F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.8248F, -20.1178F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body_r14 = tail2.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(47, 107).addBox(0.0F, 0.9F, 1.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 107).addBox(0.0F, -1.0F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.3427F, 3.0061F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(38, 37).addBox(0.2F, -0.5203F, -0.2717F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2772F, 8.004F, 0.1317F, 0.3463F, 0.0449F));

		PartDefinition tail7_r1 = tail3.addOrReplaceChild("tail7_r1", CubeListBuilder.create().texOffs(110, 104).addBox(0.6F, -0.425F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.0203F, 7.2283F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail6_r1 = tail3.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(108, 22).addBox(0.6F, -0.575F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.0203F, 5.2283F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail5_r1 = tail3.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(15, 108).addBox(0.6F, -0.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.0203F, 3.2283F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail4_r2 = tail3.addOrReplaceChild("tail4_r2", CubeListBuilder.create().texOffs(107, 107).addBox(0.6F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.3203F, 0.7283F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body_r15 = tail3.addOrReplaceChild("body_r15", CubeListBuilder.create().texOffs(107, 56).addBox(0.0F, -1.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.1122F, 8.3364F, 0.6109F, 0.0F, 0.0F));

		PartDefinition body_r16 = tail3.addOrReplaceChild("body_r16", CubeListBuilder.create().texOffs(53, 107).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.4785F, 6.033F, 0.6981F, 0.0F, 0.0F));

		PartDefinition body_r17 = tail3.addOrReplaceChild("body_r17", CubeListBuilder.create().texOffs(107, 51).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.62F, 3.346F, 0.6981F, 0.0F, 0.0F));

		PartDefinition body_r18 = tail3.addOrReplaceChild("body_r18", CubeListBuilder.create().texOffs(50, 107).addBox(0.0F, 2.7F, 3.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.62F, -4.9979F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(0.2F, -0.4331F, 0.0393F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.067F, 7.6106F, 0.0542F, -0.305F, -0.0163F));

		PartDefinition tail9_r1 = tail4.addOrReplaceChild("tail9_r1", CubeListBuilder.create().texOffs(109, 30).addBox(0.6F, -1.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 96).addBox(0.6F, -1.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 29).addBox(0.6F, -1.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 91).addBox(0.6F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 28).addBox(0.6F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.3332F, 1.0393F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body_r19 = tail4.addOrReplaceChild("body_r19", CubeListBuilder.create().texOffs(95, 109).addBox(0.0F, 0.8F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 109).addBox(0.0F, 0.2F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 109).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.9676F, 5.3345F, 0.3927F, 0.0F, 0.0F));

		PartDefinition body_r20 = tail4.addOrReplaceChild("body_r20", CubeListBuilder.create().texOffs(107, 61).addBox(0.0F, -1.4F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.015F, 3.0524F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 13).addBox(0.2F, -0.4331F, 0.0393F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0902F, -0.0696F, 10.6117F, -0.1196F, -0.3034F, 0.0359F));

		PartDefinition tail10_r1 = tail5.addOrReplaceChild("tail10_r1", CubeListBuilder.create().texOffs(110, 58).addBox(0.6F, -0.725F, 7.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 55).addBox(0.6F, -0.725F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 52).addBox(0.6F, -0.725F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 49).addBox(0.6F, -0.725F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 88).addBox(0.6F, -0.725F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2331F, 0.1393F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body_r21 = tail5.addOrReplaceChild("body_r21", CubeListBuilder.create().texOffs(110, 107).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.4952F, 9.7099F, 0.7418F, 0.0F, 0.0F));

		PartDefinition body_r22 = tail5.addOrReplaceChild("body_r22", CubeListBuilder.create().texOffs(110, 11).addBox(0.0F, 0.1F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 109).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.8733F, 5.2081F, 0.5672F, 0.0F, 0.0F));

		PartDefinition body_r23 = tail5.addOrReplaceChild("body_r23", CubeListBuilder.create().texOffs(98, 109).addBox(0.0F, 2.2F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 97).addBox(0.0F, 1.5F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.0046F, -5.5615F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(25, 0).addBox(0.2F, -0.4331F, 0.0393F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.2675F, -0.1317F, 10.2255F, -0.1762F, -0.647F, 0.1069F));

		PartDefinition body_r24 = tail6.addOrReplaceChild("body_r24", CubeListBuilder.create().texOffs(111, 8).addBox(0.0F, 6.8F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 5).addBox(0.0F, 4.9F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 2).addBox(0.0F, 3.3F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 110).addBox(0.0F, 1.7F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.5322F, -1.186F, 0.7418F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 57).addBox(0.2F, -0.4331F, 0.0393F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0997F, -0.1462F, 10.3566F, -0.197F, -0.472F, 0.0905F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(19, 37).addBox(0.2F, -0.4332F, 0.0393F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.0543F, -0.0312F, 5.7117F, -0.1526F, -0.2157F, 0.0329F));

		PartDefinition upperleg1 = basin.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 2.7613F, 0.088F, -0.2618F, 0.0F, 0.0F));

		PartDefinition upperleg2_r1 = upperleg1.addOrReplaceChild("upperleg2_r1", CubeListBuilder.create().texOffs(75, 58).addBox(-1.0F, -2.6F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(29, 76).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2391F, 0.1485F, -0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperleg1.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(96, 25).addBox(-1.0F, -1.0F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 5.3802F, -0.0162F, -0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperleg1.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(14, 89).addBox(-1.0F, -0.0545F, 0.6573F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 12).addBox(-1.0F, -0.0545F, -0.0427F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.5391F, -1.2515F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperleg1.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(0, 89).addBox(-1.0F, -0.0429F, -1.0392F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 8.1391F, 0.7485F, 0.3229F, 0.0F, 0.0F));

		PartDefinition upperleg4_r3 = upperleg1.addOrReplaceChild("upperleg4_r3", CubeListBuilder.create().texOffs(85, 84).addBox(-1.0F, -0.0214F, 0.0316F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 12.3391F, 0.1485F, 0.5498F, 0.0F, 0.0F));

		PartDefinition upperleg3_r2 = upperleg1.addOrReplaceChild("upperleg3_r2", CubeListBuilder.create().texOffs(39, 85).addBox(-1.0F, -0.0654F, 0.0071F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5391F, -0.9515F, 0.288F, 0.0F, 0.0F));

		PartDefinition lowerleg1 = upperleg1.addOrReplaceChild("lowerleg1", CubeListBuilder.create().texOffs(15, 63).addBox(-1.5F, 0.8328F, -0.031F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.098F))
				.texOffs(69, 0).addBox(-1.5F, 4.8328F, -0.331F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(77, 64).addBox(-1.5F, 0.8328F, -1.331F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.103F))
				.texOffs(57, 66).addBox(0.9F, 2.8328F, -0.156F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(87, 6).addBox(0.9F, 0.8328F, -0.656F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1F, 13.0933F, 1.5571F, 0.9599F, 0.0F, 0.0F));

		PartDefinition lowerleg5_r1 = lowerleg1.addOrReplaceChild("lowerleg5_r1", CubeListBuilder.create().texOffs(87, 89).addBox(1.9F, -4.2127F, 0.0221F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.108F)), PartPose.offsetAndRotation(-3.4F, 5.3328F, -0.331F, 0.2618F, 0.0F, 0.0F));

		PartDefinition lowerleg4_r1 = lowerleg1.addOrReplaceChild("lowerleg4_r1", CubeListBuilder.create().texOffs(94, 78).addBox(-1.0F, -1.5F, -0.325F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.5F, 3.0199F, 0.651F, -0.2182F, 0.0F, 0.0F));

		PartDefinition feet1 = lowerleg1.addOrReplaceChild("feet1", CubeListBuilder.create().texOffs(62, 78).addBox(-1.0F, -0.5979F, -0.7239F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 14.531F, 0.4592F, -0.5065F, 0.0F, 0.0F));

		PartDefinition toes1 = feet1.addOrReplaceChild("toes1", CubeListBuilder.create().texOffs(29, 63).addBox(-2.0F, -0.3F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1583F, 0.0265F, 0.1328F, 0.0F, 0.0F));

		PartDefinition toes2 = toes1.addOrReplaceChild("toes2", CubeListBuilder.create().texOffs(15, 57).addBox(-2.0F, -0.3F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0141F, -2.64F, -0.2599F, 0.0F, 0.0F));

		PartDefinition upperleg2 = basin.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 2.7613F, 0.088F, -0.9581F, 0.0715F, 0.0501F));

		PartDefinition upperleg3_r3 = upperleg2.addOrReplaceChild("upperleg3_r3", CubeListBuilder.create().texOffs(76, 0).addBox(-1.0F, -2.6F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(38, 78).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2391F, 0.1485F, -0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperleg2.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(0, 99).addBox(-1.0F, -1.0F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 5.3802F, -0.0162F, -0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg4_r4 = upperleg2.addOrReplaceChild("upperleg4_r4", CubeListBuilder.create().texOffs(46, 89).addBox(-1.0F, -0.0545F, 0.6573F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 26).addBox(-1.0F, -0.0545F, -0.0427F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.5391F, -1.2515F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperleg2.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(7, 89).addBox(-1.0F, -0.0429F, -1.0392F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 8.1391F, 0.7485F, 0.3229F, 0.0F, 0.0F));

		PartDefinition upperleg5_r3 = upperleg2.addOrReplaceChild("upperleg5_r3", CubeListBuilder.create().texOffs(61, 86).addBox(-1.0F, -0.0214F, 0.0316F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 12.3391F, 0.1485F, 0.5498F, 0.0F, 0.0F));

		PartDefinition upperleg4_r5 = upperleg2.addOrReplaceChild("upperleg4_r5", CubeListBuilder.create().texOffs(87, 0).addBox(-1.0F, -0.0654F, 0.0071F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5391F, -0.9515F, 0.288F, 0.0F, 0.0F));

		PartDefinition lowerleg2 = upperleg2.addOrReplaceChild("lowerleg2", CubeListBuilder.create().texOffs(22, 63).addBox(-0.5F, 0.8328F, -0.031F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.098F))
				.texOffs(5, 72).addBox(-0.5F, 4.8328F, -0.331F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(78, 28).addBox(-0.5F, 0.8328F, -1.331F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.103F))
				.texOffs(0, 72).addBox(-1.9F, 2.8328F, -0.156F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(88, 62).addBox(-1.9F, 0.8328F, -0.656F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1F, 13.0933F, 1.5571F, 1.3456F, -0.0222F, -0.1359F));

		PartDefinition lowerleg6_r1 = lowerleg2.addOrReplaceChild("lowerleg6_r1", CubeListBuilder.create().texOffs(30, 90).addBox(-3.9F, -4.2127F, 0.0221F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.108F)), PartPose.offsetAndRotation(3.4F, 5.3328F, -0.331F, 0.2618F, 0.0F, 0.0F));

		PartDefinition lowerleg5_r2 = lowerleg2.addOrReplaceChild("lowerleg5_r2", CubeListBuilder.create().texOffs(94, 83).addBox(-1.0F, -1.5F, -0.325F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.5F, 3.0199F, 0.651F, -0.2182F, 0.0F, 0.0F));

		PartDefinition feet2 = lowerleg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(69, 78).addBox(-1.0F, -0.5979F, -0.7239F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 14.531F, 0.4592F, -1.5947F, 0.017F, 0.0409F));

		PartDefinition toes3 = feet2.addOrReplaceChild("toes3", CubeListBuilder.create().texOffs(63, 31).addBox(-2.0F, -0.3F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1583F, 0.0265F, 2.009F, 0.0F, 0.0F));

		PartDefinition toes4 = toes3.addOrReplaceChild("toes4", CubeListBuilder.create().texOffs(32, 57).addBox(-2.0F, -0.3F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0141F, -2.64F, -0.129F, 0.0F, 0.0F));

		PartDefinition bone2 = basin.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.1F, 2.8694F, 0.0452F));

		PartDefinition basin_r5 = bone2.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(53, 89).addBox(-0.5F, -5.3187F, -1.0709F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2F, 0.0F, 0.0F, -0.7679F, 0.0F, 0.0F));

		PartDefinition basin_r6 = bone2.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(20, 104).addBox(-0.5F, -1.6394F, 0.2523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2F, -3.1758F, -2.8393F, -0.5323F, 0.0F, 0.0F));

		PartDefinition basin_r7 = bone2.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(85, 95).addBox(-0.5F, -0.1548F, -1.9888F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.2F, -4.9758F, -1.4393F, 0.5585F, 0.0F, 0.0F));

		PartDefinition basin_r8 = bone2.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(103, 23).addBox(-0.5F, -0.0617F, 0.0065F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.2F, -4.2758F, 4.5607F, -1.3614F, 0.0F, 0.0F));

		PartDefinition basin_r9 = bone2.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(0, 103).addBox(-0.5F, -0.0378F, 0.0062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.2F, -4.8758F, 3.7607F, -0.6196F, 0.0F, 0.0F));

		PartDefinition basin_r10 = bone2.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(101, 7).addBox(-0.5F, -0.0212F, -0.0091F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.2F, -5.2758F, 2.8607F, -0.4014F, 0.0F, 0.0F));

		PartDefinition basin_r11 = bone2.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(92, 32).addBox(-0.5F, -0.0387F, -0.0091F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.2F, -5.2758F, 0.8607F, -0.0087F, 0.0F, 0.0F));

		PartDefinition basin_r12 = bone2.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(100, 69).addBox(-0.5F, 0.0343F, -0.2917F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.2F, -4.8758F, 0.2607F, 0.6894F, 0.0F, 0.0F));

		PartDefinition basin_r13 = bone2.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(61, 23).addBox(-0.5F, -2.1F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -2.7758F, 1.4607F, -0.0524F, 0.0F, 0.0F));

		PartDefinition basin_r14 = bone2.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(75, 52).addBox(-0.6165F, 2.526F, 1.0071F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F))
				.texOffs(72, 36).addBox(-0.6165F, 3.2428F, 0.1554F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.45F, 5.3F, 0.0F, 0.1134F, 0.0F, 0.0F));

		PartDefinition basin_r15 = bone2.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(68, 52).addBox(-0.6165F, 5.0659F, -1.5325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.018F))
				.texOffs(90, 43).addBox(-0.6165F, 3.4721F, -4.7554F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.45F, 5.3F, 0.0F, 0.9861F, 0.0F, 0.0F));

		PartDefinition basin_r16 = bone2.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(23, 83).addBox(-0.6165F, 2.1991F, 0.3649F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.45F, 5.3F, 0.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition basin_r17 = bone2.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(94, 73).addBox(-0.6165F, 4.2229F, -1.3726F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(7, 99).addBox(-0.6165F, 0.5229F, -0.8726F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.45F, 5.3F, 0.0F, 0.637F, 0.0F, 0.0F));

		PartDefinition basin_r18 = bone2.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(101, 36).addBox(-0.6165F, -1.4588F, -0.9812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.45F, 5.3F, 0.0F, 0.8552F, 0.0F, 0.0F));

		PartDefinition basin_r19 = bone2.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(63, 99).addBox(-0.6165F, 0.626F, -0.9552F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F))
				.texOffs(94, 0).addBox(-0.6165F, -0.874F, -1.5552F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.45F, 5.3F, 0.0F, 0.4189F, 0.0F, 0.0F));

		PartDefinition basin_r20 = bone2.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(74, 20).addBox(-1.0F, 2.0635F, -6.017F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.3F, -2.7F, 0.0F, 0.5934F, 0.0F, 0.1745F));

		PartDefinition basin_r21 = bone2.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(47, 78).addBox(-1.0F, 2.2004F, -4.7552F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, -2.7F, 0.0F, 0.2007F, 0.0F, 0.1745F));

		PartDefinition basin_r22 = bone2.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(83, 33).addBox(-1.0F, 2.8444F, -3.5528F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.3F, -2.7F, 0.0F, -0.192F, 0.0F, 0.1745F));

		PartDefinition basin_r23 = bone2.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(73, 103).addBox(-1.0F, 11.076F, -2.4253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3F, -2.7F, 0.0F, 0.8639F, 0.0F, 0.1745F));

		PartDefinition basin_r24 = bone2.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(56, 79).addBox(-1.0F, 3.7931F, -3.8609F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -2.7F, 0.0F, 0.9948F, 0.0F, 0.1745F));

		PartDefinition basin_r25 = bone2.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(99, 0).addBox(-1.0F, 2.6133F, -5.7605F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -2.7F, 0.0F, 1.3003F, 0.0F, 0.1745F));

		PartDefinition basin_r26 = bone2.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(80, 89).addBox(-1.0F, 0.0981F, -6.0496F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3F, -2.7F, 0.0F, 1.3875F, 0.0F, 0.1745F));

		PartDefinition basin_r27 = bone2.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(23, 78).addBox(-1.0F, 4.3799F, -1.3991F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.3F, -2.7F, 0.0F, 0.6458F, 0.0F, 0.1745F));

		PartDefinition basin_r28 = bone2.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(5, 83).addBox(-1.0F, 3.2223F, -1.2138F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -2.7F, 0.0F, 0.2531F, 0.0F, 0.1745F));

		PartDefinition basin_r29 = bone2.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(64, 56).addBox(-1.0F, -0.4522F, -1.3452F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -2.7F, 0.0F, -0.0524F, 0.0F, 0.1745F));

		PartDefinition basin_r30 = bone2.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(51, 56).addBox(-1.0F, 0.4013F, -1.1191F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.3F, -2.7F, 0.0F, -0.8378F, 0.0F, 0.1745F));

		PartDefinition bone3 = basin.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.7F, 2.8694F, 0.0452F));

		PartDefinition basin_r31 = bone3.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(53, 89).mirror().addBox(-0.5F, -5.3187F, -1.0709F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, -0.7679F, 0.0F, 0.0F));

		PartDefinition basin_r32 = bone3.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(20, 104).mirror().addBox(-0.5F, -1.6394F, 0.2523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -3.1758F, -2.8393F, -0.5323F, 0.0F, 0.0F));

		PartDefinition basin_r33 = bone3.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(85, 95).mirror().addBox(-0.5F, -0.1548F, -1.9888F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.9758F, -1.4393F, 0.5585F, 0.0F, 0.0F));

		PartDefinition basin_r34 = bone3.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(103, 23).mirror().addBox(-0.5F, -0.0617F, 0.0065F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.2758F, 4.5607F, -1.3614F, 0.0F, 0.0F));

		PartDefinition basin_r35 = bone3.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-0.5F, -0.0378F, 0.0062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.8758F, 3.7607F, -0.6196F, 0.0F, 0.0F));

		PartDefinition basin_r36 = bone3.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(101, 7).mirror().addBox(-0.5F, -0.0212F, -0.0091F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -5.2758F, 2.8607F, -0.4014F, 0.0F, 0.0F));

		PartDefinition basin_r37 = bone3.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(92, 32).mirror().addBox(-0.5F, -0.0387F, -0.0091F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -5.2758F, 0.8607F, -0.0087F, 0.0F, 0.0F));

		PartDefinition basin_r38 = bone3.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(100, 69).mirror().addBox(-0.5F, 0.0343F, -0.2917F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.8758F, 0.2607F, 0.6894F, 0.0F, 0.0F));

		PartDefinition basin_r39 = bone3.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(61, 23).mirror().addBox(-0.5F, -2.1F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -2.7758F, 1.4607F, -0.0524F, 0.0F, 0.0F));

		PartDefinition basin_r40 = bone3.addOrReplaceChild("basin_r40", CubeListBuilder.create().texOffs(75, 52).mirror().addBox(-0.3835F, 2.526F, 1.0071F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(72, 36).mirror().addBox(-0.3835F, 3.2428F, 0.1554F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.45F, 5.3F, 0.0F, 0.1134F, 0.0F, 0.0F));

		PartDefinition basin_r41 = bone3.addOrReplaceChild("basin_r41", CubeListBuilder.create().texOffs(68, 52).mirror().addBox(-0.3835F, 5.0659F, -1.5325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(90, 43).mirror().addBox(-0.3835F, 3.4721F, -4.7554F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.45F, 5.3F, 0.0F, 0.9861F, 0.0F, 0.0F));

		PartDefinition basin_r42 = bone3.addOrReplaceChild("basin_r42", CubeListBuilder.create().texOffs(23, 83).mirror().addBox(-0.3835F, 2.1991F, 0.3649F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.019F)).mirror(false), PartPose.offsetAndRotation(1.45F, 5.3F, 0.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition basin_r43 = bone3.addOrReplaceChild("basin_r43", CubeListBuilder.create().texOffs(94, 73).mirror().addBox(-0.3835F, 4.2229F, -1.3726F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(7, 99).mirror().addBox(-0.3835F, 0.5229F, -0.8726F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(1.45F, 5.3F, 0.0F, 0.637F, 0.0F, 0.0F));

		PartDefinition basin_r44 = bone3.addOrReplaceChild("basin_r44", CubeListBuilder.create().texOffs(101, 36).mirror().addBox(-0.3835F, -1.4588F, -0.9812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(1.45F, 5.3F, 0.0F, 0.8552F, 0.0F, 0.0F));

		PartDefinition basin_r45 = bone3.addOrReplaceChild("basin_r45", CubeListBuilder.create().texOffs(63, 99).mirror().addBox(-0.3835F, 0.626F, -0.9552F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(94, 0).mirror().addBox(-0.3835F, -0.874F, -1.5552F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.45F, 5.3F, 0.0F, 0.4189F, 0.0F, 0.0F));

		PartDefinition basin_r46 = bone3.addOrReplaceChild("basin_r46", CubeListBuilder.create().texOffs(74, 20).mirror().addBox(0.0F, 2.0635F, -6.017F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.0F, 0.5934F, 0.0F, -0.1745F));

		PartDefinition basin_r47 = bone3.addOrReplaceChild("basin_r47", CubeListBuilder.create().texOffs(47, 78).mirror().addBox(0.0F, 2.2004F, -4.7552F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.0F, 0.2007F, 0.0F, -0.1745F));

		PartDefinition basin_r48 = bone3.addOrReplaceChild("basin_r48", CubeListBuilder.create().texOffs(83, 33).mirror().addBox(0.0F, 2.8444F, -3.5528F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.0F, -0.192F, 0.0F, -0.1745F));

		PartDefinition basin_r49 = bone3.addOrReplaceChild("basin_r49", CubeListBuilder.create().texOffs(73, 103).mirror().addBox(0.0F, 11.076F, -2.4253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.0F, 0.8639F, 0.0F, -0.1745F));

		PartDefinition basin_r50 = bone3.addOrReplaceChild("basin_r50", CubeListBuilder.create().texOffs(56, 79).mirror().addBox(0.0F, 3.7931F, -3.8609F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.0F, 0.9948F, 0.0F, -0.1745F));

		PartDefinition basin_r51 = bone3.addOrReplaceChild("basin_r51", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(0.0F, 2.6133F, -5.7605F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.0F, 1.3003F, 0.0F, -0.1745F));

		PartDefinition basin_r52 = bone3.addOrReplaceChild("basin_r52", CubeListBuilder.create().texOffs(80, 89).mirror().addBox(0.0F, 0.0981F, -6.0496F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.0F, 1.3875F, 0.0F, -0.1745F));

		PartDefinition basin_r53 = bone3.addOrReplaceChild("basin_r53", CubeListBuilder.create().texOffs(23, 78).mirror().addBox(0.0F, 4.3799F, -1.3991F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.0F, 0.6458F, 0.0F, -0.1745F));

		PartDefinition basin_r54 = bone3.addOrReplaceChild("basin_r54", CubeListBuilder.create().texOffs(5, 83).mirror().addBox(0.0F, 3.2223F, -1.2138F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.0F, 0.2531F, 0.0F, -0.1745F));

		PartDefinition basin_r55 = bone3.addOrReplaceChild("basin_r55", CubeListBuilder.create().texOffs(64, 56).mirror().addBox(0.0F, -0.4522F, -1.3452F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.0F, -0.0524F, 0.0F, -0.1745F));

		PartDefinition basin_r56 = bone3.addOrReplaceChild("basin_r56", CubeListBuilder.create().texOffs(51, 56).mirror().addBox(0.0F, 0.4013F, -1.1191F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.0F, -0.8378F, 0.0F, -0.1745F));

		return LayerDefinition.create(meshdefinition, 123, 123);
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