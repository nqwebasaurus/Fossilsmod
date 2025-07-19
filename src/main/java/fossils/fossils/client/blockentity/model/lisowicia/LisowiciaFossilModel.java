package fossils.fossils.client.blockentity.model.lisowicia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LisowiciaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart basin;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart head1;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart head4;
	private final ModelPart beak1;
	private final ModelPart tusk1;
	private final ModelPart tusk2;
	private final ModelPart jaw1;
	private final ModelPart jaw2;
	private final ModelPart jaw3;
	private final ModelPart beak2;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;

	public LisowiciaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.basin = this.root.getChild("basin");
		this.body = this.basin.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.head1 = this.neck1.getChild("head1");
		this.head2 = this.head1.getChild("head2");
		this.head3 = this.head2.getChild("head3");
		this.head4 = this.head2.getChild("head4");
		this.beak1 = this.head4.getChild("beak1");
		this.tusk1 = this.head4.getChild("tusk1");
		this.tusk2 = this.head4.getChild("tusk2");
		this.jaw1 = this.head1.getChild("jaw1");
		this.jaw2 = this.jaw1.getChild("jaw2");
		this.jaw3 = this.jaw2.getChild("jaw3");
		this.beak2 = this.jaw3.getChild("beak2");
		this.upperarm1 = this.chest.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.upperleg1 = this.basin.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.basin.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.0F, -3.0F, 0.0456F, 0.0F, 0.0F));

		PartDefinition basin_r1 = basin.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(78, 90).mirror().addBox(0.2694F, 0.2872F, -1.8194F, 1.0F, 8.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 7.3011F, 18.7204F, 0.0349F, 0.0F, -0.4276F));

		PartDefinition basin_r2 = basin.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(21, 26).mirror().addBox(0.2694F, -0.6621F, -1.9307F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 7.3011F, 18.7204F, 0.8116F, 0.0F, -0.4276F));

		PartDefinition basin_r3 = basin.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(98, 96).mirror().addBox(0.2694F, 2.7486F, -3.756F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 7.3011F, 18.7204F, 1.4748F, 0.0F, -0.4276F));

		PartDefinition basin_r4 = basin.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(20, 80).mirror().addBox(0.2694F, 3.0326F, -2.8659F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 7.3011F, 18.7204F, 0.637F, 0.0F, -0.4276F));

		PartDefinition basin_r5 = basin.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, -1.5079F, -1.7426F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8F, 3.8011F, 18.7204F, -0.0087F, 0.0F, -0.2182F));

		PartDefinition basin_r6 = basin.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(12, 51).mirror().addBox(-5.0F, 0.021F, -3.0126F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 51).addBox(4.0F, 0.021F, -3.0126F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8916F, 11.2086F, 1.9111F, 0.0F, 0.0F));

		PartDefinition basin_r7 = basin.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(35, 84).mirror().addBox(-5.0F, -0.0792F, -4.8819F, 1.0F, 6.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(35, 84).addBox(4.0F, -0.0792F, -4.8819F, 1.0F, 6.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.7084F, 12.8086F, 1.2566F, 0.0F, 0.0F));

		PartDefinition basin_r8 = basin.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(89, 14).mirror().addBox(-5.0F, -0.0516F, -5.0845F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 14).addBox(4.0F, -0.0516F, -5.0845F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.2084F, 17.8086F, 0.2793F, 0.0F, 0.0F));

		PartDefinition basin_r9 = basin.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-5.0F, -4.5F, -6.7F, 1.0F, 6.0F, 9.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 51).addBox(4.0F, -4.5F, -6.7F, 1.0F, 6.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.8916F, 18.3086F, -0.8901F, 0.0F, 0.0F));

		PartDefinition basin_r10 = basin.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(32, 8).mirror().addBox(-4.0F, -2.8F, 1.6F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(32, 8).addBox(1.0F, -2.8F, 1.6F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.1706F, 11.1275F, -0.3665F, 0.0F, 0.0F));

		PartDefinition basin_r11 = basin.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(98, 96).addBox(-1.2694F, 2.7486F, -3.756F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 7.3011F, 18.7204F, 1.4748F, 0.0F, 0.4276F));

		PartDefinition basin_r12 = basin.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(78, 90).addBox(-1.2694F, 0.2872F, -1.8194F, 1.0F, 8.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.0F, 7.3011F, 18.7204F, 0.0349F, 0.0F, 0.4276F));

		PartDefinition basin_r13 = basin.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(20, 80).addBox(-1.2694F, 3.0326F, -2.8659F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.0F, 7.3011F, 18.7204F, 0.637F, 0.0F, 0.4276F));

		PartDefinition basin_r14 = basin.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(21, 26).addBox(-1.2694F, -0.6621F, -1.9307F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.0F, 7.3011F, 18.7204F, 0.8116F, 0.0F, 0.4276F));

		PartDefinition basin_r15 = basin.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.5079F, -1.7426F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8F, 3.8011F, 18.7204F, -0.0087F, 0.0F, 0.2182F));

		PartDefinition basin_r16 = basin.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(6, 51).addBox(0.0F, -5.7825F, 7.945F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 51).addBox(0.0F, -5.6825F, 6.145F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 68).addBox(0.0F, -5.1825F, 4.245F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 8).addBox(0.0F, -4.5414F, 2.4634F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 8).addBox(0.0F, -3.9329F, 0.8122F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7294F, 11.5275F, -0.8901F, 0.0F, 0.0F));

		PartDefinition basin_r17 = basin.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(20, 41).addBox(-1.0F, -3.3F, -0.9F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6706F, 11.1275F, -0.3665F, 0.0F, 0.0F));

		PartDefinition neck20_r1 = basin.addOrReplaceChild("neck20_r1", CubeListBuilder.create().texOffs(39, 68).mirror().addBox(-4.6605F, -0.7682F, -0.5903F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -1.6784F, 12.4688F, -0.2565F, -0.2676F, -0.8014F));

		PartDefinition neck19_r1 = basin.addOrReplaceChild("neck19_r1", CubeListBuilder.create().texOffs(83, 56).mirror().addBox(-1.8264F, 0.1344F, -0.5424F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -1.6784F, 12.4688F, -0.3177F, -0.1394F, -0.2984F));

		PartDefinition neck19_r2 = basin.addOrReplaceChild("neck19_r2", CubeListBuilder.create().texOffs(39, 68).addBox(1.6605F, -0.7682F, -0.5903F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -1.6784F, 12.4688F, -0.2565F, 0.2676F, 0.8014F));

		PartDefinition neck18_r1 = basin.addOrReplaceChild("neck18_r1", CubeListBuilder.create().texOffs(83, 56).addBox(-0.1736F, 0.1344F, -0.5424F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -1.6784F, 12.4688F, -0.3177F, 0.1394F, 0.2984F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9706F, 11.9275F, 0.0456F, -0.0436F, -0.002F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(35, 44).addBox(-1.0F, -2.8807F, 0.6916F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.534F, -11.2038F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(3, 67).addBox(0.0F, -3.9167F, -0.0299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7751F, -2.3094F, -0.8203F, 0.0F, 0.0F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(26, 111).addBox(0.0F, -5.1213F, -0.2324F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4591F, -4.3466F, -0.733F, 0.0F, 0.0F));

		PartDefinition body_r4 = body.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(26, 111).addBox(0.0F, -4.9211F, -0.1328F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9398F, -6.311F, -0.6981F, 0.0F, 0.0F));

		PartDefinition body_r5 = body.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(15, 111).addBox(0.0F, -5.1525F, -0.0948F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.032F, -8.3387F, -0.6109F, 0.0F, 0.0F));

		PartDefinition body_r6 = body.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(69, 63).addBox(0.0F, -5.207F, -0.0371F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.232F, -10.3387F, -0.576F, 0.0F, 0.0F));

		PartDefinition body_r7 = body.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(46, 110).addBox(0.0F, -6.3566F, 1.0978F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 110).addBox(0.0F, -5.305F, -0.5307F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.632F, -13.7387F, -0.4712F, 0.0F, 0.0F));

		PartDefinition body_r8 = body.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(82, 110).addBox(0.0F, -5.7215F, -0.5353F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.232F, -15.7387F, -0.4538F, 0.0F, 0.0F));

		PartDefinition body_r9 = body.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(0, 111).addBox(0.0F, -6.278F, -0.2882F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.732F, -18.0387F, -0.4014F, 0.0F, 0.0F));

		PartDefinition neck21_r1 = body.addOrReplaceChild("neck21_r1", CubeListBuilder.create().texOffs(71, 5).mirror().addBox(-12.3956F, -3.0971F, 0.0641F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.649F, -2.2587F, -0.0151F, -0.2607F, -1.3728F));

		PartDefinition neck20_r2 = body.addOrReplaceChild("neck20_r2", CubeListBuilder.create().texOffs(68, 5).mirror().addBox(-15.4763F, -3.1035F, -0.5388F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.649F, -3.7587F, -0.0115F, -0.2436F, -1.3737F));

		PartDefinition neck19_r3 = body.addOrReplaceChild("neck19_r3", CubeListBuilder.create().texOffs(53, 1).mirror().addBox(-17.4984F, -3.1061F, -0.5275F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.949F, -5.7587F, 0.0052F, -0.2028F, -1.3254F));

		PartDefinition neck18_r2 = body.addOrReplaceChild("neck18_r2", CubeListBuilder.create().texOffs(43, 21).mirror().addBox(-18.5366F, -3.1129F, -0.7183F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.949F, -7.5587F, 0.0158F, -0.1785F, -1.2926F));

		PartDefinition neck17_r1 = body.addOrReplaceChild("neck17_r1", CubeListBuilder.create().texOffs(37, 26).mirror().addBox(-18.2707F, 0.6816F, -0.8023F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.949F, -9.8587F, 0.0305F, -0.1373F, -1.2601F));

		PartDefinition neck16_r1 = body.addOrReplaceChild("neck16_r1", CubeListBuilder.create().texOffs(21, 24).mirror().addBox(-19.3721F, 0.6999F, -0.9899F, 17.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.949F, -11.1587F, 0.0359F, -0.1207F, -1.2608F));

		PartDefinition neck15_r1 = body.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-20.3829F, 0.7109F, -0.8882F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.849F, -13.2587F, 0.0466F, -0.0875F, -1.2619F));

		PartDefinition neck14_r1 = body.addOrReplaceChild("neck14_r1", CubeListBuilder.create().texOffs(15, 2).mirror().addBox(-20.3828F, 0.7258F, -0.6887F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.449F, -15.4587F, 0.0572F, -0.0542F, -1.2626F));

		PartDefinition neck13_r1 = body.addOrReplaceChild("neck13_r1", CubeListBuilder.create().texOffs(15, 4).mirror().addBox(-20.3828F, 0.7258F, -0.6887F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.049F, -17.4587F, 0.0678F, -0.021F, -1.263F));

		PartDefinition neck12_r1 = body.addOrReplaceChild("neck12_r1", CubeListBuilder.create().texOffs(5, 20).mirror().addBox(-20.3828F, 0.7258F, -0.6887F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -1.749F, -19.4587F, 0.0678F, -0.021F, -1.263F));

		PartDefinition neck11_r1 = body.addOrReplaceChild("neck11_r1", CubeListBuilder.create().texOffs(97, 14).mirror().addBox(-1.6489F, 1.8617F, -0.7085F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -1.749F, -19.4587F, 0.0256F, -0.0168F, -0.7182F));

		PartDefinition neck12_r2 = body.addOrReplaceChild("neck12_r2", CubeListBuilder.create().texOffs(37, 96).mirror().addBox(-1.6489F, 1.8617F, -0.7085F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.049F, -17.4587F, 0.0256F, -0.0168F, -0.7182F));

		PartDefinition neck13_r2 = body.addOrReplaceChild("neck13_r2", CubeListBuilder.create().texOffs(95, 68).mirror().addBox(-1.6489F, 1.8617F, -0.7085F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.449F, -15.4587F, -0.0007F, -0.0398F, -0.7175F));

		PartDefinition neck14_r2 = body.addOrReplaceChild("neck14_r2", CubeListBuilder.create().texOffs(93, 85).mirror().addBox(-1.6495F, 1.8534F, -0.9083F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.849F, -13.2587F, -0.027F, -0.0627F, -0.7161F));

		PartDefinition neck15_r2 = body.addOrReplaceChild("neck15_r2", CubeListBuilder.create().texOffs(93, 83).mirror().addBox(-1.6422F, 1.8405F, -1.0101F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.949F, -11.1587F, -0.0534F, -0.0856F, -0.7141F));

		PartDefinition neck16_r2 = body.addOrReplaceChild("neck16_r2", CubeListBuilder.create().texOffs(48, 84).mirror().addBox(-1.5718F, 1.7683F, -0.8214F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.949F, -9.8587F, -0.0667F, -0.097F, -0.7129F));

		PartDefinition neck17_r2 = body.addOrReplaceChild("neck17_r2", CubeListBuilder.create().texOffs(83, 14).mirror().addBox(-4.6189F, -0.8231F, -0.9034F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.949F, -7.5587F, -0.1008F, -0.1246F, -0.744F));

		PartDefinition neck18_r3 = body.addOrReplaceChild("neck18_r3", CubeListBuilder.create().texOffs(82, 16).mirror().addBox(-4.5897F, -0.8412F, -0.7118F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.949F, -5.7587F, -0.1225F, -0.1398F, -0.7759F));

		PartDefinition neck19_r4 = body.addOrReplaceChild("neck19_r4", CubeListBuilder.create().texOffs(75, 55).mirror().addBox(-4.569F, -0.8502F, -0.7225F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.649F, -3.7587F, -0.1582F, -0.1662F, -0.8226F));

		PartDefinition neck20_r3 = body.addOrReplaceChild("neck20_r3", CubeListBuilder.create().texOffs(75, 55).mirror().addBox(-4.5186F, -0.8994F, -0.1183F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.649F, -2.2587F, -0.1702F, -0.1789F, -0.8205F));

		PartDefinition neck19_r5 = body.addOrReplaceChild("neck19_r5", CubeListBuilder.create().texOffs(50, 86).mirror().addBox(-1.7525F, -0.0325F, -0.0662F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.649F, -2.2587F, -0.2003F, -0.1027F, -0.3126F));

		PartDefinition neck18_r4 = body.addOrReplaceChild("neck18_r4", CubeListBuilder.create().texOffs(50, 86).mirror().addBox(-1.7902F, 0.0137F, -0.6715F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.649F, -3.7587F, -0.1836F, -0.0973F, -0.3143F));

		PartDefinition neck17_r3 = body.addOrReplaceChild("neck17_r3", CubeListBuilder.create().texOffs(60, 86).mirror().addBox(-1.8035F, 0.032F, -0.661F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.949F, -5.7587F, -0.1398F, -0.0915F, -0.2663F));

		PartDefinition neck16_r3 = body.addOrReplaceChild("neck16_r3", CubeListBuilder.create().texOffs(75, 57).mirror().addBox(-1.8258F, 0.0552F, -0.853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.949F, -7.5587F, -0.1135F, -0.0887F, -0.2339F));

		PartDefinition neck15_r3 = body.addOrReplaceChild("neck15_r3", CubeListBuilder.create().texOffs(88, 34).mirror().addBox(2.0975F, 0.8371F, -0.912F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.949F, -9.8587F, -0.0703F, -0.0812F, -0.2027F));

		PartDefinition neck14_r3 = body.addOrReplaceChild("neck14_r3", CubeListBuilder.create().texOffs(78, 34).mirror().addBox(2.0656F, 0.9276F, -1.1031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.949F, -11.1587F, -0.0531F, -0.0776F, -0.2041F));

		PartDefinition neck13_r3 = body.addOrReplaceChild("neck13_r3", CubeListBuilder.create().texOffs(88, 74).mirror().addBox(2.0685F, 0.946F, -1.0019F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.849F, -13.2587F, -0.0189F, -0.0705F, -0.2066F));

		PartDefinition neck12_r3 = body.addOrReplaceChild("neck12_r3", CubeListBuilder.create().texOffs(28, 92).mirror().addBox(2.0788F, 0.9601F, -0.8027F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.449F, -15.4587F, 0.0154F, -0.0633F, -0.2089F));

		PartDefinition neck11_r2 = body.addOrReplaceChild("neck11_r2", CubeListBuilder.create().texOffs(28, 94).mirror().addBox(2.0788F, 0.9601F, -0.8027F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.049F, -17.4587F, 0.0496F, -0.056F, -0.211F));

		PartDefinition neck10_r1 = body.addOrReplaceChild("neck10_r1", CubeListBuilder.create().texOffs(97, 16).mirror().addBox(2.0788F, 0.9601F, -0.8027F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -1.749F, -19.4587F, 0.0496F, -0.056F, -0.211F));

		PartDefinition neck20_r4 = body.addOrReplaceChild("neck20_r4", CubeListBuilder.create().texOffs(71, 5).addBox(3.3956F, -3.0971F, 0.0641F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.649F, -2.2587F, -0.0151F, 0.2607F, 1.3728F));

		PartDefinition neck19_r6 = body.addOrReplaceChild("neck19_r6", CubeListBuilder.create().texOffs(75, 55).addBox(1.5186F, -0.8994F, -0.1183F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.649F, -2.2587F, -0.1702F, 0.1789F, 0.8205F));

		PartDefinition neck18_r5 = body.addOrReplaceChild("neck18_r5", CubeListBuilder.create().texOffs(50, 86).addBox(-0.2475F, -0.0325F, -0.0662F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.649F, -2.2587F, -0.2003F, 0.1027F, 0.3126F));

		PartDefinition neck19_r7 = body.addOrReplaceChild("neck19_r7", CubeListBuilder.create().texOffs(68, 5).addBox(3.4763F, -3.1035F, -0.5388F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.649F, -3.7587F, -0.0115F, 0.2436F, 1.3737F));

		PartDefinition neck18_r6 = body.addOrReplaceChild("neck18_r6", CubeListBuilder.create().texOffs(75, 55).addBox(1.5691F, -0.8502F, -0.7225F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.649F, -3.7587F, -0.1582F, 0.1662F, 0.8226F));

		PartDefinition neck17_r4 = body.addOrReplaceChild("neck17_r4", CubeListBuilder.create().texOffs(50, 86).addBox(-0.2098F, 0.0137F, -0.6715F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.649F, -3.7587F, -0.1836F, 0.0973F, 0.3143F));

		PartDefinition neck18_r7 = body.addOrReplaceChild("neck18_r7", CubeListBuilder.create().texOffs(53, 1).addBox(3.4984F, -3.1061F, -0.5275F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.949F, -5.7587F, 0.0052F, 0.2028F, 1.3254F));

		PartDefinition neck17_r5 = body.addOrReplaceChild("neck17_r5", CubeListBuilder.create().texOffs(82, 16).addBox(1.5897F, -0.8412F, -0.7118F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.949F, -5.7587F, -0.1225F, 0.1398F, 0.7759F));

		PartDefinition neck16_r4 = body.addOrReplaceChild("neck16_r4", CubeListBuilder.create().texOffs(60, 86).addBox(-0.1965F, 0.032F, -0.661F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.949F, -5.7587F, -0.1398F, 0.0915F, 0.2663F));

		PartDefinition neck17_r6 = body.addOrReplaceChild("neck17_r6", CubeListBuilder.create().texOffs(43, 21).addBox(3.5366F, -3.1129F, -0.7183F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.949F, -7.5587F, 0.0158F, 0.1785F, 1.2926F));

		PartDefinition neck16_r5 = body.addOrReplaceChild("neck16_r5", CubeListBuilder.create().texOffs(83, 14).addBox(1.6189F, -0.8231F, -0.9034F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.949F, -7.5587F, -0.1008F, 0.1246F, 0.744F));

		PartDefinition neck15_r4 = body.addOrReplaceChild("neck15_r4", CubeListBuilder.create().texOffs(75, 57).addBox(-0.1742F, 0.0552F, -0.853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.949F, -7.5587F, -0.1135F, 0.0887F, 0.2339F));

		PartDefinition neck16_r6 = body.addOrReplaceChild("neck16_r6", CubeListBuilder.create().texOffs(37, 26).addBox(2.2707F, 0.6816F, -0.8023F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.949F, -9.8587F, 0.0305F, 0.1373F, 1.2601F));

		PartDefinition neck15_r5 = body.addOrReplaceChild("neck15_r5", CubeListBuilder.create().texOffs(48, 84).addBox(-1.4282F, 1.7683F, -0.8214F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.949F, -9.8587F, -0.0667F, 0.097F, 0.7129F));

		PartDefinition neck14_r4 = body.addOrReplaceChild("neck14_r4", CubeListBuilder.create().texOffs(88, 34).addBox(-4.0975F, 0.8371F, -0.912F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.949F, -9.8587F, -0.0703F, 0.0812F, 0.2027F));

		PartDefinition neck15_r6 = body.addOrReplaceChild("neck15_r6", CubeListBuilder.create().texOffs(21, 24).addBox(2.372F, 0.6999F, -0.9899F, 17.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.949F, -11.1587F, 0.0359F, 0.1207F, 1.2608F));

		PartDefinition neck14_r5 = body.addOrReplaceChild("neck14_r5", CubeListBuilder.create().texOffs(93, 83).addBox(-1.3578F, 1.8405F, -1.0101F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.949F, -11.1587F, -0.0534F, 0.0856F, 0.7141F));

		PartDefinition neck13_r4 = body.addOrReplaceChild("neck13_r4", CubeListBuilder.create().texOffs(78, 34).addBox(-4.0656F, 0.9276F, -1.1031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.949F, -11.1587F, -0.0531F, 0.0776F, 0.2041F));

		PartDefinition neck14_r6 = body.addOrReplaceChild("neck14_r6", CubeListBuilder.create().texOffs(15, 0).addBox(2.3829F, 0.7109F, -0.8882F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.849F, -13.2587F, 0.0466F, 0.0875F, 1.2619F));

		PartDefinition neck13_r5 = body.addOrReplaceChild("neck13_r5", CubeListBuilder.create().texOffs(93, 85).addBox(-1.3505F, 1.8534F, -0.9083F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.849F, -13.2587F, -0.027F, 0.0627F, 0.7161F));

		PartDefinition neck12_r4 = body.addOrReplaceChild("neck12_r4", CubeListBuilder.create().texOffs(88, 74).addBox(-4.0685F, 0.946F, -1.0019F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.849F, -13.2587F, -0.0189F, 0.0705F, 0.2066F));

		PartDefinition neck13_r6 = body.addOrReplaceChild("neck13_r6", CubeListBuilder.create().texOffs(15, 2).addBox(2.3828F, 0.7258F, -0.6887F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.449F, -15.4587F, 0.0572F, 0.0542F, 1.2626F));

		PartDefinition neck12_r5 = body.addOrReplaceChild("neck12_r5", CubeListBuilder.create().texOffs(95, 68).addBox(-1.3511F, 1.8617F, -0.7085F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.449F, -15.4587F, -0.0007F, 0.0398F, 0.7175F));

		PartDefinition neck11_r3 = body.addOrReplaceChild("neck11_r3", CubeListBuilder.create().texOffs(28, 92).addBox(-4.0788F, 0.9601F, -0.8027F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.449F, -15.4587F, 0.0154F, 0.0633F, 0.2089F));

		PartDefinition neck12_r6 = body.addOrReplaceChild("neck12_r6", CubeListBuilder.create().texOffs(15, 4).addBox(2.3828F, 0.7258F, -0.6887F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.049F, -17.4587F, 0.0678F, 0.021F, 1.263F));

		PartDefinition neck11_r4 = body.addOrReplaceChild("neck11_r4", CubeListBuilder.create().texOffs(37, 96).addBox(-1.3511F, 1.8617F, -0.7085F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.049F, -17.4587F, 0.0256F, 0.0168F, 0.7182F));

		PartDefinition neck10_r2 = body.addOrReplaceChild("neck10_r2", CubeListBuilder.create().texOffs(28, 94).addBox(-4.0788F, 0.9601F, -0.8027F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.049F, -17.4587F, 0.0496F, 0.056F, 0.211F));

		PartDefinition neck11_r5 = body.addOrReplaceChild("neck11_r5", CubeListBuilder.create().texOffs(5, 20).addBox(2.3828F, 0.7258F, -0.6887F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -1.749F, -19.4587F, 0.0678F, 0.021F, 1.263F));

		PartDefinition neck10_r3 = body.addOrReplaceChild("neck10_r3", CubeListBuilder.create().texOffs(97, 14).addBox(-1.3511F, 1.8617F, -0.7085F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -1.749F, -19.4587F, 0.0256F, 0.0168F, 0.7182F));

		PartDefinition neck9_r1 = body.addOrReplaceChild("neck9_r1", CubeListBuilder.create().texOffs(97, 16).addBox(-4.0788F, 0.9601F, -0.8027F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -1.749F, -19.4587F, 0.0496F, 0.056F, 0.211F));

		PartDefinition body_r10 = body.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(3, 111).addBox(0.0F, -5.7552F, -0.1304F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.732F, -20.0387F, -0.3491F, 0.0F, 0.0F));

		PartDefinition body_r11 = body.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(5, 24).addBox(-1.0F, -0.0853F, -11.0936F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -4.2608F, -10.1935F, 0.1571F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6739F, -20.9552F, 0.0F, 0.0436F, 0.0F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(86, 104).mirror().addBox(-0.5594F, -9.425F, -0.267F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1513F, 11.1518F, -16.5322F, -1.2795F, 0.4715F, -1.9269F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(74, 110).mirror().addBox(3.7988F, -4.617F, -1.3698F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1513F, 16.2518F, -16.0322F, -0.8181F, 0.7096F, -1.5572F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(110, 31).mirror().addBox(-0.2871F, -4.8628F, -0.3181F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1513F, 16.2518F, -16.0322F, 1.2438F, 0.417F, 0.8605F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(65, 104).mirror().addBox(-2.4956F, -2.958F, -0.5982F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4616F, 18.0411F, -12.2714F, 1.1837F, 0.1185F, 0.3644F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(90, 34).mirror().addBox(-0.2559F, -5.3734F, -6.3352F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.3F, 8.5418F, -12.2845F, 1.8656F, -0.3283F, -0.1429F));

		PartDefinition chest_r6 = chest.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(10, 87).mirror().addBox(-0.2559F, -1.9874F, -5.1079F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3F, 8.5418F, -12.2845F, 0.8708F, -0.3283F, -0.1429F));

		PartDefinition chest_r7 = chest.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(97, 18).mirror().addBox(0.9435F, -0.225F, 0.0164F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-7.1F, 7.1418F, -13.6845F, 0.1375F, -0.1166F, 0.1848F));

		PartDefinition chest_r8 = chest.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(67, 81).mirror().addBox(0.7454F, -0.0333F, -0.0925F, 1.0F, 4.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-7.1F, 5.0418F, -8.6845F, 1.2895F, -0.1166F, 0.1848F));

		PartDefinition chest_r9 = chest.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -6.1644F, -7.513F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.1F, 8.0418F, -2.6845F, 0.7309F, -0.1166F, 0.1848F));

		PartDefinition chest_r10 = chest.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(86, 104).addBox(-0.4406F, -9.425F, -0.267F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1513F, 11.1518F, -16.5322F, -1.2795F, -0.4715F, 1.9269F));

		PartDefinition chest_r11 = chest.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(74, 110).addBox(-4.7988F, -4.617F, -1.3698F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1513F, 16.2518F, -16.0322F, -0.8181F, -0.7096F, 1.5572F));

		PartDefinition chest_r12 = chest.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(110, 31).addBox(-0.7129F, -4.8628F, -0.3181F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1513F, 16.2518F, -16.0322F, 1.2438F, -0.417F, -0.8605F));

		PartDefinition chest_r13 = chest.addOrReplaceChild("chest_r13", CubeListBuilder.create().texOffs(65, 104).addBox(-0.5044F, -2.958F, -0.5982F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4616F, 18.0411F, -12.2714F, 1.1837F, -0.1185F, -0.3644F));

		PartDefinition chest_r14 = chest.addOrReplaceChild("chest_r14", CubeListBuilder.create().texOffs(67, 81).addBox(-1.7454F, -0.0333F, -0.0925F, 1.0F, 4.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(7.1F, 5.0418F, -8.6845F, 1.2895F, 0.1166F, -0.1848F));

		PartDefinition chest_r15 = chest.addOrReplaceChild("chest_r15", CubeListBuilder.create().texOffs(97, 18).addBox(-1.9435F, -0.225F, 0.0164F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(7.1F, 7.1418F, -13.6845F, 0.1375F, 0.1166F, -0.1848F));

		PartDefinition chest_r16 = chest.addOrReplaceChild("chest_r16", CubeListBuilder.create().texOffs(90, 34).addBox(-0.7441F, -5.3734F, -6.3352F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.3F, 8.5418F, -12.2845F, 1.8656F, 0.3283F, 0.1429F));

		PartDefinition chest_r17 = chest.addOrReplaceChild("chest_r17", CubeListBuilder.create().texOffs(10, 87).addBox(-0.7441F, -1.9874F, -5.1079F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3F, 8.5418F, -12.2845F, 0.8708F, 0.3283F, 0.1429F));

		PartDefinition chest_r18 = chest.addOrReplaceChild("chest_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -6.1644F, -7.513F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1F, 8.0418F, -2.6845F, 0.7309F, 0.1166F, -0.1848F));

		PartDefinition chest_r19 = chest.addOrReplaceChild("chest_r19", CubeListBuilder.create().texOffs(6, 111).addBox(0.0F, -5.8694F, -0.4762F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3247F, -1.1983F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest_r20 = chest.addOrReplaceChild("chest_r20", CubeListBuilder.create().texOffs(9, 111).addBox(0.0F, -10.8508F, 7.7927F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 111).addBox(0.0F, -9.9508F, 6.0927F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.472F, -11.8268F, -0.1047F, 0.0F, 0.0F));

		PartDefinition chest_r21 = chest.addOrReplaceChild("chest_r21", CubeListBuilder.create().texOffs(26, 54).addBox(0.0F, -8.1508F, 3.0927F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(109, 5).addBox(0.0F, -6.2508F, 0.2927F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.472F, -11.7268F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck11_r6 = chest.addOrReplaceChild("neck11_r6", CubeListBuilder.create().texOffs(5, 22).mirror().addBox(-20.3828F, 0.7258F, -0.6887F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 0.4249F, -0.8035F, 0.0837F, 0.0289F, -1.263F));

		PartDefinition neck10_r4 = chest.addOrReplaceChild("neck10_r4", CubeListBuilder.create().texOffs(32, 6).mirror().addBox(-19.3828F, 0.7258F, -0.6887F, 17.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 1.1249F, -2.6035F, 0.089F, 0.0456F, -1.2628F));

		PartDefinition neck9_r2 = chest.addOrReplaceChild("neck9_r2", CubeListBuilder.create().texOffs(37, 28).mirror().addBox(-18.3828F, 0.7258F, -0.6887F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 2.1249F, -4.6035F, 0.0837F, 0.0289F, -1.263F));

		PartDefinition neck8_r1 = chest.addOrReplaceChild("neck8_r1", CubeListBuilder.create().texOffs(53, 3).mirror().addBox(-17.6246F, -3.1708F, -0.3981F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 3.2249F, -7.1035F, 0.0996F, 0.0788F, -1.2795F));

		PartDefinition neck7_r1 = chest.addOrReplaceChild("neck7_r1", CubeListBuilder.create().texOffs(71, 27).mirror().addBox(-15.6246F, -3.1708F, -0.3981F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 4.2249F, -9.6035F, 0.1156F, 0.1287F, -1.2953F));

		PartDefinition neck6_r1 = chest.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(109, 0).mirror().addBox(-4.7358F, -0.834F, -0.5874F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 4.2249F, -9.6035F, 0.1442F, 0.0864F, -0.749F));

		PartDefinition neck7_r2 = chest.addOrReplaceChild("neck7_r2", CubeListBuilder.create().texOffs(108, 50).mirror().addBox(-4.7358F, -0.834F, -0.5874F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 3.2249F, -7.1035F, 0.1045F, 0.0521F, -0.7343F));

		PartDefinition neck8_r2 = chest.addOrReplaceChild("neck8_r2", CubeListBuilder.create().texOffs(108, 48).mirror().addBox(-1.6489F, 1.8617F, -0.7085F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 2.1249F, -4.6035F, 0.0651F, 0.0176F, -0.7182F));

		PartDefinition neck9_r3 = chest.addOrReplaceChild("neck9_r3", CubeListBuilder.create().texOffs(106, 77).mirror().addBox(-1.6489F, 1.8617F, -0.7085F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 1.1249F, -2.6035F, 0.0782F, 0.0291F, -0.7179F));

		PartDefinition neck10_r5 = chest.addOrReplaceChild("neck10_r5", CubeListBuilder.create().texOffs(97, 26).mirror().addBox(-1.6489F, 1.8617F, -0.7085F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 0.4249F, -0.8035F, 0.0651F, 0.0176F, -0.7182F));

		PartDefinition neck9_r4 = chest.addOrReplaceChild("neck9_r4", CubeListBuilder.create().texOffs(110, 39).mirror().addBox(2.0788F, 0.9601F, -0.8027F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 0.4249F, -0.8035F, 0.1008F, -0.045F, -0.2135F));

		PartDefinition neck8_r3 = chest.addOrReplaceChild("neck8_r3", CubeListBuilder.create().texOffs(110, 41).mirror().addBox(2.0788F, 0.9601F, -0.8027F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 1.1249F, -2.6035F, 0.1179F, -0.0413F, -0.2143F));

		PartDefinition neck7_r3 = chest.addOrReplaceChild("neck7_r3", CubeListBuilder.create().texOffs(111, 26).mirror().addBox(2.0788F, 0.9601F, -0.8027F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 2.1249F, -4.6035F, 0.1008F, -0.045F, -0.2135F));

		PartDefinition neck6_r2 = chest.addOrReplaceChild("neck6_r2", CubeListBuilder.create().texOffs(32, 111).mirror().addBox(-1.924F, 0.1137F, -0.5359F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 3.2249F, -7.1035F, 0.152F, -0.0339F, -0.233F));

		PartDefinition neck5_r1 = chest.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(39, 111).mirror().addBox(-1.924F, 0.1137F, -0.5359F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 4.2249F, -9.6035F, 0.2032F, -0.0226F, -0.2519F));

		PartDefinition neck8_r4 = chest.addOrReplaceChild("neck8_r4", CubeListBuilder.create().texOffs(110, 39).addBox(-4.0788F, 0.9601F, -0.8027F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 0.4249F, -0.8035F, 0.1008F, 0.045F, 0.2135F));

		PartDefinition neck9_r5 = chest.addOrReplaceChild("neck9_r5", CubeListBuilder.create().texOffs(97, 26).addBox(-1.3511F, 1.8617F, -0.7085F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 0.4249F, -0.8035F, 0.0651F, -0.0176F, 0.7182F));

		PartDefinition neck10_r6 = chest.addOrReplaceChild("neck10_r6", CubeListBuilder.create().texOffs(5, 22).addBox(2.3828F, 0.7258F, -0.6887F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 0.4249F, -0.8035F, 0.0837F, -0.0289F, 1.263F));

		PartDefinition neck7_r4 = chest.addOrReplaceChild("neck7_r4", CubeListBuilder.create().texOffs(110, 41).addBox(-4.0788F, 0.9601F, -0.8027F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 1.1249F, -2.6035F, 0.1179F, 0.0413F, 0.2143F));

		PartDefinition neck8_r5 = chest.addOrReplaceChild("neck8_r5", CubeListBuilder.create().texOffs(106, 77).addBox(-1.3511F, 1.8617F, -0.7085F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 1.1249F, -2.6035F, 0.0782F, -0.0291F, 0.7179F));

		PartDefinition neck9_r6 = chest.addOrReplaceChild("neck9_r6", CubeListBuilder.create().texOffs(32, 6).addBox(2.3828F, 0.7258F, -0.6887F, 17.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 1.1249F, -2.6035F, 0.089F, -0.0456F, 1.2628F));

		PartDefinition neck6_r3 = chest.addOrReplaceChild("neck6_r3", CubeListBuilder.create().texOffs(111, 26).addBox(-4.0788F, 0.9601F, -0.8027F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 2.1249F, -4.6035F, 0.1008F, 0.045F, 0.2135F));

		PartDefinition neck7_r5 = chest.addOrReplaceChild("neck7_r5", CubeListBuilder.create().texOffs(108, 48).addBox(-1.3511F, 1.8617F, -0.7085F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 2.1249F, -4.6035F, 0.0651F, -0.0176F, 0.7182F));

		PartDefinition neck8_r6 = chest.addOrReplaceChild("neck8_r6", CubeListBuilder.create().texOffs(37, 28).addBox(2.3828F, 0.7258F, -0.6887F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 2.1249F, -4.6035F, 0.0837F, -0.0289F, 1.263F));

		PartDefinition neck7_r6 = chest.addOrReplaceChild("neck7_r6", CubeListBuilder.create().texOffs(53, 3).addBox(3.6246F, -3.1708F, -0.3981F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 3.2249F, -7.1035F, 0.0996F, -0.0788F, 1.2795F));

		PartDefinition neck6_r4 = chest.addOrReplaceChild("neck6_r4", CubeListBuilder.create().texOffs(108, 50).addBox(1.7358F, -0.834F, -0.5874F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 3.2249F, -7.1035F, 0.1045F, -0.0521F, 0.7343F));

		PartDefinition neck5_r2 = chest.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(32, 111).addBox(-0.076F, 0.1137F, -0.5359F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 3.2249F, -7.1035F, 0.152F, 0.0339F, 0.233F));

		PartDefinition neck4_r1 = chest.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(39, 111).addBox(-0.076F, 0.1137F, -0.5359F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 4.2249F, -9.6035F, 0.2032F, 0.0226F, 0.2519F));

		PartDefinition neck5_r3 = chest.addOrReplaceChild("neck5_r3", CubeListBuilder.create().texOffs(109, 0).addBox(1.7358F, -0.834F, -0.5874F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 4.2249F, -9.6035F, 0.1442F, -0.0864F, 0.749F));

		PartDefinition neck6_r5 = chest.addOrReplaceChild("neck6_r5", CubeListBuilder.create().texOffs(71, 27).addBox(3.6246F, -3.1708F, -0.3981F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 4.2249F, -9.6035F, 0.1156F, -0.1287F, 1.2953F));

		PartDefinition chest_r22 = chest.addOrReplaceChild("chest_r22", CubeListBuilder.create().texOffs(82, 81).addBox(-1.0F, -0.0692F, -0.5509F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.472F, -12.1268F, 0.4712F, 0.0F, 0.0F));

		PartDefinition chest_r23 = chest.addOrReplaceChild("chest_r23", CubeListBuilder.create().texOffs(64, 63).addBox(-1.0F, -0.2044F, -7.7262F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.728F, -0.0268F, 0.384F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.872F, -9.5268F, -0.072F, 0.0435F, -0.0031F));

		PartDefinition neck7_r7 = neck1.addOrReplaceChild("neck7_r7", CubeListBuilder.create().texOffs(26, 66).mirror().addBox(-14.6302F, -3.2502F, -0.0761F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9529F, -2.5767F, 0.1596F, 0.2615F, -1.3391F));

		PartDefinition neck6_r6 = neck1.addOrReplaceChild("neck6_r6", CubeListBuilder.create().texOffs(53, 39).mirror().addBox(-11.5397F, -3.3078F, -0.4614F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4529F, -4.4767F, 0.1769F, 0.3112F, -1.4564F));

		PartDefinition neck5_r4 = neck1.addOrReplaceChild("neck5_r4", CubeListBuilder.create().texOffs(5, 17).mirror().addBox(-7.5623F, -3.2934F, -0.3651F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0529F, -6.5767F, 0.1947F, 0.3608F, -1.4855F));

		PartDefinition neck6_r7 = neck1.addOrReplaceChild("neck6_r7", CubeListBuilder.create().texOffs(111, 81).mirror().addBox(-5.517F, -3.3222F, -0.5578F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.5529F, -8.3767F, 0.1887F, 0.3443F, -1.5399F));

		PartDefinition neck6_r8 = neck1.addOrReplaceChild("neck6_r8", CubeListBuilder.create().texOffs(63, 41).mirror().addBox(-4.7163F, -1.0158F, -0.7504F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.0529F, -10.2767F, 0.4045F, 0.2984F, -1.0826F));

		PartDefinition neck5_r5 = neck1.addOrReplaceChild("neck5_r5", CubeListBuilder.create().texOffs(109, 92).mirror().addBox(-4.7163F, -1.0158F, -0.7504F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.5529F, -8.3767F, 0.3198F, 0.233F, -0.9827F));

		PartDefinition neck4_r2 = neck1.addOrReplaceChild("neck4_r2", CubeListBuilder.create().texOffs(109, 102).mirror().addBox(-4.7471F, -0.9718F, -0.5577F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0529F, -6.5767F, 0.3337F, 0.244F, -0.9271F));

		PartDefinition neck5_r6 = neck1.addOrReplaceChild("neck5_r6", CubeListBuilder.create().texOffs(109, 100).mirror().addBox(-4.7317F, -0.9938F, -0.6541F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4529F, -4.4767F, 0.2922F, 0.2108F, -0.9015F));

		PartDefinition neck6_r9 = neck1.addOrReplaceChild("neck6_r9", CubeListBuilder.create().texOffs(109, 90).mirror().addBox(-4.7933F, -0.9059F, -0.2687F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9529F, -2.5767F, 0.2512F, 0.1772F, -0.7872F));

		PartDefinition neck5_r7 = neck1.addOrReplaceChild("neck5_r7", CubeListBuilder.create().texOffs(49, 111).mirror().addBox(-2.0F, 0.0902F, -0.2139F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9529F, -2.5767F, 0.3395F, 0.0076F, -0.3053F));

		PartDefinition neck4_r3 = neck1.addOrReplaceChild("neck4_r3", CubeListBuilder.create().texOffs(91, 111).mirror().addBox(-2.0F, -0.0301F, -0.5954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4529F, -4.4767F, 0.3906F, 0.0189F, -0.4268F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(112, 2).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0529F, -6.5767F, 0.4418F, 0.0301F, -0.4605F));

		PartDefinition neck4_r4 = neck1.addOrReplaceChild("neck4_r4", CubeListBuilder.create().texOffs(111, 79).mirror().addBox(-2.0F, -0.0602F, -0.6907F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.5529F, -8.3767F, 0.4247F, 0.0264F, -0.5133F));

		PartDefinition neck5_r8 = neck1.addOrReplaceChild("neck5_r8", CubeListBuilder.create().texOffs(52, 57).mirror().addBox(-2.0F, -0.0602F, -0.6907F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.0529F, -10.2767F, 0.5271F, 0.0487F, -0.6316F));

		PartDefinition neck6_r10 = neck1.addOrReplaceChild("neck6_r10", CubeListBuilder.create().texOffs(26, 66).addBox(3.6302F, -3.2502F, -0.0761F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9529F, -2.5767F, 0.1596F, -0.2615F, 1.3391F));

		PartDefinition neck5_r9 = neck1.addOrReplaceChild("neck5_r9", CubeListBuilder.create().texOffs(109, 90).addBox(1.7933F, -0.9059F, -0.2687F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9529F, -2.5767F, 0.2512F, -0.1772F, 0.7872F));

		PartDefinition neck4_r5 = neck1.addOrReplaceChild("neck4_r5", CubeListBuilder.create().texOffs(49, 111).addBox(0.0F, 0.0902F, -0.2139F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9529F, -2.5767F, 0.3395F, -0.0076F, 0.3053F));

		PartDefinition neck5_r10 = neck1.addOrReplaceChild("neck5_r10", CubeListBuilder.create().texOffs(53, 39).addBox(3.5397F, -3.3078F, -0.4614F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4529F, -4.4767F, 0.1769F, -0.3112F, 1.4564F));

		PartDefinition neck4_r6 = neck1.addOrReplaceChild("neck4_r6", CubeListBuilder.create().texOffs(109, 100).addBox(1.7317F, -0.9938F, -0.6541F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4529F, -4.4767F, 0.2922F, -0.2108F, 0.9015F));

		PartDefinition neck3_r2 = neck1.addOrReplaceChild("neck3_r2", CubeListBuilder.create().texOffs(91, 111).addBox(0.0F, -0.0301F, -0.5954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4529F, -4.4767F, 0.3906F, -0.0189F, 0.4268F));

		PartDefinition neck5_r11 = neck1.addOrReplaceChild("neck5_r11", CubeListBuilder.create().texOffs(63, 41).addBox(1.7163F, -1.0158F, -0.7504F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.0529F, -10.2767F, 0.4045F, -0.2984F, 1.0826F));

		PartDefinition neck4_r7 = neck1.addOrReplaceChild("neck4_r7", CubeListBuilder.create().texOffs(52, 57).addBox(0.0F, -0.0602F, -0.6907F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.0529F, -10.2767F, 0.5271F, -0.0487F, 0.6316F));

		PartDefinition neck5_r12 = neck1.addOrReplaceChild("neck5_r12", CubeListBuilder.create().texOffs(111, 81).addBox(3.517F, -3.3222F, -0.5578F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.5529F, -8.3767F, 0.1887F, -0.3443F, 1.5399F));

		PartDefinition neck4_r8 = neck1.addOrReplaceChild("neck4_r8", CubeListBuilder.create().texOffs(109, 92).addBox(1.7163F, -1.0158F, -0.7504F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.5529F, -8.3767F, 0.3198F, -0.233F, 0.9827F));

		PartDefinition neck3_r3 = neck1.addOrReplaceChild("neck3_r3", CubeListBuilder.create().texOffs(111, 79).addBox(0.0F, -0.0602F, -0.6907F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.5529F, -8.3767F, 0.4247F, -0.0264F, 0.5133F));

		PartDefinition neck4_r9 = neck1.addOrReplaceChild("neck4_r9", CubeListBuilder.create().texOffs(5, 17).addBox(3.5623F, -3.2934F, -0.3651F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0529F, -6.5767F, 0.1947F, -0.3608F, 1.4855F));

		PartDefinition neck3_r4 = neck1.addOrReplaceChild("neck3_r4", CubeListBuilder.create().texOffs(109, 102).addBox(1.7471F, -0.9718F, -0.5577F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0529F, -6.5767F, 0.3337F, -0.244F, 0.9271F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(112, 2).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0529F, -6.5767F, 0.4418F, -0.0301F, 0.4605F));

		PartDefinition neck4_r10 = neck1.addOrReplaceChild("neck4_r10", CubeListBuilder.create().texOffs(29, 68).addBox(0.0F, -1.2537F, -3.8993F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 67).addBox(0.0F, -2.0537F, -1.8993F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 111).addBox(0.0F, -3.8537F, 2.1007F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 41).addBox(0.0F, -2.8537F, 0.1007F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9918F, -7.4789F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck4_r11 = neck1.addOrReplaceChild("neck4_r11", CubeListBuilder.create().texOffs(29, 111).addBox(0.0F, -4.9023F, 0.1159F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9918F, -3.4789F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(5, 38).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.6338F, -11.0489F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head1 = neck1.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4338F, -10.8489F, -0.0263F, 0.176F, 0.1116F));

		PartDefinition head3_r1 = head1.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(5, 24).mirror().addBox(-5.5F, -6.6857F, -1.5491F, 3.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(5, 24).addBox(2.5F, -6.6857F, -1.5491F, 3.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.2046F, -2.4004F, -0.384F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head1.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(28, 96).mirror().addBox(-5.5F, -5.0737F, -1.8976F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 96).addBox(2.5F, -5.0737F, -1.8976F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(95, 62).addBox(-2.5F, -1.0737F, -1.8976F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(95, 62).addBox(-2.5F, -4.0737F, -1.8976F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(95, 62).addBox(-2.5F, -7.2737F, -1.8976F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2046F, 0.3996F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head1.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(28, 96).mirror().addBox(-0.075F, -4.0833F, -0.809F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -4.521F, -1.539F, 0.097F, -0.1453F, 0.979F));

		PartDefinition head5_r2 = head1.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(28, 96).addBox(-2.925F, -4.0833F, -0.809F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.5F, -4.521F, -1.539F, 0.097F, 0.1453F, -0.979F));

		PartDefinition head2_r1 = head1.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(58, 54).addBox(-0.5F, -0.1F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F))
				.texOffs(57, 54).addBox(-1.5F, 0.9F, -4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -6.0954F, -2.2004F, 0.3665F, 0.0F, 0.0F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(0, 67).addBox(-1.5F, -1.9F, -2.4F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(26, 68).addBox(-1.5F, 0.1F, -8.4F, 3.0F, 5.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4954F, -5.2004F, 0.182F, 0.0F, 0.0F));

		PartDefinition head5_r3 = head2.addOrReplaceChild("head5_r3", CubeListBuilder.create().texOffs(50, 81).mirror().addBox(0.0F, -0.1F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-4.4618F, 3.9F, -0.613F, -0.3533F, -0.1952F, -0.1176F));

		PartDefinition head5_r4 = head2.addOrReplaceChild("head5_r4", CubeListBuilder.create().texOffs(50, 74).mirror().addBox(-0.7808F, 0.2353F, 5.0738F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 1.7F, -3.6F, 0.6303F, -0.1243F, 0.0768F));

		PartDefinition head4_r1 = head2.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(78, 29).mirror().addBox(0.0252F, -0.4415F, -1.7589F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 1.7F, -3.6F, 0.5085F, -0.2504F, -0.0186F));

		PartDefinition head4_r2 = head2.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(50, 74).addBox(-5.2192F, 0.2353F, 5.0738F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 1.7F, -3.6F, 0.6303F, 0.1243F, -0.0768F));

		PartDefinition head3_r2 = head2.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(78, 29).addBox(-1.0252F, -0.4415F, -1.7589F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 1.7F, -3.6F, 0.5085F, 0.2504F, 0.0186F));

		PartDefinition head4_r3 = head2.addOrReplaceChild("head4_r3", CubeListBuilder.create().texOffs(50, 81).addBox(-1.0F, -0.1F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(4.4618F, 3.9F, -0.613F, -0.3533F, 0.1952F, 0.1176F));

		PartDefinition head7_r1 = head2.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(68, 17).mirror().addBox(1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 17).addBox(5.12F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.56F, 3.0618F, -10.9546F, 0.5672F, 0.0F, 0.0F));

		PartDefinition head4_r4 = head2.addOrReplaceChild("head4_r4", CubeListBuilder.create().texOffs(20, 41).mirror().addBox(-4.02F, 1.1F, 1.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 67).mirror().addBox(-4.04F, 1.6F, 2.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 0).mirror().addBox(-4.06F, 2.1F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 0).addBox(3.06F, 2.1F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 67).addBox(3.04F, 1.6F, 2.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 41).addBox(3.02F, 1.1F, 1.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(50, 44).addBox(-4.0F, 0.0F, -0.2F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -8.7F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.1F, 1.4F, 0.5463F, 0.0F, 0.0F));

		PartDefinition head4_r5 = head3.addOrReplaceChild("head4_r5", CubeListBuilder.create().texOffs(53, 30).addBox(-4.0F, 1.4F, -2.8F, 8.0F, 4.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.8F, -7.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head8_r1 = head3.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(74, 19).addBox(-0.0007F, 0.1448F, -3.3761F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-1.1F, -0.3F, -4.5F, -0.1131F, 1.0444F, -0.0979F));

		PartDefinition head7_r2 = head3.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(74, 19).mirror().addBox(-1.9993F, 0.1448F, -3.3761F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.3F, -4.5F, -0.1131F, -1.0444F, 0.0979F));

		PartDefinition head6_r2 = head3.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(74, 18).mirror().addBox(-1.0F, 0.0484F, -0.3525F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.4F, -0.3F, -6.2F, -0.0576F, -0.1742F, 0.01F));

		PartDefinition head5_r5 = head3.addOrReplaceChild("head5_r5", CubeListBuilder.create().texOffs(74, 18).addBox(0.0F, 0.0484F, -0.3525F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.4F, -0.3F, -6.2F, -0.0576F, 0.1742F, -0.01F));

		PartDefinition head4_r6 = head3.addOrReplaceChild("head4_r6", CubeListBuilder.create().texOffs(74, 18).addBox(-0.5F, 0.0314F, -0.053F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(73, 18).addBox(-1.5F, 0.9814F, -0.053F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -0.3F, -6.5F, -0.0567F, 0.0F, 0.0F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8F, -7.4F, 0.182F, 0.0F, 0.0F));

		PartDefinition head6_r3 = head4.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(71, 39).mirror().addBox(-0.1F, -0.1791F, -4.9713F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9F, -1.0222F, -1.1918F, 0.3904F, -0.328F, -0.0295F));

		PartDefinition head5_r6 = head4.addOrReplaceChild("head5_r6", CubeListBuilder.create().texOffs(71, 39).addBox(-4.9F, -0.1791F, -4.9713F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, -1.0222F, -1.1918F, 0.3904F, 0.328F, 0.0295F));

		PartDefinition head4_r7 = head4.addOrReplaceChild("head4_r7", CubeListBuilder.create().texOffs(71, 39).addBox(-2.5F, 0.0924F, 0.0193F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6778F, -5.8918F, 0.4014F, 0.0F, 0.0F));

		PartDefinition beak1 = head4.addOrReplaceChild("beak1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -4.4F, -0.4554F, 0.0F, 0.0F));

		PartDefinition beak3_r1 = beak1.addOrReplaceChild("beak3_r1", CubeListBuilder.create().texOffs(107, 104).mirror().addBox(0.2F, -4.1727F, -1.3126F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 4.0769F, -0.1645F, -1.7737F, -0.5319F, 0.104F));

		PartDefinition beak2_r1 = beak1.addOrReplaceChild("beak2_r1", CubeListBuilder.create().texOffs(107, 104).addBox(-1.2F, -4.1727F, -1.3126F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 4.0769F, -0.1645F, -1.7737F, 0.5319F, -0.104F));

		PartDefinition beak3_r2 = beak1.addOrReplaceChild("beak3_r2", CubeListBuilder.create().texOffs(77, 103).mirror().addBox(0.0F, -0.0841F, 0.0273F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.9098F, -0.6984F, -0.0822F, -0.1356F, -0.3567F));

		PartDefinition beak2_r2 = beak1.addOrReplaceChild("beak2_r2", CubeListBuilder.create().texOffs(77, 103).addBox(-1.0F, -0.0841F, 0.0273F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.9098F, -0.6984F, -0.0822F, 0.1356F, 0.3567F));

		PartDefinition beak1_r1 = beak1.addOrReplaceChild("beak1_r1", CubeListBuilder.create().texOffs(75, 103).addBox(-1.5F, -4.0627F, -0.0262F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8778F, -0.9918F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tusk1 = head4.addOrReplaceChild("tusk1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, 1.5F, -4.6F, -0.2443F, 0.0524F, -0.4538F));

		PartDefinition tusk2_r1 = tusk1.addOrReplaceChild("tusk2_r1", CubeListBuilder.create().texOffs(98, 86).addBox(-0.7F, -4.6F, -3.2F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.0F, 2.5F, -0.8608F, 0.1666F, 0.1415F));

		PartDefinition tusk2_r2 = tusk1.addOrReplaceChild("tusk2_r2", CubeListBuilder.create().texOffs(100, 106).addBox(-0.9858F, -5.4419F, -0.5022F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5034F, 5.4521F, 2.8142F, 0.5529F, 0.1666F, 0.1415F));

		PartDefinition tusk1_r1 = tusk1.addOrReplaceChild("tusk1_r1", CubeListBuilder.create().texOffs(110, 19).addBox(-0.5F, -2.3F, 2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6736F, 1.9902F, 1.8366F, -0.5118F, 0.1666F, 0.1415F));

		PartDefinition tusk2 = head4.addOrReplaceChild("tusk2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, 1.5F, -4.6F, -0.2443F, -0.0524F, 0.4538F));

		PartDefinition tusk3_r1 = tusk2.addOrReplaceChild("tusk3_r1", CubeListBuilder.create().texOffs(98, 86).mirror().addBox(-0.3F, -4.6F, -3.2F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.0F, 2.5F, -0.8608F, -0.1666F, -0.1415F));

		PartDefinition tusk3_r2 = tusk2.addOrReplaceChild("tusk3_r2", CubeListBuilder.create().texOffs(100, 106).mirror().addBox(-0.0142F, -5.4419F, -0.5022F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5034F, 5.4521F, 2.8142F, 0.5529F, -0.1666F, -0.1415F));

		PartDefinition tusk2_r3 = tusk2.addOrReplaceChild("tusk2_r3", CubeListBuilder.create().texOffs(110, 19).mirror().addBox(-0.5F, -2.3F, 2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6736F, 1.9902F, 1.8366F, -0.5118F, -0.1666F, -0.1415F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.7046F, 0.1996F, -0.2314F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw1.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -3.7F, 0.9372F, 0.0F, 0.0F));

		PartDefinition jaw6_r1 = jaw2.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(15, 6).mirror().addBox(-1.0F, 1.3917F, -9.1893F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.4826F, 0.1045F, -0.0175F, -0.0873F, 0.0F));

		PartDefinition jaw5_r1 = jaw2.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(67, 74).mirror().addBox(-1.0F, -1.0126F, -5.7162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.4826F, 0.1045F, 0.4189F, -0.0873F, 0.0F));

		PartDefinition jaw5_r2 = jaw2.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(107, 43).mirror().addBox(-1.0F, 0.5F, -3.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(86, 64).mirror().addBox(-1.0F, -1.5F, -9.4F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.4826F, 0.1045F, 0.0F, -0.0873F, 0.0F));

		PartDefinition jaw3_r1 = jaw2.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(101, 48).mirror().addBox(-1.0F, -0.5118F, -3.9489F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.4826F, 0.1045F, -0.2618F, -0.0873F, 0.0F));

		PartDefinition jaw4_r1 = jaw2.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(107, 43).addBox(0.0F, 0.5F, -3.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(86, 64).addBox(0.0F, -1.5F, -9.4F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0F, 0.4826F, 0.1045F, 0.0F, 0.0873F, 0.0F));

		PartDefinition jaw5_r3 = jaw2.addOrReplaceChild("jaw5_r3", CubeListBuilder.create().texOffs(15, 6).addBox(0.0F, 1.3917F, -9.1893F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.0F, 0.4826F, 0.1045F, -0.0175F, 0.0873F, 0.0F));

		PartDefinition jaw4_r2 = jaw2.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(67, 74).addBox(0.0F, -1.0126F, -5.7162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.4826F, 0.1045F, 0.4189F, 0.0873F, 0.0F));

		PartDefinition jaw2_r1 = jaw2.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(101, 48).addBox(0.0F, -0.5118F, -3.9489F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.4826F, 0.1045F, -0.2618F, 0.0873F, 0.0F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0174F, -8.8955F, 0.1367F, 0.0F, 0.0F));

		PartDefinition jaw5_r4 = jaw3.addOrReplaceChild("jaw5_r4", CubeListBuilder.create().texOffs(35, 44).mirror().addBox(-0.5F, -1.3314F, -1.2803F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.7197F, -1.3314F, -0.2618F, -0.1745F, 0.0F));

		PartDefinition jaw4_r3 = jaw3.addOrReplaceChild("jaw4_r3", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.5F, -1.7197F, -1.6686F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.7197F, -1.3314F, 0.0F, -0.1745F, 0.0F));

		PartDefinition jaw4_r4 = jaw3.addOrReplaceChild("jaw4_r4", CubeListBuilder.create().texOffs(35, 44).addBox(-0.5F, -1.3314F, -1.2803F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5F, 2.7197F, -1.3314F, -0.2618F, 0.1745F, 0.0F));

		PartDefinition jaw3_r2 = jaw3.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -1.7197F, -1.6686F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.7197F, -1.3314F, 0.0F, 0.1745F, 0.0F));

		PartDefinition beak2 = jaw3.addOrReplaceChild("beak2", CubeListBuilder.create().texOffs(58, 23).addBox(-1.5F, 1.0F, -4.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -0.4F, -0.6829F, 0.0F, 0.0F));

		PartDefinition beak5_r1 = beak2.addOrReplaceChild("beak5_r1", CubeListBuilder.create().texOffs(43, 84).mirror().addBox(-0.5086F, -0.5257F, -0.9086F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8206F, 1.9743F, -1.5994F, 0.0F, -0.4887F, 0.0F));

		PartDefinition beak3_r3 = beak2.addOrReplaceChild("beak3_r3", CubeListBuilder.create().texOffs(29, 80).mirror().addBox(-0.4874F, -0.9743F, -2.091F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8206F, 1.9743F, -1.5994F, 0.0F, -0.4451F, 0.0F));

		PartDefinition beak4_r1 = beak2.addOrReplaceChild("beak4_r1", CubeListBuilder.create().texOffs(43, 84).addBox(-0.4914F, -0.5257F, -0.9086F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8206F, 1.9743F, -1.5994F, 0.0F, 0.4887F, 0.0F));

		PartDefinition beak3_r4 = beak2.addOrReplaceChild("beak3_r4", CubeListBuilder.create().texOffs(10, 80).addBox(-2.0F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 2.0F, -4.3F, -0.5061F, 0.0F, 0.0F));

		PartDefinition beak2_r3 = beak2.addOrReplaceChild("beak2_r3", CubeListBuilder.create().texOffs(29, 80).addBox(-0.5126F, -0.9743F, -2.091F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8206F, 1.9743F, -1.5994F, 0.0F, 0.4451F, 0.0F));

		PartDefinition upperarm1 = chest.addOrReplaceChild("upperarm1", CubeListBuilder.create().texOffs(0, 80).addBox(-1.1273F, -1.2917F, -2.5056F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(49, 103).addBox(-1.1273F, 4.7083F, -1.5056F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(39, 99).addBox(-1.1273F, 8.7083F, -2.0056F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2F, 14.8644F, -10.9444F, 0.6724F, 0.0628F, -0.4283F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5113F, 11.5228F, 1.0997F, -1.2386F, -0.0583F, 1.2817F));

		PartDefinition lowerarm4_r1 = lowerarm1.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(107, 94).addBox(-1.0262F, -6.1725F, 0.2844F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0013F, 2.4565F, -0.9142F, -0.1303F, 1.2533F, -0.2936F));

		PartDefinition lowerarm3_r1 = lowerarm1.addOrReplaceChild("lowerarm3_r1", CubeListBuilder.create().texOffs(96, 5).addBox(-1.5102F, -3.5789F, -1.3657F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(106, 55).addBox(-1.0102F, 1.4211F, -0.8657F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0013F, 2.4565F, -0.9142F, -0.3572F, 1.2533F, -0.2936F));

		PartDefinition lowerarm1_r1 = lowerarm1.addOrReplaceChild("lowerarm1_r1", CubeListBuilder.create().texOffs(46, 8).addBox(-0.5641F, -0.201F, -0.4021F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7298F, 2.8032F, -2.0627F, -0.0782F, 1.2604F, -0.1192F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2371F, 8.7727F, -2.9228F, 1.1369F, 1.0156F, 0.033F));

		PartDefinition hand2_r1 = hand1.addOrReplaceChild("hand2_r1", CubeListBuilder.create().texOffs(58, 8).addBox(-1.5286F, 0.577F, -4.6082F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.4628F, 1.5955F, -2.1398F, -0.5059F, -0.004F, -0.0043F));

		PartDefinition hand2_r2 = hand1.addOrReplaceChild("hand2_r2", CubeListBuilder.create().texOffs(87, 55).addBox(-3.0414F, -1.5874F, -1.7207F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0784F, 2.4167F, -1.4544F, 0.4528F, 0.0141F, 0.0229F));

		PartDefinition hand2_r3 = hand1.addOrReplaceChild("hand2_r3", CubeListBuilder.create().texOffs(36, 106).addBox(3.4287F, -2.8631F, -4.56F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9945F, 3.3725F, 6.0462F, 0.481F, 0.3133F, -0.5334F));

		PartDefinition hand2_r4 = hand1.addOrReplaceChild("hand2_r4", CubeListBuilder.create().texOffs(103, 80).addBox(-1.2038F, -5.4809F, -4.56F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7945F, 3.3725F, 6.0462F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition hand1_r1 = hand1.addOrReplaceChild("hand1_r1", CubeListBuilder.create().texOffs(11, 106).addBox(3.0741F, -6.7475F, -4.8493F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.9945F, 3.3725F, 6.0462F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(77, 58).addBox(-0.8727F, -1.2917F, -2.5056F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(37, 30).addBox(-0.8727F, 4.7083F, -1.5056F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 99).addBox(-0.8727F, 8.7083F, -2.0056F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.2F, 14.8644F, -10.9444F, -0.2439F, -0.0628F, 0.4283F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5113F, 11.5228F, 1.0997F, -1.5265F, 0.5719F, -1.4736F));

		PartDefinition lowerarm5_r1 = lowerarm2.addOrReplaceChild("lowerarm5_r1", CubeListBuilder.create().texOffs(45, 57).addBox(-0.9738F, -6.1725F, 0.2844F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0013F, 2.4565F, -0.9142F, -0.1303F, -1.2533F, 0.2936F));

		PartDefinition lowerarm4_r2 = lowerarm2.addOrReplaceChild("lowerarm4_r2", CubeListBuilder.create().texOffs(93, 74).addBox(-1.4898F, -3.5789F, -1.3657F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(91, 104).addBox(-0.9898F, 1.4211F, -0.8657F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0013F, 2.4565F, -0.9142F, -0.3572F, -1.2533F, 0.2936F));

		PartDefinition lowerarm2_r1 = lowerarm2.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(32, 8).addBox(-0.4359F, -0.201F, -0.4021F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7298F, 2.8032F, -2.0627F, -0.0782F, -1.2604F, 0.1192F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2371F, 8.7727F, -2.9228F, 1.7478F, -1.0156F, -0.033F));

		PartDefinition hand3_r1 = hand2.addOrReplaceChild("hand3_r1", CubeListBuilder.create().texOffs(26, 57).addBox(-4.4714F, 0.577F, -4.6082F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.4628F, 1.5955F, -2.1398F, -0.5059F, 0.004F, 0.0043F));

		PartDefinition hand3_r2 = hand2.addOrReplaceChild("hand3_r2", CubeListBuilder.create().texOffs(77, 7).addBox(-2.9586F, -1.5874F, -1.7207F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0784F, 2.4167F, -1.4544F, 0.4528F, -0.0141F, -0.0229F));

		PartDefinition hand3_r3 = hand2.addOrReplaceChild("hand3_r3", CubeListBuilder.create().texOffs(25, 106).addBox(-5.4287F, -2.8631F, -4.56F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9945F, 3.3725F, 6.0462F, 0.481F, -0.3133F, 0.5334F));

		PartDefinition hand3_r4 = hand2.addOrReplaceChild("hand3_r4", CubeListBuilder.create().texOffs(103, 26).addBox(-0.7962F, -5.4809F, -4.56F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7945F, 3.3725F, 6.0462F, 0.532F, 0.2071F, -0.3361F));

		PartDefinition hand2_r5 = hand2.addOrReplaceChild("hand2_r5", CubeListBuilder.create().texOffs(105, 85).addBox(-5.0741F, -6.7475F, -4.8493F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.9945F, 3.3725F, 6.0462F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6206F, 20.0275F, 0.8458F, 0.137F, -0.2238F));

		PartDefinition tail4_r1 = tail1.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(21, 26).addBox(0.0F, 5.0F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 26).addBox(0.0F, 3.0F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 30).addBox(0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1122F, 1.0008F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail1_r1 = tail1.addOrReplaceChild("tail1_r1", CubeListBuilder.create().texOffs(103, 68).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1122F, 1.0008F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.0878F, 0.9508F, -0.4587F, -0.0978F, -0.1953F));

		PartDefinition tail5_r1 = tail2.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 4.5F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 6).addBox(0.0F, 2.5F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 6).addBox(0.0F, 0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1724F, 0.889F, 0.3316F, 0.0F, 0.0F));

		PartDefinition tail2_r1 = tail2.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(110, 62).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5222F, 0.6951F, 0.5061F, 0.0F, 0.0F));

		PartDefinition upperleg1 = basin.addOrReplaceChild("upperleg1", CubeListBuilder.create().texOffs(59, 90).addBox(-0.768F, 2.9729F, -1.9402F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(92, 44).addBox(-1.268F, -1.0271F, -1.9402F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 8.6665F, 20.1382F, 0.0518F, -0.1554F, -0.2256F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4801F, 13.0428F, 0.3058F, 0.6694F, -0.0905F, 0.2839F));

		PartDefinition leg2_r1 = leg1.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(103, 34).addBox(-0.9121F, -9.9292F, 0.6079F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 92).addBox(-0.994F, -10.9425F, -1.7902F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7136F, 8.7906F, 0.8713F, 1.8627F, 1.5246F, 1.7815F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9206F, 8.511F, 0.2324F, -0.3334F, -0.0204F, -0.0277F));

		PartDefinition feet4_r1 = feet1.addOrReplaceChild("feet4_r1", CubeListBuilder.create().texOffs(101, 0).addBox(-0.0064F, -0.3997F, -1.5527F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.015F, 1.2237F, -0.5402F, 1.3439F, -0.4346F, -0.0169F));

		PartDefinition feet4_r2 = feet1.addOrReplaceChild("feet4_r2", CubeListBuilder.create().texOffs(0, 106).addBox(-1.4629F, -0.3661F, 1.3298F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6235F, 4.0573F, -1.1905F, 1.3374F, 0.0857F, -0.0745F));

		PartDefinition feet3_r1 = feet1.addOrReplaceChild("feet3_r1", CubeListBuilder.create().texOffs(60, 81).addBox(-1.9936F, -0.6003F, -1.4473F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9592F, 1.5205F, -0.1977F, 1.2948F, 0.6046F, -0.1482F));

		PartDefinition feet2_r1 = feet1.addOrReplaceChild("feet2_r1", CubeListBuilder.create().texOffs(88, 29).addBox(-3.548F, -1.2994F, -1.2824F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6235F, 4.0573F, -1.1905F, 0.6295F, 0.0198F, -0.021F));

		PartDefinition feet1_r1 = feet1.addOrReplaceChild("feet1_r1", CubeListBuilder.create().texOffs(75, 48).addBox(-3.2704F, -5.1137F, -2.173F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5235F, 8.7573F, -4.2905F, -0.0041F, -0.0059F, -0.0341F));

		PartDefinition upperleg2 = basin.addOrReplaceChild("upperleg2", CubeListBuilder.create().texOffs(48, 90).addBox(-1.232F, 2.9729F, -1.9402F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(56, 63).addBox(-1.732F, -1.0271F, -1.9402F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 8.6665F, 20.1382F, -0.4718F, 0.1554F, 0.2256F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4801F, 13.0428F, 0.3058F, 0.6694F, 0.0905F, -0.2839F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(70, 92).addBox(-1.0879F, -9.9292F, 0.6079F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 90).addBox(-1.006F, -10.9425F, -1.7902F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7136F, 8.7906F, 0.8713F, 1.8627F, -1.5246F, -1.7815F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9206F, 8.511F, 0.2324F, -0.1153F, 0.0204F, 0.0277F));

		PartDefinition feet5_r1 = feet2.addOrReplaceChild("feet5_r1", CubeListBuilder.create().texOffs(76, 81).addBox(-1.9936F, -0.3997F, -1.5527F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.015F, 1.2237F, -0.5402F, 1.3439F, 0.4346F, 0.0169F));

		PartDefinition feet5_r2 = feet2.addOrReplaceChild("feet5_r2", CubeListBuilder.create().texOffs(105, 14).addBox(-0.5371F, -0.3661F, 1.3298F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6235F, 4.0573F, -1.1905F, 1.3374F, -0.0857F, 0.0745F));

		PartDefinition feet4_r3 = feet2.addOrReplaceChild("feet4_r3", CubeListBuilder.create().texOffs(74, 29).addBox(-0.0064F, -0.6003F, -1.4473F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9592F, 1.5205F, -0.1977F, 1.2948F, -0.6046F, 0.1482F));

		PartDefinition feet3_r2 = feet2.addOrReplaceChild("feet3_r2", CubeListBuilder.create().texOffs(84, 0).addBox(-2.452F, -1.2994F, -1.2824F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6235F, 4.0573F, -1.1905F, 0.6295F, -0.0198F, 0.021F));

		PartDefinition feet2_r2 = feet2.addOrReplaceChild("feet2_r2", CubeListBuilder.create().texOffs(71, 74).addBox(-2.7296F, -5.1137F, -2.173F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5235F, 8.7573F, -4.2905F, -0.0041F, 0.0059F, 0.0341F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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