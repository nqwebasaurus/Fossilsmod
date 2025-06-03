package fossils.fossils.client.blockentity.model.chungkingosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ChungkingosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart HipPlates;
	private final ModelPart LeftPlate11;
	private final ModelPart RightPlate11;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftFoot;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightFoot;
	private final ModelPart tail;
	private final ModelPart TailPlates;
	private final ModelPart leftPlate13;
	private final ModelPart rightPlate13;
	private final ModelPart tail2;
	private final ModelPart Tail2Plates;
	private final ModelPart leftPlate14;
	private final ModelPart rightPlate14;
	private final ModelPart leftPlate15;
	private final ModelPart rightPlate15;
	private final ModelPart tail3;
	private final ModelPart Tail3Plates;
	private final ModelPart leftPlate17;
	private final ModelPart rightPlate17;
	private final ModelPart leftPlate4;
	private final ModelPart rightPlate4;
	private final ModelPart tail4;
	private final ModelPart Tail4Spikes;
	private final ModelPart leftTailSpike1;
	private final ModelPart rightTailSpike1;
	private final ModelPart leftTailSpike4;
	private final ModelPart rightTailSpike4;
	private final ModelPart tail5;
	private final ModelPart Tail5Spikes;
	private final ModelPart leftTailSpike2;
	private final ModelPart rightTailSpike2;
	private final ModelPart leftTailSpike3;
	private final ModelPart rightTailSpike3;
	private final ModelPart body;
	private final ModelPart BodyPlates;
	private final ModelPart leftPlate8;
	private final ModelPart rightPlate8;
	private final ModelPart leftPlate10;
	private final ModelPart rightPlate10;
	private final ModelPart chest;
	private final ModelPart ChestPlates;
	private final ModelPart leftPlate5;
	private final ModelPart rightPlate5;
	private final ModelPart leftPlate6;
	private final ModelPart rightPlate6;
	private final ModelPart Leftlegspike;
	private final ModelPart Rightlegspike;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart bone;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart bone2;
	private final ModelPart neck;
	private final ModelPart NeckPlates;
	private final ModelPart leftPlate3;
	private final ModelPart rightPlate3;
	private final ModelPart neck2;
	private final ModelPart Neck2Plates;
	private final ModelPart leftPlate2;
	private final ModelPart rightPlate2;
	private final ModelPart neck3;
	private final ModelPart Neck3Plates;
	private final ModelPart leftPlate1;
	private final ModelPart rightPlate1;
	private final ModelPart head;
	private final ModelPart jaw;

	public ChungkingosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.HipPlates = this.hips.getChild("HipPlates");
		this.LeftPlate11 = this.HipPlates.getChild("LeftPlate11");
		this.RightPlate11 = this.HipPlates.getChild("RightPlate11");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftFoot = this.leftLeg2.getChild("leftFoot");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightFoot = this.rightLeg2.getChild("rightFoot");
		this.tail = this.hips.getChild("tail");
		this.TailPlates = this.tail.getChild("TailPlates");
		this.leftPlate13 = this.TailPlates.getChild("leftPlate13");
		this.rightPlate13 = this.TailPlates.getChild("rightPlate13");
		this.tail2 = this.tail.getChild("tail2");
		this.Tail2Plates = this.tail2.getChild("Tail2Plates");
		this.leftPlate14 = this.Tail2Plates.getChild("leftPlate14");
		this.rightPlate14 = this.Tail2Plates.getChild("rightPlate14");
		this.leftPlate15 = this.Tail2Plates.getChild("leftPlate15");
		this.rightPlate15 = this.Tail2Plates.getChild("rightPlate15");
		this.tail3 = this.tail2.getChild("tail3");
		this.Tail3Plates = this.tail3.getChild("Tail3Plates");
		this.leftPlate17 = this.Tail3Plates.getChild("leftPlate17");
		this.rightPlate17 = this.Tail3Plates.getChild("rightPlate17");
		this.leftPlate4 = this.Tail3Plates.getChild("leftPlate4");
		this.rightPlate4 = this.Tail3Plates.getChild("rightPlate4");
		this.tail4 = this.tail3.getChild("tail4");
		this.Tail4Spikes = this.tail4.getChild("Tail4Spikes");
		this.leftTailSpike1 = this.Tail4Spikes.getChild("leftTailSpike1");
		this.rightTailSpike1 = this.Tail4Spikes.getChild("rightTailSpike1");
		this.leftTailSpike4 = this.Tail4Spikes.getChild("leftTailSpike4");
		this.rightTailSpike4 = this.Tail4Spikes.getChild("rightTailSpike4");
		this.tail5 = this.tail4.getChild("tail5");
		this.Tail5Spikes = this.tail5.getChild("Tail5Spikes");
		this.leftTailSpike2 = this.Tail5Spikes.getChild("leftTailSpike2");
		this.rightTailSpike2 = this.Tail5Spikes.getChild("rightTailSpike2");
		this.leftTailSpike3 = this.Tail5Spikes.getChild("leftTailSpike3");
		this.rightTailSpike3 = this.Tail5Spikes.getChild("rightTailSpike3");
		this.body = this.hips.getChild("body");
		this.BodyPlates = this.body.getChild("BodyPlates");
		this.leftPlate8 = this.BodyPlates.getChild("leftPlate8");
		this.rightPlate8 = this.BodyPlates.getChild("rightPlate8");
		this.leftPlate10 = this.BodyPlates.getChild("leftPlate10");
		this.rightPlate10 = this.BodyPlates.getChild("rightPlate10");
		this.chest = this.body.getChild("chest");
		this.ChestPlates = this.chest.getChild("ChestPlates");
		this.leftPlate5 = this.ChestPlates.getChild("leftPlate5");
		this.rightPlate5 = this.ChestPlates.getChild("rightPlate5");
		this.leftPlate6 = this.ChestPlates.getChild("leftPlate6");
		this.rightPlate6 = this.ChestPlates.getChild("rightPlate6");
		this.Leftlegspike = this.ChestPlates.getChild("Leftlegspike");
		this.Rightlegspike = this.ChestPlates.getChild("Rightlegspike");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.bone = this.leftArm.getChild("bone");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.bone2 = this.rightArm.getChild("bone2");
		this.neck = this.chest.getChild("neck");
		this.NeckPlates = this.neck.getChild("NeckPlates");
		this.leftPlate3 = this.NeckPlates.getChild("leftPlate3");
		this.rightPlate3 = this.NeckPlates.getChild("rightPlate3");
		this.neck2 = this.neck.getChild("neck2");
		this.Neck2Plates = this.neck2.getChild("Neck2Plates");
		this.leftPlate2 = this.Neck2Plates.getChild("leftPlate2");
		this.rightPlate2 = this.Neck2Plates.getChild("rightPlate2");
		this.neck3 = this.neck2.getChild("neck3");
		this.Neck3Plates = this.neck3.getChild("Neck3Plates");
		this.leftPlate1 = this.Neck3Plates.getChild("leftPlate1");
		this.rightPlate1 = this.Neck3Plates.getChild("rightPlate1");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -21.0F, 0.7F, 1.0F, 21.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, 0.2F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(4.0F, -14.2F, -13.9F, 0.0F, -0.2705F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(5.5F, -5.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.0F, -14.2F, -13.9F, -0.2705F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(1.1F, -5.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -20.5F, 1.2F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -17.1F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -2.7F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(13, 17).addBox(-0.5F, 0.252F, -0.5887F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.45F, 3.5F, -0.2269F, 0.0F, 0.0F));

		PartDefinition HipPlates = hips.addOrReplaceChild("HipPlates", CubeListBuilder.create(), PartPose.offset(0.0F, 1.2F, 2.0F));

		PartDefinition LeftPlate11 = HipPlates.addOrReplaceChild("LeftPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -13.55F, 7.85F, -0.468F, 0.1468F, 0.162F));

		PartDefinition RightPlate11 = HipPlates.addOrReplaceChild("RightPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -13.55F, 7.85F, -0.468F, -0.1468F, -0.162F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.25F, -1.0F, 4.75F, -0.8184F, -0.5553F, 0.1766F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.13F, 8.6623F, 0.2128F, 1.0021F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg2.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 8.8139F, -0.615F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.25F, -1.0F, 4.75F, -0.6101F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.13F, 8.6623F, 0.2128F, 0.3912F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg2.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 8.8139F, -0.615F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(-2, 23).addBox(0.0F, -0.0512F, -0.4018F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.85F, 10.1F, -0.1378F, -0.3449F, 0.0941F));

		PartDefinition TailPlates = tail.addOrReplaceChild("TailPlates", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5512F, 0.2482F));

		PartDefinition leftPlate13 = TailPlates.addOrReplaceChild("leftPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -3.0F, 4.75F, -0.3004F, 0.0469F, 0.2132F));

		PartDefinition rightPlate13 = TailPlates.addOrReplaceChild("rightPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -3.0F, 4.75F, -0.3004F, -0.0469F, -0.2132F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1488F, 6.2982F, 0.422F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r1 = tail2.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(24, 20).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.1102F, -0.0188F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Tail2Plates = tail2.addOrReplaceChild("Tail2Plates", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0898F, 0.9812F));

		PartDefinition leftPlate14 = Tail2Plates.addOrReplaceChild("leftPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -0.9F, 1.2F, -0.3883F, 0.0522F, 0.1666F));

		PartDefinition rightPlate14 = Tail2Plates.addOrReplaceChild("rightPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.9F, 1.2F, -0.3883F, -0.0522F, -0.1666F));

		PartDefinition leftPlate15 = Tail2Plates.addOrReplaceChild("leftPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3319F, -1.1205F, 6.0101F, -0.6957F, 0.0393F, 0.1249F));

		PartDefinition rightPlate15 = Tail2Plates.addOrReplaceChild("rightPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3319F, -1.1205F, 6.0101F, -0.6957F, -0.0393F, -0.1249F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -0.1806F, -0.4131F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1602F, 7.5812F, 0.105F, -0.3908F, -0.0401F));

		PartDefinition Tail3Plates = tail3.addOrReplaceChild("Tail3Plates", CubeListBuilder.create(), PartPose.offset(0.0F, -1.9806F, 0.4869F));

		PartDefinition leftPlate17 = Tail3Plates.addOrReplaceChild("leftPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, 0.85F, 2.75F, 0.1348F, 0.0847F, 0.3631F));

		PartDefinition rightPlate17 = Tail3Plates.addOrReplaceChild("rightPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, 0.85F, 2.75F, 0.1348F, -0.0847F, -0.3631F));

		PartDefinition leftPlate4 = Tail3Plates.addOrReplaceChild("leftPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.95F, 0.2747F, 5.7582F, 0.0875F, 0.0332F, 0.8449F));

		PartDefinition rightPlate4 = Tail3Plates.addOrReplaceChild("rightPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.95F, 0.2747F, 5.7582F, 0.0875F, -0.0332F, -0.8449F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4806F, 8.4869F, 0.0021F, -0.1745F, -0.0004F));

		PartDefinition Tailmiddleend_r1 = tail4.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(33, 17).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.301F, -0.0564F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tail4Spikes = tail4.addOrReplaceChild("Tail4Spikes", CubeListBuilder.create(), PartPose.offset(0.0F, -0.999F, 0.0436F));

		PartDefinition leftTailSpike1 = Tail4Spikes.addOrReplaceChild("leftTailSpike1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 1.15F, 3.35F, -0.6128F, 0.0739F, 1.3052F));

		PartDefinition rightTailSpike1 = Tail4Spikes.addOrReplaceChild("rightTailSpike1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 1.15F, 3.35F, -0.6128F, -0.0739F, -1.3052F));

		PartDefinition leftTailSpike4 = Tail4Spikes.addOrReplaceChild("leftTailSpike4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.45F, -0.35F, -0.7471F, -0.0143F, 1.3006F));

		PartDefinition rightTailSpike4 = Tail4Spikes.addOrReplaceChild("rightTailSpike4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 1.45F, -0.35F, -0.7471F, 0.0143F, -1.3006F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.601F, 6.9436F, -0.1806F, -0.2577F, 0.0465F));

		PartDefinition Tailend_r1 = tail5.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.1451F, 0.2125F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail5Spikes = tail5.addOrReplaceChild("Tail5Spikes", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0049F, 0.0125F));

		PartDefinition leftTailSpike2 = Tail5Spikes.addOrReplaceChild("leftTailSpike2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7F, 1.0F, 0.85F, -0.8889F, -0.0208F, 1.2572F));

		PartDefinition rightTailSpike2 = Tail5Spikes.addOrReplaceChild("rightTailSpike2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 1.0F, 0.85F, -0.8889F, 0.0208F, -1.2572F));

		PartDefinition leftTailSpike3 = Tail5Spikes.addOrReplaceChild("leftTailSpike3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, 1.9F, 3.15F, -1.388F, 0.0273F, 1.1905F));

		PartDefinition rightTailSpike3 = Tail5Spikes.addOrReplaceChild("rightTailSpike3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 1.9F, 3.15F, -1.388F, -0.0273F, -1.1905F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.45F, -10.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.8F, 3.0F, -0.0097F, -0.218F, 0.0447F));

		PartDefinition BodyPlates = body.addOrReplaceChild("BodyPlates", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, -1.0F));

		PartDefinition leftPlate8 = BodyPlates.addOrReplaceChild("leftPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(2.75F, -7.9F, -7.05F, -0.0539F, 0.056F, 0.2559F));

		PartDefinition rightPlate8 = BodyPlates.addOrReplaceChild("rightPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.75F, -7.9F, -7.05F, -0.0539F, -0.056F, -0.2559F));

		PartDefinition leftPlate10 = BodyPlates.addOrReplaceChild("leftPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -13.3F, 1.7F, -0.2951F, 0.1084F, 0.1897F));

		PartDefinition rightPlate10 = BodyPlates.addOrReplaceChild("rightPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -13.3F, 1.7F, -0.2951F, -0.1084F, -0.1897F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.246F, -10.1452F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Bodyfrontslope_r1 = chest.addOrReplaceChild("Bodyfrontslope_r1", CubeListBuilder.create().texOffs(18, 54).addBox(-0.5F, -0.2781F, -0.0133F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.3178F, -3.3834F, 0.2306F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r2 = chest.addOrReplaceChild("Bodyfrontslope_r2", CubeListBuilder.create().texOffs(-1, 43).addBox(-0.6F, -1.0F, -3.1F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.9136F, -5.5196F, 0.3608F, 0.0372F, 0.0228F));

		PartDefinition ChestPlates = chest.addOrReplaceChild("ChestPlates", CubeListBuilder.create(), PartPose.offset(3.35F, 3.054F, -4.3548F));

		PartDefinition leftPlate5 = ChestPlates.addOrReplaceChild("leftPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.35F, -4.45F, -3.15F, 0.1278F, -0.0283F, 0.2164F));

		PartDefinition rightPlate5 = ChestPlates.addOrReplaceChild("rightPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.35F, -4.45F, -3.15F, 0.1278F, 0.0283F, -0.2164F));

		PartDefinition leftPlate6 = ChestPlates.addOrReplaceChild("leftPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1F, -5.95F, -0.15F, 0.0F, 0.0F, 0.2182F));

		PartDefinition rightPlate6 = ChestPlates.addOrReplaceChild("rightPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6F, -5.95F, -0.15F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Leftlegspike = ChestPlates.addOrReplaceChild("Leftlegspike", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 1.7F, -2.3F, 0.1248F, 0.4402F, -0.1009F));

		PartDefinition Rightlegspike = ChestPlates.addOrReplaceChild("Rightlegspike", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.3F, 1.7F, -2.3F, 0.1248F, -0.4402F, 0.1009F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.75F, 7.754F, -7.1048F, 0.0699F, 0.103F, -0.5086F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 5.5175F, 0.7867F, -1.6893F, 0.2599F, 0.0604F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9764F, 5.0507F, 1.4044F, 1.1578F, -0.3567F, -0.0469F));

		PartDefinition bone = leftArm.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.75F, 7.754F, -7.1048F, 0.697F, -0.0262F, 0.2578F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1F, 5.5175F, 0.7867F, -0.8713F, -0.3938F, 0.0439F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9764F, 5.0507F, 1.4044F, -0.1762F, 0.4907F, 0.0787F));

		PartDefinition bone2 = rightArm.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.7629F, -7.8454F, -0.2248F, -0.3367F, 0.2778F));

		PartDefinition Neckbase_r1 = neck.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(45, 16).addBox(0.0F, 0.75F, 0.05F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.3317F, -4.8753F, 0.0873F, 0.0F, 0.0F));

		PartDefinition NeckPlates = neck.addOrReplaceChild("NeckPlates", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5727F, -0.7658F));

		PartDefinition leftPlate3 = NeckPlates.addOrReplaceChild("leftPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -1.409F, -2.9595F, 0.1745F, 0.0F, 0.1309F));

		PartDefinition rightPlate3 = NeckPlates.addOrReplaceChild("rightPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.409F, -2.9595F, 0.1745F, 0.0F, -0.1309F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0683F, -4.4253F, -0.6995F, -0.1219F, 0.0843F));

		PartDefinition Neckmiddle_r1 = neck2.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(46, 23).addBox(0.0F, 0.15F, -0.35F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.1682F, -4.2469F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck2Plates = neck2.addOrReplaceChild("Neck2Plates", CubeListBuilder.create(), PartPose.offset(0.0F, -1.4182F, -0.1969F));

		PartDefinition leftPlate2 = Neck2Plates.addOrReplaceChild("leftPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, -0.1F, -2.3F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightPlate2 = Neck2Plates.addOrReplaceChild("rightPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, -0.1F, -2.3F, 0.3491F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0682F, -4.5969F, -0.0464F, -0.123F, 0.045F));

		PartDefinition Neckfront_r1 = neck3.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(63, 17).addBox(-0.5F, -0.2F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.0992F, -0.8545F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Neck3Plates = neck3.addOrReplaceChild("Neck3Plates", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0992F, 0.5455F));

		PartDefinition leftPlate1 = Neck3Plates.addOrReplaceChild("leftPlate1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -0.25F, -1.6F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightPlate1 = Neck3Plates.addOrReplaceChild("rightPlate1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, -1.6F, 0.0436F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -0.3992F, -2.1545F, 0.2162F, 0.0227F, -0.1731F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.9467F, -0.2679F, 0.4363F, 0.0F, 0.0F));

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