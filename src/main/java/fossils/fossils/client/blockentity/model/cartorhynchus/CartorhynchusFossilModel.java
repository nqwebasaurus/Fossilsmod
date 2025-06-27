package fossils.fossils.client.blockentity.model.cartorhynchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CartorhynchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart body1;
	private final ModelPart chest1;
	private final ModelPart neck1;
	private final ModelPart head1;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart rostrum1;
	private final ModelPart rostrum2;
	private final ModelPart jaw1;
	private final ModelPart jaw2;
	private final ModelPart lowerrostrum1;
	private final ModelPart jaw3;
	private final ModelPart gums;
	private final ModelPart FrontFlipperL;
	private final ModelPart flipper2;
	private final ModelPart flipper6;
	private final ModelPart flipper7;
	private final ModelPart FrontFlipperL2;
	private final ModelPart flipper3;
	private final ModelPart flipper4;
	private final ModelPart flipper5;
	private final ModelPart backflipperL;
	private final ModelPart backflipper2;
	private final ModelPart backflipperL2;
	private final ModelPart backflipper3;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public CartorhynchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.body1 = this.root.getChild("body1");
		this.chest1 = this.body1.getChild("chest1");
		this.neck1 = this.chest1.getChild("neck1");
		this.head1 = this.neck1.getChild("head1");
		this.head2 = this.head1.getChild("head2");
		this.head3 = this.head2.getChild("head3");
		this.rostrum1 = this.head3.getChild("rostrum1");
		this.rostrum2 = this.rostrum1.getChild("rostrum2");
		this.jaw1 = this.head1.getChild("jaw1");
		this.jaw2 = this.jaw1.getChild("jaw2");
		this.lowerrostrum1 = this.jaw2.getChild("lowerrostrum1");
		this.jaw3 = this.jaw2.getChild("jaw3");
		this.gums = this.jaw1.getChild("gums");
		this.FrontFlipperL = this.chest1.getChild("FrontFlipperL");
		this.flipper2 = this.FrontFlipperL.getChild("flipper2");
		this.flipper6 = this.flipper2.getChild("flipper6");
		this.flipper7 = this.FrontFlipperL.getChild("flipper7");
		this.FrontFlipperL2 = this.chest1.getChild("FrontFlipperL2");
		this.flipper3 = this.FrontFlipperL2.getChild("flipper3");
		this.flipper4 = this.flipper3.getChild("flipper4");
		this.flipper5 = this.FrontFlipperL2.getChild("flipper5");
		this.backflipperL = this.root.getChild("backflipperL");
		this.backflipper2 = this.backflipperL.getChild("backflipper2");
		this.backflipperL2 = this.root.getChild("backflipperL2");
		this.backflipper3 = this.backflipperL2.getChild("backflipper3");
		this.tail1 = this.root.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.5F, -6.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition basin6_r1 = root.addOrReplaceChild("basin6_r1", CubeListBuilder.create().texOffs(58, 2).addBox(0.0F, -0.9057F, 8.039F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 58).addBox(0.0F, -0.9057F, 6.039F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 0).addBox(0.0F, -0.9057F, 4.039F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 58).addBox(0.0F, -0.9057F, 2.039F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 76).addBox(0.0F, -0.9057F, 0.039F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, 9.9F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body14_r1 = root.addOrReplaceChild("body14_r1", CubeListBuilder.create().texOffs(58, 11).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.4479F, 16.4851F, -0.0178F, -0.0434F, -0.8311F));

		PartDefinition body13_r1 = root.addOrReplaceChild("body13_r1", CubeListBuilder.create().texOffs(58, 13).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.4479F, 16.4851F, -0.0357F, -0.0467F, -0.438F));

		PartDefinition body12_r1 = root.addOrReplaceChild("body12_r1", CubeListBuilder.create().texOffs(58, 15).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5479F, 14.4851F, 0.0433F, -0.0095F, -0.4402F));

		PartDefinition body14_r2 = root.addOrReplaceChild("body14_r2", CubeListBuilder.create().texOffs(10, 54).mirror().addBox(-4.164F, -2.3194F, -0.5267F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5479F, 14.4851F, 0.0283F, 0.0365F, -1.268F));

		PartDefinition body13_r2 = root.addOrReplaceChild("body13_r2", CubeListBuilder.create().texOffs(28, 60).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5479F, 14.4851F, 0.041F, 0.0211F, -0.8317F));

		PartDefinition body13_r3 = root.addOrReplaceChild("body13_r3", CubeListBuilder.create().texOffs(65, 43).mirror().addBox(-5.164F, -2.3194F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.8479F, 12.4851F, 0.0283F, 0.0365F, -1.268F));

		PartDefinition body12_r2 = root.addOrReplaceChild("body12_r2", CubeListBuilder.create().texOffs(65, 41).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.8479F, 12.4851F, 0.041F, 0.0211F, -0.8317F));

		PartDefinition body11_r1 = root.addOrReplaceChild("body11_r1", CubeListBuilder.create().texOffs(63, 39).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.8479F, 12.4851F, 0.0433F, -0.0095F, -0.4402F));

		PartDefinition body12_r3 = root.addOrReplaceChild("body12_r3", CubeListBuilder.create().texOffs(50, 42).mirror().addBox(-6.164F, -2.3194F, -0.5267F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.8479F, 10.4851F, 0.0545F, 0.1197F, -1.2659F));

		PartDefinition body11_r2 = root.addOrReplaceChild("body11_r2", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.8479F, 10.4851F, 0.1F, 0.0855F, -0.8286F));

		PartDefinition body10_r1 = root.addOrReplaceChild("body10_r1", CubeListBuilder.create().texOffs(8, 75).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.8479F, 10.4851F, 0.1223F, 0.0276F, -0.4395F));

		PartDefinition body15_r1 = root.addOrReplaceChild("body15_r1", CubeListBuilder.create().texOffs(22, 25).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.2479F, 18.4851F, -0.0769F, -0.1078F, -1.0884F));

		PartDefinition body14_r3 = root.addOrReplaceChild("body14_r3", CubeListBuilder.create().texOffs(58, 9).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.2479F, 18.4851F, -0.115F, -0.0835F, -0.6946F));

		PartDefinition body13_r4 = root.addOrReplaceChild("body13_r4", CubeListBuilder.create().texOffs(58, 9).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2479F, 18.4851F, -0.115F, 0.0835F, 0.6946F));

		PartDefinition body14_r4 = root.addOrReplaceChild("body14_r4", CubeListBuilder.create().texOffs(22, 25).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2479F, 18.4851F, -0.0769F, 0.1078F, 1.0884F));

		PartDefinition body12_r4 = root.addOrReplaceChild("body12_r4", CubeListBuilder.create().texOffs(58, 13).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4479F, 16.4851F, -0.0357F, 0.0467F, 0.438F));

		PartDefinition body13_r5 = root.addOrReplaceChild("body13_r5", CubeListBuilder.create().texOffs(58, 11).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4479F, 16.4851F, -0.0178F, 0.0434F, 0.8311F));

		PartDefinition body13_r6 = root.addOrReplaceChild("body13_r6", CubeListBuilder.create().texOffs(10, 54).addBox(3.164F, -2.3194F, -0.5267F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5479F, 14.4851F, 0.0283F, -0.0365F, 1.268F));

		PartDefinition body12_r5 = root.addOrReplaceChild("body12_r5", CubeListBuilder.create().texOffs(28, 60).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5479F, 14.4851F, 0.041F, -0.0211F, 0.8317F));

		PartDefinition body11_r3 = root.addOrReplaceChild("body11_r3", CubeListBuilder.create().texOffs(58, 15).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5479F, 14.4851F, 0.0433F, 0.0095F, 0.4402F));

		PartDefinition body12_r6 = root.addOrReplaceChild("body12_r6", CubeListBuilder.create().texOffs(65, 43).addBox(3.164F, -2.3194F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8479F, 12.4851F, 0.0283F, -0.0365F, 1.268F));

		PartDefinition body11_r4 = root.addOrReplaceChild("body11_r4", CubeListBuilder.create().texOffs(65, 41).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8479F, 12.4851F, 0.041F, -0.0211F, 0.8317F));

		PartDefinition body10_r2 = root.addOrReplaceChild("body10_r2", CubeListBuilder.create().texOffs(63, 39).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8479F, 12.4851F, 0.0433F, 0.0095F, 0.4402F));

		PartDefinition body10_r3 = root.addOrReplaceChild("body10_r3", CubeListBuilder.create().texOffs(15, 75).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8479F, 10.4851F, 0.1F, -0.0855F, 0.8286F));

		PartDefinition body9_r1 = root.addOrReplaceChild("body9_r1", CubeListBuilder.create().texOffs(8, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8479F, 10.4851F, 0.1223F, -0.0276F, 0.4395F));

		PartDefinition body11_r5 = root.addOrReplaceChild("body11_r5", CubeListBuilder.create().texOffs(50, 42).addBox(3.164F, -2.3194F, -0.5267F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8479F, 10.4851F, 0.0545F, -0.1197F, 1.2659F));

		PartDefinition basin4_r1 = root.addOrReplaceChild("basin4_r1", CubeListBuilder.create().texOffs(43, 51).mirror().addBox(-0.5F, -0.2781F, 0.1855F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 2.2556F, 17.396F, -2.0204F, -0.2863F, -1.2442F));

		PartDefinition basin5_r1 = root.addOrReplaceChild("basin5_r1", CubeListBuilder.create().texOffs(56, 68).mirror().addBox(-0.5F, -0.2781F, 0.1855F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 2.2556F, 17.396F, -0.9295F, -0.2863F, -1.2442F));

		PartDefinition basin3_r1 = root.addOrReplaceChild("basin3_r1", CubeListBuilder.create().texOffs(36, 70).mirror().addBox(-4.2F, -3.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 70).addBox(3.2F, -3.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3729F, 14.0301F, -1.4399F, 0.0F, 0.0F));

		PartDefinition basin4_r2 = root.addOrReplaceChild("basin4_r2", CubeListBuilder.create().texOffs(56, 68).addBox(-0.5F, -0.2781F, 0.1855F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 2.2556F, 17.396F, -0.9295F, 0.2863F, 1.2442F));

		PartDefinition basin3_r2 = root.addOrReplaceChild("basin3_r2", CubeListBuilder.create().texOffs(43, 51).addBox(-0.5F, -0.2781F, 0.1855F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7F, 2.2556F, 17.396F, -2.0204F, 0.2863F, 1.2442F));

		PartDefinition basin2_r1 = root.addOrReplaceChild("basin2_r1", CubeListBuilder.create().texOffs(58, 0).addBox(-4.5F, -1.8283F, -0.043F, 9.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3F, 9.3F, 0.1658F, 0.0F, 0.0F));

		PartDefinition basin1_r1 = root.addOrReplaceChild("basin1_r1", CubeListBuilder.create().texOffs(14, 60).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, 8.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body1 = root.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.4F, 8.9F, 0.0524F, 0.1309F, 0.0F));

		PartDefinition body9_r2 = body1.addOrReplaceChild("body9_r2", CubeListBuilder.create().texOffs(21, 60).addBox(0.0F, -1.1F, 15.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 2).addBox(0.0F, -1.1F, 13.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 61).addBox(0.0F, -1.1F, 11.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 62).addBox(0.0F, -1.1F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 62).addBox(0.0F, -1.1F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 27).addBox(0.0F, -1.1F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 64).addBox(0.0F, -1.1F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 64).addBox(0.0F, -1.1F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 42).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -15.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body13_r7 = body1.addOrReplaceChild("body13_r7", CubeListBuilder.create().texOffs(14, 66).mirror().addBox(-7.164F, -2.3194F, -0.5267F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4521F, -0.4149F, 0.0785F, 0.1946F, -1.2622F));

		PartDefinition body12_r7 = body1.addOrReplaceChild("body12_r7", CubeListBuilder.create().texOffs(28, 69).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4521F, -0.4149F, 0.1536F, 0.1432F, -0.8225F));

		PartDefinition body11_r6 = body1.addOrReplaceChild("body11_r6", CubeListBuilder.create().texOffs(69, 15).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4521F, -0.4149F, 0.1935F, 0.0609F, -0.4363F));

		PartDefinition body11_r7 = body1.addOrReplaceChild("body11_r7", CubeListBuilder.create().texOffs(63, 35).mirror().addBox(-8.164F, -2.3194F, -0.5267F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3521F, -2.4149F, 0.0975F, 0.2436F, -1.2406F));

		PartDefinition body10_r4 = body1.addOrReplaceChild("body10_r4", CubeListBuilder.create().texOffs(75, 34).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3521F, -2.4149F, 0.1918F, 0.1796F, -0.7989F));

		PartDefinition body9_r3 = body1.addOrReplaceChild("body9_r3", CubeListBuilder.create().texOffs(22, 75).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3521F, -2.4149F, 0.2422F, 0.0805F, -0.4154F));

		PartDefinition body8_r1 = body1.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(35, 75).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3521F, -4.4149F, 0.2747F, 0.0934F, -0.3952F));

		PartDefinition body9_r4 = body1.addOrReplaceChild("body9_r4", CubeListBuilder.create().texOffs(75, 39).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3521F, -4.4149F, 0.2175F, 0.2037F, -0.7765F));

		PartDefinition body10_r5 = body1.addOrReplaceChild("body10_r5", CubeListBuilder.create().texOffs(69, 9).mirror().addBox(-8.164F, -2.3194F, -0.5267F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3521F, -4.4149F, 0.1105F, 0.2761F, -1.2198F));

		PartDefinition body9_r5 = body1.addOrReplaceChild("body9_r5", CubeListBuilder.create().texOffs(69, 11).mirror().addBox(-8.164F, -2.3194F, -0.5267F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2521F, -6.4149F, 0.1237F, 0.3087F, -1.1985F));

		PartDefinition body8_r2 = body1.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(75, 43).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2521F, -6.4149F, 0.2435F, 0.2276F, -0.7535F));

		PartDefinition body7_r1 = body1.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(75, 41).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2521F, -6.4149F, 0.3074F, 0.1062F, -0.3745F));

		PartDefinition body8_r3 = body1.addOrReplaceChild("body8_r3", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-9.164F, -2.3194F, -0.5267F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1521F, -8.4149F, 0.1237F, 0.3087F, -1.1462F));

		PartDefinition body7_r2 = body1.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(75, 47).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1521F, -8.4149F, 0.2435F, 0.2276F, -0.7011F));

		PartDefinition body6_r1 = body1.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(75, 45).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1521F, -8.4149F, 0.3074F, 0.1062F, -0.3221F));

		PartDefinition body7_r3 = body1.addOrReplaceChild("body7_r3", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-9.164F, -2.3194F, -0.5267F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0521F, -10.4149F, 0.1395F, 0.3402F, -1.1237F));

		PartDefinition body6_r2 = body1.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(75, 51).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0521F, -10.4149F, 0.2715F, 0.2496F, -0.6771F));

		PartDefinition body5_r1 = body1.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(75, 49).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0521F, -10.4149F, 0.3409F, 0.1166F, -0.3009F));

		PartDefinition body4_r1 = body1.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(63, 75).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0521F, -12.4149F, 0.3647F, 0.1284F, -0.3154F));

		PartDefinition body5_r2 = body1.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(56, 75).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0521F, -12.4149F, 0.2897F, 0.2692F, -0.6898F));

		PartDefinition body6_r3 = body1.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(19, 54).mirror().addBox(-9.164F, -2.3194F, -0.5267F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0521F, -12.4149F, 0.1474F, 0.3655F, -1.1383F));

		PartDefinition body5_r3 = body1.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(57, 50).mirror().addBox(-9.164F, -2.3194F, -0.5267F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1479F, -14.4149F, 0.1544F, 0.3817F, -1.1532F));

		PartDefinition body4_r2 = body1.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1479F, -14.4149F, 0.3031F, 0.281F, -0.7036F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(76, 15).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1479F, -14.4149F, 0.3811F, 0.1346F, -0.3307F));

		PartDefinition body12_r8 = body1.addOrReplaceChild("body12_r8", CubeListBuilder.create().texOffs(14, 66).addBox(3.164F, -2.3194F, -0.5267F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4521F, -0.4149F, 0.0785F, -0.1946F, 1.2622F));

		PartDefinition body11_r8 = body1.addOrReplaceChild("body11_r8", CubeListBuilder.create().texOffs(28, 69).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4521F, -0.4149F, 0.1536F, -0.1432F, 0.8225F));

		PartDefinition body10_r6 = body1.addOrReplaceChild("body10_r6", CubeListBuilder.create().texOffs(69, 15).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4521F, -0.4149F, 0.1935F, -0.0609F, 0.4363F));

		PartDefinition body9_r6 = body1.addOrReplaceChild("body9_r6", CubeListBuilder.create().texOffs(75, 34).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3521F, -2.4149F, 0.1918F, -0.1796F, 0.7989F));

		PartDefinition body8_r4 = body1.addOrReplaceChild("body8_r4", CubeListBuilder.create().texOffs(22, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3521F, -2.4149F, 0.2422F, -0.0805F, 0.4154F));

		PartDefinition body10_r7 = body1.addOrReplaceChild("body10_r7", CubeListBuilder.create().texOffs(63, 35).addBox(3.164F, -2.3194F, -0.5267F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3521F, -2.4149F, 0.0975F, -0.2436F, 1.2406F));

		PartDefinition body8_r5 = body1.addOrReplaceChild("body8_r5", CubeListBuilder.create().texOffs(75, 39).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3521F, -4.4149F, 0.2175F, -0.2037F, 0.7765F));

		PartDefinition body7_r4 = body1.addOrReplaceChild("body7_r4", CubeListBuilder.create().texOffs(35, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3521F, -4.4149F, 0.2747F, -0.0934F, 0.3952F));

		PartDefinition body9_r7 = body1.addOrReplaceChild("body9_r7", CubeListBuilder.create().texOffs(69, 9).addBox(3.164F, -2.3194F, -0.5267F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3521F, -4.4149F, 0.1105F, -0.2761F, 1.2198F));

		PartDefinition body7_r5 = body1.addOrReplaceChild("body7_r5", CubeListBuilder.create().texOffs(75, 43).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2521F, -6.4149F, 0.2435F, -0.2276F, 0.7535F));

		PartDefinition body6_r4 = body1.addOrReplaceChild("body6_r4", CubeListBuilder.create().texOffs(75, 41).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2521F, -6.4149F, 0.3074F, -0.1062F, 0.3745F));

		PartDefinition body8_r6 = body1.addOrReplaceChild("body8_r6", CubeListBuilder.create().texOffs(69, 11).addBox(3.164F, -2.3194F, -0.5267F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2521F, -6.4149F, 0.1237F, -0.3087F, 1.1985F));

		PartDefinition body6_r5 = body1.addOrReplaceChild("body6_r5", CubeListBuilder.create().texOffs(75, 47).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1521F, -8.4149F, 0.2435F, -0.2276F, 0.7011F));

		PartDefinition body5_r4 = body1.addOrReplaceChild("body5_r4", CubeListBuilder.create().texOffs(75, 45).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1521F, -8.4149F, 0.3074F, -0.1062F, 0.3221F));

		PartDefinition body7_r6 = body1.addOrReplaceChild("body7_r6", CubeListBuilder.create().texOffs(48, 0).addBox(3.164F, -2.3194F, -0.5267F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1521F, -8.4149F, 0.1237F, -0.3087F, 1.1462F));

		PartDefinition body5_r5 = body1.addOrReplaceChild("body5_r5", CubeListBuilder.create().texOffs(75, 51).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0521F, -10.4149F, 0.2715F, -0.2496F, 0.6771F));

		PartDefinition body4_r3 = body1.addOrReplaceChild("body4_r3", CubeListBuilder.create().texOffs(75, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0521F, -10.4149F, 0.3409F, -0.1166F, 0.3009F));

		PartDefinition body6_r6 = body1.addOrReplaceChild("body6_r6", CubeListBuilder.create().texOffs(0, 14).addBox(3.164F, -2.3194F, -0.5267F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0521F, -10.4149F, 0.1395F, -0.3402F, 1.1237F));

		PartDefinition body3_r2 = body1.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(63, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0521F, -12.4149F, 0.3647F, -0.1284F, 0.3154F));

		PartDefinition body4_r4 = body1.addOrReplaceChild("body4_r4", CubeListBuilder.create().texOffs(56, 75).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0521F, -12.4149F, 0.2897F, -0.2692F, 0.6898F));

		PartDefinition body5_r6 = body1.addOrReplaceChild("body5_r6", CubeListBuilder.create().texOffs(19, 54).addBox(3.164F, -2.3194F, -0.5267F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0521F, -12.4149F, 0.1474F, -0.3655F, 1.1383F));

		PartDefinition body4_r5 = body1.addOrReplaceChild("body4_r5", CubeListBuilder.create().texOffs(57, 50).addBox(3.164F, -2.3194F, -0.5267F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1479F, -14.4149F, 0.1544F, -0.3817F, 1.1532F));

		PartDefinition body3_r3 = body1.addOrReplaceChild("body3_r3", CubeListBuilder.create().texOffs(0, 76).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1479F, -14.4149F, 0.3031F, -0.281F, 0.7036F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1479F, -14.4149F, 0.3811F, -0.1346F, 0.3307F));

		PartDefinition body2_r2 = body1.addOrReplaceChild("body2_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -1.5F, -8.0F, 11.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0747F, -8.1631F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest1 = body1.addOrReplaceChild("chest1", CubeListBuilder.create().texOffs(22, 19).addBox(-0.5F, -3.8F, -8.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(42, 69).addBox(0.0F, -4.8F, -7.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 68).addBox(0.0F, -4.8F, -5.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 68).addBox(0.0F, -4.8F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 45).addBox(0.0F, -4.8F, -3.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1F, -15.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition chest3_r1 = chest1.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(44, 21).mirror().addBox(-0.1787F, -0.67F, 0.0087F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.7577F, -10.0004F, 0.0745F, -0.4602F, -0.3036F));

		PartDefinition chest3_r2 = chest1.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(44, 33).mirror().addBox(-1.7547F, -1.0774F, -0.6523F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.3591F, -4.9893F, -0.1297F, -0.2259F, 0.2932F));

		PartDefinition chest4_r1 = chest1.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(48, 2).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 2).addBox(7.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.8595F, -5.2776F, 1.1345F, 0.0F, 0.0F));

		PartDefinition chest5_r1 = chest1.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0164F, 2.6452F, -10.0358F, -2.8623F, 0.0F, 3.1416F));

		PartDefinition chest4_r2 = chest1.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(71, 59).addBox(-0.3F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0164F, 2.6452F, -9.9358F, 0.0F, -1.5708F, 0.0F));

		PartDefinition chest2_r1 = chest1.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(44, 21).addBox(-0.8213F, -0.67F, 0.0087F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 2.7577F, -10.0004F, 0.0745F, 0.4602F, 0.3036F));

		PartDefinition chest2_r2 = chest1.addOrReplaceChild("chest2_r2", CubeListBuilder.create().texOffs(44, 33).addBox(-2.2453F, -1.0774F, -0.6523F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.3591F, -4.9893F, -0.1297F, 0.2259F, -0.2932F));

		PartDefinition body6_r7 = chest1.addOrReplaceChild("body6_r7", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-9.164F, -2.3194F, -0.5267F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2479F, -0.8149F, 0.1544F, 0.3817F, -1.1707F));

		PartDefinition body5_r7 = chest1.addOrReplaceChild("body5_r7", CubeListBuilder.create().texOffs(70, 74).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2479F, -0.8149F, 0.3031F, 0.281F, -0.721F));

		PartDefinition body4_r6 = chest1.addOrReplaceChild("body4_r6", CubeListBuilder.create().texOffs(74, 31).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2479F, -0.8149F, 0.3811F, 0.1346F, -0.3481F));

		PartDefinition body5_r8 = chest1.addOrReplaceChild("body5_r8", CubeListBuilder.create().texOffs(74, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2479F, -2.8149F, 0.4223F, 0.1501F, -0.3946F));

		PartDefinition body7_r7 = chest1.addOrReplaceChild("body7_r7", CubeListBuilder.create().texOffs(63, 33).mirror().addBox(-8.164F, -2.3194F, -0.5267F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2479F, -2.8149F, 0.1723F, 0.4221F, -1.216F));

		PartDefinition body6_r8 = chest1.addOrReplaceChild("body6_r8", CubeListBuilder.create().texOffs(29, 74).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2479F, -2.8149F, 0.337F, 0.3102F, -0.7635F));

		PartDefinition body8_r7 = chest1.addOrReplaceChild("body8_r7", CubeListBuilder.create().texOffs(57, 52).mirror().addBox(-8.164F, -2.3194F, -0.5267F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2479F, -4.8149F, 0.2101F, 0.5026F, -1.2515F));

		PartDefinition body7_r8 = chest1.addOrReplaceChild("body7_r8", CubeListBuilder.create().texOffs(74, 19).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2479F, -4.8149F, 0.4067F, 0.3675F, -0.7927F));

		PartDefinition body6_r9 = chest1.addOrReplaceChild("body6_r9", CubeListBuilder.create().texOffs(56, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2479F, -4.8149F, 0.5054F, 0.1803F, -0.4333F));

		PartDefinition body7_r9 = chest1.addOrReplaceChild("body7_r9", CubeListBuilder.create().texOffs(16, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2479F, -6.8149F, 0.595F, 0.2184F, -0.4594F));

		PartDefinition body8_r8 = chest1.addOrReplaceChild("body8_r8", CubeListBuilder.create().texOffs(23, 73).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2479F, -6.8149F, 0.482F, 0.4337F, -0.8071F));

		PartDefinition body9_r8 = chest1.addOrReplaceChild("body9_r8", CubeListBuilder.create().texOffs(69, 13).mirror().addBox(-7.164F, -2.3194F, -0.5267F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2479F, -6.8149F, 0.248F, 0.5927F, -1.2756F));

		PartDefinition body8_r9 = chest1.addOrReplaceChild("body8_r9", CubeListBuilder.create().texOffs(69, 13).addBox(3.164F, -2.3194F, -0.5267F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2479F, -6.8149F, 0.248F, -0.5927F, 1.2756F));

		PartDefinition body7_r10 = chest1.addOrReplaceChild("body7_r10", CubeListBuilder.create().texOffs(23, 73).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2479F, -6.8149F, 0.482F, -0.4337F, 0.8071F));

		PartDefinition body6_r10 = chest1.addOrReplaceChild("body6_r10", CubeListBuilder.create().texOffs(16, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2479F, -6.8149F, 0.595F, -0.2184F, 0.4594F));

		PartDefinition body7_r11 = chest1.addOrReplaceChild("body7_r11", CubeListBuilder.create().texOffs(57, 52).addBox(3.164F, -2.3194F, -0.5267F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2479F, -4.8149F, 0.2101F, -0.5026F, 1.2515F));

		PartDefinition body6_r11 = chest1.addOrReplaceChild("body6_r11", CubeListBuilder.create().texOffs(74, 19).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2479F, -4.8149F, 0.4067F, -0.3675F, 0.7927F));

		PartDefinition body5_r9 = chest1.addOrReplaceChild("body5_r9", CubeListBuilder.create().texOffs(56, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2479F, -4.8149F, 0.5054F, -0.1803F, 0.4333F));

		PartDefinition body6_r12 = chest1.addOrReplaceChild("body6_r12", CubeListBuilder.create().texOffs(63, 33).addBox(3.164F, -2.3194F, -0.5267F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2479F, -2.8149F, 0.1723F, -0.4221F, 1.216F));

		PartDefinition body5_r10 = chest1.addOrReplaceChild("body5_r10", CubeListBuilder.create().texOffs(29, 74).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2479F, -2.8149F, 0.337F, -0.3102F, 0.7635F));

		PartDefinition body4_r7 = chest1.addOrReplaceChild("body4_r7", CubeListBuilder.create().texOffs(74, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2479F, -2.8149F, 0.4223F, -0.1501F, 0.3946F));

		PartDefinition body5_r11 = chest1.addOrReplaceChild("body5_r11", CubeListBuilder.create().texOffs(0, 36).addBox(3.164F, -2.3194F, -0.5267F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2479F, -0.8149F, 0.1544F, -0.3817F, 1.1707F));

		PartDefinition body4_r8 = chest1.addOrReplaceChild("body4_r8", CubeListBuilder.create().texOffs(70, 74).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2479F, -0.8149F, 0.3031F, -0.281F, 0.721F));

		PartDefinition body3_r4 = chest1.addOrReplaceChild("body3_r4", CubeListBuilder.create().texOffs(74, 31).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2479F, -0.8149F, 0.3811F, -0.1346F, 0.3481F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -8.2F, -0.2201F, 0.0F, 0.0F));

		PartDefinition neck4_r1 = neck1.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(0, 71).addBox(0.0F, -1.0687F, -1.1542F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 64).addBox(0.0F, -1.0687F, -3.1542F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 69).addBox(0.0F, -1.0687F, -5.1542F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, 0.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(39, 8).addBox(-0.5F, -1.7F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body10_r8 = neck1.addOrReplaceChild("body10_r8", CubeListBuilder.create().texOffs(9, 73).mirror().addBox(-5.164F, -2.3194F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.9479F, -0.6149F, 0.2339F, 0.6981F, -1.415F));

		PartDefinition body9_r9 = neck1.addOrReplaceChild("body9_r9", CubeListBuilder.create().texOffs(6, 71).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.9479F, -0.6149F, 0.5259F, 0.5322F, -0.9176F));

		PartDefinition body8_r10 = neck1.addOrReplaceChild("body8_r10", CubeListBuilder.create().texOffs(70, 56).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.9479F, -0.6149F, 0.6675F, 0.2978F, -0.5718F));

		PartDefinition body10_r9 = neck1.addOrReplaceChild("body10_r9", CubeListBuilder.create().texOffs(70, 29).mirror().addBox(-3.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.6479F, -2.6149F, 0.4512F, 0.7676F, -1.0416F));

		PartDefinition body9_r10 = neck1.addOrReplaceChild("body9_r10", CubeListBuilder.create().texOffs(70, 27).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.6479F, -2.6149F, 0.7012F, 0.5386F, -0.6365F));

		PartDefinition body9_r11 = neck1.addOrReplaceChild("body9_r11", CubeListBuilder.create().texOffs(9, 73).addBox(3.164F, -2.3194F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.9479F, -0.6149F, 0.2339F, -0.6981F, 1.415F));

		PartDefinition body9_r12 = neck1.addOrReplaceChild("body9_r12", CubeListBuilder.create().texOffs(70, 29).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6479F, -2.6149F, 0.4512F, -0.7676F, 1.0416F));

		PartDefinition body8_r11 = neck1.addOrReplaceChild("body8_r11", CubeListBuilder.create().texOffs(70, 27).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6479F, -2.6149F, 0.7012F, -0.5386F, 0.6365F));

		PartDefinition body8_r12 = neck1.addOrReplaceChild("body8_r12", CubeListBuilder.create().texOffs(6, 71).addBox(1.8478F, -0.7649F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.9479F, -0.6149F, 0.5259F, -0.5322F, 0.9176F));

		PartDefinition body7_r12 = neck1.addOrReplaceChild("body7_r12", CubeListBuilder.create().texOffs(70, 56).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.9479F, -0.6149F, 0.6675F, -0.2978F, 0.5718F));

		PartDefinition head1 = neck1.addOrReplaceChild("head1", CubeListBuilder.create().texOffs(0, 46).addBox(2.5F, -1.9681F, -5.3007F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.004F))
				.texOffs(0, 46).mirror().addBox(-3.5F, -1.9681F, -5.3007F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(44, 28).addBox(-2.5F, 0.0319F, -5.3007F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(19, 48).addBox(-2.5F, -2.9681F, -3.3007F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).addBox(2.5F, -2.9681F, -3.3007F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(57, 42).addBox(-1.0F, -2.9681F, -2.3007F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(33, 19).addBox(2.5F, -2.9681F, -0.3007F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 56).addBox(-2.5F, -2.9681F, -0.3007F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 19).mirror().addBox(-3.5F, -2.9681F, -0.3007F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 19).mirror().addBox(-3.5F, -2.9681F, -3.3007F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3F, -6.4F, -0.2162F, 0.3491F, 0.0F));

		PartDefinition head4_r1 = head1.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(9, 19).mirror().addBox(-0.5F, -1.4F, -1.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 8).mirror().addBox(-0.51F, -0.8777F, -0.5787F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 42).mirror().addBox(-0.49F, -1.9223F, -1.6213F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 8).addBox(5.55F, -0.8777F, -0.5787F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 19).addBox(5.54F, -1.4F, -1.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(43, 42).addBox(5.53F, -1.9223F, -1.6213F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.02F, -0.5457F, -3.975F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head1.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(32, 29).mirror().addBox(-3.5F, -1.8435F, -2.9886F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(32, 29).addBox(2.5F, -1.8435F, -2.9886F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0319F, 0.6993F, 0.6283F, 0.0F, 0.0F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5681F, -4.3007F, 0.6199F, 0.0F, 0.0F));

		PartDefinition head4_r2 = head2.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(47, 62).addBox(-3.5F, -0.0122F, 2.0094F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 40).addBox(-2.5F, -0.0122F, 0.0094F, 5.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.2F, -2.1F, -0.4189F, 0.0F, 0.0F));

		PartDefinition head2_r1 = head2.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(63, 21).addBox(-2.0F, -0.1F, 0.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -4.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create().texOffs(28, 62).addBox(-2.5F, -1.0F, -4.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -2.0F, -0.8196F, 0.0F, 0.0F));

		PartDefinition rostrum1 = head3.addOrReplaceChild("rostrum1", CubeListBuilder.create().texOffs(19, 42).addBox(-1.5F, -0.9F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.1F, 0.3187F, 0.0F, 0.0F));

		PartDefinition rostrum2 = rostrum1.addOrReplaceChild("rostrum2", CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, 0.8F, 0.2731F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2315F, -0.0493F, 0.5498F, 0.0F, 0.0F));

		PartDefinition jaw3_r1 = jaw1.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-3.5F, -0.5389F, -4.9829F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(39, 0).addBox(2.5F, -0.5389F, -4.9829F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9337F, -0.1997F, -0.0087F, 0.0F, 0.0F));

		PartDefinition jaw2_r1 = jaw1.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(71, 64).mirror().addBox(-3.5F, -0.6084F, -2.2743F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 64).addBox(2.5F, -0.6084F, -2.2743F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9337F, 0.8003F, -0.4189F, 0.0F, 0.0F));

		PartDefinition jaw3_r2 = jaw1.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(14, 60).mirror().addBox(-3.5F, -0.0586F, -3.938F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(14, 60).addBox(2.5F, -0.0586F, -3.938F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4663F, -0.9997F, 0.1134F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw1.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4337F, -4.9997F, -0.182F, 0.0F, 0.0F));

		PartDefinition jaw2_r2 = jaw2.addOrReplaceChild("jaw2_r2", CubeListBuilder.create().texOffs(63, 27).addBox(1.5F, 0.0F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.1F, 0.0698F, 0.0F, 0.0F));

		PartDefinition lowerrostrum1 = jaw2.addOrReplaceChild("lowerrostrum1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -3.7F, 0.3204F, 0.0F, 0.0F));

		PartDefinition lowerrostrum2_r1 = lowerrostrum1.addOrReplaceChild("lowerrostrum2_r1", CubeListBuilder.create().texOffs(7, 46).addBox(-1.5F, 0.0388F, -2.9192F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(52, 21).mirror().addBox(-1.5F, 0.0388F, -1.9192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(52, 21).addBox(0.5F, 0.0388F, -1.9192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create().texOffs(0, 58).addBox(1.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 58).mirror().addBox(-2.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.9F, 0.0F));

		PartDefinition gums = jaw1.addOrReplaceChild("gums", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6337F, -0.9997F, -0.4554F, 0.0F, 0.0F));

		PartDefinition FrontFlipperL = chest1.addOrReplaceChild("FrontFlipperL", CubeListBuilder.create().texOffs(7, 0).addBox(-0.63F, 0.0976F, -1.5366F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(22, 19).addBox(-0.63F, 2.0976F, -1.0366F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1737F, 2.0897F, -6.6F, 0.137F, -0.1085F, -0.9047F));

		PartDefinition flipper2 = FrontFlipperL.addOrReplaceChild("flipper2", CubeListBuilder.create().texOffs(39, 0).addBox(-0.9F, -0.1F, -1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.9F, -0.1F, 0.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.27F, 5.1976F, -0.0866F, -0.5083F, 0.1452F, -0.3623F));

		PartDefinition flipper6 = flipper2.addOrReplaceChild("flipper6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 2.7F, 0.05F, 0.0F, 0.0F, -0.2618F));

		PartDefinition flipper14_r1 = flipper6.addOrReplaceChild("flipper14_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.5F, -3.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4F, 0.6F, 0.0F, 3.1416F, 0.0F));

		PartDefinition flipper7 = FrontFlipperL.addOrReplaceChild("flipper7", CubeListBuilder.create(), PartPose.offset(-7.158F, 1.6104F, 1.6F));

		PartDefinition FrontFlipperL2 = chest1.addOrReplaceChild("FrontFlipperL2", CubeListBuilder.create().texOffs(7, 0).mirror().addBox(-0.37F, 0.0976F, -1.5366F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 19).mirror().addBox(-0.37F, 2.0976F, -1.0366F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1737F, 2.0897F, -6.6F, -0.4239F, -0.3172F, 0.9661F));

		PartDefinition flipper3 = FrontFlipperL2.addOrReplaceChild("flipper3", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-0.1F, -0.1F, -1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-0.1F, -0.1F, 0.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.27F, 5.1976F, -0.0866F, -0.3337F, -0.1584F, 0.3848F));

		PartDefinition flipper4 = flipper3.addOrReplaceChild("flipper4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 2.7F, 0.05F, 0.0F, 0.0F, 0.2618F));

		PartDefinition flipper15_r1 = flipper4.addOrReplaceChild("flipper15_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, -3.5F, -3.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.4F, 0.6F, 0.0F, -3.1416F, 0.0F));

		PartDefinition flipper5 = FrontFlipperL2.addOrReplaceChild("flipper5", CubeListBuilder.create(), PartPose.offset(7.158F, 1.6104F, 1.6F));

		PartDefinition backflipperL = root.addOrReplaceChild("backflipperL", CubeListBuilder.create().texOffs(71, 69).addBox(-0.4575F, 0.1683F, -1.5043F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(22, 29).addBox(-0.4575F, 1.1683F, -1.0043F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7581F, 2.2665F, 17.2087F, 0.8753F, -0.0745F, -1.079F));

		PartDefinition backflipper2 = backflipperL.addOrReplaceChild("backflipper2", CubeListBuilder.create().texOffs(44, 21).addBox(-0.5F, 0.1F, -1.7667F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 8).addBox(-0.5F, 0.1F, -0.3667F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0425F, 4.0683F, 0.5623F, 0.2207F, -0.1301F, -0.1171F));

		PartDefinition backflipper13_r1 = backflipper2.addOrReplaceChild("backflipper13_r1", CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -4.0F, -4.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8F, 1.1333F, 0.0F, 3.1416F, 0.0F));

		PartDefinition backflipperL2 = root.addOrReplaceChild("backflipperL2", CubeListBuilder.create().texOffs(71, 69).mirror().addBox(-0.5425F, 0.1683F, -1.5043F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 29).mirror().addBox(-0.5425F, 1.1683F, -1.0043F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7581F, 2.2665F, 17.2087F, 0.94F, 0.1295F, 1.1323F));

		PartDefinition backflipper3 = backflipperL2.addOrReplaceChild("backflipper3", CubeListBuilder.create().texOffs(44, 21).mirror().addBox(-0.5F, 0.1F, -1.7667F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 8).mirror().addBox(-0.5F, 0.1F, -0.3667F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0425F, 4.0683F, 0.5623F, 0.3545F, 0.1045F, 0.0831F));

		PartDefinition backflipper14_r1 = backflipper3.addOrReplaceChild("backflipper14_r1", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(0.0F, -4.0F, -4.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.8F, 1.1333F, 0.0F, -3.1416F, 0.0F));

		PartDefinition tail1 = root.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(57, 39).addBox(-0.5F, -0.2F, 0.1F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.4F, 19.7F, -0.1833F, -0.0873F, 0.0F));

		PartDefinition tail9_r1 = tail1.addOrReplaceChild("tail9_r1", CubeListBuilder.create().texOffs(13, 11).addBox(0.0F, -0.8F, 14.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 19).addBox(0.0F, -0.8F, 12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 19).addBox(0.0F, -0.8F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 29).addBox(0.0F, -0.8F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 35).addBox(0.0F, -0.8F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 29).addBox(0.0F, -0.8F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 33).addBox(0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 58).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail7_r1 = tail1.addOrReplaceChild("tail7_r1", CubeListBuilder.create().texOffs(13, 6).addBox(0.0F, 3.4F, 9.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 21).addBox(0.0F, 2.9F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 40).addBox(0.0F, 2.3F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 48).addBox(0.0F, 1.5F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 49).addBox(0.0F, 0.8F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 25).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 2.6F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(22, 21).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 15.0F, 0.1309F, -0.3491F, 0.0F));

		PartDefinition tail16_r1 = tail2.addOrReplaceChild("tail16_r1", CubeListBuilder.create().texOffs(28, 76).addBox(0.0F, 10.9F, 27.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 75).addBox(0.0F, 10.3F, 25.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 23).addBox(0.0F, 9.7F, 23.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 0).addBox(0.0F, 9.1F, 21.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 42).addBox(0.0F, 7.5F, 19.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 42).addBox(0.0F, 6.8F, 17.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 46).addBox(0.0F, 6.2F, 15.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 51).addBox(0.0F, 5.5F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 51).addBox(0.0F, 4.9F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -12.4F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(38, 44).addBox(-0.5F, -1.5F, 0.6F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, 18.3F, 0.0436F, -0.5236F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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