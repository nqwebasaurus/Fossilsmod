package fossils.fossils.client.blockentity.model.chungkingosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ChungkingosaurusFossilModel extends SkullModelBase {
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

	public ChungkingosaurusFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -17.1F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -2.7F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(75, 29).mirror().addBox(0.9371F, -0.6165F, 0.1391F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.5788F, 3.2286F, -0.4715F, 0.2537F, 0.1143F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(62, 7).mirror().addBox(1.884F, 2.4418F, -4.5978F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -2.6788F, 6.7286F, -0.0966F, 0.2532F, 0.1128F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(62, 28).mirror().addBox(-0.2758F, 0.3284F, -1.5455F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.6212F, 6.0286F, -0.7348F, 0.3514F, -0.0937F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(46, 33).mirror().addBox(-0.2031F, 0.4118F, 0.8317F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.6212F, 6.6286F, -1.0454F, 0.4372F, -0.3821F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(79, 14).mirror().addBox(-0.2339F, 5.1579F, -0.179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.6212F, 6.6286F, 0.407F, 0.2343F, -0.4593F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 38).mirror().addBox(-0.2339F, 1.1804F, 0.1541F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 68).mirror().addBox(-0.2339F, 1.1804F, -0.3459F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.6212F, 6.6286F, 0.4245F, 0.2343F, -0.4593F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 38).mirror().addBox(-0.1868F, -1.4219F, 0.0938F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.6212F, 6.0286F, 0.536F, 0.1546F, -0.1983F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(76, 18).mirror().addBox(-0.2845F, -0.7025F, 0.9496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.6212F, 6.1286F, 0.1307F, 0.2141F, -0.3722F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 16).mirror().addBox(-0.8335F, -0.5344F, -2.9443F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.9F, -3.5788F, 1.3286F, 0.2762F, 0.4718F, 0.4571F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(25, 57).mirror().addBox(-0.7996F, -0.5506F, -0.3369F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.9F, -3.5788F, 1.4286F, -0.0007F, 0.3456F, 0.4193F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(63, 12).mirror().addBox(-0.2226F, -0.0796F, -2.4084F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(26, 64).mirror().addBox(-0.2226F, -0.0796F, -0.4084F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -2.3788F, 7.4286F, -0.3127F, -0.3559F, -0.1277F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(38, 40).mirror().addBox(1.1F, -0.4564F, -3.999F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(11, 38).mirror().addBox(2.1F, -0.1564F, -3.999F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(11, 38).addBox(5.1F, -0.1564F, -3.999F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.001F))
				.texOffs(38, 40).addBox(7.1F, -0.4564F, -3.999F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-4.6F, -2.3788F, 7.4286F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(72, 35).mirror().addBox(1.1F, -0.4493F, 1.0114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(72, 35).addBox(7.1F, -0.4493F, 1.0114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-4.6F, -2.3788F, 7.4286F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(25, 57).addBox(-0.2004F, -0.5506F, -0.3369F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.9F, -3.5788F, 1.4286F, -0.0007F, -0.3456F, -0.4193F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(12, 16).addBox(-0.1665F, -0.5344F, -2.9443F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.9F, -3.5788F, 1.3286F, 0.2762F, -0.4718F, -0.4571F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(26, 64).addBox(-1.7774F, -0.0796F, -0.4084F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(63, 12).addBox(-1.7774F, -0.0796F, -2.4084F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.6F, -2.3788F, 7.4286F, -0.3127F, 0.3559F, 0.1277F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(38, 38).addBox(-0.8132F, -1.4219F, 0.0938F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.2F, 0.6212F, 6.0286F, 0.536F, -0.1546F, 0.1983F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(76, 18).addBox(-0.7155F, -0.7025F, 0.9496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.2F, 0.6212F, 6.1286F, 0.1307F, -0.2141F, 0.3722F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(29, 68).addBox(-0.7661F, 1.1804F, -0.3459F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(68, 38).addBox(-0.7661F, 1.1804F, 0.1541F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.6212F, 6.6286F, 0.4245F, -0.2343F, 0.4593F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(79, 14).addBox(-0.7661F, 5.1579F, -0.179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.2F, 0.6212F, 6.6286F, 0.407F, -0.2343F, 0.4593F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(46, 33).addBox(-0.7969F, 0.4118F, 0.8317F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.2F, 0.6212F, 6.6286F, -1.0454F, -0.4372F, 0.3821F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(62, 28).addBox(-0.7242F, 0.3284F, -1.5455F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.2F, 0.6212F, 6.0286F, -0.7348F, -0.3514F, 0.0937F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(62, 7).addBox(-2.884F, 2.4418F, -4.5978F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.6F, -2.6788F, 6.7286F, -0.0966F, -0.2532F, -0.1128F));

		PartDefinition Bodyfrontslope_r1 = hips.addOrReplaceChild("Bodyfrontslope_r1", CubeListBuilder.create().texOffs(64, 77).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3398F, 10.3758F, -0.4239F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r2 = hips.addOrReplaceChild("Bodyfrontslope_r2", CubeListBuilder.create().texOffs(46, 44).addBox(0.0F, -1.7F, -2.7F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9395F, 6.4008F, -0.1621F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(75, 29).addBox(-1.9371F, -0.6165F, 0.1391F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.6F, -1.5788F, 3.2286F, -0.4715F, -0.2537F, -0.1143F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(46, 76).mirror().addBox(1.9369F, 2.0016F, -0.1654F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -2.6788F, 6.7286F, -0.9078F, 0.2537F, 0.1143F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(46, 76).addBox(-2.9369F, 2.0016F, -0.1654F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.6F, -2.6788F, 6.7286F, -0.9078F, -0.2537F, -0.1143F));

		PartDefinition Hips_r1 = hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(13, 17).addBox(-0.5F, -0.748F, -0.7887F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.45F, 3.5F, -0.2269F, 0.0F, 0.0F));

		PartDefinition HipPlates = hips.addOrReplaceChild("HipPlates", CubeListBuilder.create(), PartPose.offset(0.0F, 1.2F, 2.0F));

		PartDefinition LeftPlate11 = HipPlates.addOrReplaceChild("LeftPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -13.55F, 7.85F, -0.468F, 0.1468F, 0.162F));

		PartDefinition Leftneckfrontplate_r1 = LeftPlate11.addOrReplaceChild("Leftneckfrontplate_r1", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, 0.1535F, -0.069F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.8F, -0.85F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r2 = LeftPlate11.addOrReplaceChild("Leftneckfrontplate_r2", CubeListBuilder.create().texOffs(34, 70).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.25F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r3 = LeftPlate11.addOrReplaceChild("Leftneckfrontplate_r3", CubeListBuilder.create().texOffs(69, 63).addBox(-1.0F, -0.1375F, -0.9205F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.75F, 1.0F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r4 = LeftPlate11.addOrReplaceChild("Leftneckfrontplate_r4", CubeListBuilder.create().texOffs(50, 70).addBox(-1.0F, -0.65F, -0.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.35F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition RightPlate11 = HipPlates.addOrReplaceChild("RightPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -13.55F, 7.85F, -0.468F, -0.1468F, -0.162F));

		PartDefinition Rightneckfrontplate_r1 = RightPlate11.addOrReplaceChild("Rightneckfrontplate_r1", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(0.0F, 0.1535F, -0.069F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.8F, -0.85F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r2 = RightPlate11.addOrReplaceChild("Rightneckfrontplate_r2", CubeListBuilder.create().texOffs(34, 70).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, -0.25F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r3 = RightPlate11.addOrReplaceChild("Rightneckfrontplate_r3", CubeListBuilder.create().texOffs(69, 63).mirror().addBox(0.0F, -0.1375F, -0.9205F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.75F, 1.0F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r4 = RightPlate11.addOrReplaceChild("Rightneckfrontplate_r4", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(0.0F, -0.65F, -0.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.35F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(13, 46).addBox(-1.37F, -0.4877F, -1.0872F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.25F, -1.0F, 4.75F, -0.8184F, -0.5553F, 0.1766F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(35, 49).addBox(-2.0F, 2.2639F, -0.965F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 13).addBox(-2.0F, -0.0361F, -1.465F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(36, 59).addBox(0.2F, -0.0361F, -0.365F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.13F, 8.6623F, 0.2128F, 1.0021F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg2.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(32, 31).addBox(-2.5F, -0.0698F, -3.6515F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 8.8139F, -0.615F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(26, 45).addBox(-0.63F, -0.4877F, -1.0872F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.25F, -1.0F, 4.75F, -0.6101F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 2.2639F, -0.965F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(53, 53).addBox(0.0F, -0.0361F, -1.465F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 57).addBox(-1.2F, -0.0361F, -0.365F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.13F, 8.6623F, 0.2128F, 0.3912F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg2.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(13, 31).addBox(-2.5F, -0.0698F, -3.6515F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 8.8139F, -0.615F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, -0.7512F, -0.0018F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, -1.85F, 10.1F, -0.1378F, -0.3449F, 0.0941F));

		PartDefinition Tailbase_r1 = tail.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(41, 59).addBox(0.0F, 1.367F, 1.0431F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 79).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6971F, 3.6888F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = tail.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(80, 28).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2488F, 1.4982F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r3 = tail.addOrReplaceChild("Bodyfrontslope_r3", CubeListBuilder.create().texOffs(80, 67).addBox(0.0F, -1.9158F, -0.1894F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6628F, 5.2387F, -0.3367F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r4 = tail.addOrReplaceChild("Bodyfrontslope_r4", CubeListBuilder.create().texOffs(71, 80).addBox(0.0F, -2.1878F, 0.1042F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6628F, 2.9387F, -0.3541F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r5 = tail.addOrReplaceChild("Bodyfrontslope_r5", CubeListBuilder.create().texOffs(17, 78).addBox(0.0F, -2.2F, -0.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6628F, 1.4387F, -0.4065F, 0.0F, 0.0F));

		PartDefinition TailPlates = tail.addOrReplaceChild("TailPlates", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5512F, 0.2482F));

		PartDefinition leftPlate13 = TailPlates.addOrReplaceChild("leftPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -3.0F, 4.75F, -0.3004F, 0.0469F, 0.2132F));

		PartDefinition Leftneckfrontplate_r5 = leftPlate13.addOrReplaceChild("Leftneckfrontplate_r5", CubeListBuilder.create().texOffs(39, 72).addBox(-1.0F, -0.2249F, -0.1801F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.25F, -0.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r6 = leftPlate13.addOrReplaceChild("Leftneckfrontplate_r6", CubeListBuilder.create().texOffs(64, 72).addBox(-1.0F, -0.1682F, -0.2754F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.25F, 0.1F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r7 = leftPlate13.addOrReplaceChild("Leftneckfrontplate_r7", CubeListBuilder.create().texOffs(18, 73).addBox(-1.0F, -0.171F, -0.4019F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.15F, 0.1F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r8 = leftPlate13.addOrReplaceChild("Leftneckfrontplate_r8", CubeListBuilder.create().texOffs(73, 24).addBox(-1.0F, -3.0047F, 0.0103F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.55F, -1.1F, -0.288F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r9 = leftPlate13.addOrReplaceChild("Leftneckfrontplate_r9", CubeListBuilder.create().texOffs(28, 74).addBox(-1.0F, -1.15F, -1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightPlate13 = TailPlates.addOrReplaceChild("rightPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -3.0F, 4.75F, -0.3004F, -0.0469F, -0.2132F));

		PartDefinition Rightneckfrontplate_r5 = rightPlate13.addOrReplaceChild("Rightneckfrontplate_r5", CubeListBuilder.create().texOffs(39, 72).mirror().addBox(0.0F, -0.2249F, -0.1801F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.25F, -0.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r6 = rightPlate13.addOrReplaceChild("Rightneckfrontplate_r6", CubeListBuilder.create().texOffs(64, 72).mirror().addBox(0.0F, -0.1682F, -0.2754F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.25F, 0.1F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r7 = rightPlate13.addOrReplaceChild("Rightneckfrontplate_r7", CubeListBuilder.create().texOffs(18, 73).mirror().addBox(0.0F, -0.171F, -0.4019F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.15F, 0.1F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r8 = rightPlate13.addOrReplaceChild("Rightneckfrontplate_r8", CubeListBuilder.create().texOffs(73, 24).mirror().addBox(0.0F, -3.0047F, 0.0103F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.55F, -1.1F, -0.288F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r9 = rightPlate13.addOrReplaceChild("Rightneckfrontplate_r9", CubeListBuilder.create().texOffs(28, 74).mirror().addBox(0.0F, -1.15F, -1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.75F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1488F, 6.2982F, 0.422F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r1 = tail2.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(24, 20).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1102F, -0.0188F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = tail2.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(32, 57).addBox(0.0F, 0.7022F, 1.3286F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 79).addBox(0.0F, -0.1431F, -0.484F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4494F, 3.0909F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = tail2.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(64, 82).addBox(0.0F, -0.1431F, -0.484F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7104F, 1.108F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r6 = tail2.addOrReplaceChild("Bodyfrontslope_r6", CubeListBuilder.create().texOffs(80, 63).addBox(0.0F, -1.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2453F, 5.5158F, -0.3803F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r7 = tail2.addOrReplaceChild("Bodyfrontslope_r7", CubeListBuilder.create().texOffs(67, 80).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.694F, 3.5438F, -0.4239F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r8 = tail2.addOrReplaceChild("Bodyfrontslope_r8", CubeListBuilder.create().texOffs(83, 0).addBox(0.0F, -1.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5444F, 1.527F, -0.4239F, 0.0F, 0.0F));

		PartDefinition Tail2Plates = tail2.addOrReplaceChild("Tail2Plates", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0898F, 0.9812F));

		PartDefinition leftPlate14 = Tail2Plates.addOrReplaceChild("leftPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -0.9F, 1.2F, -0.3883F, 0.0522F, 0.1666F));

		PartDefinition Leftneckfrontplate_r10 = leftPlate14.addOrReplaceChild("Leftneckfrontplate_r10", CubeListBuilder.create().texOffs(76, 44).addBox(-0.9F, -2.0118F, 0.018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3372F, -1.7623F, -0.0297F, -0.288F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r11 = leftPlate14.addOrReplaceChild("Leftneckfrontplate_r11", CubeListBuilder.create().texOffs(40, 0).addBox(-0.9F, 0.3433F, -0.3894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3372F, -3.0623F, 0.7703F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r12 = leftPlate14.addOrReplaceChild("Leftneckfrontplate_r12", CubeListBuilder.create().texOffs(77, 33).addBox(-0.9F, -0.45F, -1.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3372F, -1.1623F, 1.1703F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightPlate14 = Tail2Plates.addOrReplaceChild("rightPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.9F, 1.2F, -0.3883F, -0.0522F, -0.1666F));

		PartDefinition Rightneckfrontplate_r10 = rightPlate14.addOrReplaceChild("Rightneckfrontplate_r10", CubeListBuilder.create().texOffs(76, 44).mirror().addBox(-0.1F, -2.0118F, 0.018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3372F, -1.7623F, -0.0297F, -0.288F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r11 = rightPlate14.addOrReplaceChild("Rightneckfrontplate_r11", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(-0.1F, 0.3433F, -0.3894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3372F, -3.0623F, 0.7703F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r12 = rightPlate14.addOrReplaceChild("Rightneckfrontplate_r12", CubeListBuilder.create().texOffs(77, 33).mirror().addBox(-0.1F, -0.45F, -1.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3372F, -1.1623F, 1.1703F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftPlate15 = Tail2Plates.addOrReplaceChild("leftPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3319F, -1.1205F, 6.0101F, -0.6957F, 0.0393F, 0.1249F));

		PartDefinition Leftneckfrontplate_r13 = leftPlate15.addOrReplaceChild("Leftneckfrontplate_r13", CubeListBuilder.create().texOffs(45, 71).addBox(-1.0F, -0.95F, -1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.5822F, 0.7253F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r14 = leftPlate15.addOrReplaceChild("Leftneckfrontplate_r14", CubeListBuilder.create().texOffs(23, 74).addBox(-1.0F, -0.207F, -0.2815F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2822F, -0.2747F, 0.3752F, 0.0F, 0.0F));

		PartDefinition rightPlate15 = Tail2Plates.addOrReplaceChild("rightPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3319F, -1.1205F, 6.0101F, -0.6957F, -0.0393F, -0.1249F));

		PartDefinition Rightneckfrontplate_r13 = rightPlate15.addOrReplaceChild("Rightneckfrontplate_r13", CubeListBuilder.create().texOffs(45, 71).mirror().addBox(0.0F, -0.95F, -1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5822F, 0.7253F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r14 = rightPlate15.addOrReplaceChild("Rightneckfrontplate_r14", CubeListBuilder.create().texOffs(23, 74).mirror().addBox(0.0F, -0.207F, -0.2815F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2822F, -0.2747F, 0.3752F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -0.7806F, -0.5131F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.1602F, 7.5812F, 0.105F, -0.3908F, -0.0401F));

		PartDefinition Tailbase_r5 = tail3.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(47, 31).addBox(0.0F, 1.5474F, 3.1412F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 16).addBox(0.0F, 6.2414F, 10.2373F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 45).addBox(0.0F, 4.3179F, 8.4633F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 79).addBox(0.0F, 3.3944F, 6.6893F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 51).addBox(0.0F, 2.4709F, 4.9153F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3085F, -4.4034F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r9 = tail3.addOrReplaceChild("Bodyfrontslope_r9", CubeListBuilder.create().texOffs(58, 80).addBox(0.0F, -1.3F, 15.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8423F, -12.0727F, -0.0749F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r10 = tail3.addOrReplaceChild("Bodyfrontslope_r10", CubeListBuilder.create().texOffs(80, 59).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.087F, 2.0103F, -0.293F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r11 = tail3.addOrReplaceChild("Bodyfrontslope_r11", CubeListBuilder.create().texOffs(61, 80).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2365F, 0.0159F, -0.2058F, 0.0F, 0.0F));

		PartDefinition Tail3Plates = tail3.addOrReplaceChild("Tail3Plates", CubeListBuilder.create(), PartPose.offset(0.0F, -1.9806F, 0.4869F));

		PartDefinition leftPlate17 = Tail3Plates.addOrReplaceChild("leftPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, 0.85F, 2.75F, 0.1348F, 0.0847F, 0.3631F));

		PartDefinition Leftneckfrontplate_r15 = leftPlate17.addOrReplaceChild("Leftneckfrontplate_r15", CubeListBuilder.create().texOffs(49, 80).addBox(0.0068F, -0.494F, -0.4068F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1168F, -1.4193F, 0.2745F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r16 = leftPlate17.addOrReplaceChild("Leftneckfrontplate_r16", CubeListBuilder.create().texOffs(81, 44).addBox(0.0F, -1.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1168F, -1.0193F, -0.2255F, -0.5672F, 0.0F, 0.0F));

		PartDefinition rightPlate17 = Tail3Plates.addOrReplaceChild("rightPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, 0.85F, 2.75F, 0.1348F, -0.0847F, -0.3631F));

		PartDefinition Rightneckfrontplate_r15 = rightPlate17.addOrReplaceChild("Rightneckfrontplate_r15", CubeListBuilder.create().texOffs(49, 80).mirror().addBox(-0.0068F, -0.494F, -0.4068F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1168F, -1.4193F, 0.2745F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r16 = rightPlate17.addOrReplaceChild("Rightneckfrontplate_r16", CubeListBuilder.create().texOffs(81, 44).mirror().addBox(0.0F, -1.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1168F, -1.0193F, -0.2255F, -0.5672F, 0.0F, 0.0F));

		PartDefinition leftPlate4 = Tail3Plates.addOrReplaceChild("leftPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.95F, 0.2747F, 5.7582F, 0.0875F, 0.0332F, 0.8449F));

		PartDefinition Leftneckfrontplate_r17 = leftPlate4.addOrReplaceChild("Leftneckfrontplate_r17", CubeListBuilder.create().texOffs(35, 80).addBox(0.01F, -0.494F, -0.4068F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4688F, 0.1391F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r18 = leftPlate4.addOrReplaceChild("Leftneckfrontplate_r18", CubeListBuilder.create().texOffs(46, 80).addBox(0.0F, -1.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0688F, -0.3609F, -0.5672F, 0.0F, 0.0F));

		PartDefinition rightPlate4 = Tail3Plates.addOrReplaceChild("rightPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.95F, 0.2747F, 5.7582F, 0.0875F, -0.0332F, -0.8449F));

		PartDefinition Rightneckfrontplate_r17 = rightPlate4.addOrReplaceChild("Rightneckfrontplate_r17", CubeListBuilder.create().texOffs(35, 80).mirror().addBox(-0.01F, -0.494F, -0.4068F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4688F, 0.1391F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r18 = rightPlate4.addOrReplaceChild("Rightneckfrontplate_r18", CubeListBuilder.create().texOffs(46, 80).mirror().addBox(0.0F, -1.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0688F, -0.3609F, -0.5672F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4806F, 8.4869F, 0.0021F, -0.1745F, -0.0004F));

		PartDefinition Tailmiddleend_r1 = tail4.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(35, 19).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.301F, -0.0564F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tail4Spikes = tail4.addOrReplaceChild("Tail4Spikes", CubeListBuilder.create(), PartPose.offset(0.0F, -0.999F, 0.0436F));

		PartDefinition leftTailSpike1 = Tail4Spikes.addOrReplaceChild("leftTailSpike1", CubeListBuilder.create().texOffs(14, 60).addBox(-0.4304F, -8.0539F, 0.3915F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.15F, 3.35F, -0.6128F, 0.0739F, 1.3052F));

		PartDefinition babyskewer_r1 = leftTailSpike1.addOrReplaceChild("babyskewer_r1", CubeListBuilder.create().texOffs(8, 68).addBox(-0.5F, 2.95F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0696F, -8.0039F, 0.3915F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Lefttailmiddleendspike_r1 = leftTailSpike1.addOrReplaceChild("Lefttailmiddleendspike_r1", CubeListBuilder.create().texOffs(53, 60).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0696F, -8.0039F, 0.3915F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightTailSpike1 = Tail4Spikes.addOrReplaceChild("rightTailSpike1", CubeListBuilder.create().texOffs(14, 60).mirror().addBox(-0.5696F, -8.0539F, 0.3915F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, 1.15F, 3.35F, -0.6128F, -0.0739F, -1.3052F));

		PartDefinition babyskewer_r2 = rightTailSpike1.addOrReplaceChild("babyskewer_r2", CubeListBuilder.create().texOffs(8, 68).mirror().addBox(-0.5F, 2.95F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-0.0696F, -8.0039F, 0.3915F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Righttailmiddleendspike_r1 = rightTailSpike1.addOrReplaceChild("Righttailmiddleendspike_r1", CubeListBuilder.create().texOffs(53, 60).mirror().addBox(-0.5F, -0.05F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.0696F, -8.0039F, 0.3915F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftTailSpike4 = Tail4Spikes.addOrReplaceChild("leftTailSpike4", CubeListBuilder.create().texOffs(46, 63).addBox(-0.7F, -6.1649F, 0.0833F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.45F, -0.35F, -0.7471F, -0.0143F, 1.3006F));

		PartDefinition Lefttailmiddleendspike_r2 = leftTailSpike4.addOrReplaceChild("Lefttailmiddleendspike_r2", CubeListBuilder.create().texOffs(64, 53).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2F, -6.1149F, 0.0833F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightTailSpike4 = Tail4Spikes.addOrReplaceChild("rightTailSpike4", CubeListBuilder.create().texOffs(46, 63).mirror().addBox(-0.3F, -6.1649F, 0.0833F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9F, 1.45F, -0.35F, -0.7471F, 0.0143F, -1.3006F));

		PartDefinition Righttailmiddleendspike_r2 = rightTailSpike4.addOrReplaceChild("Righttailmiddleendspike_r2", CubeListBuilder.create().texOffs(64, 53).mirror().addBox(-0.5F, -0.05F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.2F, -6.1149F, 0.0833F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.601F, 6.9436F, -0.1806F, -0.2577F, 0.0465F));

		PartDefinition Tailend_r1 = tail5.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5F, 0.1451F, 0.2125F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail5Spikes = tail5.addOrReplaceChild("Tail5Spikes", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0049F, 0.0125F));

		PartDefinition leftTailSpike2 = Tail5Spikes.addOrReplaceChild("leftTailSpike2", CubeListBuilder.create().texOffs(41, 63).addBox(-0.7317F, -6.973F, 0.0495F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 1.0F, 0.85F, -0.8889F, -0.0208F, 1.2572F));

		PartDefinition babyskewer_r3 = leftTailSpike2.addOrReplaceChild("babyskewer_r3", CubeListBuilder.create().texOffs(19, 66).addBox(-0.5F, 2.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.2317F, -6.923F, 0.0495F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Lefttailendspike_r1 = leftTailSpike2.addOrReplaceChild("Lefttailendspike_r1", CubeListBuilder.create().texOffs(63, 38).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2317F, -6.923F, 0.0495F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightTailSpike2 = Tail5Spikes.addOrReplaceChild("rightTailSpike2", CubeListBuilder.create().texOffs(41, 63).mirror().addBox(-0.2683F, -6.973F, 0.0495F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.0F, 0.85F, -0.8889F, 0.0208F, -1.2572F));

		PartDefinition babyskewer_r4 = rightTailSpike2.addOrReplaceChild("babyskewer_r4", CubeListBuilder.create().texOffs(19, 66).mirror().addBox(-0.5F, 2.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.2317F, -6.923F, 0.0495F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Righttailendspike_r1 = rightTailSpike2.addOrReplaceChild("Righttailendspike_r1", CubeListBuilder.create().texOffs(63, 38).mirror().addBox(-0.5F, -0.05F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.2317F, -6.923F, 0.0495F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftTailSpike3 = Tail5Spikes.addOrReplaceChild("leftTailSpike3", CubeListBuilder.create().texOffs(0, 62).addBox(-1.5705F, -7.2753F, -0.0732F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 1.9F, 3.15F, -1.388F, 0.0273F, 1.1905F));

		PartDefinition Lefttailendspike_r2 = leftTailSpike3.addOrReplaceChild("Lefttailendspike_r2", CubeListBuilder.create().texOffs(24, 16).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0705F, -7.2253F, -0.0732F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightTailSpike3 = Tail5Spikes.addOrReplaceChild("rightTailSpike3", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(0.5705F, -7.2753F, -0.0732F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 1.9F, 3.15F, -1.388F, -0.0273F, -1.1905F));

		PartDefinition Righttailendspike_r2 = rightTailSpike3.addOrReplaceChild("Righttailendspike_r2", CubeListBuilder.create().texOffs(24, 16).mirror().addBox(-0.5F, -0.05F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.0705F, -7.2253F, -0.0732F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.55F, -10.1F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -3.8F, 3.0F, -0.0097F, -0.218F, 0.0447F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(82, 54).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.6165F, -8.8482F, -0.0171F, -0.0932F, 1.8642F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.6165F, -6.8482F, 0.0031F, -0.0264F, 1.863F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(13, 82).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.7165F, -4.8482F, 0.0283F, 0.0572F, 1.8634F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(32, 80).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.8165F, -2.8482F, 0.0537F, 0.1407F, 1.8659F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(81, 79).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.8165F, -0.8482F, 0.093F, 0.2658F, 1.7866F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(58, 74).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.8165F, -0.8482F, -0.2428F, 0.1639F, 0.3979F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(11, 75).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.6165F, -8.8482F, 0.0874F, -0.0168F, 0.5098F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(74, 61).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.6165F, -6.8482F, 0.0265F, 0.0173F, 0.5098F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(61, 74).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.7165F, -4.8482F, -0.0498F, 0.0598F, 0.5068F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(5, 71).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.8165F, -2.8482F, -0.1264F, 0.1019F, 0.5006F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(9, 52).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.8165F, -2.8482F, -0.1575F, 0.0392F, 0.0677F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(8, 75).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.7165F, -4.8482F, -0.0703F, 0.0331F, 0.0708F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(55, 70).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.6165F, -6.8482F, 0.0167F, 0.0268F, 0.0734F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(22, 46).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.6165F, -8.8482F, 0.0864F, 0.0217F, 0.0751F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(58, 74).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.8165F, -0.8482F, -0.2428F, -0.1639F, -0.3979F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(81, 79).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.8165F, -0.8482F, 0.093F, -0.2658F, -1.7866F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(32, 80).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.8165F, -2.8482F, 0.0537F, -0.1407F, -1.8659F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(5, 71).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.8165F, -2.8482F, -0.1264F, -0.1019F, -0.5006F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(9, 52).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.8165F, -2.8482F, -0.1575F, -0.0392F, -0.0677F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(13, 82).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.7165F, -4.8482F, 0.0283F, -0.0572F, -1.8634F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(61, 74).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.7165F, -4.8482F, -0.0498F, -0.0598F, -0.5068F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(8, 75).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.7165F, -4.8482F, -0.0703F, -0.0331F, -0.0708F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(10, 81).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.6165F, -6.8482F, 0.0031F, 0.0264F, -1.863F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(74, 61).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.6165F, -6.8482F, 0.0265F, -0.0173F, -0.5098F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(55, 70).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.6165F, -6.8482F, 0.0167F, -0.0268F, -0.0734F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(82, 54).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.6165F, -8.8482F, -0.0171F, 0.0932F, -1.8642F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(22, 46).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.6165F, -8.8482F, 0.0864F, -0.0217F, -0.0751F));

		PartDefinition Bodyfrontslope_r12 = body.addOrReplaceChild("Bodyfrontslope_r12", CubeListBuilder.create().texOffs(82, 8).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2081F, -0.5002F, -0.2058F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r13 = body.addOrReplaceChild("Bodyfrontslope_r13", CubeListBuilder.create().texOffs(77, 66).addBox(0.0F, -2.1563F, -0.0508F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4488F, -3.0571F, -0.1359F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r14 = body.addOrReplaceChild("Bodyfrontslope_r14", CubeListBuilder.create().texOffs(20, 78).addBox(0.0F, -2.0717F, 0.0072F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5555F, -5.0747F, -0.1534F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r15 = body.addOrReplaceChild("Bodyfrontslope_r15", CubeListBuilder.create().texOffs(80, 71).addBox(0.0F, -1.9248F, -0.2936F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5555F, -6.7747F, -0.1185F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r16 = body.addOrReplaceChild("Bodyfrontslope_r16", CubeListBuilder.create().texOffs(82, 50).addBox(0.0F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.958F, -8.5735F, -0.1185F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(11, 75).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.6165F, -8.8482F, 0.0874F, 0.0168F, -0.5098F));

		PartDefinition BodyPlates = body.addOrReplaceChild("BodyPlates", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, -1.0F));

		PartDefinition leftPlate8 = BodyPlates.addOrReplaceChild("leftPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(2.75F, -7.9F, -7.05F, -0.0539F, 0.056F, 0.2559F));

		PartDefinition Leftneckfrontplate_r19 = leftPlate8.addOrReplaceChild("Leftneckfrontplate_r19", CubeListBuilder.create().texOffs(65, 33).addBox(-1.0F, -0.3018F, -1.768F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6791F, -1.5846F, 1.9717F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r20 = leftPlate8.addOrReplaceChild("Leftneckfrontplate_r20", CubeListBuilder.create().texOffs(69, 3).addBox(-1.0F, -0.1128F, -0.3017F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6791F, -5.3846F, 1.3717F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r21 = leftPlate8.addOrReplaceChild("Leftneckfrontplate_r21", CubeListBuilder.create().texOffs(69, 52).addBox(-1.0F, -3.872F, -0.1053F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6791F, -1.7846F, 0.2717F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r22 = leftPlate8.addOrReplaceChild("Leftneckfrontplate_r22", CubeListBuilder.create().texOffs(33, 76).addBox(-1.0F, 0.25F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6791F, -1.7846F, 1.6717F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightPlate8 = BodyPlates.addOrReplaceChild("rightPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.75F, -7.9F, -7.05F, -0.0539F, -0.056F, -0.2559F));

		PartDefinition Rightneckfrontplate_r19 = rightPlate8.addOrReplaceChild("Rightneckfrontplate_r19", CubeListBuilder.create().texOffs(65, 33).mirror().addBox(0.0F, -0.3018F, -1.768F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6791F, -1.5846F, 1.9717F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r20 = rightPlate8.addOrReplaceChild("Rightneckfrontplate_r20", CubeListBuilder.create().texOffs(69, 3).mirror().addBox(0.0F, -0.1128F, -0.3017F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6791F, -5.3846F, 1.3717F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r21 = rightPlate8.addOrReplaceChild("Rightneckfrontplate_r21", CubeListBuilder.create().texOffs(69, 52).mirror().addBox(0.0F, -3.872F, -0.1053F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6791F, -1.7846F, 0.2717F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r22 = rightPlate8.addOrReplaceChild("Rightneckfrontplate_r22", CubeListBuilder.create().texOffs(33, 76).mirror().addBox(0.0F, 0.25F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6791F, -1.7846F, 1.6717F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftPlate10 = BodyPlates.addOrReplaceChild("leftPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -13.3F, 1.7F, -0.2951F, 0.1084F, 0.1897F));

		PartDefinition Leftneckfrontplate_r23 = leftPlate10.addOrReplaceChild("Leftneckfrontplate_r23", CubeListBuilder.create().texOffs(71, 44).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9F, -0.25F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r24 = leftPlate10.addOrReplaceChild("Leftneckfrontplate_r24", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, -0.35F, -0.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r25 = leftPlate10.addOrReplaceChild("Leftneckfrontplate_r25", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, 0.2694F, -0.1501F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.7F, -0.75F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r26 = leftPlate10.addOrReplaceChild("Leftneckfrontplate_r26", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -0.15F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.05F, 0.9F, 0.2269F, 0.0F, 0.0F));

		PartDefinition rightPlate10 = BodyPlates.addOrReplaceChild("rightPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -13.3F, 1.7F, -0.2951F, -0.1084F, -0.1897F));

		PartDefinition Rightneckfrontplate_r23 = rightPlate10.addOrReplaceChild("Rightneckfrontplate_r23", CubeListBuilder.create().texOffs(71, 44).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9F, -0.25F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r24 = rightPlate10.addOrReplaceChild("Rightneckfrontplate_r24", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(0.0F, -0.35F, -0.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.55F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r25 = rightPlate10.addOrReplaceChild("Rightneckfrontplate_r25", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(0.0F, 0.2694F, -0.1501F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7F, -0.75F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r26 = rightPlate10.addOrReplaceChild("Rightneckfrontplate_r26", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(0.0F, -0.15F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.05F, 0.9F, 0.2269F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.246F, -10.1452F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Bodyfrontslope_r17 = chest.addOrReplaceChild("Bodyfrontslope_r17", CubeListBuilder.create().texOffs(18, 54).addBox(-0.5F, -1.2781F, -0.2133F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3178F, -3.3834F, 0.2306F, 0.0F, 0.0F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(61, 65).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.5704F, -0.403F, 0.1908F, 0.0137F, 0.077F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(5, 62).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.7704F, -2.503F, 0.2778F, 0.0069F, 0.0779F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(58, 65).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.2704F, -4.203F, 0.3039F, 0.0049F, 0.078F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(68, 44).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.8704F, -6.203F, 0.3909F, -0.0019F, 0.0782F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(43, 76).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.7704F, -8.203F, 0.5652F, -0.0078F, -0.0103F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(69, 75).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.7704F, -8.203F, 0.5187F, -0.2356F, 0.3655F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(74, 67).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.8704F, -6.203F, 0.3567F, -0.1635F, 0.4853F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(29, 19).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.2704F, -4.203F, 0.279F, -0.1223F, 0.4964F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(12, 13).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.7704F, -2.503F, 0.2558F, -0.1098F, 0.4991F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(73, 74).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.5704F, -0.403F, 0.179F, -0.0678F, 0.5059F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(82, 31).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.5704F, -0.403F, -0.0479F, -0.1934F, 1.8686F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(81, 17).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.7704F, -2.503F, -0.0745F, -0.2768F, 1.8748F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(43, 82).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.2704F, -4.203F, -0.0827F, -0.3017F, 1.8772F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(40, 81).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.8704F, -6.203F, -0.111F, -0.3848F, 1.8867F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(29, 79).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.7704F, -8.203F, -0.1658F, -0.5522F, 1.8239F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(82, 31).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.5704F, -0.403F, -0.0479F, 0.1934F, -1.8686F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(73, 74).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.5704F, -0.403F, 0.179F, 0.0678F, -0.5059F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(61, 65).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.5704F, -0.403F, 0.1908F, -0.0137F, -0.077F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(12, 13).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.7704F, -2.503F, 0.2558F, 0.1098F, -0.4991F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(81, 17).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.7704F, -2.503F, -0.0745F, 0.2768F, -1.8748F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(5, 77).addBox(3.4336F, 3.1438F, 0.3712F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 62).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.7704F, -2.503F, 0.2778F, -0.0069F, -0.0779F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(43, 82).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.2704F, -4.203F, -0.0827F, 0.3017F, -1.8772F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(29, 19).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.2704F, -4.203F, 0.279F, 0.1223F, -0.4964F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(38, 77).addBox(3.4336F, 3.1438F, 0.4712F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 65).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.2704F, -4.203F, 0.3039F, -0.0049F, -0.078F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(77, 61).addBox(3.4336F, 3.1438F, 0.4712F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 44).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.8704F, -6.203F, 0.3909F, 0.0019F, -0.0782F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(74, 67).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.8704F, -6.203F, 0.3567F, 0.1635F, -0.4853F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(40, 81).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.8704F, -6.203F, -0.111F, 0.3848F, -1.8867F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(29, 79).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 2.7704F, -8.203F, -0.1658F, 0.5522F, -1.8239F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(69, 75).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 2.7704F, -8.203F, 0.5187F, 0.2356F, -0.3655F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(43, 76).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 2.7704F, -8.203F, 0.5652F, 0.0078F, 0.0103F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(38, 1).mirror().addBox(-2.1531F, 0.4665F, -0.1909F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.5439F, -1.9673F, 0.2249F, -0.3723F, 0.2198F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(43, 9).mirror().addBox(-2.1848F, 0.4553F, 0.0859F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.5439F, -1.9673F, 0.093F, -0.5461F, 0.2025F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(52, 4).mirror().addBox(-2.167F, 0.4228F, 0.418F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.5439F, -1.9673F, 0.2654F, -0.764F, 0.1163F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(48, 4).mirror().addBox(1.7395F, 1.8724F, 2.2622F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 10.5439F, -5.9673F, 0.2561F, -1.1224F, 0.1605F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(28, 38).mirror().addBox(-2.0F, -0.908F, -1.2914F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(28, 38).addBox(1.0F, -0.908F, -1.2914F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 10.5439F, -5.9673F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(52, 43).mirror().addBox(-1.6415F, -2.7506F, 0.6653F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8F, 8.4414F, -8.9563F, 0.4946F, 0.2322F, 0.5696F));

		PartDefinition Bodyfrontslope_r18 = chest.addOrReplaceChild("Bodyfrontslope_r18", CubeListBuilder.create().texOffs(15, 5).mirror().addBox(-1.1F, -1.0F, -3.9F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 4.9589F, -4.4256F, 0.3343F, -0.216F, 0.3881F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(48, 4).addBox(-2.7395F, 1.8724F, 2.2622F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 10.5439F, -5.9673F, 0.2561F, 1.1224F, -0.1605F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(52, 4).addBox(1.167F, 0.4228F, 0.418F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 11.5439F, -1.9673F, 0.2654F, 0.764F, -0.1163F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(43, 9).addBox(1.1848F, 0.4553F, 0.0859F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 11.5439F, -1.9673F, 0.093F, 0.5461F, -0.2025F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(38, 1).addBox(1.1531F, 0.4665F, -0.1909F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 11.5439F, -1.9673F, 0.2249F, 0.3723F, -0.2198F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(52, 43).addBox(-2.3585F, -2.7506F, 0.6653F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, 8.4414F, -8.9563F, 0.4946F, -0.2322F, -0.5696F));

		PartDefinition Bodyfrontslope_r19 = chest.addOrReplaceChild("Bodyfrontslope_r19", CubeListBuilder.create().texOffs(0, 81).addBox(0.0F, -1.6653F, -0.2164F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4159F, -0.809F, -0.101F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r20 = chest.addOrReplaceChild("Bodyfrontslope_r20", CubeListBuilder.create().texOffs(3, 81).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5588F, -2.5561F, -0.0312F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r21 = chest.addOrReplaceChild("Bodyfrontslope_r21", CubeListBuilder.create().texOffs(7, 81).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1485F, -4.4269F, 0.0124F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r22 = chest.addOrReplaceChild("Bodyfrontslope_r22", CubeListBuilder.create().texOffs(23, 79).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8558F, -6.2976F, 0.0997F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r23 = chest.addOrReplaceChild("Bodyfrontslope_r23", CubeListBuilder.create().texOffs(26, 79).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9372F, -8.0269F, 0.0124F, 0.0F, 0.0F));

		PartDefinition Bodyfrontslope_r24 = chest.addOrReplaceChild("Bodyfrontslope_r24", CubeListBuilder.create().texOffs(15, 5).addBox(0.1F, -1.0F, -3.9F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(4.0F, 4.9589F, -4.4256F, 0.3343F, 0.216F, -0.3881F));

		PartDefinition Bodyfrontslope_r25 = chest.addOrReplaceChild("Bodyfrontslope_r25", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -0.2428F, -0.1027F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 2.1178F, -8.3834F, 0.3615F, 0.0F, 0.0F));

		PartDefinition ChestPlates = chest.addOrReplaceChild("ChestPlates", CubeListBuilder.create(), PartPose.offset(3.35F, 3.054F, -4.3548F));

		PartDefinition leftPlate5 = ChestPlates.addOrReplaceChild("leftPlate5", CubeListBuilder.create().texOffs(24, 68).addBox(-1.0F, -2.2F, 0.05F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.35F, -4.45F, -3.15F, 0.1278F, -0.0283F, 0.2164F));

		PartDefinition Leftneckfrontplate_r27 = leftPlate5.addOrReplaceChild("Leftneckfrontplate_r27", CubeListBuilder.create().texOffs(74, 14).addBox(-1.0F, 1.85F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.05F, 0.5F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r28 = leftPlate5.addOrReplaceChild("Leftneckfrontplate_r28", CubeListBuilder.create().texOffs(43, 9).addBox(-1.0F, -0.15F, -0.45F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.05F, 0.5F, 0.4887F, 0.0F, 0.0F));

		PartDefinition rightPlate5 = ChestPlates.addOrReplaceChild("rightPlate5", CubeListBuilder.create().texOffs(24, 68).mirror().addBox(0.0F, -2.2F, 0.05F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.35F, -4.45F, -3.15F, 0.1278F, 0.0283F, -0.2164F));

		PartDefinition Rightneckfrontplate_r27 = rightPlate5.addOrReplaceChild("Rightneckfrontplate_r27", CubeListBuilder.create().texOffs(74, 14).mirror().addBox(0.0F, 1.85F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.05F, 0.5F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r28 = rightPlate5.addOrReplaceChild("Rightneckfrontplate_r28", CubeListBuilder.create().texOffs(43, 9).mirror().addBox(0.0F, -0.15F, -0.45F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.05F, 0.5F, 0.4887F, 0.0F, 0.0F));

		PartDefinition leftPlate6 = ChestPlates.addOrReplaceChild("leftPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1F, -5.95F, -0.15F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Leftneckfrontplate_r29 = leftPlate6.addOrReplaceChild("Leftneckfrontplate_r29", CubeListBuilder.create().texOffs(73, 39).addBox(-0.5F, -0.6017F, -0.8863F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.4F, 2.95F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r30 = leftPlate6.addOrReplaceChild("Leftneckfrontplate_r30", CubeListBuilder.create().texOffs(69, 69).addBox(-0.5F, -0.5821F, -0.2669F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.7F, 2.35F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r31 = leftPlate6.addOrReplaceChild("Leftneckfrontplate_r31", CubeListBuilder.create().texOffs(13, 70).addBox(-0.5F, -4.1011F, 0.1164F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.4F, 0.95F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r32 = leftPlate6.addOrReplaceChild("Leftneckfrontplate_r32", CubeListBuilder.create().texOffs(66, 22).addBox(-0.5F, -1.3F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.5F, 2.75F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightPlate6 = ChestPlates.addOrReplaceChild("rightPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6F, -5.95F, -0.15F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Rightneckfrontplate_r29 = rightPlate6.addOrReplaceChild("Rightneckfrontplate_r29", CubeListBuilder.create().texOffs(73, 39).mirror().addBox(-0.5F, -0.6017F, -0.8863F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.4F, 2.95F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r30 = rightPlate6.addOrReplaceChild("Rightneckfrontplate_r30", CubeListBuilder.create().texOffs(69, 69).mirror().addBox(-0.5F, -0.5821F, -0.2669F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -3.7F, 2.35F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r31 = rightPlate6.addOrReplaceChild("Rightneckfrontplate_r31", CubeListBuilder.create().texOffs(13, 70).mirror().addBox(-0.5F, -4.1011F, 0.1164F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4F, 0.95F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r32 = rightPlate6.addOrReplaceChild("Rightneckfrontplate_r32", CubeListBuilder.create().texOffs(66, 22).mirror().addBox(-0.5F, -1.3F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.5F, 2.75F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Leftlegspike = ChestPlates.addOrReplaceChild("Leftlegspike", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 1.7F, -2.3F, 0.1248F, 0.4402F, -0.1009F));

		PartDefinition Leftlegspiketip_r1 = Leftlegspike.addOrReplaceChild("Leftlegspiketip_r1", CubeListBuilder.create().texOffs(13, 0).addBox(-6.7569F, -1.0339F, -0.7956F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.7559F, -1.8319F, 8.6804F, 0.4389F, -1.1992F, -0.4958F));

		PartDefinition Leftlegspiketip_r2 = Leftlegspike.addOrReplaceChild("Leftlegspiketip_r2", CubeListBuilder.create().texOffs(46, 40).addBox(-1.5009F, -1.0468F, -1.5014F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1819F, -0.9069F, 3.7014F, 0.7118F, -1.3323F, -0.7811F));

		PartDefinition Leftlegspikebase_r1 = Leftlegspike.addOrReplaceChild("Leftlegspikebase_r1", CubeListBuilder.create().texOffs(48, 0).addBox(-0.75F, -1.0F, -1.7F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.2986F, -0.841F, -0.3189F));

		PartDefinition Rightlegspike = ChestPlates.addOrReplaceChild("Rightlegspike", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.3F, 1.7F, -2.3F, 0.1248F, -0.4402F, 0.1009F));

		PartDefinition Rightlegspiketip_r1 = Rightlegspike.addOrReplaceChild("Rightlegspiketip_r1", CubeListBuilder.create().texOffs(13, 0).mirror().addBox(-0.2431F, -1.0339F, -0.7956F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7559F, -1.8319F, 8.6804F, 0.4389F, 1.1992F, 0.4958F));

		PartDefinition Rightlegspiketip_r2 = Rightlegspike.addOrReplaceChild("Rightlegspiketip_r2", CubeListBuilder.create().texOffs(46, 40).mirror().addBox(-5.4991F, -1.0468F, -1.5014F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1819F, -0.9069F, 3.7014F, 0.7118F, 1.3323F, 0.7811F));

		PartDefinition Rightlegspikebase_r1 = Rightlegspike.addOrReplaceChild("Rightlegspikebase_r1", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-4.25F, -1.0F, -1.7F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.2986F, 0.841F, 0.3189F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(55, 21).addBox(-0.4848F, -0.6378F, -1.8943F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 3).addBox(-0.4848F, 2.3622F, -0.9943F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.75F, 7.754F, -7.1048F, 0.0699F, 0.103F, -0.5086F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(44, 53).addBox(-1.5764F, -0.5493F, -0.3456F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(64, 65).addBox(-1.0764F, 1.4507F, -1.8456F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1F, 5.5175F, 0.7867F, -1.6893F, 0.2599F, 0.0604F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(29, 11).addBox(-2.4278F, -0.1458F, -4.6812F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9764F, 5.0507F, 1.4044F, 1.1578F, -0.3567F, -0.0469F));

		PartDefinition bone = leftArm.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(54, 31).addBox(-1.5152F, -0.6378F, -1.8943F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-1.5152F, 2.3622F, -0.9943F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.75F, 7.754F, -7.1048F, 0.697F, -0.0262F, 0.2578F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(0, 52).addBox(-0.4236F, -0.5493F, -0.3456F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(35, 19).addBox(0.0764F, 1.4507F, -1.8456F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1F, 5.5175F, 0.7867F, -0.8713F, -0.3938F, 0.0439F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(26, 0).addBox(-1.5722F, -0.1458F, -4.6812F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9764F, 5.0507F, 1.4044F, -0.1762F, 0.4907F, 0.0787F));

		PartDefinition bone2 = rightArm.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.7629F, -7.8454F, -0.2248F, -0.3367F, 0.2778F));

		PartDefinition Neckbase_r1 = neck.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(45, 16).addBox(0.0F, -0.25F, 0.05F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3317F, -4.8753F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r96 = neck.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(14, 76).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0064F, 0.6348F, -2.4235F, 0.7461F, -0.2438F, 0.096F));

		PartDefinition cube_r97 = neck.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(79, 55).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0064F, 0.6348F, -2.4235F, -0.151F, -0.7729F, 1.5995F));

		PartDefinition cube_r98 = neck.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(14, 76).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0064F, 0.6348F, -2.4235F, 0.7461F, 0.2438F, -0.096F));

		PartDefinition cube_r99 = neck.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(79, 55).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0064F, 0.6348F, -2.4235F, -0.151F, 0.7729F, -1.5995F));

		PartDefinition Bodyfrontslope_r26 = neck.addOrReplaceChild("Bodyfrontslope_r26", CubeListBuilder.create().texOffs(82, 35).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2086F, -2.1174F, 0.0124F, 0.0F, 0.0F));

		PartDefinition NeckPlates = neck.addOrReplaceChild("NeckPlates", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5727F, -0.7658F));

		PartDefinition leftPlate3 = NeckPlates.addOrReplaceChild("leftPlate3", CubeListBuilder.create().texOffs(51, 76).addBox(-1.0F, 0.0038F, 0.4177F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.409F, -2.9595F, 0.1745F, 0.0F, 0.1309F));

		PartDefinition Leftneckfrontplate_r33 = leftPlate3.addOrReplaceChild("Leftneckfrontplate_r33", CubeListBuilder.create().texOffs(74, 2).addBox(-1.0F, -0.3043F, -0.4466F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.65F, 0.7F, 0.3403F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r34 = leftPlate3.addOrReplaceChild("Leftneckfrontplate_r34", CubeListBuilder.create().texOffs(74, 50).addBox(-1.0F, -1.85F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.75F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightPlate3 = NeckPlates.addOrReplaceChild("rightPlate3", CubeListBuilder.create().texOffs(51, 76).mirror().addBox(0.0F, 0.0038F, 0.4177F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.409F, -2.9595F, 0.1745F, 0.0F, -0.1309F));

		PartDefinition Rightneckfrontplate_r33 = rightPlate3.addOrReplaceChild("Rightneckfrontplate_r33", CubeListBuilder.create().texOffs(74, 2).mirror().addBox(0.0F, -0.3043F, -0.4466F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.65F, 0.7F, 0.3403F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r34 = rightPlate3.addOrReplaceChild("Rightneckfrontplate_r34", CubeListBuilder.create().texOffs(74, 50).mirror().addBox(0.0F, -1.85F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.75F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0683F, -4.4253F, -0.6995F, -0.1219F, 0.0843F));

		PartDefinition Neckmiddle_r1 = neck2.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(47, 24).addBox(0.0F, -0.55F, -0.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.1682F, -4.2469F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck2Plates = neck2.addOrReplaceChild("Neck2Plates", CubeListBuilder.create(), PartPose.offset(0.0F, -1.4182F, -0.1969F));

		PartDefinition leftPlate2 = Neck2Plates.addOrReplaceChild("leftPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, -0.1F, -2.3F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Leftneckmiddleplate_r1 = leftPlate2.addOrReplaceChild("Leftneckmiddleplate_r1", CubeListBuilder.create().texOffs(76, 75).addBox(0.01F, -0.3155F, -1.8828F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -1.4F, 0.6F, 1.2828F, 0.0F, 0.0F));

		PartDefinition Leftneckmiddleplate_r2 = leftPlate2.addOrReplaceChild("Leftneckmiddleplate_r2", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -0.5F, -0.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -0.6F, 0.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition rightPlate2 = Neck2Plates.addOrReplaceChild("rightPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, -0.1F, -2.3F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Rightneckmiddleplate_r1 = rightPlate2.addOrReplaceChild("Rightneckmiddleplate_r1", CubeListBuilder.create().texOffs(76, 75).mirror().addBox(-0.01F, -0.3155F, -1.8828F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.05F, -1.4F, 0.6F, 1.2828F, 0.0F, 0.0F));

		PartDefinition Rightneckmiddleplate_r2 = rightPlate2.addOrReplaceChild("Rightneckmiddleplate_r2", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(0.0F, -0.5F, -0.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.05F, -0.6F, 0.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0682F, -4.5969F, -0.0464F, -0.123F, 0.045F));

		PartDefinition Neckfront_r1 = neck3.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(63, 17).addBox(-0.5F, -0.8F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, -0.0992F, -0.8545F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Neck3Plates = neck3.addOrReplaceChild("Neck3Plates", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0992F, 0.5455F));

		PartDefinition leftPlate1 = Neck3Plates.addOrReplaceChild("leftPlate1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -0.25F, -1.6F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r35 = leftPlate1.addOrReplaceChild("Leftneckfrontplate_r35", CubeListBuilder.create().texOffs(52, 80).addBox(0.01F, -0.2929F, -0.3586F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6695F, 0.1993F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Leftneckfrontplate_r36 = leftPlate1.addOrReplaceChild("Leftneckfrontplate_r36", CubeListBuilder.create().texOffs(81, 75).addBox(0.0F, -0.3636F, -0.3879F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6695F, 0.0993F, -0.3665F, 0.0F, 0.0F));

		PartDefinition rightPlate1 = Neck3Plates.addOrReplaceChild("rightPlate1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, -1.6F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r35 = rightPlate1.addOrReplaceChild("Rightneckfrontplate_r35", CubeListBuilder.create().texOffs(52, 80).mirror().addBox(-0.01F, -0.2929F, -0.3586F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6695F, 0.1993F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Rightneckfrontplate_r36 = rightPlate1.addOrReplaceChild("Rightneckfrontplate_r36", CubeListBuilder.create().texOffs(81, 75).mirror().addBox(0.0F, -0.3636F, -0.3879F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6695F, 0.0993F, -0.3665F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(22, 38).addBox(-2.0F, -1.4533F, -2.3679F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(79, 3).addBox(0.01F, -1.0033F, -2.8179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(78, 48).addBox(0.18F, -1.0033F, -2.8179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(78, 41).addBox(0.34F, -1.0033F, -2.8179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 3).mirror().addBox(-2.01F, -1.0033F, -2.8179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(78, 41).mirror().addBox(-2.34F, -1.0033F, -2.8179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(78, 48).mirror().addBox(-2.18F, -1.0033F, -2.8179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.3992F, -2.1545F, 0.2162F, 0.0227F, -0.1731F));

		PartDefinition Lowerjawmiddle_r1 = head.addOrReplaceChild("Lowerjawmiddle_r1", CubeListBuilder.create().texOffs(75, 71).mirror().addBox(0.0F, -0.4F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9859F, 0.4891F, -5.3109F, -0.0436F, -0.2182F, 0.0F));

		PartDefinition Upperjawfront_r1 = head.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(60, 1).mirror().addBox(-1.0F, -0.9601F, -0.0039F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8467F, -4.3179F, 0.4123F, -0.1969F, 0.0289F));

		PartDefinition Upperjawfront_r2 = head.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(68, 27).mirror().addBox(-0.5F, -0.995F, -0.0042F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8467F, -6.3179F, -0.0175F, -0.2608F, 0.0F));

		PartDefinition Righteye_r1 = head.addOrReplaceChild("Righteye_r1", CubeListBuilder.create().texOffs(71, 20).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.91F, 0.0893F, -6.1492F, 0.5742F, -0.147F, -0.0945F));

		PartDefinition Righteye_r2 = head.addOrReplaceChild("Righteye_r2", CubeListBuilder.create().texOffs(78, 6).mirror().addBox(-0.43F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.51F, -0.1033F, -3.6179F, 0.0F, -0.1969F, 0.0F));

		PartDefinition Righteye_r3 = head.addOrReplaceChild("Righteye_r3", CubeListBuilder.create().texOffs(77, 11).mirror().addBox(-0.61F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(78, 0).mirror().addBox(-0.61F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(77, 11).addBox(1.63F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(78, 0).addBox(1.63F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.51F, -0.6033F, -0.9179F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r2 = head.addOrReplaceChild("Lowerjawmiddle_r2", CubeListBuilder.create().texOffs(8, 44).mirror().addBox(-0.2241F, -1.0567F, -0.0059F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9859F, 1.1891F, -4.3109F, 0.4102F, -0.2182F, 0.0F));

		PartDefinition Lowerjawmiddle_r3 = head.addOrReplaceChild("Lowerjawmiddle_r3", CubeListBuilder.create().texOffs(8, 44).addBox(0.2241F, -1.0567F, -0.0059F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0141F, 1.1891F, -4.3109F, 0.4102F, 0.2182F, 0.0F));

		PartDefinition Lowerjawmiddle_r4 = head.addOrReplaceChild("Lowerjawmiddle_r4", CubeListBuilder.create().texOffs(75, 71).addBox(0.0F, -0.4F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0141F, 0.4891F, -5.3109F, -0.0436F, 0.2182F, 0.0F));

		PartDefinition Lefteye_r1 = head.addOrReplaceChild("Lefteye_r1", CubeListBuilder.create().texOffs(71, 20).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.09F, 0.0893F, -6.1492F, 0.5742F, 0.147F, 0.0945F));

		PartDefinition Lefteye_r2 = head.addOrReplaceChild("Lefteye_r2", CubeListBuilder.create().texOffs(78, 6).addBox(-0.57F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.51F, -0.1033F, -3.6179F, 0.0F, 0.1969F, 0.0F));

		PartDefinition Upperjawslopefront_r1 = head.addOrReplaceChild("Upperjawslopefront_r1", CubeListBuilder.create().texOffs(60, 6).addBox(-0.5F, -0.5543F, 0.6239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(78, 22).addBox(-0.5F, -0.5543F, 0.1239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-0.5F, 1.2948F, -6.9313F, 1.0559F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r2 = head.addOrReplaceChild("Upperjawslopefront_r2", CubeListBuilder.create().texOffs(58, 60).addBox(-1.0F, -0.0787F, -0.0306F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.3033F, -6.6179F, 0.192F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r1 = head.addOrReplaceChild("Upperjawslopebase_r1", CubeListBuilder.create().texOffs(26, 8).addBox(-2.0F, -0.1493F, 0.4656F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 58).addBox(-1.5F, -0.1493F, -0.5344F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8533F, -3.6679F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r3 = head.addOrReplaceChild("Upperjawfront_r3", CubeListBuilder.create().texOffs(60, 1).addBox(0.0F, -0.9601F, -0.0039F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8467F, -4.3179F, 0.4123F, 0.1969F, -0.0289F));

		PartDefinition Upperjawfront_r4 = head.addOrReplaceChild("Upperjawfront_r4", CubeListBuilder.create().texOffs(68, 27).addBox(-0.5F, -0.995F, -0.0042F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8467F, -6.3179F, -0.0175F, 0.2608F, 0.0F));

		PartDefinition Upperjawfront_r5 = head.addOrReplaceChild("Upperjawfront_r5", CubeListBuilder.create().texOffs(19, 61).mirror().addBox(-0.8F, -0.3F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3533F, -4.0179F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition Upperjawfront_r6 = head.addOrReplaceChild("Upperjawfront_r6", CubeListBuilder.create().texOffs(19, 61).addBox(-0.2F, -0.3F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.011F)), PartPose.offsetAndRotation(-0.5F, -0.3533F, -4.0179F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition Upperjawbase_r1 = head.addOrReplaceChild("Upperjawbase_r1", CubeListBuilder.create().texOffs(66, 0).addBox(-1.5F, 1.2F, 0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -2.1533F, -3.1179F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Head_r1 = head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(10, 28).addBox(-2.0F, 0.25F, -0.65F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.4033F, -0.8179F, 0.8203F, 0.0F, 0.0F));

		PartDefinition Head_r2 = head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(57, 49).addBox(-2.0F, -1.45F, -0.35F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.5967F, -1.7179F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Head_r3 = head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(52, 10).addBox(-2.0F, -1.05F, 0.05F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3967F, -2.4179F, 0.1047F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(70, 31).addBox(0.73F, -0.55F, -2.5672F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(70, 31).mirror().addBox(-1.73F, -0.55F, -2.5672F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9467F, -0.2679F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r1 = jaw.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(19, 28).addBox(-0.5F, -0.9636F, -0.0127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.5755F, -6.0785F, 0.576F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r5 = jaw.addOrReplaceChild("Lowerjawmiddle_r5", CubeListBuilder.create().texOffs(67, 59).mirror().addBox(-0.7719F, -0.8054F, -1.6952F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.406F, -2.3586F, -0.009F, -0.2618F, 0.0023F));

		PartDefinition Lowerjawbase_r1 = jaw.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(70, 10).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(70, 10).addBox(1.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.9F, 0.1156F, -1.3936F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r2 = jaw.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(78, 38).mirror().addBox(-0.5F, -0.5F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(78, 38).addBox(1.3F, -0.5F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.9F, 0.1863F, -0.952F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r3 = jaw.addOrReplaceChild("Lowerjawbase_r3", CubeListBuilder.create().texOffs(78, 25).mirror().addBox(-0.5F, -0.2079F, -1.3248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 25).addBox(1.3F, -0.2079F, -1.3248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.006F, -0.0086F, -0.5585F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r4 = jaw.addOrReplaceChild("Lowerjawbase_r4", CubeListBuilder.create().texOffs(74, 55).mirror().addBox(-0.5F, 0.0254F, -0.9999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 55).addBox(1.3F, 0.0254F, -0.9999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -0.894F, -1.0086F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r5 = jaw.addOrReplaceChild("Lowerjawbase_r5", CubeListBuilder.create().texOffs(60, 28).mirror().addBox(-0.5F, -0.027F, -1.0012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 28).addBox(1.3F, -0.027F, -1.0012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -0.894F, -2.0086F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r6 = jaw.addOrReplaceChild("Lowerjawmiddle_r6", CubeListBuilder.create().texOffs(28, 31).mirror().addBox(-0.7741F, -1.0044F, -1.7035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.406F, -2.3586F, 0.0994F, -0.2606F, -0.0257F));

		PartDefinition Lowerjawmiddle_r7 = jaw.addOrReplaceChild("Lowerjawmiddle_r7", CubeListBuilder.create().texOffs(10, 38).mirror().addBox(-0.5F, -1.0044F, -1.9001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(10, 38).addBox(0.3F, -1.0044F, -1.9001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.406F, -2.3586F, 0.096F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r2 = jaw.addOrReplaceChild("Lowerjawfront_r2", CubeListBuilder.create().texOffs(69, 16).mirror().addBox(0.0094F, -0.8303F, -0.0649F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.021F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.406F, -6.0586F, -0.0089F, -0.2182F, 0.0019F));

		PartDefinition Lowerjawmiddle_r8 = jaw.addOrReplaceChild("Lowerjawmiddle_r8", CubeListBuilder.create().texOffs(75, 7).mirror().addBox(0.1F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7892F, -0.1344F, -4.1116F, 0.0849F, -0.131F, 0.0172F));

		PartDefinition Lowerjawfront_r3 = jaw.addOrReplaceChild("Lowerjawfront_r3", CubeListBuilder.create().texOffs(69, 16).addBox(-1.0094F, -0.8303F, -0.0649F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 0.406F, -6.0586F, -0.0089F, 0.2182F, -0.0019F));

		PartDefinition Lowerjawmiddle_r9 = jaw.addOrReplaceChild("Lowerjawmiddle_r9", CubeListBuilder.create().texOffs(67, 59).addBox(-0.2281F, -0.8054F, -1.6952F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.4F, 0.406F, -2.3586F, -0.009F, 0.2618F, -0.0023F));

		PartDefinition Lowerjawmiddle_r10 = jaw.addOrReplaceChild("Lowerjawmiddle_r10", CubeListBuilder.create().texOffs(28, 31).addBox(-0.2259F, -1.0044F, -1.7035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4F, 0.406F, -2.3586F, 0.0994F, 0.2606F, 0.0257F));

		PartDefinition Lowerjawmiddle_r11 = jaw.addOrReplaceChild("Lowerjawmiddle_r11", CubeListBuilder.create().texOffs(75, 7).addBox(-0.1F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7892F, -0.1344F, -4.1116F, 0.0849F, 0.131F, -0.0172F));

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