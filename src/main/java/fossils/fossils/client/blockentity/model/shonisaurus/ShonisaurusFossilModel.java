package fossils.fossils.client.blockentity.model.shonisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ShonisaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart tailbase1;
	private final ModelPart tail1;
	private final ModelPart tail5;
	private final ModelPart tail2;
	private final ModelPart Tail6;
	private final ModelPart tail3;
	private final ModelPart tail7;
	private final ModelPart tail4;
	private final ModelPart fluke1;
	private final ModelPart belly3;
	private final ModelPart rearflipper2;
	private final ModelPart rearflipperfingers2;
	private final ModelPart rearflipper3;
	private final ModelPart rearflipperfingers3;
	private final ModelPart lowerbody3;
	private final ModelPart lowerbody2;
	private final ModelPart lowerbody1;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart head1;
	private final ModelPart rostrum1;
	private final ModelPart rostrum2;
	private final ModelPart teeth2;
	private final ModelPart beak1;
	private final ModelPart teeth1;
	private final ModelPart jaw1;
	private final ModelPart lowerrostrum1;
	private final ModelPart lowerrostrum2;
	private final ModelPart teeth4;
	private final ModelPart lowerbeak2;
	private final ModelPart beak3;
	private final ModelPart teeth3;
	private final ModelPart head2;
	private final ModelPart flipper2;
	private final ModelPart flipperfingers2;
	private final ModelPart flipper3;
	private final ModelPart flipperfingers3;
	private final ModelPart body3;
	private final ModelPart underbelly2;
	private final ModelPart body2;
	private final ModelPart underbelly3;
	private final ModelPart body1;
	private final ModelPart hips;

	public ShonisaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.tailbase1 = this.root.getChild("tailbase1");
		this.tail1 = this.tailbase1.getChild("tail1");
		this.tail5 = this.tail1.getChild("tail5");
		this.tail2 = this.tail1.getChild("tail2");
		this.Tail6 = this.tail2.getChild("Tail6");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail7 = this.tail3.getChild("tail7");
		this.tail4 = this.tail3.getChild("tail4");
		this.fluke1 = this.tail4.getChild("fluke1");
		this.belly3 = this.tailbase1.getChild("belly3");
		this.rearflipper2 = this.tailbase1.getChild("rearflipper2");
		this.rearflipperfingers2 = this.rearflipper2.getChild("rearflipperfingers2");
		this.rearflipper3 = this.tailbase1.getChild("rearflipper3");
		this.rearflipperfingers3 = this.rearflipper3.getChild("rearflipperfingers3");
		this.lowerbody3 = this.tailbase1.getChild("lowerbody3");
		this.lowerbody2 = this.lowerbody3.getChild("lowerbody2");
		this.lowerbody1 = this.lowerbody2.getChild("lowerbody1");
		this.neck1 = this.lowerbody1.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.head1 = this.neck2.getChild("head1");
		this.rostrum1 = this.head1.getChild("rostrum1");
		this.rostrum2 = this.rostrum1.getChild("rostrum2");
		this.teeth2 = this.rostrum2.getChild("teeth2");
		this.beak1 = this.rostrum1.getChild("beak1");
		this.teeth1 = this.rostrum1.getChild("teeth1");
		this.jaw1 = this.head1.getChild("jaw1");
		this.lowerrostrum1 = this.jaw1.getChild("lowerrostrum1");
		this.lowerrostrum2 = this.lowerrostrum1.getChild("lowerrostrum2");
		this.teeth4 = this.lowerrostrum2.getChild("teeth4");
		this.lowerbeak2 = this.lowerrostrum1.getChild("lowerbeak2");
		this.beak3 = this.lowerrostrum1.getChild("beak3");
		this.teeth3 = this.lowerrostrum1.getChild("teeth3");
		this.head2 = this.head1.getChild("head2");
		this.flipper2 = this.lowerbody1.getChild("flipper2");
		this.flipperfingers2 = this.flipper2.getChild("flipperfingers2");
		this.flipper3 = this.lowerbody1.getChild("flipper3");
		this.flipperfingers3 = this.flipper3.getChild("flipperfingers3");
		this.body3 = this.lowerbody1.getChild("body3");
		this.underbelly2 = this.lowerbody1.getChild("underbelly2");
		this.body2 = this.lowerbody2.getChild("body2");
		this.underbelly3 = this.lowerbody3.getChild("underbelly3");
		this.body1 = this.lowerbody3.getChild("body1");
		this.hips = this.tailbase1.getChild("hips");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tailbase1 = root.addOrReplaceChild("tailbase1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.8F, 0.9F, -0.3481F, 0.0226F, 0.0843F));

		PartDefinition tail1 = tailbase1.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.054F, 0.2713F, 42.8883F, 0.0903F, 0.2608F, 0.0233F));

		PartDefinition tail5 = tail1.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5826F, -0.7992F, -0.0456F, 0.0F, 0.0F));

		PartDefinition body2_r1 = tail5.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(0, 75).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck49_r1 = tail5.addOrReplaceChild("neck49_r1", CubeListBuilder.create().texOffs(19, 26).addBox(0.0F, -1.8704F, 7.9753F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 39).addBox(0.0F, -1.6704F, 5.9753F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 45).addBox(0.0F, -1.4704F, 3.9753F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 52).addBox(0.0F, -1.2704F, 1.9753F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 122).addBox(0.0F, -1.0704F, -0.0247F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4175F, 6.5115F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck50_r1 = tail5.addOrReplaceChild("neck50_r1", CubeListBuilder.create().texOffs(74, 83).addBox(0.0F, -0.69F, 1.3286F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 83).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3741F, 13.5929F, 0.4625F, 0.0F, 0.0F));

		PartDefinition neck48_r1 = tail5.addOrReplaceChild("neck48_r1", CubeListBuilder.create().texOffs(85, 58).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.283F, 11.595F, 0.4189F, 0.0F, 0.0F));

		PartDefinition neck47_r1 = tail5.addOrReplaceChild("neck47_r1", CubeListBuilder.create().texOffs(12, 26).addBox(0.0F, -1.0F, 0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4441F, 8.688F, 0.288F, 0.0F, 0.0F));

		PartDefinition neck43_r1 = tail5.addOrReplaceChild("neck43_r1", CubeListBuilder.create().texOffs(0, 5).mirror().addBox(-1.756F, 0.316F, 3.9352F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -2.4312F, 2.0573F, 0.0045F, 0.0363F, -1.1181F));

		PartDefinition neck42_r1 = tail5.addOrReplaceChild("neck42_r1", CubeListBuilder.create().texOffs(24, 59).mirror().addBox(-2.756F, 0.316F, 1.9352F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -2.4312F, 2.0573F, 0.0071F, 0.0359F, -1.0482F));

		PartDefinition neck41_r1 = tail5.addOrReplaceChild("neck41_r1", CubeListBuilder.create().texOffs(119, 99).mirror().addBox(-2.756F, 0.316F, -0.0648F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -2.4312F, 2.0573F, 0.0077F, 0.0357F, -1.0307F));

		PartDefinition neck42_r2 = tail5.addOrReplaceChild("neck42_r2", CubeListBuilder.create().texOffs(0, 5).addBox(-0.244F, 0.316F, 3.9352F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -2.4312F, 2.0573F, 0.0045F, -0.0363F, 1.1181F));

		PartDefinition neck41_r2 = tail5.addOrReplaceChild("neck41_r2", CubeListBuilder.create().texOffs(24, 59).addBox(-0.244F, 0.316F, 1.9352F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -2.4312F, 2.0573F, 0.0071F, -0.0359F, 1.0482F));

		PartDefinition neck40_r1 = tail5.addOrReplaceChild("neck40_r1", CubeListBuilder.create().texOffs(119, 99).addBox(-0.244F, 0.316F, -0.0648F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -2.4312F, 2.0573F, 0.0077F, -0.0357F, 1.0307F));

		PartDefinition neck44_r1 = tail5.addOrReplaceChild("neck44_r1", CubeListBuilder.create().texOffs(92, 88).addBox(-4.024F, -7.8069F, 83.6462F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 94).addBox(-4.024F, -7.6069F, 81.6462F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 94).addBox(-4.024F, -7.4069F, 79.6462F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.024F, -5.474F, -79.4151F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1826F, 14.8008F, 0.134F, 0.2163F, 0.0289F));

		PartDefinition Tail6 = tail2.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(82, 58).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 3.4F, 1.9F, -0.0456F, 0.0F, 0.0F));

		PartDefinition neck51_r1 = Tail6.addOrReplaceChild("neck51_r1", CubeListBuilder.create().texOffs(21, 83).addBox(0.0F, -1.0F, -2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 87).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 26).addBox(0.0F, -1.0F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 10).addBox(0.0F, -1.0F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 26).addBox(0.0F, -1.0F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(0.0F, -1.0F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5067F, 1.5428F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck56_r1 = Tail6.addOrReplaceChild("neck56_r1", CubeListBuilder.create().texOffs(10, 75).addBox(0.0F, 3.9068F, 8.9888F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 75).addBox(0.0F, 3.1041F, 7.1466F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 75).addBox(0.0F, 2.2151F, 5.3551F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 75).addBox(0.0F, 1.3262F, 3.5635F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 5).addBox(0.0F, 0.4372F, 1.7719F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 58).addBox(0.0F, -0.4517F, -0.0197F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.38F, -0.8071F, 0.5323F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, 12.7F, 0.0F, 0.1745F, 0.0F));

		PartDefinition tail7 = tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(25, 87).addBox(-0.996F, 0.3F, -1.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3025F, 1.0093F, -0.0456F, 0.0F, 0.0F));

		PartDefinition neck57_r1 = tail7.addOrReplaceChild("neck57_r1", CubeListBuilder.create().texOffs(12, 0).addBox(0.0F, -0.5F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 0).addBox(0.0F, -0.5F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 7).addBox(0.0F, -0.5F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 52).addBox(0.0F, -0.5F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 52).addBox(0.0F, -0.5F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 69).addBox(0.0F, -0.5F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2958F, -10.2665F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck62_r1 = tail7.addOrReplaceChild("neck62_r1", CubeListBuilder.create().texOffs(63, 43).addBox(0.0F, 4.5734F, 8.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 67).addBox(0.0F, 2.5617F, 6.2998F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 67).addBox(0.0F, 1.5499F, 4.5746F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 67).addBox(0.0F, 0.5381F, 2.8494F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 73).addBox(0.0F, -0.4736F, 1.1242F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 75).addBox(0.0F, -1.2854F, -0.601F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3975F, 0.3836F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(24, 52).addBox(-0.996F, -0.795F, -0.1092F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.2975F, 11.7093F, 0.0F, 0.3491F, 0.0F));

		PartDefinition neck66_r1 = tail4.addOrReplaceChild("neck66_r1", CubeListBuilder.create().texOffs(17, 52).addBox(0.0F, 9.2341F, 14.5274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 43).addBox(0.0F, 8.1902F, 12.8098F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 60).addBox(0.0F, 7.0664F, 11.1524F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 62).addBox(0.0F, 6.0225F, 9.4347F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7975F, -10.3164F, 0.6021F, 0.0F, 0.0F));

		PartDefinition fluke1 = tail4.addOrReplaceChild("fluke1", CubeListBuilder.create().texOffs(30, 43).addBox(-0.996F, -0.9695F, 0.031F, 2.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.105F, 8.5908F, -0.6472F, 0.1402F, -0.0223F));

		PartDefinition fluke2_r1 = fluke1.addOrReplaceChild("fluke2_r1", CubeListBuilder.create().texOffs(0, 52).addBox(-0.496F, -0.7F, 0.1F, 1.0F, 1.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7305F, 20.931F, 0.3054F, 0.0F, 0.0F));

		PartDefinition belly3 = tailbase1.addOrReplaceChild("belly3", CubeListBuilder.create().texOffs(74, 21).addBox(-5.0F, 0.855F, 0.5531F, 10.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.054F, 14.6713F, 19.6883F, 0.406F, 0.0F, 0.0F));

		PartDefinition rearflipper2 = tailbase1.addOrReplaceChild("rearflipper2", CubeListBuilder.create().texOffs(86, 7).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(42, 93).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.646F, 10.418F, 35.2471F, 0.2997F, 0.3879F, -1.0484F));

		PartDefinition rearflipper3_r1 = rearflipper2.addOrReplaceChild("rearflipper3_r1", CubeListBuilder.create().texOffs(85, 119).addBox(-1.0F, -1.0F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4F, -0.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rearflipper2_r1 = rearflipper2.addOrReplaceChild("rearflipper2_r1", CubeListBuilder.create().texOffs(94, 119).addBox(-1.0F, -1.2F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4F, 2.4F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rearflipperfingers2 = rearflipper2.addOrReplaceChild("rearflipperfingers2", CubeListBuilder.create().texOffs(61, 96).addBox(0.0F, 7.9962F, 2.8872F, 0.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -5.1F));

		PartDefinition rearflipper3 = tailbase1.addOrReplaceChild("rearflipper3", CubeListBuilder.create().texOffs(34, 75).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(67, 67).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.646F, 10.418F, 35.2471F, 0.2376F, -0.3298F, 1.3529F));

		PartDefinition rearflipper4_r1 = rearflipper3.addOrReplaceChild("rearflipper4_r1", CubeListBuilder.create().texOffs(55, 96).addBox(-1.0F, -1.0F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4F, -0.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rearflipper3_r2 = rearflipper3.addOrReplaceChild("rearflipper3_r2", CubeListBuilder.create().texOffs(41, 119).addBox(-1.0F, -1.2F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4F, 2.4F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rearflipperfingers3 = rearflipper3.addOrReplaceChild("rearflipperfingers3", CubeListBuilder.create().texOffs(48, 96).addBox(0.0F, 7.9962F, 2.8872F, 0.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -5.1F));

		PartDefinition lowerbody3 = tailbase1.addOrReplaceChild("lowerbody3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.054F, -0.5287F, 20.8883F, 0.0F, -0.2182F, 0.0F));

		PartDefinition lowerbody2 = lowerbody3.addOrReplaceChild("lowerbody2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3228F, -16.1113F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lowerbody3_r1 = lowerbody2.addOrReplaceChild("lowerbody3_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -3.0444F, 0.0648F, 20.0F, 3.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 19.3991F, -20.8483F, -0.1396F, 0.0F, 0.0F));

		PartDefinition lowerbody1 = lowerbody2.addOrReplaceChild("lowerbody1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4009F, -19.8483F, 0.0886F, -0.1739F, -0.0154F));

		PartDefinition neck1 = lowerbody1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.019F, -17.2795F, -0.088F, -0.1304F, 0.0115F));

		PartDefinition neck5_r1 = neck1.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(9, 122).addBox(-4.024F, -1.8069F, 3.6462F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 122).addBox(-4.024F, -1.3069F, 1.6462F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 79).addBox(-4.024F, -0.4069F, -0.3538F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.024F, -0.374F, -5.7151F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-5.024F, -0.849F, -0.3972F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(4.024F, 0.549F, -6.6028F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck6_r1 = neck1.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(82, 66).mirror().addBox(-12.1245F, -6.2088F, -0.3522F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, 0.6056F, -1.5871F, 0.0435F, 0.6178F, -1.6477F));

		PartDefinition neck4_r1 = neck1.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(82, 68).mirror().addBox(-4.8423F, -0.2252F, -0.3522F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, 0.6056F, -1.5871F, 0.546F, 0.308F, -0.6148F));

		PartDefinition neck5_r2 = neck1.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(82, 74).mirror().addBox(-9.081F, -2.6161F, -0.3522F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, 0.6056F, -1.5871F, 0.3278F, 0.5351F, -1.1346F));

		PartDefinition neck4_r2 = neck1.addOrReplaceChild("neck4_r2", CubeListBuilder.create().texOffs(24, 69).mirror().addBox(-11.2685F, -2.5078F, -0.1844F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, 0.6046F, -3.7962F, 0.3459F, 0.5856F, -1.308F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(111, 114).mirror().addBox(-4.9506F, -0.0376F, -0.1844F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, 0.6046F, -3.7962F, 0.5866F, 0.3441F, -0.7848F));

		PartDefinition neck2_r2 = neck1.addOrReplaceChild("neck2_r2", CubeListBuilder.create().texOffs(115, 15).mirror().addBox(-4.9938F, 0.0372F, -0.2847F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, 0.6309F, -5.7065F, 0.576F, 0.3539F, -0.8231F));

		PartDefinition neck3_r2 = neck1.addOrReplaceChild("neck3_r2", CubeListBuilder.create().texOffs(119, 83).mirror().addBox(-8.3433F, -2.4647F, -0.2847F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, 0.6309F, -5.7065F, 0.3297F, 0.5891F, -1.3517F));

		PartDefinition neck5_r3 = neck1.addOrReplaceChild("neck5_r3", CubeListBuilder.create().texOffs(82, 66).addBox(7.1245F, -6.2088F, -0.3522F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, 0.6056F, -1.5871F, 0.0435F, -0.6178F, 1.6477F));

		PartDefinition neck4_r3 = neck1.addOrReplaceChild("neck4_r3", CubeListBuilder.create().texOffs(82, 74).addBox(4.081F, -2.6161F, -0.3522F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, 0.6056F, -1.5871F, 0.3278F, -0.5351F, 1.1346F));

		PartDefinition neck3_r3 = neck1.addOrReplaceChild("neck3_r3", CubeListBuilder.create().texOffs(82, 68).addBox(-0.1577F, -0.2252F, -0.3522F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, 0.6056F, -1.5871F, 0.546F, -0.308F, 0.6148F));

		PartDefinition neck3_r4 = neck1.addOrReplaceChild("neck3_r4", CubeListBuilder.create().texOffs(24, 69).addBox(4.2685F, -2.5078F, -0.1844F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, 0.6046F, -3.7962F, 0.3459F, -0.5856F, 1.308F));

		PartDefinition neck2_r3 = neck1.addOrReplaceChild("neck2_r3", CubeListBuilder.create().texOffs(111, 114).addBox(-0.0494F, -0.0376F, -0.1844F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, 0.6046F, -3.7962F, 0.5866F, -0.3441F, 0.7848F));

		PartDefinition neck2_r4 = neck1.addOrReplaceChild("neck2_r4", CubeListBuilder.create().texOffs(119, 83).addBox(4.3433F, -2.4647F, -0.2847F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, 0.6309F, -5.7065F, 0.3297F, -0.5891F, 1.3517F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(115, 15).addBox(-0.0062F, 0.0372F, -0.2847F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, 0.6309F, -5.7065F, 0.576F, -0.3539F, 0.8231F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(107, 74).addBox(-1.0F, -1.0417F, -4.9531F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -6.8F, -0.2085F, -0.6102F, -0.0305F));

		PartDefinition neck4_r4 = neck2.addOrReplaceChild("neck4_r4", CubeListBuilder.create().texOffs(69, 58).mirror().addBox(-6.4012F, -2.4589F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.892F, -0.0008F, -0.0337F, -0.2889F, 0.5408F, -1.7646F));

		PartDefinition neck3_r5 = neck2.addOrReplaceChild("neck3_r5", CubeListBuilder.create().texOffs(74, 114).mirror().addBox(-5.0411F, 0.0711F, -0.5067F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.892F, -0.0008F, -0.0337F, 0.0558F, 0.6041F, -1.143F));

		PartDefinition neck4_r5 = neck2.addOrReplaceChild("neck4_r5", CubeListBuilder.create().texOffs(120, 94).mirror().addBox(-3.0411F, 0.0711F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.892F, -0.0008F, -2.7837F, 0.6062F, 0.5495F, -0.9192F));

		PartDefinition neck3_r6 = neck2.addOrReplaceChild("neck3_r6", CubeListBuilder.create().texOffs(120, 94).addBox(0.0411F, 0.0711F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0008F, -2.7837F, 0.6062F, -0.5495F, 0.9192F));

		PartDefinition neck3_r7 = neck2.addOrReplaceChild("neck3_r7", CubeListBuilder.create().texOffs(69, 58).addBox(4.4012F, -2.4589F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0008F, -0.7837F, 0.2799F, -0.6224F, 1.5768F));

		PartDefinition neck2_r5 = neck2.addOrReplaceChild("neck2_r5", CubeListBuilder.create().texOffs(74, 114).addBox(0.0411F, 0.0711F, -0.5067F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0008F, -0.7837F, 0.5566F, -0.4035F, 1.027F));

		PartDefinition head1 = neck2.addOrReplaceChild("head1", CubeListBuilder.create().texOffs(50, 67).addBox(-2.5F, -0.8317F, -8.4954F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.004F))
				.texOffs(103, 119).addBox(0.8F, -0.4043F, -6.95F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(12, 0).addBox(1.5F, -0.9043F, -7.45F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.05F))
				.texOffs(103, 119).mirror().addBox(-2.892F, -0.4043F, -6.95F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(12, 0).mirror().addBox(-2.592F, -0.9043F, -7.45F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3417F, -4.0531F, -0.0973F, -0.2056F, 0.1871F));

		PartDefinition cube_r1 = head1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(95, 74).mirror().addBox(-0.2F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 74).addBox(1.492F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.692F, 0.8957F, -12.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 120).mirror().addBox(-2.7F, -1.9989F, -0.0747F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(50, 120).addBox(1.392F, -1.9989F, -0.0747F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.108F, -1.6043F, -4.85F, -2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(57, 120).mirror().addBox(-2.7F, -2.001F, -0.0349F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(57, 120).addBox(1.392F, -2.001F, -0.0349F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.108F, -1.5043F, -6.85F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(50, 78).mirror().addBox(-2.7F, -0.9652F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(50, 78).addBox(1.392F, -0.9652F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.108F, 2.1957F, -8.55F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 26).mirror().addBox(-2.7F, -1.973F, 0.0007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(28, 26).addBox(1.392F, -1.973F, 0.0007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.108F, -0.5043F, -8.55F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 26).mirror().addBox(-2.7F, -1.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(28, 26).addBox(1.392F, -1.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.108F, 0.9957F, -5.95F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 26).mirror().addBox(-2.7F, -1.9652F, -0.0332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(36, 26).addBox(1.392F, -1.9652F, -0.0332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.108F, 1.3957F, -9.15F, -0.3229F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head1.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(63, 11).addBox(-2.5F, -0.0254F, -0.0365F, 5.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.2317F, -7.1954F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head1.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(30, 102).addBox(-2.5F, -0.0067F, -0.5769F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1317F, -9.3954F, 0.4712F, 0.0F, 0.0F));

		PartDefinition head2_r1 = head1.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(90, 101).addBox(-1.5F, 0.7F, -5.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8317F, -9.4954F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rostrum1 = head1.addOrReplaceChild("rostrum1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6683F, -10.6954F));

		PartDefinition rostrum3_r1 = rostrum1.addOrReplaceChild("rostrum3_r1", CubeListBuilder.create().texOffs(56, 50).addBox(-1.5F, 0.5078F, 0.0447F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(104, 0).addBox(-2.0F, -0.9922F, 0.0447F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.4F, -0.2269F, 0.0F, 0.0F));

		PartDefinition rostrum2_r1 = rostrum1.addOrReplaceChild("rostrum2_r1", CubeListBuilder.create().texOffs(21, 75).addBox(-1.5F, -0.5F, -0.1F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 10).addBox(-2.0F, -1.0F, -0.1F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.2F, -7.3F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rostrum2 = rostrum1.addOrReplaceChild("rostrum2", CubeListBuilder.create().texOffs(54, 81).addBox(-1.5F, -0.3F, -12.5F, 3.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(86, 0).addBox(-1.0F, 0.1F, -12.4F, 2.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -7.8F));

		PartDefinition teeth2 = rostrum2.addOrReplaceChild("teeth2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.3F));

		PartDefinition beak1 = rostrum1.addOrReplaceChild("beak1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, 1.7F, 0.0422F, 0.0F, 0.0F));

		PartDefinition beak2_r1 = beak1.addOrReplaceChild("beak2_r1", CubeListBuilder.create().texOffs(107, 17).addBox(-1.0F, -0.0564F, -0.1074F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0706F, -8.9936F, 0.0524F, 0.0F, 0.0F));

		PartDefinition beak1_r1 = beak1.addOrReplaceChild("beak1_r1", CubeListBuilder.create().texOffs(74, 83).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1F, -22.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition teeth1 = rostrum1.addOrReplaceChild("teeth1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, 1.2F, 0.0911F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2683F, 1.2046F, 0.5236F, 0.0F, 0.0F));

		PartDefinition jaw3_r1 = jaw1.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.1F, 0.3F, 2.2F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.608F, 2.7853F, -8.6586F, 0.0873F, -0.1745F, 0.0F));

		PartDefinition jaw3_r2 = jaw1.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.5F, -0.0486F, -6.94F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 52).addBox(3.392F, -0.0486F, -6.94F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.892F, 0.5853F, -3.6586F, 0.0087F, 0.0F, 0.0F));

		PartDefinition jaw5_r1 = jaw1.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(74, 83).mirror().addBox(-0.5F, -2.0102F, -5.0274F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(74, 83).addBox(3.392F, -2.0102F, -5.0274F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.892F, 3.2853F, -5.2586F, -0.0611F, 0.0F, 0.0F));

		PartDefinition jaw4_r1 = jaw1.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(92, 88).mirror().addBox(-0.5F, -1.9954F, 0.0715F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(92, 88).addBox(3.392F, -1.9954F, 0.0715F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.892F, 3.2853F, -5.3586F, 0.1833F, 0.0F, 0.0F));

		PartDefinition jaw4_r2 = jaw1.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.5F, -1.9939F, -1.7581F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 52).addBox(3.392F, -1.9939F, -1.7581F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.892F, 1.6853F, -0.0586F, 0.6021F, 0.0F, 0.0F));

		PartDefinition jaw3_r3 = jaw1.addOrReplaceChild("jaw3_r3", CubeListBuilder.create().texOffs(15, 39).mirror().addBox(-0.5F, -0.1004F, -1.869F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(15, 39).addBox(3.392F, -0.1004F, -1.869F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.892F, -0.4147F, 0.1414F, 1.0385F, 0.0F, 0.0F));

		PartDefinition jaw2_r1 = jaw1.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.5F, -0.0486F, -0.94F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(86, 0).addBox(3.392F, -0.0486F, -0.94F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.892F, 0.5853F, -3.6586F, 0.2705F, 0.0F, 0.0F));

		PartDefinition jaw2_r2 = jaw1.addOrReplaceChild("jaw2_r2", CubeListBuilder.create().texOffs(0, 62).addBox(0.1F, 0.3F, 2.2F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.7853F, -8.6586F, 0.0873F, 0.1745F, 0.0F));

		PartDefinition lowerrostrum1 = jaw1.addOrReplaceChild("lowerrostrum1", CubeListBuilder.create(), PartPose.offset(0.0F, 1.2853F, -11.8586F));

		PartDefinition lowerrostrum4_r1 = lowerrostrum1.addOrReplaceChild("lowerrostrum4_r1", CubeListBuilder.create().texOffs(82, 58).mirror().addBox(0.2F, -0.7F, -9.6F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 102).mirror().addBox(-0.5F, -0.1F, -9.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 94).mirror().addBox(-0.5F, -0.1F, -3.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 58).addBox(2.692F, -0.7F, -9.6F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(74, 102).addBox(2.392F, -0.1F, -9.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(8, 94).addBox(2.392F, -0.1F, -3.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.392F, -0.6F, 1.6F, -0.1047F, 0.0F, 0.0F));

		PartDefinition lowerrostrum3_r1 = lowerrostrum1.addOrReplaceChild("lowerrostrum3_r1", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(0.2F, -0.0713F, -0.0146F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 10).addBox(2.692F, -0.0713F, -0.0146F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.392F, -1.6F, -1.9F, -0.192F, 0.0F, 0.0F));

		PartDefinition lowerrostrum2 = lowerrostrum1.addOrReplaceChild("lowerrostrum2", CubeListBuilder.create().texOffs(119, 85).addBox(-1.5F, -2.41F, -11.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.1F, -8.0F));

		PartDefinition lowerrostrum5_r1 = lowerrostrum2.addOrReplaceChild("lowerrostrum5_r1", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-0.1F, -0.6F, -11.0F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 88).mirror().addBox(-0.5F, 0.0F, -11.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 26).addBox(1.992F, -0.6F, -11.0F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(94, 88).addBox(1.392F, 0.0F, -11.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.892F, -1.81F, 0.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition teeth4 = lowerrostrum2.addOrReplaceChild("teeth4", CubeListBuilder.create(), PartPose.offset(0.0F, -1.4F, 0.3F));

		PartDefinition lowerbeak2 = lowerrostrum1.addOrReplaceChild("lowerbeak2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -7.3F, -0.0543F, 0.0F, 0.0F));

		PartDefinition lowerbeak3_r1 = lowerbeak2.addOrReplaceChild("lowerbeak3_r1", CubeListBuilder.create().texOffs(92, 74).mirror().addBox(-0.5F, -1.0F, -11.3F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(92, 74).addBox(1.392F, -1.0F, -11.3F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.892F, -0.5F, -0.7F, -0.0524F, 0.0F, 0.0F));

		PartDefinition beak3 = lowerrostrum1.addOrReplaceChild("beak3", CubeListBuilder.create().texOffs(107, 25).addBox(0.9F, -1.0F, -8.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(107, 25).mirror().addBox(-1.792F, -1.0F, -8.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition beak5_r1 = beak3.addOrReplaceChild("beak5_r1", CubeListBuilder.create().texOffs(101, 103).mirror().addBox(-0.5F, -0.9F, -1.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(101, 103).addBox(2.192F, -0.9F, -1.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.292F, 0.0F, -3.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition teeth3 = lowerrostrum1.addOrReplaceChild("teeth3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, 1.2F, -0.0456F, 0.0F, 0.0F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0317F, -1.6954F, 0.3187F, 0.0F, 0.0F));

		PartDefinition head4_r2 = head2.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(56, 58).addBox(-2.5F, -0.0373F, -1.7338F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(71, 120).mirror().addBox(-2.392F, 2.9627F, -1.7338F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(71, 120).addBox(1.5F, 2.9627F, -1.7338F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition head2_r2 = head2.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(0, 39).addBox(-2.5F, -1.0F, -1.5F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition flipper2 = lowerbody1.addOrReplaceChild("flipper2", CubeListBuilder.create().texOffs(0, 75).addBox(-0.8763F, -0.2854F, -2.865F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 12.919F, -13.5795F, 0.3992F, 0.239F, -0.8824F));

		PartDefinition flipper5_r1 = flipper2.addOrReplaceChild("flipper5_r1", CubeListBuilder.create().texOffs(0, 62).addBox(0.174F, 4.0879F, -3.7904F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(71, 60).addBox(0.174F, 3.3879F, 1.0096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 0).addBox(0.174F, 4.0879F, -1.2904F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(64, 120).addBox(0.174F, 0.3879F, -0.4904F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(108, 88).addBox(0.174F, 0.3879F, -3.9904F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4158F, 4.7106F, 1.0131F, -0.0302F, -0.0233F, -0.0895F));

		PartDefinition flipperfingers2 = flipper2.addOrReplaceChild("flipperfingers2", CubeListBuilder.create(), PartPose.offset(0.1237F, 1.1146F, -7.065F));

		PartDefinition flipperfingers2_r1 = flipperfingers2.addOrReplaceChild("flipperfingers2_r1", CubeListBuilder.create().texOffs(15, 95).addBox(0.674F, 6.5879F, -4.1904F, 0.0F, 20.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5395F, 3.5961F, 8.0782F, -0.0302F, -0.0233F, -0.0895F));

		PartDefinition flipper3 = lowerbody1.addOrReplaceChild("flipper3", CubeListBuilder.create().texOffs(63, 0).addBox(-1.1237F, -0.2854F, -2.865F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.892F, 12.919F, -13.5795F, 0.1186F, -0.1284F, 0.8214F));

		PartDefinition flipper6_r1 = flipper3.addOrReplaceChild("flipper6_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.174F, 4.0879F, -3.7904F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(24, 64).addBox(-1.174F, 3.3879F, 1.0096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 10).addBox(-1.174F, 4.0879F, -1.2904F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 94).addBox(-1.174F, 0.3879F, -0.4904F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(24, 52).addBox(-1.174F, 0.3879F, -3.9904F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4158F, 4.7106F, 1.0131F, -0.0302F, 0.0233F, 0.0895F));

		PartDefinition flipperfingers3 = flipper3.addOrReplaceChild("flipperfingers3", CubeListBuilder.create(), PartPose.offset(-0.1237F, 1.1146F, -7.065F));

		PartDefinition flipperfingers3_r1 = flipperfingers3.addOrReplaceChild("flipperfingers3_r1", CubeListBuilder.create().texOffs(0, 94).addBox(-0.674F, 6.5879F, -4.1904F, 0.0F, 20.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5395F, 3.5961F, 8.0782F, -0.0302F, 0.0233F, 0.0895F));

		PartDefinition body3 = lowerbody1.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offset(0.0F, 6.219F, 3.0205F));

		PartDefinition body3_r1 = body3.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(63, 0).addBox(-1.0F, -0.715F, -0.2856F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.3804F, -20.6143F, 0.0087F, 0.0F, 0.0F));

		PartDefinition neck15_r1 = body3.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(100, 58).mirror().addBox(-20.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7788F, -2.9012F, 0.0371F, 0.3383F, -1.4242F));

		PartDefinition neck14_r1 = body3.addOrReplaceChild("neck14_r1", CubeListBuilder.create().texOffs(86, 117).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7788F, -2.9012F, 0.1804F, 0.29F, -0.9677F));

		PartDefinition neck13_r1 = body3.addOrReplaceChild("neck13_r1", CubeListBuilder.create().texOffs(30, 111).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7788F, -2.9012F, 0.3003F, 0.1624F, -0.4459F));

		PartDefinition neck12_r1 = body3.addOrReplaceChild("neck12_r1", CubeListBuilder.create().texOffs(111, 53).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.0788F, -5.8012F, 0.3323F, 0.1774F, -0.4405F));

		PartDefinition neck13_r2 = body3.addOrReplaceChild("neck13_r2", CubeListBuilder.create().texOffs(117, 90).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.0788F, -5.8012F, 0.2013F, 0.3187F, -0.9615F));

		PartDefinition neck14_r2 = body3.addOrReplaceChild("neck14_r2", CubeListBuilder.create().texOffs(100, 60).mirror().addBox(-20.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.0788F, -5.8012F, 0.0426F, 0.3728F, -1.4222F));

		PartDefinition neck13_r3 = body3.addOrReplaceChild("neck13_r3", CubeListBuilder.create().texOffs(100, 64).mirror().addBox(-19.4186F, -6.1831F, -0.4055F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.0788F, -7.8012F, 0.0454F, 0.3901F, -1.4212F));

		PartDefinition neck12_r2 = body3.addOrReplaceChild("neck12_r2", CubeListBuilder.create().texOffs(117, 92).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.0788F, -7.8012F, 0.2118F, 0.333F, -0.9581F));

		PartDefinition neck11_r1 = body3.addOrReplaceChild("neck11_r1", CubeListBuilder.create().texOffs(111, 55).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.0788F, -7.8012F, 0.3484F, 0.1848F, -0.4376F));

		PartDefinition neck10_r1 = body3.addOrReplaceChild("neck10_r1", CubeListBuilder.create().texOffs(86, 111).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.0788F, -9.8012F, 0.3645F, 0.1922F, -0.4346F));

		PartDefinition neck11_r2 = body3.addOrReplaceChild("neck11_r2", CubeListBuilder.create().texOffs(99, 117).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.0788F, -9.8012F, 0.2225F, 0.3473F, -0.9545F));

		PartDefinition neck12_r3 = body3.addOrReplaceChild("neck12_r3", CubeListBuilder.create().texOffs(100, 66).mirror().addBox(-19.4186F, -6.1831F, -0.4055F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.0788F, -9.8012F, 0.0482F, 0.4073F, -1.4201F));

		PartDefinition neck11_r3 = body3.addOrReplaceChild("neck11_r3", CubeListBuilder.create().texOffs(68, 100).mirror().addBox(-19.4186F, -6.1831F, -0.4055F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.0788F, -11.8012F, 0.0482F, 0.4073F, -1.4201F));

		PartDefinition neck10_r2 = body3.addOrReplaceChild("neck10_r2", CubeListBuilder.create().texOffs(118, 36).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.0788F, -11.8012F, 0.2225F, 0.3473F, -0.9545F));

		PartDefinition neck9_r1 = body3.addOrReplaceChild("neck9_r1", CubeListBuilder.create().texOffs(99, 111).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.0788F, -11.8012F, 0.3645F, 0.1922F, -0.4346F));

		PartDefinition neck8_r1 = body3.addOrReplaceChild("neck8_r1", CubeListBuilder.create().texOffs(113, 71).mirror().addBox(-5.0214F, 0.085F, -0.62F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.143F, -13.6028F, 0.3864F, 0.2078F, -0.4471F));

		PartDefinition neck9_r2 = body3.addOrReplaceChild("neck9_r2", CubeListBuilder.create().texOffs(30, 119).mirror().addBox(-9.3911F, -2.437F, -0.62F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.143F, -13.6028F, 0.2342F, 0.3715F, -0.9673F));

		PartDefinition neck10_r3 = body3.addOrReplaceChild("neck10_r3", CubeListBuilder.create().texOffs(42, 89).mirror().addBox(-18.4813F, -6.1776F, -0.62F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -6.143F, -13.6028F, 0.0469F, 0.4339F, -1.4375F));

		PartDefinition neck9_r3 = body3.addOrReplaceChild("neck9_r3", CubeListBuilder.create().texOffs(42, 91).mirror().addBox(-18.2579F, -6.1971F, -0.1732F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.8634F, -16.0384F, 0.0464F, 0.4339F, -1.4288F));

		PartDefinition neck8_r2 = body3.addOrReplaceChild("neck8_r2", CubeListBuilder.create().texOffs(111, 118).mirror().addBox(-9.1969F, -2.5492F, -0.1732F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.8634F, -16.0384F, 0.2338F, 0.3717F, -0.9586F));

		PartDefinition neck7_r1 = body3.addOrReplaceChild("neck7_r1", CubeListBuilder.create().texOffs(86, 113).mirror().addBox(-4.9092F, -0.1092F, -0.1732F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.8634F, -16.0384F, 0.3862F, 0.2082F, -0.4383F));

		PartDefinition neck8_r3 = body3.addOrReplaceChild("neck8_r3", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-16.3383F, -6.1901F, -0.2893F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.9367F, -17.9396F, 0.0425F, 0.4519F, -1.4738F));

		PartDefinition neck7_r2 = body3.addOrReplaceChild("neck7_r2", CubeListBuilder.create().texOffs(74, 118).mirror().addBox(-9.2668F, -2.5088F, -0.2893F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.9367F, -17.9396F, 0.2392F, 0.3894F, -0.9998F));

		PartDefinition neck6_r2 = body3.addOrReplaceChild("neck6_r2", CubeListBuilder.create().texOffs(99, 113).mirror().addBox(-4.9496F, -0.0393F, -0.2893F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.9367F, -17.9396F, 0.3997F, 0.221F, -0.4787F));

		PartDefinition neck5_r4 = body3.addOrReplaceChild("neck5_r4", CubeListBuilder.create().texOffs(114, 88).mirror().addBox(-4.8423F, -0.2252F, -0.3522F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7112F, -19.8681F, 0.4297F, 0.2403F, -0.559F));

		PartDefinition neck6_r3 = body3.addOrReplaceChild("neck6_r3", CubeListBuilder.create().texOffs(116, 8).mirror().addBox(-9.081F, -2.6161F, -0.3522F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7112F, -19.8681F, 0.2563F, 0.4207F, -1.0802F));

		PartDefinition neck7_r3 = body3.addOrReplaceChild("neck7_r3", CubeListBuilder.create().texOffs(28, 47).mirror().addBox(-15.1245F, -6.2088F, -0.3522F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7112F, -19.8681F, 0.042F, 0.487F, -1.5611F));

		PartDefinition neck14_r3 = body3.addOrReplaceChild("neck14_r3", CubeListBuilder.create().texOffs(100, 58).addBox(7.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -3.8012F, 0.0398F, -0.3555F, 1.4232F));

		PartDefinition neck13_r4 = body3.addOrReplaceChild("neck13_r4", CubeListBuilder.create().texOffs(86, 117).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -3.8012F, 0.1908F, -0.3044F, 0.9647F));

		PartDefinition neck12_r4 = body3.addOrReplaceChild("neck12_r4", CubeListBuilder.create().texOffs(30, 111).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -3.8012F, 0.3163F, -0.1699F, 0.4433F));

		PartDefinition neck13_r5 = body3.addOrReplaceChild("neck13_r5", CubeListBuilder.create().texOffs(100, 60).addBox(7.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -5.8012F, 0.0426F, -0.3728F, 1.4222F));

		PartDefinition neck12_r5 = body3.addOrReplaceChild("neck12_r5", CubeListBuilder.create().texOffs(117, 90).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -5.8012F, 0.2013F, -0.3187F, 0.9615F));

		PartDefinition neck11_r4 = body3.addOrReplaceChild("neck11_r4", CubeListBuilder.create().texOffs(111, 53).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -5.8012F, 0.3323F, -0.1774F, 0.4405F));

		PartDefinition neck12_r6 = body3.addOrReplaceChild("neck12_r6", CubeListBuilder.create().texOffs(100, 64).addBox(7.4186F, -6.1831F, -0.4055F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -7.8012F, 0.0454F, -0.3901F, 1.4212F));

		PartDefinition neck11_r5 = body3.addOrReplaceChild("neck11_r5", CubeListBuilder.create().texOffs(117, 92).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -7.8012F, 0.2118F, -0.333F, 0.9581F));

		PartDefinition neck10_r4 = body3.addOrReplaceChild("neck10_r4", CubeListBuilder.create().texOffs(111, 55).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -7.8012F, 0.3484F, -0.1848F, 0.4376F));

		PartDefinition neck11_r6 = body3.addOrReplaceChild("neck11_r6", CubeListBuilder.create().texOffs(100, 66).addBox(7.4186F, -6.1831F, -0.4055F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -9.8012F, 0.0482F, -0.4073F, 1.4201F));

		PartDefinition neck10_r5 = body3.addOrReplaceChild("neck10_r5", CubeListBuilder.create().texOffs(99, 117).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -9.8012F, 0.2225F, -0.3473F, 0.9545F));

		PartDefinition neck9_r4 = body3.addOrReplaceChild("neck9_r4", CubeListBuilder.create().texOffs(86, 111).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -9.8012F, 0.3645F, -0.1922F, 0.4346F));

		PartDefinition neck8_r4 = body3.addOrReplaceChild("neck8_r4", CubeListBuilder.create().texOffs(99, 111).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -11.8012F, 0.3645F, -0.1922F, 0.4346F));

		PartDefinition neck9_r5 = body3.addOrReplaceChild("neck9_r5", CubeListBuilder.create().texOffs(118, 36).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -11.8012F, 0.2225F, -0.3473F, 0.9545F));

		PartDefinition neck10_r6 = body3.addOrReplaceChild("neck10_r6", CubeListBuilder.create().texOffs(68, 100).addBox(7.4186F, -6.1831F, -0.4055F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.0788F, -11.8012F, 0.0482F, -0.4073F, 1.4201F));

		PartDefinition neck7_r4 = body3.addOrReplaceChild("neck7_r4", CubeListBuilder.create().texOffs(113, 71).addBox(0.0214F, 0.085F, -0.62F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.143F, -13.6028F, 0.3864F, -0.2078F, 0.4471F));

		PartDefinition neck8_r5 = body3.addOrReplaceChild("neck8_r5", CubeListBuilder.create().texOffs(30, 119).addBox(4.3911F, -2.437F, -0.62F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.143F, -13.6028F, 0.2342F, -0.3715F, 0.9673F));

		PartDefinition neck9_r6 = body3.addOrReplaceChild("neck9_r6", CubeListBuilder.create().texOffs(42, 89).addBox(7.4813F, -6.1776F, -0.62F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -6.143F, -13.6028F, 0.0469F, -0.4339F, 1.4375F));

		PartDefinition neck8_r6 = body3.addOrReplaceChild("neck8_r6", CubeListBuilder.create().texOffs(42, 91).addBox(7.2579F, -6.1971F, -0.1732F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.8634F, -16.0384F, 0.0464F, -0.4339F, 1.4288F));

		PartDefinition neck7_r5 = body3.addOrReplaceChild("neck7_r5", CubeListBuilder.create().texOffs(111, 118).addBox(4.1969F, -2.5492F, -0.1732F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.8634F, -16.0384F, 0.2338F, -0.3717F, 0.9586F));

		PartDefinition neck6_r4 = body3.addOrReplaceChild("neck6_r4", CubeListBuilder.create().texOffs(86, 113).addBox(-0.0908F, -0.1092F, -0.1732F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.8634F, -16.0384F, 0.3862F, -0.2082F, 0.4383F));

		PartDefinition neck7_r6 = body3.addOrReplaceChild("neck7_r6", CubeListBuilder.create().texOffs(0, 20).addBox(7.3383F, -6.1901F, -0.2893F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.9367F, -17.9396F, 0.0425F, -0.4519F, 1.4738F));

		PartDefinition neck6_r5 = body3.addOrReplaceChild("neck6_r5", CubeListBuilder.create().texOffs(74, 118).addBox(4.2668F, -2.5088F, -0.2893F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.9367F, -17.9396F, 0.2392F, -0.3894F, 0.9998F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 34).mirror().addBox(-4.8451F, 3.0787F, -2.4296F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.346F, 4.4235F, -17.4909F, -0.1775F, 1.0326F, 1.3327F));

		PartDefinition cube_r9 = body3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(92, 83).mirror().addBox(-2.4993F, 2.5984F, -2.1893F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.346F, 4.4235F, -17.4909F, -0.3865F, 0.7488F, 1.0308F));

		PartDefinition cube_r10 = body3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(28, 35).mirror().addBox(-2.498F, 1.8615F, -2.3601F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.346F, 4.4235F, -17.4909F, -0.5923F, 0.038F, 0.2881F));

		PartDefinition cube_r11 = body3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(21, 83).mirror().addBox(-3.7423F, -1.6452F, -2.6189F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.346F, 4.4235F, -17.4909F, 0.9515F, -0.3401F, -1.0502F));

		PartDefinition cube_r12 = body3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(12, 26).mirror().addBox(-3.7423F, -0.9352F, -2.3506F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.346F, 4.4235F, -17.4909F, 1.4751F, -0.3401F, -1.0502F));

		PartDefinition cube_r13 = body3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(10, 52).mirror().addBox(-4.1834F, -0.5339F, 0.0958F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.346F, 4.4235F, -17.4909F, 0.7124F, -0.1868F, -0.4057F));

		PartDefinition cube_r14 = body3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(56, 43).mirror().addBox(-4.1834F, -0.5386F, -0.539F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.346F, 4.4235F, -17.4909F, 1.1836F, -0.1868F, -0.4057F));

		PartDefinition cube_r15 = body3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-5.4F, -1.5021F, 0.9758F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 26).addBox(11.2F, -1.5021F, 0.9758F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.346F, 4.4235F, -17.4909F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(28, 35).addBox(-2.502F, 1.8615F, -2.3601F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.454F, 4.4235F, -17.4909F, -0.5923F, -0.038F, -0.2881F));

		PartDefinition cube_r17 = body3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(12, 34).addBox(0.8451F, 3.0787F, -2.4296F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.454F, 4.4235F, -17.4909F, -0.1775F, -1.0326F, -1.3327F));

		PartDefinition cube_r18 = body3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(92, 83).addBox(-1.5007F, 2.5984F, -2.1893F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.454F, 4.4235F, -17.4909F, -0.3865F, -0.7488F, -1.0308F));

		PartDefinition cube_r19 = body3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(10, 52).addBox(3.1834F, -0.5339F, 0.0958F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.454F, 4.4235F, -17.4909F, 0.7124F, 0.1868F, 0.4057F));

		PartDefinition cube_r20 = body3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(56, 43).addBox(3.1834F, -0.5386F, -0.539F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.454F, 4.4235F, -17.4909F, 1.1836F, 0.1868F, 0.4057F));

		PartDefinition cube_r21 = body3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(12, 26).addBox(2.7423F, -0.9352F, -2.3506F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.454F, 4.4235F, -17.4909F, 1.4751F, 0.3401F, 1.0502F));

		PartDefinition cube_r22 = body3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(21, 83).addBox(2.7423F, -1.6452F, -2.6189F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.454F, 4.4235F, -17.4909F, 0.9515F, 0.3401F, 1.0502F));

		PartDefinition cube_r23 = body3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(119, 31).addBox(-3.4F, 2.5111F, -1.8919F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.954F, 4.4235F, -17.4909F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck5_r5 = body3.addOrReplaceChild("neck5_r5", CubeListBuilder.create().texOffs(99, 113).addBox(-0.0504F, -0.0393F, -0.2893F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.9367F, -17.9396F, 0.3997F, -0.221F, 0.4787F));

		PartDefinition neck5_r6 = body3.addOrReplaceChild("neck5_r6", CubeListBuilder.create().texOffs(116, 8).addBox(4.081F, -2.6161F, -0.3522F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7112F, -19.8681F, 0.2563F, -0.4207F, 1.0802F));

		PartDefinition neck7_r7 = body3.addOrReplaceChild("neck7_r7", CubeListBuilder.create().texOffs(122, 21).addBox(-4.024F, -2.1069F, 5.6462F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 122).addBox(-4.024F, -2.5069F, 7.6462F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.024F, -6.574F, -26.0151F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck13_r6 = body3.addOrReplaceChild("neck13_r6", CubeListBuilder.create().texOffs(102, 88).addBox(0.0F, -1.4973F, -0.5523F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.1265F, -3.4352F, -0.3229F, 0.0F, 0.0F));

		PartDefinition neck12_r7 = body3.addOrReplaceChild("neck12_r7", CubeListBuilder.create().texOffs(7, 26).addBox(0.0F, -1.5967F, -0.3627F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.157F, -5.6336F, -0.3229F, 0.0F, 0.0F));

		PartDefinition neck11_r7 = body3.addOrReplaceChild("neck11_r7", CubeListBuilder.create().texOffs(104, 0).addBox(0.0F, -1.9945F, -0.6045F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7671F, -7.6436F, -0.3229F, 0.0F, 0.0F));

		PartDefinition neck10_r7 = body3.addOrReplaceChild("neck10_r7", CubeListBuilder.create().texOffs(0, 122).addBox(0.0F, -1.4973F, -0.5523F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.2773F, -9.6535F, -0.3316F, 0.0F, 0.0F));

		PartDefinition neck9_r7 = body3.addOrReplaceChild("neck9_r7", CubeListBuilder.create().texOffs(121, 120).addBox(0.0F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.2902F, -11.7157F, -0.2793F, 0.0F, 0.0F));

		PartDefinition neck8_r7 = body3.addOrReplaceChild("neck8_r7", CubeListBuilder.create().texOffs(104, 17).addBox(0.0F, -1.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3003F, -13.7257F, -0.2356F, 0.0F, 0.0F));

		PartDefinition neck7_r8 = body3.addOrReplaceChild("neck7_r8", CubeListBuilder.create().texOffs(3, 122).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3105F, -15.7356F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck6_r6 = body3.addOrReplaceChild("neck6_r6", CubeListBuilder.create().texOffs(28, 47).addBox(7.1245F, -6.2088F, -0.3522F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7112F, -19.8681F, 0.042F, -0.487F, 1.5611F));

		PartDefinition neck4_r6 = body3.addOrReplaceChild("neck4_r6", CubeListBuilder.create().texOffs(114, 88).addBox(-0.1577F, -0.2252F, -0.3522F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7112F, -19.8681F, 0.4297F, -0.2403F, 0.559F));

		PartDefinition underbelly2 = lowerbody1.addOrReplaceChild("underbelly2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.769F, -16.2795F, -0.3491F, 0.0F, 0.0F));

		PartDefinition underbelly3_r1 = underbelly2.addOrReplaceChild("underbelly3_r1", CubeListBuilder.create().texOffs(56, 43).addBox(-8.0F, -3.0732F, -1.8049F, 16.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, 3.3F, 0.0262F, 0.0F, 0.0F));

		PartDefinition body2 = lowerbody2.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.0F, 5.4991F, 2.0517F));

		PartDefinition body2_r2 = body2.addOrReplaceChild("body2_r2", CubeListBuilder.create().texOffs(57, 58).addBox(-1.0F, -0.5082F, -0.2112F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -6.3919F, -21.7934F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck22_r1 = body2.addOrReplaceChild("neck22_r1", CubeListBuilder.create().texOffs(64, 96).addBox(0.0F, -0.1226F, -0.7599F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.2565F, -3.255F, -0.288F, 0.0F, 0.0F));

		PartDefinition neck21_r1 = body2.addOrReplaceChild("neck21_r1", CubeListBuilder.create().texOffs(92, 58).addBox(0.0F, 0.215F, -2.9359F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 93).addBox(0.0F, 0.5752F, -4.9058F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 120).addBox(0.0F, 0.9354F, -6.8756F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 120).addBox(0.0F, 1.3947F, -8.8324F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 120).addBox(0.0F, 1.8541F, -10.7892F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 121).addBox(0.0F, 2.3134F, -12.7459F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.2565F, -3.255F, -0.2007F, 0.0F, 0.0F));

		PartDefinition neck15_r2 = body2.addOrReplaceChild("neck15_r2", CubeListBuilder.create().texOffs(94, 0).addBox(0.0F, 2.1528F, -14.9191F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.2565F, -3.255F, -0.1571F, 0.0F, 0.0F));

		PartDefinition neck25_r1 = body2.addOrReplaceChild("neck25_r1", CubeListBuilder.create().texOffs(74, 37).mirror().addBox(-20.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.3075F, -2.383F, 0.0278F, 0.2778F, -1.4619F));

		PartDefinition neck24_r1 = body2.addOrReplaceChild("neck24_r1", CubeListBuilder.create().texOffs(111, 116).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.3075F, -2.383F, 0.1448F, 0.2396F, -1.012F));

		PartDefinition neck23_r1 = body2.addOrReplaceChild("neck23_r1", CubeListBuilder.create().texOffs(107, 82).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.3075F, -2.383F, 0.2447F, 0.1358F, -0.4891F));

		PartDefinition neck24_r2 = body2.addOrReplaceChild("neck24_r2", CubeListBuilder.create().texOffs(74, 81).mirror().addBox(-20.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.4075F, -4.383F, 0.0304F, 0.2951F, -1.4437F));

		PartDefinition neck22_r2 = body2.addOrReplaceChild("neck22_r2", CubeListBuilder.create().texOffs(107, 84).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.4075F, -4.383F, 0.2605F, 0.1435F, -0.4694F));

		PartDefinition neck23_r2 = body2.addOrReplaceChild("neck23_r2", CubeListBuilder.create().texOffs(117, 0).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.4075F, -4.383F, 0.1549F, 0.254F, -0.9921F));

		PartDefinition neck21_r2 = body2.addOrReplaceChild("neck21_r2", CubeListBuilder.create().texOffs(108, 95).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.5075F, -6.383F, 0.2764F, 0.1511F, -0.4497F));

		PartDefinition neck22_r3 = body2.addOrReplaceChild("neck22_r3", CubeListBuilder.create().texOffs(117, 2).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.5075F, -6.383F, 0.165F, 0.2684F, -0.972F));

		PartDefinition neck23_r3 = body2.addOrReplaceChild("neck23_r3", CubeListBuilder.create().texOffs(86, 15).mirror().addBox(-20.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.5075F, -6.383F, 0.0331F, 0.3124F, -1.4254F));

		PartDefinition neck22_r4 = body2.addOrReplaceChild("neck22_r4", CubeListBuilder.create().texOffs(87, 39).mirror().addBox(-20.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.6075F, -8.383F, 0.0357F, 0.3297F, -1.4246F));

		PartDefinition neck21_r3 = body2.addOrReplaceChild("neck21_r3", CubeListBuilder.create().texOffs(117, 12).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.6075F, -8.383F, 0.1753F, 0.2829F, -0.9692F));

		PartDefinition neck20_r1 = body2.addOrReplaceChild("neck20_r1", CubeListBuilder.create().texOffs(108, 97).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.6075F, -8.383F, 0.2923F, 0.1586F, -0.4472F));

		PartDefinition neck19_r1 = body2.addOrReplaceChild("neck19_r1", CubeListBuilder.create().texOffs(30, 109).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.6075F, -10.383F, 0.3083F, 0.1662F, -0.4446F));

		PartDefinition neck20_r2 = body2.addOrReplaceChild("neck20_r2", CubeListBuilder.create().texOffs(117, 17).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.6075F, -10.383F, 0.1856F, 0.2972F, -0.9662F));

		PartDefinition neck21_r4 = body2.addOrReplaceChild("neck21_r4", CubeListBuilder.create().texOffs(87, 41).mirror().addBox(-20.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.6075F, -10.383F, 0.0384F, 0.3469F, -1.4237F));

		PartDefinition neck20_r3 = body2.addOrReplaceChild("neck20_r3", CubeListBuilder.create().texOffs(100, 43).mirror().addBox(-20.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -12.383F, 0.0398F, 0.3555F, -1.4232F));

		PartDefinition neck19_r2 = body2.addOrReplaceChild("neck19_r2", CubeListBuilder.create().texOffs(117, 19).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -12.383F, 0.1908F, 0.3044F, -0.9647F));

		PartDefinition neck18_r1 = body2.addOrReplaceChild("neck18_r1", CubeListBuilder.create().texOffs(88, 109).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -12.383F, 0.3163F, 0.1699F, -0.4433F));

		PartDefinition neck17_r1 = body2.addOrReplaceChild("neck17_r1", CubeListBuilder.create().texOffs(74, 110).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -14.383F, 0.3323F, 0.1774F, -0.4405F));

		PartDefinition neck19_r3 = body2.addOrReplaceChild("neck19_r3", CubeListBuilder.create().texOffs(100, 45).mirror().addBox(-20.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -14.383F, 0.0426F, 0.3728F, -1.4222F));

		PartDefinition neck18_r2 = body2.addOrReplaceChild("neck18_r2", CubeListBuilder.create().texOffs(30, 117).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -14.383F, 0.2013F, 0.3187F, -0.9615F));

		PartDefinition neck17_r2 = body2.addOrReplaceChild("neck17_r2", CubeListBuilder.create().texOffs(117, 73).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -16.383F, 0.2118F, 0.333F, -0.9581F));

		PartDefinition neck18_r3 = body2.addOrReplaceChild("neck18_r3", CubeListBuilder.create().texOffs(100, 47).mirror().addBox(-20.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -16.383F, 0.0454F, 0.3901F, -1.4212F));

		PartDefinition neck16_r1 = body2.addOrReplaceChild("neck16_r1", CubeListBuilder.create().texOffs(110, 103).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -16.383F, 0.3484F, 0.1848F, -0.4376F));

		PartDefinition neck17_r3 = body2.addOrReplaceChild("neck17_r3", CubeListBuilder.create().texOffs(100, 49).mirror().addBox(-20.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -18.383F, 0.0482F, 0.4073F, -1.4201F));

		PartDefinition neck16_r2 = body2.addOrReplaceChild("neck16_r2", CubeListBuilder.create().texOffs(117, 75).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -18.383F, 0.2225F, 0.3473F, -0.9545F));

		PartDefinition neck15_r3 = body2.addOrReplaceChild("neck15_r3", CubeListBuilder.create().texOffs(110, 105).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -18.383F, 0.3645F, 0.1922F, -0.4346F));

		PartDefinition neck14_r4 = body2.addOrReplaceChild("neck14_r4", CubeListBuilder.create().texOffs(110, 107).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -20.383F, 0.3645F, 0.1922F, -0.4346F));

		PartDefinition neck15_r4 = body2.addOrReplaceChild("neck15_r4", CubeListBuilder.create().texOffs(117, 77).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -20.383F, 0.2225F, 0.3473F, -0.9545F));

		PartDefinition neck16_r3 = body2.addOrReplaceChild("neck16_r3", CubeListBuilder.create().texOffs(100, 51).mirror().addBox(-20.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7075F, -20.383F, 0.0482F, 0.4073F, -1.4201F));

		PartDefinition neck24_r3 = body2.addOrReplaceChild("neck24_r3", CubeListBuilder.create().texOffs(74, 37).addBox(7.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.3075F, -2.383F, 0.0278F, -0.2778F, 1.4619F));

		PartDefinition neck23_r4 = body2.addOrReplaceChild("neck23_r4", CubeListBuilder.create().texOffs(111, 116).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.3075F, -2.383F, 0.1448F, -0.2396F, 1.012F));

		PartDefinition neck22_r5 = body2.addOrReplaceChild("neck22_r5", CubeListBuilder.create().texOffs(107, 82).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.3075F, -2.383F, 0.2447F, -0.1358F, 0.4891F));

		PartDefinition neck23_r5 = body2.addOrReplaceChild("neck23_r5", CubeListBuilder.create().texOffs(74, 81).addBox(7.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.4075F, -4.383F, 0.0304F, -0.2951F, 1.4437F));

		PartDefinition neck22_r6 = body2.addOrReplaceChild("neck22_r6", CubeListBuilder.create().texOffs(117, 0).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.4075F, -4.383F, 0.1549F, -0.254F, 0.9921F));

		PartDefinition neck21_r5 = body2.addOrReplaceChild("neck21_r5", CubeListBuilder.create().texOffs(107, 84).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.4075F, -4.383F, 0.2605F, -0.1435F, 0.4694F));

		PartDefinition neck22_r7 = body2.addOrReplaceChild("neck22_r7", CubeListBuilder.create().texOffs(86, 15).addBox(7.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.5075F, -6.383F, 0.0331F, -0.3124F, 1.4254F));

		PartDefinition neck21_r6 = body2.addOrReplaceChild("neck21_r6", CubeListBuilder.create().texOffs(117, 2).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.5075F, -6.383F, 0.165F, -0.2684F, 0.972F));

		PartDefinition neck20_r4 = body2.addOrReplaceChild("neck20_r4", CubeListBuilder.create().texOffs(108, 95).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.5075F, -6.383F, 0.2764F, -0.1511F, 0.4497F));

		PartDefinition neck21_r7 = body2.addOrReplaceChild("neck21_r7", CubeListBuilder.create().texOffs(87, 39).addBox(7.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.6075F, -8.383F, 0.0357F, -0.3297F, 1.4246F));

		PartDefinition neck20_r5 = body2.addOrReplaceChild("neck20_r5", CubeListBuilder.create().texOffs(117, 12).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.6075F, -8.383F, 0.1753F, -0.2829F, 0.9692F));

		PartDefinition neck19_r4 = body2.addOrReplaceChild("neck19_r4", CubeListBuilder.create().texOffs(108, 97).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.6075F, -8.383F, 0.2923F, -0.1586F, 0.4472F));

		PartDefinition neck20_r6 = body2.addOrReplaceChild("neck20_r6", CubeListBuilder.create().texOffs(87, 41).addBox(7.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.6075F, -10.383F, 0.0384F, -0.3469F, 1.4237F));

		PartDefinition neck19_r5 = body2.addOrReplaceChild("neck19_r5", CubeListBuilder.create().texOffs(117, 17).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.6075F, -10.383F, 0.1856F, -0.2972F, 0.9662F));

		PartDefinition neck18_r4 = body2.addOrReplaceChild("neck18_r4", CubeListBuilder.create().texOffs(30, 109).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.6075F, -10.383F, 0.3083F, -0.1662F, 0.4446F));

		PartDefinition neck19_r6 = body2.addOrReplaceChild("neck19_r6", CubeListBuilder.create().texOffs(100, 43).addBox(7.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -12.383F, 0.0398F, -0.3555F, 1.4232F));

		PartDefinition neck18_r5 = body2.addOrReplaceChild("neck18_r5", CubeListBuilder.create().texOffs(117, 19).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -12.383F, 0.1908F, -0.3044F, 0.9647F));

		PartDefinition neck17_r4 = body2.addOrReplaceChild("neck17_r4", CubeListBuilder.create().texOffs(88, 109).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -12.383F, 0.3163F, -0.1699F, 0.4433F));

		PartDefinition neck18_r6 = body2.addOrReplaceChild("neck18_r6", CubeListBuilder.create().texOffs(100, 45).addBox(7.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -14.383F, 0.0426F, -0.3728F, 1.4222F));

		PartDefinition neck17_r5 = body2.addOrReplaceChild("neck17_r5", CubeListBuilder.create().texOffs(30, 117).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -14.383F, 0.2013F, -0.3187F, 0.9615F));

		PartDefinition neck16_r4 = body2.addOrReplaceChild("neck16_r4", CubeListBuilder.create().texOffs(74, 110).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -14.383F, 0.3323F, -0.1774F, 0.4405F));

		PartDefinition neck17_r6 = body2.addOrReplaceChild("neck17_r6", CubeListBuilder.create().texOffs(100, 47).addBox(7.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -16.383F, 0.0454F, -0.3901F, 1.4212F));

		PartDefinition neck16_r5 = body2.addOrReplaceChild("neck16_r5", CubeListBuilder.create().texOffs(117, 73).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -16.383F, 0.2118F, -0.333F, 0.9581F));

		PartDefinition neck15_r5 = body2.addOrReplaceChild("neck15_r5", CubeListBuilder.create().texOffs(110, 103).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -16.383F, 0.3484F, -0.1848F, 0.4376F));

		PartDefinition neck16_r6 = body2.addOrReplaceChild("neck16_r6", CubeListBuilder.create().texOffs(100, 49).addBox(7.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -18.383F, 0.0482F, -0.4073F, 1.4201F));

		PartDefinition neck15_r6 = body2.addOrReplaceChild("neck15_r6", CubeListBuilder.create().texOffs(117, 75).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -18.383F, 0.2225F, -0.3473F, 0.9545F));

		PartDefinition neck14_r5 = body2.addOrReplaceChild("neck14_r5", CubeListBuilder.create().texOffs(110, 105).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -18.383F, 0.3645F, -0.1922F, 0.4346F));

		PartDefinition neck15_r7 = body2.addOrReplaceChild("neck15_r7", CubeListBuilder.create().texOffs(100, 51).addBox(7.4186F, -6.1831F, -0.4055F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -20.383F, 0.0482F, -0.4073F, 1.4201F));

		PartDefinition neck14_r6 = body2.addOrReplaceChild("neck14_r6", CubeListBuilder.create().texOffs(117, 77).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -20.383F, 0.2225F, -0.3473F, 0.9545F));

		PartDefinition neck13_r7 = body2.addOrReplaceChild("neck13_r7", CubeListBuilder.create().texOffs(110, 107).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7075F, -20.383F, 0.3645F, -0.1922F, 0.4346F));

		PartDefinition neck14_r7 = body2.addOrReplaceChild("neck14_r7", CubeListBuilder.create().texOffs(30, 121).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.8423F, -20.0728F, -0.2443F, 0.0F, 0.0F));

		PartDefinition underbelly3 = lowerbody3.addOrReplaceChild("underbelly3", CubeListBuilder.create().texOffs(28, 26).addBox(-8.0F, -2.0945F, -0.007F, 16.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 19.8772F, -12.0113F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body1 = lowerbody3.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.1772F, 0.9887F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body1_r1 = body1.addOrReplaceChild("body1_r1", CubeListBuilder.create().texOffs(28, 67).addBox(-1.0F, -1.3106F, -0.1054F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.2892F, -17.905F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck30_r1 = body1.addOrReplaceChild("neck30_r1", CubeListBuilder.create().texOffs(86, 0).addBox(0.0F, -2.7116F, 13.7391F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 86).addBox(0.0F, -2.6116F, 11.7391F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 52).addBox(0.0F, -2.5116F, 9.7391F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 58).addBox(0.0F, -2.4116F, 7.7391F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 52).addBox(0.0F, -2.3116F, 5.7391F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 59).addBox(0.0F, -2.1145F, 3.7809F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 43).addBox(0.0F, -2.0145F, 1.7809F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 0).addBox(0.0F, -1.8145F, -0.2191F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.969F, -17.3723F, -0.1571F, 0.0F, 0.0F));

		PartDefinition neck32_r1 = body1.addOrReplaceChild("neck32_r1", CubeListBuilder.create().texOffs(50, 81).mirror().addBox(-13.4186F, -6.1831F, -0.4055F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.0084F, -2.9313F, 0.0089F, 0.1483F, -1.5008F));

		PartDefinition neck31_r1 = body1.addOrReplaceChild("neck31_r1", CubeListBuilder.create().texOffs(24, 67).mirror().addBox(-14.4186F, -6.1831F, -0.4055F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.0084F, -5.4313F, 0.0151F, 0.1915F, -1.4823F));

		PartDefinition neck30_r2 = body1.addOrReplaceChild("neck30_r2", CubeListBuilder.create().texOffs(115, 110).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.0084F, -5.4313F, 0.0953F, 0.167F, -1.0394F));

		PartDefinition neck31_r2 = body1.addOrReplaceChild("neck31_r2", CubeListBuilder.create().texOffs(115, 101).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.0084F, -2.9313F, 0.0711F, 0.1305F, -1.0605F));

		PartDefinition neck30_r3 = body1.addOrReplaceChild("neck30_r3", CubeListBuilder.create().texOffs(104, 7).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.0084F, -2.9313F, 0.1268F, 0.0776F, -0.5366F));

		PartDefinition neck29_r1 = body1.addOrReplaceChild("neck29_r1", CubeListBuilder.create().texOffs(104, 9).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.0084F, -5.4313F, 0.1659F, 0.0972F, -0.5157F));

		PartDefinition neck28_r1 = body1.addOrReplaceChild("neck28_r1", CubeListBuilder.create().texOffs(112, 69).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.2084F, -7.4313F, 0.2131F, 0.1204F, -0.5106F));

		PartDefinition neck29_r2 = body1.addOrReplaceChild("neck29_r2", CubeListBuilder.create().texOffs(116, 10).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.2084F, -7.4313F, 0.1248F, 0.2106F, -1.0339F));

		PartDefinition neck30_r4 = body1.addOrReplaceChild("neck30_r4", CubeListBuilder.create().texOffs(28, 45).mirror().addBox(-15.4186F, -6.1831F, -0.4055F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.2084F, -7.4313F, 0.0227F, 0.2433F, -1.4807F));

		PartDefinition neck29_r3 = body1.addOrReplaceChild("neck29_r3", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-16.4186F, -6.1831F, -0.4055F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.4084F, -9.4313F, 0.0304F, 0.2951F, -1.4786F));

		PartDefinition neck28_r2 = body1.addOrReplaceChild("neck28_r2", CubeListBuilder.create().texOffs(116, 25).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.4084F, -9.4313F, 0.1549F, 0.254F, -1.027F));

		PartDefinition neck27_r1 = body1.addOrReplaceChild("neck27_r1", CubeListBuilder.create().texOffs(74, 112).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.4084F, -9.4313F, 0.2605F, 0.1435F, -0.5044F));

		PartDefinition neck26_r1 = body1.addOrReplaceChild("neck26_r1", CubeListBuilder.create().texOffs(111, 112).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.5084F, -11.4313F, 0.3003F, 0.1624F, -0.5157F));

		PartDefinition neck27_r2 = body1.addOrReplaceChild("neck27_r2", CubeListBuilder.create().texOffs(116, 27).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.5084F, -11.4313F, 0.1804F, 0.29F, -1.0375F));

		PartDefinition neck28_r3 = body1.addOrReplaceChild("neck28_r3", CubeListBuilder.create().texOffs(28, 43).mirror().addBox(-17.4186F, -6.1831F, -0.4055F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.5084F, -11.4313F, 0.0371F, 0.3383F, -1.494F));

		PartDefinition neck27_r3 = body1.addOrReplaceChild("neck27_r3", CubeListBuilder.create().texOffs(42, 87).mirror().addBox(-18.4186F, -6.1831F, -0.4055F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.5084F, -13.4313F, 0.044F, 0.3814F, -1.4915F));

		PartDefinition neck26_r2 = body1.addOrReplaceChild("neck26_r2", CubeListBuilder.create().texOffs(116, 29).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.5084F, -13.4313F, 0.2065F, 0.3259F, -1.0296F));

		PartDefinition neck25_r2 = body1.addOrReplaceChild("neck25_r2", CubeListBuilder.create().texOffs(30, 113).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.5084F, -13.4313F, 0.3403F, 0.1811F, -0.5089F));

		PartDefinition neck24_r4 = body1.addOrReplaceChild("neck24_r4", CubeListBuilder.create().texOffs(104, 11).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7084F, -15.4313F, 0.3645F, 0.1922F, -0.487F));

		PartDefinition neck25_r3 = body1.addOrReplaceChild("neck25_r3", CubeListBuilder.create().texOffs(74, 116).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7084F, -15.4313F, 0.2225F, 0.3473F, -1.0069F));

		PartDefinition neck26_r3 = body1.addOrReplaceChild("neck26_r3", CubeListBuilder.create().texOffs(100, 62).mirror().addBox(-19.4186F, -6.1831F, -0.4055F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -5.7084F, -15.4313F, 0.0482F, 0.4073F, -1.4725F));

		PartDefinition neck29_r4 = body1.addOrReplaceChild("neck29_r4", CubeListBuilder.create().texOffs(104, 7).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.0084F, -3.4313F, 0.1268F, -0.0776F, 0.5366F));

		PartDefinition neck30_r5 = body1.addOrReplaceChild("neck30_r5", CubeListBuilder.create().texOffs(115, 101).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.0084F, -3.4313F, 0.0711F, -0.1305F, 1.0605F));

		PartDefinition neck31_r3 = body1.addOrReplaceChild("neck31_r3", CubeListBuilder.create().texOffs(50, 81).addBox(7.4186F, -6.1831F, -0.4055F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.0084F, -3.4313F, 0.0089F, -0.1483F, 1.5008F));

		PartDefinition neck28_r4 = body1.addOrReplaceChild("neck28_r4", CubeListBuilder.create().texOffs(104, 9).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.0084F, -5.4313F, 0.1659F, -0.0972F, 0.5157F));

		PartDefinition neck29_r5 = body1.addOrReplaceChild("neck29_r5", CubeListBuilder.create().texOffs(115, 110).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.0084F, -5.4313F, 0.0953F, -0.167F, 1.0394F));

		PartDefinition neck30_r6 = body1.addOrReplaceChild("neck30_r6", CubeListBuilder.create().texOffs(24, 67).addBox(7.4186F, -6.1831F, -0.4055F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.0084F, -5.4313F, 0.0151F, -0.1915F, 1.4823F));

		PartDefinition neck27_r4 = body1.addOrReplaceChild("neck27_r4", CubeListBuilder.create().texOffs(112, 69).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.2084F, -7.4313F, 0.2131F, -0.1204F, 0.5106F));

		PartDefinition neck28_r5 = body1.addOrReplaceChild("neck28_r5", CubeListBuilder.create().texOffs(116, 10).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.2084F, -7.4313F, 0.1248F, -0.2106F, 1.0339F));

		PartDefinition neck29_r6 = body1.addOrReplaceChild("neck29_r6", CubeListBuilder.create().texOffs(28, 45).addBox(7.4186F, -6.1831F, -0.4055F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.2084F, -7.4313F, 0.0227F, -0.2433F, 1.4807F));

		PartDefinition neck26_r4 = body1.addOrReplaceChild("neck26_r4", CubeListBuilder.create().texOffs(74, 112).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.4084F, -9.4313F, 0.2605F, -0.1435F, 0.5044F));

		PartDefinition neck27_r5 = body1.addOrReplaceChild("neck27_r5", CubeListBuilder.create().texOffs(116, 25).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.4084F, -9.4313F, 0.1549F, -0.254F, 1.027F));

		PartDefinition neck28_r6 = body1.addOrReplaceChild("neck28_r6", CubeListBuilder.create().texOffs(0, 18).addBox(7.4186F, -6.1831F, -0.4055F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.4084F, -9.4313F, 0.0304F, -0.2951F, 1.4786F));

		PartDefinition neck26_r5 = body1.addOrReplaceChild("neck26_r5", CubeListBuilder.create().texOffs(116, 27).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.5084F, -11.4313F, 0.1804F, -0.29F, 1.0375F));

		PartDefinition neck25_r4 = body1.addOrReplaceChild("neck25_r4", CubeListBuilder.create().texOffs(111, 112).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.5084F, -11.4313F, 0.3003F, -0.1624F, 0.5157F));

		PartDefinition neck27_r6 = body1.addOrReplaceChild("neck27_r6", CubeListBuilder.create().texOffs(28, 43).addBox(7.4186F, -6.1831F, -0.4055F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.5084F, -11.4313F, 0.0371F, -0.3383F, 1.494F));

		PartDefinition neck25_r5 = body1.addOrReplaceChild("neck25_r5", CubeListBuilder.create().texOffs(116, 29).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.5084F, -13.4313F, 0.2065F, -0.3259F, 1.0296F));

		PartDefinition neck24_r5 = body1.addOrReplaceChild("neck24_r5", CubeListBuilder.create().texOffs(30, 113).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.5084F, -13.4313F, 0.3403F, -0.1811F, 0.5089F));

		PartDefinition neck26_r6 = body1.addOrReplaceChild("neck26_r6", CubeListBuilder.create().texOffs(42, 87).addBox(7.4186F, -6.1831F, -0.4055F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.5084F, -13.4313F, 0.044F, -0.3814F, 1.4915F));

		PartDefinition neck25_r6 = body1.addOrReplaceChild("neck25_r6", CubeListBuilder.create().texOffs(100, 62).addBox(7.4186F, -6.1831F, -0.4055F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7084F, -15.4313F, 0.0482F, -0.4073F, 1.4725F));

		PartDefinition neck24_r6 = body1.addOrReplaceChild("neck24_r6", CubeListBuilder.create().texOffs(74, 116).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7084F, -15.4313F, 0.2225F, -0.3473F, 1.0069F));

		PartDefinition neck23_r6 = body1.addOrReplaceChild("neck23_r6", CubeListBuilder.create().texOffs(104, 11).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7084F, -15.4313F, 0.3645F, -0.1922F, 0.487F));

		PartDefinition hips = tailbase1.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -5.7079F, 0.0402F, 2.0F, 2.0F, 23.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.054F, 4.4713F, 20.0883F, -0.0281F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(9, 62).mirror().addBox(-1.0432F, -0.6349F, -3.3137F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7062F, 4.8536F, 14.3032F, 1.3491F, -0.1138F, -1.0399F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(38, 52).mirror().addBox(-0.8956F, -0.7307F, -4.3412F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7062F, 4.8536F, 15.3032F, 1.9844F, 0.5922F, -1.1363F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(74, 26).mirror().addBox(-1.1127F, -0.4252F, -0.7205F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7062F, 4.8536F, 14.3032F, 1.4037F, -0.0147F, 0.2197F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(38, 52).addBox(-0.1044F, -0.7307F, -4.3412F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8142F, 4.8536F, 15.3032F, 1.9844F, -0.5922F, 1.1363F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(9, 62).addBox(0.0432F, -0.6349F, -3.3137F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8142F, 4.8536F, 14.3032F, 1.3491F, 0.1138F, 1.0399F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(74, 26).addBox(0.1127F, -0.4252F, -0.7205F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8142F, 4.8536F, 14.3032F, 1.4037F, 0.0147F, -0.2197F));

		PartDefinition neck41_r3 = hips.addOrReplaceChild("neck41_r3", CubeListBuilder.create().texOffs(99, 88).addBox(0.0F, -3.1499F, 19.9691F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 94).addBox(0.0F, -3.0499F, 17.9691F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 102).addBox(0.0F, -2.8499F, 15.9691F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 17).addBox(0.0F, -2.6499F, 13.9691F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 113).addBox(0.0F, -2.5499F, 11.9691F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 121).addBox(0.0F, -2.3499F, 9.9691F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 25).addBox(0.0F, -2.1499F, 7.9691F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 74).addBox(0.0F, -1.9499F, 5.9691F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 109).addBox(0.0F, -1.7499F, 3.9691F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 102).addBox(0.0F, -1.4499F, 1.9691F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 25).addBox(0.0F, -1.2452F, -0.0841F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0823F, 0.5148F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck40_r2 = hips.addOrReplaceChild("neck40_r2", CubeListBuilder.create().texOffs(120, 6).mirror().addBox(-2.9899F, 0.0305F, -0.4055F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.3391F, 22.3975F, 0.0454F, 0.0948F, -1.0109F));

		PartDefinition neck39_r1 = hips.addOrReplaceChild("neck39_r1", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-3.9899F, 0.0305F, -0.4055F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.3391F, 20.3975F, 0.0099F, 0.0183F, -0.996F));

		PartDefinition neck38_r1 = hips.addOrReplaceChild("neck38_r1", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.3391F, 18.3975F, -0.0922F, -0.0576F, -0.9774F));

		PartDefinition neck39_r2 = hips.addOrReplaceChild("neck39_r2", CubeListBuilder.create().texOffs(82, 76).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 16.3975F, -0.1456F, -0.061F, -0.9577F));

		PartDefinition neck40_r3 = hips.addOrReplaceChild("neck40_r3", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-5.3366F, -2.4685F, -0.4055F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 16.3975F, -0.0958F, -0.1256F, -1.4798F));

		PartDefinition neck37_r1 = hips.addOrReplaceChild("neck37_r1", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 14.3975F, -0.1456F, -0.061F, -0.9228F));

		PartDefinition neck38_r2 = hips.addOrReplaceChild("neck38_r2", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-6.3366F, -2.4685F, -0.4055F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 14.3975F, -0.0958F, -0.1256F, -1.4449F));

		PartDefinition neck37_r2 = hips.addOrReplaceChild("neck37_r2", CubeListBuilder.create().texOffs(83, 102).mirror().addBox(-8.3366F, -2.4685F, -0.4055F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 12.3975F, -0.0671F, -0.0817F, -1.3955F));

		PartDefinition neck36_r1 = hips.addOrReplaceChild("neck36_r1", CubeListBuilder.create().texOffs(74, 91).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 12.3975F, -0.0989F, -0.0373F, -0.8728F));

		PartDefinition neck35_r1 = hips.addOrReplaceChild("neck35_r1", CubeListBuilder.create().texOffs(23, 96).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 10.3975F, -0.06F, -0.0175F, -0.8215F));

		PartDefinition neck36_r2 = hips.addOrReplaceChild("neck36_r2", CubeListBuilder.create().texOffs(30, 115).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 10.3975F, -0.0433F, -0.0451F, -1.3446F));

		PartDefinition neck36_r3 = hips.addOrReplaceChild("neck36_r3", CubeListBuilder.create().texOffs(23, 94).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 8.3975F, -0.06F, -0.0175F, -0.7691F));

		PartDefinition neck37_r3 = hips.addOrReplaceChild("neck37_r3", CubeListBuilder.create().texOffs(24, 71).mirror().addBox(-10.3366F, -2.4685F, -0.4055F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 8.3975F, -0.0433F, -0.0451F, -1.2923F));

		PartDefinition neck36_r4 = hips.addOrReplaceChild("neck36_r4", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-9.4186F, -6.1831F, -0.4055F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 6.3975F, -0.0141F, -0.016F, -1.6768F));

		PartDefinition neck35_r2 = hips.addOrReplaceChild("neck35_r2", CubeListBuilder.create().texOffs(115, 38).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 6.3975F, -0.0195F, -0.0085F, -1.2405F));

		PartDefinition neck34_r1 = hips.addOrReplaceChild("neck34_r1", CubeListBuilder.create().texOffs(68, 98).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 6.3975F, -0.0212F, 0.0024F, -0.7171F));

		PartDefinition neck33_r1 = hips.addOrReplaceChild("neck33_r1", CubeListBuilder.create().texOffs(81, 98).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 4.3975F, 0.0177F, 0.0223F, -0.6817F));

		PartDefinition neck34_r2 = hips.addOrReplaceChild("neck34_r2", CubeListBuilder.create().texOffs(115, 40).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 4.3975F, 0.0042F, 0.0281F, -1.2054F));

		PartDefinition neck35_r3 = hips.addOrReplaceChild("neck35_r3", CubeListBuilder.create().texOffs(76, 120).mirror().addBox(-10.4186F, -6.1831F, -0.4055F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 4.3975F, -0.0081F, 0.0273F, -1.6419F));

		PartDefinition neck34_r3 = hips.addOrReplaceChild("neck34_r3", CubeListBuilder.create().texOffs(83, 104).mirror().addBox(-11.4186F, -6.1831F, -0.4055F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 2.3975F, -0.0033F, 0.0618F, -1.6068F));

		PartDefinition neck33_r2 = hips.addOrReplaceChild("neck33_r2", CubeListBuilder.create().texOffs(86, 115).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 2.3975F, 0.0232F, 0.0574F, -1.1697F));

		PartDefinition neck32_r2 = hips.addOrReplaceChild("neck32_r2", CubeListBuilder.create().texOffs(100, 68).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 2.3975F, 0.0488F, 0.0381F, -0.6458F));

		PartDefinition neck31_r4 = hips.addOrReplaceChild("neck31_r4", CubeListBuilder.create().texOffs(102, 101).mirror().addBox(-4.9899F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 0.3975F, 0.0877F, 0.0579F, -0.5916F));

		PartDefinition neck33_r3 = hips.addOrReplaceChild("neck33_r3", CubeListBuilder.create().texOffs(103, 37).mirror().addBox(-12.4186F, -6.1831F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 0.3975F, 0.0028F, 0.105F, -1.5539F));

		PartDefinition neck32_r3 = hips.addOrReplaceChild("neck32_r3", CubeListBuilder.create().texOffs(99, 115).mirror().addBox(-9.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.916F, -4.5391F, 0.3975F, 0.047F, 0.094F, -1.1155F));

		PartDefinition neck35_r4 = hips.addOrReplaceChild("neck35_r4", CubeListBuilder.create().texOffs(23, 94).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 8.3975F, -0.06F, 0.0175F, 0.7691F));

		PartDefinition neck36_r5 = hips.addOrReplaceChild("neck36_r5", CubeListBuilder.create().texOffs(24, 71).addBox(4.3366F, -2.4685F, -0.4055F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 8.3975F, -0.0433F, 0.0451F, 1.2923F));

		PartDefinition neck38_r3 = hips.addOrReplaceChild("neck38_r3", CubeListBuilder.create().texOffs(82, 76).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 16.3975F, -0.1456F, 0.061F, 0.9577F));

		PartDefinition neck39_r3 = hips.addOrReplaceChild("neck39_r3", CubeListBuilder.create().texOffs(0, 14).addBox(4.3366F, -2.4685F, -0.4055F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 16.3975F, -0.0958F, 0.1256F, 1.4798F));

		PartDefinition neck39_r4 = hips.addOrReplaceChild("neck39_r4", CubeListBuilder.create().texOffs(120, 6).addBox(-0.0101F, 0.0305F, -0.4055F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.3391F, 22.3975F, 0.0454F, -0.0948F, 1.0109F));

		PartDefinition neck38_r4 = hips.addOrReplaceChild("neck38_r4", CubeListBuilder.create().texOffs(0, 35).addBox(-0.0101F, 0.0305F, -0.4055F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.3391F, 20.3975F, 0.0099F, -0.0183F, 0.996F));

		PartDefinition neck37_r4 = hips.addOrReplaceChild("neck37_r4", CubeListBuilder.create().texOffs(0, 86).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.3391F, 18.3975F, -0.0922F, 0.0576F, 0.9774F));

		PartDefinition neck37_r5 = hips.addOrReplaceChild("neck37_r5", CubeListBuilder.create().texOffs(0, 57).addBox(4.3366F, -2.4685F, -0.4055F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 14.3975F, -0.0958F, 0.1256F, 1.4449F));

		PartDefinition neck36_r6 = hips.addOrReplaceChild("neck36_r6", CubeListBuilder.create().texOffs(0, 88).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 14.3975F, -0.1456F, 0.061F, 0.9228F));

		PartDefinition neck36_r7 = hips.addOrReplaceChild("neck36_r7", CubeListBuilder.create().texOffs(83, 102).addBox(4.3366F, -2.4685F, -0.4055F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 12.3975F, -0.0671F, 0.0817F, 1.3955F));

		PartDefinition neck35_r5 = hips.addOrReplaceChild("neck35_r5", CubeListBuilder.create().texOffs(74, 91).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 12.3975F, -0.0989F, 0.0373F, 0.8728F));

		PartDefinition neck35_r6 = hips.addOrReplaceChild("neck35_r6", CubeListBuilder.create().texOffs(30, 115).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 10.3975F, -0.0433F, 0.0451F, 1.3446F));

		PartDefinition neck34_r4 = hips.addOrReplaceChild("neck34_r4", CubeListBuilder.create().texOffs(23, 96).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 10.3975F, -0.06F, 0.0175F, 0.8215F));

		PartDefinition neck33_r4 = hips.addOrReplaceChild("neck33_r4", CubeListBuilder.create().texOffs(68, 98).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 6.3975F, -0.0212F, -0.0024F, 0.7171F));

		PartDefinition neck34_r5 = hips.addOrReplaceChild("neck34_r5", CubeListBuilder.create().texOffs(115, 38).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 6.3975F, -0.0195F, 0.0085F, 1.2405F));

		PartDefinition neck35_r7 = hips.addOrReplaceChild("neck35_r7", CubeListBuilder.create().texOffs(0, 67).addBox(7.4186F, -6.1831F, -0.4055F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 6.3975F, -0.0141F, 0.016F, 1.6768F));

		PartDefinition neck33_r5 = hips.addOrReplaceChild("neck33_r5", CubeListBuilder.create().texOffs(115, 40).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 4.3975F, 0.0042F, -0.0281F, 1.2054F));

		PartDefinition neck32_r4 = hips.addOrReplaceChild("neck32_r4", CubeListBuilder.create().texOffs(81, 98).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 4.3975F, 0.0177F, -0.0223F, 0.6817F));

		PartDefinition neck34_r6 = hips.addOrReplaceChild("neck34_r6", CubeListBuilder.create().texOffs(76, 120).addBox(7.4186F, -6.1831F, -0.4055F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 4.3975F, -0.0081F, -0.0273F, 1.6419F));

		PartDefinition neck31_r5 = hips.addOrReplaceChild("neck31_r5", CubeListBuilder.create().texOffs(100, 68).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 2.3975F, 0.0488F, -0.0381F, 0.6458F));

		PartDefinition neck32_r5 = hips.addOrReplaceChild("neck32_r5", CubeListBuilder.create().texOffs(86, 115).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 2.3975F, 0.0232F, -0.0574F, 1.1697F));

		PartDefinition neck33_r6 = hips.addOrReplaceChild("neck33_r6", CubeListBuilder.create().texOffs(83, 104).addBox(7.4186F, -6.1831F, -0.4055F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 2.3975F, -0.0033F, -0.0618F, 1.6068F));

		PartDefinition neck30_r7 = hips.addOrReplaceChild("neck30_r7", CubeListBuilder.create().texOffs(102, 101).addBox(-0.0101F, 0.0305F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 0.3975F, 0.0877F, -0.0579F, 0.5916F));

		PartDefinition neck32_r6 = hips.addOrReplaceChild("neck32_r6", CubeListBuilder.create().texOffs(103, 37).addBox(7.4186F, -6.1831F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 0.3975F, 0.0028F, -0.105F, 1.5539F));

		PartDefinition neck31_r6 = hips.addOrReplaceChild("neck31_r6", CubeListBuilder.create().texOffs(99, 115).addBox(4.3366F, -2.4685F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -4.5391F, 0.3975F, 0.047F, -0.094F, 1.1155F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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