package fossils.fossils.client.blockentity.model.austriadactylus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AustriadactylusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart body2;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tailthing1;
	private final ModelPart bone;
	private final ModelPart leftLeg;
	private final ModelPart leftLegMembrane;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart finger;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLegMembrane;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart finger2;
	private final ModelPart rightLeg4;
	private final ModelPart chest;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftWing;
	private final ModelPart leftWing2;
	private final ModelPart leftWing3;
	private final ModelPart hand;
	private final ModelPart leftWing4;
	private final ModelPart leftWing5;
	private final ModelPart leftWing6;
	private final ModelPart leftWing7;
	private final ModelPart rightWing;
	private final ModelPart rightWing2;
	private final ModelPart rightWing3;
	private final ModelPart hand2;
	private final ModelPart rightWing4;
	private final ModelPart rightWing5;
	private final ModelPart rightWing6;
	private final ModelPart rightWing7;

	public AustriadactylusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.body2 = this.root.getChild("body2");
		this.hips = this.body2.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tailthing1 = this.tail5.getChild("tailthing1");
		this.bone = this.hips.getChild("bone");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLegMembrane = this.leftLeg.getChild("leftLegMembrane");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.finger = this.leftLeg3.getChild("finger");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLegMembrane = this.rightLeg.getChild("rightLegMembrane");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.finger2 = this.rightLeg3.getChild("finger2");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.chest = this.body2.getChild("chest");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftWing = this.chest.getChild("leftWing");
		this.leftWing2 = this.leftWing.getChild("leftWing2");
		this.leftWing3 = this.leftWing2.getChild("leftWing3");
		this.hand = this.leftWing3.getChild("hand");
		this.leftWing4 = this.leftWing3.getChild("leftWing4");
		this.leftWing5 = this.leftWing4.getChild("leftWing5");
		this.leftWing6 = this.leftWing5.getChild("leftWing6");
		this.leftWing7 = this.leftWing6.getChild("leftWing7");
		this.rightWing = this.chest.getChild("rightWing");
		this.rightWing2 = this.rightWing.getChild("rightWing2");
		this.rightWing3 = this.rightWing2.getChild("rightWing3");
		this.hand2 = this.rightWing3.getChild("hand2");
		this.rightWing4 = this.rightWing3.getChild("rightWing4");
		this.rightWing5 = this.rightWing4.getChild("rightWing5");
		this.rightWing6 = this.rightWing5.getChild("rightWing6");
		this.rightWing7 = this.rightWing6.getChild("rightWing7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition body2 = root.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9F, -4.6F, 0.1845F, 0.0F, 0.0F));

		PartDefinition chest_r1 = body2.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(50, 78).addBox(0.0F, -0.5F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 67).addBox(0.0F, -0.6F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 43).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.1F, -3.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest_r2 = body2.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(53, 48).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0738F, -2.7007F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest_r3 = body2.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(50, 0).addBox(-2.0F, -0.5F, -1.3F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4524F, -0.3821F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck6_r1 = body2.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6786F, 1.1215F, 0.4609F, 0.3399F, -0.5738F));

		PartDefinition neck7_r1 = body2.addOrReplaceChild("neck7_r1", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-1.887F, -0.4611F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6786F, 1.1215F, 0.2556F, 0.4878F, -1.0741F));

		PartDefinition neck8_r1 = body2.addOrReplaceChild("neck8_r1", CubeListBuilder.create().texOffs(78, 68).mirror().addBox(-2.4036F, -1.3428F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6786F, 1.1215F, -0.0478F, 0.544F, -1.675F));

		PartDefinition neck7_r2 = body2.addOrReplaceChild("neck7_r2", CubeListBuilder.create().texOffs(42, 69).mirror().addBox(-3.4036F, -1.3428F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.7786F, -0.8785F, 0.0562F, 0.5762F, -1.4825F));

		PartDefinition neck6_r2 = body2.addOrReplaceChild("neck6_r2", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(-1.887F, -0.4611F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.7786F, -0.8785F, 0.358F, 0.4648F, -0.8899F));

		PartDefinition neck5_r1 = body2.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(78, 64).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.7786F, -0.8785F, 0.534F, 0.2769F, -0.4144F));

		PartDefinition neck6_r3 = body2.addOrReplaceChild("neck6_r3", CubeListBuilder.create().texOffs(55, 41).mirror().addBox(-3.4036F, -1.3428F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6786F, -2.7785F, 0.1823F, 0.5696F, -1.3102F));

		PartDefinition neck5_r2 = body2.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(78, 62).mirror().addBox(-1.887F, -0.4611F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6786F, -2.7785F, 0.4518F, 0.4014F, -0.7467F));

		PartDefinition neck4_r1 = body2.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(78, 60).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6786F, -2.7785F, 0.5833F, 0.1823F, -0.2994F));

		PartDefinition neck7_r3 = body2.addOrReplaceChild("neck7_r3", CubeListBuilder.create().texOffs(78, 68).addBox(1.4036F, -1.3428F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6786F, 1.1215F, -0.0478F, -0.544F, 1.675F));

		PartDefinition neck6_r4 = body2.addOrReplaceChild("neck6_r4", CubeListBuilder.create().texOffs(0, 79).addBox(0.887F, -0.4611F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6786F, 1.1215F, 0.2556F, -0.4878F, 1.0741F));

		PartDefinition neck5_r3 = body2.addOrReplaceChild("neck5_r3", CubeListBuilder.create().texOffs(5, 79).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6786F, 1.1215F, 0.4609F, -0.3399F, 0.5738F));

		PartDefinition neck4_r2 = body2.addOrReplaceChild("neck4_r2", CubeListBuilder.create().texOffs(78, 64).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7786F, -0.8785F, 0.534F, -0.2769F, 0.4144F));

		PartDefinition neck5_r4 = body2.addOrReplaceChild("neck5_r4", CubeListBuilder.create().texOffs(78, 66).addBox(0.887F, -0.4611F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7786F, -0.8785F, 0.358F, -0.4648F, 0.8899F));

		PartDefinition neck6_r5 = body2.addOrReplaceChild("neck6_r5", CubeListBuilder.create().texOffs(42, 69).addBox(1.4036F, -1.3428F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7786F, -0.8785F, 0.0562F, -0.5762F, 1.4825F));

		PartDefinition neck3_r1 = body2.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(78, 60).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6786F, -2.7785F, 0.5833F, -0.1823F, 0.2994F));

		PartDefinition neck4_r3 = body2.addOrReplaceChild("neck4_r3", CubeListBuilder.create().texOffs(78, 62).addBox(0.887F, -0.4611F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6786F, -2.7785F, 0.4518F, -0.4014F, 0.7467F));

		PartDefinition neck5_r5 = body2.addOrReplaceChild("neck5_r5", CubeListBuilder.create().texOffs(55, 41).addBox(1.4036F, -1.3428F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6786F, -2.7785F, 0.1823F, -0.5696F, 1.3102F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8212F, 2.9688F, 0.0853F, 0.0F, 0.0F));

		PartDefinition body_r1 = hips.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(25, 79).mirror().addBox(-1.5F, 0.0F, 0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 24).mirror().addBox(-1.5F, 0.0F, -1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 79).addBox(0.5F, 0.0F, 0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 24).addBox(0.5F, 0.0F, -1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 24).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 1.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(27, 12).addBox(-0.5F, -0.3152F, -0.1517F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.3F, 4.8F, 0.1621F, 0.0431F, 0.007F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6848F, 9.9483F, 0.3027F, 0.0417F, 0.013F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5F, 9.7F, 0.0019F, 0.0436F, 0.0001F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(27, 24).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1645F, 0.0861F, -0.0143F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(38, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.1382F, 0.0864F, -0.012F));

		PartDefinition tailthing1 = tail5.addOrReplaceChild("tailthing1", CubeListBuilder.create().texOffs(19, 44).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.1314F, 0.0865F, -0.0114F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-0.4F, 0.6F, 1.3F));

		PartDefinition body_r2 = bone.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(14, 61).mirror().addBox(-2.0F, -0.0079F, -2.2095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.4994F, -1.1349F, 1.5708F, -0.8465F, -1.5708F));

		PartDefinition body_r3 = bone.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.5F, -0.5F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.7521F, 1.6833F, -1.7305F, 0.8862F, -0.259F, -0.2367F));

		PartDefinition body_r4 = bone.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(75, 57).mirror().addBox(-0.5F, -0.45F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.7521F, 1.6833F, -1.7305F, 0.188F, -0.259F, -0.2367F));

		PartDefinition body_r5 = bone.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(59, 77).mirror().addBox(-0.5F, -0.7F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(59, 77).addBox(2.7F, -0.7F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.2F, 0.9959F, -0.8234F, -0.4276F, 0.0F, 0.0F));

		PartDefinition body_r6 = bone.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(77, 54).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(77, 54).addBox(2.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-1.2F, 0.9959F, -0.8234F, 0.1396F, 0.0F, 0.0F));

		PartDefinition body_r7 = bone.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.5F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(0, 68).addBox(2.7F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.2F, 0.6889F, 1.1624F, -0.3403F, 0.0F, 0.0F));

		PartDefinition body_r8 = bone.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(49, 67).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(49, 67).addBox(2.7F, -0.6F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-1.2F, 0.9994F, -0.0349F, 0.0087F, 0.0F, 0.0F));

		PartDefinition body_r9 = bone.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(61, 62).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(28, 61).mirror().addBox(-0.5F, -1.6F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(61, 62).addBox(2.7F, -1.1F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F))
				.texOffs(28, 61).addBox(2.7F, -1.6F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.2F, 0.9994F, -0.0349F, 0.1833F, 0.0F, 0.0F));

		PartDefinition body_r10 = bone.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(74, 24).mirror().addBox(-2.5F, -0.75F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(10, 74).mirror().addBox(-2.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(74, 24).addBox(0.7F, -0.75F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(10, 74).addBox(0.7F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.8F, -0.0971F, -1.3474F, -0.2531F, 0.0F, 0.0F));

		PartDefinition body_r11 = bone.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(45, 61).mirror().addBox(-0.5F, -0.0079F, -1.8095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.4994F, -1.1349F, 0.7553F, -0.259F, -0.2367F));

		PartDefinition body_r12 = bone.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(56, 48).mirror().addBox(-2.5F, -0.8F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(56, 48).addBox(0.7F, -0.8F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.8F, 0.0F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body_r13 = bone.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(14, 61).addBox(1.0F, -0.0079F, -2.2095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.0F, 0.4994F, -1.1349F, 1.5708F, 0.8465F, 1.5708F));

		PartDefinition body_r14 = bone.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, -0.5F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(1.5521F, 1.6833F, -1.7305F, 0.8862F, 0.259F, 0.2367F));

		PartDefinition body_r15 = bone.addOrReplaceChild("body_r15", CubeListBuilder.create().texOffs(75, 57).addBox(-0.5F, -0.45F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.5521F, 1.6833F, -1.7305F, 0.188F, 0.259F, 0.2367F));

		PartDefinition body_r16 = bone.addOrReplaceChild("body_r16", CubeListBuilder.create().texOffs(45, 61).addBox(-0.5F, -0.0079F, -1.8095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.0F, 0.4994F, -1.1349F, 0.7553F, 0.259F, 0.2367F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8982F, 1.5066F, 0.6644F, 0.4902F, -0.0902F, -1.483F));

		PartDefinition cube_r1 = leftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(66, 70).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1987F)), PartPose.offsetAndRotation(0.1F, 1.5492F, 0.6628F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 44).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 3.1128F, -0.2062F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = leftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(61, 70).addBox(-0.5F, -2.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 2.0F, 0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(55, 31).addBox(-0.4F, -0.2F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0193F, 5.9203F, 0.3896F, 0.8203F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(53, 43).addBox(-1.0F, -0.6F, -2.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1326F, 7.2685F, 0.7819F, 1.064F, 0.0984F, -0.0101F));

		PartDefinition finger = leftLeg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7243F, -0.1695F, 0.0302F, 0.0623F, -0.0982F, -0.0319F));

		PartDefinition cube_r4 = finger.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(73, 21).addBox(0.0411F, -0.5F, -2.3422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(69, 77).addBox(0.0411F, -0.5F, -1.9422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8142F, 0.0542F, -1.3309F, 0.0F, 1.0559F, 0.0F));

		PartDefinition cube_r5 = finger.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(68, 9).addBox(-0.4983F, -0.5F, -2.9238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(61, 10).addBox(-0.4983F, -0.5F, -1.5238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2142F, 0.0542F, -0.3309F, 0.0F, 0.6021F, 0.0F));

		PartDefinition cube_r6 = finger.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 77).addBox(-0.3039F, -0.5F, -1.7478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0858F, 0.0542F, 1.0691F, 0.0F, 0.3491F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(45, 51).addBox(-1.0F, -0.0101F, -0.9001F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -4.9649F, 0.0007F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8982F, 1.5066F, 0.6644F, 0.4817F, 0.1309F, 1.4054F));

		PartDefinition cube_r7 = rightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(66, 70).mirror().addBox(-0.5F, -0.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1987F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.5492F, 0.6628F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r8 = rightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 44).mirror().addBox(-0.5F, -0.2F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 3.1128F, -0.2062F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = rightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(61, 70).mirror().addBox(-0.5F, -2.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.0F, 0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(55, 31).mirror().addBox(-0.6F, -0.2F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0193F, 5.9203F, 0.3896F, 0.8203F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(53, 43).mirror().addBox(-1.0F, -0.6F, -2.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1326F, 7.2685F, 0.7819F, 1.064F, -0.0984F, 0.0101F));

		PartDefinition finger2 = rightLeg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7243F, -0.1695F, 0.0302F, 0.0623F, 0.0982F, 0.0319F));

		PartDefinition cube_r10 = finger2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(73, 21).mirror().addBox(-1.0411F, -0.5F, -2.3422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(69, 77).mirror().addBox(-1.0411F, -0.5F, -1.9422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8142F, 0.0542F, -1.3309F, 0.0F, -1.0559F, 0.0F));

		PartDefinition cube_r11 = finger2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(68, 9).mirror().addBox(-0.5017F, -0.5F, -2.9238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(61, 10).mirror().addBox(-0.5017F, -0.5F, -1.5238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2142F, 0.0542F, -0.3309F, 0.0F, -0.6021F, 0.0F));

		PartDefinition cube_r12 = finger2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(64, 77).mirror().addBox(-0.6961F, -0.5F, -1.7478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0858F, 0.0542F, 1.0691F, 0.0F, -0.3491F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(45, 51).mirror().addBox(-1.0F, -0.0101F, -0.9001F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5877F, -4.9649F, 0.0007F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(50, 5).addBox(-1.5F, 3.2384F, -2.0596F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6549F, -3.0858F, 0.0342F, 0.0F, 0.0F));

		PartDefinition neck3_r2 = chest.addOrReplaceChild("neck3_r2", CubeListBuilder.create().texOffs(79, 29).addBox(0.0F, -0.2F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 26).addBox(0.0F, -0.2F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 48).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -4.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck4_r4 = chest.addOrReplaceChild("neck4_r4", CubeListBuilder.create().texOffs(61, 58).mirror().addBox(-0.5F, -0.225F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.523F, -0.3889F, -2.1213F, 0.1866F, 0.17F, 0.0396F));

		PartDefinition neck4_r5 = chest.addOrReplaceChild("neck4_r5", CubeListBuilder.create().texOffs(50, 16).mirror().addBox(-0.4089F, -0.3395F, 0.2834F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.3F, -4.2F, -0.9686F, 0.1097F, -0.1579F));

		PartDefinition neck3_r3 = chest.addOrReplaceChild("neck3_r3", CubeListBuilder.create().texOffs(21, 61).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.618F, 0.3793F, -2.4965F, 0.4921F, 0.17F, 0.0396F));

		PartDefinition neck4_r6 = chest.addOrReplaceChild("neck4_r6", CubeListBuilder.create().texOffs(20, 79).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0214F, -3.4785F, 0.6443F, 0.3456F, -0.4227F));

		PartDefinition neck5_r6 = chest.addOrReplaceChild("neck5_r6", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-1.887F, -0.4611F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0214F, -3.4785F, 0.4294F, 0.5739F, -0.8965F));

		PartDefinition neck6_r6 = chest.addOrReplaceChild("neck6_r6", CubeListBuilder.create().texOffs(50, 22).mirror().addBox(-4.4036F, -1.3428F, -0.4758F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0214F, -3.4785F, 0.041F, 0.701F, -1.5336F));

		PartDefinition neck5_r7 = chest.addOrReplaceChild("neck5_r7", CubeListBuilder.create().texOffs(46, 31).mirror().addBox(-4.4036F, -1.3429F, -0.4758F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0786F, -1.4785F, 0.1719F, 0.5359F, -1.3855F));

		PartDefinition neck4_r7 = chest.addOrReplaceChild("neck4_r7", CubeListBuilder.create().texOffs(78, 22).mirror().addBox(-1.887F, -0.4611F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0786F, -1.4785F, 0.4243F, 0.3775F, -0.827F));

		PartDefinition neck3_r4 = chest.addOrReplaceChild("neck3_r4", CubeListBuilder.create().texOffs(32, 49).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0786F, -1.4785F, 0.5495F, 0.1719F, -0.3752F));

		PartDefinition neck5_r8 = chest.addOrReplaceChild("neck5_r8", CubeListBuilder.create().texOffs(50, 22).addBox(1.4036F, -1.3428F, -0.4758F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0214F, -3.4785F, 0.041F, -0.701F, 1.5336F));

		PartDefinition neck4_r8 = chest.addOrReplaceChild("neck4_r8", CubeListBuilder.create().texOffs(15, 79).addBox(0.887F, -0.4611F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0214F, -3.4785F, 0.4294F, -0.5739F, 0.8965F));

		PartDefinition neck3_r5 = chest.addOrReplaceChild("neck3_r5", CubeListBuilder.create().texOffs(20, 79).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0214F, -3.4785F, 0.6443F, -0.3456F, 0.4227F));

		PartDefinition neck4_r9 = chest.addOrReplaceChild("neck4_r9", CubeListBuilder.create().texOffs(46, 31).addBox(1.4036F, -1.3429F, -0.4758F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0786F, -1.4785F, 0.1719F, -0.5359F, 1.3855F));

		PartDefinition neck3_r6 = chest.addOrReplaceChild("neck3_r6", CubeListBuilder.create().texOffs(78, 22).addBox(0.887F, -0.4611F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0786F, -1.4785F, 0.4243F, -0.3775F, 0.827F));

		PartDefinition neck2_r1 = chest.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(32, 49).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0786F, -1.4785F, 0.5495F, -0.1719F, 0.3752F));

		PartDefinition neck3_r7 = chest.addOrReplaceChild("neck3_r7", CubeListBuilder.create().texOffs(50, 16).addBox(-0.5911F, -0.3395F, 0.2834F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0F, 0.3F, -4.2F, -0.9686F, -0.1097F, 0.1579F));

		PartDefinition neck3_r8 = chest.addOrReplaceChild("neck3_r8", CubeListBuilder.create().texOffs(61, 58).addBox(-0.5F, -0.225F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.523F, -0.3889F, -2.1213F, 0.1866F, -0.17F, -0.0396F));

		PartDefinition neck2_r2 = chest.addOrReplaceChild("neck2_r2", CubeListBuilder.create().texOffs(21, 61).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.618F, 0.3793F, -2.4965F, 0.4921F, -0.17F, -0.0396F));

		PartDefinition neck2_r3 = chest.addOrReplaceChild("neck2_r3", CubeListBuilder.create().texOffs(0, 55).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8265F, -1.4741F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0607F, -4.8155F, -0.1329F, -0.173F, 0.023F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(61, 18).addBox(-0.5F, -0.7588F, -2.1659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2922F, 0.0808F, 0.096F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(61, 14).addBox(-0.5F, -0.5643F, -1.8905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3068F, -1.973F, -0.3081F, -0.0832F, 0.0264F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(60, 37).addBox(-0.5F, -0.5643F, -1.9905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0046F, -1.8291F, -0.248F, -0.1269F, 0.032F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(7, 61).addBox(-0.5F, -0.5643F, -1.9905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0017F, -1.8554F, -0.1977F, -0.1797F, -0.008F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0773F, -0.5129F, -1.943F, 0.6677F, -0.1971F, -0.1813F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(45, 78).addBox(-0.5F, -0.1011F, -0.4512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.0773F, -0.1776F, -9.7248F, -1.6842F, 0.0F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(13, 48).addBox(-0.5F, -0.5564F, -0.1383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.0773F, -0.7242F, -10.1138F, -1.3177F, 0.0F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(60, 27).addBox(-0.5F, -1.7429F, -0.7958F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0773F, -1.5011F, -6.3456F, -1.7191F, 0.0F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(59, 22).addBox(-0.5F, -1.7843F, -0.2145F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0773F, -2.8702F, -9.0887F, -1.885F, 0.0F, 0.0F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(66, 22).addBox(-0.5F, -0.175F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0773F, -1.7541F, -3.3278F, -0.0916F, 0.0F, 0.0F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -0.9343F, -1.1395F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0773F, -1.0612F, -8.595F, -1.3177F, 0.0F, 0.0F));

		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(60, 32).addBox(-0.5F, -1.6021F, -0.2271F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.0773F, -2.3676F, -7.5968F, -1.7977F, 0.0F, 0.0F));

		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(65, 53).addBox(-0.5F, -0.8096F, -0.1831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0773F, -2.833F, -9.6853F, -1.4486F, 0.0F, 0.0F));

		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(40, 78).addBox(-0.5F, -0.9346F, -2.1331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0773F, -1.0612F, -8.595F, -0.6632F, 0.0F, 0.0F));

		PartDefinition head_r10 = head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(65, 49).addBox(-0.5F, -0.8216F, -0.177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.0773F, -1.7899F, -10.268F, -0.3578F, 0.0F, 0.0F));

		PartDefinition head_r11 = head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(54, 58).addBox(-0.5F, -0.6267F, -1.9427F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0773F, -1.0612F, -8.595F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head_r12 = head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(65, 45).addBox(-0.5F, -0.1518F, -1.6584F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0773F, -1.0134F, -8.3553F, 0.1484F, 0.0F, 0.0F));

		PartDefinition head_r13 = head.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(50, 10).addBox(-0.5F, 0.007F, -3.9904F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0773F, -1.6432F, -4.4058F, 0.1484F, 0.0F, 0.0F));

		PartDefinition head_r14 = head.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(42, 65).addBox(-1.5F, -0.075F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4227F, -1.6172F, -3.3944F, 0.0436F, 0.0F, 0.0F));

		PartDefinition head_r15 = head.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(28, 65).addBox(-1.0F, 0.0065F, -0.9694F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0773F, -1.6405F, -2.447F, -0.0611F, 0.0F, 0.0F));

		PartDefinition head_r16 = head.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(21, 65).addBox(-1.0F, -0.0575F, -0.9888F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0773F, -1.4991F, -1.4682F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head_r17 = head.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(14, 65).addBox(-1.0F, 0.025F, -1.525F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 65).addBox(-1.0F, 0.025F, -1.025F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0773F, -0.9401F, -0.0587F, -0.4189F, 0.0F, 0.0F));

		PartDefinition head_r18 = head.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(67, 38).addBox(-1.0F, -0.675F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0773F, -0.2508F, 0.0629F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head_r19 = head.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(20, 57).addBox(-0.5F, -0.725F, -0.425F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5773F, 0.9278F, -2.7005F, 1.2654F, 0.0F, 0.0F));

		PartDefinition head_r20 = head.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(56, 53).addBox(-1.0F, -1.725F, -0.575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.0773F, 1.299F, -0.7488F, 1.309F, 0.0F, 0.0F));

		PartDefinition head_r21 = head.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(7, 69).addBox(-1.0F, -1.0F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0773F, 0.751F, -0.2008F, 0.7854F, 0.0F, 0.0F));

		PartDefinition head_r22 = head.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(11, 57).addBox(-1.0F, -0.425F, -1.425F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0773F, 0.2F, -0.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(74, 27).addBox(0.0977F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(63, 5).addBox(0.0977F, -0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(74, 27).mirror().addBox(-1.2523F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(63, 5).mirror().addBox(-1.2523F, -0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0889F, -0.6208F, 0.5498F, 0.0F, 0.0F));

		PartDefinition jaw_r1 = jaw.addOrReplaceChild("jaw_r1", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-0.5F, -0.625F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(65, 0).addBox(0.85F, -0.625F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.7523F, -0.0558F, -1.1345F, -0.3054F, 0.0F, 0.0F));

		PartDefinition jaw_r2 = jaw.addOrReplaceChild("jaw_r2", CubeListBuilder.create().texOffs(64, 41).mirror().addBox(-0.5F, -0.175F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(64, 41).addBox(0.85F, -0.175F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.7523F, -0.6946F, -1.7216F, 0.0873F, 0.0F, 0.0F));

		PartDefinition jaw_r3 = jaw.addOrReplaceChild("jaw_r3", CubeListBuilder.create().texOffs(67, 26).mirror().addBox(-0.2F, -1.0133F, -3.3602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 64).mirror().addBox(-0.2F, -1.0133F, -1.7602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0523F, 0.295F, -3.1973F, -0.0873F, -0.0873F, 0.0F));

		PartDefinition jaw_r4 = jaw.addOrReplaceChild("jaw_r4", CubeListBuilder.create().texOffs(75, 7).mirror().addBox(-0.2F, -0.4721F, -6.9981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(35, 67).mirror().addBox(-0.2F, -0.4721F, -6.5981F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0523F, 0.295F, -3.1973F, -0.24F, -0.0873F, 0.0F));

		PartDefinition jaw_r5 = jaw.addOrReplaceChild("jaw_r5", CubeListBuilder.create().texOffs(49, 75).mirror().addBox(-0.2643F, -0.1729F, -5.311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(39, 75).mirror().addBox(-0.2643F, 0.0271F, -6.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(44, 75).mirror().addBox(-0.2643F, -0.3729F, -6.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0523F, 0.295F, -3.1973F, -0.3441F, -0.137F, -0.1938F));

		PartDefinition jaw_r6 = jaw.addOrReplaceChild("jaw_r6", CubeListBuilder.create().texOffs(75, 16).mirror().addBox(-0.2643F, -1.7036F, -6.5561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(34, 75).mirror().addBox(-0.2643F, -2.1036F, -6.5561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0523F, 0.295F, -3.1973F, -0.0823F, -0.137F, -0.1938F));

		PartDefinition jaw_r7 = jaw.addOrReplaceChild("jaw_r7", CubeListBuilder.create().texOffs(75, 13).mirror().addBox(-0.2643F, -2.9811F, -6.7087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(75, 10).mirror().addBox(-0.2643F, -3.3811F, -6.7087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0523F, 0.295F, -3.1973F, 0.1359F, -0.137F, -0.1938F));

		PartDefinition jaw_r8 = jaw.addOrReplaceChild("jaw_r8", CubeListBuilder.create().texOffs(67, 34).mirror().addBox(-0.2F, -0.6389F, -5.0066F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0523F, 0.295F, -3.1973F, -0.2051F, -0.0873F, 0.0F));

		PartDefinition jaw_r9 = jaw.addOrReplaceChild("jaw_r9", CubeListBuilder.create().texOffs(67, 30).mirror().addBox(-0.2F, -0.7917F, -3.4107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0523F, 0.295F, -3.1973F, -0.1571F, -0.0873F, 0.0F));

		PartDefinition jaw_r10 = jaw.addOrReplaceChild("jaw_r10", CubeListBuilder.create().texOffs(52, 63).mirror().addBox(-0.2F, -0.75F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0523F, 0.295F, -3.1973F, -0.1833F, -0.0873F, 0.0F));

		PartDefinition jaw_r11 = jaw.addOrReplaceChild("jaw_r11", CubeListBuilder.create().texOffs(35, 63).mirror().addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(35, 63).addBox(0.85F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7523F, 0.4054F, -1.6216F, -0.0349F, 0.0F, 0.0F));

		PartDefinition jaw_r12 = jaw.addOrReplaceChild("jaw_r12", CubeListBuilder.create().texOffs(67, 26).addBox(-0.8F, -1.0133F, -3.3602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 64).addBox(-0.8F, -1.0133F, -1.7602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8977F, 0.295F, -3.1973F, -0.0873F, 0.0873F, 0.0F));

		PartDefinition jaw_r13 = jaw.addOrReplaceChild("jaw_r13", CubeListBuilder.create().texOffs(75, 7).addBox(-0.8F, -0.4721F, -6.9981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(35, 67).addBox(-0.8F, -0.4721F, -6.5981F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8977F, 0.295F, -3.1973F, -0.24F, 0.0873F, 0.0F));

		PartDefinition jaw_r14 = jaw.addOrReplaceChild("jaw_r14", CubeListBuilder.create().texOffs(49, 75).addBox(-0.7356F, -0.1729F, -5.311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(39, 75).addBox(-0.7356F, 0.0271F, -6.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(44, 75).addBox(-0.7356F, -0.3729F, -6.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8977F, 0.295F, -3.1973F, -0.3441F, 0.137F, 0.1938F));

		PartDefinition jaw_r15 = jaw.addOrReplaceChild("jaw_r15", CubeListBuilder.create().texOffs(75, 16).addBox(-0.7356F, -1.7036F, -6.5561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(34, 75).addBox(-0.7356F, -2.1036F, -6.5561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8977F, 0.295F, -3.1973F, -0.0823F, 0.137F, 0.1938F));

		PartDefinition jaw_r16 = jaw.addOrReplaceChild("jaw_r16", CubeListBuilder.create().texOffs(75, 13).addBox(-0.7356F, -2.9811F, -6.7087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(75, 10).addBox(-0.7356F, -3.3811F, -6.7087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8977F, 0.295F, -3.1973F, 0.1359F, 0.137F, 0.1938F));

		PartDefinition jaw_r17 = jaw.addOrReplaceChild("jaw_r17", CubeListBuilder.create().texOffs(67, 34).addBox(-0.8F, -0.6389F, -5.0066F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8977F, 0.295F, -3.1973F, -0.2051F, 0.0873F, 0.0F));

		PartDefinition jaw_r18 = jaw.addOrReplaceChild("jaw_r18", CubeListBuilder.create().texOffs(67, 30).addBox(-0.8F, -0.7917F, -3.4107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8977F, 0.295F, -3.1973F, -0.1571F, 0.0873F, 0.0F));

		PartDefinition jaw_r19 = jaw.addOrReplaceChild("jaw_r19", CubeListBuilder.create().texOffs(52, 63).addBox(-0.8F, -0.75F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8977F, 0.295F, -3.1973F, -0.1833F, 0.0873F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6091F, 0.9078F, -7.6618F));

		PartDefinition head_r23 = leftFace.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(74, 74).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(74, 74).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1364F, -1.7523F, 7.0858F, 2.7227F, 0.0F, 0.0F));

		PartDefinition head_r24 = leftFace.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(74, 74).addBox(-0.5F, 0.1404F, -0.3528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1364F, -0.0231F, 6.7447F, 2.5482F, 0.0F, 0.0F));

		PartDefinition head_r25 = leftFace.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(35, 78).addBox(-0.8246F, -0.9967F, 0.5131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, -0.0132F, 0.0738F, -0.051F));

		PartDefinition head_r26 = leftFace.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(69, 74).addBox(-0.5F, -0.5869F, -0.62F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1364F, -0.0231F, 6.7447F, 1.3265F, 0.0F, 0.0F));

		PartDefinition head_r27 = leftFace.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(76, 39).addBox(-0.5125F, 0.0012F, 0.5313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(25, 76).addBox(-0.5125F, 0.0012F, 0.0063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1239F, -0.1856F, 3.9724F, 1.7846F, 0.0F, 0.0F));

		PartDefinition head_r28 = leftFace.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(64, 74).addBox(-0.5125F, -0.9749F, -0.9798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(54, 74).addBox(-0.5125F, -1.2499F, -0.9798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1239F, -1.0508F, 6.2409F, 0.4625F, 0.0F, 0.0F));

		PartDefinition head_r29 = leftFace.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(56, 70).addBox(-0.5125F, -0.5666F, -1.0415F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1239F, -1.0866F, 4.7413F, 1.3439F, 0.0F, 0.0F));

		PartDefinition head_r30 = leftFace.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(59, 74).addBox(-0.5125F, 0.4701F, -0.6023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.1239F, -1.0866F, 4.7413F, 1.2828F, 0.0F, 0.0F));

		PartDefinition head_r31 = leftFace.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(20, 76).addBox(-0.5125F, -0.0155F, -1.0443F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1239F, -2.1541F, 5.7419F, -0.1396F, 0.0F, 0.0F));

		PartDefinition head_r32 = leftFace.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(70, 4).addBox(-0.5125F, -0.0149F, -1.0082F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.1239F, -2.2949F, 4.7296F, 0.6109F, 0.0F, 0.0F));

		PartDefinition head_r33 = leftFace.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(74, 36).addBox(-0.6375F, -0.375F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F))
				.texOffs(74, 33).addBox(-0.3625F, -0.375F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1239F, -1.1824F, 4.8894F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head_r34 = leftFace.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(29, 69).addBox(-0.575F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0941F, -0.3854F, 3.9614F, -0.2351F, -0.0327F, -0.0119F));

		PartDefinition head_r35 = leftFace.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(29, 73).addBox(-0.863F, 0.577F, 4.7489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, 0.0573F, 0.1228F, -0.1646F));

		PartDefinition head_r36 = leftFace.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(24, 69).addBox(-0.6527F, -0.2904F, 4.0115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(19, 69).addBox(-0.6527F, -0.3904F, 3.2115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(29, 57).addBox(-0.6527F, -0.4904F, 2.4115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, 0.0909F, 0.0816F, -0.2403F));

		PartDefinition head_r37 = leftFace.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(19, 73).addBox(-0.9269F, -1.029F, 2.264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, -0.1411F, 0.0976F, -0.0589F));

		PartDefinition head_r38 = leftFace.addOrReplaceChild("head_r38", CubeListBuilder.create().texOffs(72, 48).addBox(-0.8246F, -1.0955F, 0.3624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, -0.2314F, 0.0738F, -0.051F));

		PartDefinition head_r39 = leftFace.addOrReplaceChild("head_r39", CubeListBuilder.create().texOffs(44, 71).addBox(-0.5768F, -0.5878F, 1.7046F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, 0.0922F, 0.0467F, -0.242F));

		PartDefinition head_r40 = leftFace.addOrReplaceChild("head_r40", CubeListBuilder.create().texOffs(71, 41).addBox(-0.5768F, -1.1976F, 1.207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, -0.2132F, 0.0467F, -0.242F));

		PartDefinition head_r41 = leftFace.addOrReplaceChild("head_r41", CubeListBuilder.create().texOffs(5, 72).addBox(-0.6798F, -1.2938F, -0.3518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, -0.3424F, -0.2377F, -0.348F));

		PartDefinition head_r42 = leftFace.addOrReplaceChild("head_r42", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5338F, -1.1323F, 0.4242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, -0.0386F, -0.1508F, -0.3397F));

		PartDefinition head_r43 = leftFace.addOrReplaceChild("head_r43", CubeListBuilder.create().texOffs(72, 45).addBox(-0.8246F, -0.9897F, -0.2286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, -0.1005F, 0.0738F, -0.051F));

		PartDefinition head_r44 = leftFace.addOrReplaceChild("head_r44", CubeListBuilder.create().texOffs(30, 78).addBox(-0.9269F, -1.1475F, 1.2633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, -0.1935F, 0.0976F, -0.0589F));

		PartDefinition head_r45 = leftFace.addOrReplaceChild("head_r45", CubeListBuilder.create().texOffs(13, 51).addBox(-0.9269F, -0.4849F, 2.2753F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, 0.1382F, 0.0976F, -0.0589F));

		PartDefinition head_r46 = leftFace.addOrReplaceChild("head_r46", CubeListBuilder.create().texOffs(73, 67).addBox(-0.5F, -0.8758F, -0.5243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1179F, -1.3661F, 2.6865F, -1.0658F, 0.1137F, -0.0523F));

		PartDefinition head_r47 = leftFace.addOrReplaceChild("head_r47", CubeListBuilder.create().texOffs(54, 77).addBox(-0.619F, 2.7564F, 2.3099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(77, 51).addBox(-0.619F, 2.7564F, 2.0099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, 1.0456F, 0.1017F, -0.0606F));

		PartDefinition head_r48 = leftFace.addOrReplaceChild("head_r48", CubeListBuilder.create().texOffs(10, 77).addBox(-0.619F, 0.5963F, 3.2636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(77, 0).addBox(-0.619F, 0.5963F, 2.8636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, 0.3823F, 0.1017F, -0.0606F));

		PartDefinition head_r49 = leftFace.addOrReplaceChild("head_r49", CubeListBuilder.create().texOffs(66, 66).addBox(-0.619F, -2.0027F, 2.0142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F))
				.texOffs(59, 66).addBox(-0.619F, -1.6027F, 1.6142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, -0.2722F, 0.1017F, -0.0606F));

		PartDefinition head_r50 = leftFace.addOrReplaceChild("head_r50", CubeListBuilder.create().texOffs(34, 71).addBox(-0.619F, -3.8496F, -0.4059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, -1.2495F, 0.1017F, -0.0606F));

		PartDefinition head_r51 = leftFace.addOrReplaceChild("head_r51", CubeListBuilder.create().texOffs(76, 70).addBox(-0.619F, -4.5304F, -2.0341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F))
				.texOffs(76, 42).addBox(-0.619F, -4.2304F, -2.0341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(77, 48).addBox(-0.619F, -4.2304F, -1.8341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(77, 45).addBox(-0.619F, -3.8304F, -1.8341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 76).addBox(-0.619F, -3.8304F, -2.0341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, -1.7208F, 0.1017F, -0.0606F));

		PartDefinition head_r52 = leftFace.addOrReplaceChild("head_r52", CubeListBuilder.create().texOffs(74, 30).addBox(-0.5F, -0.1243F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1179F, -1.3661F, 2.6865F, -0.9349F, 0.1137F, -0.0523F));

		PartDefinition head_r53 = leftFace.addOrReplaceChild("head_r53", CubeListBuilder.create().texOffs(24, 73).addBox(-0.7968F, -5.3886F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, -1.5466F, 0.0997F, -0.0758F));

		PartDefinition head_r54 = leftFace.addOrReplaceChild("head_r54", CubeListBuilder.create().texOffs(72, 51).addBox(-0.7968F, 4.5808F, 0.165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, 1.4641F, 0.0997F, -0.0758F));

		PartDefinition head_r55 = leftFace.addOrReplaceChild("head_r55", CubeListBuilder.create().texOffs(72, 54).addBox(-0.7968F, 4.9505F, 0.8225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, 1.3332F, 0.0997F, -0.0758F));

		PartDefinition head_r56 = leftFace.addOrReplaceChild("head_r56", CubeListBuilder.create().texOffs(73, 64).addBox(-0.7968F, 5.1149F, -2.3692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, 1.9005F, 0.0997F, -0.0758F));

		PartDefinition head_r57 = leftFace.addOrReplaceChild("head_r57", CubeListBuilder.create().texOffs(5, 76).addBox(0.25F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.6864F, 1.1829F, 6.5271F, 0.6545F, 0.0F, 0.0F));

		PartDefinition head_r58 = leftFace.addOrReplaceChild("head_r58", CubeListBuilder.create().texOffs(73, 61).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.0776F, -1.1606F, 3.1331F, 0.0679F, 0.0997F, -0.0758F));

		PartDefinition head_r59 = leftFace.addOrReplaceChild("head_r59", CubeListBuilder.create().texOffs(45, 56).addBox(-0.9269F, -0.9649F, 3.2478F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, -0.1062F, 0.0976F, -0.0589F));

		PartDefinition head_r60 = leftFace.addOrReplaceChild("head_r60", CubeListBuilder.create().texOffs(75, 4).addBox(-0.8282F, -1.1591F, 6.1755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, 0.1127F, 0.0523F, 0.0358F));

		PartDefinition head_r61 = leftFace.addOrReplaceChild("head_r61", CubeListBuilder.create().texOffs(24, 51).addBox(-1.0447F, -1.0109F, 2.2846F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3164F, -0.6248F, -2.6323F, 0.1351F, 0.0862F, 0.0443F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.7637F, 0.9078F, -7.6618F));

		PartDefinition head_r62 = rightFace.addOrReplaceChild("head_r62", CubeListBuilder.create().texOffs(74, 74).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(74, 74).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1364F, -1.7523F, 7.0858F, 2.7227F, 0.0F, 0.0F));

		PartDefinition head_r63 = rightFace.addOrReplaceChild("head_r63", CubeListBuilder.create().texOffs(74, 74).mirror().addBox(-0.5F, 0.1404F, -0.3528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1364F, -0.0231F, 6.7447F, 2.5482F, 0.0F, 0.0F));

		PartDefinition head_r64 = rightFace.addOrReplaceChild("head_r64", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(-0.1754F, -0.9967F, 0.5131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, -0.0132F, -0.0738F, 0.051F));

		PartDefinition head_r65 = rightFace.addOrReplaceChild("head_r65", CubeListBuilder.create().texOffs(69, 74).mirror().addBox(-0.5F, -0.5869F, -0.62F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1364F, -0.0231F, 6.7447F, 1.3265F, 0.0F, 0.0F));

		PartDefinition head_r66 = rightFace.addOrReplaceChild("head_r66", CubeListBuilder.create().texOffs(76, 39).mirror().addBox(-0.4875F, 0.0012F, 0.5313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(25, 76).mirror().addBox(-0.4875F, 0.0012F, 0.0063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1239F, -0.1856F, 3.9724F, 1.7846F, 0.0F, 0.0F));

		PartDefinition head_r67 = rightFace.addOrReplaceChild("head_r67", CubeListBuilder.create().texOffs(64, 74).mirror().addBox(-0.4875F, -0.9749F, -0.9798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(54, 74).mirror().addBox(-0.4875F, -1.2499F, -0.9798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1239F, -1.0508F, 6.2409F, 0.4625F, 0.0F, 0.0F));

		PartDefinition head_r68 = rightFace.addOrReplaceChild("head_r68", CubeListBuilder.create().texOffs(56, 70).mirror().addBox(-0.4875F, -0.5666F, -1.0415F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1239F, -1.0866F, 4.7413F, 1.3439F, 0.0F, 0.0F));

		PartDefinition head_r69 = rightFace.addOrReplaceChild("head_r69", CubeListBuilder.create().texOffs(59, 74).mirror().addBox(-0.4875F, 0.4701F, -0.6023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.1239F, -1.0866F, 4.7413F, 1.2828F, 0.0F, 0.0F));

		PartDefinition head_r70 = rightFace.addOrReplaceChild("head_r70", CubeListBuilder.create().texOffs(20, 76).mirror().addBox(-0.4875F, -0.0155F, -1.0443F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1239F, -2.1541F, 5.7419F, -0.1396F, 0.0F, 0.0F));

		PartDefinition head_r71 = rightFace.addOrReplaceChild("head_r71", CubeListBuilder.create().texOffs(70, 4).mirror().addBox(-0.4875F, -0.0149F, -1.0082F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.1239F, -2.2949F, 4.7296F, 0.6109F, 0.0F, 0.0F));

		PartDefinition head_r72 = rightFace.addOrReplaceChild("head_r72", CubeListBuilder.create().texOffs(74, 36).mirror().addBox(-0.3625F, -0.375F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false)
				.texOffs(74, 33).mirror().addBox(-0.6375F, -0.375F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1239F, -1.1824F, 4.8894F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head_r73 = rightFace.addOrReplaceChild("head_r73", CubeListBuilder.create().texOffs(29, 69).mirror().addBox(-0.425F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0941F, -0.3854F, 3.9614F, -0.2351F, 0.0327F, 0.0119F));

		PartDefinition head_r74 = rightFace.addOrReplaceChild("head_r74", CubeListBuilder.create().texOffs(29, 73).mirror().addBox(-0.137F, 0.577F, 4.7489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, 0.0573F, -0.1228F, 0.1646F));

		PartDefinition head_r75 = rightFace.addOrReplaceChild("head_r75", CubeListBuilder.create().texOffs(24, 69).mirror().addBox(-0.3473F, -0.2904F, 4.0115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(19, 69).mirror().addBox(-0.3473F, -0.3904F, 3.2115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(29, 57).mirror().addBox(-0.3473F, -0.4904F, 2.4115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, 0.0909F, -0.0816F, 0.2403F));

		PartDefinition head_r76 = rightFace.addOrReplaceChild("head_r76", CubeListBuilder.create().texOffs(19, 73).mirror().addBox(-0.0731F, -1.029F, 2.264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, -0.1411F, -0.0976F, 0.0589F));

		PartDefinition head_r77 = rightFace.addOrReplaceChild("head_r77", CubeListBuilder.create().texOffs(72, 48).mirror().addBox(-0.1754F, -1.0955F, 0.3624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, -0.2314F, -0.0738F, 0.051F));

		PartDefinition head_r78 = rightFace.addOrReplaceChild("head_r78", CubeListBuilder.create().texOffs(44, 71).mirror().addBox(-0.4232F, -0.5878F, 1.7046F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, 0.0922F, -0.0467F, 0.242F));

		PartDefinition head_r79 = rightFace.addOrReplaceChild("head_r79", CubeListBuilder.create().texOffs(71, 41).mirror().addBox(-0.4232F, -1.1976F, 1.207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, -0.2132F, -0.0467F, 0.242F));

		PartDefinition head_r80 = rightFace.addOrReplaceChild("head_r80", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(-0.3202F, -1.2938F, -0.3518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, -0.3424F, 0.2377F, 0.348F));

		PartDefinition head_r81 = rightFace.addOrReplaceChild("head_r81", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-0.4662F, -1.1323F, 0.4242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, -0.0386F, 0.1508F, 0.3397F));

		PartDefinition head_r82 = rightFace.addOrReplaceChild("head_r82", CubeListBuilder.create().texOffs(72, 45).mirror().addBox(-0.1754F, -0.9897F, -0.2286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, -0.1005F, -0.0738F, 0.051F));

		PartDefinition head_r83 = rightFace.addOrReplaceChild("head_r83", CubeListBuilder.create().texOffs(30, 78).mirror().addBox(-0.0731F, -1.1475F, 1.2633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, -0.1935F, -0.0976F, 0.0589F));

		PartDefinition head_r84 = rightFace.addOrReplaceChild("head_r84", CubeListBuilder.create().texOffs(13, 51).mirror().addBox(-0.0731F, -0.4849F, 2.2753F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, 0.1382F, -0.0976F, 0.0589F));

		PartDefinition head_r85 = rightFace.addOrReplaceChild("head_r85", CubeListBuilder.create().texOffs(73, 67).mirror().addBox(-0.5F, -0.8758F, -0.5243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.1179F, -1.3661F, 2.6865F, -1.0658F, -0.1137F, 0.0523F));

		PartDefinition head_r86 = rightFace.addOrReplaceChild("head_r86", CubeListBuilder.create().texOffs(54, 77).mirror().addBox(-0.381F, 2.7564F, 2.3099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(77, 51).mirror().addBox(-0.381F, 2.7564F, 2.0099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, 1.0456F, -0.1017F, 0.0606F));

		PartDefinition head_r87 = rightFace.addOrReplaceChild("head_r87", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-0.381F, 0.5963F, 3.2636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(77, 0).mirror().addBox(-0.381F, 0.5963F, 2.8636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, 0.3823F, -0.1017F, 0.0606F));

		PartDefinition head_r88 = rightFace.addOrReplaceChild("head_r88", CubeListBuilder.create().texOffs(66, 66).mirror().addBox(-0.381F, -2.0027F, 2.0142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(59, 66).mirror().addBox(-0.381F, -1.6027F, 1.6142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, -0.2722F, -0.1017F, 0.0606F));

		PartDefinition head_r89 = rightFace.addOrReplaceChild("head_r89", CubeListBuilder.create().texOffs(34, 71).mirror().addBox(-0.381F, -3.8496F, -0.4059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, -1.2495F, -0.1017F, 0.0606F));

		PartDefinition head_r90 = rightFace.addOrReplaceChild("head_r90", CubeListBuilder.create().texOffs(76, 70).mirror().addBox(-0.381F, -4.5304F, -2.0341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(76, 42).mirror().addBox(-0.381F, -4.2304F, -2.0341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(77, 48).mirror().addBox(-0.381F, -4.2304F, -1.8341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(77, 45).mirror().addBox(-0.381F, -3.8304F, -1.8341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 76).mirror().addBox(-0.381F, -3.8304F, -2.0341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, -1.7208F, -0.1017F, 0.0606F));

		PartDefinition head_r91 = rightFace.addOrReplaceChild("head_r91", CubeListBuilder.create().texOffs(74, 30).mirror().addBox(-0.5F, -0.1243F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.1179F, -1.3661F, 2.6865F, -0.9349F, -0.1137F, 0.0523F));

		PartDefinition head_r92 = rightFace.addOrReplaceChild("head_r92", CubeListBuilder.create().texOffs(24, 73).mirror().addBox(-0.2032F, -5.3886F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, -1.5466F, -0.0997F, 0.0758F));

		PartDefinition head_r93 = rightFace.addOrReplaceChild("head_r93", CubeListBuilder.create().texOffs(72, 51).mirror().addBox(-0.2032F, 4.5808F, 0.165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, 1.4641F, -0.0997F, 0.0758F));

		PartDefinition head_r94 = rightFace.addOrReplaceChild("head_r94", CubeListBuilder.create().texOffs(72, 54).mirror().addBox(-0.2032F, 4.9505F, 0.8225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, 1.3332F, -0.0997F, 0.0758F));

		PartDefinition head_r95 = rightFace.addOrReplaceChild("head_r95", CubeListBuilder.create().texOffs(73, 64).mirror().addBox(-0.2032F, 5.1149F, -2.3692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, 1.9005F, -0.0997F, 0.0758F));

		PartDefinition head_r96 = rightFace.addOrReplaceChild("head_r96", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-1.25F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.6864F, 1.1829F, 6.5271F, 0.6545F, 0.0F, 0.0F));

		PartDefinition head_r97 = rightFace.addOrReplaceChild("head_r97", CubeListBuilder.create().texOffs(73, 61).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.0776F, -1.1606F, 3.1331F, 0.0679F, -0.0997F, 0.0758F));

		PartDefinition head_r98 = rightFace.addOrReplaceChild("head_r98", CubeListBuilder.create().texOffs(45, 56).mirror().addBox(-0.0731F, -0.9649F, 3.2478F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, -0.1062F, -0.0976F, 0.0589F));

		PartDefinition head_r99 = rightFace.addOrReplaceChild("head_r99", CubeListBuilder.create().texOffs(75, 4).mirror().addBox(-0.1718F, -1.1591F, 6.1755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, 0.1127F, -0.0523F, -0.0358F));

		PartDefinition head_r100 = rightFace.addOrReplaceChild("head_r100", CubeListBuilder.create().texOffs(24, 51).mirror().addBox(0.0447F, -1.0109F, 2.2846F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3164F, -0.6248F, -2.6323F, 0.1351F, -0.0862F, -0.0443F));

		PartDefinition leftWing = chest.addOrReplaceChild("leftWing", CubeListBuilder.create().texOffs(68, 57).addBox(-0.5F, -0.15F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1721F, 0.6341F, -2.7775F, 0.2656F, 0.0524F, -2.0462F));

		PartDefinition cube_r14 = leftWing.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(68, 17).addBox(-0.5F, -0.05F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.0F, 0.15F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftWing.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(68, 61).addBox(-0.5F, -3.6F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 7.1106F, -1.4391F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftWing.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(71, 70).addBox(-0.5F, 0.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.0F, 2.1457F, 0.0933F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftWing.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(78, 19).addBox(-0.5F, -0.05F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(74, 77).addBox(-0.5F, -0.75F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 2.0814F, -1.7625F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftWing.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(68, 13).addBox(-0.5F, -1.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.0F, 1.45F, 0.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftWing.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(49, 71).addBox(-0.5F, -0.85F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 1.45F, 0.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftWing2 = leftWing.addOrReplaceChild("leftWing2", CubeListBuilder.create().texOffs(35, 51).addBox(-0.4001F, -0.1808F, -0.3248F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(40, 51).addBox(-0.4001F, -0.1808F, -1.0248F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-0.3634F, 6.1475F, -1.1859F, -0.629F, -0.2612F, -0.2557F));

		PartDefinition cube_r20 = leftWing2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(39, 71).addBox(-0.4786F, -2.7693F, -1.1357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0999F, 9.4448F, -0.7685F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftWing2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 72).addBox(-0.4786F, -1.5912F, -0.5175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0999F, 9.4448F, -0.7685F, 0.6109F, 0.0F, 0.0F));

		PartDefinition leftWing3 = leftWing2.addOrReplaceChild("leftWing3", CubeListBuilder.create().texOffs(14, 69).addBox(-0.4656F, -0.0774F, -0.3357F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0343F, 9.439F, -0.064F, 0.2869F, 0.1841F, -0.0433F));

		PartDefinition hand = leftWing3.addOrReplaceChild("hand", CubeListBuilder.create().texOffs(19, 28).addBox(-0.6299F, -2.8109F, 0.1631F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1065F, 1.802F, -0.6525F, 1.0453F, 0.2092F, -3.1161F));

		PartDefinition leftWing4 = leftWing3.addOrReplaceChild("leftWing4", CubeListBuilder.create().texOffs(19, 34).addBox(-0.3974F, -0.3279F, -0.4177F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0579F, 2.8148F, 0.3059F, -1.3958F, -0.1243F, 0.1142F));

		PartDefinition leftWing5 = leftWing4.addOrReplaceChild("leftWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.286F, 0.2049F, 7.1473F, 0.0041F, -0.2075F, -0.0505F));

		PartDefinition cube_r22 = leftWing5.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.9F, -3.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2111F, -0.2093F, 2.9013F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftWing6 = leftWing5.addOrReplaceChild("leftWing6", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5073F, -0.6863F, -0.2623F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2023F, -2.2925F, 11.3529F, 0.417F, -0.2222F, -0.1408F));

		PartDefinition leftWing7 = leftWing6.addOrReplaceChild("leftWing7", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5073F, -0.6863F, -0.2623F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0542F, 0.0519F, 11.5518F, 0.1835F, -0.1899F, -0.0978F));

		PartDefinition rightWing = chest.addOrReplaceChild("rightWing", CubeListBuilder.create().texOffs(68, 57).mirror().addBox(-0.5F, -0.15F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1721F, 0.6341F, -2.7775F, 0.2631F, -0.0638F, 2.0883F));

		PartDefinition cube_r23 = rightWing.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(68, 17).mirror().addBox(-0.5F, -0.05F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.15F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r24 = rightWing.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(68, 61).mirror().addBox(-0.5F, -3.6F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.1106F, -1.4391F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r25 = rightWing.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(71, 70).mirror().addBox(-0.5F, 0.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1457F, 0.0933F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightWing.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(78, 19).mirror().addBox(-0.5F, -0.05F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(74, 77).mirror().addBox(-0.5F, -0.75F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0814F, -1.7625F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightWing.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(68, 13).mirror().addBox(-0.5F, -1.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.45F, 0.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightWing.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(49, 71).mirror().addBox(-0.5F, -0.85F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.45F, 0.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create().texOffs(35, 51).mirror().addBox(-0.5999F, -0.1808F, -0.3248F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(40, 51).mirror().addBox(-0.5999F, -0.1808F, -1.0248F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(0.1657F, 6.132F, -1.1601F, -0.6527F, 0.1828F, 0.1481F));

		PartDefinition cube_r29 = rightWing2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(39, 71).mirror().addBox(-0.5214F, -2.7693F, -1.1357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.0999F, 9.4447F, -0.7685F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightWing2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.5214F, -1.5912F, -0.5175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0999F, 9.4447F, -0.7685F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create().texOffs(14, 69).mirror().addBox(-0.5344F, -0.0774F, -0.3357F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0343F, 9.439F, -0.064F, 0.2944F, -0.1716F, 0.0008F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(19, 28).mirror().addBox(-0.3701F, -2.8109F, 0.1631F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.1065F, 1.802F, -0.6524F, 1.0453F, -0.2092F, 3.1161F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create().texOffs(19, 34).mirror().addBox(-0.6026F, -0.3279F, -0.4177F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0579F, 2.8148F, 0.3059F, -1.3812F, 0.1006F, 0.0153F));

		PartDefinition rightWing5 = rightWing4.addOrReplaceChild("rightWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.286F, 0.2049F, 7.1473F, 0.0041F, 0.2075F, 0.0505F));

		PartDefinition cube_r31 = rightWing5.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.9F, -3.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2111F, -0.2093F, 2.9013F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-0.4927F, -0.6863F, -0.2623F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2023F, -2.2925F, 11.3529F, 0.4105F, 0.1423F, 0.1051F));

		PartDefinition rightWing7 = rightWing6.addOrReplaceChild("rightWing7", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.4927F, -0.6863F, -0.2623F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, 0.0519F, 11.5518F, 0.1805F, 0.0612F, 0.0739F));

		return LayerDefinition.create(meshdefinition, 83, 83);
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