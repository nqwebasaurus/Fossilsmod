package fossils.fossils.client.blockentity.model.caviramus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CaviramusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
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
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
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
	private final ModelPart bone;
	private final ModelPart bone3;

	public CaviramusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
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
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
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
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(56, 56).addBox(0.1F, -0.0327F, 4.3827F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(88, 10).addBox(1.1F, 0.5673F, 4.3827F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 14).addBox(1.1F, 0.5673F, 6.3827F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 10).mirror().addBox(-0.9F, 0.5673F, 4.3827F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 14).mirror().addBox(-0.9F, 0.5673F, 6.3827F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 87).addBox(0.6F, -0.2327F, 4.3827F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 88).addBox(0.6F, -0.2327F, 6.3827F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -1.5949F, -1.6306F, -0.0429F, 0.5871F, -0.7853F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(9, 63).addBox(-0.5773F, -0.6033F, -2.9556F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F))
				.texOffs(10, 81).addBox(-0.0773F, -0.7783F, -1.9556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6773F, 0.5929F, 4.4665F, -0.1326F, 0.1298F, -0.0173F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(88, 8).mirror().addBox(-0.9611F, 0.0049F, -0.5018F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, -0.0636F, -1.5369F, 0.4605F, 0.0575F, -0.4623F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(88, 6).mirror().addBox(-0.9611F, 0.0049F, -0.5018F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, -0.0636F, -3.5369F, 0.4735F, 0.1481F, -0.5602F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(88, 4).mirror().addBox(-1.8247F, -0.4933F, -0.5196F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, -0.0636F, -3.5369F, 0.2962F, 0.3652F, -1.0781F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(77, 51).mirror().addBox(-2.8247F, -0.4933F, -0.5196F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, 0.1364F, -5.5369F, 0.4066F, 0.4554F, -0.9665F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(88, 2).mirror().addBox(-0.9611F, 0.0049F, -0.5018F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, 0.1364F, -5.5369F, 0.6075F, 0.1778F, -0.4709F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(88, 8).addBox(-0.0388F, 0.0049F, -0.5018F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, -0.0636F, -1.5369F, 0.4605F, -0.0575F, 0.4623F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(88, 4).addBox(0.8247F, -0.4933F, -0.5196F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, -0.0636F, -3.5369F, 0.2962F, -0.3652F, 1.0781F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(88, 6).addBox(-0.0388F, 0.0049F, -0.5018F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, -0.0636F, -3.5369F, 0.4735F, -0.1481F, 0.5602F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(88, 2).addBox(-0.0388F, 0.0049F, -0.5018F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, 0.1364F, -5.5369F, 0.6075F, -0.1778F, 0.4709F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(77, 51).addBox(0.8247F, -0.4933F, -0.5196F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, 0.1364F, -5.5369F, 0.4066F, -0.4554F, 0.9665F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(33, 72).addBox(0.0F, -0.3F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(41, 69).addBox(0.0F, -0.3F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(27, 63).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.0773F, -0.6033F, -2.9556F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(58, 31).addBox(-1.0773F, -1.2033F, -3.0556F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 4.0F, -0.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.17F, -5.8975F, 0.2582F, 0.0844F, 0.0223F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(36, 63).addBox(-0.0773F, -0.9793F, -0.004F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1156F, -5.8579F, 0.096F, 0.0F, 0.0F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(76, 72).addBox(-0.5773F, -0.0793F, -2.004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5655F, -3.9092F, 0.2269F, 0.0F, 0.0F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(14, 68).addBox(-0.0773F, -0.8543F, -0.004F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2958F, -1.9174F, -0.1396F, 0.0F, 0.0F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(36, 66).addBox(-0.0773F, -1.0043F, -1.004F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3307F, -2.9168F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(-0.9611F, 0.0049F, -0.5018F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, 0.0663F, -5.3393F, 0.6871F, 0.2168F, -0.8044F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(78, 12).mirror().addBox(-2.8247F, -0.4933F, -0.5196F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, 0.0663F, -5.3393F, 0.4639F, 0.5265F, -1.2885F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(87, 77).mirror().addBox(-3.1996F, -1.8396F, -0.5196F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, -0.2337F, -1.4393F, 0.1018F, 0.3744F, -1.5551F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(87, 47).mirror().addBox(-0.9611F, 0.0049F, -0.5018F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, -0.2337F, -1.4393F, 0.4128F, 0.0761F, -0.4957F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(76, 57).mirror().addBox(-2.8247F, -0.4933F, -0.5196F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, -0.2337F, -1.4393F, 0.2785F, 0.2728F, -1.0124F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(85, 12).mirror().addBox(-3.1996F, -1.8396F, -0.5196F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, -0.2337F, -3.4393F, 0.1033F, 0.4616F, -1.5545F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(68, 53).mirror().addBox(-2.8247F, -0.4933F, -0.5196F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, -0.2337F, -3.4393F, 0.3276F, 0.3465F, -0.9974F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(67, 60).mirror().addBox(-0.9611F, 0.0049F, -0.5018F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, -0.2337F, -3.4393F, 0.4901F, 0.1173F, -0.4882F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(76, 57).addBox(0.8247F, -0.4933F, -0.5196F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, -0.2337F, -1.4393F, 0.2785F, -0.2728F, 1.0124F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(87, 47).addBox(-0.0388F, 0.0049F, -0.5018F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, -0.2337F, -1.4393F, 0.4128F, -0.0761F, 0.4957F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 67).addBox(-1.6719F, -0.1854F, -1.3537F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0946F, 3.671F, -2.8451F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(61, 83).addBox(-1.6719F, -1.0354F, -0.0287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0946F, 5.2072F, -1.7496F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(41, 72).addBox(-1.6719F, -1.0354F, -0.0037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0946F, 5.5004F, -0.8197F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(87, 77).addBox(2.1996F, -1.8396F, -0.5196F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, -0.2337F, -1.4393F, 0.1018F, -0.3744F, 1.5551F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(78, 12).addBox(0.8247F, -0.4933F, -0.5196F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, 0.0663F, -5.3393F, 0.4639F, -0.5265F, 1.2885F));

		PartDefinition cube_r26 = chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(88, 0).addBox(-0.0388F, 0.0049F, -0.5018F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, 0.0663F, -5.3393F, 0.6871F, -0.2168F, 0.8044F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(67, 60).addBox(-0.0388F, 0.0049F, -0.5018F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, -0.2337F, -3.4393F, 0.4901F, -0.1173F, 0.4882F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(68, 53).addBox(0.8247F, -0.4933F, -0.5196F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, -0.2337F, -3.4393F, 0.3276F, -0.3465F, 0.9974F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(85, 12).addBox(2.1996F, -1.8396F, -0.5196F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, -0.2337F, -3.4393F, 0.1033F, -0.4616F, 1.5545F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(45, 56).addBox(-0.5773F, -0.2793F, 1.896F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.432F, -5.815F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(14, 72).addBox(-0.5773F, -0.6945F, -2.049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.4817F, -5.5678F, -0.2583F, 0.0F, 0.0F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(13, 55).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.0773F, -0.6945F, -2.049F, -0.0698F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(54, 62).addBox(-0.5773F, -0.6599F, -2.9212F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 63).addBox(-0.0773F, -1.2599F, -1.9212F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.036F, -1.9741F, -0.6344F, 0.3367F, 0.1645F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(63, 67).addBox(-0.5773F, -0.6599F, -2.9212F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(88, 19).addBox(-0.0773F, -1.1599F, -2.9212F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 58).addBox(-0.0773F, -1.1599F, -0.9212F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0167F, -2.8045F, -0.1487F, 0.3037F, 0.2639F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3396F, -2.4595F, -0.0189F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(84, 68).addBox(-0.5F, -0.875F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.0773F, 3.3326F, -10.0572F, -0.9425F, 0.0F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(84, 65).addBox(-0.5F, -0.175F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.0773F, 2.5281F, -10.752F, -0.1396F, 0.0F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(18, 67).addBox(0.0F, -0.2F, -0.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.5773F, -0.944F, -10.9524F, -0.8814F, 0.0F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(0, 80).addBox(0.0F, -0.2F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(60, 0).addBox(0.0F, -0.2F, -0.175F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.5773F, -0.2867F, -9.7163F, -0.3578F, 0.0F, 0.0F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(45, 67).addBox(0.0F, -0.2F, -0.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5773F, 0.3787F, -7.9366F, 0.2531F, 0.0F, 0.0F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(72, 68).addBox(0.0F, -0.2F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.5773F, -0.944F, -10.9524F, -0.4887F, 0.0F, 0.0F));

		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(59, 86).addBox(0.0F, -1.225F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 85).addBox(0.0F, -0.825F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5773F, 0.2116F, -11.2265F, 0.2967F, 0.0F, 0.0F));

		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(79, 67).addBox(0.0F, -1.725F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.5773F, 1.6024F, -10.6646F, 0.384F, 0.0F, 0.0F));

		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(69, 15).addBox(0.0F, -1.225F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5773F, 1.9665F, -9.4656F, 0.7767F, 0.0F, 0.0F));

		PartDefinition head_r10 = head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(58, 14).addBox(-0.5F, -0.175F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0773F, 2.5281F, -10.752F, 0.4625F, 0.0F, 0.0F));

		PartDefinition head_r11 = head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(57, 49).addBox(-0.5F, 0.025F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0773F, -0.8459F, -5.248F, 0.6283F, 0.0F, 0.0F));

		PartDefinition head_r12 = head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(45, 62).addBox(-1.5F, 0.025F, -1.025F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0773F, -1.3584F, -4.3603F, 0.5236F, 0.0F, 0.0F));

		PartDefinition head_r13 = head.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(0, 62).addBox(-2.0F, 0.025F, -1.025F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4227F, -1.6172F, -3.3944F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head_r14 = head.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(60, 6).addBox(-2.0F, 0.025F, -1.025F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, -1.7477F, -2.403F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head_r15 = head.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(27, 68).addBox(-2.0F, 0.025F, -1.025F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4227F, -1.5741F, -1.4182F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head_r16 = head.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(59, 45).addBox(-2.0F, 0.025F, -1.525F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 45).addBox(-2.0F, 0.025F, -1.025F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4227F, -0.9401F, -0.0587F, -0.4363F, 0.0F, 0.0F));

		PartDefinition head_r17 = head.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(69, 6).addBox(-2.0F, -0.675F, -1.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4227F, -0.2508F, 0.0628F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head_r18 = head.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(69, 12).addBox(-2.0F, -1.0F, 0.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.4227F, 1.7738F, -2.237F, 1.5272F, 0.0F, 0.0F));

		PartDefinition head_r19 = head.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(69, 9).addBox(-2.0F, -1.0F, 0.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4227F, 1.752F, -2.7365F, 1.8326F, 0.0F, 0.0F));

		PartDefinition head_r20 = head.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(58, 26).addBox(-2.0F, -2.0F, -1.175F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.4227F, 1.299F, -0.7488F, 1.0036F, 0.0F, 0.0F));

		PartDefinition head_r21 = head.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(60, 11).addBox(-2.0F, -1.0F, -0.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4227F, 0.751F, -0.2008F, 0.7854F, 0.0F, 0.0F));

		PartDefinition head_r22 = head.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(59, 41).addBox(-2.0F, -0.425F, -1.425F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4227F, 0.2F, -0.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(61, 80).addBox(0.5977F, 0.1F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(76, 0).addBox(0.5977F, -0.3446F, -2.4216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(14, 76).addBox(0.5977F, -0.9446F, -2.9216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(61, 80).mirror().addBox(-1.7523F, 0.1F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(76, 0).mirror().addBox(-1.7523F, -0.3446F, -2.4216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(14, 76).mirror().addBox(-1.7523F, -0.9446F, -2.9216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.368F, -1.2628F, 1.021F, 0.0F, 0.0F));

		PartDefinition jaw_r1 = jaw.addOrReplaceChild("jaw_r1", CubeListBuilder.create().texOffs(76, 15).mirror().addBox(-0.5F, -0.225F, -1.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(76, 15).addBox(1.85F, -0.225F, -1.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.2523F, -0.0058F, -0.1345F, -0.6545F, 0.0F, 0.0F));

		PartDefinition jaw_r2 = jaw.addOrReplaceChild("jaw_r2", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.5F, -0.225F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(0, 76).addBox(1.85F, -0.225F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.2523F, -0.8581F, -1.2452F, 0.1745F, 0.0F, 0.0F));

		PartDefinition jaw_r3 = jaw.addOrReplaceChild("jaw_r3", CubeListBuilder.create().texOffs(76, 53).mirror().addBox(-0.2499F, -0.7431F, -2.9252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(47, 76).mirror().addBox(-0.2499F, -0.2431F, -2.9252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.1523F, 0.0554F, -4.0216F, 0.3403F, -0.1745F, 0.0F));

		PartDefinition jaw_r4 = jaw.addOrReplaceChild("jaw_r4", CubeListBuilder.create().texOffs(14, 80).mirror().addBox(-0.9107F, -0.3078F, -0.7274F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(26, 80).mirror().addBox(-0.9107F, -0.1078F, -1.0274F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1273F, 0.2554F, -7.0216F, 0.8203F, -0.1265F, -0.2094F));

		PartDefinition jaw_r5 = jaw.addOrReplaceChild("jaw_r5", CubeListBuilder.create().texOffs(41, 80).mirror().addBox(-0.8279F, -1.1995F, -1.0011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1273F, 0.2554F, -7.0216F, 0.3765F, 0.0322F, -0.4427F));

		PartDefinition jaw_r6 = jaw.addOrReplaceChild("jaw_r6", CubeListBuilder.create().texOffs(36, 80).mirror().addBox(-0.8279F, -1.4897F, -1.3841F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1273F, 0.2554F, -7.0216F, 0.6383F, 0.0322F, -0.4427F));

		PartDefinition jaw_r7 = jaw.addOrReplaceChild("jaw_r7", CubeListBuilder.create().texOffs(51, 80).mirror().addBox(-0.6825F, -2.0254F, -1.6959F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1273F, 0.2554F, -7.0216F, 1.0376F, 0.1371F, -0.3641F));

		PartDefinition jaw_r8 = jaw.addOrReplaceChild("jaw_r8", CubeListBuilder.create().texOffs(31, 80).mirror().addBox(-0.9107F, -1.2571F, -1.6709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1273F, 0.2554F, -7.0216F, 1.0385F, -0.1265F, -0.2094F));

		PartDefinition jaw_r9 = jaw.addOrReplaceChild("jaw_r9", CubeListBuilder.create().texOffs(35, 87).mirror().addBox(-0.9107F, 0.1131F, -1.7017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1273F, 0.2554F, -7.0216F, 1.1257F, -0.1265F, -0.2094F));

		PartDefinition jaw_r10 = jaw.addOrReplaceChild("jaw_r10", CubeListBuilder.create().texOffs(87, 32).mirror().addBox(-0.9107F, -0.1048F, -1.9364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1273F, 0.2554F, -7.0216F, 1.5621F, -0.1265F, -0.2094F));

		PartDefinition jaw_r11 = jaw.addOrReplaceChild("jaw_r11", CubeListBuilder.create().texOffs(68, 76).mirror().addBox(-0.45F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5303F, 1.2249F, -6.1086F, 0.8264F, -0.2042F, -0.0326F));

		PartDefinition jaw_r12 = jaw.addOrReplaceChild("jaw_r12", CubeListBuilder.create().texOffs(33, 76).mirror().addBox(-0.2499F, -0.0592F, -1.817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 27).mirror().addBox(-0.2499F, -0.5592F, -1.817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.192F)).mirror(false), PartPose.offsetAndRotation(-1.1523F, 0.0554F, -4.0216F, 0.1745F, -0.1745F, 0.0F));

		PartDefinition jaw_r13 = jaw.addOrReplaceChild("jaw_r13", CubeListBuilder.create().texOffs(87, 35).mirror().addBox(-0.9107F, 0.7213F, -0.6883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1273F, 0.2554F, -7.0216F, -1.0472F, -0.1265F, -0.2094F));

		PartDefinition jaw_r14 = jaw.addOrReplaceChild("jaw_r14", CubeListBuilder.create().texOffs(54, 76).mirror().addBox(-0.9107F, 0.1604F, -0.6062F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1273F, 0.2554F, -7.0216F, -1.1345F, -0.1265F, -0.2094F));

		PartDefinition jaw_r15 = jaw.addOrReplaceChild("jaw_r15", CubeListBuilder.create().texOffs(30, 87).mirror().addBox(-0.9107F, -0.3489F, -0.7222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1273F, 0.2554F, -7.0216F, -0.1309F, -0.1265F, -0.2094F));

		PartDefinition jaw_r16 = jaw.addOrReplaceChild("jaw_r16", CubeListBuilder.create().texOffs(50, 87).mirror().addBox(-0.2F, -0.409F, -1.3283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5523F, -0.5446F, -2.7216F, 0.0873F, -0.2618F, 0.0F));

		PartDefinition jaw_r17 = jaw.addOrReplaceChild("jaw_r17", CubeListBuilder.create().texOffs(45, 87).mirror().addBox(-0.2499F, -0.8883F, -0.622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 87).mirror().addBox(-0.2499F, -0.7692F, -2.6898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(87, 38).mirror().addBox(-0.2499F, -0.7692F, -3.3898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 76).mirror().addBox(-0.2499F, -0.4192F, -3.3898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1523F, 0.0554F, -4.0216F, 0.0873F, -0.1745F, 0.0F));

		PartDefinition jaw_r18 = jaw.addOrReplaceChild("jaw_r18", CubeListBuilder.create().texOffs(87, 44).mirror().addBox(-0.2499F, -0.9253F, -1.2424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1523F, 0.0554F, -4.0216F, 0.2182F, -0.1745F, 0.0F));

		PartDefinition jaw_r19 = jaw.addOrReplaceChild("jaw_r19", CubeListBuilder.create().texOffs(87, 41).mirror().addBox(-0.2499F, -0.859F, -1.9767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1523F, 0.0554F, -4.0216F, 0.1309F, -0.1745F, 0.0F));

		PartDefinition jaw_r20 = jaw.addOrReplaceChild("jaw_r20", CubeListBuilder.create().texOffs(76, 19).mirror().addBox(-0.2F, -0.4F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5523F, -0.5446F, -2.7216F, 0.3054F, -0.2618F, 0.0F));

		PartDefinition jaw_r21 = jaw.addOrReplaceChild("jaw_r21", CubeListBuilder.create().texOffs(87, 29).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(25, 87).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(87, 29).addBox(1.85F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 87).addBox(1.85F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.2523F, -0.1446F, -2.1216F, 0.4363F, 0.0F, 0.0F));

		PartDefinition jaw_r22 = jaw.addOrReplaceChild("jaw_r22", CubeListBuilder.create().texOffs(26, 76).mirror().addBox(-0.2F, 0.0215F, -1.6064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(76, 23).mirror().addBox(-0.2F, 0.4215F, -1.6064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.5523F, -0.5446F, -2.7216F, 0.096F, -0.2618F, 0.0F));

		PartDefinition jaw_r23 = jaw.addOrReplaceChild("jaw_r23", CubeListBuilder.create().texOffs(69, 72).mirror().addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(69, 72).addBox(1.85F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.2523F, 0.9F, 0.6F, -0.3491F, 0.0F, 0.0F));

		PartDefinition jaw_r24 = jaw.addOrReplaceChild("jaw_r24", CubeListBuilder.create().texOffs(76, 53).addBox(-0.7501F, -0.7431F, -2.9252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F))
				.texOffs(47, 76).addBox(-0.7501F, -0.2431F, -2.9252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9977F, 0.0554F, -4.0216F, 0.3403F, 0.1745F, 0.0F));

		PartDefinition jaw_r25 = jaw.addOrReplaceChild("jaw_r25", CubeListBuilder.create().texOffs(14, 80).addBox(-0.0893F, -0.3078F, -0.7274F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(26, 80).addBox(-0.0893F, -0.1078F, -1.0274F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0273F, 0.2554F, -7.0216F, 0.8203F, 0.1265F, 0.2094F));

		PartDefinition jaw_r26 = jaw.addOrReplaceChild("jaw_r26", CubeListBuilder.create().texOffs(41, 80).addBox(-0.1721F, -1.1995F, -1.0011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0273F, 0.2554F, -7.0216F, 0.3765F, -0.0322F, 0.4427F));

		PartDefinition jaw_r27 = jaw.addOrReplaceChild("jaw_r27", CubeListBuilder.create().texOffs(36, 80).addBox(-0.1721F, -1.4897F, -1.3841F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0273F, 0.2554F, -7.0216F, 0.6383F, -0.0322F, 0.4427F));

		PartDefinition jaw_r28 = jaw.addOrReplaceChild("jaw_r28", CubeListBuilder.create().texOffs(51, 80).addBox(-0.3175F, -2.0254F, -1.6959F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0273F, 0.2554F, -7.0216F, 1.0376F, -0.1371F, 0.3641F));

		PartDefinition jaw_r29 = jaw.addOrReplaceChild("jaw_r29", CubeListBuilder.create().texOffs(31, 80).addBox(-0.0893F, -1.2571F, -1.6709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0273F, 0.2554F, -7.0216F, 1.0385F, 0.1265F, 0.2094F));

		PartDefinition jaw_r30 = jaw.addOrReplaceChild("jaw_r30", CubeListBuilder.create().texOffs(35, 87).addBox(-0.0893F, 0.1131F, -1.7017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0273F, 0.2554F, -7.0216F, 1.1257F, 0.1265F, 0.2094F));

		PartDefinition jaw_r31 = jaw.addOrReplaceChild("jaw_r31", CubeListBuilder.create().texOffs(87, 32).addBox(-0.0893F, -0.1048F, -1.9364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0273F, 0.2554F, -7.0216F, 1.5621F, 0.1265F, 0.2094F));

		PartDefinition jaw_r32 = jaw.addOrReplaceChild("jaw_r32", CubeListBuilder.create().texOffs(68, 76).addBox(-0.55F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3758F, 1.2249F, -6.1086F, 0.8264F, 0.2042F, 0.0326F));

		PartDefinition jaw_r33 = jaw.addOrReplaceChild("jaw_r33", CubeListBuilder.create().texOffs(33, 76).addBox(-0.7501F, -0.0592F, -1.817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 27).addBox(-0.7501F, -0.5592F, -1.817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.192F)), PartPose.offsetAndRotation(0.9977F, 0.0554F, -4.0216F, 0.1745F, 0.1745F, 0.0F));

		PartDefinition jaw_r34 = jaw.addOrReplaceChild("jaw_r34", CubeListBuilder.create().texOffs(87, 35).addBox(-0.0893F, 0.7213F, -0.6883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0273F, 0.2554F, -7.0216F, -1.0472F, 0.1265F, 0.2094F));

		PartDefinition jaw_r35 = jaw.addOrReplaceChild("jaw_r35", CubeListBuilder.create().texOffs(54, 76).addBox(-0.0893F, 0.1604F, -0.6062F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0273F, 0.2554F, -7.0216F, -1.1345F, 0.1265F, 0.2094F));

		PartDefinition jaw_r36 = jaw.addOrReplaceChild("jaw_r36", CubeListBuilder.create().texOffs(30, 87).addBox(-0.0893F, -0.3489F, -0.7222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0273F, 0.2554F, -7.0216F, -0.1309F, 0.1265F, 0.2094F));

		PartDefinition jaw_r37 = jaw.addOrReplaceChild("jaw_r37", CubeListBuilder.create().texOffs(50, 87).addBox(-0.8F, -0.409F, -1.3283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3977F, -0.5446F, -2.7216F, 0.0873F, 0.2618F, 0.0F));

		PartDefinition jaw_r38 = jaw.addOrReplaceChild("jaw_r38", CubeListBuilder.create().texOffs(45, 87).addBox(-0.7501F, -0.8883F, -0.622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 87).addBox(-0.7501F, -0.7692F, -2.6898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(87, 38).addBox(-0.7501F, -0.7692F, -3.3898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 76).addBox(-0.7501F, -0.4192F, -3.3898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9977F, 0.0554F, -4.0216F, 0.0873F, 0.1745F, 0.0F));

		PartDefinition jaw_r39 = jaw.addOrReplaceChild("jaw_r39", CubeListBuilder.create().texOffs(87, 44).addBox(-0.7501F, -0.9253F, -1.2424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9977F, 0.0554F, -4.0216F, 0.2182F, 0.1745F, 0.0F));

		PartDefinition jaw_r40 = jaw.addOrReplaceChild("jaw_r40", CubeListBuilder.create().texOffs(87, 41).addBox(-0.7501F, -0.859F, -1.9767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9977F, 0.0554F, -4.0216F, 0.1309F, 0.1745F, 0.0F));

		PartDefinition jaw_r41 = jaw.addOrReplaceChild("jaw_r41", CubeListBuilder.create().texOffs(76, 19).addBox(-0.8F, -0.4F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3977F, -0.5446F, -2.7216F, 0.3054F, 0.2618F, 0.0F));

		PartDefinition jaw_r42 = jaw.addOrReplaceChild("jaw_r42", CubeListBuilder.create().texOffs(26, 76).addBox(-0.8F, 0.0215F, -1.6064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F))
				.texOffs(76, 23).addBox(-0.8F, 0.4215F, -1.6064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.3977F, -0.5446F, -2.7216F, 0.096F, 0.2618F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6091F, 0.9078F, -7.6618F));

		PartDefinition head_r23 = leftFace.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(74, 86).addBox(0.5F, -0.0111F, -0.983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6364F, -0.7049F, 6.0663F, 2.1555F, 0.0F, 0.0F));

		PartDefinition head_r24 = leftFace.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(20, 87).addBox(-0.9931F, -0.1423F, -2.6659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(54, 84).addBox(-0.9931F, -0.1423F, -1.8659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0743F, 0.7629F, -0.6843F, 0.3713F, 0.132F, -0.0016F));

		PartDefinition head_r25 = leftFace.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(69, 86).addBox(0.5F, 1.6889F, -0.483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 86).addBox(0.5F, 1.6889F, -0.908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(76, 80).addBox(0.5F, 0.3889F, -0.508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.6364F, -1.016F, 4.3218F, 1.1083F, 0.0F, 0.0F));

		PartDefinition head_r26 = leftFace.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(81, 80).addBox(0.5F, -1.1352F, -0.0254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6364F, -1.016F, 4.3218F, 2.1337F, 0.0F, 0.0F));

		PartDefinition head_r27 = leftFace.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(5, 81).addBox(0.5F, -0.1969F, 0.2446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(71, 80).addBox(0.5F, -0.4719F, 0.2446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6364F, -1.016F, 4.3218F, 0.4451F, 0.0F, 0.0F));

		PartDefinition head_r28 = leftFace.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(77, 47).addBox(0.5F, -0.6418F, -0.9424F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6364F, -1.016F, 4.3218F, 1.1694F, 0.0F, 0.0F));

		PartDefinition head_r29 = leftFace.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(66, 80).addBox(0.5F, -1.2185F, -0.4642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6364F, -1.016F, 4.3218F, -0.3491F, 0.0F, 0.0F));

		PartDefinition head_r30 = leftFace.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(77, 43).addBox(0.5F, -1.2644F, -0.6564F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.6364F, -1.016F, 4.3218F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head_r31 = leftFace.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(19, 82).addBox(0.5F, -0.903F, 0.4078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6364F, -1.016F, 4.3218F, 2.3475F, 0.0F, 0.0F));

		PartDefinition head_r32 = leftFace.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(82, 31).addBox(-0.625F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F))
				.texOffs(82, 34).addBox(-0.35F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3636F, -1.2177F, 4.114F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head_r33 = leftFace.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(84, 49).addBox(-0.9596F, -3.9354F, 4.4415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2614F, 2.1176F, -2.0706F, -0.3229F, 0.1571F, 0.0F));

		PartDefinition head_r34 = leftFace.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(10, 87).addBox(-0.5F, -0.4F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 87).addBox(-0.5F, -0.4F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 87).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1819F, 1.9458F, -0.214F, 0.3278F, 0.1655F, 0.0082F));

		PartDefinition head_r35 = leftFace.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(49, 84).addBox(-0.9596F, -0.804F, 2.919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2614F, 2.1176F, -2.0706F, 0.2443F, 0.1571F, 0.0F));

		PartDefinition head_r36 = leftFace.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(84, 59).addBox(-0.9931F, 0.1915F, -0.582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0743F, 0.7629F, -0.6843F, 0.1531F, 0.132F, -0.0016F));

		PartDefinition head_r37 = leftFace.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(84, 86).addBox(-0.8206F, 0.6581F, -0.4807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0743F, 0.7629F, -0.6843F, 0.3277F, 0.132F, -0.0016F));

		PartDefinition head_r38 = leftFace.addOrReplaceChild("head_r38", CubeListBuilder.create().texOffs(86, 82).addBox(-0.8206F, 0.6941F, -0.8033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0743F, 0.7629F, -0.6843F, 0.0222F, 0.132F, -0.0016F));

		PartDefinition head_r39 = leftFace.addOrReplaceChild("head_r39", CubeListBuilder.create().texOffs(79, 86).addBox(-0.775F, -0.2F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3114F, 2.2948F, -2.7811F, -0.26F, -0.0533F, -0.3893F));

		PartDefinition head_r40 = leftFace.addOrReplaceChild("head_r40", CubeListBuilder.create().texOffs(86, 79).addBox(-0.75F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2864F, 2.4235F, -2.2985F, 0.4376F, 0.0258F, -0.3523F));

		PartDefinition head_r41 = leftFace.addOrReplaceChild("head_r41", CubeListBuilder.create().texOffs(84, 62).addBox(-0.9931F, 0.2694F, -1.1289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0743F, 0.7629F, -0.6843F, -0.065F, 0.132F, -0.0016F));

		PartDefinition head_r42 = leftFace.addOrReplaceChild("head_r42", CubeListBuilder.create().texOffs(54, 67).addBox(-0.9931F, -0.4318F, -2.5761F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0743F, 0.7629F, -0.6843F, 0.4455F, 0.132F, -0.0016F));

		PartDefinition head_r43 = leftFace.addOrReplaceChild("head_r43", CubeListBuilder.create().texOffs(44, 84).addBox(-0.9596F, -0.957F, 1.9239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2614F, 2.1176F, -2.0706F, 0.192F, 0.1571F, 0.0F));

		PartDefinition head_r44 = leftFace.addOrReplaceChild("head_r44", CubeListBuilder.create().texOffs(0, 55).addBox(-0.9596F, 0.0369F, -4.6108F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5931F, -1.9841F, 3.3243F, 0.5236F, 0.1571F, 0.0F));

		PartDefinition head_r45 = leftFace.addOrReplaceChild("head_r45", CubeListBuilder.create().texOffs(83, 14).addBox(-0.5F, -1.1427F, -0.7322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(83, 9).addBox(-0.5F, -0.8427F, -0.7322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0636F, 0.1181F, 2.0532F, -0.9861F, 0.1658F, 0.0F));

		PartDefinition head_r46 = leftFace.addOrReplaceChild("head_r46", CubeListBuilder.create().texOffs(83, 53).addBox(-0.5F, -0.2561F, -1.1027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(83, 26).addBox(-0.5F, -0.2561F, -0.7027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0364F, 0.3817F, 0.2397F, 0.3752F, 0.1614F, 0.0F));

		PartDefinition head_r47 = leftFace.addOrReplaceChild("head_r47", CubeListBuilder.create().texOffs(83, 23).addBox(-0.5F, -0.4126F, -0.3617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(83, 20).addBox(-0.5F, -0.8126F, -0.3617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0364F, 0.3817F, 0.2397F, -0.4974F, 0.1614F, 0.0F));

		PartDefinition head_r48 = leftFace.addOrReplaceChild("head_r48", CubeListBuilder.create().texOffs(21, 78).addBox(-0.5F, -0.7564F, -0.5413F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.0364F, 0.3817F, 0.2397F, -0.8639F, 0.1614F, 0.0F));

		PartDefinition head_r49 = leftFace.addOrReplaceChild("head_r49", CubeListBuilder.create().texOffs(83, 17).addBox(-0.5F, -1.1477F, -0.5571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0364F, 0.3817F, 0.2397F, -0.8988F, 0.1614F, 0.0F));

		PartDefinition head_r50 = leftFace.addOrReplaceChild("head_r50", CubeListBuilder.create().texOffs(83, 6).addBox(-0.5F, -0.1534F, -0.7325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0636F, 0.1181F, 2.0532F, -0.8116F, 0.1658F, 0.0F));

		PartDefinition head_r51 = leftFace.addOrReplaceChild("head_r51", CubeListBuilder.create().texOffs(83, 3).addBox(-0.5F, 0.0645F, 0.0654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0636F, 0.1181F, 2.0532F, -1.6842F, 0.1658F, 0.0F));

		PartDefinition head_r52 = leftFace.addOrReplaceChild("head_r52", CubeListBuilder.create().texOffs(83, 0).addBox(-0.5F, -0.9054F, -0.343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0636F, 0.1181F, 2.0532F, -2.8187F, 0.1658F, 0.0F));

		PartDefinition head_r53 = leftFace.addOrReplaceChild("head_r53", CubeListBuilder.create().texOffs(82, 76).addBox(-0.5F, 0.0358F, -0.9303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.0636F, 0.1181F, 2.0532F, 2.0246F, 0.1658F, 0.0F));

		PartDefinition head_r54 = leftFace.addOrReplaceChild("head_r54", CubeListBuilder.create().texOffs(82, 46).addBox(-0.5F, 0.2633F, -0.5602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0636F, 0.1181F, 2.0532F, 1.6755F, 0.1658F, 0.0F));

		PartDefinition head_r55 = leftFace.addOrReplaceChild("head_r55", CubeListBuilder.create().texOffs(39, 84).addBox(0.75F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.6864F, 1.1829F, 6.5271F, 0.6545F, 0.0F, 0.0F));

		PartDefinition head_r56 = leftFace.addOrReplaceChild("head_r56", CubeListBuilder.create().texOffs(82, 43).addBox(-0.5F, -0.4614F, 0.2298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0636F, 0.1181F, 2.0532F, 0.7592F, 0.1658F, 0.0F));

		PartDefinition head_r57 = leftFace.addOrReplaceChild("head_r57", CubeListBuilder.create().texOffs(23, 34).addBox(-0.9596F, -1.4631F, 3.8891F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2614F, 2.1176F, -2.0706F, 0.3316F, 0.1571F, 0.0F));

		PartDefinition head_r58 = leftFace.addOrReplaceChild("head_r58", CubeListBuilder.create().texOffs(58, 20).addBox(-1.0F, 0.025F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6336F, 0.1199F, 0.0876F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.7637F, 0.9078F, -7.6618F));

		PartDefinition head_r59 = rightFace.addOrReplaceChild("head_r59", CubeListBuilder.create().texOffs(74, 86).mirror().addBox(-1.5F, -0.0111F, -0.983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6364F, -0.7049F, 6.0663F, 2.1555F, 0.0F, 0.0F));

		PartDefinition head_r60 = rightFace.addOrReplaceChild("head_r60", CubeListBuilder.create().texOffs(20, 87).mirror().addBox(-0.0069F, -0.1423F, -2.6659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(54, 84).mirror().addBox(-0.0069F, -0.1423F, -1.8659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.0743F, 0.7629F, -0.6843F, 0.3713F, -0.132F, 0.0016F));

		PartDefinition head_r61 = rightFace.addOrReplaceChild("head_r61", CubeListBuilder.create().texOffs(69, 86).mirror().addBox(-1.5F, 1.6889F, -0.483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 86).mirror().addBox(-1.5F, 1.6889F, -0.908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(76, 80).mirror().addBox(-1.5F, 0.3889F, -0.508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.6364F, -1.016F, 4.3218F, 1.1083F, 0.0F, 0.0F));

		PartDefinition head_r62 = rightFace.addOrReplaceChild("head_r62", CubeListBuilder.create().texOffs(81, 80).mirror().addBox(-1.5F, -1.1352F, -0.0254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6364F, -1.016F, 4.3218F, 2.1337F, 0.0F, 0.0F));

		PartDefinition head_r63 = rightFace.addOrReplaceChild("head_r63", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-1.5F, -0.1969F, 0.2446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(71, 80).mirror().addBox(-1.5F, -0.4719F, 0.2446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6364F, -1.016F, 4.3218F, 0.4451F, 0.0F, 0.0F));

		PartDefinition head_r64 = rightFace.addOrReplaceChild("head_r64", CubeListBuilder.create().texOffs(77, 47).mirror().addBox(-1.5F, -0.6418F, -0.9424F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6364F, -1.016F, 4.3218F, 1.1694F, 0.0F, 0.0F));

		PartDefinition head_r65 = rightFace.addOrReplaceChild("head_r65", CubeListBuilder.create().texOffs(66, 80).mirror().addBox(-1.5F, -1.2185F, -0.4642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6364F, -1.016F, 4.3218F, -0.3491F, 0.0F, 0.0F));

		PartDefinition head_r66 = rightFace.addOrReplaceChild("head_r66", CubeListBuilder.create().texOffs(77, 43).mirror().addBox(-1.5F, -1.2644F, -0.6564F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.6364F, -1.016F, 4.3218F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head_r67 = rightFace.addOrReplaceChild("head_r67", CubeListBuilder.create().texOffs(19, 82).mirror().addBox(-1.5F, -0.903F, 0.4078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6364F, -1.016F, 4.3218F, 2.3475F, 0.0F, 0.0F));

		PartDefinition head_r68 = rightFace.addOrReplaceChild("head_r68", CubeListBuilder.create().texOffs(82, 31).mirror().addBox(-0.375F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false)
				.texOffs(82, 34).mirror().addBox(-0.65F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3636F, -1.2177F, 4.114F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head_r69 = rightFace.addOrReplaceChild("head_r69", CubeListBuilder.create().texOffs(84, 49).mirror().addBox(-0.0404F, -3.9354F, 4.4415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2614F, 2.1176F, -2.0706F, -0.3229F, -0.1571F, 0.0F));

		PartDefinition head_r70 = rightFace.addOrReplaceChild("head_r70", CubeListBuilder.create().texOffs(10, 87).mirror().addBox(-0.5F, -0.4F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 87).mirror().addBox(-0.5F, -0.4F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 87).mirror().addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1819F, 1.9458F, -0.214F, 0.3278F, -0.1655F, -0.0082F));

		PartDefinition head_r71 = rightFace.addOrReplaceChild("head_r71", CubeListBuilder.create().texOffs(49, 84).mirror().addBox(-0.0404F, -0.804F, 2.919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2614F, 2.1176F, -2.0706F, 0.2443F, -0.1571F, 0.0F));

		PartDefinition head_r72 = rightFace.addOrReplaceChild("head_r72", CubeListBuilder.create().texOffs(84, 59).mirror().addBox(-0.0069F, 0.1915F, -0.582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.0743F, 0.7629F, -0.6843F, 0.1531F, -0.132F, 0.0016F));

		PartDefinition head_r73 = rightFace.addOrReplaceChild("head_r73", CubeListBuilder.create().texOffs(84, 86).mirror().addBox(-0.1794F, 0.6581F, -0.4807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0743F, 0.7629F, -0.6843F, 0.3277F, -0.132F, 0.0016F));

		PartDefinition head_r74 = rightFace.addOrReplaceChild("head_r74", CubeListBuilder.create().texOffs(86, 82).mirror().addBox(-0.1794F, 0.6941F, -0.8033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0743F, 0.7629F, -0.6843F, 0.0222F, -0.132F, 0.0016F));

		PartDefinition head_r75 = rightFace.addOrReplaceChild("head_r75", CubeListBuilder.create().texOffs(79, 86).mirror().addBox(-0.225F, -0.2F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3114F, 2.2948F, -2.7811F, -0.26F, 0.0533F, 0.3893F));

		PartDefinition head_r76 = rightFace.addOrReplaceChild("head_r76", CubeListBuilder.create().texOffs(86, 79).mirror().addBox(-0.25F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2864F, 2.4235F, -2.2985F, 0.4376F, -0.0258F, 0.3523F));

		PartDefinition head_r77 = rightFace.addOrReplaceChild("head_r77", CubeListBuilder.create().texOffs(84, 62).mirror().addBox(-0.0069F, 0.2694F, -1.1289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0743F, 0.7629F, -0.6843F, -0.065F, -0.132F, 0.0016F));

		PartDefinition head_r78 = rightFace.addOrReplaceChild("head_r78", CubeListBuilder.create().texOffs(54, 67).mirror().addBox(-0.0069F, -0.4318F, -2.5761F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.0743F, 0.7629F, -0.6843F, 0.4455F, -0.132F, 0.0016F));

		PartDefinition head_r79 = rightFace.addOrReplaceChild("head_r79", CubeListBuilder.create().texOffs(44, 84).mirror().addBox(-0.0404F, -0.957F, 1.9239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2614F, 2.1176F, -2.0706F, 0.192F, -0.1571F, 0.0F));

		PartDefinition head_r80 = rightFace.addOrReplaceChild("head_r80", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.0404F, 0.0369F, -4.6108F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5931F, -1.9841F, 3.3243F, 0.5236F, -0.1571F, 0.0F));

		PartDefinition head_r81 = rightFace.addOrReplaceChild("head_r81", CubeListBuilder.create().texOffs(83, 14).mirror().addBox(-0.5F, -1.1427F, -0.7322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(83, 9).mirror().addBox(-0.5F, -0.8427F, -0.7322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0636F, 0.1181F, 2.0532F, -0.9861F, -0.1658F, 0.0F));

		PartDefinition head_r82 = rightFace.addOrReplaceChild("head_r82", CubeListBuilder.create().texOffs(83, 53).mirror().addBox(-0.5F, -0.2561F, -1.1027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 26).mirror().addBox(-0.5F, -0.2561F, -0.7027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.0364F, 0.3817F, 0.2397F, 0.3752F, -0.1614F, 0.0F));

		PartDefinition head_r83 = rightFace.addOrReplaceChild("head_r83", CubeListBuilder.create().texOffs(83, 23).mirror().addBox(-0.5F, -0.4126F, -0.3617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 20).mirror().addBox(-0.5F, -0.8126F, -0.3617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.0364F, 0.3817F, 0.2397F, -0.4974F, -0.1614F, 0.0F));

		PartDefinition head_r84 = rightFace.addOrReplaceChild("head_r84", CubeListBuilder.create().texOffs(21, 78).mirror().addBox(-0.5F, -0.7564F, -0.5413F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.0364F, 0.3817F, 0.2397F, -0.8639F, -0.1614F, 0.0F));

		PartDefinition head_r85 = rightFace.addOrReplaceChild("head_r85", CubeListBuilder.create().texOffs(83, 17).mirror().addBox(-0.5F, -1.1477F, -0.5571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0364F, 0.3817F, 0.2397F, -0.8988F, -0.1614F, 0.0F));

		PartDefinition head_r86 = rightFace.addOrReplaceChild("head_r86", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-0.5F, -0.1534F, -0.7325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.0636F, 0.1181F, 2.0532F, -0.8116F, -0.1658F, 0.0F));

		PartDefinition head_r87 = rightFace.addOrReplaceChild("head_r87", CubeListBuilder.create().texOffs(83, 3).mirror().addBox(-0.5F, 0.0645F, 0.0654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0636F, 0.1181F, 2.0532F, -1.6842F, -0.1658F, 0.0F));

		PartDefinition head_r88 = rightFace.addOrReplaceChild("head_r88", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-0.5F, -0.9054F, -0.343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.0636F, 0.1181F, 2.0532F, -2.8187F, -0.1658F, 0.0F));

		PartDefinition head_r89 = rightFace.addOrReplaceChild("head_r89", CubeListBuilder.create().texOffs(82, 76).mirror().addBox(-0.5F, 0.0358F, -0.9303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-0.0636F, 0.1181F, 2.0532F, 2.0246F, -0.1658F, 0.0F));

		PartDefinition head_r90 = rightFace.addOrReplaceChild("head_r90", CubeListBuilder.create().texOffs(82, 46).mirror().addBox(-0.5F, 0.2633F, -0.5602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.0636F, 0.1181F, 2.0532F, 1.6755F, -0.1658F, 0.0F));

		PartDefinition head_r91 = rightFace.addOrReplaceChild("head_r91", CubeListBuilder.create().texOffs(39, 84).mirror().addBox(-1.75F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.6864F, 1.1829F, 6.5271F, 0.6545F, 0.0F, 0.0F));

		PartDefinition head_r92 = rightFace.addOrReplaceChild("head_r92", CubeListBuilder.create().texOffs(82, 43).mirror().addBox(-0.5F, -0.4614F, 0.2298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.0636F, 0.1181F, 2.0532F, 0.7592F, -0.1658F, 0.0F));

		PartDefinition head_r93 = rightFace.addOrReplaceChild("head_r93", CubeListBuilder.create().texOffs(23, 34).mirror().addBox(-0.0404F, -1.4631F, 3.8891F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2614F, 2.1176F, -2.0706F, 0.3316F, -0.1571F, 0.0F));

		PartDefinition head_r94 = rightFace.addOrReplaceChild("head_r94", CubeListBuilder.create().texOffs(58, 20).mirror().addBox(0.0F, 0.025F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6336F, -0.1199F, -0.0876F));

		PartDefinition leftWing = chest.addOrReplaceChild("leftWing", CubeListBuilder.create().texOffs(75, 76).addBox(-0.5F, -0.15F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.3327F, 1.2467F, -4.5068F, 0.5008F, -0.2153F, -2.036F));

		PartDefinition cube_r30 = leftWing.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(7, 77).addBox(-0.5F, 0.15F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F))
				.texOffs(24, 84).addBox(-0.5F, -0.45F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.15F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftWing.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(77, 31).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 7.1106F, -1.4391F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftWing.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(36, 69).addBox(-0.5F, 0.0F, -0.95F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.0F, 2.1457F, 0.0933F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftWing.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(34, 84).addBox(-0.5F, 0.55F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(29, 84).addBox(-0.5F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 2.0814F, -1.7625F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftWing.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(69, 25).addBox(-0.5F, -1.1F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.0F, 1.45F, 0.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftWing.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(56, 80).addBox(-0.5F, -0.85F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 1.45F, 0.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftWing2 = leftWing.addOrReplaceChild("leftWing2", CubeListBuilder.create().texOffs(17, 46).addBox(-0.4001F, -0.1808F, -0.3248F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(22, 50).addBox(-0.4001F, -0.1808F, -1.0248F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-0.0777F, 10.0472F, -2.7352F, -0.6552F, -0.1722F, -0.134F));

		PartDefinition cube_r36 = leftWing2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(78, 8).addBox(-0.4786F, -2.7693F, -1.1357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0999F, 14.4448F, -0.9685F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftWing2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(78, 4).addBox(-0.4786F, -1.5912F, -0.5175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0999F, 14.4448F, -0.9685F, 0.6109F, 0.0F, 0.0F));

		PartDefinition leftWing3 = leftWing2.addOrReplaceChild("leftWing3", CubeListBuilder.create().texOffs(9, 68).addBox(-0.4656F, -0.0774F, -0.4857F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0707F, 14.7462F, -0.3F, 0.32F, 0.4187F, 0.0903F));

		PartDefinition hand = leftWing3.addOrReplaceChild("hand", CubeListBuilder.create().texOffs(69, 0).addBox(-0.6299F, -2.8109F, 0.1631F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.4277F, 6.4974F, -0.2636F, 0.9483F, -0.439F, -3.0005F));

		PartDefinition leftWing4 = leftWing3.addOrReplaceChild("leftWing4", CubeListBuilder.create().texOffs(0, 17).addBox(-0.3974F, -0.3279F, -0.4177F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0172F, 6.0375F, 0.0053F, -1.3664F, 0.3357F, 0.0279F));

		PartDefinition leftWing5 = leftWing4.addOrReplaceChild("leftWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3967F, 0.1715F, 14.1765F, 0.004F, -0.0766F, -0.05F));

		PartDefinition cube_r38 = leftWing5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -0.9F, -3.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2111F, -0.2093F, 2.9013F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftWing6 = leftWing5.addOrReplaceChild("leftWing6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5073F, -0.6863F, -0.2623F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2023F, -2.2925F, 11.3529F, 0.2761F, -0.0622F, -0.0703F));

		PartDefinition leftWing7 = leftWing6.addOrReplaceChild("leftWing7", CubeListBuilder.create().texOffs(33, 27).addBox(-0.5073F, -0.6863F, -0.2623F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.038F, -0.0183F, 14.5934F, 0.1805F, -0.0612F, -0.0739F));

		PartDefinition rightWing = chest.addOrReplaceChild("rightWing", CubeListBuilder.create().texOffs(75, 76).mirror().addBox(-0.5F, -0.15F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.4873F, 1.2467F, -4.5068F, 0.7394F, 0.321F, 1.5632F));

		PartDefinition cube_r39 = rightWing.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(7, 77).mirror().addBox(-0.5F, 0.15F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false)
				.texOffs(24, 84).mirror().addBox(-0.5F, -0.45F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.15F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightWing.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(77, 31).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.1106F, -1.4391F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightWing.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(36, 69).mirror().addBox(-0.5F, 0.0F, -0.95F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1457F, 0.0933F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightWing.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(34, 84).mirror().addBox(-0.5F, 0.55F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(29, 84).mirror().addBox(-0.5F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0814F, -1.7625F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightWing.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(69, 25).mirror().addBox(-0.5F, -1.1F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.45F, 0.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightWing.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(56, 80).mirror().addBox(-0.5F, -0.85F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.45F, 0.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create().texOffs(17, 46).mirror().addBox(-0.5999F, -0.1808F, -0.3248F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(22, 50).mirror().addBox(-0.5999F, -0.1808F, -1.0248F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(0.0777F, 10.0472F, -2.7352F, -0.7861F, 0.1722F, 0.134F));

		PartDefinition cube_r45 = rightWing2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(78, 8).mirror().addBox(-0.5214F, -2.7693F, -1.1357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.0999F, 14.4448F, -0.9685F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightWing2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(78, 4).mirror().addBox(-0.5214F, -1.5912F, -0.5175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0999F, 14.4448F, -0.9685F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create().texOffs(9, 68).mirror().addBox(-0.5344F, -0.0774F, -0.4857F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0707F, 14.7462F, -0.3F, 0.3814F, -0.121F, -0.0128F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-0.3701F, -2.8109F, 0.1631F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.4277F, 6.4974F, -0.2636F, 0.9483F, 0.439F, 3.0005F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-0.6026F, -0.3279F, -0.4177F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0172F, 6.0375F, 0.0053F, -1.3664F, -0.3357F, -0.0279F));

		PartDefinition rightWing5 = rightWing4.addOrReplaceChild("rightWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3967F, 0.1715F, 14.1765F, -0.0257F, 0.0723F, -0.3438F));

		PartDefinition cube_r47 = rightWing5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(33, 0).mirror().addBox(-0.5F, -0.9F, -3.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2111F, -0.2093F, 2.9013F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.4927F, -0.6863F, -0.2623F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2023F, -2.2925F, 11.3529F, 0.2761F, 0.0622F, 0.0703F));

		PartDefinition rightWing7 = rightWing6.addOrReplaceChild("rightWing7", CubeListBuilder.create().texOffs(33, 27).mirror().addBox(-0.4927F, -0.6863F, -0.2623F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.038F, -0.0183F, 14.5934F, 0.1805F, 0.0612F, 0.0739F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.1947F, 1.671F, -4.0451F));

		PartDefinition cube_r48 = bone2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 72).addBox(0.1781F, -1.0104F, -0.1287F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 3.8049F, 3.22F, 0.1784F, -0.0473F, -0.6307F));

		PartDefinition cube_r49 = bone2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(67, 55).addBox(-0.915F, -0.5143F, -0.6805F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9F, 2.0F, 1.2F, -0.373F, -0.1155F, -0.3754F));

		PartDefinition cube_r50 = bone2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(66, 83).addBox(-0.9177F, -0.3893F, -0.9856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(83, 56).addBox(-1.4177F, -0.3893F, -0.9856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 2.0F, 1.2F, -0.4325F, -0.4686F, -0.0748F));

		PartDefinition cube_r51 = bone2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(21, 72).addBox(0.047F, -2.5707F, -1.7753F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5133F, -0.8579F, -0.08F));

		PartDefinition cube_r52 = bone2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(70, 38).addBox(1.3476F, -0.3028F, -0.1105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 34).addBox(1.3476F, -0.7028F, -0.1105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, -1.3F, -1.0F, 0.5843F, 0.035F, 0.0688F));

		PartDefinition cube_r53 = bone2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(27, 57).addBox(1.5531F, -0.3113F, -0.5109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5094F, -2.5472F, 2.6383F, -0.2066F, -0.1384F, 0.0557F));

		PartDefinition cube_r54 = bone2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(26, 72).addBox(1.5531F, -0.8338F, -2.2041F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3909F, -2.0319F, 1.7549F, 0.2406F, -0.1472F, 0.0242F));

		PartDefinition cube_r55 = bone2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(63, 62).addBox(1.5531F, -0.3113F, -0.5109F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.1291F, -2.5023F, 0.0667F, 0.0137F, -0.1472F, 0.0242F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.3492F, 1.671F, -4.0451F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-1.1781F, -1.0104F, -0.1287F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 3.8049F, 3.22F, 0.1784F, 0.0473F, 0.6307F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(67, 55).mirror().addBox(-0.085F, -0.5143F, -0.6805F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.0F, 1.2F, -0.373F, 0.1155F, 0.3754F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(66, 83).mirror().addBox(-0.0823F, -0.3893F, -0.9856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(83, 56).mirror().addBox(0.4177F, -0.3893F, -0.9856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.0F, 1.2F, -0.4325F, 0.4686F, 0.0748F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(21, 72).mirror().addBox(-1.047F, -2.5707F, -1.7753F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5133F, 0.8579F, 0.08F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(70, 38).mirror().addBox(-2.3476F, -0.3028F, -0.1105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(70, 34).mirror().addBox(-2.3476F, -0.7028F, -0.1105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3F, -1.0F, 0.5843F, -0.035F, -0.0688F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(27, 57).mirror().addBox(-2.5531F, -0.3113F, -0.5109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5094F, -2.5472F, 2.6383F, -0.2066F, 0.1384F, -0.0557F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(26, 72).mirror().addBox(-2.5531F, -0.8338F, -2.2041F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3909F, -2.0319F, 1.7549F, 0.2406F, 0.1472F, -0.0242F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(63, 62).mirror().addBox(-2.5531F, -0.3113F, -0.5109F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.1291F, -2.5023F, 0.0667F, 0.0137F, 0.1472F, -0.0242F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(27, 50).addBox(-0.5773F, -0.7F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(88, 16).addBox(-0.0773F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6773F, 0.7011F, 8.2812F, 0.0025F, 0.1309F, 0.0003F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(23, 40).addBox(-0.5773F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2293F, 4.9488F, 0.0411F, 0.218F, 0.0089F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5673F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.0256F, 7.9921F, 0.1085F, 0.3037F, 0.0326F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5773F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.0311F, 9.9203F, 0.0891F, 0.2608F, 0.023F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(42, 40).addBox(-0.5773F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0002F, 6.9585F, 0.0428F, 0.1308F, 0.0056F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(33, 14).addBox(-0.5773F, -0.5F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0048F, 6.926F, 0.0439F, 0.2616F, 0.0114F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4974F, 1.0147F, 5.8068F, -0.0419F, 0.4031F, -0.8245F));

		PartDefinition cube_r64 = leftLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(46, 80).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1987F)), PartPose.offsetAndRotation(0.1F, 1.5492F, 0.6628F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(77, 37).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 3.1128F, -0.2062F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(79, 63).addBox(-0.5F, -2.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 2.0F, 0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(40, 56).addBox(-0.4F, -0.2F, 0.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0193F, 7.0598F, 0.7113F, 1.3003F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(42, 49).addBox(-1.0F, -0.6F, -4.9F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1358F, 10.6024F, 0.4746F, 1.2386F, 0.0984F, -0.0101F));

		PartDefinition finger = leftLeg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7243F, -0.1695F, 0.0302F, 0.0623F, -0.0982F, -0.0319F));

		PartDefinition cube_r67 = finger.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(87, 74).addBox(0.0411F, -0.5F, -2.3422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(82, 40).addBox(0.0411F, -0.5F, -1.9422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8142F, 0.0542F, -1.3309F, 0.0F, 1.0559F, 0.0F));

		PartDefinition cube_r68 = finger.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(69, 30).addBox(-0.4983F, -0.5F, -2.9238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(69, 30).addBox(-0.4983F, -0.5F, -1.5238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2142F, 0.0542F, -0.3309F, 0.0F, 0.6021F, 0.0F));

		PartDefinition cube_r69 = finger.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(82, 37).addBox(-0.3039F, -0.5F, -1.7478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0858F, 0.0542F, 1.0691F, 0.0F, 0.3491F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(59, 36).addBox(-1.0F, -0.0101F, -2.9001F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -4.9649F, 0.0007F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2974F, 1.0147F, 5.8068F, 0.7059F, -0.402F, 0.5873F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(46, 80).mirror().addBox(-0.5F, -0.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1987F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.5492F, 0.6628F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(77, 37).mirror().addBox(-0.5F, -0.2F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 3.1128F, -0.2062F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(79, 63).mirror().addBox(-0.5F, -2.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.0F, 0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(40, 56).mirror().addBox(-0.6F, -0.2F, 0.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0193F, 7.0598F, 0.7113F, 0.9512F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(42, 49).mirror().addBox(-1.0F, -0.6F, -4.9F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1358F, 10.6024F, 0.4746F, 1.2386F, -0.0984F, 0.0101F));

		PartDefinition finger2 = rightLeg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7243F, -0.1695F, 0.0302F, 0.0623F, 0.0982F, 0.0319F));

		PartDefinition cube_r73 = finger2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(87, 74).mirror().addBox(-1.0411F, -0.5F, -2.3422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(82, 40).mirror().addBox(-1.0411F, -0.5F, -1.9422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8142F, 0.0542F, -1.3309F, 0.0F, -1.0559F, 0.0F));

		PartDefinition cube_r74 = finger2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.5017F, -0.5F, -2.9238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.5017F, -0.5F, -1.5238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2142F, 0.0542F, -0.3309F, 0.0F, -0.6021F, 0.0F));

		PartDefinition cube_r75 = finger2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(82, 37).mirror().addBox(-0.6961F, -0.5F, -1.7478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0858F, 0.0542F, 1.0691F, 0.0F, -0.3491F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(59, 36).mirror().addBox(-1.0F, -0.0101F, -2.9001F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5877F, -4.9649F, 0.3061F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0442F, 1.3078F, 5.681F, 0.4378F, 0.0791F, 0.037F));

		PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 84).addBox(-0.3194F, -0.8061F, -0.8351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.1171F, -0.3523F, -0.2921F, -0.6041F, -0.1866F, 0.1137F));

		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(10, 84).addBox(-0.5F, -0.35F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 84).addBox(-0.5F, -0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.5324F, 0.211F, 2.528F, -0.6913F, -0.1866F, 0.1137F));

		PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(76, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4082F, 0.0728F, 1.9575F, -0.255F, -0.1866F, 0.1137F));

		PartDefinition cube_r79 = bone.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(72, 64).addBox(-0.3194F, -0.6411F, -2.3533F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1171F, -0.3523F, -0.2921F, -0.8833F, -0.1866F, 0.1137F));

		PartDefinition cube_r80 = bone.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(62, 72).addBox(-0.3332F, -1.1141F, -0.2643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.1171F, -0.0523F, -0.3921F, -0.4119F, -0.1886F, 0.1104F));

		PartDefinition cube_r81 = bone.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(83, 71).addBox(-0.5F, -0.5672F, -0.3326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.2731F, -0.1463F, 1.3792F, -0.6222F, -0.1878F, 0.1023F));

		PartDefinition cube_r82 = bone.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(81, 83).addBox(-0.675F, -0.5F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(61, 76).addBox(-0.675F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2066F, 1.0699F, -0.4476F, -0.6606F, -0.2106F, 0.0573F));

		PartDefinition cube_r83 = bone.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(71, 83).addBox(-0.5F, -0.5486F, -0.6737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2731F, -0.1463F, 1.3792F, 0.0323F, -0.1878F, 0.1023F));

		PartDefinition cube_r84 = bone.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(72, 60).addBox(-0.65F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.1222F, 0.4518F, 1.2537F, 1.2724F, -0.2106F, 0.0573F));

		PartDefinition cube_r85 = bone.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(79, 59).addBox(-0.5F, -1.625F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2933F, 2.1687F, 0.7752F, -0.0061F, -0.2106F, 0.0573F));

		PartDefinition cube_r86 = bone.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(70, 42).addBox(-1.6837F, -0.2214F, -1.5317F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2221F, 1.2845F, -1.0402F, -0.1879F, -0.3004F, 0.0562F));

		PartDefinition cube_r87 = bone.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(68, 49).addBox(-1.7988F, -0.4561F, -2.08F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(-0.2221F, 1.2845F, -1.0402F, -0.2894F, -0.3587F, 1.8779F));

		PartDefinition cube_r88 = bone.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(55, 72).addBox(-0.3916F, -0.5712F, -1.5144F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2221F, 1.2845F, -1.0402F, 0.1F, -0.0981F, 0.1366F));

		PartDefinition cube_r89 = bone.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(69, 20).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3551F, -0.2106F, 0.0573F));

		PartDefinition cube_r90 = bone.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(48, 72).addBox(-0.5F, -0.575F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.3965F, 2.051F, 1.2886F, -1.2278F, -0.2106F, 0.0573F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8442F, 1.3078F, 5.681F, 0.4378F, -0.0791F, -0.037F));

		PartDefinition cube_r91 = bone3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.6806F, -0.8061F, -0.8351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.1171F, -0.3523F, -0.2921F, -0.6041F, 0.1866F, -0.1137F));

		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(10, 84).mirror().addBox(-0.5F, -0.35F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 84).mirror().addBox(-0.5F, -0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.5324F, 0.211F, 2.528F, -0.6913F, 0.1866F, -0.1137F));

		PartDefinition cube_r93 = bone3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(76, 83).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4082F, 0.0728F, 1.9575F, -0.255F, 0.1866F, -0.1137F));

		PartDefinition cube_r94 = bone3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(72, 64).mirror().addBox(-0.6806F, -0.6411F, -2.3533F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1171F, -0.3523F, -0.2921F, -0.8833F, 0.1866F, -0.1137F));

		PartDefinition cube_r95 = bone3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(62, 72).mirror().addBox(-0.6668F, -1.1141F, -0.2643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.1171F, -0.0523F, -0.3921F, -0.4119F, 0.1886F, -0.1104F));

		PartDefinition cube_r96 = bone3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(83, 71).mirror().addBox(-0.5F, -0.5672F, -0.3326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.2731F, -0.1463F, 1.3792F, -0.6222F, 0.1878F, -0.1023F));

		PartDefinition cube_r97 = bone3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(81, 83).mirror().addBox(-0.325F, -0.5F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(61, 76).mirror().addBox(-0.325F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2066F, 1.0699F, -0.4476F, -0.6606F, 0.2106F, -0.0573F));

		PartDefinition cube_r98 = bone3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(71, 83).mirror().addBox(-0.5F, -0.5486F, -0.6737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2731F, -0.1463F, 1.3792F, 0.0323F, 0.1878F, -0.1023F));

		PartDefinition cube_r99 = bone3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(72, 60).mirror().addBox(-0.35F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(0.1222F, 0.4518F, 1.2537F, 1.2724F, 0.2106F, -0.0573F));

		PartDefinition cube_r100 = bone3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(79, 59).mirror().addBox(-0.5F, -1.625F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2933F, 2.1687F, 0.7752F, -0.0061F, 0.2106F, -0.0573F));

		PartDefinition cube_r101 = bone3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(70, 42).mirror().addBox(-0.3163F, -0.2214F, -1.5317F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 1.2845F, -1.0402F, -0.1879F, 0.3004F, -0.0562F));

		PartDefinition cube_r102 = bone3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(68, 49).mirror().addBox(-0.2011F, -0.4561F, -2.08F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 1.2845F, -1.0402F, -0.2894F, 0.3587F, -1.8779F));

		PartDefinition cube_r103 = bone3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(55, 72).mirror().addBox(-0.6084F, -0.5712F, -1.5144F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 1.2845F, -1.0402F, 0.1F, 0.0981F, -0.1366F));

		PartDefinition cube_r104 = bone3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(69, 20).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3551F, 0.2106F, -0.0573F));

		PartDefinition cube_r105 = bone3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(48, 72).mirror().addBox(-0.5F, -0.575F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.3965F, 2.051F, 1.2886F, -1.2278F, 0.2106F, -0.0573F));

		return LayerDefinition.create(meshdefinition, 92, 92);
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