package fossils.fossils.client.blockentity.model.dearc;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DearcFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest;
	private final ModelPart wingleft1;
	private final ModelPart wingleft2;
	private final ModelPart wingleft3;
	private final ModelPart wingleft4;
	private final ModelPart handleft;
	private final ModelPart wingright1;
	private final ModelPart wingright2;
	private final ModelPart wingright3;
	private final ModelPart wingright4;
	private final ModelPart handright;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart head4;
	private final ModelPart jaw;
	private final ModelPart jaw2;
	private final ModelPart throat;
	private final ModelPart body1;
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

	public DearcFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest = this.root.getChild("chest");
		this.wingleft1 = this.chest.getChild("wingleft1");
		this.wingleft2 = this.wingleft1.getChild("wingleft2");
		this.wingleft3 = this.wingleft2.getChild("wingleft3");
		this.wingleft4 = this.wingleft3.getChild("wingleft4");
		this.handleft = this.wingleft3.getChild("handleft");
		this.wingright1 = this.chest.getChild("wingright1");
		this.wingright2 = this.wingright1.getChild("wingright2");
		this.wingright3 = this.wingright2.getChild("wingright3");
		this.wingright4 = this.wingright3.getChild("wingright4");
		this.handright = this.wingright3.getChild("handright");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head2 = this.neck2.getChild("head2");
		this.head3 = this.head2.getChild("head3");
		this.head4 = this.head3.getChild("head4");
		this.jaw = this.head2.getChild("jaw");
		this.jaw2 = this.jaw.getChild("jaw2");
		this.throat = this.jaw2.getChild("throat");
		this.body1 = this.chest.getChild("body1");
		this.upperlegleft = this.body1.getChild("upperlegleft");
		this.lowerlegleft = this.upperlegleft.getChild("lowerlegleft");
		this.footleft = this.lowerlegleft.getChild("footleft");
		this.upperlegright = this.body1.getChild("upperlegright");
		this.lowerlegright = this.upperlegright.getChild("lowerlegright");
		this.footright = this.lowerlegright.getChild("footright");
		this.tail1 = this.body1.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -10.75F, 0.5F));

		PartDefinition chest = root.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.25F, -5.7F, -0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -1.5F, -1.4F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7867F, 4.1079F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 0).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5301F, 5.7838F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, -0.5626F, 0.9853F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 6).addBox(-0.5F, -0.1626F, -0.0147F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.65F, 2.3F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(34, 5).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.2196F, -0.0332F, 0.3141F, 0.2814F, -0.8374F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(26, 22).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.2196F, -0.0332F, 0.4001F, 0.1266F, -0.4202F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(42, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.4196F, 1.9668F, 0.0146F, 0.0102F, -0.4799F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(48, 49).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 26).mirror().addBox(-1.0F, 0.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.4196F, 3.9668F, 0.0F, 0.0F, -0.3054F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(51, 7).mirror().addBox(-3.3056F, -1.8192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 20).mirror().addBox(-3.3056F, -1.8192F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.4196F, 5.9668F, 0.0F, 0.0F, -1.2654F));

		PartDefinition chest_r6 = chest.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(44, 5).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 26).mirror().addBox(-2.9063F, -0.4226F, -2.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.4196F, 5.9668F, 0.0F, 0.0F, -0.7418F));

		PartDefinition chest_r7 = chest.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(10, 41).mirror().addBox(-2.7015F, 0.0921F, -0.6676F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0259F, 1.1666F, 2.7836F, 0.1263F, 0.5103F, 0.4812F));

		PartDefinition chest_r8 = chest.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(44, 14).mirror().addBox(-1.9962F, 0.1801F, -0.6873F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7259F, 1.4666F, 2.2836F, -0.1439F, -0.0351F, 1.2092F));

		PartDefinition chest_r9 = chest.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(34, 14).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.4196F, 1.9668F, 0.0089F, 0.0154F, -0.9162F));

		PartDefinition chest_r10 = chest.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0543F, -0.5F, -2.7704F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -2.4196F, 2.4668F, 0.3054F, 0.3927F, 0.0F));

		PartDefinition chest_r11 = chest.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-1.2646F, -0.6481F, -0.7497F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7643F, -1.473F, -0.5416F, 0.3178F, 0.5113F, -0.1025F));

		PartDefinition chest_r12 = chest.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0543F, -0.5F, -2.7704F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.4196F, 2.4668F, 0.3054F, -0.3927F, 0.0F));

		PartDefinition chest_r13 = chest.addOrReplaceChild("chest_r13", CubeListBuilder.create().texOffs(0, 33).addBox(0.2646F, -0.6481F, -0.7497F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7643F, -1.473F, -0.5416F, 0.3178F, -0.5113F, 0.1025F));

		PartDefinition chest_r14 = chest.addOrReplaceChild("chest_r14", CubeListBuilder.create().texOffs(44, 9).addBox(-2.2788F, -0.4324F, -0.3624F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7788F, 1.8751F, 0.1704F, 0.3316F, 0.0F, 0.0F));

		PartDefinition chest_r15 = chest.addOrReplaceChild("chest_r15", CubeListBuilder.create().texOffs(24, 0).addBox(-0.7788F, -0.7397F, -1.6178F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7788F, 1.8751F, 0.1704F, 0.2356F, 0.0F, 0.0F));

		PartDefinition chest_r16 = chest.addOrReplaceChild("chest_r16", CubeListBuilder.create().texOffs(48, 58).mirror().addBox(-1.2104F, -0.1465F, -0.3624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7788F, 1.8751F, 0.1704F, 0.2667F, -0.1995F, 0.6277F));

		PartDefinition chest_r17 = chest.addOrReplaceChild("chest_r17", CubeListBuilder.create().texOffs(48, 58).addBox(0.2104F, -0.1465F, -0.3624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7788F, 1.8751F, 0.1704F, 0.2667F, 0.1995F, -0.6277F));

		PartDefinition chest_r18 = chest.addOrReplaceChild("chest_r18", CubeListBuilder.create().texOffs(44, 14).addBox(-0.0038F, 0.1801F, -0.6873F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7259F, 1.4666F, 2.2836F, -0.1439F, 0.0351F, -1.2092F));

		PartDefinition chest_r19 = chest.addOrReplaceChild("chest_r19", CubeListBuilder.create().texOffs(10, 41).addBox(-0.2985F, 0.0921F, -0.6676F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0259F, 1.1666F, 2.7836F, 0.1263F, -0.5103F, -0.4812F));

		PartDefinition chest_r20 = chest.addOrReplaceChild("chest_r20", CubeListBuilder.create().texOffs(34, 5).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2196F, -0.0332F, 0.3141F, -0.2814F, 0.8374F));

		PartDefinition chest_r21 = chest.addOrReplaceChild("chest_r21", CubeListBuilder.create().texOffs(26, 22).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2196F, -0.0332F, 0.4001F, -0.1266F, 0.4202F));

		PartDefinition chest_r22 = chest.addOrReplaceChild("chest_r22", CubeListBuilder.create().texOffs(34, 14).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4196F, 1.9668F, 0.0089F, -0.0154F, 0.9162F));

		PartDefinition chest_r23 = chest.addOrReplaceChild("chest_r23", CubeListBuilder.create().texOffs(42, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4196F, 1.9668F, 0.0146F, -0.0102F, 0.4799F));

		PartDefinition chest_r24 = chest.addOrReplaceChild("chest_r24", CubeListBuilder.create().texOffs(40, 26).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 5).addBox(0.9063F, -0.4226F, 1.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4196F, 3.9668F, 0.0F, 0.0F, 0.7418F));

		PartDefinition chest_r25 = chest.addOrReplaceChild("chest_r25", CubeListBuilder.create().texOffs(50, 20).addBox(2.3056F, -1.8192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 7).addBox(2.3056F, -1.8192F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4196F, 3.9668F, 0.0F, 0.0F, 1.2654F));

		PartDefinition chest_r26 = chest.addOrReplaceChild("chest_r26", CubeListBuilder.create().texOffs(48, 49).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 26).addBox(0.0F, 0.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4196F, 3.9668F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 33).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.797F, 1.7618F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 0).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 56).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.35F, -0.7F, 0.1396F, 0.0F, 0.0F));

		PartDefinition wingleft1 = chest.addOrReplaceChild("wingleft1", CubeListBuilder.create().texOffs(54, 47).addBox(-0.6238F, -0.3216F, 0.0503F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 28).addBox(2.3762F, -0.3216F, 0.0503F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, -1.6152F, -2.1332F, 0.6676F, 0.2914F, -0.2661F));

		PartDefinition wingleft2 = wingleft1.addOrReplaceChild("wingleft2", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 46).addBox(-0.5F, 0.0F, 0.8F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.0762F, 0.1784F, 0.1503F, -0.0796F, 0.5786F, -1.812F));

		PartDefinition handR_r1 = wingleft2.addOrReplaceChild("handR_r1", CubeListBuilder.create().texOffs(42, 56).addBox(0.2F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 9.7758F, 0.4642F, 1.9845F, -0.2507F, 0.5144F));

		PartDefinition wingleft3 = wingleft2.addOrReplaceChild("wingleft3", CubeListBuilder.create().texOffs(34, 9).addBox(-0.7137F, -0.0099F, 0.3559F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 10.3F, 1.0F, -1.9547F, -1.4023F, 1.1516F));

		PartDefinition wingleft4 = wingleft3.addOrReplaceChild("wingleft4", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3863F, 0.4901F, 7.4559F, 0.1752F, 0.0873F, -1.4393F));

		PartDefinition wing4R_r1 = wingleft4.addOrReplaceChild("wing4R_r1", CubeListBuilder.create().texOffs(0, 33).addBox(-1.2F, -0.6F, -0.4F, 1.0F, 1.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.4F, 12.0F, 0.0873F, 0.3054F, 0.0F));

		PartDefinition handleft = wingleft3.addOrReplaceChild("handleft", CubeListBuilder.create().texOffs(54, 2).addBox(-1.5F, -0.5F, 0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2137F, 1.2901F, 2.5559F, -0.0421F, 1.2222F, 1.0472F));

		PartDefinition wingright1 = chest.addOrReplaceChild("wingright1", CubeListBuilder.create().texOffs(54, 7).addBox(-2.3762F, -0.3216F, 0.0503F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).addBox(-7.3762F, -0.3216F, 0.0503F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1F, -1.6152F, -2.1332F, 0.7003F, -0.181F, 0.1271F));

		PartDefinition wingright2 = wingright1.addOrReplaceChild("wingright2", CubeListBuilder.create().texOffs(12, 46).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 45).addBox(-0.5F, 0.0F, 0.8F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-7.0762F, 0.1784F, 0.1503F, -0.1022F, -0.5601F, 1.8604F));

		PartDefinition handR_r2 = wingright2.addOrReplaceChild("handR_r2", CubeListBuilder.create().texOffs(56, 26).addBox(-1.2F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, 9.7758F, 0.4642F, 1.9845F, 0.2507F, -0.5144F));

		PartDefinition wingright3 = wingright2.addOrReplaceChild("wingright3", CubeListBuilder.create().texOffs(34, 0).addBox(-0.2863F, -0.0099F, 0.3559F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 10.3F, 1.0F, -2.3336F, 1.3635F, -1.5799F));

		PartDefinition wingright4 = wingright3.addOrReplaceChild("wingright4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3863F, 0.4901F, 7.4559F, 0.1752F, -0.0873F, 1.4393F));

		PartDefinition wing4R_r2 = wingright4.addOrReplaceChild("wing4R_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.2F, -0.6F, -0.4F, 1.0F, 1.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.4F, 12.0F, 0.0873F, -0.3054F, 0.0F));

		PartDefinition handright = wingright3.addOrReplaceChild("handright", CubeListBuilder.create().texOffs(52, 42).addBox(-0.5F, -0.5F, 0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2137F, 1.2901F, 2.5559F, -0.0421F, -1.2222F, -1.0472F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.75F, -0.6F, 0.0424F, 0.2602F, -0.0193F));

		PartDefinition cube_r6 = neck.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(34, 26).addBox(0.0F, -1.579F, -1.3319F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 37).addBox(0.0F, -1.579F, -3.3319F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 20).addBox(-0.5F, -1.079F, -3.3319F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5828F, -0.5635F, 0.2094F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5828F, -3.8635F, 0.578F, 0.1492F, 0.1988F));

		PartDefinition cube_r7 = neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -0.7627F, -0.9718F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 55).addBox(-1.0F, -0.0627F, -2.9718F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.5F, -0.8475F, -4.6567F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, -0.5F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 39).addBox(-0.5F, -0.8F, -3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 39).addBox(-1.0F, -0.1F, -4.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.5F, -0.3475F, -0.2567F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head2 = neck2.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(55, 51).addBox(-2.0F, -1.2268F, -2.1823F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.1025F, -6.6817F, 0.3469F, 0.1517F, 0.0866F));

		PartDefinition cube_r9 = head2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(0.38F, -0.3803F, 0.2171F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(34, 26).mirror().addBox(0.0F, -0.7803F, -2.7829F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 14).addBox(1.82F, -0.3803F, 0.2171F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
				.texOffs(34, 26).addBox(2.2F, -0.7803F, -2.7829F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.6F, 0.6929F, -6.7607F, -2.81F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 39).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 39).addBox(1.7F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.6929F, -4.4607F, -3.0194F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.5F, -1.0343F, -0.9395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 60).addBox(2.7F, -1.0343F, -0.9395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.6F, 0.2696F, -3.7332F, -2.3911F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 42).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(60, 42).addBox(2.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.6F, -0.1304F, -3.2332F, 3.002F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(7, 14).mirror().addBox(-0.5F, -2.0121F, -0.9897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 14).addBox(2.7F, -2.0121F, -0.9897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 1.0732F, -3.0823F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(34, 59).mirror().addBox(-0.6F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 42).mirror().addBox(-0.82F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 6).mirror().addBox(-0.5F, -0.7F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(42, 42).addBox(3.02F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(34, 59).addBox(2.8F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 6).addBox(2.7F, -0.7F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6F, -0.14F, -2.0834F, -1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(7, 20).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 20).addBox(2.7F, -0.5F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -0.2268F, -0.9823F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r16 = head2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(34, 18).mirror().addBox(-2.0F, -2.9F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 18).addBox(1.0F, -2.9F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7732F, -1.1823F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r17 = head2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(57, 60).mirror().addBox(-2.0F, -0.9882F, -0.0398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(57, 60).addBox(1.0F, -0.9882F, -0.0398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.3451F, -0.0382F, -1.885F, 0.0F, 0.0F));

		PartDefinition cube_r18 = head2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(42, 33).addBox(-2.0F, 0.0F, -0.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 55).addBox(-2.0F, -0.5F, -1.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0451F, -0.4382F, -1.4835F, 0.0F, 0.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create().texOffs(13, 33).addBox(-1.5F, -1.6F, -5.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7732F, -2.1823F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r19 = head3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 0).addBox(-1.5F, 0.0176F, -4.9623F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(15, 22).addBox(-2.0F, 0.0176F, -1.9623F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, 0.4F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r20 = head3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-0.087F, -1.161F, -1.1866F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0F, -3.5F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r21 = head3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(34, 0).addBox(0.087F, -1.161F, -1.1866F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, -3.5F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r22 = head3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 33).addBox(-1.5F, -0.5F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.7637F, -0.2516F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r23 = head3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 8).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition head4 = head3.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -4.825F));

		PartDefinition cube_r24 = head4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(0.1F, -0.45F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9927F, -6.4156F, -0.5236F, 0.0F, 0.2618F));

		PartDefinition cube_r25 = head4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(0.1F, -0.525F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9927F, -4.4156F, -0.3593F, 0.013F, 0.2054F));

		PartDefinition cube_r26 = head4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-0.1031F, -0.6385F, -0.4731F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9927F, -2.4156F, -0.3054F, 0.0F, 0.2182F));

		PartDefinition cube_r27 = head4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(34, 33).mirror().addBox(-0.0415F, -0.9744F, -0.6726F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0F, -0.85F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r28 = head4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 6).addBox(-0.1F, -0.45F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9927F, -6.4156F, -0.5236F, 0.0F, -0.2618F));

		PartDefinition cube_r29 = head4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 20).addBox(-0.1F, -0.525F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9927F, -4.4156F, -0.3593F, -0.013F, -0.2054F));

		PartDefinition cube_r30 = head4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(44, 0).addBox(0.1031F, -0.6385F, -0.4731F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9927F, -2.4156F, -0.3054F, 0.0F, -0.2182F));

		PartDefinition cube_r31 = head4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(34, 33).addBox(0.0415F, -0.9744F, -0.6726F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, -0.85F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r32 = head4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(41, 49).addBox(-0.5F, -0.6927F, -3.0156F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.0F, -1.5F, -4.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r33 = head4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(43, 24).addBox(-1.0F, -0.9F, -3.8F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -0.2F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r34 = head4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.1002F, -3.7798F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.3881F, -3.5747F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r35 = head4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(34, 47).addBox(-0.5F, 0.0113F, -3.9424F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -3.2131F, 0.3253F, 0.2051F, 0.0F, 0.0F));

		PartDefinition cube_r36 = head4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(12, 59).addBox(-0.999F, 0.1F, 5.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.001F, -2.0008F, -7.0012F, 0.144F, 0.0F, 0.0F));

		PartDefinition jaw = head2.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(5, 61).addBox(1.0F, -0.4008F, -1.0017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(5, 61).mirror().addBox(-2.0F, -0.4008F, -1.0017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3732F, -1.1823F, 0.3796F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw.addOrReplaceChild("jaw2", CubeListBuilder.create().texOffs(50, 14).addBox(0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(50, 14).mirror().addBox(-1.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4008F, -1.0017F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r37 = jaw2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(28, 8).mirror().addBox(-0.0912F, -7.8099F, -5.225F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9F, -3.925F, 0.7219F, 0.0181F, -0.2612F));

		PartDefinition cube_r38 = jaw2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.2388F, -5.2454F, -4.502F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9F, -3.925F, 0.4983F, 0.0322F, -0.479F));

		PartDefinition cube_r39 = jaw2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-0.7152F, -3.3751F, -3.6291F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9F, -3.925F, 0.2112F, -0.0135F, -0.2615F));

		PartDefinition cube_r40 = jaw2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(41, 18).mirror().addBox(0.0F, -0.375F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0F, -4.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r41 = jaw2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(26, 26).mirror().addBox(-0.2153F, -1.7917F, -1.7317F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9F, -3.925F, -0.1107F, -0.0319F, -0.655F));

		PartDefinition cube_r42 = jaw2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(7, 0).mirror().addBox(-0.9286F, 1.9218F, 5.3333F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9F, -5.6F, 0.3294F, 0.043F, 0.0566F));

		PartDefinition cube_r43 = jaw2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(34, 18).mirror().addBox(0.0F, -1.0342F, 0.1495F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9F, -5.6F, -0.1745F, -0.1222F, 0.0F));

		PartDefinition cube_r44 = jaw2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(28, 8).addBox(0.0912F, -7.8099F, -5.225F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -3.925F, 0.7219F, -0.0181F, 0.2612F));

		PartDefinition cube_r45 = jaw2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2388F, -5.2454F, -4.502F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -3.925F, 0.4983F, -0.0322F, 0.479F));

		PartDefinition cube_r46 = jaw2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 14).addBox(0.7152F, -3.3751F, -3.6291F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -3.925F, 0.2112F, 0.0135F, 0.2615F));

		PartDefinition cube_r47 = jaw2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(26, 26).addBox(0.2153F, -1.7917F, -1.7317F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -3.925F, -0.1107F, 0.0319F, 0.655F));

		PartDefinition cube_r48 = jaw2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(41, 18).addBox(0.0F, -0.375F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, -4.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r49 = jaw2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(34, 18).addBox(0.0F, -1.0342F, 0.1495F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -5.6F, -0.1745F, 0.1222F, 0.0F));

		PartDefinition cube_r50 = jaw2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(7, 0).addBox(0.9286F, 1.9218F, 5.3333F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -5.6F, 0.3294F, -0.043F, -0.0566F));

		PartDefinition cube_r51 = jaw2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(41, 18).addBox(-1.0F, -0.9254F, -4.0337F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.9F, -3.925F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r52 = jaw2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(48, 51).addBox(-0.5F, -1.406F, -7.6767F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.9F, -3.925F, 0.0698F, 0.0F, 0.0F));

		PartDefinition throat = jaw2.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body1 = chest.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(19, 56).addBox(-0.5F, -0.6558F, 0.042F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.95F, 6.2F, -0.0412F, 0.0F, 0.0F));

		PartDefinition body5_r1 = body1.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(59, 20).mirror().addBox(0.5F, -0.9305F, -1.2086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(59, 33).mirror().addBox(-0.5F, -0.9305F, -0.7086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(34, 9).mirror().addBox(-0.5F, -0.9305F, -1.1086F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 20).addBox(2.5F, -0.9305F, -1.2086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(59, 33).addBox(3.5F, -0.9305F, -0.7086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(34, 9).addBox(3.5F, -0.9305F, -1.1086F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.1381F, 1.7837F, 0.096F, 0.0F, 0.0F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(24, 33).mirror().addBox(-0.3014F, -0.8007F, -2.1527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.1381F, 1.7837F, -0.0797F, 0.174F, -0.0138F));

		PartDefinition body6_r1 = body1.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(24, 14).mirror().addBox(-0.5F, -1.2F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7821F, 2.0912F, 2.8667F, -0.7831F, -0.0933F, -0.154F));

		PartDefinition body6_r2 = body1.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(34, 40).mirror().addBox(-0.8978F, -1.3867F, -0.4464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7879F, 1.9073F, 0.4241F, -1.0014F, -0.4526F, -0.2729F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(24, 33).addBox(-0.6986F, -0.8007F, -2.1527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0F, 0.1381F, 1.7837F, -0.0797F, -0.174F, 0.0138F));

		PartDefinition body5_r2 = body1.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(24, 14).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7821F, 2.0912F, 2.8667F, -0.7831F, 0.0933F, 0.154F));

		PartDefinition body5_r3 = body1.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(34, 40).addBox(-0.1022F, -1.3867F, -0.4464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7879F, 1.9073F, 0.4241F, -1.0014F, 0.4526F, 0.2729F));

		PartDefinition body6_r3 = body1.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(56, 39).addBox(-1.7879F, -0.1355F, -0.9402F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7879F, 1.9073F, 0.4241F, -0.2793F, 0.0F, 0.0F));

		PartDefinition upperlegleft = body1.addOrReplaceChild("upperlegleft", CubeListBuilder.create().texOffs(15, 14).addBox(-0.4F, -0.1F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.8174F, 1.9066F, 0.3753F, -0.2484F, -1.3667F));

		PartDefinition lowerlegleft = upperlegleft.addOrReplaceChild("lowerlegleft", CubeListBuilder.create().texOffs(61, 11).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 3.7F, -0.3F, 1.0683F, 0.0F, 0.0227F));

		PartDefinition footleft = lowerlegleft.addOrReplaceChild("footleft", CubeListBuilder.create().texOffs(43, 43).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6F, -0.3F, 0.8992F, 0.4554F, 0.0094F));

		PartDefinition upperlegright = body1.addOrReplaceChild("upperlegright", CubeListBuilder.create().texOffs(15, 0).addBox(-0.6F, -0.1F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.8174F, 1.9066F, 0.3753F, 0.2484F, 1.3667F));

		PartDefinition lowerlegright = upperlegright.addOrReplaceChild("lowerlegright", CubeListBuilder.create().texOffs(5, 47).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.7F, -0.3F, 1.1555F, 0.0F, -0.0227F));

		PartDefinition footright = lowerlegright.addOrReplaceChild("footright", CubeListBuilder.create().texOffs(43, 36).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6F, -0.3F, 0.8556F, -0.4554F, -0.0094F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(52, 33).addBox(-0.5F, -0.4566F, 0.0664F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2308F, 2.842F, 0.0394F, -0.0872F, -0.0034F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, -0.3912F, -0.0101F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1066F, 3.9664F, 0.0179F, -0.2181F, -0.0039F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(34, 33).addBox(-0.5F, -0.4923F, -0.1507F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1338F, 6.0899F, 0.0F, 0.2618F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(34, 40).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0077F, 4.5493F, -0.0226F, 0.2617F, -0.0058F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(15, 14).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.0285F, 0.6979F, 0.0183F));

		return LayerDefinition.create(meshdefinition, 70, 70);
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