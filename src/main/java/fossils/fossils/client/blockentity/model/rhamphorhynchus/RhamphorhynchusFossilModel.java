package fossils.fossils.client.blockentity.model.rhamphorhynchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RhamphorhynchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest;
	private final ModelPart leftwing1;
	private final ModelPart leftwing2;
	private final ModelPart leftwing3;
	private final ModelPart leftwing4;
	private final ModelPart leftwing5;
	private final ModelPart leftwing7;
	private final ModelPart leftwing8;
	private final ModelPart leftwing6;
	private final ModelPart leftwing5membrance2;
	private final ModelPart lefthand2;
	private final ModelPart leftwing4membrance;
	private final ModelPart leftwing3membrance;
	private final ModelPart leftwing1membrance;
	private final ModelPart rightwing1;
	private final ModelPart rightwing2;
	private final ModelPart rightwing3;
	private final ModelPart rightwing4;
	private final ModelPart rightwing5;
	private final ModelPart rightwing7;
	private final ModelPart rightwing8;
	private final ModelPart rightwing6;
	private final ModelPart rightwing5membrance2;
	private final ModelPart righthand2;
	private final ModelPart rightwing4membrance;
	private final ModelPart rightwing3membrance;
	private final ModelPart rightwing1membrance;
	private final ModelPart bone2;
	private final ModelPart bone6;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body1;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
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
	private final ModelPart bone5;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart bone3;
	private final ModelPart rightFace;
	private final ModelPart bone4;
	private final ModelPart jaw;

	public RhamphorhynchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest = this.root.getChild("chest");
		this.leftwing1 = this.chest.getChild("leftwing1");
		this.leftwing2 = this.leftwing1.getChild("leftwing2");
		this.leftwing3 = this.leftwing2.getChild("leftwing3");
		this.leftwing4 = this.leftwing3.getChild("leftwing4");
		this.leftwing5 = this.leftwing4.getChild("leftwing5");
		this.leftwing7 = this.leftwing5.getChild("leftwing7");
		this.leftwing8 = this.leftwing7.getChild("leftwing8");
		this.leftwing6 = this.leftwing4.getChild("leftwing6");
		this.leftwing5membrance2 = this.leftwing6.getChild("leftwing5membrance2");
		this.lefthand2 = this.leftwing4.getChild("lefthand2");
		this.leftwing4membrance = this.leftwing4.getChild("leftwing4membrance");
		this.leftwing3membrance = this.leftwing2.getChild("leftwing3membrance");
		this.leftwing1membrance = this.leftwing1.getChild("leftwing1membrance");
		this.rightwing1 = this.chest.getChild("rightwing1");
		this.rightwing2 = this.rightwing1.getChild("rightwing2");
		this.rightwing3 = this.rightwing2.getChild("rightwing3");
		this.rightwing4 = this.rightwing3.getChild("rightwing4");
		this.rightwing5 = this.rightwing4.getChild("rightwing5");
		this.rightwing7 = this.rightwing5.getChild("rightwing7");
		this.rightwing8 = this.rightwing7.getChild("rightwing8");
		this.rightwing6 = this.rightwing4.getChild("rightwing6");
		this.rightwing5membrance2 = this.rightwing6.getChild("rightwing5membrance2");
		this.righthand2 = this.rightwing4.getChild("righthand2");
		this.rightwing4membrance = this.rightwing4.getChild("rightwing4membrance");
		this.rightwing3membrance = this.rightwing2.getChild("rightwing3membrance");
		this.rightwing1membrance = this.rightwing1.getChild("rightwing1membrance");
		this.bone2 = this.chest.getChild("bone2");
		this.bone6 = this.chest.getChild("bone6");
		this.body3 = this.chest.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body1 = this.body.getChild("body1");
		this.tail1 = this.body1.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.leftLeg = this.body1.getChild("leftLeg");
		this.leftLegMembrane = this.leftLeg.getChild("leftLegMembrane");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.finger = this.leftLeg3.getChild("finger");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.body1.getChild("rightLeg");
		this.rightLegMembrane = this.rightLeg.getChild("rightLegMembrane");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.finger2 = this.rightLeg3.getChild("finger2");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.bone = this.body1.getChild("bone");
		this.bone5 = this.body1.getChild("bone5");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.bone3 = this.leftFace.getChild("bone3");
		this.rightFace = this.head.getChild("rightFace");
		this.bone4 = this.rightFace.getChild("bone4");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition chest = root.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.1804F, -1.7332F, -0.8456F, 0.0F, 0.0F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(50, 83).addBox(-0.8F, -1.025F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 62).addBox(-0.5F, -0.525F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck6_r1 = chest.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(20, 84).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.359F, -0.0453F, 0.358F, 0.4648F, -0.8899F));

		PartDefinition neck7_r1 = chest.addOrReplaceChild("neck7_r1", CubeListBuilder.create().texOffs(74, 20).mirror().addBox(-2.8696F, -1.1537F, -0.3551F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.359F, -0.0453F, 0.0562F, 0.5762F, -1.4825F));

		PartDefinition neck5_r1 = chest.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.359F, -0.0453F, 0.534F, 0.2769F, -0.4144F));

		PartDefinition neck4_r1 = chest.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(5, 84).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.359F, -0.0453F, 0.534F, -0.2769F, 0.4144F));

		PartDefinition neck6_r2 = chest.addOrReplaceChild("neck6_r2", CubeListBuilder.create().texOffs(74, 20).addBox(0.8696F, -1.1537F, -0.3551F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.359F, -0.0453F, 0.0562F, -0.5762F, 1.4825F));

		PartDefinition neck5_r2 = chest.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(20, 84).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.359F, -0.0453F, 0.358F, -0.4648F, 0.8899F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(81, 42).addBox(-0.5F, -0.8522F, -0.8325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 3.0364F, -1.9111F, -0.8901F, 0.0F, 0.0F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(68, 4).addBox(-0.5F, -0.8511F, -1.8818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.9364F, -0.4111F, -0.5411F, 0.0F, 0.0F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(50, 72).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F))
				.texOffs(54, 54).addBox(-1.5F, -1.525F, 1.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F))
				.texOffs(41, 54).addBox(-1.5F, -0.825F, 1.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F))
				.texOffs(0, 49).addBox(-1.0F, -0.675F, -1.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.4864F, 0.0389F, -0.2618F, 0.0F, 0.0F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(26, 55).addBox(-1.5F, -0.55F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0F, 3.5791F, 0.9971F, -0.0611F, 0.0F, 0.0F));

		PartDefinition chest_r6 = chest.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(48, 8).addBox(-1.5F, -0.1708F, -1.7901F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.4864F, 1.5389F, 0.2443F, 0.0F, 0.0F));

		PartDefinition leftwing1 = chest.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6239F, 1.1481F, -1.3634F, -0.9076F, -0.2982F, 0.3888F));

		PartDefinition upperwing13_r1 = leftwing1.addOrReplaceChild("upperwing13_r1", CubeListBuilder.create().texOffs(75, 89).addBox(-0.475F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(3.3756F, 0.3879F, -0.5873F, -0.7763F, 1.0047F, 0.71F));

		PartDefinition upperwing12_r1 = leftwing1.addOrReplaceChild("upperwing12_r1", CubeListBuilder.create().texOffs(70, 89).addBox(-0.175F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(65, 89).addBox(-0.575F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(3.146F, 0.2953F, -0.3638F, -1.1098F, 0.5351F, 0.2481F));

		PartDefinition upperwing10_r1 = leftwing1.addOrReplaceChild("upperwing10_r1", CubeListBuilder.create().texOffs(60, 89).addBox(-0.55F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4782F, 0.1633F, -0.0451F, -1.1465F, 0.3773F, 0.1649F));

		PartDefinition upperwing9_r1 = leftwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(91, 15).addBox(-0.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(30, 90).addBox(-0.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3247F, 0.0368F, 0.2605F, -1.1639F, 0.2575F, 0.1093F));

		PartDefinition upperwing9_r2 = leftwing1.addOrReplaceChild("upperwing9_r2", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(85, 86).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3688F, -0.1322F, 0.6683F, -1.0589F, -0.6741F, -0.3373F));

		PartDefinition upperwing9_r3 = leftwing1.addOrReplaceChild("upperwing9_r3", CubeListBuilder.create().texOffs(74, 41).addBox(-1.3F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.0616F, 0.0794F, 0.1576F, -0.7954F, -0.9924F, -0.6872F));

		PartDefinition upperwing7_r1 = leftwing1.addOrReplaceChild("upperwing7_r1", CubeListBuilder.create().texOffs(80, 86).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.0753F, -0.0398F, 0.4452F, -1.1556F, -0.3215F, -0.1384F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create().texOffs(18, 61).addBox(-0.6789F, -0.0386F, -0.1429F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(33, 64).addBox(-0.6789F, -0.0386F, -0.9429F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.1189F, 0.1874F, -1.1802F, -1.3656F, 0.4288F, -1.8285F));

		PartDefinition wing10_r1 = leftwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(86, 21).addBox(-0.5F, -1.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(86, 18).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3889F, 5.9676F, 0.1691F, 0.0F, -1.5708F, 0.192F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(77, 63).addBox(-0.1511F, 1.8736F, -2.7009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.2283F, 2.864F, -0.1798F, 0.0F, -1.5708F, 0.4974F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(41, 49).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.3287F, 6.8112F, -0.4604F, 0.3324F, 0.3933F, 0.354F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5799F, -0.5164F, 0.346F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1353F, 2.8725F, 0.4866F, -1.0785F, -0.6411F, -0.4654F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0651F, 0.0332F, 10.0663F, 0.1899F, 0.0529F, 0.2023F));

		PartDefinition leftwing7 = leftwing5.addOrReplaceChild("leftwing7", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0488F, -0.0432F, 9.4877F, 0.1895F, 0.0193F, 0.1927F));

		PartDefinition leftwing8 = leftwing7.addOrReplaceChild("leftwing8", CubeListBuilder.create().texOffs(46, 12).addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0432F, -0.0296F, 9.5377F, 0.1898F, -0.0478F, 0.1737F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(65, 46).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0092F, 0.0525F, 0.712F, -1.4709F, 1.3671F, 0.7663F));

		PartDefinition leftwing4membrance = leftwing4.addOrReplaceChild("leftwing4membrance", CubeListBuilder.create(), PartPose.offset(-12.2799F, 3.7836F, 3.946F));

		PartDefinition leftwing3membrance = leftwing2.addOrReplaceChild("leftwing3membrance", CubeListBuilder.create(), PartPose.offset(0.8397F, 0.1609F, 0.9501F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3497F, 0.2368F, 2.9355F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = chest.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6239F, 1.1481F, -1.3634F, -1.0592F, 0.45F, 0.0603F));

		PartDefinition upperwing14_r1 = rightwing1.addOrReplaceChild("upperwing14_r1", CubeListBuilder.create().texOffs(90, 3).addBox(-0.525F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-3.3756F, 0.3879F, -0.5873F, -0.7763F, -1.0047F, -0.71F));

		PartDefinition upperwing13_r2 = rightwing1.addOrReplaceChild("upperwing13_r2", CubeListBuilder.create().texOffs(90, 0).addBox(-0.825F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(85, 89).addBox(-0.425F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-3.146F, 0.2953F, -0.3638F, -1.1098F, -0.5351F, -0.2481F));

		PartDefinition upperwing11_r1 = rightwing1.addOrReplaceChild("upperwing11_r1", CubeListBuilder.create().texOffs(80, 89).addBox(-0.45F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4782F, 0.1633F, -0.0451F, -1.1465F, -0.3773F, -0.1649F));

		PartDefinition upperwing10_r2 = rightwing1.addOrReplaceChild("upperwing10_r2", CubeListBuilder.create().texOffs(91, 18).addBox(-0.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(35, 90).addBox(-0.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3247F, 0.0368F, 0.2605F, -1.1639F, -0.2575F, -0.1093F));

		PartDefinition upperwing10_r3 = rightwing1.addOrReplaceChild("upperwing10_r3", CubeListBuilder.create().texOffs(30, 87).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(25, 87).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3688F, -0.1322F, 0.6683F, -1.0589F, 0.6741F, 0.3373F));

		PartDefinition upperwing10_r4 = rightwing1.addOrReplaceChild("upperwing10_r4", CubeListBuilder.create().texOffs(74, 44).addBox(-0.7F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.0616F, 0.0794F, 0.1576F, -0.7954F, 0.9924F, 0.6872F));

		PartDefinition upperwing8_r1 = rightwing1.addOrReplaceChild("upperwing8_r1", CubeListBuilder.create().texOffs(20, 87).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0753F, -0.0398F, 0.4452F, -1.1556F, 0.3215F, 0.1384F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create().texOffs(63, 0).addBox(-0.3211F, -0.0386F, -0.1429F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 64).addBox(-0.3211F, -0.0386F, -0.9429F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.1189F, 0.1874F, -1.1802F, -1.7689F, -0.6701F, 2.2534F));

		PartDefinition wing11_r1 = rightwing2.addOrReplaceChild("wing11_r1", CubeListBuilder.create().texOffs(86, 30).addBox(-0.5F, -1.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(86, 27).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3889F, 5.9676F, 0.1691F, 0.0F, 1.5708F, -0.192F));

		PartDefinition wing9_r1 = rightwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(77, 76).addBox(-0.8489F, 1.8736F, -2.7009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2283F, 2.864F, -0.1798F, 0.0F, 1.5708F, -0.4974F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(9, 56).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.3287F, 6.8112F, -0.4604F, 0.1579F, -0.3933F, -0.354F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create().texOffs(23, 37).addBox(-0.4201F, -0.5164F, 0.346F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1353F, 2.8725F, 0.4866F, -0.8958F, 0.416F, 0.3098F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(23, 13).addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0651F, 0.0332F, 10.0663F, 0.1676F, -0.1221F, 0.0512F));

		PartDefinition rightwing7 = rightwing5.addOrReplaceChild("rightwing7", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0488F, -0.0432F, 9.4877F, 0.1895F, -0.0193F, -0.1927F));

		PartDefinition rightwing8 = rightwing7.addOrReplaceChild("rightwing8", CubeListBuilder.create().texOffs(46, 23).addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0432F, -0.0296F, 9.5377F, 0.1462F, 0.0478F, -0.1737F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(65, 50).addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0092F, 0.0525F, 0.712F, -1.8601F, -1.4749F, 0.0257F));

		PartDefinition rightwing4membrance = rightwing4.addOrReplaceChild("rightwing4membrance", CubeListBuilder.create(), PartPose.offset(12.2799F, 3.7836F, 3.946F));

		PartDefinition rightwing3membrance = rightwing2.addOrReplaceChild("rightwing3membrance", CubeListBuilder.create(), PartPose.offset(-0.8397F, 0.1609F, 0.9501F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3497F, 0.2368F, 2.9355F, 0.0021F, 0.3752F, 0.0093F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.2719F, 1.4135F, -0.1378F));

		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(71, 58).addBox(0.047F, -2.6957F, -1.5503F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6442F, -0.8579F, -0.08F));

		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(70, 64).addBox(1.4684F, -0.8208F, -0.0205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1291F, -1.0023F, -1.0333F, 0.654F, 0.0301F, 0.071F));

		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(71, 72).addBox(1.328F, -0.3584F, -0.5525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1041F, -2.8023F, 1.4667F, 0.0235F, -0.1488F, 0.0099F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 70).addBox(1.5355F, -0.5916F, -0.5793F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.1041F, -2.1023F, 0.0667F, 0.3313F, -0.1474F, -0.0228F));

		PartDefinition bone6 = chest.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-0.2719F, 1.4135F, -0.1378F));

		PartDefinition cube_r5 = bone6.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(71, 58).mirror().addBox(-1.047F, -2.6957F, -1.5503F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6442F, 0.8579F, 0.08F));

		PartDefinition cube_r6 = bone6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(70, 64).mirror().addBox(-2.4684F, -0.8208F, -0.0205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.1291F, -1.0023F, -1.0333F, 0.654F, -0.0301F, -0.071F));

		PartDefinition cube_r7 = bone6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(71, 72).mirror().addBox(-2.328F, -0.3584F, -0.5525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1041F, -2.8023F, 1.4667F, 0.0235F, 0.1488F, -0.0099F));

		PartDefinition cube_r8 = bone6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(14, 70).mirror().addBox(-2.5355F, -0.5916F, -0.5793F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.1041F, -2.1023F, 0.0667F, 0.3313F, 0.1474F, 0.0228F));

		PartDefinition body3 = chest.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7122F, 0.9007F, -0.1222F, 0.0F, 0.0F));

		PartDefinition chest_r7 = body3.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(60, 83).addBox(-0.8F, -0.975F, 3.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(55, 83).addBox(-0.8F, -0.975F, 1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(62, 59).addBox(-0.5F, -0.575F, 1.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck9_r1 = body3.addOrReplaceChild("neck9_r1", CubeListBuilder.create().texOffs(9, 66).mirror().addBox(-3.8696F, -1.1537F, -0.3551F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0718F, 2.554F, 0.0796F, 0.7673F, -1.4678F));

		PartDefinition neck8_r1 = body3.addOrReplaceChild("neck8_r1", CubeListBuilder.create().texOffs(86, 36).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0718F, 2.554F, 0.505F, 0.6096F, -0.8144F));

		PartDefinition neck7_r2 = body3.addOrReplaceChild("neck7_r2", CubeListBuilder.create().texOffs(86, 33).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0718F, 2.554F, 0.721F, 0.3494F, -0.3566F));

		PartDefinition neck7_r3 = body3.addOrReplaceChild("neck7_r3", CubeListBuilder.create().texOffs(30, 84).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1282F, 0.654F, 0.4763F, 0.584F, -0.8305F));

		PartDefinition neck6_r3 = body3.addOrReplaceChild("neck6_r3", CubeListBuilder.create().texOffs(25, 84).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1282F, 0.654F, 0.6863F, 0.337F, -0.3683F));

		PartDefinition neck8_r2 = body3.addOrReplaceChild("neck8_r2", CubeListBuilder.create().texOffs(59, 9).mirror().addBox(-3.8696F, -1.1537F, -0.3551F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1282F, 0.654F, 0.0748F, 0.7326F, -1.4711F));

		PartDefinition neck6_r4 = body3.addOrReplaceChild("neck6_r4", CubeListBuilder.create().texOffs(86, 33).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.0718F, 2.554F, 0.721F, -0.3494F, 0.3566F));

		PartDefinition neck7_r4 = body3.addOrReplaceChild("neck7_r4", CubeListBuilder.create().texOffs(86, 36).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.0718F, 2.554F, 0.505F, -0.6096F, 0.8144F));

		PartDefinition neck8_r3 = body3.addOrReplaceChild("neck8_r3", CubeListBuilder.create().texOffs(9, 66).addBox(0.8696F, -1.1537F, -0.3551F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.0718F, 2.554F, 0.0796F, -0.7673F, 1.4678F));

		PartDefinition neck7_r5 = body3.addOrReplaceChild("neck7_r5", CubeListBuilder.create().texOffs(59, 9).addBox(0.8696F, -1.1537F, -0.3551F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1282F, 0.654F, 0.0748F, -0.7326F, 1.4711F));

		PartDefinition neck5_r3 = body3.addOrReplaceChild("neck5_r3", CubeListBuilder.create().texOffs(25, 84).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1282F, 0.654F, 0.6863F, -0.337F, 0.3683F));

		PartDefinition neck6_r5 = body3.addOrReplaceChild("neck6_r5", CubeListBuilder.create().texOffs(30, 84).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1282F, 0.654F, 0.4763F, -0.584F, 0.8305F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2281F, 2.7956F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body4_r1 = body2.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(65, 83).addBox(-0.8F, -1.3F, 1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(44, 59).addBox(-0.5F, -0.9F, 0.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck10_r1 = body2.addOrReplaceChild("neck10_r1", CubeListBuilder.create().texOffs(74, 23).mirror().addBox(-2.8696F, -1.1537F, -0.3551F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3563F, 1.4584F, 0.06F, 0.6109F, -1.4804F));

		PartDefinition neck9_r2 = body2.addOrReplaceChild("neck9_r2", CubeListBuilder.create().texOffs(84, 45).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3563F, 1.4584F, 0.3829F, 0.4918F, -0.8785F));

		PartDefinition neck8_r4 = body2.addOrReplaceChild("neck8_r4", CubeListBuilder.create().texOffs(35, 84).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3563F, 1.4584F, 0.5673F, 0.2908F, -0.4051F));

		PartDefinition neck7_r6 = body2.addOrReplaceChild("neck7_r6", CubeListBuilder.create().texOffs(35, 84).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.3563F, 1.4584F, 0.5673F, -0.2908F, 0.4051F));

		PartDefinition neck8_r5 = body2.addOrReplaceChild("neck8_r5", CubeListBuilder.create().texOffs(84, 45).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.3563F, 1.4584F, 0.3829F, -0.4918F, 0.8785F));

		PartDefinition neck9_r3 = body2.addOrReplaceChild("neck9_r3", CubeListBuilder.create().texOffs(74, 23).addBox(0.8696F, -1.1537F, -0.3551F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.3563F, 1.4584F, 0.06F, -0.6109F, 1.4804F));

		PartDefinition body4_r2 = body2.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(48, 0).addBox(-1.0F, -1.925F, -0.175F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.9929F, 0.4171F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, 3.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body4_r3 = body.addOrReplaceChild("body4_r3", CubeListBuilder.create().texOffs(83, 68).addBox(-0.8F, -1.3F, 4.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(83, 65).addBox(-0.8F, -1.3F, 2.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 55).addBox(-0.5F, -0.9F, 2.775F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck10_r2 = body.addOrReplaceChild("neck10_r2", CubeListBuilder.create().texOffs(15, 85).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1563F, 2.1584F, -0.1103F, -0.0203F, -0.2751F));

		PartDefinition neck11_r1 = body.addOrReplaceChild("neck11_r1", CubeListBuilder.create().texOffs(85, 3).mirror().addBox(-1.8696F, -1.1537F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1563F, 0.0584F, 0.0889F, 0.828F, -1.4612F));

		PartDefinition neck9_r4 = body.addOrReplaceChild("neck9_r4", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1563F, 0.0584F, 0.7824F, 0.3701F, -0.335F));

		PartDefinition neck10_r3 = body.addOrReplaceChild("neck10_r3", CubeListBuilder.create().texOffs(84, 48).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1563F, 0.0584F, 0.5578F, 0.6534F, -0.7832F));

		PartDefinition neck9_r5 = body.addOrReplaceChild("neck9_r5", CubeListBuilder.create().texOffs(15, 85).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1563F, 2.1584F, -0.1103F, 0.0203F, 0.2751F));

		PartDefinition neck9_r6 = body.addOrReplaceChild("neck9_r6", CubeListBuilder.create().texOffs(84, 48).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1563F, 0.0584F, 0.5578F, -0.6534F, 0.7832F));

		PartDefinition neck8_r6 = body.addOrReplaceChild("neck8_r6", CubeListBuilder.create().texOffs(85, 0).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1563F, 0.0584F, 0.7824F, -0.3701F, 0.335F));

		PartDefinition neck10_r4 = body.addOrReplaceChild("neck10_r4", CubeListBuilder.create().texOffs(85, 3).addBox(0.8696F, -1.1537F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1563F, 0.0584F, 0.0889F, -0.828F, 1.4612F));

		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3033F, 3.0022F, -0.0312F, 0.0F, 0.0F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(83, 71).addBox(-0.8F, -0.7303F, -0.7889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(70, 83).addBox(-0.8F, -0.7303F, -2.7889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(9, 61).addBox(-0.5F, -0.3303F, -2.7889F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1918F, 3.225F, -0.0785F, 0.0F, 0.0F));

		PartDefinition neck12_r1 = body1.addOrReplaceChild("neck12_r1", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.153F, 2.8562F, -0.1033F, -0.0437F, -0.1867F));

		PartDefinition neck11_r2 = body1.addOrReplaceChild("neck11_r2", CubeListBuilder.create().texOffs(85, 83).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.053F, 0.8562F, -0.1033F, -0.0437F, -0.274F));

		PartDefinition neck11_r3 = body1.addOrReplaceChild("neck11_r3", CubeListBuilder.create().texOffs(0, 86).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.153F, 2.8562F, -0.1033F, 0.0437F, 0.1867F));

		PartDefinition neck10_r5 = body1.addOrReplaceChild("neck10_r5", CubeListBuilder.create().texOffs(85, 83).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.053F, 0.8562F, -0.1033F, 0.0437F, 0.274F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(43, 68).addBox(-0.5F, -0.625F, 0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F))
				.texOffs(75, 83).addBox(-0.8F, -0.825F, 1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5779F, 2.8993F, 0.4269F, 0.0F, 0.0F));

		PartDefinition tail3_r1 = tail1.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(80, 83).addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.275F, 0.95F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0079F, 1.8316F, 0.4405F, -0.0773F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(46, 44).addBox(-0.5F, -0.575F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0314F, 10.6992F, 0.1217F, -0.0085F, 0.067F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(46, 34).addBox(-0.5F, -0.56F, -0.1002F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0075F, 7.6999F, 0.0519F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(23, 25).addBox(-0.5F, -0.5611F, -0.2001F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0121F, 7.7995F, 0.0604F, 0.0F, 0.0F));

		PartDefinition leftLeg = body1.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4974F, 0.1465F, 1.3299F, 0.3094F, -0.0609F, -0.4618F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(78, 67).addBox(-0.5F, -0.171F, -0.7295F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1987F)), PartPose.offsetAndRotation(0.1F, 1.5128F, 0.4938F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(90, 87).addBox(-0.5F, 1.5541F, -1.0672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(90, 84).addBox(-0.5F, 1.2541F, -1.0672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 1.5128F, 0.4938F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(10, 78).addBox(-0.5F, -2.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 2.0F, 0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(23, 64).addBox(-0.4F, -0.2F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0063F, 4.2779F, 0.12F, 0.9906F, -0.0875F, 0.0975F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(15, 49).addBox(-1.0F, -0.6F, -3.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1238F, 6.3451F, 0.7863F, -0.404F, 0.136F, 0.069F));

		PartDefinition finger = leftLeg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7243F, -0.1695F, 0.0302F, 0.0643F, -0.2724F, -0.0431F));

		PartDefinition cube_r12 = finger.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(91, 42).addBox(0.0411F, -0.5F, -2.3422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(91, 39).addBox(0.0411F, -0.5F, -1.9422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8142F, 0.0542F, -1.3309F, 0.0F, 1.0559F, 0.0F));

		PartDefinition cube_r13 = finger.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(14, 74).addBox(-0.4983F, -0.5F, -2.9238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(28, 73).addBox(-0.4983F, -0.5F, -1.5238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2142F, 0.0542F, -0.3309F, 0.0F, 0.6021F, 0.0F));

		PartDefinition cube_r14 = finger.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(86, 15).addBox(-0.3039F, -0.5F, -1.7478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0858F, 0.0542F, 1.0691F, 0.0F, 0.3491F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(43, 64).addBox(-1.0F, -0.0101F, -1.9001F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5883F, -3.9649F, 0.0007F, 0.0F, 0.0F));

		PartDefinition rightLeg = body1.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4974F, 0.1465F, 1.3299F, -0.0592F, 0.1255F, 0.2525F));

		PartDefinition cube_r15 = rightLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(78, 71).addBox(-0.5F, -0.171F, -0.7295F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1987F)), PartPose.offsetAndRotation(-0.1F, 1.5128F, 0.4938F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r16 = rightLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(10, 91).addBox(-0.5F, 1.5541F, -1.0672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(90, 90).addBox(-0.5F, 1.2541F, -1.0672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 1.5128F, 0.4938F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r17 = rightLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(15, 78).addBox(-0.5F, -2.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 2.0F, 0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(28, 64).addBox(-0.6F, -0.2F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0063F, 4.2779F, 0.12F, 0.7288F, 0.0875F, -0.0975F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(28, 49).addBox(-1.0F, -0.6F, -3.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1238F, 6.3451F, 0.7863F, 0.2505F, -0.136F, -0.069F));

		PartDefinition finger2 = rightLeg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7243F, -0.1695F, 0.0302F, 0.0643F, 0.2724F, 0.0431F));

		PartDefinition cube_r18 = finger2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(91, 54).addBox(-1.0411F, -0.5F, -2.3422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(91, 51).addBox(-1.0411F, -0.5F, -1.9422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8142F, 0.0542F, -1.3309F, 0.0F, -1.0559F, 0.0F));

		PartDefinition cube_r19 = finger2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(74, 16).addBox(-0.5017F, -0.5F, -2.9238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(35, 73).addBox(-0.5017F, -0.5F, -1.5238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2142F, 0.0542F, -0.3309F, 0.0F, -0.6021F, 0.0F));

		PartDefinition cube_r20 = finger2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(86, 24).addBox(-0.6961F, -0.5F, -1.7478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0858F, 0.0542F, 1.0691F, 0.0F, -0.3491F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(52, 64).addBox(-1.0F, -0.0101F, -1.9001F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5883F, -3.9649F, 0.0007F, 0.0F, 0.0F));

		PartDefinition bone = body1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0844F, 0.7509F, 1.3512F, 0.3505F, 0.0791F, 0.037F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(20, 90).addBox(-0.338F, -0.7503F, -0.916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.1171F, -0.3523F, -0.1921F, -0.498F, -0.1974F, 0.0934F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(90, 81).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4082F, 0.0728F, 1.9575F, -0.255F, -0.1866F, 0.1137F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(26, 59).addBox(-0.2243F, -0.3379F, -2.7949F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1171F, -0.9523F, -0.4921F, -0.6027F, -0.1974F, 0.0934F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(21, 73).addBox(-0.3332F, -1.1141F, -0.2643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.1171F, -0.0523F, -0.3921F, -0.4119F, -0.1886F, 0.1104F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(81, 56).addBox(-0.5F, -0.5672F, -0.2326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.2731F, -0.1463F, 1.3792F, -0.3604F, -0.1878F, 0.1023F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(7, 73).addBox(-1.0752F, -0.2416F, -1.7702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.2066F, 1.8699F, 1.2524F, -1.446F, -0.2106F, 0.0573F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(91, 21).addBox(-0.675F, -1.225F, 1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2066F, 1.0699F, -0.4476F, -0.6606F, -0.2106F, 0.0573F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(74, 12).addBox(-0.9554F, -0.797F, -1.7613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2066F, 1.9699F, 0.6524F, -0.7478F, -0.2106F, 0.0573F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(81, 53).addBox(-0.5F, -0.5486F, -0.6737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2731F, -0.1463F, 1.3792F, 0.0323F, -0.1878F, 0.1023F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(91, 12).addBox(-0.5F, -1.625F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2933F, 2.1687F, 0.7752F, -0.0061F, -0.2106F, 0.0573F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(81, 21).addBox(-1.3837F, -0.2214F, -1.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(20, 81).addBox(-1.2837F, -0.2214F, -1.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(81, 18).addBox(-0.8837F, -0.2214F, -1.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2221F, 0.9845F, -0.8402F, -0.1422F, -0.3025F, 0.0426F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(68, 0).addBox(-0.4482F, -0.704F, -1.189F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.2221F, 0.9845F, -1.7402F, -0.2791F, -0.0237F, 1.7685F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(67, 54).addBox(-0.4482F, -0.704F, -1.289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(-0.2221F, 0.9845F, -1.7402F, -0.2898F, 0.2697F, 1.6825F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(67, 28).addBox(-0.4482F, -0.704F, -1.389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(-0.2221F, 0.9845F, -1.7402F, -0.2883F, -0.25F, 1.8349F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(71, 68).addBox(-0.3916F, -0.5712F, -1.5144F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2221F, 0.9845F, -0.8402F, 0.1435F, -0.104F, 0.1322F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3551F, -0.2106F, 0.0573F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(81, 27).addBox(-0.5F, -0.875F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.3965F, 2.051F, 1.2886F, -1.2278F, -0.2106F, 0.0573F));

		PartDefinition bone5 = body1.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0844F, 0.7509F, 1.3512F, 0.3505F, -0.0791F, -0.037F));

		PartDefinition cube_r38 = bone5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(-0.662F, -0.7503F, -0.916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.1171F, -0.3523F, -0.1921F, -0.498F, 0.1974F, -0.0934F));

		PartDefinition cube_r39 = bone5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(90, 81).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4082F, 0.0728F, 1.9575F, -0.255F, 0.1866F, -0.1137F));

		PartDefinition cube_r40 = bone5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(26, 59).mirror().addBox(-0.7757F, -0.3379F, -2.7949F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1171F, -0.9523F, -0.4921F, -0.6027F, 0.1974F, -0.0934F));

		PartDefinition cube_r41 = bone5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(21, 73).mirror().addBox(-0.6668F, -1.1141F, -0.2643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.1171F, -0.0523F, -0.3921F, -0.4119F, 0.1886F, -0.1104F));

		PartDefinition cube_r42 = bone5.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(81, 56).mirror().addBox(-0.5F, -0.5672F, -0.2326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.2731F, -0.1463F, 1.3792F, -0.3604F, 0.1878F, -0.1023F));

		PartDefinition cube_r43 = bone5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(0.0752F, -0.2416F, -1.7702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.2066F, 1.8699F, 1.2524F, -1.446F, 0.2106F, -0.0573F));

		PartDefinition cube_r44 = bone5.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(91, 21).mirror().addBox(-0.325F, -1.225F, 1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2066F, 1.0699F, -0.4476F, -0.6606F, 0.2106F, -0.0573F));

		PartDefinition cube_r45 = bone5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(74, 12).mirror().addBox(-0.0446F, -0.797F, -1.7613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2066F, 1.9699F, 0.6524F, -0.7478F, 0.2106F, -0.0573F));

		PartDefinition cube_r46 = bone5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(81, 53).mirror().addBox(-0.5F, -0.5486F, -0.6737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2731F, -0.1463F, 1.3792F, 0.0323F, 0.1878F, -0.1023F));

		PartDefinition cube_r47 = bone5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(91, 12).mirror().addBox(-0.5F, -1.625F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2933F, 2.1687F, 0.7752F, -0.0061F, 0.2106F, -0.0573F));

		PartDefinition cube_r48 = bone5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(81, 21).mirror().addBox(0.3837F, -0.2214F, -1.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(20, 81).mirror().addBox(0.2837F, -0.2214F, -1.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(81, 18).mirror().addBox(-0.1163F, -0.2214F, -1.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 0.9845F, -0.8402F, -0.1422F, 0.3025F, -0.0426F));

		PartDefinition cube_r49 = bone5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-0.5518F, -0.704F, -1.189F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 0.9845F, -1.7402F, -0.2791F, 0.0237F, -1.7685F));

		PartDefinition cube_r50 = bone5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(67, 54).mirror().addBox(-0.5518F, -0.704F, -1.289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 0.9845F, -1.7402F, -0.2898F, -0.2697F, -1.6825F));

		PartDefinition cube_r51 = bone5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(67, 28).mirror().addBox(-0.5518F, -0.704F, -1.389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 0.9845F, -1.7402F, -0.2883F, 0.25F, -1.8349F));

		PartDefinition cube_r52 = bone5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(71, 68).mirror().addBox(-0.6084F, -0.5712F, -1.5144F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 0.9845F, -0.8402F, 0.1435F, 0.104F, -0.1322F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3551F, 0.2106F, -0.0573F));

		PartDefinition cube_r54 = bone5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(81, 27).mirror().addBox(-0.5F, -0.875F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.3965F, 2.051F, 1.2886F, -1.2278F, 0.2106F, -0.0573F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -1.2F, -0.111F, 0.0F, 0.0F));

		PartDefinition cube_r55 = neck1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(45, 83).addBox(-0.8F, -1.025F, 2.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(40, 83).addBox(-0.8F, -1.175F, 0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 59).addBox(-0.5F, -0.475F, 0.375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4684F, -3.1978F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck7_r7 = neck1.addOrReplaceChild("neck7_r7", CubeListBuilder.create().texOffs(86, 39).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.591F, -2.4703F, 0.7254F, 1.0591F, -0.8438F));

		PartDefinition neck6_r6 = neck1.addOrReplaceChild("neck6_r6", CubeListBuilder.create().texOffs(10, 85).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.091F, -0.4703F, 0.8358F, 0.3868F, -0.3153F));

		PartDefinition neck7_r8 = neck1.addOrReplaceChild("neck7_r8", CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.091F, -0.4703F, 0.6059F, 0.6898F, -0.7533F));

		PartDefinition neck8_r7 = neck1.addOrReplaceChild("neck8_r7", CubeListBuilder.create().texOffs(85, 6).mirror().addBox(-1.8696F, -1.1537F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.091F, -0.4703F, 0.0979F, 0.8801F, -1.4544F));

		PartDefinition neck6_r7 = neck1.addOrReplaceChild("neck6_r7", CubeListBuilder.create().texOffs(86, 39).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.325F, 0.591F, -2.4703F, 0.7254F, -1.0591F, 0.8438F));

		PartDefinition neck7_r9 = neck1.addOrReplaceChild("neck7_r9", CubeListBuilder.create().texOffs(85, 6).addBox(0.8696F, -1.1537F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.091F, -0.4703F, 0.0979F, -0.8801F, 1.4544F));

		PartDefinition neck6_r8 = neck1.addOrReplaceChild("neck6_r8", CubeListBuilder.create().texOffs(85, 9).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.091F, -0.4703F, 0.6059F, -0.6898F, 0.7533F));

		PartDefinition neck5_r4 = neck1.addOrReplaceChild("neck5_r4", CubeListBuilder.create().texOffs(10, 85).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.091F, -0.4703F, 0.8358F, -0.3868F, 0.3153F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(57, 68).addBox(-0.5F, -0.4536F, -1.8481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 83).addBox(-0.8F, -1.0537F, -1.8481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.372F, -2.5937F, -0.1152F, 0.0F, 0.0F));

		PartDefinition neck8_r8 = neck2.addOrReplaceChild("neck8_r8", CubeListBuilder.create().texOffs(40, 86).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.3191F, -1.6766F, 0.7801F, 1.0293F, -0.7804F));

		PartDefinition neck7_r10 = neck2.addOrReplaceChild("neck7_r10", CubeListBuilder.create().texOffs(40, 86).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.325F, 0.3191F, -1.6766F, 0.7801F, -1.0293F, 0.7804F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(53, 59).addBox(-0.5F, -0.511F, -2.809F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(82, 75).addBox(-0.8F, -1.111F, -1.809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0595F, -1.7151F, -0.0249F, 0.1001F, 0.4776F));

		PartDefinition neck9_r7 = neck3.addOrReplaceChild("neck9_r7", CubeListBuilder.create().texOffs(86, 42).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.2596F, -1.5614F, 0.5943F, 1.1127F, -0.9918F));

		PartDefinition neck8_r9 = neck3.addOrReplaceChild("neck8_r9", CubeListBuilder.create().texOffs(86, 42).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.325F, 0.2596F, -1.5614F, 0.5943F, -1.1127F, 0.9918F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(64, 68).addBox(-0.5F, -0.6007F, -1.8472F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(82, 62).addBox(-0.8F, -1.1007F, -0.8472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0996F, -2.6108F, -0.1588F, 0.0F, 0.0F));

		PartDefinition neck10_r6 = neck4.addOrReplaceChild("neck10_r6", CubeListBuilder.create().texOffs(45, 86).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.16F, -0.6506F, 0.7658F, 1.2655F, -0.8449F));

		PartDefinition neck9_r8 = neck4.addOrReplaceChild("neck9_r8", CubeListBuilder.create().texOffs(45, 86).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.325F, 0.16F, -0.6506F, 0.7658F, -1.2655F, 0.8449F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(7, 69).addBox(-0.5F, -0.354F, -1.9023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 82).addBox(-0.8F, -1.054F, -0.9023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2745F, -1.5681F, 0.4084F, 0.0F, 0.0F));

		PartDefinition neck11_r4 = neck5.addOrReplaceChild("neck11_r4", CubeListBuilder.create().texOffs(50, 86).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.4345F, -0.6826F, 0.7659F, 1.1404F, -0.8222F));

		PartDefinition neck10_r7 = neck5.addOrReplaceChild("neck10_r7", CubeListBuilder.create().texOffs(50, 86).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.325F, 0.4345F, -0.6826F, 0.7659F, -1.1404F, 0.8222F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3012F, -1.3467F, -0.4383F, 0.3012F, 0.0517F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(10, 82).addBox(-2.0F, -0.1951F, -0.4805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(1.5F, 3.7951F, -9.4138F, -1.0865F, 0.0F, 0.0F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(81, 80).addBox(-2.0F, -0.3951F, -0.4055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.5F, 3.7951F, -9.4138F, -1.3919F, 0.0F, 0.0F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(81, 59).addBox(-2.0F, -0.3951F, -0.5055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(1.5F, 3.7951F, -9.4138F, -0.9556F, 0.0F, 0.0F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(31, 77).addBox(-2.0F, -0.4951F, -0.7055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5F, 3.2778F, -8.2487F, -0.9556F, 0.0F, 0.0F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(72, 76).addBox(-2.0F, 1.8549F, -1.1555F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 77).addBox(-2.0F, 0.0049F, -1.0055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.6898F, -4.8788F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(5, 77).addBox(-2.0F, 0.0049F, -0.0055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.3037F, -3.8659F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(65, 42).addBox(-1.0F, 0.6049F, -0.0055F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(65, 38).addBox(-1.0F, 0.0049F, -0.0055F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1634F, -2.5165F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(65, 34).addBox(-1.0F, 0.5049F, -0.0305F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(61, 64).addBox(-1.0F, 0.0049F, -0.0305F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7627F, -1.1411F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(74, 35).addBox(-1.0F, -0.0201F, -0.0305F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.89F, -0.1745F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(74, 32).addBox(-1.0F, 0.0129F, -0.9733F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.09F, 0.3255F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(74, 29).addBox(-1.0F, 0.0F, -0.925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.09F, 0.2755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(74, 38).addBox(-1.0F, -1.0F, -0.875F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6048F, -2.1836F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0F, -2.4F, -1.275F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.1008F, -0.9402F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(74, 26).addBox(-1.0F, 0.025F, -0.975F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1352F, 0.0715F, -0.384F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.1553F, 4.3906F, -9.2811F));

		PartDefinition cube_r70 = leftFace.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(15, 88).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.5197F, -3.908F, 8.4062F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftFace.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 89).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5197F, -4.9499F, 8.0863F, 2.8623F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftFace.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(40, 89).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.5197F, -4.277F, 7.8934F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftFace.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(88, 63).addBox(-0.5F, -0.15F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(88, 66).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.5197F, -4.0277F, 8.8865F, -1.9809F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(88, 69).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.5197F, -5.3156F, 8.6832F, -2.5918F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(71, 80).addBox(0.925F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 80).addBox(1.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0303F, -4.286F, 6.9992F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(87, 74).addBox(1.0F, -0.0951F, -0.1055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0303F, -4.6544F, 7.7965F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(87, 60).addBox(1.0F, -0.8951F, -0.1055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.0303F, -5.3431F, 6.8989F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(35, 87).addBox(1.0F, -0.0951F, 0.1445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.0303F, -5.554F, 6.7646F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(66, 80).addBox(1.0F, -0.6F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(81, 33).addBox(1.0F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.0303F, -3.9467F, 6.2777F, -1.85F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(81, 30).addBox(1.0F, -0.925F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.0303F, -3.6144F, 6.4175F, -2.7663F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(30, 81).addBox(1.0F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0303F, -3.6708F, 6.6947F, -2.1555F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(10, 88).addBox(1.0F, -0.0951F, -0.1055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.0303F, -3.8552F, 7.7616F, -1.9809F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(50, 89).addBox(-0.7928F, -0.9137F, -0.4478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9185F, -3.7614F, 6.147F, 3.0366F, 0.1265F, 0.0174F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(89, 48).addBox(-0.7928F, -0.8444F, 0.0805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.9185F, -3.7614F, 6.147F, -3.0284F, 0.1265F, 0.0174F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(89, 45).addBox(-0.7928F, -0.6988F, 0.5843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9185F, -3.7614F, 6.147F, -2.8538F, 0.1265F, 0.0174F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(45, 89).addBox(-0.7928F, 0.0573F, 0.8136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(91, 30).addBox(-0.7428F, 0.1073F, 1.1136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9185F, -3.7614F, 6.147F, -2.243F, 0.1265F, 0.0174F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(91, 33).addBox(-0.7428F, -0.6315F, 1.2232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.9185F, -3.7614F, 6.147F, -2.6357F, 0.1265F, 0.0174F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(57, 72).addBox(-0.7928F, -0.9537F, -0.2191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.9185F, -3.7614F, 6.147F, -2.8975F, 0.1265F, 0.0174F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(55, 89).addBox(-0.7428F, 0.2202F, 2.968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(64, 72).addBox(-0.7428F, 0.2202F, 1.568F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9185F, -3.7614F, 6.147F, -2.5484F, 0.1265F, 0.0174F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(42, 76).addBox(-1.0678F, 0.0699F, -0.9636F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(76, 59).addBox(-1.0678F, 2.0699F, -0.9636F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9185F, -3.7614F, 6.147F, -1.0125F, 0.1265F, 0.0174F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(26, 77).addBox(-1.0678F, -0.0398F, 0.0643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9185F, -3.7614F, 6.147F, -1.318F, 0.1265F, 0.0174F));

		PartDefinition head_r1 = leftFace.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(62, 76).addBox(-1.1202F, 0.1087F, -0.5212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9185F, -3.7614F, 6.147F, -0.3462F, 0.2543F, -0.3073F));

		PartDefinition head_r2 = leftFace.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(75, 0).addBox(-1.0944F, 0.3834F, -1.2212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9185F, -3.7614F, 6.147F, -0.3566F, 0.2392F, -0.3496F));

		PartDefinition head_r3 = leftFace.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(75, 8).addBox(-1.4567F, 0.7349F, -2.2722F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9185F, -3.7614F, 6.147F, -0.3908F, 0.1754F, -0.5156F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(67, 76).addBox(-1.0678F, 1.9568F, -0.1405F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9185F, -3.7614F, 6.147F, -1.2132F, 0.1265F, 0.0174F));

		PartDefinition head_r4 = leftFace.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(75, 4).addBox(-1.5422F, 1.1021F, -3.0471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9185F, -3.7614F, 6.147F, -0.3036F, 0.1754F, -0.5156F));

		PartDefinition head_r5 = leftFace.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(74, 47).addBox(-0.8631F, -0.054F, -1.4794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3622F, -1.9397F, 3.2874F, -0.3101F, 0.1868F, -0.5168F));

		PartDefinition head_r6 = leftFace.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(0, 80).addBox(-1.0594F, -0.6389F, -0.9534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 50).addBox(-1.0594F, -0.2389F, -0.9534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 76).addBox(-0.9612F, -1.1498F, -0.5025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5443F, -0.8425F, 1.2562F, -0.441F, 0.1868F, -0.5168F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(68, 8).addBox(-0.7F, -0.4565F, -1.2411F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1697F, -1.009F, 1.112F, -2.6442F, 0.1047F, 0.0F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(36, 77).addBox(-0.8F, -0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2947F, -1.9226F, 2.6371F, -1.133F, 0.0791F, 0.037F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(86, 12).addBox(-0.7F, -0.432F, 0.1447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.1697F, -1.009F, 1.112F, -2.5875F, 0.1047F, 0.0F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(5, 90).addBox(-0.7F, 0.5949F, -0.2077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(25, 90).addBox(-0.7F, 0.3949F, -0.2077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1697F, -1.009F, 1.112F, -1.453F, 0.1047F, 0.0F));

		PartDefinition head_r7 = leftFace.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(41, 80).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 9).addBox(-0.5F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 6).addBox(-0.5F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.163F, -0.339F, 0.1362F, -0.3295F, 0.2277F, -0.3991F));

		PartDefinition head_r8 = leftFace.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(79, 47).addBox(-0.5F, 0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 51).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2229F, 0.1868F, -0.5168F));

		PartDefinition bone3 = leftFace.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1142F, -1.5543F, 2.2891F, -0.0436F, 0.0F, 0.0F));

		PartDefinition head_r9 = bone3.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(80, 0).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.28F))
				.texOffs(80, 3).addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.28F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3088F, 0.2761F, -0.2073F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.1553F, 4.3906F, -9.2811F));

		PartDefinition cube_r97 = rightFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.5197F, -3.908F, 8.4062F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5197F, -4.9499F, 8.0863F, 2.8623F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(40, 89).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.5197F, -4.277F, 7.8934F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(88, 63).mirror().addBox(-0.5F, -0.15F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(88, 66).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.5197F, -4.0277F, 8.8865F, -1.9809F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(88, 69).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.5197F, -5.3156F, 8.6832F, -2.5918F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(71, 80).mirror().addBox(-1.925F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 80).mirror().addBox(-2.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0303F, -4.286F, 6.9992F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(87, 74).mirror().addBox(-2.0F, -0.0951F, -0.1055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0303F, -4.6544F, 7.7965F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(87, 60).mirror().addBox(-2.0F, -0.8951F, -0.1055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.0303F, -5.3431F, 6.8989F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(35, 87).mirror().addBox(-2.0F, -0.0951F, 0.1445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(1.0303F, -5.554F, 6.7646F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(66, 80).mirror().addBox(-2.0F, -0.6F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(81, 33).mirror().addBox(-2.0F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.0303F, -3.9467F, 6.2777F, -1.85F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(81, 30).mirror().addBox(-2.0F, -0.925F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(1.0303F, -3.6144F, 6.4175F, -2.7663F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(30, 81).mirror().addBox(-2.0F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0303F, -3.6708F, 6.6947F, -2.1555F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-2.0F, -0.0951F, -0.1055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.0303F, -3.8552F, 7.7616F, -1.9809F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(50, 89).mirror().addBox(-0.2072F, -0.9137F, -0.4478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9185F, -3.7614F, 6.147F, 3.0366F, -0.1265F, -0.0174F));

		PartDefinition cube_r111 = rightFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(89, 48).mirror().addBox(-0.2072F, -0.8444F, 0.0805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.9185F, -3.7614F, 6.147F, -3.0284F, -0.1265F, -0.0174F));

		PartDefinition cube_r112 = rightFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(89, 45).mirror().addBox(-0.2072F, -0.6988F, 0.5843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9185F, -3.7614F, 6.147F, -2.8538F, -0.1265F, -0.0174F));

		PartDefinition cube_r113 = rightFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(45, 89).mirror().addBox(-0.2072F, 0.0573F, 0.8136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(91, 30).mirror().addBox(-0.2572F, 0.1073F, 1.1136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9185F, -3.7614F, 6.147F, -2.243F, -0.1265F, -0.0174F));

		PartDefinition cube_r114 = rightFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(91, 33).mirror().addBox(-0.2572F, -0.6315F, 1.2232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.9185F, -3.7614F, 6.147F, -2.6357F, -0.1265F, -0.0174F));

		PartDefinition cube_r115 = rightFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(57, 72).mirror().addBox(-0.2072F, -0.9537F, -0.2191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.9185F, -3.7614F, 6.147F, -2.8975F, -0.1265F, -0.0174F));

		PartDefinition cube_r116 = rightFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(55, 89).mirror().addBox(-0.2572F, 0.2202F, 2.968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(64, 72).mirror().addBox(-0.2572F, 0.2202F, 1.568F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9185F, -3.7614F, 6.147F, -2.5484F, -0.1265F, -0.0174F));

		PartDefinition cube_r117 = rightFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(42, 76).mirror().addBox(0.0678F, 0.0699F, -0.9636F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(76, 59).mirror().addBox(0.0678F, 2.0699F, -0.9636F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9185F, -3.7614F, 6.147F, -1.0125F, -0.1265F, -0.0174F));

		PartDefinition cube_r118 = rightFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(26, 77).mirror().addBox(0.0678F, -0.0398F, 0.0643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9185F, -3.7614F, 6.147F, -1.318F, -0.1265F, -0.0174F));

		PartDefinition head_r10 = rightFace.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(62, 76).mirror().addBox(0.1202F, 0.1087F, -0.5212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9185F, -3.7614F, 6.147F, -0.3462F, -0.2543F, 0.3073F));

		PartDefinition head_r11 = rightFace.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(0.0944F, 0.3834F, -1.2212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9185F, -3.7614F, 6.147F, -0.3566F, -0.2392F, 0.3496F));

		PartDefinition head_r12 = rightFace.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(75, 8).mirror().addBox(0.4567F, 0.7349F, -2.2722F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9185F, -3.7614F, 6.147F, -0.3908F, -0.1754F, 0.5156F));

		PartDefinition cube_r119 = rightFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(67, 76).mirror().addBox(0.0678F, 1.9568F, -0.1405F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9185F, -3.7614F, 6.147F, -1.2132F, -0.1265F, -0.0174F));

		PartDefinition head_r13 = rightFace.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(75, 4).mirror().addBox(0.5422F, 1.1021F, -3.0471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9185F, -3.7614F, 6.147F, -0.3036F, -0.1754F, 0.5156F));

		PartDefinition head_r14 = rightFace.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(-0.1369F, -0.054F, -1.4794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3622F, -1.9397F, 3.2874F, -0.3101F, -0.1868F, 0.5168F));

		PartDefinition head_r15 = rightFace.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(0.0594F, -0.6389F, -0.9534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 50).mirror().addBox(0.0594F, -0.2389F, -0.9534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 76).mirror().addBox(-0.0388F, -1.1498F, -0.5025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5443F, -0.8425F, 1.2562F, -0.441F, -0.1868F, 0.5168F));

		PartDefinition cube_r120 = rightFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(-0.3F, -0.4565F, -1.2411F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1697F, -1.009F, 1.112F, -2.6442F, -0.1047F, 0.0F));

		PartDefinition cube_r121 = rightFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(36, 77).mirror().addBox(-0.2F, -0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2947F, -1.9226F, 2.6371F, -1.133F, -0.0791F, -0.037F));

		PartDefinition cube_r122 = rightFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(86, 12).mirror().addBox(-0.3F, -0.432F, 0.1447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.1697F, -1.009F, 1.112F, -2.5875F, -0.1047F, 0.0F));

		PartDefinition cube_r123 = rightFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(-0.3F, 0.5949F, -0.2077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(25, 90).mirror().addBox(-0.3F, 0.3949F, -0.2077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1697F, -1.009F, 1.112F, -1.453F, -0.1047F, 0.0F));

		PartDefinition head_r16 = rightFace.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(41, 80).mirror().addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(80, 9).mirror().addBox(-0.5F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(80, 6).mirror().addBox(-0.5F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.163F, -0.339F, 0.1362F, -0.3295F, -0.2277F, 0.3991F));

		PartDefinition head_r17 = rightFace.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(79, 47).mirror().addBox(-0.5F, 0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(74, 51).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2229F, -0.1868F, 0.5168F));

		PartDefinition bone4 = rightFace.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1142F, -1.5543F, 2.2891F, -0.0436F, 0.0F, 0.0F));

		PartDefinition head_r18 = bone4.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.28F)).mirror(false)
				.texOffs(80, 3).mirror().addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.28F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3088F, -0.2761F, 0.2073F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(50, 68).addBox(0.175F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(50, 68).mirror().addBox(-1.175F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7371F, -0.425F, 1.2039F, 0.0F, 0.0F));

		PartDefinition cube_r124 = jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(86, 57).mirror().addBox(-2.0F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 86).mirror().addBox(-2.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(86, 57).addBox(-0.65F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 86).addBox(-0.65F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.825F, -0.2822F, -1.5835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r125 = jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(86, 54).mirror().addBox(-2.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(86, 54).addBox(-0.65F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.825F, -0.2299F, -0.9858F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r126 = jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(86, 51).mirror().addBox(-2.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(86, 51).addBox(-0.65F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.825F, -0.1F, -0.4F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r127 = jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(15, 91).mirror().addBox(-0.85F, 0.5197F, -1.8427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(15, 91).addBox(-0.85F, 0.5197F, -1.8427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(90, 9).addBox(-0.85F, 0.442F, -2.1325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.35F, 1.47F, -6.9381F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(70, 86).mirror().addBox(0.075F, -0.9255F, -1.8177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.87F, -5.9881F, 0.8814F, -0.0175F, 0.0F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(75, 86).mirror().addBox(-0.109F, -0.2573F, -0.8392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4625F, 0.9242F, -6.6983F, 0.5934F, -0.1571F, 0.0F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(86, 78).mirror().addBox(-0.109F, -0.36F, -1.0149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.87F, -5.9881F, 0.2269F, -0.1571F, 0.0F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(43, 72).mirror().addBox(-0.5F, -0.45F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.2596F, 0.7614F, -5.4231F, 0.3142F, -0.1396F, 0.0F));

		PartDefinition cube_r132 = jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(65, 86).mirror().addBox(-0.2F, -1.0115F, -2.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.37F, -2.4881F, 0.3142F, -0.1396F, 0.0F));

		PartDefinition cube_r133 = jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(60, 86).mirror().addBox(-0.2F, -0.2282F, -0.2452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.6641F, 0.2801F, -4.7006F, 0.2277F, -0.1391F, -0.0122F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(67, 24).mirror().addBox(-0.2F, -0.1782F, -0.2452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.7448F, 0.0975F, -4.126F, 0.1745F, -0.1396F, 0.0F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(81, 12).mirror().addBox(0.075F, -0.2306F, -1.8709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.87F, -5.9881F, 0.5236F, -0.0175F, 0.0F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(67, 16).mirror().addBox(-0.109F, -0.144F, -1.4672F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.87F, -5.9881F, 0.4014F, -0.1571F, 0.0F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(67, 12).mirror().addBox(-0.2F, -0.6753F, -3.3828F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.37F, -2.4881F, 0.2793F, -0.1396F, 0.0F));

		PartDefinition head_r19 = jaw.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(76, 55).mirror().addBox(-0.5F, -1.2585F, -0.9198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1976F, 1.2766F, -7.9527F, 0.9762F, 0.1953F, -0.3518F));

		PartDefinition head_r20 = jaw.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(52, 76).mirror().addBox(-0.5F, -0.9007F, -0.0171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1976F, 1.2766F, -7.9527F, 0.6271F, 0.1953F, -0.3518F));

		PartDefinition head_r21 = jaw.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(57, 76).mirror().addBox(-0.3513F, -1.6585F, -1.5664F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4021F, 0.6664F, -5.731F, 0.5459F, 0.0096F, -0.4508F));

		PartDefinition head_r22 = jaw.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(47, 76).mirror().addBox(-0.3513F, -1.6714F, -0.7289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4021F, 0.6664F, -5.731F, 0.4586F, 0.0096F, -0.4508F));

		PartDefinition head_r23 = jaw.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(56, 80).mirror().addBox(-0.525F, -0.675F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(61, 80).mirror().addBox(-0.525F, -1.075F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.363F, 0.3126F, -4.8569F, 0.5028F, -0.0322F, -0.3986F));

		PartDefinition head_r24 = jaw.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(51, 80).mirror().addBox(-0.525F, -0.8F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(46, 80).mirror().addBox(-0.525F, -0.6F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5639F, -0.0093F, -3.8244F, 0.336F, -0.1074F, -0.2603F));

		PartDefinition head_r25 = jaw.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7158F, -0.1731F, -3.1606F, 0.2851F, -0.1207F, -0.2545F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(67, 20).mirror().addBox(-0.2F, -0.479F, -1.8258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.37F, -2.4881F, 0.1571F, -0.1396F, 0.0F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-2.0F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(0, 72).addBox(-0.65F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.825F, 0.5F, -0.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(81, 15).addBox(-0.15F, 0.3445F, -1.8503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.35F, 1.47F, -6.9381F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(81, 39).addBox(-0.15F, 0.0714F, -1.6437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.35F, 1.47F, -6.9381F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(25, 81).addBox(-0.15F, 1.2367F, -1.7752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F))
				.texOffs(81, 24).addBox(-0.15F, 1.2367F, -1.5752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.35F, 1.47F, -6.9381F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(35, 81).addBox(-0.15F, 0.9394F, -1.7328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(-0.35F, 1.47F, -6.9381F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r144 = jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(91, 27).addBox(-0.15F, -0.1091F, -2.1264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.35F, 1.47F, -6.9381F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r145 = jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(90, 6).addBox(-0.15F, -0.3657F, -1.8073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.35F, 1.47F, -6.9381F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(81, 36).mirror().addBox(0.075F, -0.4356F, -2.4656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.87F, -5.9881F, 0.576F, -0.0175F, 0.0F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(91, 24).mirror().addBox(0.075F, -0.0314F, -2.386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.87F, -5.9881F, 0.4014F, -0.0175F, 0.0F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(81, 36).addBox(-1.075F, -0.4356F, -2.4656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.575F, 0.87F, -5.9881F, 0.576F, 0.0175F, 0.0F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(70, 86).addBox(-1.075F, -0.9255F, -1.8177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.575F, 0.87F, -5.9881F, 0.8814F, 0.0175F, 0.0F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(75, 86).addBox(-0.891F, -0.2573F, -0.8392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4625F, 0.9242F, -6.6983F, 0.5934F, 0.1571F, 0.0F));

		PartDefinition cube_r151 = jaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(86, 78).addBox(-0.891F, -0.36F, -1.0149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.575F, 0.87F, -5.9881F, 0.2269F, 0.1571F, 0.0F));

		PartDefinition cube_r152 = jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(43, 72).addBox(-0.5F, -0.45F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2596F, 0.7614F, -5.4231F, 0.3142F, 0.1396F, 0.0F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(65, 86).addBox(-0.8F, -1.0115F, -2.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.975F, 0.37F, -2.4881F, 0.3142F, 0.1396F, 0.0F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(60, 86).addBox(-0.8F, -0.2282F, -0.2452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6641F, 0.2801F, -4.7006F, 0.2277F, 0.1391F, 0.0122F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(67, 24).addBox(-0.8F, -0.1782F, -0.2452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.7448F, 0.0975F, -4.126F, 0.1745F, 0.1396F, 0.0F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(91, 24).addBox(-1.075F, -0.0314F, -2.386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.575F, 0.87F, -5.9881F, 0.4014F, 0.0175F, 0.0F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(81, 12).addBox(-1.075F, -0.2306F, -1.8709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.575F, 0.87F, -5.9881F, 0.5236F, 0.0175F, 0.0F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(67, 16).addBox(-0.891F, -0.144F, -1.4672F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.575F, 0.87F, -5.9881F, 0.4014F, 0.1571F, 0.0F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(67, 12).addBox(-0.8F, -0.6753F, -3.3828F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.975F, 0.37F, -2.4881F, 0.2793F, 0.1396F, 0.0F));

		PartDefinition head_r26 = jaw.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(76, 55).addBox(-0.5F, -1.2585F, -0.9198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1976F, 1.2766F, -7.9527F, 0.9762F, -0.1953F, 0.3518F));

		PartDefinition head_r27 = jaw.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(52, 76).addBox(-0.5F, -0.9007F, -0.0171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1976F, 1.2766F, -7.9527F, 0.6271F, -0.1953F, 0.3518F));

		PartDefinition head_r28 = jaw.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(57, 76).addBox(-0.6487F, -1.6585F, -1.5664F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4021F, 0.6664F, -5.731F, 0.5459F, -0.0096F, 0.4508F));

		PartDefinition head_r29 = jaw.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(47, 76).addBox(-0.6487F, -1.6714F, -0.7289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4021F, 0.6664F, -5.731F, 0.4586F, -0.0096F, 0.4508F));

		PartDefinition head_r30 = jaw.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(56, 80).addBox(-0.475F, -0.675F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(61, 80).addBox(-0.475F, -1.075F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.363F, 0.3126F, -4.8569F, 0.5028F, 0.0322F, 0.3986F));

		PartDefinition head_r31 = jaw.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(51, 80).addBox(-0.475F, -0.8F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(46, 80).addBox(-0.475F, -0.6F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5639F, -0.0093F, -3.8244F, 0.336F, 0.1074F, 0.2603F));

		PartDefinition head_r32 = jaw.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(5, 81).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7158F, -0.1731F, -3.1606F, 0.2851F, 0.1207F, 0.2545F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(67, 20).addBox(-0.8F, -0.479F, -1.8258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.975F, 0.37F, -2.4881F, 0.1571F, 0.1396F, 0.0F));

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