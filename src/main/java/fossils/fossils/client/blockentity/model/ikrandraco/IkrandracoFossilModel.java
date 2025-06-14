package fossils.fossils.client.blockentity.model.ikrandraco;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IkrandracoFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart leftLeg;
	private final ModelPart leftLegMembrane;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg;
	private final ModelPart rightLegMembrane;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart tail;
	private final ModelPart body;
	private final ModelPart rightWing;
	private final ModelPart rightWing2;
	private final ModelPart rightWing3;
	private final ModelPart hand2;
	private final ModelPart rightWing4;
	private final ModelPart rightWing5;
	private final ModelPart rightWing6;
	private final ModelPart leftWing7;
	private final ModelPart leftWing8;
	private final ModelPart leftWing9;
	private final ModelPart hand4;
	private final ModelPart leftWing10;
	private final ModelPart leftWing11;
	private final ModelPart leftWing12;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart throat;
	private final ModelPart throat2;

	public IkrandracoFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.leftLeg = this.main.getChild("leftLeg");
		this.leftLegMembrane = this.leftLeg.getChild("leftLegMembrane");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.rightLeg = this.main.getChild("rightLeg");
		this.rightLegMembrane = this.rightLeg.getChild("rightLegMembrane");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.tail = this.main.getChild("tail");
		this.body = this.main.getChild("body");
		this.rightWing = this.body.getChild("rightWing");
		this.rightWing2 = this.rightWing.getChild("rightWing2");
		this.rightWing3 = this.rightWing2.getChild("rightWing3");
		this.hand2 = this.rightWing3.getChild("hand2");
		this.rightWing4 = this.rightWing3.getChild("rightWing4");
		this.rightWing5 = this.rightWing4.getChild("rightWing5");
		this.rightWing6 = this.rightWing5.getChild("rightWing6");
		this.leftWing7 = this.body.getChild("leftWing7");
		this.leftWing8 = this.leftWing7.getChild("leftWing8");
		this.leftWing9 = this.leftWing8.getChild("leftWing9");
		this.hand4 = this.leftWing9.getChild("hand4");
		this.leftWing10 = this.leftWing9.getChild("leftWing10");
		this.leftWing11 = this.leftWing10.getChild("leftWing11");
		this.leftWing12 = this.leftWing11.getChild("leftWing12");
		this.neck = this.body.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.throat = this.jaw.getChild("throat");
		this.throat2 = this.throat.getChild("throat2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -9.4833F, 7.7016F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body4_r1 = main.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(21, 52).mirror().addBox(-0.9106F, -4.0506F, 2.876F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(0.2603F, 1.1376F, -6.237F, -0.6645F, 0.1083F, -0.5174F));

		PartDefinition body6_r1 = main.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(30, 43).mirror().addBox(-0.2761F, -4.8972F, 1.33F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0165F, -5.2134F, -1.0472F, 0.0F, -0.6545F));

		PartDefinition body5_r1 = main.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(5, 52).mirror().addBox(-0.5805F, -4.2568F, 2.5003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.511F, -0.3676F, -5.5972F, -0.8029F, 0.0F, -0.6545F));

		PartDefinition body6_r2 = main.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(44, 47).mirror().addBox(-0.5F, -3.5591F, 2.4826F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(44, 47).addBox(2.3F, -3.5591F, 2.4826F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-0.9F, -0.7218F, -4.774F, -0.6545F, 0.0F, 0.0F));

		PartDefinition body7_r1 = main.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(30, 48).mirror().addBox(-0.5F, -1.6662F, 2.9011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(30, 48).addBox(2.3F, -1.6662F, 2.9011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9F, -0.2218F, -4.374F, -0.1658F, 0.0F, 0.0F));

		PartDefinition body6_r3 = main.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(42, 31).mirror().addBox(-0.1F, -2.1632F, 3.5987F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(42, 31).addBox(0.9F, -2.1632F, 3.5987F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9F, -0.4163F, -5.6871F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body5_r2 = main.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(31, 38).mirror().addBox(0.5197F, -2.0597F, 1.6334F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4163F, -5.2871F, -0.2665F, -0.1854F, 0.0503F));

		PartDefinition body4_r2 = main.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(31, 38).addBox(-1.5197F, -2.0597F, 1.6334F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.1F, -0.4163F, -5.2871F, -0.2665F, 0.1854F, -0.0503F));

		PartDefinition body4_r3 = main.addOrReplaceChild("body4_r3", CubeListBuilder.create().texOffs(5, 52).addBox(-0.4195F, -4.2568F, 2.5003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.511F, -0.3676F, -5.5972F, -0.8029F, 0.0F, 0.6545F));

		PartDefinition body5_r3 = main.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(30, 43).addBox(-0.7239F, -4.8972F, 1.33F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6F, 0.0165F, -5.2134F, -1.0472F, 0.0F, 0.6545F));

		PartDefinition body3_r1 = main.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(21, 52).addBox(-0.0894F, -4.0506F, 2.876F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.7397F, 1.1376F, -6.237F, -0.6645F, -0.1083F, 0.5174F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, 0.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.5F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg = main.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(18, 43).addBox(-0.3701F, 0.0483F, -0.5053F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6841F, 0.0793F, -0.7585F, 1.1081F, 0.241F, -0.4837F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2F, 1.5F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(43, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5443F, 5.1156F, -0.3242F, 0.6311F, -0.1125F, 0.2359F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(22, 33).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3964F, 5.429F, 0.6618F, 0.8759F, 0.1092F, 0.0114F));

		PartDefinition rightLeg = main.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(18, 43).mirror().addBox(-0.6299F, 0.0483F, -0.5053F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6841F, 0.0793F, -0.7585F, 1.3283F, -0.4823F, 0.5938F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2F, 1.5F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5443F, 5.1156F, -0.3242F, 0.4129F, 0.1125F, -0.2359F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(22, 33).mirror().addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3964F, 5.429F, 0.6618F, 0.7014F, -0.1092F, -0.0114F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.0046F, 0.6181F, -0.1787F, -0.2148F, 0.0385F));

		PartDefinition cube_r2 = tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(45, 35).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5688F, 0.302F, 0.4712F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.6736F, -1.5152F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 47).addBox(-0.5F, -0.4F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 44).addBox(-0.5F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 20).addBox(-1.0F, -0.2F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7236F, -5.6152F, 0.0524F, 0.0F, 0.0F));

		PartDefinition chest5_r1 = body.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(9, 39).mirror().addBox(-0.6197F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.4357F, -5.6027F, 1.9477F, 0.6105F, -0.2383F));

		PartDefinition chest4_r1 = body.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4357F, -4.1027F, 0.1767F, 0.4736F, 0.0813F));

		PartDefinition chest6_r1 = body.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(58, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8884F, -2.1435F, 0.1158F, -0.0105F, -0.8315F));

		PartDefinition chest7_r1 = body.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(51, 32).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8884F, -2.1435F, 0.101F, 0.0578F, -1.4388F));

		PartDefinition chest6_r2 = body.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(35, 31).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8884F, -4.1435F, 0.1426F, 0.2093F, -1.3024F));

		PartDefinition chest5_r2 = body.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(13, 25).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8884F, -4.1435F, 0.2362F, 0.0906F, -0.6958F));

		PartDefinition chest6_r3 = body.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(51, 32).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8884F, -2.1435F, 0.101F, -0.0578F, 1.4388F));

		PartDefinition chest5_r3 = body.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(58, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8884F, -2.1435F, 0.1158F, 0.0105F, 0.8315F));

		PartDefinition chest3_r1 = body.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(0, 39).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 1.4357F, -4.1027F, 0.1767F, -0.4736F, -0.0813F));

		PartDefinition chest4_r2 = body.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(9, 39).addBox(-0.3803F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 1.4357F, -5.6027F, 1.9477F, -0.6105F, 0.2383F));

		PartDefinition chest2_r1 = body.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(21, 0).addBox(-1.5F, -0.3F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4111F, -3.7898F, -0.1571F, 0.0F, 0.0F));

		PartDefinition chest4_r3 = body.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(13, 25).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8884F, -4.1435F, 0.2362F, -0.0906F, 0.6958F));

		PartDefinition chest5_r4 = body.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(35, 31).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8884F, -4.1435F, 0.1426F, -0.2093F, 1.3024F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(58, 23).addBox(-1.0F, -0.0102F, -0.1224F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1663F, -2.2375F, 0.5411F, 0.0F, 0.0F));

		PartDefinition rightWing = body.addOrReplaceChild("rightWing", CubeListBuilder.create().texOffs(13, 21).mirror().addBox(-0.5F, 1.75F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 43).mirror().addBox(-0.5F, -0.25F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.193F, 2.3287F, -4.1283F, 0.1818F, -0.5924F, 2.1696F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create().texOffs(36, 11).mirror().addBox(-0.5F, 0.0F, -0.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(40, 38).mirror().addBox(-0.5F, 0.0F, -1.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1659F, 4.1453F, 0.9763F, -0.9F, 0.4796F, -0.1773F));

		PartDefinition cube_r5 = rightWing2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.5F, -1.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8F, -1.2F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create().texOffs(41, 11).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5012F, 7.4876F, -0.8952F, 0.3502F, 0.021F, -0.1285F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.0727F, 5.1954F, 0.0319F, 1.3389F, -0.0277F, 3.1329F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5228F, 5.7039F, 0.6545F, -1.2806F, 0.2298F, -0.0283F));

		PartDefinition rightWing5 = rightWing4.addOrReplaceChild("rightWing5", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5788F, 0.2961F, 8.6346F, -0.0147F, 0.1799F, 0.0338F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create().texOffs(19, 11).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0105F, -0.0194F, 8.0291F, 0.3851F, 0.1285F, 0.0201F));

		PartDefinition cube_r6 = rightWing6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 5).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0F, 7.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftWing7 = body.addOrReplaceChild("leftWing7", CubeListBuilder.create().texOffs(13, 21).addBox(-0.5F, 1.75F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 43).addBox(-0.5F, -0.25F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.193F, 2.3287F, -4.1283F, 0.1526F, 0.5996F, -2.2216F));

		PartDefinition leftWing8 = leftWing7.addOrReplaceChild("leftWing8", CubeListBuilder.create().texOffs(36, 11).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(40, 38).addBox(-0.5F, 0.0F, -1.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1659F, 4.1453F, 0.9763F, -0.9F, -0.4796F, 0.1773F));

		PartDefinition cube_r7 = leftWing8.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 6.8F, -1.2F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftWing9 = leftWing8.addOrReplaceChild("leftWing9", CubeListBuilder.create().texOffs(41, 11).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5012F, 7.4876F, -0.8952F, 0.3502F, -0.021F, 0.1285F));

		PartDefinition hand4 = leftWing9.addOrReplaceChild("hand4", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0727F, 5.1954F, 0.0319F, 1.4247F, -0.145F, -3.1076F));

		PartDefinition leftWing10 = leftWing9.addOrReplaceChild("leftWing10", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5228F, 5.7039F, 0.6545F, -1.264F, -0.3967F, -0.0256F));

		PartDefinition leftWing11 = leftWing10.addOrReplaceChild("leftWing11", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5788F, 0.2961F, 8.6346F, -0.0147F, -0.1799F, -0.0338F));

		PartDefinition leftWing12 = leftWing11.addOrReplaceChild("leftWing12", CubeListBuilder.create().texOffs(19, 11).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.0105F, -0.0194F, 8.0291F, 0.3851F, -0.1285F, -0.0201F));

		PartDefinition cube_r8 = leftWing12.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(21, 5).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 7.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1563F, -5.2673F, 0.132F, 0.1298F, 0.0172F));

		PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(37, 43).addBox(0.0F, -1.4F, 3.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 8).addBox(0.0F, -1.4F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 27).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4538F, -4.3128F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0038F, -4.1628F, 0.4749F, 0.4151F, 0.3708F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(42, 35).addBox(0.5F, -0.4F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 39).addBox(0.5F, -0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 0).addBox(0.0F, -0.1F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7953F, -2.8964F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(45, 39).addBox(-0.5F, -1.85F, -2.175F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 12).addBox(-0.5F, -1.85F, -1.775F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -0.4953F, -2.6964F, 0.7922F, 0.2465F, -0.0613F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(0.2F, -0.5552F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(48, 0).addBox(1.9F, -0.5552F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.05F, 0.0059F, -1.242F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(58, 9).mirror().addBox(-1.55F, -0.7912F, -0.7823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(58, 9).addBox(-0.05F, -0.7912F, -0.7823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.8F, -0.85F, -0.775F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(57, 52).mirror().addBox(-1.55F, 2.35F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(57, 55).mirror().addBox(-1.55F, 2.55F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(57, 55).addBox(-0.05F, 2.55F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(57, 52).addBox(-0.05F, 2.35F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.8F, -3.85F, -1.175F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(58, 12).mirror().addBox(-1.55F, -0.8099F, -0.8284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(58, 12).addBox(-0.05F, -0.8099F, -0.8284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, -1.35F, -1.075F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(58, 6).mirror().addBox(-1.55F, -0.7912F, -0.7823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(58, 6).addBox(-0.05F, -0.7912F, -0.7823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.8F, -0.85F, -0.775F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(58, 20).mirror().addBox(-0.48F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(57, 37).mirror().addBox(-0.58F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).mirror(false)
				.texOffs(57, 37).addBox(1.28F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F))
				.texOffs(58, 20).addBox(1.18F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.35F, -0.992F, -1.3608F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(48, 4).mirror().addBox(-0.4F, -0.4957F, -1.5499F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.05F, -1.5219F, -2.9108F, 1.1786F, 0.02F, 0.0484F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(52, 54).mirror().addBox(-0.5F, -0.2254F, 0.355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 53).mirror().addBox(-0.5F, -0.2254F, -0.245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 54).addBox(0.0F, -0.2254F, 0.355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 53).addBox(0.0F, -0.2254F, -0.245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.25F, -1.4955F, -2.6781F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(37, 51).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(37, 51).addBox(0.0F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.25F, -0.6863F, -3.1814F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(11, 33).mirror().addBox(-0.5F, -0.3112F, -0.3332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(11, 33).addBox(0.0F, -0.3112F, -0.3332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.25F, -1.1955F, -6.1781F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(53, 11).mirror().addBox(-0.5F, -0.7076F, -0.8063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(53, 11).addBox(0.0F, -0.7076F, -0.8063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.25F, -0.4067F, -5.9529F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(53, 14).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(53, 14).addBox(0.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.25F, -0.7955F, -6.5781F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(32, 20).mirror().addBox(-0.5F, -0.5F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(32, 20).addBox(0.0F, -0.5F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.25F, -0.4067F, -2.5529F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(31, 55).mirror().addBox(-0.6F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(36, 55).mirror().addBox(-0.6F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.4574F, -0.3863F, -12.8934F, -0.6804F, -0.0766F, 0.7384F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(26, 55).mirror().addBox(-0.4449F, 0.0852F, -0.4486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(52, 37).mirror().addBox(-0.4449F, -0.3148F, -0.4486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.475F, -0.643F, -12.3582F, -0.2505F, 0.1024F, 0.6506F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(41, 55).mirror().addBox(-0.4171F, -0.4061F, -0.4821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(46, 55).mirror().addBox(-0.4171F, -0.1061F, -0.4821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.4056F, -0.496F, -11.7066F, -0.0563F, 0.023F, 0.6277F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(10, 56).mirror().addBox(-0.526F, -0.205F, -0.4489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(0, 56).mirror().addBox(-0.526F, -0.305F, -0.4489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4064F, -0.3909F, -10.9053F, -0.2208F, 0.0821F, 0.6195F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(40, 58).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 56).mirror().addBox(-0.5459F, -0.5238F, 0.2052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1687F, -0.2011F, -10.0908F, -0.0593F, 0.0853F, 0.6719F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(26, 52).mirror().addBox(-0.2398F, -0.3314F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0313F, -0.3391F, -8.5962F, -0.1981F, -0.0589F, 0.7342F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(31, 52).mirror().addBox(-0.422F, -0.5621F, -0.5079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0313F, 0.0825F, -7.9068F, -0.2338F, 0.0853F, 0.6719F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(31, 55).addBox(-0.4F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(36, 55).addBox(-0.4F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5426F, -0.3863F, -12.8934F, -0.6804F, 0.0766F, -0.7384F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(31, 52).addBox(-0.578F, -0.5621F, -0.5079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0313F, 0.0825F, -7.9068F, -0.2338F, -0.0853F, -0.6719F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(26, 52).addBox(-0.7602F, -0.3314F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0313F, -0.3391F, -8.5962F, -0.1981F, 0.0589F, -0.7342F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(5, 56).addBox(-0.4541F, -0.5238F, 0.2052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 58).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8313F, -0.2011F, -10.0908F, -0.0593F, -0.0853F, -0.6719F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(10, 56).addBox(-0.474F, -0.205F, -0.4489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(0, 56).addBox(-0.474F, -0.305F, -0.4489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5936F, -0.3909F, -10.9053F, -0.2208F, -0.0821F, -0.6195F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(41, 55).addBox(-0.5829F, -0.4061F, -0.4821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(46, 55).addBox(-0.5829F, -0.1061F, -0.4821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5944F, -0.496F, -11.7066F, -0.0563F, -0.023F, -0.6277F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(26, 55).addBox(-0.5551F, 0.0852F, -0.4486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(52, 37).addBox(-0.5551F, -0.3148F, -0.4486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.525F, -0.643F, -12.3582F, -0.2505F, -0.1024F, -0.6506F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(7, 44).addBox(-0.5F, -0.6807F, -0.2352F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5F, -0.534F, -11.7686F, -0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(10, 53).addBox(-0.5F, -0.6807F, -1.4352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(53, 8).addBox(-0.5F, -0.6807F, -1.0352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(52, 43).addBox(-0.5F, -0.6807F, -0.6352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.534F, -11.7686F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(52, 51).addBox(-0.5F, -0.3267F, -4.1833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(52, 40).addBox(-0.5F, -0.3267F, -3.7833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(37, 47).addBox(-0.5F, -0.3267F, -3.5333F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F))
				.texOffs(7, 48).addBox(-0.5F, -0.1267F, -1.9333F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.5F, -1.3755F, -9.1212F, 0.1004F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(23, 48).addBox(-0.5F, -0.8418F, -0.0522F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -0.4755F, -10.9212F, -0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(22, 38).addBox(-0.5F, -1.0243F, 0.0386F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.2755F, -9.1212F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(35, 26).addBox(-0.5F, -0.0233F, -3.04F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5755F, -6.1212F, 0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, 0.0F, -4.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.85F, -2.125F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(24, 27).addBox(0.0F, -1.0F, -0.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.05F, -6.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(48, 4).addBox(-0.6F, -0.4957F, -1.5499F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.05F, -1.5219F, -2.9108F, 1.1786F, -0.02F, -0.0484F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(50, 19).addBox(-1.5F, -0.8163F, -0.8487F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.6918F, 0.4909F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(14, 50).addBox(-1.5F, -0.8964F, -0.9104F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, -0.0918F, -0.0091F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(51, 25).addBox(-2.0F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, -0.0118F, -1.4243F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(51, 22).addBox(-2.0F, -0.9999F, -1.0105F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, -0.0918F, -0.2091F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(46, 16).addBox(-1.5F, -0.4F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6918F, -0.2091F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, 0.0F, 0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(44, 28).addBox(-0.5F, 0.0F, 0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.85F, -0.8F, -0.4363F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(45, 43).addBox(0.1F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F))
				.texOffs(33, 33).addBox(-0.5F, 0.6F, -11.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F))
				.texOffs(45, 43).mirror().addBox(-1.1F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(30, 58).addBox(-0.5F, 1.0676F, -9.1397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.45F, -1.875F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(0.0F, 1.5964F, -5.2022F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r54 = jaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(56, 46).mirror().addBox(-0.3031F, -0.7117F, -0.5903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(57, 17).mirror().addBox(-0.3031F, -0.6117F, -0.5903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.8069F, -9.5819F, 0.0384F, 0.0026F, -0.6283F));

		PartDefinition cube_r55 = jaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(52, 34).mirror().addBox(-0.3F, -0.6F, -0.4991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 56).mirror().addBox(-0.3F, -0.7F, -0.4991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.8069F, -10.2819F, 0.1781F, 0.0026F, -0.6283F));

		PartDefinition cube_r56 = jaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(20, 56).mirror().addBox(-0.3173F, -0.5504F, -0.4396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(56, 28).mirror().addBox(-0.3173F, -0.8504F, -0.4396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.8069F, -10.7819F, 0.3875F, 0.0026F, -0.6283F));

		PartDefinition cube_r57 = jaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(25, 58).mirror().addBox(-0.2816F, -0.6092F, -0.5686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3185F, 0.7776F, -8.6826F, -0.0663F, 0.0026F, -0.6283F));

		PartDefinition cube_r58 = jaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(57, 34).mirror().addBox(-0.4114F, -0.8275F, -0.5385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(58, 31).mirror().addBox(-0.3794F, -0.7853F, 0.2844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(35, 58).mirror().addBox(-0.3138F, -0.6319F, 0.9788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2857F, 0.8193F, -7.8843F, 0.1082F, 0.0026F, -0.6283F));

		PartDefinition cube_r59 = jaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(55, 3).mirror().addBox(-0.5951F, -0.5309F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.3536F, -5.305F, 0.0706F, 0.0229F, -0.3134F));

		PartDefinition cube_r60 = jaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(44, 24).mirror().addBox(-0.5F, -0.7659F, -0.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 1.2F, -5.625F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r61 = jaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-1.5F, -0.2F, -0.325F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 21).addBox(-1.1F, -0.2F, -0.325F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 0.8F, -8.225F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r62 = jaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(57, 49).mirror().addBox(-0.5961F, -0.5276F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2647F, -4.1083F, 0.0713F, 0.0204F, -0.2785F));

		PartDefinition cube_r63 = jaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(51, 57).mirror().addBox(-0.5715F, -0.6195F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2903F, -3.1036F, 0.0717F, 0.0192F, -0.2611F));

		PartDefinition cube_r64 = jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(32, 5).mirror().addBox(-1.5F, -0.2F, -3.775F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(32, 5).addBox(-0.5F, -0.2F, -3.775F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.775F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r65 = jaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(57, 43).mirror().addBox(-2.5F, -0.2F, 0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(57, 40).mirror().addBox(-2.5F, -0.2F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4F, 0.0F, -0.825F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r66 = jaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(44, 24).addBox(-0.5F, -0.7659F, -0.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2F, 1.2F, -5.625F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r67 = jaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(43, 19).addBox(-0.5F, -1.8888F, -0.16F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 2.7F, -6.725F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r68 = jaw.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(51, 47).addBox(-0.5F, -1.809F, -0.1569F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 2.8F, -7.325F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r69 = jaw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(42, 51).addBox(-0.5F, -1.7353F, -0.2524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.7F, -7.825F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r70 = jaw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(47, 51).addBox(-0.5F, -1.8076F, -0.2241F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 2.5F, -8.425F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r71 = jaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(51, 28).addBox(-0.5F, -1.278F, -0.192F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 1.7F, -8.625F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r72 = jaw.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(46, 8).addBox(-0.5F, -0.7866F, -0.2232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 1.3F, -10.225F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r73 = jaw.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(51, 57).addBox(-0.4285F, -0.6195F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.2903F, -3.1036F, 0.0717F, -0.0192F, 0.2611F));

		PartDefinition cube_r74 = jaw.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(57, 49).addBox(-0.4039F, -0.5276F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.2647F, -4.1083F, 0.0713F, -0.0204F, 0.2785F));

		PartDefinition cube_r75 = jaw.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(55, 3).addBox(-0.4049F, -0.5309F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, 0.3536F, -5.305F, 0.0706F, -0.0229F, 0.3134F));

		PartDefinition cube_r76 = jaw.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(20, 56).addBox(-0.6827F, -0.5504F, -0.4396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(56, 28).addBox(-0.6827F, -0.8504F, -0.4396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.3F, 0.8069F, -10.7819F, 0.3875F, -0.0026F, 0.6283F));

		PartDefinition cube_r77 = jaw.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(35, 58).addBox(-0.6862F, -0.6319F, 0.9788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(58, 31).addBox(-0.6206F, -0.7853F, 0.2844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(57, 34).addBox(-0.5886F, -0.8275F, -0.5385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2857F, 0.8193F, -7.8843F, 0.1082F, -0.0026F, 0.6283F));

		PartDefinition cube_r78 = jaw.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(25, 58).addBox(-0.7184F, -0.6092F, -0.5686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3185F, 0.7776F, -8.6826F, -0.0663F, -0.0026F, 0.6283F));

		PartDefinition cube_r79 = jaw.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(56, 46).addBox(-0.6969F, -0.7117F, -0.5903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(57, 17).addBox(-0.6969F, -0.6117F, -0.5903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, 0.8069F, -9.5819F, 0.0384F, -0.0026F, 0.6283F));

		PartDefinition cube_r80 = jaw.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(15, 56).addBox(-0.7F, -0.7F, -0.4991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(52, 34).addBox(-0.7F, -0.6F, -0.4991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, 0.8069F, -10.2819F, 0.1781F, -0.0026F, 0.6283F));

		PartDefinition cube_r81 = jaw.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(57, 43).addBox(1.5F, -0.2F, 0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(57, 40).addBox(1.5F, -0.2F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4F, 0.0F, -0.825F, 0.192F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.15F, -5.8F, -0.1309F, 0.0F, 0.0F));

		PartDefinition throat2 = throat.addOrReplaceChild("throat2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, -0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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