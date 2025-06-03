package fossils.fossils.client.blockentity.model.bajadasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BajadasaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg8;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck1;
	private final ModelPart neckBoneLeft1;
	private final ModelPart neckBoneRight1;
	private final ModelPart neck2;
	private final ModelPart neckBoneLeft2;
	private final ModelPart neckBoneRight2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart bone5;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart jaw;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart throat;

	public BajadasaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg3 = this.leftLeg.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg8 = this.leftLeg4.getChild("leftLeg8");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg3 = this.rightLeg.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg8 = this.rightLeg4.getChild("rightLeg8");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck1 = this.chest.getChild("neck1");
		this.neckBoneLeft1 = this.neck1.getChild("neckBoneLeft1");
		this.neckBoneRight1 = this.neck1.getChild("neckBoneRight1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neckBoneLeft2 = this.neck2.getChild("neckBoneLeft2");
		this.neckBoneRight2 = this.neck2.getChild("neckBoneRight2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.bone5 = this.neck4.getChild("bone5");
		this.head = this.neck4.getChild("head");
		this.bone = this.head.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.jaw = this.head.getChild("jaw");
		this.bone6 = this.jaw.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
		this.throat = this.jaw.getChild("throat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -29.5F, 11.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5F, -4.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(57, 60).mirror().addBox(-1.1F, -0.0312F, 0.018F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.4F, -4.433F, 2.4805F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 33).mirror().addBox(0.7828F, -3.7047F, -0.8334F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -5.2896F, -5.0663F, -0.4223F, -0.2764F, -0.8815F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(55, 46).mirror().addBox(-1.2122F, 0.4881F, -0.7648F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -5.2896F, -4.4663F, 0.0547F, 0.0738F, 1.705F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(112, 84).mirror().addBox(-2.7111F, -0.2584F, -0.9832F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -5.2896F, -4.4663F, 0.0019F, 0.1603F, 0.5209F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(35, 125).mirror().addBox(-5.5216F, 3.1136F, -0.9859F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -5.2896F, -4.4663F, -0.0909F, 0.1322F, -0.0961F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(91, 56).mirror().addBox(-1.1F, -0.2674F, -3.9444F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.4F, -5.533F, -0.2195F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(65, 95).mirror().addBox(-1.1F, -0.1188F, -0.4755F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4F, -5.433F, 0.1805F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(96, 63).mirror().addBox(-1.1F, -1.9493F, -2.9949F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 1.167F, 3.3805F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(63, 16).mirror().addBox(-0.3187F, 0.0077F, 0.0061F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 7.467F, -3.9195F, -0.2188F, -0.0368F, -0.4349F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-2.6199F, 6.431F, -0.1104F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4F, -0.633F, 2.8805F, -0.69F, -0.0368F, -0.4349F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.9965F, 0.9155F, -5.9819F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 0.367F, 1.4805F, 0.3068F, -0.0151F, -0.1739F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-0.9965F, -0.3724F, -3.9991F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 0.367F, 1.4805F, -0.4088F, -0.0151F, -0.1739F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(101, 31).mirror().addBox(-2.4644F, 0.2386F, 6.7691F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 83).mirror().addBox(-2.4644F, 0.6386F, 0.7691F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 0.367F, 1.4805F, -0.7904F, -0.0449F, -0.5394F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(0.5F, -0.5F, -1.4F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.6921F, -0.9484F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(13, 85).mirror().addBox(-1.1F, -1.9985F, -4.0409F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(32, 97).mirror().addBox(-1.1F, -2.7985F, -7.0409F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 0.367F, 1.4805F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(121, 110).mirror().addBox(0.7256F, -3.7159F, -0.5566F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -4.9896F, -3.5663F, -0.5429F, -0.409F, -0.8408F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(20, 127).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -6.098F, -2.4656F, -0.161F, 0.1252F, -0.1051F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(105, 112).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -6.098F, -2.4656F, -0.0598F, 0.1947F, 0.51F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(75, 77).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -6.098F, -2.4656F, 0.0642F, 0.143F, 1.706F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(91, 56).addBox(0.1F, -0.2674F, -3.9444F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.4F, -5.533F, -0.2195F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(57, 60).addBox(0.1F, -0.0312F, 0.018F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.4F, -4.433F, 2.4805F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(65, 95).addBox(0.1F, -0.1188F, -0.4755F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, -5.433F, 0.1805F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(96, 63).addBox(0.1F, -1.9493F, -2.9949F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.4F, 1.167F, 3.3805F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(63, 16).addBox(-0.6813F, 0.0077F, 0.0061F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 7.467F, -3.9195F, -0.2188F, 0.0368F, 0.4349F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 15).addBox(1.6199F, 6.431F, -0.1104F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, -0.633F, 2.8805F, -0.69F, 0.0368F, 0.4349F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 86).addBox(-0.0035F, 0.9155F, -5.9819F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 0.367F, 1.4805F, 0.3068F, 0.0151F, 0.1739F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(50, 0).addBox(-0.0035F, -0.3724F, -3.9991F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.4F, 0.367F, 1.4805F, -0.4088F, 0.0151F, 0.1739F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(101, 31).addBox(1.4644F, 0.2386F, 6.7691F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(56, 83).addBox(1.4644F, 0.6386F, 0.7691F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 0.367F, 1.4805F, -0.7904F, 0.0449F, 0.5394F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 24).addBox(-3.5F, -0.5F, -1.4F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0F, -2.6921F, -0.9484F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(13, 85).addBox(0.1F, -1.9985F, -4.0409F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F))
				.texOffs(32, 97).addBox(0.1F, -2.7985F, -7.0409F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 0.367F, 1.4805F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 35).addBox(-1.5F, -0.1813F, 0.9724F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -5.602F, -6.5203F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(35, 125).addBox(5.5216F, 3.1136F, -0.9859F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.2896F, -4.4663F, -0.0909F, -0.1322F, 0.0961F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(112, 84).addBox(2.7111F, -0.2584F, -0.9832F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.2896F, -4.4663F, 0.0019F, -0.1603F, -0.5209F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(55, 46).addBox(1.2122F, 0.4881F, -0.7648F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.2896F, -4.4663F, 0.0547F, -0.0738F, -1.705F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(60, 33).addBox(-0.7828F, -3.7047F, -0.8334F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.2896F, -5.0663F, -0.4223F, 0.2764F, 0.8815F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(26, 39).addBox(-1.1679F, -1.5627F, -0.3785F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.2896F, -5.0663F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(20, 30).addBox(-0.6679F, -3.8554F, 0.1246F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -6.1896F, -5.1663F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(33, 110).addBox(-1.1679F, -4.9137F, -0.2037F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6679F, -6.1896F, -5.1663F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(32, 117).addBox(-1.1679F, -7.2453F, 0.6734F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(108, 39).addBox(-2.1679F, -7.6839F, 1.1319F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -6.1896F, -5.1663F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(62, 46).addBox(-1.1679F, -1.45F, -0.1192F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -4.9896F, -3.5663F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(121, 110).addBox(-0.7256F, -3.7159F, -0.5566F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -4.9896F, -3.5663F, -0.5429F, 0.409F, 0.8408F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(100, 109).addBox(-1.1679F, -0.1167F, -0.8134F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6679F, -9.6896F, -0.0663F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(75, 77).addBox(-0.75F, -3.6443F, -1.9933F, 1.0F, 9.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(109, 24).addBox(-1.75F, -3.8828F, 0.8652F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(109, 31).addBox(-1.75F, -3.8828F, -0.9348F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -7.4783F, 4.618F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(80, 0).addBox(-0.25F, 0.1406F, 0.9213F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(81, 53).addBox(-0.25F, 0.1406F, -0.9787F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -7.4783F, 4.618F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(98, 76).addBox(0.0F, -6.4357F, -1.2401F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0695F, -0.3715F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(20, 127).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -6.098F, -2.4656F, -0.161F, -0.1252F, 0.1051F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(105, 112).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -6.098F, -2.4656F, -0.0598F, -0.1947F, -0.51F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(75, 77).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -6.098F, -2.4656F, 0.0642F, -0.143F, -1.706F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(109, 58).addBox(-1.5F, -10.4612F, -1.1353F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 51).addBox(-0.5F, -10.2226F, -2.1938F, 1.0F, 9.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0695F, -0.3715F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(84, 94).addBox(-0.5F, -7.155F, -0.8486F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -2.0695F, -0.3715F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(111, 118).addBox(-1.1679F, -2.627F, -0.76F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(115, 72).addBox(-2.1679F, -3.0656F, -0.3015F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -9.6896F, -0.0663F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(127, 80).addBox(-0.6679F, -0.0441F, -0.3593F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -9.6896F, -0.0663F, -0.5934F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, 0.45F, -0.1F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(43, 89).addBox(-1.1F, -2.1399F, -8.566F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3149F, 0.5895F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(44, 18).addBox(-2.1F, -1.1162F, -11.3177F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3149F, 0.5895F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(28, 89).addBox(-2.5F, -5.1295F, -13.1808F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3149F, 0.5895F, 0.3578F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.1101F, -13.6438F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(10, 94).addBox(-2.5F, -4.9704F, -20.0489F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(56, 72).addBox(-2.5F, -4.6261F, -26.6329F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(63, 16).addBox(0.1F, -2.3052F, -26.345F, 2.0F, 1.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.1833F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0318F, -8.3993F, -0.0578F, 0.001F, 0.0365F));

		PartDefinition cube_r59 = leftLeg4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(80, 40).addBox(-3.0F, -20.8973F, -19.9354F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(71, 60).addBox(-4.0F, -1.415F, -30.0624F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = leftLeg4.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg8.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(71, 33).addBox(-4.1915F, -3.5662F, -30.0624F, 8.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9658F, 27.9074F, 0.0514F, -0.01F, 0.1917F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, 0.45F, -0.1F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(66, 87).addBox(0.1F, -2.1399F, -8.566F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3149F, 0.5895F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(36, 43).addBox(-0.9F, -1.1162F, -11.3177F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3149F, 0.5895F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(86, 77).addBox(-1.5F, -5.1295F, -13.1808F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3149F, 0.5895F, 0.3578F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.1101F, -13.6438F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(92, 91).addBox(0.5F, -4.9704F, -20.0489F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(37, 70).addBox(0.5F, -4.6261F, -26.6329F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(57, 61).addBox(-2.1F, -2.3052F, -26.345F, 2.0F, 1.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.1833F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0318F, -8.3993F, -0.2498F, -0.001F, -0.0365F));

		PartDefinition cube_r68 = rightLeg4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(20, 24).addBox(-3.0F, -20.8973F, -19.9354F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(70, 46).addBox(-4.0F, -1.415F, -30.0624F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg8 = rightLeg4.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg8.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(21, 69).addBox(-3.8085F, -3.5662F, -30.0624F, 8.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9658F, 27.9074F, 0.0514F, 0.01F, -0.1917F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8F, 5.7F, -0.4903F, -0.077F, 0.0411F));

		PartDefinition cube_r71 = tail1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(20, 15).addBox(-1.0F, 0.0F, 6.9F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F))
				.texOffs(66, 0).addBox(-1.5F, 0.0F, -0.1F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.918F, 0.0389F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(5, 119).addBox(-0.5F, -2.5521F, -0.1446F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.464F, 11.4441F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 35).addBox(0.0F, -2.7913F, 0.2291F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.464F, 11.4441F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(84, 121).addBox(-0.5F, -2.7905F, -0.8303F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.064F, 13.2441F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(116, 23).addBox(-1.5F, -2.9351F, -0.3641F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.064F, 13.2441F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(34, 39).addBox(-0.5F, -2.732F, -0.7846F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.764F, 11.0441F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(110, 68).addBox(-1.5F, -2.8766F, -0.3184F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.764F, 11.0441F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r78 = tail1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(13, 65).addBox(0.0F, -3.9414F, -0.1277F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.464F, 9.4441F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r79 = tail1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(56, 115).addBox(-0.5F, -4.399F, -0.6114F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.464F, 9.4441F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r80 = tail1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(19, 123).addBox(-0.5F, 0.181F, -0.9476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -3.1062F, 9.1432F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r81 = tail1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(127, 86).addBox(0.0F, -0.4044F, -0.2954F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1062F, 9.1432F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r82 = tail1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(103, 69).addBox(-1.5F, -4.8716F, 0.8305F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7062F, 7.7432F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(65, 102).addBox(-0.5F, -4.6744F, 0.3753F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.7062F, 7.7432F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(112, 98).addBox(-0.5F, -3.8453F, 0.5016F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.7062F, 5.9432F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tail1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(32, 76).addBox(-0.5F, -2.6852F, 0.2502F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.2062F, 5.9432F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r86 = tail1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(17, 109).addBox(-1.5F, -3.9468F, 0.9508F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7062F, 5.9432F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r87 = tail1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(29, 30).addBox(0.0F, 0.1622F, 1.049F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7062F, 5.9432F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(70, 46).addBox(0.0F, -0.9561F, -0.3969F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2556F, 5.6335F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(115, 41).addBox(-1.5F, -3.8123F, 0.7734F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.7556F, 4.4335F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(10, 15).addBox(-0.5F, -0.5766F, -1.5104F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -4.2556F, 5.6335F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, -3.5171F, -0.2769F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.7556F, 4.4335F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(98, 4).addBox(-0.5F, 1.3703F, -1.9865F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -4.0778F, 3.2515F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(96, 98).addBox(-0.5F, -3.584F, -1.5504F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.6778F, 3.2515F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(116, 121).addBox(0.0F, 3.6F, 6.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 122).addBox(0.0F, 2.0F, 4.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 122).addBox(0.0F, 0.5F, 2.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 124).addBox(0.0F, -0.8F, 0.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1976F, 3.4352F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, -1.0548F, -1.5116F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -4.0778F, 3.2515F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(115, 48).addBox(-1.5F, -3.7808F, -0.597F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6778F, 3.2515F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(126, 115).addBox(0.0F, -1.5261F, -0.4853F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0778F, 3.2515F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5766F, -1.5104F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -5.2492F, 0.1713F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -6.6477F, -0.1079F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(109, 19).addBox(-1.5F, -1.8F, 0.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.2405F, -0.0242F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(127, 95).addBox(0.0F, -0.0561F, -0.3969F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.2492F, 0.1713F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(41, 97).addBox(-0.5F, 1.6817F, 7.6769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.2092F, -9.0771F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.918F, 12.9389F, 0.0958F, -0.2647F, 0.1258F));

		PartDefinition cube_r103 = tail2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(9, 123).addBox(-0.5F, -1.7575F, -0.2869F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9418F, 12.1043F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r104 = tail2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(124, 44).addBox(-0.5F, -1.354F, -0.338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.2418F, 11.5043F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r105 = tail2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(76, 127).addBox(-0.5F, -1.9021F, 0.1793F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9418F, 12.1043F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r106 = tail2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(119, 123).addBox(-0.5F, -1.7273F, -0.5389F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.2582F, 9.8543F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(71, 82).addBox(0.0F, -1.9539F, -0.0227F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7418F, 10.7543F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r108 = tail2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(122, 72).addBox(-0.5F, -1.8093F, -0.4889F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7418F, 10.7543F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r109 = tail2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(122, 76).addBox(-0.5F, -1.8093F, -0.4889F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9418F, 9.1543F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(83, 20).addBox(0.0F, -1.9539F, -0.0227F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9418F, 9.1543F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(24, 124).addBox(-0.5F, -1.7273F, -0.5389F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.0582F, 8.2543F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r112 = tail2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(14, 123).addBox(-0.5F, -2.9973F, 0.1425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1418F, 6.9543F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(127, 77).addBox(0.0F, -3.1419F, 0.6086F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1418F, 6.9543F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r114 = tail2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 121).addBox(-0.5F, -1.7273F, -0.5389F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.1418F, 6.9543F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(93, 124).addBox(-0.5F, -1.6812F, -0.5733F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3418F, 6.4543F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(117, 45).addBox(-1.5F, -1.8258F, -0.1071F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3418F, 6.4543F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(23, 30).addBox(0.0F, -1.2665F, 0.0017F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4418F, 5.3543F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r118 = tail2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 124).addBox(-0.5F, -1.7253F, -0.4587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.4418F, 5.3543F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r119 = tail2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(79, 124).addBox(-0.5F, -0.5623F, -0.257F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.5128F, 4.4623F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r120 = tail2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(26, 30).addBox(0.0F, -0.1018F, 0.1933F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5128F, 4.4623F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r121 = tail2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(118, 92).addBox(-1.5F, -1.9068F, 0.1434F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5128F, 4.5623F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r122 = tail2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(103, 123).addBox(-0.5F, -1.7622F, -0.3227F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.5128F, 4.5623F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r123 = tail2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(108, 123).addBox(-0.5F, -1.6188F, -0.6962F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.8128F, 3.4623F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r124 = tail2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(119, 14).addBox(-1.5F, -1.7634F, -0.2301F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8128F, 3.4623F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r125 = tail2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(5, 0).addBox(0.0F, -0.1018F, 0.1933F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8128F, 2.9623F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r126 = tail2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(55, 121).addBox(-0.5F, -0.5623F, -0.257F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.8128F, 2.9623F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r127 = tail2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(74, 123).addBox(-0.5F, -1.82F, -0.8721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.2459F, 2.3052F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r128 = tail2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(123, 20).addBox(0.0F, 8.3F, 12.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 125).addBox(0.0F, 10.7F, 14.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 121).addBox(0.0F, 6.8F, 10.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 11).addBox(0.0F, 4.9F, 8.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1157F, -9.5037F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r129 = tail2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(119, 52).addBox(-1.5F, -1.9646F, -0.4059F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2459F, 2.3052F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r130 = tail2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(65, 82).addBox(0.0F, -2.0652F, 0.1549F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9459F, 0.5052F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r131 = tail2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(95, 119).addBox(-0.5F, -2.5253F, -0.3125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.9459F, 0.5052F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r132 = tail2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(16, 55).addBox(-1.0F, -0.2F, -0.1F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6819F, -0.0333F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4181F, 10.6667F, 0.1664F, -0.0933F, 0.0286F));

		PartDefinition cube_r133 = tail3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.6564F, 0.0794F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r134 = tail3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(65, 123).addBox(-0.5F, -0.3563F, 0.0648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6598F, 11.1376F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r135 = tail3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(122, 99).addBox(-0.5F, -0.4292F, 0.0833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6598F, 9.1376F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r136 = tail3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(122, 103).addBox(-0.5F, -0.3796F, -0.0004F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6598F, 7.1376F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r137 = tail3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(122, 3).addBox(-0.5F, -0.507F, -0.2119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6598F, 5.4376F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r138 = tail3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(127, 74).addBox(-0.5F, -1.9265F, -0.0603F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5598F, 3.4376F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r139 = tail3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(14, 127).addBox(0.0F, 20.35F, 24.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 127).addBox(0.0F, 18.75F, 22.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 102).addBox(0.0F, 16.05F, 20.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 110).addBox(0.0F, 14.65F, 18.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 123).addBox(0.0F, 12.7F, 16.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6976F, -20.3704F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r140 = tail3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(123, 7).addBox(-0.5F, -1.7819F, -0.5265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5598F, 3.4376F, -0.5061F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.9152F, -0.277F, 1.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0564F, 12.7794F, 0.0706F, -0.4444F, -0.0207F));

		PartDefinition cube_r141 = tail4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(127, 41).addBox(0.0F, 0.3126F, -0.0714F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 60).addBox(0.0F, -5.524F, 10.4495F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 60).addBox(0.0F, -4.4952F, 8.7228F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 48).addBox(0.0F, -3.5331F, 7.0444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 60).addBox(0.0F, -2.5115F, 5.2855F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 20).addBox(0.0F, -1.59F, 3.5267F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 127).addBox(0.0F, -0.5684F, 1.7679F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6034F, 3.1582F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r142 = tail4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(69, 16).addBox(0.0F, 5.7F, 10.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 56).addBox(0.0F, 4.6F, 8.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 68).addBox(0.0F, 3.6F, 6.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 71).addBox(0.0F, 2.6F, 4.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 127).addBox(0.0F, 0.5F, 2.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 127).addBox(0.0F, -0.5F, 0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 13).addBox(0.0F, -1.8F, -1.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4162F, 2.8283F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(123, 30).addBox(-0.5F, -0.6689F, 0.6293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6034F, 0.3582F, -0.5061F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5152F, 16.723F, 0.262F, -0.6454F, 0.0554F));

		PartDefinition cube_r144 = tail5.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(96, 25).addBox(0.0F, -11.6768F, 22.8511F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 97).addBox(0.0F, -10.7737F, 21.026F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 97).addBox(0.0F, -9.9192F, 19.2884F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 4).addBox(0.0F, -9.0161F, 17.4633F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 117).addBox(0.0F, -8.1616F, 15.7257F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 118).addBox(0.0F, -7.307F, 13.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 25).addBox(0.0F, -6.507F, 11.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0882F, -13.5648F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail5.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(105, 26).addBox(0.0F, 12.6919F, 22.2937F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 83).addBox(0.0F, 11.632F, 20.5976F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 33).addBox(0.0F, 10.5722F, 18.9015F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 69).addBox(0.0F, 9.4124F, 17.2054F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 107).addBox(0.0F, 8.3525F, 15.5093F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 36).addBox(0.0F, 7.3927F, 13.8132F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 60).addBox(0.0F, 6.2329F, 12.1171F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9314F, -13.8947F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail5.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(17, 39).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.3603F, 0.0752F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7397F, 13.5752F, 0.1718F, -0.5375F, 0.0426F));

		PartDefinition cube_r147 = tail6.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2767F, 0.0761F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r148 = tail6.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(90, 46).addBox(0.0F, -15.007F, 29.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 95).addBox(0.0F, -14.107F, 27.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 96).addBox(0.0F, -12.4081F, 24.3474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 96).addBox(0.0F, -13.207F, 25.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8255F, -27.1184F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r149 = tail6.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(71, 95).addBox(0.0F, 13.8517F, 23.9898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1941F, -27.4482F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(57, 48).addBox(-0.5F, -0.4476F, -0.0306F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.6233F, 11.8761F, -0.3702F, -0.294F, 0.0841F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -0.5249F, -0.2583F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0524F, 9.9694F, -0.6093F, -0.3714F, 0.1307F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.7F, -6.4F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(22, 85).addBox(-0.6679F, -4.0593F, 0.6109F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -2.7896F, -0.2663F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(113, 107).addBox(-2.1679F, -3.2348F, -0.2742F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(50, 119).addBox(-1.1679F, -2.9962F, -0.7327F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6679F, -5.9896F, 1.7337F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(104, 9).addBox(-1.1679F, -4.0172F, -0.3558F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.6679F, -2.7896F, -0.2663F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(105, 85).addBox(-1.1679F, -3.9686F, 0.3009F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6679F, -2.7896F, -0.2663F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(68, 72).mirror().addBox(0.5617F, -3.638F, -1.3038F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -1.2896F, -0.2663F, -0.4692F, -0.33F, -0.8675F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(29, 101).mirror().addBox(-2.5959F, -1.2324F, -0.8765F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -4.9896F, -0.9663F, -0.4339F, -0.2899F, -0.8782F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(46, 104).mirror().addBox(-2.5959F, -1.2324F, -0.8765F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -5.7896F, -3.0663F, -0.4339F, -0.2899F, -0.8782F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(104, 0).mirror().addBox(-2.5959F, -1.2324F, -0.8765F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -6.0896F, -5.6663F, -0.388F, -0.2359F, -0.8902F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(51, 106).mirror().addBox(-1.7272F, -1.8404F, -1.2577F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -5.2628F, -7.9713F, -0.3434F, -0.1814F, -0.8994F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(105, 43).mirror().addBox(-1.7272F, -1.8404F, -1.2577F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -4.7628F, -10.7713F, -0.3434F, -0.1814F, -0.8994F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(89, 85).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.298F, 0.2344F, 0.0547F, 0.0738F, 1.705F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(108, 112).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.298F, 0.2344F, 0.0019F, 0.1603F, 0.5209F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(32, 55).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.298F, 0.2344F, -0.0909F, 0.1322F, -0.0961F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(5, 115).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.098F, -1.8656F, 0.0174F, -0.0234F, 1.8788F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(24, 109).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.098F, -1.8656F, 0.013F, 0.1173F, 0.0916F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(93, 112).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.098F, -1.8656F, 0.0781F, 0.0886F, 0.7051F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(85, 67).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.898F, -3.6656F, -0.0039F, -0.0712F, 1.9671F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(45, 111).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.898F, -3.6656F, 0.114F, 0.0504F, 0.7949F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(74, 95).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.898F, -3.6656F, 0.0646F, 0.1066F, 0.1846F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(19, 35).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.498F, -5.8656F, 0.1502F, 0.0126F, 0.8135F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(58, 126).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.498F, -5.8656F, -0.0249F, -0.1193F, 1.9865F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(78, 94).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.498F, -5.8656F, 0.1162F, 0.0963F, 0.2073F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(84, 126).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.898F, -8.2656F, -0.0391F, -0.1512F, 1.9885F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(38, 112).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.898F, -8.2656F, 0.1742F, -0.0128F, 0.8135F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(59, 92).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.898F, -8.2656F, 0.1504F, 0.089F, 0.2105F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(98, 126).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.198F, -10.9656F, -0.0754F, -0.2308F, 1.9954F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(41, 112).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.198F, -10.9656F, 0.2343F, -0.0762F, 0.8108F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(62, 92).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.198F, -10.9656F, 0.236F, 0.0705F, 0.2173F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(68, 72).addBox(-0.5617F, -3.638F, -1.3038F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -1.2896F, -0.2663F, -0.4692F, 0.33F, 0.8675F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(121, 116).addBox(-1.1679F, -1.2101F, -0.221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -1.2896F, -0.2663F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r180 = body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 103).addBox(-1.1679F, 2.7269F, -1.2846F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -4.9896F, -0.9663F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r181 = body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(29, 101).addBox(2.5959F, -1.2324F, -0.8765F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -4.9896F, -0.9663F, -0.4339F, 0.2899F, 0.8782F));

		PartDefinition cube_r182 = body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(103, 92).addBox(-0.5F, -2.7128F, -0.6744F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.5553F, -0.873F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r183 = body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(34, 103).addBox(-0.5F, -2.6111F, -1.0982F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -3.5553F, -0.873F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r184 = body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(61, 115).addBox(-0.5F, -3.2304F, -0.3473F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(108, 77).addBox(-1.5F, -3.969F, 0.1111F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.1553F, -0.973F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r185 = body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(28, 85).addBox(0.0F, -2.5257F, -0.4658F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5553F, -0.873F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r186 = body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 115).addBox(-0.5F, -3.4011F, -0.6762F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(109, 0).addBox(-1.5F, -3.6396F, -0.2177F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.1553F, -3.273F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r187 = body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(108, 92).addBox(-0.5F, -4.1172F, -0.7444F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.2553F, -3.273F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r188 = body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(75, 109).addBox(-0.5F, -3.982F, -1.411F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -2.2553F, -3.273F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r189 = body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(103, 99).addBox(-1.1679F, 2.7269F, -1.2846F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.7896F, -3.0663F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r190 = body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(46, 104).addBox(2.5959F, -1.2324F, -0.8765F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.7896F, -3.0663F, -0.4339F, 0.2899F, 0.8782F));

		PartDefinition cube_r191 = body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(8, 86).addBox(0.0F, -3.9089F, -0.7185F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2553F, -3.273F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r192 = body.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(101, 104).addBox(-1.1679F, 2.7269F, -1.2846F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -6.0896F, -5.6663F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r193 = body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(104, 0).addBox(2.5959F, -1.2324F, -0.8765F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -6.0896F, -5.6663F, -0.388F, 0.2359F, 0.8902F));

		PartDefinition cube_r194 = body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(7, 51).addBox(-1.1679F, -3.4927F, -0.239F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(114, 63).addBox(-2.1679F, -3.7313F, 0.2195F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -6.0896F, -6.0663F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r195 = body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(16, 86).addBox(-0.6679F, -0.723F, 0.2559F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -6.0896F, -6.0663F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r196 = body.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(51, 106).addBox(1.7272F, -1.8404F, -1.2577F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.2628F, -7.9713F, -0.3434F, 0.1814F, 0.8994F));

		PartDefinition cube_r197 = body.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(94, 105).addBox(-1.1679F, 1.6032F, -1.368F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.2628F, -7.9713F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r198 = body.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(91, 98).addBox(-0.5F, -1.2667F, -0.4798F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -8.5823F, -7.5132F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r199 = body.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(89, 20).addBox(0.0F, 1.505F, 0.0345F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.5823F, -7.5132F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r200 = body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(115, 5).addBox(-1.5F, -1.5053F, -0.0213F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.5823F, -7.5132F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(10, 109).addBox(-1.5F, -4.1086F, 0.0093F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(27, 115).addBox(-0.5F, -3.87F, -0.4492F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -5.5827F, -10.2574F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(40, 89).addBox(0.0F, 0.0066F, -0.0522F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.6827F, -10.1574F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(115, 35).addBox(-1.1679F, -1.3631F, 0.1165F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(0.6679F, -4.7628F, -11.1713F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(105, 43).addBox(1.7272F, -1.8404F, -1.2577F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -4.7628F, -10.7713F, -0.3434F, 0.1814F, 0.8994F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(102, 60).addBox(-1.1679F, 1.6032F, -1.368F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -4.7628F, -10.7713F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(89, 85).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.298F, 0.2344F, 0.0547F, -0.0738F, -1.705F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(108, 112).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.298F, 0.2344F, 0.0019F, -0.1603F, -0.5209F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(32, 55).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.298F, 0.2344F, -0.0909F, -0.1322F, 0.0961F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(5, 115).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.098F, -1.8656F, 0.0174F, 0.0234F, -1.8788F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(24, 109).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.098F, -1.8656F, 0.013F, -0.1173F, -0.0916F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(93, 112).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.098F, -1.8656F, 0.0781F, -0.0886F, -0.7051F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(85, 67).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.898F, -3.6656F, -0.0039F, 0.0712F, -1.9671F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(45, 111).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.898F, -3.6656F, 0.114F, -0.0504F, -0.7949F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(74, 95).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.898F, -3.6656F, 0.0646F, -0.1066F, -0.1846F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(19, 35).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.498F, -5.8656F, 0.1502F, -0.0126F, -0.8135F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(58, 126).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.498F, -5.8656F, -0.0249F, 0.1193F, -1.9865F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(78, 94).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.498F, -5.8656F, 0.1162F, -0.0963F, -0.2073F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(84, 126).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.898F, -8.2656F, -0.0391F, 0.1512F, -1.9885F));

		PartDefinition cube_r219 = body.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(38, 112).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.898F, -8.2656F, 0.1742F, 0.0128F, -0.8135F));

		PartDefinition cube_r220 = body.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(59, 92).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.898F, -8.2656F, 0.1504F, -0.089F, -0.2105F));

		PartDefinition cube_r221 = body.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(98, 126).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.198F, -10.9656F, -0.0754F, 0.2308F, -1.9954F));

		PartDefinition cube_r222 = body.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(41, 112).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.198F, -10.9656F, 0.2343F, 0.0762F, -0.8108F));

		PartDefinition cube_r223 = body.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(62, 92).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.198F, -10.9656F, 0.236F, -0.0705F, -0.2173F));

		PartDefinition cube_r224 = body.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(22, 20).addBox(-1.5F, 0.0679F, -0.0311F, 3.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5164F, -13.9618F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r225 = body.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 0).addBox(-7.5F, -6.231F, -7.6827F, 15.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.0F, 0.8F, 0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -13.6F, 0.1834F, 0.0429F, 0.008F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(19, 101).mirror().addBox(0.4982F, -7.2243F, 0.4069F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.798F, -0.0656F, -0.228F, 0.1173F, -0.0818F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(9, 101).mirror().addBox(-0.4162F, -6.7634F, -0.1738F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.4403F, -0.9741F, -1.3826F, -0.1055F, 0.1294F, -0.067F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(24, 101).mirror().addBox(-0.252F, -5.3188F, -0.2385F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6226F, -2.2007F, -3.267F, 0.0347F, 0.1348F, -0.0903F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-0.1362F, -2.7132F, -0.2585F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6226F, -0.8007F, -4.967F, 0.2661F, 0.0602F, -0.1366F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(114, 52).mirror().addBox(-0.2698F, -6.2196F, -0.6374F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6226F, -0.8007F, -4.967F, 0.1053F, 0.1448F, -0.0732F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-0.7751F, -2.5924F, -0.6526F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4099F, -6.4925F, 0.5265F, 0.0934F, -0.1166F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(5, 108).mirror().addBox(-1.1135F, -4.8061F, -0.6524F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.3099F, -7.6925F, 0.4935F, 0.1616F, -0.0132F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(19, 101).addBox(-1.4982F, -7.2243F, 0.4069F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1661F, -0.798F, -0.0656F, -0.228F, -0.1173F, 0.0818F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(43, 64).mirror().addBox(-2.7349F, -0.9597F, -0.8054F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6099F, -6.6925F, 1.3695F, -0.3614F, 0.6962F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(43, 119).mirror().addBox(-1.6186F, -0.5433F, -0.6782F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4226F, -0.3007F, -7.667F, 1.6129F, 0.0557F, -0.9239F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(65, 120).mirror().addBox(-2.8682F, -0.6042F, 0.1198F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.4226F, -0.3007F, -7.667F, 1.5561F, 0.0702F, -1.5772F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(13, 69).mirror().addBox(-2.1947F, -0.6123F, 0.7888F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.798F, 0.4344F, 1.2184F, -0.2347F, 0.7407F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(63, 27).mirror().addBox(-2.4763F, 0.0561F, 0.3353F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4403F, -0.9741F, -1.3826F, 1.2451F, -0.2582F, 0.7342F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(104, 82).mirror().addBox(-2.289F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4403F, -0.8741F, -3.2826F, 1.3132F, -0.3161F, 0.7149F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(71, 67).mirror().addBox(-2.289F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4403F, -0.4741F, -5.3826F, 1.3132F, -0.3161F, 0.7149F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-0.5F, 3.3851F, 7.0039F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 96).addBox(16.5F, 3.3851F, 7.0039F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-8.5F, 9.3938F, -2.837F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(19, 39).mirror().addBox(-0.5F, -2.8303F, 7.4598F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 39).addBox(16.5F, -2.8303F, 7.4598F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5F, 9.3938F, -2.837F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(44, 18).mirror().addBox(-0.2207F, -1.3013F, -3.1652F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 9.3938F, -1.437F, 1.4743F, -0.2584F, -0.2726F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(89, 25).mirror().addBox(-0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8725F, 16.1701F, -0.3886F, 0.6987F, -0.1804F, -1.1492F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(15, 55).mirror().addBox(-0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9725F, 15.8701F, -0.1886F, 0.8295F, -0.1511F, -1.2572F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(105, 26).mirror().addBox(-0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5725F, 15.3701F, -0.1886F, 0.899F, -0.0187F, -1.2483F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(51, 18).mirror().addBox(-0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0725F, 15.0701F, -0.6886F, 1.0874F, -0.127F, -0.8195F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(55, 35).mirror().addBox(-0.075F, -0.5072F, -1.5589F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0725F, 15.0701F, -0.6886F, 1.1316F, -0.2441F, -1.0579F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(75, 28).mirror().addBox(-0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5725F, 15.3701F, -0.1886F, 0.9198F, -0.1801F, -1.4557F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(105, 34).mirror().addBox(-0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9725F, 15.8701F, -0.1886F, 0.8775F, -0.3238F, -1.4599F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(90, 107).mirror().addBox(-0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8725F, 16.1701F, -0.3886F, 0.7486F, -0.3771F, -1.3292F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(0.0F, 1.5F, -0.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8992F, 14.0025F, -5.3911F, 1.6114F, -0.4584F, -1.535F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(1.3341F, -4.9901F, -3.0019F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4F, 14.4938F, -3.137F, 1.3197F, -0.7021F, -0.8786F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(127, 33).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.898F, -5.0656F, 0.357F, 0.0545F, 0.0675F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(66, 109).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.898F, -5.0656F, 0.3268F, -0.1561F, 0.6427F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(96, 85).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.898F, -5.0656F, -0.1179F, -0.3457F, 1.8501F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(127, 2).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.198F, -2.9656F, -0.0786F, -0.2112F, 1.8393F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(90, 112).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.198F, -2.9656F, 0.2149F, -0.0716F, 0.6555F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(121, 61).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.198F, -2.9656F, 0.2174F, 0.0634F, 0.0593F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(44, 18).mirror().addBox(-0.9275F, 0.9421F, 0.1172F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4403F, -0.9741F, -1.3826F, -0.0339F, -0.1156F, 1.9185F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(97, 110).mirror().addBox(-3.0916F, 0.2207F, -0.1522F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4403F, -0.9741F, -1.3826F, 0.1434F, 0.0057F, 0.7443F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(81, 94).mirror().addBox(-6.1081F, 3.2879F, -0.155F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4403F, -0.9741F, -1.3826F, 0.1145F, 0.0867F, 0.138F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(61, 126).mirror().addBox(-1.4253F, 0.3767F, -0.2355F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.798F, 0.4344F, -0.0379F, -0.1328F, 1.9363F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(56, 92).mirror().addBox(-5.4176F, 2.9263F, -0.4455F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.798F, 0.4344F, 0.1321F, 0.0864F, 0.1569F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(48, 111).mirror().addBox(-2.7334F, -0.4715F, -0.4427F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.798F, 0.4344F, 0.1577F, -0.0046F, 0.7616F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(85, 108).mirror().addBox(-0.4484F, -4.962F, -0.2245F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7837F, 7.6429F, -7.0078F, -0.279F, -0.0904F, -1.1776F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(34, 39).mirror().addBox(-0.2207F, -4.8359F, -3.4669F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 9.3938F, -1.437F, 0.9856F, -0.2584F, -0.2726F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(80, 21).mirror().addBox(-0.5F, -1.558F, 0.3178F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(80, 21).addBox(16.5F, -1.558F, 0.3178F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-8.5F, 8.1938F, -1.437F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(13, 69).addBox(-0.8053F, -0.6123F, 0.7888F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1661F, -0.798F, 0.4344F, 1.2184F, 0.2347F, -0.7407F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(15, 55).addBox(-1.6661F, -2.1119F, 0.3732F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1661F, -0.798F, -0.0656F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(63, 27).addBox(-0.5237F, 0.0561F, 0.3353F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4403F, -0.9741F, -1.3826F, 1.2451F, 0.2582F, -0.7342F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(9, 101).addBox(-0.5838F, -6.7634F, -0.1738F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.4403F, -0.9741F, -1.3826F, -0.1055F, -0.1294F, 0.067F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(21, 55).addBox(-0.9403F, -1.9358F, -0.2099F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4403F, -0.9741F, -1.3826F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(104, 82).addBox(-0.711F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4403F, -0.8741F, -3.2826F, 1.3132F, 0.3161F, -0.7149F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(101, 76).addBox(-0.9403F, -1.3358F, -0.8099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4403F, -0.8741F, -3.2826F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(24, 101).addBox(-0.748F, -5.3188F, -0.2385F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6226F, -2.2007F, -3.267F, 0.0347F, -0.1348F, 0.0903F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(5, 108).addBox(0.1135F, -4.8061F, -0.6524F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -3.3099F, -7.6925F, 0.4935F, -0.1616F, 0.0132F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(50, 0).addBox(-0.2249F, -2.5924F, -0.6526F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.4099F, -6.4925F, 0.5265F, -0.0934F, 0.1166F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(43, 64).addBox(-0.2651F, -0.9597F, -0.8054F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.6099F, -6.6925F, 1.3695F, 0.3614F, -0.6962F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(22, 85).addBox(-0.1188F, -1.0601F, -2.1463F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.6099F, -6.6925F, -0.1507F, 0.0181F, -0.2612F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(114, 52).addBox(-0.7302F, -6.2196F, -0.6374F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6226F, -0.8007F, -4.967F, 0.1053F, -0.1448F, 0.0732F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(58, 0).addBox(-0.8638F, -2.7132F, -0.2585F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6226F, -0.8007F, -4.967F, 0.2661F, -0.0602F, 0.1366F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(71, 67).addBox(-0.711F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4403F, -0.4741F, -5.3826F, 1.3132F, 0.3161F, -0.7149F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(96, 25).addBox(-0.3F, -0.4F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.3099F, -4.6925F, -0.2182F, 0.0F, -0.2618F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(44, 18).addBox(-0.7793F, -1.3013F, -3.1652F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(8.5F, 9.3938F, -1.437F, 1.4743F, 0.2584F, 0.2726F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(89, 25).addBox(0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8725F, 16.1701F, -0.3886F, 0.6987F, 0.1804F, 1.1492F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(15, 55).addBox(0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9725F, 15.8701F, -0.1886F, 0.8295F, 0.1511F, 1.2572F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(105, 26).addBox(0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5725F, 15.3701F, -0.1886F, 0.899F, 0.0187F, 1.2483F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(51, 18).addBox(0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0725F, 15.0701F, -0.6886F, 1.0874F, 0.127F, 0.8195F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(55, 35).addBox(0.075F, -0.5072F, -1.5589F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0725F, 15.0701F, -0.6886F, 1.1316F, 0.2441F, 1.0579F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(75, 28).addBox(0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5725F, 15.3701F, -0.1886F, 0.9198F, 0.1801F, 1.4557F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(105, 34).addBox(0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9725F, 15.8701F, -0.1886F, 0.8775F, 0.3238F, 1.4599F));

		PartDefinition cube_r293 = chest.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(90, 107).addBox(0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8725F, 16.1701F, -0.3886F, 0.7486F, 0.3771F, 1.3292F));

		PartDefinition cube_r294 = chest.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(0, 76).addBox(-1.0F, 1.5F, -0.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8992F, 14.0025F, -5.3911F, 1.6114F, 0.4584F, 1.535F));

		PartDefinition cube_r295 = chest.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(0, 35).addBox(-2.3341F, -4.9901F, -3.0019F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 14.4938F, -3.137F, 1.3197F, 0.7021F, 0.8786F));

		PartDefinition cube_r296 = chest.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(127, 33).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.898F, -5.0656F, 0.357F, -0.0545F, -0.0675F));

		PartDefinition cube_r297 = chest.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(66, 109).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.898F, -5.0656F, 0.3268F, 0.1561F, -0.6427F));

		PartDefinition cube_r298 = chest.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(96, 85).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.898F, -5.0656F, -0.1179F, 0.3457F, -1.8501F));

		PartDefinition cube_r299 = chest.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(127, 2).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.198F, -2.9656F, -0.0786F, 0.2112F, -1.8393F));

		PartDefinition cube_r300 = chest.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(90, 112).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.198F, -2.9656F, 0.2149F, 0.0716F, -0.6555F));

		PartDefinition cube_r301 = chest.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(121, 61).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.198F, -2.9656F, 0.2174F, -0.0634F, -0.0593F));

		PartDefinition cube_r302 = chest.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(44, 18).addBox(0.9275F, 0.9421F, 0.1172F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4403F, -0.9741F, -1.3826F, -0.0339F, 0.1156F, -1.9185F));

		PartDefinition cube_r303 = chest.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(97, 110).addBox(3.0916F, 0.2207F, -0.1522F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4403F, -0.9741F, -1.3826F, 0.1434F, -0.0057F, -0.7443F));

		PartDefinition cube_r304 = chest.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(81, 94).addBox(6.1081F, 3.2879F, -0.155F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4403F, -0.9741F, -1.3826F, 0.1145F, -0.0867F, -0.138F));

		PartDefinition cube_r305 = chest.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(61, 126).addBox(1.4253F, 0.3767F, -0.2355F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.798F, 0.4344F, -0.0379F, 0.1328F, -1.9363F));

		PartDefinition cube_r306 = chest.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(56, 92).addBox(5.4176F, 2.9263F, -0.4455F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.798F, 0.4344F, 0.1321F, -0.0864F, -0.1569F));

		PartDefinition cube_r307 = chest.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(48, 111).addBox(2.7334F, -0.4715F, -0.4427F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.798F, 0.4344F, 0.1577F, 0.0046F, -0.7616F));

		PartDefinition cube_r308 = chest.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(69, 114).addBox(-0.5F, -2.0F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.6879F, -7.0723F, 0.0583F, 0.0F, 0.0F));

		PartDefinition cube_r309 = chest.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(85, 108).addBox(-0.5516F, -4.962F, -0.2245F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7837F, 7.6429F, -7.0078F, -0.279F, 0.0904F, 1.1776F));

		PartDefinition cube_r310 = chest.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(34, 39).addBox(-0.7793F, -4.8359F, -3.4669F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 9.3938F, -1.437F, 0.9856F, 0.2584F, 0.2726F));

		PartDefinition cube_r311 = chest.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(88, 125).mirror().addBox(-1.1141F, 0.0061F, -3.0127F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4226F, -0.3007F, -7.667F, 1.449F, -0.2234F, -0.0037F));

		PartDefinition cube_r312 = chest.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(88, 125).addBox(0.1141F, 0.0061F, -3.0127F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4226F, -0.3007F, -7.667F, 1.449F, 0.2234F, 0.0037F));

		PartDefinition cube_r313 = chest.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(65, 120).addBox(0.8682F, -0.6042F, 0.1198F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.4226F, -0.3007F, -7.667F, 1.5561F, -0.0702F, 1.5772F));

		PartDefinition cube_r314 = chest.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(43, 119).addBox(-0.3814F, -0.5433F, -0.6782F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4226F, -0.3007F, -7.667F, 1.6129F, -0.0557F, 0.9239F));

		PartDefinition cube_r315 = chest.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(55, 33).addBox(-1.5F, -22.0F, -16.75F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 20.7F, 9.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.8412F, 14.4424F, -2.8629F, 0.8423F, 0.1016F, -0.0827F));

		PartDefinition cube_r316 = leftArm.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(77, 11).addBox(-1.0F, -0.769F, -4.1748F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6412F, -0.6964F, 0.7617F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r317 = leftArm.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(91, 49).addBox(1.4938F, -1.7202F, -2.0809F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6412F, -0.6964F, 0.7617F, 0.9622F, -0.1663F, 0.2596F));

		PartDefinition cube_r318 = leftArm.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(47, 80).addBox(1.4938F, -2.4302F, -7.0105F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.6412F, -0.6964F, 0.7617F, 1.4072F, -0.1663F, 0.2596F));

		PartDefinition cube_r319 = leftArm.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(85, 67).addBox(-1.0F, -1.5524F, -7.5818F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6412F, -0.6964F, 0.7617F, 1.3439F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4079F, 6.2547F, -1.2204F, -1.3382F, -0.0599F, 0.3883F));

		PartDefinition cube_r320 = leftArm2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(98, 56).addBox(0.3113F, -1.5823F, -6.966F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F))
				.texOffs(90, 6).addBox(0.8113F, -1.5823F, -11.766F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.12F))
				.texOffs(0, 76).addBox(0.1113F, -0.0823F, -11.866F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2333F, -4.5355F, 2.3754F, 0.4591F, 1.3759F, -1.1041F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 6.8721F, -1.3089F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r321 = leftArm3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(65, 82).addBox(6.4672F, -1.1391F, -14.3965F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.1271F, -12.3962F, 3.6332F, 1.4318F, 0.1059F, 0.6471F));

		PartDefinition cube_r322 = leftArm3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(21, 94).addBox(1.8F, -1.1502F, -16.8157F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(80, 0).addBox(-1.7F, -2.1502F, -16.8157F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(94, 33).addBox(-2.2F, -1.1502F, -16.8157F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.1271F, -12.3962F, 3.6332F, 1.3963F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.8412F, 14.4424F, -2.8629F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r323 = rightArm.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(19, 76).addBox(-2.0F, -0.769F, -4.1748F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6412F, -0.6964F, 0.7617F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r324 = rightArm.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(55, 46).addBox(-2.4938F, -1.7202F, -2.0809F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6412F, -0.6964F, 0.7617F, 0.9622F, 0.1663F, -0.2596F));

		PartDefinition cube_r325 = rightArm.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(32, 80).addBox(-2.4938F, -2.4302F, -7.0105F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.6412F, -0.6964F, 0.7617F, 1.4072F, 0.1663F, -0.2596F));

		PartDefinition cube_r326 = rightArm.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(80, 53).addBox(-2.0F, -1.5524F, -7.5818F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6412F, -0.6964F, 0.7617F, 1.3439F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4079F, 6.2547F, -1.2204F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r327 = rightArm2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(98, 49).addBox(-2.3113F, -1.5823F, -6.966F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F))
				.texOffs(49, 70).addBox(-1.8113F, -1.5823F, -11.766F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.12F))
				.texOffs(73, 67).addBox(-2.1113F, -0.0823F, -11.866F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2333F, -4.5355F, 2.3754F, 0.4591F, -1.3759F, 1.1041F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 6.8721F, -1.3089F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r328 = rightArm3.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(77, 20).addBox(-7.4672F, -1.1391F, -14.3965F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1271F, -12.3962F, 3.6332F, 1.4318F, -0.1059F, -0.6471F));

		PartDefinition cube_r329 = rightArm3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(93, 42).addBox(-2.8F, -1.1502F, -16.8157F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(32, 58).addBox(-2.3F, -2.1502F, -16.8157F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(89, 85).addBox(1.2F, -1.1502F, -16.8157F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1271F, -12.3962F, 3.6332F, 1.3963F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(0, 65).addBox(-1.0F, -1.0001F, -7.8245F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.6F, -8.5F, 0.0651F, 0.0843F, 0.049F));

		PartDefinition cube_r330 = neck1.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(80, 108).mirror().addBox(-0.4567F, -4.7777F, -0.86F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6226F, -4.9008F, -1.3916F, 0.6476F, 0.1535F, -0.0522F));

		PartDefinition cube_r331 = neck1.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(49, 70).mirror().addBox(-0.1319F, -2.7277F, -0.3573F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6226F, -2.5008F, -0.8916F, 0.4048F, 0.0785F, -0.127F));

		PartDefinition cube_r332 = neck1.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(9, 114).mirror().addBox(-0.8813F, -3.8604F, -0.8859F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -7.2008F, -5.6916F, 0.755F, 0.1889F, -0.0526F));

		PartDefinition cube_r333 = neck1.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(19, 114).mirror().addBox(-0.4021F, -3.7603F, -0.742F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -4.1008F, -3.9916F, 0.5281F, 0.1889F, -0.0526F));

		PartDefinition cube_r334 = neck1.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(12, 24).mirror().addBox(0.0649F, -2.7084F, -0.1187F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -1.6008F, -3.9916F, 0.2478F, 0.0632F, -0.1898F));

		PartDefinition cube_r335 = neck1.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(102, 21).mirror().addBox(-0.1483F, 0.4393F, 0.0844F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -2.6008F, -4.4916F, 0.0887F, 0.1448F, -0.1829F));

		PartDefinition cube_r336 = neck1.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(116, 0).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4733F, -1.7108F, -4.6323F, 2.6329F, 0.1759F, -0.3519F));

		PartDefinition cube_r337 = neck1.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(20, 15).mirror().addBox(-1.4004F, -3.9586F, -0.8081F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9807F, -7.9504F, -10.0855F, 0.8383F, 0.1633F, -0.1088F));

		PartDefinition cube_r338 = neck1.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(100, 84).mirror().addBox(-0.5F, -5.1F, -0.9F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9807F, -4.2504F, -6.9855F, 0.6638F, 0.1633F, -0.1088F));

		PartDefinition cube_r339 = neck1.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(7, 35).mirror().addBox(-0.0324F, -1.3871F, 0.3866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -2.1067F, -7.2499F, 0.42F, 0.095F, -0.1762F));

		PartDefinition cube_r340 = neck1.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(39, 102).mirror().addBox(-0.1185F, 0.1416F, -0.054F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -2.8067F, -7.3499F, 0.0021F, 0.1284F, -0.1947F));

		PartDefinition cube_r341 = neck1.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(74, 118).mirror().addBox(-0.0496F, -2.0798F, -0.1275F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -2.1067F, -7.2499F, 0.2439F, 0.1294F, -0.1528F));

		PartDefinition cube_r342 = neck1.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(116, 19).mirror().addBox(-0.3668F, -1.9007F, -1.7822F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -2.8067F, -7.3499F, 2.4192F, 0.1452F, -0.3651F));

		PartDefinition cube_r343 = neck1.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(102, 21).addBox(-0.8517F, 0.4393F, 0.0844F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1226F, -2.6008F, -4.4916F, 0.0887F, -0.1448F, 0.1829F));

		PartDefinition cube_r344 = neck1.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(9, 114).addBox(-0.1187F, -3.8604F, -0.8859F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1226F, -7.2008F, -5.6916F, 0.755F, -0.1889F, 0.0526F));

		PartDefinition cube_r345 = neck1.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(19, 114).addBox(-0.5979F, -3.7603F, -0.742F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1226F, -4.1008F, -3.9916F, 0.5281F, -0.1889F, 0.0526F));

		PartDefinition cube_r346 = neck1.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(12, 24).addBox(-1.0649F, -2.7084F, -0.1187F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1226F, -1.6008F, -3.9916F, 0.2478F, -0.0632F, 0.1898F));

		PartDefinition cube_r347 = neck1.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(116, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4733F, -1.7108F, -4.6323F, 2.6329F, -0.1759F, 0.3519F));

		PartDefinition cube_r348 = neck1.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(125, 90).mirror().addBox(-1.0805F, -0.1926F, -0.3952F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, 1.4992F, -1.8916F, 1.4978F, -0.2217F, 0.0279F));

		PartDefinition cube_r349 = neck1.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(0, 126).mirror().addBox(-1.1573F, -0.2333F, -2.91F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -0.8008F, -4.4916F, 1.5384F, -0.2223F, -0.0235F));

		PartDefinition cube_r350 = neck1.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(120, 120).mirror().addBox(-2.7769F, -0.5635F, 0.1198F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -0.8008F, -4.4916F, 1.5556F, 0.1575F, -1.5773F));

		PartDefinition cube_r351 = neck1.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(120, 34).mirror().addBox(-1.5456F, -0.5026F, -0.6232F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -0.8008F, -4.4916F, 1.6658F, 0.1253F, -0.9191F));

		PartDefinition cube_r352 = neck1.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(54, 126).mirror().addBox(-1.1347F, -0.2284F, -3.1917F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -1.0067F, -7.3499F, 1.5921F, -0.2207F, -0.0353F));

		PartDefinition cube_r353 = neck1.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(116, 31).mirror().addBox(-3.0212F, -0.6252F, 0.2234F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -1.0067F, -7.3499F, 1.5496F, 0.2094F, -1.6041F));

		PartDefinition cube_r354 = neck1.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-1.7791F, -0.6635F, -0.7416F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -1.0067F, -7.3499F, 1.698F, 0.1668F, -0.9144F));

		PartDefinition cube_r355 = neck1.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(125, 90).addBox(0.0805F, -0.1926F, -0.3952F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1226F, 1.4992F, -1.8916F, 1.4978F, 0.2217F, -0.0279F));

		PartDefinition cube_r356 = neck1.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(121, 27).mirror().addBox(-2.9595F, -0.645F, 0.1198F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -1.2008F, -1.2916F, 1.557F, -0.0694F, -1.5772F));

		PartDefinition cube_r357 = neck1.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(91, 33).mirror().addBox(-1.6916F, -0.5839F, -0.7332F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -1.2008F, -1.2916F, 1.5287F, -0.0557F, -0.9239F));

		PartDefinition cube_r358 = neck1.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(90, 13).mirror().addBox(-2.289F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4403F, -1.3742F, -1.3072F, 1.3132F, -0.3161F, 0.7149F));

		PartDefinition cube_r359 = neck1.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(121, 27).addBox(0.9595F, -0.645F, 0.1198F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1226F, -1.2008F, -1.2916F, 1.557F, 0.0694F, 1.5772F));

		PartDefinition cube_r360 = neck1.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(91, 33).addBox(-0.3084F, -0.5839F, -0.7332F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1226F, -1.2008F, -1.2916F, 1.5287F, 0.0557F, 0.9239F));

		PartDefinition cube_r361 = neck1.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(120, 34).addBox(-0.4544F, -0.5026F, -0.6232F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1226F, -0.8008F, -4.4916F, 1.6658F, -0.1253F, 0.9191F));

		PartDefinition cube_r362 = neck1.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(120, 120).addBox(0.7769F, -0.5635F, 0.1198F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1226F, -0.8008F, -4.4916F, 1.5556F, -0.1575F, 1.5773F));

		PartDefinition cube_r363 = neck1.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(0, 126).addBox(0.1573F, -0.2333F, -2.91F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1226F, -0.8008F, -4.4916F, 1.5384F, 0.2223F, 0.0235F));

		PartDefinition cube_r364 = neck1.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(39, 102).addBox(-0.8815F, 0.1416F, -0.054F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0766F, -2.8067F, -7.3499F, 0.0021F, -0.1284F, 0.1947F));

		PartDefinition cube_r365 = neck1.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(54, 126).addBox(0.1347F, -0.2284F, -3.1917F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0766F, -1.0067F, -7.3499F, 1.5921F, 0.2207F, 0.0353F));

		PartDefinition cube_r366 = neck1.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(116, 31).addBox(1.0212F, -0.6252F, 0.2234F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.0766F, -1.0067F, -7.3499F, 1.5496F, -0.2094F, 1.6041F));

		PartDefinition cube_r367 = neck1.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(82, 77).addBox(-0.2209F, -0.6635F, -0.7416F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0766F, -1.0067F, -7.3499F, 1.698F, -0.1668F, 0.9144F));

		PartDefinition cube_r368 = neck1.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(116, 19).addBox(-0.6332F, -1.9007F, -1.7822F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0766F, -2.8067F, -7.3499F, 2.4192F, -0.1452F, 0.3651F));

		PartDefinition cube_r369 = neck1.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(7, 35).addBox(-0.9676F, -1.3871F, 0.3866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0766F, -2.1067F, -7.2499F, 0.42F, -0.095F, 0.1762F));

		PartDefinition cube_r370 = neck1.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(74, 118).addBox(-0.9504F, -2.0798F, -0.1275F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.0766F, -2.1067F, -7.2499F, 0.2439F, -0.1294F, 0.1528F));

		PartDefinition cube_r371 = neck1.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(20, 15).addBox(0.4004F, -3.9586F, -0.8081F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9807F, -7.9504F, -10.0855F, 0.8383F, -0.1633F, 0.1088F));

		PartDefinition cube_r372 = neck1.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(100, 84).addBox(-0.5F, -5.1F, -0.9F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9807F, -4.2504F, -6.9855F, 0.6638F, -0.1633F, 0.1088F));

		PartDefinition cube_r373 = neck1.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(80, 108).addBox(-0.5433F, -4.7777F, -0.86F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6226F, -4.9008F, -1.3916F, 0.6476F, -0.1535F, 0.0522F));

		PartDefinition cube_r374 = neck1.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(49, 70).addBox(-0.8681F, -2.7277F, -0.3573F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6226F, -2.5008F, -0.8916F, 0.4048F, -0.0785F, 0.127F));

		PartDefinition cube_r375 = neck1.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(100, 39).addBox(-0.9403F, -1.3358F, -0.8099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4403F, -1.3742F, -1.3072F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r376 = neck1.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(90, 13).addBox(-0.711F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4403F, -1.3742F, -1.3072F, 1.3132F, 0.3161F, -0.7149F));

		PartDefinition neckBoneLeft1 = neck1.addOrReplaceChild("neckBoneLeft1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.75F, -8.731F, -11.2089F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neckBoneRight1 = neck1.addOrReplaceChild("neckBoneRight1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.75F, -8.731F, -11.2089F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(43, 58).addBox(-1.0F, -0.8484F, -8.7843F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1001F, -7.6245F, 0.0697F, 0.0434F, -0.0046F));

		PartDefinition cube_r377 = neck2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(43, 126).mirror().addBox(0.0F, -1.7F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3097F, 1.759F, -1.758F, 1.3285F, -0.2226F, -0.0195F));

		PartDefinition cube_r378 = neck2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(24, 121).mirror().addBox(-1.1014F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.3736F, -2.1905F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r379 = neck2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(121, 17).mirror().addBox(-0.7F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6528F, -0.2339F, -2.4393F, 1.5708F, 0.0F, -0.925F));

		PartDefinition cube_r380 = neck2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(78, 115).mirror().addBox(-0.039F, -0.1558F, -1.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.869F, -0.9061F, -5.7119F, 2.3354F, 0.1155F, -0.1465F));

		PartDefinition cube_r381 = neck2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(38, 97).mirror().addBox(-0.5014F, -0.7804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.4054F, 0.6736F, -4.6905F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r382 = neck2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(120, 80).mirror().addBox(-0.7F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1528F, 0.0661F, -4.9393F, 1.5708F, 0.0F, -0.925F));

		PartDefinition cube_r383 = neck2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(126, 51).mirror().addBox(-0.695F, -1.4561F, 0.5061F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7562F, 1.8331F, -4.4399F, 1.5921F, -0.2207F, -0.0353F));

		PartDefinition cube_r384 = neck2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(113, 125).mirror().addBox(-0.5975F, -1.4781F, -0.4969F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7562F, 1.3331F, -7.4399F, 1.5921F, -0.2207F, -0.0353F));

		PartDefinition cube_r385 = neck2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(120, 83).mirror().addBox(-1.5014F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.0264F, -7.6905F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r386 = neck2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(120, 37).mirror().addBox(-0.7F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6528F, -0.6339F, -7.9393F, 1.5708F, 0.0F, -0.925F));

		PartDefinition cube_r387 = neck2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(114, 27).mirror().addBox(-0.039F, -0.1558F, -1.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.869F, -0.9061F, -8.7119F, 2.3354F, 0.1155F, -0.1465F));

		PartDefinition cube_r388 = neck2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(43, 126).addBox(-1.0F, -1.7F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3097F, 1.759F, -1.758F, 1.3285F, 0.2226F, 0.0195F));

		PartDefinition cube_r389 = neck2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(24, 121).addBox(-0.8986F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, 0.3736F, -2.1905F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r390 = neck2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(113, 125).addBox(-0.4025F, -1.4781F, -0.4969F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7562F, 1.3331F, -7.4399F, 1.5921F, 0.2207F, 0.0353F));

		PartDefinition cube_r391 = neck2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(120, 83).addBox(-0.4986F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -0.0264F, -7.6905F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r392 = neck2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(120, 37).addBox(-1.3F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6528F, -0.6339F, -7.9393F, 1.5708F, 0.0F, 0.925F));

		PartDefinition cube_r393 = neck2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(115, 76).mirror().addBox(-0.039F, -0.1558F, -1.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.869F, -1.0061F, -3.3119F, 2.3272F, 0.162F, -0.1991F));

		PartDefinition cube_r394 = neck2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-1.5719F, -0.5285F, -0.44F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -6.9853F, -4.5871F, 0.5586F, 0.1554F, -0.1199F));

		PartDefinition cube_r395 = neck2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(50, 97).mirror().addBox(-1.5609F, -7.0724F, -0.8604F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -7.2853F, -4.2871F, 0.8728F, 0.1554F, -0.1199F));

		PartDefinition cube_r396 = neck2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(56, 108).mirror().addBox(-0.7213F, -4.9108F, -0.646F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -3.5853F, -1.6871F, 0.6459F, 0.1554F, -0.1199F));

		PartDefinition cube_r397 = neck2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(108, 5).mirror().addBox(-0.6127F, 1.2357F, -2.8461F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -4.7853F, -1.7871F, 0.7352F, 0.0794F, -0.1837F));

		PartDefinition cube_r398 = neck2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(89, 120).mirror().addBox(-0.2074F, -2.357F, -0.6036F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -1.5853F, -2.0871F, 0.0353F, 0.107F, -0.1692F));

		PartDefinition cube_r399 = neck2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(117, 97).mirror().addBox(-0.1835F, -2.2025F, -0.4012F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -1.6853F, -1.8871F, -0.0138F, 0.0605F, -0.1926F));

		PartDefinition cube_r400 = neck2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(70, 107).mirror().addBox(-2.1117F, -4.7987F, -0.6916F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -9.5853F, -10.1871F, 1.2038F, 0.1517F, -0.1307F));

		PartDefinition cube_r401 = neck2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(116, 116).mirror().addBox(-1.6269F, -2.6174F, -0.8128F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -8.2853F, -8.0871F, 0.9595F, 0.1517F, -0.1307F));

		PartDefinition cube_r402 = neck2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(61, 108).mirror().addBox(-0.7204F, -4.9283F, -0.7867F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -4.8853F, -4.9871F, 0.7326F, 0.1517F, -0.1307F));

		PartDefinition cube_r403 = neck2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(113, 92).mirror().addBox(-0.232F, -3.0098F, -0.9625F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.3853F, -3.8871F, 0.3312F, 0.1517F, -0.1307F));

		PartDefinition cube_r404 = neck2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(117, 102).mirror().addBox(-0.2217F, -2.5062F, -0.4008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.3853F, -3.9871F, 0.5229F, 0.1411F, -0.1447F));

		PartDefinition cube_r405 = neck2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(118, 9).mirror().addBox(-0.1774F, -0.2563F, -0.0867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.7264F, -5.5905F, 2.1813F, -0.3801F, 0.476F));

		PartDefinition cube_r406 = neck2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(100, 116).mirror().addBox(-0.1774F, -0.2563F, -0.0867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.7264F, -8.5905F, 2.1813F, -0.3801F, 0.476F));

		PartDefinition cube_r407 = neck2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-0.1932F, -2.6756F, -0.2985F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.1853F, -6.6871F, 0.5753F, 0.1484F, -0.1371F));

		PartDefinition cube_r408 = neck2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(85, 115).mirror().addBox(-0.2213F, -3.1639F, -0.8008F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.1853F, -6.6871F, 0.3837F, 0.1583F, -0.1226F));

		PartDefinition cube_r409 = neck2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(51, 113).mirror().addBox(-0.2213F, -6.544F, 0.3083F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.1853F, -6.6871F, 0.7852F, 0.1583F, -0.1226F));

		PartDefinition cube_r410 = neck2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(116, 111).mirror().addBox(-1.5162F, -3.156F, -0.7082F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -7.2853F, -10.2871F, 1.0823F, 0.1664F, -0.1113F));

		PartDefinition cube_r411 = neck2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(14, 101).mirror().addBox(-1.5162F, -8.6722F, 0.0077F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -7.2853F, -10.2871F, 1.3267F, 0.1664F, -0.1113F));

		PartDefinition cube_r412 = neck2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(14, 101).addBox(0.5162F, -8.6722F, 0.0077F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -7.2853F, -10.2871F, 1.3267F, -0.1664F, 0.1113F));

		PartDefinition cube_r413 = neck2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(116, 111).addBox(0.5162F, -3.156F, -0.7082F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -7.2853F, -10.2871F, 1.0823F, -0.1664F, 0.1113F));

		PartDefinition cube_r414 = neck2.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(0, 24).addBox(-0.8068F, -2.6756F, -0.2985F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -2.1853F, -6.6871F, 0.5753F, -0.1484F, 0.1371F));

		PartDefinition cube_r415 = neck2.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(51, 113).addBox(-0.7787F, -6.544F, 0.3083F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -2.1853F, -6.6871F, 0.7852F, -0.1583F, 0.1226F));

		PartDefinition cube_r416 = neck2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(85, 115).addBox(-0.7787F, -3.1639F, -0.8008F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -2.1853F, -6.6871F, 0.3837F, -0.1583F, 0.1226F));

		PartDefinition cube_r417 = neck2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(39, 107).addBox(-0.5F, -1.4419F, -1.2308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.9463F, -7.1208F, -0.3236F, -0.0587F, 0.2254F));

		PartDefinition cube_r418 = neck2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(100, 116).addBox(-0.8226F, -0.2563F, -0.0867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.7264F, -8.5905F, 2.1813F, 0.3801F, -0.476F));

		PartDefinition cube_r419 = neck2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(114, 27).addBox(-0.961F, -0.1558F, -1.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.869F, -0.9061F, -8.7119F, 2.3354F, -0.1155F, 0.1465F));

		PartDefinition cube_r420 = neck2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(115, 76).addBox(-0.961F, -0.1558F, -1.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.869F, -1.0061F, -3.3119F, 2.3272F, -0.162F, 0.1991F));

		PartDefinition cube_r421 = neck2.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(121, 17).addBox(-1.3F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6528F, -0.2339F, -2.4393F, 1.5708F, 0.0F, 0.925F));

		PartDefinition cube_r422 = neck2.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(106, 107).addBox(-0.5F, -1.4419F, -0.8308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -1.0463F, -1.7208F, -0.3236F, -0.0587F, 0.2254F));

		PartDefinition cube_r423 = neck2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(117, 97).addBox(-0.8165F, -2.2025F, -0.4012F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -1.6853F, -1.8871F, -0.0138F, -0.0605F, 0.1926F));

		PartDefinition cube_r424 = neck2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(108, 5).addBox(-0.3873F, 1.2357F, -2.8461F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -4.7853F, -1.7871F, 0.7352F, -0.0794F, 0.1837F));

		PartDefinition cube_r425 = neck2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(89, 120).addBox(-0.7926F, -2.357F, -0.6036F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -1.5853F, -2.0871F, 0.0353F, -0.107F, 0.1692F));

		PartDefinition cube_r426 = neck2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(0, 108).addBox(0.5719F, -0.5285F, -0.44F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -6.9853F, -4.5871F, 0.5586F, -0.1554F, 0.1199F));

		PartDefinition cube_r427 = neck2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(50, 97).addBox(0.5609F, -7.0724F, -0.8604F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -7.2853F, -4.2871F, 0.8728F, -0.1554F, 0.1199F));

		PartDefinition cube_r428 = neck2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(56, 108).addBox(-0.2787F, -4.9108F, -0.646F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -3.5853F, -1.6871F, 0.6459F, -0.1554F, 0.1199F));

		PartDefinition cube_r429 = neck2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(113, 92).addBox(-0.768F, -3.0098F, -0.9625F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -2.3853F, -3.8871F, 0.3312F, -0.1517F, 0.1307F));

		PartDefinition cube_r430 = neck2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(70, 107).addBox(1.1117F, -4.7987F, -0.6916F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -9.5853F, -10.1871F, 1.2038F, -0.1517F, 0.1307F));

		PartDefinition cube_r431 = neck2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(116, 116).addBox(0.6269F, -2.6174F, -0.8128F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -8.2853F, -8.0871F, 0.9595F, -0.1517F, 0.1307F));

		PartDefinition cube_r432 = neck2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(61, 108).addBox(-0.2796F, -4.9283F, -0.7867F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -4.8853F, -4.9871F, 0.7326F, -0.1517F, 0.1307F));

		PartDefinition cube_r433 = neck2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(117, 102).addBox(-0.7783F, -2.5062F, -0.4008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -2.3853F, -3.9871F, 0.5229F, -0.1411F, 0.1447F));

		PartDefinition cube_r434 = neck2.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(108, 48).addBox(-0.5F, -1.4419F, -0.8308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.9463F, -4.1208F, -0.3236F, -0.0587F, 0.2254F));

		PartDefinition cube_r435 = neck2.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(118, 9).addBox(-0.8226F, -0.2563F, -0.0867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.7264F, -5.5905F, 2.1813F, 0.3801F, -0.476F));

		PartDefinition cube_r436 = neck2.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(78, 115).addBox(-0.961F, -0.1558F, -1.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.869F, -0.9061F, -5.7119F, 2.3354F, -0.1155F, 0.1465F));

		PartDefinition cube_r437 = neck2.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(120, 80).addBox(-1.3F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1528F, 0.0661F, -4.9393F, 1.5708F, 0.0F, 0.925F));

		PartDefinition cube_r438 = neck2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(38, 97).addBox(-0.4986F, -0.7804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.4054F, 0.6736F, -4.6905F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r439 = neck2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(126, 51).addBox(-0.305F, -1.4561F, 0.5061F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7562F, 1.8331F, -4.4399F, 1.5921F, 0.2207F, 0.0353F));

		PartDefinition neckBoneLeft2 = neck2.addOrReplaceChild("neckBoneLeft2", CubeListBuilder.create(), PartPose.offset(0.25F, -2.2793F, -5.4687F));

		PartDefinition neckBoneRight2 = neck2.addOrReplaceChild("neckBoneRight2", CubeListBuilder.create(), PartPose.offset(-0.25F, -2.2793F, -5.4687F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(80, 85).addBox(-0.5F, -0.7015F, -5.771F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1484F, -8.7843F, 0.2024F, 0.1283F, 0.0262F));

		PartDefinition cube_r440 = neck3.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(115, 88).mirror().addBox(0.161F, 0.1442F, -1.6523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.869F, -0.8577F, -2.4275F, 2.3367F, 0.017F, -0.1514F));

		PartDefinition cube_r441 = neck3.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(17, 120).mirror().addBox(-0.7F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9528F, 0.4145F, -1.4549F, 1.5708F, 0.0F, -0.925F));

		PartDefinition cube_r442 = neck3.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(95, 39).mirror().addBox(-0.5014F, -0.7804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2054F, 1.022F, -1.2062F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r443 = neck3.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(31, 126).mirror().addBox(-0.5876F, -1.1903F, 0.7153F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7562F, 2.3815F, -0.9555F, 1.5921F, -0.2207F, -0.0353F));

		PartDefinition cube_r444 = neck3.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(126, 20).mirror().addBox(-0.5876F, -1.1903F, 0.7153F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7562F, 2.3815F, -3.5555F, 1.5921F, -0.2207F, -0.0353F));

		PartDefinition cube_r445 = neck3.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(94, 63).mirror().addBox(-0.5014F, -0.7804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2054F, 1.022F, -3.8062F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r446 = neck3.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(10, 120).mirror().addBox(-0.7F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9528F, 0.4145F, -4.0549F, 1.5708F, 0.0F, -0.925F));

		PartDefinition cube_r447 = neck3.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(115, 84).mirror().addBox(0.161F, 0.1442F, -1.6523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.869F, -0.8577F, -5.0275F, 2.3367F, 0.017F, -0.1514F));

		PartDefinition cube_r448 = neck3.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(126, 20).addBox(-0.4124F, -1.1903F, 0.7153F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7562F, 2.3815F, -3.5555F, 1.5921F, 0.2207F, 0.0353F));

		PartDefinition cube_r449 = neck3.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(94, 63).addBox(-0.4986F, -0.7804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2054F, 1.022F, -3.8062F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r450 = neck3.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(10, 120).addBox(-1.3F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9528F, 0.4145F, -4.0549F, 1.5708F, 0.0F, 0.925F));

		PartDefinition cube_r451 = neck3.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(84, 103).mirror().addBox(-0.7F, -1.4419F, -0.8308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.8979F, -0.8365F, -0.3236F, 0.0587F, -0.2254F));

		PartDefinition cube_r452 = neck3.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(116, 58).mirror().addBox(-0.5494F, -0.2191F, -0.559F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -3.4369F, -1.1028F, 0.0743F, 0.0595F, -0.1727F));

		PartDefinition cube_r453 = neck3.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(43, 89).mirror().addBox(-0.2064F, -2.0837F, 0.0776F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -1.4369F, -1.1028F, 0.3187F, 0.0595F, -0.1727F));

		PartDefinition cube_r454 = neck3.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(117, 67).mirror().addBox(-0.6249F, -2.4226F, -0.6479F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -3.7369F, -1.2028F, 0.667F, 0.1692F, -0.0687F));

		PartDefinition cube_r455 = neck3.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(28, 108).mirror().addBox(-1.4055F, -4.6631F, -0.8425F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -7.7369F, -5.5028F, 1.272F, 0.1541F, 0.086F));

		PartDefinition cube_r456 = neck3.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(14, 114).mirror().addBox(-1.3535F, -0.3877F, -0.8465F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -7.6369F, -5.2028F, 0.9209F, 0.1722F, 0.0481F));

		PartDefinition cube_r457 = neck3.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(51, 89).mirror().addBox(-0.5967F, -2.7613F, -0.3607F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -3.0369F, -3.9028F, 0.844F, 0.1786F, -0.038F));

		PartDefinition cube_r458 = neck3.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(111, 112).mirror().addBox(-0.876F, -6.1709F, 0.209F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -3.0369F, -3.9028F, 1.0976F, 0.1612F, 0.0775F));

		PartDefinition cube_r459 = neck3.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(122, 68).mirror().addBox(-0.2625F, -1.7286F, -0.9318F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -1.9369F, -2.9028F, 0.3856F, 0.1097F, -0.1461F));

		PartDefinition cube_r460 = neck3.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(-0.7F, -1.3419F, -1.0308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.8979F, -3.4365F, -0.3236F, 0.0587F, -0.2254F));

		PartDefinition cube_r461 = neck3.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.2625F, -1.7739F, -0.5555F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -1.9369F, -2.9028F, 0.6299F, 0.1097F, -0.1461F));

		PartDefinition cube_r462 = neck3.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(111, 112).addBox(-0.124F, -6.1709F, 0.209F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -3.0369F, -3.9028F, 1.0976F, -0.1612F, -0.0775F));

		PartDefinition cube_r463 = neck3.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(51, 89).addBox(-0.4033F, -2.7613F, -0.3607F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -3.0369F, -3.9028F, 0.844F, -0.1786F, 0.038F));

		PartDefinition cube_r464 = neck3.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(122, 68).addBox(-0.7375F, -1.7286F, -0.9318F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8461F, -1.9369F, -2.9028F, 0.3856F, -0.1097F, 0.1461F));

		PartDefinition cube_r465 = neck3.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(115, 84).addBox(-1.161F, 0.1442F, -1.6523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.869F, -0.8577F, -5.0275F, 2.3367F, -0.017F, 0.1514F));

		PartDefinition cube_r466 = neck3.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(0, 86).addBox(-0.7375F, -1.7739F, -0.5555F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -1.9369F, -2.9028F, 0.6299F, -0.1097F, 0.1461F));

		PartDefinition cube_r467 = neck3.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(87, 6).addBox(-0.3F, -1.3419F, -1.0308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.8979F, -3.4365F, -0.3236F, -0.0587F, 0.2254F));

		PartDefinition cube_r468 = neck3.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(31, 126).addBox(-0.4124F, -1.1903F, 0.7153F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7562F, 2.3815F, -0.9555F, 1.5921F, 0.2207F, 0.0353F));

		PartDefinition cube_r469 = neck3.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(95, 39).addBox(-0.4986F, -0.7804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2054F, 1.022F, -1.2062F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r470 = neck3.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(17, 120).addBox(-1.3F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9528F, 0.4145F, -1.4549F, 1.5708F, 0.0F, 0.925F));

		PartDefinition cube_r471 = neck3.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(84, 103).addBox(-0.3F, -1.4419F, -0.8308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.8979F, -0.8365F, -0.3236F, -0.0587F, 0.2254F));

		PartDefinition cube_r472 = neck3.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(115, 88).addBox(-1.161F, 0.1442F, -1.6523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.869F, -0.8577F, -2.4275F, 2.3367F, -0.017F, 0.1514F));

		PartDefinition cube_r473 = neck3.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(116, 58).addBox(-0.4506F, -0.2191F, -0.559F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8461F, -3.4369F, -1.1028F, 0.0743F, -0.0595F, 0.1727F));

		PartDefinition cube_r474 = neck3.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(43, 89).addBox(-0.7936F, -2.0837F, 0.0776F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -1.4369F, -1.1028F, 0.3187F, -0.0595F, 0.1727F));

		PartDefinition cube_r475 = neck3.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(28, 108).addBox(0.4055F, -4.6631F, -0.8425F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -7.7369F, -5.5028F, 1.272F, -0.1541F, -0.086F));

		PartDefinition cube_r476 = neck3.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(14, 114).addBox(0.3535F, -0.3877F, -0.8465F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -7.6369F, -5.2028F, 0.9209F, -0.1722F, -0.0481F));

		PartDefinition cube_r477 = neck3.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(117, 67).addBox(-0.3751F, -2.4226F, -0.6479F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -3.7369F, -1.2028F, 0.667F, -0.1692F, 0.0687F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2985F, -5.571F, 0.539F, 0.1502F, 0.0893F));

		PartDefinition cube_r478 = neck4.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(107, 14).addBox(0.0F, -1.5744F, -0.9084F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.2193F, -4.0547F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r479 = neck4.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(123, 11).mirror().addBox(-0.5014F, -0.7804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.4765F, -4.4352F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r480 = neck4.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(123, 0).mirror().addBox(-0.474F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.4765F, -4.4352F, 1.5708F, 0.0F, -0.5323F));

		PartDefinition cube_r481 = neck4.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(31, 122).mirror().addBox(0.1226F, 0.8437F, -0.7867F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -1.0765F, -6.1352F, 1.7617F, -0.1379F, 0.5857F));

		PartDefinition cube_r482 = neck4.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(64, 127).mirror().addBox(-0.3671F, -1.4439F, 0.1699F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7574F, 0.6701F, -4.0528F, 1.4265F, -0.2652F, -0.05F));

		PartDefinition cube_r483 = neck4.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(67, 127).mirror().addBox(-0.6964F, -1.1748F, -0.4913F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7574F, 0.6701F, -2.0528F, 1.4265F, -0.2652F, -0.05F));

		PartDefinition cube_r484 = neck4.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(124, 65).mirror().addBox(-0.474F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.4765F, -2.4352F, 1.5708F, 0.0F, -0.5323F));

		PartDefinition cube_r485 = neck4.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(104, 120).mirror().addBox(-1.5014F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.4765F, -2.4352F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r486 = neck4.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(122, 40).mirror().addBox(0.4226F, 0.8437F, -0.7867F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -1.0765F, -4.1352F, 1.7617F, -0.1379F, 0.5857F));

		PartDefinition cube_r487 = neck4.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(37, 120).mirror().addBox(0.3226F, -0.1563F, -0.7867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.8765F, -1.8352F, 1.7617F, -0.1379F, 0.5857F));

		PartDefinition cube_r488 = neck4.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(38, 125).mirror().addBox(-0.474F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.0765F, -0.5352F, 1.5708F, 0.0F, -0.5323F));

		PartDefinition cube_r489 = neck4.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(120, 107).mirror().addBox(-1.5014F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.0765F, -0.5352F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r490 = neck4.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(126, 37).mirror().addBox(-0.6819F, -1.0741F, -0.4564F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7574F, 1.0701F, -0.1528F, 1.4265F, -0.2652F, -0.05F));

		PartDefinition cube_r491 = neck4.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(31, 122).addBox(-1.1226F, 0.8437F, -0.7867F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -1.0765F, -6.1352F, 1.7617F, 0.1379F, -0.5857F));

		PartDefinition cube_r492 = neck4.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(123, 11).addBox(-0.4986F, -0.7804F, -0.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -0.4765F, -4.4352F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r493 = neck4.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(64, 127).addBox(-0.6329F, -1.4439F, 0.1699F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7574F, 0.6701F, -4.0528F, 1.4265F, 0.2652F, 0.05F));

		PartDefinition cube_r494 = neck4.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(123, 0).addBox(-0.526F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.4765F, -4.4352F, 1.5708F, 0.0F, 0.5323F));

		PartDefinition cube_r495 = neck4.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(67, 127).addBox(-0.3036F, -1.1748F, -0.4913F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7574F, 0.6701F, -2.0528F, 1.4265F, 0.2652F, 0.05F));

		PartDefinition cube_r496 = neck4.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(104, 120).addBox(-0.4986F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -0.4765F, -2.4352F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r497 = neck4.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(124, 65).addBox(-0.526F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.4765F, -2.4352F, 1.5708F, 0.0F, 0.5323F));

		PartDefinition cube_r498 = neck4.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(122, 48).addBox(0.0F, -1.4744F, -0.3084F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.2193F, -2.0547F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r499 = neck4.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(42, 122).addBox(0.0F, -1.7385F, -0.6398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.5F, -2.4193F, -1.5547F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r500 = neck4.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(122, 40).addBox(-1.4226F, 0.8437F, -0.7867F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -1.0765F, -4.1352F, 1.7617F, 0.1379F, -0.5857F));

		PartDefinition cube_r501 = neck4.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(79, 119).addBox(0.0F, -1.7744F, -0.3084F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.0193F, 0.3453F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r502 = neck4.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(114, 13).addBox(0.0F, -3.5132F, -0.6581F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.5F, -2.7193F, 0.6453F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r503 = neck4.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(126, 37).addBox(-0.3181F, -1.0741F, -0.4564F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7574F, 1.0701F, -0.1528F, 1.4265F, 0.2652F, 0.05F));

		PartDefinition cube_r504 = neck4.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(120, 107).addBox(-0.4986F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -0.0765F, -0.5352F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r505 = neck4.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(38, 125).addBox(-0.526F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.0765F, -0.5352F, 1.5708F, 0.0F, 0.5323F));

		PartDefinition cube_r506 = neck4.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(37, 120).addBox(-1.3226F, -0.1563F, -0.7867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.8765F, -1.8352F, 1.7617F, 0.1379F, -0.5857F));

		PartDefinition cube_r507 = neck4.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2755F, -6.022F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bone5 = neck4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.9054F, -1.0765F, -6.1352F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5755F, -5.522F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r508 = head.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(56, 82).mirror().addBox(-0.5F, -0.0232F, -0.9852F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 82).addBox(2.54F, -0.0232F, -0.9852F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.52F, -1.4733F, -0.5047F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r509 = head.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(124, 61).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(124, 61).addBox(2.54F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.52F, -0.8779F, -1.4086F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r510 = head.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(57, 72).mirror().addBox(-2.55F, -0.6004F, -1.3118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 27).mirror().addBox(-2.77F, -0.6004F, -1.3118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 27).addBox(0.77F, -0.6004F, -1.3118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(57, 72).addBox(0.55F, -0.6004F, -1.3118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6874F, -0.6436F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r511 = head.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(122, 86).mirror().addBox(-0.5F, -1.5667F, -0.2406F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.6704F, -3.748F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r512 = head.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(60, 121).mirror().addBox(-0.5F, -1.4878F, -0.6762F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.6704F, -3.748F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r513 = head.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(122, 95).mirror().addBox(-0.5F, -0.4293F, -0.1962F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.6704F, -3.748F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r514 = head.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(122, 86).addBox(-0.5F, -1.5667F, -0.2406F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3F, -1.6704F, -3.748F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r515 = head.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(122, 95).addBox(-0.5F, -0.4293F, -0.1962F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3F, -1.6704F, -3.748F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r516 = head.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(60, 121).addBox(-0.5F, -1.4878F, -0.6762F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.3F, -1.6704F, -3.748F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r517 = head.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(7, 60).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(31, 18).addBox(-0.5F, 0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.72F, 0.1509F, -1.4309F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r518 = head.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(12, 76).addBox(-2.0F, -1.3F, -0.9F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.65F, -1.75F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r519 = head.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(89, 20).addBox(-1.5F, 0.6355F, -3.564F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.3645F, -1.827F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r520 = head.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(42, 39).addBox(-2.0F, -0.3F, -1.3F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2346F, -1.9851F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r521 = head.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(70, 53).addBox(-1.5F, -0.9712F, -0.0245F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5645F, -6.527F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r522 = head.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(44, 26).addBox(-1.5F, -0.992F, -0.2231F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2645F, -3.627F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r523 = head.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(93, 0).addBox(-1.5F, -0.9231F, -0.2482F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7645F, -5.227F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, -7.65F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r524 = bone.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(119, 55).addBox(-1.0F, -0.6F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2301F, -1.1517F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r525 = bone.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(18, 94).addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2129F, -0.5359F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r526 = bone.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(106, 74).addBox(-1.5F, -0.4F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -3.4844F, -0.8905F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r527 = bone.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(99, 18).addBox(-1.5F, -0.9784F, 0.0607F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9645F, -1.177F, -0.384F, 0.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r528 = bone2.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(8, 86).addBox(-1.0F, -0.0213F, -3.0111F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3355F, 5.223F, -0.4712F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r529 = bone3.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(96, 13).addBox(-1.0F, -0.0091F, -2.9538F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.9F, 4.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r530 = bone4.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(41, 80).addBox(-1.5F, 0.0F, 0.4F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 2.5F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r531 = bone4.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(105, 55).addBox(-1.5F, 0.0F, -1.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(105, 65).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 2.7F, -0.1047F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, -1.75F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(92, 74).mirror().addBox(-2.0F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 74).addBox(1.0F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1652F, 0.0567F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone6 = jaw.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.15F, -1.1F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r533 = bone6.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(45, 58).mirror().addBox(-2.0F, -0.1F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.011F)).mirror(false)
				.texOffs(45, 58).addBox(1.0F, -0.1F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.011F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r534 = bone6.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(110, 44).mirror().addBox(-2.0F, -1.0319F, -1.8423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(110, 44).addBox(1.0F, -1.0319F, -1.8423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.6F, 0.2967F, 0.0F, 0.0F));

		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r535 = bone7.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(121, 58).addBox(-1.0F, 1.05F, -4.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.55F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r536 = bone7.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(113, 80).mirror().addBox(-1.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.034F)).mirror(false)
				.texOffs(113, 80).addBox(0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.034F)), PartPose.offsetAndRotation(0.0F, 1.1F, -2.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r537 = bone7.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(97, 71).mirror().addBox(-1.5F, -0.7539F, -2.7386F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(97, 71).addBox(0.5F, -0.7539F, -2.7386F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 1.4F, 0.4F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r538 = bone7.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(104, 50).mirror().addBox(-1.5F, 0.0F, -2.93F, 0.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(104, 50).addBox(1.5F, 0.0F, -2.93F, 0.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r539 = bone7.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(108, 104).addBox(-1.5F, -0.2288F, -0.0783F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.1F, -1.597F, 0.0F, 0.0F));

		PartDefinition cube_r540 = bone7.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(109, 10).addBox(-1.5F, -0.3203F, -0.8815F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.027F)), PartPose.offsetAndRotation(0.0F, 1.5F, -2.8F, -0.8639F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.75F, -4.0F, -0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 130, 130);
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