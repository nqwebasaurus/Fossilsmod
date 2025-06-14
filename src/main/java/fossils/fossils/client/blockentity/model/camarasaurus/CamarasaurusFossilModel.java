package fossils.fossils.client.blockentity.model.camarasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CamarasaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart base;
	private final ModelPart hip;
	private final ModelPart upperlegleft;
	private final ModelPart lowerlegleft;
	private final ModelPart footleft;
	private final ModelPart upperlegright;
	private final ModelPart lowerlegright;
	private final ModelPart footright;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart jaw2;
	private final ModelPart lowerteeth1;
	private final ModelPart lowerteeth2;
	private final ModelPart nose1;
	private final ModelPart head2;
	private final ModelPart nose2;
	private final ModelPart nose3;
	private final ModelPart teeth1;
	private final ModelPart upperarmleft;
	private final ModelPart lowerarmleft;
	private final ModelPart handleft;
	private final ModelPart clawleft;
	private final ModelPart upperarmright;
	private final ModelPart lowerarmright;
	private final ModelPart handright;
	private final ModelPart clawright;

	public CamarasaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.base = this.fossil.getChild("base");
		this.hip = this.base.getChild("hip");
		this.upperlegleft = this.hip.getChild("upperlegleft");
		this.lowerlegleft = this.upperlegleft.getChild("lowerlegleft");
		this.footleft = this.lowerlegleft.getChild("footleft");
		this.upperlegright = this.hip.getChild("upperlegright");
		this.lowerlegright = this.upperlegright.getChild("lowerlegright");
		this.footright = this.lowerlegright.getChild("footright");
		this.tail1 = this.hip.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.body = this.hip.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck = this.neck1.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.jaw2 = this.jaw.getChild("jaw2");
		this.lowerteeth1 = this.jaw2.getChild("lowerteeth1");
		this.lowerteeth2 = this.jaw2.getChild("lowerteeth2");
		this.nose1 = this.head.getChild("nose1");
		this.head2 = this.head.getChild("head2");
		this.nose2 = this.head2.getChild("nose2");
		this.nose3 = this.head2.getChild("nose3");
		this.teeth1 = this.head2.getChild("teeth1");
		this.upperarmleft = this.chest.getChild("upperarmleft");
		this.lowerarmleft = this.upperarmleft.getChild("lowerarmleft");
		this.handleft = this.lowerarmleft.getChild("handleft");
		this.clawleft = this.handleft.getChild("clawleft");
		this.upperarmright = this.chest.getChild("upperarmright");
		this.lowerarmright = this.upperarmright.getChild("lowerarmright");
		this.handright = this.lowerarmright.getChild("handright");
		this.clawright = this.handright.getChild("clawright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition base = fossil.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hip = base.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -49.1F, 24.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition chest19_r1 = hip.addOrReplaceChild("chest19_r1", CubeListBuilder.create().texOffs(158, 163).addBox(-0.5F, -3.7F, 15.3F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 164).addBox(-0.5F, -4.1F, 12.3F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(79, 73).addBox(-1.0F, -4.3F, 9.3F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, -3.3F, 2.3F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(108, 159).addBox(-1.0F, -3.3F, -0.7F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4269F, -8.2508F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hip.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(50, 6).mirror().addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-2.0173F, 18.9617F, -2.3442F, 0.6541F, 0.2799F, -0.3144F));

		PartDefinition cube_r2 = hip.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(152, 56).mirror().addBox(-1.0F, -0.2945F, -2.8354F, 3.0F, 10.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-8.0F, 10.5745F, -2.6598F, 0.253F, 0.0832F, -0.5683F));

		PartDefinition cube_r3 = hip.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(66, 121).mirror().addBox(-1.0F, -0.5017F, -0.8691F, 3.0F, 11.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-8.0F, 7.5596F, 2.7794F, 1.7669F, 0.3434F, 0.5961F));

		PartDefinition cube_r4 = hip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(71, 48).mirror().addBox(-1.6948F, -8.4988F, -6.4963F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(169, 112).mirror().addBox(-1.6948F, -8.4988F, -2.4963F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.3574F, 5.8313F, -0.0017F, -0.7885F, -0.0939F, 0.1173F));

		PartDefinition cube_r5 = hip.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(78, 105).mirror().addBox(-0.6426F, -6.0367F, -7.3689F, 2.0F, 10.0F, 10.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(78, 105).addBox(15.3574F, -6.0367F, -7.3689F, 2.0F, 10.0F, 10.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-8.3574F, 5.8313F, -0.0017F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hip.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(45, 51).mirror().addBox(-1.0F, -1.3874F, -2.6009F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-8.9287F, -2.8354F, -8.6578F, -0.2459F, 0.4537F, -0.0916F));

		PartDefinition cube_r7 = hip.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(19, 114).mirror().addBox(-1.0F, -2.6257F, -1.1393F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.9287F, -2.8354F, -8.6578F, 0.4086F, 0.4537F, -0.0916F));

		PartDefinition cube_r8 = hip.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(0.0442F, -12.9154F, -6.0629F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.3574F, 5.8313F, -0.0017F, 0.1481F, 0.1483F, -0.0039F));

		PartDefinition cube_r9 = hip.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.6426F, -10.4621F, -8.2025F, 2.0F, 13.0F, 6.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(0, 49).addBox(15.3574F, -10.4621F, -8.2025F, 2.0F, 13.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-8.3574F, 5.8313F, -0.0017F, -0.3316F, 0.0F, 0.0F));

		PartDefinition basin4_r1 = hip.addOrReplaceChild("basin4_r1", CubeListBuilder.create().texOffs(127, 40).mirror().addBox(-6.8546F, -1.0F, -1.009F, 6.0F, 2.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.9542F, 0.6244F, -1.8786F, 0.0928F, 0.3477F, 0.2062F));

		PartDefinition basin3_r1 = hip.addOrReplaceChild("basin3_r1", CubeListBuilder.create().texOffs(126, 15).mirror().addBox(-5.0458F, -1.0F, -5.7797F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9542F, 0.6244F, -1.8786F, 0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r10 = hip.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 97).addBox(-2.0442F, -12.9154F, -6.0629F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.3574F, 5.8313F, -0.0017F, 0.1481F, -0.1483F, 0.0039F));

		PartDefinition cube_r11 = hip.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(45, 51).addBox(-1.0F, -1.3874F, -2.6009F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(8.9287F, -2.8354F, -8.6578F, -0.2459F, -0.4537F, 0.0916F));

		PartDefinition cube_r12 = hip.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(19, 114).addBox(-1.0F, -2.6257F, -1.1393F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.9287F, -2.8354F, -8.6578F, 0.4086F, -0.4537F, 0.0916F));

		PartDefinition cube_r13 = hip.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(169, 112).addBox(-0.3052F, -8.4988F, -2.4963F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(71, 48).addBox(-0.3052F, -8.4988F, -6.4963F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.3574F, 5.8313F, -0.0017F, -0.7885F, 0.0939F, -0.1173F));

		PartDefinition cube_r14 = hip.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(50, 6).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.0173F, 18.9617F, -2.3442F, 0.6541F, -0.2799F, 0.3144F));

		PartDefinition cube_r15 = hip.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(152, 56).addBox(-2.0F, -0.2945F, -2.8354F, 3.0F, 10.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(8.0F, 10.5745F, -2.6598F, 0.253F, -0.0832F, 0.5683F));

		PartDefinition cube_r16 = hip.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(66, 121).addBox(-2.0F, -0.5017F, -0.8691F, 3.0F, 11.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(8.0F, 7.5596F, 2.7794F, 1.7669F, -0.3434F, -0.5961F));

		PartDefinition basin3_r2 = hip.addOrReplaceChild("basin3_r2", CubeListBuilder.create().texOffs(127, 40).addBox(0.8546F, -1.0F, -1.009F, 6.0F, 2.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.9542F, 0.6244F, -1.8786F, 0.0928F, -0.3477F, -0.2062F));

		PartDefinition basin2_r1 = hip.addOrReplaceChild("basin2_r1", CubeListBuilder.create().texOffs(126, 15).addBox(0.0458F, -1.0F, -5.7797F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9542F, 0.6244F, -1.8786F, 0.0873F, 0.0F, -0.1745F));

		PartDefinition basin3_r3 = hip.addOrReplaceChild("basin3_r3", CubeListBuilder.create().texOffs(46, 111).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2628F, 8.8499F, -0.5672F, 0.0F, 0.0F));

		PartDefinition basin2_r2 = hip.addOrReplaceChild("basin2_r2", CubeListBuilder.create().texOffs(30, 97).addBox(0.0F, -0.2F, -2.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7472F, 7.2007F, -0.3491F, 0.0F, 0.0F));

		PartDefinition basin1_r1 = hip.addOrReplaceChild("basin1_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 18.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.6115F, -8.5454F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upperlegleft = hip.addOrReplaceChild("upperlegleft", CubeListBuilder.create(), PartPose.offsetAndRotation(11.5F, 3.5408F, -4.0387F, 0.2182F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperlegleft.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(50, 150).addBox(-4.0F, -2.8137F, -2.5123F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 22.0142F, 4.1542F, 0.3054F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperlegleft.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(124, 121).addBox(-4.0F, -12.5F, -2.0F, 4.0F, 21.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 11.7156F, 1.9657F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lowerlegleft = upperlegleft.addOrReplaceChild("lowerlegleft", CubeListBuilder.create().texOffs(141, 26).addBox(-3.8F, 0.0F, -2.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 77).addBox(-3.4F, 6.0F, -1.0F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 142).addBox(0.7F, 1.0F, -1.0F, 2.0F, 18.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(150, 140).addBox(-3.8F, 15.0F, -1.8F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 23.3156F, 4.0657F, 0.3491F, 0.0F, 0.0F));

		PartDefinition footleft = lowerlegleft.addOrReplaceChild("footleft", CubeListBuilder.create().texOffs(96, 39).addBox(-5.5F, 0.0F, -6.0F, 11.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(121, 101).addBox(-5.5F, 0.0F, -10.0F, 11.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 18.8972F, -0.3149F, -0.3054F, 0.0F, 0.0F));

		PartDefinition upperlegright = hip.addOrReplaceChild("upperlegright", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.5F, 3.5408F, -4.0387F, -0.0436F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperlegright.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(135, 146).addBox(0.0F, -2.8137F, -2.5123F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 22.0142F, 4.1542F, 0.3054F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperlegright.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(49, 121).addBox(0.0F, -12.5F, -2.0F, 4.0F, 21.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 11.7156F, 1.9657F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lowerlegright = upperlegright.addOrReplaceChild("lowerlegright", CubeListBuilder.create().texOffs(140, 0).addBox(-0.2F, 0.0F, -2.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(27, 51).addBox(0.4F, 6.0F, -1.0F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(141, 124).addBox(-2.7F, 1.0F, -1.0F, 2.0F, 18.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(104, 148).addBox(-0.2F, 15.0F, -1.8F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 23.3156F, 4.0657F, 0.3927F, 0.0F, 0.0F));

		PartDefinition footright = lowerlegright.addOrReplaceChild("footright", CubeListBuilder.create().texOffs(91, 66).addBox(-5.5F, 0.0F, -6.0F, 11.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(48, 73).addBox(-5.5F, 0.0F, -10.0F, 11.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 18.8972F, -0.3149F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail1 = hip.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4092F, 8.9754F, -0.1541F, -0.3334F, 0.1376F));

		PartDefinition basin11_r1 = tail1.addOrReplaceChild("basin11_r1", CubeListBuilder.create().texOffs(42, 101).addBox(0.0F, -8.3737F, -0.7069F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(156, 87).addBox(0.0F, -6.4162F, -1.2797F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(95, 157).addBox(0.0F, -4.4325F, -1.5537F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(136, 157).addBox(0.0F, -2.4663F, -2.0268F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(158, 45).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2711F, 10.7925F, -1.0908F, 0.0F, 0.0F));

		PartDefinition basin6_r1 = tail1.addOrReplaceChild("basin6_r1", CubeListBuilder.create().texOffs(76, 6).addBox(0.0F, -0.5F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0365F, 8.9447F, -0.9163F, 0.0F, 0.0F));

		PartDefinition basin5_r1 = tail1.addOrReplaceChild("basin5_r1", CubeListBuilder.create().texOffs(89, 23).addBox(0.0F, -0.5F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.878F, 6.7143F, -0.7854F, 0.0F, 0.0F));

		PartDefinition basin4_r2 = tail1.addOrReplaceChild("basin4_r2", CubeListBuilder.create().texOffs(122, 0).addBox(0.0F, -2.1038F, 0.6903F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2126F, -0.0743F, -0.5672F, 0.0F, 0.0F));

		PartDefinition chest25_r1 = tail1.addOrReplaceChild("chest25_r1", CubeListBuilder.create().texOffs(126, 15).addBox(0.0F, -1.0F, 33.3F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 130).addBox(0.0F, -1.4F, 30.3F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(87, 4).addBox(0.0F, -2.3F, 27.3F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(45, 171).addBox(0.0F, -2.6F, 24.3F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 171).addBox(-0.5F, -2.6F, 21.3F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(38, 169).addBox(-0.5F, -2.9F, 18.3F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4771F, -17.175F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail1_r1 = tail1.addOrReplaceChild("tail1_r1", CubeListBuilder.create().texOffs(0, 25).addBox(-2.0F, -2.0F, -14.0F, 4.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8388F, 13.5304F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4852F, 18.2256F, 0.204F, -0.2314F, 0.0395F));

		PartDefinition basin18_r1 = tail2.addOrReplaceChild("basin18_r1", CubeListBuilder.create().texOffs(32, 126).addBox(0.0F, -12.2276F, 2.8552F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(42, 126).addBox(0.0F, -10.2839F, 2.2967F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(112, 60).addBox(0.0F, -8.3141F, 0.9365F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(128, 115).addBox(0.0F, -6.3573F, 0.4772F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(17, 130).addBox(0.0F, -4.3875F, -0.883F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(164, 92).addBox(0.0F, -2.4307F, -1.3424F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(165, 75).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3656F, 2.1525F, -1.2654F, 0.0F, 0.0F));

		PartDefinition chest33_r1 = tail2.addOrReplaceChild("chest33_r1", CubeListBuilder.create().texOffs(84, 6).addBox(0.0F, -2.2F, 14.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 52).addBox(0.0F, -2.2F, 12.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 103).addBox(0.0F, -2.3F, 10.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 111).addBox(0.0F, -2.4F, 8.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 51).addBox(0.0F, -2.4F, 6.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 51).addBox(0.0F, -2.4F, 4.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 51).addBox(0.0F, -2.4F, 2.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 51).addBox(0.0F, -2.6F, 0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3288F, 1.5478F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail2_r1 = tail2.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(0, 77).addBox(-1.5F, -1.8F, -3.3F, 3.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.638F, 3.4233F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(49, 86).addBox(-1.0F, -0.5887F, -0.9689F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6178F, 16.369F, 0.0915F, 0.3042F, 0.0275F));

		PartDefinition basin26_r1 = tail3.addOrReplaceChild("basin26_r1", CubeListBuilder.create().texOffs(48, 73).addBox(0.0F, -27.8787F, 8.1464F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 6).addBox(0.0F, -25.9261F, 6.7135F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(11, 77).addBox(0.0F, -23.9735F, 6.2806F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(61, 84).addBox(0.0F, -22.0209F, 5.8478F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(90, 86).addBox(0.0F, -20.0683F, 5.4149F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(42, 93).addBox(0.0F, -18.1157F, 4.982F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(130, 0).addBox(0.0F, -16.1631F, 3.5491F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(66, 138).addBox(0.0F, -14.2105F, 3.1163F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8389F, -14.2397F, -1.2654F, 0.0F, 0.0F));

		PartDefinition chest41_r1 = tail3.addOrReplaceChild("chest41_r1", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, -3.2F, 30.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 25).addBox(0.0F, -3.0F, 28.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 51).addBox(0.0F, -2.9F, 26.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 51).addBox(0.0F, -2.7F, 24.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 48).addBox(0.0F, -2.5F, 22.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 111).addBox(0.0F, -2.4F, 20.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 16).addBox(0.0F, -2.3F, 18.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 118).addBox(0.0F, -2.2F, 16.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.8555F, -14.8444F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 97).addBox(-1.0F, -0.7F, 0.6F, 2.0F, 2.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2026F, 15.2315F, 0.0903F, 0.2608F, 0.0233F));

		PartDefinition chest44_r1 = tail4.addOrReplaceChild("chest44_r1", CubeListBuilder.create().texOffs(75, 73).addBox(0.0F, -3.3132F, 33.7076F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 77).addBox(0.0F, -3.7132F, 37.7076F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 84).addBox(0.0F, -3.5132F, 35.7076F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 57).addBox(0.0F, -3.1132F, 31.7076F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0668F, -29.8755F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(23, 93).addBox(-0.5F, -0.4943F, -0.1307F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 14.0F, -0.0983F, 0.478F, -0.0453F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0943F, 15.4693F, -0.257F, 0.5522F, -0.137F));

		PartDefinition tail6_r1 = tail6.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(25, 27).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 22.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0105F, 0.3081F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create().texOffs(29, 167).addBox(-1.0F, -8.2039F, -29.5329F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(45, 51).addBox(-2.0F, -2.6539F, -30.0329F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, 0.6154F, -8.7125F));

		PartDefinition body2_r1 = body.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(88, 86).addBox(-2.0F, -2.0F, -0.3F, 4.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6539F, -13.0329F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body3_r1 = body.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(84, 189).addBox(-10.0F, -5.0F, -10.2F, 20.0F, 5.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 27.8839F, -12.1262F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body2_r2 = body.addOrReplaceChild("body2_r2", CubeListBuilder.create().texOffs(0, 180).addBox(-12.0F, -5.0F, 2.5F, 24.0F, 7.0F, 17.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 26.6508F, -15.2519F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest14_r1 = body.addOrReplaceChild("chest14_r1", CubeListBuilder.create().texOffs(50, 29).addBox(-1.0F, -4.0F, 13.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(71, 86).addBox(-1.0F, -4.0F, 10.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(160, 112).addBox(-1.0F, -4.1F, 6.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 114).addBox(-1.0F, -4.6F, 2.5F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(40, 156).addBox(-1.0F, -4.6F, -1.2F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6039F, -17.0329F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest9_r1 = body.addOrReplaceChild("chest9_r1", CubeListBuilder.create().texOffs(149, 160).addBox(-1.0F, -3.9F, -0.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6039F, -21.0329F, -0.1309F, 0.0F, 0.0F));

		PartDefinition chest15_r1 = body.addOrReplaceChild("chest15_r1", CubeListBuilder.create().texOffs(151, 39).mirror().addBox(-13.4378F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.1961F, -3.6329F, -0.1327F, -0.1011F, -0.9387F));

		PartDefinition chest14_r2 = body.addOrReplaceChild("chest14_r2", CubeListBuilder.create().texOffs(155, 0).mirror().addBox(-6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.1961F, -3.6329F, -0.1628F, -0.0359F, -0.5061F));

		PartDefinition chest13_r1 = body.addOrReplaceChild("chest13_r1", CubeListBuilder.create().texOffs(155, 3).mirror().addBox(-6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.1039F, -6.6329F, -0.1211F, -0.0231F, -0.4201F));

		PartDefinition chest14_r3 = body.addOrReplaceChild("chest14_r3", CubeListBuilder.create().texOffs(151, 42).mirror().addBox(-13.4378F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.1039F, -6.6329F, -0.1001F, -0.072F, -0.8542F));

		PartDefinition chest15_r2 = body.addOrReplaceChild("chest15_r2", CubeListBuilder.create().texOffs(128, 147).mirror().addBox(-13.9709F, -9.3588F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.1039F, -6.6329F, -0.0457F, -0.1145F, -1.4224F));

		PartDefinition chest14_r4 = body.addOrReplaceChild("chest14_r4", CubeListBuilder.create().texOffs(99, 13).mirror().addBox(-18.9709F, -9.3588F, -1.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.8039F, -10.6329F, -0.0108F, 0.0117F, -1.337F));

		PartDefinition chest13_r2 = body.addOrReplaceChild("chest13_r2", CubeListBuilder.create().texOffs(152, 70).mirror().addBox(-13.4378F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.8039F, -10.6329F, -0.0029F, 0.0157F, -0.7697F));

		PartDefinition chest12_r1 = body.addOrReplaceChild("chest12_r1", CubeListBuilder.create().texOffs(155, 15).mirror().addBox(-6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.8039F, -10.6329F, 0.004F, 0.0154F, -0.3333F));

		PartDefinition chest11_r1 = body.addOrReplaceChild("chest11_r1", CubeListBuilder.create().texOffs(158, 53).mirror().addBox(-6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.8039F, -14.5329F, 0.0875F, 0.041F, -0.2437F));

		PartDefinition chest12_r2 = body.addOrReplaceChild("chest12_r2", CubeListBuilder.create().texOffs(152, 103).mirror().addBox(-13.4378F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.8039F, -14.5329F, 0.062F, 0.0741F, -0.6795F));

		PartDefinition chest13_r3 = body.addOrReplaceChild("chest13_r3", CubeListBuilder.create().texOffs(76, 20).mirror().addBox(-20.9709F, -9.3588F, -1.0F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.8039F, -14.5329F, 0.0124F, 0.0958F, -1.2484F));

		PartDefinition chest12_r3 = body.addOrReplaceChild("chest12_r3", CubeListBuilder.create().texOffs(50, 45).mirror().addBox(-24.9709F, -9.3588F, -1.0F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.8039F, -17.5329F, 0.0218F, 0.1294F, -1.2474F));

		PartDefinition chest11_r2 = body.addOrReplaceChild("chest11_r2", CubeListBuilder.create().texOffs(152, 106).mirror().addBox(-13.4378F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.8039F, -17.5329F, 0.0881F, 0.0974F, -0.6773F));

		PartDefinition chest10_r1 = body.addOrReplaceChild("chest10_r1", CubeListBuilder.create().texOffs(158, 160).mirror().addBox(-6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.8039F, -17.5329F, 0.1209F, 0.0511F, -0.2421F));

		PartDefinition chest11_r3 = body.addOrReplaceChild("chest11_r3", CubeListBuilder.create().texOffs(50, 3).mirror().addBox(-26.9709F, -9.3588F, -1.0F, 17.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.1039F, -20.5329F, 0.0218F, 0.1294F, -1.2474F));

		PartDefinition chest10_r2 = body.addOrReplaceChild("chest10_r2", CubeListBuilder.create().texOffs(152, 109).mirror().addBox(-13.4378F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.1039F, -20.5329F, 0.0881F, 0.0974F, -0.6773F));

		PartDefinition chest9_r2 = body.addOrReplaceChild("chest9_r2", CubeListBuilder.create().texOffs(49, 161).mirror().addBox(-6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.1039F, -20.5329F, 0.1209F, 0.0511F, -0.2421F));

		PartDefinition chest8_r1 = body.addOrReplaceChild("chest8_r1", CubeListBuilder.create().texOffs(162, 18).mirror().addBox(-6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.1039F, -24.5329F, 0.1628F, 0.0638F, -0.2485F));

		PartDefinition chest10_r3 = body.addOrReplaceChild("chest10_r3", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-27.9709F, -9.3588F, -1.0F, 18.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.1039F, -24.5329F, 0.0337F, 0.1715F, -1.2543F));

		PartDefinition chest9_r3 = body.addOrReplaceChild("chest9_r3", CubeListBuilder.create().texOffs(152, 127).mirror().addBox(-13.4378F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.1039F, -24.5329F, 0.1209F, 0.1264F, -0.6823F));

		PartDefinition chest9_r4 = body.addOrReplaceChild("chest9_r4", CubeListBuilder.create().texOffs(96, 54).mirror().addBox(-29.9709F, -9.3588F, -1.0F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.1039F, -29.5329F, 0.0579F, 0.2555F, -1.2928F));

		PartDefinition chest8_r2 = body.addOrReplaceChild("chest8_r2", CubeListBuilder.create().texOffs(152, 130).mirror().addBox(-13.4378F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.1039F, -29.5329F, 0.1872F, 0.1841F, -0.7157F));

		PartDefinition chest7_r1 = body.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(162, 32).mirror().addBox(-6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.1039F, -29.5329F, 0.2467F, 0.0886F, -0.2857F));

		PartDefinition chest14_r5 = body.addOrReplaceChild("chest14_r5", CubeListBuilder.create().texOffs(151, 39).addBox(5.4379F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.1961F, -3.6329F, -0.1327F, 0.1011F, 0.9387F));

		PartDefinition chest13_r4 = body.addOrReplaceChild("chest13_r4", CubeListBuilder.create().texOffs(155, 0).addBox(0.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.1961F, -3.6329F, -0.1628F, 0.0359F, 0.5061F));

		PartDefinition chest14_r6 = body.addOrReplaceChild("chest14_r6", CubeListBuilder.create().texOffs(128, 147).addBox(9.9709F, -9.3588F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.1039F, -6.6329F, -0.0457F, 0.1145F, 1.4224F));

		PartDefinition chest13_r5 = body.addOrReplaceChild("chest13_r5", CubeListBuilder.create().texOffs(151, 42).addBox(5.4379F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.1039F, -6.6329F, -0.1001F, 0.072F, 0.8542F));

		PartDefinition chest12_r4 = body.addOrReplaceChild("chest12_r4", CubeListBuilder.create().texOffs(155, 3).addBox(0.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.1039F, -6.6329F, -0.1211F, 0.0231F, 0.4201F));

		PartDefinition chest11_r4 = body.addOrReplaceChild("chest11_r4", CubeListBuilder.create().texOffs(155, 15).addBox(0.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.8039F, -10.6329F, 0.004F, -0.0154F, 0.3333F));

		PartDefinition chest12_r5 = body.addOrReplaceChild("chest12_r5", CubeListBuilder.create().texOffs(152, 70).addBox(5.4379F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.8039F, -10.6329F, -0.0029F, -0.0157F, 0.7697F));

		PartDefinition chest13_r6 = body.addOrReplaceChild("chest13_r6", CubeListBuilder.create().texOffs(99, 13).addBox(9.9709F, -9.3588F, -1.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.8039F, -10.6329F, -0.0108F, -0.0117F, 1.337F));

		PartDefinition chest10_r4 = body.addOrReplaceChild("chest10_r4", CubeListBuilder.create().texOffs(158, 53).addBox(0.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.8039F, -14.5329F, 0.0875F, -0.041F, 0.2437F));

		PartDefinition chest11_r5 = body.addOrReplaceChild("chest11_r5", CubeListBuilder.create().texOffs(152, 103).addBox(5.4379F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.8039F, -14.5329F, 0.062F, -0.0741F, 0.6795F));

		PartDefinition chest12_r6 = body.addOrReplaceChild("chest12_r6", CubeListBuilder.create().texOffs(76, 20).addBox(9.9709F, -9.3588F, -1.0F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.8039F, -14.5329F, 0.0124F, -0.0958F, 1.2484F));

		PartDefinition chest9_r5 = body.addOrReplaceChild("chest9_r5", CubeListBuilder.create().texOffs(158, 160).addBox(0.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.8039F, -17.5329F, 0.1209F, -0.0511F, 0.2421F));

		PartDefinition chest10_r5 = body.addOrReplaceChild("chest10_r5", CubeListBuilder.create().texOffs(152, 106).addBox(5.4379F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.8039F, -17.5329F, 0.0881F, -0.0974F, 0.6773F));

		PartDefinition chest11_r6 = body.addOrReplaceChild("chest11_r6", CubeListBuilder.create().texOffs(50, 45).addBox(9.9709F, -9.3588F, -1.0F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.8039F, -17.5329F, 0.0218F, -0.1294F, 1.2474F));

		PartDefinition chest8_r3 = body.addOrReplaceChild("chest8_r3", CubeListBuilder.create().texOffs(49, 161).addBox(0.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.1039F, -20.5329F, 0.1209F, -0.0511F, 0.2421F));

		PartDefinition chest9_r6 = body.addOrReplaceChild("chest9_r6", CubeListBuilder.create().texOffs(152, 109).addBox(5.4379F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.1039F, -20.5329F, 0.0881F, -0.0974F, 0.6773F));

		PartDefinition chest10_r6 = body.addOrReplaceChild("chest10_r6", CubeListBuilder.create().texOffs(50, 3).addBox(9.9709F, -9.3588F, -1.0F, 17.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.1039F, -20.5329F, 0.0218F, -0.1294F, 1.2474F));

		PartDefinition chest9_r7 = body.addOrReplaceChild("chest9_r7", CubeListBuilder.create().texOffs(50, 0).addBox(9.9709F, -9.3588F, -1.0F, 18.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.1039F, -24.5329F, 0.0337F, -0.1715F, 1.2543F));

		PartDefinition chest8_r4 = body.addOrReplaceChild("chest8_r4", CubeListBuilder.create().texOffs(152, 127).addBox(5.4379F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.1039F, -24.5329F, 0.1209F, -0.1264F, 0.6823F));

		PartDefinition chest7_r2 = body.addOrReplaceChild("chest7_r2", CubeListBuilder.create().texOffs(162, 18).addBox(0.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.1039F, -24.5329F, 0.1628F, -0.0638F, 0.2485F));

		PartDefinition chest8_r5 = body.addOrReplaceChild("chest8_r5", CubeListBuilder.create().texOffs(96, 54).addBox(9.9709F, -9.3588F, -1.0F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.1039F, -29.5329F, 0.0579F, -0.2555F, 1.2928F));

		PartDefinition chest7_r3 = body.addOrReplaceChild("chest7_r3", CubeListBuilder.create().texOffs(152, 130).addBox(5.4379F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.1039F, -29.5329F, 0.1872F, -0.1841F, 0.7157F));

		PartDefinition chest6_r1 = body.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(162, 32).addBox(0.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.1039F, -29.5329F, 0.2467F, -0.0886F, 0.2857F));

		PartDefinition chest8_r6 = body.addOrReplaceChild("chest8_r6", CubeListBuilder.create().texOffs(64, 162).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.7039F, -24.4329F, -0.1309F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(71, 45).addBox(-2.0F, -1.4422F, -14.6626F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0096F, -30.0879F, 0.0436F, 0.0F, 0.0F));

		PartDefinition chest5_r1 = chest.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(99, 0).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6422F, -2.9626F, -0.0436F, 0.0F, 0.0F));

		PartDefinition chest4_r1 = chest.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(49, 164).addBox(-1.0F, -3.2F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9422F, -6.6626F, -0.0873F, 0.0F, 0.0F));

		PartDefinition chest3_r1 = chest.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(165, 56).addBox(-1.0F, -3.3F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5422F, -10.6626F, -0.0436F, 0.0F, 0.0F));

		PartDefinition chest2_r1 = chest.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(36, 77).addBox(-1.0F, -2.7F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3422F, -13.6626F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(94, 125).mirror().addBox(-2.447F, -3.2431F, -0.8457F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.1369F, 6.7522F, -4.4449F, 1.5447F, 0.1119F, 0.3726F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(19, 97).mirror().addBox(-1.0F, -2.4F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.5479F, 1.978F, -1.7819F, 1.0231F, 0.1172F, 0.3295F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(23, 77).mirror().addBox(-6.4696F, -4.6462F, 2.9461F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.7792F, 17.7346F, -6.7135F, 1.2216F, -0.0057F, 0.0433F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(85, 140).mirror().addBox(-1.0F, -1.2F, -0.7F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.8083F, 16.5139F, -13.397F, 1.6053F, -0.7428F, -0.2304F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(103, 105).mirror().addBox(-6.1345F, -4.7117F, -4.577F, 2.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.7792F, 17.1346F, -5.2135F, 2.2302F, -0.4197F, -0.1459F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(19, 97).addBox(-1.0F, -2.4F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.5479F, 1.978F, -1.7819F, 1.0231F, -0.1172F, -0.3295F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(94, 125).addBox(0.447F, -3.2431F, -0.8457F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.1369F, 6.7522F, -4.4449F, 1.5447F, -0.1119F, -0.3726F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(23, 77).addBox(4.4696F, -4.6462F, 2.9461F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.7792F, 17.7346F, -6.7135F, 1.2216F, 0.0057F, -0.0433F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(103, 105).addBox(4.1345F, -4.7117F, -4.577F, 2.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.7792F, 17.1346F, -5.2135F, 2.2302F, 0.4197F, 0.1459F));

		PartDefinition cube_r26 = chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(85, 140).addBox(-1.0F, -1.2F, -0.7F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8083F, 16.5139F, -13.397F, 1.6053F, 0.7428F, 0.2304F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(122, 60).addBox(-5.5F, -1.6F, 1.1F, 11.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.1281F, -19.3814F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(107, 137).mirror().addBox(1.9595F, 8.6332F, 5.2964F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 28.7939F, -0.6171F, 0.7211F, -0.8849F, 0.3171F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(36, 111).mirror().addBox(1.9595F, 8.6332F, 5.2964F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 28.7939F, -0.6171F, 0.5877F, -1.0813F, 0.4983F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(77, 106).mirror().addBox(1.9595F, 8.6332F, 5.2964F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 28.7939F, -0.6171F, 0.4555F, -1.1803F, 0.705F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(11, 145).mirror().addBox(2.0595F, 7.4332F, 4.6964F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 28.7939F, -0.6171F, 0.0363F, -1.2907F, 1.1457F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(143, 92).mirror().addBox(1.9595F, 6.1332F, 3.4964F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 28.7939F, -0.6171F, -1.7998F, -1.3851F, 2.9226F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(127, 28).mirror().addBox(-0.6259F, 0.2342F, -0.1034F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 28.7939F, -0.6171F, -0.3972F, -0.5455F, 0.6061F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(18, 126).mirror().addBox(-0.6259F, 0.2342F, -0.1034F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 28.7939F, -0.6171F, -0.66F, -0.7962F, 0.9282F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(66, 126).mirror().addBox(-0.6259F, 0.2342F, -0.1034F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 28.7939F, -0.6171F, -0.5519F, -0.714F, 0.7672F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(130, 89).mirror().addBox(-0.6259F, 0.2342F, -0.7034F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 28.7939F, -0.6171F, -0.4279F, -1.074F, 0.5889F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(93, 105).mirror().addBox(-0.6259F, 0.2342F, -0.4034F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 28.7939F, -0.6171F, -0.2319F, -1.3865F, 0.3274F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(155, 73).mirror().addBox(-0.6259F, 0.2342F, -0.1034F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 28.7939F, -0.6171F, -2.8656F, -1.2199F, 3.0978F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(80, 126).mirror().addBox(-0.75F, -1.2F, -5.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(99, 0).mirror().addBox(-3.75F, -1.2F, 0.0F, 6.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0513F, 27.8531F, -4.1389F, -2.8301F, 0.2106F, -3.0843F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(99, 0).addBox(-2.25F, -1.2F, 0.0F, 6.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(80, 126).addBox(-2.25F, -1.2F, -5.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0513F, 27.8531F, -4.1389F, -2.8301F, -0.2106F, 3.0843F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(41, 137).addBox(-1.5595F, 4.4332F, 3.4964F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 28.7939F, -0.6171F, -1.9532F, 0.9955F, -3.0678F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(155, 73).addBox(-0.3741F, 0.2342F, -0.1034F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 28.7939F, -0.6171F, -2.8656F, 1.2199F, -3.0978F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(143, 92).addBox(-2.9595F, 6.1332F, 3.4964F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 28.7939F, -0.6171F, -1.7998F, 1.3851F, -2.9226F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(93, 105).addBox(-0.3741F, 0.2342F, -0.4034F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 28.7939F, -0.6171F, -0.2319F, 1.3865F, -0.3274F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(11, 145).addBox(-3.0595F, 7.4332F, 4.6964F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 28.7939F, -0.6171F, 0.0363F, 1.2907F, -1.1457F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(130, 89).addBox(-0.3741F, 0.2342F, -0.7034F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 28.7939F, -0.6171F, -0.4279F, 1.074F, -0.5889F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(18, 126).addBox(-0.3741F, 0.2342F, -0.1034F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 28.7939F, -0.6171F, -0.66F, 0.7962F, -0.9282F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(77, 106).addBox(-2.9595F, 8.6332F, 5.2964F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 28.7939F, -0.6171F, 0.4555F, 1.1803F, -0.705F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(66, 126).addBox(-0.3741F, 0.2342F, -0.1034F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 28.7939F, -0.6171F, -0.5519F, 0.714F, -0.7672F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(36, 111).addBox(-2.9595F, 8.6332F, 5.2964F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 28.7939F, -0.6171F, 0.5877F, 1.0813F, -0.4983F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(107, 137).addBox(-2.9595F, 8.6332F, 5.2964F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 28.7939F, -0.6171F, 0.7211F, 0.8849F, -0.3171F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(127, 28).addBox(-0.3741F, 0.2342F, -0.1034F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 28.7939F, -0.6171F, -0.3972F, 0.5455F, -0.6061F));

		PartDefinition chest6_r2 = chest.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(45, 63).mirror().addBox(-6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0422F, -3.1626F, 0.2467F, 0.0886F, -0.3381F));

		PartDefinition chest7_r4 = chest.addOrReplaceChild("chest7_r4", CubeListBuilder.create().texOffs(110, 31).mirror().addBox(-13.4378F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0422F, -3.1626F, 0.1872F, 0.1841F, -0.7681F));

		PartDefinition chest8_r7 = chest.addOrReplaceChild("chest8_r7", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-29.9709F, -9.3588F, -1.0F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0422F, -3.1626F, 0.0579F, 0.2555F, -1.3452F));

		PartDefinition chest7_r5 = chest.addOrReplaceChild("chest7_r5", CubeListBuilder.create().texOffs(91, 81).mirror().addBox(-29.9709F, -9.3588F, -1.0F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0422F, -7.1626F, 0.0661F, 0.2895F, -1.3779F));

		PartDefinition chest6_r3 = chest.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(118, 112).mirror().addBox(-13.4378F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0422F, -7.1626F, 0.2129F, 0.2082F, -0.798F));

		PartDefinition chest5_r2 = chest.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(71, 100).mirror().addBox(-6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0422F, -7.1626F, 0.2798F, 0.1002F, -0.3699F));

		PartDefinition chest4_r2 = chest.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(61, 115).mirror().addBox(-6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.4422F, -10.6626F, 0.288F, 0.103F, -0.4563F));

		PartDefinition chest5_r3 = chest.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(148, 100).mirror().addBox(-13.4378F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.4422F, -10.6626F, 0.2194F, 0.2143F, -0.8839F));

		PartDefinition chest6_r4 = chest.addOrReplaceChild("chest6_r4", CubeListBuilder.create().texOffs(96, 57).mirror().addBox(-28.9709F, -9.3588F, -1.0F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.4422F, -10.6626F, 0.0681F, 0.298F, -1.4646F));

		PartDefinition chest5_r4 = chest.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(110, 28).mirror().addBox(-19.9709F, -9.3588F, -1.0F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.4422F, -13.6626F, 0.0553F, 0.3252F, -1.6078F));

		PartDefinition chest4_r3 = chest.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(149, 124).mirror().addBox(-13.4378F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.4422F, -13.6626F, 0.2243F, 0.2438F, -1.022F));

		PartDefinition chest3_r2 = chest.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(36, 121).mirror().addBox(-6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.4422F, -13.6626F, 0.3047F, 0.1279F, -0.5936F));

		PartDefinition chest5_r5 = chest.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(45, 63).addBox(0.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.0422F, -3.1626F, 0.2467F, -0.0886F, 0.3381F));

		PartDefinition chest6_r5 = chest.addOrReplaceChild("chest6_r5", CubeListBuilder.create().texOffs(110, 31).addBox(5.4379F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.0422F, -3.1626F, 0.1872F, -0.1841F, 0.7681F));

		PartDefinition chest7_r6 = chest.addOrReplaceChild("chest7_r6", CubeListBuilder.create().texOffs(0, 74).addBox(9.9709F, -9.3588F, -1.0F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.0422F, -3.1626F, 0.0579F, -0.2555F, 1.3452F));

		PartDefinition chest4_r4 = chest.addOrReplaceChild("chest4_r4", CubeListBuilder.create().texOffs(71, 100).addBox(0.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.0422F, -7.1626F, 0.2798F, -0.1002F, 0.3699F));

		PartDefinition chest5_r6 = chest.addOrReplaceChild("chest5_r6", CubeListBuilder.create().texOffs(118, 112).addBox(5.4379F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.0422F, -7.1626F, 0.2129F, -0.2082F, 0.798F));

		PartDefinition chest6_r6 = chest.addOrReplaceChild("chest6_r6", CubeListBuilder.create().texOffs(91, 81).addBox(9.9709F, -9.3588F, -1.0F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.0422F, -7.1626F, 0.0661F, -0.2895F, 1.3779F));

		PartDefinition chest3_r3 = chest.addOrReplaceChild("chest3_r3", CubeListBuilder.create().texOffs(61, 115).addBox(0.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4422F, -10.6626F, 0.288F, -0.103F, 0.4563F));

		PartDefinition chest4_r5 = chest.addOrReplaceChild("chest4_r5", CubeListBuilder.create().texOffs(148, 100).addBox(5.4379F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4422F, -10.6626F, 0.2194F, -0.2143F, 0.8839F));

		PartDefinition chest5_r7 = chest.addOrReplaceChild("chest5_r7", CubeListBuilder.create().texOffs(96, 57).addBox(9.9709F, -9.3588F, -1.0F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4422F, -10.6626F, 0.0681F, -0.298F, 1.4646F));

		PartDefinition chest4_r6 = chest.addOrReplaceChild("chest4_r6", CubeListBuilder.create().texOffs(110, 28).addBox(9.9709F, -9.3588F, -1.0F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4422F, -13.6626F, 0.0553F, -0.3252F, 1.6078F));

		PartDefinition chest3_r4 = chest.addOrReplaceChild("chest3_r4", CubeListBuilder.create().texOffs(149, 124).addBox(5.4379F, -2.5357F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4422F, -13.6626F, 0.2243F, -0.2438F, 1.022F));

		PartDefinition chest2_r2 = chest.addOrReplaceChild("chest2_r2", CubeListBuilder.create().texOffs(36, 121).addBox(0.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4422F, -13.6626F, 0.3047F, -0.1279F, 0.5936F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(61, 17).addBox(-1.5F, -1.2383F, -8.1472F, 3.0F, 3.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.3104F, -13.8298F, -0.1671F, 0.1008F, 0.0712F));

		PartDefinition cube_r53 = neck1.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(11, 0).mirror().addBox(-0.5F, -1.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7215F, -2.4033F, -7.3283F, 0.5672F, 0.5964F, -0.008F));

		PartDefinition cube_r54 = neck1.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(104, 105).mirror().addBox(-0.8734F, -3.5244F, 2.3867F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9523F, 1.8941F, -3.9075F, 1.6208F, 0.0269F, 0.5984F));

		PartDefinition cube_r55 = neck1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(153, 22).mirror().addBox(-2.0663F, -1.4207F, -0.2554F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-4.3638F, 3.897F, -4.177F, 1.7332F, -0.0025F, -0.3006F));

		PartDefinition neck17_r1 = neck1.addOrReplaceChild("neck17_r1", CubeListBuilder.create().texOffs(30, 138).mirror().addBox(-0.0084F, 1.378F, -0.701F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-4.3638F, 3.897F, -3.777F, -0.0477F, -0.1257F, 1.2033F));

		PartDefinition neck18_r1 = neck1.addOrReplaceChild("neck18_r1", CubeListBuilder.create().texOffs(92, 126).mirror().addBox(-0.9096F, 1.378F, -2.6657F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.3638F, 3.897F, -3.777F, -0.0474F, -0.0211F, 1.1983F));

		PartDefinition cube_r56 = neck1.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(145, 13).mirror().addBox(-1.7351F, -1.4373F, -1.3831F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3638F, 3.897F, -4.177F, 1.6295F, -0.1038F, 0.7017F));

		PartDefinition cube_r57 = neck1.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(11, 0).addBox(-0.5F, -1.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7215F, -2.4033F, -7.3283F, 0.5672F, -0.5964F, 0.008F));

		PartDefinition cube_r58 = neck1.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(126, 31).addBox(0.4F, -0.7F, -1.3F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3503F, -2.6038F, -6.0637F, 1.3627F, 0.0F, 0.0F));

		PartDefinition cube_r59 = neck1.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(104, 105).addBox(-0.1266F, -3.5244F, 2.3867F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9523F, 1.8941F, -3.9075F, 1.6208F, -0.0269F, -0.5984F));

		PartDefinition neck16_r1 = neck1.addOrReplaceChild("neck16_r1", CubeListBuilder.create().texOffs(30, 138).addBox(-0.9916F, 1.378F, -0.701F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(4.3638F, 3.897F, -3.777F, -0.0477F, 0.1257F, -1.2033F));

		PartDefinition neck17_r2 = neck1.addOrReplaceChild("neck17_r2", CubeListBuilder.create().texOffs(92, 126).addBox(-1.0904F, 1.378F, -2.6657F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.3638F, 3.897F, -3.777F, -0.0474F, 0.0211F, -1.1983F));

		PartDefinition cube_r60 = neck1.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(145, 13).addBox(0.7351F, -1.4373F, -1.3831F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3638F, 3.897F, -4.177F, 1.6295F, 0.1038F, -0.7017F));

		PartDefinition cube_r61 = neck1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(153, 22).addBox(-5.9337F, -1.4207F, -0.2554F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(4.3638F, 3.897F, -4.177F, 1.7332F, 0.0025F, 0.3006F));

		PartDefinition neck = neck1.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(58, 14).addBox(-5.5773F, -1.9253F, -10.9651F, 3.0F, 3.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.0773F, 0.6807F, -7.8339F, -0.3318F, -0.0135F, -0.0427F));

		PartDefinition cube_r62 = neck.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(155, 7).mirror().addBox(1.2792F, -0.5122F, -4.0871F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.1546F, -2.0F, -10.1F, 1.423F, 0.1195F, 0.9119F));

		PartDefinition neck16_r2 = neck.addOrReplaceChild("neck16_r2", CubeListBuilder.create().texOffs(119, 148).mirror().addBox(-0.7999F, -0.6169F, -2.6233F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-10.2824F, 2.1749F, -10.6274F, -0.214F, 0.3838F, 1.1675F));

		PartDefinition cube_r63 = neck.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(8, 142).mirror().addBox(-2.5993F, -0.3955F, -4.5615F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-8.1546F, -2.0F, -9.8F, 1.434F, -0.0558F, -0.0799F));

		PartDefinition cube_r64 = neck.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(8, 142).addBox(-4.4007F, -0.3955F, -4.5615F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -2.0F, -9.8F, 1.434F, 0.0558F, 0.0799F));

		PartDefinition cube_r65 = neck.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(155, 7).addBox(-2.2792F, -0.5122F, -4.0871F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -10.1F, 1.423F, -0.1195F, -0.9119F));

		PartDefinition neck15_r1 = neck.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(119, 148).addBox(-1.2001F, -0.6169F, -2.6233F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1277F, 2.1749F, -10.6274F, -0.214F, -0.3838F, -1.1675F));

		PartDefinition neck16_r3 = neck.addOrReplaceChild("neck16_r3", CubeListBuilder.create().texOffs(145, 75).mirror().addBox(-0.2028F, -0.7552F, -0.0796F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-10.3F, 4.3303F, -2.8144F, -0.1762F, -0.0345F, 1.2079F));

		PartDefinition neck15_r2 = neck.addOrReplaceChild("neck15_r2", CubeListBuilder.create().texOffs(145, 75).addBox(-0.7972F, -0.7552F, -0.0796F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.1454F, 4.3303F, -2.8144F, -0.1762F, 0.0345F, -1.2079F));

		PartDefinition neck15_r3 = neck.addOrReplaceChild("neck15_r3", CubeListBuilder.create().texOffs(45, 106).mirror().addBox(-0.5495F, -0.8008F, -0.7893F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-10.2824F, 3.2749F, -9.8274F, -0.2065F, 0.2814F, 1.1907F));

		PartDefinition cube_r66 = neck.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(73, 168).mirror().addBox(-0.8734F, -3.5244F, 3.3867F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0296F, 1.207F, -7.7254F, 1.6208F, 0.0269F, 0.5984F));

		PartDefinition cube_r67 = neck.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(128, 88).mirror().addBox(-0.4F, -1.0F, -1.6F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.628F, -2.9206F, -2.8316F, 1.7991F, 0.0F, 0.0F));

		PartDefinition cube_r68 = neck.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(166, 136).mirror().addBox(-0.8734F, -3.5244F, 2.3867F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0296F, 1.207F, -0.7254F, 1.6208F, 0.0269F, 0.5984F));

		PartDefinition cube_r69 = neck.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(13, 25).mirror().addBox(-0.5F, -1.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7988F, -3.0903F, -4.1463F, 0.5672F, 0.5964F, -0.008F));

		PartDefinition cube_r70 = neck.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(149, 151).mirror().addBox(-2.9464F, -0.3981F, -5.1346F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0433F, 1.3279F, -2.8556F, 1.5296F, -0.0189F, 0.7078F));

		PartDefinition cube_r71 = neck.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(153, 84).mirror().addBox(-5.8869F, -0.4398F, -1.286F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-5.0433F, 1.3279F, -2.8556F, 1.6081F, -0.0411F, -0.2978F));

		PartDefinition neck17_r3 = neck.addOrReplaceChild("neck17_r3", CubeListBuilder.create().texOffs(165, 65).mirror().addBox(-1.1679F, -0.7552F, -2.068F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-10.3F, 4.3303F, -2.8144F, -0.1765F, 0.0686F, 1.1895F));

		PartDefinition cube_r72 = neck.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(166, 136).addBox(-0.1266F, -3.5244F, 2.3867F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.125F, 1.207F, -0.7254F, 1.6208F, -0.0269F, -0.5984F));

		PartDefinition cube_r73 = neck.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(13, 25).addBox(-0.5F, -1.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.3558F, -3.0903F, -4.1463F, 0.5672F, -0.5964F, 0.008F));

		PartDefinition cube_r74 = neck.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(149, 151).addBox(1.9464F, -0.3981F, -5.1346F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1113F, 1.3279F, -2.8556F, 1.5296F, 0.0189F, -0.7078F));

		PartDefinition neck16_r4 = neck.addOrReplaceChild("neck16_r4", CubeListBuilder.create().texOffs(165, 65).addBox(-0.8321F, -0.7552F, -2.068F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1454F, 4.3303F, -2.8144F, -0.1765F, -0.0686F, -1.1895F));

		PartDefinition cube_r75 = neck.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(153, 84).addBox(-2.1131F, -0.4398F, -1.286F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-3.1113F, 1.3279F, -2.8556F, 1.6081F, 0.0411F, 0.2978F));

		PartDefinition cube_r76 = neck.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(73, 168).addBox(-0.1266F, -3.5244F, 3.3867F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.125F, 1.207F, -7.7254F, 1.6208F, -0.0269F, -0.5984F));

		PartDefinition cube_r77 = neck.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(117, 159).addBox(-0.1F, -2.2F, -2.2F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9914F, -2.2497F, -5.8224F, 1.45F, 0.0F, 0.0F));

		PartDefinition neck14_r1 = neck.addOrReplaceChild("neck14_r1", CubeListBuilder.create().texOffs(45, 106).addBox(-0.4505F, -0.8008F, -0.7893F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.1277F, 3.2749F, -9.8274F, -0.2065F, -0.2814F, -1.1907F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(76, 0).addBox(-1.5F, -1.4642F, -15.4289F, 3.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0773F, -0.631F, -10.6417F, -0.2942F, 0.0193F, 0.0211F));

		PartDefinition neck14_r2 = neck2.addOrReplaceChild("neck14_r2", CubeListBuilder.create().texOffs(110, 13).mirror().addBox(-0.3466F, -0.8159F, -0.6424F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.7167F, 3.4493F, -4.6176F, -0.1262F, 0.1127F, 1.2007F));

		PartDefinition neck15_r4 = neck2.addOrReplaceChild("neck15_r4", CubeListBuilder.create().texOffs(73, 162).mirror().addBox(-0.5949F, -0.7205F, -1.4776F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.7167F, 2.4493F, -6.6176F, -0.1275F, 0.182F, 1.1918F));

		PartDefinition cube_r78 = neck2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(89, 32).mirror().addBox(-3.4447F, 1.4305F, -2.9993F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(140, 56).mirror().addBox(-3.6695F, -5.6992F, -1.9429F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-2.1458F, -0.2486F, -8.5134F, 1.6516F, -0.0372F, -0.0901F));

		PartDefinition cube_r79 = neck2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(78, 138).mirror().addBox(-0.5348F, 2.2261F, -3.4856F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(156, 25).mirror().addBox(-1.5465F, -4.9037F, -3.1076F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5376F, 0.2887F, -9.1839F, 1.5561F, -0.0536F, 0.9163F));

		PartDefinition cube_r80 = neck2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(23, 77).mirror().addBox(-0.7F, -2.9F, -0.7F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7819F, -1.7539F, -4.4159F, 1.8014F, -0.0958F, 0.5922F));

		PartDefinition cube_r81 = neck2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4868F, -2.1103F, -7.8211F, 0.9713F, -0.0108F, 0.6121F));

		PartDefinition neck13_r1 = neck2.addOrReplaceChild("neck13_r1", CubeListBuilder.create().texOffs(20, 111).mirror().addBox(0.021F, -0.8079F, -0.4042F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.7167F, 2.5493F, -12.0176F, -0.1264F, 0.1214F, 1.1996F));

		PartDefinition neck14_r3 = neck2.addOrReplaceChild("neck14_r3", CubeListBuilder.create().texOffs(86, 163).mirror().addBox(-0.6293F, -0.6786F, -2.3644F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.7167F, 1.8493F, -12.9176F, -0.1282F, 0.2079F, 1.1884F));

		PartDefinition cube_r82 = neck2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(104, 170).mirror().addBox(-0.7136F, -4.4591F, 2.3518F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-0.7136F, -6.8591F, 3.3518F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5376F, 0.2887F, -9.5839F, 1.5822F, -0.0108F, 0.6121F));

		PartDefinition cube_r83 = neck2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(89, 32).addBox(-2.5553F, 1.4305F, -2.9993F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(140, 56).addBox(-2.3305F, -5.6992F, -1.9429F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.1458F, -0.2486F, -8.5134F, 1.6516F, 0.0372F, 0.0901F));

		PartDefinition cube_r84 = neck2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(90, 86).addBox(-0.1F, -2.0F, -2.7F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0857F, -2.6845F, -4.3701F, 1.6606F, 0.0F, 0.0F));

		PartDefinition cube_r85 = neck2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4868F, -2.1103F, -7.8211F, 0.9713F, 0.0108F, -0.6121F));

		PartDefinition cube_r86 = neck2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(23, 77).addBox(-0.3F, -2.9F, -0.7F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7819F, -1.7539F, -4.4159F, 1.8014F, 0.0958F, -0.5922F));

		PartDefinition cube_r87 = neck2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(78, 138).addBox(-0.4652F, 2.2261F, -3.4856F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(156, 25).addBox(0.5465F, -4.9037F, -3.1076F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5376F, 0.2887F, -9.1839F, 1.5561F, 0.0536F, -0.9163F));

		PartDefinition neck14_r4 = neck2.addOrReplaceChild("neck14_r4", CubeListBuilder.create().texOffs(73, 162).addBox(-1.4051F, -0.7205F, -1.4776F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.7167F, 2.4493F, -6.6176F, -0.1275F, -0.182F, -1.1918F));

		PartDefinition neck13_r2 = neck2.addOrReplaceChild("neck13_r2", CubeListBuilder.create().texOffs(110, 13).addBox(-0.6534F, -0.8159F, -0.6424F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.7167F, 3.4493F, -4.6176F, -0.1262F, -0.1127F, -1.2007F));

		PartDefinition neck13_r3 = neck2.addOrReplaceChild("neck13_r3", CubeListBuilder.create().texOffs(86, 163).addBox(-1.3707F, -0.6786F, -2.3644F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.7167F, 1.8493F, -12.9176F, -0.1282F, -0.2079F, -1.1884F));

		PartDefinition neck12_r1 = neck2.addOrReplaceChild("neck12_r1", CubeListBuilder.create().texOffs(20, 111).addBox(-1.021F, -0.8079F, -0.4042F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.7167F, 2.5493F, -12.0176F, -0.1264F, -0.1214F, -1.1996F));

		PartDefinition cube_r88 = neck2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2864F, -6.8591F, 3.3518F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(104, 170).addBox(-0.2864F, -4.4591F, 2.3518F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5376F, 0.2887F, -9.5839F, 1.5822F, 0.0108F, -0.6121F));

		PartDefinition cube_r89 = neck2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(95, 165).addBox(-0.3F, -2.0F, -2.3F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2872F, -3.3908F, -9.5395F, 1.6606F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(89, 20).addBox(-1.0F, -0.4922F, -15.2769F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0055F, -15.2425F, -0.1749F, -0.0482F, -0.0986F));

		PartDefinition cube_r90 = neck3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(164, 27).mirror().addBox(-1.6204F, -5.4271F, -0.8187F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-2.1458F, 0.7234F, -2.3615F, 1.6516F, -0.0372F, -0.0901F));

		PartDefinition neck12_r2 = neck3.addOrReplaceChild("neck12_r2", CubeListBuilder.create().texOffs(70, 66).mirror().addBox(-0.342F, 0.3321F, -1.7219F, 1.0F, 1.0F, 18.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.9099F, 1.8251F, -6.8006F, -0.1124F, 0.2021F, 1.1875F));

		PartDefinition cube_r91 = neck3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(165, 45).mirror().addBox(-1.2776F, -5.4271F, -2.8371F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1458F, 0.7234F, -2.3615F, 1.5828F, -0.0882F, 0.9144F));

		PartDefinition cube_r92 = neck3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(165, 163).mirror().addBox(-0.5708F, -6.9774F, 1.4647F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1458F, 0.7234F, -2.3615F, 1.6179F, -0.0358F, 0.6112F));

		PartDefinition cube_r93 = neck3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(96, 86).mirror().addBox(0.6705F, 0.5487F, 1.8538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-2.4623F, 0.0501F, -11.1901F, 1.671F, -0.4568F, 0.5707F));

		PartDefinition neck11_r1 = neck3.addOrReplaceChild("neck11_r1", CubeListBuilder.create().texOffs(27, 73).mirror().addBox(-0.5802F, -0.5329F, -0.9906F, 1.0F, 1.0F, 18.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.9246F, 1.7443F, -14.0187F, -0.0932F, 0.1883F, 1.1877F));

		PartDefinition cube_r94 = neck3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(167, 99).mirror().addBox(-0.5209F, -0.7158F, -1.0155F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-3.0489F, 1.2383F, -13.6906F, 1.7038F, -0.0325F, -0.0919F));

		PartDefinition cube_r95 = neck3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(169, 155).mirror().addBox(-0.2698F, -3.3203F, -2.0931F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4623F, 0.0501F, -11.1901F, 1.615F, -0.1296F, 0.9109F));

		PartDefinition cube_r96 = neck3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(91, 66).mirror().addBox(0.2192F, -3.8383F, 0.8988F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 93).mirror().addBox(0.2192F, -4.8383F, 1.8988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4623F, 0.0501F, -11.1901F, 1.6609F, -0.0659F, 0.6091F));

		PartDefinition cube_r97 = neck3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(135, 165).addBox(-0.2F, -2.5F, -2.1F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2349F, -2.0792F, -3.3429F, 1.7022F, 0.0F, 0.0F));

		PartDefinition cube_r98 = neck3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(165, 163).addBox(-0.4292F, -6.9774F, 1.4647F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1458F, 0.7234F, -2.3615F, 1.6179F, 0.0358F, -0.6112F));

		PartDefinition cube_r99 = neck3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(164, 27).addBox(-2.3796F, -5.4271F, -0.8187F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.1458F, 0.7234F, -2.3615F, 1.6516F, 0.0372F, 0.0901F));

		PartDefinition cube_r100 = neck3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(165, 45).addBox(0.2776F, -5.4271F, -2.8371F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1458F, 0.7234F, -2.3615F, 1.5828F, 0.0882F, -0.9144F));

		PartDefinition neck11_r2 = neck3.addOrReplaceChild("neck11_r2", CubeListBuilder.create().texOffs(70, 66).addBox(-0.658F, 0.3321F, -1.7219F, 1.0F, 1.0F, 18.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.9099F, 1.8251F, -6.8006F, -0.1124F, -0.2021F, -1.1875F));

		PartDefinition neck10_r1 = neck3.addOrReplaceChild("neck10_r1", CubeListBuilder.create().texOffs(27, 73).addBox(-0.4198F, -0.5329F, -0.9906F, 1.0F, 1.0F, 18.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.9246F, 1.7443F, -14.0187F, -0.0932F, -0.1883F, -1.1877F));

		PartDefinition cube_r101 = neck3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(167, 99).addBox(-3.4791F, -0.7158F, -1.0155F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.0489F, 1.2383F, -13.6906F, 1.7038F, 0.0325F, 0.0919F));

		PartDefinition cube_r102 = neck3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(169, 155).addBox(-0.7302F, -3.3203F, -2.0931F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4623F, 0.0501F, -11.1901F, 1.615F, 0.1296F, -0.9109F));

		PartDefinition cube_r103 = neck3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(60, 93).addBox(-1.2192F, -4.8383F, 1.8988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 66).addBox(-1.2192F, -3.8383F, 0.8988F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4623F, 0.0501F, -11.1901F, 1.6609F, 0.0659F, -0.6091F));

		PartDefinition cube_r104 = neck3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(144, 167).addBox(0.2F, -1.5F, -2.2F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1808F, -1.3764F, -12.4857F, 1.7521F, 0.0F, 0.0F));

		PartDefinition cube_r105 = neck3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(96, 86).addBox(-1.6705F, 0.5487F, 1.8538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.4623F, 0.0501F, -11.1901F, 1.671F, 0.4568F, -0.5707F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2698F, -15.0053F, 0.473F, -0.0016F, 0.0425F));

		PartDefinition neck10_r2 = neck4.addOrReplaceChild("neck10_r2", CubeListBuilder.create().texOffs(27, 51).mirror().addBox(-0.788F, -0.6887F, -1.7295F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.7868F, 1.1189F, -5.295F, -0.1831F, 0.3924F, 1.1601F));

		PartDefinition cube_r106 = neck4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(170, 11).mirror().addBox(0.2949F, -0.4548F, -0.613F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-3.8417F, 0.787F, -5.4055F, 1.5364F, -0.0529F, -0.2159F));

		PartDefinition cube_r107 = neck4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(170, 0).mirror().addBox(0.2066F, -0.2484F, -2.8463F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0189F, -1.5051F, -5.4284F, 1.5084F, 0.0088F, 0.9174F));

		PartDefinition cube_r108 = neck4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(19, 97).mirror().addBox(-0.002F, 0.8671F, -0.508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.4968F, -2.0373F, -2.3514F, 1.5144F, -0.3578F, 0.6329F));

		PartDefinition cube_r109 = neck4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(93, 105).mirror().addBox(-0.989F, -3.0699F, 0.4207F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 97).mirror().addBox(-0.989F, -4.0699F, 1.4207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.197F, -0.2782F, -3.1969F, 1.5179F, 0.0343F, 0.6113F));

		PartDefinition cube_r110 = neck4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(19, 100).mirror().addBox(-0.5206F, -0.1012F, -0.4683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.4968F, -2.5373F, -7.9514F, 1.5134F, -0.4014F, 0.6356F));

		PartDefinition cube_r111 = neck4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(76, 6).mirror().addBox(-0.989F, -3.0699F, 0.4207F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.197F, -0.7782F, -8.8969F, 1.5179F, 0.0343F, 0.6113F));

		PartDefinition neck9_r1 = neck4.addOrReplaceChild("neck9_r1", CubeListBuilder.create().texOffs(126, 2).mirror().addBox(0.1003F, 1.9989F, -0.6433F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0189F, -1.7051F, -11.6284F, -0.2129F, -0.0348F, 0.5005F));

		PartDefinition cube_r112 = neck4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(130, 73).mirror().addBox(-0.2539F, -0.4782F, -0.9026F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-2.6528F, 0.5062F, -11.0431F, 1.5185F, -0.0352F, -0.2508F));

		PartDefinition cube_r113 = neck4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(170, 39).mirror().addBox(0.2022F, 0.2506F, -2.8151F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0189F, -1.7051F, -11.6284F, 1.5084F, 0.0088F, 0.4811F));

		PartDefinition neck9_r2 = neck4.addOrReplaceChild("neck9_r2", CubeListBuilder.create().texOffs(27, 51).addBox(-0.212F, -0.6887F, -1.7295F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.7868F, 1.1189F, -5.295F, -0.1831F, -0.3924F, -1.1601F));

		PartDefinition cube_r114 = neck4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(170, 11).addBox(-4.2949F, -0.4548F, -0.613F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.8417F, 0.787F, -5.4055F, 1.5364F, 0.0529F, 0.2159F));

		PartDefinition cube_r115 = neck4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(170, 0).addBox(-1.2066F, -0.2484F, -2.8463F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0189F, -1.5051F, -5.4284F, 1.5084F, -0.0088F, -0.9174F));

		PartDefinition cube_r116 = neck4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(93, 105).addBox(-0.011F, -3.0699F, 0.4207F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 97).addBox(-0.011F, -4.0699F, 1.4207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.197F, -0.2782F, -3.1969F, 1.5179F, -0.0343F, -0.6113F));

		PartDefinition cube_r117 = neck4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(167, 147).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4303F, -2.7525F, 1.5852F, 0.0F, 0.0F));

		PartDefinition cube_r118 = neck4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(19, 97).addBox(-0.998F, 0.8671F, -0.508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.4968F, -2.0373F, -2.3514F, 1.5144F, 0.3578F, -0.6329F));

		PartDefinition cube_r119 = neck4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(19, 100).addBox(-0.4794F, -0.1012F, -0.4683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.4968F, -2.5373F, -7.9514F, 1.5134F, 0.4014F, -0.6356F));

		PartDefinition cube_r120 = neck4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(169, 129).addBox(-1.197F, -1.1122F, -0.237F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.197F, -0.7782F, -8.8969F, 1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r121 = neck4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(76, 6).addBox(-0.011F, -3.0699F, 0.4207F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.197F, -0.7782F, -8.8969F, 1.5179F, -0.0343F, -0.6113F));

		PartDefinition cube_r122 = neck4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(130, 73).addBox(-2.7461F, -0.4782F, -0.9026F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.6528F, 0.5062F, -11.0431F, 1.5185F, 0.0352F, 0.2508F));

		PartDefinition cube_r123 = neck4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(170, 39).addBox(-1.2022F, 0.2506F, -2.8151F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0189F, -1.7051F, -11.6284F, 1.5084F, -0.0088F, -0.4811F));

		PartDefinition neck8_r1 = neck4.addOrReplaceChild("neck8_r1", CubeListBuilder.create().texOffs(126, 2).addBox(-1.1003F, 1.9989F, -0.6433F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0189F, -1.7051F, -11.6284F, -0.2129F, 0.0348F, -0.5005F));

		PartDefinition neck3_r1 = neck4.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(111, 84).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.7747F, -11.9007F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8193F, -11.9536F, 0.4458F, -0.1098F, -0.0774F));

		PartDefinition neck5_r1 = neck5.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(86, 155).addBox(-1.0F, -1.4521F, -0.3955F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2949F, -4.217F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r124 = neck5.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(42, 101).mirror().addBox(-0.5239F, 0.5476F, -0.6461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 49).mirror().addBox(-0.5239F, -2.4524F, -1.6461F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3886F, -1.9383F, -1.3967F, 1.4102F, 0.1091F, 0.6036F));

		PartDefinition cube_r125 = neck5.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(80, 48).mirror().addBox(-0.3106F, -1.2838F, -0.606F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7289F, 0.3788F, -2.4977F, 1.3794F, 0.0315F, 0.173F));

		PartDefinition neck8_r2 = neck5.addOrReplaceChild("neck8_r2", CubeListBuilder.create().texOffs(140, 64).mirror().addBox(-0.5981F, -1.7707F, -2.0059F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2986F, 2.1998F, -3.7621F, -0.4112F, -0.0239F, 0.2083F));

		PartDefinition cube_r126 = neck5.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(42, 104).mirror().addBox(-0.6252F, 0.2615F, 0.4435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 23).mirror().addBox(-0.6252F, -2.7385F, -0.5565F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9325F, -1.1098F, -5.1482F, 1.6251F, -0.0409F, 0.611F));

		PartDefinition cube_r127 = neck5.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(117, 133).mirror().addBox(-0.8227F, -1.7385F, -2.2827F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9325F, -1.1098F, -5.1482F, 1.6372F, -0.0141F, 0.1753F));

		PartDefinition neck7_r1 = neck5.addOrReplaceChild("neck7_r1", CubeListBuilder.create().texOffs(168, 21).mirror().addBox(-0.2F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4486F, 1.1041F, -5.657F, -0.2077F, -0.0458F, 0.21F));

		PartDefinition neck6_r1 = neck5.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(170, 70).mirror().addBox(-1.6F, 0.1248F, -0.2415F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5051F, -10.117F, -0.0505F, -0.0409F, 0.0299F));

		PartDefinition cube_r128 = neck5.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(143, 88).mirror().addBox(-0.1065F, -0.421F, -1.9741F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6886F, -0.7295F, -9.6239F, 1.7232F, -0.0293F, 0.1734F));

		PartDefinition cube_r129 = neck5.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(50, 6).mirror().addBox(-0.6826F, 2.4617F, -0.4125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 111).mirror().addBox(-0.6826F, -0.5383F, -1.4125F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3886F, -1.4295F, -10.6239F, 1.6968F, -0.0908F, 0.6062F));

		PartDefinition neck7_r2 = neck5.addOrReplaceChild("neck7_r2", CubeListBuilder.create().texOffs(140, 64).addBox(-0.4019F, -1.7707F, -2.0059F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2986F, 2.1998F, -3.7621F, -0.4112F, 0.0239F, -0.2083F));

		PartDefinition cube_r130 = neck5.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(80, 48).addBox(-0.6894F, -1.2838F, -0.606F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7289F, 0.3788F, -2.4977F, 1.3794F, -0.0315F, -0.173F));

		PartDefinition neck6_r2 = neck5.addOrReplaceChild("neck6_r2", CubeListBuilder.create().texOffs(168, 21).addBox(-0.8F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4486F, 1.1041F, -5.657F, -0.2077F, 0.0458F, -0.21F));

		PartDefinition cube_r131 = neck5.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(80, 168).addBox(0.0F, -1.2F, -1.9F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0779F, -1.7482F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r132 = neck5.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(42, 101).addBox(-0.4761F, 0.5476F, -0.6461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 49).addBox(-0.4761F, -2.4524F, -1.6461F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3886F, -1.9383F, -1.3967F, 1.4102F, -0.1091F, -0.6036F));

		PartDefinition cube_r133 = neck5.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(89, 170).addBox(-0.9325F, -1.6706F, -1.0734F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9325F, -1.1098F, -5.1482F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r134 = neck5.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(42, 104).addBox(-0.3748F, 0.2615F, 0.4435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 23).addBox(-0.3748F, -2.7385F, -0.5565F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9325F, -1.1098F, -5.1482F, 1.6251F, 0.0409F, -0.611F));

		PartDefinition cube_r135 = neck5.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(117, 133).addBox(-0.1773F, -1.7385F, -2.2827F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9325F, -1.1098F, -5.1482F, 1.6372F, 0.0141F, -0.1753F));

		PartDefinition neck5_r2 = neck5.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(170, 70).addBox(0.6F, 0.1248F, -0.2415F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 0.5051F, -10.117F, -0.0505F, 0.0409F, -0.0299F));

		PartDefinition cube_r136 = neck5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(143, 88).addBox(-0.8935F, -0.421F, -1.9741F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6886F, -0.7295F, -9.6239F, 1.7232F, 0.0293F, -0.1734F));

		PartDefinition cube_r137 = neck5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(50, 6).addBox(-0.3174F, 2.4617F, -0.4125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 111).addBox(-0.3174F, -0.5383F, -1.4125F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3886F, -1.4295F, -10.6239F, 1.6968F, 0.0908F, -0.6062F));

		PartDefinition cube_r138 = neck5.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(128, 161).addBox(-0.3886F, 0.6232F, -2.033F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3886F, -1.4295F, -10.6239F, 1.6755F, 0.0F, 0.0F));

		PartDefinition neck4_r1 = neck5.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(143, 88).addBox(-1.0F, -0.5515F, -1.1545F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.2949F, -11.117F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create().texOffs(138, 113).addBox(-1.5F, -1.0F, -4.5F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.01F))
				.texOffs(46, 111).addBox(2.595F, -2.7F, -3.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(61, 106).addBox(2.815F, -2.7F, -3.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(46, 111).mirror().addBox(-1.595F, -2.7F, -3.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(61, 106).mirror().addBox(-1.815F, -2.7F, -3.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0441F, -11.0239F, 0.4588F, -0.1175F, -0.0578F));

		PartDefinition head7_r1 = head.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(167, 105).mirror().addBox(-2.0F, -1.0579F, -0.9225F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(167, 105).mirror().addBox(-2.0F, -1.7579F, -0.9225F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(167, 105).addBox(-0.85F, -1.7579F, -0.9225F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F))
				.texOffs(167, 105).addBox(-0.85F, -1.0579F, -0.9225F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.425F, 1.3942F, -3.4435F, -1.7453F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(167, 105).mirror().addBox(-2.0F, -0.5F, 0.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(167, 105).addBox(-0.85F, -0.5F, 0.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.425F, 0.1942F, -2.9435F, -2.3126F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(167, 105).mirror().addBox(-1.075F, -1.125F, 0.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(167, 105).addBox(0.075F, -1.125F, 0.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, -1.4F, -2.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition head9_r1 = head.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(167, 105).mirror().addBox(-2.0F, 0.3421F, -4.8225F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(167, 105).addBox(-0.85F, 0.3421F, -4.8225F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.425F, 1.4942F, -3.3185F, -1.7453F, 0.0F, 0.0F));

		PartDefinition head10_r1 = head.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(167, 105).mirror().addBox(-2.0F, -0.999F, -0.0086F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(167, 105).addBox(-0.85F, -0.999F, -0.0086F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.425F, -3.3058F, -2.8185F, -2.2689F, 0.0F, 0.0F));

		PartDefinition head11_r1 = head.addOrReplaceChild("head11_r1", CubeListBuilder.create().texOffs(167, 105).mirror().addBox(-2.0F, -1.0005F, 0.046F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(167, 105).addBox(-0.85F, -1.0005F, 0.046F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.425F, -2.7058F, -2.0185F, 3.0107F, 0.0F, 0.0F));

		PartDefinition head13_r1 = head.addOrReplaceChild("head13_r1", CubeListBuilder.create().texOffs(167, 105).mirror().addBox(-2.0F, -0.5F, -0.525F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(167, 105).addBox(-0.85F, -0.5F, -0.525F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.425F, -0.4515F, -4.0681F, 2.6878F, 0.0F, 0.0F));

		PartDefinition head12_r1 = head.addOrReplaceChild("head12_r1", CubeListBuilder.create().texOffs(167, 105).mirror().addBox(-2.0F, -1.983F, -0.0218F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false)
				.texOffs(167, 105).addBox(-0.85F, -1.983F, -0.0218F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.425F, -1.7058F, -2.2185F, 2.3824F, 0.0F, 0.0F));

		PartDefinition head15_r1 = head.addOrReplaceChild("head15_r1", CubeListBuilder.create().texOffs(167, 105).mirror().addBox(-2.0F, 0.0003F, -0.9748F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(167, 105).addBox(-0.85F, 0.0003F, -0.9748F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.425F, -1.7515F, -4.4681F, 2.8711F, 0.0F, 0.0F));

		PartDefinition head14_r1 = head.addOrReplaceChild("head14_r1", CubeListBuilder.create().texOffs(167, 105).mirror().addBox(-2.0F, -0.098F, 0.0434F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(167, 105).addBox(-0.85F, -0.098F, 0.0434F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.425F, -0.9515F, -3.3681F, -3.0456F, 0.0F, 0.0F));

		PartDefinition head16_r1 = head.addOrReplaceChild("head16_r1", CubeListBuilder.create().texOffs(167, 105).mirror().addBox(-2.0F, -0.0204F, -1.0226F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false)
				.texOffs(167, 105).addBox(-0.85F, -0.0204F, -1.0226F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.425F, -2.6515F, -4.2681F, 2.6791F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(99, 39).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1299F, -1.6422F, -5.4571F, -0.6043F, 0.0869F, 0.1515F));

		PartDefinition head2_r1 = head.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(99, 39).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1299F, -1.6422F, -5.4571F, -0.6043F, -0.0869F, -0.1515F));

		PartDefinition head3_r2 = head.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(139, 114).addBox(-3.0F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.5F, -1.4F, -2.5F, -0.5672F, 0.0F, 0.0F));

		PartDefinition head2_r2 = head.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(114, 178).addBox(-3.0F, -1.3F, -0.6F, 4.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0F, -2.5847F, -2.0842F, 0.288F, 0.0F, 0.0F));

		PartDefinition head2_r3 = head.addOrReplaceChild("head2_r3", CubeListBuilder.create().texOffs(45, 96).addBox(-3.0F, -2.0509F, -0.1611F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 0.0F, -4.7F, -0.1484F, 0.0F, 0.0F));

		PartDefinition head1_r1 = head.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(171, 175).addBox(-3.0F, 0.0556F, 0.04F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -3.9F, -4.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, 0.2F, 0.2618F, 0.0F, 0.0F));

		PartDefinition jaw4_r1 = jaw.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(123, 1).mirror().addBox(-0.5F, -0.0364F, -0.9779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(123, 1).addBox(3.3F, -0.0364F, -0.9779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 0.15F, -5.15F, 1.1345F, 0.0F, 0.0F));

		PartDefinition jaw4_r2 = jaw.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(170, 121).mirror().addBox(0.6F, -0.9634F, -2.012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(170, 121).addBox(4.4F, -0.9634F, -2.012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, 1.4F, -2.05F, 0.4102F, 0.0F, 0.0F));

		PartDefinition jaw3_r1 = jaw.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(122, 0).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(122, 0).addBox(3.3F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.9F, -0.15F, -3.15F, 0.1309F, 0.0F, 0.0F));

		PartDefinition jaw3_r2 = jaw.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(170, 121).mirror().addBox(0.6F, -0.275F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(170, 121).addBox(4.4F, -0.275F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.5F, -1.25F, 0.2356F, 0.0F, 0.0F));

		PartDefinition jaw2_r1 = jaw.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(161, 153).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(161, 153).addBox(3.3F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.9F, 0.5F, -1.75F, -0.1309F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw.addOrReplaceChild("jaw2", CubeListBuilder.create().texOffs(110, 16).addBox(1.7F, -1.2F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(110, 16).mirror().addBox(-0.7F, -1.2F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(163, 35).addBox(0.0F, -1.3F, -3.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.3F, -5.8F, 0.48F, 0.0F, 0.0F));

		PartDefinition jaw6_r1 = jaw2.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(81, 134).addBox(-3.5F, 1.0412F, -0.0094F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.0303F))
				.texOffs(81, 134).addBox(-3.5F, 0.8412F, -0.0094F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F))
				.texOffs(81, 134).addBox(-3.5F, -0.0588F, -0.0094F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.0303F)), PartPose.offsetAndRotation(3.5F, -0.3F, -3.2F, 0.4887F, 0.0F, 0.0F));

		PartDefinition jaw4_r3 = jaw2.addOrReplaceChild("jaw4_r3", CubeListBuilder.create().texOffs(9, 171).mirror().addBox(0.6F, -0.925F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.04F)).mirror(false)
				.texOffs(9, 171).addBox(3.0F, -0.925F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(-1.3F, 1.0F, -1.0F, 0.3142F, 0.0F, 0.0F));

		PartDefinition lowerteeth1 = jaw2.addOrReplaceChild("lowerteeth1", CubeListBuilder.create().texOffs(158, 136).addBox(1.3F, -1.7F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(158, 136).addBox(1.3F, -1.7F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition lowerteeth3_r1 = lowerteeth1.addOrReplaceChild("lowerteeth3_r1", CubeListBuilder.create().texOffs(158, 136).addBox(-1.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8F, -1.2F, -0.4F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lowerteeth2 = jaw2.addOrReplaceChild("lowerteeth2", CubeListBuilder.create().texOffs(158, 136).mirror().addBox(-2.3F, -1.7F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(158, 136).mirror().addBox(-2.3F, -1.7F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.0F, -2.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition lowerteeth4_r1 = lowerteeth2.addOrReplaceChild("lowerteeth4_r1", CubeListBuilder.create().texOffs(158, 136).mirror().addBox(0.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -1.2F, -0.4F, 0.1309F, 0.0F, 0.0F));

		PartDefinition nose1 = head.addOrReplaceChild("nose1", CubeListBuilder.create().texOffs(172, 94).addBox(0.5F, -0.7731F, 0.1817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, -2.9F, -6.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition nose6_r1 = nose1.addOrReplaceChild("nose6_r1", CubeListBuilder.create().texOffs(170, 92).addBox(-0.5F, -0.1268F, -2.794F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.0F, -0.125F, -1.75F, 0.8203F, 0.0F, 0.0F));

		PartDefinition nose5_r1 = nose1.addOrReplaceChild("nose5_r1", CubeListBuilder.create().texOffs(172, 94).addBox(-0.5F, -0.1507F, -0.8552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.425F, -1.05F, 0.4363F, 0.0F, 0.0F));

		PartDefinition nose4_r1 = nose1.addOrReplaceChild("nose4_r1", CubeListBuilder.create().texOffs(172, 94).addBox(-0.5F, -0.1371F, -0.8709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.0F, -0.575F, -0.35F, 0.192F, 0.0F, 0.0F));

		PartDefinition nose3_r1 = nose1.addOrReplaceChild("nose3_r1", CubeListBuilder.create().texOffs(172, 94).addBox(-0.5F, -0.1981F, -0.8683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.575F, 0.35F, 0.0873F, 0.0F, 0.0F));

		PartDefinition nose1_r1 = nose1.addOrReplaceChild("nose1_r1", CubeListBuilder.create().texOffs(172, 94).addBox(-0.5F, -0.175F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.475F, 1.75F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -6.7F));

		PartDefinition head3_r3 = head2.addOrReplaceChild("head3_r3", CubeListBuilder.create().texOffs(64, 109).addBox(-1.5F, 0.1456F, -0.0993F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.7F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head6_r2 = head2.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(173, 129).addBox(-0.5F, -1.2315F, -3.8221F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.015F))
				.texOffs(171, 129).addBox(-1.0F, -1.2315F, -2.1221F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(0.0F, 1.5F, 1.1F, -0.0436F, 0.0F, 0.0F));

		PartDefinition head5_r2 = head2.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(173, 147).addBox(-0.5F, -0.0167F, -2.1066F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.1F, -0.0436F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head2.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(171, 125).addBox(-1.5F, -1.2315F, -1.9971F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, 1.5F, 1.1F, -0.4363F, 0.0F, 0.0F));

		PartDefinition head4_r2 = head2.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(66, 110).addBox(-0.5F, -0.9335F, -1.0339F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.0F, -0.8F, 0.0436F, 0.0F, 0.0F));

		PartDefinition head3_r4 = head2.addOrReplaceChild("head3_r4", CubeListBuilder.create().texOffs(64, 109).addBox(-1.5F, -0.8565F, -1.9971F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, 1.5F, 1.1F, 0.2182F, 0.0F, 0.0F));

		PartDefinition head2_r4 = head2.addOrReplaceChild("head2_r4", CubeListBuilder.create().texOffs(64, 109).addBox(-1.5F, -1.0082F, -1.8881F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(0.0F, 1.9F, 2.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition nose2 = head2.addOrReplaceChild("nose2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.15F, -0.85F, 0.9163F, 0.0F, 0.0F));

		PartDefinition nose2_r1 = nose2.addOrReplaceChild("nose2_r1", CubeListBuilder.create().texOffs(115, 170).addBox(-0.5F, -0.425F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.0F, -0.95F, 0.3927F, 0.0F, 0.0F));

		PartDefinition nose3 = head2.addOrReplaceChild("nose3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -2.15F, 1.2217F, 0.0F, 0.0F));

		PartDefinition nose5_r2 = nose3.addOrReplaceChild("nose5_r2", CubeListBuilder.create().texOffs(100, 142).addBox(-1.0F, -0.0092F, -0.9863F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(1.0F, -1.1F, -0.575F, 1.3963F, 0.0F, 0.0F));

		PartDefinition nose4_r2 = nose3.addOrReplaceChild("nose4_r2", CubeListBuilder.create().texOffs(100, 142).addBox(-1.0F, -0.0287F, -0.963F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, -0.9F, 0.425F, 1.0908F, 0.0F, 0.0F));

		PartDefinition nose3_r2 = nose3.addOrReplaceChild("nose3_r2", CubeListBuilder.create().texOffs(100, 142).addBox(-1.0F, -1.0F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 0.1F, -0.975F, 0.3491F, 0.0F, 0.0F));

		PartDefinition teeth1 = head2.addOrReplaceChild("teeth1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.05F, -5.2F, 0.1384F, 0.0F, 0.0F));

		PartDefinition teeth2_r1 = teeth1.addOrReplaceChild("teeth2_r1", CubeListBuilder.create().texOffs(54, 87).mirror().addBox(-2.0F, -0.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 87).mirror().addBox(-1.4F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 87).addBox(0.4F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 87).addBox(1.0F, -0.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.75F, 4.8F, 0.0436F, 0.0F, 0.0F));

		PartDefinition teeth4_r1 = teeth1.addOrReplaceChild("teeth4_r1", CubeListBuilder.create().texOffs(54, 87).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 87).addBox(0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.733F, 2.8974F, -0.1309F, 0.0F, 0.0F));

		PartDefinition upperarmleft = chest.addOrReplaceChild("upperarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(13.5F, 23.1919F, -4.1476F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r139 = upperarmleft.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(125, 150).addBox(-0.5F, -1.8639F, -1.7769F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6215F, 4.4857F, -0.6433F, 1.4427F, -0.4042F, 0.0118F));

		PartDefinition cube_r140 = upperarmleft.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(55, 170).addBox(-0.5F, -2.3559F, -3.0392F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.6215F, 4.4857F, -0.6433F, 2.1583F, -0.4042F, 0.0118F));

		PartDefinition cube_r141 = upperarmleft.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 130).addBox(-3.0922F, -2.9193F, 0.308F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0922F, 6.4992F, 1.1306F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r142 = upperarmleft.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 116).addBox(-3.0922F, -2.0965F, -5.5265F, 4.0F, 3.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(71, 154).addBox(-3.0922F, -3.0965F, -8.5265F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0922F, 9.4992F, 0.6306F, 1.5708F, 0.0F, 0.0F));

		PartDefinition lowerarmleft = upperarmleft.addOrReplaceChild("lowerarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.8835F, 0.2553F, -0.2618F, 0.0F, 0.0F));

		PartDefinition arm4_r1 = lowerarmleft.addOrReplaceChild("arm4_r1", CubeListBuilder.create().texOffs(20, 154).addBox(-1.0F, -7.0F, -3.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(29, 26).addBox(-2.0F, -7.0F, 0.0F, 4.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0359F, -0.8112F, 0.0F, 0.7854F, 0.0F));

		PartDefinition handleft = lowerarmleft.addOrReplaceChild("handleft", CubeListBuilder.create().texOffs(37, 140).addBox(1.5F, 0.0F, 0.0F, 2.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(29, 156).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(139, 40).addBox(-3.5F, 0.0F, 0.0F, 2.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.1183F, -3.4794F, 0.2182F, 0.0F, 0.0F));

		PartDefinition clawleft = handleft.addOrReplaceChild("clawleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6F, 11.8F, 0.9F, 0.0F, -0.2276F, 0.0F));

		PartDefinition claw3_r1 = clawleft.addOrReplaceChild("claw3_r1", CubeListBuilder.create().texOffs(164, 6).addBox(0.1299F, -2.648F, -1.085F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition upperarmright = chest.addOrReplaceChild("upperarmright", CubeListBuilder.create(), PartPose.offsetAndRotation(-13.5F, 23.1919F, -4.1476F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r143 = upperarmright.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(32, 126).addBox(-0.5F, -1.8639F, -1.7769F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6215F, 4.4857F, -0.6433F, 1.4427F, 0.4042F, -0.0118F));

		PartDefinition cube_r144 = upperarmright.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(124, 169).addBox(-0.5F, -2.3559F, -3.0392F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.6215F, 4.4857F, -0.6433F, 2.1583F, 0.4042F, -0.0118F));

		PartDefinition cube_r145 = upperarmright.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(128, 76).addBox(-0.9078F, -2.9193F, 0.308F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0922F, 6.4992F, 1.1306F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r146 = upperarmright.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(71, 86).addBox(-0.9078F, -2.0965F, -5.5265F, 4.0F, 3.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(108, 125).addBox(-0.9078F, -3.0965F, -8.5265F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0922F, 9.4992F, 0.6306F, 1.5708F, 0.0F, 0.0F));

		PartDefinition lowerarmright = upperarmright.addOrReplaceChild("lowerarmright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.8835F, 0.2553F, -0.7413F, 0.0015F, 0.0061F));

		PartDefinition arm5_r1 = lowerarmright.addOrReplaceChild("arm5_r1", CubeListBuilder.create().texOffs(11, 152).addBox(-1.0F, -7.0F, -3.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(1, 26).addBox(-2.0F, -7.0F, 0.0F, 4.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0359F, -0.8112F, 0.0F, -0.7854F, 0.0F));

		PartDefinition handright = lowerarmright.addOrReplaceChild("handright", CubeListBuilder.create().texOffs(66, 138).addBox(-3.5F, 0.0F, 0.0F, 2.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(111, 84).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 138).addBox(1.5F, 0.0F, 0.0F, 2.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.1183F, -3.4794F, 1.0036F, 0.0F, 0.0F));

		PartDefinition clawright = handright.addOrReplaceChild("clawright", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6F, 11.8F, 0.9F, 0.0F, 0.2276F, 0.0F));

		PartDefinition claw4_r1 = clawright.addOrReplaceChild("claw4_r1", CubeListBuilder.create().texOffs(163, 87).addBox(-4.1299F, -2.648F, -1.085F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.6109F));

		return LayerDefinition.create(meshdefinition, 183, 210);
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