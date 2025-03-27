package fossils.fossils.client.blockentity.model.placerias;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlaceriasFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart body1;
	private final ModelPart chest1;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart neck1;
	private final ModelPart head1;
	private final ModelPart head2;
	private final ModelPart beak1;
	private final ModelPart beak2;
	private final ModelPart beak3;
	private final ModelPart beak4;
	private final ModelPart tusk1;
	private final ModelPart fronttusk1;
	private final ModelPart tusk3;
	private final ModelPart fronttusk3;
	private final ModelPart tusk2;
	private final ModelPart fronttusk2;
	private final ModelPart jaw1;
	private final ModelPart lowerbeak1;
	private final ModelPart lowerbeak2;
	private final ModelPart basin1;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart tail1;
	private final ModelPart tail2;

	public PlaceriasFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.body1 = this.root.getChild("body1");
		this.chest1 = this.body1.getChild("chest1");
		this.upperarm1 = this.chest1.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.chest1.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.neck1 = this.chest1.getChild("neck1");
		this.head1 = this.neck1.getChild("head1");
		this.head2 = this.head1.getChild("head2");
		this.beak1 = this.head2.getChild("beak1");
		this.beak2 = this.beak1.getChild("beak2");
		this.beak3 = this.beak2.getChild("beak3");
		this.beak4 = this.beak3.getChild("beak4");
		this.tusk1 = this.beak1.getChild("tusk1");
		this.fronttusk1 = this.tusk1.getChild("fronttusk1");
		this.tusk3 = this.beak1.getChild("tusk3");
		this.fronttusk3 = this.tusk3.getChild("fronttusk3");
		this.tusk2 = this.beak1.getChild("tusk2");
		this.fronttusk2 = this.tusk2.getChild("fronttusk2");
		this.jaw1 = this.head2.getChild("jaw1");
		this.lowerbeak1 = this.jaw1.getChild("lowerbeak1");
		this.lowerbeak2 = this.lowerbeak1.getChild("lowerbeak2");
		this.basin1 = this.body1.getChild("basin1");
		this.upperleg1 = this.basin1.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.basin1.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.tail1 = this.basin1.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 6.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition body1 = root.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.9F, -1.7F, -0.0456F, 0.0F, 0.0F));

		PartDefinition body8_r1 = body1.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(12, 18).addBox(0.0F, -4.0179F, 2.152F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 41).addBox(0.0F, -3.8179F, 0.152F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2932F, 6.2988F, -0.3142F, 0.0F, 0.0F));

		PartDefinition body6_r1 = body1.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(31, 41).addBox(0.0F, -4.0671F, 0.0064F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2932F, 4.2988F, -0.384F, 0.0F, 0.0F));

		PartDefinition body5_r1 = body1.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(54, 84).addBox(0.0F, -4.91F, 2.006F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 99).addBox(0.0F, -4.41F, 0.006F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.6932F, 0.0988F, -0.4189F, 0.0F, 0.0F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(92, 99).addBox(0.0F, -4.4301F, 0.1049F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.7932F, -2.0012F, -0.3665F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(16, 100).addBox(0.0F, -4.3287F, -0.0055F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.7932F, -3.9012F, -0.2443F, 0.0F, 0.0F));

		PartDefinition body1_r1 = body1.addOrReplaceChild("body1_r1", CubeListBuilder.create().texOffs(0, 18).addBox(-0.9F, -0.1931F, -0.0895F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6769F, -4.8245F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck12_r1 = body1.addOrReplaceChild("neck12_r1", CubeListBuilder.create().texOffs(100, 93).mirror().addBox(-1.806F, 0.0485F, -0.4965F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1231F, -1.5245F, 0.1213F, 0.048F, -0.2411F));

		PartDefinition neck13_r1 = body1.addOrReplaceChild("neck13_r1", CubeListBuilder.create().texOffs(83, 49).mirror().addBox(-5.5492F, -0.9294F, -0.4965F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1231F, -1.5245F, 0.0767F, 0.1057F, -0.8072F));

		PartDefinition neck14_r1 = body1.addOrReplaceChild("neck14_r1", CubeListBuilder.create().texOffs(36, 2).mirror().addBox(-14.6158F, -3.1791F, -0.4965F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1231F, -1.5245F, 0.0247F, 0.1281F, -1.246F));

		PartDefinition neck13_r2 = body1.addOrReplaceChild("neck13_r2", CubeListBuilder.create().texOffs(33, 100).mirror().addBox(-1.806F, 0.0485F, -0.4965F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2231F, 0.4755F, 0.1298F, 0.0503F, -0.2407F));

		PartDefinition neck14_r2 = body1.addOrReplaceChild("neck14_r2", CubeListBuilder.create().texOffs(93, 59).mirror().addBox(-5.5493F, -0.9294F, -0.4965F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2231F, 0.4755F, 0.0826F, 0.1121F, -0.8065F));

		PartDefinition neck15_r1 = body1.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(40, 17).mirror().addBox(-11.6159F, -3.1791F, -0.4965F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2231F, 0.4755F, 0.0273F, 0.1364F, -1.2456F));

		PartDefinition neck17_r1 = body1.addOrReplaceChild("neck17_r1", CubeListBuilder.create().texOffs(101, 38).mirror().addBox(-1.8219F, 0.0909F, -0.4977F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.7231F, 8.3755F, 0.0117F, 0.0188F, -0.4717F));

		PartDefinition neck18_r1 = body1.addOrReplaceChild("neck18_r1", CubeListBuilder.create().texOffs(98, 63).mirror().addBox(-5.5854F, -0.9022F, -0.4977F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.7231F, 8.3755F, -0.0003F, 0.0221F, -1.039F));

		PartDefinition neck16_r1 = body1.addOrReplaceChild("neck16_r1", CubeListBuilder.create().texOffs(40, 100).mirror().addBox(-1.8133F, 0.0718F, -0.4982F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.7231F, 6.3755F, 0.0538F, 0.0301F, -0.3659F));

		PartDefinition neck17_r2 = body1.addOrReplaceChild("neck17_r2", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(-5.5679F, -0.9138F, -0.4982F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.7231F, 6.3755F, 0.0292F, 0.0543F, -0.9332F));

		PartDefinition neck18_r2 = body1.addOrReplaceChild("neck18_r2", CubeListBuilder.create().texOffs(100, 86).mirror().addBox(-6.6394F, -3.1728F, -0.4982F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.7231F, 6.3755F, 0.0035F, 0.0616F, -1.3702F));

		PartDefinition neck15_r2 = body1.addOrReplaceChild("neck15_r2", CubeListBuilder.create().texOffs(27, 29).mirror().addBox(-1.8109F, 0.0652F, -0.4985F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.4231F, 4.3755F, 0.1044F, 0.0436F, -0.3291F));

		PartDefinition neck16_r2 = body1.addOrReplaceChild("neck16_r2", CubeListBuilder.create().texOffs(79, 97).mirror().addBox(-5.5623F, -0.9181F, -0.4985F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.4231F, 4.3755F, 0.0648F, 0.0928F, -0.8956F));

		PartDefinition neck17_r3 = body1.addOrReplaceChild("neck17_r3", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-8.6325F, -3.1743F, -0.4985F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.4231F, 4.3755F, 0.0194F, 0.1115F, -1.3339F));

		PartDefinition neck14_r3 = body1.addOrReplaceChild("neck14_r3", CubeListBuilder.create().texOffs(39, 41).mirror().addBox(-1.8069F, 0.0519F, -0.497F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.4231F, 2.4755F, 0.1382F, 0.0525F, -0.2577F));

		PartDefinition neck15_r3 = body1.addOrReplaceChild("neck15_r3", CubeListBuilder.create().texOffs(32, 98).mirror().addBox(-5.5518F, -0.9271F, -0.497F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.4231F, 2.4755F, 0.0886F, 0.1185F, -0.8233F));

		PartDefinition neck16_r3 = body1.addOrReplaceChild("neck16_r3", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-9.6191F, -3.178F, -0.497F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.4231F, 2.4755F, 0.03F, 0.1448F, -1.2627F));

		PartDefinition neck11_r1 = body1.addOrReplaceChild("neck11_r1", CubeListBuilder.create().texOffs(100, 88).mirror().addBox(-1.8052F, 0.0452F, -0.4958F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0231F, -3.5245F, 0.1551F, 0.0569F, -0.2219F));

		PartDefinition neck12_r2 = body1.addOrReplaceChild("neck12_r2", CubeListBuilder.create().texOffs(98, 61).mirror().addBox(-5.5468F, -0.9318F, -0.4958F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0231F, -3.5245F, 0.1006F, 0.1313F, -0.7869F));

		PartDefinition neck13_r3 = body1.addOrReplaceChild("neck13_r3", CubeListBuilder.create().texOffs(58, 49).mirror().addBox(-15.6126F, -3.1802F, -0.4958F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0231F, -3.5245F, 0.0354F, 0.1614F, -1.227F));

		PartDefinition neck17_r4 = body1.addOrReplaceChild("neck17_r4", CubeListBuilder.create().texOffs(98, 63).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.7231F, 8.3755F, -0.0003F, -0.0221F, 1.039F));

		PartDefinition neck16_r4 = body1.addOrReplaceChild("neck16_r4", CubeListBuilder.create().texOffs(101, 38).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.7231F, 8.3755F, 0.0117F, -0.0188F, 0.4717F));

		PartDefinition neck17_r5 = body1.addOrReplaceChild("neck17_r5", CubeListBuilder.create().texOffs(100, 86).addBox(4.6791F, -3.3688F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.7231F, 6.3755F, 0.0035F, -0.0616F, 1.3702F));

		PartDefinition neck16_r5 = body1.addOrReplaceChild("neck16_r5", CubeListBuilder.create().texOffs(95, 0).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.7231F, 6.3755F, 0.0292F, -0.0543F, 0.9332F));

		PartDefinition neck15_r4 = body1.addOrReplaceChild("neck15_r4", CubeListBuilder.create().texOffs(40, 100).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.7231F, 6.3755F, 0.0538F, -0.0301F, 0.3659F));

		PartDefinition neck16_r6 = body1.addOrReplaceChild("neck16_r6", CubeListBuilder.create().texOffs(0, 98).addBox(4.6791F, -3.3688F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.4231F, 4.3755F, 0.0194F, -0.1115F, 1.3339F));

		PartDefinition neck15_r5 = body1.addOrReplaceChild("neck15_r5", CubeListBuilder.create().texOffs(79, 97).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.4231F, 4.3755F, 0.0648F, -0.0928F, 0.8956F));

		PartDefinition neck14_r4 = body1.addOrReplaceChild("neck14_r4", CubeListBuilder.create().texOffs(27, 29).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.4231F, 4.3755F, 0.1044F, -0.0436F, 0.3291F));

		PartDefinition neck15_r6 = body1.addOrReplaceChild("neck15_r6", CubeListBuilder.create().texOffs(0, 29).addBox(4.6791F, -3.3688F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.4231F, 2.4755F, 0.03F, -0.1448F, 1.2627F));

		PartDefinition neck14_r5 = body1.addOrReplaceChild("neck14_r5", CubeListBuilder.create().texOffs(32, 98).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.4231F, 2.4755F, 0.0886F, -0.1185F, 0.8233F));

		PartDefinition neck13_r4 = body1.addOrReplaceChild("neck13_r4", CubeListBuilder.create().texOffs(39, 41).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.4231F, 2.4755F, 0.1382F, -0.0525F, 0.2577F));

		PartDefinition neck14_r6 = body1.addOrReplaceChild("neck14_r6", CubeListBuilder.create().texOffs(40, 17).addBox(4.6791F, -3.3688F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2231F, 0.4755F, 0.0273F, -0.1364F, 1.2456F));

		PartDefinition neck13_r5 = body1.addOrReplaceChild("neck13_r5", CubeListBuilder.create().texOffs(93, 59).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2231F, 0.4755F, 0.0826F, -0.1121F, 0.8065F));

		PartDefinition neck12_r3 = body1.addOrReplaceChild("neck12_r3", CubeListBuilder.create().texOffs(33, 100).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2231F, 0.4755F, 0.1298F, -0.0503F, 0.2407F));

		PartDefinition neck13_r6 = body1.addOrReplaceChild("neck13_r6", CubeListBuilder.create().texOffs(36, 2).addBox(4.6791F, -3.3688F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1231F, -1.5245F, 0.0247F, -0.1281F, 1.246F));

		PartDefinition neck12_r4 = body1.addOrReplaceChild("neck12_r4", CubeListBuilder.create().texOffs(83, 49).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1231F, -1.5245F, 0.0767F, -0.1057F, 0.8072F));

		PartDefinition neck11_r2 = body1.addOrReplaceChild("neck11_r2", CubeListBuilder.create().texOffs(100, 93).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1231F, -1.5245F, 0.1213F, -0.048F, 0.2411F));

		PartDefinition neck12_r5 = body1.addOrReplaceChild("neck12_r5", CubeListBuilder.create().texOffs(58, 49).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0231F, -3.5245F, 0.0354F, -0.1614F, 1.227F));

		PartDefinition neck11_r3 = body1.addOrReplaceChild("neck11_r3", CubeListBuilder.create().texOffs(98, 61).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0231F, -3.5245F, 0.1006F, -0.1313F, 0.7869F));

		PartDefinition neck10_r1 = body1.addOrReplaceChild("neck10_r1", CubeListBuilder.create().texOffs(100, 88).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0231F, -3.5245F, 0.1551F, -0.0569F, 0.2219F));

		PartDefinition chest1 = body1.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1512F, -4.7511F, 0.2182F, 0.0F, 0.0F));

		PartDefinition chest_r1 = chest1.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(28, 57).mirror().addBox(0.763F, -5.9906F, -0.9987F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.66F, 8.3651F, -17.919F, -1.144F, 0.8762F, -2.2118F));

		PartDefinition chest_r2 = chest1.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(20, 18).mirror().addBox(0.1247F, -1.2146F, -0.9377F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.66F, 8.3651F, -17.919F, 0.3341F, 1.1856F, -0.773F));

		PartDefinition chest_r3 = chest1.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(0.0638F, -0.4541F, -0.903F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.66F, 8.3651F, -17.919F, 1.0492F, 0.0912F, 0.3694F));

		PartDefinition chest_r4 = chest1.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(2.1518F, -5.0246F, 0.4449F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7F, 13.1347F, -12.1044F, 1.1669F, 0.0F, 0.0822F));

		PartDefinition chest_r5 = chest1.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.4595F, -2.0343F, -5.4464F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0243F, 5.7681F, -14.1948F, 1.2754F, -0.4137F, -0.5237F));

		PartDefinition chest_r6 = chest1.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(90, 34).mirror().addBox(-1.9763F, -2.3126F, -2.6082F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6707F, 4.2275F, -11.8783F, 1.08F, -0.1166F, 0.1848F));

		PartDefinition chest_r7 = chest1.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.8386F, -3.7428F, -0.9843F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6707F, 3.0275F, -10.7783F, 1.0676F, -0.0122F, 0.3769F));

		PartDefinition chest_r8 = chest1.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(0, 18).addBox(0.8386F, -3.7428F, -0.9843F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6707F, 3.0275F, -10.7783F, 1.0676F, 0.0122F, -0.3769F));

		PartDefinition chest_r9 = chest1.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0638F, -0.4541F, -0.903F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.66F, 8.3651F, -17.919F, 1.0492F, -0.0912F, -0.3694F));

		PartDefinition chest_r10 = chest1.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(20, 18).addBox(-1.1247F, -1.2146F, -0.9377F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.66F, 8.3651F, -17.919F, 0.3341F, -1.1856F, 0.773F));

		PartDefinition chest_r11 = chest1.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(28, 57).addBox(-1.763F, -5.9906F, -0.9987F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.66F, 8.3651F, -17.919F, -1.144F, -0.8762F, 2.2118F));

		PartDefinition chest_r12 = chest1.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(0, 0).addBox(0.4595F, -2.0343F, -5.4464F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0243F, 5.7681F, -14.1948F, 1.2754F, 0.4137F, 0.5237F));

		PartDefinition chest_r13 = chest1.addOrReplaceChild("chest_r13", CubeListBuilder.create().texOffs(90, 34).addBox(0.9763F, -2.3126F, -2.6082F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6707F, 4.2275F, -11.8783F, 1.08F, 0.1166F, -0.1848F));

		PartDefinition chest_r14 = chest1.addOrReplaceChild("chest_r14", CubeListBuilder.create().texOffs(0, 36).addBox(-5.1518F, -5.0246F, 0.4449F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7F, 13.1347F, -12.1044F, 1.1669F, 0.0F, -0.0822F));

		PartDefinition chest2_r1 = chest1.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(41, 64).addBox(-0.9F, 0.1316F, -5.7115F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.9039F, -0.0922F, -0.0698F, 0.0F, 0.0F));

		PartDefinition chest8_r1 = chest1.addOrReplaceChild("chest8_r1", CubeListBuilder.create().texOffs(95, 99).addBox(0.0F, -4.1735F, -0.0191F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.7621F, -1.1418F, -0.3403F, 0.0F, 0.0F));

		PartDefinition chest7_r1 = chest1.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(98, 99).addBox(0.0F, -2.8F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -2.2621F, -2.2418F, -0.3229F, 0.0F, 0.0F));

		PartDefinition chest6_r1 = chest1.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(13, 100).addBox(0.0F, -2.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -2.729F, -4.1866F, -0.2793F, 0.0F, 0.0F));

		PartDefinition chest5_r1 = chest1.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(0, 100).addBox(0.0F, -7.5498F, 5.9984F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(10, 99).addBox(0.0F, -6.9498F, 3.9984F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(33, 57).addBox(0.0F, -6.1498F, 1.9984F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(89, 98).addBox(0.0F, -5.2498F, -0.0016F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 0.3919F, -13.6757F, -0.2356F, 0.0F, 0.0F));

		PartDefinition chest1_r1 = chest1.addOrReplaceChild("chest1_r1", CubeListBuilder.create().texOffs(0, 36).addBox(-0.9F, -0.1538F, -9.0051F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.0039F, -5.7922F, 0.2007F, 0.0F, 0.0F));

		PartDefinition neck17_r6 = chest1.addOrReplaceChild("neck17_r6", CubeListBuilder.create().texOffs(45, 22).mirror().addBox(-15.6258F, -3.176F, -0.4973F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.044F, -6.7652F, 0.0009F, 0.0532F, -1.3005F));

		PartDefinition neck16_r7 = chest1.addOrReplaceChild("neck16_r7", CubeListBuilder.create().texOffs(36, 68).mirror().addBox(-5.557F, -0.9225F, -0.4973F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.044F, -6.7652F, 0.0233F, 0.0479F, -0.8636F));

		PartDefinition neck20_r1 = chest1.addOrReplaceChild("neck20_r1", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-10.6613F, -3.1696F, -0.5038F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.244F, -12.7652F, 0.0327F, 0.1531F, -1.4805F));

		PartDefinition neck19_r1 = chest1.addOrReplaceChild("neck19_r1", CubeListBuilder.create().texOffs(40, 19).mirror().addBox(-5.5865F, -0.9016F, -0.5038F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.244F, -12.7652F, 0.0946F, 0.1249F, -1.0408F));

		PartDefinition neck18_r3 = chest1.addOrReplaceChild("neck18_r3", CubeListBuilder.create().texOffs(73, 36).mirror().addBox(-1.8224F, 0.092F, -0.5038F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.244F, -12.7652F, 0.1467F, 0.0547F, -0.4754F));

		PartDefinition neck19_r2 = chest1.addOrReplaceChild("neck19_r2", CubeListBuilder.create().texOffs(14, 36).mirror().addBox(-12.6412F, -3.1724F, -0.504F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.044F, -10.7652F, 0.0387F, 0.0954F, -1.379F));

		PartDefinition neck18_r4 = chest1.addOrReplaceChild("neck18_r4", CubeListBuilder.create().texOffs(58, 51).mirror().addBox(-5.5694F, -0.9127F, -0.504F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.044F, -10.7652F, 0.0754F, 0.0701F, -0.9418F));

		PartDefinition neck17_r7 = chest1.addOrReplaceChild("neck17_r7", CubeListBuilder.create().texOffs(75, 20).mirror().addBox(-1.814F, 0.0735F, -0.504F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.044F, -10.7652F, 0.1013F, 0.0187F, -0.3763F));

		PartDefinition neck16_r8 = chest1.addOrReplaceChild("neck16_r8", CubeListBuilder.create().texOffs(32, 75).mirror().addBox(-1.8109F, 0.0652F, -0.4979F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.744F, -8.7652F, 0.0623F, 0.0323F, -0.3307F));

		PartDefinition neck17_r8 = chest1.addOrReplaceChild("neck17_r8", CubeListBuilder.create().texOffs(52, 67).mirror().addBox(-5.5624F, -0.918F, -0.4979F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.744F, -8.7652F, 0.0351F, 0.0607F, -0.8979F));

		PartDefinition neck18_r5 = chest1.addOrReplaceChild("neck18_r5", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-14.6326F, -3.1743F, -0.4979F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.744F, -8.7652F, 0.0061F, 0.0699F, -1.3351F));

		PartDefinition neck15_r7 = chest1.addOrReplaceChild("neck15_r7", CubeListBuilder.create().texOffs(80, 65).mirror().addBox(-1.8088F, 0.0586F, -0.4973F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.044F, -6.7652F, 0.0454F, 0.0278F, -0.2963F));

		PartDefinition neck14_r7 = chest1.addOrReplaceChild("neck14_r7", CubeListBuilder.create().texOffs(90, 32).mirror().addBox(-1.8069F, 0.0519F, -0.497F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.044F, -4.7652F, 0.0032F, 0.0165F, -0.2624F));

		PartDefinition neck15_r8 = chest1.addOrReplaceChild("neck15_r8", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(-5.5518F, -0.9271F, -0.497F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.044F, -4.7652F, -0.0062F, 0.0157F, -0.8297F));

		PartDefinition neck16_r9 = chest1.addOrReplaceChild("neck16_r9", CubeListBuilder.create().texOffs(54, 40).mirror().addBox(-15.6191F, -3.178F, -0.497F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.044F, -4.7652F, -0.0122F, 0.0116F, -1.266F));

		PartDefinition neck13_r7 = chest1.addOrReplaceChild("neck13_r7", CubeListBuilder.create().texOffs(19, 100).mirror().addBox(-1.806F, 0.0485F, -0.497F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.044F, -2.7652F, -0.0136F, 0.012F, -0.2452F));

		PartDefinition neck14_r8 = chest1.addOrReplaceChild("neck14_r8", CubeListBuilder.create().texOffs(80, 25).mirror().addBox(-5.5492F, -0.9295F, -0.497F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.044F, -2.7652F, -0.0179F, 0.0028F, -0.8123F));

		PartDefinition neck15_r9 = chest1.addOrReplaceChild("neck15_r9", CubeListBuilder.create().texOffs(56, 24).mirror().addBox(-15.6158F, -3.1791F, -0.497F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.044F, -2.7652F, -0.0175F, -0.005F, -1.2486F));

		PartDefinition neck12_r6 = chest1.addOrReplaceChild("neck12_r6", CubeListBuilder.create().texOffs(26, 100).mirror().addBox(-1.8052F, 0.0451F, -0.497F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.044F, -0.7652F, -0.0136F, 0.012F, -0.2277F));

		PartDefinition neck13_r8 = chest1.addOrReplaceChild("neck13_r8", CubeListBuilder.create().texOffs(82, 27).mirror().addBox(-5.5467F, -0.9319F, -0.497F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.044F, -0.7652F, -0.0179F, 0.0028F, -0.7949F));

		PartDefinition neck14_r9 = chest1.addOrReplaceChild("neck14_r9", CubeListBuilder.create().texOffs(56, 26).mirror().addBox(-15.6125F, -3.1802F, -0.497F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.044F, -0.7652F, -0.0175F, -0.005F, -1.2311F));

		PartDefinition neck17_r9 = chest1.addOrReplaceChild("neck17_r9", CubeListBuilder.create().texOffs(73, 36).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.244F, -12.7652F, 0.1467F, -0.0547F, 0.4754F));

		PartDefinition neck18_r6 = chest1.addOrReplaceChild("neck18_r6", CubeListBuilder.create().texOffs(40, 19).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.244F, -12.7652F, 0.0946F, -0.1249F, 1.0408F));

		PartDefinition neck19_r3 = chest1.addOrReplaceChild("neck19_r3", CubeListBuilder.create().texOffs(0, 13).addBox(4.6791F, -3.3688F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.244F, -12.7652F, 0.0327F, -0.1531F, 1.4805F));

		PartDefinition neck16_r10 = chest1.addOrReplaceChild("neck16_r10", CubeListBuilder.create().texOffs(75, 20).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.044F, -10.7652F, 0.1013F, -0.0187F, 0.3763F));

		PartDefinition neck17_r10 = chest1.addOrReplaceChild("neck17_r10", CubeListBuilder.create().texOffs(58, 51).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.044F, -10.7652F, 0.0754F, -0.0701F, 0.9418F));

		PartDefinition neck18_r7 = chest1.addOrReplaceChild("neck18_r7", CubeListBuilder.create().texOffs(14, 36).addBox(4.6791F, -3.3688F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.044F, -10.7652F, 0.0387F, -0.0954F, 1.379F));

		PartDefinition neck17_r11 = chest1.addOrReplaceChild("neck17_r11", CubeListBuilder.create().texOffs(36, 0).addBox(4.6791F, -3.3688F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.744F, -8.7652F, 0.0061F, -0.0699F, 1.3351F));

		PartDefinition neck16_r11 = chest1.addOrReplaceChild("neck16_r11", CubeListBuilder.create().texOffs(52, 67).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.744F, -8.7652F, 0.0351F, -0.0607F, 0.8979F));

		PartDefinition neck15_r10 = chest1.addOrReplaceChild("neck15_r10", CubeListBuilder.create().texOffs(32, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.744F, -8.7652F, 0.0623F, -0.0323F, 0.3307F));

		PartDefinition neck16_r12 = chest1.addOrReplaceChild("neck16_r12", CubeListBuilder.create().texOffs(45, 22).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.044F, -6.7652F, 0.0009F, -0.0532F, 1.3005F));

		PartDefinition neck15_r11 = chest1.addOrReplaceChild("neck15_r11", CubeListBuilder.create().texOffs(36, 68).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.044F, -6.7652F, 0.0233F, -0.0479F, 0.8636F));

		PartDefinition neck14_r10 = chest1.addOrReplaceChild("neck14_r10", CubeListBuilder.create().texOffs(80, 65).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.044F, -6.7652F, 0.0454F, -0.0278F, 0.2963F));

		PartDefinition neck15_r12 = chest1.addOrReplaceChild("neck15_r12", CubeListBuilder.create().texOffs(54, 40).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.044F, -4.7652F, -0.0122F, -0.0116F, 1.266F));

		PartDefinition neck14_r11 = chest1.addOrReplaceChild("neck14_r11", CubeListBuilder.create().texOffs(69, 51).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.044F, -4.7652F, -0.0062F, -0.0157F, 0.8297F));

		PartDefinition neck13_r9 = chest1.addOrReplaceChild("neck13_r9", CubeListBuilder.create().texOffs(90, 32).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.044F, -4.7652F, 0.0032F, -0.0165F, 0.2624F));

		PartDefinition neck14_r12 = chest1.addOrReplaceChild("neck14_r12", CubeListBuilder.create().texOffs(56, 24).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.044F, -2.7652F, -0.0175F, 0.005F, 1.2486F));

		PartDefinition neck13_r10 = chest1.addOrReplaceChild("neck13_r10", CubeListBuilder.create().texOffs(80, 25).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.044F, -2.7652F, -0.0179F, -0.0028F, 0.8123F));

		PartDefinition neck12_r7 = chest1.addOrReplaceChild("neck12_r7", CubeListBuilder.create().texOffs(19, 100).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.044F, -2.7652F, -0.0136F, -0.012F, 0.2452F));

		PartDefinition neck13_r11 = chest1.addOrReplaceChild("neck13_r11", CubeListBuilder.create().texOffs(56, 26).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.044F, -0.7652F, -0.0175F, 0.005F, 1.2311F));

		PartDefinition neck12_r8 = chest1.addOrReplaceChild("neck12_r8", CubeListBuilder.create().texOffs(82, 27).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.044F, -0.7652F, -0.0179F, -0.0028F, 0.7949F));

		PartDefinition neck11_r4 = chest1.addOrReplaceChild("neck11_r4", CubeListBuilder.create().texOffs(26, 100).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.044F, -0.7652F, -0.0136F, -0.012F, 0.2277F));

		PartDefinition upperarm1 = chest1.addOrReplaceChild("upperarm1", CubeListBuilder.create().texOffs(58, 67).addBox(-1.187F, -1.2195F, -2.4098F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(93, 53).addBox(-1.187F, 2.7805F, -1.4098F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(81, 30).addBox(-1.187F, 4.7805F, -1.9098F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, 9.9124F, -14.521F, 0.7531F, 0.0F, -0.6374F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1698F, 8.7583F, 0.8645F, -0.747F, 0.1776F, 0.6672F));

		PartDefinition lowerarm4_r1 = lowerarm1.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(5, 48).addBox(-0.5028F, -5.4287F, 0.0764F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(89, 42).addBox(-1.5028F, -2.4287F, -0.5236F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(43, 92).addBox(-1.0028F, 0.5713F, -0.0236F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5319F, 1.9572F, -0.1557F, -0.3572F, 1.2533F, -0.2064F));

		PartDefinition lowerarm2_r1 = lowerarm1.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(97, 79).addBox(-0.9959F, -0.253F, -2.5242F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-0.4959F, 1.747F, -2.0242F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5319F, 1.9572F, -0.1557F, -0.2438F, 1.2533F, -0.2064F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5421F, 8.0269F, -1.4569F, 1.2216F, -0.0234F, 0.0077F));

		PartDefinition hand2_r1 = hand1.addOrReplaceChild("hand2_r1", CubeListBuilder.create().texOffs(20, 69).addBox(-3.0F, -1.9081F, -3.3012F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.554F, 3.2812F, -2.4371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand2_r2 = hand1.addOrReplaceChild("hand2_r2", CubeListBuilder.create().texOffs(80, 20).addBox(-2.9652F, -0.844F, -0.1182F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5193F, 2.0518F, -2.7835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand2_r3 = hand1.addOrReplaceChild("hand2_r3", CubeListBuilder.create().texOffs(70, 80).addBox(-1.0F, 0.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.446F, 0.4068F, -0.5623F, 0.481F, 0.3133F, -0.5334F));

		PartDefinition hand2_r4 = hand1.addOrReplaceChild("hand2_r4", CubeListBuilder.create().texOffs(48, 73).addBox(-1.0F, -0.1F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.754F, 0.4068F, -0.5623F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition hand1_r1 = hand1.addOrReplaceChild("hand1_r1", CubeListBuilder.create().texOffs(99, 25).addBox(1.1F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.446F, 0.4068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm2 = chest1.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(5, 67).addBox(-0.813F, -1.2195F, -2.4098F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(92, 87).addBox(-0.813F, 2.7805F, -1.4098F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(61, 80).addBox(-0.813F, 4.7805F, -1.9098F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9F, 9.9124F, -14.521F, -0.3377F, 0.0F, 0.6374F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1698F, 8.7583F, 0.8645F, -0.451F, -0.1179F, -0.6028F));

		PartDefinition lowerarm5_r1 = lowerarm2.addOrReplaceChild("lowerarm5_r1", CubeListBuilder.create().texOffs(45, 46).addBox(-0.5972F, -5.5287F, 0.0764F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(54, 88).addBox(-1.5972F, -2.5287F, -0.5236F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(12, 92).addBox(-1.0972F, 0.4713F, -0.0236F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(72, 97).addBox(-1.1041F, -0.353F, -2.5242F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.6041F, 1.647F, -2.0242F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0319F, 2.2572F, 0.0443F, -0.2438F, -1.2534F, 0.2064F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5421F, 8.0269F, -1.4569F, 0.873F, -0.0383F, -0.0694F));

		PartDefinition hand3_r1 = hand2.addOrReplaceChild("hand3_r1", CubeListBuilder.create().texOffs(66, 28).addBox(-3.0F, -1.9081F, -3.3012F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.554F, 3.2812F, -2.4371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand3_r2 = hand2.addOrReplaceChild("hand3_r2", CubeListBuilder.create().texOffs(79, 51).addBox(-3.0348F, -0.844F, -0.1182F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5193F, 2.0518F, -2.7835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand3_r3 = hand2.addOrReplaceChild("hand3_r3", CubeListBuilder.create().texOffs(79, 45).addBox(-1.0F, 0.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.446F, 0.4068F, -0.5623F, 0.481F, -0.3133F, 0.5334F));

		PartDefinition hand3_r4 = hand2.addOrReplaceChild("hand3_r4", CubeListBuilder.create().texOffs(20, 29).addBox(-1.0F, -0.1F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.754F, 0.4068F, -0.5623F, 0.532F, 0.2071F, -0.3361F));

		PartDefinition hand2_r5 = hand2.addOrReplaceChild("hand2_r5", CubeListBuilder.create().texOffs(98, 73).addBox(-3.1F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.446F, 0.4068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3101F, -14.483F, -0.0873F, -0.3054F, 0.0F));

		PartDefinition neck5_r1 = neck1.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(81, 99).addBox(0.0F, -7.0829F, 5.7611F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 80).addBox(0.0F, -6.1829F, 3.7611F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 100).addBox(0.0F, -5.3829F, 1.7611F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 100).addBox(0.0F, -4.3829F, -0.2389F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.1083F, -6.8073F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(38, 5).addBox(-1.0F, -0.5213F, 0.0555F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.5006F, -8.8397F, 0.0785F, 0.0F, 0.0F));

		PartDefinition neck23_r1 = neck1.addOrReplaceChild("neck23_r1", CubeListBuilder.create().texOffs(52, 4).mirror().addBox(-3.6346F, -0.8851F, -0.5371F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.8338F, -6.2822F, 0.3398F, 0.4946F, -1.2698F));

		PartDefinition neck22_r1 = neck1.addOrReplaceChild("neck22_r1", CubeListBuilder.create().texOffs(45, 52).mirror().addBox(-1.8542F, 0.1318F, -0.5371F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.8338F, -6.2822F, 0.5444F, 0.2452F, -0.7204F));

		PartDefinition neck22_r2 = neck1.addOrReplaceChild("neck22_r2", CubeListBuilder.create().texOffs(15, 53).mirror().addBox(-3.6076F, -0.8916F, -0.5153F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.7338F, -4.2822F, 0.2594F, 0.3857F, -1.1296F));

		PartDefinition neck21_r1 = neck1.addOrReplaceChild("neck21_r1", CubeListBuilder.create().texOffs(68, 18).mirror().addBox(-1.8349F, 0.1119F, -0.5153F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.7338F, -4.2822F, 0.4225F, 0.1907F, -0.5723F));

		PartDefinition neck20_r2 = neck1.addOrReplaceChild("neck20_r2", CubeListBuilder.create().texOffs(70, 22).mirror().addBox(-1.8224F, 0.092F, -0.5038F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.5338F, -2.2822F, 0.3824F, 0.172F, -0.4486F));

		PartDefinition neck21_r2 = neck1.addOrReplaceChild("neck21_r2", CubeListBuilder.create().texOffs(40, 35).mirror().addBox(-4.5865F, -0.9016F, -0.5038F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.5338F, -2.2822F, 0.2343F, 0.3489F, -1.0077F));

		PartDefinition neck19_r4 = neck1.addOrReplaceChild("neck19_r4", CubeListBuilder.create().texOffs(71, 6).mirror().addBox(-1.8224F, 0.092F, -0.5038F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3338F, -0.2822F, 0.2638F, 0.1141F, -0.4655F));

		PartDefinition neck20_r3 = neck1.addOrReplaceChild("neck20_r3", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-5.5865F, -0.9016F, -0.5038F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3338F, -0.2822F, 0.1625F, 0.2374F, -1.0285F));

		PartDefinition neck21_r3 = neck1.addOrReplaceChild("neck21_r3", CubeListBuilder.create().texOffs(73, 34).mirror().addBox(-6.6613F, -3.1696F, -0.5038F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3338F, -0.2822F, 0.0449F, 0.2834F, -1.4778F));

		PartDefinition neck21_r4 = neck1.addOrReplaceChild("neck21_r4", CubeListBuilder.create().texOffs(45, 52).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8338F, -6.2822F, 0.5444F, -0.2452F, 0.7204F));

		PartDefinition neck22_r3 = neck1.addOrReplaceChild("neck22_r3", CubeListBuilder.create().texOffs(52, 4).addBox(1.6868F, -1.0746F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8338F, -6.2822F, 0.3398F, -0.4946F, 1.2698F));

		PartDefinition neck20_r4 = neck1.addOrReplaceChild("neck20_r4", CubeListBuilder.create().texOffs(68, 18).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.7338F, -4.2822F, 0.4225F, -0.1907F, 0.5723F));

		PartDefinition neck21_r5 = neck1.addOrReplaceChild("neck21_r5", CubeListBuilder.create().texOffs(15, 53).addBox(1.6868F, -1.0746F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.7338F, -4.2822F, 0.2594F, -0.3857F, 1.1296F));

		PartDefinition neck20_r5 = neck1.addOrReplaceChild("neck20_r5", CubeListBuilder.create().texOffs(40, 35).addBox(1.6868F, -1.0746F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.5338F, -2.2822F, 0.2343F, -0.3489F, 1.0077F));

		PartDefinition neck19_r5 = neck1.addOrReplaceChild("neck19_r5", CubeListBuilder.create().texOffs(70, 22).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.5338F, -2.2822F, 0.3824F, -0.172F, 0.4486F));

		PartDefinition neck20_r6 = neck1.addOrReplaceChild("neck20_r6", CubeListBuilder.create().texOffs(73, 34).addBox(4.6791F, -3.3688F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.3338F, -0.2822F, 0.0449F, -0.2834F, 1.4778F));

		PartDefinition neck19_r6 = neck1.addOrReplaceChild("neck19_r6", CubeListBuilder.create().texOffs(0, 31).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.3338F, -0.2822F, 0.1625F, -0.2374F, 1.0285F));

		PartDefinition neck18_r8 = neck1.addOrReplaceChild("neck18_r8", CubeListBuilder.create().texOffs(71, 6).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.3338F, -0.2822F, 0.2638F, -0.1141F, 0.4655F));

		PartDefinition head1 = neck1.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4948F, -8.3845F, 0.0457F, -0.3051F, -0.0138F));

		PartDefinition head6_r1 = head1.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-5.0F, 0.881F, -0.0003F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 77).addBox(3.0F, 0.881F, -0.0003F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(78, 6).addBox(-3.0F, -0.119F, -0.0003F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4803F, 0.6496F, -0.3752F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head1.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(64, 0).addBox(-3.5F, 1.9F, -1.5F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(28, 41).addBox(-1.0F, -5.1F, -4.5F, 2.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0197F, -1.5504F, -0.3491F, 0.0F, 0.0F));

		PartDefinition head2_r1 = head1.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(48, 77).addBox(-2.0F, -0.0651F, -4.0846F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.549F, 0.8223F, 0.0611F, 0.0F, 0.0F));

		PartDefinition head2_r2 = head1.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(35, 73).addBox(-2.0F, -0.0181F, -3.9934F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9803F, -5.2504F, 0.8901F, 0.0F, 0.0F));

		PartDefinition head1_r1 = head1.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(90, 68).addBox(-2.0F, 0.7F, 1.2F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -6.4803F, -6.5504F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3197F, -2.4504F, 0.0822F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head2.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(-2.79F, -1.5F, -5.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(99, 40).mirror().addBox(-3.43F, -1.5F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(15, 48).mirror().addBox(-3.79F, -1.5F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(15, 58).mirror().addBox(-4.1F, -1.5F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
				.texOffs(15, 58).addBox(2.1F, -1.5F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(15, 48).addBox(2.79F, -1.5F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(15, 67).addBox(1.79F, -1.5F, -5.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(99, 40).addBox(2.43F, -1.5F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F))
				.texOffs(20, 18).addBox(-3.5F, -2.2F, -1.7F, 7.0F, 5.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.6F, -5.3F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head5_r2 = head2.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(28, 57).mirror().addBox(0.6706F, -2.4982F, 3.7216F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(89, 61).mirror().addBox(1.6706F, -2.4982F, 7.7216F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.7F, -5.1F, 0.5708F, -0.0981F, -0.0729F));

		PartDefinition head5_r3 = head2.addOrReplaceChild("head5_r3", CubeListBuilder.create().texOffs(89, 61).addBox(-3.6706F, -2.4982F, 7.7216F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.01F))
				.texOffs(28, 57).addBox(-1.6706F, -2.4982F, 3.7216F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(4.0F, 1.7F, -5.1F, 0.5708F, 0.0981F, 0.0729F));

		PartDefinition beak1 = head2.addOrReplaceChild("beak1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -6.0F, -0.0897F, 0.0F, 0.0F));

		PartDefinition beak2 = beak1.addOrReplaceChild("beak2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.1F, 2.7F, 0.3142F, 0.0F, 0.0F));

		PartDefinition beak3_r1 = beak2.addOrReplaceChild("beak3_r1", CubeListBuilder.create().texOffs(40, 24).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.0F, -7.8F, 0.1396F, 0.0F, 0.0F));

		PartDefinition beak2_r1 = beak2.addOrReplaceChild("beak2_r1", CubeListBuilder.create().texOffs(76, 70).addBox(-2.5F, 0.0236F, 0.0564F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.4F, -3.7F, 0.4014F, 0.0F, 0.0F));

		PartDefinition beak3 = beak2.addOrReplaceChild("beak3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -4.5F, 0.7629F, 0.0F, 0.0F));

		PartDefinition beak3_r2 = beak3.addOrReplaceChild("beak3_r2", CubeListBuilder.create().texOffs(79, 77).addBox(-2.0F, 0.0F, -0.1F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition beak4 = beak3.addOrReplaceChild("beak4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, -4.4F, -0.8196F, 0.0F, 0.0F));

		PartDefinition beak4_r1 = beak4.addOrReplaceChild("beak4_r1", CubeListBuilder.create().texOffs(75, 38).addBox(-2.0F, 0.1F, -1.1F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tusk1 = beak1.addOrReplaceChild("tusk1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.0F, 0.9F, -1.0846F, 0.0458F, 2.907F));

		PartDefinition tusk1_r1 = tusk1.addOrReplaceChild("tusk1_r1", CubeListBuilder.create().texOffs(71, 61).addBox(-0.9F, -0.5F, -5.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3085F, 0.0845F, 1.1634F, 0.0F, 0.0436F, 0.0F));

		PartDefinition tusk2_r1 = tusk1.addOrReplaceChild("tusk2_r1", CubeListBuilder.create().texOffs(0, 91).addBox(-0.1819F, -3.2899F, 0.2477F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.1085F, 1.3845F, -4.8366F, -1.4186F, 0.1321F, -0.1458F));

		PartDefinition fronttusk1 = tusk1.addOrReplaceChild("fronttusk1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0085F, 0.6345F, -3.1366F, 0.4508F, 0.1848F, -0.1952F));

		PartDefinition fronttusk3_r1 = fronttusk1.addOrReplaceChild("fronttusk3_r1", CubeListBuilder.create().texOffs(90, 81).addBox(-0.5F, -1.0657F, -3.7406F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, -2.031F, -1.6601F, -0.9076F, 0.0F, -0.1745F));

		PartDefinition fronttusk2_r1 = fronttusk1.addOrReplaceChild("fronttusk2_r1", CubeListBuilder.create().texOffs(91, 73).addBox(-0.5F, -0.1691F, -3.9959F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, -2.031F, -1.6601F, -1.1345F, 0.0F, -0.1745F));

		PartDefinition fronttusk1_r1 = fronttusk1.addOrReplaceChild("fronttusk1_r1", CubeListBuilder.create().texOffs(97, 32).addBox(-0.5F, -1.6F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.1F, -0.6F, -0.9163F, 0.0F, 0.0F));

		PartDefinition tusk3 = beak1.addOrReplaceChild("tusk3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 1.0F, 0.9F, -1.0846F, -0.0458F, -2.907F));

		PartDefinition tusk2_r2 = tusk3.addOrReplaceChild("tusk2_r2", CubeListBuilder.create().texOffs(71, 61).mirror().addBox(-0.1F, -0.5F, -5.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3085F, 0.0845F, 1.1634F, 0.0F, -0.0436F, 0.0F));

		PartDefinition tusk3_r1 = tusk3.addOrReplaceChild("tusk3_r1", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-1.8181F, -3.2899F, 0.2477F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.1085F, 1.3845F, -4.8366F, -1.4186F, -0.1321F, 0.1458F));

		PartDefinition fronttusk3 = tusk3.addOrReplaceChild("fronttusk3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0085F, 0.6345F, -3.1366F, 0.4508F, -0.1848F, 0.1952F));

		PartDefinition fronttusk4_r1 = fronttusk3.addOrReplaceChild("fronttusk4_r1", CubeListBuilder.create().texOffs(90, 81).mirror().addBox(-0.5F, -1.0657F, -3.7406F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -2.031F, -1.6601F, -0.9076F, 0.0F, 0.1745F));

		PartDefinition fronttusk3_r2 = fronttusk3.addOrReplaceChild("fronttusk3_r2", CubeListBuilder.create().texOffs(91, 73).mirror().addBox(-0.5F, -0.1691F, -3.9959F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -2.031F, -1.6601F, -1.1345F, 0.0F, 0.1745F));

		PartDefinition fronttusk2_r2 = fronttusk3.addOrReplaceChild("fronttusk2_r2", CubeListBuilder.create().texOffs(97, 32).mirror().addBox(-0.5F, -1.6F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.1F, -0.6F, -0.9163F, 0.0F, 0.0F));

		PartDefinition tusk2 = beak1.addOrReplaceChild("tusk2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, -0.7F, 0.9F, -1.0221F, 0.0822F, -2.5756F));

		PartDefinition fronttusk2 = tusk2.addOrReplaceChild("fronttusk2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, -0.4F, -5.1F, 0.3336F, -0.253F, -0.0157F));

		PartDefinition jaw1 = head2.addOrReplaceChild("jaw1", CubeListBuilder.create().texOffs(32, 91).addBox(1.5F, -0.5469F, -5.4725F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(32, 91).mirror().addBox(-3.5F, -0.5469F, -5.4725F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.4F, -1.3F, 0.2182F, 0.0F, 0.0F));

		PartDefinition jaw4_r1 = jaw1.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(25, 75).mirror().addBox(-0.5F, -0.0132F, -1.9763F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 75).addBox(4.5F, -0.0132F, -1.9763F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.3639F, -1.4464F, -0.3054F, 0.0F, 0.0F));

		PartDefinition jaw3_r1 = jaw1.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(21, 94).mirror().addBox(-0.5F, -2.0F, -0.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(21, 94).addBox(4.5F, -2.0F, -0.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.0F, 2.4531F, -2.3725F, 0.0873F, 0.0F, 0.0F));

		PartDefinition jaw4_r2 = jaw1.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(96, 15).mirror().addBox(-0.5F, 0.0F, -2.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(96, 15).addBox(4.5F, 0.0F, -2.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.0F, 1.9531F, 0.7007F, -1.309F, 0.0F, 0.0F));

		PartDefinition jaw3_r2 = jaw1.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(97, 20).mirror().addBox(-0.5F, -1.0F, -2.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(97, 20).addBox(4.5F, -1.0F, -2.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-3.0F, 1.8531F, 0.5275F, -0.5236F, 0.0F, 0.0F));

		PartDefinition lowerbeak1 = jaw1.addOrReplaceChild("lowerbeak1", CubeListBuilder.create().texOffs(36, 4).addBox(1.0F, -1.6809F, -2.1908F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(36, 4).mirror().addBox(-3.0F, -1.6809F, -2.1908F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1531F, -5.2725F, 0.0848F, 0.0F, 0.0F));

		PartDefinition lowerbeak2_r1 = lowerbeak1.addOrReplaceChild("lowerbeak2_r1", CubeListBuilder.create().texOffs(95, 9).mirror().addBox(-0.5F, 0.0341F, -0.038F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 9).addBox(3.5F, 0.0341F, -0.038F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -2.3F, -2.4F, 0.0524F, 0.0F, 0.0F));

		PartDefinition lowerbeak3_r1 = lowerbeak1.addOrReplaceChild("lowerbeak3_r1", CubeListBuilder.create().texOffs(94, 49).mirror().addBox(-0.5F, -0.041F, 0.0213F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(94, 49).addBox(3.5F, -0.041F, 0.0213F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, -2.4F, 0.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition lowerbeak2 = lowerbeak1.addOrReplaceChild("lowerbeak2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4F, -2.2F, -0.6981F, 0.0F, 0.0F));

		PartDefinition lowerbeak4_r1 = lowerbeak2.addOrReplaceChild("lowerbeak4_r1", CubeListBuilder.create().texOffs(85, 0).addBox(-1.5F, -2.1F, -1.3F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.074F, -1.6243F, 0.0436F, 0.0F, 0.0F));

		PartDefinition lowerbeak4_r2 = lowerbeak2.addOrReplaceChild("lowerbeak4_r2", CubeListBuilder.create().texOffs(95, 3).mirror().addBox(-1.5F, -0.6F, -0.95F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(95, 3).addBox(1.5F, -0.6F, -0.95F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -1.9F, -1.75F, -0.2182F, 0.0F, 0.0F));

		PartDefinition basin1 = body1.addOrReplaceChild("basin1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8027F, 9.7707F, -0.0911F, 0.0F, 0.0F));

		PartDefinition basin_r1 = basin1.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(90, 25).mirror().addBox(-1.7708F, -5.1323F, 3.1803F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 3.1076F, 3.4611F, -2.5307F, 0.0F, -0.4625F));

		PartDefinition basin_r2 = basin1.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(86, 11).mirror().addBox(-1.7708F, 2.0869F, 1.3724F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 3.1076F, 3.4611F, -1.309F, 0.0F, -0.4625F));

		PartDefinition basin_r3 = basin1.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(-1.7708F, -0.1848F, 0.8847F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 3.1076F, 3.4611F, -2.1206F, 0.0F, -0.4625F));

		PartDefinition basin_r4 = basin1.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-1.7708F, -5.714F, 1.1952F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 3.1076F, 3.4611F, -2.1118F, 0.0F, -0.4625F));

		PartDefinition basin_r5 = basin1.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-1.7708F, -2.2519F, -0.1067F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 3.1076F, 3.4611F, -1.5446F, 0.0F, -0.4625F));

		PartDefinition basin_r6 = basin1.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(80, 56).mirror().addBox(-1.7708F, -0.0847F, -0.0477F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, -2.9924F, 0.6611F, -0.6545F, 0.0F, 0.0F));

		PartDefinition basin_r7 = basin1.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(-1.7708F, -0.086F, 0.0141F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 8).addBox(8.2292F, -0.086F, 0.0141F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2292F, -1.8924F, 6.1611F, -1.2043F, 0.0F, 0.0F));

		PartDefinition basin_r8 = basin1.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(54, 28).mirror().addBox(-1.7708F, -1.2466F, -5.9068F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(54, 28).addBox(8.2292F, -1.2466F, -5.9068F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.2292F, 2.9076F, 3.4611F, -1.5446F, 0.0F, 0.0F));

		PartDefinition basin_r9 = basin1.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(14, 38).mirror().addBox(-1.7708F, -0.1732F, -0.0156F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(14, 38).addBox(8.2292F, -0.1732F, -0.0156F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-4.2292F, -2.8924F, 4.4611F, -0.576F, 0.0F, 0.0F));

		PartDefinition basin_r10 = basin1.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(54, 13).mirror().addBox(-4.0F, -0.1F, 2.5F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(54, 13).addBox(1.0F, -0.1F, 2.5F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.7553F, -2.1548F, -0.3665F, 0.0F, 0.0F));

		PartDefinition basin_r11 = basin1.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(80, 56).addBox(-0.2292F, -0.0847F, -0.0477F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, -2.9924F, 0.6611F, -0.6545F, 0.0F, 0.0F));

		PartDefinition basin_r12 = basin1.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(90, 25).addBox(-0.2292F, -5.1323F, 3.1803F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2292F, 3.1076F, 3.4611F, -2.5307F, 0.0F, 0.4625F));

		PartDefinition basin_r13 = basin1.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(86, 11).addBox(-0.2292F, 2.0869F, 1.3724F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, 3.1076F, 3.4611F, -1.309F, 0.0F, 0.4625F));

		PartDefinition basin_r14 = basin1.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(92, 93).addBox(-0.2292F, -0.1848F, 0.8847F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2292F, 3.1076F, 3.4611F, -2.1206F, 0.0F, 0.4625F));

		PartDefinition basin_r15 = basin1.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(15, 75).addBox(-0.2292F, -5.714F, 1.1952F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, 3.1076F, 3.4611F, -2.1118F, 0.0F, 0.4625F));

		PartDefinition basin_r16 = basin1.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(52, 0).addBox(-0.2292F, -2.2519F, -0.1067F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.2292F, 3.1076F, 3.4611F, -1.5446F, 0.0F, 0.4625F));

		PartDefinition basin5_r1 = basin1.addOrReplaceChild("basin5_r1", CubeListBuilder.create().texOffs(8, 58).addBox(0.0F, -2.746F, 0.0457F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4599F, 5.8699F, -0.384F, 0.0F, 0.0F));

		PartDefinition basin4_r1 = basin1.addOrReplaceChild("basin4_r1", CubeListBuilder.create().texOffs(47, 100).addBox(0.0F, -3.0267F, -0.0879F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.0401F, 4.0699F, -0.3142F, 0.0F, 0.0F));

		PartDefinition basin3_r1 = basin1.addOrReplaceChild("basin3_r1", CubeListBuilder.create().texOffs(5, 58).addBox(0.1F, -3.315F, 0.0211F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5259F, 2.0176F, -0.2618F, 0.0F, 0.0F));

		PartDefinition basin2_r1 = basin1.addOrReplaceChild("basin2_r1", CubeListBuilder.create().texOffs(9, 18).addBox(0.1F, -3.4726F, 0.0373F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8259F, 0.0176F, -0.2967F, 0.0F, 0.0F));

		PartDefinition basin1_r1 = basin1.addOrReplaceChild("basin1_r1", CubeListBuilder.create().texOffs(45, 46).addBox(-0.9F, -0.1726F, 0.0373F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.8259F, 0.0176F, -0.2269F, 0.0F, 0.0F));

		PartDefinition upperleg1 = basin1.addOrReplaceChild("upperleg1", CubeListBuilder.create().texOffs(30, 80).addBox(-1.0F, 3.8F, -2.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(41, 84).addBox(-1.5F, -0.2F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 4.8638F, 3.3675F, -0.131F, -0.0699F, -0.2643F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2839F, 11.1184F, -0.9447F, 0.4068F, -0.083F, 0.3154F));

		PartDefinition leg2_r1 = leg1.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(59, 95).addBox(-0.4531F, -3.8317F, 0.6108F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 85).addBox(-0.535F, -4.845F, -1.7873F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1816F, 4.2372F, 1.1145F, 1.8627F, 1.5246F, 1.7815F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0885F, 8.9576F, 0.4756F, -0.1153F, -0.0204F, -0.0277F));

		PartDefinition feet2_r1 = feet1.addOrReplaceChild("feet2_r1", CubeListBuilder.create().texOffs(58, 42).addBox(-3.1772F, -1.9865F, 0.4319F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0012F, 3.3818F, -2.718F, 0.6197F, 0.01F, -0.1073F));

		PartDefinition feet1_r1 = feet1.addOrReplaceChild("feet1_r1", CubeListBuilder.create().texOffs(62, 53).addBox(-3.1978F, -0.9966F, -1.9638F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0012F, 2.3818F, -5.018F, -0.0041F, -0.0059F, -0.0341F));

		PartDefinition upperleg2 = basin1.addOrReplaceChild("upperleg2", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, 3.8F, -2.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(14, 84).addBox(-1.5F, -0.2F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 4.8638F, 3.3675F, 0.1308F, 0.0699F, 0.2643F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2839F, 11.1184F, -0.9447F, 1.0177F, 0.083F, -0.3154F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(52, 95).addBox(-1.5098F, -3.8973F, 0.4818F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 85).addBox(-1.4578F, -4.9142F, -2.1174F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1816F, 4.2372F, 1.1145F, 1.8627F, -1.5246F, -1.7815F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0885F, 8.9576F, 0.4756F, 0.6701F, 0.0204F, 0.0277F));

		PartDefinition feet3_r1 = feet2.addOrReplaceChild("feet3_r1", CubeListBuilder.create().texOffs(39, 57).addBox(-2.8228F, -1.9865F, 0.4319F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0012F, 3.3818F, -2.718F, 0.6197F, -0.01F, 0.1073F));

		PartDefinition feet2_r2 = feet2.addOrReplaceChild("feet2_r2", CubeListBuilder.create().texOffs(56, 60).addBox(-2.8022F, -0.9966F, -1.9638F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0012F, 2.3818F, -5.018F, -0.0041F, 0.0059F, 0.0341F));

		PartDefinition tail1 = basin1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(67, 71).addBox(-0.5F, -0.7694F, -0.4012F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(35, 14).addBox(0.0F, -2.7694F, -0.4012F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5174F, 7.4848F, -0.5654F, 0.1478F, -0.0932F));

		PartDefinition tail4_r1 = tail1.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(39, 57).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7694F, 3.5988F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail3_r1 = tail1.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(5, 67).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7694F, 1.5988F, -0.1571F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(77, 12).addBox(-0.5F, -0.5625F, -0.0772F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.2369F, 5.3875F, -0.2589F, 0.2111F, -0.0555F));

		PartDefinition tail5_r1 = tail2.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(20, 0).addBox(0.0F, -1.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 0).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 30).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5625F, -0.0772F, -0.1222F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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